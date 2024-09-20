// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to look up Zone results for use in other resources.
 */
export function getZones(args: GetZonesArgs, opts?: pulumi.InvokeOptions): Promise<GetZonesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("cloudflare:index/getZones:getZones", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesArgs {
    /**
     * One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
     */
    filter: inputs.GetZonesFilter;
}

/**
 * A collection of values returned by getZones.
 */
export interface GetZonesResult {
    /**
     * One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
     */
    readonly filter: outputs.GetZonesFilter;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of zone objects.
     */
    readonly zones: outputs.GetZonesZone[];
}
/**
 * Use this data source to look up Zone results for use in other resources.
 */
export function getZonesOutput(args: GetZonesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetZonesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("cloudflare:index/getZones:getZones", {
        "filter": args.filter,
    }, opts);
}

/**
 * A collection of arguments for invoking getZones.
 */
export interface GetZonesOutputArgs {
    /**
     * One or more values used to look up zone records. If more than one value is given all values must match in order to be included.
     */
    filter: pulumi.Input<inputs.GetZonesFilterArgs>;
}
