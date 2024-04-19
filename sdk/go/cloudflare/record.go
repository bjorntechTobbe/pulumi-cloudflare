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

// Provides a Cloudflare record resource.
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
//			// Add a record to the domain
//			_, err := cloudflare.NewRecord(ctx, "example", &cloudflare.RecordArgs{
//				ZoneId: pulumi.Any(cloudflareZoneId),
//				Name:   pulumi.String("example"),
//				Value:  pulumi.String("192.0.2.1"),
//				Type:   pulumi.String("A"),
//				Ttl:    pulumi.Int(3600),
//			})
//			if err != nil {
//				return err
//			}
//			// Add a record requiring a data map
//			_, err = cloudflare.NewRecord(ctx, "_sip_tls", &cloudflare.RecordArgs{
//				ZoneId: pulumi.Any(cloudflareZoneId),
//				Name:   pulumi.String("_sip._tls"),
//				Type:   pulumi.String("SRV"),
//				Data: &cloudflare.RecordDataArgs{
//					Service:  pulumi.String("_sip"),
//					Proto:    pulumi.String("_tls"),
//					Name:     pulumi.String("example-srv"),
//					Priority: pulumi.Int(0),
//					Weight:   pulumi.Int(0),
//					Port:     pulumi.Int(443),
//					Target:   pulumi.String("example.com"),
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
// $ pulumi import cloudflare:index/record:Record example <zone_id>/<record_id>
// ```
type Record struct {
	pulumi.CustomResourceState

	// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
	// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
	// from overwriting this record. **This configuration is not recommended for most environments**
	AllowOverwrite pulumi.BoolPtrOutput `pulumi:"allowOverwrite"`
	// Comments or notes about the DNS record. This field has no effect on DNS responses.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The RFC3339 timestamp of when the record was created.
	CreatedOn pulumi.StringOutput `pulumi:"createdOn"`
	// Map of attributes that constitute the record value. Conflicts with `value`.
	Data RecordDataPtrOutput `pulumi:"data"`
	// The FQDN of the record.
	Hostname pulumi.StringOutput `pulumi:"hostname"`
	// A key-value map of string metadata Cloudflare associates with the record.
	Metadata pulumi.MapOutput `pulumi:"metadata"`
	// The RFC3339 timestamp of when the record was last modified.
	ModifiedOn pulumi.StringOutput `pulumi:"modifiedOn"`
	// The name of the record.
	Name pulumi.StringOutput `pulumi:"name"`
	// The priority of the record.
	Priority pulumi.IntPtrOutput `pulumi:"priority"`
	// Shows whether this record can be proxied.
	Proxiable pulumi.BoolOutput `pulumi:"proxiable"`
	// Whether the record gets Cloudflare's origin protection.
	Proxied pulumi.BoolPtrOutput `pulumi:"proxied"`
	// Custom tags for the DNS record.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The TTL of the record.
	Ttl pulumi.IntOutput `pulumi:"ttl"`
	// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
	// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
	Type pulumi.StringOutput `pulumi:"type"`
	// The value of the record.
	Value pulumi.StringOutput `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewRecord registers a new resource with the given unique name, arguments, and options.
func NewRecord(ctx *pulumi.Context,
	name string, args *RecordArgs, opts ...pulumi.ResourceOption) (*Record, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
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
	var resource Record
	err := ctx.RegisterResource("cloudflare:index/record:Record", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRecord gets an existing Record resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRecord(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RecordState, opts ...pulumi.ResourceOption) (*Record, error) {
	var resource Record
	err := ctx.ReadResource("cloudflare:index/record:Record", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Record resources.
type recordState struct {
	// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
	// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
	// from overwriting this record. **This configuration is not recommended for most environments**
	AllowOverwrite *bool `pulumi:"allowOverwrite"`
	// Comments or notes about the DNS record. This field has no effect on DNS responses.
	Comment *string `pulumi:"comment"`
	// The RFC3339 timestamp of when the record was created.
	CreatedOn *string `pulumi:"createdOn"`
	// Map of attributes that constitute the record value. Conflicts with `value`.
	Data *RecordData `pulumi:"data"`
	// The FQDN of the record.
	Hostname *string `pulumi:"hostname"`
	// A key-value map of string metadata Cloudflare associates with the record.
	Metadata map[string]interface{} `pulumi:"metadata"`
	// The RFC3339 timestamp of when the record was last modified.
	ModifiedOn *string `pulumi:"modifiedOn"`
	// The name of the record.
	Name *string `pulumi:"name"`
	// The priority of the record.
	Priority *int `pulumi:"priority"`
	// Shows whether this record can be proxied.
	Proxiable *bool `pulumi:"proxiable"`
	// Whether the record gets Cloudflare's origin protection.
	Proxied *bool `pulumi:"proxied"`
	// Custom tags for the DNS record.
	Tags []string `pulumi:"tags"`
	// The TTL of the record.
	Ttl *int `pulumi:"ttl"`
	// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
	// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
	Type *string `pulumi:"type"`
	// The value of the record.
	Value *string `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId *string `pulumi:"zoneId"`
}

type RecordState struct {
	// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
	// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
	// from overwriting this record. **This configuration is not recommended for most environments**
	AllowOverwrite pulumi.BoolPtrInput
	// Comments or notes about the DNS record. This field has no effect on DNS responses.
	Comment pulumi.StringPtrInput
	// The RFC3339 timestamp of when the record was created.
	CreatedOn pulumi.StringPtrInput
	// Map of attributes that constitute the record value. Conflicts with `value`.
	Data RecordDataPtrInput
	// The FQDN of the record.
	Hostname pulumi.StringPtrInput
	// A key-value map of string metadata Cloudflare associates with the record.
	Metadata pulumi.MapInput
	// The RFC3339 timestamp of when the record was last modified.
	ModifiedOn pulumi.StringPtrInput
	// The name of the record.
	Name pulumi.StringPtrInput
	// The priority of the record.
	Priority pulumi.IntPtrInput
	// Shows whether this record can be proxied.
	Proxiable pulumi.BoolPtrInput
	// Whether the record gets Cloudflare's origin protection.
	Proxied pulumi.BoolPtrInput
	// Custom tags for the DNS record.
	Tags pulumi.StringArrayInput
	// The TTL of the record.
	Ttl pulumi.IntPtrInput
	// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
	// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
	Type pulumi.StringPtrInput
	// The value of the record.
	Value pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringPtrInput
}

func (RecordState) ElementType() reflect.Type {
	return reflect.TypeOf((*recordState)(nil)).Elem()
}

type recordArgs struct {
	// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
	// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
	// from overwriting this record. **This configuration is not recommended for most environments**
	AllowOverwrite *bool `pulumi:"allowOverwrite"`
	// Comments or notes about the DNS record. This field has no effect on DNS responses.
	Comment *string `pulumi:"comment"`
	// Map of attributes that constitute the record value. Conflicts with `value`.
	Data *RecordData `pulumi:"data"`
	// The name of the record.
	Name string `pulumi:"name"`
	// The priority of the record.
	Priority *int `pulumi:"priority"`
	// Whether the record gets Cloudflare's origin protection.
	Proxied *bool `pulumi:"proxied"`
	// Custom tags for the DNS record.
	Tags []string `pulumi:"tags"`
	// The TTL of the record.
	Ttl *int `pulumi:"ttl"`
	// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
	// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
	Type string `pulumi:"type"`
	// The value of the record.
	Value *string `pulumi:"value"`
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId string `pulumi:"zoneId"`
}

// The set of arguments for constructing a Record resource.
type RecordArgs struct {
	// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
	// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
	// from overwriting this record. **This configuration is not recommended for most environments**
	AllowOverwrite pulumi.BoolPtrInput
	// Comments or notes about the DNS record. This field has no effect on DNS responses.
	Comment pulumi.StringPtrInput
	// Map of attributes that constitute the record value. Conflicts with `value`.
	Data RecordDataPtrInput
	// The name of the record.
	Name pulumi.StringInput
	// The priority of the record.
	Priority pulumi.IntPtrInput
	// Whether the record gets Cloudflare's origin protection.
	Proxied pulumi.BoolPtrInput
	// Custom tags for the DNS record.
	Tags pulumi.StringArrayInput
	// The TTL of the record.
	Ttl pulumi.IntPtrInput
	// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
	// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
	Type pulumi.StringInput
	// The value of the record.
	Value pulumi.StringPtrInput
	// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
	ZoneId pulumi.StringInput
}

func (RecordArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*recordArgs)(nil)).Elem()
}

type RecordInput interface {
	pulumi.Input

	ToRecordOutput() RecordOutput
	ToRecordOutputWithContext(ctx context.Context) RecordOutput
}

func (*Record) ElementType() reflect.Type {
	return reflect.TypeOf((**Record)(nil)).Elem()
}

func (i *Record) ToRecordOutput() RecordOutput {
	return i.ToRecordOutputWithContext(context.Background())
}

func (i *Record) ToRecordOutputWithContext(ctx context.Context) RecordOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordOutput)
}

// RecordArrayInput is an input type that accepts RecordArray and RecordArrayOutput values.
// You can construct a concrete instance of `RecordArrayInput` via:
//
//	RecordArray{ RecordArgs{...} }
type RecordArrayInput interface {
	pulumi.Input

	ToRecordArrayOutput() RecordArrayOutput
	ToRecordArrayOutputWithContext(context.Context) RecordArrayOutput
}

type RecordArray []RecordInput

func (RecordArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Record)(nil)).Elem()
}

func (i RecordArray) ToRecordArrayOutput() RecordArrayOutput {
	return i.ToRecordArrayOutputWithContext(context.Background())
}

func (i RecordArray) ToRecordArrayOutputWithContext(ctx context.Context) RecordArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordArrayOutput)
}

// RecordMapInput is an input type that accepts RecordMap and RecordMapOutput values.
// You can construct a concrete instance of `RecordMapInput` via:
//
//	RecordMap{ "key": RecordArgs{...} }
type RecordMapInput interface {
	pulumi.Input

	ToRecordMapOutput() RecordMapOutput
	ToRecordMapOutputWithContext(context.Context) RecordMapOutput
}

type RecordMap map[string]RecordInput

func (RecordMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Record)(nil)).Elem()
}

func (i RecordMap) ToRecordMapOutput() RecordMapOutput {
	return i.ToRecordMapOutputWithContext(context.Background())
}

func (i RecordMap) ToRecordMapOutputWithContext(ctx context.Context) RecordMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordMapOutput)
}

type RecordOutput struct{ *pulumi.OutputState }

func (RecordOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Record)(nil)).Elem()
}

func (o RecordOutput) ToRecordOutput() RecordOutput {
	return o
}

func (o RecordOutput) ToRecordOutputWithContext(ctx context.Context) RecordOutput {
	return o
}

// Allow creation of this record in Terraform to overwrite an existing record, if any. This does not affect the ability to
// update the record in Terraform and does not prevent other resources within Terraform or manual changes outside Terraform
// from overwriting this record. **This configuration is not recommended for most environments**
func (o RecordOutput) AllowOverwrite() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.BoolPtrOutput { return v.AllowOverwrite }).(pulumi.BoolPtrOutput)
}

// Comments or notes about the DNS record. This field has no effect on DNS responses.
func (o RecordOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The RFC3339 timestamp of when the record was created.
func (o RecordOutput) CreatedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.CreatedOn }).(pulumi.StringOutput)
}

// Map of attributes that constitute the record value. Conflicts with `value`.
func (o RecordOutput) Data() RecordDataPtrOutput {
	return o.ApplyT(func(v *Record) RecordDataPtrOutput { return v.Data }).(RecordDataPtrOutput)
}

// The FQDN of the record.
func (o RecordOutput) Hostname() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Hostname }).(pulumi.StringOutput)
}

// A key-value map of string metadata Cloudflare associates with the record.
func (o RecordOutput) Metadata() pulumi.MapOutput {
	return o.ApplyT(func(v *Record) pulumi.MapOutput { return v.Metadata }).(pulumi.MapOutput)
}

// The RFC3339 timestamp of when the record was last modified.
func (o RecordOutput) ModifiedOn() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.ModifiedOn }).(pulumi.StringOutput)
}

// The name of the record.
func (o RecordOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The priority of the record.
func (o RecordOutput) Priority() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.IntPtrOutput { return v.Priority }).(pulumi.IntPtrOutput)
}

// Shows whether this record can be proxied.
func (o RecordOutput) Proxiable() pulumi.BoolOutput {
	return o.ApplyT(func(v *Record) pulumi.BoolOutput { return v.Proxiable }).(pulumi.BoolOutput)
}

// Whether the record gets Cloudflare's origin protection.
func (o RecordOutput) Proxied() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Record) pulumi.BoolPtrOutput { return v.Proxied }).(pulumi.BoolPtrOutput)
}

// Custom tags for the DNS record.
func (o RecordOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Record) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The TTL of the record.
func (o RecordOutput) Ttl() pulumi.IntOutput {
	return o.ApplyT(func(v *Record) pulumi.IntOutput { return v.Ttl }).(pulumi.IntOutput)
}

// The type of the record. Available values: `A`, `AAAA`, `CAA`, `CNAME`, `TXT`, `SRV`, `LOC`, `MX`, `NS`, `SPF`, `CERT`,
// `DNSKEY`, `DS`, `NAPTR`, `SMIMEA`, `SSHFP`, `TLSA`, `URI`, `PTR`, `HTTPS`, `SVCB`
func (o RecordOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The value of the record.
func (o RecordOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
func (o RecordOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Record) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type RecordArrayOutput struct{ *pulumi.OutputState }

func (RecordArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Record)(nil)).Elem()
}

func (o RecordArrayOutput) ToRecordArrayOutput() RecordArrayOutput {
	return o
}

func (o RecordArrayOutput) ToRecordArrayOutputWithContext(ctx context.Context) RecordArrayOutput {
	return o
}

func (o RecordArrayOutput) Index(i pulumi.IntInput) RecordOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Record {
		return vs[0].([]*Record)[vs[1].(int)]
	}).(RecordOutput)
}

type RecordMapOutput struct{ *pulumi.OutputState }

func (RecordMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Record)(nil)).Elem()
}

func (o RecordMapOutput) ToRecordMapOutput() RecordMapOutput {
	return o
}

func (o RecordMapOutput) ToRecordMapOutputWithContext(ctx context.Context) RecordMapOutput {
	return o
}

func (o RecordMapOutput) MapIndex(k pulumi.StringInput) RecordOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Record {
		return vs[0].(map[string]*Record)[vs[1].(string)]
	}).(RecordOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RecordInput)(nil)).Elem(), &Record{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordArrayInput)(nil)).Elem(), RecordArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordMapInput)(nil)).Elem(), RecordMap{})
	pulumi.RegisterOutputType(RecordOutput{})
	pulumi.RegisterOutputType(RecordArrayOutput{})
	pulumi.RegisterOutputType(RecordMapOutput{})
}
