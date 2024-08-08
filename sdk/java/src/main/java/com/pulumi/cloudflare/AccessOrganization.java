// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.AccessOrganizationArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.AccessOrganizationState;
import com.pulumi.cloudflare.outputs.AccessOrganizationCustomPage;
import com.pulumi.cloudflare.outputs.AccessOrganizationLoginDesign;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Zero Trust organization defines the user login experience.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.AccessOrganization;
 * import com.pulumi.cloudflare.AccessOrganizationArgs;
 * import com.pulumi.cloudflare.inputs.AccessOrganizationLoginDesignArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new AccessOrganization("example", AccessOrganizationArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example.cloudflareaccess.com")
 *             .authDomain("example.cloudflareaccess.com")
 *             .isUiReadOnly(false)
 *             .userSeatExpirationInactiveTime("720h")
 *             .autoRedirectToIdentity(false)
 *             .loginDesigns(AccessOrganizationLoginDesignArgs.builder()
 *                 .backgroundColor("#ffffff")
 *                 .textColor("#000000")
 *                 .logoPath("https://example.com/logo.png")
 *                 .headerText("My header text")
 *                 .footerText("My footer text")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/accessOrganization:AccessOrganization example &lt;account_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/accessOrganization:AccessOrganization")
public class AccessOrganization extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    @Export(name="allowAuthenticateViaWarp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowAuthenticateViaWarp;

    /**
     * @return When set to true, users can authenticate via WARP for any application in your organization. Application settings will take precedence over this value.
     * 
     */
    public Output<Optional<Boolean>> allowAuthenticateViaWarp() {
        return Codegen.optional(this.allowAuthenticateViaWarp);
    }
    /**
     * The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    @Export(name="authDomain", refs={String.class}, tree="[0]")
    private Output<String> authDomain;

    /**
     * @return The unique subdomain assigned to your Zero Trust organization.
     * 
     */
    public Output<String> authDomain() {
        return this.authDomain;
    }
    /**
     * When set to true, users skip the identity provider selection step during login.
     * 
     */
    @Export(name="autoRedirectToIdentity", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRedirectToIdentity;

    /**
     * @return When set to true, users skip the identity provider selection step during login.
     * 
     */
    public Output<Optional<Boolean>> autoRedirectToIdentity() {
        return Codegen.optional(this.autoRedirectToIdentity);
    }
    /**
     * Custom pages for your Zero Trust organization.
     * 
     */
    @Export(name="customPages", refs={List.class,AccessOrganizationCustomPage.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessOrganizationCustomPage>> customPages;

    /**
     * @return Custom pages for your Zero Trust organization.
     * 
     */
    public Output<Optional<List<AccessOrganizationCustomPage>>> customPages() {
        return Codegen.optional(this.customPages);
    }
    /**
     * When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    @Export(name="isUiReadOnly", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isUiReadOnly;

    /**
     * @return When set to true, this will disable all editing of Access resources via the Zero Trust Dashboard.
     * 
     */
    public Output<Optional<Boolean>> isUiReadOnly() {
        return Codegen.optional(this.isUiReadOnly);
    }
    @Export(name="loginDesigns", refs={List.class,AccessOrganizationLoginDesign.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessOrganizationLoginDesign>> loginDesigns;

    public Output<Optional<List<AccessOrganizationLoginDesign>>> loginDesigns() {
        return Codegen.optional(this.loginDesigns);
    }
    /**
     * The name of your Zero Trust organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of your Zero Trust organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     * 
     */
    @Export(name="sessionDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sessionDuration;

    /**
     * @return How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
     * 
     */
    public Output<Optional<String>> sessionDuration() {
        return Codegen.optional(this.sessionDuration);
    }
    /**
     * A description of the reason why the UI read only field is being toggled.
     * 
     */
    @Export(name="uiReadOnlyToggleReason", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> uiReadOnlyToggleReason;

    /**
     * @return A description of the reason why the UI read only field is being toggled.
     * 
     */
    public Output<Optional<String>> uiReadOnlyToggleReason() {
        return Codegen.optional(this.uiReadOnlyToggleReason);
    }
    /**
     * The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    @Export(name="userSeatExpirationInactiveTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userSeatExpirationInactiveTime;

    /**
     * @return The amount of time a user seat is inactive before it expires. When the user seat exceeds the set time of inactivity, the user is removed as an active seat and no longer counts against your Teams seat count. Must be in the format `300ms` or `2h45m`.
     * 
     */
    public Output<Optional<String>> userSeatExpirationInactiveTime() {
        return Codegen.optional(this.userSeatExpirationInactiveTime);
    }
    /**
     * The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
     * 
     */
    @Export(name="warpAuthSessionDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warpAuthSessionDuration;

    /**
     * @return The amount of time that tokens issued for applications will be valid. Must be in the format 30m or 2h45m. Valid time units are: m, h.
     * 
     */
    public Output<Optional<String>> warpAuthSessionDuration() {
        return Codegen.optional(this.warpAuthSessionDuration);
    }
    /**
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessOrganization(java.lang.String name) {
        this(name, AccessOrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessOrganization(java.lang.String name, AccessOrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessOrganization(java.lang.String name, AccessOrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessOrganization:AccessOrganization", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccessOrganization(java.lang.String name, Output<java.lang.String> id, @Nullable AccessOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/accessOrganization:AccessOrganization", name, state, makeResourceOptions(options, id), false);
    }

    private static AccessOrganizationArgs makeArgs(AccessOrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccessOrganizationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessOrganization get(java.lang.String name, Output<java.lang.String> id, @Nullable AccessOrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessOrganization(name, id, state, options);
    }
}
