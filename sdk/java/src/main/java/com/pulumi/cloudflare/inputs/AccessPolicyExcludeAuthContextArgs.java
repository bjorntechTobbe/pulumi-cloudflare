// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessPolicyExcludeAuthContextArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyExcludeAuthContextArgs Empty = new AccessPolicyExcludeAuthContextArgs();

    /**
     * The ACID of the Authentication Context.
     * 
     */
    @Import(name="acId", required=true)
    private Output<String> acId;

    /**
     * @return The ACID of the Authentication Context.
     * 
     */
    public Output<String> acId() {
        return this.acId;
    }

    /**
     * The ID of the Authentication Context.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Authentication Context.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The ID of the Azure identity provider.
     * 
     */
    @Import(name="identityProviderId", required=true)
    private Output<String> identityProviderId;

    /**
     * @return The ID of the Azure identity provider.
     * 
     */
    public Output<String> identityProviderId() {
        return this.identityProviderId;
    }

    private AccessPolicyExcludeAuthContextArgs() {}

    private AccessPolicyExcludeAuthContextArgs(AccessPolicyExcludeAuthContextArgs $) {
        this.acId = $.acId;
        this.id = $.id;
        this.identityProviderId = $.identityProviderId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyExcludeAuthContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyExcludeAuthContextArgs $;

        public Builder() {
            $ = new AccessPolicyExcludeAuthContextArgs();
        }

        public Builder(AccessPolicyExcludeAuthContextArgs defaults) {
            $ = new AccessPolicyExcludeAuthContextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acId The ACID of the Authentication Context.
         * 
         * @return builder
         * 
         */
        public Builder acId(Output<String> acId) {
            $.acId = acId;
            return this;
        }

        /**
         * @param acId The ACID of the Authentication Context.
         * 
         * @return builder
         * 
         */
        public Builder acId(String acId) {
            return acId(Output.of(acId));
        }

        /**
         * @param id The ID of the Authentication Context.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Authentication Context.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param identityProviderId The ID of the Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of the Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public AccessPolicyExcludeAuthContextArgs build() {
            if ($.acId == null) {
                throw new MissingRequiredPropertyException("AccessPolicyExcludeAuthContextArgs", "acId");
            }
            if ($.id == null) {
                throw new MissingRequiredPropertyException("AccessPolicyExcludeAuthContextArgs", "id");
            }
            if ($.identityProviderId == null) {
                throw new MissingRequiredPropertyException("AccessPolicyExcludeAuthContextArgs", "identityProviderId");
            }
            return $;
        }
    }

}
