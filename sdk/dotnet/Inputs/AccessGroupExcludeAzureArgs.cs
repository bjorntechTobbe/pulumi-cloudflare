// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessGroupExcludeAzureArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Azure identity provider.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// The ID of the Azure group or user.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        public AccessGroupExcludeAzureArgs()
        {
        }
        public static new AccessGroupExcludeAzureArgs Empty => new AccessGroupExcludeAzureArgs();
    }
}
