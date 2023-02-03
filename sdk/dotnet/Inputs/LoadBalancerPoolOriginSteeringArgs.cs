// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class LoadBalancerPoolOriginSteeringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Origin steering policy to be used. Available values: ``,`hash`,`random`. Defaults to`random`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        public LoadBalancerPoolOriginSteeringArgs()
        {
        }
        public static new LoadBalancerPoolOriginSteeringArgs Empty => new LoadBalancerPoolOriginSteeringArgs();
    }
}
