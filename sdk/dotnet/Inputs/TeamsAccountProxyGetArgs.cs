// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountProxyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Sets the time limit in seconds that a user can use an override code to bypass WARP.
        /// </summary>
        [Input("disableForTime", required: true)]
        public Input<int> DisableForTime { get; set; } = null!;

        /// <summary>
        /// Whether root ca is enabled account wide for ZT clients.
        /// </summary>
        [Input("rootCa", required: true)]
        public Input<bool> RootCa { get; set; } = null!;

        /// <summary>
        /// Whether gateway proxy is enabled on gateway devices for TCP traffic.
        /// </summary>
        [Input("tcp", required: true)]
        public Input<bool> Tcp { get; set; } = null!;

        /// <summary>
        /// Whether gateway proxy is enabled on gateway devices for UDP traffic.
        /// </summary>
        [Input("udp", required: true)]
        public Input<bool> Udp { get; set; } = null!;

        /// <summary>
        /// Whether virtual IP (CGNAT) is enabled account wide and will override existing local interface IP for ZT clients.
        /// </summary>
        [Input("virtualIp", required: true)]
        public Input<bool> VirtualIp { get; set; } = null!;

        public TeamsAccountProxyGetArgs()
        {
        }
        public static new TeamsAccountProxyGetArgs Empty => new TeamsAccountProxyGetArgs();
    }
}
