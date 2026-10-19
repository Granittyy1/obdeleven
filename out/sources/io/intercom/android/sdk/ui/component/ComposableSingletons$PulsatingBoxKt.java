package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.InterfaceC0948h;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;

/* JADX INFO: compiled from: PulsatingBox.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ComposableSingletons$PulsatingBoxKt {
    public static final ComposableSingletons$PulsatingBoxKt INSTANCE = new ComposableSingletons$PulsatingBoxKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r> f332lambda1 = new ComposableLambdaImpl(false, -188171614, new Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-1$1
        @Override // Ia.q
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC0948h interfaceC0948h, InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC0948h, interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC0948h PulsatingBox, InterfaceC1084f interfaceC1084f, int i10) {
            kotlin.jvm.internal.i.e(PulsatingBox, "$this$PulsatingBox");
            if ((i10 & 81) == 16 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                BoxKt.a(C0932d.b(W.m(androidx.compose.ui.h.a.f13984b, 100), H.f13499f, h0.f13629a), interfaceC1084f, 6);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f333lambda2 = new ComposableLambdaImpl(false, -579145229, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PulsatingBoxKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                PulsatingBoxKt.m546PulsatingBoxFU0evQE(null, 1.5f, 0L, null, true, ComposableSingletons$PulsatingBoxKt.INSTANCE.m520getLambda1$intercom_sdk_ui_release(), interfaceC1084f, 221232, 13);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.q<InterfaceC0948h, InterfaceC1084f, Integer, p293xa.r> m520getLambda1$intercom_sdk_ui_release() {
        return f332lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m521getLambda2$intercom_sdk_ui_release() {
        return f333lambda2;
    }
}
