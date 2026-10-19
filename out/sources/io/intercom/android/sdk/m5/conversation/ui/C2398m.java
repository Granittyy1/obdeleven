package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.navigation.ConversationDestinationKt;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.ui.PreviewRootScreenKt;
import p141l2.C2748s;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2398m implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39086b;

    public /* synthetic */ C2398m(int i10) {
        this.f39086b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39086b) {
            case 0:
                return ConversationScreenKt.ConversationScreenContent$lambda$52((Block) obj);
            case 1:
                return LazyMessageListKt.LazyMessageList$lambda$1((ReplyOption) obj);
            case 2:
                return MessageListKt.MessageList$lambda$1((ReplyOption) obj);
            case 3:
                return ConversationDestinationKt.conversationDestination$lambda$0((C2748s) obj);
            case 4:
                return TicketDetailDestinationKt.ticketDetailDestination$lambda$16((InterfaceC0927e) obj);
            case 5:
                return PreviewRootScreenKt.PreviewRootScreenPreview$lambda$4((IntercomPreviewFile) obj);
            default:
                p014b1.a initializer = (p014b1.a) obj;
                kotlin.jvm.internal.i.e(initializer, "$this$initializer");
                return new n2.c.a(androidx.lifecycle.N.a(initializer));
        }
    }
}
