// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class ZoneSettingsOverrideInitialSettingNelArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ZoneSettingsOverrideInitialSettingNelArgs()
        {
        }
        public static new ZoneSettingsOverrideInitialSettingNelArgs Empty => new ZoneSettingsOverrideInitialSettingNelArgs();
    }
}
