// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-cloudflare/sdk/v5/go/cloudflare/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare per-hostname TLS setting resource, specifically for ciphers suites. Used to set ciphers suites for hostnames under the specified zone.
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
//			_, err := cloudflare.NewHostnameTlsSettingCiphers(ctx, "example", &cloudflare.HostnameTlsSettingCiphersArgs{
//				ZoneId:   pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Hostname: pulumi.String("sub.example.com"),
//				Values: pulumi.StringArray{
//					pulumi.String("ECDHE-RSA-AES128-GCM-SHA256"),
//				},
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
// $ pulumi import cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers example <zone_id>/<hostname>
// ```
type HostnameTlsSettingCiphers struct {
	pulumi.CustomResourceState

	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// Ports to use within the IP rule.
	Ports     pulumi.IntArrayOutput `pulumi:"ports"`
	UpdatedAt pulumi.StringOutput   `pulumi:"updatedAt"`
	// Ciphers suites value.
	Values pulumi.StringArrayOutput `pulumi:"values"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewHostnameTlsSettingCiphers registers a new resource with the given unique name, arguments, and options.
func NewHostnameTlsSettingCiphers(ctx *pulumi.Context,
	name string, args *HostnameTlsSettingCiphersArgs, opts ...pulumi.ResourceOption) (*HostnameTlsSettingCiphers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Hostname == nil {
		return nil, errors.New("invalid value for required argument 'Hostname'")
	}
	if args.Values == nil {
		return nil, errors.New("invalid value for required argument 'Values'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource HostnameTlsSettingCiphers
	err := ctx.RegisterResource("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHostnameTlsSettingCiphers gets an existing HostnameTlsSettingCiphers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHostnameTlsSettingCiphers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HostnameTlsSettingCiphersState, opts ...pulumi.ResourceOption) (*HostnameTlsSettingCiphers, error) {
	var resource HostnameTlsSettingCiphers
	err := ctx.ReadResource("cloudflare:index/hostnameTlsSettingCiphers:HostnameTlsSettingCiphers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering HostnameTlsSettingCiphers resources.
type hostnameTlsSettingCiphersState struct {
	CreatedAt *string `pulumi:"createdAt"`
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname *string `pulumi:"hostname"`
	// Ports to use within the IP rule.
	Ports     []int   `pulumi:"ports"`
	UpdatedAt *string `pulumi:"updatedAt"`
	// Ciphers suites value.
	Values []string `pulumi:"values"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type HostnameTlsSettingCiphersState struct {
	CreatedAt pulumi.StringPtrInput
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringPtrInput
	// Ports to use within the IP rule.
	Ports     pulumi.IntArrayInput
	UpdatedAt pulumi.StringPtrInput
	// Ciphers suites value.
	Values pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (HostnameTlsSettingCiphersState) ElementType() reflect.Type {
	return reflect.TypeOf((*hostnameTlsSettingCiphersState)(nil)).Elem()
}

type hostnameTlsSettingCiphersArgs struct {
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname string `pulumi:"hostname"`
	// Ports to use within the IP rule.
	Ports []int `pulumi:"ports"`
	// Ciphers suites value.
	Values []string `pulumi:"values"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a HostnameTlsSettingCiphers resource.
type HostnameTlsSettingCiphersArgs struct {
	// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
	Hostname pulumi.StringInput
	// Ports to use within the IP rule.
	Ports pulumi.IntArrayInput
	// Ciphers suites value.
	Values pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (HostnameTlsSettingCiphersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hostnameTlsSettingCiphersArgs)(nil)).Elem()
}

type HostnameTlsSettingCiphersInput interface {
	pulumi.Input

	ToHostnameTlsSettingCiphersOutput() HostnameTlsSettingCiphersOutput
	ToHostnameTlsSettingCiphersOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersOutput
}

func (*HostnameTlsSettingCiphers) ElementType() reflect.Type {
	return reflect.TypeOf((**HostnameTlsSettingCiphers)(nil)).Elem()
}

func (i *HostnameTlsSettingCiphers) ToHostnameTlsSettingCiphersOutput() HostnameTlsSettingCiphersOutput {
	return i.ToHostnameTlsSettingCiphersOutputWithContext(context.Background())
}

func (i *HostnameTlsSettingCiphers) ToHostnameTlsSettingCiphersOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingCiphersOutput)
}

// HostnameTlsSettingCiphersArrayInput is an input type that accepts HostnameTlsSettingCiphersArray and HostnameTlsSettingCiphersArrayOutput values.
// You can construct a concrete instance of `HostnameTlsSettingCiphersArrayInput` via:
//
//	HostnameTlsSettingCiphersArray{ HostnameTlsSettingCiphersArgs{...} }
type HostnameTlsSettingCiphersArrayInput interface {
	pulumi.Input

	ToHostnameTlsSettingCiphersArrayOutput() HostnameTlsSettingCiphersArrayOutput
	ToHostnameTlsSettingCiphersArrayOutputWithContext(context.Context) HostnameTlsSettingCiphersArrayOutput
}

type HostnameTlsSettingCiphersArray []HostnameTlsSettingCiphersInput

func (HostnameTlsSettingCiphersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostnameTlsSettingCiphers)(nil)).Elem()
}

func (i HostnameTlsSettingCiphersArray) ToHostnameTlsSettingCiphersArrayOutput() HostnameTlsSettingCiphersArrayOutput {
	return i.ToHostnameTlsSettingCiphersArrayOutputWithContext(context.Background())
}

func (i HostnameTlsSettingCiphersArray) ToHostnameTlsSettingCiphersArrayOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingCiphersArrayOutput)
}

// HostnameTlsSettingCiphersMapInput is an input type that accepts HostnameTlsSettingCiphersMap and HostnameTlsSettingCiphersMapOutput values.
// You can construct a concrete instance of `HostnameTlsSettingCiphersMapInput` via:
//
//	HostnameTlsSettingCiphersMap{ "key": HostnameTlsSettingCiphersArgs{...} }
type HostnameTlsSettingCiphersMapInput interface {
	pulumi.Input

	ToHostnameTlsSettingCiphersMapOutput() HostnameTlsSettingCiphersMapOutput
	ToHostnameTlsSettingCiphersMapOutputWithContext(context.Context) HostnameTlsSettingCiphersMapOutput
}

type HostnameTlsSettingCiphersMap map[string]HostnameTlsSettingCiphersInput

func (HostnameTlsSettingCiphersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostnameTlsSettingCiphers)(nil)).Elem()
}

func (i HostnameTlsSettingCiphersMap) ToHostnameTlsSettingCiphersMapOutput() HostnameTlsSettingCiphersMapOutput {
	return i.ToHostnameTlsSettingCiphersMapOutputWithContext(context.Background())
}

func (i HostnameTlsSettingCiphersMap) ToHostnameTlsSettingCiphersMapOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HostnameTlsSettingCiphersMapOutput)
}

type HostnameTlsSettingCiphersOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingCiphersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**HostnameTlsSettingCiphers)(nil)).Elem()
}

func (o HostnameTlsSettingCiphersOutput) ToHostnameTlsSettingCiphersOutput() HostnameTlsSettingCiphersOutput {
	return o
}

func (o HostnameTlsSettingCiphersOutput) ToHostnameTlsSettingCiphersOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersOutput {
	return o
}

func (o HostnameTlsSettingCiphersOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Hostname that belongs to this zone name. **Modifying this attribute will force creation of a new resource.**
func (o HostnameTlsSettingCiphersOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// Ports to use within the IP rule.
func (o HostnameTlsSettingCiphersOutput) Ports() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.IntArrayOutput { return v.Ports }).(pulumi.IntArrayOutput)
}

func (o HostnameTlsSettingCiphersOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// Ciphers suites value.
func (o HostnameTlsSettingCiphersOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.StringArrayOutput { return v.Values }).(pulumi.StringArrayOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o HostnameTlsSettingCiphersOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *HostnameTlsSettingCiphers) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type HostnameTlsSettingCiphersArrayOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingCiphersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*HostnameTlsSettingCiphers)(nil)).Elem()
}

func (o HostnameTlsSettingCiphersArrayOutput) ToHostnameTlsSettingCiphersArrayOutput() HostnameTlsSettingCiphersArrayOutput {
	return o
}

func (o HostnameTlsSettingCiphersArrayOutput) ToHostnameTlsSettingCiphersArrayOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersArrayOutput {
	return o
}

func (o HostnameTlsSettingCiphersArrayOutput) Index(i pulumi.IntInput) HostnameTlsSettingCiphersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *HostnameTlsSettingCiphers {
		return vs[0].([]*HostnameTlsSettingCiphers)[vs[1].(int)]
	}).(HostnameTlsSettingCiphersOutput)
}

type HostnameTlsSettingCiphersMapOutput struct{ *pulumi.OutputState }

func (HostnameTlsSettingCiphersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*HostnameTlsSettingCiphers)(nil)).Elem()
}

func (o HostnameTlsSettingCiphersMapOutput) ToHostnameTlsSettingCiphersMapOutput() HostnameTlsSettingCiphersMapOutput {
	return o
}

func (o HostnameTlsSettingCiphersMapOutput) ToHostnameTlsSettingCiphersMapOutputWithContext(ctx context.Context) HostnameTlsSettingCiphersMapOutput {
	return o
}

func (o HostnameTlsSettingCiphersMapOutput) MapIndex(k pulumi.StringInput) HostnameTlsSettingCiphersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *HostnameTlsSettingCiphers {
		return vs[0].(map[string]*HostnameTlsSettingCiphers)[vs[1].(string)]
	}).(HostnameTlsSettingCiphersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingCiphersInput)(nil)).Elem(), &HostnameTlsSettingCiphers{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingCiphersArrayInput)(nil)).Elem(), HostnameTlsSettingCiphersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HostnameTlsSettingCiphersMapInput)(nil)).Elem(), HostnameTlsSettingCiphersMap{})
	pulumi.RegisterOutputType(HostnameTlsSettingCiphersOutput{})
	pulumi.RegisterOutputType(HostnameTlsSettingCiphersArrayOutput{})
	pulumi.RegisterOutputType(HostnameTlsSettingCiphersMapOutput{})
}
