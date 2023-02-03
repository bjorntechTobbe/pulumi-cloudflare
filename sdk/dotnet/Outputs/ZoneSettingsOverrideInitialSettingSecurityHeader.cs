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
    public sealed class ZoneSettingsOverrideInitialSettingSecurityHeader
    {
        public readonly bool? Enabled;
        public readonly bool? IncludeSubdomains;
        public readonly int? MaxAge;
        public readonly bool? Nosniff;
        public readonly bool? Preload;

        [OutputConstructor]
        private ZoneSettingsOverrideInitialSettingSecurityHeader(
            bool? enabled,

            bool? includeSubdomains,

            int? maxAge,

            bool? nosniff,

            bool? preload)
        {
            Enabled = enabled;
            IncludeSubdomains = includeSubdomains;
            MaxAge = maxAge;
            Nosniff = nosniff;
            Preload = preload;
        }
    }
}
