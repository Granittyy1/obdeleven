package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.survey.block.TextBlockKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38249c;

    public /* synthetic */ U(int i10, int i11) {
        this.f38248b = i11;
        this.f38249c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38248b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationItemKt.UnreadConversationWithSimpleTicketHeaderPreview$lambda$8(this.f38249c, interfaceC1084f, iIntValue);
            case 1:
                return TopActionBarKt.TopActionBarAvatarPreview$lambda$11(this.f38249c, interfaceC1084f, iIntValue);
            case 2:
                return FinAnswerRowKt.FinAnswerRowPreview$lambda$12(this.f38249c, interfaceC1084f, iIntValue);
            case 3:
                return TextBlockKt.OrderedListTextBlockPreview$lambda$30(this.f38249c, interfaceC1084f, iIntValue);
            default:
                return SingleChoiceQuestionKt.SingleChoiceQuestionPreviewLight$lambda$10(this.f38249c, interfaceC1084f, iIntValue);
        }
    }
}
