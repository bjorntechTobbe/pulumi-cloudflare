// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a resource to manage a schema in API Shield Schema Validation 2.0.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var petstoreSchema = new Cloudflare.ApiShieldSchema("petstore_schema", new()
    ///     {
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///         Name = "myschema",
    ///         Kind = "openapi_v3",
    ///         ValidationEnabled = true,
    ///         Source = Std.File.Invoke(new()
    ///         {
    ///             Input = "./schemas/petstore.json",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/apiShieldSchema:ApiShieldSchema")]
    public partial class ApiShieldSchema : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("kind")]
        public Output<string?> Kind { get; private set; } = null!;

        /// <summary>
        /// Name of the schema. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("source")]
        public Output<string> Source { get; private set; } = null!;

        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        [Output("validationEnabled")]
        public Output<bool?> ValidationEnabled { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a ApiShieldSchema resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiShieldSchema(string name, ApiShieldSchemaArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShieldSchema:ApiShieldSchema", name, args ?? new ApiShieldSchemaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiShieldSchema(string name, Input<string> id, ApiShieldSchemaState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/apiShieldSchema:ApiShieldSchema", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApiShieldSchema resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiShieldSchema Get(string name, Input<string> id, ApiShieldSchemaState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiShieldSchema(name, id, state, options);
        }
    }

    public sealed class ApiShieldSchemaArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Name of the schema. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("source", required: true)]
        public Input<string> Source { get; set; } = null!;

        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        [Input("validationEnabled")]
        public Input<bool>? ValidationEnabled { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public ApiShieldSchemaArgs()
        {
        }
        public static new ApiShieldSchemaArgs Empty => new ApiShieldSchemaArgs();
    }

    public sealed class ApiShieldSchemaState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Kind of schema. Defaults to `openapi_v3`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Name of the schema. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Schema file bytes. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        /// <summary>
        /// Flag whether schema is enabled for validation.
        /// </summary>
        [Input("validationEnabled")]
        public Input<bool>? ValidationEnabled { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public ApiShieldSchemaState()
        {
        }
        public static new ApiShieldSchemaState Empty => new ApiShieldSchemaState();
    }
}
