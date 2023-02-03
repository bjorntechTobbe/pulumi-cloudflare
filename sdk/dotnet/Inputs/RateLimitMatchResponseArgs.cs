// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class RateLimitMatchResponseArgs : global::Pulumi.ResourceArgs
    {
        [Input("headers")]
        private InputList<ImmutableDictionary<string, string>>? _headers;
        public InputList<ImmutableDictionary<string, string>> Headers
        {
            get => _headers ?? (_headers = new InputList<ImmutableDictionary<string, string>>());
            set => _headers = value;
        }

        [Input("originTraffic")]
        public Input<bool>? OriginTraffic { get; set; }

        [Input("statuses")]
        private InputList<int>? _statuses;
        public InputList<int> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<int>());
            set => _statuses = value;
        }

        public RateLimitMatchResponseArgs()
        {
        }
        public static new RateLimitMatchResponseArgs Empty => new RateLimitMatchResponseArgs();
    }
}
