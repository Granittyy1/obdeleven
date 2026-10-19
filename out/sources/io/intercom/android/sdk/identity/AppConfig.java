package io.intercom.android.sdk.identity;

import B1.a;
import C4.b;
import androidx.compose.animation.D;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.Space;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import p005a4.q;
import p293xa.d;

/* JADX INFO: compiled from: AppConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AppConfig {
    public static final int $stable = 8;
    private final boolean articleAutoReactionEnabled;
    private final AttachmentSettings attachmentSettings;
    private final ConfigModules configModules;
    private final ConversationStateSyncSettings conversationStateSyncSettings;
    private final Set<String> features;
    private final boolean finDictationUiEnabled;
    private final boolean hasOpenConversations;
    private final String helpCenterLocale;
    private final String helpCenterUrl;
    private final Set<String> helpCenterUrls;
    private final boolean isAccessToTeammateEnabled;
    private final boolean isAudioEnabled;
    private final boolean isBackgroundRequestsEnabled;
    private final boolean isHelpCenterRequireSearchEnabled;
    private final boolean isIdentityVerificationEnabled;
    private final boolean isInboundMessages;
    private final boolean isMetricsEnabled;
    private final boolean isPreventMultipleInboundConversationsEnabled;
    private final boolean isPrimaryColorRenderDarkText;
    private final boolean isReceivedFromServer;
    private final boolean isSecondaryColorRenderDarkText;
    private final String launcherLogoUrl;
    private final String locale;
    private final String name;
    private final long newSessionThresholdMs;
    private final int primaryColor;
    private final int rateLimitCount;
    private final long rateLimitPeriodMs;
    private final NexusConfig realTimeConfig;
    private final int secondaryColor;
    private final int secondaryColorDark;
    private final long softResetTimeoutMs;
    private final String teamGreeting;
    private final long userUpdateCacheMaxAgeMs;

    public AppConfig(String name, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j, long j10, long j11, long j12, boolean z13, boolean z14, String locale, String helpCenterLocale, boolean z15, boolean z16, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, String launcherLogoUrl, String teamGreeting, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, NexusConfig realTimeConfig, AttachmentSettings attachmentSettings, boolean z22, boolean z23, ConversationStateSyncSettings conversationStateSyncSettings) {
        i.e(name, "name");
        i.e(locale, "locale");
        i.e(helpCenterLocale, "helpCenterLocale");
        i.e(helpCenterUrl, "helpCenterUrl");
        i.e(helpCenterUrls, "helpCenterUrls");
        i.e(features, "features");
        i.e(launcherLogoUrl, "launcherLogoUrl");
        i.e(teamGreeting, "teamGreeting");
        i.e(realTimeConfig, "realTimeConfig");
        i.e(attachmentSettings, "attachmentSettings");
        i.e(conversationStateSyncSettings, "conversationStateSyncSettings");
        this.name = name;
        this.primaryColor = i10;
        this.secondaryColor = i11;
        this.secondaryColorDark = i12;
        this.isPrimaryColorRenderDarkText = z10;
        this.isSecondaryColorRenderDarkText = z11;
        this.isInboundMessages = z12;
        this.rateLimitCount = i13;
        this.rateLimitPeriodMs = j;
        this.userUpdateCacheMaxAgeMs = j10;
        this.newSessionThresholdMs = j11;
        this.softResetTimeoutMs = j12;
        this.isMetricsEnabled = z13;
        this.isAudioEnabled = z14;
        this.locale = locale;
        this.helpCenterLocale = helpCenterLocale;
        this.isReceivedFromServer = z15;
        this.isBackgroundRequestsEnabled = z16;
        this.helpCenterUrl = helpCenterUrl;
        this.helpCenterUrls = helpCenterUrls;
        this.features = features;
        this.launcherLogoUrl = launcherLogoUrl;
        this.teamGreeting = teamGreeting;
        this.isIdentityVerificationEnabled = z17;
        this.isAccessToTeammateEnabled = z18;
        this.isHelpCenterRequireSearchEnabled = z19;
        this.isPreventMultipleInboundConversationsEnabled = z20;
        this.hasOpenConversations = z21;
        this.configModules = configModules;
        this.realTimeConfig = realTimeConfig;
        this.attachmentSettings = attachmentSettings;
        this.articleAutoReactionEnabled = z22;
        this.finDictationUiEnabled = z23;
        this.conversationStateSyncSettings = conversationStateSyncSettings;
    }

    public final String component1() {
        return this.name;
    }

    public final long component10() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final long component11() {
        return this.newSessionThresholdMs;
    }

    public final long component12() {
        return this.softResetTimeoutMs;
    }

    public final boolean component13() {
        return this.isMetricsEnabled;
    }

    public final boolean component14() {
        return this.isAudioEnabled;
    }

    public final String component15() {
        return this.locale;
    }

    public final String component16() {
        return this.helpCenterLocale;
    }

    public final boolean component17() {
        return this.isReceivedFromServer;
    }

    public final boolean component18() {
        return this.isBackgroundRequestsEnabled;
    }

    public final String component19() {
        return this.helpCenterUrl;
    }

    public final int component2() {
        return this.primaryColor;
    }

    public final Set<String> component20() {
        return this.helpCenterUrls;
    }

    public final Set<String> component21() {
        return this.features;
    }

    public final String component22() {
        return this.launcherLogoUrl;
    }

    public final String component23() {
        return this.teamGreeting;
    }

    public final boolean component24() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean component25() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean component26() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean component27() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean component28() {
        return this.hasOpenConversations;
    }

    public final ConfigModules component29() {
        return this.configModules;
    }

    public final int component3() {
        return this.secondaryColor;
    }

    public final NexusConfig component30() {
        return this.realTimeConfig;
    }

    public final AttachmentSettings component31() {
        return this.attachmentSettings;
    }

    public final boolean component32() {
        return this.articleAutoReactionEnabled;
    }

    public final boolean component33() {
        return this.finDictationUiEnabled;
    }

    public final ConversationStateSyncSettings component34() {
        return this.conversationStateSyncSettings;
    }

    public final int component4() {
        return this.secondaryColorDark;
    }

    public final boolean component5() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean component6() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean component7() {
        return this.isInboundMessages;
    }

    public final int component8() {
        return this.rateLimitCount;
    }

    public final long component9() {
        return this.rateLimitPeriodMs;
    }

    public final AppConfig copy(String name, int i10, int i11, int i12, boolean z10, boolean z11, boolean z12, int i13, long j, long j10, long j11, long j12, boolean z13, boolean z14, String locale, String helpCenterLocale, boolean z15, boolean z16, String helpCenterUrl, Set<String> helpCenterUrls, Set<String> features, String launcherLogoUrl, String teamGreeting, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, ConfigModules configModules, NexusConfig realTimeConfig, AttachmentSettings attachmentSettings, boolean z22, boolean z23, ConversationStateSyncSettings conversationStateSyncSettings) {
        i.e(name, "name");
        i.e(locale, "locale");
        i.e(helpCenterLocale, "helpCenterLocale");
        i.e(helpCenterUrl, "helpCenterUrl");
        i.e(helpCenterUrls, "helpCenterUrls");
        i.e(features, "features");
        i.e(launcherLogoUrl, "launcherLogoUrl");
        i.e(teamGreeting, "teamGreeting");
        i.e(realTimeConfig, "realTimeConfig");
        i.e(attachmentSettings, "attachmentSettings");
        i.e(conversationStateSyncSettings, "conversationStateSyncSettings");
        return new AppConfig(name, i10, i11, i12, z10, z11, z12, i13, j, j10, j11, j12, z13, z14, locale, helpCenterLocale, z15, z16, helpCenterUrl, helpCenterUrls, features, launcherLogoUrl, teamGreeting, z17, z18, z19, z20, z21, configModules, realTimeConfig, attachmentSettings, z22, z23, conversationStateSyncSettings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) obj;
        return i.a(this.name, appConfig.name) && this.primaryColor == appConfig.primaryColor && this.secondaryColor == appConfig.secondaryColor && this.secondaryColorDark == appConfig.secondaryColorDark && this.isPrimaryColorRenderDarkText == appConfig.isPrimaryColorRenderDarkText && this.isSecondaryColorRenderDarkText == appConfig.isSecondaryColorRenderDarkText && this.isInboundMessages == appConfig.isInboundMessages && this.rateLimitCount == appConfig.rateLimitCount && this.rateLimitPeriodMs == appConfig.rateLimitPeriodMs && this.userUpdateCacheMaxAgeMs == appConfig.userUpdateCacheMaxAgeMs && this.newSessionThresholdMs == appConfig.newSessionThresholdMs && this.softResetTimeoutMs == appConfig.softResetTimeoutMs && this.isMetricsEnabled == appConfig.isMetricsEnabled && this.isAudioEnabled == appConfig.isAudioEnabled && i.a(this.locale, appConfig.locale) && i.a(this.helpCenterLocale, appConfig.helpCenterLocale) && this.isReceivedFromServer == appConfig.isReceivedFromServer && this.isBackgroundRequestsEnabled == appConfig.isBackgroundRequestsEnabled && i.a(this.helpCenterUrl, appConfig.helpCenterUrl) && i.a(this.helpCenterUrls, appConfig.helpCenterUrls) && i.a(this.features, appConfig.features) && i.a(this.launcherLogoUrl, appConfig.launcherLogoUrl) && i.a(this.teamGreeting, appConfig.teamGreeting) && this.isIdentityVerificationEnabled == appConfig.isIdentityVerificationEnabled && this.isAccessToTeammateEnabled == appConfig.isAccessToTeammateEnabled && this.isHelpCenterRequireSearchEnabled == appConfig.isHelpCenterRequireSearchEnabled && this.isPreventMultipleInboundConversationsEnabled == appConfig.isPreventMultipleInboundConversationsEnabled && this.hasOpenConversations == appConfig.hasOpenConversations && i.a(this.configModules, appConfig.configModules) && i.a(this.realTimeConfig, appConfig.realTimeConfig) && i.a(this.attachmentSettings, appConfig.attachmentSettings) && this.articleAutoReactionEnabled == appConfig.articleAutoReactionEnabled && this.finDictationUiEnabled == appConfig.finDictationUiEnabled && i.a(this.conversationStateSyncSettings, appConfig.conversationStateSyncSettings);
    }

    public final boolean getArticleAutoReactionEnabled() {
        return this.articleAutoReactionEnabled;
    }

    public final AttachmentSettings getAttachmentSettings() {
        return this.attachmentSettings;
    }

    public final ConfigModules getConfigModules() {
        return this.configModules;
    }

    public final ConversationStateSyncSettings getConversationStateSyncSettings() {
        return this.conversationStateSyncSettings;
    }

    public final Set<String> getFeatures() {
        return this.features;
    }

    public final boolean getFinDictationUiEnabled() {
        return this.finDictationUiEnabled;
    }

    public final boolean getHasOpenConversations() {
        return this.hasOpenConversations;
    }

    public final String getHelpCenterLocale() {
        return this.helpCenterLocale;
    }

    public final String getHelpCenterUrl() {
        return this.helpCenterUrl;
    }

    public final Set<String> getHelpCenterUrls() {
        return this.helpCenterUrls;
    }

    public final String getLauncherLogoUrl() {
        return this.launcherLogoUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNewSessionThresholdMs() {
        return this.newSessionThresholdMs;
    }

    public final int getPrimaryColor() {
        return this.primaryColor;
    }

    public final int getRateLimitCount() {
        return this.rateLimitCount;
    }

    public final long getRateLimitPeriodMs() {
        return this.rateLimitPeriodMs;
    }

    public final NexusConfig getRealTimeConfig() {
        return this.realTimeConfig;
    }

    public final int getSecondaryColor() {
        return this.secondaryColor;
    }

    public final int getSecondaryColorDark() {
        return this.secondaryColorDark;
    }

    public final long getSoftResetTimeoutMs() {
        return this.softResetTimeoutMs;
    }

    public final String getSpaceLabelIfExists(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        Object next;
        i.e(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (spaces = openConfig.getSpaces()) == null) {
            return null;
        }
        Iterator<T> it = spaces.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Space) next).getType() != space);
        Space space2 = (Space) next;
        if (space2 != null) {
            return space2.getLabel();
        }
        return null;
    }

    public final String getTeamGreeting() {
        return this.teamGreeting;
    }

    public final long getUserUpdateCacheMaxAgeMs() {
        return this.userUpdateCacheMaxAgeMs;
    }

    public final boolean hasFeature(String feature) {
        i.e(feature, "feature");
        return this.features.contains(feature);
    }

    public int hashCode() {
        int iB = D.b(D.b(D.b(D.b(D.b(a.b(this.teamGreeting, a.b(this.launcherLogoUrl, (this.features.hashCode() + ((this.helpCenterUrls.hashCode() + a.b(this.helpCenterUrl, D.b(D.b(a.b(this.helpCenterLocale, a.b(this.locale, D.b(D.b(b.c(this.softResetTimeoutMs, b.c(this.newSessionThresholdMs, b.c(this.userUpdateCacheMaxAgeMs, b.c(this.rateLimitPeriodMs, q.b(this.rateLimitCount, D.b(D.b(D.b(q.b(this.secondaryColorDark, q.b(this.secondaryColor, q.b(this.primaryColor, this.name.hashCode() * 31, 31), 31), 31), 31, this.isPrimaryColorRenderDarkText), 31, this.isSecondaryColorRenderDarkText), 31, this.isInboundMessages), 31), 31), 31), 31), 31), 31, this.isMetricsEnabled), 31, this.isAudioEnabled), 31), 31), 31, this.isReceivedFromServer), 31, this.isBackgroundRequestsEnabled), 31)) * 31)) * 31, 31), 31), 31, this.isIdentityVerificationEnabled), 31, this.isAccessToTeammateEnabled), 31, this.isHelpCenterRequireSearchEnabled), 31, this.isPreventMultipleInboundConversationsEnabled), 31, this.hasOpenConversations);
        ConfigModules configModules = this.configModules;
        return this.conversationStateSyncSettings.hashCode() + D.b(D.b((this.attachmentSettings.hashCode() + ((this.realTimeConfig.hashCode() + ((iB + (configModules == null ? 0 : configModules.hashCode())) * 31)) * 31)) * 31, 31, this.articleAutoReactionEnabled), 31, this.finDictationUiEnabled);
    }

    public final boolean isAccessToTeammateEnabled() {
        return this.isAccessToTeammateEnabled;
    }

    public final boolean isAudioEnabled() {
        return this.isAudioEnabled;
    }

    public final boolean isBackgroundRequestsDisabled() {
        return !this.isBackgroundRequestsEnabled;
    }

    public final boolean isBackgroundRequestsEnabled() {
        return this.isBackgroundRequestsEnabled;
    }

    public final boolean isHelpCenterRequireSearchEnabled() {
        return this.isHelpCenterRequireSearchEnabled;
    }

    public final boolean isIdentityVerificationEnabled() {
        return this.isIdentityVerificationEnabled;
    }

    public final boolean isInboundMessages() {
        return this.isInboundMessages;
    }

    public final boolean isMetricsEnabled() {
        return this.isMetricsEnabled;
    }

    public final boolean isPreventMultipleInboundConversationsEnabled() {
        return this.isPreventMultipleInboundConversationsEnabled;
    }

    public final boolean isPrimaryColorRenderDarkText() {
        return this.isPrimaryColorRenderDarkText;
    }

    public final boolean isReceivedFromServer() {
        return this.isReceivedFromServer;
    }

    public final boolean isSecondaryColorRenderDarkText() {
        return this.isSecondaryColorRenderDarkText;
    }

    public final boolean isSpaceEnabled(Space.Type space) {
        HomeConfig home;
        OpenConfig openConfig;
        List<Space> spaces;
        i.e(space, "space");
        ConfigModules configModules = this.configModules;
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (spaces = openConfig.getSpaces()) == null) {
            return false;
        }
        List<Space> list = spaces;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Space) it.next()).getType() == space) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "AppConfig(name=" + this.name + ", primaryColor=" + this.primaryColor + ", secondaryColor=" + this.secondaryColor + ", secondaryColorDark=" + this.secondaryColorDark + ", isPrimaryColorRenderDarkText=" + this.isPrimaryColorRenderDarkText + ", isSecondaryColorRenderDarkText=" + this.isSecondaryColorRenderDarkText + ", isInboundMessages=" + this.isInboundMessages + ", rateLimitCount=" + this.rateLimitCount + ", rateLimitPeriodMs=" + this.rateLimitPeriodMs + ", userUpdateCacheMaxAgeMs=" + this.userUpdateCacheMaxAgeMs + ", newSessionThresholdMs=" + this.newSessionThresholdMs + ", softResetTimeoutMs=" + this.softResetTimeoutMs + ", isMetricsEnabled=" + this.isMetricsEnabled + ", isAudioEnabled=" + this.isAudioEnabled + ", locale=" + this.locale + ", helpCenterLocale=" + this.helpCenterLocale + ", isReceivedFromServer=" + this.isReceivedFromServer + ", isBackgroundRequestsEnabled=" + this.isBackgroundRequestsEnabled + ", helpCenterUrl=" + this.helpCenterUrl + ", helpCenterUrls=" + this.helpCenterUrls + ", features=" + this.features + ", launcherLogoUrl=" + this.launcherLogoUrl + ", teamGreeting=" + this.teamGreeting + ", isIdentityVerificationEnabled=" + this.isIdentityVerificationEnabled + ", isAccessToTeammateEnabled=" + this.isAccessToTeammateEnabled + ", isHelpCenterRequireSearchEnabled=" + this.isHelpCenterRequireSearchEnabled + ", isPreventMultipleInboundConversationsEnabled=" + this.isPreventMultipleInboundConversationsEnabled + ", hasOpenConversations=" + this.hasOpenConversations + ", configModules=" + this.configModules + ", realTimeConfig=" + this.realTimeConfig + ", attachmentSettings=" + this.attachmentSettings + ", articleAutoReactionEnabled=" + this.articleAutoReactionEnabled + ", finDictationUiEnabled=" + this.finDictationUiEnabled + ", conversationStateSyncSettings=" + this.conversationStateSyncSettings + ')';
    }

    @d
    public static /* synthetic */ void getPrimaryColor$annotations() {
    }
}
