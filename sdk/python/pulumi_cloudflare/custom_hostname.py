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

__all__ = ['CustomHostnameArgs', 'CustomHostname']

@pulumi.input_type
class CustomHostnameArgs:
    def __init__(__self__, *,
                 hostname: pulumi.Input[str],
                 zone_id: pulumi.Input[str],
                 custom_metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 custom_origin_server: Optional[pulumi.Input[str]] = None,
                 custom_origin_sni: Optional[pulumi.Input[str]] = None,
                 ssls: Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]] = None,
                 wait_for_ssl_pending_validation: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a CustomHostname resource.
        :param pulumi.Input[str] hostname: Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] custom_metadata: Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        :param pulumi.Input[str] custom_origin_server: The custom origin server used for certificates.
        :param pulumi.Input[str] custom_origin_sni: The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        :param pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]] ssls: SSL configuration of the certificate.
        :param pulumi.Input[bool] wait_for_ssl_pending_validation: Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        """
        pulumi.set(__self__, "hostname", hostname)
        pulumi.set(__self__, "zone_id", zone_id)
        if custom_metadata is not None:
            pulumi.set(__self__, "custom_metadata", custom_metadata)
        if custom_origin_server is not None:
            pulumi.set(__self__, "custom_origin_server", custom_origin_server)
        if custom_origin_sni is not None:
            pulumi.set(__self__, "custom_origin_sni", custom_origin_sni)
        if ssls is not None:
            pulumi.set(__self__, "ssls", ssls)
        if wait_for_ssl_pending_validation is not None:
            pulumi.set(__self__, "wait_for_ssl_pending_validation", wait_for_ssl_pending_validation)

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Input[str]:
        """
        Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: pulumi.Input[str]):
        pulumi.set(self, "hostname", value)

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
    @pulumi.getter(name="customMetadata")
    def custom_metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        """
        return pulumi.get(self, "custom_metadata")

    @custom_metadata.setter
    def custom_metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "custom_metadata", value)

    @property
    @pulumi.getter(name="customOriginServer")
    def custom_origin_server(self) -> Optional[pulumi.Input[str]]:
        """
        The custom origin server used for certificates.
        """
        return pulumi.get(self, "custom_origin_server")

    @custom_origin_server.setter
    def custom_origin_server(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_origin_server", value)

    @property
    @pulumi.getter(name="customOriginSni")
    def custom_origin_sni(self) -> Optional[pulumi.Input[str]]:
        """
        The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        """
        return pulumi.get(self, "custom_origin_sni")

    @custom_origin_sni.setter
    def custom_origin_sni(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_origin_sni", value)

    @property
    @pulumi.getter
    def ssls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]]:
        """
        SSL configuration of the certificate.
        """
        return pulumi.get(self, "ssls")

    @ssls.setter
    def ssls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]]):
        pulumi.set(self, "ssls", value)

    @property
    @pulumi.getter(name="waitForSslPendingValidation")
    def wait_for_ssl_pending_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        """
        return pulumi.get(self, "wait_for_ssl_pending_validation")

    @wait_for_ssl_pending_validation.setter
    def wait_for_ssl_pending_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_ssl_pending_validation", value)


@pulumi.input_type
class _CustomHostnameState:
    def __init__(__self__, *,
                 custom_metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 custom_origin_server: Optional[pulumi.Input[str]] = None,
                 custom_origin_sni: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ownership_verification: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ownership_verification_http: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ssls: Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 wait_for_ssl_pending_validation: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CustomHostname resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] custom_metadata: Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        :param pulumi.Input[str] custom_origin_server: The custom origin server used for certificates.
        :param pulumi.Input[str] custom_origin_sni: The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        :param pulumi.Input[str] hostname: Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]] ssls: SSL configuration of the certificate.
        :param pulumi.Input[str] status: Status of the certificate.
        :param pulumi.Input[bool] wait_for_ssl_pending_validation: Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        if custom_metadata is not None:
            pulumi.set(__self__, "custom_metadata", custom_metadata)
        if custom_origin_server is not None:
            pulumi.set(__self__, "custom_origin_server", custom_origin_server)
        if custom_origin_sni is not None:
            pulumi.set(__self__, "custom_origin_sni", custom_origin_sni)
        if hostname is not None:
            pulumi.set(__self__, "hostname", hostname)
        if ownership_verification is not None:
            pulumi.set(__self__, "ownership_verification", ownership_verification)
        if ownership_verification_http is not None:
            pulumi.set(__self__, "ownership_verification_http", ownership_verification_http)
        if ssls is not None:
            pulumi.set(__self__, "ssls", ssls)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if wait_for_ssl_pending_validation is not None:
            pulumi.set(__self__, "wait_for_ssl_pending_validation", wait_for_ssl_pending_validation)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter(name="customMetadata")
    def custom_metadata(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        """
        return pulumi.get(self, "custom_metadata")

    @custom_metadata.setter
    def custom_metadata(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "custom_metadata", value)

    @property
    @pulumi.getter(name="customOriginServer")
    def custom_origin_server(self) -> Optional[pulumi.Input[str]]:
        """
        The custom origin server used for certificates.
        """
        return pulumi.get(self, "custom_origin_server")

    @custom_origin_server.setter
    def custom_origin_server(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_origin_server", value)

    @property
    @pulumi.getter(name="customOriginSni")
    def custom_origin_sni(self) -> Optional[pulumi.Input[str]]:
        """
        The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        """
        return pulumi.get(self, "custom_origin_sni")

    @custom_origin_sni.setter
    def custom_origin_sni(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "custom_origin_sni", value)

    @property
    @pulumi.getter
    def hostname(self) -> Optional[pulumi.Input[str]]:
        """
        Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @hostname.setter
    def hostname(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "hostname", value)

    @property
    @pulumi.getter(name="ownershipVerification")
    def ownership_verification(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "ownership_verification")

    @ownership_verification.setter
    def ownership_verification(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "ownership_verification", value)

    @property
    @pulumi.getter(name="ownershipVerificationHttp")
    def ownership_verification_http(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "ownership_verification_http")

    @ownership_verification_http.setter
    def ownership_verification_http(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "ownership_verification_http", value)

    @property
    @pulumi.getter
    def ssls(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]]:
        """
        SSL configuration of the certificate.
        """
        return pulumi.get(self, "ssls")

    @ssls.setter
    def ssls(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['CustomHostnameSslArgs']]]]):
        pulumi.set(self, "ssls", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Status of the certificate.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="waitForSslPendingValidation")
    def wait_for_ssl_pending_validation(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        """
        return pulumi.get(self, "wait_for_ssl_pending_validation")

    @wait_for_ssl_pending_validation.setter
    def wait_for_ssl_pending_validation(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_ssl_pending_validation", value)

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


class CustomHostname(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 custom_origin_server: Optional[pulumi.Input[str]] = None,
                 custom_origin_sni: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ssls: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomHostnameSslArgs']]]]] = None,
                 wait_for_ssl_pending_validation: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare custom hostname (also known as SSL for SaaS) resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomHostname("example",
            hostname="hostname.example.com",
            ssls=[cloudflare.CustomHostnameSslArgs(
                method="txt",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/customHostname:CustomHostname example 1d5fdc9e88c8a8c4518b068cd94331fe/0d89c70d-ad9f-4843-b99f-6cc0252067e9
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] custom_metadata: Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        :param pulumi.Input[str] custom_origin_server: The custom origin server used for certificates.
        :param pulumi.Input[str] custom_origin_sni: The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        :param pulumi.Input[str] hostname: Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomHostnameSslArgs']]]] ssls: SSL configuration of the certificate.
        :param pulumi.Input[bool] wait_for_ssl_pending_validation: Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CustomHostnameArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare custom hostname (also known as SSL for SaaS) resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        example = cloudflare.CustomHostname("example",
            hostname="hostname.example.com",
            ssls=[cloudflare.CustomHostnameSslArgs(
                method="txt",
            )],
            zone_id="0da42c8d2132a9ddaf714f9e7c920711")
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/customHostname:CustomHostname example 1d5fdc9e88c8a8c4518b068cd94331fe/0d89c70d-ad9f-4843-b99f-6cc0252067e9
        ```

        :param str resource_name: The name of the resource.
        :param CustomHostnameArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CustomHostnameArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 custom_metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 custom_origin_server: Optional[pulumi.Input[str]] = None,
                 custom_origin_sni: Optional[pulumi.Input[str]] = None,
                 hostname: Optional[pulumi.Input[str]] = None,
                 ssls: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomHostnameSslArgs']]]]] = None,
                 wait_for_ssl_pending_validation: Optional[pulumi.Input[bool]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CustomHostnameArgs.__new__(CustomHostnameArgs)

            __props__.__dict__["custom_metadata"] = custom_metadata
            __props__.__dict__["custom_origin_server"] = custom_origin_server
            __props__.__dict__["custom_origin_sni"] = custom_origin_sni
            if hostname is None and not opts.urn:
                raise TypeError("Missing required property 'hostname'")
            __props__.__dict__["hostname"] = hostname
            __props__.__dict__["ssls"] = ssls
            __props__.__dict__["wait_for_ssl_pending_validation"] = wait_for_ssl_pending_validation
            if zone_id is None and not opts.urn:
                raise TypeError("Missing required property 'zone_id'")
            __props__.__dict__["zone_id"] = zone_id
            __props__.__dict__["ownership_verification"] = None
            __props__.__dict__["ownership_verification_http"] = None
            __props__.__dict__["status"] = None
        super(CustomHostname, __self__).__init__(
            'cloudflare:index/customHostname:CustomHostname',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            custom_metadata: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            custom_origin_server: Optional[pulumi.Input[str]] = None,
            custom_origin_sni: Optional[pulumi.Input[str]] = None,
            hostname: Optional[pulumi.Input[str]] = None,
            ownership_verification: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            ownership_verification_http: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            ssls: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomHostnameSslArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            wait_for_ssl_pending_validation: Optional[pulumi.Input[bool]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'CustomHostname':
        """
        Get an existing CustomHostname resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] custom_metadata: Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        :param pulumi.Input[str] custom_origin_server: The custom origin server used for certificates.
        :param pulumi.Input[str] custom_origin_sni: The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        :param pulumi.Input[str] hostname: Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['CustomHostnameSslArgs']]]] ssls: SSL configuration of the certificate.
        :param pulumi.Input[str] status: Status of the certificate.
        :param pulumi.Input[bool] wait_for_ssl_pending_validation: Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        :param pulumi.Input[str] zone_id: The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CustomHostnameState.__new__(_CustomHostnameState)

        __props__.__dict__["custom_metadata"] = custom_metadata
        __props__.__dict__["custom_origin_server"] = custom_origin_server
        __props__.__dict__["custom_origin_sni"] = custom_origin_sni
        __props__.__dict__["hostname"] = hostname
        __props__.__dict__["ownership_verification"] = ownership_verification
        __props__.__dict__["ownership_verification_http"] = ownership_verification_http
        __props__.__dict__["ssls"] = ssls
        __props__.__dict__["status"] = status
        __props__.__dict__["wait_for_ssl_pending_validation"] = wait_for_ssl_pending_validation
        __props__.__dict__["zone_id"] = zone_id
        return CustomHostname(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customMetadata")
    def custom_metadata(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Custom metadata associated with custom hostname. Only supports primitive string values, all other values are accessible via the API directly.
        """
        return pulumi.get(self, "custom_metadata")

    @property
    @pulumi.getter(name="customOriginServer")
    def custom_origin_server(self) -> pulumi.Output[Optional[str]]:
        """
        The custom origin server used for certificates.
        """
        return pulumi.get(self, "custom_origin_server")

    @property
    @pulumi.getter(name="customOriginSni")
    def custom_origin_sni(self) -> pulumi.Output[Optional[str]]:
        """
        The [custom origin SNI](https://developers.cloudflare.com/ssl/ssl-for-saas/hostname-specific-behavior/custom-origin) used for certificates.
        """
        return pulumi.get(self, "custom_origin_sni")

    @property
    @pulumi.getter
    def hostname(self) -> pulumi.Output[str]:
        """
        Hostname you intend to request a certificate for. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "hostname")

    @property
    @pulumi.getter(name="ownershipVerification")
    def ownership_verification(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "ownership_verification")

    @property
    @pulumi.getter(name="ownershipVerificationHttp")
    def ownership_verification_http(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "ownership_verification_http")

    @property
    @pulumi.getter
    def ssls(self) -> pulumi.Output[Optional[Sequence['outputs.CustomHostnameSsl']]]:
        """
        SSL configuration of the certificate.
        """
        return pulumi.get(self, "ssls")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Status of the certificate.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="waitForSslPendingValidation")
    def wait_for_ssl_pending_validation(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to wait for a custom hostname SSL sub-object to reach status `pending_validation` during creation. Defaults to `false`.
        """
        return pulumi.get(self, "wait_for_ssl_pending_validation")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The zone identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "zone_id")

