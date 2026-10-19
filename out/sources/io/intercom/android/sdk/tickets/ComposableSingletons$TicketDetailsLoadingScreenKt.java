package io.intercom.android.sdk.tickets;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;

/* JADX INFO: compiled from: TicketDetailsLoadingScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketDetailsLoadingScreenKt {
    public static final ComposableSingletons$TicketDetailsLoadingScreenKt INSTANCE = new ComposableSingletons$TicketDetailsLoadingScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static Ia.p<InterfaceC1084f, Integer, p293xa.r> f295lambda1 = new ComposableLambdaImpl(false, -1191759107, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.tickets.ComposableSingletons$TicketDetailsLoadingScreenKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return p293xa.r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(null, interfaceC1084f, 0, 1);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Ia.p<InterfaceC1084f, Integer, p293xa.r> m467getLambda1$intercom_sdk_base_release() {
        return f295lambda1;
    }
}
