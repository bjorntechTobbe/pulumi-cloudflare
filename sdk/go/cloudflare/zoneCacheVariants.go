// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource which customizes Cloudflare zone cache variants.
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
//			_, err := cloudflare.NewZoneCacheVariants(ctx, "example", &cloudflare.ZoneCacheVariantsArgs{
//				Avifs: pulumi.StringArray{
//					pulumi.String("image/avif"),
//					pulumi.String("image/webp"),
//				},
//				Bmps: pulumi.StringArray{
//					pulumi.String("image/bmp"),
//					pulumi.String("image/webp"),
//				},
//				Gifs: pulumi.StringArray{
//					pulumi.String("image/gif"),
//					pulumi.String("image/webp"),
//				},
//				Jp2s: pulumi.StringArray{
//					pulumi.String("image/jp2"),
//					pulumi.String("image/webp"),
//				},
//				Jpegs: pulumi.StringArray{
//					pulumi.String("image/jpeg"),
//					pulumi.String("image/webp"),
//				},
//				Jpgs: pulumi.StringArray{
//					pulumi.String("image/jpg"),
//					pulumi.String("image/webp"),
//				},
//				Jpg2s: pulumi.StringArray{
//					pulumi.String("image/jpg2"),
//					pulumi.String("image/webp"),
//				},
//				Pngs: pulumi.StringArray{
//					pulumi.String("image/png"),
//					pulumi.String("image/webp"),
//				},
//				Tifs: pulumi.StringArray{
//					pulumi.String("image/tif"),
//					pulumi.String("image/webp"),
//				},
//				Tiffs: pulumi.StringArray{
//					pulumi.String("image/tiff"),
//					pulumi.String("image/webp"),
//				},
//				Webps: pulumi.StringArray{
//					pulumi.String("image/jpeg"),
//					pulumi.String("image/webp"),
//				},
//				ZoneId: pulumi.String("0da42c8d2132a9ddaf714f9e7c920711"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ZoneCacheVariants struct {
	pulumi.CustomResourceState

	// List of strings with the MIME types of all the variants that should be served for avif.
	Avifs pulumi.StringArrayOutput `pulumi:"avifs"`
	// List of strings with the MIME types of all the variants that should be served for bmp.
	Bmps pulumi.StringArrayOutput `pulumi:"bmps"`
	// List of strings with the MIME types of all the variants that should be served for gif.
	Gifs pulumi.StringArrayOutput `pulumi:"gifs"`
	// List of strings with the MIME types of all the variants that should be served for jp2.
	Jp2s pulumi.StringArrayOutput `pulumi:"jp2s"`
	// List of strings with the MIME types of all the variants that should be served for jpeg.
	Jpegs pulumi.StringArrayOutput `pulumi:"jpegs"`
	// List of strings with the MIME types of all the variants that should be served for jpg2.
	Jpg2s pulumi.StringArrayOutput `pulumi:"jpg2s"`
	// List of strings with the MIME types of all the variants that should be served for jpg.
	Jpgs pulumi.StringArrayOutput `pulumi:"jpgs"`
	// List of strings with the MIME types of all the variants that should be served for png.
	Pngs pulumi.StringArrayOutput `pulumi:"pngs"`
	// List of strings with the MIME types of all the variants that should be served for tiff.
	Tiffs pulumi.StringArrayOutput `pulumi:"tiffs"`
	// List of strings with the MIME types of all the variants that should be served for tif.
	Tifs pulumi.StringArrayOutput `pulumi:"tifs"`
	// List of strings with the MIME types of all the variants that should be served for webp.
	Webps pulumi.StringArrayOutput `pulumi:"webps"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewZoneCacheVariants registers a new resource with the given unique name, arguments, and options.
func NewZoneCacheVariants(ctx *pulumi.Context,
	name string, args *ZoneCacheVariantsArgs, opts ...pulumi.ResourceOption) (*ZoneCacheVariants, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	var resource ZoneCacheVariants
	err := ctx.RegisterResource("cloudflare:index/zoneCacheVariants:ZoneCacheVariants", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZoneCacheVariants gets an existing ZoneCacheVariants resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZoneCacheVariants(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneCacheVariantsState, opts ...pulumi.ResourceOption) (*ZoneCacheVariants, error) {
	var resource ZoneCacheVariants
	err := ctx.ReadResource("cloudflare:index/zoneCacheVariants:ZoneCacheVariants", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ZoneCacheVariants resources.
type zoneCacheVariantsState struct {
	// List of strings with the MIME types of all the variants that should be served for avif.
	Avifs []string `pulumi:"avifs"`
	// List of strings with the MIME types of all the variants that should be served for bmp.
	Bmps []string `pulumi:"bmps"`
	// List of strings with the MIME types of all the variants that should be served for gif.
	Gifs []string `pulumi:"gifs"`
	// List of strings with the MIME types of all the variants that should be served for jp2.
	Jp2s []string `pulumi:"jp2s"`
	// List of strings with the MIME types of all the variants that should be served for jpeg.
	Jpegs []string `pulumi:"jpegs"`
	// List of strings with the MIME types of all the variants that should be served for jpg2.
	Jpg2s []string `pulumi:"jpg2s"`
	// List of strings with the MIME types of all the variants that should be served for jpg.
	Jpgs []string `pulumi:"jpgs"`
	// List of strings with the MIME types of all the variants that should be served for png.
	Pngs []string `pulumi:"pngs"`
	// List of strings with the MIME types of all the variants that should be served for tiff.
	Tiffs []string `pulumi:"tiffs"`
	// List of strings with the MIME types of all the variants that should be served for tif.
	Tifs []string `pulumi:"tifs"`
	// List of strings with the MIME types of all the variants that should be served for webp.
	Webps []string `pulumi:"webps"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type ZoneCacheVariantsState struct {
	// List of strings with the MIME types of all the variants that should be served for avif.
	Avifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for bmp.
	Bmps pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for gif.
	Gifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jp2.
	Jp2s pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpeg.
	Jpegs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpg2.
	Jpg2s pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpg.
	Jpgs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for png.
	Pngs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for tiff.
	Tiffs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for tif.
	Tifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for webp.
	Webps pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (ZoneCacheVariantsState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneCacheVariantsState)(nil)).Elem()
}

type zoneCacheVariantsArgs struct {
	// List of strings with the MIME types of all the variants that should be served for avif.
	Avifs []string `pulumi:"avifs"`
	// List of strings with the MIME types of all the variants that should be served for bmp.
	Bmps []string `pulumi:"bmps"`
	// List of strings with the MIME types of all the variants that should be served for gif.
	Gifs []string `pulumi:"gifs"`
	// List of strings with the MIME types of all the variants that should be served for jp2.
	Jp2s []string `pulumi:"jp2s"`
	// List of strings with the MIME types of all the variants that should be served for jpeg.
	Jpegs []string `pulumi:"jpegs"`
	// List of strings with the MIME types of all the variants that should be served for jpg2.
	Jpg2s []string `pulumi:"jpg2s"`
	// List of strings with the MIME types of all the variants that should be served for jpg.
	Jpgs []string `pulumi:"jpgs"`
	// List of strings with the MIME types of all the variants that should be served for png.
	Pngs []string `pulumi:"pngs"`
	// List of strings with the MIME types of all the variants that should be served for tiff.
	Tiffs []string `pulumi:"tiffs"`
	// List of strings with the MIME types of all the variants that should be served for tif.
	Tifs []string `pulumi:"tifs"`
	// List of strings with the MIME types of all the variants that should be served for webp.
	Webps []string `pulumi:"webps"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a ZoneCacheVariants resource.
type ZoneCacheVariantsArgs struct {
	// List of strings with the MIME types of all the variants that should be served for avif.
	Avifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for bmp.
	Bmps pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for gif.
	Gifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jp2.
	Jp2s pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpeg.
	Jpegs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpg2.
	Jpg2s pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for jpg.
	Jpgs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for png.
	Pngs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for tiff.
	Tiffs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for tif.
	Tifs pulumi.StringArrayInput
	// List of strings with the MIME types of all the variants that should be served for webp.
	Webps pulumi.StringArrayInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (ZoneCacheVariantsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneCacheVariantsArgs)(nil)).Elem()
}

type ZoneCacheVariantsInput interface {
	pulumi.Input

	ToZoneCacheVariantsOutput() ZoneCacheVariantsOutput
	ToZoneCacheVariantsOutputWithContext(ctx context.Context) ZoneCacheVariantsOutput
}

func (*ZoneCacheVariants) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneCacheVariants)(nil)).Elem()
}

func (i *ZoneCacheVariants) ToZoneCacheVariantsOutput() ZoneCacheVariantsOutput {
	return i.ToZoneCacheVariantsOutputWithContext(context.Background())
}

func (i *ZoneCacheVariants) ToZoneCacheVariantsOutputWithContext(ctx context.Context) ZoneCacheVariantsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneCacheVariantsOutput)
}

// ZoneCacheVariantsArrayInput is an input type that accepts ZoneCacheVariantsArray and ZoneCacheVariantsArrayOutput values.
// You can construct a concrete instance of `ZoneCacheVariantsArrayInput` via:
//
//	ZoneCacheVariantsArray{ ZoneCacheVariantsArgs{...} }
type ZoneCacheVariantsArrayInput interface {
	pulumi.Input

	ToZoneCacheVariantsArrayOutput() ZoneCacheVariantsArrayOutput
	ToZoneCacheVariantsArrayOutputWithContext(context.Context) ZoneCacheVariantsArrayOutput
}

type ZoneCacheVariantsArray []ZoneCacheVariantsInput

func (ZoneCacheVariantsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneCacheVariants)(nil)).Elem()
}

func (i ZoneCacheVariantsArray) ToZoneCacheVariantsArrayOutput() ZoneCacheVariantsArrayOutput {
	return i.ToZoneCacheVariantsArrayOutputWithContext(context.Background())
}

func (i ZoneCacheVariantsArray) ToZoneCacheVariantsArrayOutputWithContext(ctx context.Context) ZoneCacheVariantsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneCacheVariantsArrayOutput)
}

// ZoneCacheVariantsMapInput is an input type that accepts ZoneCacheVariantsMap and ZoneCacheVariantsMapOutput values.
// You can construct a concrete instance of `ZoneCacheVariantsMapInput` via:
//
//	ZoneCacheVariantsMap{ "key": ZoneCacheVariantsArgs{...} }
type ZoneCacheVariantsMapInput interface {
	pulumi.Input

	ToZoneCacheVariantsMapOutput() ZoneCacheVariantsMapOutput
	ToZoneCacheVariantsMapOutputWithContext(context.Context) ZoneCacheVariantsMapOutput
}

type ZoneCacheVariantsMap map[string]ZoneCacheVariantsInput

func (ZoneCacheVariantsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneCacheVariants)(nil)).Elem()
}

func (i ZoneCacheVariantsMap) ToZoneCacheVariantsMapOutput() ZoneCacheVariantsMapOutput {
	return i.ToZoneCacheVariantsMapOutputWithContext(context.Background())
}

func (i ZoneCacheVariantsMap) ToZoneCacheVariantsMapOutputWithContext(ctx context.Context) ZoneCacheVariantsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneCacheVariantsMapOutput)
}

type ZoneCacheVariantsOutput struct{ *pulumi.OutputState }

func (ZoneCacheVariantsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ZoneCacheVariants)(nil)).Elem()
}

func (o ZoneCacheVariantsOutput) ToZoneCacheVariantsOutput() ZoneCacheVariantsOutput {
	return o
}

func (o ZoneCacheVariantsOutput) ToZoneCacheVariantsOutputWithContext(ctx context.Context) ZoneCacheVariantsOutput {
	return o
}

// List of strings with the MIME types of all the variants that should be served for avif.
func (o ZoneCacheVariantsOutput) Avifs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Avifs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for bmp.
func (o ZoneCacheVariantsOutput) Bmps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Bmps }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for gif.
func (o ZoneCacheVariantsOutput) Gifs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Gifs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for jp2.
func (o ZoneCacheVariantsOutput) Jp2s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Jp2s }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for jpeg.
func (o ZoneCacheVariantsOutput) Jpegs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Jpegs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for jpg2.
func (o ZoneCacheVariantsOutput) Jpg2s() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Jpg2s }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for jpg.
func (o ZoneCacheVariantsOutput) Jpgs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Jpgs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for png.
func (o ZoneCacheVariantsOutput) Pngs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Pngs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for tiff.
func (o ZoneCacheVariantsOutput) Tiffs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Tiffs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for tif.
func (o ZoneCacheVariantsOutput) Tifs() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Tifs }).(pulumi.StringArrayOutput)
}

// List of strings with the MIME types of all the variants that should be served for webp.
func (o ZoneCacheVariantsOutput) Webps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringArrayOutput { return v.Webps }).(pulumi.StringArrayOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o ZoneCacheVariantsOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ZoneCacheVariants) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ZoneCacheVariantsArrayOutput struct{ *pulumi.OutputState }

func (ZoneCacheVariantsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ZoneCacheVariants)(nil)).Elem()
}

func (o ZoneCacheVariantsArrayOutput) ToZoneCacheVariantsArrayOutput() ZoneCacheVariantsArrayOutput {
	return o
}

func (o ZoneCacheVariantsArrayOutput) ToZoneCacheVariantsArrayOutputWithContext(ctx context.Context) ZoneCacheVariantsArrayOutput {
	return o
}

func (o ZoneCacheVariantsArrayOutput) Index(i pulumi.IntInput) ZoneCacheVariantsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ZoneCacheVariants {
		return vs[0].([]*ZoneCacheVariants)[vs[1].(int)]
	}).(ZoneCacheVariantsOutput)
}

type ZoneCacheVariantsMapOutput struct{ *pulumi.OutputState }

func (ZoneCacheVariantsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ZoneCacheVariants)(nil)).Elem()
}

func (o ZoneCacheVariantsMapOutput) ToZoneCacheVariantsMapOutput() ZoneCacheVariantsMapOutput {
	return o
}

func (o ZoneCacheVariantsMapOutput) ToZoneCacheVariantsMapOutputWithContext(ctx context.Context) ZoneCacheVariantsMapOutput {
	return o
}

func (o ZoneCacheVariantsMapOutput) MapIndex(k pulumi.StringInput) ZoneCacheVariantsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ZoneCacheVariants {
		return vs[0].(map[string]*ZoneCacheVariants)[vs[1].(string)]
	}).(ZoneCacheVariantsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneCacheVariantsInput)(nil)).Elem(), &ZoneCacheVariants{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneCacheVariantsArrayInput)(nil)).Elem(), ZoneCacheVariantsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneCacheVariantsMapInput)(nil)).Elem(), ZoneCacheVariantsMap{})
	pulumi.RegisterOutputType(ZoneCacheVariantsOutput{})
	pulumi.RegisterOutputType(ZoneCacheVariantsArrayOutput{})
	pulumi.RegisterOutputType(ZoneCacheVariantsMapOutput{})
}
