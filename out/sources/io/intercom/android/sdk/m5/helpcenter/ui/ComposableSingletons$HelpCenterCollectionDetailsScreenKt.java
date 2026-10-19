package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.helpcenter.ui.components.BrowseAllHelpTopicsComponentKt;

/* JADX INFO: compiled from: HelpCenterCollectionDetailsScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$HelpCenterCollectionDetailsScreenKt {
    public static final ComposableSingletons$HelpCenterCollectionDetailsScreenKt INSTANCE = new ComposableSingletons$HelpCenterCollectionDetailsScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f162lambda1 = new ComposableLambdaImpl(false, 904350452, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-1$1
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
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f163lambda2 = new ComposableLambdaImpl(false, -1111496463, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-2$1
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

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    public static Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> f164lambda3 = new ComposableLambdaImpl(false, 999489967, new Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterCollectionDetailsScreenKt$lambda-3$1
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
                BrowseAllHelpTopicsComponentKt.BrowseAllHelpTopicsComponent(PaddingKt.j(androidx.compose.ui.h.a.f13984b, 0.0f, 24, 0.0f, 0.0f, 13), interfaceC1084f, 6, 0);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m262getLambda1$intercom_sdk_base_release() {
        return f162lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m263getLambda2$intercom_sdk_base_release() {
        return f163lambda2;
    }

    /* JADX INFO: renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.q<androidx.compose.foundation.lazy.b, InterfaceC1084f, Integer, p293xa.r> m264getLambda3$intercom_sdk_base_release() {
        return f164lambda3;
    }
}
