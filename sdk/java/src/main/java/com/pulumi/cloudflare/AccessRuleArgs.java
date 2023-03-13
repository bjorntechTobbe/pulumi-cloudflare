// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.AccessRuleConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleArgs Empty = new AccessRuleArgs();

    /**
     * The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="configuration", required=true)
    private Output<AccessRuleConfigurationArgs> configuration;

    /**
     * @return Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<AccessRuleConfigurationArgs> configuration() {
        return this.configuration;
    }

    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
     * 
     */
    @Import(name="mode", required=true)
    private Output<String> mode;

    /**
     * @return The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }

    /**
     * A personal note about the rule. Typically used as a reminder or explanation for the rule.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return A personal note about the rule. Typically used as a reminder or explanation for the rule.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AccessRuleArgs() {}

    private AccessRuleArgs(AccessRuleArgs $) {
        this.accountId = $.accountId;
        this.configuration = $.configuration;
        this.mode = $.mode;
        this.notes = $.notes;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleArgs $;

        public Builder() {
            $ = new AccessRuleArgs();
        }

        public Builder(AccessRuleArgs defaults) {
            $ = new AccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configuration Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<AccessRuleConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Rule configuration to apply to a matched request. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder configuration(AccessRuleConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param mode The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
         * 
         * @return builder
         * 
         */
        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The action to apply to a matched request. Available values: `block`, `challenge`, `whitelist`, `js_challenge`, `managed_challenge`.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param notes A personal note about the rule. Typically used as a reminder or explanation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes A personal note about the rule. Typically used as a reminder or explanation for the rule.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. Must provide only one of `account_id`, `zone_id`. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AccessRuleArgs build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
