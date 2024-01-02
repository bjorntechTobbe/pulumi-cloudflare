// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.LoadBalancerRuleFixedResponseArgs;
import com.pulumi.cloudflare.inputs.LoadBalancerRuleOverrideArgs;
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


public final class LoadBalancerRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerRuleArgs Empty = new LoadBalancerRuleArgs();

    /**
     * The statement to evaluate to determine if this rule&#39;s effects should be applied. An empty condition is always true. See [load balancing rules](https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules).
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return The statement to evaluate to determine if this rule&#39;s effects should be applied. An empty condition is always true. See [load balancing rules](https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules).
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * A disabled rule will not be executed.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return A disabled rule will not be executed.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Settings for a HTTP response to return directly to the eyeball if the condition is true. Note: `overrides` or `fixed_response` must be set.
     * 
     */
    @Import(name="fixedResponse")
    private @Nullable Output<LoadBalancerRuleFixedResponseArgs> fixedResponse;

    /**
     * @return Settings for a HTTP response to return directly to the eyeball if the condition is true. Note: `overrides` or `fixed_response` must be set.
     * 
     */
    public Optional<Output<LoadBalancerRuleFixedResponseArgs>> fixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }

    /**
     * Human readable name for this rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Human readable name for this rule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The load balancer settings to alter if this rule&#39;s `condition` is true. Note: `overrides` or `fixed_response` must be set.
     * 
     */
    @Import(name="overrides")
    private @Nullable Output<List<LoadBalancerRuleOverrideArgs>> overrides;

    /**
     * @return The load balancer settings to alter if this rule&#39;s `condition` is true. Note: `overrides` or `fixed_response` must be set.
     * 
     */
    public Optional<Output<List<LoadBalancerRuleOverrideArgs>>> overrides() {
        return Optional.ofNullable(this.overrides);
    }

    /**
     * Priority used when determining the order of rule execution. Lower values are executed first. If not provided, the list order will be used.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority used when determining the order of rule execution. Lower values are executed first. If not provided, the list order will be used.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Terminates indicates that if this rule is true no further rules should be executed. Note: setting a `fixed_response` forces this field to `true`.
     * 
     */
    @Import(name="terminates")
    private @Nullable Output<Boolean> terminates;

    /**
     * @return Terminates indicates that if this rule is true no further rules should be executed. Note: setting a `fixed_response` forces this field to `true`.
     * 
     */
    public Optional<Output<Boolean>> terminates() {
        return Optional.ofNullable(this.terminates);
    }

    private LoadBalancerRuleArgs() {}

    private LoadBalancerRuleArgs(LoadBalancerRuleArgs $) {
        this.condition = $.condition;
        this.disabled = $.disabled;
        this.fixedResponse = $.fixedResponse;
        this.name = $.name;
        this.overrides = $.overrides;
        this.priority = $.priority;
        this.terminates = $.terminates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerRuleArgs $;

        public Builder() {
            $ = new LoadBalancerRuleArgs();
        }

        public Builder(LoadBalancerRuleArgs defaults) {
            $ = new LoadBalancerRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The statement to evaluate to determine if this rule&#39;s effects should be applied. An empty condition is always true. See [load balancing rules](https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules).
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The statement to evaluate to determine if this rule&#39;s effects should be applied. An empty condition is always true. See [load balancing rules](https://developers.cloudflare.com/load-balancing/understand-basics/load-balancing-rules).
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param disabled A disabled rule will not be executed.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled A disabled rule will not be executed.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param fixedResponse Settings for a HTTP response to return directly to the eyeball if the condition is true. Note: `overrides` or `fixed_response` must be set.
         * 
         * @return builder
         * 
         */
        public Builder fixedResponse(@Nullable Output<LoadBalancerRuleFixedResponseArgs> fixedResponse) {
            $.fixedResponse = fixedResponse;
            return this;
        }

        /**
         * @param fixedResponse Settings for a HTTP response to return directly to the eyeball if the condition is true. Note: `overrides` or `fixed_response` must be set.
         * 
         * @return builder
         * 
         */
        public Builder fixedResponse(LoadBalancerRuleFixedResponseArgs fixedResponse) {
            return fixedResponse(Output.of(fixedResponse));
        }

        /**
         * @param name Human readable name for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Human readable name for this rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param overrides The load balancer settings to alter if this rule&#39;s `condition` is true. Note: `overrides` or `fixed_response` must be set.
         * 
         * @return builder
         * 
         */
        public Builder overrides(@Nullable Output<List<LoadBalancerRuleOverrideArgs>> overrides) {
            $.overrides = overrides;
            return this;
        }

        /**
         * @param overrides The load balancer settings to alter if this rule&#39;s `condition` is true. Note: `overrides` or `fixed_response` must be set.
         * 
         * @return builder
         * 
         */
        public Builder overrides(List<LoadBalancerRuleOverrideArgs> overrides) {
            return overrides(Output.of(overrides));
        }

        /**
         * @param overrides The load balancer settings to alter if this rule&#39;s `condition` is true. Note: `overrides` or `fixed_response` must be set.
         * 
         * @return builder
         * 
         */
        public Builder overrides(LoadBalancerRuleOverrideArgs... overrides) {
            return overrides(List.of(overrides));
        }

        /**
         * @param priority Priority used when determining the order of rule execution. Lower values are executed first. If not provided, the list order will be used.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority used when determining the order of rule execution. Lower values are executed first. If not provided, the list order will be used.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param terminates Terminates indicates that if this rule is true no further rules should be executed. Note: setting a `fixed_response` forces this field to `true`.
         * 
         * @return builder
         * 
         */
        public Builder terminates(@Nullable Output<Boolean> terminates) {
            $.terminates = terminates;
            return this;
        }

        /**
         * @param terminates Terminates indicates that if this rule is true no further rules should be executed. Note: setting a `fixed_response` forces this field to `true`.
         * 
         * @return builder
         * 
         */
        public Builder terminates(Boolean terminates) {
            return terminates(Output.of(terminates));
        }

        public LoadBalancerRuleArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("LoadBalancerRuleArgs", "name");
            }
            return $;
        }
    }

}
