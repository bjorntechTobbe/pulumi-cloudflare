// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.LoadBalancerPoolOriginHeaderArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerPoolOriginArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerPoolOriginArgs Empty = new LoadBalancerPoolOriginArgs();

    /**
     * The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * HTTP request headers.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<LoadBalancerPoolOriginHeaderArgs>> headers;

    /**
     * @return HTTP request headers.
     * 
     */
    public Optional<Output<List<LoadBalancerPoolOriginHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * A human-identifiable name for the origin.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A human-identifiable name for the origin.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Defaults to `1`.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Double> weight;

    /**
     * @return The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Defaults to `1`.
     * 
     */
    public Optional<Output<Double>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private LoadBalancerPoolOriginArgs() {}

    private LoadBalancerPoolOriginArgs(LoadBalancerPoolOriginArgs $) {
        this.address = $.address;
        this.enabled = $.enabled;
        this.headers = $.headers;
        this.name = $.name;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerPoolOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerPoolOriginArgs $;

        public Builder() {
            $ = new LoadBalancerPoolOriginArgs();
        }

        public Builder(LoadBalancerPoolOriginArgs defaults) {
            $ = new LoadBalancerPoolOriginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IP address (IPv4 or IPv6) of the origin, or the publicly addressable hostname.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param enabled Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether this origin is enabled. Disabled origins will not receive traffic and are excluded from health checks. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param headers HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<List<LoadBalancerPoolOriginHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(List<LoadBalancerPoolOriginHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param headers HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(LoadBalancerPoolOriginHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        /**
         * @param name A human-identifiable name for the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-identifiable name for the origin.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param weight The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Double> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight (0.01 - 1.00) of this origin, relative to other origins in the pool. Equal values mean equal weighting. A weight of 0 means traffic will not be sent to this origin, but health is still checked. Defaults to `1`.
         * 
         * @return builder
         * 
         */
        public Builder weight(Double weight) {
            return weight(Output.of(weight));
        }

        public LoadBalancerPoolOriginArgs build() {
            $.address = Objects.requireNonNull($.address, "expected parameter 'address' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
