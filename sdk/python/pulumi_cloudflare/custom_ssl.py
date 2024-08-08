# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['CustomSslArgs', 'CustomSsl']

@pulumi.input_type
class CustomSslArgs:
    def __init__(__self__, *,
                 zone_id: pulumi.Input[str],
                 custom_ssl_options: Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']] = None,
                 custom_ssl_priorities: Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]] = None):
        """
        The set of arguments for constructing a CustomSsl resource.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        :param pulumi.Input['CustomSslCustomSslOptionsArgs'] custom_ssl_options: The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        """
        pulumi.set(__self__, "zone_id", zone_id)
        if custom_ssl_options is not None:
            pulumi.set(__self__, "custom_ssl_options", custom_ssl_options)
        if custom_ssl_priorities is not None:
            pulumi.set(__self__, "custom_ssl_priorities", custom_ssl_priorities)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Input[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "zone_id", value)

    @property
    @pulumi.getter(name="customSslOptions")
    def custom_ssl_options(self) -> Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']]:
        """
        The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "custom_ssl_options")

    @custom_ssl_options.setter
    def custom_ssl_options(self, value: Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']]):
        pulumi.set(self, "custom_ssl_options", value)

    @property
    @pulumi.getter(name="customSslPriorities")
    def custom_ssl_priorities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]]:
        return pulumi.get(self, "custom_ssl_priorities")

    @custom_ssl_priorities.setter
    def custom_ssl_priorities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]]):
        pulumi.set(self, "custom_ssl_priorities", value)


@pulumi.input_type
class _CustomSslState:
    def __init__(__self__, *,
                 custom_ssl_options: Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']] = None,
                 custom_ssl_priorities: Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]] = None,
                 expires_on: Optional[pulumi.Input[str]] = None,
                 hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 issuer: Optional[pulumi.Input[str]] = None,
                 modified_on: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 signature: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 uploaded_on: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomSsl resources.
        :param pulumi.Input['CustomSslCustomSslOptionsArgs'] custom_ssl_options: The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        if custom_ssl_options is not None:
            pulumi.set(__self__, "custom_ssl_options", custom_ssl_options)
        if custom_ssl_priorities is not None:
            pulumi.set(__self__, "custom_ssl_priorities", custom_ssl_priorities)
        if expires_on is not None:
            pulumi.set(__self__, "expires_on", expires_on)
        if hosts is not None:
            pulumi.set(__self__, "hosts", hosts)
        if issuer is not None:
            pulumi.set(__self__, "issuer", issuer)
        if modified_on is not None:
            pulumi.set(__self__, "modified_on", modified_on)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if signature is not None:
            pulumi.set(__self__, "signature", signature)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if uploaded_on is not None:
            pulumi.set(__self__, "uploaded_on", uploaded_on)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="customSslOptions")
    def custom_ssl_options(self) -> Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']]:
        """
        The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "custom_ssl_options")

    @custom_ssl_options.setter
    def custom_ssl_options(self, value: Optional[pulumi.Input['CustomSslCustomSslOptionsArgs']]):
        pulumi.set(self, "custom_ssl_options", value)

    @property
    @pulumi.getter(name="customSslPriorities")
    def custom_ssl_priorities(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]]:
        return pulumi.get(self, "custom_ssl_priorities")

    @custom_ssl_priorities.setter
    def custom_ssl_priorities(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomSslCustomSslPriorityArgs']]]]):
        pulumi.set(self, "custom_ssl_priorities", value)

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "expires_on")

    @expires_on.setter
    def expires_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_on", value)

    @property
    @pulumi.getter
    def hosts(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "hosts")

    @hosts.setter
    def hosts(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "hosts", value)

    @property
    @pulumi.getter
    def issuer(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "issuer")

    @issuer.setter
    def issuer(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "issuer", value)

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "modified_on")

    @modified_on.setter
    def modified_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "modified_on", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter
    def signature(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "signature")

    @signature.setter
    def signature(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signature", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "uploaded_on")

    @uploaded_on.setter
    def uploaded_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "uploaded_on", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class CustomSsl(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_ssl_options: Optional[pulumi.Input[Union['CustomSslCustomSslOptionsArgs', 'CustomSslCustomSslOptionsArgsDict']]] = None,
                 custom_ssl_priorities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomSslCustomSslPriorityArgs', 'CustomSslCustomSslPriorityArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare custom SSL resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomSsl("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            custom_ssl_options={
                "certificate": "-----INSERT CERTIFICATE-----",
                "private_key": "-----INSERT PRIVATE KEY-----",
                "bundle_method": "ubiquitous",
                "geo_restrictions": "us",
                "type": "legacy_custom",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customSsl:CustomSsl example <zone_id>/<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CustomSslCustomSslOptionsArgs', 'CustomSslCustomSslOptionsArgsDict']] custom_ssl_options: The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomSslArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare custom SSL resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomSsl("example",
            zone_id="0da42c8d2132a9ddaf714f9e7c920711",
            custom_ssl_options={
                "certificate": "-----INSERT CERTIFICATE-----",
                "private_key": "-----INSERT PRIVATE KEY-----",
                "bundle_method": "ubiquitous",
                "geo_restrictions": "us",
                "type": "legacy_custom",
            })
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/customSsl:CustomSsl example <zone_id>/<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param CustomSslArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomSslArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_ssl_options: Optional[pulumi.Input[Union['CustomSslCustomSslOptionsArgs', 'CustomSslCustomSslOptionsArgsDict']]] = None,
                 custom_ssl_priorities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomSslCustomSslPriorityArgs', 'CustomSslCustomSslPriorityArgsDict']]]]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomSslArgs.__new__(CustomSslArgs)

            __props__.__dict__["custom_ssl_options"] = custom_ssl_options
            __props__.__dict__["custom_ssl_priorities"] = custom_ssl_priorities
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["expires_on"] = None
            __props__.__dict__["hosts"] = None
            __props__.__dict__["issuer"] = None
            __props__.__dict__["modified_on"] = None
            __props__.__dict__["priority"] = None
            __props__.__dict__["signature"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["uploaded_on"] = None
        super(CustomSsl, __self__).__init__(
            'cloudflare:index/customSsl:CustomSsl',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_ssl_options: Optional[pulumi.Input[Union['CustomSslCustomSslOptionsArgs', 'CustomSslCustomSslOptionsArgsDict']]] = None,
            custom_ssl_priorities: Optional[pulumi.Input[Sequence[pulumi.Input[Union['CustomSslCustomSslPriorityArgs', 'CustomSslCustomSslPriorityArgsDict']]]]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            hosts: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            issuer: Optional[pulumi.Input[str]] = None,
            modified_on: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            signature: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            uploaded_on: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CustomSsl':
        """
        Get an existing CustomSsl resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['CustomSslCustomSslOptionsArgs', 'CustomSslCustomSslOptionsArgsDict']] custom_ssl_options: The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomSslState.__new__(_CustomSslState)

        __props__.__dict__["custom_ssl_options"] = custom_ssl_options
        __props__.__dict__["custom_ssl_priorities"] = custom_ssl_priorities
        __props__.__dict__["expires_on"] = expires_on
        __props__.__dict__["hosts"] = hosts
        __props__.__dict__["issuer"] = issuer
        __props__.__dict__["modified_on"] = modified_on
        __props__.__dict__["priority"] = priority
        __props__.__dict__["signature"] = signature
        __props__.__dict__["status"] = status
        __props__.__dict__["uploaded_on"] = uploaded_on
        __props__.__dict__["zone_id"] = zone_id
        return CustomSsl(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customSslOptions")
    def custom_ssl_options(self) -> pulumi.Output[Optional['outputs.CustomSslCustomSslOptions']]:
        """
        The certificate associated parameters. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "custom_ssl_options")

    @property
    @pulumi.getter(name="customSslPriorities")
    def custom_ssl_priorities(self) -> pulumi.Output[Optional[Sequence['outputs.CustomSslCustomSslPriority']]]:
        return pulumi.get(self, "custom_ssl_priorities")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[str]:
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def hosts(self) -> pulumi.Output[Sequence[str]]:
        return pulumi.get(self, "hosts")

    @property
    @pulumi.getter
    def issuer(self) -> pulumi.Output[str]:
        return pulumi.get(self, "issuer")

    @property
    @pulumi.getter(name="modifiedOn")
    def modified_on(self) -> pulumi.Output[str]:
        return pulumi.get(self, "modified_on")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def signature(self) -> pulumi.Output[str]:
        return pulumi.get(self, "signature")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="uploadedOn")
    def uploaded_on(self) -> pulumi.Output[str]:
        return pulumi.get(self, "uploaded_on")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource.
        """
        return pulumi.get(self, "zone_id")

