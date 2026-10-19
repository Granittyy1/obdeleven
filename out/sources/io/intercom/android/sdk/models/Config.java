package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import androidx.compose.animation.D;
import io.intercom.android.nexus.NexusConfig;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: Config.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Config {
    public static final long DEFAULT_CACHE_MAX_AGE_SECONDS = 300;
    public static final int DEFAULT_RATE_LIMIT_COUNT = 100;
    public static final long DEFAULT_RATE_LIMIT_PERIOD_SECONDS = 60;
    public static final long DEFAULT_SESSION_TIMEOUT_SECONDS = 20;
    public static final long DEFAULT_SOFT_RESET_TIMEOUT_SECONDS = 1;

    @b("new_session_threshold")
    private final long _newSessionThresholdSeconds;

    @b("local_rate_limit_period")
    private final long _rateLimitPeriodSeconds;

    @b("real_time_config")
    private final NexusConfig.Builder _realTimeConfigBuilder;

    @b("soft_reset_timeout")
    private final long _softResetTimeoutSeconds;

    @b("user_update_dup_cache_max_age")
    private final long _userUpdateCacheMaxAgeSeconds;

    @b("access_to_teammate_enabled")
    private final boolean accessToTeammateEnabled;

    @b("attachment_settings")
    private final AttachmentSettings attachmentSettings;

    @b("conversation_state_sync_settings")
    private final ConversationStateSyncSettings conversationStateSyncSettings;

    @b("features")
    private final Set<String> features;

    @b("has_open_conversations")
    private final boolean hasOpenConversations;

    @b("help_center_locale")
    private final String helpCenterLocale;

    @b("help_center_require_search")
    private final boolean helpCenterRequireSearch;

    @b("help_center_url")
    private final String helpCenterUrl;

    @b("help_center_urls")
    private final Set<String> helpCenterUrls;

    @b("identity_verification_enabled")
    private final boolean identityVerificationEnabled;

    @b("article_auto_reaction_enabled")
    private final boolean isArticleAutoReactionEnabled;

    @b("audio_enabled")
    private final boolean isAudioEnabled;

    @b("background_requests_enabled")
    private final boolean isBackgroundRequestsEnabled;

    @b("fin_dictation_ui_enabled")
    private final boolean isFinDictationUiEnabled;

    @b("is_first_request")
    private final boolean isFirstRequest;

    @b("inbound_messages")
    private final boolean isInboundMessages;

    @b("metrics_enabled")
    private final boolean isMetricsEnabled;

    @b("primary_color_render_dark_text")
    private final boolean isPrimaryColorRenderDarkText;

    @b("secondary_color_render_dark_text")
    private final boolean isSecondaryColorRenderDarkText;

    @b("launcher_logo_url")
    private final String launcherLogoUrl;
    private final String locale;

    @b("modules")
    private final ConfigModules modules;
    private final String name;

    @b("prevent_multiple_inbound_conversations_enabled")
    private final boolean preventMultipleInboundConversationsEnabled;

    @b("base_color")
    private final String primaryColor;

    @b("local_rate_limit")
    private final int rateLimitCount;

    @b("secondary_color")
    private final String secondaryColor;

    @b("team_greeting")
    private final String teamGreeting;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Config NULL = new Config(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, null, null, null, null, false, false, false, false, false, null, null, false, false, null, -1, 1, null);

    /* JADX INFO: compiled from: Config.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Config getNULL() {
            return Config.NULL;
        }

        private Companion() {
        }
    }

    public Config() {
        this(null, null, null, null, null, null, null, false, false, false, false, false, false, false, 0L, 0, 0L, 0L, 0L, null, null, null, null, false, false, false, false, false, null, null, false, false, null, -1, 1, null);
    }

    private final long component15() {
        return this._rateLimitPeriodSeconds;
    }

    private final long component17() {
        return this._userUpdateCacheMaxAgeSeconds;
    }

    private final long component18() {
        return this._softResetTimeoutSeconds;
    }

    private final long component19() {
        return this._newSessionThresholdSeconds;
    }

    private final NexusConfig.Builder component20() {
        return this._realTimeConfigBuilder;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.isAudioEnabled;
    }

    public final boolean component11() {
        return this.isMetricsEnabled;
    }

    public final boolean component12() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean component13() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component14() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final int component16() {
        return this.rateLimitCount;
    }

    public final String component2() {
        return this.primaryColor;
    }

    public final String component21() {
        return this.helpCenterUrl;
    }

    public final Set<String> component22() {
        return this.helpCenterUrls;
    }

    public final Set<String> component23() {
        return this.features;
    }

    public final boolean component24() {
        return this.identityVerificationEnabled;
    }

    public final boolean component25() {
        return this.accessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.helpCenterRequireSearch;
    }

    public final boolean component27() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.modules;
    }

    public final String component3() {
        return this.secondaryColor;
    }

    public final AttachmentSettings component30() {
        return this.attachmentSettings;
    }

    public final boolean component31() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean component32() {
        return this.isFinDictationUiEnabled;
    }

    public final ConversationStateSyncSettings component33() {
        return this.conversationStateSyncSettings;
    }

    public final String component4() {
        return this.locale;
    }

    public final String component5() {
        return this.helpCenterLocale;
    }

    public final String component6() {
        return this.launcherLogoUrl;
    }

    public final String component7() {
        return this.teamGreeting;
    }

    public final boolean component8() {
        return this.isFirstRequest;
    }

    public final boolean component9() {
        return this.isInboundMessages;
    }

    public final Config copy(String name, String str, String str2, String locale, String helpCenterLocale, String launcherLogoUrl, String teamGreeting, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j, int i10, long j10, long j11, long j12, NexusConfig.Builder _realTimeConfigBuilder, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z22, boolean z23, ConversationStateSyncSettings conversationStateSyncSettings) {
        i.e(name, "name");
        i.e(locale, "locale");
        i.e(helpCenterLocale, "helpCenterLocale");
        i.e(launcherLogoUrl, "launcherLogoUrl");
        i.e(teamGreeting, "teamGreeting");
        i.e(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        i.e(helpCenterUrl, "helpCenterUrl");
        i.e(helpCenterUrls, "helpCenterUrls");
        i.e(features, "features");
        i.e(attachmentSettings, "attachmentSettings");
        i.e(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new Config(name, str, str2, locale, helpCenterLocale, launcherLogoUrl, teamGreeting, z10, z11, z12, z13, z14, z15, z16, j, i10, j10, j11, j12, _realTimeConfigBuilder, helpCenterUrl, helpCenterUrls, features, z17, z18, z19, z20, z21, configModules, attachmentSettings, z22, z23, conversationStateSyncSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        return i.a(this.name, config.name) && i.a(this.primaryColor, config.primaryColor) && i.a(this.secondaryColor, config.secondaryColor) && i.a(this.locale, config.locale) && i.a(this.helpCenterLocale, config.helpCenterLocale) && i.a(this.launcherLogoUrl, config.launcherLogoUrl) && i.a(this.teamGreeting, config.teamGreeting) && this.isFirstRequest == config.isFirstRequest && this.isInboundMessages == config.isInboundMessages && this.isAudioEnabled == config.isAudioEnabled && this.isMetricsEnabled == config.isMetricsEnabled && this.isBackgroundRequestsEnabled == config.isBackgroundRequestsEnabled && this.isPrimaryColorRenderDarkText == config.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == config.isSecondaryColorRenderDarkText && this._rateLimitPeriodSeconds == config._rateLimitPeriodSeconds && this.rateLimitCount == config.rateLimitCount && this._userUpdateCacheMaxAgeSeconds == config._userUpdateCacheMaxAgeSeconds && this._softResetTimeoutSeconds == config._softResetTimeoutSeconds && this._newSessionThresholdSeconds == config._newSessionThresholdSeconds && i.a(this._realTimeConfigBuilder, config._realTimeConfigBuilder) && i.a(this.helpCenterUrl, config.helpCenterUrl) && i.a(this.helpCenterUrls, config.helpCenterUrls) && i.a(this.features, config.features) && this.identityVerificationEnabled == config.identityVerificationEnabled && this.accessToTeammateEnabled == config.accessToTeammateEnabled && this.helpCenterRequireSearch == config.helpCenterRequireSearch && this.preventMultipleInboundConversationsEnabled == config.preventMultipleInboundConversationsEnabled && this.hasOpenConversations == config.hasOpenConversations && i.a(this.modules, config.modules) && i.a(this.attachmentSettings, config.attachmentSettings) && this.isArticleAutoReactionEnabled == config.isArticleAutoReactionEnabled && this.isFinDictationUiEnabled == config.isFinDictationUiEnabled && i.a(this.conversationStateSyncSettings, config.conversationStateSyncSettings);
    }

    public final boolean getAccessToTeammateEnabled() {
        return this.accessToTeammateEnabled;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final boolean getHelpCenterRequireSearch() {
        return this.helpCenterRequireSearch;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final boolean getIdentityVerificationEnabled() {
        return this.identityVerificationEnabled;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final ConfigModules getModules() {
        return this.modules;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThreshold() {
        return TimeUnit.SECONDS.toMillis(this._newSessionThresholdSeconds);
    }

    public final boolean getPreventMultipleInboundConversationsEnabled() {
        return this.preventMultipleInboundConversationsEnabled;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriod() {
        return TimeUnit.SECONDS.toMillis(this._rateLimitPeriodSeconds);
    }

    public final NexusConfig getRealTimeConfig() {
        NexusConfig nexusConfigBuild = this._realTimeConfigBuilder.build();
        i.d(nexusConfigBuild, "build(...)");
        return nexusConfigBuild;
    }

    public final String getSecondaryColor() {
        return this.secondaryColor;
    }

    public final long getSoftResetTimeout() {
        return TimeUnit.SECONDS.toMillis(this._softResetTimeoutSeconds);
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAge() {
        return TimeUnit.SECONDS.toMillis(this._userUpdateCacheMaxAgeSeconds);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.primaryColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryColor;
        int iB = D.b(D.b(D.b(D.b(D.b((this.features.hashCode() + ((this.helpCenterUrls.hashCode() + a.b(this.helpCenterUrl, (this._realTimeConfigBuilder.hashCode() + C4.b.c(this._newSessionThresholdSeconds, C4.b.c(this._softResetTimeoutSeconds, C4.b.c(this._userUpdateCacheMaxAgeSeconds, q.b(this.rateLimitCount, C4.b.c(this._rateLimitPeriodSeconds, D.b(D.b(D.b(D.b(D.b(D.b(D.b(a.b(this.teamGreeting, a.b(this.launcherLogoUrl, a.b(this.helpCenterLocale, a.b(this.locale, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31, this.isFirstRequest), 31, this.isInboundMessages), 31, this.isAudioEnabled), 31, this.isMetricsEnabled), 31, this.isBackgroundRequestsEnabled), 31, this.isPrimaryColorRenderDarkText), 31, this.isSecondaryColorRenderDarkText), 31), 31), 31), 31), 31)) * 31, 31)) * 31)) * 31, 31, this.identityVerificationEnabled), 31, this.accessToTeammateEnabled), 31, this.helpCenterRequireSearch), 31, this.preventMultipleInboundConversationsEnabled), 31, this.hasOpenConversations);
        ConfigModules configModules = this.modules;
        return this.conversationStateSyncSettings.hashCode() + D.b(D.b((this.attachmentSettings.hashCode() + ((iB + (configModules != null ? configModules.hashCode() : 0)) * 31)) * 31, 31, this.isArticleAutoReactionEnabled), 31, this.isFinDictationUiEnabled);
    }

    public final boolean isArticleAutoReactionEnabled() {
        return this.isArticleAutoReactionEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isFinDictationUiEnabled() {
        return this.isFinDictationUiEnabled;
    }

    public final boolean isFirstRequest() {
        return this.isFirstRequest;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public String toString() {
        return "Config(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isFirstRequest=" + this.isFirstRequest + ", isInboundMessages=" + this.isInboundMessages + ", isAudioEnabled=" + this.isAudioEnabled + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", _rateLimitPeriodSeconds=" + this._rateLimitPeriodSeconds + ", rateLimitCount=" + this.rateLimitCount + ", _userUpdateCacheMaxAgeSeconds=" + this._userUpdateCacheMaxAgeSeconds + ", _softResetTimeoutSeconds=" + this._softResetTimeoutSeconds + ", _newSessionThresholdSeconds=" + this._newSessionThresholdSeconds + ", _realTimeConfigBuilder=" + this._realTimeConfigBuilder + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", identityVerificationEnabled=" + this.identityVerificationEnabled + ", accessToTeammateEnabled=" + this.accessToTeammateEnabled + ", helpCenterRequireSearch=" + this.helpCenterRequireSearch + ", preventMultipleInboundConversationsEnabled=" + this.preventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", modules=" + this.modules + ", attachmentSettings=" + this.attachmentSettings + ", isArticleAutoReactionEnabled=" + this.isArticleAutoReactionEnabled + ", isFinDictationUiEnabled=" + this.isFinDictationUiEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ')';
    }

    public Config(String name, String str, String str2, String locale, String helpCenterLocale, String launcherLogoUrl, String teamGreeting, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j, int i10, long j10, long j11, long j12, NexusConfig.Builder _realTimeConfigBuilder, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z22, boolean z23, ConversationStateSyncSettings conversationStateSyncSettings) {
        i.e(name, "name");
        i.e(locale, "locale");
        i.e(helpCenterLocale, "helpCenterLocale");
        i.e(launcherLogoUrl, "launcherLogoUrl");
        i.e(teamGreeting, "teamGreeting");
        i.e(_realTimeConfigBuilder, "_realTimeConfigBuilder");
        i.e(helpCenterUrl, "helpCenterUrl");
        i.e(helpCenterUrls, "helpCenterUrls");
        i.e(features, "features");
        i.e(attachmentSettings, "attachmentSettings");
        i.e(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = str;
        this.secondaryColor = str2;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isFirstRequest = z10;
        this.isInboundMessages = z11;
        this.isAudioEnabled = z12;
        this.isMetricsEnabled = z13;
        this.isBackgroundRequestsEnabled = z14;
        this.isPrimaryColorRenderDarkText = z15;
        this.isSecondaryColorRenderDarkText = z16;
        this._rateLimitPeriodSeconds = j;
        this.rateLimitCount = i10;
        this._userUpdateCacheMaxAgeSeconds = j10;
        this._softResetTimeoutSeconds = j11;
        this._newSessionThresholdSeconds = j12;
        this._realTimeConfigBuilder = _realTimeConfigBuilder;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.identityVerificationEnabled = z17;
        this.accessToTeammateEnabled = z18;
        this.helpCenterRequireSearch = z19;
        this.preventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.modules = configModules;
        this.attachmentSettings = attachmentSettings;
        this.isArticleAutoReactionEnabled = z22;
        this.isFinDictationUiEnabled = z23;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
    }

    public Config(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j, int i10, long j10, long j11, long j12, NexusConfig.Builder builder, String str8, Set set, Set set2, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, AttachmentSettings attachmentSettings, boolean z22, boolean z23, ConversationStateSyncSettings conversationStateSyncSettings, int i11, int i12, e eVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7, (i11 & 128) != 0 ? false : z10, (i11 & 256) != 0 ? false : z11, (i11 & 512) != 0 ? true : z12, (i11 & 1024) != 0 ? true : z13, (i11 & 2048) != 0 ? true : z14, (i11 & 4096) != 0 ? false : z15, (i11 & 8192) != 0 ? false : z16, (i11 & 16384) != 0 ? 60L : j, (32768 & i11) != 0 ? 100 : i10, (i11 & 65536) != 0 ? 300L : j10, (i11 & 131072) != 0 ? 1L : j11, (i11 & 262144) != 0 ? 20L : j12, (i11 & 524288) != 0 ? new NexusConfig.Builder() : builder, (i11 & 1048576) != 0 ? "" : str8, (i11 & 2097152) != 0 ? EmptySet.f42985b : set, (i11 & 4194304) != 0 ? EmptySet.f42985b : set2, (i11 & 8388608) != 0 ? false : z17, (i11 & 16777216) != 0 ? true : z18, (i11 & 33554432) != 0 ? false : z19, (i11 & 67108864) != 0 ? false : z20, (i11 & 134217728) != 0 ? false : z21, (i11 & 268435456) != 0 ? null : configModules, (i11 & 536870912) != 0 ? AttachmentSettings.Companion.getDEFAULT() : attachmentSettings, (i11 & 1073741824) != 0 ? true : z22, (i11 & Integer.MIN_VALUE) != 0 ? false : z23, (i12 & 1) != 0 ? ConversationStateSyncSettings.Companion.getDEFAULT() : conversationStateSyncSettings);
    }
}
