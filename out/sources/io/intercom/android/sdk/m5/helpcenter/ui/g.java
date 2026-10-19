package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f39171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39172d;

    public /* synthetic */ g(int i10, int i11, Object obj) {
        this.f39170b = i11;
        this.f39172d = obj;
        this.f39171c = i10;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f39170b;
        InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return HelpCenterLoadingScreen.Content$lambda$0((HelpCenterLoadingScreen) this.f39172d, this.f39171c, interfaceC1084f, iIntValue);
            default:
                return MultipleChoiceQuestionKt.PreviewQuestion$lambda$12((SurveyUiColors) this.f39172d, this.f39171c, interfaceC1084f, iIntValue);
        }
    }
}
