// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class EmailRoutingRuleMatcherArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Field for type matcher.
        /// </summary>
        [Input("field")]
        public Input<string>? Field { get; set; }

        /// <summary>
        /// Type of matcher. Available values: `literal`, `all`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Value for matcher.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public EmailRoutingRuleMatcherArgs()
        {
        }
        public static new EmailRoutingRuleMatcherArgs Empty => new EmailRoutingRuleMatcherArgs();
    }
}
