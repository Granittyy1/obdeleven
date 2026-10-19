package io.intercom.android.sdk.m5.conversation.ui;

import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.ui.components.MediaInputSheetContentKt;
import io.intercom.android.sdk.m5.push.IntercomNotificationHandler;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2406v implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39098c;

    public /* synthetic */ C2406v(int i10, Object obj) {
        this.f39097b = i10;
        this.f39098c = obj;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f39097b) {
            case 0:
                return ConversationScreenKt.ConversationScreen$lambda$21((ConversationViewModel) this.f39098c, (ReplyOption) obj);
            case 1:
                return MediaInputSheetContentKt.MediaInputSheetContent$lambda$21$lambda$20$lambda$17$lambda$16((Ia.l) this.f39098c, (List) obj);
            case 2:
                return Boolean.valueOf(IntercomNotificationHandler.updateConversations$lambda$6((IntercomPushConversation) this.f39098c, (IntercomPushConversation) obj));
            default:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                return Boolean.valueOf(!((p141l2.z) this.f39098c).c().contains(key));
        }
    }
}
