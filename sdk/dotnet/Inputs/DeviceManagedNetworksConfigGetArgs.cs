// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class DeviceManagedNetworksConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The SHA-256 hash of the TLS certificate presented by the host found at tls_sockaddr. If absent, regular certificate verification (trusted roots, valid timestamp, etc) will be used to validate the certificate.
        /// </summary>
        [Input("sha256", required: true)]
        public Input<string> Sha256 { get; set; } = null!;

        /// <summary>
        /// A network address of the form "host:port" that the WARP client will use to detect the presence of a TLS host.
        /// </summary>
        [Input("tlsSockaddr", required: true)]
        public Input<string> TlsSockaddr { get; set; } = null!;

        public DeviceManagedNetworksConfigGetArgs()
        {
        }
        public static new DeviceManagedNetworksConfigGetArgs Empty => new DeviceManagedNetworksConfigGetArgs();
    }
}
