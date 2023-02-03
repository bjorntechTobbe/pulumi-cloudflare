// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitCorrelateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set to 'nat', NAT support will be enabled for rate limiting. Available values: `nat`.
        /// </summary>
        [Input("by")]
        public Input<string>? By { get; set; }

        public RateLimitCorrelateGetArgs()
        {
        }
        public static new RateLimitCorrelateGetArgs Empty => new RateLimitCorrelateGetArgs();
    }
}
