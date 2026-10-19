package io.intercom.android.sdk.sheets;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.Gson;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SheetWebViewInterface {
    private static final String CLOSE_SHEET = "close";
    private static final String PAYLOAD_SHEET_TITLE = "title";
    private static final String SHEET_TITLE = "set-title";
    private static final String SUBMIT_SHEET = "submit-sheet";
    private final Api api;
    private final Gson gson;
    private final SheetListener listener;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public SheetWebViewInterface(WebView webView, Gson gson, MetricTracker metricTracker, Api api, SheetListener sheetListener) {
        this.webView = webView;
        this.gson = gson;
        this.listener = sheetListener;
        this.metricTracker = metricTracker;
        this.api = api;
    }

    private boolean isHelpCenterMetric(String str) {
        return HelpCenterWebViewInterface.METRIC_EVENT.equals(str) || HelpCenterWebViewInterface.TRACK_REACTION.equals(str);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        SheetWebViewAction sheetWebViewAction = (SheetWebViewAction) this.gson.d(SheetWebViewAction.class, str);
        String type = sheetWebViewAction.getType();
        final Map<String, Object> payload = sheetWebViewAction.getPayload();
        if (isHelpCenterMetric(type)) {
            new HelpCenterWebViewInterface(this.webView, this.gson, this.metricTracker, this.api, false).handleAction(str);
        }
        if (type == null || payload == null) {
            return;
        }
        switch (type) {
            case "set-title":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onSheetTitleAction(payload.get(SheetWebViewInterface.PAYLOAD_SHEET_TITLE).toString());
                    }
                });
                break;
            case "close":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onCloseSheetAction();
                    }
                });
                break;
            case "submit-sheet":
                this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.sheets.SheetWebViewInterface.3
                    @Override // java.lang.Runnable
                    public void run() {
                        SheetWebViewInterface.this.listener.onSubmitSheetAction(payload);
                    }
                });
                break;
        }
    }
}
