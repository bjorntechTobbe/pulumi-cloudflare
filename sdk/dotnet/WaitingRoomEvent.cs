// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Cloudflare
{
    /// <summary>
    /// Provides a Cloudflare Waiting Room Event resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Cloudflare = Pulumi.Cloudflare;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Waiting Room Event
    ///     var example = new Cloudflare.WaitingRoomEvent("example", new()
    ///     {
    ///         EventEndTime = "2006-01-02T20:04:05Z",
    ///         EventStartTime = "2006-01-02T15:04:05Z",
    ///         Name = "foo",
    ///         WaitingRoomId = "d41d8cd98f00b204e9800998ecf8427e",
    ///         ZoneId = "0da42c8d2132a9ddaf714f9e7c920711",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Use the Zone ID, Waiting Room ID, and Event ID to import.
    /// 
    /// ```sh
    ///  $ pulumi import cloudflare:index/waitingRoomEvent:WaitingRoomEvent default &lt;zone_id&gt;/&lt;waiting_room_id&gt;/&lt;waiting_room_event_id&gt;
    /// ```
    /// </summary>
    [CloudflareResourceType("cloudflare:index/waitingRoomEvent:WaitingRoomEvent")]
    public partial class WaitingRoomEvent : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Output("customPageHtml")]
        public Output<string?> CustomPageHtml { get; private set; } = null!;

        /// <summary>
        /// A description to let users add more details about the event.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Output("disableSessionRenewal")]
        public Output<bool?> DisableSessionRenewal { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("eventEndTime")]
        public Output<string> EventEndTime { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `event_end_time`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("eventStartTime")]
        public Output<string> EventStartTime { get; private set; } = null!;

        /// <summary>
        /// Last modified time.
        /// </summary>
        [Output("modifiedOn")]
        public Output<string> ModifiedOn { get; private set; } = null!;

        /// <summary>
        /// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Output("newUsersPerMinute")]
        public Output<int?> NewUsersPerMinute { get; private set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `event_start_time`.
        /// </summary>
        [Output("prequeueStartTime")]
        public Output<string?> PrequeueStartTime { get; private set; } = null!;

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
        /// </summary>
        [Output("queueingMethod")]
        public Output<string?> QueueingMethod { get; private set; } = null!;

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
        /// </summary>
        [Output("sessionDuration")]
        public Output<int?> SessionDuration { get; private set; } = null!;

        /// <summary>
        /// Users in the prequeue will be shuffled randomly at the `event_start_time`. Requires that `prequeue_start_time` is not null. Defaults to `false`.
        /// </summary>
        [Output("shuffleAtEventStart")]
        public Output<bool?> ShuffleAtEventStart { get; private set; } = null!;

        /// <summary>
        /// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
        /// </summary>
        [Output("suspended")]
        public Output<bool?> Suspended { get; private set; } = null!;

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Output("totalActiveUsers")]
        public Output<int?> TotalActiveUsers { get; private set; } = null!;

        /// <summary>
        /// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("waitingRoomId")]
        public Output<string> WaitingRoomId { get; private set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a WaitingRoomEvent resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WaitingRoomEvent(string name, WaitingRoomEventArgs args, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomEvent:WaitingRoomEvent", name, args ?? new WaitingRoomEventArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WaitingRoomEvent(string name, Input<string> id, WaitingRoomEventState? state = null, CustomResourceOptions? options = null)
            : base("cloudflare:index/waitingRoomEvent:WaitingRoomEvent", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WaitingRoomEvent resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WaitingRoomEvent Get(string name, Input<string> id, WaitingRoomEventState? state = null, CustomResourceOptions? options = null)
        {
            return new WaitingRoomEvent(name, id, state, options);
        }
    }

    public sealed class WaitingRoomEventArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Input("customPageHtml")]
        public Input<string>? CustomPageHtml { get; set; }

        /// <summary>
        /// A description to let users add more details about the event.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Input("disableSessionRenewal")]
        public Input<bool>? DisableSessionRenewal { get; set; }

        /// <summary>
        /// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("eventEndTime", required: true)]
        public Input<string> EventEndTime { get; set; } = null!;

        /// <summary>
        /// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `event_end_time`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("eventStartTime", required: true)]
        public Input<string> EventStartTime { get; set; } = null!;

        /// <summary>
        /// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Input("newUsersPerMinute")]
        public Input<int>? NewUsersPerMinute { get; set; }

        /// <summary>
        /// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `event_start_time`.
        /// </summary>
        [Input("prequeueStartTime")]
        public Input<string>? PrequeueStartTime { get; set; }

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
        /// </summary>
        [Input("queueingMethod")]
        public Input<string>? QueueingMethod { get; set; }

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
        /// </summary>
        [Input("sessionDuration")]
        public Input<int>? SessionDuration { get; set; }

        /// <summary>
        /// Users in the prequeue will be shuffled randomly at the `event_start_time`. Requires that `prequeue_start_time` is not null. Defaults to `false`.
        /// </summary>
        [Input("shuffleAtEventStart")]
        public Input<bool>? ShuffleAtEventStart { get; set; }

        /// <summary>
        /// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Input("totalActiveUsers")]
        public Input<int>? TotalActiveUsers { get; set; }

        /// <summary>
        /// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitingRoomId", required: true)]
        public Input<string> WaitingRoomId { get; set; } = null!;

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public WaitingRoomEventArgs()
        {
        }
        public static new WaitingRoomEventArgs Empty => new WaitingRoomEventArgs();
    }

    public sealed class WaitingRoomEventState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// This is a templated html file that will be rendered at the edge.
        /// </summary>
        [Input("customPageHtml")]
        public Input<string>? CustomPageHtml { get; set; }

        /// <summary>
        /// A description to let users add more details about the event.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Disables automatic renewal of session cookies.
        /// </summary>
        [Input("disableSessionRenewal")]
        public Input<bool>? DisableSessionRenewal { get; set; }

        /// <summary>
        /// ISO 8601 timestamp that marks the end of the event. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("eventEndTime")]
        public Input<string>? EventEndTime { get; set; }

        /// <summary>
        /// ISO 8601 timestamp that marks the start of the event. Must occur at least 1 minute before `event_end_time`. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("eventStartTime")]
        public Input<string>? EventStartTime { get; set; }

        /// <summary>
        /// Last modified time.
        /// </summary>
        [Input("modifiedOn")]
        public Input<string>? ModifiedOn { get; set; }

        /// <summary>
        /// A unique name to identify the event. Only alphanumeric characters, hyphens, and underscores are allowed. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The number of new users that will be let into the route every minute.
        /// </summary>
        [Input("newUsersPerMinute")]
        public Input<int>? NewUsersPerMinute { get; set; }

        /// <summary>
        /// ISO 8601 timestamp that marks when to begin queueing all users before the event starts. Must occur at least 5 minutes before `event_start_time`.
        /// </summary>
        [Input("prequeueStartTime")]
        public Input<string>? PrequeueStartTime { get; set; }

        /// <summary>
        /// The queueing method used by the waiting room. Available values: `fifo`, `random`, `passthrough`, `reject`.
        /// </summary>
        [Input("queueingMethod")]
        public Input<string>? QueueingMethod { get; set; }

        /// <summary>
        /// Lifetime of a cookie (in minutes) set by Cloudflare for users who get access to the origin.
        /// </summary>
        [Input("sessionDuration")]
        public Input<int>? SessionDuration { get; set; }

        /// <summary>
        /// Users in the prequeue will be shuffled randomly at the `event_start_time`. Requires that `prequeue_start_time` is not null. Defaults to `false`.
        /// </summary>
        [Input("shuffleAtEventStart")]
        public Input<bool>? ShuffleAtEventStart { get; set; }

        /// <summary>
        /// If suspended, the event is ignored and traffic will be handled based on the waiting room configuration.
        /// </summary>
        [Input("suspended")]
        public Input<bool>? Suspended { get; set; }

        /// <summary>
        /// The total number of active user sessions on the route at a point in time.
        /// </summary>
        [Input("totalActiveUsers")]
        public Input<int>? TotalActiveUsers { get; set; }

        /// <summary>
        /// The Waiting Room ID the event should apply to. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("waitingRoomId")]
        public Input<string>? WaitingRoomId { get; set; }

        /// <summary>
        /// The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public WaitingRoomEventState()
        {
        }
        public static new WaitingRoomEventState Empty => new WaitingRoomEventState();
    }
}
