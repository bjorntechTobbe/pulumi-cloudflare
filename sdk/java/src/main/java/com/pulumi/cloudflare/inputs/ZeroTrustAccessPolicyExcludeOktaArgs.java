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


public final class ZeroTrustAccessPolicyExcludeOktaArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessPolicyExcludeOktaArgs Empty = new ZeroTrustAccessPolicyExcludeOktaArgs();

    /**
     * The ID of your Okta identity provider.
     * 
     */
    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    /**
     * @return The ID of your Okta identity provider.
     * 
     */
    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    /**
     * The name of the Okta Group.
     * 
     */
    @Import(name="names")
    private @Nullable Output<List<String>> names;

    /**
     * @return The name of the Okta Group.
     * 
     */
    public Optional<Output<List<String>>> names() {
        return Optional.ofNullable(this.names);
    }

    private ZeroTrustAccessPolicyExcludeOktaArgs() {}

    private ZeroTrustAccessPolicyExcludeOktaArgs(ZeroTrustAccessPolicyExcludeOktaArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.names = $.names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessPolicyExcludeOktaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessPolicyExcludeOktaArgs $;

        public Builder() {
            $ = new ZeroTrustAccessPolicyExcludeOktaArgs();
        }

        public Builder(ZeroTrustAccessPolicyExcludeOktaArgs defaults) {
            $ = new ZeroTrustAccessPolicyExcludeOktaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProviderId The ID of your Okta identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of your Okta identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        /**
         * @param names The name of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder names(@Nullable Output<List<String>> names) {
            $.names = names;
            return this;
        }

        /**
         * @param names The name of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        /**
         * @param names The name of the Okta Group.
         * 
         * @return builder
         * 
         */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        public ZeroTrustAccessPolicyExcludeOktaArgs build() {
            return $;
        }
    }

}
