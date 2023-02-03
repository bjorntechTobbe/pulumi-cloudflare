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
    public sealed class SpectrumApplicationOriginPortRange
    {
        /// <summary>
        /// Upper bound of the origin port range.
        /// </summary>
        public readonly int End;
        /// <summary>
        /// Lower bound of the origin port range.
        /// </summary>
        public readonly int Start;

        [OutputConstructor]
        private SpectrumApplicationOriginPortRange(
            int end,

            int start)
        {
            End = end;
            Start = start;
        }
    }
}
