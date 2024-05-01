// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsAccountCustomCertificateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether TLS encryption should use a custom certificate.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// ID of custom certificate.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public TeamsAccountCustomCertificateGetArgs()
        {
        }
        public static new TeamsAccountCustomCertificateGetArgs Empty => new TeamsAccountCustomCertificateGetArgs();
    }
}
