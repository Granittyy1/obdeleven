package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.InterfaceC0927e;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class B implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39320b;

    public /* synthetic */ B(int i10) {
        this.f39320b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39320b) {
            case 0:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$9$lambda$8$lambda$7((p141l2.T) obj);
            case 1:
                return ConversationDestinationKt.conversationDestination$lambda$6((InterfaceC0927e) obj);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$8((InterfaceC0927e) obj);
        }
    }
}
