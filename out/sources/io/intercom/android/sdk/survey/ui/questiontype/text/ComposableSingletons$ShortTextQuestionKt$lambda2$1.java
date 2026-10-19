package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import androidx.compose.animation.D;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.recyclerview.widget.t;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import p293xa.r;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.text.ComposableSingletons$ShortTextQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: ShortTextQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$ShortTextQuestionKt$lambda2$1 implements p<InterfaceC1084f, Integer, r> {
    public static final ComposableSingletons$ShortTextQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$ShortTextQuestionKt$lambda2$1();

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
            ShortTextQuestionKt.ShortTextQuestion(null, new SurveyData.Step.Question.ShortTextQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Is this a preview?").withType(BlockType.PARAGRAPH.getSerializedName())), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, Integer.valueOf(t.d.DEFAULT_SWIPE_ANIMATION_DURATION), false, null, null, 448, null), null, new a(), C4.a.g(null, null, 3, null), ValidationError.NoValidationError.INSTANCE, null, null, interfaceC1084f, 199680, 197);
        }
    }
}
