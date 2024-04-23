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
    /// Provides a Cloudflare Worker secret resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var mySecret = new Cloudflare.WorkerSecret("my_secret", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Name = "MY_EXAMPLE_SECRET_TEXT",
    ///         ScriptName = "script_1",
    ///         SecretText = "my_secret_value",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/workerSecret:WorkerSecret example &lt;account_id&gt;/&lt;script_name&gt;/&lt;secret_name&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/workerSecret:WorkerSecret")]
    public partial class WorkerSecret : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("scriptName")]
        public Output<string> ScriptName { get; private set; } = null!;

        /// <summary>
        /// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("secretText")]
        public Output<string> SecretText { get; private set; } = null!;


        /// <summary>
        /// Create a WorkerSecret resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WorkerSecret(string name, WorkerSecretArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerSecret:WorkerSecret", name, args ?? new WorkerSecretArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WorkerSecret(string name, Input<string> id, WorkerSecretState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/workerSecret:WorkerSecret", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretText",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WorkerSecret resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WorkerSecret Get(string name, Input<string> id, WorkerSecretState? state = null, CustomResourceOptions? options = null)
        {
            return new WorkerSecret(name, id, state, options);
        }
    }

    public sealed class WorkerSecretArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("scriptName", required: true)]
        public Input<string> ScriptName { get; set; } = null!;

        [Input("secretText", required: true)]
        private Input<string>? _secretText;

        /// <summary>
        /// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public Input<string>? SecretText
        {
            get => _secretText;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretText = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WorkerSecretArgs()
        {
        }
        public static new WorkerSecretArgs Empty => new WorkerSecretArgs();
    }

    public sealed class WorkerSecretState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The name of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the Worker script to associate the secret with. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("scriptName")]
        public Input<string>? ScriptName { get; set; }

        [Input("secretText")]
        private Input<string>? _secretText;

        /// <summary>
        /// The text of the Worker secret. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        public Input<string>? SecretText
        {
            get => _secretText;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretText = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public WorkerSecretState()
        {
        }
        public static new WorkerSecretState Empty => new WorkerSecretState();
    }
}
