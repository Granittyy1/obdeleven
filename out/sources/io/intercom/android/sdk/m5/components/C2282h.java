package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.ExpandedTeamPresenceLayoutKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import io.intercom.android.sdk.survey.block.PdfAttachmentBlockKt;
import io.intercom.android.sdk.survey.ui.components.validation.ValidationErrorComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.create.ui.CreateTicketCardKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2282h implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38365c;

    public /* synthetic */ C2282h(int i10, int i11) {
        this.f38364b = i11;
        this.f38365c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38364b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return BotAndHumansFacePileKt.BotWithTwoTeammatesPreview$lambda$12(this.f38365c, interfaceC1084f, iIntValue);
            case 1:
                return TopActionBarKt.TopActionBarBackButtonPreview$lambda$15(this.f38365c, interfaceC1084f, iIntValue);
            case 2:
                return ExpandedTeamPresenceLayoutKt.ExpandedTeamPresenceLayoutPreviewWithAssignedAdmin$lambda$12(this.f38365c, interfaceC1084f, iIntValue);
            case 3:
                return SpecialNoticeKt.SpecialNoticeShortTextPreview$lambda$3(this.f38365c, interfaceC1084f, iIntValue);
            case 4:
                return HomeHeaderBackdropKt.SolidHeaderBackdropWithFadePreview$lambda$6(this.f38365c, interfaceC1084f, iIntValue);
            case 5:
                return PdfAttachmentBlockKt.PdfAttachmentBlockPreview$lambda$8(this.f38365c, interfaceC1084f, iIntValue);
            case 6:
                return ValidationErrorComponentKt.ErrorPreview$lambda$3(this.f38365c, interfaceC1084f, iIntValue);
            case 7:
                return TextInputPillKt.TextInputPillPlaceholder$lambda$4(this.f38365c, interfaceC1084f, iIntValue);
            case 8:
                return TicketTimelineCardKt.SubmittedTicketTimelineWithLabelPreview$lambda$4(this.f38365c, interfaceC1084f, iIntValue);
            case 9:
                return CreateTicketCardKt.EnabledCreateTicketCardPreview$lambda$1(this.f38365c, interfaceC1084f, iIntValue);
            case 10:
                return AttributeCollectorCardKt.TextAttributeCard$lambda$4(this.f38365c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.SubmittedAndDisabledTextAttributePreview$lambda$16(this.f38365c, interfaceC1084f, iIntValue);
        }
    }
}
