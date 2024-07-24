// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to retrieve all Gateway categories for an account.
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
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := cloudflare.GetGatewayCategories(ctx, &cloudflare.GetGatewayCategoriesArgs{
//				AccountId: "f037e56e89293a057740de681ac9abbe",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGatewayCategories(ctx *pulumi.Context, args *GetGatewayCategoriesArgs, opts ...pulumi.InvokeOption) (*GetGatewayCategoriesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetGatewayCategoriesResult
	err := ctx.Invoke("cloudflare:index/getGatewayCategories:getGatewayCategories", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGatewayCategories.
type GetGatewayCategoriesArgs struct {
	// The account ID to fetch Gateway Categories from.
	AccountId string `pulumi:"accountId"`
}

// A collection of values returned by getGatewayCategories.
type GetGatewayCategoriesResult struct {
	// The account ID to fetch Gateway Categories from.
	AccountId string `pulumi:"accountId"`
	// A list of Gateway Categories.
	Categories []GetGatewayCategoriesCategory `pulumi:"categories"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetGatewayCategoriesOutput(ctx *pulumi.Context, args GetGatewayCategoriesOutputArgs, opts ...pulumi.InvokeOption) GetGatewayCategoriesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGatewayCategoriesResult, error) {
			args := v.(GetGatewayCategoriesArgs)
			r, err := GetGatewayCategories(ctx, &args, opts...)
			var s GetGatewayCategoriesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGatewayCategoriesResultOutput)
}

// A collection of arguments for invoking getGatewayCategories.
type GetGatewayCategoriesOutputArgs struct {
	// The account ID to fetch Gateway Categories from.
	AccountId pulumi.StringInput `pulumi:"accountId"`
}

func (GetGatewayCategoriesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayCategoriesArgs)(nil)).Elem()
}

// A collection of values returned by getGatewayCategories.
type GetGatewayCategoriesResultOutput struct{ *pulumi.OutputState }

func (GetGatewayCategoriesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGatewayCategoriesResult)(nil)).Elem()
}

func (o GetGatewayCategoriesResultOutput) ToGetGatewayCategoriesResultOutput() GetGatewayCategoriesResultOutput {
	return o
}

func (o GetGatewayCategoriesResultOutput) ToGetGatewayCategoriesResultOutputWithContext(ctx context.Context) GetGatewayCategoriesResultOutput {
	return o
}

// The account ID to fetch Gateway Categories from.
func (o GetGatewayCategoriesResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayCategoriesResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// A list of Gateway Categories.
func (o GetGatewayCategoriesResultOutput) Categories() GetGatewayCategoriesCategoryArrayOutput {
	return o.ApplyT(func(v GetGatewayCategoriesResult) []GetGatewayCategoriesCategory { return v.Categories }).(GetGatewayCategoriesCategoryArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGatewayCategoriesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGatewayCategoriesResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGatewayCategoriesResultOutput{})
}
