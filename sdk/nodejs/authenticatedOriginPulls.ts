// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Authenticated Origin Pulls resource. A `cloudflare.AuthenticatedOriginPulls`
 * resource is required to use Per-Zone or Per-Hostname Authenticated
 * Origin Pulls.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Authenticated Origin Pulls
 * const myAop = new cloudflare.AuthenticatedOriginPulls("my_aop", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     enabled: true,
 * });
 * // Per-Zone Authenticated Origin Pulls
 * const myPerZoneAopCert = new cloudflare.AuthenticatedOriginPullsCertificate("my_per_zone_aop_cert", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     certificate: "-----INSERT CERTIFICATE-----",
 *     privateKey: "-----INSERT PRIVATE KEY-----",
 *     type: "per-zone",
 * });
 * const myPerZoneAop = new cloudflare.AuthenticatedOriginPulls("my_per_zone_aop", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     authenticatedOriginPullsCertificate: myPerZoneAopCert.id,
 *     enabled: true,
 * });
 * // Per-Hostname Authenticated Origin Pulls
 * const myPerHostnameAopCert = new cloudflare.AuthenticatedOriginPullsCertificate("my_per_hostname_aop_cert", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     certificate: "-----INSERT CERTIFICATE-----",
 *     privateKey: "-----INSERT PRIVATE KEY-----",
 *     type: "per-hostname",
 * });
 * const myPerHostnameAop = new cloudflare.AuthenticatedOriginPulls("my_per_hostname_aop", {
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     authenticatedOriginPullsCertificate: myPerHostnameAopCert.id,
 *     hostname: "aop.example.com",
 *     enabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * global
 *
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>
 * ```
 *
 * per zone
 *
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>
 * ```
 *
 * per hostname
 *
 * ```sh
 * $ pulumi import cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls example <zone_id>/<certificate_id>/<hostname>
 * ```
 */
export class AuthenticatedOriginPulls extends pulumi.CustomResource {
    /**
     * Get an existing AuthenticatedOriginPulls resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuthenticatedOriginPullsState, opts?: pulumi.CustomResourceOptions): AuthenticatedOriginPulls {
        return new AuthenticatedOriginPulls(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/authenticatedOriginPulls:AuthenticatedOriginPulls';

    /**
     * Returns true if the given object is an instance of AuthenticatedOriginPulls.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuthenticatedOriginPulls {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuthenticatedOriginPulls.__pulumiType;
    }

    /**
     * The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     */
    public readonly authenticatedOriginPullsCertificate!: pulumi.Output<string | undefined>;
    /**
     * Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     */
    public readonly hostname!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AuthenticatedOriginPulls resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuthenticatedOriginPullsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuthenticatedOriginPullsArgs | AuthenticatedOriginPullsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuthenticatedOriginPullsState | undefined;
            resourceInputs["authenticatedOriginPullsCertificate"] = state ? state.authenticatedOriginPullsCertificate : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AuthenticatedOriginPullsArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.zoneId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zoneId'");
            }
            resourceInputs["authenticatedOriginPullsCertificate"] = args ? args.authenticatedOriginPullsCertificate : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AuthenticatedOriginPulls.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuthenticatedOriginPulls resources.
 */
export interface AuthenticatedOriginPullsState {
    /**
     * The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     */
    authenticatedOriginPullsCertificate?: pulumi.Input<string>;
    /**
     * Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AuthenticatedOriginPulls resource.
 */
export interface AuthenticatedOriginPullsArgs {
    /**
     * The ID of an uploaded Authenticated Origin Pulls certificate. If no hostname is provided, this certificate will be used zone wide as Per-Zone Authenticated Origin Pulls.
     */
    authenticatedOriginPullsCertificate?: pulumi.Input<string>;
    /**
     * Whether to enable Authenticated Origin Pulls on the given zone or hostname.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Specify a hostname to enable Per-Hostname Authenticated Origin Pulls on, using the provided certificate.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     */
    zoneId: pulumi.Input<string>;
}
