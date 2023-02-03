// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.inputs;

import com.pulumi.cloudflare.inputs.GetZonesFilter;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GetZonesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetZonesPlainArgs Empty = new GetZonesPlainArgs();

    /**
     * One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
     * 
     */
    @Import(name="filter", required=true)
    private GetZonesFilter filter;

    /**
     * @return One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
     * 
     */
    public GetZonesFilter filter() {
        return this.filter;
    }

    private GetZonesPlainArgs() {}

    private GetZonesPlainArgs(GetZonesPlainArgs $) {
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetZonesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetZonesPlainArgs $;

        public Builder() {
            $ = new GetZonesPlainArgs();
        }

        public Builder(GetZonesPlainArgs defaults) {
            $ = new GetZonesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
         * 
         * @return builder
         * 
         */
        public Builder filter(GetZonesFilter filter) {
            $.filter = filter;
            return this;
        }

        public GetZonesPlainArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
