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
    public sealed class AccessPolicyRequireAzure
    {
        /// <summary>
        /// The ID of the Azure identity provider.
        /// </summary>
        public readonly string? IdentityProviderId;
        /// <summary>
        /// The ID of the Azure group or user.
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private AccessPolicyRequireAzure(
            string? identityProviderId,

            ImmutableArray<string> ids)
        {
            IdentityProviderId = identityProviderId;
            Ids = ids;
        }
    }
}
