package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.C1469h;
import bo.app.c1;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final a Companion = new a(null);
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    public static final String DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION_DEFAULT_VALUE = "";
    public static final String DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE = "General";
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 10;
    private static final int DEFAULT_TRIGGER_MINIMUM_INTERVAL = 30;
    public static final int MAX_ALLOWED_EPHEMERAL_EVENTS = 12;
    private final Context context;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public enum b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        DOES_PUSH_STORY_DISMISS_ON_CLICK("com_braze_does_push_story_dismiss_on_click"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        FALLBACK_FCM_SERVICE_ENABLED("com_braze_fallback_firebase_cloud_messaging_service_enabled"),
        FALLBACK_FCM_SERVICE_CLASSPATH("com_braze_fallback_firebase_cloud_messaging_service_classpath"),
        OPTIN_WHEN_PUSH_AUTHORIZED("com_braze_optin_when_push_authorized"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata"),
        HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS("com_braze_html_in_app_message_apply_insets"),
        HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET("com_braze_html_in_app_message_enable_html_link_target");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24013b;

        b(String str) {
            this.f24013b = str;
        }

        public final String b() {
            return this.f24013b;
        }
    }

    public static final class c extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f24014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f24014b = str;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Couldn't find application icon for package: " + this.f24014b;
        }
    }

    public static final class d extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f24015b = new d();

        public d() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "****************************************************";
        }
    }

    public static final class e extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f24016b = new e();

        public e() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Found an override api key. Using it to configure the Braze SDK";
        }
    }

    public static final class f extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f24017b = new f();

        public f() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "****************************************************";
        }
    }

    public static final class g extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f24018b = new g();

        public g() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    public static final class h extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f24019b = new h();

        public h() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                 !! WARNING !!                  **";
        }
    }

    public static final class i extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f24020b = new i();

        public i() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    public static final class j extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f24021b = new j();

        public j() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    public static final class k extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f24022b = new k();

        public k() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
        }
    }

    public static final class l extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f24023b = new l();

        public l() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**          Braze functionality disabled          **";
        }
    }

    public static final class m extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f24024b = new m();

        public m() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "**                                                **";
        }
    }

    public static final class n extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f24025b = new n();

        public n() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Using default notification accent color found in resources";
        }
    }

    public static final class o extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f24026b = new o();

        public o() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
        }
    }

    public static final class p extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f24027b = new p();

        public p() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Exception while parsing stored SDK flavor. Returning null.";
        }
    }

    public static final class q extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final q f24028b = new q();

        public q() {
            super(0);
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unable to read the version code.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        kotlin.jvm.internal.i.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, b bVar) {
        String strB = bVar.b();
        if (getConfigurationCache().containsKey(strB)) {
            Object obj = getConfigurationCache().get(strB);
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(bVar.b(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> enumSetA = com.braze.support.c.a(cls, stringSetValue);
        getConfigurationCache().put(strB, enumSetA);
        return enumSetA;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(b.SERVER_TARGET_KEY.b(), "PROD");
        return stringValue == null ? "PROD" : stringValue;
    }

    public final void clear() {
        getConfigurationCache().clear();
        getRuntimeAppConfigurationProvider().getStorageMap().edit().clear().apply();
    }

    public final int getApplicationIconResourceId() {
        int i10;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getApplicationInfo(packageName, PackageManager.ApplicationInfoFlags.of(0L)) : this.context.getPackageManager().getApplicationInfo(packageName, 0);
            kotlin.jvm.internal.i.d(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i10 = applicationInfo.icon;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new c(packageName));
            i10 = 0;
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i10));
        return i10;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale US = Locale.US;
        kotlin.jvm.internal.i.d(US, "US");
        String upperCase = serverTarget.toUpperCase(US);
        kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return "STAGING".equals(upperCase) ? "https://sondheim.braze.com/api/v3/" : "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final C1469h getBrazeApiKey() {
        String strB = b.API_KEY.b();
        String stringValue = (String) getConfigurationCache().get(strB);
        if (stringValue == null) {
            stringValue = getRuntimeAppConfigurationProvider().getStringValue(strB, null);
            if (stringValue != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, e.f24016b, 2, (Object) null);
            } else {
                stringValue = getStringValue(strB, null);
            }
            if (stringValue != null) {
                getConfigurationCache().put(strB, stringValue);
            }
        }
        if (stringValue != null) {
            return new C1469h(stringValue);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.f24017b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.f24018b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, h.f24019b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, i.f24020b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, j.f24021b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.f24022b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, l.f24023b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, m.f24024b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.f24015b, 2, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final Context getContext$android_sdk_base_release() {
        return this.context;
    }

    public final String getCustomEndpoint() {
        return getStringValue(b.CUSTOM_ENDPOINT.b(), null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.b(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.b());
        if (colorValue == null) {
            return 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.f24025b, 3, (Object) null);
        return colorValue.intValue();
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.b(), "");
        return stringValue == null ? "" : stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_NAME.b(), DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE);
        return stringValue == null ? DEFAULT_NOTIFICATION_CHANNEL_NAME_DEFAULT_VALUE : stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    @p293xa.d
    public final EnumSet<DeviceKey> getDeviceObjectWhitelist() {
        return getDeviceObjectAllowlist();
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.b(), false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        return getBooleanValue(b.DOES_PUSH_STORY_DISMISS_ON_CLICK.b(), true);
    }

    public final Set<String> getEphemeralEventKeys() {
        String strB = b.EPHEMERAL_EVENTS_KEYS.b();
        Set<String> set = EmptySet.f42985b;
        Set<String> stringSetValue = getStringSetValue(strB, set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, o.f24026b, 2, (Object) null);
        }
        return kotlin.collections.q.s0(kotlin.collections.q.i0(set, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        return getStringValue(b.FALLBACK_FCM_SERVICE_CLASSPATH.b(), null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.b(), null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.b(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(b.LARGE_NOTIFICATION_ICON_KEY.b(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(b.LOGGER_INITIAL_LOG_LEVEL.b(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.b(), "");
    }

    public final SdkFlavor getSdkFlavor() {
        String stringValue = getStringValue(b.SDK_FLAVOR.b(), null);
        if (stringValue == null || kotlin.text.n.S(stringValue)) {
            return null;
        }
        try {
            Locale US = Locale.US;
            kotlin.jvm.internal.i.d(US, "US");
            String upperCase = stringValue.toUpperCase(US);
            kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return SdkFlavor.valueOf(upperCase);
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, p.f24027b);
            return null;
        }
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String strB = b.SDK_METADATA_INTERNAL_KEY.b();
        CachedConfigurationProvider.b bVar = CachedConfigurationProvider.b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(bVar, strB, new HashSet());
        kotlin.jvm.internal.i.c(resourceConfigurationValue, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        if ((resourceConfigurationValue instanceof Ja.a) && !(resourceConfigurationValue instanceof Ja.e)) {
            kotlin.jvm.internal.o.f(resourceConfigurationValue, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            Set<String> set = (Set) resourceConfigurationValue;
            String strB2 = b.SDK_METADATA_PUBLIC_KEY.b();
            Object resourceConfigurationValue2 = getResourceConfigurationValue(bVar, strB2, new HashSet());
            kotlin.jvm.internal.i.c(resourceConfigurationValue2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            Object runtimeConfigurationValue = getRuntimeConfigurationValue(bVar, strB2, new HashSet());
            kotlin.jvm.internal.i.c(runtimeConfigurationValue, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            set.addAll((Set) resourceConfigurationValue2);
            set.addAll((Set) runtimeConfigurationValue);
            com.braze.support.c cVar = com.braze.support.c.f24371a;
            EnumSet<BrazeSdkMetadata> result = EnumSet.noneOf(BrazeSdkMetadata.class);
            for (String str : set) {
                try {
                    com.braze.support.c cVar2 = com.braze.support.c.f24371a;
                    Locale US = Locale.US;
                    kotlin.jvm.internal.i.d(US, "US");
                    String upperCase = str.toUpperCase(US);
                    kotlin.jvm.internal.i.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    BrazeSdkMetadata[] brazeSdkMetadataArrValues = BrazeSdkMetadata.values();
                    int length = brazeSdkMetadataArrValues.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        BrazeSdkMetadata brazeSdkMetadata = brazeSdkMetadataArrValues[i10];
                        if (kotlin.jvm.internal.i.a(brazeSdkMetadata.name(), upperCase)) {
                            result.add(brazeSdkMetadata);
                            break;
                        }
                        i10++;
                    }
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(com.braze.support.c.f24371a, BrazeLogger.Priority.E, e10, new c1(str));
                }
            }
            kotlin.jvm.internal.i.d(result, "result");
            return result;
        } catch (ClassCastException e11) {
            kotlin.jvm.internal.i.j(e11, kotlin.jvm.internal.o.class.getName());
            throw e11;
        }
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(b.SESSION_TIMEOUT_KEY.b(), 10);
    }

    public final boolean getShouldOptInWhenPushAuthorized() {
        return getBooleanValue(b.OPTIN_WHEN_PUSH_AUTHORIZED.b(), true);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(b.SMALL_NOTIFICATION_ICON_KEY.b(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return getIntValue(b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.b(), 30);
    }

    public final int getVersionCode() {
        int i10;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        try {
            i10 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e10) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, q.f24028b);
            i10 = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i10));
        return i10;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.b(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.b(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.b(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.b(), false);
    }

    @p293xa.d
    public final boolean isDeviceObjectWhitelistEnabled() {
        return isDeviceObjectAllowlistEnabled();
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(b.EPHEMERAL_EVENTS_ENABLED.b(), false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        return getBooleanValue(b.FALLBACK_FCM_SERVICE_ENABLED.b(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.b(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.b(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(b.GEOFENCES_ENABLED.b(), isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.b(), false);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.b(), true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.b(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.b(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(b.ENABLE_LOCATION_COLLECTION_KEY.b(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.b(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.b(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.b(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.b(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(b.SDK_AUTH_ENABLED.b(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.b(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.b(), true);
    }

    public static /* synthetic */ void getContext$android_sdk_base_release$annotations() {
    }

    public static /* synthetic */ void getDefaultNotificationAccentColor$annotations() {
    }

    private static /* synthetic */ void getServerTarget$annotations() {
    }

    public static /* synthetic */ void getVersionCode$annotations() {
    }
}
