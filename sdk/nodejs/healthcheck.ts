// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Standalone Health Checks provide a way to monitor origin servers
 * without needing a Cloudflare Load Balancer.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // HTTPS Healthcheck
 * const httpHealthCheck = new cloudflare.Healthcheck("http_health_check", {
 *     zoneId: cloudflareZoneId,
 *     name: "http-health-check",
 *     description: "example http health check",
 *     address: "example.com",
 *     suspended: false,
 *     checkRegions: [
 *         "WEU",
 *         "EEU",
 *     ],
 *     type: "HTTPS",
 *     port: 443,
 *     method: "GET",
 *     path: "/health",
 *     expectedBody: "alive",
 *     expectedCodes: [
 *         "2xx",
 *         "301",
 *     ],
 *     followRedirects: true,
 *     allowInsecure: false,
 *     headers: [{
 *         header: "Host",
 *         values: ["example.com"],
 *     }],
 *     timeout: 10,
 *     retries: 2,
 *     interval: 60,
 *     consecutiveFails: 3,
 *     consecutiveSuccesses: 2,
 * });
 * // TCP Healthcheck
 * const tcpHealthCheck = new cloudflare.Healthcheck("tcp_health_check", {
 *     zoneId: cloudflareZoneId,
 *     name: "tcp-health-check",
 *     description: "example tcp health check",
 *     address: "example.com",
 *     suspended: false,
 *     checkRegions: [
 *         "WEU",
 *         "EEU",
 *     ],
 *     type: "TCP",
 *     port: 22,
 *     method: "connection_established",
 *     timeout: 10,
 *     retries: 2,
 *     interval: 60,
 *     consecutiveFails: 3,
 *     consecutiveSuccesses: 2,
 * });
 * ```
 *
 * ## Import
 *
 * Use the Zone ID and Healthcheck ID to import.
 *
 * ```sh
 * $ pulumi import cloudflare:index/healthcheck:Healthcheck example <zone_id>/<healthcheck_id>
 * ```
 */
export class Healthcheck extends pulumi.CustomResource {
    /**
     * Get an existing Healthcheck resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HealthcheckState, opts?: pulumi.CustomResourceOptions): Healthcheck {
        return new Healthcheck(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/healthcheck:Healthcheck';

    /**
     * Returns true if the given object is an instance of Healthcheck.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Healthcheck {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Healthcheck.__pulumiType;
    }

    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    public readonly address!: pulumi.Output<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     */
    public readonly allowInsecure!: pulumi.Output<boolean | undefined>;
    /**
     * A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    public readonly checkRegions!: pulumi.Output<string[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     */
    public readonly consecutiveFails!: pulumi.Output<number | undefined>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     */
    public readonly consecutiveSuccesses!: pulumi.Output<number | undefined>;
    /**
     * Creation time.
     */
    public /*out*/ readonly createdOn!: pulumi.Output<string>;
    /**
     * A human-readable description of the health check.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     */
    public readonly expectedBody!: pulumi.Output<string | undefined>;
    /**
     * The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
     */
    public readonly expectedCodes!: pulumi.Output<string[] | undefined>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     */
    public readonly followRedirects!: pulumi.Output<boolean | undefined>;
    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     */
    public readonly headers!: pulumi.Output<outputs.HealthcheckHeader[] | undefined>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     */
    public readonly interval!: pulumi.Output<number | undefined>;
    /**
     * The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
     */
    public readonly method!: pulumi.Output<string>;
    /**
     * Last modified time.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The endpoint path to health check against. Defaults to `/`.
     */
    public readonly path!: pulumi.Output<string | undefined>;
    /**
     * Port number to connect to for the health check. Defaults to `80`.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    public readonly retries!: pulumi.Output<number | undefined>;
    /**
     * If suspended, no health checks are sent to the origin. Defaults to `false`.
     */
    public readonly suspended!: pulumi.Output<boolean | undefined>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    public readonly timeout!: pulumi.Output<number | undefined>;
    /**
     * The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a Healthcheck resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HealthcheckArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HealthcheckArgs | HealthcheckState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HealthcheckState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["allowInsecure"] = state ? state.allowInsecure : undefined;
            resourceInputs["checkRegions"] = state ? state.checkRegions : undefined;
            resourceInputs["consecutiveFails"] = state ? state.consecutiveFails : undefined;
            resourceInputs["consecutiveSuccesses"] = state ? state.consecutiveSuccesses : undefined;
            resourceInputs["createdOn"] = state ? state.createdOn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expectedBody"] = state ? state.expectedBody : undefined;
            resourceInputs["expectedCodes"] = state ? state.expectedCodes : undefined;
            resourceInputs["followRedirects"] = state ? state.followRedirects : undefined;
            resourceInputs["headers"] = state ? state.headers : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["method"] = state ? state.method : undefined;
            resourceInputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["path"] = state ? state.path : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["retries"] = state ? state.retries : undefined;
            resourceInputs["suspended"] = state ? state.suspended : undefined;
            resourceInputs["timeout"] = state ? state.timeout : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as HealthcheckArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["allowInsecure"] = args ? args.allowInsecure : undefined;
            resourceInputs["checkRegions"] = args ? args.checkRegions : undefined;
            resourceInputs["consecutiveFails"] = args ? args.consecutiveFails : undefined;
            resourceInputs["consecutiveSuccesses"] = args ? args.consecutiveSuccesses : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expectedBody"] = args ? args.expectedBody : undefined;
            resourceInputs["expectedCodes"] = args ? args.expectedCodes : undefined;
            resourceInputs["followRedirects"] = args ? args.followRedirects : undefined;
            resourceInputs["headers"] = args ? args.headers : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["method"] = args ? args.method : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["path"] = args ? args.path : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["retries"] = args ? args.retries : undefined;
            resourceInputs["suspended"] = args ? args.suspended : undefined;
            resourceInputs["timeout"] = args ? args.timeout : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["createdOn"] = undefined /*out*/;
            resourceInputs["modifiedOn"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Healthcheck.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Healthcheck resources.
 */
export interface HealthcheckState {
    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    address?: pulumi.Input<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     */
    consecutiveFails?: pulumi.Input<number>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     */
    consecutiveSuccesses?: pulumi.Input<number>;
    /**
     * Creation time.
     */
    createdOn?: pulumi.Input<string>;
    /**
     * A human-readable description of the health check.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
     */
    expectedCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.HealthcheckHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     */
    interval?: pulumi.Input<number>;
    /**
     * The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
     */
    method?: pulumi.Input<string>;
    /**
     * Last modified time.
     */
    modifiedOn?: pulumi.Input<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    name?: pulumi.Input<string>;
    /**
     * The endpoint path to health check against. Defaults to `/`.
     */
    path?: pulumi.Input<string>;
    /**
     * Port number to connect to for the health check. Defaults to `80`.
     */
    port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    retries?: pulumi.Input<number>;
    /**
     * If suspended, no health checks are sent to the origin. Defaults to `false`.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Healthcheck resource.
 */
export interface HealthcheckArgs {
    /**
     * The hostname or IP address of the origin server to run health checks on.
     */
    address: pulumi.Input<string>;
    /**
     * Do not validate the certificate when the health check uses HTTPS. Defaults to `false`.
     */
    allowInsecure?: pulumi.Input<boolean>;
    /**
     * A list of regions from which to run health checks. If not set, Cloudflare will pick a default region. Available values: `WNAM`, `ENAM`, `WEU`, `EEU`, `NSAM`, `SSAM`, `OC`, `ME`, `NAF`, `SAF`, `IN`, `SEAS`, `NEAS`, `ALL_REGIONS`.
     */
    checkRegions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The number of consecutive fails required from a health check before changing the health to unhealthy. Defaults to `1`.
     */
    consecutiveFails?: pulumi.Input<number>;
    /**
     * The number of consecutive successes required from a health check before changing the health to healthy. Defaults to `1`.
     */
    consecutiveSuccesses?: pulumi.Input<number>;
    /**
     * A human-readable description of the health check.
     */
    description?: pulumi.Input<string>;
    /**
     * A case-insensitive sub-string to look for in the response body. If this string is not found the origin will be marked as unhealthy.
     */
    expectedBody?: pulumi.Input<string>;
    /**
     * The expected HTTP response codes (e.g. '200') or code ranges (e.g. '2xx' for all codes starting with 2) of the health check.
     */
    expectedCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Follow redirects if the origin returns a 3xx status code. Defaults to `false`.
     */
    followRedirects?: pulumi.Input<boolean>;
    /**
     * The HTTP request headers to send in the health check. It is recommended you set a Host header by default. The User-Agent header cannot be overridden.
     */
    headers?: pulumi.Input<pulumi.Input<inputs.HealthcheckHeader>[]>;
    /**
     * The interval between each health check. Shorter intervals may give quicker notifications if the origin status changes, but will increase the load on the origin as we check from multiple locations. Defaults to `60`.
     */
    interval?: pulumi.Input<number>;
    /**
     * The HTTP method to use for the health check. Available values: `connectionEstablished`, `GET`, `HEAD`.
     */
    method?: pulumi.Input<string>;
    /**
     * A short name to identify the health check. Only alphanumeric characters, hyphens, and underscores are allowed.
     */
    name: pulumi.Input<string>;
    /**
     * The endpoint path to health check against. Defaults to `/`.
     */
    path?: pulumi.Input<string>;
    /**
     * Port number to connect to for the health check. Defaults to `80`.
     */
    port?: pulumi.Input<number>;
    /**
     * The number of retries to attempt in case of a timeout before marking the origin as unhealthy. Retries are attempted immediately. Defaults to `2`.
     */
    retries?: pulumi.Input<number>;
    /**
     * If suspended, no health checks are sent to the origin. Defaults to `false`.
     */
    suspended?: pulumi.Input<boolean>;
    /**
     * The timeout (in seconds) before marking the health check as failed. Defaults to `5`.
     */
    timeout?: pulumi.Input<number>;
    /**
     * The protocol to use for the health check. Available values: `TCP`, `HTTP`, `HTTPS`.
     */
    type: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
