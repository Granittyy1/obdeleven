package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.ConversationErrorScreenKt;
import io.intercom.android.sdk.m5.home.ui.HomeErrorContentKt;
import io.intercom.android.sdk.m5.inbox.ui.InboxEmptyScreenKt;
import io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2297o0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38400c;

    public /* synthetic */ C2297o0(int i10, int i11) {
        this.f38399b = i11;
        this.f38400c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38399b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HomeItemKt.HomeTicketsRTLPreview$lambda$14(this.f38400c, interfaceC1084f, iIntValue);
            case 1:
                return TextWithSeparatorKt.TextWithSeparatorFirstEmptyPreview$lambda$5(this.f38400c, interfaceC1084f, iIntValue);
            case 2:
                return ConversationErrorScreenKt.ConversationErrorScreenPreview$lambda$1(this.f38400c, interfaceC1084f, iIntValue);
            case 3:
                return HomeErrorContentKt.HomeErrorContentWithCTAPreview$lambda$1(this.f38400c, interfaceC1084f, iIntValue);
            case 4:
                return InboxEmptyScreenKt.EmptyScreenHelpPreview$lambda$2(this.f38400c, interfaceC1084f, iIntValue);
            case 5:
                return CircularAvatarComponentKt.PreviewInitialAvatar$lambda$8(this.f38400c, interfaceC1084f, iIntValue);
            case 6:
                return NumericRatingCellKt.FilledCell$lambda$3(this.f38400c, interfaceC1084f, iIntValue);
            case 7:
                return ShortTextQuestionKt.ShortTextDisabledPreview$lambda$12(this.f38400c, interfaceC1084f, iIntValue);
            default:
                return TicketProgressBannerKt.TicketProgressRowPreview$lambda$1(this.f38400c, interfaceC1084f, iIntValue);
        }
    }
}
