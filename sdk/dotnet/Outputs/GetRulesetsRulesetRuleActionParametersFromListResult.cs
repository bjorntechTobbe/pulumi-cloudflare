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
    public sealed class GetRulesetsRulesetRuleActionParametersFromListResult
    {
        /// <summary>
        /// Expression to use for the list lookup.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// Name of the list.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetRulesetsRulesetRuleActionParametersFromListResult(
            string key,

            string name)
        {
            Key = key;
            Name = name;
        }
    }
}
