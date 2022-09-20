// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// ## Import
    /// 
    /// Import is not supported for this resource.
    /// </summary>
    [CloudflareResourceType("cloudflare:index/ruleset:Ruleset")]
    public partial class Ruleset : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// Brief summary of the ruleset and its intended use.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
        /// </summary>
        [Output("kind")]
        public Output<string> Kind { get; private set; } = null!;

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
        /// </summary>
        [Output("phase")]
        public Output<string> Phase { get; private set; } = null!;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.RulesetRule>> Rules { get; private set; } = null!;

        /// <summary>
        /// Name of entitlement that is shareable between entities.
        /// </summary>
        [Output("shareableEntitlementName")]
        public Output<string?> ShareableEntitlementName { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a Ruleset resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ruleset(string name, RulesetArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/ruleset:Ruleset", name, args ?? new RulesetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ruleset(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/ruleset:Ruleset", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Ruleset resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ruleset Get(string name, Input<string> id, RulesetState? state = null, CustomResourceOptions? options = null)
        {
            return new Ruleset(name, id, state, options);
        }
    }

    public sealed class RulesetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Brief summary of the ruleset and its intended use.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
        /// </summary>
        [Input("phase", required: true)]
        public Input<string> Phase { get; set; } = null!;

        [Input("rules")]
        private InputList<Inputs.RulesetRuleArgs>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputList<Inputs.RulesetRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RulesetRuleArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Name of entitlement that is shareable between entities.
        /// </summary>
        [Input("shareableEntitlementName")]
        public Input<string>? ShareableEntitlementName { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RulesetArgs()
        {
        }
        public static new RulesetArgs Empty => new RulesetArgs();
    }

    public sealed class RulesetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// Brief summary of the ruleset and its intended use.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Name of the ruleset.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
        /// </summary>
        [Input("phase")]
        public Input<string>? Phase { get; set; }

        [Input("rules")]
        private InputList<Inputs.RulesetRuleGetArgs>? _rules;

        /// <summary>
        /// List of rules to apply to the ruleset.
        /// </summary>
        public InputList<Inputs.RulesetRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.RulesetRuleGetArgs>());
            set => _rules = value;
        }

        /// <summary>
        /// Name of entitlement that is shareable between entities.
        /// </summary>
        [Input("shareableEntitlementName")]
        public Input<string>? ShareableEntitlementName { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public RulesetState()
        {
        }
        public static new RulesetState Empty => new RulesetState();
    }
}
