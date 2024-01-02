// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * A description of the rule to help identify it.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the rule to help identify it.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
     * 
     */
    @Import(name="filterId", required=true)
    private Output<String> filterId;

    /**
     * @return The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
     * 
     */
    public Output<String> filterId() {
        return this.filterId;
    }

    /**
     * Whether this filter based firewall rule is currently paused.
     * 
     */
    @Import(name="paused")
    private @Nullable Output<Boolean> paused;

    /**
     * @return Whether this filter based firewall rule is currently paused.
     * 
     */
    public Optional<Output<Boolean>> paused() {
        return Optional.ofNullable(this.paused);
    }

    /**
     * The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
     * 
     */
    @Import(name="products")
    private @Nullable Output<List<String>> products;

    /**
     * @return List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
     * 
     */
    public Optional<Output<List<String>>> products() {
        return Optional.ofNullable(this.products);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.action = $.action;
        this.description = $.description;
        this.filterId = $.filterId;
        this.paused = $.paused;
        this.priority = $.priority;
        this.products = $.products;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The action to apply to a matched request. Available values: `block`, `challenge`, `allow`, `js_challenge`, `managed_challenge`, `log`, `bypass`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description A description of the rule to help identify it.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the rule to help identify it.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param filterId The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder filterId(Output<String> filterId) {
            $.filterId = filterId;
            return this;
        }

        /**
         * @param filterId The identifier of the Filter to use for determining if the Firewall Rule should be triggered.
         * 
         * @return builder
         * 
         */
        public Builder filterId(String filterId) {
            return filterId(Output.of(filterId));
        }

        /**
         * @param paused Whether this filter based firewall rule is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(@Nullable Output<Boolean> paused) {
            $.paused = paused;
            return this;
        }

        /**
         * @param paused Whether this filter based firewall rule is currently paused.
         * 
         * @return builder
         * 
         */
        public Builder paused(Boolean paused) {
            return paused(Output.of(paused));
        }

        /**
         * @param priority The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the rule to allow control of processing order. A lower number indicates high priority. If not provided, any rules with a priority will be sequenced before those without.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param products List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
         * 
         * @return builder
         * 
         */
        public Builder products(@Nullable Output<List<String>> products) {
            $.products = products;
            return this;
        }

        /**
         * @param products List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
         * 
         * @return builder
         * 
         */
        public Builder products(List<String> products) {
            return products(Output.of(products));
        }

        /**
         * @param products List of products to bypass for a request when the bypass action is used. Available values: `zoneLockdown`, `uaBlock`, `bic`, `hot`, `securityLevel`, `rateLimit`, `waf`.
         * 
         * @return builder
         * 
         */
        public Builder products(String... products) {
            return products(List.of(products));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public FirewallRuleArgs build() {
            if ($.action == null) {
                throw new MissingRequiredPropertyException("FirewallRuleArgs", "action");
            }
            if ($.filterId == null) {
                throw new MissingRequiredPropertyException("FirewallRuleArgs", "filterId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("FirewallRuleArgs", "zoneId");
            }
            return $;
        }
    }

}
