package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.InterfaceC0927e;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39321b;

    public /* synthetic */ C(int i10) {
        this.f39321b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39321b) {
            case 0:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9$lambda$8((p141l2.K) obj);
            case 1:
                return ConversationDestinationKt.conversationDestination$lambda$7((InterfaceC0927e) obj);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$9((C2748s) obj);
        }
    }
}
