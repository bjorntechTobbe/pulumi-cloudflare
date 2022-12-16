// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Access Group resource. Access Groups are used
// in conjunction with Access Policies to restrict access to a
// particular resource based on group membership.
//
// > It's required that an `accountId` or `zoneId` is provided and in
// most cases using either is fine. However, if you're using a scoped
// access token, you must provide the argument that matches the token's
// scope. For example, an access token that is scoped to the "example.com"
// zone needs to use the `zoneId` argument.
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
//			_, err := cloudflare.NewAccessGroup(ctx, "testGroupAccessGroup", &cloudflare.AccessGroupArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("staging group"),
//				Includes: cloudflare.AccessGroupIncludeArray{
//					&cloudflare.AccessGroupIncludeArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("test@example.com"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewAccessGroup(ctx, "testGroupIndex/accessGroupAccessGroup", &cloudflare.AccessGroupArgs{
//				AccountId: pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:      pulumi.String("staging group"),
//				Includes: cloudflare.AccessGroupIncludeArray{
//					&cloudflare.AccessGroupIncludeArgs{
//						Emails: pulumi.StringArray{
//							pulumi.String("test@example.com"),
//						},
//					},
//				},
//				Requires: cloudflare.AccessGroupRequireArray{
//					Ips: cloudflare.AccessGroupRequireArgs{
//						_var.Office_ip,
//					},
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
//
//	$ pulumi import cloudflare:index/accessGroup:AccessGroup example <account_id>/<group_id>
//
// ```
type AccessGroup struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrOutput        `pulumi:"accountId"`
	Excludes  AccessGroupExcludeArrayOutput `pulumi:"excludes"`
	Includes  AccessGroupIncludeArrayOutput `pulumi:"includes"`
	Name      pulumi.StringOutput           `pulumi:"name"`
	Requires  AccessGroupRequireArrayOutput `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewAccessGroup registers a new resource with the given unique name, arguments, and options.
func NewAccessGroup(ctx *pulumi.Context,
	name string, args *AccessGroupArgs, opts ...pulumi.ResourceOption) (*AccessGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Includes == nil {
		return nil, errors.New("invalid value for required argument 'Includes'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource AccessGroup
	err := ctx.RegisterResource("cloudflare:index/accessGroup:AccessGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAccessGroup gets an existing AccessGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAccessGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AccessGroupState, opts ...pulumi.ResourceOption) (*AccessGroup, error) {
	var resource AccessGroup
	err := ctx.ReadResource("cloudflare:index/accessGroup:AccessGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AccessGroup resources.
type accessGroupState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string              `pulumi:"accountId"`
	Excludes  []AccessGroupExclude `pulumi:"excludes"`
	Includes  []AccessGroupInclude `pulumi:"includes"`
	Name      *string              `pulumi:"name"`
	Requires  []AccessGroupRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

type AccessGroupState struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	Excludes  AccessGroupExcludeArrayInput
	Includes  AccessGroupIncludeArrayInput
	Name      pulumi.StringPtrInput
	Requires  AccessGroupRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*accessGroupState)(nil)).Elem()
}

type accessGroupArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId *string              `pulumi:"accountId"`
	Excludes  []AccessGroupExclude `pulumi:"excludes"`
	Includes  []AccessGroupInclude `pulumi:"includes"`
	Name      string               `pulumi:"name"`
	Requires  []AccessGroupRequire `pulumi:"requires"`
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a AccessGroup resource.
type AccessGroupArgs struct {
	// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
	AccountId pulumi.StringPtrInput
	Excludes  AccessGroupExcludeArrayInput
	Includes  AccessGroupIncludeArrayInput
	Name      pulumi.StringInput
	Requires  AccessGroupRequireArrayInput
	// The zone identifier to target for the resource. Conflicts with `accountId`.
	ZoneId pulumi.StringPtrInput
}

func (AccessGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*accessGroupArgs)(nil)).Elem()
}

type AccessGroupInput interface {
	pulumi.Input

	ToAccessGroupOutput() AccessGroupOutput
	ToAccessGroupOutputWithContext(ctx context.Context) AccessGroupOutput
}

func (*AccessGroup) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessGroup)(nil)).Elem()
}

func (i *AccessGroup) ToAccessGroupOutput() AccessGroupOutput {
	return i.ToAccessGroupOutputWithContext(context.Background())
}

func (i *AccessGroup) ToAccessGroupOutputWithContext(ctx context.Context) AccessGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessGroupOutput)
}

// AccessGroupArrayInput is an input type that accepts AccessGroupArray and AccessGroupArrayOutput values.
// You can construct a concrete instance of `AccessGroupArrayInput` via:
//
//	AccessGroupArray{ AccessGroupArgs{...} }
type AccessGroupArrayInput interface {
	pulumi.Input

	ToAccessGroupArrayOutput() AccessGroupArrayOutput
	ToAccessGroupArrayOutputWithContext(context.Context) AccessGroupArrayOutput
}

type AccessGroupArray []AccessGroupInput

func (AccessGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessGroup)(nil)).Elem()
}

func (i AccessGroupArray) ToAccessGroupArrayOutput() AccessGroupArrayOutput {
	return i.ToAccessGroupArrayOutputWithContext(context.Background())
}

func (i AccessGroupArray) ToAccessGroupArrayOutputWithContext(ctx context.Context) AccessGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessGroupArrayOutput)
}

// AccessGroupMapInput is an input type that accepts AccessGroupMap and AccessGroupMapOutput values.
// You can construct a concrete instance of `AccessGroupMapInput` via:
//
//	AccessGroupMap{ "key": AccessGroupArgs{...} }
type AccessGroupMapInput interface {
	pulumi.Input

	ToAccessGroupMapOutput() AccessGroupMapOutput
	ToAccessGroupMapOutputWithContext(context.Context) AccessGroupMapOutput
}

type AccessGroupMap map[string]AccessGroupInput

func (AccessGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessGroup)(nil)).Elem()
}

func (i AccessGroupMap) ToAccessGroupMapOutput() AccessGroupMapOutput {
	return i.ToAccessGroupMapOutputWithContext(context.Background())
}

func (i AccessGroupMap) ToAccessGroupMapOutputWithContext(ctx context.Context) AccessGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AccessGroupMapOutput)
}

type AccessGroupOutput struct{ *pulumi.OutputState }

func (AccessGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AccessGroup)(nil)).Elem()
}

func (o AccessGroupOutput) ToAccessGroupOutput() AccessGroupOutput {
	return o
}

func (o AccessGroupOutput) ToAccessGroupOutputWithContext(ctx context.Context) AccessGroupOutput {
	return o
}

// The account identifier to target for the resource. Conflicts with `zoneId`. **Modifying this attribute will force creation of a new resource.**
func (o AccessGroupOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AccessGroup) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

func (o AccessGroupOutput) Excludes() AccessGroupExcludeArrayOutput {
	return o.ApplyT(func(v *AccessGroup) AccessGroupExcludeArrayOutput { return v.Excludes }).(AccessGroupExcludeArrayOutput)
}

func (o AccessGroupOutput) Includes() AccessGroupIncludeArrayOutput {
	return o.ApplyT(func(v *AccessGroup) AccessGroupIncludeArrayOutput { return v.Includes }).(AccessGroupIncludeArrayOutput)
}

func (o AccessGroupOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessGroup) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o AccessGroupOutput) Requires() AccessGroupRequireArrayOutput {
	return o.ApplyT(func(v *AccessGroup) AccessGroupRequireArrayOutput { return v.Requires }).(AccessGroupRequireArrayOutput)
}

// The zone identifier to target for the resource. Conflicts with `accountId`.
func (o AccessGroupOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *AccessGroup) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type AccessGroupArrayOutput struct{ *pulumi.OutputState }

func (AccessGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AccessGroup)(nil)).Elem()
}

func (o AccessGroupArrayOutput) ToAccessGroupArrayOutput() AccessGroupArrayOutput {
	return o
}

func (o AccessGroupArrayOutput) ToAccessGroupArrayOutputWithContext(ctx context.Context) AccessGroupArrayOutput {
	return o
}

func (o AccessGroupArrayOutput) Index(i pulumi.IntInput) AccessGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AccessGroup {
		return vs[0].([]*AccessGroup)[vs[1].(int)]
	}).(AccessGroupOutput)
}

type AccessGroupMapOutput struct{ *pulumi.OutputState }

func (AccessGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AccessGroup)(nil)).Elem()
}

func (o AccessGroupMapOutput) ToAccessGroupMapOutput() AccessGroupMapOutput {
	return o
}

func (o AccessGroupMapOutput) ToAccessGroupMapOutputWithContext(ctx context.Context) AccessGroupMapOutput {
	return o
}

func (o AccessGroupMapOutput) MapIndex(k pulumi.StringInput) AccessGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AccessGroup {
		return vs[0].(map[string]*AccessGroup)[vs[1].(string)]
	}).(AccessGroupOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AccessGroupInput)(nil)).Elem(), &AccessGroup{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessGroupArrayInput)(nil)).Elem(), AccessGroupArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AccessGroupMapInput)(nil)).Elem(), AccessGroupMap{})
	pulumi.RegisterOutputType(AccessGroupOutput{})
	pulumi.RegisterOutputType(AccessGroupArrayOutput{})
	pulumi.RegisterOutputType(AccessGroupMapOutput{})
}
