# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ZoneArgs', 'Zone']

@pulumi.input_type
class ZoneArgs:
    def __init__(__self__, *,
                 zone: pulumi.Input[str],
                 jump_start: Optional[pulumi.Input[bool]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Zone resource.
        :param pulumi.Input[str] zone: The DNS zone name which will be added.
        :param pulumi.Input[bool] jump_start: Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
        :param pulumi.Input[bool] paused: Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
        :param pulumi.Input[str] plan: The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
        :param pulumi.Input[str] type: A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
        """
        pulumi.set(__self__, "zone", zone)
        if jump_start is not None:
            pulumi.set(__self__, "jump_start", jump_start)
        if paused is not None:
            pulumi.set(__self__, "paused", paused)
        if plan is not None:
            pulumi.set(__self__, "plan", plan)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Input[str]:
        """
        The DNS zone name which will be added.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone", value)

    @property
    @pulumi.getter(name="jumpStart")
    def jump_start(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
        """
        return pulumi.get(self, "jump_start")

    @jump_start.setter
    def jump_start(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "jump_start", value)

    @property
    @pulumi.getter
    def paused(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
        """
        return pulumi.get(self, "paused")

    @paused.setter
    def paused(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "paused", value)

    @property
    @pulumi.getter
    def plan(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
        """
        return pulumi.get(self, "plan")

    @plan.setter
    def plan(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class Zone(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 jump_start: Optional[pulumi.Input[bool]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Zone resource. Zone is the basic resource for working with Cloudflare and is roughly equivalent to a domain name that the user purchases.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Zone("example", zone="example.com")
        ```

        ## Import

        Zone resource can be imported using a zone ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/zone:Zone example d41d8cd98f00b204e9800998ecf8427e
        ```

         where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] jump_start: Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
        :param pulumi.Input[bool] paused: Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
        :param pulumi.Input[str] plan: The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
        :param pulumi.Input[str] type: A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
        :param pulumi.Input[str] zone: The DNS zone name which will be added.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ZoneArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Zone resource. Zone is the basic resource for working with Cloudflare and is roughly equivalent to a domain name that the user purchases.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.Zone("example", zone="example.com")
        ```

        ## Import

        Zone resource can be imported using a zone ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/zone:Zone example d41d8cd98f00b204e9800998ecf8427e
        ```

         where* `d41d8cd98f00b204e9800998ecf8427e` - zone ID, as returned from [API](https://api.cloudflare.com/#zone-list-zones)

        :param str resource_name: The name of the resource.
        :param ZoneArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ZoneArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 jump_start: Optional[pulumi.Input[bool]] = None,
                 paused: Optional[pulumi.Input[bool]] = None,
                 plan: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
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

            __props__['jump_start'] = jump_start
            __props__['paused'] = paused
            __props__['plan'] = plan
            __props__['type'] = type
            if zone is None and not opts.urn:
                raise TypeError("Missing required property 'zone'")
            __props__['zone'] = zone
            __props__['meta'] = None
            __props__['name_servers'] = None
            __props__['status'] = None
            __props__['vanity_name_servers'] = None
            __props__['verification_key'] = None
        super(Zone, __self__).__init__(
            'cloudflare:index/zone:Zone',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            jump_start: Optional[pulumi.Input[bool]] = None,
            meta: Optional[pulumi.Input[pulumi.InputType['ZoneMetaArgs']]] = None,
            name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            paused: Optional[pulumi.Input[bool]] = None,
            plan: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            vanity_name_servers: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            verification_key: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'Zone':
        """
        Get an existing Zone resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] jump_start: Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] name_servers: Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
        :param pulumi.Input[bool] paused: Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
        :param pulumi.Input[str] plan: The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
        :param pulumi.Input[str] status: Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
        :param pulumi.Input[str] type: A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] vanity_name_servers: List of Vanity Nameservers (if set).
               * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
               * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
        :param pulumi.Input[str] verification_key: Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
        :param pulumi.Input[str] zone: The DNS zone name which will be added.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["jump_start"] = jump_start
        __props__["meta"] = meta
        __props__["name_servers"] = name_servers
        __props__["paused"] = paused
        __props__["plan"] = plan
        __props__["status"] = status
        __props__["type"] = type
        __props__["vanity_name_servers"] = vanity_name_servers
        __props__["verification_key"] = verification_key
        __props__["zone"] = zone
        return Zone(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="jumpStart")
    def jump_start(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean of whether to scan for DNS records on creation. Ignored after zone is created. Default: false.
        """
        return pulumi.get(self, "jump_start")

    @property
    @pulumi.getter
    def meta(self) -> pulumi.Output['outputs.ZoneMeta']:
        return pulumi.get(self, "meta")

    @property
    @pulumi.getter(name="nameServers")
    def name_servers(self) -> pulumi.Output[Sequence[str]]:
        """
        Cloudflare-assigned name servers. This is only populated for zones that use Cloudflare DNS.
        """
        return pulumi.get(self, "name_servers")

    @property
    @pulumi.getter
    def paused(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean of whether this zone is paused (traffic bypasses Cloudflare). Default: false.
        """
        return pulumi.get(self, "paused")

    @property
    @pulumi.getter
    def plan(self) -> pulumi.Output[str]:
        """
        The name of the commercial plan to apply to the zone, can be updated once the one is created; one of `free`, `pro`, `business`, `enterprise`.
        """
        return pulumi.get(self, "plan")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the zone. Valid values: `active`, `pending`, `initializing`, `moved`, `deleted`, `deactivated`.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        A full zone implies that DNS is hosted with Cloudflare. A partial zone is typically a partner-hosted zone or a CNAME setup. Valid values: `full`, `partial`. Default is `full`.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="vanityNameServers")
    def vanity_name_servers(self) -> pulumi.Output[Sequence[str]]:
        """
        List of Vanity Nameservers (if set).
        * `meta.wildcard_proxiable` - Indicates whether wildcard DNS records can receive Cloudflare security and performance features.
        * `meta.phishing_detected` - Indicates if URLs on the zone have been identified as hosting phishing content.
        """
        return pulumi.get(self, "vanity_name_servers")

    @property
    @pulumi.getter(name="verificationKey")
    def verification_key(self) -> pulumi.Output[str]:
        """
        Contains the TXT record value to validate domain ownership. This is only populated for zones of type `partial`.
        """
        return pulumi.get(self, "verification_key")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        The DNS zone name which will be added.
        """
        return pulumi.get(self, "zone")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

