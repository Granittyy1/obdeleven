package androidx.webkit;

import Bb.a;
import I2.b;
import J2.e;
import J2.f;
import J2.h;
import J2.k;
import J2.l;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        f fVar = new f();
        fVar.f3964b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, fVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        e eVar = new e();
        eVar.f3962b = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i10, eVar);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        f fVar = new f();
        fVar.f3963a = webResourceError;
        onReceivedError(webView, webResourceRequest, fVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        e eVar = new e();
        eVar.f3961a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i10, eVar);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, b bVar) {
        int errorCode;
        CharSequence description;
        if (I2.e.k("WEB_RESOURCE_ERROR_GET_CODE") && I2.e.k("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            f fVar = (f) bVar;
            fVar.getClass();
            WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_CODE;
            if (webViewFeatureInternal.d()) {
                if (fVar.f3963a == null) {
                    l lVar = h.a.f3965a;
                    fVar.f3963a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) lVar.f3968a).convertWebResourceError(Proxy.getInvocationHandler(fVar.f3964b));
                }
                errorCode = fVar.f3963a.getErrorCode();
            } else if (webViewFeatureInternal.e()) {
                if (fVar.f3964b == null) {
                    l lVar2 = h.a.f3965a;
                    fVar.f3964b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) lVar2.f3968a).convertWebResourceError(fVar.f3963a));
                }
                errorCode = fVar.f3964b.getErrorCode();
            } else {
                throw WebViewFeatureInternal.c();
            }
            WebViewFeatureInternal webViewFeatureInternal2 = WebViewFeatureInternal.WEB_RESOURCE_ERROR_GET_DESCRIPTION;
            if (webViewFeatureInternal2.d()) {
                if (fVar.f3963a == null) {
                    l lVar3 = h.a.f3965a;
                    fVar.f3963a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) lVar3.f3968a).convertWebResourceError(Proxy.getInvocationHandler(fVar.f3964b));
                }
                description = fVar.f3963a.getDescription();
            } else if (webViewFeatureInternal2.e()) {
                if (fVar.f3964b == null) {
                    l lVar4 = h.a.f3965a;
                    fVar.f3964b = (WebResourceErrorBoundaryInterface) a.a(WebResourceErrorBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) lVar4.f3968a).convertWebResourceError(fVar.f3963a));
                }
                description = fVar.f3964b.getDescription();
            } else {
                throw WebViewFeatureInternal.c();
            }
            onReceivedError(webView, errorCode, description.toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, I2.a aVar) {
        if (I2.e.k("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            e eVar = (e) aVar;
            eVar.getClass();
            WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL;
            if (webViewFeatureInternal.d()) {
                if (eVar.f3961a == null) {
                    l lVar = h.a.f3965a;
                    eVar.f3961a = k.a(((WebkitToCompatConverterBoundaryInterface) lVar.f3968a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(eVar.f3962b)));
                }
                eVar.f3961a.showInterstitial(true);
                return;
            }
            if (webViewFeatureInternal.e()) {
                if (eVar.f3962b == null) {
                    l lVar2 = h.a.f3965a;
                    eVar.f3962b = (SafeBrowsingResponseBoundaryInterface) a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) lVar2.f3968a).convertSafeBrowsingResponse(eVar.f3961a));
                }
                eVar.f3962b.showInterstitial(true);
                return;
            }
            throw WebViewFeatureInternal.c();
        }
        throw WebViewFeatureInternal.c();
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
