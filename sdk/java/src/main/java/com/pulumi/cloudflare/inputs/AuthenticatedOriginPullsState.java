// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthenticatedOriginPullsState extends com.pulumi.resources.ResourceArgs {

    public static final AuthenticatedOriginPullsState Empty = new AuthenticatedOriginPullsState();

    /**
     * The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     * 
     */
    @Import(name="authenticatedOriginPullsCertificate")
    private @Nullable Output<String> authenticatedOriginPullsCertificate;

    /**
     * @return The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     * 
     */
    public Optional<Output<String>> authenticatedOriginPullsCertificate() {
        return Optional.ofNullable(this.authenticatedOriginPullsCertificate);
    }

    /**
     * Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private AuthenticatedOriginPullsState() {}

    private AuthenticatedOriginPullsState(AuthenticatedOriginPullsState $) {
        this.authenticatedOriginPullsCertificate = $.authenticatedOriginPullsCertificate;
        this.enabled = $.enabled;
        this.hostname = $.hostname;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthenticatedOriginPullsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthenticatedOriginPullsState $;

        public Builder() {
            $ = new AuthenticatedOriginPullsState();
        }

        public Builder(AuthenticatedOriginPullsState defaults) {
            $ = new AuthenticatedOriginPullsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticatedOriginPullsCertificate The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
         * 
         * @return builder
         * 
         */
        public Builder authenticatedOriginPullsCertificate(@Nullable Output<String> authenticatedOriginPullsCertificate) {
            $.authenticatedOriginPullsCertificate = authenticatedOriginPullsCertificate;
            return this;
        }

        /**
         * @param authenticatedOriginPullsCertificate The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
         * 
         * @return builder
         * 
         */
        public Builder authenticatedOriginPullsCertificate(String authenticatedOriginPullsCertificate) {
            return authenticatedOriginPullsCertificate(Output.of(authenticatedOriginPullsCertificate));
        }

        /**
         * @param enabled Whether to enable Authenticated Origin Pulls on the given zone or hostname.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable Authenticated Origin Pulls on the given zone or hostname.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param hostname Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public AuthenticatedOriginPullsState build() {
            return $;
        }
    }

}
