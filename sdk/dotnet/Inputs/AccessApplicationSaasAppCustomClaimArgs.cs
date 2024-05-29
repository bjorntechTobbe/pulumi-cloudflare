// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessApplicationSaasAppCustomClaimArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Friendly name of the Access Application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// True if the attribute must be always present.
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        /// <summary>
        /// The scope of the claim.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("source", required: true)]
        public Input<Inputs.AccessApplicationSaasAppCustomClaimSourceArgs> Source { get; set; } = null!;

        public AccessApplicationSaasAppCustomClaimArgs()
        {
        }
        public static new AccessApplicationSaasAppCustomClaimArgs Empty => new AccessApplicationSaasAppCustomClaimArgs();
    }
}
