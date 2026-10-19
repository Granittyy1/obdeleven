package io.intercom.android.sdk.tickets.list.ui;

import Ia.p;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import io.intercom.android.sdk.models.EmptyState;
import p293xa.r;

/* JADX INFO: compiled from: TicketsEmptyScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$TicketsEmptyScreenKt {
    public static final ComposableSingletons$TicketsEmptyScreenKt INSTANCE = new ComposableSingletons$TicketsEmptyScreenKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f312lambda1 = new ComposableLambdaImpl(false, 222286787, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsEmptyScreenKt$lambda-1$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                TicketsEmptyScreenKt.TicketsEmptyScreen(new EmptyState("No Tickets", "Your tickets will be shown here", null, 4, null), null, interfaceC1084f, 0, 2);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    public static p<InterfaceC1084f, Integer, r> f313lambda2 = new ComposableLambdaImpl(false, 1347292286, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsEmptyScreenKt$lambda-2$1
        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
            } else {
                SurfaceKt.a(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$TicketsEmptyScreenKt.INSTANCE.m491getLambda1$intercom_sdk_base_release(), interfaceC1084f, 12582912, 127);
            }
        }
    });

    /* JADX INFO: renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m491getLambda1$intercom_sdk_base_release() {
        return f312lambda1;
    }

    /* JADX INFO: renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final p<InterfaceC1084f, Integer, r> m492getLambda2$intercom_sdk_base_release() {
        return f313lambda2;
    }
}
