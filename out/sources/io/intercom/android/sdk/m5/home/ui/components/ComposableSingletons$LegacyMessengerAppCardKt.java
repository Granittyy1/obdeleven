package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: LegacyMessengerAppCard.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$LegacyMessengerAppCardKt {
    public static final ComposableSingletons$LegacyMessengerAppCardKt INSTANCE = new ComposableSingletons$LegacyMessengerAppCardKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f194lambda1 = new ComposableLambdaImpl(false, -2243322, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                ProgressIndicatorKt.a(null, 0L, 0.0f, 0L, 0, 0, interfaceC1084f, 31);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f195lambda2 = new ComposableLambdaImpl(false, -112273700, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$LegacyMessengerAppCardKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LegacyMessengerAppCardKt.INSTANCE.m303getLambda1$intercom_sdk_base_release(), interfaceC1084f, 3072, 7);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m303getLambda1$intercom_sdk_base_release() {
        return f194lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m304getLambda2$intercom_sdk_base_release() {
        return f195lambda2;
    }
}
