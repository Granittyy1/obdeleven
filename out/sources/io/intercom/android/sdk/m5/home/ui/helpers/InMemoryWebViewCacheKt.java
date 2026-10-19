package io.intercom.android.sdk.m5.home.ui.helpers;

import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: InMemoryWebViewCache.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InMemoryWebViewCacheKt {
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(String url, CardWebView webView) {
        i.e(url, "url");
        i.e(webView, "webView");
        webViewCache.put(getIdFromURL(url), webView);
    }

    public static final void clearWebViewCache() {
        webViewCache.clear();
    }

    public static final CardWebView getCachedWebView(String url) {
        i.e(url, "url");
        return webViewCache.get(getIdFromURL(url));
    }

    private static final String getIdFromURL(String str) {
        return n.n0(n.k0(str, "card_id="), "&token");
    }
}
