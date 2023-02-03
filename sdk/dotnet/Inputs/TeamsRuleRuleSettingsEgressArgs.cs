// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class TeamsRuleRuleSettingsEgressArgs : global::Pulumi.ResourceArgs
    {
        [Input("ipv4", required: true)]
        public Input<string> Ipv4 { get; set; } = null!;

        [Input("ipv4Fallback")]
        public Input<string>? Ipv4Fallback { get; set; }

        [Input("ipv6", required: true)]
        public Input<string> Ipv6 { get; set; } = null!;

        public TeamsRuleRuleSettingsEgressArgs()
        {
        }
        public static new TeamsRuleRuleSettingsEgressArgs Empty => new TeamsRuleRuleSettingsEgressArgs();
    }
}
