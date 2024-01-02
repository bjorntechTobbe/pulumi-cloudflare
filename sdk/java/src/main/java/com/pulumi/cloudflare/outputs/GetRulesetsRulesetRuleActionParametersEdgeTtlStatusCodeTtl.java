// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl {
    private @Nullable Integer statusCode;
    private @Nullable List<GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange> statusCodeRanges;
    private Integer value;

    private GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl() {}
    public Optional<Integer> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    public List<GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange> statusCodeRanges() {
        return this.statusCodeRanges == null ? List.of() : this.statusCodeRanges;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer statusCode;
        private @Nullable List<GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange> statusCodeRanges;
        private Integer value;
        public Builder() {}
        public Builder(GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statusCode = defaults.statusCode;
    	      this.statusCodeRanges = defaults.statusCodeRanges;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder statusCode(@Nullable Integer statusCode) {

            this.statusCode = statusCode;
            return this;
        }
        @CustomType.Setter
        public Builder statusCodeRanges(@Nullable List<GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange> statusCodeRanges) {

            this.statusCodeRanges = statusCodeRanges;
            return this;
        }
        public Builder statusCodeRanges(GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtlStatusCodeRange... statusCodeRanges) {
            return statusCodeRanges(List.of(statusCodeRanges));
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl", "value");
            }
            this.value = value;
            return this;
        }
        public GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl build() {
            final var _resultValue = new GetRulesetsRulesetRuleActionParametersEdgeTtlStatusCodeTtl();
            _resultValue.statusCode = statusCode;
            _resultValue.statusCodeRanges = statusCodeRanges;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
