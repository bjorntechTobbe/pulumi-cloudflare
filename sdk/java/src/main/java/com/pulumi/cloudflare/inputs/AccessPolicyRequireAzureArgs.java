// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessPolicyRequireAzureArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPolicyRequireAzureArgs Empty = new AccessPolicyRequireAzureArgs();

    /**
     * The ID of the Azure identity provider.
     * 
     */
    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    /**
     * @return The ID of the Azure identity provider.
     * 
     */
    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    /**
     * The ID of the Azure group or user.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return The ID of the Azure group or user.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private AccessPolicyRequireAzureArgs() {}

    private AccessPolicyRequireAzureArgs(AccessPolicyRequireAzureArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessPolicyRequireAzureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessPolicyRequireAzureArgs $;

        public Builder() {
            $ = new AccessPolicyRequireAzureArgs();
        }

        public Builder(AccessPolicyRequireAzureArgs defaults) {
            $ = new AccessPolicyRequireAzureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProviderId The ID of the Azure identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
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

        /**
         * @param ids The ID of the Azure group or user.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids The ID of the Azure group or user.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids The ID of the Azure group or user.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public AccessPolicyRequireAzureArgs build() {
            return $;
        }
    }

}
