// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this datasource to lookup a tunnel virtual network in an account.
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
//			_, err := cloudflare.LookupTunnelVirtualNetwork(ctx, &cloudflare.LookupTunnelVirtualNetworkArgs{
//				AccountId: "f037e56e89293a057740de681ac9abbe",
//				Name:      "example",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupTunnelVirtualNetwork(ctx *pulumi.Context, args *LookupTunnelVirtualNetworkArgs, opts ...pulumi.InvokeOption) (*LookupTunnelVirtualNetworkResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTunnelVirtualNetworkResult
	err := ctx.Invoke("cloudflare:index/getTunnelVirtualNetwork:getTunnelVirtualNetwork", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTunnelVirtualNetwork.
type LookupTunnelVirtualNetworkArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The Virtual Network Name.
	Name string `pulumi:"name"`
}

// A collection of values returned by getTunnelVirtualNetwork.
type LookupTunnelVirtualNetworkResult struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The Virtual Network Comment.
	Comment string `pulumi:"comment"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// If true, only include deleted virtual networks. If false, exclude deleted virtual networks. If empty, all virtual networks will be included.
	IsDefault bool `pulumi:"isDefault"`
	// The Virtual Network Name.
	Name string `pulumi:"name"`
}

func LookupTunnelVirtualNetworkOutput(ctx *pulumi.Context, args LookupTunnelVirtualNetworkOutputArgs, opts ...pulumi.InvokeOption) LookupTunnelVirtualNetworkResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTunnelVirtualNetworkResult, error) {
			args := v.(LookupTunnelVirtualNetworkArgs)
			r, err := LookupTunnelVirtualNetwork(ctx, &args, opts...)
			var s LookupTunnelVirtualNetworkResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTunnelVirtualNetworkResultOutput)
}

// A collection of arguments for invoking getTunnelVirtualNetwork.
type LookupTunnelVirtualNetworkOutputArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// The Virtual Network Name.
	Name pulumi.StringInput `pulumi:"name"`
}

func (LookupTunnelVirtualNetworkOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTunnelVirtualNetworkArgs)(nil)).Elem()
}

// A collection of values returned by getTunnelVirtualNetwork.
type LookupTunnelVirtualNetworkResultOutput struct{ *pulumi.OutputState }

func (LookupTunnelVirtualNetworkResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTunnelVirtualNetworkResult)(nil)).Elem()
}

func (o LookupTunnelVirtualNetworkResultOutput) ToLookupTunnelVirtualNetworkResultOutput() LookupTunnelVirtualNetworkResultOutput {
	return o
}

func (o LookupTunnelVirtualNetworkResultOutput) ToLookupTunnelVirtualNetworkResultOutputWithContext(ctx context.Context) LookupTunnelVirtualNetworkResultOutput {
	return o
}

// The account identifier to target for the resource.
func (o LookupTunnelVirtualNetworkResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTunnelVirtualNetworkResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// The Virtual Network Comment.
func (o LookupTunnelVirtualNetworkResultOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTunnelVirtualNetworkResult) string { return v.Comment }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTunnelVirtualNetworkResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTunnelVirtualNetworkResult) string { return v.Id }).(pulumi.StringOutput)
}

// If true, only include deleted virtual networks. If false, exclude deleted virtual networks. If empty, all virtual networks will be included.
func (o LookupTunnelVirtualNetworkResultOutput) IsDefault() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTunnelVirtualNetworkResult) bool { return v.IsDefault }).(pulumi.BoolOutput)
}

// The Virtual Network Name.
func (o LookupTunnelVirtualNetworkResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTunnelVirtualNetworkResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTunnelVirtualNetworkResultOutput{})
}
