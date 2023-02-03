// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    public static class GetAccountRoles
    {
        /// <summary>
        /// Use this data source to lookup [Account Roles](https://api.cloudflare.com/#account-roles-properties).
        /// </summary>
        public static Task<GetAccountRolesResult> InvokeAsync(GetAccountRolesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountRolesResult>("cloudflare:index/getAccountRoles:getAccountRoles", args ?? new GetAccountRolesArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to lookup [Account Roles](https://api.cloudflare.com/#account-roles-properties).
        /// </summary>
        public static Output<GetAccountRolesResult> Invoke(GetAccountRolesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountRolesResult>("cloudflare:index/getAccountRoles:getAccountRoles", args ?? new GetAccountRolesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAccountRolesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        public GetAccountRolesArgs()
        {
        }
        public static new GetAccountRolesArgs Empty => new GetAccountRolesArgs();
    }

    public sealed class GetAccountRolesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        public GetAccountRolesInvokeArgs()
        {
        }
        public static new GetAccountRolesInvokeArgs Empty => new GetAccountRolesInvokeArgs();
    }


    [OutputType]
    public sealed class GetAccountRolesResult
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of roles object.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAccountRolesRoleResult> Roles;

        [OutputConstructor]
        private GetAccountRolesResult(
            string accountId,

            string id,

            ImmutableArray<Outputs.GetAccountRolesRoleResult> roles)
        {
            AccountId = accountId;
            Id = id;
            Roles = roles;
        }
    }
}
