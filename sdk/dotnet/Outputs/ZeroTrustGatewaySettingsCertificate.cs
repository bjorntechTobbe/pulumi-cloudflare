// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class ZeroTrustGatewaySettingsCertificate
    {
        /// <summary>
        /// ID of certificate for TLS interception.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private ZeroTrustGatewaySettingsCertificate(string id)
        {
            Id = id;
        }
    }
}
