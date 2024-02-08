// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.CertificatePackArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.CertificatePackState;
import com.pulumi.cloudflare.outputs.CertificatePackValidationError;
import com.pulumi.cloudflare.outputs.CertificatePackValidationRecord;
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
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.CertificatePack;
 * import com.pulumi.cloudflare.CertificatePackArgs;
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
 *         var example = new CertificatePack(&#34;example&#34;, CertificatePackArgs.builder()        
 *             .certificateAuthority(&#34;lets_encrypt&#34;)
 *             .cloudflareBranding(false)
 *             .hosts(            
 *                 &#34;example.com&#34;,
 *                 &#34;*.example.com&#34;)
 *             .type(&#34;advanced&#34;)
 *             .validationMethod(&#34;http&#34;)
 *             .validityDays(90)
 *             .waitForActiveStatus(true)
 *             .zoneId(&#34;0da42c8d2132a9ddaf714f9e7c920711&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ```sh
 *  $ pulumi import cloudflare:index/certificatePack:CertificatePack example &lt;zone_id&gt;/&lt;certificate_pack_id&gt;
 * ```
 * 
 *  While supported, importing isn&#39;t recommended and it is advised to replace the
 * 
 *  certificate entirely instead.
 * 
 */
@ResourceType(type="cloudflare:index/certificatePack:CertificatePack")
public class CertificatePack extends com.pulumi.resources.CustomResource {
    /**
     * Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="certificateAuthority", refs={String.class}, tree="[0]")
    private Output<String> certificateAuthority;

    /**
     * @return Which certificate authority to issue the certificate pack. Available values: `digicert`, `lets_encrypt`, `google`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> certificateAuthority() {
        return this.certificateAuthority;
    }
    /**
     * Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="cloudflareBranding", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> cloudflareBranding;

    /**
     * @return Whether or not to include Cloudflare branding. This will add `sni.cloudflaressl.com` as the Common Name if set to `true`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<Boolean>> cloudflareBranding() {
        return Codegen.optional(this.cloudflareBranding);
    }
    /**
     * List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let&#39;s Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="hosts", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hosts;

    /**
     * @return List of hostnames to provision the certificate pack for. The zone name must be included as a host. Note: If using Let&#39;s Encrypt, you cannot use individual subdomains and only a wildcard for subdomain is available. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<List<String>> hosts() {
        return this.hosts;
    }
    /**
     * Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Certificate pack configuration type. Available values: `advanced`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    @Export(name="validationErrors", refs={List.class,CertificatePackValidationError.class}, tree="[0,1]")
    private Output<List<CertificatePackValidationError>> validationErrors;

    public Output<List<CertificatePackValidationError>> validationErrors() {
        return this.validationErrors;
    }
    /**
     * Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="validationMethod", refs={String.class}, tree="[0]")
    private Output<String> validationMethod;

    /**
     * @return Which validation method to use in order to prove domain ownership. Available values: `txt`, `http`, `email`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> validationMethod() {
        return this.validationMethod;
    }
    @Export(name="validationRecords", refs={List.class,CertificatePackValidationRecord.class}, tree="[0,1]")
    private Output<List<CertificatePackValidationRecord>> validationRecords;

    public Output<List<CertificatePackValidationRecord>> validationRecords() {
        return this.validationRecords;
    }
    /**
     * How long the certificate is valid for. Note: If using Let&#39;s Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="validityDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> validityDays;

    /**
     * @return How long the certificate is valid for. Note: If using Let&#39;s Encrypt, this value can only be 90 days. Available values: `14`, `30`, `90`, `365`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Integer> validityDays() {
        return this.validityDays;
    }
    /**
     * Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="waitForActiveStatus", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> waitForActiveStatus;

    /**
     * @return Whether or not to wait for a certificate pack to reach status `active` during creation. Defaults to `false`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<Optional<Boolean>> waitForActiveStatus() {
        return Codegen.optional(this.waitForActiveStatus);
    }
    /**
     * The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificatePack(String name) {
        this(name, CertificatePackArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificatePack(String name, CertificatePackArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificatePack(String name, CertificatePackArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/certificatePack:CertificatePack", name, args == null ? CertificatePackArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificatePack(String name, Output<String> id, @Nullable CertificatePackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/certificatePack:CertificatePack", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static CertificatePack get(String name, Output<String> id, @Nullable CertificatePackState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificatePack(name, id, state, options);
    }
}
