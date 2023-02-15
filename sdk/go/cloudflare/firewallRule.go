// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Define Firewall rules using filter expressions for more control over
// how traffic is matched to the rule. A filter expression permits
// selecting traffic by multiple criteria allowing greater freedom in
// rule creation.
//
// Filter expressions needs to be created first before using Firewall
// Rule.
//
// > If you want to configure Custom Firewall rules, you need to use
// `Ruleset`, because Custom Rules are built upon the
// [Cloudflare Ruleset Engine](https://developers.cloudflare.com/ruleset-engine/).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-cloudflare/sdk/v3/go/cloudflare"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			wordpressFilter, err := cloudflare.NewFilter(ctx, "wordpressFilter", &cloudflare.FilterArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Description: pulumi.String("Wordpress break-in attempts that are outside of the office"),
//				Expression:  pulumi.String("(http.request.uri.path ~ \".*wp-login.php\" or http.request.uri.path ~ \".*xmlrpc.php\") and ip.src ne 192.0.2.1"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewFirewallRule(ctx, "wordpressFirewallRule", &cloudflare.FirewallRuleArgs{
//				ZoneId:      pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				Description: pulumi.String("Block wordpress break-in attempts"),
//				FilterId:    wordpressFilter.ID(),
//				Action:      pulumi.String("block"),
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
//	$ pulumi import cloudflare:index/firewallRule:FirewallRule example <zone_id>/<firewall_rule_id>
//
// ```
type FirewallRule struct {
	pulumi.CustomResourceState

	// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
	Action pulumi.StringOutput `pulumi:"action"`
	// A description of the rule to help identify it.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
	FilterId pulumi.StringOutput `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused.
	Paused pulumi.BoolPtrOutput `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
	Products pulumi.StringArrayOutput `pulumi:"products"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewFirewallRule registers a new resource with the given unique name, arguments, and options.
func NewFirewallRule(ctx *pulumi.Context,
	name string, args *FirewallRuleArgs, opts ...pulumi.ResourceOption) (*FirewallRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.FilterId == nil {
		return nil, errors.New("invalid value for required argument 'FilterId'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource FirewallRule
	err := ctx.RegisterResource("cloudflare:index/firewallRule:FirewallRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFirewallRule gets an existing FirewallRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFirewallRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FirewallRuleState, opts ...pulumi.ResourceOption) (*FirewallRule, error) {
	var resource FirewallRule
	err := ctx.ReadResource("cloudflare:index/firewallRule:FirewallRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FirewallRule resources.
type firewallRuleState struct {
	// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
	Action *string `pulumi:"action"`
	// A description of the rule to help identify it.
	Description *string `pulumi:"description"`
	// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
	FilterId *string `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused.
	Paused *bool `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority *int `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
	Products []string `pulumi:"products"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type FirewallRuleState struct {
	// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
	Action pulumi.StringPtrInput
	// A description of the rule to help identify it.
	Description pulumi.StringPtrInput
	// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
	FilterId pulumi.StringPtrInput
	// Whether this filter based firewall rule is currently paused.
	Paused pulumi.BoolPtrInput
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrInput
	// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
	Products pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (FirewallRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallRuleState)(nil)).Elem()
}

type firewallRuleArgs struct {
	// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
	Action string `pulumi:"action"`
	// A description of the rule to help identify it.
	Description *string `pulumi:"description"`
	// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
	FilterId string `pulumi:"filterId"`
	// Whether this filter based firewall rule is currently paused.
	Paused *bool `pulumi:"paused"`
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority *int `pulumi:"priority"`
	// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
	Products []string `pulumi:"products"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a FirewallRule resource.
type FirewallRuleArgs struct {
	// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
	Action pulumi.StringInput
	// A description of the rule to help identify it.
	Description pulumi.StringPtrInput
	// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
	FilterId pulumi.StringInput
	// Whether this filter based firewall rule is currently paused.
	Paused pulumi.BoolPtrInput
	// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
	Priority pulumi.IntPtrInput
	// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
	Products pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (FirewallRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*firewallRuleArgs)(nil)).Elem()
}

type FirewallRuleInput interface {
	pulumi.Input

	ToFirewallRuleOutput() FirewallRuleOutput
	ToFirewallRuleOutputWithContext(ctx context.Context) FirewallRuleOutput
}

func (*FirewallRule) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallRule)(nil)).Elem()
}

func (i *FirewallRule) ToFirewallRuleOutput() FirewallRuleOutput {
	return i.ToFirewallRuleOutputWithContext(context.Background())
}

func (i *FirewallRule) ToFirewallRuleOutputWithContext(ctx context.Context) FirewallRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallRuleOutput)
}

// FirewallRuleArrayInput is an input type that accepts FirewallRuleArray and FirewallRuleArrayOutput values.
// You can construct a concrete instance of `FirewallRuleArrayInput` via:
//
//	FirewallRuleArray{ FirewallRuleArgs{...} }
type FirewallRuleArrayInput interface {
	pulumi.Input

	ToFirewallRuleArrayOutput() FirewallRuleArrayOutput
	ToFirewallRuleArrayOutputWithContext(context.Context) FirewallRuleArrayOutput
}

type FirewallRuleArray []FirewallRuleInput

func (FirewallRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallRule)(nil)).Elem()
}

func (i FirewallRuleArray) ToFirewallRuleArrayOutput() FirewallRuleArrayOutput {
	return i.ToFirewallRuleArrayOutputWithContext(context.Background())
}

func (i FirewallRuleArray) ToFirewallRuleArrayOutputWithContext(ctx context.Context) FirewallRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallRuleArrayOutput)
}

// FirewallRuleMapInput is an input type that accepts FirewallRuleMap and FirewallRuleMapOutput values.
// You can construct a concrete instance of `FirewallRuleMapInput` via:
//
//	FirewallRuleMap{ "key": FirewallRuleArgs{...} }
type FirewallRuleMapInput interface {
	pulumi.Input

	ToFirewallRuleMapOutput() FirewallRuleMapOutput
	ToFirewallRuleMapOutputWithContext(context.Context) FirewallRuleMapOutput
}

type FirewallRuleMap map[string]FirewallRuleInput

func (FirewallRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallRule)(nil)).Elem()
}

func (i FirewallRuleMap) ToFirewallRuleMapOutput() FirewallRuleMapOutput {
	return i.ToFirewallRuleMapOutputWithContext(context.Background())
}

func (i FirewallRuleMap) ToFirewallRuleMapOutputWithContext(ctx context.Context) FirewallRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FirewallRuleMapOutput)
}

type FirewallRuleOutput struct{ *pulumi.OutputState }

func (FirewallRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FirewallRule)(nil)).Elem()
}

func (o FirewallRuleOutput) ToFirewallRuleOutput() FirewallRuleOutput {
	return o
}

func (o FirewallRuleOutput) ToFirewallRuleOutputWithContext(ctx context.Context) FirewallRuleOutput {
	return o
}

// The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `jsChallenge`, `managedChallenge`, `log`, `bypass`.
func (o FirewallRuleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// A description of the rule to help identify it.
func (o FirewallRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
func (o FirewallRuleOutput) FilterId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.StringOutput { return v.FilterId }).(pulumi.StringOutput)
}

// Whether this filter based firewall rule is currently paused.
func (o FirewallRuleOutput) Paused() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.BoolPtrOutput { return v.Paused }).(pulumi.BoolPtrOutput)
}

// The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
func (o FirewallRuleOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
func (o FirewallRuleOutput) Products() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.StringArrayOutput { return v.Products }).(pulumi.StringArrayOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o FirewallRuleOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *FirewallRule) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type FirewallRuleArrayOutput struct{ *pulumi.OutputState }

func (FirewallRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FirewallRule)(nil)).Elem()
}

func (o FirewallRuleArrayOutput) ToFirewallRuleArrayOutput() FirewallRuleArrayOutput {
	return o
}

func (o FirewallRuleArrayOutput) ToFirewallRuleArrayOutputWithContext(ctx context.Context) FirewallRuleArrayOutput {
	return o
}

func (o FirewallRuleArrayOutput) Index(i pulumi.IntInput) FirewallRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FirewallRule {
		return vs[0].([]*FirewallRule)[vs[1].(int)]
	}).(FirewallRuleOutput)
}

type FirewallRuleMapOutput struct{ *pulumi.OutputState }

func (FirewallRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FirewallRule)(nil)).Elem()
}

func (o FirewallRuleMapOutput) ToFirewallRuleMapOutput() FirewallRuleMapOutput {
	return o
}

func (o FirewallRuleMapOutput) ToFirewallRuleMapOutputWithContext(ctx context.Context) FirewallRuleMapOutput {
	return o
}

func (o FirewallRuleMapOutput) MapIndex(k pulumi.StringInput) FirewallRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FirewallRule {
		return vs[0].(map[string]*FirewallRule)[vs[1].(string)]
	}).(FirewallRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallRuleInput)(nil)).Elem(), &FirewallRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallRuleArrayInput)(nil)).Elem(), FirewallRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FirewallRuleMapInput)(nil)).Elem(), FirewallRuleMap{})
	pulumi.RegisterOutputType(FirewallRuleOutput{})
	pulumi.RegisterOutputType(FirewallRuleArrayOutput{})
	pulumi.RegisterOutputType(FirewallRuleMapOutput{})
}
