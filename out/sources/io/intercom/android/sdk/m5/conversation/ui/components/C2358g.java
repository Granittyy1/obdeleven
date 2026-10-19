package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.text.InterfaceC1000i;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2358g implements Ia.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38769b;

    public /* synthetic */ C2358g(int i10) {
        this.f38769b = i10;
    }

    @Override // Ia.l
    public final Object invoke(Object obj) {
        switch (this.f38769b) {
            case 0:
                return ConversationKebabKt.ConversationKebab_cf5BqRc$lambda$0((HeaderMenuItem) obj);
            case 1:
                return MessageMetadataKt.MessageMetadata$lambda$4$lambda$1$lambda$0((androidx.compose.ui.semantics.w) obj);
            case 2:
                return BubbleMessageRowKt.BubbleMessageRow$lambda$1((PendingMessage.FailedImageUploadData) obj);
            default:
                return LongTextQuestionKt.LongTextQuestion$lambda$0((InterfaceC1000i) obj);
        }
    }
}
