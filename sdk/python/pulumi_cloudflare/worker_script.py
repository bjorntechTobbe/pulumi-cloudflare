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

__all__ = ['WorkerScriptArgs', 'WorkerScript']

@pulumi.input_type
class WorkerScriptArgs:
    def __init__(__self__, *,
                 content: pulumi.Input[str],
                 name: pulumi.Input[str],
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]] = None):
        """
        The set of arguments for constructing a WorkerScript resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[str] name: The name for the script. **Modifying this attribute will force creation of a new resource.**
        :param pulumi.Input[bool] module: Whether to upload Worker as a module.
        """
        pulumi.set(__self__, "content", content)
        pulumi.set(__self__, "name", name)
        if analytics_engine_bindings is not None:
            pulumi.set(__self__, "analytics_engine_bindings", analytics_engine_bindings)
        if kv_namespace_bindings is not None:
            pulumi.set(__self__, "kv_namespace_bindings", kv_namespace_bindings)
        if module is not None:
            pulumi.set(__self__, "module", module)
        if plain_text_bindings is not None:
            pulumi.set(__self__, "plain_text_bindings", plain_text_bindings)
        if r2_bucket_bindings is not None:
            pulumi.set(__self__, "r2_bucket_bindings", r2_bucket_bindings)
        if secret_text_bindings is not None:
            pulumi.set(__self__, "secret_text_bindings", secret_text_bindings)
        if service_bindings is not None:
            pulumi.set(__self__, "service_bindings", service_bindings)
        if webassembly_bindings is not None:
            pulumi.set(__self__, "webassembly_bindings", webassembly_bindings)

    @property
    @pulumi.getter
    def content(self) -> pulumi.Input[str]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: pulumi.Input[str]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        """
        The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @analytics_engine_bindings.setter
    def analytics_engine_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]):
        pulumi.set(self, "analytics_engine_bindings", value)

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @kv_namespace_bindings.setter
    def kv_namespace_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]):
        pulumi.set(self, "kv_namespace_bindings", value)

    @property
    @pulumi.getter
    def module(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to upload Worker as a module.
        """
        return pulumi.get(self, "module")

    @module.setter
    def module(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "module", value)

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]:
        return pulumi.get(self, "plain_text_bindings")

    @plain_text_bindings.setter
    def plain_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]):
        pulumi.set(self, "plain_text_bindings", value)

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @r2_bucket_bindings.setter
    def r2_bucket_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]):
        pulumi.set(self, "r2_bucket_bindings", value)

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]:
        return pulumi.get(self, "secret_text_bindings")

    @secret_text_bindings.setter
    def secret_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]):
        pulumi.set(self, "secret_text_bindings", value)

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]:
        return pulumi.get(self, "service_bindings")

    @service_bindings.setter
    def service_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]):
        pulumi.set(self, "service_bindings", value)

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]:
        return pulumi.get(self, "webassembly_bindings")

    @webassembly_bindings.setter
    def webassembly_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]):
        pulumi.set(self, "webassembly_bindings", value)


@pulumi.input_type
class _WorkerScriptState:
    def __init__(__self__, *,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]] = None):
        """
        Input properties used for looking up and filtering WorkerScript resources.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] module: Whether to upload Worker as a module.
        :param pulumi.Input[str] name: The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        if analytics_engine_bindings is not None:
            pulumi.set(__self__, "analytics_engine_bindings", analytics_engine_bindings)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if kv_namespace_bindings is not None:
            pulumi.set(__self__, "kv_namespace_bindings", kv_namespace_bindings)
        if module is not None:
            pulumi.set(__self__, "module", module)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if plain_text_bindings is not None:
            pulumi.set(__self__, "plain_text_bindings", plain_text_bindings)
        if r2_bucket_bindings is not None:
            pulumi.set(__self__, "r2_bucket_bindings", r2_bucket_bindings)
        if secret_text_bindings is not None:
            pulumi.set(__self__, "secret_text_bindings", secret_text_bindings)
        if service_bindings is not None:
            pulumi.set(__self__, "service_bindings", service_bindings)
        if webassembly_bindings is not None:
            pulumi.set(__self__, "webassembly_bindings", webassembly_bindings)

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @analytics_engine_bindings.setter
    def analytics_engine_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptAnalyticsEngineBindingArgs']]]]):
        pulumi.set(self, "analytics_engine_bindings", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @kv_namespace_bindings.setter
    def kv_namespace_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptKvNamespaceBindingArgs']]]]):
        pulumi.set(self, "kv_namespace_bindings", value)

    @property
    @pulumi.getter
    def module(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to upload Worker as a module.
        """
        return pulumi.get(self, "module")

    @module.setter
    def module(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "module", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]:
        return pulumi.get(self, "plain_text_bindings")

    @plain_text_bindings.setter
    def plain_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptPlainTextBindingArgs']]]]):
        pulumi.set(self, "plain_text_bindings", value)

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @r2_bucket_bindings.setter
    def r2_bucket_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptR2BucketBindingArgs']]]]):
        pulumi.set(self, "r2_bucket_bindings", value)

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]:
        return pulumi.get(self, "secret_text_bindings")

    @secret_text_bindings.setter
    def secret_text_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptSecretTextBindingArgs']]]]):
        pulumi.set(self, "secret_text_bindings", value)

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]:
        return pulumi.get(self, "service_bindings")

    @service_bindings.setter
    def service_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptServiceBindingArgs']]]]):
        pulumi.set(self, "service_bindings", value)

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]:
        return pulumi.get(self, "webassembly_bindings")

    @webassembly_bindings.setter
    def webassembly_bindings(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkerScriptWebassemblyBindingArgs']]]]):
        pulumi.set(self, "webassembly_bindings", value)


class WorkerScript(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None,
                 __props__=None):
        """
        Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`.

        > This resource uses the Cloudflare account APIs. This requires setting the
          `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_cloudflare as cloudflare

        my_namespace = cloudflare.WorkersKvNamespace("myNamespace", title="example")
        # Sets the script with the name "script_1"
        my_script = cloudflare.WorkerScript("myScript",
            name="script_1",
            content=(lambda path: open(path).read())("script.js"),
            kv_namespace_bindings=[cloudflare.WorkerScriptKvNamespaceBindingArgs(
                name="MY_EXAMPLE_KV_NAMESPACE",
                namespace_id=my_namespace.id,
            )],
            plain_text_bindings=[cloudflare.WorkerScriptPlainTextBindingArgs(
                name="MY_EXAMPLE_PLAIN_TEXT",
                text="foobar",
            )],
            secret_text_bindings=[cloudflare.WorkerScriptSecretTextBindingArgs(
                name="MY_EXAMPLE_SECRET_TEXT",
                text=var["secret_foo_value"],
            )],
            webassembly_bindings=[cloudflare.WorkerScriptWebassemblyBindingArgs(
                name="MY_EXAMPLE_WASM",
                module=(lambda path: base64.b64encode(open(path).read().encode()).decode())("example.wasm"),
            )],
            service_bindings=[cloudflare.WorkerScriptServiceBindingArgs(
                name="MY_SERVICE_BINDING",
                service="MY_SERVICE",
                environment="production",
            )],
            r2_bucket_bindings=[cloudflare.WorkerScriptR2BucketBindingArgs(
                name="MY_BUCKET",
                bucket_name="MY_BUCKET_NAME",
            )],
            analytics_engine_bindings=[cloudflare.WorkerScriptAnalyticsEngineBindingArgs(
                name="MY_DATASET",
                dataset="dataset1",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerScript:WorkerScript example <script_name>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] module: Whether to upload Worker as a module.
        :param pulumi.Input[str] name: The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WorkerScriptArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Cloudflare worker script resource. In order for a script to be active, you'll also need to setup a `WorkerRoute`.

        > This resource uses the Cloudflare account APIs. This requires setting the
          `CLOUDFLARE_ACCOUNT_ID` environment variable or `account_id` provider argument.

        ## Example Usage

        ```python
        import pulumi
        import base64
        import pulumi_cloudflare as cloudflare

        my_namespace = cloudflare.WorkersKvNamespace("myNamespace", title="example")
        # Sets the script with the name "script_1"
        my_script = cloudflare.WorkerScript("myScript",
            name="script_1",
            content=(lambda path: open(path).read())("script.js"),
            kv_namespace_bindings=[cloudflare.WorkerScriptKvNamespaceBindingArgs(
                name="MY_EXAMPLE_KV_NAMESPACE",
                namespace_id=my_namespace.id,
            )],
            plain_text_bindings=[cloudflare.WorkerScriptPlainTextBindingArgs(
                name="MY_EXAMPLE_PLAIN_TEXT",
                text="foobar",
            )],
            secret_text_bindings=[cloudflare.WorkerScriptSecretTextBindingArgs(
                name="MY_EXAMPLE_SECRET_TEXT",
                text=var["secret_foo_value"],
            )],
            webassembly_bindings=[cloudflare.WorkerScriptWebassemblyBindingArgs(
                name="MY_EXAMPLE_WASM",
                module=(lambda path: base64.b64encode(open(path).read().encode()).decode())("example.wasm"),
            )],
            service_bindings=[cloudflare.WorkerScriptServiceBindingArgs(
                name="MY_SERVICE_BINDING",
                service="MY_SERVICE",
                environment="production",
            )],
            r2_bucket_bindings=[cloudflare.WorkerScriptR2BucketBindingArgs(
                name="MY_BUCKET",
                bucket_name="MY_BUCKET_NAME",
            )],
            analytics_engine_bindings=[cloudflare.WorkerScriptAnalyticsEngineBindingArgs(
                name="MY_DATASET",
                dataset="dataset1",
            )])
        ```

        ## Import

        ```sh
         $ pulumi import cloudflare:index/workerScript:WorkerScript example <script_name>
        ```

        :param str resource_name: The name of the resource.
        :param WorkerScriptArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WorkerScriptArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
                 module: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
                 r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
                 secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
                 service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
                 webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WorkerScriptArgs.__new__(WorkerScriptArgs)

            __props__.__dict__["analytics_engine_bindings"] = analytics_engine_bindings
            if content is None and not opts.urn:
                raise TypeError("Missing required property 'content'")
            __props__.__dict__["content"] = content
            __props__.__dict__["kv_namespace_bindings"] = kv_namespace_bindings
            __props__.__dict__["module"] = module
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["plain_text_bindings"] = plain_text_bindings
            __props__.__dict__["r2_bucket_bindings"] = r2_bucket_bindings
            __props__.__dict__["secret_text_bindings"] = secret_text_bindings
            __props__.__dict__["service_bindings"] = service_bindings
            __props__.__dict__["webassembly_bindings"] = webassembly_bindings
        super(WorkerScript, __self__).__init__(
            'cloudflare:index/workerScript:WorkerScript',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            analytics_engine_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptAnalyticsEngineBindingArgs']]]]] = None,
            content: Optional[pulumi.Input[str]] = None,
            kv_namespace_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptKvNamespaceBindingArgs']]]]] = None,
            module: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            plain_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptPlainTextBindingArgs']]]]] = None,
            r2_bucket_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptR2BucketBindingArgs']]]]] = None,
            secret_text_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptSecretTextBindingArgs']]]]] = None,
            service_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptServiceBindingArgs']]]]] = None,
            webassembly_bindings: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['WorkerScriptWebassemblyBindingArgs']]]]] = None) -> 'WorkerScript':
        """
        Get an existing WorkerScript resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] content: The script content.
        :param pulumi.Input[bool] module: Whether to upload Worker as a module.
        :param pulumi.Input[str] name: The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WorkerScriptState.__new__(_WorkerScriptState)

        __props__.__dict__["analytics_engine_bindings"] = analytics_engine_bindings
        __props__.__dict__["content"] = content
        __props__.__dict__["kv_namespace_bindings"] = kv_namespace_bindings
        __props__.__dict__["module"] = module
        __props__.__dict__["name"] = name
        __props__.__dict__["plain_text_bindings"] = plain_text_bindings
        __props__.__dict__["r2_bucket_bindings"] = r2_bucket_bindings
        __props__.__dict__["secret_text_bindings"] = secret_text_bindings
        __props__.__dict__["service_bindings"] = service_bindings
        __props__.__dict__["webassembly_bindings"] = webassembly_bindings
        return WorkerScript(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="analyticsEngineBindings")
    def analytics_engine_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptAnalyticsEngineBinding']]]:
        return pulumi.get(self, "analytics_engine_bindings")

    @property
    @pulumi.getter
    def content(self) -> pulumi.Output[str]:
        """
        The script content.
        """
        return pulumi.get(self, "content")

    @property
    @pulumi.getter(name="kvNamespaceBindings")
    def kv_namespace_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptKvNamespaceBinding']]]:
        return pulumi.get(self, "kv_namespace_bindings")

    @property
    @pulumi.getter
    def module(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to upload Worker as a module.
        """
        return pulumi.get(self, "module")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name for the script. **Modifying this attribute will force creation of a new resource.**
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="plainTextBindings")
    def plain_text_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptPlainTextBinding']]]:
        return pulumi.get(self, "plain_text_bindings")

    @property
    @pulumi.getter(name="r2BucketBindings")
    def r2_bucket_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptR2BucketBinding']]]:
        return pulumi.get(self, "r2_bucket_bindings")

    @property
    @pulumi.getter(name="secretTextBindings")
    def secret_text_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptSecretTextBinding']]]:
        return pulumi.get(self, "secret_text_bindings")

    @property
    @pulumi.getter(name="serviceBindings")
    def service_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptServiceBinding']]]:
        return pulumi.get(self, "service_bindings")

    @property
    @pulumi.getter(name="webassemblyBindings")
    def webassembly_bindings(self) -> pulumi.Output[Optional[Sequence['outputs.WorkerScriptWebassemblyBinding']]]:
        return pulumi.get(self, "webassembly_bindings")

