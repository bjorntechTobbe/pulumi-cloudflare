// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EmailRoutingRuleMatcher {
    /**
     * @return Field to match on. Required for `type` of `literal`.
     * 
     */
    private @Nullable String field;
    /**
     * @return Type of matcher. Available values: `literal`, `all`
     * 
     */
    private String type;
    /**
     * @return Value to match on. Required for `type` of `literal`.
     * 
     */
    private @Nullable String value;

    private EmailRoutingRuleMatcher() {}
    /**
     * @return Field to match on. Required for `type` of `literal`.
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return Type of matcher. Available values: `literal`, `all`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value to match on. Required for `type` of `literal`.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailRoutingRuleMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String field;
        private String type;
        private @Nullable String value;
        public Builder() {}
        public Builder(EmailRoutingRuleMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder field(@Nullable String field) {

            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("EmailRoutingRuleMatcher", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public EmailRoutingRuleMatcher build() {
            final var _resultValue = new EmailRoutingRuleMatcher();
            _resultValue.field = field;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
