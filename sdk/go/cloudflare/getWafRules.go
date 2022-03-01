// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up [WAF Rules](https://api.cloudflare.com/#waf-rule-groups-properties).
//
// ## Example Usage
//
// The example below matches all WAF Rules that are in the group of ID `de677e5818985db1285d0e80225f06e5`, contain `example` in their description, and are currently `on`. The matched WAF Rules are then returned as output.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		test, err := cloudflare.GetWafRules(ctx, &GetWafRulesArgs{
// 			ZoneId:    "ae36f999674d196762efcc5abb06b345",
// 			PackageId: pulumi.StringRef("a25a9a7e9c00afc1fb2e0245519d725b"),
// 			Filter: GetWafRulesFilter{
// 				Description: pulumi.StringRef(".*example.*"),
// 				Mode:        pulumi.StringRef("on"),
// 				GroupId:     pulumi.StringRef("de677e5818985db1285d0e80225f06e5"),
// 			},
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("wafRules", test.Rules)
// 		return nil
// 	})
// }
// ```
func GetWafRules(ctx *pulumi.Context, args *GetWafRulesArgs, opts ...pulumi.InvokeOption) (*GetWafRulesResult, error) {
	var rv GetWafRulesResult
	err := ctx.Invoke("cloudflare:index/getWafRules:getWafRules", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesArgs struct {
	// One or more values used to look up WAF Rules. If more than one value is given all
	// values must match in order to be included, see below for full list.
	Filter *GetWafRulesFilter `pulumi:"filter"`
	// The ID of the WAF Rule Package in which to search for the WAF Rules.
	PackageId *string `pulumi:"packageId"`
	// The ID of the DNS zone in which to search for the WAF Rules.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getWafRules.
type GetWafRulesResult struct {
	Filter *GetWafRulesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The ID of the WAF Rule Package that contains the WAF Rule
	PackageId *string `pulumi:"packageId"`
	// A map of WAF Rules details. Full list below:
	Rules  []GetWafRulesRule `pulumi:"rules"`
	ZoneId string            `pulumi:"zoneId"`
}

func GetWafRulesOutput(ctx *pulumi.Context, args GetWafRulesOutputArgs, opts ...pulumi.InvokeOption) GetWafRulesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetWafRulesResult, error) {
			args := v.(GetWafRulesArgs)
			r, err := GetWafRules(ctx, &args, opts...)
			return *r, err
		}).(GetWafRulesResultOutput)
}

// A collection of arguments for invoking getWafRules.
type GetWafRulesOutputArgs struct {
	// One or more values used to look up WAF Rules. If more than one value is given all
	// values must match in order to be included, see below for full list.
	Filter GetWafRulesFilterPtrInput `pulumi:"filter"`
	// The ID of the WAF Rule Package in which to search for the WAF Rules.
	PackageId pulumi.StringPtrInput `pulumi:"packageId"`
	// The ID of the DNS zone in which to search for the WAF Rules.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (GetWafRulesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafRulesArgs)(nil)).Elem()
}

// A collection of values returned by getWafRules.
type GetWafRulesResultOutput struct{ *pulumi.OutputState }

func (GetWafRulesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetWafRulesResult)(nil)).Elem()
}

func (o GetWafRulesResultOutput) ToGetWafRulesResultOutput() GetWafRulesResultOutput {
	return o
}

func (o GetWafRulesResultOutput) ToGetWafRulesResultOutputWithContext(ctx context.Context) GetWafRulesResultOutput {
	return o
}

func (o GetWafRulesResultOutput) Filter() GetWafRulesFilterPtrOutput {
	return o.ApplyT(func(v GetWafRulesResult) *GetWafRulesFilter { return v.Filter }).(GetWafRulesFilterPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetWafRulesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetWafRulesResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ID of the WAF Rule Package that contains the WAF Rule
func (o GetWafRulesResultOutput) PackageId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetWafRulesResult) *string { return v.PackageId }).(pulumi.StringPtrOutput)
}

// A map of WAF Rules details. Full list below:
func (o GetWafRulesResultOutput) Rules() GetWafRulesRuleArrayOutput {
	return o.ApplyT(func(v GetWafRulesResult) []GetWafRulesRule { return v.Rules }).(GetWafRulesRuleArrayOutput)
}

func (o GetWafRulesResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v GetWafRulesResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetWafRulesResultOutput{})
}
