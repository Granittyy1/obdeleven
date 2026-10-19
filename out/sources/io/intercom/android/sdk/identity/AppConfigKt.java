package io.intercom.android.sdk.identity;

import android.content.SharedPreferences;
import com.google.gson.Gson;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: AppConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfigKt {
    private static final String APP_ACCESS_TEAMMATE_ENABLED = "access_to_teammate_enabled";
    private static final String APP_ARTICLE_AUTO_REACTION_ENABLED = "article_auto_reaction_enabled";
    private static final String APP_ATTACHMENT_SETTINGS = "app_attachment_settings";
    private static final String APP_AUDIO_ENABLED = "app_audio_enabled";
    private static final String APP_BACKGROUND_REQUESTS_ENABLED = "app_background_requests_enabled";
    private static final String APP_FEATURES = "features";
    private static final String APP_HAS_OPEN_CONVERSATIONS = "has_open_conversations";
    private static final String APP_HELP_CENTER_LOCALE = "help_center_locale";
    private static final String APP_HELP_CENTER_REQUIRE_SEARCH = "help_center_require_search";
    private static final String APP_HELP_CENTER_URL = "help_center_url";
    private static final String APP_HELP_CENTER_URLS = "help_center_urls";
    private static final String APP_HUB_HEADER_CONFIG = "hub_config";
    private static final String APP_IDENTITY_VERIFICATION_ENABLED = "app_identity_verification_enabled";
    private static final String APP_INBOUND_MESSAGES = "app_inbound_messages";
    private static final String APP_LAUNCHER_LOGO_URL = "app_launcher_logo_url";
    private static final String APP_LOCALE = "app_locale";
    private static final String APP_METRICS_ENABLED = "app_metrics_enabled";
    private static final String APP_NAME = "app_name";
    private static final String APP_NEW_SESSION_THRESHOLD_MS = "new_session_threshold_ms";
    private static final String APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED = "prevent_multiple_inbound_conversations_enabled";
    private static final String APP_PRIMARY_COLOR = "app_primary_color";
    private static final String APP_PRIMARY_COLOR_RENDER_DARK_TEXT = "app_primary_color_render_dark_text";
    private static final String APP_RATE_LIMIT_COUNT = "app_rate_limit_count";
    private static final String APP_RATE_LIMIT_PERIOD_MS = "app_rate_limit_period_ms";
    private static final String APP_RECEIVED_FROM_SERVER = "app_received_from_server";
    private static final String APP_SECONDARY_COLOR = "app_secondary_color";
    private static final String APP_SECONDARY_COLOR_RENDER_DARK_TEXT = "app_secondary_color_render_dark_text";
    private static final String APP_SOFT_RESET_TIMEOUT_MS = "app_soft_reset_timeout_ms";
    private static final String APP_TEAM_GREETING = "app_team_greeting";
    private static final String APP_USER_UPDATE_CACHE_MAX_AGE_MS = "app_user_update_cache_max_age_ms";
    private static final String FIN_DICTATION_UI_ENABLED = "fin_dictation_ui_enabled";

    public static final AppConfig getAppConfig(Config config, int i10) {
        i.e(config, "<this>");
        int configColor = getConfigColor(config.getPrimaryColor(), i10);
        int configColor2 = getConfigColor(config.getSecondaryColor(), i10);
        return new AppConfig(config.getName(), configColor, configColor2, ColorUtils.darkenColor(configColor2), config.isPrimaryColorRenderDarkText(), config.isSecondaryColorRenderDarkText(), config.isInboundMessages(), config.getRateLimitCount(), config.getRateLimitPeriod(), config.getUserUpdateCacheMaxAge(), config.getNewSessionThreshold(), config.getSoftResetTimeout(), config.isMetricsEnabled(), config.isAudioEnabled(), config.getLocale(), config.getHelpCenterLocale(), true, config.isBackgroundRequestsEnabled(), config.getHelpCenterUrl(), config.getHelpCenterUrls(), config.getFeatures(), config.getLauncherLogoUrl(), config.getTeamGreeting(), config.getIdentityVerificationEnabled(), config.getAccessToTeammateEnabled(), config.getHelpCenterRequireSearch(), config.getPreventMultipleInboundConversationsEnabled(), config.getHasOpenConversations(), config.getModules(), config.getRealTimeConfig(), config.getAttachmentSettings(), config.isArticleAutoReactionEnabled(), config.isFinDictationUiEnabled(), config.getConversationStateSyncSettings());
    }

    private static final int getConfigColor(String str, int i10) {
        return str == null ? i10 : ColorUtils.parseColor(str);
    }

    public static final void setAppConfig(SharedPreferences sharedPreferences, AppConfig newAppConfig) {
        i.e(sharedPreferences, "<this>");
        i.e(newAppConfig, "newAppConfig");
        Gson gson = new Gson();
        sharedPreferences.edit().putString(APP_NAME, newAppConfig.getName()).putString(APP_LOCALE, newAppConfig.getLocale()).putString(APP_HELP_CENTER_LOCALE, newAppConfig.getHelpCenterLocale()).putString(APP_LAUNCHER_LOGO_URL, newAppConfig.getLauncherLogoUrl()).putString(APP_TEAM_GREETING, newAppConfig.getTeamGreeting()).putInt(APP_PRIMARY_COLOR, newAppConfig.getPrimaryColor()).putInt(APP_SECONDARY_COLOR, newAppConfig.getSecondaryColor()).putInt(APP_RATE_LIMIT_COUNT, newAppConfig.getRateLimitCount()).putLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, newAppConfig.getUserUpdateCacheMaxAgeMs()).putLong(APP_RATE_LIMIT_PERIOD_MS, newAppConfig.getRateLimitPeriodMs()).putLong(APP_NEW_SESSION_THRESHOLD_MS, newAppConfig.getNewSessionThresholdMs()).putLong(APP_SOFT_RESET_TIMEOUT_MS, newAppConfig.getSoftResetTimeoutMs()).putBoolean(APP_INBOUND_MESSAGES, newAppConfig.isInboundMessages()).putBoolean(APP_AUDIO_ENABLED, newAppConfig.isAudioEnabled()).putBoolean(APP_METRICS_ENABLED, newAppConfig.isMetricsEnabled()).putBoolean(APP_RECEIVED_FROM_SERVER, newAppConfig.isReceivedFromServer()).putBoolean(APP_BACKGROUND_REQUESTS_ENABLED, newAppConfig.isBackgroundRequestsEnabled()).putBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, newAppConfig.isPrimaryColorRenderDarkText()).putBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, newAppConfig.isSecondaryColorRenderDarkText()).putString(APP_HELP_CENTER_URL, newAppConfig.getHelpCenterUrl()).putStringSet(APP_HELP_CENTER_URLS, newAppConfig.getHelpCenterUrls()).putStringSet(APP_FEATURES, newAppConfig.getFeatures()).putBoolean(APP_ACCESS_TEAMMATE_ENABLED, newAppConfig.isAccessToTeammateEnabled()).putBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, newAppConfig.isHelpCenterRequireSearchEnabled()).putBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, newAppConfig.isPreventMultipleInboundConversationsEnabled()).putBoolean(APP_HAS_OPEN_CONVERSATIONS, newAppConfig.getHasOpenConversations()).putString(APP_HUB_HEADER_CONFIG, gson.h(newAppConfig.getConfigModules())).putString(APP_ATTACHMENT_SETTINGS, gson.h(newAppConfig.getAttachmentSettings())).putBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, newAppConfig.getArticleAutoReactionEnabled()).putBoolean(FIN_DICTATION_UI_ENABLED, newAppConfig.getFinDictationUiEnabled()).apply();
    }

    public static final AppConfig getAppConfig(SharedPreferences sharedPreferences, int i10, NexusConfig realTimeConfig) {
        i.e(sharedPreferences, "<this>");
        i.e(realTimeConfig, "realTimeConfig");
        int i11 = sharedPreferences.getInt(APP_PRIMARY_COLOR, i10);
        int i12 = sharedPreferences.getInt(APP_SECONDARY_COLOR, i11);
        Gson gson = new Gson();
        String string = sharedPreferences.getString(APP_NAME, "");
        String str = string == null ? "" : string;
        int iDarkenColor = ColorUtils.darkenColor(i12);
        boolean z10 = sharedPreferences.getBoolean(APP_PRIMARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z11 = sharedPreferences.getBoolean(APP_SECONDARY_COLOR_RENDER_DARK_TEXT, false);
        boolean z12 = sharedPreferences.getBoolean(APP_INBOUND_MESSAGES, false);
        int i13 = sharedPreferences.getInt(APP_RATE_LIMIT_COUNT, 100);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = sharedPreferences.getLong(APP_RATE_LIMIT_PERIOD_MS, timeUnit.toMillis(60L));
        long j10 = sharedPreferences.getLong(APP_USER_UPDATE_CACHE_MAX_AGE_MS, timeUnit.toMillis(300L));
        long j11 = sharedPreferences.getLong(APP_NEW_SESSION_THRESHOLD_MS, timeUnit.toMillis(20L));
        long j12 = sharedPreferences.getLong(APP_SOFT_RESET_TIMEOUT_MS, timeUnit.toMillis(1L));
        boolean z13 = sharedPreferences.getBoolean(APP_METRICS_ENABLED, true);
        boolean z14 = sharedPreferences.getBoolean(APP_AUDIO_ENABLED, true);
        String string2 = sharedPreferences.getString(APP_LOCALE, "");
        String str2 = string2 == null ? "" : string2;
        String string3 = sharedPreferences.getString(APP_HELP_CENTER_LOCALE, "");
        String str3 = string3 == null ? "" : string3;
        boolean z15 = sharedPreferences.getBoolean(APP_RECEIVED_FROM_SERVER, false);
        boolean z16 = sharedPreferences.getBoolean(APP_BACKGROUND_REQUESTS_ENABLED, true);
        String string4 = sharedPreferences.getString(APP_HELP_CENTER_URL, "");
        String str4 = string4 == null ? "" : string4;
        EmptySet emptySet = EmptySet.f42985b;
        Set<String> stringSet = sharedPreferences.getStringSet(APP_HELP_CENTER_URLS, emptySet);
        Set<String> set = stringSet == null ? emptySet : stringSet;
        Set<String> stringSet2 = sharedPreferences.getStringSet(APP_FEATURES, emptySet);
        Set<String> set2 = stringSet2 == null ? emptySet : stringSet2;
        String string5 = sharedPreferences.getString(APP_LAUNCHER_LOGO_URL, "");
        String str5 = string5 == null ? "" : string5;
        String string6 = sharedPreferences.getString(APP_TEAM_GREETING, "");
        String str6 = string6 == null ? "" : string6;
        boolean z17 = sharedPreferences.getBoolean(APP_IDENTITY_VERIFICATION_ENABLED, false);
        boolean z18 = sharedPreferences.getBoolean(APP_ACCESS_TEAMMATE_ENABLED, true);
        boolean z19 = sharedPreferences.getBoolean(APP_HELP_CENTER_REQUIRE_SEARCH, false);
        boolean z20 = sharedPreferences.getBoolean(APP_PREVENT_MULTIPLE_INBOUND_CONVERSATIONS_ENABLED, false);
        boolean z21 = sharedPreferences.getBoolean(APP_HAS_OPEN_CONVERSATIONS, false);
        ConfigModules configModules = (ConfigModules) gson.d(ConfigModules.class, sharedPreferences.getString(APP_HUB_HEADER_CONFIG, null));
        Object objD = gson.d(AttachmentSettings.class, sharedPreferences.getString(APP_ATTACHMENT_SETTINGS, gson.h(AttachmentSettings.Companion.getDEFAULT())));
        i.d(objD, "fromJson(...)");
        return new AppConfig(str, i11, i12, iDarkenColor, z10, z11, z12, i13, j, j10, j11, j12, z13, z14, str2, str3, z15, z16, str4, set, set2, str5, str6, z17, z18, z19, z20, z21, configModules, realTimeConfig, (AttachmentSettings) objD, sharedPreferences.getBoolean(APP_ARTICLE_AUTO_REACTION_ENABLED, true), sharedPreferences.getBoolean(FIN_DICTATION_UI_ENABLED, false), ConversationStateSyncSettings.Companion.getDEFAULT());
    }
}
