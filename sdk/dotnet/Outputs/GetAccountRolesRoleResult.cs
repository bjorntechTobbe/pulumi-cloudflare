// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Outputs
{

    [OutputType]
    public sealed class GetAccountRolesRoleResult
    {
        /// <summary>
        /// Description of role's permissions
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Role identifier tag
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Role Name
        /// </summary>
        public readonly string? Name;

        [OutputConstructor]
        private GetAccountRolesRoleResult(
            string? description,

            string? id,

            string? name)
        {
            Description = description;
            Id = id;
            Name = name;
        }
    }
}
