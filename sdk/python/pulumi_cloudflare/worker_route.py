# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WorkerRouteArgs', 'WorkerRoute']

@pulumi.input_type
class WorkerRouteArgs:
    def __init__(__self__, *,
                 pattern: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 script_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a WorkerRoute resource.
        :param pulumi.Input[str] pattern: The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] script_name: Worker script name to invoke for requests that match the route pattern.
        """
        pulumi.set(__self__, "pattern", pattern)
        pulumi.set(__self__, "zone_id", zone_id)
        if script_name is not None:
            pulumi.set(__self__, "script_name", script_name)

    @property
    @pulumi.getter
    def pattern(self) -> pulumi.Input[str]:
        """
        The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: pulumi.Input[str]):
        pulumi.set(self, "pattern", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> Optional[pulumi.Input[str]]:
        """
        Worker script name to invoke for requests that match the route pattern.
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script_name", value)


@pulumi.input_type
class _WorkerRouteState:
    def __init__(__self__, *,
                 pattern: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WorkerRoute resources.
        :param pulumi.Input[str] pattern: The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        :param pulumi.Input[str] script_name: Worker script name to invoke for requests that match the route pattern.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if pattern is not None:
            pulumi.set(__self__, "pattern", pattern)
        if script_name is not None:
            pulumi.set(__self__, "script_name", script_name)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def pattern(self) -> Optional[pulumi.Input[str]]:
        """
        The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        """
        return pulumi.get(self, "pattern")

    @pattern.setter
    def pattern(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pattern", value)

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> Optional[pulumi.Input[str]]:
        """
        Worker script name to invoke for requests that match the route pattern.
        """
        return pulumi.get(self, "script_name")

    @script_name.setter
    def script_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "script_name", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class WorkerRoute(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare worker route resource. A route will also require a `WorkerScript`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_script = cloudflare.WorkerScript("my_script")
        # Runs the specified worker script for all URLs that match `example.com/*`
        my_route = cloudflare.WorkerRoute("my_route",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            pattern="example.com/*",
            script_name=my_script.name)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workerRoute:WorkerRoute example <zone_id>/<route_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pattern: The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        :param pulumi.Input[str] script_name: Worker script name to invoke for requests that match the route pattern.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerRouteArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare worker route resource. A route will also require a `WorkerScript`.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_script = cloudflare.WorkerScript("my_script")
        # Runs the specified worker script for all URLs that match `example.com/*`
        my_route = cloudflare.WorkerRoute("my_route",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            pattern="example.com/*",
            script_name=my_script.name)
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/workerRoute:WorkerRoute example <zone_id>/<route_id>
        ```

        :param str resource_name: The name of the resource.
        :param WorkerRouteArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerRouteArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 pattern: Optional[pulumi.Input[str]] = None,
                 script_name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerRouteArgs.__new__(WorkerRouteArgs)

            if pattern is None and not opts.urn:
                raise TypeError("Missing required property 'pattern'")
            __props__.__dict__["pattern"] = pattern
            __props__.__dict__["script_name"] = script_name
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
        super(WorkerRoute, __self__).__init__(
            'cloudflare:index/workerRoute:WorkerRoute',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            pattern: Optional[pulumi.Input[str]] = None,
            script_name: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'WorkerRoute':
        """
        Get an existing WorkerRoute resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] pattern: The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        :param pulumi.Input[str] script_name: Worker script name to invoke for requests that match the route pattern.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerRouteState.__new__(_WorkerRouteState)

        __props__.__dict__["pattern"] = pattern
        __props__.__dict__["script_name"] = script_name
        __props__.__dict__["zone_id"] = zone_id
        return WorkerRoute(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def pattern(self) -> pulumi.Output[str]:
        """
        The [route pattern](https://developers.cloudflare.com/workers/about/routes/) to associate the Worker with.
        """
        return pulumi.get(self, "pattern")

    @property
    @pulumi.getter(name="scriptName")
    def script_name(self) -> pulumi.Output[Optional[str]]:
        """
        Worker script name to invoke for requests that match the route pattern.
        """
        return pulumi.get(self, "script_name")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

