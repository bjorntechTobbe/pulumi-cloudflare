// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZeroTrustAccessGroupExcludeOkta {
    /**
     * @return The ID of your Okta identity provider.
     * 
     */
    private @Nullable String identityProviderId;
    /**
     * @return The name of the Okta Group.
     * 
     */
    private @Nullable List<String> names;

    private ZeroTrustAccessGroupExcludeOkta() {}
    /**
     * @return The ID of your Okta identity provider.
     * 
     */
    public Optional<String> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }
    /**
     * @return The name of the Okta Group.
     * 
     */
    public List<String> names() {
        return this.names == null ? List.of() : this.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZeroTrustAccessGroupExcludeOkta defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String identityProviderId;
        private @Nullable List<String> names;
        public Builder() {}
        public Builder(ZeroTrustAccessGroupExcludeOkta defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviderId = defaults.identityProviderId;
    	      this.names = defaults.names;
        }

        @CustomType.Setter
        public Builder identityProviderId(@Nullable String identityProviderId) {

            this.identityProviderId = identityProviderId;
            return this;
        }
        @CustomType.Setter
        public Builder names(@Nullable List<String> names) {

            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public ZeroTrustAccessGroupExcludeOkta build() {
            final var _resultValue = new ZeroTrustAccessGroupExcludeOkta();
            _resultValue.identityProviderId = identityProviderId;
            _resultValue.names = names;
            return _resultValue;
        }
    }
}
