// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.cloudflare.outputs;

import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsMinify;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsMobileRedirect;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsNel;
import com.pulumi.cloudflare.outputs.ZoneSettingsOverrideSettingsSecurityHeader;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZoneSettingsOverrideSettings {
    private @Nullable String alwaysOnline;
    private @Nullable String alwaysUseHttps;
    private @Nullable String automaticHttpsRewrites;
    private @Nullable String binaryAst;
    private @Nullable String brotli;
    private @Nullable Integer browserCacheTtl;
    private @Nullable String browserCheck;
    private @Nullable String cacheLevel;
    private @Nullable Integer challengeTtl;
    private @Nullable List<String> ciphers;
    private @Nullable String cnameFlattening;
    private @Nullable String developmentMode;
    private @Nullable String earlyHints;
    private @Nullable String emailObfuscation;
    private @Nullable String filterLogsToCloudflare;
    private @Nullable String fonts;
    private @Nullable String h2Prioritization;
    private @Nullable String hotlinkProtection;
    private @Nullable String http2;
    private @Nullable String http3;
    private @Nullable String imageResizing;
    private @Nullable String ipGeolocation;
    private @Nullable String ipv6;
    private @Nullable String logToCloudflare;
    private @Nullable Integer maxUpload;
    private @Nullable String minTlsVersion;
    private @Nullable ZoneSettingsOverrideSettingsMinify minify;
    private @Nullable String mirage;
    private @Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect;
    private @Nullable ZoneSettingsOverrideSettingsNel nel;
    private @Nullable String opportunisticEncryption;
    private @Nullable String opportunisticOnion;
    private @Nullable String orangeToOrange;
    private @Nullable String originErrorPagePassThru;
    private @Nullable String originMaxHttpVersion;
    private @Nullable String polish;
    private @Nullable String prefetchPreload;
    private @Nullable String privacyPass;
    private @Nullable String proxyReadTimeout;
    private @Nullable String pseudoIpv4;
    private @Nullable String responseBuffering;
    private @Nullable String rocketLoader;
    private @Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader;
    private @Nullable String securityLevel;
    private @Nullable String serverSideExclude;
    private @Nullable String sortQueryStringForCache;
    private @Nullable String ssl;
    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    private @Nullable String tls12Only;
    private @Nullable String tls13;
    private @Nullable String tlsClientAuth;
    private @Nullable String trueClientIpHeader;
    private @Nullable String universalSsl;
    private @Nullable String visitorIp;
    private @Nullable String waf;
    private @Nullable String webp;
    private @Nullable String websockets;
    private @Nullable String zeroRtt;

    private ZoneSettingsOverrideSettings() {}
    public Optional<String> alwaysOnline() {
        return Optional.ofNullable(this.alwaysOnline);
    }
    public Optional<String> alwaysUseHttps() {
        return Optional.ofNullable(this.alwaysUseHttps);
    }
    public Optional<String> automaticHttpsRewrites() {
        return Optional.ofNullable(this.automaticHttpsRewrites);
    }
    public Optional<String> binaryAst() {
        return Optional.ofNullable(this.binaryAst);
    }
    public Optional<String> brotli() {
        return Optional.ofNullable(this.brotli);
    }
    public Optional<Integer> browserCacheTtl() {
        return Optional.ofNullable(this.browserCacheTtl);
    }
    public Optional<String> browserCheck() {
        return Optional.ofNullable(this.browserCheck);
    }
    public Optional<String> cacheLevel() {
        return Optional.ofNullable(this.cacheLevel);
    }
    public Optional<Integer> challengeTtl() {
        return Optional.ofNullable(this.challengeTtl);
    }
    public List<String> ciphers() {
        return this.ciphers == null ? List.of() : this.ciphers;
    }
    public Optional<String> cnameFlattening() {
        return Optional.ofNullable(this.cnameFlattening);
    }
    public Optional<String> developmentMode() {
        return Optional.ofNullable(this.developmentMode);
    }
    public Optional<String> earlyHints() {
        return Optional.ofNullable(this.earlyHints);
    }
    public Optional<String> emailObfuscation() {
        return Optional.ofNullable(this.emailObfuscation);
    }
    public Optional<String> filterLogsToCloudflare() {
        return Optional.ofNullable(this.filterLogsToCloudflare);
    }
    public Optional<String> fonts() {
        return Optional.ofNullable(this.fonts);
    }
    public Optional<String> h2Prioritization() {
        return Optional.ofNullable(this.h2Prioritization);
    }
    public Optional<String> hotlinkProtection() {
        return Optional.ofNullable(this.hotlinkProtection);
    }
    public Optional<String> http2() {
        return Optional.ofNullable(this.http2);
    }
    public Optional<String> http3() {
        return Optional.ofNullable(this.http3);
    }
    public Optional<String> imageResizing() {
        return Optional.ofNullable(this.imageResizing);
    }
    public Optional<String> ipGeolocation() {
        return Optional.ofNullable(this.ipGeolocation);
    }
    public Optional<String> ipv6() {
        return Optional.ofNullable(this.ipv6);
    }
    public Optional<String> logToCloudflare() {
        return Optional.ofNullable(this.logToCloudflare);
    }
    public Optional<Integer> maxUpload() {
        return Optional.ofNullable(this.maxUpload);
    }
    public Optional<String> minTlsVersion() {
        return Optional.ofNullable(this.minTlsVersion);
    }
    public Optional<ZoneSettingsOverrideSettingsMinify> minify() {
        return Optional.ofNullable(this.minify);
    }
    public Optional<String> mirage() {
        return Optional.ofNullable(this.mirage);
    }
    public Optional<ZoneSettingsOverrideSettingsMobileRedirect> mobileRedirect() {
        return Optional.ofNullable(this.mobileRedirect);
    }
    public Optional<ZoneSettingsOverrideSettingsNel> nel() {
        return Optional.ofNullable(this.nel);
    }
    public Optional<String> opportunisticEncryption() {
        return Optional.ofNullable(this.opportunisticEncryption);
    }
    public Optional<String> opportunisticOnion() {
        return Optional.ofNullable(this.opportunisticOnion);
    }
    public Optional<String> orangeToOrange() {
        return Optional.ofNullable(this.orangeToOrange);
    }
    public Optional<String> originErrorPagePassThru() {
        return Optional.ofNullable(this.originErrorPagePassThru);
    }
    public Optional<String> originMaxHttpVersion() {
        return Optional.ofNullable(this.originMaxHttpVersion);
    }
    public Optional<String> polish() {
        return Optional.ofNullable(this.polish);
    }
    public Optional<String> prefetchPreload() {
        return Optional.ofNullable(this.prefetchPreload);
    }
    public Optional<String> privacyPass() {
        return Optional.ofNullable(this.privacyPass);
    }
    public Optional<String> proxyReadTimeout() {
        return Optional.ofNullable(this.proxyReadTimeout);
    }
    public Optional<String> pseudoIpv4() {
        return Optional.ofNullable(this.pseudoIpv4);
    }
    public Optional<String> responseBuffering() {
        return Optional.ofNullable(this.responseBuffering);
    }
    public Optional<String> rocketLoader() {
        return Optional.ofNullable(this.rocketLoader);
    }
    public Optional<ZoneSettingsOverrideSettingsSecurityHeader> securityHeader() {
        return Optional.ofNullable(this.securityHeader);
    }
    public Optional<String> securityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    public Optional<String> serverSideExclude() {
        return Optional.ofNullable(this.serverSideExclude);
    }
    public Optional<String> sortQueryStringForCache() {
        return Optional.ofNullable(this.sortQueryStringForCache);
    }
    public Optional<String> ssl() {
        return Optional.ofNullable(this.ssl);
    }
    /**
     * @deprecated
     * tls_1_2_only has been deprecated in favour of using `min_tls_version = &#34;1.2&#34;` instead.
     * 
     */
    @Deprecated /* tls_1_2_only has been deprecated in favour of using `min_tls_version = ""1.2""` instead. */
    public Optional<String> tls12Only() {
        return Optional.ofNullable(this.tls12Only);
    }
    public Optional<String> tls13() {
        return Optional.ofNullable(this.tls13);
    }
    public Optional<String> tlsClientAuth() {
        return Optional.ofNullable(this.tlsClientAuth);
    }
    public Optional<String> trueClientIpHeader() {
        return Optional.ofNullable(this.trueClientIpHeader);
    }
    public Optional<String> universalSsl() {
        return Optional.ofNullable(this.universalSsl);
    }
    public Optional<String> visitorIp() {
        return Optional.ofNullable(this.visitorIp);
    }
    public Optional<String> waf() {
        return Optional.ofNullable(this.waf);
    }
    public Optional<String> webp() {
        return Optional.ofNullable(this.webp);
    }
    public Optional<String> websockets() {
        return Optional.ofNullable(this.websockets);
    }
    public Optional<String> zeroRtt() {
        return Optional.ofNullable(this.zeroRtt);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneSettingsOverrideSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alwaysOnline;
        private @Nullable String alwaysUseHttps;
        private @Nullable String automaticHttpsRewrites;
        private @Nullable String binaryAst;
        private @Nullable String brotli;
        private @Nullable Integer browserCacheTtl;
        private @Nullable String browserCheck;
        private @Nullable String cacheLevel;
        private @Nullable Integer challengeTtl;
        private @Nullable List<String> ciphers;
        private @Nullable String cnameFlattening;
        private @Nullable String developmentMode;
        private @Nullable String earlyHints;
        private @Nullable String emailObfuscation;
        private @Nullable String filterLogsToCloudflare;
        private @Nullable String fonts;
        private @Nullable String h2Prioritization;
        private @Nullable String hotlinkProtection;
        private @Nullable String http2;
        private @Nullable String http3;
        private @Nullable String imageResizing;
        private @Nullable String ipGeolocation;
        private @Nullable String ipv6;
        private @Nullable String logToCloudflare;
        private @Nullable Integer maxUpload;
        private @Nullable String minTlsVersion;
        private @Nullable ZoneSettingsOverrideSettingsMinify minify;
        private @Nullable String mirage;
        private @Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect;
        private @Nullable ZoneSettingsOverrideSettingsNel nel;
        private @Nullable String opportunisticEncryption;
        private @Nullable String opportunisticOnion;
        private @Nullable String orangeToOrange;
        private @Nullable String originErrorPagePassThru;
        private @Nullable String originMaxHttpVersion;
        private @Nullable String polish;
        private @Nullable String prefetchPreload;
        private @Nullable String privacyPass;
        private @Nullable String proxyReadTimeout;
        private @Nullable String pseudoIpv4;
        private @Nullable String responseBuffering;
        private @Nullable String rocketLoader;
        private @Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader;
        private @Nullable String securityLevel;
        private @Nullable String serverSideExclude;
        private @Nullable String sortQueryStringForCache;
        private @Nullable String ssl;
        private @Nullable String tls12Only;
        private @Nullable String tls13;
        private @Nullable String tlsClientAuth;
        private @Nullable String trueClientIpHeader;
        private @Nullable String universalSsl;
        private @Nullable String visitorIp;
        private @Nullable String waf;
        private @Nullable String webp;
        private @Nullable String websockets;
        private @Nullable String zeroRtt;
        public Builder() {}
        public Builder(ZoneSettingsOverrideSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysOnline = defaults.alwaysOnline;
    	      this.alwaysUseHttps = defaults.alwaysUseHttps;
    	      this.automaticHttpsRewrites = defaults.automaticHttpsRewrites;
    	      this.binaryAst = defaults.binaryAst;
    	      this.brotli = defaults.brotli;
    	      this.browserCacheTtl = defaults.browserCacheTtl;
    	      this.browserCheck = defaults.browserCheck;
    	      this.cacheLevel = defaults.cacheLevel;
    	      this.challengeTtl = defaults.challengeTtl;
    	      this.ciphers = defaults.ciphers;
    	      this.cnameFlattening = defaults.cnameFlattening;
    	      this.developmentMode = defaults.developmentMode;
    	      this.earlyHints = defaults.earlyHints;
    	      this.emailObfuscation = defaults.emailObfuscation;
    	      this.filterLogsToCloudflare = defaults.filterLogsToCloudflare;
    	      this.fonts = defaults.fonts;
    	      this.h2Prioritization = defaults.h2Prioritization;
    	      this.hotlinkProtection = defaults.hotlinkProtection;
    	      this.http2 = defaults.http2;
    	      this.http3 = defaults.http3;
    	      this.imageResizing = defaults.imageResizing;
    	      this.ipGeolocation = defaults.ipGeolocation;
    	      this.ipv6 = defaults.ipv6;
    	      this.logToCloudflare = defaults.logToCloudflare;
    	      this.maxUpload = defaults.maxUpload;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.minify = defaults.minify;
    	      this.mirage = defaults.mirage;
    	      this.mobileRedirect = defaults.mobileRedirect;
    	      this.nel = defaults.nel;
    	      this.opportunisticEncryption = defaults.opportunisticEncryption;
    	      this.opportunisticOnion = defaults.opportunisticOnion;
    	      this.orangeToOrange = defaults.orangeToOrange;
    	      this.originErrorPagePassThru = defaults.originErrorPagePassThru;
    	      this.originMaxHttpVersion = defaults.originMaxHttpVersion;
    	      this.polish = defaults.polish;
    	      this.prefetchPreload = defaults.prefetchPreload;
    	      this.privacyPass = defaults.privacyPass;
    	      this.proxyReadTimeout = defaults.proxyReadTimeout;
    	      this.pseudoIpv4 = defaults.pseudoIpv4;
    	      this.responseBuffering = defaults.responseBuffering;
    	      this.rocketLoader = defaults.rocketLoader;
    	      this.securityHeader = defaults.securityHeader;
    	      this.securityLevel = defaults.securityLevel;
    	      this.serverSideExclude = defaults.serverSideExclude;
    	      this.sortQueryStringForCache = defaults.sortQueryStringForCache;
    	      this.ssl = defaults.ssl;
    	      this.tls12Only = defaults.tls12Only;
    	      this.tls13 = defaults.tls13;
    	      this.tlsClientAuth = defaults.tlsClientAuth;
    	      this.trueClientIpHeader = defaults.trueClientIpHeader;
    	      this.universalSsl = defaults.universalSsl;
    	      this.visitorIp = defaults.visitorIp;
    	      this.waf = defaults.waf;
    	      this.webp = defaults.webp;
    	      this.websockets = defaults.websockets;
    	      this.zeroRtt = defaults.zeroRtt;
        }

        @CustomType.Setter
        public Builder alwaysOnline(@Nullable String alwaysOnline) {

            this.alwaysOnline = alwaysOnline;
            return this;
        }
        @CustomType.Setter
        public Builder alwaysUseHttps(@Nullable String alwaysUseHttps) {

            this.alwaysUseHttps = alwaysUseHttps;
            return this;
        }
        @CustomType.Setter
        public Builder automaticHttpsRewrites(@Nullable String automaticHttpsRewrites) {

            this.automaticHttpsRewrites = automaticHttpsRewrites;
            return this;
        }
        @CustomType.Setter
        public Builder binaryAst(@Nullable String binaryAst) {

            this.binaryAst = binaryAst;
            return this;
        }
        @CustomType.Setter
        public Builder brotli(@Nullable String brotli) {

            this.brotli = brotli;
            return this;
        }
        @CustomType.Setter
        public Builder browserCacheTtl(@Nullable Integer browserCacheTtl) {

            this.browserCacheTtl = browserCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder browserCheck(@Nullable String browserCheck) {

            this.browserCheck = browserCheck;
            return this;
        }
        @CustomType.Setter
        public Builder cacheLevel(@Nullable String cacheLevel) {

            this.cacheLevel = cacheLevel;
            return this;
        }
        @CustomType.Setter
        public Builder challengeTtl(@Nullable Integer challengeTtl) {

            this.challengeTtl = challengeTtl;
            return this;
        }
        @CustomType.Setter
        public Builder ciphers(@Nullable List<String> ciphers) {

            this.ciphers = ciphers;
            return this;
        }
        public Builder ciphers(String... ciphers) {
            return ciphers(List.of(ciphers));
        }
        @CustomType.Setter
        public Builder cnameFlattening(@Nullable String cnameFlattening) {

            this.cnameFlattening = cnameFlattening;
            return this;
        }
        @CustomType.Setter
        public Builder developmentMode(@Nullable String developmentMode) {

            this.developmentMode = developmentMode;
            return this;
        }
        @CustomType.Setter
        public Builder earlyHints(@Nullable String earlyHints) {

            this.earlyHints = earlyHints;
            return this;
        }
        @CustomType.Setter
        public Builder emailObfuscation(@Nullable String emailObfuscation) {

            this.emailObfuscation = emailObfuscation;
            return this;
        }
        @CustomType.Setter
        public Builder filterLogsToCloudflare(@Nullable String filterLogsToCloudflare) {

            this.filterLogsToCloudflare = filterLogsToCloudflare;
            return this;
        }
        @CustomType.Setter
        public Builder fonts(@Nullable String fonts) {

            this.fonts = fonts;
            return this;
        }
        @CustomType.Setter
        public Builder h2Prioritization(@Nullable String h2Prioritization) {

            this.h2Prioritization = h2Prioritization;
            return this;
        }
        @CustomType.Setter
        public Builder hotlinkProtection(@Nullable String hotlinkProtection) {

            this.hotlinkProtection = hotlinkProtection;
            return this;
        }
        @CustomType.Setter
        public Builder http2(@Nullable String http2) {

            this.http2 = http2;
            return this;
        }
        @CustomType.Setter
        public Builder http3(@Nullable String http3) {

            this.http3 = http3;
            return this;
        }
        @CustomType.Setter
        public Builder imageResizing(@Nullable String imageResizing) {

            this.imageResizing = imageResizing;
            return this;
        }
        @CustomType.Setter
        public Builder ipGeolocation(@Nullable String ipGeolocation) {

            this.ipGeolocation = ipGeolocation;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6(@Nullable String ipv6) {

            this.ipv6 = ipv6;
            return this;
        }
        @CustomType.Setter
        public Builder logToCloudflare(@Nullable String logToCloudflare) {

            this.logToCloudflare = logToCloudflare;
            return this;
        }
        @CustomType.Setter
        public Builder maxUpload(@Nullable Integer maxUpload) {

            this.maxUpload = maxUpload;
            return this;
        }
        @CustomType.Setter
        public Builder minTlsVersion(@Nullable String minTlsVersion) {

            this.minTlsVersion = minTlsVersion;
            return this;
        }
        @CustomType.Setter
        public Builder minify(@Nullable ZoneSettingsOverrideSettingsMinify minify) {

            this.minify = minify;
            return this;
        }
        @CustomType.Setter
        public Builder mirage(@Nullable String mirage) {

            this.mirage = mirage;
            return this;
        }
        @CustomType.Setter
        public Builder mobileRedirect(@Nullable ZoneSettingsOverrideSettingsMobileRedirect mobileRedirect) {

            this.mobileRedirect = mobileRedirect;
            return this;
        }
        @CustomType.Setter
        public Builder nel(@Nullable ZoneSettingsOverrideSettingsNel nel) {

            this.nel = nel;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticEncryption(@Nullable String opportunisticEncryption) {

            this.opportunisticEncryption = opportunisticEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder opportunisticOnion(@Nullable String opportunisticOnion) {

            this.opportunisticOnion = opportunisticOnion;
            return this;
        }
        @CustomType.Setter
        public Builder orangeToOrange(@Nullable String orangeToOrange) {

            this.orangeToOrange = orangeToOrange;
            return this;
        }
        @CustomType.Setter
        public Builder originErrorPagePassThru(@Nullable String originErrorPagePassThru) {

            this.originErrorPagePassThru = originErrorPagePassThru;
            return this;
        }
        @CustomType.Setter
        public Builder originMaxHttpVersion(@Nullable String originMaxHttpVersion) {

            this.originMaxHttpVersion = originMaxHttpVersion;
            return this;
        }
        @CustomType.Setter
        public Builder polish(@Nullable String polish) {

            this.polish = polish;
            return this;
        }
        @CustomType.Setter
        public Builder prefetchPreload(@Nullable String prefetchPreload) {

            this.prefetchPreload = prefetchPreload;
            return this;
        }
        @CustomType.Setter
        public Builder privacyPass(@Nullable String privacyPass) {

            this.privacyPass = privacyPass;
            return this;
        }
        @CustomType.Setter
        public Builder proxyReadTimeout(@Nullable String proxyReadTimeout) {

            this.proxyReadTimeout = proxyReadTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder pseudoIpv4(@Nullable String pseudoIpv4) {

            this.pseudoIpv4 = pseudoIpv4;
            return this;
        }
        @CustomType.Setter
        public Builder responseBuffering(@Nullable String responseBuffering) {

            this.responseBuffering = responseBuffering;
            return this;
        }
        @CustomType.Setter
        public Builder rocketLoader(@Nullable String rocketLoader) {

            this.rocketLoader = rocketLoader;
            return this;
        }
        @CustomType.Setter
        public Builder securityHeader(@Nullable ZoneSettingsOverrideSettingsSecurityHeader securityHeader) {

            this.securityHeader = securityHeader;
            return this;
        }
        @CustomType.Setter
        public Builder securityLevel(@Nullable String securityLevel) {

            this.securityLevel = securityLevel;
            return this;
        }
        @CustomType.Setter
        public Builder serverSideExclude(@Nullable String serverSideExclude) {

            this.serverSideExclude = serverSideExclude;
            return this;
        }
        @CustomType.Setter
        public Builder sortQueryStringForCache(@Nullable String sortQueryStringForCache) {

            this.sortQueryStringForCache = sortQueryStringForCache;
            return this;
        }
        @CustomType.Setter
        public Builder ssl(@Nullable String ssl) {

            this.ssl = ssl;
            return this;
        }
        @CustomType.Setter
        public Builder tls12Only(@Nullable String tls12Only) {

            this.tls12Only = tls12Only;
            return this;
        }
        @CustomType.Setter
        public Builder tls13(@Nullable String tls13) {

            this.tls13 = tls13;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientAuth(@Nullable String tlsClientAuth) {

            this.tlsClientAuth = tlsClientAuth;
            return this;
        }
        @CustomType.Setter
        public Builder trueClientIpHeader(@Nullable String trueClientIpHeader) {

            this.trueClientIpHeader = trueClientIpHeader;
            return this;
        }
        @CustomType.Setter
        public Builder universalSsl(@Nullable String universalSsl) {

            this.universalSsl = universalSsl;
            return this;
        }
        @CustomType.Setter
        public Builder visitorIp(@Nullable String visitorIp) {

            this.visitorIp = visitorIp;
            return this;
        }
        @CustomType.Setter
        public Builder waf(@Nullable String waf) {

            this.waf = waf;
            return this;
        }
        @CustomType.Setter
        public Builder webp(@Nullable String webp) {

            this.webp = webp;
            return this;
        }
        @CustomType.Setter
        public Builder websockets(@Nullable String websockets) {

            this.websockets = websockets;
            return this;
        }
        @CustomType.Setter
        public Builder zeroRtt(@Nullable String zeroRtt) {

            this.zeroRtt = zeroRtt;
            return this;
        }
        public ZoneSettingsOverrideSettings build() {
            final var _resultValue = new ZoneSettingsOverrideSettings();
            _resultValue.alwaysOnline = alwaysOnline;
            _resultValue.alwaysUseHttps = alwaysUseHttps;
            _resultValue.automaticHttpsRewrites = automaticHttpsRewrites;
            _resultValue.binaryAst = binaryAst;
            _resultValue.brotli = brotli;
            _resultValue.browserCacheTtl = browserCacheTtl;
            _resultValue.browserCheck = browserCheck;
            _resultValue.cacheLevel = cacheLevel;
            _resultValue.challengeTtl = challengeTtl;
            _resultValue.ciphers = ciphers;
            _resultValue.cnameFlattening = cnameFlattening;
            _resultValue.developmentMode = developmentMode;
            _resultValue.earlyHints = earlyHints;
            _resultValue.emailObfuscation = emailObfuscation;
            _resultValue.filterLogsToCloudflare = filterLogsToCloudflare;
            _resultValue.fonts = fonts;
            _resultValue.h2Prioritization = h2Prioritization;
            _resultValue.hotlinkProtection = hotlinkProtection;
            _resultValue.http2 = http2;
            _resultValue.http3 = http3;
            _resultValue.imageResizing = imageResizing;
            _resultValue.ipGeolocation = ipGeolocation;
            _resultValue.ipv6 = ipv6;
            _resultValue.logToCloudflare = logToCloudflare;
            _resultValue.maxUpload = maxUpload;
            _resultValue.minTlsVersion = minTlsVersion;
            _resultValue.minify = minify;
            _resultValue.mirage = mirage;
            _resultValue.mobileRedirect = mobileRedirect;
            _resultValue.nel = nel;
            _resultValue.opportunisticEncryption = opportunisticEncryption;
            _resultValue.opportunisticOnion = opportunisticOnion;
            _resultValue.orangeToOrange = orangeToOrange;
            _resultValue.originErrorPagePassThru = originErrorPagePassThru;
            _resultValue.originMaxHttpVersion = originMaxHttpVersion;
            _resultValue.polish = polish;
            _resultValue.prefetchPreload = prefetchPreload;
            _resultValue.privacyPass = privacyPass;
            _resultValue.proxyReadTimeout = proxyReadTimeout;
            _resultValue.pseudoIpv4 = pseudoIpv4;
            _resultValue.responseBuffering = responseBuffering;
            _resultValue.rocketLoader = rocketLoader;
            _resultValue.securityHeader = securityHeader;
            _resultValue.securityLevel = securityLevel;
            _resultValue.serverSideExclude = serverSideExclude;
            _resultValue.sortQueryStringForCache = sortQueryStringForCache;
            _resultValue.ssl = ssl;
            _resultValue.tls12Only = tls12Only;
            _resultValue.tls13 = tls13;
            _resultValue.tlsClientAuth = tlsClientAuth;
            _resultValue.trueClientIpHeader = trueClientIpHeader;
            _resultValue.universalSsl = universalSsl;
            _resultValue.visitorIp = visitorIp;
            _resultValue.waf = waf;
            _resultValue.webp = webp;
            _resultValue.websockets = websockets;
            _resultValue.zeroRtt = zeroRtt;
            return _resultValue;
        }
    }
}
