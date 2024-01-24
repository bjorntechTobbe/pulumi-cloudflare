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
    /// The [Email Routing Address](https://developers.cloudflare.com/email-routing/setup/email-routing-addresses/#destination-addresses) resource allows you to manage Cloudflare Email Routing Destination Addresses.
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
    ///     var example = new Cloudflare.EmailRoutingAddress("example", new()
    ///     {
    ///         AccountId = "f037e56e89293a057740de681ac9abbe",
    ///         Email = "user@example.com",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/emailRoutingAddress:EmailRoutingAddress example &lt;account_id&gt;/&lt;email_routing_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/emailRoutingAddress:EmailRoutingAddress")]
    public partial class EmailRoutingAddress : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// The date and time the destination address has been created.
        /// </summary>
        [Output("created")]
        public Output<string> Created { get; private set; } = null!;

        /// <summary>
        /// The contact email address of the user.
        /// </summary>
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        /// <summary>
        /// The date and time the destination address has been modified.
        /// </summary>
        [Output("modified")]
        public Output<string> Modified { get; private set; } = null!;

        /// <summary>
        /// Destination address identifier.
        /// </summary>
        [Output("tag")]
        public Output<string> Tag { get; private set; } = null!;

        /// <summary>
        /// The date and time the destination address has been verified. Null means not verified yet.
        /// </summary>
        [Output("verified")]
        public Output<string> Verified { get; private set; } = null!;


        /// <summary>
        /// Create a EmailRoutingAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EmailRoutingAddress(string name, EmailRoutingAddressArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, args ?? new EmailRoutingAddressArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EmailRoutingAddress(string name, Input<string> id, EmailRoutingAddressState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/emailRoutingAddress:EmailRoutingAddress", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EmailRoutingAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EmailRoutingAddress Get(string name, Input<string> id, EmailRoutingAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new EmailRoutingAddress(name, id, state, options);
        }
    }

    public sealed class EmailRoutingAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// The contact email address of the user.
        /// </summary>
        [Input("email", required: true)]
        public Input<string> Email { get; set; } = null!;

        public EmailRoutingAddressArgs()
        {
        }
        public static new EmailRoutingAddressArgs Empty => new EmailRoutingAddressArgs();
    }

    public sealed class EmailRoutingAddressState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The date and time the destination address has been created.
        /// </summary>
        [Input("created")]
        public Input<string>? Created { get; set; }

        /// <summary>
        /// The contact email address of the user.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// The date and time the destination address has been modified.
        /// </summary>
        [Input("modified")]
        public Input<string>? Modified { get; set; }

        /// <summary>
        /// Destination address identifier.
        /// </summary>
        [Input("tag")]
        public Input<string>? Tag { get; set; }

        /// <summary>
        /// The date and time the destination address has been verified. Null means not verified yet.
        /// </summary>
        [Input("verified")]
        public Input<string>? Verified { get; set; }

        public EmailRoutingAddressState()
        {
        }
        public static new EmailRoutingAddressState Empty => new EmailRoutingAddressState();
    }
}
