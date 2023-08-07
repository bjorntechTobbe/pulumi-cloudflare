// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up [API Token Permission Groups](https://developers.cloudflare.com/api/tokens/create/permissions).
// Commonly used as references within [`cloudflareToken`](https://www.terraform.io/docs/providers/cloudflare/r/api_token.html) resources.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
// func main() {
// pulumi.Run(func(ctx *pulumi.Context) error {
// all, err := cloudflare.GetApiTokenPermissionGroups(ctx, nil, nil);
// if err != nil {
// return err
// }
// ctx.Export("dnsReadPermissionId", all.Zone.DNS Read)
// ctx.Export("accountLbMonitorsAndReadId", all.Account.Load Balancing: Monitors and Pools Read)
// ctx.Export("userMembershipsReadId", all.User.Memberships Read)
// return nil
// })
// }
// ```
func GetApiTokenPermissionGroups(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetApiTokenPermissionGroupsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetApiTokenPermissionGroupsResult
	err := ctx.Invoke("cloudflare:index/getApiTokenPermissionGroups:getApiTokenPermissionGroups", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getApiTokenPermissionGroups.
type GetApiTokenPermissionGroupsResult struct {
	// Map of permissions for account level resources.
	Account map[string]interface{} `pulumi:"account"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Map of all permissions available. Should not be used as some permissions will overlap resource scope. Instead, use resource level specific attributes.
	//
	// Deprecated: Use specific account, zone or user attributes instead.
	Permissions map[string]interface{} `pulumi:"permissions"`
	// Map of permissions for user level resources.
	User map[string]interface{} `pulumi:"user"`
	// Map of permissions for zone level resources.
	Zone map[string]interface{} `pulumi:"zone"`
}
