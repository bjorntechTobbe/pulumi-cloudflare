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


public final class AccessGroupExcludeGithubArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupExcludeGithubArgs Empty = new AccessGroupExcludeGithubArgs();

    /**
     * The ID of your Github identity provider.
     * 
     */
    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    /**
     * @return The ID of your Github identity provider.
     * 
     */
    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    /**
     * The name of the organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The teams that should be matched.
     * 
     */
    @Import(name="teams")
    private @Nullable Output<List<String>> teams;

    /**
     * @return The teams that should be matched.
     * 
     */
    public Optional<Output<List<String>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    private AccessGroupExcludeGithubArgs() {}

    private AccessGroupExcludeGithubArgs(AccessGroupExcludeGithubArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.name = $.name;
        this.teams = $.teams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupExcludeGithubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupExcludeGithubArgs $;

        public Builder() {
            $ = new AccessGroupExcludeGithubArgs();
        }

        public Builder(AccessGroupExcludeGithubArgs defaults) {
            $ = new AccessGroupExcludeGithubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identityProviderId The ID of your Github identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * @param identityProviderId The ID of your Github identity provider.
         * 
         * @return builder
         * 
         */
        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        /**
         * @param name The name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param teams The teams that should be matched.
         * 
         * @return builder
         * 
         */
        public Builder teams(@Nullable Output<List<String>> teams) {
            $.teams = teams;
            return this;
        }

        /**
         * @param teams The teams that should be matched.
         * 
         * @return builder
         * 
         */
        public Builder teams(List<String> teams) {
            return teams(Output.of(teams));
        }

        /**
         * @param teams The teams that should be matched.
         * 
         * @return builder
         * 
         */
        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }

        public AccessGroupExcludeGithubArgs build() {
            return $;
        }
    }

}
