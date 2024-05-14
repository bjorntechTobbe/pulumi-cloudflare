// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package cloudflare

import (
	"context"
	"fmt"
	"path/filepath"

	// embed allows embedding files
	_ "embed"

	provShim "github.com/cloudflare/terraform-provider-cloudflare/shim"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"

	"github.com/pulumi/pulumi-cloudflare/provider/v5/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "cloudflare"
	// modules:
	mainMod = "index" // the y module
)

//go:embed cmd/pulumi-resource-cloudflare/bridge-metadata.json
var metadata []byte

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := pfbridge.MuxShimWithPF(context.Background(),
		shimv2.NewProvider(provShim.SDKProvider()),
		provShim.PFProvider(),
	)

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "cloudflare",
		Description:      "A Pulumi package for creating and managing Cloudflare cloud resources.",
		Keywords:         []string{"pulumi", "cloudflare"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		GitHubOrg:        "cloudflare",
		Repository:       "https://github.com/pulumi/pulumi-cloudflare",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		MetadataInfo:     tfbridge.NewProviderMetadata(metadata),
		Config: map[string]*tfbridge.SchemaInfo{
			"rps": {
				Default: &tfbridge.DefaultInfo{
					Value:   4,
					EnvVars: []string{"CLOUDFLARE_RPS"},
				},
			},
			"retries": {
				Default: &tfbridge.DefaultInfo{
					Value:   3,
					EnvVars: []string{"CLOUDFLARE_RETRIES"},
				},
			},
			"min_backoff": {
				Default: &tfbridge.DefaultInfo{
					Value:   1,
					EnvVars: []string{"CLOUDFLARE_MIN_BACKOFF"},
				},
			},
			"max_backoff": {
				Default: &tfbridge.DefaultInfo{
					Value:   30,
					EnvVars: []string{"CLOUDFLARE_MAX_BACKOFF"},
				},
			},
			"api_client_logging": {
				Default: &tfbridge.DefaultInfo{
					Value:   false,
					EnvVars: []string{"CLOUDFLARE_API_CLIENT_LOGGING"},
				},
			},
		},

		Resources: map[string]*tfbridge.ResourceInfo{
			"cloudflare_access_keys_configuration": {
				// This resource has no upstream docs:
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"cloudflare_zone": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"zone": {CSharpName: "ZoneName"},
				},
			},

			// Cloudflare's DNS records are all structural, where `name` field uniquely identifies
			// the resource.
			//
			// If `type` or `zoneId` is changed, then the resource will replace but the new
			// resource will conflict with the old one. To avoid this, we set
			// `DeleteBeforeReplace: true`.
			"cloudflare_record": {DeleteBeforeReplace: true},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PyProject: struct {
				Enabled bool
			}{true},
		},

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
			Namespaces: map[string]string{
				mainPkg: "Cloudflare",
			},
		},
	}

	prov.MustComputeTokens(tfbridgetokens.SingleModule("cloudflare_", mainMod,
		tfbridgetokens.MakeStandard(mainPkg)))

	prov.MustApplyAutoAliases()

	return prov
}
