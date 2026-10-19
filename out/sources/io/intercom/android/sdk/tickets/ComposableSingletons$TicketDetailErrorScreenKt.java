package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.m5.components.ErrorState;

/* JADX INFO: compiled from: TicketDetailErrorScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketDetailErrorScreenKt {
    public static final ComposableSingletons$TicketDetailErrorScreenKt INSTANCE = new ComposableSingletons$TicketDetailErrorScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f293lambda1 = new ComposableLambdaImpl(false, 694314567, ComposableSingletons$TicketDetailErrorScreenKt$lambda1$1.INSTANCE);

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f294lambda2 = new ComposableLambdaImpl(false, 1954525355, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailErrorScreenKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(new ErrorState.WithoutCTA(0, 0, null, 7, null), null, interfaceC1084f, 0, 2);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m465getLambda1$intercom_sdk_base_release() {
        return f293lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m466getLambda2$intercom_sdk_base_release() {
        return f294lambda2;
    }
}
