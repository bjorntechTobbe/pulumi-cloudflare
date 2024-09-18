// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessGroupIncludeGithubGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of your Github identity provider.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        /// <summary>
        /// The name of the organization.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("teams")]
        private InputList<string>? _teams;

        /// <summary>
        /// The teams that should be matched.
        /// </summary>
        public InputList<string> Teams
        {
            get => _teams ?? (_teams = new InputList<string>());
            set => _teams = value;
        }

        public ZeroTrustAccessGroupIncludeGithubGetArgs()
        {
        }
        public static new ZeroTrustAccessGroupIncludeGithubGetArgs Empty => new ZeroTrustAccessGroupIncludeGithubGetArgs();
    }
}
