// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare WAF rule package resource for a particular zone. This can be used to configure firewall behaviour for pre-defined firewall packages.
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
//			_, err := cloudflare.NewWafPackage(ctx, "owasp", &cloudflare.WafPackageArgs{
//				ActionMode:  pulumi.String("simulate"),
//				PackageId:   pulumi.String("a25a9a7e9c00afc1fb2e0245519d725b"),
//				Sensitivity: pulumi.String("medium"),
//				ZoneId:      pulumi.String("ae36f999674d196762efcc5abb06b345"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Packages can be imported using a composite ID formed of zone ID and the WAF Package ID, e.g.
//
// ```sh
//
//	$ pulumi import cloudflare:index/wafPackage:WafPackage owasp ae36f999674d196762efcc5abb06b345/a25a9a7e9c00afc1fb2e0245519d725b
//
// ```
type WafPackage struct {
	pulumi.CustomResourceState

	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrOutput `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId pulumi.StringOutput `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrOutput `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWafPackage registers a new resource with the given unique name, arguments, and options.
func NewWafPackage(ctx *pulumi.Context,
	name string, args *WafPackageArgs, opts ...pulumi.ResourceOption) (*WafPackage, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PackageId == nil {
		return nil, errors.New("invalid value for required argument 'PackageId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WafPackage
	err := ctx.RegisterResource("cloudflare:index/wafPackage:WafPackage", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWafPackage gets an existing WafPackage resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWafPackage(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WafPackageState, opts ...pulumi.ResourceOption) (*WafPackage, error) {
	var resource WafPackage
	err := ctx.ReadResource("cloudflare:index/wafPackage:WafPackage", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WafPackage resources.
type wafPackageState struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode *string `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId *string `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity *string `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId *string `pulumi:"zoneId"`
}

type WafPackageState struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrInput
	// The WAF Package ID.
	PackageId pulumi.StringPtrInput
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringPtrInput
}

func (WafPackageState) ElementType() reflect.Type {
	return reflect.TypeOf((*wafPackageState)(nil)).Elem()
}

type wafPackageArgs struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode *string `pulumi:"actionMode"`
	// The WAF Package ID.
	PackageId string `pulumi:"packageId"`
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity *string `pulumi:"sensitivity"`
	// The DNS zone ID to apply to.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WafPackage resource.
type WafPackageArgs struct {
	// The action mode of the package, can be one of ["block", "challenge", "simulate"].
	ActionMode pulumi.StringPtrInput
	// The WAF Package ID.
	PackageId pulumi.StringInput
	// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
	Sensitivity pulumi.StringPtrInput
	// The DNS zone ID to apply to.
	ZoneId pulumi.StringInput
}

func (WafPackageArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*wafPackageArgs)(nil)).Elem()
}

type WafPackageInput interface {
	pulumi.Input

	ToWafPackageOutput() WafPackageOutput
	ToWafPackageOutputWithContext(ctx context.Context) WafPackageOutput
}

func (*WafPackage) ElementType() reflect.Type {
	return reflect.TypeOf((**WafPackage)(nil)).Elem()
}

func (i *WafPackage) ToWafPackageOutput() WafPackageOutput {
	return i.ToWafPackageOutputWithContext(context.Background())
}

func (i *WafPackage) ToWafPackageOutputWithContext(ctx context.Context) WafPackageOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafPackageOutput)
}

// WafPackageArrayInput is an input type that accepts WafPackageArray and WafPackageArrayOutput values.
// You can construct a concrete instance of `WafPackageArrayInput` via:
//
//	WafPackageArray{ WafPackageArgs{...} }
type WafPackageArrayInput interface {
	pulumi.Input

	ToWafPackageArrayOutput() WafPackageArrayOutput
	ToWafPackageArrayOutputWithContext(context.Context) WafPackageArrayOutput
}

type WafPackageArray []WafPackageInput

func (WafPackageArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WafPackage)(nil)).Elem()
}

func (i WafPackageArray) ToWafPackageArrayOutput() WafPackageArrayOutput {
	return i.ToWafPackageArrayOutputWithContext(context.Background())
}

func (i WafPackageArray) ToWafPackageArrayOutputWithContext(ctx context.Context) WafPackageArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafPackageArrayOutput)
}

// WafPackageMapInput is an input type that accepts WafPackageMap and WafPackageMapOutput values.
// You can construct a concrete instance of `WafPackageMapInput` via:
//
//	WafPackageMap{ "key": WafPackageArgs{...} }
type WafPackageMapInput interface {
	pulumi.Input

	ToWafPackageMapOutput() WafPackageMapOutput
	ToWafPackageMapOutputWithContext(context.Context) WafPackageMapOutput
}

type WafPackageMap map[string]WafPackageInput

func (WafPackageMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WafPackage)(nil)).Elem()
}

func (i WafPackageMap) ToWafPackageMapOutput() WafPackageMapOutput {
	return i.ToWafPackageMapOutputWithContext(context.Background())
}

func (i WafPackageMap) ToWafPackageMapOutputWithContext(ctx context.Context) WafPackageMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WafPackageMapOutput)
}

type WafPackageOutput struct{ *pulumi.OutputState }

func (WafPackageOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WafPackage)(nil)).Elem()
}

func (o WafPackageOutput) ToWafPackageOutput() WafPackageOutput {
	return o
}

func (o WafPackageOutput) ToWafPackageOutputWithContext(ctx context.Context) WafPackageOutput {
	return o
}

// The action mode of the package, can be one of ["block", "challenge", "simulate"].
func (o WafPackageOutput) ActionMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WafPackage) pulumi.StringPtrOutput { return v.ActionMode }).(pulumi.StringPtrOutput)
}

// The WAF Package ID.
func (o WafPackageOutput) PackageId() pulumi.StringOutput {
	return o.ApplyT(func(v *WafPackage) pulumi.StringOutput { return v.PackageId }).(pulumi.StringOutput)
}

// The sensitivity of the package, can be one of ["high", "medium", "low", "off"].
func (o WafPackageOutput) Sensitivity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WafPackage) pulumi.StringPtrOutput { return v.Sensitivity }).(pulumi.StringPtrOutput)
}

// The DNS zone ID to apply to.
func (o WafPackageOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WafPackage) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WafPackageArrayOutput struct{ *pulumi.OutputState }

func (WafPackageArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WafPackage)(nil)).Elem()
}

func (o WafPackageArrayOutput) ToWafPackageArrayOutput() WafPackageArrayOutput {
	return o
}

func (o WafPackageArrayOutput) ToWafPackageArrayOutputWithContext(ctx context.Context) WafPackageArrayOutput {
	return o
}

func (o WafPackageArrayOutput) Index(i pulumi.IntInput) WafPackageOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WafPackage {
		return vs[0].([]*WafPackage)[vs[1].(int)]
	}).(WafPackageOutput)
}

type WafPackageMapOutput struct{ *pulumi.OutputState }

func (WafPackageMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WafPackage)(nil)).Elem()
}

func (o WafPackageMapOutput) ToWafPackageMapOutput() WafPackageMapOutput {
	return o
}

func (o WafPackageMapOutput) ToWafPackageMapOutputWithContext(ctx context.Context) WafPackageMapOutput {
	return o
}

func (o WafPackageMapOutput) MapIndex(k pulumi.StringInput) WafPackageOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WafPackage {
		return vs[0].(map[string]*WafPackage)[vs[1].(string)]
	}).(WafPackageOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WafPackageInput)(nil)).Elem(), &WafPackage{})
	pulumi.RegisterInputType(reflect.TypeOf((*WafPackageArrayInput)(nil)).Elem(), WafPackageArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WafPackageMapInput)(nil)).Elem(), WafPackageMap{})
	pulumi.RegisterOutputType(WafPackageOutput{})
	pulumi.RegisterOutputType(WafPackageArrayOutput{})
	pulumi.RegisterOutputType(WafPackageMapOutput{})
}
