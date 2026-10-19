package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.inbox.ui.InboxLoadingScreenKt;
import io.intercom.android.sdk.survey.ui.components.ErrorComponentKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.views.compose.TextAttributeCollectorKt;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2274d implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f38343c;

    public /* synthetic */ C2274d(int i10, int i11) {
        this.f38342b = i11;
        this.f38343c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f38342b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return AvatarTriangleGroupKt.DoubleAvatarsPreview$lambda$7(this.f38343c, interfaceC1084f, iIntValue);
            case 1:
                return InboxLoadingScreenKt.HomeLoadingContentPreview$lambda$1(this.f38343c, interfaceC1084f, iIntValue);
            case 2:
                return ErrorComponentKt.ErrorStateWithCTA$lambda$3(this.f38343c, interfaceC1084f, iIntValue);
            case 3:
                return MultipleChoiceQuestionKt.MultipleChoiceQuestionPreviewDark$lambda$11(this.f38343c, interfaceC1084f, iIntValue);
            case 4:
                return NumericRatingQuestionKt.NPSQuestionPreview$lambda$14(this.f38343c, interfaceC1084f, iIntValue);
            case 5:
                return TextInputPillKt.TextInputPillValidated$lambda$6(this.f38343c, interfaceC1084f, iIntValue);
            default:
                return TextAttributeCollectorKt.EmptyTextAttributePreview$lambda$13(this.f38343c, interfaceC1084f, iIntValue);
        }
    }
}
