// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare;

import com.pulumi.cloudflare.ListArgs;
import com.pulumi.cloudflare.Utilities;
import com.pulumi.cloudflare.inputs.ListState;
import com.pulumi.cloudflare.outputs.ListItem;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.cloudflare.List;
 * import com.pulumi.cloudflare.ListArgs;
 * import com.pulumi.cloudflare.inputs.ListItemArgs;
 * import com.pulumi.cloudflare.inputs.ListItemValueArgs;
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
 *         // Hostname list
 *         var example = new List(&#34;example&#34;, ListArgs.builder()        
 *             .accountId(&#34;f037e56e89293a057740de681ac9abbe&#34;)
 *             .description(&#34;example hostnames for a list&#34;)
 *             .items(            
 *                 ListItemArgs.builder()
 *                     .comment(&#34;one&#34;)
 *                     .value(ListItemValueArgs.builder()
 *                         .hostname(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .build())
 *                     .build(),
 *                 ListItemArgs.builder()
 *                     .comment(&#34;two&#34;)
 *                     .value(ListItemValueArgs.builder()
 *                         .hostname(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .build())
 *                     .build())
 *             .kind(&#34;hostname&#34;)
 *             .name(&#34;example_list&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * ```sh
 * $ pulumi import cloudflare:index/list:List example &lt;account_id&gt;/&lt;list_id&gt;
 * ```
 * 
 */
@ResourceType(type="cloudflare:index/list:List")
public class List extends com.pulumi.resources.CustomResource {
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
     * An optional description of the list.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the list.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="items", refs={java.util.List.class,ListItem.class}, tree="[0,1]")
    private Output</* @Nullable */ java.util.List<ListItem>> items;

    public Output<Optional<java.util.List<ListItem>>> items() {
        return Codegen.optional(this.items);
    }
    /**
     * The type of items the list will contain. Available values: `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return The type of items the list will contain. Available values: `ip`, `redirect`, `hostname`, `asn`. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the list. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the list. **Modifying this attribute will force creation of a new resource.**
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public List(String name) {
        this(name, ListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public List(String name, ListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public List(String name, ListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/list:List", name, args == null ? ListArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private List(String name, Output<String> id, @Nullable ListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("cloudflare:index/list:List", name, state, makeResourceOptions(options, id));
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
    public static List get(String name, Output<String> id, @Nullable ListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new List(name, id, state, options);
    }
}
