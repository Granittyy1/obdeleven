package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleResultRowComponentKt;
import io.intercom.android.sdk.m5.notification.InAppNotificationCardKt;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.list.ui.TicketsLoadingScreenKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2277e0 implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38355c;

    public /* synthetic */ C2277e0(int i10, int i11) {
        this.f38354b = i11;
        this.f38355c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38354b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return FooterNoticeKt.ExpandedFooterNoticePreviewMultipleAvatars$lambda$11(this.f38355c, interfaceC1084f, iIntValue);
            case 1:
                return SearchBrowseCardKt.PreviewSearchBrowseNoSuggestionsNoSearchFirst$lambda$4(this.f38355c, interfaceC1084f, iIntValue);
            case 2:
                return NewMessagesRowKt.NewMessagesRowPreview$lambda$2(this.f38355c, interfaceC1084f, iIntValue);
            case 3:
                return ArticleResultRowComponentKt.ArticleRowComponentPreview$lambda$5(this.f38355c, interfaceC1084f, iIntValue);
            case 4:
                return InAppNotificationCardKt.InAppNotificationCardPreview$lambda$7(this.f38355c, interfaceC1084f, iIntValue);
            case 5:
                return SurveyComponentKt.SurveyErrorState$lambda$14(this.f38355c, interfaceC1084f, iIntValue);
            case 6:
                return TicketDetailContentKt.TicketPreviewSubmittedCard$lambda$21(this.f38355c, interfaceC1084f, iIntValue);
            default:
                return TicketsLoadingScreenKt.TicketsLoadingScreenPreview$lambda$1(this.f38355c, interfaceC1084f, iIntValue);
        }
    }
}
