// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which manages Cloudflare Logpush ownership
// challenges to use in a Logpush Job. On it's own, doesn't do much
// however this resource should be used in conjunction to create
// Logpush jobs.
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
//			_, err := cloudflare.NewLogpushOwnershipChallenge(ctx, "example", &cloudflare.LogpushOwnershipChallengeArgs{
//				DestinationConf: pulumi.String("s3://my-bucket-path?region=us-west-2"),
//				ZoneId:          pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type LogpushOwnershipChallenge struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename pulumi.StringOutput `pulumi:"ownershipChallengeFilename"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewLogpushOwnershipChallenge registers a new resource with the given unique name, arguments, and options.
func NewLogpushOwnershipChallenge(ctx *pulumi.Context,
	name string, args *LogpushOwnershipChallengeArgs, opts ...pulumi.ResourceOption) (*LogpushOwnershipChallenge, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConf == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConf'")
	}
	var resource LogpushOwnershipChallenge
	err := ctx.RegisterResource("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogpushOwnershipChallenge gets an existing LogpushOwnershipChallenge resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogpushOwnershipChallenge(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogpushOwnershipChallengeState, opts ...pulumi.ResourceOption) (*LogpushOwnershipChallenge, error) {
	var resource LogpushOwnershipChallenge
	err := ctx.ReadResource("cloudflare:index/logpushOwnershipChallenge:LogpushOwnershipChallenge", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogpushOwnershipChallenge resources.
type logpushOwnershipChallengeState struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
	DestinationConf *string `pulumi:"destinationConf"`
	// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename *string `pulumi:"ownershipChallengeFilename"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpushOwnershipChallengeState struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
	DestinationConf pulumi.StringPtrInput
	// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
	OwnershipChallengeFilename pulumi.StringPtrInput
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrInput
}

func (LogpushOwnershipChallengeState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushOwnershipChallengeState)(nil)).Elem()
}

type logpushOwnershipChallengeArgs struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
	DestinationConf string `pulumi:"destinationConf"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpushOwnershipChallenge resource.
type LogpushOwnershipChallengeArgs struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
	DestinationConf pulumi.StringInput
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrInput
}

func (LogpushOwnershipChallengeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushOwnershipChallengeArgs)(nil)).Elem()
}

type LogpushOwnershipChallengeInput interface {
	pulumi.Input

	ToLogpushOwnershipChallengeOutput() LogpushOwnershipChallengeOutput
	ToLogpushOwnershipChallengeOutputWithContext(ctx context.Context) LogpushOwnershipChallengeOutput
}

func (*LogpushOwnershipChallenge) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushOwnershipChallenge)(nil)).Elem()
}

func (i *LogpushOwnershipChallenge) ToLogpushOwnershipChallengeOutput() LogpushOwnershipChallengeOutput {
	return i.ToLogpushOwnershipChallengeOutputWithContext(context.Background())
}

func (i *LogpushOwnershipChallenge) ToLogpushOwnershipChallengeOutputWithContext(ctx context.Context) LogpushOwnershipChallengeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushOwnershipChallengeOutput)
}

// LogpushOwnershipChallengeArrayInput is an input type that accepts LogpushOwnershipChallengeArray and LogpushOwnershipChallengeArrayOutput values.
// You can construct a concrete instance of `LogpushOwnershipChallengeArrayInput` via:
//
//	LogpushOwnershipChallengeArray{ LogpushOwnershipChallengeArgs{...} }
type LogpushOwnershipChallengeArrayInput interface {
	pulumi.Input

	ToLogpushOwnershipChallengeArrayOutput() LogpushOwnershipChallengeArrayOutput
	ToLogpushOwnershipChallengeArrayOutputWithContext(context.Context) LogpushOwnershipChallengeArrayOutput
}

type LogpushOwnershipChallengeArray []LogpushOwnershipChallengeInput

func (LogpushOwnershipChallengeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushOwnershipChallenge)(nil)).Elem()
}

func (i LogpushOwnershipChallengeArray) ToLogpushOwnershipChallengeArrayOutput() LogpushOwnershipChallengeArrayOutput {
	return i.ToLogpushOwnershipChallengeArrayOutputWithContext(context.Background())
}

func (i LogpushOwnershipChallengeArray) ToLogpushOwnershipChallengeArrayOutputWithContext(ctx context.Context) LogpushOwnershipChallengeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushOwnershipChallengeArrayOutput)
}

// LogpushOwnershipChallengeMapInput is an input type that accepts LogpushOwnershipChallengeMap and LogpushOwnershipChallengeMapOutput values.
// You can construct a concrete instance of `LogpushOwnershipChallengeMapInput` via:
//
//	LogpushOwnershipChallengeMap{ "key": LogpushOwnershipChallengeArgs{...} }
type LogpushOwnershipChallengeMapInput interface {
	pulumi.Input

	ToLogpushOwnershipChallengeMapOutput() LogpushOwnershipChallengeMapOutput
	ToLogpushOwnershipChallengeMapOutputWithContext(context.Context) LogpushOwnershipChallengeMapOutput
}

type LogpushOwnershipChallengeMap map[string]LogpushOwnershipChallengeInput

func (LogpushOwnershipChallengeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushOwnershipChallenge)(nil)).Elem()
}

func (i LogpushOwnershipChallengeMap) ToLogpushOwnershipChallengeMapOutput() LogpushOwnershipChallengeMapOutput {
	return i.ToLogpushOwnershipChallengeMapOutputWithContext(context.Background())
}

func (i LogpushOwnershipChallengeMap) ToLogpushOwnershipChallengeMapOutputWithContext(ctx context.Context) LogpushOwnershipChallengeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushOwnershipChallengeMapOutput)
}

type LogpushOwnershipChallengeOutput struct{ *pulumi.OutputState }

func (LogpushOwnershipChallengeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushOwnershipChallenge)(nil)).Elem()
}

func (o LogpushOwnershipChallengeOutput) ToLogpushOwnershipChallengeOutput() LogpushOwnershipChallengeOutput {
	return o
}

func (o LogpushOwnershipChallengeOutput) ToLogpushOwnershipChallengeOutputWithContext(ctx context.Context) LogpushOwnershipChallengeOutput {
	return o
}

// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
func (o LogpushOwnershipChallengeOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushOwnershipChallenge) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination). **Modifying this attribute will force creation of a new resource.**
func (o LogpushOwnershipChallengeOutput) DestinationConf() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushOwnershipChallenge) pulumi.StringOutput { return v.DestinationConf }).(pulumi.StringOutput)
}

// The filename of the ownership challenge which	contains the contents required for Logpush Job creation.
func (o LogpushOwnershipChallengeOutput) OwnershipChallengeFilename() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushOwnershipChallenge) pulumi.StringOutput { return v.OwnershipChallengeFilename }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
func (o LogpushOwnershipChallengeOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushOwnershipChallenge) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type LogpushOwnershipChallengeArrayOutput struct{ *pulumi.OutputState }

func (LogpushOwnershipChallengeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushOwnershipChallenge)(nil)).Elem()
}

func (o LogpushOwnershipChallengeArrayOutput) ToLogpushOwnershipChallengeArrayOutput() LogpushOwnershipChallengeArrayOutput {
	return o
}

func (o LogpushOwnershipChallengeArrayOutput) ToLogpushOwnershipChallengeArrayOutputWithContext(ctx context.Context) LogpushOwnershipChallengeArrayOutput {
	return o
}

func (o LogpushOwnershipChallengeArrayOutput) Index(i pulumi.IntInput) LogpushOwnershipChallengeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogpushOwnershipChallenge {
		return vs[0].([]*LogpushOwnershipChallenge)[vs[1].(int)]
	}).(LogpushOwnershipChallengeOutput)
}

type LogpushOwnershipChallengeMapOutput struct{ *pulumi.OutputState }

func (LogpushOwnershipChallengeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushOwnershipChallenge)(nil)).Elem()
}

func (o LogpushOwnershipChallengeMapOutput) ToLogpushOwnershipChallengeMapOutput() LogpushOwnershipChallengeMapOutput {
	return o
}

func (o LogpushOwnershipChallengeMapOutput) ToLogpushOwnershipChallengeMapOutputWithContext(ctx context.Context) LogpushOwnershipChallengeMapOutput {
	return o
}

func (o LogpushOwnershipChallengeMapOutput) MapIndex(k pulumi.StringInput) LogpushOwnershipChallengeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogpushOwnershipChallenge {
		return vs[0].(map[string]*LogpushOwnershipChallenge)[vs[1].(string)]
	}).(LogpushOwnershipChallengeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushOwnershipChallengeInput)(nil)).Elem(), &LogpushOwnershipChallenge{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushOwnershipChallengeArrayInput)(nil)).Elem(), LogpushOwnershipChallengeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushOwnershipChallengeMapInput)(nil)).Elem(), LogpushOwnershipChallengeMap{})
	pulumi.RegisterOutputType(LogpushOwnershipChallengeOutput{})
	pulumi.RegisterOutputType(LogpushOwnershipChallengeArrayOutput{})
	pulumi.RegisterOutputType(LogpushOwnershipChallengeMapOutput{})
}
