package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.m5.notification.ChatFullNotificationKt;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsEmptyScreenKt;
import io.intercom.android.sdk.ui.component.IntercomTopBarKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38649c;

    public /* synthetic */ O(int i10, int i11) {
        this.f38648b = i11;
        this.f38649c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38648b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return MessageComposerKt.TextComposerWithButtonsPreview$lambda$33(this.f38649c, interfaceC1084f, iIntValue);
            case 1:
                return HomeHeaderKt.HomeContentHeaderPreview$lambda$19(this.f38649c, interfaceC1084f, iIntValue);
            case 2:
                return ChatFullNotificationKt.ChatFullNotificationAssignedTicketPreview$lambda$10(this.f38649c, interfaceC1084f, iIntValue);
            case 3:
                return SurveyComponentKt.SimpleSurvey$lambda$9(this.f38649c, interfaceC1084f, iIntValue);
            case 4:
                return DropDownQuestionKt.DropDownSelectedQuestionPreview$lambda$13(this.f38649c, interfaceC1084f, iIntValue);
            case 5:
                return TicketsEmptyScreenKt.EmptyScreenPreview$lambda$1(this.f38649c, interfaceC1084f, iIntValue);
            default:
                return IntercomTopBarKt.IntercomTopBarPreview$lambda$8(this.f38649c, interfaceC1084f, iIntValue);
        }
    }
}
