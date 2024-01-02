// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersCacheKey {
    /**
     * @return Cache by device type.
     * 
     */
    private @Nullable Boolean cacheByDeviceType;
    /**
     * @return Cache deception armor.
     * 
     */
    private @Nullable Boolean cacheDeceptionArmor;
    /**
     * @return Custom key parameters for the request.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKey customKey;
    /**
     * @return Ignore query strings order.
     * 
     */
    private @Nullable Boolean ignoreQueryStringsOrder;

    private RulesetRuleActionParametersCacheKey() {}
    /**
     * @return Cache by device type.
     * 
     */
    public Optional<Boolean> cacheByDeviceType() {
        return Optional.ofNullable(this.cacheByDeviceType);
    }
    /**
     * @return Cache deception armor.
     * 
     */
    public Optional<Boolean> cacheDeceptionArmor() {
        return Optional.ofNullable(this.cacheDeceptionArmor);
    }
    /**
     * @return Custom key parameters for the request.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKey> customKey() {
        return Optional.ofNullable(this.customKey);
    }
    /**
     * @return Ignore query strings order.
     * 
     */
    public Optional<Boolean> ignoreQueryStringsOrder() {
        return Optional.ofNullable(this.ignoreQueryStringsOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersCacheKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean cacheByDeviceType;
        private @Nullable Boolean cacheDeceptionArmor;
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKey customKey;
        private @Nullable Boolean ignoreQueryStringsOrder;
        public Builder() {}
        public Builder(RulesetRuleActionParametersCacheKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheByDeviceType = defaults.cacheByDeviceType;
    	      this.cacheDeceptionArmor = defaults.cacheDeceptionArmor;
    	      this.customKey = defaults.customKey;
    	      this.ignoreQueryStringsOrder = defaults.ignoreQueryStringsOrder;
        }

        @CustomType.Setter
        public Builder cacheByDeviceType(@Nullable Boolean cacheByDeviceType) {

            this.cacheByDeviceType = cacheByDeviceType;
            return this;
        }
        @CustomType.Setter
        public Builder cacheDeceptionArmor(@Nullable Boolean cacheDeceptionArmor) {

            this.cacheDeceptionArmor = cacheDeceptionArmor;
            return this;
        }
        @CustomType.Setter
        public Builder customKey(@Nullable RulesetRuleActionParametersCacheKeyCustomKey customKey) {

            this.customKey = customKey;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreQueryStringsOrder(@Nullable Boolean ignoreQueryStringsOrder) {

            this.ignoreQueryStringsOrder = ignoreQueryStringsOrder;
            return this;
        }
        public RulesetRuleActionParametersCacheKey build() {
            final var _resultValue = new RulesetRuleActionParametersCacheKey();
            _resultValue.cacheByDeviceType = cacheByDeviceType;
            _resultValue.cacheDeceptionArmor = cacheDeceptionArmor;
            _resultValue.customKey = customKey;
            _resultValue.ignoreQueryStringsOrder = ignoreQueryStringsOrder;
            return _resultValue;
        }
    }
}
