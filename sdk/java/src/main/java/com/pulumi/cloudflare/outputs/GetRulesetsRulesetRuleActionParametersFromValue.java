// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersFromValueTargetUrl;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersFromValue {
    /**
     * @return Preserve query string for redirect URL.
     * 
     */
    private @Nullable Boolean preserveQueryString;
    /**
     * @return Status code for redirect.
     * 
     */
    private @Nullable Integer statusCode;
    /**
     * @return Target URL for redirect.
     * 
     */
    private @Nullable GetRulesetsRulesetRuleActionParametersFromValueTargetUrl targetUrl;

    private GetRulesetsRulesetRuleActionParametersFromValue() {}
    /**
     * @return Preserve query string for redirect URL.
     * 
     */
    public Optional<Boolean> preserveQueryString() {
        return Optional.ofNullable(this.preserveQueryString);
    }
    /**
     * @return Status code for redirect.
     * 
     */
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * @return Target URL for redirect.
     * 
     */
    public Optional<GetRulesetsRulesetRuleActionParametersFromValueTargetUrl> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersFromValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean preserveQueryString;
        private @Nullable Integer statusCode;
        private @Nullable GetRulesetsRulesetRuleActionParametersFromValueTargetUrl targetUrl;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersFromValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preserveQueryString = defaults.preserveQueryString;
    	      this.statusCode = defaults.statusCode;
    	      this.targetUrl = defaults.targetUrl;
        }

        @CustomType.Setter
        public Builder preserveQueryString(@Nullable Boolean preserveQueryString) {

            this.preserveQueryString = preserveQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(@Nullable GetRulesetsRulesetRuleActionParametersFromValueTargetUrl targetUrl) {

            this.targetUrl = targetUrl;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersFromValue build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersFromValue();
            _resultValue.preserveQueryString = preserveQueryString;
            _resultValue.statusCode = statusCode;
            _resultValue.targetUrl = targetUrl;
            return _resultValue;
        }
    }
}
