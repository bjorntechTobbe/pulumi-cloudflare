// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package cloudflare

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`. *NOTE:*  This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `accountId` provider argument.
//
// ## Import
//
// To import a script, use a script name, e.g. `script_name`
//
// ```sh
//  $ pulumi import cloudflare:index/workerScript:WorkerScript default script_name
// ```
//
//  where* `script_name` - the script name
type WorkerScript struct {
	pulumi.CustomResourceState

	// The script content.
	Content             pulumi.StringOutput                       `pulumi:"content"`
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayOutput `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringOutput                       `pulumi:"name"`
	PlainTextBindings   WorkerScriptPlainTextBindingArrayOutput   `pulumi:"plainTextBindings"`
	SecretTextBindings  WorkerScriptSecretTextBindingArrayOutput  `pulumi:"secretTextBindings"`
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayOutput `pulumi:"webassemblyBindings"`
}

// NewWorkerScript registers a new resource with the given unique name, arguments, and options.
func NewWorkerScript(ctx *pulumi.Context,
	name string, args *WorkerScriptArgs, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Content == nil {
		return nil, errors.New("invalid value for required argument 'Content'")
	}
	if args.Name == nil {
		return nil, errors.New("invalid value for required argument 'Name'")
	}
	var resource WorkerScript
	err := ctx.RegisterResource("cloudflare:index/workerScript:WorkerScript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkerScript gets an existing WorkerScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkerScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkerScriptState, opts ...pulumi.ResourceOption) (*WorkerScript, error) {
	var resource WorkerScript
	err := ctx.ReadResource("cloudflare:index/workerScript:WorkerScript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkerScript resources.
type workerScriptState struct {
	// The script content.
	Content             *string                          `pulumi:"content"`
	KvNamespaceBindings []WorkerScriptKvNamespaceBinding `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                *string                          `pulumi:"name"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

type WorkerScriptState struct {
	// The script content.
	Content             pulumi.StringPtrInput
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayInput
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringPtrInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptState)(nil)).Elem()
}

type workerScriptArgs struct {
	// The script content.
	Content             string                           `pulumi:"content"`
	KvNamespaceBindings []WorkerScriptKvNamespaceBinding `pulumi:"kvNamespaceBindings"`
	// The global variable for the binding in your Worker code.
	Name                string                           `pulumi:"name"`
	PlainTextBindings   []WorkerScriptPlainTextBinding   `pulumi:"plainTextBindings"`
	SecretTextBindings  []WorkerScriptSecretTextBinding  `pulumi:"secretTextBindings"`
	WebassemblyBindings []WorkerScriptWebassemblyBinding `pulumi:"webassemblyBindings"`
}

// The set of arguments for constructing a WorkerScript resource.
type WorkerScriptArgs struct {
	// The script content.
	Content             pulumi.StringInput
	KvNamespaceBindings WorkerScriptKvNamespaceBindingArrayInput
	// The global variable for the binding in your Worker code.
	Name                pulumi.StringInput
	PlainTextBindings   WorkerScriptPlainTextBindingArrayInput
	SecretTextBindings  WorkerScriptSecretTextBindingArrayInput
	WebassemblyBindings WorkerScriptWebassemblyBindingArrayInput
}

func (WorkerScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workerScriptArgs)(nil)).Elem()
}

type WorkerScriptInput interface {
	pulumi.Input

	ToWorkerScriptOutput() WorkerScriptOutput
	ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput
}

func (WorkerScript) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkerScript)(nil)).Elem()
}

func (i WorkerScript) ToWorkerScriptOutput() WorkerScriptOutput {
	return i.ToWorkerScriptOutputWithContext(context.Background())
}

func (i WorkerScript) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkerScriptOutput)
}

type WorkerScriptOutput struct {
	*pulumi.OutputState
}

func (WorkerScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*WorkerScriptOutput)(nil)).Elem()
}

func (o WorkerScriptOutput) ToWorkerScriptOutput() WorkerScriptOutput {
	return o
}

func (o WorkerScriptOutput) ToWorkerScriptOutputWithContext(ctx context.Context) WorkerScriptOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(WorkerScriptOutput{})
}
