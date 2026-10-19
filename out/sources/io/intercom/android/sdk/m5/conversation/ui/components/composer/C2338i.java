package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import java.util.List;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2338i implements Ia.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38735b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.h f38736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f38740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f38741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f38742i;
    public final /* synthetic */ Object j;

    public /* synthetic */ C2338i(androidx.compose.ui.h hVar, CameraInputType cameraInputType, Ia.l lVar, Ia.a aVar, Ia.a aVar2, Ia.p pVar, int i10, int i11) {
        this.f38736c = hVar;
        this.f38739f = cameraInputType;
        this.f38740g = lVar;
        this.f38741h = aVar;
        this.f38742i = aVar2;
        this.j = pVar;
        this.f38737d = i10;
        this.f38738e = i11;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38735b) {
            case 0:
                return CameraInputButtonKt.CameraInputButton$lambda$15(this.f38736c, (CameraInputType) this.f38739f, (Ia.l) this.f38740g, (Ia.a) this.f38741h, (Ia.a) this.f38742i, (Ia.p) this.j, this.f38737d, this.f38738e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            case 1:
                return FinAnswerRowKt.FinAnswerMetadata$lambda$11((List) this.f38739f, (String) this.f38740g, this.f38736c, (String) this.f38741h, (Long) this.f38742i, (AiAnswerInfo) this.j, this.f38737d, this.f38738e, (InterfaceC1084f) obj, ((Integer) obj2).intValue());
            default:
                InterfaceC1084f interfaceC1084f = (InterfaceC1084f) obj;
                int iIntValue = ((Integer) obj2).intValue();
                return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$9(this.f38736c, (SurveyData.Step.Question.SingleChoiceQuestionModel) this.f38739f, (Answer) this.f38741h, (Ia.l) this.f38740g, (SurveyUiColors) this.f38742i, (Ia.p) this.j, this.f38737d, this.f38738e, interfaceC1084f, iIntValue);
        }
    }

    public /* synthetic */ C2338i(androidx.compose.ui.h hVar, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, Ia.l lVar, SurveyUiColors surveyUiColors, Ia.p pVar, int i10, int i11) {
        this.f38736c = hVar;
        this.f38739f = singleChoiceQuestionModel;
        this.f38741h = answer;
        this.f38740g = lVar;
        this.f38742i = surveyUiColors;
        this.j = pVar;
        this.f38737d = i10;
        this.f38738e = i11;
    }

    public /* synthetic */ C2338i(List list, String str, androidx.compose.ui.h hVar, String str2, Long l10, AiAnswerInfo aiAnswerInfo, int i10, int i11) {
        this.f38739f = list;
        this.f38740g = str;
        this.f38736c = hVar;
        this.f38741h = str2;
        this.f38742i = l10;
        this.j = aiAnswerInfo;
        this.f38737d = i10;
        this.f38738e = i11;
    }
}
