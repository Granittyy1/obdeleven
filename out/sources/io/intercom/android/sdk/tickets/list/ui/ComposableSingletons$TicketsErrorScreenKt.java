package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.components.ErrorState;
import p293xa.r;

/* JADX INFO: compiled from: TicketsErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketsErrorScreenKt {
    public static final ComposableSingletons$TicketsErrorScreenKt INSTANCE = new ComposableSingletons$TicketsErrorScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f314lambda1 = new ComposableLambdaImpl(false, 268742023, ComposableSingletons$TicketsErrorScreenKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f315lambda2 = new ComposableLambdaImpl(false, 101741039, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsErrorScreenKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TicketsErrorScreenKt.TicketsErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, interfaceC1084f, 0, 2);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m493getLambda1$intercom_sdk_base_release() {
        return f314lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m494getLambda2$intercom_sdk_base_release() {
        return f315lambda2;
    }
}
