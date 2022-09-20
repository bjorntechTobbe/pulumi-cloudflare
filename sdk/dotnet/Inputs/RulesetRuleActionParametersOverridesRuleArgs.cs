// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParametersOverridesRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to perform in the ruleset rule. Available values: `block`, `challenge`, `ddos_dynamic`, `execute`, `force_connection_close`, `js_challenge`, `log`, `log_custom_field`, `managed_challenge`, `redirect`, `rewrite`, `route`, `score`, `set_cache_settings`, `set_config`, `serve_error`, `skip`.
        /// </summary>
        [Input("action")]
        public Input<string>? Action { get; set; }

        /// <summary>
        /// Whether the rule is active.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Unique rule identifier.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("scoreThreshold")]
        public Input<int>? ScoreThreshold { get; set; }

        [Input("sensitivityLevel")]
        public Input<string>? SensitivityLevel { get; set; }

        [Input("status")]
        public Input<string>? Status { get; set; }

        public RulesetRuleActionParametersOverridesRuleArgs()
        {
        }
        public static new RulesetRuleActionParametersOverridesRuleArgs Empty => new RulesetRuleActionParametersOverridesRuleArgs();
    }
}
