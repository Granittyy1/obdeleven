package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: HelpCenterCollectionsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterCollectionsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f165lambda1 = new ComposableLambdaImpl(false, -1194363873, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(item, "$this$item");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                HelpCenterLoadingScreenKt.HelpCenterLoadingScreen(null, interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f166lambda2 = new ComposableLambdaImpl(false, 493330652, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionsScreenKt$lambda-2$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.foundation.lazy.b bVar, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(bVar, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(androidx.compose.foundation.lazy.b item, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(item, "$this$item");
            if ((i10 & 14) == 0) {
                i10 |= interfaceC1084f.K(item) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                HelpCenterEmptyScreenKt.HelpCenterEmptyScreen(item.c(1.0f), interfaceC1084f, 0, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m265getLambda1$intercom_sdk_base_release() {
        return f165lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m266getLambda2$intercom_sdk_base_release() {
        return f166lambda2;
    }
}
