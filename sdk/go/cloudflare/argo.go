// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Cloudflare Argo controls the routing to your origin and tiered
// caching options to speed up your website browsing experience.
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
//			_, err := cloudflare.NewArgo(ctx, "example", &cloudflare.ArgoArgs{
//				SmartRouting:  pulumi.String("on"),
//				TieredCaching: pulumi.String("on"),
//				ZoneId:        pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
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
// ```sh
//
//	$ pulumi import cloudflare:index/argo:Argo example <zone_id>
//
// ```
type Argo struct {
	pulumi.CustomResourceState

	// Whether smart routing is enabled. Available values: `on`, `off`.
	SmartRouting pulumi.StringPtrOutput `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Available values: `on`, `off`.
	TieredCaching pulumi.StringPtrOutput `pulumi:"tieredCaching"`
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewArgo registers a new resource with the given unique name, arguments, and options.
func NewArgo(ctx *pulumi.Context,
	name string, args *ArgoArgs, opts ...pulumi.ResourceOption) (*Argo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource Argo
	err := ctx.RegisterResource("cloudflare:index/argo:Argo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetArgo gets an existing Argo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetArgo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ArgoState, opts ...pulumi.ResourceOption) (*Argo, error) {
	var resource Argo
	err := ctx.ReadResource("cloudflare:index/argo:Argo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Argo resources.
type argoState struct {
	// Whether smart routing is enabled. Available values: `on`, `off`.
	SmartRouting *string `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Available values: `on`, `off`.
	TieredCaching *string `pulumi:"tieredCaching"`
	// The zone identifier to target for the resource.
	ZoneId *string `pulumi:"zoneId"`
}

type ArgoState struct {
	// Whether smart routing is enabled. Available values: `on`, `off`.
	SmartRouting pulumi.StringPtrInput
	// Whether tiered caching is enabled. Available values: `on`, `off`.
	TieredCaching pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringPtrInput
}

func (ArgoState) ElementType() reflect.Type {
	return reflect.TypeOf((*argoState)(nil)).Elem()
}

type argoArgs struct {
	// Whether smart routing is enabled. Available values: `on`, `off`.
	SmartRouting *string `pulumi:"smartRouting"`
	// Whether tiered caching is enabled. Available values: `on`, `off`.
	TieredCaching *string `pulumi:"tieredCaching"`
	// The zone identifier to target for the resource.
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Argo resource.
type ArgoArgs struct {
	// Whether smart routing is enabled. Available values: `on`, `off`.
	SmartRouting pulumi.StringPtrInput
	// Whether tiered caching is enabled. Available values: `on`, `off`.
	TieredCaching pulumi.StringPtrInput
	// The zone identifier to target for the resource.
	ZoneId pulumi.StringInput
}

func (ArgoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*argoArgs)(nil)).Elem()
}

type ArgoInput interface {
	pulumi.Input

	ToArgoOutput() ArgoOutput
	ToArgoOutputWithContext(ctx context.Context) ArgoOutput
}

func (*Argo) ElementType() reflect.Type {
	return reflect.TypeOf((**Argo)(nil)).Elem()
}

func (i *Argo) ToArgoOutput() ArgoOutput {
	return i.ToArgoOutputWithContext(context.Background())
}

func (i *Argo) ToArgoOutputWithContext(ctx context.Context) ArgoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArgoOutput)
}

// ArgoArrayInput is an input type that accepts ArgoArray and ArgoArrayOutput values.
// You can construct a concrete instance of `ArgoArrayInput` via:
//
//	ArgoArray{ ArgoArgs{...} }
type ArgoArrayInput interface {
	pulumi.Input

	ToArgoArrayOutput() ArgoArrayOutput
	ToArgoArrayOutputWithContext(context.Context) ArgoArrayOutput
}

type ArgoArray []ArgoInput

func (ArgoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Argo)(nil)).Elem()
}

func (i ArgoArray) ToArgoArrayOutput() ArgoArrayOutput {
	return i.ToArgoArrayOutputWithContext(context.Background())
}

func (i ArgoArray) ToArgoArrayOutputWithContext(ctx context.Context) ArgoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArgoArrayOutput)
}

// ArgoMapInput is an input type that accepts ArgoMap and ArgoMapOutput values.
// You can construct a concrete instance of `ArgoMapInput` via:
//
//	ArgoMap{ "key": ArgoArgs{...} }
type ArgoMapInput interface {
	pulumi.Input

	ToArgoMapOutput() ArgoMapOutput
	ToArgoMapOutputWithContext(context.Context) ArgoMapOutput
}

type ArgoMap map[string]ArgoInput

func (ArgoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Argo)(nil)).Elem()
}

func (i ArgoMap) ToArgoMapOutput() ArgoMapOutput {
	return i.ToArgoMapOutputWithContext(context.Background())
}

func (i ArgoMap) ToArgoMapOutputWithContext(ctx context.Context) ArgoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArgoMapOutput)
}

type ArgoOutput struct{ *pulumi.OutputState }

func (ArgoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Argo)(nil)).Elem()
}

func (o ArgoOutput) ToArgoOutput() ArgoOutput {
	return o
}

func (o ArgoOutput) ToArgoOutputWithContext(ctx context.Context) ArgoOutput {
	return o
}

// Whether smart routing is enabled. Available values: `on`, `off`.
func (o ArgoOutput) SmartRouting() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Argo) pulumi.StringPtrOutput { return v.SmartRouting }).(pulumi.StringPtrOutput)
}

// Whether tiered caching is enabled. Available values: `on`, `off`.
func (o ArgoOutput) TieredCaching() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Argo) pulumi.StringPtrOutput { return v.TieredCaching }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource.
func (o ArgoOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Argo) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ArgoArrayOutput struct{ *pulumi.OutputState }

func (ArgoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Argo)(nil)).Elem()
}

func (o ArgoArrayOutput) ToArgoArrayOutput() ArgoArrayOutput {
	return o
}

func (o ArgoArrayOutput) ToArgoArrayOutputWithContext(ctx context.Context) ArgoArrayOutput {
	return o
}

func (o ArgoArrayOutput) Index(i pulumi.IntInput) ArgoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Argo {
		return vs[0].([]*Argo)[vs[1].(int)]
	}).(ArgoOutput)
}

type ArgoMapOutput struct{ *pulumi.OutputState }

func (ArgoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Argo)(nil)).Elem()
}

func (o ArgoMapOutput) ToArgoMapOutput() ArgoMapOutput {
	return o
}

func (o ArgoMapOutput) ToArgoMapOutputWithContext(ctx context.Context) ArgoMapOutput {
	return o
}

func (o ArgoMapOutput) MapIndex(k pulumi.StringInput) ArgoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Argo {
		return vs[0].(map[string]*Argo)[vs[1].(string)]
	}).(ArgoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ArgoInput)(nil)).Elem(), &Argo{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArgoArrayInput)(nil)).Elem(), ArgoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArgoMapInput)(nil)).Elem(), ArgoMap{})
	pulumi.RegisterOutputType(ArgoOutput{})
	pulumi.RegisterOutputType(ArgoArrayOutput{})
	pulumi.RegisterOutputType(ArgoMapOutput{})
}
