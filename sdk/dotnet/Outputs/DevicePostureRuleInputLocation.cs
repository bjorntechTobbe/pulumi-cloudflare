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
    public sealed class DevicePostureRuleInputLocation
    {
        /// <summary>
        /// List of paths to check for client certificate rule.
        /// </summary>
        public readonly ImmutableArray<string> Paths;
        /// <summary>
        /// List of trust stores to check for client certificate rule. Available values: `system`, `user`.
        /// </summary>
        public readonly ImmutableArray<string> TrustStores;

        [OutputConstructor]
        private DevicePostureRuleInputLocation(
            ImmutableArray<string> paths,

            ImmutableArray<string> trustStores)
        {
            Paths = paths;
            TrustStores = trustStores;
        }
    }
}
