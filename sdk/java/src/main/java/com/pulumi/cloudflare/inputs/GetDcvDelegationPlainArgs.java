// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetDcvDelegationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDcvDelegationPlainArgs Empty = new GetDcvDelegationPlainArgs();

    /**
     * The zone identifier to target for the resource.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return The zone identifier to target for the resource.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetDcvDelegationPlainArgs() {}

    private GetDcvDelegationPlainArgs(GetDcvDelegationPlainArgs $) {
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDcvDelegationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDcvDelegationPlainArgs $;

        public Builder() {
            $ = new GetDcvDelegationPlainArgs();
        }

        public Builder(GetDcvDelegationPlainArgs defaults) {
            $ = new GetDcvDelegationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param zoneId The zone identifier to target for the resource.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetDcvDelegationPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetDcvDelegationPlainArgs", "zoneId");
            }
            return $;
        }
    }

}
