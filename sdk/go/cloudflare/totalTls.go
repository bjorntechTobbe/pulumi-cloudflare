// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which manages Total TLS for a zone.
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
//			_, err := cloudflare.NewTotalTls(ctx, "example", &cloudflare.TotalTlsArgs{
//				CertificateAuthority: pulumi.String("lets_encrypt"),
//				Enabled:              pulumi.Bool(true),
//				ZoneId:               pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type TotalTls struct {
	pulumi.CustomResourceState

	// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
	CertificateAuthority pulumi.StringPtrOutput `pulumi:"certificateAuthority"`
	// Enable Total TLS for the zone.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewTotalTls registers a new resource with the given unique name, arguments, and options.
func NewTotalTls(ctx *pulumi.Context,
	name string, args *TotalTlsArgs, opts ...pulumi.ResourceOption) (*TotalTls, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource TotalTls
	err := ctx.RegisterResource("cloudflare:index/totalTls:TotalTls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTotalTls gets an existing TotalTls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTotalTls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TotalTlsState, opts ...pulumi.ResourceOption) (*TotalTls, error) {
	var resource TotalTls
	err := ctx.ReadResource("cloudflare:index/totalTls:TotalTls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TotalTls resources.
type totalTlsState struct {
	// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
	CertificateAuthority *string `pulumi:"certificateAuthority"`
	// Enable Total TLS for the zone.
	Enabled *bool `pulumi:"enabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type TotalTlsState struct {
	// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
	CertificateAuthority pulumi.StringPtrInput
	// Enable Total TLS for the zone.
	Enabled pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (TotalTlsState) ElementType() reflect.Type {
	return reflect.TypeOf((*totalTlsState)(nil)).Elem()
}

type totalTlsArgs struct {
	// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
	CertificateAuthority *string `pulumi:"certificateAuthority"`
	// Enable Total TLS for the zone.
	Enabled bool `pulumi:"enabled"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a TotalTls resource.
type TotalTlsArgs struct {
	// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
	CertificateAuthority pulumi.StringPtrInput
	// Enable Total TLS for the zone.
	Enabled pulumi.BoolInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (TotalTlsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*totalTlsArgs)(nil)).Elem()
}

type TotalTlsInput interface {
	pulumi.Input

	ToTotalTlsOutput() TotalTlsOutput
	ToTotalTlsOutputWithContext(ctx context.Context) TotalTlsOutput
}

func (*TotalTls) ElementType() reflect.Type {
	return reflect.TypeOf((**TotalTls)(nil)).Elem()
}

func (i *TotalTls) ToTotalTlsOutput() TotalTlsOutput {
	return i.ToTotalTlsOutputWithContext(context.Background())
}

func (i *TotalTls) ToTotalTlsOutputWithContext(ctx context.Context) TotalTlsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TotalTlsOutput)
}

// TotalTlsArrayInput is an input type that accepts TotalTlsArray and TotalTlsArrayOutput values.
// You can construct a concrete instance of `TotalTlsArrayInput` via:
//
//	TotalTlsArray{ TotalTlsArgs{...} }
type TotalTlsArrayInput interface {
	pulumi.Input

	ToTotalTlsArrayOutput() TotalTlsArrayOutput
	ToTotalTlsArrayOutputWithContext(context.Context) TotalTlsArrayOutput
}

type TotalTlsArray []TotalTlsInput

func (TotalTlsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TotalTls)(nil)).Elem()
}

func (i TotalTlsArray) ToTotalTlsArrayOutput() TotalTlsArrayOutput {
	return i.ToTotalTlsArrayOutputWithContext(context.Background())
}

func (i TotalTlsArray) ToTotalTlsArrayOutputWithContext(ctx context.Context) TotalTlsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TotalTlsArrayOutput)
}

// TotalTlsMapInput is an input type that accepts TotalTlsMap and TotalTlsMapOutput values.
// You can construct a concrete instance of `TotalTlsMapInput` via:
//
//	TotalTlsMap{ "key": TotalTlsArgs{...} }
type TotalTlsMapInput interface {
	pulumi.Input

	ToTotalTlsMapOutput() TotalTlsMapOutput
	ToTotalTlsMapOutputWithContext(context.Context) TotalTlsMapOutput
}

type TotalTlsMap map[string]TotalTlsInput

func (TotalTlsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TotalTls)(nil)).Elem()
}

func (i TotalTlsMap) ToTotalTlsMapOutput() TotalTlsMapOutput {
	return i.ToTotalTlsMapOutputWithContext(context.Background())
}

func (i TotalTlsMap) ToTotalTlsMapOutputWithContext(ctx context.Context) TotalTlsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TotalTlsMapOutput)
}

type TotalTlsOutput struct{ *pulumi.OutputState }

func (TotalTlsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TotalTls)(nil)).Elem()
}

func (o TotalTlsOutput) ToTotalTlsOutput() TotalTlsOutput {
	return o
}

func (o TotalTlsOutput) ToTotalTlsOutputWithContext(ctx context.Context) TotalTlsOutput {
	return o
}

// The Certificate Authority that Total TLS certificates will be issued through. Available values: `google`, `letsEncrypt`.
func (o TotalTlsOutput) CertificateAuthority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TotalTls) pulumi.StringPtrOutput { return v.CertificateAuthority }).(pulumi.StringPtrOutput)
}

// Enable Total TLS for the zone.
func (o TotalTlsOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *TotalTls) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o TotalTlsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *TotalTls) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type TotalTlsArrayOutput struct{ *pulumi.OutputState }

func (TotalTlsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TotalTls)(nil)).Elem()
}

func (o TotalTlsArrayOutput) ToTotalTlsArrayOutput() TotalTlsArrayOutput {
	return o
}

func (o TotalTlsArrayOutput) ToTotalTlsArrayOutputWithContext(ctx context.Context) TotalTlsArrayOutput {
	return o
}

func (o TotalTlsArrayOutput) Index(i pulumi.IntInput) TotalTlsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TotalTls {
		return vs[0].([]*TotalTls)[vs[1].(int)]
	}).(TotalTlsOutput)
}

type TotalTlsMapOutput struct{ *pulumi.OutputState }

func (TotalTlsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TotalTls)(nil)).Elem()
}

func (o TotalTlsMapOutput) ToTotalTlsMapOutput() TotalTlsMapOutput {
	return o
}

func (o TotalTlsMapOutput) ToTotalTlsMapOutputWithContext(ctx context.Context) TotalTlsMapOutput {
	return o
}

func (o TotalTlsMapOutput) MapIndex(k pulumi.StringInput) TotalTlsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TotalTls {
		return vs[0].(map[string]*TotalTls)[vs[1].(string)]
	}).(TotalTlsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TotalTlsInput)(nil)).Elem(), &TotalTls{})
	pulumi.RegisterInputType(reflect.TypeOf((*TotalTlsArrayInput)(nil)).Elem(), TotalTlsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TotalTlsMapInput)(nil)).Elem(), TotalTlsMap{})
	pulumi.RegisterOutputType(TotalTlsOutput{})
	pulumi.RegisterOutputType(TotalTlsArrayOutput{})
	pulumi.RegisterOutputType(TotalTlsMapOutput{})
}
