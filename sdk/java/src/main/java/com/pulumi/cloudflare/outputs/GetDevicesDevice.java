// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDevicesDevice {
    /**
     * @return When the device was created.
     * 
     */
    private @Nullable String created;
    /**
     * @return Whether the device has been deleted.
     * 
     */
    private @Nullable Boolean deleted;
    /**
     * @return The type of the device.
     * 
     */
    private @Nullable String deviceType;
    /**
     * @return Device ID.
     * 
     */
    private @Nullable String id;
    /**
     * @return IPv4 or IPv6 address.
     * 
     */
    private @Nullable String ip;
    /**
     * @return The device&#39;s public key.
     * 
     */
    private @Nullable String key;
    /**
     * @return When the device was last seen.
     * 
     */
    private @Nullable String lastSeen;
    /**
     * @return The device&#39;s MAC address.
     * 
     */
    private @Nullable String macAddress;
    /**
     * @return The device manufacturer&#39;s name.
     * 
     */
    private @Nullable String manufacturer;
    /**
     * @return The device model name.
     * 
     */
    private @Nullable String model;
    /**
     * @return The device name.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Linux distribution name.
     * 
     */
    private @Nullable String osDistroName;
    /**
     * @return The Linux distribution revision.
     * 
     */
    private @Nullable String osDistroRevision;
    /**
     * @return The operating system version.
     * 
     */
    private @Nullable String osVersion;
    /**
     * @return When the device was revoked.
     * 
     */
    private @Nullable String revokedAt;
    /**
     * @return The device&#39;s serial number.
     * 
     */
    private @Nullable String serialNumber;
    /**
     * @return When the device was updated.
     * 
     */
    private @Nullable String updated;
    /**
     * @return User&#39;s email.
     * 
     */
    private @Nullable String userEmail;
    /**
     * @return User&#39;s ID.
     * 
     */
    private @Nullable String userId;
    /**
     * @return User&#39;s Name.
     * 
     */
    private @Nullable String userName;
    /**
     * @return The WARP client version.
     * 
     */
    private @Nullable String version;

    private GetDevicesDevice() {}
    /**
     * @return When the device was created.
     * 
     */
    public Optional<String> created() {
        return Optional.ofNullable(this.created);
    }
    /**
     * @return Whether the device has been deleted.
     * 
     */
    public Optional<Boolean> deleted() {
        return Optional.ofNullable(this.deleted);
    }
    /**
     * @return The type of the device.
     * 
     */
    public Optional<String> deviceType() {
        return Optional.ofNullable(this.deviceType);
    }
    /**
     * @return Device ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return IPv4 or IPv6 address.
     * 
     */
    public Optional<String> ip() {
        return Optional.ofNullable(this.ip);
    }
    /**
     * @return The device&#39;s public key.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return When the device was last seen.
     * 
     */
    public Optional<String> lastSeen() {
        return Optional.ofNullable(this.lastSeen);
    }
    /**
     * @return The device&#39;s MAC address.
     * 
     */
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * @return The device manufacturer&#39;s name.
     * 
     */
    public Optional<String> manufacturer() {
        return Optional.ofNullable(this.manufacturer);
    }
    /**
     * @return The device model name.
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * @return The device name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Linux distribution name.
     * 
     */
    public Optional<String> osDistroName() {
        return Optional.ofNullable(this.osDistroName);
    }
    /**
     * @return The Linux distribution revision.
     * 
     */
    public Optional<String> osDistroRevision() {
        return Optional.ofNullable(this.osDistroRevision);
    }
    /**
     * @return The operating system version.
     * 
     */
    public Optional<String> osVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * @return When the device was revoked.
     * 
     */
    public Optional<String> revokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }
    /**
     * @return The device&#39;s serial number.
     * 
     */
    public Optional<String> serialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    /**
     * @return When the device was updated.
     * 
     */
    public Optional<String> updated() {
        return Optional.ofNullable(this.updated);
    }
    /**
     * @return User&#39;s email.
     * 
     */
    public Optional<String> userEmail() {
        return Optional.ofNullable(this.userEmail);
    }
    /**
     * @return User&#39;s ID.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }
    /**
     * @return User&#39;s Name.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }
    /**
     * @return The WARP client version.
     * 
     */
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String created;
        private @Nullable Boolean deleted;
        private @Nullable String deviceType;
        private @Nullable String id;
        private @Nullable String ip;
        private @Nullable String key;
        private @Nullable String lastSeen;
        private @Nullable String macAddress;
        private @Nullable String manufacturer;
        private @Nullable String model;
        private @Nullable String name;
        private @Nullable String osDistroName;
        private @Nullable String osDistroRevision;
        private @Nullable String osVersion;
        private @Nullable String revokedAt;
        private @Nullable String serialNumber;
        private @Nullable String updated;
        private @Nullable String userEmail;
        private @Nullable String userId;
        private @Nullable String userName;
        private @Nullable String version;
        public Builder() {}
        public Builder(GetDevicesDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.deleted = defaults.deleted;
    	      this.deviceType = defaults.deviceType;
    	      this.id = defaults.id;
    	      this.ip = defaults.ip;
    	      this.key = defaults.key;
    	      this.lastSeen = defaults.lastSeen;
    	      this.macAddress = defaults.macAddress;
    	      this.manufacturer = defaults.manufacturer;
    	      this.model = defaults.model;
    	      this.name = defaults.name;
    	      this.osDistroName = defaults.osDistroName;
    	      this.osDistroRevision = defaults.osDistroRevision;
    	      this.osVersion = defaults.osVersion;
    	      this.revokedAt = defaults.revokedAt;
    	      this.serialNumber = defaults.serialNumber;
    	      this.updated = defaults.updated;
    	      this.userEmail = defaults.userEmail;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder created(@Nullable String created) {

            this.created = created;
            return this;
        }
        @CustomType.Setter
        public Builder deleted(@Nullable Boolean deleted) {

            this.deleted = deleted;
            return this;
        }
        @CustomType.Setter
        public Builder deviceType(@Nullable String deviceType) {

            this.deviceType = deviceType;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable String ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder lastSeen(@Nullable String lastSeen) {

            this.lastSeen = lastSeen;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {

            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder manufacturer(@Nullable String manufacturer) {

            this.manufacturer = manufacturer;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {

            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroName(@Nullable String osDistroName) {

            this.osDistroName = osDistroName;
            return this;
        }
        @CustomType.Setter
        public Builder osDistroRevision(@Nullable String osDistroRevision) {

            this.osDistroRevision = osDistroRevision;
            return this;
        }
        @CustomType.Setter
        public Builder osVersion(@Nullable String osVersion) {

            this.osVersion = osVersion;
            return this;
        }
        @CustomType.Setter
        public Builder revokedAt(@Nullable String revokedAt) {

            this.revokedAt = revokedAt;
            return this;
        }
        @CustomType.Setter
        public Builder serialNumber(@Nullable String serialNumber) {

            this.serialNumber = serialNumber;
            return this;
        }
        @CustomType.Setter
        public Builder updated(@Nullable String updated) {

            this.updated = updated;
            return this;
        }
        @CustomType.Setter
        public Builder userEmail(@Nullable String userEmail) {

            this.userEmail = userEmail;
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {

            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(@Nullable String userName) {

            this.userName = userName;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {

            this.version = version;
            return this;
        }
        public GetDevicesDevice build() {
            final var _resultValue = new GetDevicesDevice();
            _resultValue.created = created;
            _resultValue.deleted = deleted;
            _resultValue.deviceType = deviceType;
            _resultValue.id = id;
            _resultValue.ip = ip;
            _resultValue.key = key;
            _resultValue.lastSeen = lastSeen;
            _resultValue.macAddress = macAddress;
            _resultValue.manufacturer = manufacturer;
            _resultValue.model = model;
            _resultValue.name = name;
            _resultValue.osDistroName = osDistroName;
            _resultValue.osDistroRevision = osDistroRevision;
            _resultValue.osVersion = osVersion;
            _resultValue.revokedAt = revokedAt;
            _resultValue.serialNumber = serialNumber;
            _resultValue.updated = updated;
            _resultValue.userEmail = userEmail;
            _resultValue.userId = userId;
            _resultValue.userName = userName;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
