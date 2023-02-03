// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up Zone DNSSEC settings.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = cloudflare.LookupZoneDnssec(ctx, &cloudflare.LookupZoneDnssecArgs{
//				ZoneId: "0da42c8d2132a9ddaf714f9e7c920711",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupZoneDnssec(ctx *pulumi.Context, args *LookupZoneDnssecArgs, opts ...pulumi.InvokeOption) (*LookupZoneDnssecResult, error) {
	var rv LookupZoneDnssecResult
	err := ctx.Invoke("cloudflare:index/getZoneDnssec:getZoneDnssec", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZoneDnssec.
type LookupZoneDnssecArgs struct {
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// A collection of values returned by getZoneDnssec.
type LookupZoneDnssecResult struct {
	// Zone DNSSEC algorithm.
	Algorithm string `pulumi:"algorithm"`
	// Zone DNSSEC digest.
	Digest string `pulumi:"digest"`
	// Digest algorithm use for Zone DNSSEC.
	DigestAlgorithm string `pulumi:"digestAlgorithm"`
	// Digest Type for Zone DNSSEC.
	DigestType string `pulumi:"digestType"`
	// DS for the Zone DNSSEC.
	Ds string `pulumi:"ds"`
	// Zone DNSSEC flags.
	Flags int `pulumi:"flags"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Key Tag for the Zone DNSSEC.
	KeyTag int `pulumi:"keyTag"`
	// Key type used for Zone DNSSEC.
	KeyType string `pulumi:"keyType"`
	// Public Key for the Zone DNSSEC.
	PublicKey string `pulumi:"publicKey"`
	// The status of the Zone DNSSEC.
	Status string `pulumi:"status"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

func LookupZoneDnssecOutput(ctx *pulumi.Context, args LookupZoneDnssecOutputArgs, opts ...pulumi.InvokeOption) LookupZoneDnssecResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupZoneDnssecResult, error) {
			args := v.(LookupZoneDnssecArgs)
			r, err := LookupZoneDnssec(ctx, &args, opts...)
			var s LookupZoneDnssecResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupZoneDnssecResultOutput)
}

// A collection of arguments for invoking getZoneDnssec.
type LookupZoneDnssecOutputArgs struct {
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput `pulumi:"zoneId"`
}

func (LookupZoneDnssecOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZoneDnssecArgs)(nil)).Elem()
}

// A collection of values returned by getZoneDnssec.
type LookupZoneDnssecResultOutput struct{ *pulumi.OutputState }

func (LookupZoneDnssecResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupZoneDnssecResult)(nil)).Elem()
}

func (o LookupZoneDnssecResultOutput) ToLookupZoneDnssecResultOutput() LookupZoneDnssecResultOutput {
	return o
}

func (o LookupZoneDnssecResultOutput) ToLookupZoneDnssecResultOutputWithContext(ctx context.Context) LookupZoneDnssecResultOutput {
	return o
}

// Zone DNSSEC algorithm.
func (o LookupZoneDnssecResultOutput) Algorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.Algorithm }).(pulumi.StringOutput)
}

// Zone DNSSEC digest.
func (o LookupZoneDnssecResultOutput) Digest() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.Digest }).(pulumi.StringOutput)
}

// Digest algorithm use for Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) DigestAlgorithm() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.DigestAlgorithm }).(pulumi.StringOutput)
}

// Digest Type for Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) DigestType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.DigestType }).(pulumi.StringOutput)
}

// DS for the Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) Ds() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.Ds }).(pulumi.StringOutput)
}

// Zone DNSSEC flags.
func (o LookupZoneDnssecResultOutput) Flags() pulumi.IntOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) int { return v.Flags }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupZoneDnssecResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.Id }).(pulumi.StringOutput)
}

// Key Tag for the Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) KeyTag() pulumi.IntOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) int { return v.KeyTag }).(pulumi.IntOutput)
}

// Key type used for Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) KeyType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.KeyType }).(pulumi.StringOutput)
}

// Public Key for the Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.PublicKey }).(pulumi.StringOutput)
}

// The status of the Zone DNSSEC.
func (o LookupZoneDnssecResultOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.Status }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource.
func (o LookupZoneDnssecResultOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupZoneDnssecResult) string { return v.ZoneId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupZoneDnssecResultOutput{})
}
