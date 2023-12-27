// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Device Posture Rule resource. Device posture rules configure security policies for device posture checks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const eaxmple = new cloudflare.DevicePostureRule("eaxmple", {
 *     accountId: "f037e56e89293a057740de681ac9abbe",
 *     name: "Corporate devices posture rule",
 *     type: "os_version",
 *     description: "Device posture rule for corporate devices.",
 *     schedule: "24h",
 *     expiration: "24h",
 *     matches: [{
 *         platform: "linux",
 *     }],
 *     inputs: [{
 *         id: cloudflare_teams_list.corporate_devices.id,
 *         version: "1.0.0",
 *         operator: "<",
 *         osDistroName: "ubuntu",
 *         osDistroRevision: "1.0.0",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import cloudflare:index/devicePostureRule:DevicePostureRule example <account_id>/<device_posture_rule_id>
 * ```
 */
export class DevicePostureRule extends pulumi.CustomResource {
    /**
     * Get an existing DevicePostureRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DevicePostureRuleState, opts?: pulumi.CustomResourceOptions): DevicePostureRule {
        return new DevicePostureRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/devicePostureRule:DevicePostureRule';

    /**
     * Returns true if the given object is an instance of DevicePostureRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DevicePostureRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DevicePostureRule.__pulumiType;
    }

    /**
     * The account identifier to target for the resource.
     */
    public readonly accountId!: pulumi.Output<string>;
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Expire posture results after the specified amount of time. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    public readonly expiration!: pulumi.Output<string | undefined>;
    /**
     * Required for all rule types except `warp`, `gateway`, and `tanium`.
     */
    public readonly inputs!: pulumi.Output<outputs.DevicePostureRuleInput[]>;
    /**
     * The conditions that the client must match to run the rule.
     */
    public readonly matches!: pulumi.Output<outputs.DevicePostureRuleMatch[] | undefined>;
    /**
     * Name of the device posture rule.
     */
    public readonly name!: pulumi.Output<string | undefined>;
    /**
     * Tells the client when to run the device posture check. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    public readonly schedule!: pulumi.Output<string | undefined>;
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DevicePostureRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DevicePostureRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DevicePostureRuleArgs | DevicePostureRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DevicePostureRuleState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["expiration"] = state ? state.expiration : undefined;
            resourceInputs["inputs"] = state ? state.inputs : undefined;
            resourceInputs["matches"] = state ? state.matches : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DevicePostureRuleArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["expiration"] = args ? args.expiration : undefined;
            resourceInputs["inputs"] = args ? args.inputs : undefined;
            resourceInputs["matches"] = args ? args.matches : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DevicePostureRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DevicePostureRule resources.
 */
export interface DevicePostureRuleState {
    /**
     * The account identifier to target for the resource.
     */
    accountId?: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * Expire posture results after the specified amount of time. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    expiration?: pulumi.Input<string>;
    /**
     * Required for all rule types except `warp`, `gateway`, and `tanium`.
     */
    inputs?: pulumi.Input<pulumi.Input<inputs.DevicePostureRuleInput>[]>;
    /**
     * The conditions that the client must match to run the rule.
     */
    matches?: pulumi.Input<pulumi.Input<inputs.DevicePostureRuleMatch>[]>;
    /**
     * Name of the device posture rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Tells the client when to run the device posture check. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    schedule?: pulumi.Input<string>;
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DevicePostureRule resource.
 */
export interface DevicePostureRuleArgs {
    /**
     * The account identifier to target for the resource.
     */
    accountId: pulumi.Input<string>;
    description?: pulumi.Input<string>;
    /**
     * Expire posture results after the specified amount of time. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    expiration?: pulumi.Input<string>;
    /**
     * Required for all rule types except `warp`, `gateway`, and `tanium`.
     */
    inputs?: pulumi.Input<pulumi.Input<inputs.DevicePostureRuleInput>[]>;
    /**
     * The conditions that the client must match to run the rule.
     */
    matches?: pulumi.Input<pulumi.Input<inputs.DevicePostureRuleMatch>[]>;
    /**
     * Name of the device posture rule.
     */
    name?: pulumi.Input<string>;
    /**
     * Tells the client when to run the device posture check. Must be in the format `1h` or `30m`. Valid units are `h` and `m`.
     */
    schedule?: pulumi.Input<string>;
    /**
     * The device posture rule type. Available values: `serialNumber`, `file`, `application`, `gateway`, `warp`, `domainJoined`, `osVersion`, `diskEncryption`, `firewall`, `clientCertificate`, `workspaceOne`, `uniqueClientId`, `crowdstrikeS2s`, `sentinelone`, `kolide`, `taniumS2s`, `intune`, `sentineloneS2s`.
     */
    type: pulumi.Input<string>;
}
