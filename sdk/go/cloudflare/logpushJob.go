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

// ## Import
//
// Import an account-scoped job.
//
// ```sh
// $ pulumi import cloudflare:index/logpushJob:LogpushJob example account/<account_id>/<job_id>
// ```
//
//	Import a zone-scoped job.
//
// ```sh
// $ pulumi import cloudflare:index/logpushJob:LogpushJob example zone/<zone_id>/<job_id>
// ```
type LogpushJob struct {
	pulumi.CustomResourceState

	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrOutput `pulumi:"accountId"`
	// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
	Dataset pulumi.StringOutput `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringOutput `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
	Filter pulumi.StringPtrOutput `pulumi:"filter"`
	// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
	Frequency pulumi.StringPtrOutput `pulumi:"frequency"`
	// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
	Kind pulumi.StringPtrOutput `pulumi:"kind"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrOutput `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
	MaxUploadBytes pulumi.IntPtrOutput `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. Value must be between 30 and 300.
	MaxUploadIntervalSeconds pulumi.IntPtrOutput `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
	MaxUploadRecords pulumi.IntPtrOutput `pulumi:"maxUploadRecords"`
	// The name of the logpush job to create.
	Name pulumi.StringPtrOutput `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrOutput `pulumi:"ownershipChallenge"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrOutput `pulumi:"zoneId"`
}

// NewLogpushJob registers a new resource with the given unique name, arguments, and options.
func NewLogpushJob(ctx *pulumi.Context,
	name string, args *LogpushJobArgs, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Dataset == nil {
		return nil, errors.New("invalid value for required argument 'Dataset'")
	}
	if args.DestinationConf == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConf'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogpushJob
	err := ctx.RegisterResource("cloudflare:index/logpushJob:LogpushJob", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogpushJob gets an existing LogpushJob resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogpushJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogpushJobState, opts ...pulumi.ResourceOption) (*LogpushJob, error) {
	var resource LogpushJob
	err := ctx.ReadResource("cloudflare:index/logpushJob:LogpushJob", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogpushJob resources.
type logpushJobState struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
	Dataset *string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf *string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
	Filter *string `pulumi:"filter"`
	// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
	Frequency *string `pulumi:"frequency"`
	// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
	Kind *string `pulumi:"kind"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
	MaxUploadBytes *int `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. Value must be between 30 and 300.
	MaxUploadIntervalSeconds *int `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
	MaxUploadRecords *int `pulumi:"maxUploadRecords"`
	// The name of the logpush job to create.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId *string `pulumi:"zoneId"`
}

type LogpushJobState struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrInput
	// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
	Dataset pulumi.StringPtrInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringPtrInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
	Filter pulumi.StringPtrInput
	// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
	Frequency pulumi.StringPtrInput
	// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
	Kind pulumi.StringPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
	MaxUploadBytes pulumi.IntPtrInput
	// The maximum interval in seconds for log batches. Value must be between 30 and 300.
	MaxUploadIntervalSeconds pulumi.IntPtrInput
	// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
	MaxUploadRecords pulumi.IntPtrInput
	// The name of the logpush job to create.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrInput
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobState) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobState)(nil)).Elem()
}

type logpushJobArgs struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId *string `pulumi:"accountId"`
	// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
	Dataset string `pulumi:"dataset"`
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf string `pulumi:"destinationConf"`
	// Whether to enable the job.
	Enabled *bool `pulumi:"enabled"`
	// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
	Filter *string `pulumi:"filter"`
	// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
	Frequency *string `pulumi:"frequency"`
	// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
	Kind *string `pulumi:"kind"`
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions *string `pulumi:"logpullOptions"`
	// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
	MaxUploadBytes *int `pulumi:"maxUploadBytes"`
	// The maximum interval in seconds for log batches. Value must be between 30 and 300.
	MaxUploadIntervalSeconds *int `pulumi:"maxUploadIntervalSeconds"`
	// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
	MaxUploadRecords *int `pulumi:"maxUploadRecords"`
	// The name of the logpush job to create.
	Name *string `pulumi:"name"`
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge *string `pulumi:"ownershipChallenge"`
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId *string `pulumi:"zoneId"`
}

// The set of arguments for constructing a LogpushJob resource.
type LogpushJobArgs struct {
	// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	AccountId pulumi.StringPtrInput
	// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
	Dataset pulumi.StringInput
	// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
	DestinationConf pulumi.StringInput
	// Whether to enable the job.
	Enabled pulumi.BoolPtrInput
	// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
	Filter pulumi.StringPtrInput
	// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
	Frequency pulumi.StringPtrInput
	// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
	Kind pulumi.StringPtrInput
	// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
	LogpullOptions pulumi.StringPtrInput
	// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
	MaxUploadBytes pulumi.IntPtrInput
	// The maximum interval in seconds for log batches. Value must be between 30 and 300.
	MaxUploadIntervalSeconds pulumi.IntPtrInput
	// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
	MaxUploadRecords pulumi.IntPtrInput
	// The name of the logpush job to create.
	Name pulumi.StringPtrInput
	// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
	OwnershipChallenge pulumi.StringPtrInput
	// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
	ZoneId pulumi.StringPtrInput
}

func (LogpushJobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logpushJobArgs)(nil)).Elem()
}

type LogpushJobInput interface {
	pulumi.Input

	ToLogpushJobOutput() LogpushJobOutput
	ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput
}

func (*LogpushJob) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (i *LogpushJob) ToLogpushJobOutput() LogpushJobOutput {
	return i.ToLogpushJobOutputWithContext(context.Background())
}

func (i *LogpushJob) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobOutput)
}

// LogpushJobArrayInput is an input type that accepts LogpushJobArray and LogpushJobArrayOutput values.
// You can construct a concrete instance of `LogpushJobArrayInput` via:
//
//	LogpushJobArray{ LogpushJobArgs{...} }
type LogpushJobArrayInput interface {
	pulumi.Input

	ToLogpushJobArrayOutput() LogpushJobArrayOutput
	ToLogpushJobArrayOutputWithContext(context.Context) LogpushJobArrayOutput
}

type LogpushJobArray []LogpushJobInput

func (LogpushJobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobArray) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return i.ToLogpushJobArrayOutputWithContext(context.Background())
}

func (i LogpushJobArray) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobArrayOutput)
}

// LogpushJobMapInput is an input type that accepts LogpushJobMap and LogpushJobMapOutput values.
// You can construct a concrete instance of `LogpushJobMapInput` via:
//
//	LogpushJobMap{ "key": LogpushJobArgs{...} }
type LogpushJobMapInput interface {
	pulumi.Input

	ToLogpushJobMapOutput() LogpushJobMapOutput
	ToLogpushJobMapOutputWithContext(context.Context) LogpushJobMapOutput
}

type LogpushJobMap map[string]LogpushJobInput

func (LogpushJobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (i LogpushJobMap) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return i.ToLogpushJobMapOutputWithContext(context.Background())
}

func (i LogpushJobMap) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogpushJobMapOutput)
}

type LogpushJobOutput struct{ *pulumi.OutputState }

func (LogpushJobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogpushJob)(nil)).Elem()
}

func (o LogpushJobOutput) ToLogpushJobOutput() LogpushJobOutput {
	return o
}

func (o LogpushJobOutput) ToLogpushJobOutputWithContext(ctx context.Context) LogpushJobOutput {
	return o
}

// The account identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
func (o LogpushJobOutput) AccountId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.AccountId }).(pulumi.StringPtrOutput)
}

// The kind of the dataset to use with the logpush job. Available values: `accessRequests`, `casbFindings`, `firewallEvents`, `httpRequests`, `spectrumEvents`, `nelReports`, `auditLogs`, `gatewayDns`, `gatewayHttp`, `gatewayNetwork`, `dnsLogs`, `networkAnalyticsLogs`, `workersTraceEvents`, `devicePostureResults`, `zeroTrustNetworkSessions`, `magicIdsDetections`.
func (o LogpushJobOutput) Dataset() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.Dataset }).(pulumi.StringOutput)
}

// Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/reference/logpush-api-configuration#destination).
func (o LogpushJobOutput) DestinationConf() pulumi.StringOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringOutput { return v.DestinationConf }).(pulumi.StringOutput)
}

// Whether to enable the job.
func (o LogpushJobOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// Use filters to select the events to include and/or remove from your logs. For more information, refer to [Filters](https://developers.cloudflare.com/logs/reference/logpush-api-configuration/filters/).
func (o LogpushJobOutput) Filter() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Filter }).(pulumi.StringPtrOutput)
}

// A higher frequency will result in logs being pushed on faster with smaller files. `low` frequency will push logs less often with larger files. Available values: `high`, `low`. Defaults to `high`.
func (o LogpushJobOutput) Frequency() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Frequency }).(pulumi.StringPtrOutput)
}

// The kind of logpush job to create. Available values: `edge`, `instant-logs`, `""`.
func (o LogpushJobOutput) Kind() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Kind }).(pulumi.StringPtrOutput)
}

// Configuration string for the Logshare API. It specifies things like requested fields and timestamp formats. See [Logpush options documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#options).
func (o LogpushJobOutput) LogpullOptions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.LogpullOptions }).(pulumi.StringPtrOutput)
}

// The maximum uncompressed file size of a batch of logs. Value must be between 5MB and 1GB.
func (o LogpushJobOutput) MaxUploadBytes() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntPtrOutput { return v.MaxUploadBytes }).(pulumi.IntPtrOutput)
}

// The maximum interval in seconds for log batches. Value must be between 30 and 300.
func (o LogpushJobOutput) MaxUploadIntervalSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntPtrOutput { return v.MaxUploadIntervalSeconds }).(pulumi.IntPtrOutput)
}

// The maximum number of log lines per batch. Value must be between 1000 and 1,000,000.
func (o LogpushJobOutput) MaxUploadRecords() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.IntPtrOutput { return v.MaxUploadRecords }).(pulumi.IntPtrOutput)
}

// The name of the logpush job to create.
func (o LogpushJobOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.Name }).(pulumi.StringPtrOutput)
}

// Ownership challenge token to prove destination ownership, required when destination is Amazon S3, Google Cloud Storage, Microsoft Azure or Sumo Logic. See [Developer documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#usage).
func (o LogpushJobOutput) OwnershipChallenge() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.OwnershipChallenge }).(pulumi.StringPtrOutput)
}

// The zone identifier to target for the resource. Must provide only one of `accountId`, `zoneId`.
func (o LogpushJobOutput) ZoneId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *LogpushJob) pulumi.StringPtrOutput { return v.ZoneId }).(pulumi.StringPtrOutput)
}

type LogpushJobArrayOutput struct{ *pulumi.OutputState }

func (LogpushJobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutput() LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) ToLogpushJobArrayOutputWithContext(ctx context.Context) LogpushJobArrayOutput {
	return o
}

func (o LogpushJobArrayOutput) Index(i pulumi.IntInput) LogpushJobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].([]*LogpushJob)[vs[1].(int)]
	}).(LogpushJobOutput)
}

type LogpushJobMapOutput struct{ *pulumi.OutputState }

func (LogpushJobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogpushJob)(nil)).Elem()
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutput() LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) ToLogpushJobMapOutputWithContext(ctx context.Context) LogpushJobMapOutput {
	return o
}

func (o LogpushJobMapOutput) MapIndex(k pulumi.StringInput) LogpushJobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogpushJob {
		return vs[0].(map[string]*LogpushJob)[vs[1].(string)]
	}).(LogpushJobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobInput)(nil)).Elem(), &LogpushJob{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobArrayInput)(nil)).Elem(), LogpushJobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogpushJobMapInput)(nil)).Elem(), LogpushJobMap{})
	pulumi.RegisterOutputType(LogpushJobOutput{})
	pulumi.RegisterOutputType(LogpushJobArrayOutput{})
	pulumi.RegisterOutputType(LogpushJobMapOutput{})
}
