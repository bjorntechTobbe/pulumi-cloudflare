// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ZeroTrustAccessGroupIncludeExternalEvaluationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ZeroTrustAccessGroupIncludeExternalEvaluationArgs Empty = new ZeroTrustAccessGroupIncludeExternalEvaluationArgs();

    /**
     * The API endpoint containing your business logic.
     * 
     */
    @Import(name="evaluateUrl")
    private @Nullable Output<String> evaluateUrl;

    /**
     * @return The API endpoint containing your business logic.
     * 
     */
    public Optional<Output<String>> evaluateUrl() {
        return Optional.ofNullable(this.evaluateUrl);
    }

    /**
     * The API endpoint containing the key that Access uses to verify that the response came from your API.
     * 
     */
    @Import(name="keysUrl")
    private @Nullable Output<String> keysUrl;

    /**
     * @return The API endpoint containing the key that Access uses to verify that the response came from your API.
     * 
     */
    public Optional<Output<String>> keysUrl() {
        return Optional.ofNullable(this.keysUrl);
    }

    private ZeroTrustAccessGroupIncludeExternalEvaluationArgs() {}

    private ZeroTrustAccessGroupIncludeExternalEvaluationArgs(ZeroTrustAccessGroupIncludeExternalEvaluationArgs $) {
        this.evaluateUrl = $.evaluateUrl;
        this.keysUrl = $.keysUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZeroTrustAccessGroupIncludeExternalEvaluationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZeroTrustAccessGroupIncludeExternalEvaluationArgs $;

        public Builder() {
            $ = new ZeroTrustAccessGroupIncludeExternalEvaluationArgs();
        }

        public Builder(ZeroTrustAccessGroupIncludeExternalEvaluationArgs defaults) {
            $ = new ZeroTrustAccessGroupIncludeExternalEvaluationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param evaluateUrl The API endpoint containing your business logic.
         * 
         * @return builder
         * 
         */
        public Builder evaluateUrl(@Nullable Output<String> evaluateUrl) {
            $.evaluateUrl = evaluateUrl;
            return this;
        }

        /**
         * @param evaluateUrl The API endpoint containing your business logic.
         * 
         * @return builder
         * 
         */
        public Builder evaluateUrl(String evaluateUrl) {
            return evaluateUrl(Output.of(evaluateUrl));
        }

        /**
         * @param keysUrl The API endpoint containing the key that Access uses to verify that the response came from your API.
         * 
         * @return builder
         * 
         */
        public Builder keysUrl(@Nullable Output<String> keysUrl) {
            $.keysUrl = keysUrl;
            return this;
        }

        /**
         * @param keysUrl The API endpoint containing the key that Access uses to verify that the response came from your API.
         * 
         * @return builder
         * 
         */
        public Builder keysUrl(String keysUrl) {
            return keysUrl(Output.of(keysUrl));
        }

        public ZeroTrustAccessGroupIncludeExternalEvaluationArgs build() {
            return $;
        }
    }

}
