package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38226c;

    public /* synthetic */ P(int i10, int i11) {
        this.f38225b = i11;
        this.f38226c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38225b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return ConversationHistoryCardKt.RecentConversationsCardPreview$lambda$3(this.f38226c, interfaceC1084f, iIntValue);
            case 1:
                return IntercomErrorScreenKt.ErrorScreenWithCTAPreview$lambda$1(this.f38226c, interfaceC1084f, iIntValue);
            case 2:
                return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithFin$lambda$10(this.f38226c, interfaceC1084f, iIntValue);
            case 3:
                return HomeHeaderBackdropKt.CrossTypeSolidToGradientPreview$lambda$8(this.f38226c, interfaceC1084f, iIntValue);
            case 4:
                return NumericRatingQuestionKt.EmojiRatingQuestionPreview$lambda$16(this.f38226c, interfaceC1084f, iIntValue);
            case 5:
                return TicketTimelineCardKt.ResolvedTicketTimelineWithLabelPreview$lambda$5(this.f38226c, interfaceC1084f, iIntValue);
            case 6:
                return AttributeCollectorCardKt.MultipleAttributeCard$lambda$5(this.f38226c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.FilledTextAttributePreview$lambda$12(this.f38226c, interfaceC1084f, iIntValue);
        }
    }
}
