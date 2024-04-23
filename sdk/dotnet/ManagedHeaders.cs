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
    /// The [Cloudflare Managed Headers](https://developers.cloudflare.com/rules/transform/managed-transforms/)
    /// allows you to add or remove some predefined headers to one's
    /// requests or origin responses.
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
    ///     // Enable security headers using Managed Meaders
    ///     var example = new Cloudflare.ManagedHeaders("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         ManagedRequestHeaders = new[]
    ///         {
    ///             new Cloudflare.Inputs.ManagedHeadersManagedRequestHeaderArgs
    ///             {
    ///                 Id = "add_true_client_ip_headers",
    ///                 Enabled = true,
    ///             },
    ///         },
    ///         ManagedResponseHeaders = new[]
    ///         {
    ///             new Cloudflare.Inputs.ManagedHeadersManagedResponseHeaderArgs
    ///             {
    ///                 Id = "remove_x-powered-by_header",
    ///                 Enabled = true,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/managedHeaders:ManagedHeaders")]
    public partial class ManagedHeaders : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of managed request headers.
        /// </summary>
        [Output("managedRequestHeaders")]
        public Output<ImmutableArray<Outputs.ManagedHeadersManagedRequestHeader>> ManagedRequestHeaders { get; private set; } = null!;

        /// <summary>
        /// The list of managed response headers.
        /// </summary>
        [Output("managedResponseHeaders")]
        public Output<ImmutableArray<Outputs.ManagedHeadersManagedResponseHeader>> ManagedResponseHeaders { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedHeaders resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedHeaders(string name, ManagedHeadersArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/managedHeaders:ManagedHeaders", name, args ?? new ManagedHeadersArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedHeaders(string name, Input<string> id, ManagedHeadersState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/managedHeaders:ManagedHeaders", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ManagedHeaders resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedHeaders Get(string name, Input<string> id, ManagedHeadersState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedHeaders(name, id, state, options);
        }
    }

    public sealed class ManagedHeadersArgs : global::Pulumi.ResourceArgs
    {
        [Input("managedRequestHeaders")]
        private InputList<Inputs.ManagedHeadersManagedRequestHeaderArgs>? _managedRequestHeaders;

        /// <summary>
        /// The list of managed request headers.
        /// </summary>
        public InputList<Inputs.ManagedHeadersManagedRequestHeaderArgs> ManagedRequestHeaders
        {
            get => _managedRequestHeaders ?? (_managedRequestHeaders = new InputList<Inputs.ManagedHeadersManagedRequestHeaderArgs>());
            set => _managedRequestHeaders = value;
        }

        [Input("managedResponseHeaders")]
        private InputList<Inputs.ManagedHeadersManagedResponseHeaderArgs>? _managedResponseHeaders;

        /// <summary>
        /// The list of managed response headers.
        /// </summary>
        public InputList<Inputs.ManagedHeadersManagedResponseHeaderArgs> ManagedResponseHeaders
        {
            get => _managedResponseHeaders ?? (_managedResponseHeaders = new InputList<Inputs.ManagedHeadersManagedResponseHeaderArgs>());
            set => _managedResponseHeaders = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ManagedHeadersArgs()
        {
        }
        public static new ManagedHeadersArgs Empty => new ManagedHeadersArgs();
    }

    public sealed class ManagedHeadersState : global::Pulumi.ResourceArgs
    {
        [Input("managedRequestHeaders")]
        private InputList<Inputs.ManagedHeadersManagedRequestHeaderGetArgs>? _managedRequestHeaders;

        /// <summary>
        /// The list of managed request headers.
        /// </summary>
        public InputList<Inputs.ManagedHeadersManagedRequestHeaderGetArgs> ManagedRequestHeaders
        {
            get => _managedRequestHeaders ?? (_managedRequestHeaders = new InputList<Inputs.ManagedHeadersManagedRequestHeaderGetArgs>());
            set => _managedRequestHeaders = value;
        }

        [Input("managedResponseHeaders")]
        private InputList<Inputs.ManagedHeadersManagedResponseHeaderGetArgs>? _managedResponseHeaders;

        /// <summary>
        /// The list of managed response headers.
        /// </summary>
        public InputList<Inputs.ManagedHeadersManagedResponseHeaderGetArgs> ManagedResponseHeaders
        {
            get => _managedResponseHeaders ?? (_managedResponseHeaders = new InputList<Inputs.ManagedHeadersManagedResponseHeaderGetArgs>());
            set => _managedResponseHeaders = value;
        }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ManagedHeadersState()
        {
        }
        public static new ManagedHeadersState Empty => new ManagedHeadersState();
    }
}
