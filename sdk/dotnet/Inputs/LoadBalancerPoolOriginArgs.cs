// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        /// <summary>
        /// Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("headers")]
        private InputList<Inputs.LoadBalancerPoolOriginHeaderArgs>? _headers;

        /// <summary>
        /// HTTP request headers.
        /// </summary>
        public InputList<Inputs.LoadBalancerPoolOriginHeaderArgs> Headers
        {
            get => _headers ?? (_headers = new InputList<Inputs.LoadBalancerPoolOriginHeaderArgs>());
            set => _headers = value;
        }

        /// <summary>
        /// A human-identifiable name for the origin.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The virtual network subnet ID the origin belongs in. Virtual network must also belong to the account.
        /// </summary>
        [Input("virtualNetworkId")]
        public Input<string>? VirtualNetworkId { get; set; }

        /// <summary>
        /// The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. When `origin_steering.policy="least_outstanding_requests"`, weight is used to scale the origin's outstanding requests. When `origin_steering.policy="least_connections"`, weight is used to scale the origin's open connections. Defaults to `1`.
        /// </summary>
        [Input("weight")]
        public Input<double>? Weight { get; set; }

        public LoadBalancerPoolOriginArgs()
        {
        }
        public static new LoadBalancerPoolOriginArgs Empty => new LoadBalancerPoolOriginArgs();
    }
}
