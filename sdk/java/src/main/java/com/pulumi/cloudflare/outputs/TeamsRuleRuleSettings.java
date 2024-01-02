// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsAuditSsh;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsBisoAdminControls;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsCheckSession;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsEgress;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsL4override;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsNotificationSettings;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsPayloadLog;
import com.pulumi.cloudflare.outputs.TeamsRuleRuleSettingsUntrustedCert;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamsRuleRuleSettings {
    /**
     * @return Add custom headers to allowed requests in the form of key-value pairs.
     * 
     */
    private @Nullable Map<String,String> addHeaders;
    /**
     * @return Allow parent MSP accounts to enable bypass their children&#39;s rules.
     * 
     */
    private @Nullable Boolean allowChildBypass;
    /**
     * @return Settings for auditing SSH usage.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsAuditSsh auditSsh;
    /**
     * @return Configure how browser isolation behaves.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsBisoAdminControls bisoAdminControls;
    /**
     * @return Indicator of block page enablement.
     * 
     */
    private @Nullable Boolean blockPageEnabled;
    /**
     * @return The displayed reason for a user being blocked.
     * 
     */
    private @Nullable String blockPageReason;
    /**
     * @return Allow child MSP accounts to bypass their parent&#39;s rule.
     * 
     */
    private @Nullable Boolean bypassParentRule;
    /**
     * @return Configure how session check behaves.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsCheckSession checkSession;
    /**
     * @return Configure how Proxy traffic egresses. Can be set for rules with Egress action and Egress filter. Can be omitted to indicate local egress via Warp IPs.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsEgress egress;
    /**
     * @return Disable DNSSEC validation (must be Allow rule).
     * 
     */
    private @Nullable Boolean insecureDisableDnssecValidation;
    /**
     * @return Turns on IP category based filter on dns if the rule contains dns category checks.
     * 
     */
    private @Nullable Boolean ipCategories;
    /**
     * @return Settings to forward layer 4 traffic.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsL4override l4override;
    /**
     * @return Notification settings on a block rule.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsNotificationSettings notificationSettings;
    /**
     * @return The host to override matching DNS queries with.
     * 
     */
    private @Nullable String overrideHost;
    /**
     * @return The IPs to override matching DNS queries with.
     * 
     */
    private @Nullable List<String> overrideIps;
    /**
     * @return Configure DLP Payload Logging settings for this rule.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsPayloadLog payloadLog;
    /**
     * @return Configure untrusted certificate settings for this rule.
     * 
     */
    private @Nullable TeamsRuleRuleSettingsUntrustedCert untrustedCert;

    private TeamsRuleRuleSettings() {}
    /**
     * @return Add custom headers to allowed requests in the form of key-value pairs.
     * 
     */
    public Map<String,String> addHeaders() {
        return this.addHeaders == null ? Map.of() : this.addHeaders;
    }
    /**
     * @return Allow parent MSP accounts to enable bypass their children&#39;s rules.
     * 
     */
    public Optional<Boolean> allowChildBypass() {
        return Optional.ofNullable(this.allowChildBypass);
    }
    /**
     * @return Settings for auditing SSH usage.
     * 
     */
    public Optional<TeamsRuleRuleSettingsAuditSsh> auditSsh() {
        return Optional.ofNullable(this.auditSsh);
    }
    /**
     * @return Configure how browser isolation behaves.
     * 
     */
    public Optional<TeamsRuleRuleSettingsBisoAdminControls> bisoAdminControls() {
        return Optional.ofNullable(this.bisoAdminControls);
    }
    /**
     * @return Indicator of block page enablement.
     * 
     */
    public Optional<Boolean> blockPageEnabled() {
        return Optional.ofNullable(this.blockPageEnabled);
    }
    /**
     * @return The displayed reason for a user being blocked.
     * 
     */
    public Optional<String> blockPageReason() {
        return Optional.ofNullable(this.blockPageReason);
    }
    /**
     * @return Allow child MSP accounts to bypass their parent&#39;s rule.
     * 
     */
    public Optional<Boolean> bypassParentRule() {
        return Optional.ofNullable(this.bypassParentRule);
    }
    /**
     * @return Configure how session check behaves.
     * 
     */
    public Optional<TeamsRuleRuleSettingsCheckSession> checkSession() {
        return Optional.ofNullable(this.checkSession);
    }
    /**
     * @return Configure how Proxy traffic egresses. Can be set for rules with Egress action and Egress filter. Can be omitted to indicate local egress via Warp IPs.
     * 
     */
    public Optional<TeamsRuleRuleSettingsEgress> egress() {
        return Optional.ofNullable(this.egress);
    }
    /**
     * @return Disable DNSSEC validation (must be Allow rule).
     * 
     */
    public Optional<Boolean> insecureDisableDnssecValidation() {
        return Optional.ofNullable(this.insecureDisableDnssecValidation);
    }
    /**
     * @return Turns on IP category based filter on dns if the rule contains dns category checks.
     * 
     */
    public Optional<Boolean> ipCategories() {
        return Optional.ofNullable(this.ipCategories);
    }
    /**
     * @return Settings to forward layer 4 traffic.
     * 
     */
    public Optional<TeamsRuleRuleSettingsL4override> l4override() {
        return Optional.ofNullable(this.l4override);
    }
    /**
     * @return Notification settings on a block rule.
     * 
     */
    public Optional<TeamsRuleRuleSettingsNotificationSettings> notificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    /**
     * @return The host to override matching DNS queries with.
     * 
     */
    public Optional<String> overrideHost() {
        return Optional.ofNullable(this.overrideHost);
    }
    /**
     * @return The IPs to override matching DNS queries with.
     * 
     */
    public List<String> overrideIps() {
        return this.overrideIps == null ? List.of() : this.overrideIps;
    }
    /**
     * @return Configure DLP Payload Logging settings for this rule.
     * 
     */
    public Optional<TeamsRuleRuleSettingsPayloadLog> payloadLog() {
        return Optional.ofNullable(this.payloadLog);
    }
    /**
     * @return Configure untrusted certificate settings for this rule.
     * 
     */
    public Optional<TeamsRuleRuleSettingsUntrustedCert> untrustedCert() {
        return Optional.ofNullable(this.untrustedCert);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamsRuleRuleSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> addHeaders;
        private @Nullable Boolean allowChildBypass;
        private @Nullable TeamsRuleRuleSettingsAuditSsh auditSsh;
        private @Nullable TeamsRuleRuleSettingsBisoAdminControls bisoAdminControls;
        private @Nullable Boolean blockPageEnabled;
        private @Nullable String blockPageReason;
        private @Nullable Boolean bypassParentRule;
        private @Nullable TeamsRuleRuleSettingsCheckSession checkSession;
        private @Nullable TeamsRuleRuleSettingsEgress egress;
        private @Nullable Boolean insecureDisableDnssecValidation;
        private @Nullable Boolean ipCategories;
        private @Nullable TeamsRuleRuleSettingsL4override l4override;
        private @Nullable TeamsRuleRuleSettingsNotificationSettings notificationSettings;
        private @Nullable String overrideHost;
        private @Nullable List<String> overrideIps;
        private @Nullable TeamsRuleRuleSettingsPayloadLog payloadLog;
        private @Nullable TeamsRuleRuleSettingsUntrustedCert untrustedCert;
        public Builder() {}
        public Builder(TeamsRuleRuleSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addHeaders = defaults.addHeaders;
    	      this.allowChildBypass = defaults.allowChildBypass;
    	      this.auditSsh = defaults.auditSsh;
    	      this.bisoAdminControls = defaults.bisoAdminControls;
    	      this.blockPageEnabled = defaults.blockPageEnabled;
    	      this.blockPageReason = defaults.blockPageReason;
    	      this.bypassParentRule = defaults.bypassParentRule;
    	      this.checkSession = defaults.checkSession;
    	      this.egress = defaults.egress;
    	      this.insecureDisableDnssecValidation = defaults.insecureDisableDnssecValidation;
    	      this.ipCategories = defaults.ipCategories;
    	      this.l4override = defaults.l4override;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.overrideHost = defaults.overrideHost;
    	      this.overrideIps = defaults.overrideIps;
    	      this.payloadLog = defaults.payloadLog;
    	      this.untrustedCert = defaults.untrustedCert;
        }

        @CustomType.Setter
        public Builder addHeaders(@Nullable Map<String,String> addHeaders) {

            this.addHeaders = addHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder allowChildBypass(@Nullable Boolean allowChildBypass) {

            this.allowChildBypass = allowChildBypass;
            return this;
        }
        @CustomType.Setter
        public Builder auditSsh(@Nullable TeamsRuleRuleSettingsAuditSsh auditSsh) {

            this.auditSsh = auditSsh;
            return this;
        }
        @CustomType.Setter
        public Builder bisoAdminControls(@Nullable TeamsRuleRuleSettingsBisoAdminControls bisoAdminControls) {

            this.bisoAdminControls = bisoAdminControls;
            return this;
        }
        @CustomType.Setter
        public Builder blockPageEnabled(@Nullable Boolean blockPageEnabled) {

            this.blockPageEnabled = blockPageEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder blockPageReason(@Nullable String blockPageReason) {

            this.blockPageReason = blockPageReason;
            return this;
        }
        @CustomType.Setter
        public Builder bypassParentRule(@Nullable Boolean bypassParentRule) {

            this.bypassParentRule = bypassParentRule;
            return this;
        }
        @CustomType.Setter
        public Builder checkSession(@Nullable TeamsRuleRuleSettingsCheckSession checkSession) {

            this.checkSession = checkSession;
            return this;
        }
        @CustomType.Setter
        public Builder egress(@Nullable TeamsRuleRuleSettingsEgress egress) {

            this.egress = egress;
            return this;
        }
        @CustomType.Setter
        public Builder insecureDisableDnssecValidation(@Nullable Boolean insecureDisableDnssecValidation) {

            this.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
            return this;
        }
        @CustomType.Setter
        public Builder ipCategories(@Nullable Boolean ipCategories) {

            this.ipCategories = ipCategories;
            return this;
        }
        @CustomType.Setter
        public Builder l4override(@Nullable TeamsRuleRuleSettingsL4override l4override) {

            this.l4override = l4override;
            return this;
        }
        @CustomType.Setter
        public Builder notificationSettings(@Nullable TeamsRuleRuleSettingsNotificationSettings notificationSettings) {

            this.notificationSettings = notificationSettings;
            return this;
        }
        @CustomType.Setter
        public Builder overrideHost(@Nullable String overrideHost) {

            this.overrideHost = overrideHost;
            return this;
        }
        @CustomType.Setter
        public Builder overrideIps(@Nullable List<String> overrideIps) {

            this.overrideIps = overrideIps;
            return this;
        }
        public Builder overrideIps(String... overrideIps) {
            return overrideIps(List.of(overrideIps));
        }
        @CustomType.Setter
        public Builder payloadLog(@Nullable TeamsRuleRuleSettingsPayloadLog payloadLog) {

            this.payloadLog = payloadLog;
            return this;
        }
        @CustomType.Setter
        public Builder untrustedCert(@Nullable TeamsRuleRuleSettingsUntrustedCert untrustedCert) {

            this.untrustedCert = untrustedCert;
            return this;
        }
        public TeamsRuleRuleSettings build() {
            final var _resultValue = new TeamsRuleRuleSettings();
            _resultValue.addHeaders = addHeaders;
            _resultValue.allowChildBypass = allowChildBypass;
            _resultValue.auditSsh = auditSsh;
            _resultValue.bisoAdminControls = bisoAdminControls;
            _resultValue.blockPageEnabled = blockPageEnabled;
            _resultValue.blockPageReason = blockPageReason;
            _resultValue.bypassParentRule = bypassParentRule;
            _resultValue.checkSession = checkSession;
            _resultValue.egress = egress;
            _resultValue.insecureDisableDnssecValidation = insecureDisableDnssecValidation;
            _resultValue.ipCategories = ipCategories;
            _resultValue.l4override = l4override;
            _resultValue.notificationSettings = notificationSettings;
            _resultValue.overrideHost = overrideHost;
            _resultValue.overrideIps = overrideIps;
            _resultValue.payloadLog = payloadLog;
            _resultValue.untrustedCert = untrustedCert;
            return _resultValue;
        }
    }
}
