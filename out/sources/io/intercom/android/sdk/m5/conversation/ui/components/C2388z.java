package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.HelpCenterDestinationKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2388z implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39014b;

    public /* synthetic */ C2388z(int i10) {
        this.f39014b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39014b) {
            case 0:
                return LazyMessageListKt.LazyMessageList$lambda$0((ReplySuggestion) obj);
            case 1:
                return Integer.valueOf(MessageListKt.MessageList$lambda$38$lambda$37$lambda$36(((Integer) obj).intValue()));
            case 2:
                return ConversationDestinationKt.conversationDestination$lambda$8((InterfaceC0927e) obj);
            default:
                return HelpCenterDestinationKt.helpCenterDestination$lambda$5((InterfaceC0927e) obj);
        }
    }
}
