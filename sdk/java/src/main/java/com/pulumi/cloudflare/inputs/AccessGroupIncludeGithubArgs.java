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


public final class AccessGroupIncludeGithubArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupIncludeGithubArgs Empty = new AccessGroupIncludeGithubArgs();

    @Import(name="identityProviderId")
    private @Nullable Output<String> identityProviderId;

    public Optional<Output<String>> identityProviderId() {
        return Optional.ofNullable(this.identityProviderId);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="teams")
    private @Nullable Output<List<String>> teams;

    public Optional<Output<List<String>>> teams() {
        return Optional.ofNullable(this.teams);
    }

    private AccessGroupIncludeGithubArgs() {}

    private AccessGroupIncludeGithubArgs(AccessGroupIncludeGithubArgs $) {
        this.identityProviderId = $.identityProviderId;
        this.name = $.name;
        this.teams = $.teams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupIncludeGithubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupIncludeGithubArgs $;

        public Builder() {
            $ = new AccessGroupIncludeGithubArgs();
        }

        public Builder(AccessGroupIncludeGithubArgs defaults) {
            $ = new AccessGroupIncludeGithubArgs(Objects.requireNonNull(defaults));
        }

        public Builder identityProviderId(@Nullable Output<String> identityProviderId) {
            $.identityProviderId = identityProviderId;
            return this;
        }

        public Builder identityProviderId(String identityProviderId) {
            return identityProviderId(Output.of(identityProviderId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder teams(@Nullable Output<List<String>> teams) {
            $.teams = teams;
            return this;
        }

        public Builder teams(List<String> teams) {
            return teams(Output.of(teams));
        }

        public Builder teams(String... teams) {
            return teams(List.of(teams));
        }

        public AccessGroupIncludeGithubArgs build() {
            return $;
        }
    }

}
