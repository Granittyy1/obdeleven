package io.intercom.android.sdk.m5.navigation;

import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2430d implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39372b;

    public /* synthetic */ C2430d(int i10) {
        this.f39372b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39372b) {
            case 0:
                return ConversationDestinationKt.AnonymousClass11.invoke$lambda$9$lambda$8$lambda$7((p141l2.T) obj);
            case 1:
                return HomeScreenDestinationKt.AnonymousClass1.invoke$lambda$12$lambda$11((p141l2.K) obj);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$11((C2748s) obj);
        }
    }
}
