package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38247c;

    public /* synthetic */ T(int i10, int i11) {
        this.f38246b = i11;
        this.f38247c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38246b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationItemKt.UnreadConversationCardWithBotPreview$lambda$10(this.f38247c, interfaceC1084f, iIntValue);
            case 1:
                return IntercomPrimaryButtonKt.PrimaryButtonPreview$lambda$3(this.f38247c, interfaceC1084f, iIntValue);
            case 2:
                return TopActionBarKt.TopActionBarGroupChatPreview$lambda$12(this.f38247c, interfaceC1084f, iIntValue);
            case 3:
                return BigTicketCardKt.BigTicketCardPreview$lambda$3(this.f38247c, interfaceC1084f, iIntValue);
            case 4:
                return TypingIndicatorKt.TypingIndicatorPreview$lambda$11(this.f38247c, interfaceC1084f, iIntValue);
            case 5:
                return HelpCenterTopBarKt.HelpCenterTopBarPreview$lambda$1(this.f38247c, interfaceC1084f, iIntValue);
            case 6:
                return HomeHeaderBackdropKt.CrossTypeGradientToSolidPreview$lambda$9(this.f38247c, interfaceC1084f, iIntValue);
            case 7:
                return DatePickerQuestionKt.DatePickerQuestionPreview$lambda$28(this.f38247c, interfaceC1084f, iIntValue);
            case 8:
                return StarRatingKt.SelectedStar$lambda$4(this.f38247c, interfaceC1084f, iIntValue);
            default:
                return CreateTicketContentScreenKt.CreateTicketContentErrorScreenPreview$lambda$8(this.f38247c, interfaceC1084f, iIntValue);
        }
    }
}
