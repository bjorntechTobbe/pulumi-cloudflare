// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.ZeroTrustRiskScoreIntegrationArgs;
import com.pulumi.cloudflare.inputs.ZeroTrustRiskScoreIntegrationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The [Risk Score Integration](https://developers.cloudflare.com/cloudflare-one/insights/risk-score/#send-risk-score-to-okta) resource allows you to transmit changes in User Risk Score to a specified vendor such as Okta.
 * 
 */
@ResourceType(type="cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration")
public class ZeroTrustRiskScoreIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The account identifier to target for the resource.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The account identifier to target for the resource.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return Whether this integration is enabled. If disabled, no risk changes will be exported to the third-party.
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
     * 
     */
    @Export(name="integrationType", refs={String.class}, tree="[0]")
    private Output<String> integrationType;

    /**
     * @return The type of integration, e.g. &#39;Okta&#39;. Full list of allowed values can be found here: https://developers.cloudflare.com/api/operations/dlp-zt-risk-score-integration-create#request-body
     * 
     */
    public Output<String> integrationType() {
        return this.integrationType;
    }
    /**
     * A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    @Export(name="referenceId", refs={String.class}, tree="[0]")
    private Output<String> referenceId;

    /**
     * @return A reference id that can be supplied by the client. Currently this should be set to the Access-Okta IDP ID (a UUIDv4). If omitted, a random UUIDv4 is used. https://developers.cloudflare.com/api/operations/access-identity-providers-get-an-access-identity-provider
     * 
     */
    public Output<String> referenceId() {
        return this.referenceId;
    }
    /**
     * The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
     * 
     */
    @Export(name="tenantUrl", refs={String.class}, tree="[0]")
    private Output<String> tenantUrl;

    /**
     * @return The base url of the tenant, e.g. &#39;https://tenant.okta.com&#39;. Must be your Okta Tenant URL and not your custom domain.
     * 
     */
    public Output<String> tenantUrl() {
        return this.tenantUrl;
    }
    /**
     * The URL for the Shared Signals Framework configuration, e.g. &#39;/.well-known/sse-configuration/{integration*uuid}/&#39;. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
     * 
     */
    @Export(name="wellKnownUrl", refs={String.class}, tree="[0]")
    private Output<String> wellKnownUrl;

    /**
     * @return The URL for the Shared Signals Framework configuration, e.g. &#39;/.well-known/sse-configuration/{integration*uuid}/&#39;. https://openid.net/specs/openid-sse-framework-1*0.html#rfc.section.6.2.1
     * 
     */
    public Output<String> wellKnownUrl() {
        return this.wellKnownUrl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ZeroTrustRiskScoreIntegration(java.lang.String name) {
        this(name, ZeroTrustRiskScoreIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ZeroTrustRiskScoreIntegration(java.lang.String name, ZeroTrustRiskScoreIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ZeroTrustRiskScoreIntegration(java.lang.String name, ZeroTrustRiskScoreIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ZeroTrustRiskScoreIntegration(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustRiskScoreIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/zeroTrustRiskScoreIntegration:ZeroTrustRiskScoreIntegration", name, state, makeResourceOptions(options, id), false);
    }

    private static ZeroTrustRiskScoreIntegrationArgs makeArgs(ZeroTrustRiskScoreIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ZeroTrustRiskScoreIntegrationArgs.Empty : args;
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
    public static ZeroTrustRiskScoreIntegration get(java.lang.String name, Output<java.lang.String> id, @Nullable ZeroTrustRiskScoreIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ZeroTrustRiskScoreIntegration(name, id, state, options);
    }
}
