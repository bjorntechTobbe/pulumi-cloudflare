// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class PagesProjectDeploymentConfigsProductionServiceBindingGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("environment")]
        public Input<string>? Environment { get; set; }

        /// <summary>
        /// Name of the project.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("service", required: true)]
        public Input<string> Service { get; set; } = null!;

        public PagesProjectDeploymentConfigsProductionServiceBindingGetArgs()
        {
        }
        public static new PagesProjectDeploymentConfigsProductionServiceBindingGetArgs Empty => new PagesProjectDeploymentConfigsProductionServiceBindingGetArgs();
    }
}
