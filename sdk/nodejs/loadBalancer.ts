// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Load Balancer resource. This sits in front of
 * a number of defined pools of origins and provides various options
 * for geographically-aware load balancing. Note that the load balancing
 * feature must be enabled in your Cloudflare account before you can use
 * this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const exampleLoadBalancerPool = new cloudflare.LoadBalancerPool("exampleLoadBalancerPool", {
 *     name: "example-lb-pool",
 *     origins: [{
 *         name: "example-1",
 *         address: "192.0.2.1",
 *         enabled: false,
 *     }],
 * });
 * // Define a load balancer which always points to a pool we define below.
 * // In normal usage, would have different pools set for different pops
 * // (cloudflare points-of-presence) and/or for different regions.
 * // Within each pop or region we can define multiple pools in failover order.
 * const exampleLoadBalancer = new cloudflare.LoadBalancer("exampleLoadBalancer", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "example-load-balancer.example.com",
 *     fallbackPoolId: exampleLoadBalancerPool.id,
 *     defaultPoolIds: [exampleLoadBalancerPool.id],
 *     description: "example load balancer using geo-balancing",
 *     proxied: true,
 *     steeringPolicy: "geo",
 *     popPools: [{
 *         pop: "LAX",
 *         poolIds: [exampleLoadBalancerPool.id],
 *     }],
 *     countryPools: [{
 *         country: "US",
 *         poolIds: [exampleLoadBalancerPool.id],
 *     }],
 *     regionPools: [{
 *         region: "WNAM",
 *         poolIds: [exampleLoadBalancerPool.id],
 *     }],
 *     rules: [{
 *         name: "example rule",
 *         condition: "http.request.uri.path contains \"testing\"",
 *         fixedResponse: {
 *             messageBody: "hello",
 *             statusCode: 200,
 *             contentType: "html",
 *             location: "www.example.com",
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/loadBalancer:LoadBalancer example <zone_id>/<load_balancer_id>
 * ```
 */
export class LoadBalancer extends pulumi.CustomResource {
    /**
     * Get an existing LoadBalancer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadBalancerState, opts?: pulumi.CustomResourceOptions): LoadBalancer {
        return new LoadBalancer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/loadBalancer:LoadBalancer';

    /**
     * Returns true if the given object is an instance of LoadBalancer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadBalancer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadBalancer.__pulumiType;
    }

    /**
     * Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     */
    public readonly adaptiveRoutings!: pulumi.Output<outputs.LoadBalancerAdaptiveRouting[] | undefined>;
    /**
     * A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     */
    public readonly countryPools!: pulumi.Output<outputs.LoadBalancerCountryPool[]>;
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever `popPools`/`countryPools`/`regionPools` are not defined.
     */
    public readonly defaultPoolIds!: pulumi.Output<string[]>;
    /**
     * Free text description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable or disable the load balancer. Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    public readonly fallbackPoolId!: pulumi.Output<string>;
    /**
     * Controls location-based steering for non-proxied requests.
     */
    public readonly locationStrategies!: pulumi.Output<outputs.LoadBalancerLocationStrategy[] | undefined>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare's DNS, the load balancer will take precedence and the DNS record will not be used.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     */
    public readonly popPools!: pulumi.Output<outputs.LoadBalancerPopPool[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`. Conflicts with `ttl`.
     */
    public readonly proxied!: pulumi.Output<boolean | undefined>;
    /**
     * Configures pool weights for random steering. When the `steering_policy="random"`, a random pool is selected with probability proportional to these pool weights.
     */
    public readonly randomSteerings!: pulumi.Output<outputs.LoadBalancerRandomSteering[] | undefined>;
    /**
     * A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     */
    public readonly regionPools!: pulumi.Output<outputs.LoadBalancerRegionPool[]>;
    /**
     * A list of rules for this load balancer to execute.
     */
    public readonly rules!: pulumi.Output<outputs.LoadBalancerRule[] | undefined>;
    /**
     * Specifies the type of session affinity the load balancer should use unless specified as `none` or `""` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ipCookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client's IP address. Available values: `""`, `none`, `cookie`, `ipCookie`. Defaults to `none`.
     */
    public readonly sessionAffinity!: pulumi.Output<string | undefined>;
    /**
     * See `sessionAffinityAttributes`.
     */
    public readonly sessionAffinityAttributes!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Time, in seconds, until this load balancer's session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     */
    public readonly sessionAffinityTtl!: pulumi.Output<number | undefined>;
    /**
     * The method the load balancer uses to determine the route to your origin. Value `off` uses `defaultPoolIds`. Value `geo` uses `popPools`/`countryPools`/`regionPools`. For non-proxied requests, the `country` for `countryPools` is determined by `locationStrategy`. Value `random` selects a pool randomly. Value `dynamicLatency` uses round trip time to select the closest pool in `defaultPoolIds` (requires pool health checks). Value `proximity` uses the pools' latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `locationStrategy` for non-proxied requests. Value `""` maps to `geo` if you use `popPools`/`countryPools`/`regionPools` otherwise `off`. Available values: `off`, `geo`, `dynamicLatency`, `random`, `proximity`, `""` Defaults to `""`.
     */
    public readonly steeringPolicy!: pulumi.Output<string>;
    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     */
    public readonly ttl!: pulumi.Output<number>;
    /**
     * The zone ID to add the load balancer to. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a LoadBalancer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadBalancerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadBalancerArgs | LoadBalancerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadBalancerState | undefined;
            resourceInputs["adaptiveRoutings"] = state ? state.adaptiveRoutings : undefined;
            resourceInputs["countryPools"] = state ? state.countryPools : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["defaultPoolIds"] = state ? state.defaultPoolIds : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["fallbackPoolId"] = state ? state.fallbackPoolId : undefined;
            resourceInputs["locationStrategies"] = state ? state.locationStrategies : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["popPools"] = state ? state.popPools : undefined;
            resourceInputs["proxied"] = state ? state.proxied : undefined;
            resourceInputs["randomSteerings"] = state ? state.randomSteerings : undefined;
            resourceInputs["regionPools"] = state ? state.regionPools : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["sessionAffinity"] = state ? state.sessionAffinity : undefined;
            resourceInputs["sessionAffinityAttributes"] = state ? state.sessionAffinityAttributes : undefined;
            resourceInputs["sessionAffinityTtl"] = state ? state.sessionAffinityTtl : undefined;
            resourceInputs["steeringPolicy"] = state ? state.steeringPolicy : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as LoadBalancerArgs | undefined;
            if ((!args || args.defaultPoolIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultPoolIds'");
            }
            if ((!args || args.fallbackPoolId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fallbackPoolId'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["adaptiveRoutings"] = args ? args.adaptiveRoutings : undefined;
            resourceInputs["countryPools"] = args ? args.countryPools : undefined;
            resourceInputs["defaultPoolIds"] = args ? args.defaultPoolIds : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["fallbackPoolId"] = args ? args.fallbackPoolId : undefined;
            resourceInputs["locationStrategies"] = args ? args.locationStrategies : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["popPools"] = args ? args.popPools : undefined;
            resourceInputs["proxied"] = args ? args.proxied : undefined;
            resourceInputs["randomSteerings"] = args ? args.randomSteerings : undefined;
            resourceInputs["regionPools"] = args ? args.regionPools : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["sessionAffinity"] = args ? args.sessionAffinity : undefined;
            resourceInputs["sessionAffinityAttributes"] = args ? args.sessionAffinityAttributes : undefined;
            resourceInputs["sessionAffinityTtl"] = args ? args.sessionAffinityTtl : undefined;
            resourceInputs["steeringPolicy"] = args ? args.steeringPolicy : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(LoadBalancer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadBalancer resources.
 */
export interface LoadBalancerState {
    /**
     * Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     */
    adaptiveRoutings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAdaptiveRouting>[]>;
    /**
     * A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     */
    countryPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerCountryPool>[]>;
    /**
     * The RFC3339 timestamp of when the load balancer was created.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever `popPools`/`countryPools`/`regionPools` are not defined.
     */
    defaultPoolIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable the load balancer. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    fallbackPoolId?: pulumi.Input<string>;
    /**
     * Controls location-based steering for non-proxied requests.
     */
    locationStrategies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerLocationStrategy>[]>;
    /**
     * The RFC3339 timestamp of when the load balancer was last modified.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare's DNS, the load balancer will take precedence and the DNS record will not be used.
     */
    name?: pulumi.Input<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     */
    popPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPopPool>[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`. Conflicts with `ttl`.
     */
    proxied?: pulumi.Input<boolean>;
    /**
     * Configures pool weights for random steering. When the `steering_policy="random"`, a random pool is selected with probability proportional to these pool weights.
     */
    randomSteerings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRandomSteering>[]>;
    /**
     * A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     */
    regionPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRegionPool>[]>;
    /**
     * A list of rules for this load balancer to execute.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRule>[]>;
    /**
     * Specifies the type of session affinity the load balancer should use unless specified as `none` or `""` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ipCookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client's IP address. Available values: `""`, `none`, `cookie`, `ipCookie`. Defaults to `none`.
     */
    sessionAffinity?: pulumi.Input<string>;
    /**
     * See `sessionAffinityAttributes`.
     */
    sessionAffinityAttributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time, in seconds, until this load balancer's session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     */
    sessionAffinityTtl?: pulumi.Input<number>;
    /**
     * The method the load balancer uses to determine the route to your origin. Value `off` uses `defaultPoolIds`. Value `geo` uses `popPools`/`countryPools`/`regionPools`. For non-proxied requests, the `country` for `countryPools` is determined by `locationStrategy`. Value `random` selects a pool randomly. Value `dynamicLatency` uses round trip time to select the closest pool in `defaultPoolIds` (requires pool health checks). Value `proximity` uses the pools' latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `locationStrategy` for non-proxied requests. Value `""` maps to `geo` if you use `popPools`/`countryPools`/`regionPools` otherwise `off`. Available values: `off`, `geo`, `dynamicLatency`, `random`, `proximity`, `""` Defaults to `""`.
     */
    steeringPolicy?: pulumi.Input<string>;
    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     */
    ttl?: pulumi.Input<number>;
    /**
     * The zone ID to add the load balancer to. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadBalancer resource.
 */
export interface LoadBalancerArgs {
    /**
     * Controls features that modify the routing of requests to pools and origins in response to dynamic conditions, such as during the interval between active health monitoring requests.
     */
    adaptiveRoutings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerAdaptiveRouting>[]>;
    /**
     * A set containing mappings of country codes to a list of pool IDs (ordered by their failover priority) for the given country.
     */
    countryPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerCountryPool>[]>;
    /**
     * A list of pool IDs ordered by their failover priority. Used whenever `popPools`/`countryPools`/`regionPools` are not defined.
     */
    defaultPoolIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Free text description.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable or disable the load balancer. Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The pool ID to use when all other pools are detected as unhealthy.
     */
    fallbackPoolId: pulumi.Input<string>;
    /**
     * Controls location-based steering for non-proxied requests.
     */
    locationStrategies?: pulumi.Input<pulumi.Input<inputs.LoadBalancerLocationStrategy>[]>;
    /**
     * The DNS hostname to associate with your load balancer. If this hostname already exists as a DNS record in Cloudflare's DNS, the load balancer will take precedence and the DNS record will not be used.
     */
    name: pulumi.Input<string>;
    /**
     * A set containing mappings of Cloudflare Point-of-Presence (PoP) identifiers to a list of pool IDs (ordered by their failover priority) for the PoP (datacenter). This feature is only available to enterprise customers.
     */
    popPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerPopPool>[]>;
    /**
     * Whether the hostname gets Cloudflare's origin protection. Defaults to `false`. Conflicts with `ttl`.
     */
    proxied?: pulumi.Input<boolean>;
    /**
     * Configures pool weights for random steering. When the `steering_policy="random"`, a random pool is selected with probability proportional to these pool weights.
     */
    randomSteerings?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRandomSteering>[]>;
    /**
     * A set containing mappings of region codes to a list of pool IDs (ordered by their failover priority) for the given region.
     */
    regionPools?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRegionPool>[]>;
    /**
     * A list of rules for this load balancer to execute.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.LoadBalancerRule>[]>;
    /**
     * Specifies the type of session affinity the load balancer should use unless specified as `none` or `""` (default). With value `cookie`, on the first request to a proxied load balancer, a cookie is generated, encoding information of which origin the request will be forwarded to. Subsequent requests, by the same client to the same load balancer, will be sent to the origin server the cookie encodes, for the duration of the cookie and as long as the origin server remains healthy. If the cookie has expired or the origin server is unhealthy then a new origin server is calculated and used. Value `ipCookie` behaves the same as `cookie` except the initial origin selection is stable and based on the client's IP address. Available values: `""`, `none`, `cookie`, `ipCookie`. Defaults to `none`.
     */
    sessionAffinity?: pulumi.Input<string>;
    /**
     * See `sessionAffinityAttributes`.
     */
    sessionAffinityAttributes?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Time, in seconds, until this load balancer's session affinity cookie expires after being created. This parameter is ignored unless a supported session affinity policy is set. The current default of `82800` (23 hours) will be used unless `sessionAffinityTtl` is explicitly set. Once the expiry time has been reached, subsequent requests may get sent to a different origin server. Valid values are between `1800` and `604800`.
     */
    sessionAffinityTtl?: pulumi.Input<number>;
    /**
     * The method the load balancer uses to determine the route to your origin. Value `off` uses `defaultPoolIds`. Value `geo` uses `popPools`/`countryPools`/`regionPools`. For non-proxied requests, the `country` for `countryPools` is determined by `locationStrategy`. Value `random` selects a pool randomly. Value `dynamicLatency` uses round trip time to select the closest pool in `defaultPoolIds` (requires pool health checks). Value `proximity` uses the pools' latitude and longitude to select the closest pool using the Cloudflare PoP location for proxied requests or the location determined by `locationStrategy` for non-proxied requests. Value `""` maps to `geo` if you use `popPools`/`countryPools`/`regionPools` otherwise `off`. Available values: `off`, `geo`, `dynamicLatency`, `random`, `proximity`, `""` Defaults to `""`.
     */
    steeringPolicy?: pulumi.Input<string>;
    /**
     * Time to live (TTL) of the DNS entry for the IP address returned by this load balancer. This cannot be set for proxied load balancers. Defaults to `30`. Conflicts with `proxied`.
     */
    ttl?: pulumi.Input<number>;
    /**
     * The zone ID to add the load balancer to. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
