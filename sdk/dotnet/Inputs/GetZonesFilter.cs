// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare.Inputs
{

    public sealed class GetZonesFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The account identifier to target for the resource.
        /// </summary>
        [Input("accountId")]
        public string? AccountId { get; set; }

        /// <summary>
        /// The type of search to perform for the `name` value when querying the zone API. Available values: `contains`, `exact`. Defaults to `exact`.
        /// </summary>
        [Input("lookupType")]
        public string? LookupType { get; set; }

        /// <summary>
        /// A RE2 compatible regular expression to filter the	results. This is performed client side whereas the `name` and `lookup_type`	are performed on the Cloudflare server side.
        /// </summary>
        [Input("match")]
        public string? Match { get; set; }

        /// <summary>
        /// A string value to search for.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Paused status of the zone to lookup. Defaults to `false`.
        /// </summary>
        [Input("paused")]
        public bool? Paused { get; set; }

        /// <summary>
        /// Status of the zone to lookup.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetZonesFilterArgs()
        {
        }
        public static new GetZonesFilterArgs Empty => new GetZonesFilterArgs();
    }
}
