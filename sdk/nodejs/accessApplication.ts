// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a Cloudflare Access Application resource. Access
 * Applications are used to restrict access to a whole application using an
 * authorisation gateway managed by Cloudflare.
 *
 * > It's required that an `accountId` or `zoneId` is provided and in
 *    most cases using either is fine. However, if you're using a scoped
 *    access token, you must provide the argument that matches the token's
 *    scope. For example, an access token that is scoped to the "example.com"
 *    zone needs to use the `zoneId` argument.
 *
 * ## Import
 *
 * ```sh
 * $ pulumi import cloudflare:index/accessApplication:AccessApplication example <account_id>/<application_id>
 * ```
 */
export class AccessApplication extends pulumi.CustomResource {
    /**
     * Get an existing AccessApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessApplicationState, opts?: pulumi.CustomResourceOptions): AccessApplication {
        return new AccessApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'cloudflare:index/accessApplication:AccessApplication';

    /**
     * Returns true if the given object is an instance of AccessApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessApplication.__pulumiType;
    }

    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
     */
    public readonly allowAuthenticateViaWarp!: pulumi.Output<boolean | undefined>;
    /**
     * The identity providers selected for the application.
     */
    public readonly allowedIdps!: pulumi.Output<string[] | undefined>;
    /**
     * The logo URL of the app launcher.
     */
    public readonly appLauncherLogoUrl!: pulumi.Output<string | undefined>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    public readonly appLauncherVisible!: pulumi.Output<boolean | undefined>;
    /**
     * Application Audience (AUD) Tag of the application.
     */
    public /*out*/ readonly aud!: pulumi.Output<string>;
    /**
     * Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
     */
    public readonly autoRedirectToIdentity!: pulumi.Output<boolean | undefined>;
    /**
     * The background color of the app launcher.
     */
    public readonly bgColor!: pulumi.Output<string | undefined>;
    /**
     * CORS configuration for the Access Application. See below for reference structure.
     */
    public readonly corsHeaders!: pulumi.Output<outputs.AccessApplicationCorsHeader[] | undefined>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    public readonly customDenyMessage!: pulumi.Output<string | undefined>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     */
    public readonly customDenyUrl!: pulumi.Output<string | undefined>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     */
    public readonly customNonIdentityDenyUrl!: pulumi.Output<string | undefined>;
    /**
     * The custom pages selected for the application.
     */
    public readonly customPages!: pulumi.Output<string[] | undefined>;
    /**
     * The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    public readonly enableBindingCookie!: pulumi.Output<boolean | undefined>;
    /**
     * The footer links of the app launcher.
     */
    public readonly footerLinks!: pulumi.Output<outputs.AccessApplicationFooterLink[] | undefined>;
    /**
     * The background color of the header bar in the app launcher.
     */
    public readonly headerBgColor!: pulumi.Output<string | undefined>;
    /**
     * Option to add the `HttpOnly` cookie flag to access tokens.
     */
    public readonly httpOnlyCookieAttribute!: pulumi.Output<boolean | undefined>;
    /**
     * The landing page design of the app launcher.
     */
    public readonly landingPageDesign!: pulumi.Output<outputs.AccessApplicationLandingPageDesign | undefined>;
    /**
     * Image URL for the logo shown in the app launcher dashboard.
     */
    public readonly logoUrl!: pulumi.Output<string | undefined>;
    /**
     * Friendly name of the Access Application.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if corsHeaders is set. Defaults to `false`.
     */
    public readonly optionsPreflightBypass!: pulumi.Output<boolean | undefined>;
    /**
     * The policies associated with the application, in ascending order of precedence. Warning: Do not use this field while you still have this application ID referenced as `applicationId` in any `cloudflare.AccessPolicy` resource, as it can result in an inconsistent state.
     */
    public readonly policies!: pulumi.Output<string[] | undefined>;
    /**
     * SaaS configuration for the Access Application.
     */
    public readonly saasApp!: pulumi.Output<outputs.AccessApplicationSaasApp | undefined>;
    /**
     * Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     */
    public readonly sameSiteCookieAttribute!: pulumi.Output<string | undefined>;
    /**
     * Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     */
    public readonly scimConfig!: pulumi.Output<outputs.AccessApplicationScimConfig | undefined>;
    /**
     * List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     */
    public readonly selfHostedDomains!: pulumi.Output<string[] | undefined>;
    /**
     * Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     */
    public readonly serviceAuth401Redirect!: pulumi.Output<boolean | undefined>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     */
    public readonly sessionDuration!: pulumi.Output<string | undefined>;
    /**
     * Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     */
    public readonly skipInterstitial!: pulumi.Output<boolean | undefined>;
    /**
     * The itags associated with the application.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    public readonly zoneId!: pulumi.Output<string>;

    /**
     * Create a AccessApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccessApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessApplicationArgs | AccessApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessApplicationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowAuthenticateViaWarp"] = state ? state.allowAuthenticateViaWarp : undefined;
            resourceInputs["allowedIdps"] = state ? state.allowedIdps : undefined;
            resourceInputs["appLauncherLogoUrl"] = state ? state.appLauncherLogoUrl : undefined;
            resourceInputs["appLauncherVisible"] = state ? state.appLauncherVisible : undefined;
            resourceInputs["aud"] = state ? state.aud : undefined;
            resourceInputs["autoRedirectToIdentity"] = state ? state.autoRedirectToIdentity : undefined;
            resourceInputs["bgColor"] = state ? state.bgColor : undefined;
            resourceInputs["corsHeaders"] = state ? state.corsHeaders : undefined;
            resourceInputs["customDenyMessage"] = state ? state.customDenyMessage : undefined;
            resourceInputs["customDenyUrl"] = state ? state.customDenyUrl : undefined;
            resourceInputs["customNonIdentityDenyUrl"] = state ? state.customNonIdentityDenyUrl : undefined;
            resourceInputs["customPages"] = state ? state.customPages : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["enableBindingCookie"] = state ? state.enableBindingCookie : undefined;
            resourceInputs["footerLinks"] = state ? state.footerLinks : undefined;
            resourceInputs["headerBgColor"] = state ? state.headerBgColor : undefined;
            resourceInputs["httpOnlyCookieAttribute"] = state ? state.httpOnlyCookieAttribute : undefined;
            resourceInputs["landingPageDesign"] = state ? state.landingPageDesign : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["optionsPreflightBypass"] = state ? state.optionsPreflightBypass : undefined;
            resourceInputs["policies"] = state ? state.policies : undefined;
            resourceInputs["saasApp"] = state ? state.saasApp : undefined;
            resourceInputs["sameSiteCookieAttribute"] = state ? state.sameSiteCookieAttribute : undefined;
            resourceInputs["scimConfig"] = state ? state.scimConfig : undefined;
            resourceInputs["selfHostedDomains"] = state ? state.selfHostedDomains : undefined;
            resourceInputs["serviceAuth401Redirect"] = state ? state.serviceAuth401Redirect : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
            resourceInputs["skipInterstitial"] = state ? state.skipInterstitial : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zoneId"] = state ? state.zoneId : undefined;
        } else {
            const args = argsOrState as AccessApplicationArgs | undefined;
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowAuthenticateViaWarp"] = args ? args.allowAuthenticateViaWarp : undefined;
            resourceInputs["allowedIdps"] = args ? args.allowedIdps : undefined;
            resourceInputs["appLauncherLogoUrl"] = args ? args.appLauncherLogoUrl : undefined;
            resourceInputs["appLauncherVisible"] = args ? args.appLauncherVisible : undefined;
            resourceInputs["autoRedirectToIdentity"] = args ? args.autoRedirectToIdentity : undefined;
            resourceInputs["bgColor"] = args ? args.bgColor : undefined;
            resourceInputs["corsHeaders"] = args ? args.corsHeaders : undefined;
            resourceInputs["customDenyMessage"] = args ? args.customDenyMessage : undefined;
            resourceInputs["customDenyUrl"] = args ? args.customDenyUrl : undefined;
            resourceInputs["customNonIdentityDenyUrl"] = args ? args.customNonIdentityDenyUrl : undefined;
            resourceInputs["customPages"] = args ? args.customPages : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["enableBindingCookie"] = args ? args.enableBindingCookie : undefined;
            resourceInputs["footerLinks"] = args ? args.footerLinks : undefined;
            resourceInputs["headerBgColor"] = args ? args.headerBgColor : undefined;
            resourceInputs["httpOnlyCookieAttribute"] = args ? args.httpOnlyCookieAttribute : undefined;
            resourceInputs["landingPageDesign"] = args ? args.landingPageDesign : undefined;
            resourceInputs["logoUrl"] = args ? args.logoUrl : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["optionsPreflightBypass"] = args ? args.optionsPreflightBypass : undefined;
            resourceInputs["policies"] = args ? args.policies : undefined;
            resourceInputs["saasApp"] = args ? args.saasApp : undefined;
            resourceInputs["sameSiteCookieAttribute"] = args ? args.sameSiteCookieAttribute : undefined;
            resourceInputs["scimConfig"] = args ? args.scimConfig : undefined;
            resourceInputs["selfHostedDomains"] = args ? args.selfHostedDomains : undefined;
            resourceInputs["serviceAuth401Redirect"] = args ? args.serviceAuth401Redirect : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["skipInterstitial"] = args ? args.skipInterstitial : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zoneId"] = args ? args.zoneId : undefined;
            resourceInputs["aud"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessApplication resources.
 */
export interface AccessApplicationState {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
     */
    allowAuthenticateViaWarp?: pulumi.Input<boolean>;
    /**
     * The identity providers selected for the application.
     */
    allowedIdps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The logo URL of the app launcher.
     */
    appLauncherLogoUrl?: pulumi.Input<string>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * Application Audience (AUD) Tag of the application.
     */
    aud?: pulumi.Input<string>;
    /**
     * Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
     */
    autoRedirectToIdentity?: pulumi.Input<boolean>;
    /**
     * The background color of the app launcher.
     */
    bgColor?: pulumi.Input<string>;
    /**
     * CORS configuration for the Access Application. See below for reference structure.
     */
    corsHeaders?: pulumi.Input<pulumi.Input<inputs.AccessApplicationCorsHeader>[]>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    customDenyMessage?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     */
    customDenyUrl?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     */
    customNonIdentityDenyUrl?: pulumi.Input<string>;
    /**
     * The custom pages selected for the application.
     */
    customPages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     */
    domain?: pulumi.Input<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    enableBindingCookie?: pulumi.Input<boolean>;
    /**
     * The footer links of the app launcher.
     */
    footerLinks?: pulumi.Input<pulumi.Input<inputs.AccessApplicationFooterLink>[]>;
    /**
     * The background color of the header bar in the app launcher.
     */
    headerBgColor?: pulumi.Input<string>;
    /**
     * Option to add the `HttpOnly` cookie flag to access tokens.
     */
    httpOnlyCookieAttribute?: pulumi.Input<boolean>;
    /**
     * The landing page design of the app launcher.
     */
    landingPageDesign?: pulumi.Input<inputs.AccessApplicationLandingPageDesign>;
    /**
     * Image URL for the logo shown in the app launcher dashboard.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    name?: pulumi.Input<string>;
    /**
     * Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if corsHeaders is set. Defaults to `false`.
     */
    optionsPreflightBypass?: pulumi.Input<boolean>;
    /**
     * The policies associated with the application, in ascending order of precedence. Warning: Do not use this field while you still have this application ID referenced as `applicationId` in any `cloudflare.AccessPolicy` resource, as it can result in an inconsistent state.
     */
    policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * SaaS configuration for the Access Application.
     */
    saasApp?: pulumi.Input<inputs.AccessApplicationSaasApp>;
    /**
     * Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     */
    sameSiteCookieAttribute?: pulumi.Input<string>;
    /**
     * Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     */
    scimConfig?: pulumi.Input<inputs.AccessApplicationScimConfig>;
    /**
     * List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     */
    selfHostedDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     */
    serviceAuth401Redirect?: pulumi.Input<boolean>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     */
    skipInterstitial?: pulumi.Input<boolean>;
    /**
     * The itags associated with the application.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessApplication resource.
 */
export interface AccessApplicationArgs {
    /**
     * The account identifier to target for the resource. Conflicts with `zoneId`.
     */
    accountId?: pulumi.Input<string>;
    /**
     * When set to true, users can authenticate to this application using their WARP session. When set to false this application will always require direct IdP authentication. This setting always overrides the organization setting for WARP authentication.
     */
    allowAuthenticateViaWarp?: pulumi.Input<boolean>;
    /**
     * The identity providers selected for the application.
     */
    allowedIdps?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The logo URL of the app launcher.
     */
    appLauncherLogoUrl?: pulumi.Input<string>;
    /**
     * Option to show/hide applications in App Launcher. Defaults to `true`.
     */
    appLauncherVisible?: pulumi.Input<boolean>;
    /**
     * Option to skip identity provider selection if only one is configured in `allowedIdps`. Defaults to `false`.
     */
    autoRedirectToIdentity?: pulumi.Input<boolean>;
    /**
     * The background color of the app launcher.
     */
    bgColor?: pulumi.Input<string>;
    /**
     * CORS configuration for the Access Application. See below for reference structure.
     */
    corsHeaders?: pulumi.Input<pulumi.Input<inputs.AccessApplicationCorsHeader>[]>;
    /**
     * Option that returns a custom error message when a user is denied access to the application.
     */
    customDenyMessage?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via identity based rules.
     */
    customDenyUrl?: pulumi.Input<string>;
    /**
     * Option that redirects to a custom URL when a user is denied access to the application via non identity rules.
     */
    customNonIdentityDenyUrl?: pulumi.Input<string>;
    /**
     * The custom pages selected for the application.
     */
    customPages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The primary hostname and path that Access will secure. If the app is visible in the App Launcher dashboard, this is the domain that will be displayed.
     */
    domain?: pulumi.Input<string>;
    /**
     * Option to provide increased security against compromised authorization tokens and CSRF attacks by requiring an additional "binding" cookie on requests. Defaults to `false`.
     */
    enableBindingCookie?: pulumi.Input<boolean>;
    /**
     * The footer links of the app launcher.
     */
    footerLinks?: pulumi.Input<pulumi.Input<inputs.AccessApplicationFooterLink>[]>;
    /**
     * The background color of the header bar in the app launcher.
     */
    headerBgColor?: pulumi.Input<string>;
    /**
     * Option to add the `HttpOnly` cookie flag to access tokens.
     */
    httpOnlyCookieAttribute?: pulumi.Input<boolean>;
    /**
     * The landing page design of the app launcher.
     */
    landingPageDesign?: pulumi.Input<inputs.AccessApplicationLandingPageDesign>;
    /**
     * Image URL for the logo shown in the app launcher dashboard.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Friendly name of the Access Application.
     */
    name?: pulumi.Input<string>;
    /**
     * Allows options preflight requests to bypass Access authentication and go directly to the origin. Cannot turn on if corsHeaders is set. Defaults to `false`.
     */
    optionsPreflightBypass?: pulumi.Input<boolean>;
    /**
     * The policies associated with the application, in ascending order of precedence. Warning: Do not use this field while you still have this application ID referenced as `applicationId` in any `cloudflare.AccessPolicy` resource, as it can result in an inconsistent state.
     */
    policies?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * SaaS configuration for the Access Application.
     */
    saasApp?: pulumi.Input<inputs.AccessApplicationSaasApp>;
    /**
     * Defines the same-site cookie setting for access tokens. Available values: `none`, `lax`, `strict`.
     */
    sameSiteCookieAttribute?: pulumi.Input<string>;
    /**
     * Configuration for provisioning to this application via SCIM. This is currently in closed beta.
     */
    scimConfig?: pulumi.Input<inputs.AccessApplicationScimConfig>;
    /**
     * List of domains that access will secure. Only present for self_hosted, vnc, and ssh applications. Always includes the value set as `domain`.
     */
    selfHostedDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Option to return a 401 status code in service authentication rules on failed requests. Defaults to `false`.
     */
    serviceAuth401Redirect?: pulumi.Input<boolean>;
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`. Defaults to `24h`.
     */
    sessionDuration?: pulumi.Input<string>;
    /**
     * Option to skip the authorization interstitial when using the CLI. Defaults to `false`.
     */
    skipInterstitial?: pulumi.Input<boolean>;
    /**
     * The itags associated with the application.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The application type. Available values: `appLauncher`, `bookmark`, `biso`, `dashSso`, `saas`, `selfHosted`, `ssh`, `vnc`, `warp`. Defaults to `selfHosted`.
     */
    type?: pulumi.Input<string>;
    /**
     * The zone identifier to target for the resource. Conflicts with `accountId`.
     */
    zoneId?: pulumi.Input<string>;
}
