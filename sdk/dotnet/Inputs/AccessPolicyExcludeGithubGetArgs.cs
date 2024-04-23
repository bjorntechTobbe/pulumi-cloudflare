// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class AccessPolicyExcludeGithubGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("identityProviderId")]
        public Input<string>? IdentityProviderId { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("teams")]
        private InputList<string>? _teams;
        public InputList<string> Teams
        {
            get => _teams ?? (_teams = new InputList<string>());
            set => _teams = value;
        }

        public AccessPolicyExcludeGithubGetArgs()
        {
        }
        public static new AccessPolicyExcludeGithubGetArgs Empty => new AccessPolicyExcludeGithubGetArgs();
    }
}
