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

// Access Service Tokens are used for service-to-service communication
// when an application is behind Cloudflare Access.
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
//			_, err := cloudflare.NewAccessServiceToken(ctx, "myApp", &cloudflare.AccessServiceTokenArgs{
//				AccountId:         pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				MinDaysForRenewal: pulumi.Int(30),
//				Name:              pulumi.String("CI/CD app renewed"),
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
// If you are importing an Access Service Token you will not have the client_secret available in the state for use. The client_secret is only available once, at creation. In most cases, it is better to just create a new resource should you need to reference it in other resources.
//
// ```sh
//
//	$ pulumi import cloudflare:index/accessServiceToken:AccessServiceToken example <account_id>/<service_token_id>
//
// ```
type AccessServiceToken struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
	Duration pulumi.StringOutput `pulumi:"duration"`
	// Date when the token expires.
	ExpiresAt pulumi.StringOutput `pulumi:"expiresAt"`
	// Refresh the token if terraform is run within the specified amount of days before expiration.
	MinDaysForRenewal pulumi.IntPtrOutput `pulumi:"minDaysForRenewal"`
	// Friendly name of the token's intent.
	Name pulumi.StringOutput `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewAccessServiceToken registers a new resource with the given unique name, arguments, and options.
func NewAccessServiceToken(ctx *pulumi.Context,
	name string, args *AccessServiceTokenArgs, opts ...pulumi.ResourceOption) (*AccessServiceToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AccessServiceToken
	err := ctx.RegisterResource("cloudflare:index/accessServiceToken:AccessServiceToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessServiceToken gets an existing AccessServiceToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessServiceToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessServiceTokenState, opts ...pulumi.ResourceOption) (*AccessServiceToken, error) {
	var resource AccessServiceToken
	err := ctx.ReadResource("cloudflare:index/accessServiceToken:AccessServiceToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessServiceToken resources.
type accessServiceTokenState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
	ClientId *string `pulumi:"clientId"`
	// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
	ClientSecret *string `pulumi:"clientSecret"`
	// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
	Duration *string `pulumi:"duration"`
	// Date when the token expires.
	ExpiresAt *string `pulumi:"expiresAt"`
	// Refresh the token if terraform is run within the specified amount of days before expiration.
	MinDaysForRenewal *int `pulumi:"minDaysForRenewal"`
	// Friendly name of the token's intent.
	Name *string `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessServiceTokenState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
	ClientId pulumi.StringPtrInput
	// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
	ClientSecret pulumi.StringPtrInput
	// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
	Duration pulumi.StringPtrInput
	// Date when the token expires.
	ExpiresAt pulumi.StringPtrInput
	// Refresh the token if terraform is run within the specified amount of days before expiration.
	MinDaysForRenewal pulumi.IntPtrInput
	// Friendly name of the token's intent.
	Name pulumi.StringPtrInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessServiceTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessServiceTokenState)(nil)).Elem()
}

type accessServiceTokenArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
	Duration *string `pulumi:"duration"`
	// Refresh the token if terraform is run within the specified amount of days before expiration.
	MinDaysForRenewal *int `pulumi:"minDaysForRenewal"`
	// Friendly name of the token's intent.
	Name string `pulumi:"name"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessServiceToken resource.
type AccessServiceTokenArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`.
	AccountId pulumi.StringPtrInput
	// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
	Duration pulumi.StringPtrInput
	// Refresh the token if terraform is run within the specified amount of days before expiration.
	MinDaysForRenewal pulumi.IntPtrInput
	// Friendly name of the token's intent.
	Name pulumi.StringInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessServiceTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessServiceTokenArgs)(nil)).Elem()
}

type AccessServiceTokenInput interface {
	pulumi.Input

	ToAccessServiceTokenOutput() AccessServiceTokenOutput
	ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput
}

func (*AccessServiceToken) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessServiceToken)(nil)).Elem()
}

func (i *AccessServiceToken) ToAccessServiceTokenOutput() AccessServiceTokenOutput {
	return i.ToAccessServiceTokenOutputWithContext(context.Background())
}

func (i *AccessServiceToken) ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenOutput)
}

// AccessServiceTokenArrayInput is an input type that accepts AccessServiceTokenArray and AccessServiceTokenArrayOutput values.
// You can construct a concrete instance of `AccessServiceTokenArrayInput` via:
//
//	AccessServiceTokenArray{ AccessServiceTokenArgs{...} }
type AccessServiceTokenArrayInput interface {
	pulumi.Input

	ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput
	ToAccessServiceTokenArrayOutputWithContext(context.Context) AccessServiceTokenArrayOutput
}

type AccessServiceTokenArray []AccessServiceTokenInput

func (AccessServiceTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessServiceToken)(nil)).Elem()
}

func (i AccessServiceTokenArray) ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput {
	return i.ToAccessServiceTokenArrayOutputWithContext(context.Background())
}

func (i AccessServiceTokenArray) ToAccessServiceTokenArrayOutputWithContext(ctx context.Context) AccessServiceTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenArrayOutput)
}

// AccessServiceTokenMapInput is an input type that accepts AccessServiceTokenMap and AccessServiceTokenMapOutput values.
// You can construct a concrete instance of `AccessServiceTokenMapInput` via:
//
//	AccessServiceTokenMap{ "key": AccessServiceTokenArgs{...} }
type AccessServiceTokenMapInput interface {
	pulumi.Input

	ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput
	ToAccessServiceTokenMapOutputWithContext(context.Context) AccessServiceTokenMapOutput
}

type AccessServiceTokenMap map[string]AccessServiceTokenInput

func (AccessServiceTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessServiceToken)(nil)).Elem()
}

func (i AccessServiceTokenMap) ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput {
	return i.ToAccessServiceTokenMapOutputWithContext(context.Background())
}

func (i AccessServiceTokenMap) ToAccessServiceTokenMapOutputWithContext(ctx context.Context) AccessServiceTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessServiceTokenMapOutput)
}

type AccessServiceTokenOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenOutput) ToAccessServiceTokenOutput() AccessServiceTokenOutput {
	return o
}

func (o AccessServiceTokenOutput) ToAccessServiceTokenOutputWithContext(ctx context.Context) AccessServiceTokenOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`.
func (o AccessServiceTokenOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Client ID associated with the Service Token. **Modifying this attribute will force creation of a new resource.**
func (o AccessServiceTokenOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// A secret for interacting with Access protocols. **Modifying this attribute will force creation of a new resource.**
func (o AccessServiceTokenOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// Length of time the service token is valid for. Available values: `8760h`, `17520h`, `43800h`, `87600h`, `forever`.
func (o AccessServiceTokenOutput) Duration() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.Duration }).(pulumi.StringOutput)
}

// Date when the token expires.
func (o AccessServiceTokenOutput) ExpiresAt() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.ExpiresAt }).(pulumi.StringOutput)
}

// Refresh the token if terraform is run within the specified amount of days before expiration.
func (o AccessServiceTokenOutput) MinDaysForRenewal() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.IntPtrOutput { return v.MinDaysForRenewal }).(pulumi.IntPtrOutput)
}

// Friendly name of the token's intent.
func (o AccessServiceTokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o AccessServiceTokenOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessServiceToken) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type AccessServiceTokenArrayOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenArrayOutput) ToAccessServiceTokenArrayOutput() AccessServiceTokenArrayOutput {
	return o
}

func (o AccessServiceTokenArrayOutput) ToAccessServiceTokenArrayOutputWithContext(ctx context.Context) AccessServiceTokenArrayOutput {
	return o
}

func (o AccessServiceTokenArrayOutput) Index(i pulumi.IntInput) AccessServiceTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessServiceToken {
		return vs[0].([]*AccessServiceToken)[vs[1].(int)]
	}).(AccessServiceTokenOutput)
}

type AccessServiceTokenMapOutput struct{ *pulumi.OutputState }

func (AccessServiceTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessServiceToken)(nil)).Elem()
}

func (o AccessServiceTokenMapOutput) ToAccessServiceTokenMapOutput() AccessServiceTokenMapOutput {
	return o
}

func (o AccessServiceTokenMapOutput) ToAccessServiceTokenMapOutputWithContext(ctx context.Context) AccessServiceTokenMapOutput {
	return o
}

func (o AccessServiceTokenMapOutput) MapIndex(k pulumi.StringInput) AccessServiceTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessServiceToken {
		return vs[0].(map[string]*AccessServiceToken)[vs[1].(string)]
	}).(AccessServiceTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenInput)(nil)).Elem(), &AccessServiceToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenArrayInput)(nil)).Elem(), AccessServiceTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessServiceTokenMapInput)(nil)).Elem(), AccessServiceTokenMap{})
	pulumi.RegisterOutputType(AccessServiceTokenOutput{})
	pulumi.RegisterOutputType(AccessServiceTokenArrayOutput{})
	pulumi.RegisterOutputType(AccessServiceTokenMapOutput{})
}
