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
    public sealed class AccessPolicyIncludeAuthContext
    {
        /// <summary>
        /// The ACID of the Authentication Context.
        /// </summary>
        public readonly string AcId;
        /// <summary>
        /// The ID of the Authentication Context.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The ID of the Azure identity provider.
        /// </summary>
        public readonly string IdentityProviderId;

        [OutputConstructor]
        private AccessPolicyIncludeAuthContext(
            string acId,

            string id,

            string identityProviderId)
        {
            AcId = acId;
            Id = id;
            IdentityProviderId = identityProviderId;
        }
    }
}
