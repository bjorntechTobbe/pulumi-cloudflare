// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-cloudflare/sdk/v4/go/cloudflare"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloudflare.NewRuleset(ctx, "magicTransitExample", &cloudflare.RulesetArgs{
// 			AccountId:   pulumi.String("d41d8cd98f00b204e9800998ecf8427e"),
// 			Description: pulumi.String("example magic transit ruleset description"),
// 			Kind:        pulumi.String("root"),
// 			Name:        pulumi.String("account magic transit"),
// 			Phase:       pulumi.String("magic_transit"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action:      pulumi.String("allow"),
// 					Description: pulumi.String("Allow TCP Ephemeral Ports"),
// 					Expression:  pulumi.String("tcp.dstport in { 32768..65535 }"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "zoneLevelManagedWaf", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("managed WAF ruleset description"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("managed WAF"),
// 			Phase:       pulumi.String("http_request_firewall_managed"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action: pulumi.String("execute"),
// 					ActionParameters: &RulesetRuleActionParametersArgs{
// 						Id: pulumi.String("efb7b8c949ac4650a09736fc376e9aee"),
// 					},
// 					Description: pulumi.String("Execute Cloudflare Managed Ruleset on my zone-level phase entry point ruleset"),
// 					Enabled:     pulumi.Bool(true),
// 					Expression:  pulumi.String("true"),
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "zoneLevelManagedWafWithCategoryBasedOverrides", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("managed WAF with tag-based overrides ruleset description"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("managed WAF with tag-based overrides"),
// 			Phase:       pulumi.String("http_request_firewall_managed"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action: pulumi.String("execute"),
// 					ActionParameters: &RulesetRuleActionParametersArgs{
// 						Id: pulumi.String("efb7b8c949ac4650a09736fc376e9aee"),
// 						Overrides: &RulesetRuleActionParametersOverridesArgs{
// 							Categories: RulesetRuleActionParametersOverridesCategoryArray{
// 								&RulesetRuleActionParametersOverridesCategoryArgs{
// 									Action:   pulumi.String("block"),
// 									Category: pulumi.String("wordpress"),
// 									Enabled:  pulumi.Bool(true),
// 								},
// 								&RulesetRuleActionParametersOverridesCategoryArgs{
// 									Action:   pulumi.String("block"),
// 									Category: pulumi.String("joomla"),
// 									Enabled:  pulumi.Bool(true),
// 								},
// 							},
// 						},
// 					},
// 					Description: pulumi.String("overrides to only enable wordpress rules to block"),
// 					Enabled:     pulumi.Bool(false),
// 					Expression:  pulumi.String("true"),
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "transformUriRulePath", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("change the URI path to a new static path"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("transform rule for URI path"),
// 			Phase:       pulumi.String("http_request_transform"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action: pulumi.String("rewrite"),
// 					ActionParameters: &RulesetRuleActionParametersArgs{
// 						Uri: &RulesetRuleActionParametersUriArgs{
// 							Path: &RulesetRuleActionParametersUriPathArgs{
// 								Value: pulumi.String("/my-new-route"),
// 							},
// 						},
// 					},
// 					Description: pulumi.String("example URI path transform rule"),
// 					Enabled:     pulumi.Bool(true),
// 					Expression:  pulumi.String("(http.host eq \"example.com\" and http.request.uri.path eq \"/old-path\")"),
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "transformUriRuleQuery", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("change the URI query to a new static query"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("transform rule for URI query parameter"),
// 			Phase:       pulumi.String("http_request_transform"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action: pulumi.String("rewrite"),
// 					ActionParameters: &RulesetRuleActionParametersArgs{
// 						Uri: &RulesetRuleActionParametersUriArgs{
// 							Query: &RulesetRuleActionParametersUriQueryArgs{
// 								Value: pulumi.String("old=new_again"),
// 							},
// 						},
// 					},
// 					Description: pulumi.String("URI transformation query example"),
// 					Enabled:     pulumi.Bool(true),
// 					Expression:  pulumi.String("true"),
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "transformUriHttpHeaders", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("modify HTTP headers before reaching origin"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("transform rule for HTTP headers"),
// 			Phase:       pulumi.String("http_request_late_transform"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action: pulumi.String("rewrite"),
// 					ActionParameters: &RulesetRuleActionParametersArgs{
// 						Headers: RulesetRuleActionParametersHeaderArray{
// 							&RulesetRuleActionParametersHeaderArgs{
// 								Name:      pulumi.String("example-http-header-1"),
// 								Operation: pulumi.String("set"),
// 								Value:     pulumi.String("my-http-header-value-1"),
// 							},
// 							&RulesetRuleActionParametersHeaderArgs{
// 								Expression: pulumi.String("cf.zone.name"),
// 								Name:       pulumi.String("example-http-header-2"),
// 								Operation:  pulumi.String("set"),
// 							},
// 							&RulesetRuleActionParametersHeaderArgs{
// 								Name:      pulumi.String("example-http-header-3-to-remove"),
// 								Operation: pulumi.String("remove"),
// 							},
// 						},
// 					},
// 					Description: pulumi.String("example request header transform rule"),
// 					Enabled:     pulumi.Bool(false),
// 					Expression:  pulumi.String("true"),
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = cloudflare.NewRuleset(ctx, "rateLimitingExample", &cloudflare.RulesetArgs{
// 			Description: pulumi.String("apply HTTP rate limiting for a route"),
// 			Kind:        pulumi.String("zone"),
// 			Name:        pulumi.String("restrict API requests count"),
// 			Phase:       pulumi.String("http_ratelimit"),
// 			Rules: RulesetRuleArray{
// 				&RulesetRuleArgs{
// 					Action:      pulumi.String("block"),
// 					Description: pulumi.String("rate limit for API"),
// 					Enabled:     pulumi.Bool(true),
// 					Expression:  pulumi.String("(http.request.uri.path matches \"^/api/\")"),
// 					Ratelimit: &RulesetRuleRatelimitArgs{
// 						Characteristics: pulumi.StringArray{
// 							pulumi.String("cf.colo.id"),
// 							pulumi.String("ip.src"),
// 						},
// 						MitigationTimeout: pulumi.Int(600),
// 						Period:            pulumi.Int(60),
// 						RequestsPerPeriod: pulumi.Int(100),
// 					},
// 				},
// 			},
// 			ZoneId: pulumi.String("cb029e245cfdd66dc8d2e570d5dd3322"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Currently, you cannot import rulesets.
type Ruleset struct {
	pulumi.CustomResourceState

	// The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// Brief summary of the ruleset rule and its intended use.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
	Kind pulumi.StringOutput `pulumi:"kind"`
	// Name of the HTTP request header to target.
	Name pulumi.StringOutput `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpResponseHeadersTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
	Phase pulumi.StringOutput `pulumi:"phase"`
	// List of rule-based overrides (refer to the nested schema).
	Rules RulesetRuleArrayOutput `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrOutput `pulumi:"shareableEntitlementName"`
	// The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewRuleset registers a new resource with the given unique name, arguments, and options.
func NewRuleset(ctx *pulumi.Context,
	name string, args *RulesetArgs, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Kind == nil {
		return nil, errors.New("invalid value for required argument 'Kind'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Phase == nil {
		return nil, errors.New("invalid value for required argument 'Phase'")
	}
	var resource Ruleset
	err := ctx.RegisterResource("cloudflare:index/ruleset:Ruleset", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleset gets an existing Ruleset resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleset(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RulesetState, opts ...pulumi.ResourceOption) (*Ruleset, error) {
	var resource Ruleset
	err := ctx.ReadResource("cloudflare:index/ruleset:Ruleset", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Ruleset resources.
type rulesetState struct {
	// The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
	AccountId *string `pulumi:"accountId"`
	// Brief summary of the ruleset rule and its intended use.
	Description *string `pulumi:"description"`
	// Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
	Kind *string `pulumi:"kind"`
	// Name of the HTTP request header to target.
	Name *string `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpResponseHeadersTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
	Phase *string `pulumi:"phase"`
	// List of rule-based overrides (refer to the nested schema).
	Rules []RulesetRule `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName *string `pulumi:"shareableEntitlementName"`
	// The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
	ZoneId *string `pulumi:"zoneId"`
}

type RulesetState struct {
	// The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
	AccountId pulumi.StringPtrInput
	// Brief summary of the ruleset rule and its intended use.
	Description pulumi.StringPtrInput
	// Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
	Kind pulumi.StringPtrInput
	// Name of the HTTP request header to target.
	Name pulumi.StringPtrInput
	// Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpResponseHeadersTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
	Phase pulumi.StringPtrInput
	// List of rule-based overrides (refer to the nested schema).
	Rules RulesetRuleArrayInput
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrInput
	// The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
	ZoneId pulumi.StringPtrInput
}

func (RulesetState) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetState)(nil)).Elem()
}

type rulesetArgs struct {
	// The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
	AccountId *string `pulumi:"accountId"`
	// Brief summary of the ruleset rule and its intended use.
	Description *string `pulumi:"description"`
	// Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
	Kind string `pulumi:"kind"`
	// Name of the HTTP request header to target.
	Name string `pulumi:"name"`
	// Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpResponseHeadersTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
	Phase string `pulumi:"phase"`
	// List of rule-based overrides (refer to the nested schema).
	Rules []RulesetRule `pulumi:"rules"`
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName *string `pulumi:"shareableEntitlementName"`
	// The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Ruleset resource.
type RulesetArgs struct {
	// The ID of the account where the ruleset is being created. Conflicts with `"zoneId"`.
	AccountId pulumi.StringPtrInput
	// Brief summary of the ruleset rule and its intended use.
	Description pulumi.StringPtrInput
	// Type of Ruleset to create. Valid values are `"custom"`, `"managed"`, `"root"`, `"schema"` or `"zone"`.
	Kind pulumi.StringInput
	// Name of the HTTP request header to target.
	Name pulumi.StringInput
	// Point in the request/response lifecycle where the ruleset will be created. Valid values are `"ddosL4"`, `"ddosL7"`, `"httpRequestFirewallCustom"`, `"httpRequestFirewallManaged"`, `"httpRequestLateTransform"`, `"httpResponseHeadersTransform"`, `"httpRequestMain"`, `"httpRequestSanitize"`, `"httpRequestTransform"`, `"httpResponseFirewallManaged"`, `"magicTransit"`, or `"httpRatelimit"`.
	Phase pulumi.StringInput
	// List of rule-based overrides (refer to the nested schema).
	Rules RulesetRuleArrayInput
	// Name of entitlement that is shareable between entities.
	ShareableEntitlementName pulumi.StringPtrInput
	// The ID of the zone where the ruleset is being created. Conflicts with `"accountId"`.
	ZoneId pulumi.StringPtrInput
}

func (RulesetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rulesetArgs)(nil)).Elem()
}

type RulesetInput interface {
	pulumi.Input

	ToRulesetOutput() RulesetOutput
	ToRulesetOutputWithContext(ctx context.Context) RulesetOutput
}

func (*Ruleset) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (i *Ruleset) ToRulesetOutput() RulesetOutput {
	return i.ToRulesetOutputWithContext(context.Background())
}

func (i *Ruleset) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetOutput)
}

// RulesetArrayInput is an input type that accepts RulesetArray and RulesetArrayOutput values.
// You can construct a concrete instance of `RulesetArrayInput` via:
//
//          RulesetArray{ RulesetArgs{...} }
type RulesetArrayInput interface {
	pulumi.Input

	ToRulesetArrayOutput() RulesetArrayOutput
	ToRulesetArrayOutputWithContext(context.Context) RulesetArrayOutput
}

type RulesetArray []RulesetInput

func (RulesetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (i RulesetArray) ToRulesetArrayOutput() RulesetArrayOutput {
	return i.ToRulesetArrayOutputWithContext(context.Background())
}

func (i RulesetArray) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetArrayOutput)
}

// RulesetMapInput is an input type that accepts RulesetMap and RulesetMapOutput values.
// You can construct a concrete instance of `RulesetMapInput` via:
//
//          RulesetMap{ "key": RulesetArgs{...} }
type RulesetMapInput interface {
	pulumi.Input

	ToRulesetMapOutput() RulesetMapOutput
	ToRulesetMapOutputWithContext(context.Context) RulesetMapOutput
}

type RulesetMap map[string]RulesetInput

func (RulesetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (i RulesetMap) ToRulesetMapOutput() RulesetMapOutput {
	return i.ToRulesetMapOutputWithContext(context.Background())
}

func (i RulesetMap) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RulesetMapOutput)
}

type RulesetOutput struct{ *pulumi.OutputState }

func (RulesetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Ruleset)(nil)).Elem()
}

func (o RulesetOutput) ToRulesetOutput() RulesetOutput {
	return o
}

func (o RulesetOutput) ToRulesetOutputWithContext(ctx context.Context) RulesetOutput {
	return o
}

type RulesetArrayOutput struct{ *pulumi.OutputState }

func (RulesetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Ruleset)(nil)).Elem()
}

func (o RulesetArrayOutput) ToRulesetArrayOutput() RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) ToRulesetArrayOutputWithContext(ctx context.Context) RulesetArrayOutput {
	return o
}

func (o RulesetArrayOutput) Index(i pulumi.IntInput) RulesetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].([]*Ruleset)[vs[1].(int)]
	}).(RulesetOutput)
}

type RulesetMapOutput struct{ *pulumi.OutputState }

func (RulesetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Ruleset)(nil)).Elem()
}

func (o RulesetMapOutput) ToRulesetMapOutput() RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) ToRulesetMapOutputWithContext(ctx context.Context) RulesetMapOutput {
	return o
}

func (o RulesetMapOutput) MapIndex(k pulumi.StringInput) RulesetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Ruleset {
		return vs[0].(map[string]*Ruleset)[vs[1].(string)]
	}).(RulesetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetInput)(nil)).Elem(), &Ruleset{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetArrayInput)(nil)).Elem(), RulesetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RulesetMapInput)(nil)).Elem(), RulesetMap{})
	pulumi.RegisterOutputType(RulesetOutput{})
	pulumi.RegisterOutputType(RulesetArrayOutput{})
	pulumi.RegisterOutputType(RulesetMapOutput{})
}
