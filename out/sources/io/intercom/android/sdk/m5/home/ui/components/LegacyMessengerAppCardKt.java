package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewPresenter;
import io.intercom.android.sdk.m5.home.ui.helpers.InMemoryWebViewCacheKt;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LegacyMessengerAppCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LegacyMessengerAppCardKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyMessengerAppCard.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$1", f = "LegacyMessengerAppCard.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        final /* synthetic */ String $urlWithTheme;
        final /* synthetic */ CardWebView $webView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CardWebView cardWebView, String str, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$webView = cardWebView;
            this.$urlWithTheme = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$webView, this.$urlWithTheme, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            this.$webView.loadUrl(this.$urlWithTheme);
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt$LegacyMessengerAppCard$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyMessengerAppCard.kt */
    public static final class AnonymousClass2 implements Ia.q<InterfaceC0954n, InterfaceC1084f, Integer, p293xa.r> {
        final /* synthetic */ CardWebView $webView;

        public AnonymousClass2(CardWebView cardWebView) {
            this.$webView = cardWebView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CardWebView invoke$lambda$0(CardWebView webView, Context it) {
            kotlin.jvm.internal.i.e(webView, "$webView");
            kotlin.jvm.internal.i.e(it, "it");
            return webView;
        }

        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0954n, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0954n IntercomCard, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(IntercomCard, "$this$IntercomCard");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                final CardWebView cardWebView = this.$webView;
                AndroidView_androidKt.b(new Ia.l() { // from class: io.intercom.android.sdk.m5.home.ui.components.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return LegacyMessengerAppCardKt.AnonymousClass2.invoke$lambda$0(cardWebView, (Context) obj);
                    }
                }, null, null, interfaceC1084f, 0, 6);
            }
        }
    }

    public static final void LegacyMessengerAppCard(final String url, final IntercomCardStyle.Style style, final boolean z10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(style, "style");
        C1086g c1086gP = interfaceC1084f.p(-1087658045);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(url) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.K(style) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.c(z10) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            String strAppendInterfaceStyleToUrl = ThemeUtils.appendInterfaceStyleToUrl(context, url);
            CardWebView cachedWebView = InMemoryWebViewCacheKt.getCachedWebView(url);
            c1086gP.L(363582036);
            boolean z11 = false;
            if (cachedWebView != null) {
                z11 = false;
                strAppendInterfaceStyleToUrl = strAppendInterfaceStyleToUrl;
                i12 = i12;
            } else {
                c1086gP.L(363584645);
                Object objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    CardWebView cardWebView = new CardWebView(context);
                    cardWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
                    cardWebView.getSettings().setJavaScriptEnabled(true);
                    cardWebView.getSettings().setUseWideViewPort(true);
                    cardWebView.getSettings().setCacheMode(-1);
                    cardWebView.getSettings().setMixedContentMode(0);
                    cardWebView.setVerticalScrollBarEnabled(false);
                    cardWebView.setHorizontalScrollBarEnabled(false);
                    cardWebView.setWebViewClient(new MessengerCardWebViewClient(url));
                    ComposeView composeView = new ComposeView(context, null, 0, 6);
                    composeView.setContent(ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m304getLambda2$intercom_sdk_base_release());
                    new MessengerCardWebViewPresenter(cardWebView, composeView, url, Injector.get().getAppConfigProvider().get().getPrimaryColor(), Injector.get().getGson(), Injector.get().getMetricTracker(), cardWebView.getContext().getCacheDir(), "", z10, context).setUpWebView();
                    c1086gP.E(cardWebView);
                    objF = cardWebView;
                }
                cachedWebView = (CardWebView) objF;
                c1086gP.T(z11);
                InMemoryWebViewCacheKt.cacheWebView(url, cachedWebView);
            }
            c1086gP.T(z11);
            String str = strAppendInterfaceStyleToUrl;
            E.d(new AnonymousClass1(cachedWebView, str, null), c1086gP, str);
            IntercomCardKt.IntercomCard(null, style, androidx.compose.runtime.internal.a.b(231006519, new AnonymousClass2(cachedWebView), c1086gP), c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384 | (i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 1);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.home.ui.components.h
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LegacyMessengerAppCardKt.LegacyMessengerAppCard$lambda$3(url, style, z10, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r LegacyMessengerAppCard$lambda$3(String url, IntercomCardStyle.Style style, boolean z10, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(url, "$url");
        kotlin.jvm.internal.i.e(style, "$style");
        LegacyMessengerAppCard(url, style, z10, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
