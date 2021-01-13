// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Group resource. Access Groups are used
 * in conjunction with Access Policies to restrict access to a
 * particular resource based on group membership.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as cloudflare from "@pulumi/cloudflare";
 *
 * // Allowing access to `test@example.com` email address only
 * const testGroupAccessGroup = new cloudflare.AccessGroup("testGroupAccessGroup", {
 *     accountId: "975ecf5a45e3bcb680dba0722a420ad9",
 *     name: "staging group",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 * });
 * // Allowing `test@example.com` to access but only when coming from a
 * // specific IP.
 * const testGroupIndex_accessGroupAccessGroup = new cloudflare.AccessGroup("testGroupIndex/accessGroupAccessGroup", {
 *     accountId: "975ecf5a45e3bcb680dba0722a420ad9",
 *     name: "staging group",
 *     includes: [{
 *         emails: ["test@example.com"],
 *     }],
 *     requires: {
 *         ips: [_var.office_ip],
 *     },
 * });
 * ```
 * ## Conditions
 *
 * `require`, `exclude` and `include` arguments share the available
 * conditions which can be applied. The conditions are:
 *
 * * `ip` - (Optional) A list of IP addresses or ranges. Example:
 * `ip = ["1.2.3.4", "10.0.0.0/2"]`
 * * `email` - (Optional) A list of email addresses. Example:
 * `email = ["test@example.com"]`
 * * `emailDomain` - (Optional) A list of email domains. Example:
 * `emailDomain = ["example.com"]`
 * * `serviceToken` - (Optional) A list of service token ids. Example:
 * `serviceToken = [cloudflare_access_service_token.demo.id]`
 * * `anyValidServiceToken` - (Optional) Boolean indicating if allow
 * all tokens to be granted. Example: `anyValidServiceToken = true`
 * * `group` - (Optional) A list of access group ids. Example:
 * `group = [cloudflare_access_group.demo.id]`
 * * `everyone` - (Optional) Boolean indicating permitting access for all
 * requests. Example: `everyone = true`
 * * `certificate` - (Optional) Whether to use mTLS certificate authentication.
 * * `commonName` - (Optional) Use a certificate common name to authenticate with.
 * * `authMethod` - (Optional) A string identifying the authentication
 * method code. The list of codes are listed here: https://tools.ietf.org/html/rfc8176#section-2.
 * Custom values are also supported.
 * * `geo` - (Optional) A list of country codes. Example: `geo = ["US"]`
 * * `gsuite` - (Optional) Use GSuite as the authentication mechanism. Example:
 * * `github` - (Optional) Use a GitHub organization as the `include` condition. Example:
 * * `azure` - (Optional) Use Azure AD as the `include` condition. Example:
 * * `okta` - (Optional) Use Okta as the `include` condition. Example:
 * * `saml` - (Optional) Use an external SAML setup as the `include` condition.
 * Example:
 *
 * ## Import
 *
 * Access Groups can be imported using a composite ID formed of account ID and group ID.
 *
 * ```sh
 *  $ pulumi import cloudflare:index/accessGroup:AccessGroup staging 975ecf5a45e3bcb680dba0722a420ad9/67ea780ce4982c1cfbe6b7293afc765d
 * ```
 *
 *  where * `975ecf5a45e3bcb680dba0722a420ad9` - Account ID * `67ea780ce4982c1cfbe6b7293afc765d` - Access Group ID
 */
export class AccessGroup extends pulumi.CustomResource {
    /**
     * Get an existing AccessGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessGroupState, opts?: pulumi.CustomResourceOptions): AccessGroup {
        return new AccessGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessGroup:AccessGroup';

    /**
     * Returns true if the given object is an instance of AccessGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessGroup.__pulumiType;
    }

    /**
     * The ID of the account the group is associated with. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string | undefined>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    public readonly excludes!: pulumi.Output<outputs.AccessGroupExclude[] | undefined>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    public readonly includes!: pulumi.Output<outputs.AccessGroupInclude[]>;
    /**
     * Friendly name of the Access Group.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    public readonly requires!: pulumi.Output<outputs.AccessGroupRequire[] | undefined>;
    /**
     * The ID of the zone the group is associated with. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessGroupArgs | AccessGroupState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AccessGroupState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["excludes"] = state ? state.excludes : undefined;
            inputs["includes"] = state ? state.includes : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["requires"] = state ? state.requires : undefined;
            inputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessGroupArgs | undefined;
            if ((!args || args.includes === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'includes'");
            }
            if ((!args || args.name === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'name'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["excludes"] = args ? args.excludes : undefined;
            inputs["includes"] = args ? args.includes : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["requires"] = args ? args.requires : undefined;
            inputs["zoneId"] = args ? args.zoneId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AccessGroup.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessGroup resources.
 */
export interface AccessGroupState {
    /**
     * The ID of the account the group is associated with. Conflicts with `zoneId`.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly excludes?: pulumi.Input<pulumi.Input<inputs.AccessGroupExclude>[]>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly includes?: pulumi.Input<pulumi.Input<inputs.AccessGroupInclude>[]>;
    /**
     * Friendly name of the Access Group.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly requires?: pulumi.Input<pulumi.Input<inputs.AccessGroupRequire>[]>;
    /**
     * The ID of the zone the group is associated with. Conflicts with `accountId`.
     */
    readonly zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessGroup resource.
 */
export interface AccessGroupArgs {
    /**
     * The ID of the account the group is associated with. Conflicts with `zoneId`.
     */
    readonly accountId?: pulumi.Input<string>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly excludes?: pulumi.Input<pulumi.Input<inputs.AccessGroupExclude>[]>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly includes: pulumi.Input<pulumi.Input<inputs.AccessGroupInclude>[]>;
    /**
     * Friendly name of the Access Group.
     */
    readonly name: pulumi.Input<string>;
    /**
     * A series of access conditions, see below for
     * full list.
     */
    readonly requires?: pulumi.Input<pulumi.Input<inputs.AccessGroupRequire>[]>;
    /**
     * The ID of the zone the group is associated with. Conflicts with `accountId`.
     */
    readonly zoneId?: pulumi.Input<string>;
}
