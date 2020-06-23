# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class LogPushOwnershipChallenge(pulumi.CustomResource):
    destination_conf: pulumi.Output[str]
    """
    Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
    """
    ownership_challenge_filename: pulumi.Output[str]
    """
    The filename of the ownership challenge which
    contains the contents required for Logpush Job creation.
    """
    zone_id: pulumi.Output[str]
    """
    The zone ID where the logpush ownership challenge should be created.
    """
    def __init__(__self__, resource_name, opts=None, destination_conf=None, zone_id=None, __props__=None, __name__=None, __opts__=None):
        """
        Provides a resource which manages Cloudflare Logpush ownership challenges to use
        in a Logpush Job. On it's own, doesn't do much however this resource should
        be used in conjunction to create Logpush jobs.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
        :param pulumi.Input[str] zone_id: The zone ID where the logpush ownership challenge should be created.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            if destination_conf is None:
                raise TypeError("Missing required property 'destination_conf'")
            __props__['destination_conf'] = destination_conf
            if zone_id is None:
                raise TypeError("Missing required property 'zone_id'")
            __props__['zone_id'] = zone_id
            __props__['ownership_challenge_filename'] = None
        super(LogPushOwnershipChallenge, __self__).__init__(
            'cloudflare:index/logPushOwnershipChallenge:LogPushOwnershipChallenge',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, destination_conf=None, ownership_challenge_filename=None, zone_id=None):
        """
        Get an existing LogPushOwnershipChallenge resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] destination_conf: Uniquely identifies a resource (such as an s3 bucket) where data will be pushed. Additional configuration parameters supported by the destination may be included. See [Logpush destination documentation](https://developers.cloudflare.com/logs/logpush/logpush-configuration-api/understanding-logpush-api/#destination).
        :param pulumi.Input[str] ownership_challenge_filename: The filename of the ownership challenge which
               contains the contents required for Logpush Job creation.
        :param pulumi.Input[str] zone_id: The zone ID where the logpush ownership challenge should be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["destination_conf"] = destination_conf
        __props__["ownership_challenge_filename"] = ownership_challenge_filename
        __props__["zone_id"] = zone_id
        return LogPushOwnershipChallenge(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

