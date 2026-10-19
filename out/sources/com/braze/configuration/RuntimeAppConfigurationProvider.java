package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.BrazeInternal;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeAppConfigurationProvider {
    public static final a Companion = new a(null);
    private static final String SHARED_PREFERENCES_NAME = "com.appboy.override.configuration.cache";
    private final Context context;
    private SharedPreferences.Editor editor;
    private final SharedPreferences storageMap;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f24049b = new b();

        public b() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BrazeConfig f24050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BrazeConfig brazeConfig) {
            super(0);
            this.f24050b = brazeConfig;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Setting Braze Override configuration with config: " + this.f24050b;
        }
    }

    public RuntimeAppConfigurationProvider(Context context) {
        i.e(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        i.d(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.storageMap = sharedPreferences;
    }

    private final void putBoolean(String str, Boolean bool) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putBoolean(str, zBooleanValue);
            }
        }
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, String str) {
        if (enumSet == null) {
            return;
        }
        Set<String> setA = com.braze.support.c.a(enumSet);
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putStringSet(str, setA);
        }
    }

    private final void putInt(String str, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putInt(str, iIntValue);
            }
        }
    }

    public final void applyEdit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.apply();
        }
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.f24049b, 3, (Object) null);
        this.storageMap.edit().clear().apply();
    }

    public final boolean containsKey(String key) {
        i.e(key, "key");
        return this.storageMap.contains(key);
    }

    public final boolean getBooleanValue(String key, boolean z10) {
        i.e(key, "key");
        return this.storageMap.getBoolean(key, z10);
    }

    public final SharedPreferences.Editor getEditor() {
        return this.editor;
    }

    public final int getIntValue(String key, int i10) {
        i.e(key, "key");
        return this.storageMap.getInt(key, i10);
    }

    public final SharedPreferences getStorageMap() {
        return this.storageMap;
    }

    public final Set<String> getStringSetValue(String key, Set<String> set) {
        i.e(key, "key");
        return this.storageMap.getStringSet(key, set);
    }

    public final String getStringValue(String key, String str) {
        i.e(key, "key");
        return this.storageMap.getString(key, str);
    }

    public final void putEnumAsString(String key, Enum<?> r10) {
        i.e(key, "key");
        if (r10 != null) {
            putString(key, r10.toString());
        }
    }

    public final void putString(String key, String str) {
        SharedPreferences.Editor editor;
        i.e(key, "key");
        if (str == null || (editor = this.editor) == null) {
            return;
        }
        editor.putString(key, str);
    }

    public final void setConfiguration(BrazeConfig config) {
        i.e(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(config), 2, (Object) null);
        startEdit();
        putString(BrazeConfigurationProvider.b.API_KEY.b(), config.apiKey);
        putString(BrazeConfigurationProvider.b.SERVER_TARGET_KEY.b(), config.serverTarget);
        putEnumAsString(BrazeConfigurationProvider.b.SDK_FLAVOR.b(), config.sdkFlavor);
        putBoolean(BrazeConfigurationProvider.b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.b(), config.isNewsFeedVisualIndicatorOn);
        putString(BrazeConfigurationProvider.b.CUSTOM_ENDPOINT.b(), config.customEndpoint);
        putString(BrazeConfigurationProvider.b.SMALL_NOTIFICATION_ICON_KEY.b(), config.smallNotificationIcon);
        putString(BrazeConfigurationProvider.b.LARGE_NOTIFICATION_ICON_KEY.b(), config.largeNotificationIcon);
        putInt(BrazeConfigurationProvider.b.SESSION_TIMEOUT_KEY.b(), config.sessionTimeout);
        putInt(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.b(), config.defaultNotificationAccentColor);
        putInt(BrazeConfigurationProvider.b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.b(), config.triggerActionMinimumTimeIntervalSeconds);
        putBoolean(BrazeConfigurationProvider.b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.b(), config.isAdmMessagingRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.b(), config.willHandlePushDeepLinksAutomatically);
        putBoolean(BrazeConfigurationProvider.b.ENABLE_LOCATION_COLLECTION_KEY.b(), config.isLocationCollectionEnabled);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.b(), config.badNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.b(), config.goodNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.b(), config.greatNetworkInterval);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_NAME.b(), config.defaultNotificationChannelName);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.b(), config.defaultNotificationChannelDescription);
        putBoolean(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.b(), config.isPushDeepLinkBackStackActivityEnabled);
        putString(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.b(), config.pushDeepLinkBackStackActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.b(), config.isSessionStartBasedTimeoutEnabled);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.b(), config.isFirebaseCloudMessagingRegistrationEnabled);
        putString(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.b(), config.firebaseCloudMessagingSenderIdKey);
        putBoolean(BrazeConfigurationProvider.b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.b(), config.isContentCardsUnreadVisualIndicatorEnabled);
        putBoolean(BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.b(), config.isDeviceObjectAllowlistEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.b(), config.isInAppMessageAccessibilityExclusiveModeEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.b(), config.isPushWakeScreenForNotificationEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.b(), config.isPushHtmlRenderingEnabled);
        putBoolean(BrazeConfigurationProvider.b.DOES_PUSH_STORY_DISMISS_ON_CLICK.b(), config.doesPushStoryDismissOnClick);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_ENABLED.b(), config.areGeofencesEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.b(), config.isInAppMessageTestPushEagerDisplayEnabled);
        putString(BrazeConfigurationProvider.b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.b(), config.customHtmlWebViewActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.b(), config.areAutomaticGeofenceRequestsEnabled);
        putInt(BrazeConfigurationProvider.b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.b(), config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.b(), config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.SDK_AUTH_ENABLED.b(), config.isSdkAuthEnabled);
        putBoolean(BrazeConfigurationProvider.b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.b(), config.isTouchModeRequiredForHtmlInAppMessages);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.b(), config.isHtmlInAppMessageApplyWindowInsetsEnabled);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.b(), config.isHtmlInAppMessageHtmlLinkTargetEnabled);
        putEnumSet(config.deviceObjectAllowlist, BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLIST_VALUE.b());
        putEnumSet(config.customLocationProviderNames, BrazeConfigurationProvider.b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.b());
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(BrazeConfigurationProvider.b.SDK_METADATA_PUBLIC_KEY.b(), enumSet);
        }
        putBoolean(BrazeConfigurationProvider.b.FALLBACK_FCM_SERVICE_ENABLED.b(), config.isFallbackFirebaseMessagingServiceEnabled);
        putString(BrazeConfigurationProvider.b.FALLBACK_FCM_SERVICE_CLASSPATH.b(), config.fallbackFirebaseMessagingServiceClasspath);
        putBoolean(BrazeConfigurationProvider.b.OPTIN_WHEN_PUSH_AUTHORIZED.b(), config.shouldOptInWhenPushAuthorized);
        applyEdit();
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final void setEditor(SharedPreferences.Editor editor) {
        this.editor = editor;
    }

    public final void startEdit() {
        this.editor = this.storageMap.edit();
    }

    public final <T extends Enum<T>> void updateEnumSetData(String key, EnumSet<T> updateValue) {
        i.e(key, "key");
        i.e(updateValue, "updateValue");
        Set<String> stringSetValue = getStringSetValue(key, new HashSet());
        if (stringSetValue != null) {
            stringSetValue.addAll(com.braze.support.c.a(updateValue));
        }
        this.storageMap.edit().putStringSet(key, stringSetValue).apply();
    }
}
