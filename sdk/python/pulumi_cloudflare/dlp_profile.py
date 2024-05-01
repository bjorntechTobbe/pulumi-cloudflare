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

__all__ = ['DlpProfileArgs', 'DlpProfile']

@pulumi.input_type
class DlpProfileArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 allowed_match_count: pulumi.Input[int],
                 entries: pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]],
                 name: pulumi.Input[str],
                 type: pulumi.Input[str],
                 context_awareness: Optional[pulumi.Input['DlpProfileContextAwarenessArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ocr_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DlpProfile resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] allowed_match_count: Related DLP policies will trigger when the match count exceeds the number set.
        :param pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]] entries: List of entries to apply to the profile.
        :param pulumi.Input[str] name: Name of the profile. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[str] type: The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input['DlpProfileContextAwarenessArgs'] context_awareness: Scan the context of predefined entries to only return matches surrounded by keywords.
        :param pulumi.Input[str] description: Brief summary of the profile and its intended use.
        :param pulumi.Input[bool] ocr_enabled: If true, scan images via OCR to determine if any text present matches filters.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "allowed_match_count", allowed_match_count)
        pulumi.set(__self__, "entries", entries)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "type", type)
        if context_awareness is not None:
            pulumi.set(__self__, "context_awareness", context_awareness)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if ocr_enabled is not None:
            pulumi.set(__self__, "ocr_enabled", ocr_enabled)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="allowedMatchCount")
    def allowed_match_count(self) -> pulumi.Input[int]:
        """
        Related DLP policies will trigger when the match count exceeds the number set.
        """
        return pulumi.get(self, "allowed_match_count")

    @allowed_match_count.setter
    def allowed_match_count(self, value: pulumi.Input[int]):
        pulumi.set(self, "allowed_match_count", value)

    @property
    @pulumi.getter
    def entries(self) -> pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]]:
        """
        List of entries to apply to the profile.
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]]):
        pulumi.set(self, "entries", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        Name of the profile. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="contextAwareness")
    def context_awareness(self) -> Optional[pulumi.Input['DlpProfileContextAwarenessArgs']]:
        """
        Scan the context of predefined entries to only return matches surrounded by keywords.
        """
        return pulumi.get(self, "context_awareness")

    @context_awareness.setter
    def context_awareness(self, value: Optional[pulumi.Input['DlpProfileContextAwarenessArgs']]):
        pulumi.set(self, "context_awareness", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Brief summary of the profile and its intended use.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ocrEnabled")
    def ocr_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, scan images via OCR to determine if any text present matches filters.
        """
        return pulumi.get(self, "ocr_enabled")

    @ocr_enabled.setter
    def ocr_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ocr_enabled", value)


@pulumi.input_type
class _DlpProfileState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allowed_match_count: Optional[pulumi.Input[int]] = None,
                 context_awareness: Optional[pulumi.Input['DlpProfileContextAwarenessArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ocr_enabled: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DlpProfile resources.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] allowed_match_count: Related DLP policies will trigger when the match count exceeds the number set.
        :param pulumi.Input['DlpProfileContextAwarenessArgs'] context_awareness: Scan the context of predefined entries to only return matches surrounded by keywords.
        :param pulumi.Input[str] description: Brief summary of the profile and its intended use.
        :param pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]] entries: List of entries to apply to the profile.
        :param pulumi.Input[str] name: Name of the profile. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ocr_enabled: If true, scan images via OCR to determine if any text present matches filters.
        :param pulumi.Input[str] type: The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if allowed_match_count is not None:
            pulumi.set(__self__, "allowed_match_count", allowed_match_count)
        if context_awareness is not None:
            pulumi.set(__self__, "context_awareness", context_awareness)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if entries is not None:
            pulumi.set(__self__, "entries", entries)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ocr_enabled is not None:
            pulumi.set(__self__, "ocr_enabled", ocr_enabled)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="allowedMatchCount")
    def allowed_match_count(self) -> Optional[pulumi.Input[int]]:
        """
        Related DLP policies will trigger when the match count exceeds the number set.
        """
        return pulumi.get(self, "allowed_match_count")

    @allowed_match_count.setter
    def allowed_match_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "allowed_match_count", value)

    @property
    @pulumi.getter(name="contextAwareness")
    def context_awareness(self) -> Optional[pulumi.Input['DlpProfileContextAwarenessArgs']]:
        """
        Scan the context of predefined entries to only return matches surrounded by keywords.
        """
        return pulumi.get(self, "context_awareness")

    @context_awareness.setter
    def context_awareness(self, value: Optional[pulumi.Input['DlpProfileContextAwarenessArgs']]):
        pulumi.set(self, "context_awareness", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Brief summary of the profile and its intended use.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def entries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]]]:
        """
        List of entries to apply to the profile.
        """
        return pulumi.get(self, "entries")

    @entries.setter
    def entries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DlpProfileEntryArgs']]]]):
        pulumi.set(self, "entries", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the profile. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ocrEnabled")
    def ocr_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        If true, scan images via OCR to determine if any text present matches filters.
        """
        return pulumi.get(self, "ocr_enabled")

    @ocr_enabled.setter
    def ocr_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ocr_enabled", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class DlpProfile(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allowed_match_count: Optional[pulumi.Input[int]] = None,
                 context_awareness: Optional[pulumi.Input[pulumi.InputType['DlpProfileContextAwarenessArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DlpProfileEntryArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ocr_enabled: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
        are a set of entries that can be matched in HTTP bodies or files.
        They are referenced in Zero Trust Gateway rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Predefined profile must be imported, cannot be created
        creds = cloudflare.DlpProfile("creds",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Credentials and Secrets",
            type="predefined",
            allowed_match_count=3,
            entries=[
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    name="Amazon AWS Access Key ID",
                    id="d8fcfc9c-773c-405e-8426-21ecbb67ba93",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=False,
                    id="2c0e33e1-71da-40c8-aad3-32e674ad3d96",
                    name="Amazon AWS Secret Access Key",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    id="4e92c006-3802-4dff-bbe1-8e1513b1c92a",
                    name="Microsoft Azure Client Secret",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=False,
                    id="5c713294-2375-4904-abcf-e4a15be4d592",
                    name="SSH Private Key",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    id="6c6579e4-d832-42d5-905c-8e53340930f2",
                    name="Google GCP API Key",
                ),
            ])
        # Custom profile
        example_custom = cloudflare.DlpProfile("example_custom",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Example Custom Profile",
            description="A profile with example entries",
            type="custom",
            allowed_match_count=0,
            entries=[
                cloudflare.DlpProfileEntryArgs(
                    name="Matches visa credit cards",
                    enabled=True,
                    pattern=cloudflare.DlpProfileEntryPatternArgs(
                        regex="4\\\\d{3}([-\\\\. ])?\\\\d{4}([-\\\\. ])?\\\\d{4}([-\\\\. ])?\\\\d{4}",
                        validation="luhn",
                    ),
                ),
                cloudflare.DlpProfileEntryArgs(
                    name="Matches diners club card",
                    enabled=True,
                    pattern=cloudflare.DlpProfileEntryPatternArgs(
                        regex="(?:0[0-5]|[68][0-9])[0-9]{11}",
                        validation="luhn",
                    ),
                ),
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/dlpProfile:DlpProfile example <account_id>/<dlp_profile_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] allowed_match_count: Related DLP policies will trigger when the match count exceeds the number set.
        :param pulumi.Input[pulumi.InputType['DlpProfileContextAwarenessArgs']] context_awareness: Scan the context of predefined entries to only return matches surrounded by keywords.
        :param pulumi.Input[str] description: Brief summary of the profile and its intended use.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DlpProfileEntryArgs']]]] entries: List of entries to apply to the profile.
        :param pulumi.Input[str] name: Name of the profile. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ocr_enabled: If true, scan images via OCR to determine if any text present matches filters.
        :param pulumi.Input[str] type: The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DlpProfileArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare DLP Profile resource. Data Loss Prevention profiles
        are a set of entries that can be matched in HTTP bodies or files.
        They are referenced in Zero Trust Gateway rules.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_cloudflare as cloudflare

        # Predefined profile must be imported, cannot be created
        creds = cloudflare.DlpProfile("creds",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Credentials and Secrets",
            type="predefined",
            allowed_match_count=3,
            entries=[
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    name="Amazon AWS Access Key ID",
                    id="d8fcfc9c-773c-405e-8426-21ecbb67ba93",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=False,
                    id="2c0e33e1-71da-40c8-aad3-32e674ad3d96",
                    name="Amazon AWS Secret Access Key",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    id="4e92c006-3802-4dff-bbe1-8e1513b1c92a",
                    name="Microsoft Azure Client Secret",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=False,
                    id="5c713294-2375-4904-abcf-e4a15be4d592",
                    name="SSH Private Key",
                ),
                cloudflare.DlpProfileEntryArgs(
                    enabled=True,
                    id="6c6579e4-d832-42d5-905c-8e53340930f2",
                    name="Google GCP API Key",
                ),
            ])
        # Custom profile
        example_custom = cloudflare.DlpProfile("example_custom",
            account_id="f037e56e89293a057740de681ac9abbe",
            name="Example Custom Profile",
            description="A profile with example entries",
            type="custom",
            allowed_match_count=0,
            entries=[
                cloudflare.DlpProfileEntryArgs(
                    name="Matches visa credit cards",
                    enabled=True,
                    pattern=cloudflare.DlpProfileEntryPatternArgs(
                        regex="4\\\\d{3}([-\\\\. ])?\\\\d{4}([-\\\\. ])?\\\\d{4}([-\\\\. ])?\\\\d{4}",
                        validation="luhn",
                    ),
                ),
                cloudflare.DlpProfileEntryArgs(
                    name="Matches diners club card",
                    enabled=True,
                    pattern=cloudflare.DlpProfileEntryPatternArgs(
                        regex="(?:0[0-5]|[68][0-9])[0-9]{11}",
                        validation="luhn",
                    ),
                ),
            ])
        ```

        ## Import

        ```sh
        $ pulumi import cloudflare:index/dlpProfile:DlpProfile example <account_id>/<dlp_profile_id>
        ```

        :param str resource_name: The name of the resource.
        :param DlpProfileArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DlpProfileArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 allowed_match_count: Optional[pulumi.Input[int]] = None,
                 context_awareness: Optional[pulumi.Input[pulumi.InputType['DlpProfileContextAwarenessArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 entries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DlpProfileEntryArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ocr_enabled: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DlpProfileArgs.__new__(DlpProfileArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if allowed_match_count is None and not opts.urn:
                raise TypeError("Missing required property 'allowed_match_count'")
            __props__.__dict__["allowed_match_count"] = allowed_match_count
            __props__.__dict__["context_awareness"] = context_awareness
            __props__.__dict__["description"] = description
            if entries is None and not opts.urn:
                raise TypeError("Missing required property 'entries'")
            __props__.__dict__["entries"] = entries
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["ocr_enabled"] = ocr_enabled
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(DlpProfile, __self__).__init__(
            'cloudflare:index/dlpProfile:DlpProfile',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            allowed_match_count: Optional[pulumi.Input[int]] = None,
            context_awareness: Optional[pulumi.Input[pulumi.InputType['DlpProfileContextAwarenessArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            entries: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DlpProfileEntryArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ocr_enabled: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'DlpProfile':
        """
        Get an existing DlpProfile resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[int] allowed_match_count: Related DLP policies will trigger when the match count exceeds the number set.
        :param pulumi.Input[pulumi.InputType['DlpProfileContextAwarenessArgs']] context_awareness: Scan the context of predefined entries to only return matches surrounded by keywords.
        :param pulumi.Input[str] description: Brief summary of the profile and its intended use.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DlpProfileEntryArgs']]]] entries: List of entries to apply to the profile.
        :param pulumi.Input[str] name: Name of the profile. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] ocr_enabled: If true, scan images via OCR to determine if any text present matches filters.
        :param pulumi.Input[str] type: The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DlpProfileState.__new__(_DlpProfileState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["allowed_match_count"] = allowed_match_count
        __props__.__dict__["context_awareness"] = context_awareness
        __props__.__dict__["description"] = description
        __props__.__dict__["entries"] = entries
        __props__.__dict__["name"] = name
        __props__.__dict__["ocr_enabled"] = ocr_enabled
        __props__.__dict__["type"] = type
        return DlpProfile(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The account identifier to target for the resource. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="allowedMatchCount")
    def allowed_match_count(self) -> pulumi.Output[int]:
        """
        Related DLP policies will trigger when the match count exceeds the number set.
        """
        return pulumi.get(self, "allowed_match_count")

    @property
    @pulumi.getter(name="contextAwareness")
    def context_awareness(self) -> pulumi.Output['outputs.DlpProfileContextAwareness']:
        """
        Scan the context of predefined entries to only return matches surrounded by keywords.
        """
        return pulumi.get(self, "context_awareness")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Brief summary of the profile and its intended use.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def entries(self) -> pulumi.Output[Sequence['outputs.DlpProfileEntry']]:
        """
        List of entries to apply to the profile.
        """
        return pulumi.get(self, "entries")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the profile. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ocrEnabled")
    def ocr_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        If true, scan images via OCR to determine if any text present matches filters.
        """
        return pulumi.get(self, "ocr_enabled")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the profile. Available values: `custom`, `predefined`. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "type")

