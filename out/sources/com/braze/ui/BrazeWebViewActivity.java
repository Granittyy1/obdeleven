package com.braze.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.ActivityC1347l;
import com.braze.Constants;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.ViewUtils;
import kotlin.collections.q;

/* JADX INFO: compiled from: BrazeWebViewActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public class BrazeWebViewActivity extends ActivityC1347l {
    public WebChromeClient createWebChromeClient() {
        return new WebChromeClient() { // from class: com.braze.ui.BrazeWebViewActivity.createWebChromeClient.1
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                kotlin.jvm.internal.i.e(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebChromeClient$1$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Braze WebView Activity log. Line: " + cm.lineNumber() + ". SourceId: " + cm.sourceId() + ". Log Level: " + cm.messageLevel() + ". Message: " + cm.message();
                    }
                }, 3, (Object) null);
                return true;
            }
        };
    }

    public WebViewClient createWebViewClient() {
        return new WebViewClient() { // from class: com.braze.ui.BrazeWebViewActivity.createWebViewClient.1
            private final Boolean handleUrlOverride(Context context, final String str) {
                try {
                    if (q.J(BrazeFileUtils.REMOTE_SCHEMES, Uri.parse(str).getScheme())) {
                        return null;
                    }
                    UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(str, BrazeWebViewActivity.this.getIntent().getExtras(), false, Channel.UNKNOWN);
                    if (uriActionCreateUriActionFromUrlString == null) {
                        return Boolean.FALSE;
                    }
                    uriActionCreateUriActionFromUrlString.execute(context);
                    BrazeWebViewActivity.this.finish();
                    return Boolean.TRUE;
                } catch (Exception e10) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new Ia.a<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$handleUrlOverride$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final String invoke() {
                            return Q8.d.a(new StringBuilder("Unexpected exception while processing url "), str, ". Passing url back to WebView.");
                        }
                    });
                    return null;
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(detail, "detail");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.BrazeWebViewActivity$createWebViewClient$1$onRenderProcessGone$1
                    @Override // Ia.a
                    public final String invoke() {
                        return "The webview rendering process crashed, returning true";
                    }
                }, 2, (Object) null);
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(request, "request");
                Context context = view.getContext();
                kotlin.jvm.internal.i.d(context, "view.context");
                String string = request.getUrl().toString();
                kotlin.jvm.internal.i.d(string, "request.url.toString()");
                Boolean boolHandleUrlOverride = handleUrlOverride(context, string);
                return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, request);
            }

            @Override // android.webkit.WebViewClient
            @p293xa.d
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                kotlin.jvm.internal.i.e(view, "view");
                kotlin.jvm.internal.i.e(url, "url");
                Context context = view.getContext();
                kotlin.jvm.internal.i.d(context, "view.context");
                Boolean boolHandleUrlOverride = handleUrlOverride(context, url);
                return boolHandleUrlOverride != null ? boolHandleUrlOverride.booleanValue() : super.shouldOverrideUrlLoading(view, url);
            }
        };
    }

    @Override // androidx.fragment.app.ActivityC1347l, androidx.activity.ComponentActivity, androidx.core.app.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        setContentView(R.layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(R.id.com_braze_webview_activity_webview);
        webView.setLayerType(2, null);
        WebSettings settings = webView.getSettings();
        kotlin.jvm.internal.i.d(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "this.applicationContext");
        if (ViewUtils.isDeviceInNightMode(applicationContext)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i10 >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA)) == null) {
            return;
        }
        webView.loadUrl(string);
    }
}
