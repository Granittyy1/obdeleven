package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.ConversationLoadingScreenKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.CollectionRowComponentKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxErrorScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2272c implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38335c;

    public /* synthetic */ C2272c(int i10, int i11) {
        this.f38334b = i11;
        this.f38335c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38334b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarGroupKt.AvatarGroupPreview$lambda$3(this.f38335c, interfaceC1084f, iIntValue);
            case 1:
                return ConversationEndedCardKt.ConversationEndedCardPreview$lambda$1(this.f38335c, interfaceC1084f, iIntValue);
            case 2:
                return TicketHeaderKt.TicketHeaderPreview$lambda$3(this.f38335c, interfaceC1084f, iIntValue);
            case 3:
                return ConversationLoadingScreenKt.ConversationLoadingScreenPreview$lambda$2(this.f38335c, interfaceC1084f, iIntValue);
            case 4:
                return DayDividerKt.DayDividerPreview$lambda$2(this.f38335c, interfaceC1084f, iIntValue);
            case 5:
                return CollectionRowComponentKt.RowPreview$lambda$6(this.f38335c, interfaceC1084f, iIntValue);
            case 6:
                return InboxErrorScreenKt.InboxErrorScreenWithoutCTAPreview$lambda$2(this.f38335c, interfaceC1084f, iIntValue);
            case 7:
                return MultipleChoiceQuestionKt.MultipleChoiceQuestionPreview$lambda$10(this.f38335c, interfaceC1084f, iIntValue);
            default:
                return TextInputPillKt.TextInputPillUnchecked$lambda$5(this.f38335c, interfaceC1084f, iIntValue);
        }
    }
}
