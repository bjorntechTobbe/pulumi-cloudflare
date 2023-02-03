// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.inputs.LoadBalancerMonitorHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerMonitorArgs Empty = new LoadBalancerMonitorArgs();

    /**
     * The account identifier to target for the resource.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Import(name="allowInsecure")
    private @Nullable Output<Boolean> allowInsecure;

    /**
     * @return Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Optional<Output<Boolean>> allowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }

    /**
     * Free text description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Free text description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Import(name="expectedBody")
    private @Nullable Output<String> expectedBody;

    /**
     * @return A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Optional<Output<String>> expectedBody() {
        return Optional.ofNullable(this.expectedBody);
    }

    /**
     * The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Import(name="expectedCodes")
    private @Nullable Output<String> expectedCodes;

    /**
     * @return The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Optional<Output<String>> expectedCodes() {
        return Optional.ofNullable(this.expectedCodes);
    }

    /**
     * Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Import(name="followRedirects")
    private @Nullable Output<Boolean> followRedirects;

    /**
     * @return Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Optional<Output<Boolean>> followRedirects() {
        return Optional.ofNullable(this.followRedirects);
    }

    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<LoadBalancerMonitorHeaderArgs>> headers;

    /**
     * @return The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     * 
     */
    public Optional<Output<List<LoadBalancerMonitorHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The method to use for the health check.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The method to use for the health check.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The endpoint path to health check against.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The endpoint path to health check against.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port number to use for the healthcheck, required when creating a TCP monitor.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number to use for the healthcheck, required when creating a TCP monitor.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    @Import(name="probeZone")
    private @Nullable Output<String> probeZone;

    /**
     * @return Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
     * 
     */
    public Optional<Output<String>> probeZone() {
        return Optional.ofNullable(this.probeZone);
    }

    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    /**
     * @return The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LoadBalancerMonitorArgs() {}

    private LoadBalancerMonitorArgs(LoadBalancerMonitorArgs $) {
        this.accountId = $.accountId;
        this.allowInsecure = $.allowInsecure;
        this.description = $.description;
        this.expectedBody = $.expectedBody;
        this.expectedCodes = $.expectedCodes;
        this.followRedirects = $.followRedirects;
        this.headers = $.headers;
        this.interval = $.interval;
        this.method = $.method;
        this.path = $.path;
        this.port = $.port;
        this.probeZone = $.probeZone;
        this.retries = $.retries;
        this.timeout = $.timeout;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerMonitorArgs $;

        public Builder() {
            $ = new LoadBalancerMonitorArgs();
        }

        public Builder(LoadBalancerMonitorArgs defaults) {
            $ = new LoadBalancerMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowInsecure Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            $.allowInsecure = allowInsecure;
            return this;
        }

        /**
         * @param allowInsecure Do not validate the certificate when monitor use HTTPS.  Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder allowInsecure(Boolean allowInsecure) {
            return allowInsecure(Output.of(allowInsecure));
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Free text description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(@Nullable Output<String> expectedBody) {
            $.expectedBody = expectedBody;
            return this;
        }

        /**
         * @param expectedBody A case-insensitive sub-string to look for in the response body. If this string is not found, the origin will be marked as unhealthy. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expectedBody(String expectedBody) {
            return expectedBody(Output.of(expectedBody));
        }

        /**
         * @param expectedCodes The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(@Nullable Output<String> expectedCodes) {
            $.expectedCodes = expectedCodes;
            return this;
        }

        /**
         * @param expectedCodes The expected HTTP response code or code range of the health check. Eg `2xx`. Only valid and required if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expectedCodes(String expectedCodes) {
            return expectedCodes(Output.of(expectedCodes));
        }

        /**
         * @param followRedirects Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(@Nullable Output<Boolean> followRedirects) {
            $.followRedirects = followRedirects;
            return this;
        }

        /**
         * @param followRedirects Follow redirects if returned by the origin. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder followRedirects(Boolean followRedirects) {
            return followRedirects(Output.of(followRedirects));
        }

        /**
         * @param headers The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<LoadBalancerMonitorHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<LoadBalancerMonitorHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
         * 
         * @return builder
         * 
         */
        public Builder headers(LoadBalancerMonitorHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The interval between each health check. Shorter intervals may improve failover time, but will increase load on the origins as we check from multiple locations. Defaults to `60`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param method The method to use for the health check.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The method to use for the health check.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param path The endpoint path to health check against.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The endpoint path to health check against.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port number to use for the healthcheck, required when creating a TCP monitor.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number to use for the healthcheck, required when creating a TCP monitor.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param probeZone Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder probeZone(@Nullable Output<String> probeZone) {
            $.probeZone = probeZone;
            return this;
        }

        /**
         * @param probeZone Assign this monitor to emulate the specified zone while probing. Only valid if `type` is &#34;http&#34; or &#34;https&#34;.
         * 
         * @return builder
         * 
         */
        public Builder probeZone(String probeZone) {
            return probeZone(Output.of(probeZone));
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param type The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The protocol to use for the healthcheck. Available values: `http`, `https`, `tcp`, `udp_icmp`, `icmp_ping`, `smtp`. Defaults to `http`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LoadBalancerMonitorArgs build() {
            return $;
        }
    }

}
