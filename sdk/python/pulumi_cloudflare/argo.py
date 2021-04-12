# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['ArgoArgs', 'Argo']

@pulumi.input_type
class ArgoArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 smart_routing: Optional[pulumi.Input[str]] = None,
                 tiered_caching: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Argo resource.
        :param pulumi.Input[str] zone_id: The DNS zone ID that you wish to manage Argo on.
        :param pulumi.Input[str] smart_routing: Whether smart routing is enabled. Valid values: `on` or `off`.
        :param pulumi.Input[str] tiered_caching: Whether tiered caching is enabled. Valid values: `on` or `off`.
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if smart_routing is not None:
            pulumi.set(__self__, "smart_routing", smart_routing)
        if tiered_caching is not None:
            pulumi.set(__self__, "tiered_caching", tiered_caching)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The DNS zone ID that you wish to manage Argo on.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="smartRouting")
    def smart_routing(self) -> Optional[pulumi.Input[str]]:
        """
        Whether smart routing is enabled. Valid values: `on` or `off`.
        """
        return pulumi.get(self, "smart_routing")

    @smart_routing.setter
    def smart_routing(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "smart_routing", value)

    @property
    @pulumi.getter(name="tieredCaching")
    def tiered_caching(self) -> Optional[pulumi.Input[str]]:
        """
        Whether tiered caching is enabled. Valid values: `on` or `off`.
        """
        return pulumi.get(self, "tiered_caching")

    @tiered_caching.setter
    def tiered_caching(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tiered_caching", value)


class Argo(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 smart_routing: Optional[pulumi.Input[str]] = None,
                 tiered_caching: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Cloudflare Argo controls the routing to your origin and tiered caching options to speed up your website browsing experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Argo("example",
            smart_routing="on",
            tiered_caching="on",
            zone_id="d41d8cd98f00b204e9800998ecf8427e")
        ```

        ## Import

        Argo settings can be imported the zone ID.

        ```sh
         $ pulumi import cloudflare:index/argo:Argo example d41d8cd98f00b204e9800998ecf8427e
        ```

         where `d41d8cd98f00b204e9800998ecf8427e` is the zone ID.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] smart_routing: Whether smart routing is enabled. Valid values: `on` or `off`.
        :param pulumi.Input[str] tiered_caching: Whether tiered caching is enabled. Valid values: `on` or `off`.
        :param pulumi.Input[str] zone_id: The DNS zone ID that you wish to manage Argo on.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ArgoArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Cloudflare Argo controls the routing to your origin and tiered caching options to speed up your website browsing experience.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Argo("example",
            smart_routing="on",
            tiered_caching="on",
            zone_id="d41d8cd98f00b204e9800998ecf8427e")
        ```

        ## Import

        Argo settings can be imported the zone ID.

        ```sh
         $ pulumi import cloudflare:index/argo:Argo example d41d8cd98f00b204e9800998ecf8427e
        ```

         where `d41d8cd98f00b204e9800998ecf8427e` is the zone ID.

        :param str resource_name: The name of the resource.
        :param ArgoArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ArgoArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 smart_routing: Optional[pulumi.Input[str]] = None,
                 tiered_caching: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['smart_routing'] = smart_routing
            __props__['tiered_caching'] = tiered_caching
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
        super(Argo, __self__).__init__(
            'cloudflare:index/argo:Argo',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            smart_routing: Optional[pulumi.Input[str]] = None,
            tiered_caching: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'Argo':
        """
        Get an existing Argo resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] smart_routing: Whether smart routing is enabled. Valid values: `on` or `off`.
        :param pulumi.Input[str] tiered_caching: Whether tiered caching is enabled. Valid values: `on` or `off`.
        :param pulumi.Input[str] zone_id: The DNS zone ID that you wish to manage Argo on.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["smart_routing"] = smart_routing
        __props__["tiered_caching"] = tiered_caching
        __props__["zone_id"] = zone_id
        return Argo(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="smartRouting")
    def smart_routing(self) -> pulumi.Output[Optional[str]]:
        """
        Whether smart routing is enabled. Valid values: `on` or `off`.
        """
        return pulumi.get(self, "smart_routing")

    @property
    @pulumi.getter(name="tieredCaching")
    def tiered_caching(self) -> pulumi.Output[Optional[str]]:
        """
        Whether tiered caching is enabled. Valid values: `on` or `off`.
        """
        return pulumi.get(self, "tiered_caching")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone ID that you wish to manage Argo on.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

