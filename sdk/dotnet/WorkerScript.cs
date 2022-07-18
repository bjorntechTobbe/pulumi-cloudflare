// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `cloudflare.WorkerRoute`. _NOTE:_ This resource uses the Cloudflare account APIs. This requires setting the `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System;
    /// using System.IO;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// class MyStack : Stack
    /// {
    /// 	private static string ReadFileBase64(string path) {
    /// 		return Convert.ToBase64String(Encoding.UTF8.GetBytes(File.ReadAllText(path)))
    /// 	}
    /// 
    ///     public MyStack()
    ///     {
    ///         var myNamespace = new Cloudflare.WorkersKvNamespace("myNamespace", new Cloudflare.WorkersKvNamespaceArgs
    ///         {
    ///             Title = "example",
    ///         });
    ///         // Sets the script with the name "script_1"
    ///         var myScript = new Cloudflare.WorkerScript("myScript", new Cloudflare.WorkerScriptArgs
    ///         {
    ///             Name = "script_1",
    ///             Content = File.ReadAllText("script.js"),
    ///             KvNamespaceBindings = 
    ///             {
    ///                 new Cloudflare.Inputs.WorkerScriptKvNamespaceBindingArgs
    ///                 {
    ///                     Name = "MY_EXAMPLE_KV_NAMESPACE",
    ///                     NamespaceId = myNamespace.Id,
    ///                 },
    ///             },
    ///             PlainTextBindings = 
    ///             {
    ///                 new Cloudflare.Inputs.WorkerScriptPlainTextBindingArgs
    ///                 {
    ///                     Name = "MY_EXAMPLE_PLAIN_TEXT",
    ///                     Text = "foobar",
    ///                 },
    ///             },
    ///             SecretTextBindings = 
    ///             {
    ///                 new Cloudflare.Inputs.WorkerScriptSecretTextBindingArgs
    ///                 {
    ///                     Name = "MY_EXAMPLE_SECRET_TEXT",
    ///                     Text = @var.Secret_foo_value,
    ///                 },
    ///             },
    ///             WebassemblyBindings = 
    ///             {
    ///                 new Cloudflare.Inputs.WorkerScriptWebassemblyBindingArgs
    ///                 {
    ///                     Name = "MY_EXAMPLE_WASM",
    ///                     Module = ReadFileBase64("example.wasm"),
    ///                 },
    ///             },
    ///             ServiceBindings = 
    ///             {
    ///                 new Cloudflare.Inputs.WorkerScriptServiceBindingArgs
    ///                 {
    ///                     Name = "MY_SERVICE_BINDING",
    ///                     Service = "MY_SERVICE",
    ///                     Environment = "production",
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// To import a script, use a script name, e.g. `script_name`
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/workerScript:WorkerScript default script_name
    /// ```
    /// 
    ///  where- `script_name` - the script name
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workerScript:WorkerScript")]
    public partial class WorkerScript : Pulumi.CustomResource
    {
        /// <summary>
        /// The script content.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        [Output("kvNamespaceBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptKvNamespaceBinding>> KvNamespaceBindings { get; private set; } = null!;

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("plainTextBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptPlainTextBinding>> PlainTextBindings { get; private set; } = null!;

        [Output("secretTextBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptSecretTextBinding>> SecretTextBindings { get; private set; } = null!;

        [Output("serviceBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptServiceBinding>> ServiceBindings { get; private set; } = null!;

        [Output("webassemblyBindings")]
        public Output<ImmutableArray<Outputs.WorkerScriptWebassemblyBinding>> WebassemblyBindings { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerScript resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerScript(string name, WorkerScriptArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerScript:WorkerScript", name, args ?? new WorkerScriptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerScript(string name, Input<string> id, WorkerScriptState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerScript:WorkerScript", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkerScript resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerScript Get(string name, Input<string> id, WorkerScriptState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerScript(name, id, state, options);
        }
    }

    public sealed class WorkerScriptArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content", required: true)]
        public Input<string> Content { get; set; } = null!;

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkerScriptKvNamespaceBindingArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkerScriptKvNamespaceBindingArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkerScriptKvNamespaceBindingArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkerScriptPlainTextBindingArgs>? _plainTextBindings;
        public InputList<Inputs.WorkerScriptPlainTextBindingArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkerScriptPlainTextBindingArgs>());
            set => _plainTextBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkerScriptSecretTextBindingArgs>? _secretTextBindings;
        public InputList<Inputs.WorkerScriptSecretTextBindingArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkerScriptSecretTextBindingArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkerScriptServiceBindingArgs>? _serviceBindings;
        public InputList<Inputs.WorkerScriptServiceBindingArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkerScriptServiceBindingArgs>());
            set => _serviceBindings = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkerScriptWebassemblyBindingArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkerScriptWebassemblyBindingArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkerScriptWebassemblyBindingArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkerScriptArgs()
        {
        }
    }

    public sealed class WorkerScriptState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The script content.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("kvNamespaceBindings")]
        private InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs>? _kvNamespaceBindings;
        public InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs> KvNamespaceBindings
        {
            get => _kvNamespaceBindings ?? (_kvNamespaceBindings = new InputList<Inputs.WorkerScriptKvNamespaceBindingGetArgs>());
            set => _kvNamespaceBindings = value;
        }

        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("plainTextBindings")]
        private InputList<Inputs.WorkerScriptPlainTextBindingGetArgs>? _plainTextBindings;
        public InputList<Inputs.WorkerScriptPlainTextBindingGetArgs> PlainTextBindings
        {
            get => _plainTextBindings ?? (_plainTextBindings = new InputList<Inputs.WorkerScriptPlainTextBindingGetArgs>());
            set => _plainTextBindings = value;
        }

        [Input("secretTextBindings")]
        private InputList<Inputs.WorkerScriptSecretTextBindingGetArgs>? _secretTextBindings;
        public InputList<Inputs.WorkerScriptSecretTextBindingGetArgs> SecretTextBindings
        {
            get => _secretTextBindings ?? (_secretTextBindings = new InputList<Inputs.WorkerScriptSecretTextBindingGetArgs>());
            set => _secretTextBindings = value;
        }

        [Input("serviceBindings")]
        private InputList<Inputs.WorkerScriptServiceBindingGetArgs>? _serviceBindings;
        public InputList<Inputs.WorkerScriptServiceBindingGetArgs> ServiceBindings
        {
            get => _serviceBindings ?? (_serviceBindings = new InputList<Inputs.WorkerScriptServiceBindingGetArgs>());
            set => _serviceBindings = value;
        }

        [Input("webassemblyBindings")]
        private InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs>? _webassemblyBindings;
        public InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs> WebassemblyBindings
        {
            get => _webassemblyBindings ?? (_webassemblyBindings = new InputList<Inputs.WorkerScriptWebassemblyBindingGetArgs>());
            set => _webassemblyBindings = value;
        }

        public WorkerScriptState()
        {
        }
    }
}
