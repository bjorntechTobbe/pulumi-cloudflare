// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AccessPolicyRequireAuthContext {
    /**
     * @return The ACID of the Authentication Context.
     * 
     */
    private String acId;
    /**
     * @return The ID of the Authentication Context.
     * 
     */
    private String id;
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    private String identityProviderId;

    private AccessPolicyRequireAuthContext() {}
    /**
     * @return The ACID of the Authentication Context.
     * 
     */
    public String acId() {
        return this.acId;
    }
    /**
     * @return The ID of the Authentication Context.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Azure Identity provider.
     * 
     */
    public String identityProviderId() {
        return this.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyRequireAuthContext defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String acId;
        private String id;
        private String identityProviderId;
        public Builder() {}
        public Builder(AccessPolicyRequireAuthContext defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acId = defaults.acId;
    	      this.id = defaults.id;
    	      this.identityProviderId = defaults.identityProviderId;
        }

        @CustomType.Setter
        public Builder acId(String acId) {
            if (acId == null) {
              throw new MissingRequiredPropertyException("AccessPolicyRequireAuthContext", "acId");
            }
            this.acId = acId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("AccessPolicyRequireAuthContext", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identityProviderId(String identityProviderId) {
            if (identityProviderId == null) {
              throw new MissingRequiredPropertyException("AccessPolicyRequireAuthContext", "identityProviderId");
            }
            this.identityProviderId = identityProviderId;
            return this;
        }
        public AccessPolicyRequireAuthContext build() {
            final var _resultValue = new AccessPolicyRequireAuthContext();
            _resultValue.acId = acId;
            _resultValue.id = id;
            _resultValue.identityProviderId = identityProviderId;
            return _resultValue;
        }
    }
}
