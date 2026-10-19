package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt;
import io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38243c;

    public /* synthetic */ Q(int i10, int i11) {
        this.f38242b = i11;
        this.f38243c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38242b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationHistoryCardKt.RecentConversationsCardWithSimpleTicketHeaderPreview$lambda$2(this.f38243c, interfaceC1084f, iIntValue);
            case 1:
                return InlineSourcesSheetContentKt.InlineSourcesSheetContentPreview$lambda$13(this.f38243c, interfaceC1084f, iIntValue);
            case 2:
                return MessageListKt.EmptyMessageListPreview$lambda$42(this.f38243c, interfaceC1084f, iIntValue);
            case 3:
                return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFinAndHumans$lambda$11(this.f38243c, interfaceC1084f, iIntValue);
            case 4:
                return TeamIntroKt.TeamIntroPreview$lambda$1(this.f38243c, interfaceC1084f, iIntValue);
            case 5:
                return HomeHeaderBackdropKt.SolidHeaderBackdropPreview$lambda$4(this.f38243c, interfaceC1084f, iIntValue);
            case 6:
                return InboxScreenKt.InboxLoadingRow$lambda$5(this.f38243c, interfaceC1084f, iIntValue);
            case 7:
                return SingleChoiceQuestionKt.SingleChoiceQuestionPreviewDark$lambda$11(this.f38243c, interfaceC1084f, iIntValue);
            case 8:
                return TicketTimelineCardKt.WaitingOnCustomerTicketTimelinePreview$lambda$3(this.f38243c, interfaceC1084f, iIntValue);
            case 9:
                return IntercomButtonKt.PrimaryButtonWithTrailingIconPreview$lambda$2(this.f38243c, interfaceC1084f, iIntValue);
            default:
                return AttributeCollectorCardKt.ListAttributeCard$lambda$3(this.f38243c, interfaceC1084f, iIntValue);
        }
    }
}
