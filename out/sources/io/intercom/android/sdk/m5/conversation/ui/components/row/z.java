package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38975c;

    public /* synthetic */ z(int i10, int i11) {
        this.f38974b = i11;
        this.f38975c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38974b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return PostCardRowKt.PostCardPreview$lambda$5(this.f38975c, interfaceC1084f, iIntValue);
            case 1:
                return ArticleRowComponentKt.ArticleRowComponentPreview$lambda$5(this.f38975c, interfaceC1084f, iIntValue);
            case 2:
                return SurveyCtaButtonComponentKt.SecondaryCtaPreview$lambda$12(this.f38975c, interfaceC1084f, iIntValue);
            case 3:
                return ChoicePillKt.SelectedPillLongText$lambda$8(this.f38975c, interfaceC1084f, iIntValue);
            case 4:
                return TicketDetailErrorScreenKt.TicketDetailErrorScreenWithoutCTAPreview$lambda$2(this.f38975c, interfaceC1084f, iIntValue);
            default:
                return ListAttributeCollectorKt.ListAttributePreview$lambda$10(this.f38975c, interfaceC1084f, iIntValue);
        }
    }
}
