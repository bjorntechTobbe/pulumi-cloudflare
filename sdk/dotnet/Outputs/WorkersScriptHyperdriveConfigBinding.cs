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
    public sealed class WorkersScriptHyperdriveConfigBinding
    {
        /// <summary>
        /// The global variable for the binding in your Worker code.
        /// </summary>
        public readonly string Binding;
        /// <summary>
        /// The ID of the Hyperdrive config to use.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private WorkersScriptHyperdriveConfigBinding(
            string binding,

            string id)
        {
            Binding = binding;
            Id = id;
        }
    }
}
