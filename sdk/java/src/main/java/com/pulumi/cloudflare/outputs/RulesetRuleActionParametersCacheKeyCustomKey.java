// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKeyCookie;
import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKeyHeader;
import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKeyHost;
import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKeyQueryString;
import com.pulumi.cloudflare.outputs.RulesetRuleActionParametersCacheKeyCustomKeyUser;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RulesetRuleActionParametersCacheKeyCustomKey {
    /**
     * @return Cookie parameters for the custom key.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyCookie cookie;
    /**
     * @return Header parameters for the custom key.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyHeader header;
    /**
     * @return Host parameters for the custom key.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyHost host;
    /**
     * @return Query string parameters for the custom key.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyQueryString queryString;
    /**
     * @return User parameters for the custom key.
     * 
     */
    private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyUser user;

    private RulesetRuleActionParametersCacheKeyCustomKey() {}
    /**
     * @return Cookie parameters for the custom key.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKeyCookie> cookie() {
        return Optional.ofNullable(this.cookie);
    }
    /**
     * @return Header parameters for the custom key.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKeyHeader> header() {
        return Optional.ofNullable(this.header);
    }
    /**
     * @return Host parameters for the custom key.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKeyHost> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Query string parameters for the custom key.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKeyQueryString> queryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * @return User parameters for the custom key.
     * 
     */
    public Optional<RulesetRuleActionParametersCacheKeyCustomKeyUser> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleActionParametersCacheKeyCustomKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyCookie cookie;
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyHeader header;
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyHost host;
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyQueryString queryString;
        private @Nullable RulesetRuleActionParametersCacheKeyCustomKeyUser user;
        public Builder() {}
        public Builder(RulesetRuleActionParametersCacheKeyCustomKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookie = defaults.cookie;
    	      this.header = defaults.header;
    	      this.host = defaults.host;
    	      this.queryString = defaults.queryString;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder cookie(@Nullable RulesetRuleActionParametersCacheKeyCustomKeyCookie cookie) {

            this.cookie = cookie;
            return this;
        }
        @CustomType.Setter
        public Builder header(@Nullable RulesetRuleActionParametersCacheKeyCustomKeyHeader header) {

            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable RulesetRuleActionParametersCacheKeyCustomKeyHost host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder queryString(@Nullable RulesetRuleActionParametersCacheKeyCustomKeyQueryString queryString) {

            this.queryString = queryString;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable RulesetRuleActionParametersCacheKeyCustomKeyUser user) {

            this.user = user;
            return this;
        }
        public RulesetRuleActionParametersCacheKeyCustomKey build() {
            final var _resultValue = new RulesetRuleActionParametersCacheKeyCustomKey();
            _resultValue.cookie = cookie;
            _resultValue.header = header;
            _resultValue.host = host;
            _resultValue.queryString = queryString;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
