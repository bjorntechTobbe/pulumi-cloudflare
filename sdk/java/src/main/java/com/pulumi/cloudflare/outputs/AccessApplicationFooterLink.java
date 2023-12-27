// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessApplicationFooterLink {
    /**
     * @return The name of the footer link.
     * 
     */
    private @Nullable String name;
    /**
     * @return The URL of the footer link.
     * 
     */
    private @Nullable String url;

    private AccessApplicationFooterLink() {}
    /**
     * @return The name of the footer link.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The URL of the footer link.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessApplicationFooterLink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String url;
        public Builder() {}
        public Builder(AccessApplicationFooterLink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public AccessApplicationFooterLink build() {
            final var _resultValue = new AccessApplicationFooterLink();
            _resultValue.name = name;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
