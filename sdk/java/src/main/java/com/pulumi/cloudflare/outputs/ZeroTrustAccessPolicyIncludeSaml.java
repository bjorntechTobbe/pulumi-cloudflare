// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessPolicyIncludeSaml {
    /**
     * @return The name of the SAML attribute.
     * 
     */
    private @Nullable String attributeName;
    /**
     * @return The SAML attribute value to look for.
     * 
     */
    private @Nullable String attributeValue;
    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    private @Nullable String identityProviderId;

    private ZeroTrustAccessPolicyIncludeSaml() {}
    /**
     * @return The name of the SAML attribute.
     * 
     */
    public Optional<String> attributeName() {
        return Optional.ofNullable(this.attributeName);
    }
    /**
     * @return The SAML attribute value to look for.
     * 
     */
    public Optional<String> attributeValue() {
        return Optional.ofNullable(this.attributeValue);
    }
    /**
     * @return The ID of your SAML identity provider.
     * 
     */
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessPolicyIncludeSaml defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String attributeName;
        private @Nullable String attributeValue;
        private @Nullable String identityProviderId;
        public Builder() {}
        public Builder(ZeroTrustAccessPolicyIncludeSaml defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder attributeName(@Nullable String attributeName) {

            this.attributeName = attributeName;
            return this;
        }
        @CustomType.Setter
        public Builder attributeValue(@Nullable String attributeValue) {

            this.attributeValue = attributeValue;
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {

            this.identityProviderId = identityProviderId;
            return this;
        }
        public ZeroTrustAccessPolicyIncludeSaml build() {
            final var _resultValue = new ZeroTrustAccessPolicyIncludeSaml();
            _resultValue.attributeName = attributeName;
            _resultValue.attributeValue = attributeValue;
            _resultValue.identityProviderId = identityProviderId;
            return _resultValue;
        }
    }
}
