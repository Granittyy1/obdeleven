package com.braze.ui.inappmessage.views;

import J2.h;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.view.n0;
import androidx.fragment.app.RunnableC1341f;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.ViewUtils;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p005a4.q;

/* JADX INFO: compiled from: InAppMessageHtmlBaseView.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    public static final String BRAZE_BRIDGE_PREFIX = "brazeInternalBridge";
    public static final Companion Companion = new Companion(null);
    private static final String FINISHED_WEBVIEW_URL = "about:blank";
    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    /* JADX INFO: compiled from: InAppMessageHtmlBaseView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        inAppMessageHtmlBaseView.setWebViewContent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDirectionalNavigation$lambda$1(WebView webView) {
        i.e(webView, "$webView");
        webView.requestFocus();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(n0 insets) {
        i.e(insets, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        i.d(context, "this.context");
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            i.c(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        i.e(event, "event");
        if (isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.finishWebViewDisplay.1
            @Override // Ia.a
            public final String invoke() {
                return "Finishing WebView display";
            }
        }, 3, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl(FINISHED_WEBVIEW_URL);
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot return the WebView for an already finished message";
                }
            }, 2, (Object) null);
            return null;
        }
        final int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$2
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot find WebView. getWebViewViewId() returned 0.";
                }
            }, 3, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return q.c(new StringBuilder("findViewById for "), webViewViewId, " returned null. Returning null for WebView.");
                }
            }, 3, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        i.d(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        try {
            if (I2.e.k("FORCE_DARK")) {
                Context context = getContext();
                i.d(context, "context");
                if (ViewUtils.isDeviceInNightMode(context)) {
                    WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.FORCE_DARK;
                    if (webViewFeatureInternal.d()) {
                        settings.setForceDark(2);
                    } else {
                        if (!webViewFeatureInternal.e()) {
                            throw WebViewFeatureInternal.c();
                        }
                        ((WebSettingsBoundaryInterface) Bb.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) h.a.f3965a.f3968a).convertSettings(settings))).setForceDark(2);
                    }
                }
            }
            if (I2.e.k("FORCE_DARK_STRATEGY")) {
                if (!WebViewFeatureInternal.FORCE_DARK_STRATEGY.e()) {
                    throw WebViewFeatureInternal.c();
                }
                ((WebSettingsBoundaryInterface) Bb.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) h.a.f3965a.f3968a).convertSettings(settings))).setForceDarkBehavior(1);
            }
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$4
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to set dark mode WebView settings";
                }
            });
        }
        Context context2 = getContext();
        i.d(context2, "this.context");
        final boolean zIsHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (zIsHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$5
                @Override // Ia.a
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget enabled";
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6
                @Override // Ia.a
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget not enabled";
                }
            }, 2, (Object) null);
        }
        webView2.setWebChromeClient(new WebChromeClient() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                i.d(bitmapCreateBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
                return bitmapCreateBitmap;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                i.e(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.this$0, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final String invoke() {
                        return "Braze HTML In-app Message log. Line: " + cm.lineNumber() + ". SourceId: " + cm.sourceId() + ". Log Level: " + cm.messageLevel() + ". Message: " + cm.message();
                    }
                }, 3, (Object) null);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView3, boolean z10, boolean z11, Message message) {
                if (!zIsHtmlInAppMessageHtmlLinkTargetEnabled) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$1
                        @Override // Ia.a
                        public final String invoke() {
                            return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
                        }
                    }, 2, (Object) null);
                    return super.onCreateWindow(webView3, z10, z11, message);
                }
                if (webView3 == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$2
                        @Override // Ia.a
                        public final String invoke() {
                            return "onCreateWindow webView is null, not opening link";
                        }
                    }, 2, (Object) null);
                } else {
                    final WebView.HitTestResult hitTestResult = webView3.getHitTestResult();
                    i.d(hitTestResult, "view.hitTestResult");
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                    BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final String invoke() {
                            return "onCreateWindow HitTestResult is " + hitTestResult;
                        }
                    }, 2, (Object) null);
                    int type = hitTestResult.getType();
                    if (type == 2) {
                        this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + hitTestResult.getExtra())));
                    } else if (type == 4) {
                        this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + hitTestResult.getExtra())));
                    } else if (type != 7) {
                        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final String invoke() {
                                return "onCreateWindow: hitTestResult type was " + hitTestResult.getType() + ". Not doing anything.";
                            }
                        }, 2, (Object) null);
                    } else {
                        this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(hitTestResult.getExtra())));
                    }
                }
                return false;
            }
        });
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        i.e(event, "event");
        if (i10 == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(i10, event);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z10) {
        this.hasAppliedWindowInsets = z10;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener iWebViewClientStateListener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(iWebViewClientStateListener);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        i.e(inAppMessageWebViewClient, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }

    public final void setupDirectionalNavigation() {
        WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new RunnableC1341f(3, messageWebView));
    }

    public void setWebViewContent(String str, String str2) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Ia.a<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView.setWebViewContent.1
                @Override // Ia.a
                public final String invoke() {
                    return "Cannot load WebView. htmlBody was null.";
                }
            }, 3, (Object) null);
            return;
        }
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.loadDataWithBaseURL("https://iamcache.braze/", str, HTML_MIME_TYPE, HTML_ENCODING, null);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }
}
