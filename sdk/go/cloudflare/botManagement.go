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

// Provides a resource to configure Bot Management.
//
// Specifically, this resource can be used to manage:
//
// - **Bot Fight Mode**
// - **Super Bot Fight Mode**
// - **Bot Management for Enterprise**
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
//			_, err := cloudflare.NewBotManagement(ctx, "example", &cloudflare.BotManagementArgs{
//				ZoneId:                       pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//				EnableJs:                     pulumi.Bool(true),
//				SbfmDefinitelyAutomated:      pulumi.String("block"),
//				SbfmLikelyAutomated:          pulumi.String("managed_challenge"),
//				SbfmVerifiedBots:             pulumi.String("allow"),
//				SbfmStaticResourceProtection: pulumi.Bool(false),
//				OptimizeWordpress:            pulumi.Bool(true),
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
// $ pulumi import cloudflare:index/botManagement:BotManagement example <zone_id>
// ```
type BotManagement struct {
	pulumi.CustomResourceState

	// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
	AutoUpdateModel pulumi.BoolPtrOutput `pulumi:"autoUpdateModel"`
	// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
	EnableJs pulumi.BoolPtrOutput `pulumi:"enableJs"`
	// Whether to enable Bot Fight Mode.
	FightMode pulumi.BoolPtrOutput `pulumi:"fightMode"`
	// Whether to optimize Super Bot Fight Mode protections for Wordpress.
	OptimizeWordpress pulumi.BoolPtrOutput `pulumi:"optimizeWordpress"`
	// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
	SbfmDefinitelyAutomated pulumi.StringPtrOutput `pulumi:"sbfmDefinitelyAutomated"`
	// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
	SbfmLikelyAutomated pulumi.StringPtrOutput `pulumi:"sbfmLikelyAutomated"`
	// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
	SbfmStaticResourceProtection pulumi.BoolPtrOutput `pulumi:"sbfmStaticResourceProtection"`
	// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
	SbfmVerifiedBots pulumi.StringPtrOutput `pulumi:"sbfmVerifiedBots"`
	// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
	SuppressSessionScore pulumi.BoolPtrOutput `pulumi:"suppressSessionScore"`
	// A read-only field that indicates whether the zone currently is running the latest ML model.
	UsingLatestModel pulumi.BoolOutput `pulumi:"usingLatestModel"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewBotManagement registers a new resource with the given unique name, arguments, and options.
func NewBotManagement(ctx *pulumi.Context,
	name string, args *BotManagementArgs, opts ...pulumi.ResourceOption) (*BotManagement, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BotManagement
	err := ctx.RegisterResource("cloudflare:index/botManagement:BotManagement", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBotManagement gets an existing BotManagement resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBotManagement(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BotManagementState, opts ...pulumi.ResourceOption) (*BotManagement, error) {
	var resource BotManagement
	err := ctx.ReadResource("cloudflare:index/botManagement:BotManagement", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BotManagement resources.
type botManagementState struct {
	// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
	AutoUpdateModel *bool `pulumi:"autoUpdateModel"`
	// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
	EnableJs *bool `pulumi:"enableJs"`
	// Whether to enable Bot Fight Mode.
	FightMode *bool `pulumi:"fightMode"`
	// Whether to optimize Super Bot Fight Mode protections for Wordpress.
	OptimizeWordpress *bool `pulumi:"optimizeWordpress"`
	// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
	SbfmDefinitelyAutomated *string `pulumi:"sbfmDefinitelyAutomated"`
	// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
	SbfmLikelyAutomated *string `pulumi:"sbfmLikelyAutomated"`
	// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
	SbfmStaticResourceProtection *bool `pulumi:"sbfmStaticResourceProtection"`
	// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
	SbfmVerifiedBots *string `pulumi:"sbfmVerifiedBots"`
	// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
	SuppressSessionScore *bool `pulumi:"suppressSessionScore"`
	// A read-only field that indicates whether the zone currently is running the latest ML model.
	UsingLatestModel *bool `pulumi:"usingLatestModel"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type BotManagementState struct {
	// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
	AutoUpdateModel pulumi.BoolPtrInput
	// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
	EnableJs pulumi.BoolPtrInput
	// Whether to enable Bot Fight Mode.
	FightMode pulumi.BoolPtrInput
	// Whether to optimize Super Bot Fight Mode protections for Wordpress.
	OptimizeWordpress pulumi.BoolPtrInput
	// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
	SbfmDefinitelyAutomated pulumi.StringPtrInput
	// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
	SbfmLikelyAutomated pulumi.StringPtrInput
	// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
	SbfmStaticResourceProtection pulumi.BoolPtrInput
	// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
	SbfmVerifiedBots pulumi.StringPtrInput
	// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
	SuppressSessionScore pulumi.BoolPtrInput
	// A read-only field that indicates whether the zone currently is running the latest ML model.
	UsingLatestModel pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (BotManagementState) ElementType() reflect.Type {
	return reflect.TypeOf((*botManagementState)(nil)).Elem()
}

type botManagementArgs struct {
	// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
	AutoUpdateModel *bool `pulumi:"autoUpdateModel"`
	// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
	EnableJs *bool `pulumi:"enableJs"`
	// Whether to enable Bot Fight Mode.
	FightMode *bool `pulumi:"fightMode"`
	// Whether to optimize Super Bot Fight Mode protections for Wordpress.
	OptimizeWordpress *bool `pulumi:"optimizeWordpress"`
	// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
	SbfmDefinitelyAutomated *string `pulumi:"sbfmDefinitelyAutomated"`
	// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
	SbfmLikelyAutomated *string `pulumi:"sbfmLikelyAutomated"`
	// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
	SbfmStaticResourceProtection *bool `pulumi:"sbfmStaticResourceProtection"`
	// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
	SbfmVerifiedBots *string `pulumi:"sbfmVerifiedBots"`
	// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
	SuppressSessionScore *bool `pulumi:"suppressSessionScore"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a BotManagement resource.
type BotManagementArgs struct {
	// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
	AutoUpdateModel pulumi.BoolPtrInput
	// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
	EnableJs pulumi.BoolPtrInput
	// Whether to enable Bot Fight Mode.
	FightMode pulumi.BoolPtrInput
	// Whether to optimize Super Bot Fight Mode protections for Wordpress.
	OptimizeWordpress pulumi.BoolPtrInput
	// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
	SbfmDefinitelyAutomated pulumi.StringPtrInput
	// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
	SbfmLikelyAutomated pulumi.StringPtrInput
	// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
	SbfmStaticResourceProtection pulumi.BoolPtrInput
	// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
	SbfmVerifiedBots pulumi.StringPtrInput
	// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
	SuppressSessionScore pulumi.BoolPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (BotManagementArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*botManagementArgs)(nil)).Elem()
}

type BotManagementInput interface {
	pulumi.Input

	ToBotManagementOutput() BotManagementOutput
	ToBotManagementOutputWithContext(ctx context.Context) BotManagementOutput
}

func (*BotManagement) ElementType() reflect.Type {
	return reflect.TypeOf((**BotManagement)(nil)).Elem()
}

func (i *BotManagement) ToBotManagementOutput() BotManagementOutput {
	return i.ToBotManagementOutputWithContext(context.Background())
}

func (i *BotManagement) ToBotManagementOutputWithContext(ctx context.Context) BotManagementOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotManagementOutput)
}

// BotManagementArrayInput is an input type that accepts BotManagementArray and BotManagementArrayOutput values.
// You can construct a concrete instance of `BotManagementArrayInput` via:
//
//	BotManagementArray{ BotManagementArgs{...} }
type BotManagementArrayInput interface {
	pulumi.Input

	ToBotManagementArrayOutput() BotManagementArrayOutput
	ToBotManagementArrayOutputWithContext(context.Context) BotManagementArrayOutput
}

type BotManagementArray []BotManagementInput

func (BotManagementArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BotManagement)(nil)).Elem()
}

func (i BotManagementArray) ToBotManagementArrayOutput() BotManagementArrayOutput {
	return i.ToBotManagementArrayOutputWithContext(context.Background())
}

func (i BotManagementArray) ToBotManagementArrayOutputWithContext(ctx context.Context) BotManagementArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotManagementArrayOutput)
}

// BotManagementMapInput is an input type that accepts BotManagementMap and BotManagementMapOutput values.
// You can construct a concrete instance of `BotManagementMapInput` via:
//
//	BotManagementMap{ "key": BotManagementArgs{...} }
type BotManagementMapInput interface {
	pulumi.Input

	ToBotManagementMapOutput() BotManagementMapOutput
	ToBotManagementMapOutputWithContext(context.Context) BotManagementMapOutput
}

type BotManagementMap map[string]BotManagementInput

func (BotManagementMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BotManagement)(nil)).Elem()
}

func (i BotManagementMap) ToBotManagementMapOutput() BotManagementMapOutput {
	return i.ToBotManagementMapOutputWithContext(context.Background())
}

func (i BotManagementMap) ToBotManagementMapOutputWithContext(ctx context.Context) BotManagementMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BotManagementMapOutput)
}

type BotManagementOutput struct{ *pulumi.OutputState }

func (BotManagementOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BotManagement)(nil)).Elem()
}

func (o BotManagementOutput) ToBotManagementOutput() BotManagementOutput {
	return o
}

func (o BotManagementOutput) ToBotManagementOutputWithContext(ctx context.Context) BotManagementOutput {
	return o
}

// Automatically update to the newest bot detection models created by Cloudflare as they are released. [Learn more.](https://developers.cloudflare.com/bots/reference/machine-learning-models#model-versions-and-release-notes).
func (o BotManagementOutput) AutoUpdateModel() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.AutoUpdateModel }).(pulumi.BoolPtrOutput)
}

// Use lightweight, invisible JavaScript detections to improve Bot Management. [Learn more about JavaScript Detections](https://developers.cloudflare.com/bots/reference/javascript-detections/).
func (o BotManagementOutput) EnableJs() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.EnableJs }).(pulumi.BoolPtrOutput)
}

// Whether to enable Bot Fight Mode.
func (o BotManagementOutput) FightMode() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.FightMode }).(pulumi.BoolPtrOutput)
}

// Whether to optimize Super Bot Fight Mode protections for Wordpress.
func (o BotManagementOutput) OptimizeWordpress() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.OptimizeWordpress }).(pulumi.BoolPtrOutput)
}

// Super Bot Fight Mode (SBFM) action to take on definitely automated requests.
func (o BotManagementOutput) SbfmDefinitelyAutomated() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.StringPtrOutput { return v.SbfmDefinitelyAutomated }).(pulumi.StringPtrOutput)
}

// Super Bot Fight Mode (SBFM) action to take on likely automated requests.
func (o BotManagementOutput) SbfmLikelyAutomated() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.StringPtrOutput { return v.SbfmLikelyAutomated }).(pulumi.StringPtrOutput)
}

// Super Bot Fight Mode (SBFM) to enable static resource protection. Enable if static resources on your application need bot protection. Note: Static resource protection can also result in legitimate traffic being blocked.
func (o BotManagementOutput) SbfmStaticResourceProtection() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.SbfmStaticResourceProtection }).(pulumi.BoolPtrOutput)
}

// Super Bot Fight Mode (SBFM) action to take on verified bots requests.
func (o BotManagementOutput) SbfmVerifiedBots() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.StringPtrOutput { return v.SbfmVerifiedBots }).(pulumi.StringPtrOutput)
}

// Whether to disable tracking the highest bot score for a session in the Bot Management cookie.
func (o BotManagementOutput) SuppressSessionScore() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolPtrOutput { return v.SuppressSessionScore }).(pulumi.BoolPtrOutput)
}

// A read-only field that indicates whether the zone currently is running the latest ML model.
func (o BotManagementOutput) UsingLatestModel() pulumi.BoolOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.BoolOutput { return v.UsingLatestModel }).(pulumi.BoolOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o BotManagementOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *BotManagement) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type BotManagementArrayOutput struct{ *pulumi.OutputState }

func (BotManagementArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BotManagement)(nil)).Elem()
}

func (o BotManagementArrayOutput) ToBotManagementArrayOutput() BotManagementArrayOutput {
	return o
}

func (o BotManagementArrayOutput) ToBotManagementArrayOutputWithContext(ctx context.Context) BotManagementArrayOutput {
	return o
}

func (o BotManagementArrayOutput) Index(i pulumi.IntInput) BotManagementOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BotManagement {
		return vs[0].([]*BotManagement)[vs[1].(int)]
	}).(BotManagementOutput)
}

type BotManagementMapOutput struct{ *pulumi.OutputState }

func (BotManagementMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BotManagement)(nil)).Elem()
}

func (o BotManagementMapOutput) ToBotManagementMapOutput() BotManagementMapOutput {
	return o
}

func (o BotManagementMapOutput) ToBotManagementMapOutputWithContext(ctx context.Context) BotManagementMapOutput {
	return o
}

func (o BotManagementMapOutput) MapIndex(k pulumi.StringInput) BotManagementOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BotManagement {
		return vs[0].(map[string]*BotManagement)[vs[1].(string)]
	}).(BotManagementOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BotManagementInput)(nil)).Elem(), &BotManagement{})
	pulumi.RegisterInputType(reflect.TypeOf((*BotManagementArrayInput)(nil)).Elem(), BotManagementArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BotManagementMapInput)(nil)).Elem(), BotManagementMap{})
	pulumi.RegisterOutputType(BotManagementOutput{})
	pulumi.RegisterOutputType(BotManagementArrayOutput{})
	pulumi.RegisterOutputType(BotManagementMapOutput{})
}
