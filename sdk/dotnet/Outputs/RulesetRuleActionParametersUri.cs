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
    public sealed class RulesetRuleActionParametersUri
    {
        public readonly bool Origin;
        public readonly Outputs.RulesetRuleActionParametersUriPath Path;
        public readonly Outputs.RulesetRuleActionParametersUriQuery Query;

        [OutputConstructor]
        private RulesetRuleActionParametersUri(
            bool origin,

            Outputs.RulesetRuleActionParametersUriPath path,

            Outputs.RulesetRuleActionParametersUriQuery query)
        {
            Origin = origin;
            Path = path;
            Query = query;
        }
    }
}
