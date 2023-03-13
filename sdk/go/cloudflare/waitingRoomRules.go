// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Cloudflare Waiting Room Rules resource.
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
//			_, err := cloudflare.NewWaitingRoomRules(ctx, "example", &cloudflare.WaitingRoomRulesArgs{
//				Rules: cloudflare.WaitingRoomRulesRuleArray{
//					&cloudflare.WaitingRoomRulesRuleArgs{
//						Action:      pulumi.String("bypass_waiting_room"),
//						Description: pulumi.String("bypass ip list"),
//						Expression:  pulumi.String("src.ip in {192.0.2.0 192.0.2.1}"),
//						Status:      pulumi.String("enabled"),
//					},
//					&cloudflare.WaitingRoomRulesRuleArgs{
//						Action:      pulumi.String("bypass_waiting_room"),
//						Description: pulumi.String("bypass query string"),
//						Expression:  pulumi.String("http.request.uri.query contains \"bypass=true\""),
//						Status:      pulumi.String("enabled"),
//					},
//				},
//				WaitingRoomId: pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
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
//	$ pulumi import cloudflare:index/waitingRoomRules:WaitingRoomRules default <zone_id>/<waiting_room_id>
//
// ```
type WaitingRoomRules struct {
	pulumi.CustomResourceState

	// List of rules to apply to the ruleset.
	Rules WaitingRoomRulesRuleArrayOutput `pulumi:"rules"`
	// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringOutput `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewWaitingRoomRules registers a new resource with the given unique name, arguments, and options.
func NewWaitingRoomRules(ctx *pulumi.Context,
	name string, args *WaitingRoomRulesArgs, opts ...pulumi.ResourceOption) (*WaitingRoomRules, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.WaitingRoomId == nil {
		return nil, errors.New("invalid value for required argument 'WaitingRoomId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource WaitingRoomRules
	err := ctx.RegisterResource("cloudflare:index/waitingRoomRules:WaitingRoomRules", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWaitingRoomRules gets an existing WaitingRoomRules resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWaitingRoomRules(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WaitingRoomRulesState, opts ...pulumi.ResourceOption) (*WaitingRoomRules, error) {
	var resource WaitingRoomRules
	err := ctx.ReadResource("cloudflare:index/waitingRoomRules:WaitingRoomRules", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WaitingRoomRules resources.
type waitingRoomRulesState struct {
	// List of rules to apply to the ruleset.
	Rules []WaitingRoomRulesRule `pulumi:"rules"`
	// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId *string `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type WaitingRoomRulesState struct {
	// List of rules to apply to the ruleset.
	Rules WaitingRoomRulesRuleArrayInput
	// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (WaitingRoomRulesState) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomRulesState)(nil)).Elem()
}

type waitingRoomRulesArgs struct {
	// List of rules to apply to the ruleset.
	Rules []WaitingRoomRulesRule `pulumi:"rules"`
	// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId string `pulumi:"waitingRoomId"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a WaitingRoomRules resource.
type WaitingRoomRulesArgs struct {
	// List of rules to apply to the ruleset.
	Rules WaitingRoomRulesRuleArrayInput
	// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
	WaitingRoomId pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (WaitingRoomRulesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*waitingRoomRulesArgs)(nil)).Elem()
}

type WaitingRoomRulesInput interface {
	pulumi.Input

	ToWaitingRoomRulesOutput() WaitingRoomRulesOutput
	ToWaitingRoomRulesOutputWithContext(ctx context.Context) WaitingRoomRulesOutput
}

func (*WaitingRoomRules) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomRules)(nil)).Elem()
}

func (i *WaitingRoomRules) ToWaitingRoomRulesOutput() WaitingRoomRulesOutput {
	return i.ToWaitingRoomRulesOutputWithContext(context.Background())
}

func (i *WaitingRoomRules) ToWaitingRoomRulesOutputWithContext(ctx context.Context) WaitingRoomRulesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomRulesOutput)
}

// WaitingRoomRulesArrayInput is an input type that accepts WaitingRoomRulesArray and WaitingRoomRulesArrayOutput values.
// You can construct a concrete instance of `WaitingRoomRulesArrayInput` via:
//
//	WaitingRoomRulesArray{ WaitingRoomRulesArgs{...} }
type WaitingRoomRulesArrayInput interface {
	pulumi.Input

	ToWaitingRoomRulesArrayOutput() WaitingRoomRulesArrayOutput
	ToWaitingRoomRulesArrayOutputWithContext(context.Context) WaitingRoomRulesArrayOutput
}

type WaitingRoomRulesArray []WaitingRoomRulesInput

func (WaitingRoomRulesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomRules)(nil)).Elem()
}

func (i WaitingRoomRulesArray) ToWaitingRoomRulesArrayOutput() WaitingRoomRulesArrayOutput {
	return i.ToWaitingRoomRulesArrayOutputWithContext(context.Background())
}

func (i WaitingRoomRulesArray) ToWaitingRoomRulesArrayOutputWithContext(ctx context.Context) WaitingRoomRulesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomRulesArrayOutput)
}

// WaitingRoomRulesMapInput is an input type that accepts WaitingRoomRulesMap and WaitingRoomRulesMapOutput values.
// You can construct a concrete instance of `WaitingRoomRulesMapInput` via:
//
//	WaitingRoomRulesMap{ "key": WaitingRoomRulesArgs{...} }
type WaitingRoomRulesMapInput interface {
	pulumi.Input

	ToWaitingRoomRulesMapOutput() WaitingRoomRulesMapOutput
	ToWaitingRoomRulesMapOutputWithContext(context.Context) WaitingRoomRulesMapOutput
}

type WaitingRoomRulesMap map[string]WaitingRoomRulesInput

func (WaitingRoomRulesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomRules)(nil)).Elem()
}

func (i WaitingRoomRulesMap) ToWaitingRoomRulesMapOutput() WaitingRoomRulesMapOutput {
	return i.ToWaitingRoomRulesMapOutputWithContext(context.Background())
}

func (i WaitingRoomRulesMap) ToWaitingRoomRulesMapOutputWithContext(ctx context.Context) WaitingRoomRulesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WaitingRoomRulesMapOutput)
}

type WaitingRoomRulesOutput struct{ *pulumi.OutputState }

func (WaitingRoomRulesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WaitingRoomRules)(nil)).Elem()
}

func (o WaitingRoomRulesOutput) ToWaitingRoomRulesOutput() WaitingRoomRulesOutput {
	return o
}

func (o WaitingRoomRulesOutput) ToWaitingRoomRulesOutputWithContext(ctx context.Context) WaitingRoomRulesOutput {
	return o
}

// List of rules to apply to the ruleset.
func (o WaitingRoomRulesOutput) Rules() WaitingRoomRulesRuleArrayOutput {
	return o.ApplyT(func(v *WaitingRoomRules) WaitingRoomRulesRuleArrayOutput { return v.Rules }).(WaitingRoomRulesRuleArrayOutput)
}

// The Waiting Room ID the rules should apply to. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomRulesOutput) WaitingRoomId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomRules) pulumi.StringOutput { return v.WaitingRoomId }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o WaitingRoomRulesOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *WaitingRoomRules) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type WaitingRoomRulesArrayOutput struct{ *pulumi.OutputState }

func (WaitingRoomRulesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WaitingRoomRules)(nil)).Elem()
}

func (o WaitingRoomRulesArrayOutput) ToWaitingRoomRulesArrayOutput() WaitingRoomRulesArrayOutput {
	return o
}

func (o WaitingRoomRulesArrayOutput) ToWaitingRoomRulesArrayOutputWithContext(ctx context.Context) WaitingRoomRulesArrayOutput {
	return o
}

func (o WaitingRoomRulesArrayOutput) Index(i pulumi.IntInput) WaitingRoomRulesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WaitingRoomRules {
		return vs[0].([]*WaitingRoomRules)[vs[1].(int)]
	}).(WaitingRoomRulesOutput)
}

type WaitingRoomRulesMapOutput struct{ *pulumi.OutputState }

func (WaitingRoomRulesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WaitingRoomRules)(nil)).Elem()
}

func (o WaitingRoomRulesMapOutput) ToWaitingRoomRulesMapOutput() WaitingRoomRulesMapOutput {
	return o
}

func (o WaitingRoomRulesMapOutput) ToWaitingRoomRulesMapOutputWithContext(ctx context.Context) WaitingRoomRulesMapOutput {
	return o
}

func (o WaitingRoomRulesMapOutput) MapIndex(k pulumi.StringInput) WaitingRoomRulesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WaitingRoomRules {
		return vs[0].(map[string]*WaitingRoomRules)[vs[1].(string)]
	}).(WaitingRoomRulesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomRulesInput)(nil)).Elem(), &WaitingRoomRules{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomRulesArrayInput)(nil)).Elem(), WaitingRoomRulesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WaitingRoomRulesMapInput)(nil)).Elem(), WaitingRoomRulesMap{})
	pulumi.RegisterOutputType(WaitingRoomRulesOutput{})
	pulumi.RegisterOutputType(WaitingRoomRulesArrayOutput{})
	pulumi.RegisterOutputType(WaitingRoomRulesMapOutput{})
}
