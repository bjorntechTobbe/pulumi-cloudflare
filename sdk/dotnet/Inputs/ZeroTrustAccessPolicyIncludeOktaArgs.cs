// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZeroTrustAccessPolicyIncludeOktaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of your Okta identity provider.
        /// </summary>
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        [Input("names")]
        private InputList<string>? _names;

        /// <summary>
        /// The name of the Okta Group.
        /// </summary>
        public InputList<string> Names
        {
            get => _names ?? (_names = new InputList<string>());
            set => _names = value;
        }

        public ZeroTrustAccessPolicyIncludeOktaArgs()
        {
        }
        public static new ZeroTrustAccessPolicyIncludeOktaArgs Empty => new ZeroTrustAccessPolicyIncludeOktaArgs();
    }
}
