// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Policy resource. Access Policies are
 * used in conjunction with Access Applications to restrict access to
 * a particular resource.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 * most cases using either is fine. However, if you're using a scoped
 * access token, you must provide the argument that matches the token's
 * scope. For example, an access token that is scoped to the "example.com"
 * zone needs to use the `zoneId` argument.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Allowing access to `test@example.com` email address only
 * const testPolicyAccessPolicy = new cloudflare.AccessPolicy("testPolicyAccessPolicy", {
 *     applicationId: "cb029e245cfdd66dc8d2e570d5dd3322",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "staging policy",
 *     precedence: 1,
 *     decision: "allow",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: [{
 *         emails: ["test@example.com"],
 *     }],
 * });
 * // Allowing `test@example.com` to access but only when coming from a
 * // specific IP.
 * const testPolicyIndex_accessPolicyAccessPolicy = new cloudflare.AccessPolicy("testPolicyIndex/accessPolicyAccessPolicy", {
 *     applicationId: "cb029e245cfdd66dc8d2e570d5dd3322",
 *     zoneId: "0da42c8d2132a9ddaf714f9e7c920711",
 *     name: "staging policy",
 *     precedence: 1,
 *     decision: "allow",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: [{
 *         ips: [_var.office_ip],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Account level import.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example account/<account_id>/<application_id>/<policy_id>
 * ```
 *
 *  Zone level import.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example zone/<zone_id>/<application_id>/<policy_id>
 * ```
 */
export class AccessPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AccessPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessPolicyState, opts?: pulumi.CustomResourceOptions): AccessPolicy {
        return new AccessPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessPolicy:AccessPolicy';

    /**
     * Returns true if the given object is an instance of AccessPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessPolicy.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    public readonly applicationId!: pulumi.Output<string>;
    public readonly approvalGroups!: pulumi.Output<outputs.AccessPolicyApprovalGroup[] | undefined>;
    public readonly approvalRequired!: pulumi.Output<boolean | undefined>;
    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
     */
    public readonly decision!: pulumi.Output<string>;
    /**
     * A series of access conditions, see Access Groups.
     */
    public readonly excludes!: pulumi.Output<outputs.AccessPolicyExclude[] | undefined>;
    /**
     * A series of access conditions, see Access Groups.
     */
    public readonly includes!: pulumi.Output<outputs.AccessPolicyInclude[]>;
    /**
     * Require this application to be served in an isolated browser for users matching this policy.
     */
    public readonly isolationRequired!: pulumi.Output<boolean | undefined>;
    /**
     * Friendly name of the Access Policy.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The unique precedence for policies on a single application.
     */
    public readonly precedence!: pulumi.Output<number>;
    /**
     * The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
     */
    public readonly purposeJustificationPrompt!: pulumi.Output<string | undefined>;
    /**
     * Whether to prompt the user for a justification for accessing the resource.
     */
    public readonly purposeJustificationRequired!: pulumi.Output<boolean | undefined>;
    /**
     * A series of access conditions, see Access Groups.
     */
    public readonly requires!: pulumi.Output<outputs.AccessPolicyRequire[] | undefined>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     */
    public readonly sessionDuration!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessPolicyArgs | AccessPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessPolicyState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["approvalGroups"] = state ? state.approvalGroups : undefined;
            resourceInputs["approvalRequired"] = state ? state.approvalRequired : undefined;
            resourceInputs["decision"] = state ? state.decision : undefined;
            resourceInputs["excludes"] = state ? state.excludes : undefined;
            resourceInputs["includes"] = state ? state.includes : undefined;
            resourceInputs["isolationRequired"] = state ? state.isolationRequired : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["precedence"] = state ? state.precedence : undefined;
            resourceInputs["purposeJustificationPrompt"] = state ? state.purposeJustificationPrompt : undefined;
            resourceInputs["purposeJustificationRequired"] = state ? state.purposeJustificationRequired : undefined;
            resourceInputs["requires"] = state ? state.requires : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessPolicyArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.decision === undefined) && !opts.urn) {
                throw new Error("Missing required property 'decision'");
            }
            if ((!args || args.includes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'includes'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.precedence === undefined) && !opts.urn) {
                throw new Error("Missing required property 'precedence'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["approvalGroups"] = args ? args.approvalGroups : undefined;
            resourceInputs["approvalRequired"] = args ? args.approvalRequired : undefined;
            resourceInputs["decision"] = args ? args.decision : undefined;
            resourceInputs["excludes"] = args ? args.excludes : undefined;
            resourceInputs["includes"] = args ? args.includes : undefined;
            resourceInputs["isolationRequired"] = args ? args.isolationRequired : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["precedence"] = args ? args.precedence : undefined;
            resourceInputs["purposeJustificationPrompt"] = args ? args.purposeJustificationPrompt : undefined;
            resourceInputs["purposeJustificationRequired"] = args ? args.purposeJustificationRequired : undefined;
            resourceInputs["requires"] = args ? args.requires : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessPolicy resources.
 */
export interface AccessPolicyState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    applicationId?: pulumi.Input<string>;
    approvalGroups?: pulumi.Input<pulumi.Input<inputs.AccessPolicyApprovalGroup>[]>;
    approvalRequired?: pulumi.Input<boolean>;
    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
     */
    decision?: pulumi.Input<string>;
    /**
     * A series of access conditions, see Access Groups.
     */
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyExclude>[]>;
    /**
     * A series of access conditions, see Access Groups.
     */
    includes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyInclude>[]>;
    /**
     * Require this application to be served in an isolated browser for users matching this policy.
     */
    isolationRequired?: pulumi.Input<boolean>;
    /**
     * Friendly name of the Access Policy.
     */
    name?: pulumi.Input<string>;
    /**
     * The unique precedence for policies on a single application.
     */
    precedence?: pulumi.Input<number>;
    /**
     * The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
     */
    purposeJustificationPrompt?: pulumi.Input<string>;
    /**
     * Whether to prompt the user for a justification for accessing the resource.
     */
    purposeJustificationRequired?: pulumi.Input<boolean>;
    /**
     * A series of access conditions, see Access Groups.
     */
    requires?: pulumi.Input<pulumi.Input<inputs.AccessPolicyRequire>[]>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessPolicy resource.
 */
export interface AccessPolicyArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * The ID of the application the policy is associated with.
     */
    applicationId: pulumi.Input<string>;
    approvalGroups?: pulumi.Input<pulumi.Input<inputs.AccessPolicyApprovalGroup>[]>;
    approvalRequired?: pulumi.Input<boolean>;
    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `nonIdentity`, `bypass`.
     */
    decision: pulumi.Input<string>;
    /**
     * A series of access conditions, see Access Groups.
     */
    excludes?: pulumi.Input<pulumi.Input<inputs.AccessPolicyExclude>[]>;
    /**
     * A series of access conditions, see Access Groups.
     */
    includes: pulumi.Input<pulumi.Input<inputs.AccessPolicyInclude>[]>;
    /**
     * Require this application to be served in an isolated browser for users matching this policy.
     */
    isolationRequired?: pulumi.Input<boolean>;
    /**
     * Friendly name of the Access Policy.
     */
    name: pulumi.Input<string>;
    /**
     * The unique precedence for policies on a single application.
     */
    precedence: pulumi.Input<number>;
    /**
     * The prompt to display to the user for a justification for accessing the resource. Required when using `purposeJustificationRequired`.
     */
    purposeJustificationPrompt?: pulumi.Input<string>;
    /**
     * Whether to prompt the user for a justification for accessing the resource.
     */
    purposeJustificationRequired?: pulumi.Input<boolean>;
    /**
     * A series of access conditions, see Access Groups.
     */
    requires?: pulumi.Input<pulumi.Input<inputs.AccessPolicyRequire>[]>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
