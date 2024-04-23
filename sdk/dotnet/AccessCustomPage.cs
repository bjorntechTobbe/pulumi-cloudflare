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
    /// Provides a resource to customize the pages your end users will see
    /// when trying to reach applications behind Cloudflare Access.
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
    ///     var example = new Cloudflare.AccessCustomPage("example", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Name = "example",
    ///         Type = "forbidden",
    ///         CustomHtml = "&lt;html&gt;&lt;body&gt;&lt;h1&gt;Forbidden&lt;/h1&gt;&lt;/body&gt;&lt;/html&gt;",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessCustomPage:AccessCustomPage")]
    public partial class AccessCustomPage : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Number of apps to display on the custom page.
        /// </summary>
        [Output("appCount")]
        public Output<int?> AppCount { get; private set; } = null!;

        /// <summary>
        /// Custom HTML to display on the custom page.
        /// </summary>
        [Output("customHtml")]
        public Output<string?> CustomHtml { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the Access Custom Page configuration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessCustomPage resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessCustomPage(string name, AccessCustomPageArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessCustomPage:AccessCustomPage", name, args ?? new AccessCustomPageArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessCustomPage(string name, Input<string> id, AccessCustomPageState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessCustomPage:AccessCustomPage", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessCustomPage resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessCustomPage Get(string name, Input<string> id, AccessCustomPageState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessCustomPage(name, id, state, options);
        }
    }

    public sealed class AccessCustomPageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Number of apps to display on the custom page.
        /// </summary>
        [Input("appCount")]
        public Input<int>? AppCount { get; set; }

        /// <summary>
        /// Custom HTML to display on the custom page.
        /// </summary>
        [Input("customHtml")]
        public Input<string>? CustomHtml { get; set; }

        /// <summary>
        /// Friendly name of the Access Custom Page configuration.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessCustomPageArgs()
        {
        }
        public static new AccessCustomPageArgs Empty => new AccessCustomPageArgs();
    }

    public sealed class AccessCustomPageState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Number of apps to display on the custom page.
        /// </summary>
        [Input("appCount")]
        public Input<int>? AppCount { get; set; }

        /// <summary>
        /// Custom HTML to display on the custom page.
        /// </summary>
        [Input("customHtml")]
        public Input<string>? CustomHtml { get; set; }

        /// <summary>
        /// Friendly name of the Access Custom Page configuration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Type of Access custom page to create. Available values: `identity_denied`, `forbidden`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessCustomPageState()
        {
        }
        public static new AccessCustomPageState Empty => new AccessCustomPageState();
    }
}
