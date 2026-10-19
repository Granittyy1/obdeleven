package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.foundation.text.InterfaceC1000i;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2326c implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38499b;

    public /* synthetic */ C2326c(int i10) {
        this.f38499b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38499b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$67((TicketType) obj);
            case 1:
                return MessagesDestinationKt.messagesDestination$lambda$3((InterfaceC0927e) obj);
            case 2:
                return TicketsDestinationKt.ticketsDestination$lambda$4((InterfaceC0927e) obj);
            case 3:
                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$0((InterfaceC1000i) obj);
            default:
                return TicketProgressIndicatorKt.TicketProgressIndicator_3IgeMak$lambda$7$lambda$6$lambda$5((J.e) obj);
        }
    }
}
