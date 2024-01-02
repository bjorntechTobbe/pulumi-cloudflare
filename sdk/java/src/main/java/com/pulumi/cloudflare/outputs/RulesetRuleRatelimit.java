// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleRatelimit {
    /**
     * @return List of parameters that define how Cloudflare tracks the request rate for this rule.
     * 
     */
    private @Nullable List<String> characteristics;
    /**
     * @return Criteria for counting HTTP requests to trigger the Rate Limiting action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    private @Nullable String countingExpression;
    /**
     * @return Once the request rate is reached, the Rate Limiting rule blocks further requests for the period of time defined in this field.
     * 
     */
    private @Nullable Integer mitigationTimeout;
    /**
     * @return The period of time to consider (in seconds) when evaluating the request rate.
     * 
     */
    private @Nullable Integer period;
    /**
     * @return The number of requests over the period of time that will trigger the Rate Limiting rule.
     * 
     */
    private @Nullable Integer requestsPerPeriod;
    /**
     * @return Whether to include requests to origin within the Rate Limiting count.
     * 
     */
    private @Nullable Boolean requestsToOrigin;
    /**
     * @return The maximum aggregate score over the period of time that will trigger Rate Limiting rule.
     * 
     */
    private @Nullable Integer scorePerPeriod;
    /**
     * @return Name of HTTP header in the response, set by the origin server, with the score for the current request.
     * 
     */
    private @Nullable String scoreResponseHeaderName;

    private RulesetRuleRatelimit() {}
    /**
     * @return List of parameters that define how Cloudflare tracks the request rate for this rule.
     * 
     */
    public List<String> characteristics() {
        return this.characteristics == null ? List.of() : this.characteristics;
    }
    /**
     * @return Criteria for counting HTTP requests to trigger the Rate Limiting action. Uses the Firewall Rules expression language based on Wireshark display filters. Refer to the [Firewall Rules language](https://developers.cloudflare.com/firewall/cf-firewall-language) documentation for all available fields, operators, and functions.
     * 
     */
    public Optional<String> countingExpression() {
        return Optional.ofNullable(this.countingExpression);
    }
    /**
     * @return Once the request rate is reached, the Rate Limiting rule blocks further requests for the period of time defined in this field.
     * 
     */
    public Optional<Integer> mitigationTimeout() {
        return Optional.ofNullable(this.mitigationTimeout);
    }
    /**
     * @return The period of time to consider (in seconds) when evaluating the request rate.
     * 
     */
    public Optional<Integer> period() {
        return Optional.ofNullable(this.period);
    }
    /**
     * @return The number of requests over the period of time that will trigger the Rate Limiting rule.
     * 
     */
    public Optional<Integer> requestsPerPeriod() {
        return Optional.ofNullable(this.requestsPerPeriod);
    }
    /**
     * @return Whether to include requests to origin within the Rate Limiting count.
     * 
     */
    public Optional<Boolean> requestsToOrigin() {
        return Optional.ofNullable(this.requestsToOrigin);
    }
    /**
     * @return The maximum aggregate score over the period of time that will trigger Rate Limiting rule.
     * 
     */
    public Optional<Integer> scorePerPeriod() {
        return Optional.ofNullable(this.scorePerPeriod);
    }
    /**
     * @return Name of HTTP header in the response, set by the origin server, with the score for the current request.
     * 
     */
    public Optional<String> scoreResponseHeaderName() {
        return Optional.ofNullable(this.scoreResponseHeaderName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleRatelimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> characteristics;
        private @Nullable String countingExpression;
        private @Nullable Integer mitigationTimeout;
        private @Nullable Integer period;
        private @Nullable Integer requestsPerPeriod;
        private @Nullable Boolean requestsToOrigin;
        private @Nullable Integer scorePerPeriod;
        private @Nullable String scoreResponseHeaderName;
        public Builder() {}
        public Builder(RulesetRuleRatelimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.characteristics = defaults.characteristics;
    	      this.countingExpression = defaults.countingExpression;
    	      this.mitigationTimeout = defaults.mitigationTimeout;
    	      this.period = defaults.period;
    	      this.requestsPerPeriod = defaults.requestsPerPeriod;
    	      this.requestsToOrigin = defaults.requestsToOrigin;
    	      this.scorePerPeriod = defaults.scorePerPeriod;
    	      this.scoreResponseHeaderName = defaults.scoreResponseHeaderName;
        }

        @CustomType.Setter
        public Builder characteristics(@Nullable List<String> characteristics) {

            this.characteristics = characteristics;
            return this;
        }
        public Builder characteristics(String... characteristics) {
            return characteristics(List.of(characteristics));
        }
        @CustomType.Setter
        public Builder countingExpression(@Nullable String countingExpression) {

            this.countingExpression = countingExpression;
            return this;
        }
        @CustomType.Setter
        public Builder mitigationTimeout(@Nullable Integer mitigationTimeout) {

            this.mitigationTimeout = mitigationTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder period(@Nullable Integer period) {

            this.period = period;
            return this;
        }
        @CustomType.Setter
        public Builder requestsPerPeriod(@Nullable Integer requestsPerPeriod) {

            this.requestsPerPeriod = requestsPerPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder requestsToOrigin(@Nullable Boolean requestsToOrigin) {

            this.requestsToOrigin = requestsToOrigin;
            return this;
        }
        @CustomType.Setter
        public Builder scorePerPeriod(@Nullable Integer scorePerPeriod) {

            this.scorePerPeriod = scorePerPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder scoreResponseHeaderName(@Nullable String scoreResponseHeaderName) {

            this.scoreResponseHeaderName = scoreResponseHeaderName;
            return this;
        }
        public RulesetRuleRatelimit build() {
            final var _resultValue = new RulesetRuleRatelimit();
            _resultValue.characteristics = characteristics;
            _resultValue.countingExpression = countingExpression;
            _resultValue.mitigationTimeout = mitigationTimeout;
            _resultValue.period = period;
            _resultValue.requestsPerPeriod = requestsPerPeriod;
            _resultValue.requestsToOrigin = requestsToOrigin;
            _resultValue.scorePerPeriod = scorePerPeriod;
            _resultValue.scoreResponseHeaderName = scoreResponseHeaderName;
            return _resultValue;
        }
    }
}
