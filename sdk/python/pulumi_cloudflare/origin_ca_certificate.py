# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['OriginCaCertificate']


class OriginCaCertificate(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 csr: Optional[pulumi.Input[str]] = None,
                 hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 request_type: Optional[pulumi.Input[str]] = None,
                 requested_validity: Optional[pulumi.Input[int]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Provides a Cloudflare Origin CA certificate used to protect traffic to your origin without involving a third party Certificate Authority.

        **This resource requires you use your Origin CA Key as the `api_user_service_key`, in conjunction with an `api_token` or `email` and `api_key`.**

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare
        import pulumi_tls as tls

        # Create a CSR and generate a CA certificate
        example_private_key = tls.PrivateKey("examplePrivateKey", algorithm="RSA")
        example_cert_request = tls.CertRequest("exampleCertRequest",
            key_algorithm=example_private_key.algorithm,
            private_key_pem=example_private_key.private_key_pem,
            subjects=[tls.CertRequestSubjectArgs(
                common_name="",
                organization="Terraform Test",
            )])
        example_origin_ca_certificate = cloudflare.OriginCaCertificate("exampleOriginCaCertificate",
            csr=example_cert_request.cert_request_pem,
            hostnames=["example.com"],
            request_type="origin-rsa",
            requested_validity=7)
        ```

        ## Import

        Origin CA certificate resource can be imported using an ID, e.g.

        ```sh
         $ pulumi import cloudflare:index/originCaCertificate:OriginCaCertificate example 276266538771611802607153687288146423901027769273
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: An array of hostnames or wildcard names bound to the certificate.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate.
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid.
        """
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

            if csr is None and not opts.urn:
                raise TypeError("Missing required property 'csr'")
            __props__['csr'] = csr
            if hostnames is None and not opts.urn:
                raise TypeError("Missing required property 'hostnames'")
            __props__['hostnames'] = hostnames
            if request_type is None and not opts.urn:
                raise TypeError("Missing required property 'request_type'")
            __props__['request_type'] = request_type
            __props__['requested_validity'] = requested_validity
            __props__['certificate'] = None
            __props__['expires_on'] = None
        super(OriginCaCertificate, __self__).__init__(
            'cloudflare:index/originCaCertificate:OriginCaCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate: Optional[pulumi.Input[str]] = None,
            csr: Optional[pulumi.Input[str]] = None,
            expires_on: Optional[pulumi.Input[str]] = None,
            hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            request_type: Optional[pulumi.Input[str]] = None,
            requested_validity: Optional[pulumi.Input[int]] = None) -> 'OriginCaCertificate':
        """
        Get an existing OriginCaCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate: The Origin CA certificate
        :param pulumi.Input[str] csr: The Certificate Signing Request. Must be newline-encoded.
        :param pulumi.Input[str] expires_on: The datetime when the certificate will expire.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: An array of hostnames or wildcard names bound to the certificate.
        :param pulumi.Input[str] request_type: The signature type desired on the certificate.
        :param pulumi.Input[int] requested_validity: The number of days for which the certificate should be valid.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["certificate"] = certificate
        __props__["csr"] = csr
        __props__["expires_on"] = expires_on
        __props__["hostnames"] = hostnames
        __props__["request_type"] = request_type
        __props__["requested_validity"] = requested_validity
        return OriginCaCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def certificate(self) -> pulumi.Output[str]:
        """
        The Origin CA certificate
        """
        return pulumi.get(self, "certificate")

    @property
    @pulumi.getter
    def csr(self) -> pulumi.Output[str]:
        """
        The Certificate Signing Request. Must be newline-encoded.
        """
        return pulumi.get(self, "csr")

    @property
    @pulumi.getter(name="expiresOn")
    def expires_on(self) -> pulumi.Output[str]:
        """
        The datetime when the certificate will expire.
        """
        return pulumi.get(self, "expires_on")

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Output[Sequence[str]]:
        """
        An array of hostnames or wildcard names bound to the certificate.
        """
        return pulumi.get(self, "hostnames")

    @property
    @pulumi.getter(name="requestType")
    def request_type(self) -> pulumi.Output[str]:
        """
        The signature type desired on the certificate.
        """
        return pulumi.get(self, "request_type")

    @property
    @pulumi.getter(name="requestedValidity")
    def requested_validity(self) -> pulumi.Output[Optional[int]]:
        """
        The number of days for which the certificate should be valid.
        """
        return pulumi.get(self, "requested_validity")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

