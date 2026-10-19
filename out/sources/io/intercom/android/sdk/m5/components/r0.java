package io.intercom.android.sdk.m5.components;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketsDestinationKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38403b;

    public /* synthetic */ r0(int i10) {
        this.f38403b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38403b) {
            case 0:
                return HomeItemKt.HomeItem$lambda$9$lambda$8((J.e) obj);
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$48((ReplySuggestion) obj);
            case 2:
                return MessageListKt.MessageList$lambda$0((ReplySuggestion) obj);
            case 3:
                return MessagesDestinationKt.messagesDestination$lambda$2((InterfaceC0927e) obj);
            default:
                return TicketsDestinationKt.ticketsDestination$lambda$3((InterfaceC0927e) obj);
        }
    }
}
