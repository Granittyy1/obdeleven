package io.intercom.android.sdk.helpcenter.webview;

import L9.a;
import L9.b;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.Gson;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final Gson gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, Gson gson, MetricTracker metricTracker, Api api, boolean z10) {
        this.webView = webView;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.api = api;
        this.isFromSearchBrowse = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$0(Map map) {
        String str = (String) map.get("action");
        String str2 = (String) map.get("object");
        String str3 = (String) map.get("place");
        HashMap map2 = new HashMap();
        if (map.get("metadata") instanceof Map) {
            map2.putAll((Map) map.get("metadata"));
        }
        if (this.isFromSearchBrowse) {
            map2.put(ConstantsKt.KEY_ARTICLE_SOURCE, "search_browse");
        }
        this.metricTracker.educateWebviewMetric(str, str2, str3, map2, MetricTracker.Context.FROM_HELP_CENTER_WEBVIEW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleAction$1(Map map) {
        Double d10 = (Double) map.get("article_id");
        Double d11 = (Double) map.get("article_content_id");
        Double d12 = (Double) map.get("reaction_index");
        if (d10 == null || d11 == null || d12 == null) {
            return;
        }
        this.api.reactToLink(String.valueOf(d10.intValue()), String.valueOf(d11.intValue()), d12.intValue(), true);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        int i10 = 0;
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.d(HelpCenterWebViewAction.class, str);
        String type = helpCenterWebViewAction.getType();
        Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type == null || value == null) {
            return;
        }
        if (type.equals(TRACK_REACTION)) {
            this.webView.post(new b(this, i10, value));
        } else if (type.equals(METRIC_EVENT)) {
            this.webView.post(new a(this, i10, value));
        }
    }
}
