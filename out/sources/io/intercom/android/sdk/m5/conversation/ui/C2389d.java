package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;
import io.intercom.android.sdk.models.ReplyOption;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2389d implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39015b;

    public /* synthetic */ C2389d(int i10) {
        this.f39015b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39015b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$49((ReplyOption) obj);
            case 1:
                return MessageListKt.MessageList$lambda$6((TicketType) obj);
            case 2:
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$1((C2748s) obj);
            case 3:
                return MessagesDestinationKt.messagesDestination$lambda$4((InterfaceC0927e) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$5((InterfaceC0927e) obj);
        }
    }
}
