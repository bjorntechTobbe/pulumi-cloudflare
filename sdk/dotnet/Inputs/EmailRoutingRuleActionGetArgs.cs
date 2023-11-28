// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class EmailRoutingRuleActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Type of supported action. Available values: `forward`, `worker`, `drop`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// An array with items in the following form. Only required when `type` is `forward` or `worker`.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public EmailRoutingRuleActionGetArgs()
        {
        }
        public static new EmailRoutingRuleActionGetArgs Empty => new EmailRoutingRuleActionGetArgs();
    }
}
