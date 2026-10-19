package io.intercom.android.sdk.survey.ui.questiontype;

import Ia.p;
import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt$lambda-6$1, reason: invalid class name */
/* JADX INFO: compiled from: DatePickerQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$DatePickerQuestionKt$lambda6$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$DatePickerQuestionKt$lambda6$1 INSTANCE = new ComposableSingletons$DatePickerQuestionKt$lambda6$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final r invoke$lambda$0(Answer it) {
        kotlin.jvm.internal.i.e(it, "it");
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
        } else {
            DatePickerQuestionKt.DatePickerQuestion(null, new SurveyData.Step.Question.DatePickerQuestionModel("123", M1.k(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Choose date")), true), null, new a(), null, interfaceC1084f, 3072, 21);
        }
    }
}
