// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to look up Zone results for use in other resources.
func GetZones(ctx *pulumi.Context, args *GetZonesArgs, opts ...pulumi.InvokeOption) (*GetZonesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetZonesResult
	err := ctx.Invoke("cloudflare:index/getZones:getZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getZones.
type GetZonesArgs struct {
	// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
	Filter GetZonesFilter `pulumi:"filter"`
}

// A collection of values returned by getZones.
type GetZonesResult struct {
	// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
	Filter GetZonesFilter `pulumi:"filter"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of zone objects.
	Zones []GetZonesZone `pulumi:"zones"`
}

func GetZonesOutput(ctx *pulumi.Context, args GetZonesOutputArgs, opts ...pulumi.InvokeOption) GetZonesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetZonesResultOutput, error) {
			args := v.(GetZonesArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv GetZonesResult
			secret, err := ctx.InvokePackageRaw("cloudflare:index/getZones:getZones", args, &rv, "", opts...)
			if err != nil {
				return GetZonesResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(GetZonesResultOutput)
			if secret {
				return pulumi.ToSecret(output).(GetZonesResultOutput), nil
			}
			return output, nil
		}).(GetZonesResultOutput)
}

// A collection of arguments for invoking getZones.
type GetZonesOutputArgs struct {
	// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
	Filter GetZonesFilterInput `pulumi:"filter"`
}

func (GetZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesArgs)(nil)).Elem()
}

// A collection of values returned by getZones.
type GetZonesResultOutput struct{ *pulumi.OutputState }

func (GetZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetZonesResult)(nil)).Elem()
}

func (o GetZonesResultOutput) ToGetZonesResultOutput() GetZonesResultOutput {
	return o
}

func (o GetZonesResultOutput) ToGetZonesResultOutputWithContext(ctx context.Context) GetZonesResultOutput {
	return o
}

// One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
func (o GetZonesResultOutput) Filter() GetZonesFilterOutput {
	return o.ApplyT(func(v GetZonesResult) GetZonesFilter { return v.Filter }).(GetZonesFilterOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

// A list of zone objects.
func (o GetZonesResultOutput) Zones() GetZonesZoneArrayOutput {
	return o.ApplyT(func(v GetZonesResult) []GetZonesZone { return v.Zones }).(GetZonesZoneArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetZonesResultOutput{})
}
