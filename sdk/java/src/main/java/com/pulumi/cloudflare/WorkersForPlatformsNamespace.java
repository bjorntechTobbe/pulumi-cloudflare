// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs;
import com.pulumi.cloudflare.inputs.WorkersForPlatformsNamespaceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The [Workers for Platforms](https://developers.cloudflare.com/cloudflare-for-platforms/workers-for-platforms/) resource allows you
 * to manage Cloudflare Workers for Platforms namespaces.
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
 * import com.pulumi.cloudflare.WorkersForPlatformsNamespace;
 * import com.pulumi.cloudflare.WorkersForPlatformsNamespaceArgs;
 * import com.pulumi.cloudflare.WorkerScript;
 * import com.pulumi.cloudflare.WorkerScriptArgs;
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
 *         var example = new WorkersForPlatformsNamespace("example", WorkersForPlatformsNamespaceArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("example-namespace")
 *             .build());
 * 
 *         var customerWorker1 = new WorkerScript("customerWorker1", WorkerScriptArgs.builder()
 *             .accountId("f037e56e89293a057740de681ac9abbe")
 *             .name("customer-worker-1")
 *             .content(StdFunctions.file(FileArgs.builder()
 *                 .input("script.js")
 *                 .build()).result())
 *             .dispatchNamespace(example.name())
 *             .tags("free")
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
 * $ pulumi import cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace example &lt;account_id&gt;/&lt;namespace_name&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace")
public class WorkersForPlatformsNamespace extends com.pulumi.resources.CustomResource {
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
     * The name of the Workers for Platforms namespace.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Workers for Platforms namespace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkersForPlatformsNamespace(java.lang.String name) {
        this(name, WorkersForPlatformsNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkersForPlatformsNamespace(java.lang.String name, WorkersForPlatformsNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkersForPlatformsNamespace(java.lang.String name, WorkersForPlatformsNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkersForPlatformsNamespace(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersForPlatformsNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/workersForPlatformsNamespace:WorkersForPlatformsNamespace", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkersForPlatformsNamespaceArgs makeArgs(WorkersForPlatformsNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkersForPlatformsNamespaceArgs.Empty : args;
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
    public static WorkersForPlatformsNamespace get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkersForPlatformsNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkersForPlatformsNamespace(name, id, state, options);
    }
}
