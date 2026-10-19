package com.braze.ui.inappmessage.utils;

import Aa.c;
import I2.d;
import Ia.a;
import Ia.l;
import Ia.p;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.q0;
import p293xa.r;

/* JADX INFO: compiled from: InAppMessageWebViewClient.kt */
/* JADX INFO: loaded from: classes.dex */
public class InAppMessageWebViewClient extends WebViewClientCompat {
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String AUTHORITY_NAME_NEWSFEED = "feed";
    private static final String BRAZE_INAPP_MESSAGE_SCHEME = "appboy";
    private static final String BRIDGE_JS_FILE = "braze-html-in-app-message-bridge.js";
    public static final Companion Companion = new Companion(null);
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final d assetLoader;
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private InterfaceC2694i0 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private IWebViewClientStateListener webViewClientStateListener;

    /* JADX INFO: compiled from: InAppMessageWebViewClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Bundle getBundleFromUrl(String url) {
            i.e(url, "url");
            Bundle bundle = new Bundle();
            if (n.S(url)) {
                return bundle;
            }
            Uri uri = Uri.parse(url);
            i.d(uri, "uri");
            for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(uri).entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: InAppMessageWebViewClient.kt */
    @c(c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1", f = "InAppMessageWebViewClient.kt", l = {151}, m = "invokeSuspend")
    public static final class C17581 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: InAppMessageWebViewClient.kt */
        @c(c = "com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$setWebViewClientStateListener$1$1", f = "InAppMessageWebViewClient.kt", l = {}, m = "invokeSuspend")
        public static final class C02561 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
            int label;
            final /* synthetic */ InAppMessageWebViewClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02561(InAppMessageWebViewClient inAppMessageWebViewClient, kotlin.coroutines.c<? super C02561> cVar) {
                super(2, cVar);
                this.this$0 = inAppMessageWebViewClient;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
                return new C02561(this.this$0, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                this.this$0.markPageFinished();
                return r.f47939a;
            }

            @Override // Ia.p
            public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
                return ((C02561) create(a10, cVar)).invokeSuspend(r.f47939a);
            }
        }

        public C17581(kotlin.coroutines.c<? super C17581> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
            return InAppMessageWebViewClient.this.new C17581(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                b.b(obj);
                Sa.b bVar = N.f43198a;
                q0 q0Var = q.f43500a;
                C02561 c02561 = new C02561(InAppMessageWebViewClient.this, null);
                this.label = 1;
                if (C2680e.f(q0Var, c02561, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.l
        public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
            return ((C17581) create(cVar)).invokeSuspend(r.f47939a);
        }
    }

    public /* synthetic */ InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str, int i10, e eVar) {
        this(context, iInAppMessage, iInAppMessageWebViewClientListener, (i10 & 8) != 0 ? null : str);
    }

    private final void appendBridgeJavascript(WebView webView) {
        try {
            AssetManager assets = this.context.getAssets();
            i.d(assets, "context.assets");
            webView.loadUrl(JAVASCRIPT_PREFIX + BrazeFileUtils.getAssetFileStringContents(assets, BRIDGE_JS_FILE));
        } catch (Exception e10) {
            BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e10, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$appendBridgeJavascript$javascriptString$1
                @Override // Ia.a
                public final String invoke() {
                    return "Failed to get HTML in-app message javascript additions";
                }
            });
        }
    }

    public static final Bundle getBundleFromUrl(String str) {
        return Companion.getBundleFromUrl(str);
    }

    private final boolean handleUrlOverride(String str) {
        if (this.inAppMessageWebViewClientListener == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.1
                @Override // Ia.a
                public final String invoke() {
                    return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
                }
            }, 2, (Object) null);
            return true;
        }
        if (n.S(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.2
                @Override // Ia.a
                public final String invoke() {
                    return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
                }
            }, 2, (Object) null);
            return true;
        }
        final Uri uri = Uri.parse(str);
        Bundle bundleFromUrl = Companion.getBundleFromUrl(str);
        if (uri.getScheme() == null || !i.a(uri.getScheme(), BRAZE_INAPP_MESSAGE_SCHEME)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Uri scheme was null or not an appboy url. Uri: " + uri;
                }
            }, 3, (Object) null);
            this.inAppMessageWebViewClientListener.onOtherUrlAction(this.inAppMessage, str, bundleFromUrl);
            return true;
        }
        String authority = uri.getAuthority();
        if (authority != null) {
            int iHashCode = authority.hashCode();
            if (iHashCode != -1801488983) {
                if (iHashCode != 3138974) {
                    if (iHashCode == 94756344 && authority.equals(AUTHORITY_NAME_CLOSE)) {
                        this.inAppMessageWebViewClientListener.onCloseAction(this.inAppMessage, str, bundleFromUrl);
                    }
                } else if (authority.equals(AUTHORITY_NAME_NEWSFEED)) {
                    this.inAppMessageWebViewClientListener.onNewsfeedAction(this.inAppMessage, str, bundleFromUrl);
                }
            } else if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                this.inAppMessageWebViewClientListener.onCustomEventAction(this.inAppMessage, str, bundleFromUrl);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.handleUrlOverride.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final String invoke() {
                    return "Uri authority was null. Uri: " + uri;
                }
            }, 3, (Object) null);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$markPageFinished$1$1
            @Override // Ia.a
            public final String invoke() {
                return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
            }
        }, 2, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        i.e(view, "view");
        i.e(url, "url");
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onPageFinished$1$1
                @Override // Ia.a
                public final String invoke() {
                    return "Page has finished loading. Calling onPageFinished on listener";
                }
            }, 2, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        this.hasPageFinishedLoading = true;
        InterfaceC2694i0 interfaceC2694i0 = this.markPageFinishedJob;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        this.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        i.e(view, "view");
        i.e(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new a<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient.onRenderProcessGone.1
            @Override // Ia.a
            public final String invoke() {
                return "The webview rendering process crashed, returning true";
            }
        }, 2, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener iWebViewClientStateListener) {
        if (iWebViewClientStateListener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            iWebViewClientStateListener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new C17581(null), 2, null);
        }
        this.webViewClientStateListener = iWebViewClientStateListener;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            return this.assetLoader.a(webResourceRequest.getUrl());
        }
        return null;
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        i.e(view, "view");
        i.e(request, "request");
        String string = request.getUrl().toString();
        i.d(string, "request.url.toString()");
        return handleUrlOverride(string);
    }

    public InAppMessageWebViewClient(Context context, IInAppMessage inAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str) {
        d dVar;
        i.e(context, "context");
        i.e(inAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = inAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d.b("/", new d.a(context, new File(str))));
            dVar = new d(arrayList);
        } else {
            File file = new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new d.b("/ab_triggers/", new d.a(context, file)));
            dVar = new d(arrayList2);
        }
        this.assetLoader = dVar;
    }

    @Override // android.webkit.WebViewClient
    @p293xa.d
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.assetLoader.a(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        i.e(view, "view");
        i.e(url, "url");
        return handleUrlOverride(url);
    }
}
