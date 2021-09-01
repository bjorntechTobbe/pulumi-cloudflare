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
    public sealed class RulesetRuleActionParameter
    {
        /// <summary>
        /// Rule ID to apply the override to.
        /// </summary>
        public readonly string? Id;
        public readonly int? Increment;
        /// <summary>
        /// List of override configurations to apply to the ruleset (refer to the nested schema).
        /// </summary>
        public readonly Outputs.RulesetRuleActionParameterOverrides? Overrides;
        /// <summary>
        /// Products to target with the actions. Valid values are `"bic"`, `"hot"`, `"ratelimit"`, `"securityLevel"`, `"uablock"`, `"waf"` or `"zonelockdown"`.
        /// </summary>
        public readonly ImmutableArray<string> Products;
        /// <summary>
        /// Which ruleset to target. Valid value is `"current"`.
        /// </summary>
        public readonly string? Ruleset;
        /// <summary>
        /// List of URI properties to configure for the ruleset rule when performing URL rewrite transformations (refer to the nested schema).
        /// </summary>
        public readonly ImmutableArray<Outputs.RulesetRuleActionParameterUri> Uris;
        public readonly string? Version;

        [OutputConstructor]
        private RulesetRuleActionParameter(
            string? id,

            int? increment,

            Outputs.RulesetRuleActionParameterOverrides? overrides,

            ImmutableArray<string> products,

            string? ruleset,

            ImmutableArray<Outputs.RulesetRuleActionParameterUri> uris,

            string? version)
        {
            Id = id;
            Increment = increment;
            Overrides = overrides;
            Products = products;
            Ruleset = ruleset;
            Uris = uris;
            Version = version;
        }
    }
}
