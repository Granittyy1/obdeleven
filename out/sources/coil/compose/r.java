package coil.compose;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22829b;

    public /* synthetic */ r(int i10) {
        this.f22829b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f22829b) {
            case 0:
                return p293xa.r.f47939a;
            case 1:
                return ConversationScreenKt.ConversationScreen$lambda$6((String) obj);
            case 2:
                return ConversationDestinationKt.conversationDestination$lambda$5((C2748s) obj);
            case 3:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$7((InterfaceC0927e) obj);
            default:
                return TicketDetailContentKt.TicketDetailContent$lambda$0((String) obj);
        }
    }
}
