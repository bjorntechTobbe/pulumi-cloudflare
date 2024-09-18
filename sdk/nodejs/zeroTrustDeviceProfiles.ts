// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Device Settings Policy resource. Device policies configure settings applied to WARP devices.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const developerWarpPolicy = new cloudflare.ZeroTrustDeviceProfiles("developer_warp_policy", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Developers WARP settings policy",
 *     description: "Developers WARP settings policy description",
 *     precedence: 10,
 *     match: "any(identity.groups.name[*] in {\"Developers\"})",
 *     "default": false,
 *     enabled: true,
 *     allowModeSwitch: true,
 *     allowUpdates: true,
 *     allowedToLeave: true,
 *     autoConnect: 0,
 *     captivePortal: 5,
 *     disableAutoFallback: true,
 *     supportUrl: "https://cloudflare.com",
 *     switchLocked: true,
 *     serviceModeV2Mode: "warp",
 *     serviceModeV2Port: 3000,
 *     excludeOfficeIps: false,
 * });
 * ```
 *
 * ## Import
 *
 * For default device settings policies you must use "default" as the policy ID.
 *
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustDeviceProfiles:ZeroTrustDeviceProfiles example <account_id>/<device_policy_id>
 * ```
 */
export class ZeroTrustDeviceProfiles extends pulumi.CustomResource {
    /**
     * Get an existing ZeroTrustDeviceProfiles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ZeroTrustDeviceProfilesState, opts?: pulumi.CustomResourceOptions): ZeroTrustDeviceProfiles {
        return new ZeroTrustDeviceProfiles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/zeroTrustDeviceProfiles:ZeroTrustDeviceProfiles';

    /**
     * Returns true if the given object is an instance of ZeroTrustDeviceProfiles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ZeroTrustDeviceProfiles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ZeroTrustDeviceProfiles.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * Whether to allow mode switch for this policy.
     */
    public readonly allowModeSwitch!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to allow updates under this policy.
     */
    public readonly allowUpdates!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to allow devices to leave the organization. Defaults to `true`.
     */
    public readonly allowedToLeave!: pulumi.Output<boolean | undefined>;
    /**
     * The amount of time in seconds to reconnect after having been disabled.
     */
    public readonly autoConnect!: pulumi.Output<number | undefined>;
    /**
     * The captive portal value for this policy. Defaults to `180`.
     */
    public readonly captivePortal!: pulumi.Output<number | undefined>;
    /**
     * Whether the policy refers to the default account policy.
     */
    public readonly default!: pulumi.Output<boolean | undefined>;
    /**
     * Description of Policy.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Whether to disable auto fallback for this policy.
     */
    public readonly disableAutoFallback!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to add Microsoft IPs to split tunnel exclusions.
     */
    public readonly excludeOfficeIps!: pulumi.Output<boolean | undefined>;
    /**
     * Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     */
    public readonly match!: pulumi.Output<string | undefined>;
    /**
     * Name of the policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The precedence of the policy. Lower values indicate higher precedence.
     */
    public readonly precedence!: pulumi.Output<number | undefined>;
    /**
     * The service mode. Available values: `1dot1`, `warp`, `proxy`, `postureOnly`, `warpTunnelOnly`. Defaults to `warp`.
     */
    public readonly serviceModeV2Mode!: pulumi.Output<string | undefined>;
    /**
     * The port to use for the proxy service mode. Required when using `serviceModeV2Mode`.
     */
    public readonly serviceModeV2Port!: pulumi.Output<number | undefined>;
    /**
     * The support URL that will be opened when sending feedback.
     */
    public readonly supportUrl!: pulumi.Output<string | undefined>;
    /**
     * Enablement of the ZT client switch lock.
     */
    public readonly switchLocked!: pulumi.Output<boolean | undefined>;
    /**
     * Determines which tunnel protocol to use. Available values: `""`, `wireguard`, `masque`. Defaults to `wireguard`.
     */
    public readonly tunnelProtocol!: pulumi.Output<string | undefined>;

    /**
     * Create a ZeroTrustDeviceProfiles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ZeroTrustDeviceProfilesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ZeroTrustDeviceProfilesArgs | ZeroTrustDeviceProfilesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ZeroTrustDeviceProfilesState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowModeSwitch"] = state ? state.allowModeSwitch : undefined;
            resourceInputs["allowUpdates"] = state ? state.allowUpdates : undefined;
            resourceInputs["allowedToLeave"] = state ? state.allowedToLeave : undefined;
            resourceInputs["autoConnect"] = state ? state.autoConnect : undefined;
            resourceInputs["captivePortal"] = state ? state.captivePortal : undefined;
            resourceInputs["default"] = state ? state.default : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disableAutoFallback"] = state ? state.disableAutoFallback : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["excludeOfficeIps"] = state ? state.excludeOfficeIps : undefined;
            resourceInputs["match"] = state ? state.match : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["precedence"] = state ? state.precedence : undefined;
            resourceInputs["serviceModeV2Mode"] = state ? state.serviceModeV2Mode : undefined;
            resourceInputs["serviceModeV2Port"] = state ? state.serviceModeV2Port : undefined;
            resourceInputs["supportUrl"] = state ? state.supportUrl : undefined;
            resourceInputs["switchLocked"] = state ? state.switchLocked : undefined;
            resourceInputs["tunnelProtocol"] = state ? state.tunnelProtocol : undefined;
        } else {
            const args = argsOrState as ZeroTrustDeviceProfilesArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowModeSwitch"] = args ? args.allowModeSwitch : undefined;
            resourceInputs["allowUpdates"] = args ? args.allowUpdates : undefined;
            resourceInputs["allowedToLeave"] = args ? args.allowedToLeave : undefined;
            resourceInputs["autoConnect"] = args ? args.autoConnect : undefined;
            resourceInputs["captivePortal"] = args ? args.captivePortal : undefined;
            resourceInputs["default"] = args ? args.default : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disableAutoFallback"] = args ? args.disableAutoFallback : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["excludeOfficeIps"] = args ? args.excludeOfficeIps : undefined;
            resourceInputs["match"] = args ? args.match : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["precedence"] = args ? args.precedence : undefined;
            resourceInputs["serviceModeV2Mode"] = args ? args.serviceModeV2Mode : undefined;
            resourceInputs["serviceModeV2Port"] = args ? args.serviceModeV2Port : undefined;
            resourceInputs["supportUrl"] = args ? args.supportUrl : undefined;
            resourceInputs["switchLocked"] = args ? args.switchLocked : undefined;
            resourceInputs["tunnelProtocol"] = args ? args.tunnelProtocol : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ZeroTrustDeviceProfiles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ZeroTrustDeviceProfiles resources.
 */
export interface ZeroTrustDeviceProfilesState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    /**
     * Whether to allow mode switch for this policy.
     */
    allowModeSwitch?: pulumi.Input<boolean>;
    /**
     * Whether to allow updates under this policy.
     */
    allowUpdates?: pulumi.Input<boolean>;
    /**
     * Whether to allow devices to leave the organization. Defaults to `true`.
     */
    allowedToLeave?: pulumi.Input<boolean>;
    /**
     * The amount of time in seconds to reconnect after having been disabled.
     */
    autoConnect?: pulumi.Input<number>;
    /**
     * The captive portal value for this policy. Defaults to `180`.
     */
    captivePortal?: pulumi.Input<number>;
    /**
     * Whether the policy refers to the default account policy.
     */
    default?: pulumi.Input<boolean>;
    /**
     * Description of Policy.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether to disable auto fallback for this policy.
     */
    disableAutoFallback?: pulumi.Input<boolean>;
    /**
     * Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether to add Microsoft IPs to split tunnel exclusions.
     */
    excludeOfficeIps?: pulumi.Input<boolean>;
    /**
     * Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     */
    match?: pulumi.Input<string>;
    /**
     * Name of the policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The precedence of the policy. Lower values indicate higher precedence.
     */
    precedence?: pulumi.Input<number>;
    /**
     * The service mode. Available values: `1dot1`, `warp`, `proxy`, `postureOnly`, `warpTunnelOnly`. Defaults to `warp`.
     */
    serviceModeV2Mode?: pulumi.Input<string>;
    /**
     * The port to use for the proxy service mode. Required when using `serviceModeV2Mode`.
     */
    serviceModeV2Port?: pulumi.Input<number>;
    /**
     * The support URL that will be opened when sending feedback.
     */
    supportUrl?: pulumi.Input<string>;
    /**
     * Enablement of the ZT client switch lock.
     */
    switchLocked?: pulumi.Input<boolean>;
    /**
     * Determines which tunnel protocol to use. Available values: `""`, `wireguard`, `masque`. Defaults to `wireguard`.
     */
    tunnelProtocol?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ZeroTrustDeviceProfiles resource.
 */
export interface ZeroTrustDeviceProfilesArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    /**
     * Whether to allow mode switch for this policy.
     */
    allowModeSwitch?: pulumi.Input<boolean>;
    /**
     * Whether to allow updates under this policy.
     */
    allowUpdates?: pulumi.Input<boolean>;
    /**
     * Whether to allow devices to leave the organization. Defaults to `true`.
     */
    allowedToLeave?: pulumi.Input<boolean>;
    /**
     * The amount of time in seconds to reconnect after having been disabled.
     */
    autoConnect?: pulumi.Input<number>;
    /**
     * The captive portal value for this policy. Defaults to `180`.
     */
    captivePortal?: pulumi.Input<number>;
    /**
     * Whether the policy refers to the default account policy.
     */
    default?: pulumi.Input<boolean>;
    /**
     * Description of Policy.
     */
    description: pulumi.Input<string>;
    /**
     * Whether to disable auto fallback for this policy.
     */
    disableAutoFallback?: pulumi.Input<boolean>;
    /**
     * Whether the policy is enabled (cannot be set for default policies). Defaults to `true`.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Whether to add Microsoft IPs to split tunnel exclusions.
     */
    excludeOfficeIps?: pulumi.Input<boolean>;
    /**
     * Wirefilter expression to match a device against when evaluating whether this policy should take effect for that device.
     */
    match?: pulumi.Input<string>;
    /**
     * Name of the policy.
     */
    name: pulumi.Input<string>;
    /**
     * The precedence of the policy. Lower values indicate higher precedence.
     */
    precedence?: pulumi.Input<number>;
    /**
     * The service mode. Available values: `1dot1`, `warp`, `proxy`, `postureOnly`, `warpTunnelOnly`. Defaults to `warp`.
     */
    serviceModeV2Mode?: pulumi.Input<string>;
    /**
     * The port to use for the proxy service mode. Required when using `serviceModeV2Mode`.
     */
    serviceModeV2Port?: pulumi.Input<number>;
    /**
     * The support URL that will be opened when sending feedback.
     */
    supportUrl?: pulumi.Input<string>;
    /**
     * Enablement of the ZT client switch lock.
     */
    switchLocked?: pulumi.Input<boolean>;
    /**
     * Determines which tunnel protocol to use. Available values: `""`, `wireguard`, `masque`. Defaults to `wireguard`.
     */
    tunnelProtocol?: pulumi.Input<string>;
}
