package io.intercom.android.sdk.m5.components;

import androidx.compose.animation.InterfaceC0927e;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterScreenKt;
import io.intercom.android.sdk.m5.navigation.MessagesDestinationKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import p141l2.C2748s;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38214b;

    public /* synthetic */ N(int i10) {
        this.f38214b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38214b) {
            case 0:
                return ConversationHistoryCardKt.ConversationHistoryCard$lambda$0((Conversation) obj);
            case 1:
                return ConversationScreenKt.ConversationScreenContent$lambda$68((String) obj);
            case 2:
                return MessageListKt.MessageList$lambda$7((String) obj);
            case 3:
                return HelpCenterScreenKt.HelpCenterNavGraph$lambda$3$lambda$2((C2748s) obj);
            case 4:
                return MessagesDestinationKt.messagesDestination$lambda$5((InterfaceC0927e) obj);
            default:
                return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$0((AnswerClickData) obj);
        }
    }
}
