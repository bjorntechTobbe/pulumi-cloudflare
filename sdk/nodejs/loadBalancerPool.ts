// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Load Balancer pool resource. This provides a
 * pool of origins that can be used by a Cloudflare Load Balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const example = new cloudflare.LoadBalancerPool("example", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     description: "example load balancer pool",
 *     enabled: false,
 *     latitude: 55,
 *     loadSheddings: [{
 *         defaultPercent: 55,
 *         defaultPolicy: "random",
 *         sessionPercent: 12,
 *         sessionPolicy: "hash",
 *     }],
 *     longitude: -12,
 *     minimumOrigins: 1,
 *     name: "example-pool",
 *     notificationEmail: "someone@example.com",
 *     originSteerings: [{
 *         policy: "random",
 *     }],
 *     origins: [
 *         {
 *             address: "192.0.2.1",
 *             enabled: false,
 *             headers: [{
 *                 header: "Host",
 *                 values: ["example-1"],
 *             }],
 *             name: "example-1",
 *         },
 *         {
 *             address: "192.0.2.2",
 *             headers: [{
 *                 header: "Host",
 *                 values: ["example-2"],
 *             }],
 *             name: "example-2",
 *         },
 *     ],
 * });
 * ```
 */
export class LoadBalancerPool extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancerPool resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerPoolState, opts?: pulumi.CustomResourceOptions): LoadBalancerPool {
        return new LoadBalancerPool(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/loadBalancerPool:LoadBalancerPool';

    /**
     * Returns true if the given object is an instance of LoadBalancerPool.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancerPool {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancerPool.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     */
    public readonly checkRegions!: pulumi.Output<string[]>;
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * Free text description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable (the default) this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any). Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The latitude this pool is physically located at; used for proximity steering.
     */
    public readonly latitude!: pulumi.Output<number | undefined>;
    /**
     * Setting for controlling load shedding for this pool.
     */
    public readonly loadSheddings!: pulumi.Output<outputs.LoadBalancerPoolLoadShedding[] | undefined>;
    /**
     * The longitude this pool is physically located at; used for proximity steering.
     */
    public readonly longitude!: pulumi.Output<number | undefined>;
    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     */
    public readonly minimumOrigins!: pulumi.Output<number | undefined>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The ID of the Monitor to use for health checking origins within this pool.
     */
    public readonly monitor!: pulumi.Output<string | undefined>;
    /**
     * A short name (tag) for the pool.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     */
    public readonly notificationEmail!: pulumi.Output<string | undefined>;
    /**
     * Set an origin steering policy to control origin selection within a pool.
     */
    public readonly originSteerings!: pulumi.Output<outputs.LoadBalancerPoolOriginSteering[] | undefined>;
    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     */
    public readonly origins!: pulumi.Output<outputs.LoadBalancerPoolOrigin[]>;

    /**
     * Create a LoadBalancerPool resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerPoolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerPoolArgs | LoadBalancerPoolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerPoolState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["checkRegions"] = state ? state.checkRegions : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["latitude"] = state ? state.latitude : undefined;
            resourceInputs["loadSheddings"] = state ? state.loadSheddings : undefined;
            resourceInputs["longitude"] = state ? state.longitude : undefined;
            resourceInputs["minimumOrigins"] = state ? state.minimumOrigins : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["monitor"] = state ? state.monitor : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notificationEmail"] = state ? state.notificationEmail : undefined;
            resourceInputs["originSteerings"] = state ? state.originSteerings : undefined;
            resourceInputs["origins"] = state ? state.origins : undefined;
        } else {
            const args = argsOrState as LoadBalancerPoolArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.origins === undefined) && !opts.urn) {
                throw new Error("Missing required property 'origins'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["checkRegions"] = args ? args.checkRegions : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["latitude"] = args ? args.latitude : undefined;
            resourceInputs["loadSheddings"] = args ? args.loadSheddings : undefined;
            resourceInputs["longitude"] = args ? args.longitude : undefined;
            resourceInputs["minimumOrigins"] = args ? args.minimumOrigins : undefined;
            resourceInputs["monitor"] = args ? args.monitor : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notificationEmail"] = args ? args.notificationEmail : undefined;
            resourceInputs["originSteerings"] = args ? args.originSteerings : undefined;
            resourceInputs["origins"] = args ? args.origins : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancerPool.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancerPool resources.
 */
export interface LoadBalancerPoolState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable (the default) this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any). Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The latitude this pool is physically located at; used for proximity steering.
     */
    latitude?: pulumi.Input<number>;
    /**
     * Setting for controlling load shedding for this pool.
     */
    loadSheddings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolLoadShedding>[]>;
    /**
     * The longitude this pool is physically located at; used for proximity steering.
     */
    longitude?: pulumi.Input<number>;
    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     */
    minimumOrigins?: pulumi.Input<number>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * The ID of the Monitor to use for health checking origins within this pool.
     */
    monitor?: pulumi.Input<string>;
    /**
     * A short name (tag) for the pool.
     */
    name?: pulumi.Input<string>;
    /**
     * The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     */
    notificationEmail?: pulumi.Input<string>;
    /**
     * Set an origin steering policy to control origin selection within a pool.
     */
    originSteerings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolOriginSteering>[]>;
    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     */
    origins?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolOrigin>[]>;
}

/**
 * The set of arguments for constructing a LoadBalancerPool resource.
 */
export interface LoadBalancerPoolArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * A list of regions (specified by region code) from which to run health checks. Empty means every Cloudflare data center (the default), but requires an Enterprise plan. Region codes can be found [here](https://developers.cloudflare.com/load-balancing/reference/region-mapping-api).
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to enable (the default) this pool. Disabled pools will not receive traffic and are excluded from health checks. Disabling a pool will cause any load balancers using it to failover to the next pool (if any). Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The latitude this pool is physically located at; used for proximity steering.
     */
    latitude?: pulumi.Input<number>;
    /**
     * Setting for controlling load shedding for this pool.
     */
    loadSheddings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolLoadShedding>[]>;
    /**
     * The longitude this pool is physically located at; used for proximity steering.
     */
    longitude?: pulumi.Input<number>;
    /**
     * The minimum number of origins that must be healthy for this pool to serve traffic. If the number of healthy origins falls below this number, the pool will be marked unhealthy and we will failover to the next available pool. Defaults to `1`.
     */
    minimumOrigins?: pulumi.Input<number>;
    /**
     * The ID of the Monitor to use for health checking origins within this pool.
     */
    monitor?: pulumi.Input<string>;
    /**
     * A short name (tag) for the pool.
     */
    name: pulumi.Input<string>;
    /**
     * The email address to send health status notifications to. This can be an individual mailbox or a mailing list. Multiple emails can be supplied as a comma delimited list.
     */
    notificationEmail?: pulumi.Input<string>;
    /**
     * Set an origin steering policy to control origin selection within a pool.
     */
    originSteerings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolOriginSteering>[]>;
    /**
     * The list of origins within this pool. Traffic directed at this pool is balanced across all currently healthy origins, provided the pool itself is healthy.
     */
    origins: pulumi.Input<pulumi.Input<inputs.LoadBalancerPoolOrigin>[]>;
}
