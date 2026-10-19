package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.ComposableSingletons$DropDownQuestionKt$lambda-4$1, reason: invalid class name */
/* JADX INFO: compiled from: DropDownQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$DropDownQuestionKt$lambda4$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$DropDownQuestionKt$lambda4$1 INSTANCE = new ComposableSingletons$DropDownQuestionKt$lambda4$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$0(Answer it) {
        i.e(it, "it");
        return r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
            return;
        }
        SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel = DropDownQuestionKt.dropDownQuestionModel;
        Answer.SingleAnswer singleAnswer = new Answer.SingleAnswer("Option A");
        c cVar = new c();
        SurveyUiColors surveyUiColorsG = C4.a.g(null, null, 3, null);
        int i11 = H.f13505m;
        DropDownQuestionKt.DropDownQuestion(null, dropDownQuestionModel, singleAnswer, cVar, surveyUiColorsG.m355copyqa9m3tE((27 & 1) != 0 ? surveyUiColorsG.background : 0L, (27 & 2) != 0 ? surveyUiColorsG.onBackground : 0L, (27 & 4) != 0 ? surveyUiColorsG.button : H.f13502i, (27 & 8) != 0 ? surveyUiColorsG.onButton : 0L, (27 & 16) != 0 ? surveyUiColorsG.dropDownSelectedColor : null), null, interfaceC1084f, 3136, 33);
    }
}
