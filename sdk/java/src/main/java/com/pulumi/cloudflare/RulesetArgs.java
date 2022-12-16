// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.RulesetRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RulesetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RulesetArgs Empty = new RulesetArgs();

    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Brief summary of the ruleset and its intended use.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief summary of the ruleset and its intended use.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    /**
     * @return Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    @Import(name="phase", required=true)
    private Output<String> phase;

    /**
     * @return Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
     * 
     */
    public Output<String> phase() {
        return this.phase;
    }

    /**
     * List of rules to apply to the ruleset.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<RulesetRuleArgs>> rules;

    /**
     * @return List of rules to apply to the ruleset.
     * 
     */
    public Optional<Output<List<RulesetRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * Name of entitlement that is shareable between entities.
     * 
     */
    @Import(name="shareableEntitlementName")
    private @Nullable Output<String> shareableEntitlementName;

    /**
     * @return Name of entitlement that is shareable between entities.
     * 
     */
    public Optional<Output<String>> shareableEntitlementName() {
        return Optional.ofNullable(this.shareableEntitlementName);
    }

    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private RulesetArgs() {}

    private RulesetArgs(RulesetArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.kind = $.kind;
        this.name = $.name;
        this.phase = $.phase;
        this.rules = $.rules;
        this.shareableEntitlementName = $.shareableEntitlementName;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RulesetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RulesetArgs $;

        public Builder() {
            $ = new RulesetArgs();
        }

        public Builder(RulesetArgs defaults) {
            $ = new RulesetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Conflicts with `zone_id`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description Brief summary of the ruleset and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief summary of the ruleset and its intended use.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kind Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
         * 
         * @return builder
         * 
         */
        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Type of Ruleset to create. Available values: `custom`, `managed`, `root`, `schema`, `zone`.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the ruleset. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param phase Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
         * 
         * @return builder
         * 
         */
        public Builder phase(Output<String> phase) {
            $.phase = phase;
            return this;
        }

        /**
         * @param phase Point in the request/response lifecycle where the ruleset will be created. Available values: `ddos_l4`, `ddos_l7`, `http_custom_errors`, `http_log_custom_fields`, `http_request_cache_settings`, `http_request_firewall_custom`, `http_request_firewall_managed`, `http_request_late_transform`, `http_request_late_transform_managed`, `http_request_main`, `http_request_origin`, `http_request_dynamic_redirect`, `http_request_redirect`, `http_request_sanitize`, `http_request_transform`, `http_response_firewall_managed`, `http_response_headers_transform`, `http_response_headers_transform_managed`, `magic_transit`, `http_ratelimit`, `http_request_sbfm`, `http_config_settings`.
         * 
         * @return builder
         * 
         */
        public Builder phase(String phase) {
            return phase(Output.of(phase));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<RulesetRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<RulesetRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of rules to apply to the ruleset.
         * 
         * @return builder
         * 
         */
        public Builder rules(RulesetRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param shareableEntitlementName Name of entitlement that is shareable between entities.
         * 
         * @return builder
         * 
         */
        public Builder shareableEntitlementName(@Nullable Output<String> shareableEntitlementName) {
            $.shareableEntitlementName = shareableEntitlementName;
            return this;
        }

        /**
         * @param shareableEntitlementName Name of entitlement that is shareable between entities.
         * 
         * @return builder
         * 
         */
        public Builder shareableEntitlementName(String shareableEntitlementName) {
            return shareableEntitlementName(Output.of(shareableEntitlementName));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Conflicts with `account_id`.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RulesetArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.phase = Objects.requireNonNull($.phase, "expected parameter 'phase' to be non-null");
            return $;
        }
    }

}
