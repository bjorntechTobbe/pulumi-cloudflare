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
    public sealed class AccessApplicationScimConfig
    {
        /// <summary>
        /// Configuration for authenticating with the application's SCIM API. Allowed configurations are HTTP Basic, OAuth Bearer Token, and OAuth 2.
        /// </summary>
        public readonly Outputs.AccessApplicationScimConfigAuthentication? Authentication;
        /// <summary>
        /// If false, propagates DELETE requests to the target application for SCIM resources. If true, sets 'active' to false on the SCIM resource. Note: Some targets do not support DELETE operations.
        /// </summary>
        public readonly bool? DeactivateOnDelete;
        /// <summary>
        /// Whether SCIM provisioning is turned on for this application.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The ID of the Access IDP to be used as the source for SCIM resources to provision to this application.
        /// </summary>
        public readonly string IdpUid;
        /// <summary>
        /// A list of filters and transformations to apply to SCIM resources before provisioning them to the application. See below for nested schema.
        /// </summary>
        public readonly ImmutableArray<Outputs.AccessApplicationScimConfigMapping> Mappings;
        /// <summary>
        /// The base URI for the application's SCIM-compatible API.
        /// </summary>
        public readonly string RemoteUri;

        [OutputConstructor]
        private AccessApplicationScimConfig(
            Outputs.AccessApplicationScimConfigAuthentication? authentication,

            bool? deactivateOnDelete,

            bool? enabled,

            string idpUid,

            ImmutableArray<Outputs.AccessApplicationScimConfigMapping> mappings,

            string remoteUri)
        {
            Authentication = authentication;
            DeactivateOnDelete = deactivateOnDelete;
            Enabled = enabled;
            IdpUid = idpUid;
            Mappings = mappings;
            RemoteUri = remoteUri;
        }
    }
}
