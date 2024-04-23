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

// Provides a Cloudflare Teams rule resource. Teams rules comprise secure web gateway policies.
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
//			_, err := cloudflare.NewTeamsRule(ctx, "example", &cloudflare.TeamsRuleArgs{
//				AccountId:   pulumi.String("f037e56e89293a057740de681ac9abbe"),
//				Name:        pulumi.String("office"),
//				Description: pulumi.String("desc"),
//				Precedence:  pulumi.Int(1),
//				Action:      pulumi.String("block"),
//				Filters: pulumi.StringArray{
//					pulumi.String("http"),
//				},
//				Traffic: pulumi.String("http.request.uri == \"https://www.example.com/malicious\""),
//				RuleSettings: &cloudflare.TeamsRuleRuleSettingsArgs{
//					BlockPageEnabled: pulumi.Bool(true),
//					BlockPageReason:  pulumi.String("access not permitted"),
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
// $ pulumi import cloudflare:index/teamsRule:TeamsRule example <account_id>/<teams_rule_id>
// ```
type TeamsRule struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
	Action pulumi.StringOutput `pulumi:"action"`
	// The description of the teams rule.
	Description pulumi.StringOutput `pulumi:"description"`
	// The wirefilter expression to be used for devicePosture check matching.
	DevicePosture pulumi.StringPtrOutput `pulumi:"devicePosture"`
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayOutput `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrOutput `pulumi:"identity"`
	// The name of the teams rule.
	Name pulumi.StringOutput `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntOutput `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrOutput `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrOutput `pulumi:"traffic"`
	Version pulumi.IntOutput       `pulumi:"version"`
}

// NewTeamsRule registers a new resource with the given unique name, arguments, and options.
func NewTeamsRule(ctx *pulumi.Context,
	name string, args *TeamsRuleArgs, opts ...pulumi.ResourceOption) (*TeamsRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Precedence == nil {
		return nil, errors.New("invalid value for required argument 'Precedence'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TeamsRule
	err := ctx.RegisterResource("cloudflare:index/teamsRule:TeamsRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamsRule gets an existing TeamsRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamsRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamsRuleState, opts ...pulumi.ResourceOption) (*TeamsRule, error) {
	var resource TeamsRule
	err := ctx.ReadResource("cloudflare:index/teamsRule:TeamsRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamsRule resources.
type teamsRuleState struct {
	// The account identifier to target for the resource.
	AccountId *string `pulumi:"accountId"`
	// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
	Action *string `pulumi:"action"`
	// The description of the teams rule.
	Description *string `pulumi:"description"`
	// The wirefilter expression to be used for devicePosture check matching.
	DevicePosture *string `pulumi:"devicePosture"`
	// Indicator of rule enablement.
	Enabled *bool `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters []string `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity *string `pulumi:"identity"`
	// The name of the teams rule.
	Name *string `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence *int `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings *TeamsRuleRuleSettings `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic *string `pulumi:"traffic"`
	Version *int    `pulumi:"version"`
}

type TeamsRuleState struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringPtrInput
	// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
	Action pulumi.StringPtrInput
	// The description of the teams rule.
	Description pulumi.StringPtrInput
	// The wirefilter expression to be used for devicePosture check matching.
	DevicePosture pulumi.StringPtrInput
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrInput
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayInput
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrInput
	// The name of the teams rule.
	Name pulumi.StringPtrInput
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntPtrInput
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrInput
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrInput
	Version pulumi.IntPtrInput
}

func (TeamsRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsRuleState)(nil)).Elem()
}

type teamsRuleArgs struct {
	// The account identifier to target for the resource.
	AccountId string `pulumi:"accountId"`
	// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
	Action string `pulumi:"action"`
	// The description of the teams rule.
	Description string `pulumi:"description"`
	// The wirefilter expression to be used for devicePosture check matching.
	DevicePosture *string `pulumi:"devicePosture"`
	// Indicator of rule enablement.
	Enabled *bool `pulumi:"enabled"`
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters []string `pulumi:"filters"`
	// The wirefilter expression to be used for identity matching.
	Identity *string `pulumi:"identity"`
	// The name of the teams rule.
	Name string `pulumi:"name"`
	// The evaluation precedence of the teams rule.
	Precedence int `pulumi:"precedence"`
	// Additional rule settings.
	RuleSettings *TeamsRuleRuleSettings `pulumi:"ruleSettings"`
	// The wirefilter expression to be used for traffic matching.
	Traffic *string `pulumi:"traffic"`
}

// The set of arguments for constructing a TeamsRule resource.
type TeamsRuleArgs struct {
	// The account identifier to target for the resource.
	AccountId pulumi.StringInput
	// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
	Action pulumi.StringInput
	// The description of the teams rule.
	Description pulumi.StringInput
	// The wirefilter expression to be used for devicePosture check matching.
	DevicePosture pulumi.StringPtrInput
	// Indicator of rule enablement.
	Enabled pulumi.BoolPtrInput
	// The protocol or layer to evaluate the traffic and identity expressions.
	Filters pulumi.StringArrayInput
	// The wirefilter expression to be used for identity matching.
	Identity pulumi.StringPtrInput
	// The name of the teams rule.
	Name pulumi.StringInput
	// The evaluation precedence of the teams rule.
	Precedence pulumi.IntInput
	// Additional rule settings.
	RuleSettings TeamsRuleRuleSettingsPtrInput
	// The wirefilter expression to be used for traffic matching.
	Traffic pulumi.StringPtrInput
}

func (TeamsRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamsRuleArgs)(nil)).Elem()
}

type TeamsRuleInput interface {
	pulumi.Input

	ToTeamsRuleOutput() TeamsRuleOutput
	ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput
}

func (*TeamsRule) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsRule)(nil)).Elem()
}

func (i *TeamsRule) ToTeamsRuleOutput() TeamsRuleOutput {
	return i.ToTeamsRuleOutputWithContext(context.Background())
}

func (i *TeamsRule) ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleOutput)
}

// TeamsRuleArrayInput is an input type that accepts TeamsRuleArray and TeamsRuleArrayOutput values.
// You can construct a concrete instance of `TeamsRuleArrayInput` via:
//
//	TeamsRuleArray{ TeamsRuleArgs{...} }
type TeamsRuleArrayInput interface {
	pulumi.Input

	ToTeamsRuleArrayOutput() TeamsRuleArrayOutput
	ToTeamsRuleArrayOutputWithContext(context.Context) TeamsRuleArrayOutput
}

type TeamsRuleArray []TeamsRuleInput

func (TeamsRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsRule)(nil)).Elem()
}

func (i TeamsRuleArray) ToTeamsRuleArrayOutput() TeamsRuleArrayOutput {
	return i.ToTeamsRuleArrayOutputWithContext(context.Background())
}

func (i TeamsRuleArray) ToTeamsRuleArrayOutputWithContext(ctx context.Context) TeamsRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleArrayOutput)
}

// TeamsRuleMapInput is an input type that accepts TeamsRuleMap and TeamsRuleMapOutput values.
// You can construct a concrete instance of `TeamsRuleMapInput` via:
//
//	TeamsRuleMap{ "key": TeamsRuleArgs{...} }
type TeamsRuleMapInput interface {
	pulumi.Input

	ToTeamsRuleMapOutput() TeamsRuleMapOutput
	ToTeamsRuleMapOutputWithContext(context.Context) TeamsRuleMapOutput
}

type TeamsRuleMap map[string]TeamsRuleInput

func (TeamsRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsRule)(nil)).Elem()
}

func (i TeamsRuleMap) ToTeamsRuleMapOutput() TeamsRuleMapOutput {
	return i.ToTeamsRuleMapOutputWithContext(context.Background())
}

func (i TeamsRuleMap) ToTeamsRuleMapOutputWithContext(ctx context.Context) TeamsRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamsRuleMapOutput)
}

type TeamsRuleOutput struct{ *pulumi.OutputState }

func (TeamsRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamsRule)(nil)).Elem()
}

func (o TeamsRuleOutput) ToTeamsRuleOutput() TeamsRuleOutput {
	return o
}

func (o TeamsRuleOutput) ToTeamsRuleOutputWithContext(ctx context.Context) TeamsRuleOutput {
	return o
}

// The account identifier to target for the resource.
func (o TeamsRuleOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The action executed by matched teams rule. Available values: `allow`, `block`, `safesearch`, `ytrestricted`, `on`, `off`, `scan`, `noscan`, `isolate`, `noisolate`, `override`, `l4Override`, `egress`, `auditSsh`, `resolve`.
func (o TeamsRuleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// The description of the teams rule.
func (o TeamsRuleOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// The wirefilter expression to be used for devicePosture check matching.
func (o TeamsRuleOutput) DevicePosture() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringPtrOutput { return v.DevicePosture }).(pulumi.StringPtrOutput)
}

// Indicator of rule enablement.
func (o TeamsRuleOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The protocol or layer to evaluate the traffic and identity expressions.
func (o TeamsRuleOutput) Filters() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringArrayOutput { return v.Filters }).(pulumi.StringArrayOutput)
}

// The wirefilter expression to be used for identity matching.
func (o TeamsRuleOutput) Identity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringPtrOutput { return v.Identity }).(pulumi.StringPtrOutput)
}

// The name of the teams rule.
func (o TeamsRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The evaluation precedence of the teams rule.
func (o TeamsRuleOutput) Precedence() pulumi.IntOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.IntOutput { return v.Precedence }).(pulumi.IntOutput)
}

// Additional rule settings.
func (o TeamsRuleOutput) RuleSettings() TeamsRuleRuleSettingsPtrOutput {
	return o.ApplyT(func(v *TeamsRule) TeamsRuleRuleSettingsPtrOutput { return v.RuleSettings }).(TeamsRuleRuleSettingsPtrOutput)
}

// The wirefilter expression to be used for traffic matching.
func (o TeamsRuleOutput) Traffic() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.StringPtrOutput { return v.Traffic }).(pulumi.StringPtrOutput)
}

func (o TeamsRuleOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *TeamsRule) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type TeamsRuleArrayOutput struct{ *pulumi.OutputState }

func (TeamsRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamsRule)(nil)).Elem()
}

func (o TeamsRuleArrayOutput) ToTeamsRuleArrayOutput() TeamsRuleArrayOutput {
	return o
}

func (o TeamsRuleArrayOutput) ToTeamsRuleArrayOutputWithContext(ctx context.Context) TeamsRuleArrayOutput {
	return o
}

func (o TeamsRuleArrayOutput) Index(i pulumi.IntInput) TeamsRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamsRule {
		return vs[0].([]*TeamsRule)[vs[1].(int)]
	}).(TeamsRuleOutput)
}

type TeamsRuleMapOutput struct{ *pulumi.OutputState }

func (TeamsRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamsRule)(nil)).Elem()
}

func (o TeamsRuleMapOutput) ToTeamsRuleMapOutput() TeamsRuleMapOutput {
	return o
}

func (o TeamsRuleMapOutput) ToTeamsRuleMapOutputWithContext(ctx context.Context) TeamsRuleMapOutput {
	return o
}

func (o TeamsRuleMapOutput) MapIndex(k pulumi.StringInput) TeamsRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamsRule {
		return vs[0].(map[string]*TeamsRule)[vs[1].(string)]
	}).(TeamsRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsRuleInput)(nil)).Elem(), &TeamsRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsRuleArrayInput)(nil)).Elem(), TeamsRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamsRuleMapInput)(nil)).Elem(), TeamsRuleMap{})
	pulumi.RegisterOutputType(TeamsRuleOutput{})
	pulumi.RegisterOutputType(TeamsRuleArrayOutput{})
	pulumi.RegisterOutputType(TeamsRuleMapOutput{})
}
