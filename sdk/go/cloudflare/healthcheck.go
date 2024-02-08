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

// Standalone Health Checks provide a way to monitor origin servers
// without needing a Cloudflare Load Balancer.
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
//			_, err := cloudflare.NewHealthcheck(ctx, "httpHealthCheck", &cloudflare.HealthcheckArgs{
//				ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
//				Name:        pulumi.String("http-health-check"),
//				Description: pulumi.String("example http health check"),
//				Address:     pulumi.String("example.com"),
//				Suspended:   pulumi.Bool(false),
//				CheckRegions: pulumi.StringArray{
//					pulumi.String("WEU"),
//					pulumi.String("EEU"),
//				},
//				Type:         pulumi.String("HTTPS"),
//				Port:         pulumi.Int(443),
//				Method:       pulumi.String("GET"),
//				Path:         pulumi.String("/health"),
//				ExpectedBody: pulumi.String("alive"),
//				ExpectedCodes: pulumi.StringArray{
//					pulumi.String("2xx"),
//					pulumi.String("301"),
//				},
//				FollowRedirects: pulumi.Bool(true),
//				AllowInsecure:   pulumi.Bool(false),
//				Headers: cloudflare.HealthcheckHeaderArray{
//					&cloudflare.HealthcheckHeaderArgs{
//						Header: pulumi.String("Host"),
//						Values: pulumi.StringArray{
//							pulumi.String("example.com"),
//						},
//					},
//				},
//				Timeout:              pulumi.Int(10),
//				Retries:              pulumi.Int(2),
//				Interval:             pulumi.Int(60),
//				ConsecutiveFails:     pulumi.Int(3),
//				ConsecutiveSuccesses: pulumi.Int(2),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudflare.NewHealthcheck(ctx, "tcpHealthCheck", &cloudflare.HealthcheckArgs{
//				ZoneId:      pulumi.Any(_var.Cloudflare_zone_id),
//				Name:        pulumi.String("tcp-health-check"),
//				Description: pulumi.String("example tcp health check"),
//				Address:     pulumi.String("example.com"),
//				Suspended:   pulumi.Bool(false),
//				CheckRegions: pulumi.StringArray{
//					pulumi.String("WEU"),
//					pulumi.String("EEU"),
//				},
//				Type:                 pulumi.String("TCP"),
//				Port:                 pulumi.Int(22),
//				Method:               pulumi.String("connection_established"),
//				Timeout:              pulumi.Int(10),
//				Retries:              pulumi.Int(2),
//				Interval:             pulumi.Int(60),
//				ConsecutiveFails:     pulumi.Int(3),
//				ConsecutiveSuccesses: pulumi.Int(2),
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
// Use the Zone ID and Healthcheck ID to import.
//
// ```sh
// $ pulumi import cloudflare:index/healthcheck:Healthcheck example <zone_id>/<healthcheck_id>
// ```
type Healthcheck struct {
	pulumi.CustomResourceState

	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringOutput `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
	AllowInsecure pulumi.BoolPtrOutput `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayOutput `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
	ConsecutiveFails pulumi.IntPtrOutput `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
	ConsecutiveSuccesses pulumi.IntPtrOutput `pulumi:"consecutiveSuccesses"`
	// Creation time.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// A human-readable description of the health check.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrOutput `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
	ExpectedCodes pulumi.StringArrayOutput `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
	FollowRedirects pulumi.BoolPtrOutput `pulumi:"followRedirects"`
	// The header name.
	Headers HealthcheckHeaderArrayOutput `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrOutput `pulumi:"interval"`
	// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
	Method pulumi.StringOutput `pulumi:"method"`
	// Last modified time.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name pulumi.StringOutput `pulumi:"name"`
	// The endpoint path to health check against. Defaults to `/`.
	Path pulumi.StringPtrOutput `pulumi:"path"`
	// Port number to connect to for the health check. Defaults to `80`.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrOutput `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Defaults to `false`.
	Suspended pulumi.BoolPtrOutput `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrOutput `pulumi:"timeout"`
	// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewHealthcheck registers a new resource with the given unique name, arguments, and options.
func NewHealthcheck(ctx *pulumi.Context,
	name string, args *HealthcheckArgs, opts ...pulumi.ResourceOption) (*Healthcheck, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Address == nil {
		return nil, errors.New("invalid value for required argument 'Address'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ZoneId == nil {
		return nil, errors.New("invalid value for required argument 'ZoneId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Healthcheck
	err := ctx.RegisterResource("cloudflare:index/healthcheck:Healthcheck", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHealthcheck gets an existing Healthcheck resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHealthcheck(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HealthcheckState, opts ...pulumi.ResourceOption) (*Healthcheck, error) {
	var resource Healthcheck
	err := ctx.ReadResource("cloudflare:index/healthcheck:Healthcheck", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Healthcheck resources.
type healthcheckState struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address *string `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions []string `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
	ConsecutiveFails *int `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
	ConsecutiveSuccesses *int `pulumi:"consecutiveSuccesses"`
	// Creation time.
	CreatedOn *string `pulumi:"createdOn"`
	// A human-readable description of the health check.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
	ExpectedCodes []string `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []HealthcheckHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
	Interval *int `pulumi:"interval"`
	// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
	Method *string `pulumi:"method"`
	// Last modified time.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name *string `pulumi:"name"`
	// The endpoint path to health check against. Defaults to `/`.
	Path *string `pulumi:"path"`
	// Port number to connect to for the health check. Defaults to `80`.
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries *int `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Defaults to `false`.
	Suspended *bool `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
	Type *string `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type HealthcheckState struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringPtrInput
	// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
	AllowInsecure pulumi.BoolPtrInput
	// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayInput
	// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
	ConsecutiveFails pulumi.IntPtrInput
	// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
	ConsecutiveSuccesses pulumi.IntPtrInput
	// Creation time.
	CreatedOn pulumi.StringPtrInput
	// A human-readable description of the health check.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
	ExpectedCodes pulumi.StringArrayInput
	// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers HealthcheckHeaderArrayInput
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrInput
	// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
	Method pulumi.StringPtrInput
	// Last modified time.
	ModifiedOn pulumi.StringPtrInput
	// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name pulumi.StringPtrInput
	// The endpoint path to health check against. Defaults to `/`.
	Path pulumi.StringPtrInput
	// Port number to connect to for the health check. Defaults to `80`.
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrInput
	// If suspended, no health checks are sent to the origin. Defaults to `false`.
	Suspended pulumi.BoolPtrInput
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
	Type pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (HealthcheckState) ElementType() reflect.Type {
	return reflect.TypeOf((*healthcheckState)(nil)).Elem()
}

type healthcheckArgs struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address string `pulumi:"address"`
	// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
	AllowInsecure *bool `pulumi:"allowInsecure"`
	// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions []string `pulumi:"checkRegions"`
	// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
	ConsecutiveFails *int `pulumi:"consecutiveFails"`
	// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
	ConsecutiveSuccesses *int `pulumi:"consecutiveSuccesses"`
	// A human-readable description of the health check.
	Description *string `pulumi:"description"`
	// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
	ExpectedBody *string `pulumi:"expectedBody"`
	// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
	ExpectedCodes []string `pulumi:"expectedCodes"`
	// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
	FollowRedirects *bool `pulumi:"followRedirects"`
	// The header name.
	Headers []HealthcheckHeader `pulumi:"headers"`
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
	Interval *int `pulumi:"interval"`
	// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
	Method *string `pulumi:"method"`
	// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name string `pulumi:"name"`
	// The endpoint path to health check against. Defaults to `/`.
	Path *string `pulumi:"path"`
	// Port number to connect to for the health check. Defaults to `80`.
	Port *int `pulumi:"port"`
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries *int `pulumi:"retries"`
	// If suspended, no health checks are sent to the origin. Defaults to `false`.
	Suspended *bool `pulumi:"suspended"`
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout *int `pulumi:"timeout"`
	// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
	Type string `pulumi:"type"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Healthcheck resource.
type HealthcheckArgs struct {
	// The hostname or IP address of the origin server to run health checks on.
	Address pulumi.StringInput
	// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
	AllowInsecure pulumi.BoolPtrInput
	// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
	CheckRegions pulumi.StringArrayInput
	// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
	ConsecutiveFails pulumi.IntPtrInput
	// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
	ConsecutiveSuccesses pulumi.IntPtrInput
	// A human-readable description of the health check.
	Description pulumi.StringPtrInput
	// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
	ExpectedBody pulumi.StringPtrInput
	// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
	ExpectedCodes pulumi.StringArrayInput
	// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
	FollowRedirects pulumi.BoolPtrInput
	// The header name.
	Headers HealthcheckHeaderArrayInput
	// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
	Interval pulumi.IntPtrInput
	// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
	Method pulumi.StringPtrInput
	// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
	Name pulumi.StringInput
	// The endpoint path to health check against. Defaults to `/`.
	Path pulumi.StringPtrInput
	// Port number to connect to for the health check. Defaults to `80`.
	Port pulumi.IntPtrInput
	// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
	Retries pulumi.IntPtrInput
	// If suspended, no health checks are sent to the origin. Defaults to `false`.
	Suspended pulumi.BoolPtrInput
	// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
	Timeout pulumi.IntPtrInput
	// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
	Type pulumi.StringInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (HealthcheckArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*healthcheckArgs)(nil)).Elem()
}

type HealthcheckInput interface {
	pulumi.Input

	ToHealthcheckOutput() HealthcheckOutput
	ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput
}

func (*Healthcheck) ElementType() reflect.Type {
	return reflect.TypeOf((**Healthcheck)(nil)).Elem()
}

func (i *Healthcheck) ToHealthcheckOutput() HealthcheckOutput {
	return i.ToHealthcheckOutputWithContext(context.Background())
}

func (i *Healthcheck) ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthcheckOutput)
}

// HealthcheckArrayInput is an input type that accepts HealthcheckArray and HealthcheckArrayOutput values.
// You can construct a concrete instance of `HealthcheckArrayInput` via:
//
//	HealthcheckArray{ HealthcheckArgs{...} }
type HealthcheckArrayInput interface {
	pulumi.Input

	ToHealthcheckArrayOutput() HealthcheckArrayOutput
	ToHealthcheckArrayOutputWithContext(context.Context) HealthcheckArrayOutput
}

type HealthcheckArray []HealthcheckInput

func (HealthcheckArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Healthcheck)(nil)).Elem()
}

func (i HealthcheckArray) ToHealthcheckArrayOutput() HealthcheckArrayOutput {
	return i.ToHealthcheckArrayOutputWithContext(context.Background())
}

func (i HealthcheckArray) ToHealthcheckArrayOutputWithContext(ctx context.Context) HealthcheckArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthcheckArrayOutput)
}

// HealthcheckMapInput is an input type that accepts HealthcheckMap and HealthcheckMapOutput values.
// You can construct a concrete instance of `HealthcheckMapInput` via:
//
//	HealthcheckMap{ "key": HealthcheckArgs{...} }
type HealthcheckMapInput interface {
	pulumi.Input

	ToHealthcheckMapOutput() HealthcheckMapOutput
	ToHealthcheckMapOutputWithContext(context.Context) HealthcheckMapOutput
}

type HealthcheckMap map[string]HealthcheckInput

func (HealthcheckMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Healthcheck)(nil)).Elem()
}

func (i HealthcheckMap) ToHealthcheckMapOutput() HealthcheckMapOutput {
	return i.ToHealthcheckMapOutputWithContext(context.Background())
}

func (i HealthcheckMap) ToHealthcheckMapOutputWithContext(ctx context.Context) HealthcheckMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HealthcheckMapOutput)
}

type HealthcheckOutput struct{ *pulumi.OutputState }

func (HealthcheckOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Healthcheck)(nil)).Elem()
}

func (o HealthcheckOutput) ToHealthcheckOutput() HealthcheckOutput {
	return o
}

func (o HealthcheckOutput) ToHealthcheckOutputWithContext(ctx context.Context) HealthcheckOutput {
	return o
}

// The hostname or IP address of the origin server to run health checks on.
func (o HealthcheckOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
func (o HealthcheckOutput) AllowInsecure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.BoolPtrOutput { return v.AllowInsecure }).(pulumi.BoolPtrOutput)
}

// A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
func (o HealthcheckOutput) CheckRegions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringArrayOutput { return v.CheckRegions }).(pulumi.StringArrayOutput)
}

// The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
func (o HealthcheckOutput) ConsecutiveFails() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.ConsecutiveFails }).(pulumi.IntPtrOutput)
}

// The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
func (o HealthcheckOutput) ConsecutiveSuccesses() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.ConsecutiveSuccesses }).(pulumi.IntPtrOutput)
}

// Creation time.
func (o HealthcheckOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// A human-readable description of the health check.
func (o HealthcheckOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
func (o HealthcheckOutput) ExpectedBody() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringPtrOutput { return v.ExpectedBody }).(pulumi.StringPtrOutput)
}

// The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
func (o HealthcheckOutput) ExpectedCodes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringArrayOutput { return v.ExpectedCodes }).(pulumi.StringArrayOutput)
}

// Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
func (o HealthcheckOutput) FollowRedirects() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.BoolPtrOutput { return v.FollowRedirects }).(pulumi.BoolPtrOutput)
}

// The header name.
func (o HealthcheckOutput) Headers() HealthcheckHeaderArrayOutput {
	return o.ApplyT(func(v *Healthcheck) HealthcheckHeaderArrayOutput { return v.Headers }).(HealthcheckHeaderArrayOutput)
}

// The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
func (o HealthcheckOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.Interval }).(pulumi.IntPtrOutput)
}

// The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
func (o HealthcheckOutput) Method() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.Method }).(pulumi.StringOutput)
}

// Last modified time.
func (o HealthcheckOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
func (o HealthcheckOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The endpoint path to health check against. Defaults to `/`.
func (o HealthcheckOutput) Path() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringPtrOutput { return v.Path }).(pulumi.StringPtrOutput)
}

// Port number to connect to for the health check. Defaults to `80`.
func (o HealthcheckOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
func (o HealthcheckOutput) Retries() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.Retries }).(pulumi.IntPtrOutput)
}

// If suspended, no health checks are sent to the origin. Defaults to `false`.
func (o HealthcheckOutput) Suspended() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.BoolPtrOutput { return v.Suspended }).(pulumi.BoolPtrOutput)
}

// The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
func (o HealthcheckOutput) Timeout() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.IntPtrOutput { return v.Timeout }).(pulumi.IntPtrOutput)
}

// The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
func (o HealthcheckOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o HealthcheckOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Healthcheck) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type HealthcheckArrayOutput struct{ *pulumi.OutputState }

func (HealthcheckArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Healthcheck)(nil)).Elem()
}

func (o HealthcheckArrayOutput) ToHealthcheckArrayOutput() HealthcheckArrayOutput {
	return o
}

func (o HealthcheckArrayOutput) ToHealthcheckArrayOutputWithContext(ctx context.Context) HealthcheckArrayOutput {
	return o
}

func (o HealthcheckArrayOutput) Index(i pulumi.IntInput) HealthcheckOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Healthcheck {
		return vs[0].([]*Healthcheck)[vs[1].(int)]
	}).(HealthcheckOutput)
}

type HealthcheckMapOutput struct{ *pulumi.OutputState }

func (HealthcheckMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Healthcheck)(nil)).Elem()
}

func (o HealthcheckMapOutput) ToHealthcheckMapOutput() HealthcheckMapOutput {
	return o
}

func (o HealthcheckMapOutput) ToHealthcheckMapOutputWithContext(ctx context.Context) HealthcheckMapOutput {
	return o
}

func (o HealthcheckMapOutput) MapIndex(k pulumi.StringInput) HealthcheckOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Healthcheck {
		return vs[0].(map[string]*Healthcheck)[vs[1].(string)]
	}).(HealthcheckOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HealthcheckInput)(nil)).Elem(), &Healthcheck{})
	pulumi.RegisterInputType(reflect.TypeOf((*HealthcheckArrayInput)(nil)).Elem(), HealthcheckArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HealthcheckMapInput)(nil)).Elem(), HealthcheckMap{})
	pulumi.RegisterOutputType(HealthcheckOutput{})
	pulumi.RegisterOutputType(HealthcheckArrayOutput{})
	pulumi.RegisterOutputType(HealthcheckMapOutput{})
}
