package com.braze.configuration;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isLocationCollectionEnabled;
    public final Boolean isNewsFeedVisualIndicatorOn;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final Boolean shouldOptInWhenPushAuthorized;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    public /* synthetic */ BrazeConfig(Builder builder, e eVar) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey$android_sdk_base_release();
        this.serverTarget = builder.getServerTarget$android_sdk_base_release();
        this.smallNotificationIcon = builder.getSmallNotificationIconName$android_sdk_base_release();
        this.largeNotificationIcon = builder.getLargeNotificationIconName$android_sdk_base_release();
        this.customEndpoint = builder.getCustomEndpoint$android_sdk_base_release();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName$android_sdk_base_release();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription$android_sdk_base_release();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName$android_sdk_base_release();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName$android_sdk_base_release();
        this.sdkFlavor = builder.getSdkFlavor$android_sdk_base_release();
        this.sessionTimeout = builder.getSessionTimeout$android_sdk_base_release();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor$android_sdk_base_release();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release();
        this.badNetworkInterval = builder.getBadNetworkInterval$android_sdk_base_release();
        this.goodNetworkInterval = builder.getGoodNetworkInterval$android_sdk_base_release();
        this.greatNetworkInterval = builder.getGreatNetworkInterval$android_sdk_base_release();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled$android_sdk_base_release();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically$android_sdk_base_release();
        this.isLocationCollectionEnabled = builder.isLocationCollectionEnabled$android_sdk_base_release();
        this.isNewsFeedVisualIndicatorOn = builder.isNewsFeedVisualIndicatorOn$android_sdk_base_release();
        this.isPushDeepLinkBackStackActivityEnabled = builder.isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release();
        this.isSessionStartBasedTimeoutEnabled = builder.isSessionStartBasedTimeoutEnabled$android_sdk_base_release();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release();
        this.isPushWakeScreenForNotificationEnabled = builder.isPushWakeScreenForNotificationEnabled$android_sdk_base_release();
        this.isPushHtmlRenderingEnabled = builder.isPushHtmlRenderingEnabled$android_sdk_base_release();
        this.areGeofencesEnabled = builder.isGeofencesEnabled$android_sdk_base_release();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled$android_sdk_base_release();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release();
        this.isSdkAuthEnabled = builder.isSdkAuthEnabled$android_sdk_base_release();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.isDeviceObjectAllowlistEnabled$android_sdk_base_release();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick$android_sdk_base_release();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release();
        this.shouldOptInWhenPushAuthorized = builder.getShouldOptInWhenPushAuthorized$android_sdk_base_release();
    }

    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isLocationCollectionEnabled;
        private Boolean isNewsFeedVisualIndicatorOn;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private Boolean shouldOptInWhenPushAuthorized;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        public static final class a extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f23959b = new a();

            public a() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze API key to blank string. API key field not set";
            }
        }

        public static final class b extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f23960b = new b();

            public b() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze default NotificationChannel description to null or blank string. NotificationChannel description field not set.";
            }
        }

        public static final class c extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f23961b = new c();

            public c() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Braze default NotificationChannel name to blank string. NotificationChannel name field not set.";
            }
        }

        public static final class d extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f23962b = new d();

            public d() {
                super(0);
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Cannot set Firebase Cloud Messaging Sender Id to blank string. Firebase Cloud Messaging Sender Id field not set";
            }
        }

        public static final class e extends Lambda implements Ia.a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f23963b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(int i10) {
                super(0);
                this.f23963b = i10;
            }

            @Override // Ia.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs called with negative value. Not setting timeout to: " + this.f23963b;
            }
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isLocationCollectionEnabled = bool3;
            this.isNewsFeedVisualIndicatorOn = bool4;
            this.isPushDeepLinkBackStackActivityEnabled = bool5;
            this.isSessionStartBasedTimeoutEnabled = bool6;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool7;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool8;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool9;
            this.isPushWakeScreenForNotificationEnabled = bool10;
            this.isPushHtmlRenderingEnabled = bool11;
            this.isGeofencesEnabled = bool12;
            this.inAppMessageTestPushEagerDisplayEnabled = bool13;
            this.automaticGeofenceRequestsEnabled = bool14;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool15;
            this.isTouchModeRequiredForHtmlInAppMessages = bool16;
            this.isSdkAuthEnabled = bool17;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool18;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool19;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool20;
            this.doesPushStoryDismissOnClick = bool21;
            this.isFallbackFirebaseMessagingServiceEnabled = bool22;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
            this.shouldOptInWhenPushAuthorized = bool23;
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        public final String component1$android_sdk_base_release() {
            return this.apiKey;
        }

        public final String component10$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final SdkFlavor component11$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final Integer component12$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final Integer component13$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final Integer component14$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public final Integer component15$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final Integer component16$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer component17$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Integer component18$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final Boolean component19$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String component2$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Boolean component20$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean component21$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean component22$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean component23$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean component24$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean component25$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean component26$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean component27$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean component28$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean component29$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final String component3$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Boolean component30$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean component31$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Boolean component32$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Boolean component33$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean component34$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Boolean component35$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final EnumSet<DeviceKey> component36$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean component37$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final EnumSet<BrazeSdkMetadata> component38$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final EnumSet<LocationProviderName> component39$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final String component4$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final Boolean component40$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean component41$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean component42$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final Boolean component43$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final String component44$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final Boolean component45$android_sdk_base_release() {
            return this.shouldOptInWhenPushAuthorized;
        }

        public final String component5$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String component6$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final String component7$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String component8$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final String component9$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Builder copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23) {
            return new Builder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, sdkFlavor, num, num2, num3, num4, num5, num6, num7, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, bool16, bool17, enumSet, bool18, enumSet2, enumSet3, bool19, bool20, bool21, bool22, str11, bool23);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            return i.a(this.apiKey, builder.apiKey) && i.a(this.serverTarget, builder.serverTarget) && i.a(this.smallNotificationIconName, builder.smallNotificationIconName) && i.a(this.largeNotificationIconName, builder.largeNotificationIconName) && i.a(this.customEndpoint, builder.customEndpoint) && i.a(this.defaultNotificationChannelName, builder.defaultNotificationChannelName) && i.a(this.defaultNotificationChannelDescription, builder.defaultNotificationChannelDescription) && i.a(this.pushDeepLinkBackStackActivityClassName, builder.pushDeepLinkBackStackActivityClassName) && i.a(this.firebaseCloudMessagingSenderIdKey, builder.firebaseCloudMessagingSenderIdKey) && i.a(this.customHtmlWebViewActivityClassName, builder.customHtmlWebViewActivityClassName) && this.sdkFlavor == builder.sdkFlavor && i.a(this.sessionTimeout, builder.sessionTimeout) && i.a(this.defaultNotificationAccentColor, builder.defaultNotificationAccentColor) && i.a(this.triggerActionMinimumTimeIntervalSeconds, builder.triggerActionMinimumTimeIntervalSeconds) && i.a(this.badNetworkInterval, builder.badNetworkInterval) && i.a(this.goodNetworkInterval, builder.goodNetworkInterval) && i.a(this.greatNetworkInterval, builder.greatNetworkInterval) && i.a(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs, builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs) && i.a(this.admMessagingRegistrationEnabled, builder.admMessagingRegistrationEnabled) && i.a(this.handlePushDeepLinksAutomatically, builder.handlePushDeepLinksAutomatically) && i.a(this.isLocationCollectionEnabled, builder.isLocationCollectionEnabled) && i.a(this.isNewsFeedVisualIndicatorOn, builder.isNewsFeedVisualIndicatorOn) && i.a(this.isPushDeepLinkBackStackActivityEnabled, builder.isPushDeepLinkBackStackActivityEnabled) && i.a(this.isSessionStartBasedTimeoutEnabled, builder.isSessionStartBasedTimeoutEnabled) && i.a(this.isFirebaseCloudMessagingRegistrationEnabled, builder.isFirebaseCloudMessagingRegistrationEnabled) && i.a(this.isContentCardsUnreadVisualIndicatorEnabled, builder.isContentCardsUnreadVisualIndicatorEnabled) && i.a(this.isInAppMessageAccessibilityExclusiveModeEnabled, builder.isInAppMessageAccessibilityExclusiveModeEnabled) && i.a(this.isPushWakeScreenForNotificationEnabled, builder.isPushWakeScreenForNotificationEnabled) && i.a(this.isPushHtmlRenderingEnabled, builder.isPushHtmlRenderingEnabled) && i.a(this.isGeofencesEnabled, builder.isGeofencesEnabled) && i.a(this.inAppMessageTestPushEagerDisplayEnabled, builder.inAppMessageTestPushEagerDisplayEnabled) && i.a(this.automaticGeofenceRequestsEnabled, builder.automaticGeofenceRequestsEnabled) && i.a(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled) && i.a(this.isTouchModeRequiredForHtmlInAppMessages, builder.isTouchModeRequiredForHtmlInAppMessages) && i.a(this.isSdkAuthEnabled, builder.isSdkAuthEnabled) && i.a(this.deviceObjectAllowlist, builder.deviceObjectAllowlist) && i.a(this.isDeviceObjectAllowlistEnabled, builder.isDeviceObjectAllowlistEnabled) && i.a(this.brazeSdkMetadata, builder.brazeSdkMetadata) && i.a(this.customLocationProviderNames, builder.customLocationProviderNames) && i.a(this.isHtmlInAppMessageApplyWindowInsetsEnabled, builder.isHtmlInAppMessageApplyWindowInsetsEnabled) && i.a(this.isHtmlInAppMessageHtmlLinkTargetEnabled, builder.isHtmlInAppMessageHtmlLinkTargetEnabled) && i.a(this.doesPushStoryDismissOnClick, builder.doesPushStoryDismissOnClick) && i.a(this.isFallbackFirebaseMessagingServiceEnabled, builder.isFallbackFirebaseMessagingServiceEnabled) && i.a(this.fallbackFirebaseMessagingServiceClasspath, builder.fallbackFirebaseMessagingServiceClasspath) && i.a(this.shouldOptInWhenPushAuthorized, builder.shouldOptInWhenPushAuthorized);
        }

        public final Boolean getAdmMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String getApiKey$android_sdk_base_release() {
            return this.apiKey;
        }

        public final Boolean getAutomaticGeofenceRequestsEnabled$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Integer getBadNetworkInterval$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final String getCustomEndpoint$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String getCustomHtmlWebViewActivityClassName$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final Integer getDefaultNotificationAccentColor$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final String getDefaultNotificationChannelDescription$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String getDefaultNotificationChannelName$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean getDoesPushStoryDismissOnClick$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final String getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final String getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Integer getGoodNetworkInterval$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer getGreatNetworkInterval$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Boolean getHandlePushDeepLinksAutomatically$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final String getLargeNotificationIconName$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final String getPushDeepLinkBackStackActivityClassName$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final SdkFlavor getSdkFlavor$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final String getServerTarget$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Integer getSessionTimeout$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final Boolean getShouldOptInWhenPushAuthorized$android_sdk_base_release() {
            return this.shouldOptInWhenPushAuthorized;
        }

        public final String getSmallNotificationIconName$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Integer getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public int hashCode() {
            String str = this.apiKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.serverTarget;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.smallNotificationIconName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.largeNotificationIconName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.customEndpoint;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.defaultNotificationChannelName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.defaultNotificationChannelDescription;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.customHtmlWebViewActivityClassName;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            int iHashCode11 = (iHashCode10 + (sdkFlavor == null ? 0 : sdkFlavor.hashCode())) * 31;
            Integer num = this.sessionTimeout;
            int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.defaultNotificationAccentColor;
            int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            int iHashCode14 = (iHashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.badNetworkInterval;
            int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.goodNetworkInterval;
            int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.greatNetworkInterval;
            int iHashCode17 = (iHashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            int iHashCode18 = (iHashCode17 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool = this.admMessagingRegistrationEnabled;
            int iHashCode19 = (iHashCode18 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            int iHashCode20 = (iHashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.isLocationCollectionEnabled;
            int iHashCode21 = (iHashCode20 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.isNewsFeedVisualIndicatorOn;
            int iHashCode22 = (iHashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.isPushDeepLinkBackStackActivityEnabled;
            int iHashCode23 = (iHashCode22 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.isSessionStartBasedTimeoutEnabled;
            int iHashCode24 = (iHashCode23 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.isFirebaseCloudMessagingRegistrationEnabled;
            int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Boolean bool8 = this.isContentCardsUnreadVisualIndicatorEnabled;
            int iHashCode26 = (iHashCode25 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            Boolean bool9 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            int iHashCode27 = (iHashCode26 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            Boolean bool10 = this.isPushWakeScreenForNotificationEnabled;
            int iHashCode28 = (iHashCode27 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            Boolean bool11 = this.isPushHtmlRenderingEnabled;
            int iHashCode29 = (iHashCode28 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
            Boolean bool12 = this.isGeofencesEnabled;
            int iHashCode30 = (iHashCode29 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
            Boolean bool13 = this.inAppMessageTestPushEagerDisplayEnabled;
            int iHashCode31 = (iHashCode30 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
            Boolean bool14 = this.automaticGeofenceRequestsEnabled;
            int iHashCode32 = (iHashCode31 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
            Boolean bool15 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            int iHashCode33 = (iHashCode32 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
            Boolean bool16 = this.isTouchModeRequiredForHtmlInAppMessages;
            int iHashCode34 = (iHashCode33 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
            Boolean bool17 = this.isSdkAuthEnabled;
            int iHashCode35 = (iHashCode34 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            int iHashCode36 = (iHashCode35 + (enumSet == null ? 0 : enumSet.hashCode())) * 31;
            Boolean bool18 = this.isDeviceObjectAllowlistEnabled;
            int iHashCode37 = (iHashCode36 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            int iHashCode38 = (iHashCode37 + (enumSet2 == null ? 0 : enumSet2.hashCode())) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            int iHashCode39 = (iHashCode38 + (enumSet3 == null ? 0 : enumSet3.hashCode())) * 31;
            Boolean bool19 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            int iHashCode40 = (iHashCode39 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
            Boolean bool20 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            int iHashCode41 = (iHashCode40 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
            Boolean bool21 = this.doesPushStoryDismissOnClick;
            int iHashCode42 = (iHashCode41 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
            Boolean bool22 = this.isFallbackFirebaseMessagingServiceEnabled;
            int iHashCode43 = (iHashCode42 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
            String str11 = this.fallbackFirebaseMessagingServiceClasspath;
            int iHashCode44 = (iHashCode43 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Boolean bool23 = this.shouldOptInWhenPushAuthorized;
            return iHashCode44 + (bool23 != null ? bool23.hashCode() : 0);
        }

        public final Boolean isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean isDeviceObjectAllowlistEnabled$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final Boolean isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final Boolean isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean isGeofencesEnabled$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean isLocationCollectionEnabled$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean isNewsFeedVisualIndicatorOn$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean isPushHtmlRenderingEnabled$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final Boolean isPushWakeScreenForNotificationEnabled$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean isSdkAuthEnabled$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final Boolean isSessionStartBasedTimeoutEnabled$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setAdmMessagingRegistrationEnabled(boolean z10) {
            this.admMessagingRegistrationEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setAdmMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.admMessagingRegistrationEnabled = bool;
        }

        public final Builder setApiKey(String apiKey) {
            i.e(apiKey, "apiKey");
            if (n.S(apiKey)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.f23959b, 2, (Object) null);
            } else {
                this.apiKey = apiKey;
            }
            return this;
        }

        public final void setApiKey$android_sdk_base_release(String str) {
            this.apiKey = str;
        }

        public final Builder setAutomaticGeofenceRequestsEnabled(boolean z10) {
            this.automaticGeofenceRequestsEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setAutomaticGeofenceRequestsEnabled$android_sdk_base_release(Boolean bool) {
            this.automaticGeofenceRequestsEnabled = bool;
        }

        public final Builder setBadNetworkDataFlushInterval(int i10) {
            this.badNetworkInterval = Integer.valueOf(i10);
            return this;
        }

        public final void setBadNetworkInterval$android_sdk_base_release(Integer num) {
            this.badNetworkInterval = num;
        }

        public final void setBrazeSdkMetadata$android_sdk_base_release(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
        }

        public final Builder setContentCardsUnreadVisualIndicatorEnabled(boolean z10) {
            this.isContentCardsUnreadVisualIndicatorEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release(Boolean bool) {
            this.isContentCardsUnreadVisualIndicatorEnabled = bool;
        }

        public final Builder setCustomEndpoint(String customEndpoint) {
            i.e(customEndpoint, "customEndpoint");
            this.customEndpoint = customEndpoint;
            return this;
        }

        public final void setCustomEndpoint$android_sdk_base_release(String str) {
            this.customEndpoint = str;
        }

        public final void setCustomHtmlWebViewActivityClassName$android_sdk_base_release(String str) {
            this.customHtmlWebViewActivityClassName = str;
        }

        public final Builder setCustomLocationProviderNames(EnumSet<LocationProviderName> locationProviderNames) {
            i.e(locationProviderNames, "locationProviderNames");
            this.customLocationProviderNames = locationProviderNames;
            return this;
        }

        public final void setCustomLocationProviderNames$android_sdk_base_release(EnumSet<LocationProviderName> enumSet) {
            this.customLocationProviderNames = enumSet;
        }

        public final Builder setCustomWebViewActivityClass(Class<?> customWebViewActivityClass) {
            i.e(customWebViewActivityClass, "customWebViewActivityClass");
            this.customHtmlWebViewActivityClassName = customWebViewActivityClass.getName();
            return this;
        }

        public final Builder setDefaultNotificationAccentColor(int i10) {
            this.defaultNotificationAccentColor = Integer.valueOf(i10);
            return this;
        }

        public final void setDefaultNotificationAccentColor$android_sdk_base_release(Integer num) {
            this.defaultNotificationAccentColor = num;
        }

        public final Builder setDefaultNotificationChannelDescription(String description) {
            i.e(description, "description");
            if (n.S(description)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.f23960b, 2, (Object) null);
            } else {
                this.defaultNotificationChannelDescription = description;
            }
            return this;
        }

        public final void setDefaultNotificationChannelDescription$android_sdk_base_release(String str) {
            this.defaultNotificationChannelDescription = str;
        }

        public final Builder setDefaultNotificationChannelName(String name) {
            i.e(name, "name");
            if (n.S(name)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.f23961b, 2, (Object) null);
            } else {
                this.defaultNotificationChannelName = name;
            }
            return this;
        }

        public final void setDefaultNotificationChannelName$android_sdk_base_release(String str) {
            this.defaultNotificationChannelName = str;
        }

        public final Builder setDeviceObjectAllowlist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            i.e(deviceObjectAllowlist, "deviceObjectAllowlist");
            this.deviceObjectAllowlist = deviceObjectAllowlist;
            return this;
        }

        public final void setDeviceObjectAllowlist$android_sdk_base_release(EnumSet<DeviceKey> enumSet) {
            this.deviceObjectAllowlist = enumSet;
        }

        public final Builder setDeviceObjectAllowlistEnabled(boolean z10) {
            this.isDeviceObjectAllowlistEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setDeviceObjectAllowlistEnabled$android_sdk_base_release(Boolean bool) {
            this.isDeviceObjectAllowlistEnabled = bool;
        }

        @p293xa.d
        public final Builder setDeviceObjectWhitelist(EnumSet<DeviceKey> deviceObjectAllowlist) {
            i.e(deviceObjectAllowlist, "deviceObjectAllowlist");
            return setDeviceObjectAllowlist(deviceObjectAllowlist);
        }

        @p293xa.d
        public final Builder setDeviceObjectWhitelistEnabled(boolean z10) {
            return setDeviceObjectAllowlistEnabled(z10);
        }

        public final Builder setDoesPushStoryDismissOnClick(boolean z10) {
            this.doesPushStoryDismissOnClick = Boolean.valueOf(z10);
            return this;
        }

        public final void setDoesPushStoryDismissOnClick$android_sdk_base_release(Boolean bool) {
            this.doesPushStoryDismissOnClick = bool;
        }

        public final Builder setFallbackFirebaseMessagingServiceClasspath(String classpath) {
            i.e(classpath, "classpath");
            this.fallbackFirebaseMessagingServiceClasspath = classpath;
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release(String str) {
            this.fallbackFirebaseMessagingServiceClasspath = str;
        }

        public final Builder setFallbackFirebaseMessagingServiceEnabled(boolean z10) {
            this.isFallbackFirebaseMessagingServiceEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release(Boolean bool) {
            this.isFallbackFirebaseMessagingServiceEnabled = bool;
        }

        public final void setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseCloudMessagingRegistrationEnabled = bool;
        }

        public final Builder setFirebaseCloudMessagingSenderIdKey(String firebaseSenderId) {
            i.e(firebaseSenderId, "firebaseSenderId");
            if (n.S(firebaseSenderId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.f23962b, 2, (Object) null);
            } else {
                this.firebaseCloudMessagingSenderIdKey = firebaseSenderId;
            }
            return this;
        }

        public final void setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release(String str) {
            this.firebaseCloudMessagingSenderIdKey = str;
        }

        public final void setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release(Boolean bool) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool;
        }

        public final Builder setGeofencesEnabled(boolean z10) {
            this.isGeofencesEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setGeofencesEnabled$android_sdk_base_release(Boolean bool) {
            this.isGeofencesEnabled = bool;
        }

        public final Builder setGoodNetworkDataFlushInterval(int i10) {
            this.goodNetworkInterval = Integer.valueOf(i10);
            return this;
        }

        public final void setGoodNetworkInterval$android_sdk_base_release(Integer num) {
            this.goodNetworkInterval = num;
        }

        public final Builder setGreatNetworkDataFlushInterval(int i10) {
            this.greatNetworkInterval = Integer.valueOf(i10);
            return this;
        }

        public final void setGreatNetworkInterval$android_sdk_base_release(Integer num) {
            this.greatNetworkInterval = num;
        }

        public final Builder setHandlePushDeepLinksAutomatically(boolean z10) {
            this.handlePushDeepLinksAutomatically = Boolean.valueOf(z10);
            return this;
        }

        public final void setHandlePushDeepLinksAutomatically$android_sdk_base_release(Boolean bool) {
            this.handlePushDeepLinksAutomatically = bool;
        }

        public final void setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool;
        }

        public final void setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release(Boolean bool) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool;
        }

        public final void setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release(Boolean bool) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool;
        }

        public final Builder setInAppMessageTestPushEagerDisplayEnabled(boolean z10) {
            this.inAppMessageTestPushEagerDisplayEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release(Boolean bool) {
            this.inAppMessageTestPushEagerDisplayEnabled = bool;
        }

        public final Builder setInAppMessageWebViewClientMaxOnPageFinishedWaitMs(int i10) {
            if (i10 >= 0) {
                this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = Integer.valueOf(i10);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new e(i10), 2, (Object) null);
            }
            return this;
        }

        public final void setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release(Integer num) {
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num;
        }

        public final Builder setIsFirebaseCloudMessagingRegistrationEnabled(boolean z10) {
            this.isFirebaseCloudMessagingRegistrationEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled(boolean z10) {
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsHtmlInAppMessageApplyWindowInsetsEnabled(boolean z10) {
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsHtmlInAppMessageHtmlLinkTargetEnabled(boolean z10) {
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsInAppMessageAccessibilityExclusiveModeEnabled(boolean z10) {
            this.isInAppMessageAccessibilityExclusiveModeEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsLocationCollectionEnabled(boolean z10) {
            this.isLocationCollectionEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsPushWakeScreenForNotificationEnabled(boolean z10) {
            this.isPushWakeScreenForNotificationEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsSdkAuthenticationEnabled(boolean z10) {
            this.isSdkAuthEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsSessionStartBasedTimeoutEnabled(boolean z10) {
            this.isSessionStartBasedTimeoutEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setIsTouchModeRequiredForHtmlInAppMessages(boolean z10) {
            this.isTouchModeRequiredForHtmlInAppMessages = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setLargeNotificationIcon(String largeNotificationIconName) {
            i.e(largeNotificationIconName, "largeNotificationIconName");
            this.largeNotificationIconName = largeNotificationIconName;
            return this;
        }

        public final void setLargeNotificationIconName$android_sdk_base_release(String str) {
            this.largeNotificationIconName = str;
        }

        public final void setLocationCollectionEnabled$android_sdk_base_release(Boolean bool) {
            this.isLocationCollectionEnabled = bool;
        }

        public final void setNewsFeedVisualIndicatorOn$android_sdk_base_release(Boolean bool) {
            this.isNewsFeedVisualIndicatorOn = bool;
        }

        public final Builder setNewsfeedVisualIndicatorOn(boolean z10) {
            this.isNewsFeedVisualIndicatorOn = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setOptInWhenPushAuthorized(boolean z10) {
            this.shouldOptInWhenPushAuthorized = Boolean.valueOf(z10);
            return this;
        }

        public final Builder setPushDeepLinkBackStackActivityClass(Class<?> pushDeepLinkActivityClass) {
            i.e(pushDeepLinkActivityClass, "pushDeepLinkActivityClass");
            this.pushDeepLinkBackStackActivityClassName = pushDeepLinkActivityClass.getName();
            return this;
        }

        public final void setPushDeepLinkBackStackActivityClassName$android_sdk_base_release(String str) {
            this.pushDeepLinkBackStackActivityClassName = str;
        }

        public final Builder setPushDeepLinkBackStackActivityEnabled(boolean z10) {
            this.isPushDeepLinkBackStackActivityEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushDeepLinkBackStackActivityEnabled = bool;
        }

        public final Builder setPushHtmlRenderingEnabled(boolean z10) {
            this.isPushHtmlRenderingEnabled = Boolean.valueOf(z10);
            return this;
        }

        public final void setPushHtmlRenderingEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushHtmlRenderingEnabled = bool;
        }

        public final void setPushWakeScreenForNotificationEnabled$android_sdk_base_release(Boolean bool) {
            this.isPushWakeScreenForNotificationEnabled = bool;
        }

        public final void setSdkAuthEnabled$android_sdk_base_release(Boolean bool) {
            this.isSdkAuthEnabled = bool;
        }

        public final Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
            return this;
        }

        public final void setSdkFlavor$android_sdk_base_release(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
            return this;
        }

        public final Builder setServerTarget(String serverTarget) {
            i.e(serverTarget, "serverTarget");
            this.serverTarget = serverTarget;
            return this;
        }

        public final void setServerTarget$android_sdk_base_release(String str) {
            this.serverTarget = str;
        }

        public final void setSessionStartBasedTimeoutEnabled$android_sdk_base_release(Boolean bool) {
            this.isSessionStartBasedTimeoutEnabled = bool;
        }

        public final Builder setSessionTimeout(int i10) {
            this.sessionTimeout = Integer.valueOf(i10);
            return this;
        }

        public final void setSessionTimeout$android_sdk_base_release(Integer num) {
            this.sessionTimeout = num;
        }

        public final void setShouldOptInWhenPushAuthorized$android_sdk_base_release(Boolean bool) {
            this.shouldOptInWhenPushAuthorized = bool;
        }

        public final Builder setSmallNotificationIcon(String smallNotificationIconName) {
            i.e(smallNotificationIconName, "smallNotificationIconName");
            this.smallNotificationIconName = smallNotificationIconName;
            return this;
        }

        public final void setSmallNotificationIconName$android_sdk_base_release(String str) {
            this.smallNotificationIconName = str;
        }

        public final void setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release(Boolean bool) {
            this.isTouchModeRequiredForHtmlInAppMessages = bool;
        }

        public final Builder setTriggerActionMinimumTimeIntervalSeconds(int i10) {
            this.triggerActionMinimumTimeIntervalSeconds = Integer.valueOf(i10);
            return this;
        }

        public final void setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release(Integer num) {
            this.triggerActionMinimumTimeIntervalSeconds = num;
        }

        public String toString() {
            return "Builder(apiKey=" + this.apiKey + ", serverTarget=" + this.serverTarget + ", smallNotificationIconName=" + this.smallNotificationIconName + ", largeNotificationIconName=" + this.largeNotificationIconName + ", customEndpoint=" + this.customEndpoint + ", defaultNotificationChannelName=" + this.defaultNotificationChannelName + ", defaultNotificationChannelDescription=" + this.defaultNotificationChannelDescription + ", pushDeepLinkBackStackActivityClassName=" + this.pushDeepLinkBackStackActivityClassName + ", firebaseCloudMessagingSenderIdKey=" + this.firebaseCloudMessagingSenderIdKey + ", customHtmlWebViewActivityClassName=" + this.customHtmlWebViewActivityClassName + ", sdkFlavor=" + this.sdkFlavor + ", sessionTimeout=" + this.sessionTimeout + ", defaultNotificationAccentColor=" + this.defaultNotificationAccentColor + ", triggerActionMinimumTimeIntervalSeconds=" + this.triggerActionMinimumTimeIntervalSeconds + ", badNetworkInterval=" + this.badNetworkInterval + ", goodNetworkInterval=" + this.goodNetworkInterval + ", greatNetworkInterval=" + this.greatNetworkInterval + ", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=" + this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs + ", admMessagingRegistrationEnabled=" + this.admMessagingRegistrationEnabled + ", handlePushDeepLinksAutomatically=" + this.handlePushDeepLinksAutomatically + ", isLocationCollectionEnabled=" + this.isLocationCollectionEnabled + ", isNewsFeedVisualIndicatorOn=" + this.isNewsFeedVisualIndicatorOn + ", isPushDeepLinkBackStackActivityEnabled=" + this.isPushDeepLinkBackStackActivityEnabled + ", isSessionStartBasedTimeoutEnabled=" + this.isSessionStartBasedTimeoutEnabled + ", isFirebaseCloudMessagingRegistrationEnabled=" + this.isFirebaseCloudMessagingRegistrationEnabled + ", isContentCardsUnreadVisualIndicatorEnabled=" + this.isContentCardsUnreadVisualIndicatorEnabled + ", isInAppMessageAccessibilityExclusiveModeEnabled=" + this.isInAppMessageAccessibilityExclusiveModeEnabled + ", isPushWakeScreenForNotificationEnabled=" + this.isPushWakeScreenForNotificationEnabled + ", isPushHtmlRenderingEnabled=" + this.isPushHtmlRenderingEnabled + ", isGeofencesEnabled=" + this.isGeofencesEnabled + ", inAppMessageTestPushEagerDisplayEnabled=" + this.inAppMessageTestPushEagerDisplayEnabled + ", automaticGeofenceRequestsEnabled=" + this.automaticGeofenceRequestsEnabled + ", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=" + this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled + ", isTouchModeRequiredForHtmlInAppMessages=" + this.isTouchModeRequiredForHtmlInAppMessages + ", isSdkAuthEnabled=" + this.isSdkAuthEnabled + ", deviceObjectAllowlist=" + this.deviceObjectAllowlist + ", isDeviceObjectAllowlistEnabled=" + this.isDeviceObjectAllowlistEnabled + ", brazeSdkMetadata=" + this.brazeSdkMetadata + ", customLocationProviderNames=" + this.customLocationProviderNames + ", isHtmlInAppMessageApplyWindowInsetsEnabled=" + this.isHtmlInAppMessageApplyWindowInsetsEnabled + ", isHtmlInAppMessageHtmlLinkTargetEnabled=" + this.isHtmlInAppMessageHtmlLinkTargetEnabled + ", doesPushStoryDismissOnClick=" + this.doesPushStoryDismissOnClick + ", isFallbackFirebaseMessagingServiceEnabled=" + this.isFallbackFirebaseMessagingServiceEnabled + ", fallbackFirebaseMessagingServiceClasspath=" + this.fallbackFirebaseMessagingServiceClasspath + ", shouldOptInWhenPushAuthorized=" + this.shouldOptInWhenPushAuthorized + ')';
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, Boolean bool23, int i10, int i11, kotlin.jvm.internal.e eVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) != 0 ? null : str10, (i10 & 1024) != 0 ? null : sdkFlavor, (i10 & 2048) != 0 ? null : num, (i10 & 4096) != 0 ? null : num2, (i10 & 8192) != 0 ? null : num3, (i10 & 16384) != 0 ? null : num4, (i10 & 32768) != 0 ? null : num5, (i10 & 65536) != 0 ? null : num6, (i10 & 131072) != 0 ? null : num7, (i10 & 262144) != 0 ? null : bool, (i10 & 524288) != 0 ? null : bool2, (i10 & 1048576) != 0 ? null : bool3, (i10 & 2097152) != 0 ? null : bool4, (i10 & 4194304) != 0 ? null : bool5, (i10 & 8388608) != 0 ? null : bool6, (i10 & 16777216) != 0 ? null : bool7, (i10 & 33554432) != 0 ? null : bool8, (i10 & 67108864) != 0 ? null : bool9, (i10 & 134217728) != 0 ? null : bool10, (i10 & 268435456) != 0 ? null : bool11, (i10 & 536870912) != 0 ? null : bool12, (i10 & 1073741824) != 0 ? null : bool13, (i10 & Integer.MIN_VALUE) != 0 ? null : bool14, (i11 & 1) != 0 ? null : bool15, (i11 & 2) != 0 ? null : bool16, (i11 & 4) != 0 ? null : bool17, (i11 & 8) != 0 ? null : enumSet, (i11 & 16) != 0 ? null : bool18, (i11 & 32) != 0 ? null : enumSet2, (i11 & 64) != 0 ? null : enumSet3, (i11 & 128) != 0 ? null : bool19, (i11 & 256) != 0 ? null : bool20, (i11 & 512) != 0 ? null : bool21, (i11 & 1024) != 0 ? null : bool22, (i11 & 2048) != 0 ? null : str11, (i11 & 4096) != 0 ? null : bool23);
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 8191, null);
        }
    }
}
