// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerSessionAffinityAttributeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures the drain duration in seconds. This field is only used when session affinity is enabled on the load balancer. Defaults to `0`.
        /// </summary>
        [Input("drainDuration")]
        public Input<int>? DrainDuration { get; set; }

        /// <summary>
        /// Configures the SameSite attribute on session affinity cookie. Value `Auto` will be translated to `Lax` or `None` depending if Always Use HTTPS is enabled. Note: when using value `None`, then you can not set `secure="Never"`. Available values: `Auto`, `Lax`, `None`, `Strict`. Defaults to `Auto`.
        /// </summary>
        [Input("samesite")]
        public Input<string>? Samesite { get; set; }

        /// <summary>
        /// Configures the Secure attribute on session affinity cookie. Value `Always` indicates the Secure attribute will be set in the Set-Cookie header, `Never` indicates the Secure attribute will not be set, and `Auto` will set the Secure attribute depending if Always Use HTTPS is enabled. Available values: `Auto`, `Always`, `Never`. Defaults to `Auto`.
        /// </summary>
        [Input("secure")]
        public Input<string>? Secure { get; set; }

        /// <summary>
        /// Configures the zero-downtime failover between origins within a pool when session affinity is enabled. Value `none` means no failover takes place for sessions pinned to the origin. Value `temporary` means traffic will be sent to another other healthy origin until the originally pinned origin is available; note that this can potentially result in heavy origin flapping. Value `sticky` means the session affinity cookie is updated and subsequent requests are sent to the new origin. This feature is currently incompatible with Argo, Tiered Cache, and Bandwidth Alliance. Available values: `none`, `temporary`, `sticky`. Defaults to `none`.
        /// </summary>
        [Input("zeroDowntimeFailover")]
        public Input<string>? ZeroDowntimeFailover { get; set; }

        public LoadBalancerSessionAffinityAttributeArgs()
        {
        }
        public static new LoadBalancerSessionAffinityAttributeArgs Empty => new LoadBalancerSessionAffinityAttributeArgs();
    }
}
