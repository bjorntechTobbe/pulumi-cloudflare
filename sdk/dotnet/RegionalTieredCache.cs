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
    /// Instructs Cloudflare to check a regional hub data center on the way to your upper tier.
    /// This can help improve performance for smart and custom tiered cache topologies.
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
    ///     var example = new Cloudflare.RegionalTieredCache("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Value = "on",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/regionalTieredCache:RegionalTieredCache example &lt;zone_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/regionalTieredCache:RegionalTieredCache")]
    public partial class RegionalTieredCache : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Value of the Regional Tiered Cache zone setting.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a RegionalTieredCache resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionalTieredCache(string name, RegionalTieredCacheArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/regionalTieredCache:RegionalTieredCache", name, args ?? new RegionalTieredCacheArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionalTieredCache(string name, Input<string> id, RegionalTieredCacheState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/regionalTieredCache:RegionalTieredCache", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RegionalTieredCache resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionalTieredCache Get(string name, Input<string> id, RegionalTieredCacheState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionalTieredCache(name, id, state, options);
        }
    }

    public sealed class RegionalTieredCacheArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value of the Regional Tiered Cache zone setting.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public RegionalTieredCacheArgs()
        {
        }
        public static new RegionalTieredCacheArgs Empty => new RegionalTieredCacheArgs();
    }

    public sealed class RegionalTieredCacheState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Value of the Regional Tiered Cache zone setting.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RegionalTieredCacheState()
        {
        }
        public static new RegionalTieredCacheState Empty => new RegionalTieredCacheState();
    }
}
