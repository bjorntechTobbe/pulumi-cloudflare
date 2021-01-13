// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a resource which manages Cloudflare API tokens.
 *
 * Read more about permission groups and their applicable scopes in
 * [the official documentation](https://developers.cloudflare.com/api/tokens/create/permissions).
 *
 * ## Example Usage
 * ### User Permissions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const all = cloudflare.getApiTokenPermissionGroups({});
 * // Token allowed to create new tokens.
 * // Can only be used from specific ip range.
 * const apiTokenCreate = new cloudflare.ApiToken("apiTokenCreate", {
 *     name: "api_token_create",
 *     policies: [{
 *         permissionGroups: [all.then(all => all.permissions["API Tokens Write"])],
 *         resources: {
 *             `com.cloudflare.api.user.${_var.user_id}`: "*",
 *         },
 *     }],
 *     condition: {
 *         requestIp: {
 *             ins: ["192.0.2.1/32"],
 *             notIns: ["198.51.100.1/32"],
 *         },
 *     },
 * });
 * ```
 * ### Account permissions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const all = cloudflare.getApiTokenPermissionGroups({});
 * // Token allowed to read audit logs from all accounts.
 * const logsAccountAll = new cloudflare.ApiToken("logsAccountAll", {
 *     name: "logs_account_all",
 *     policies: [{
 *         permissionGroups: [all.then(all => all.permissions["Access: Audit Logs Read"])],
 *         resources: {
 *             "com.cloudflare.api.account.*": "*",
 *         },
 *     }],
 * });
 * // Token allowed to read audit logs from specific account.
 * const logsAccount = new cloudflare.ApiToken("logsAccount", {
 *     name: "logs_account",
 *     policies: [{
 *         permissionGroups: [all.then(all => all.permissions["Access: Audit Logs Read"])],
 *         resources: {
 *             `com.cloudflare.api.account.${_var.account_id}`: "*",
 *         },
 *     }],
 * });
 * ```
 * ### Zone Permissions
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * const all = cloudflare.getApiTokenPermissionGroups({});
 * // Token allowed to edit DNS entries and TLS certs for specific zone.
 * const dnsTlsEdit = new cloudflare.ApiToken("dnsTlsEdit", {
 *     name: "dns_tls_edit",
 *     policies: [{
 *         permissionGroups: [
 *             all.then(all => all.permissions["DNS Write"]),
 *             all.then(all => all.permissions["SSL and Certificates Write"]),
 *         ],
 *         resources: {
 *             `com.cloudflare.api.account.zone.${_var.zone_id}`: "*",
 *         },
 *     }],
 * });
 * // Token allowed to edit DNS entries for all zones except one.
 * const dnsTlsEditAllExceptOne = new cloudflare.ApiToken("dnsTlsEditAllExceptOne", {
 *     name: "dns_tls_edit_all_except_one",
 *     policies: [
 *         {
 *             permissionGroups: [all.then(all => all.permissions["DNS Write"])],
 *             resources: {
 *                 "com.cloudflare.api.account.zone.*": "*",
 *             },
 *         },
 *         {
 *             permissionGroups: [all.then(all => all.permissions["DNS Write"])],
 *             resources: {
 *                 `com.cloudflare.api.account.zone.${_var.zone_id}`: "*",
 *             },
 *             effect: "deny",
 *         },
 *     ],
 * });
 * // Token allowed to edit DNS entries for all zones from specific account.
 * const dnsEditAllAccount = new cloudflare.ApiToken("dnsEditAllAccount", {
 *     name: "dns_edit_all_account",
 *     policies: [{
 *         permissionGroups: [all.then(all => all.permissions["DNS Write"])],
 *         resources: {
 *             `com.cloudflare.api.account.${_var.account_id}`: JSON.stringify({
 *                 "com.cloudflare.api.account.zone.*": "*",
 *             }),
 *         },
 *     }],
 * });
 * ```
 */
export class ApiToken extends pulumi.CustomResource {
    /**
     * Get an existing ApiToken resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiTokenState, opts?: pulumi.CustomResourceOptions): ApiToken {
        return new ApiToken(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/apiToken:ApiToken';

    /**
     * Returns true if the given object is an instance of ApiToken.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiToken {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiToken.__pulumiType;
    }

    /**
     * Condition block. See the definition below.
     */
    public readonly condition!: pulumi.Output<outputs.ApiTokenCondition | undefined>;
    /**
     * The RFC3339 timestamp of when the API Token was issued.
     */
    public /*out*/ readonly issuedOn!: pulumi.Output<string>;
    /**
     * The RFC3339 timestamp of when the API Token was last modified.
     */
    public /*out*/ readonly modifiedOn!: pulumi.Output<string>;
    /**
     * Name of the APIToken.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Permissions policy. Multiple policy blocks can be defined.
     * See the definition below.
     */
    public readonly policies!: pulumi.Output<outputs.ApiTokenPolicy[]>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The value of the API Token.
     */
    public /*out*/ readonly value!: pulumi.Output<string>;

    /**
     * Create a ApiToken resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiTokenArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiTokenArgs | ApiTokenState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApiTokenState | undefined;
            inputs["condition"] = state ? state.condition : undefined;
            inputs["issuedOn"] = state ? state.issuedOn : undefined;
            inputs["modifiedOn"] = state ? state.modifiedOn : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["policies"] = state ? state.policies : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as ApiTokenArgs | undefined;
            if ((!args || args.name === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.policies === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'policies'");
            }
            inputs["condition"] = args ? args.condition : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["policies"] = args ? args.policies : undefined;
            inputs["issuedOn"] = undefined /*out*/;
            inputs["modifiedOn"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
            inputs["value"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ApiToken.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiToken resources.
 */
export interface ApiTokenState {
    /**
     * Condition block. See the definition below.
     */
    readonly condition?: pulumi.Input<inputs.ApiTokenCondition>;
    /**
     * The RFC3339 timestamp of when the API Token was issued.
     */
    readonly issuedOn?: pulumi.Input<string>;
    /**
     * The RFC3339 timestamp of when the API Token was last modified.
     */
    readonly modifiedOn?: pulumi.Input<string>;
    /**
     * Name of the APIToken.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Permissions policy. Multiple policy blocks can be defined.
     * See the definition below.
     */
    readonly policies?: pulumi.Input<pulumi.Input<inputs.ApiTokenPolicy>[]>;
    readonly status?: pulumi.Input<string>;
    /**
     * The value of the API Token.
     */
    readonly value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiToken resource.
 */
export interface ApiTokenArgs {
    /**
     * Condition block. See the definition below.
     */
    readonly condition?: pulumi.Input<inputs.ApiTokenCondition>;
    /**
     * Name of the APIToken.
     */
    readonly name: pulumi.Input<string>;
    /**
     * Permissions policy. Multiple policy blocks can be defined.
     * See the definition below.
     */
    readonly policies: pulumi.Input<pulumi.Input<inputs.ApiTokenPolicy>[]>;
}
