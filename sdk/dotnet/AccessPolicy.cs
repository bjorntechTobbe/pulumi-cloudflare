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
    /// Provides a Cloudflare Access Policy resource. Access Policies are
    /// used in conjunction with Access Applications to restrict access to
    /// a particular resource.
    /// 
    /// &gt; It's required that an `account_id` or `zone_id` is provided and in most cases using either is fine.
    ///    However, if you're using a scoped access token, you must provide the argument that matches the token's
    ///    scope. For example, an access token that is scoped to the "example.com" zone needs to use the `zone_id` argument.
    ///    If 'application_id' is omitted, the policy created can be reused by multiple access applications.
    ///    Any cloudflare.AccessApplication resource can reference reusable policies through its `policies` argument.
    ///    To destroy a reusable policy and remove it from all applications' policies lists on the same apply, preemptively set the
    ///    lifecycle option `create_before_destroy` to true on the 'cloudflare_access_policy' resource.
    /// 
    /// ## Import
    /// 
    /// ```sh
    /// $ pulumi import cloudflare:index/accessPolicy:AccessPolicy example account/&lt;account_id&gt;/&lt;application_id&gt;/&lt;policy_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/accessPolicy:AccessPolicy")]
    public partial class AccessPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("applicationId")]
        public Output<string?> ApplicationId { get; private set; } = null!;

        [Output("approvalGroups")]
        public Output<ImmutableArray<Outputs.AccessPolicyApprovalGroup>> ApprovalGroups { get; private set; } = null!;

        [Output("approvalRequired")]
        public Output<bool?> ApprovalRequired { get; private set; } = null!;

        /// <summary>
        /// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
        /// </summary>
        [Output("decision")]
        public Output<string> Decision { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        [Output("excludes")]
        public Output<ImmutableArray<Outputs.AccessPolicyExclude>> Excludes { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        [Output("includes")]
        public Output<ImmutableArray<Outputs.AccessPolicyInclude>> Includes { get; private set; } = null!;

        /// <summary>
        /// Require this application to be served in an isolated browser for users matching this policy.
        /// </summary>
        [Output("isolationRequired")]
        public Output<bool?> IsolationRequired { get; private set; } = null!;

        /// <summary>
        /// Friendly name of the Access Policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The unique precedence for policies on a single application. Required when using `application_id`.
        /// </summary>
        [Output("precedence")]
        public Output<int?> Precedence { get; private set; } = null!;

        /// <summary>
        /// The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
        /// </summary>
        [Output("purposeJustificationPrompt")]
        public Output<string?> PurposeJustificationPrompt { get; private set; } = null!;

        /// <summary>
        /// Whether to prompt the user for a justification for accessing the resource.
        /// </summary>
        [Output("purposeJustificationRequired")]
        public Output<bool?> PurposeJustificationRequired { get; private set; } = null!;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        [Output("requires")]
        public Output<ImmutableArray<Outputs.AccessPolicyRequire>> Requires { get; private set; } = null!;

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        /// </summary>
        [Output("sessionDuration")]
        public Output<string?> SessionDuration { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Output("zoneId")]
        public Output<string?> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a AccessPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AccessPolicy(string name, AccessPolicyArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessPolicy:AccessPolicy", name, args ?? new AccessPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AccessPolicy(string name, Input<string> id, AccessPolicyState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/accessPolicy:AccessPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AccessPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AccessPolicy Get(string name, Input<string> id, AccessPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AccessPolicy(name, id, state, options);
        }
    }

    public sealed class AccessPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        [Input("approvalGroups")]
        private InputList<Inputs.AccessPolicyApprovalGroupArgs>? _approvalGroups;
        public InputList<Inputs.AccessPolicyApprovalGroupArgs> ApprovalGroups
        {
            get => _approvalGroups ?? (_approvalGroups = new InputList<Inputs.AccessPolicyApprovalGroupArgs>());
            set => _approvalGroups = value;
        }

        [Input("approvalRequired")]
        public Input<bool>? ApprovalRequired { get; set; }

        /// <summary>
        /// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
        /// </summary>
        [Input("decision", required: true)]
        public Input<string> Decision { get; set; } = null!;

        [Input("excludes")]
        private InputList<Inputs.AccessPolicyExcludeArgs>? _excludes;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessPolicyExcludeArgs>());
            set => _excludes = value;
        }

        [Input("includes", required: true)]
        private InputList<Inputs.AccessPolicyIncludeArgs>? _includes;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyIncludeArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessPolicyIncludeArgs>());
            set => _includes = value;
        }

        /// <summary>
        /// Require this application to be served in an isolated browser for users matching this policy.
        /// </summary>
        [Input("isolationRequired")]
        public Input<bool>? IsolationRequired { get; set; }

        /// <summary>
        /// Friendly name of the Access Policy.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The unique precedence for policies on a single application. Required when using `application_id`.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        /// <summary>
        /// The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
        /// </summary>
        [Input("purposeJustificationPrompt")]
        public Input<string>? PurposeJustificationPrompt { get; set; }

        /// <summary>
        /// Whether to prompt the user for a justification for accessing the resource.
        /// </summary>
        [Input("purposeJustificationRequired")]
        public Input<bool>? PurposeJustificationRequired { get; set; }

        [Input("requires")]
        private InputList<Inputs.AccessPolicyRequireArgs>? _requires;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyRequireArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessPolicyRequireArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessPolicyArgs()
        {
        }
        public static new AccessPolicyArgs Empty => new AccessPolicyArgs();
    }

    public sealed class AccessPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account identifier to target for the resource. Conflicts with `zone_id`.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The ID of the application the policy is associated with. Required when using `precedence`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        [Input("approvalGroups")]
        private InputList<Inputs.AccessPolicyApprovalGroupGetArgs>? _approvalGroups;
        public InputList<Inputs.AccessPolicyApprovalGroupGetArgs> ApprovalGroups
        {
            get => _approvalGroups ?? (_approvalGroups = new InputList<Inputs.AccessPolicyApprovalGroupGetArgs>());
            set => _approvalGroups = value;
        }

        [Input("approvalRequired")]
        public Input<bool>? ApprovalRequired { get; set; }

        /// <summary>
        /// Defines the action Access will take if the policy matches the user. Available values: `allow`, `deny`, `non_identity`, `bypass`.
        /// </summary>
        [Input("decision")]
        public Input<string>? Decision { get; set; }

        [Input("excludes")]
        private InputList<Inputs.AccessPolicyExcludeGetArgs>? _excludes;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyExcludeGetArgs> Excludes
        {
            get => _excludes ?? (_excludes = new InputList<Inputs.AccessPolicyExcludeGetArgs>());
            set => _excludes = value;
        }

        [Input("includes")]
        private InputList<Inputs.AccessPolicyIncludeGetArgs>? _includes;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyIncludeGetArgs> Includes
        {
            get => _includes ?? (_includes = new InputList<Inputs.AccessPolicyIncludeGetArgs>());
            set => _includes = value;
        }

        /// <summary>
        /// Require this application to be served in an isolated browser for users matching this policy.
        /// </summary>
        [Input("isolationRequired")]
        public Input<bool>? IsolationRequired { get; set; }

        /// <summary>
        /// Friendly name of the Access Policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The unique precedence for policies on a single application. Required when using `application_id`.
        /// </summary>
        [Input("precedence")]
        public Input<int>? Precedence { get; set; }

        /// <summary>
        /// The prompt to display to the user for a justification for accessing the resource. Required when using `purpose_justification_required`.
        /// </summary>
        [Input("purposeJustificationPrompt")]
        public Input<string>? PurposeJustificationPrompt { get; set; }

        /// <summary>
        /// Whether to prompt the user for a justification for accessing the resource.
        /// </summary>
        [Input("purposeJustificationRequired")]
        public Input<bool>? PurposeJustificationRequired { get; set; }

        [Input("requires")]
        private InputList<Inputs.AccessPolicyRequireGetArgs>? _requires;

        /// <summary>
        /// A series of access conditions, see Access Groups.
        /// </summary>
        public InputList<Inputs.AccessPolicyRequireGetArgs> Requires
        {
            get => _requires ?? (_requires = new InputList<Inputs.AccessPolicyRequireGetArgs>());
            set => _requires = value;
        }

        /// <summary>
        /// How often a user will be forced to re-authorise. Must be in the format `48h` or `2h45m`.
        /// </summary>
        [Input("sessionDuration")]
        public Input<string>? SessionDuration { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. Conflicts with `account_id`.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public AccessPolicyState()
        {
        }
        public static new AccessPolicyState Empty => new AccessPolicyState();
    }
}
