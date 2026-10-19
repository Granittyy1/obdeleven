package androidx.webkit.internal;

import J2.b;
import J2.h;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public enum WebViewFeatureInternal implements b {
    /* JADX INFO: Fake field, exist only in values array */
    VISUAL_STATE_CALLBACK("VISUAL_STATE_CALLBACK", 0, 23),
    /* JADX INFO: Fake field, exist only in values array */
    OFF_SCREEN_PRERASTER("OFF_SCREEN_PRERASTER", 1, 23),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ENABLE("SAFE_BROWSING_ENABLE", 2, 26),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED_ACTION_MODE_MENU_ITEMS("DISABLED_ACTION_MODE_MENU_ITEMS", 3, 24),
    /* JADX INFO: Fake field, exist only in values array */
    START_SAFE_BROWSING("START_SAFE_BROWSING", 4, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED("SAFE_BROWSING_WHITELIST", 5, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED("SAFE_BROWSING_ALLOWLIST", 6, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED("SAFE_BROWSING_WHITELIST", 7, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED("SAFE_BROWSING_ALLOWLIST", 8, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_PRIVACY_POLICY_URL("SAFE_BROWSING_PRIVACY_POLICY_URL", 9, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_BASIC_USAGE("SERVICE_WORKER_BASIC_USAGE", 10, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_CACHE_MODE("SERVICE_WORKER_CACHE_MODE", 11, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_CONTENT_ACCESS("SERVICE_WORKER_CONTENT_ACCESS", 12, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_FILE_ACCESS("SERVICE_WORKER_FILE_ACCESS", 13, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_BLOCK_NETWORK_LOADS("SERVICE_WORKER_BLOCK_NETWORK_LOADS", 14, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 15, 24),
    /* JADX INFO: Fake field, exist only in values array */
    RECEIVE_WEB_RESOURCE_ERROR("RECEIVE_WEB_RESOURCE_ERROR", 16, 23),
    /* JADX INFO: Fake field, exist only in values array */
    RECEIVE_HTTP_ERROR("RECEIVE_HTTP_ERROR", 17, 23),
    /* JADX INFO: Fake field, exist only in values array */
    SHOULD_OVERRIDE_WITH_REDIRECTS("SHOULD_OVERRIDE_WITH_REDIRECTS", 18, 24),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_HIT("SAFE_BROWSING_HIT", 19, 27),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_RESOURCE_REQUEST_IS_REDIRECT("WEB_RESOURCE_REQUEST_IS_REDIRECT", 20, 24),
    WEB_RESOURCE_ERROR_GET_DESCRIPTION("WEB_RESOURCE_ERROR_GET_DESCRIPTION", 21, 23),
    WEB_RESOURCE_ERROR_GET_CODE("WEB_RESOURCE_ERROR_GET_CODE", 22, 23),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 23, 27),
    /* JADX INFO: Fake field, exist only in values array */
    SAFE_BROWSING_RESPONSE_PROCEED("SAFE_BROWSING_RESPONSE_PROCEED", 24, 27),
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 25, 27),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_POST_MESSAGE("WEB_MESSAGE_PORT_POST_MESSAGE", 26, 23),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_CLOSE("WEB_MESSAGE_PORT_CLOSE", 27, 23),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 28, 23),
    /* JADX INFO: Fake field, exist only in values array */
    CREATE_WEB_MESSAGE_CHANNEL("CREATE_WEB_MESSAGE_CHANNEL", 29, 23),
    /* JADX INFO: Fake field, exist only in values array */
    POST_WEB_MESSAGE("POST_WEB_MESSAGE", 30, 23),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_CALLBACK_ON_MESSAGE("WEB_MESSAGE_CALLBACK_ON_MESSAGE", 31, 23),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_VIEW_CLIENT("GET_WEB_VIEW_CLIENT", 32, 26),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_CHROME_CLIENT("GET_WEB_CHROME_CLIENT", 33, 26),
    /* JADX INFO: Fake field, exist only in values array */
    GET_WEB_VIEW_RENDERER("GET_WEB_VIEW_RENDERER", 34, 29),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_RENDERER_TERMINATE("WEB_VIEW_RENDERER_TERMINATE", 35, 29),
    /* JADX INFO: Fake field, exist only in values array */
    TRACING_CONTROLLER_BASIC_USAGE("TRACING_CONTROLLER_BASIC_USAGE", 36, 28),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 37, 29),
    /* JADX INFO: Fake field, exist only in values array */
    PROXY_OVERRIDE("PROXY_OVERRIDE:3", 38, -1),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPRESS_ERROR_PAGE("SUPPRESS_ERROR_PAGE", 39, -1),
    /* JADX INFO: Fake field, exist only in values array */
    MULTI_PROCESS("MULTI_PROCESS_QUERY", 40, -1),
    FORCE_DARK("FORCE_DARK", 41, -1),
    FORCE_DARK_STRATEGY("FORCE_DARK_BEHAVIOR", 42, -1),
    /* JADX INFO: Fake field, exist only in values array */
    WEB_MESSAGE_LISTENER("WEB_MESSAGE_LISTENER", 43, -1),
    /* JADX INFO: Fake field, exist only in values array */
    DOCUMENT_START_SCRIPT("DOCUMENT_START_SCRIPT:1", 44, -1);

    private final String mInternalFeatureValue;
    private final int mOsVersion;
    private final String mPublicFeatureValue;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashSet f20286a = new HashSet(Arrays.asList(h.b.f3966a.b()));
    }

    WebViewFeatureInternal() {
        throw null;
    }

    WebViewFeatureInternal(String str, int i10, int i11) {
        this.mPublicFeatureValue = str;
        this.mInternalFeatureValue = str;
        this.mOsVersion = i11;
    }

    public static UnsupportedOperationException c() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    @Override // J2.b
    public final boolean a() {
        return d() || e();
    }

    @Override // J2.b
    public final String b() {
        return this.mPublicFeatureValue;
    }

    public final boolean d() {
        int i10 = this.mOsVersion;
        return i10 != -1 && Build.VERSION.SDK_INT >= i10;
    }

    public final boolean e() {
        HashSet hashSet = a.f20286a;
        String str = this.mInternalFeatureValue;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
