package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2366o implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38795b;

    public /* synthetic */ C2366o(int i10) {
        this.f38795b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38795b) {
            case 0:
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$3((MetricData) obj);
            case 1:
                return CreateTicketDestinationKt.createTicketDestination$lambda$1((C2748s) obj);
            default:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$15((InterfaceC0927e) obj);
        }
    }
}
