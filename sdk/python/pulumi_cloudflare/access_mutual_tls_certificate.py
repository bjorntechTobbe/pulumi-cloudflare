# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = ['AccessMutualTlsCertificateArgs', 'AccessMutualTlsCertificate']

@pulumi.input_type
class AccessMutualTlsCertificateArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[str]] = None,
                 associated_hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AccessMutualTlsCertificate resource.
        :param pulumi.Input[str] name: The name of the certificate.
        :param pulumi.Input[str] account_id: The account to which the certificate should be added. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_hostnames: The hostnames that will be prompted for this certificate.
        :param pulumi.Input[str] certificate: The Root CA for your certificates.
        :param pulumi.Input[str] zone_id: The DNS zone to which the certificate should be added. Conflicts with `account_id`.
        """
        pulumi.set(__self__, "name", name)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if associated_hostnames is not None:
            pulumi.set(__self__, "associated_hostnames", associated_hostnames)
        if certificate is not None:
            pulumi.set(__self__, "certificate", certificate)
        if zone_id is not None:
            pulumi.set(__self__, "zone_id", zone_id)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name of the certificate.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account to which the certificate should be added. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="associatedHostnames")
    def associated_hostnames(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The hostnames that will be prompted for this certificate.
        """
        return pulumi.get(self, "associated_hostnames")

    @associated_hostnames.setter
    def associated_hostnames(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "associated_hostnames", value)

    @property
    @pulumi.getter
    def certificate(self) -> Optional[pulumi.Input[str]]:
        """
        The Root CA for your certificates.
        """
        return pulumi.get(self, "certificate")

    @certificate.setter
    def certificate(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate", value)

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> Optional[pulumi.Input[str]]:
        """
        The DNS zone to which the certificate should be added. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    @zone_id.setter
    def zone_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone_id", value)


class AccessMutualTlsCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 associated_hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 zone_id: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Access Mutual TLS Certificate resource. Mutual TLS authentication ensures that the traffic is secure and trusted in both directions between a client and server and can be used with Access to only allows requests from devices with a corresponding client certificate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_cert = cloudflare.AccessMutualTlsCertificate("myCert",
            zone_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="My Root Cert",
            certificate=var["ca_pem"],
            associated_hostnames=["staging.example.com"])
        ```

        ## Import

        Access Mutual TLS Certificate can be imported using a composite ID composed of the account or zone and the mutual TLS certificate ID in the form of`account/ACCOUNT_ID/MUTUAL_TLS_CERTIFICATE_ID` or `zone/ZONE_ID/MUTUAL_TLS_CERTIFICATE_ID`.

        ```sh
         $ pulumi import cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate staging account/cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account to which the certificate should be added. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_hostnames: The hostnames that will be prompted for this certificate.
        :param pulumi.Input[str] certificate: The Root CA for your certificates.
        :param pulumi.Input[str] name: The name of the certificate.
        :param pulumi.Input[str] zone_id: The DNS zone to which the certificate should be added. Conflicts with `account_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AccessMutualTlsCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare Access Mutual TLS Certificate resource. Mutual TLS authentication ensures that the traffic is secure and trusted in both directions between a client and server and can be used with Access to only allows requests from devices with a corresponding client certificate.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        my_cert = cloudflare.AccessMutualTlsCertificate("myCert",
            zone_id="1d5fdc9e88c8a8c4518b068cd94331fe",
            name="My Root Cert",
            certificate=var["ca_pem"],
            associated_hostnames=["staging.example.com"])
        ```

        ## Import

        Access Mutual TLS Certificate can be imported using a composite ID composed of the account or zone and the mutual TLS certificate ID in the form of`account/ACCOUNT_ID/MUTUAL_TLS_CERTIFICATE_ID` or `zone/ZONE_ID/MUTUAL_TLS_CERTIFICATE_ID`.

        ```sh
         $ pulumi import cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate staging account/cb029e245cfdd66dc8d2e570d5dd3322/d41d8cd98f00b204e9800998ecf8427e
        ```

        :param str resource_name: The name of the resource.
        :param AccessMutualTlsCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AccessMutualTlsCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 associated_hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 certificate: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
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

            __props__['account_id'] = account_id
            __props__['associated_hostnames'] = associated_hostnames
            __props__['certificate'] = certificate
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__['name'] = name
            __props__['zone_id'] = zone_id
            __props__['fingerprint'] = None
        super(AccessMutualTlsCertificate, __self__).__init__(
            'cloudflare:index/accessMutualTlsCertificate:AccessMutualTlsCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            associated_hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            fingerprint: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            zone_id: Optional[pulumi.Input[str]] = None) -> 'AccessMutualTlsCertificate':
        """
        Get an existing AccessMutualTlsCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account to which the certificate should be added. Conflicts with `zone_id`.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] associated_hostnames: The hostnames that will be prompted for this certificate.
        :param pulumi.Input[str] certificate: The Root CA for your certificates.
        :param pulumi.Input[str] name: The name of the certificate.
        :param pulumi.Input[str] zone_id: The DNS zone to which the certificate should be added. Conflicts with `account_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["account_id"] = account_id
        __props__["associated_hostnames"] = associated_hostnames
        __props__["certificate"] = certificate
        __props__["fingerprint"] = fingerprint
        __props__["name"] = name
        __props__["zone_id"] = zone_id
        return AccessMutualTlsCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account to which the certificate should be added. Conflicts with `zone_id`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="associatedHostnames")
    def associated_hostnames(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The hostnames that will be prompted for this certificate.
        """
        return pulumi.get(self, "associated_hostnames")

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[Optional[str]]:
        """
        The Root CA for your certificates.
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def fingerprint(self) -> pulumi.Output[str]:
        return pulumi.get(self, "fingerprint")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the certificate.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="zoneId")
    def zone_id(self) -> pulumi.Output[str]:
        """
        The DNS zone to which the certificate should be added. Conflicts with `account_id`.
        """
        return pulumi.get(self, "zone_id")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

