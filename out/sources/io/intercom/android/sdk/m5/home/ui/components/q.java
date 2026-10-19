package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.ui.preview.ui.PreviewTopBarKt;
import io.intercom.android.sdk.views.compose.ListAttributeCollectorKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39245c;

    public /* synthetic */ q(int i10, int i11) {
        this.f39244b = i11;
        this.f39245c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39244b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return WrapReportingTextKt.PreviewShortText$lambda$7(this.f39245c, interfaceC1084f, iIntValue);
            case 1:
                return SurveyCtaButtonComponentKt.DarkButtonPreview$lambda$10(this.f39245c, interfaceC1084f, iIntValue);
            case 2:
                return ChoicePillKt.SelectedPillLongBigText$lambda$9(this.f39245c, interfaceC1084f, iIntValue);
            case 3:
                return ShortTextQuestionKt.ShortTextAnsweredPreview$lambda$10(this.f39245c, interfaceC1084f, iIntValue);
            case 4:
                return TicketDetailContentKt.TicketSubmissionCardPreview$lambda$19(this.f39245c, interfaceC1084f, iIntValue);
            case 5:
                return PreviewTopBarKt.PreviewTopBarPreview$lambda$5(this.f39245c, interfaceC1084f, iIntValue);
            default:
                return ListAttributeCollectorKt.SubmittedListAttributePreview$lambda$11(this.f39245c, interfaceC1084f, iIntValue);
        }
    }
}
