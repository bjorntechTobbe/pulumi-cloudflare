// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPolicyExcludeExternalEvaluation {
    /**
     * @return The API endpoint containing your business logic.
     * 
     */
    private @Nullable String evaluateUrl;
    /**
     * @return The API endpoint containing the key that Access uses to verify that the response came from your API.
     * 
     */
    private @Nullable String keysUrl;

    private AccessPolicyExcludeExternalEvaluation() {}
    /**
     * @return The API endpoint containing your business logic.
     * 
     */
    public Optional<String> evaluateUrl() {
        return Optional.ofNullable(this.evaluateUrl);
    }
    /**
     * @return The API endpoint containing the key that Access uses to verify that the response came from your API.
     * 
     */
    public Optional<String> keysUrl() {
        return Optional.ofNullable(this.keysUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyExcludeExternalEvaluation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String evaluateUrl;
        private @Nullable String keysUrl;
        public Builder() {}
        public Builder(AccessPolicyExcludeExternalEvaluation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluateUrl = defaults.evaluateUrl;
    	      this.keysUrl = defaults.keysUrl;
        }

        @CustomType.Setter
        public Builder evaluateUrl(@Nullable String evaluateUrl) {

            this.evaluateUrl = evaluateUrl;
            return this;
        }
        @CustomType.Setter
        public Builder keysUrl(@Nullable String keysUrl) {

            this.keysUrl = keysUrl;
            return this;
        }
        public AccessPolicyExcludeExternalEvaluation build() {
            final var _resultValue = new AccessPolicyExcludeExternalEvaluation();
            _resultValue.evaluateUrl = evaluateUrl;
            _resultValue.keysUrl = keysUrl;
            return _resultValue;
        }
    }
}
