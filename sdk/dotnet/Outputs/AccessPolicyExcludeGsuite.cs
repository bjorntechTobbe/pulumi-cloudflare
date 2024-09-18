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
    public sealed class AccessPolicyExcludeGsuite
    {
        /// <summary>
        /// The email of the Google Workspace group.
        /// </summary>
        public readonly ImmutableArray<string> Emails;
        /// <summary>
        /// The ID of your Google Workspace identity provider.
        /// </summary>
        public readonly string? IdentityProviderId;

        [OutputConstructor]
        private AccessPolicyExcludeGsuite(
            ImmutableArray<string> emails,

            string? identityProviderId)
        {
            Emails = emails;
            IdentityProviderId = identityProviderId;
        }
    }
}
