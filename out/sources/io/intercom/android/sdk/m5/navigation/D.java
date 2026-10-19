package io.intercom.android.sdk.m5.navigation;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39322b;

    public /* synthetic */ D(int i10) {
        this.f39322b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        p141l2.T t8 = (p141l2.T) obj;
        switch (this.f39322b) {
            case 0:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12$lambda$11$lambda$10(t8);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(t8);
        }
    }
}
