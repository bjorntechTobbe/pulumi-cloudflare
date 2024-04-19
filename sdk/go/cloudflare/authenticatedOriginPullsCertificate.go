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

// Provides a Cloudflare Authenticated Origin Pulls certificate
// resource. An uploaded client certificate is required to use Per-Zone
//
//	or Per-Hostname Authenticated Origin Pulls.
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
//			// Per-Zone Authenticated Origin Pulls certificate
//			_, err := cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "my_per_zone_aop_cert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
//				PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
//				Type:        pulumi.String("per-zone"),
//			})
//			if err != nil {
//				return err
//			}
//			// Per-Hostname Authenticated Origin Pulls certificate
//			_, err = cloudflare.NewAuthenticatedOriginPullsCertificate(ctx, "my_per_hostname_aop_cert", &cloudflare.AuthenticatedOriginPullsCertificateArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Certificate: pulumi.String("-----INSERT CERTIFICATE-----"),
//				PrivateKey:  pulumi.String("-----INSERT PRIVATE KEY-----"),
//				Type:        pulumi.String("per-hostname"),
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
// $ pulumi import cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate example <zone_id>/<certificate_type>/<certificate_id>
// ```
type AuthenticatedOriginPullsCertificate struct {
	pulumi.CustomResourceState

	// The public client certificate. **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringOutput `pulumi:"certificate"`
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn pulumi.StringOutput `pulumi:"expiresOn"`
	// **Modifying this attribute will force creation of a new resource.**
	Issuer pulumi.StringOutput `pulumi:"issuer"`
	// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringOutput `pulumi:"privateKey"`
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber pulumi.StringOutput `pulumi:"serialNumber"`
	// **Modifying this attribute will force creation of a new resource.**
	Signature pulumi.StringOutput `pulumi:"signature"`
	// **Modifying this attribute will force creation of a new resource.**
	Status pulumi.StringOutput `pulumi:"status"`
	// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringOutput `pulumi:"type"`
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn pulumi.StringOutput `pulumi:"uploadedOn"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAuthenticatedOriginPullsCertificate registers a new resource with the given unique name, arguments, and options.
func NewAuthenticatedOriginPullsCertificate(ctx *pulumi.Context,
	name string, args *AuthenticatedOriginPullsCertificateArgs, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPullsCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Certificate == nil {
		return nil, errors.New("invalid value for required argument 'Certificate'")
	}
	if args.PrivateKey == nil {
		return nil, errors.New("invalid value for required argument 'PrivateKey'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	if args.PrivateKey != nil {
		args.PrivateKey = pulumi.ToSecret(args.PrivateKey).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"privateKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AuthenticatedOriginPullsCertificate
	err := ctx.RegisterResource("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAuthenticatedOriginPullsCertificate gets an existing AuthenticatedOriginPullsCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAuthenticatedOriginPullsCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AuthenticatedOriginPullsCertificateState, opts ...pulumi.ResourceOption) (*AuthenticatedOriginPullsCertificate, error) {
	var resource AuthenticatedOriginPullsCertificate
	err := ctx.ReadResource("cloudflare:index/authenticatedOriginPullsCertificate:AuthenticatedOriginPullsCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AuthenticatedOriginPullsCertificate resources.
type authenticatedOriginPullsCertificateState struct {
	// The public client certificate. **Modifying this attribute will force creation of a new resource.**
	Certificate *string `pulumi:"certificate"`
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn *string `pulumi:"expiresOn"`
	// **Modifying this attribute will force creation of a new resource.**
	Issuer *string `pulumi:"issuer"`
	// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
	PrivateKey *string `pulumi:"privateKey"`
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber *string `pulumi:"serialNumber"`
	// **Modifying this attribute will force creation of a new resource.**
	Signature *string `pulumi:"signature"`
	// **Modifying this attribute will force creation of a new resource.**
	Status *string `pulumi:"status"`
	// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
	Type *string `pulumi:"type"`
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn *string `pulumi:"uploadedOn"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type AuthenticatedOriginPullsCertificateState struct {
	// The public client certificate. **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	ExpiresOn pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	Issuer pulumi.StringPtrInput
	// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	SerialNumber pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	Signature pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	Status pulumi.StringPtrInput
	// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringPtrInput
	// **Modifying this attribute will force creation of a new resource.**
	UploadedOn pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (AuthenticatedOriginPullsCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsCertificateState)(nil)).Elem()
}

type authenticatedOriginPullsCertificateArgs struct {
	// The public client certificate. **Modifying this attribute will force creation of a new resource.**
	Certificate string `pulumi:"certificate"`
	// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
	PrivateKey string `pulumi:"privateKey"`
	// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
	Type string `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AuthenticatedOriginPullsCertificate resource.
type AuthenticatedOriginPullsCertificateArgs struct {
	// The public client certificate. **Modifying this attribute will force creation of a new resource.**
	Certificate pulumi.StringInput
	// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
	PrivateKey pulumi.StringInput
	// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
	Type pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (AuthenticatedOriginPullsCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*authenticatedOriginPullsCertificateArgs)(nil)).Elem()
}

type AuthenticatedOriginPullsCertificateInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsCertificateOutput() AuthenticatedOriginPullsCertificateOutput
	ToAuthenticatedOriginPullsCertificateOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateOutput
}

func (*AuthenticatedOriginPullsCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (i *AuthenticatedOriginPullsCertificate) ToAuthenticatedOriginPullsCertificateOutput() AuthenticatedOriginPullsCertificateOutput {
	return i.ToAuthenticatedOriginPullsCertificateOutputWithContext(context.Background())
}

func (i *AuthenticatedOriginPullsCertificate) ToAuthenticatedOriginPullsCertificateOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsCertificateOutput)
}

// AuthenticatedOriginPullsCertificateArrayInput is an input type that accepts AuthenticatedOriginPullsCertificateArray and AuthenticatedOriginPullsCertificateArrayOutput values.
// You can construct a concrete instance of `AuthenticatedOriginPullsCertificateArrayInput` via:
//
//	AuthenticatedOriginPullsCertificateArray{ AuthenticatedOriginPullsCertificateArgs{...} }
type AuthenticatedOriginPullsCertificateArrayInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsCertificateArrayOutput() AuthenticatedOriginPullsCertificateArrayOutput
	ToAuthenticatedOriginPullsCertificateArrayOutputWithContext(context.Context) AuthenticatedOriginPullsCertificateArrayOutput
}

type AuthenticatedOriginPullsCertificateArray []AuthenticatedOriginPullsCertificateInput

func (AuthenticatedOriginPullsCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (i AuthenticatedOriginPullsCertificateArray) ToAuthenticatedOriginPullsCertificateArrayOutput() AuthenticatedOriginPullsCertificateArrayOutput {
	return i.ToAuthenticatedOriginPullsCertificateArrayOutputWithContext(context.Background())
}

func (i AuthenticatedOriginPullsCertificateArray) ToAuthenticatedOriginPullsCertificateArrayOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsCertificateArrayOutput)
}

// AuthenticatedOriginPullsCertificateMapInput is an input type that accepts AuthenticatedOriginPullsCertificateMap and AuthenticatedOriginPullsCertificateMapOutput values.
// You can construct a concrete instance of `AuthenticatedOriginPullsCertificateMapInput` via:
//
//	AuthenticatedOriginPullsCertificateMap{ "key": AuthenticatedOriginPullsCertificateArgs{...} }
type AuthenticatedOriginPullsCertificateMapInput interface {
	pulumi.Input

	ToAuthenticatedOriginPullsCertificateMapOutput() AuthenticatedOriginPullsCertificateMapOutput
	ToAuthenticatedOriginPullsCertificateMapOutputWithContext(context.Context) AuthenticatedOriginPullsCertificateMapOutput
}

type AuthenticatedOriginPullsCertificateMap map[string]AuthenticatedOriginPullsCertificateInput

func (AuthenticatedOriginPullsCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (i AuthenticatedOriginPullsCertificateMap) ToAuthenticatedOriginPullsCertificateMapOutput() AuthenticatedOriginPullsCertificateMapOutput {
	return i.ToAuthenticatedOriginPullsCertificateMapOutputWithContext(context.Background())
}

func (i AuthenticatedOriginPullsCertificateMap) ToAuthenticatedOriginPullsCertificateMapOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AuthenticatedOriginPullsCertificateMapOutput)
}

type AuthenticatedOriginPullsCertificateOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (o AuthenticatedOriginPullsCertificateOutput) ToAuthenticatedOriginPullsCertificateOutput() AuthenticatedOriginPullsCertificateOutput {
	return o
}

func (o AuthenticatedOriginPullsCertificateOutput) ToAuthenticatedOriginPullsCertificateOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateOutput {
	return o
}

// The public client certificate. **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) Certificate() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.Certificate }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) ExpiresOn() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.ExpiresOn }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) Issuer() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.Issuer }).(pulumi.StringOutput)
}

// The private key of the client certificate. **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) PrivateKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.PrivateKey }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) SerialNumber() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.SerialNumber }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) Signature() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.Signature }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The form of Authenticated Origin Pulls to upload the certificate to. Available values: `per-zone`, `per-hostname`. **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) UploadedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.UploadedOn }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o AuthenticatedOriginPullsCertificateOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AuthenticatedOriginPullsCertificate) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AuthenticatedOriginPullsCertificateArrayOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (o AuthenticatedOriginPullsCertificateArrayOutput) ToAuthenticatedOriginPullsCertificateArrayOutput() AuthenticatedOriginPullsCertificateArrayOutput {
	return o
}

func (o AuthenticatedOriginPullsCertificateArrayOutput) ToAuthenticatedOriginPullsCertificateArrayOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateArrayOutput {
	return o
}

func (o AuthenticatedOriginPullsCertificateArrayOutput) Index(i pulumi.IntInput) AuthenticatedOriginPullsCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AuthenticatedOriginPullsCertificate {
		return vs[0].([]*AuthenticatedOriginPullsCertificate)[vs[1].(int)]
	}).(AuthenticatedOriginPullsCertificateOutput)
}

type AuthenticatedOriginPullsCertificateMapOutput struct{ *pulumi.OutputState }

func (AuthenticatedOriginPullsCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AuthenticatedOriginPullsCertificate)(nil)).Elem()
}

func (o AuthenticatedOriginPullsCertificateMapOutput) ToAuthenticatedOriginPullsCertificateMapOutput() AuthenticatedOriginPullsCertificateMapOutput {
	return o
}

func (o AuthenticatedOriginPullsCertificateMapOutput) ToAuthenticatedOriginPullsCertificateMapOutputWithContext(ctx context.Context) AuthenticatedOriginPullsCertificateMapOutput {
	return o
}

func (o AuthenticatedOriginPullsCertificateMapOutput) MapIndex(k pulumi.StringInput) AuthenticatedOriginPullsCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AuthenticatedOriginPullsCertificate {
		return vs[0].(map[string]*AuthenticatedOriginPullsCertificate)[vs[1].(string)]
	}).(AuthenticatedOriginPullsCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsCertificateInput)(nil)).Elem(), &AuthenticatedOriginPullsCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsCertificateArrayInput)(nil)).Elem(), AuthenticatedOriginPullsCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AuthenticatedOriginPullsCertificateMapInput)(nil)).Elem(), AuthenticatedOriginPullsCertificateMap{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsCertificateOutput{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsCertificateArrayOutput{})
	pulumi.RegisterOutputType(AuthenticatedOriginPullsCertificateMapOutput{})
}
