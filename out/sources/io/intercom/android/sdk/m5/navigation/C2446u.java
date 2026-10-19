package io.intercom.android.sdk.m5.navigation;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2446u implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39409b;

    public /* synthetic */ C2446u(int i10) {
        this.f39409b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        p141l2.K k10 = (p141l2.K) obj;
        switch (this.f39409b) {
            case 0:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$6$lambda$5(k10);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$onConversationCTAClicked$lambda$1(k10);
        }
    }
}
