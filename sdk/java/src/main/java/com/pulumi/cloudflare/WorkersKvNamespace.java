// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersKvNamespaceArgs;
import com.pulumi.cloudflare.inputs.WorkersKvNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides the ability to manage Cloudflare Workers KV Namespace features.
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
 * import com.pulumi.cloudflare.WorkersKvNamespace;
 * import com.pulumi.cloudflare.WorkersKvNamespaceArgs;
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
 *         var example = new WorkersKvNamespace("example", WorkersKvNamespaceArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .title("test-namespace")
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
 * $ pulumi import cloudflare:index/workersKvNamespace:WorkersKvNamespace example &lt;account_id&gt;/&lt;namespace_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersKvNamespace:WorkersKvNamespace")
public class WorkersKvNamespace extends com.pulumi.resources.CustomResource {
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
     * Title value of the Worker KV Namespace.
     * 
     */
    @Export(name="title", refs={String.class}, tree="[0]")
    private Output<String> title;

    /**
     * @return Title value of the Worker KV Namespace.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersKvNamespace(java.lang.String name) {
        this(name, WorkersKvNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersKvNamespace(java.lang.String name, WorkersKvNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersKvNamespace(java.lang.String name, WorkersKvNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersKvNamespace:WorkersKvNamespace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkersKvNamespace(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersKvNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersKvNamespace:WorkersKvNamespace", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkersKvNamespaceArgs makeArgs(WorkersKvNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersKvNamespaceArgs.Empty : args;
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
    public static WorkersKvNamespace get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersKvNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersKvNamespace(name, id, state, options);
    }
}
