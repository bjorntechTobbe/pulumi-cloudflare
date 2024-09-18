// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustAccessPolicyArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustAccessPolicyState;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyApprovalGroup;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyExclude;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyInclude;
import com.pulumi.cloudflare.outputs.ZeroTrustAccessPolicyRequire;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloudflare Access Policy resource. Access Policies are
 * used in conjunction with Access Applications to restrict access to
 * a particular resource.
 * 
 * &gt; It&#39;s required that an `account_id` or `zone_id` is provided and in most cases using either is fine.
 *    However, if you&#39;re using a scoped access token, you must provide the argument that matches the token&#39;s
 *    scope. For example, an access token that is scoped to the &#34;example.com&#34; zone needs to use the `zone_id` argument.
 *    If &#39;application_id&#39; is omitted, the policy created can be reused by multiple access applications.
 *    Any cloudflare.AccessApplication resource can reference reusable policies through its `policies` argument.
 *    To destroy a reusable policy and remove it from all applications&#39; policies lists on the same apply, preemptively set the
 *    lifecycle option `create_before_destroy` to true on the &#39;cloudflare_access_policy&#39; resource.
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy example account/&lt;account_id&gt;/&lt;application_id&gt;/&lt;policy_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy")
public class ZeroTrustAccessPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accountId;

    /**
     * @return The account identifier to target for the resource. Conflicts with `zone_id`.
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applicationId;

    /**
     * @return The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<String>> applicationId() {
        return Codegen.optional(this.applicationId);
    }
    @Export(name="approvalGroups", refs={List.class,ZeroTrustAccessPolicyApprovalGroup.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustAccessPolicyApprovalGroup>> approvalGroups;

    public Output<Optional<List<ZeroTrustAccessPolicyApprovalGroup>>> approvalGroups() {
        return Codegen.optional(this.approvalGroups);
    }
    @Export(name="approvalRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> approvalRequired;

    public Output<Optional<Boolean>> approvalRequired() {
        return Codegen.optional(this.approvalRequired);
    }
    /**
     * Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    @Export(name="decision", refs={String.class}, tree="[0]")
    private Output<String> decision;

    /**
     * @return Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
     * 
     */
    public Output<String> decision() {
        return this.decision;
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="excludes", refs={List.class,ZeroTrustAccessPolicyExclude.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustAccessPolicyExclude>> excludes;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<Optional<List<ZeroTrustAccessPolicyExclude>>> excludes() {
        return Codegen.optional(this.excludes);
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="includes", refs={List.class,ZeroTrustAccessPolicyInclude.class}, tree="[0,1]")
    private Output<List<ZeroTrustAccessPolicyInclude>> includes;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<List<ZeroTrustAccessPolicyInclude>> includes() {
        return this.includes;
    }
    /**
     * Require this application to be served in an isolated browser for users matching this policy.
     * 
     */
    @Export(name="isolationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isolationRequired;

    /**
     * @return Require this application to be served in an isolated browser for users matching this policy.
     * 
     */
    public Output<Optional<Boolean>> isolationRequired() {
        return Codegen.optional(this.isolationRequired);
    }
    /**
     * Friendly name of the Access Policy.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Friendly name of the Access Policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique precedence for policies on a single application. Required when using `application_id`.
     * 
     */
    @Export(name="precedence", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> precedence;

    /**
     * @return The unique precedence for policies on a single application. Required when using `application_id`.
     * 
     */
    public Output<Optional<Integer>> precedence() {
        return Codegen.optional(this.precedence);
    }
    /**
     * The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
     * 
     */
    @Export(name="purposeJustificationPrompt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> purposeJustificationPrompt;

    /**
     * @return The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
     * 
     */
    public Output<Optional<String>> purposeJustificationPrompt() {
        return Codegen.optional(this.purposeJustificationPrompt);
    }
    /**
     * Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    @Export(name="purposeJustificationRequired", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> purposeJustificationRequired;

    /**
     * @return Whether to prompt the user for a justification for accessing the resource.
     * 
     */
    public Output<Optional<Boolean>> purposeJustificationRequired() {
        return Codegen.optional(this.purposeJustificationRequired);
    }
    /**
     * A series of access conditions, see Access Groups.
     * 
     */
    @Export(name="requires", refs={List.class,ZeroTrustAccessPolicyRequire.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZeroTrustAccessPolicyRequire>> requires;

    /**
     * @return A series of access conditions, see Access Groups.
     * 
     */
    public Output<Optional<List<ZeroTrustAccessPolicyRequire>>> requires() {
        return Codegen.optional(this.requires);
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
     * The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone identifier to target for the resource. Conflicts with `account_id`.
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustAccessPolicy(java.lang.String name) {
        this(name, ZeroTrustAccessPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustAccessPolicy(java.lang.String name, ZeroTrustAccessPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustAccessPolicy(java.lang.String name, ZeroTrustAccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustAccessPolicy(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustAccessPolicy:ZeroTrustAccessPolicy", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustAccessPolicyArgs makeArgs(ZeroTrustAccessPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustAccessPolicyArgs.Empty : args;
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
    public static ZeroTrustAccessPolicy get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustAccessPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustAccessPolicy(name, id, state, options);
    }
}
