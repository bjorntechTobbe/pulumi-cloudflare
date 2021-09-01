// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RulesetRuleActionParameterUriArgs : Pulumi.ResourceArgs
    {
        [Input("origin")]
        public Input<bool>? Origin { get; set; }

        [Input("paths")]
        private InputList<Inputs.RulesetRuleActionParameterUriPathArgs>? _paths;

        /// <summary>
        /// URI path configuration when performing a URL rewrite (refer to the nested schema).
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParameterUriPathArgs> Paths
        {
            get => _paths ?? (_paths = new InputList<Inputs.RulesetRuleActionParameterUriPathArgs>());
            set => _paths = value;
        }

        [Input("queries")]
        private InputList<Inputs.RulesetRuleActionParameterUriQueryArgs>? _queries;

        /// <summary>
        /// Query string configuration when performing a URL rewrite (refer to the nested schema).
        /// </summary>
        public InputList<Inputs.RulesetRuleActionParameterUriQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.RulesetRuleActionParameterUriQueryArgs>());
            set => _queries = value;
        }

        public RulesetRuleActionParameterUriArgs()
        {
        }
    }
}
