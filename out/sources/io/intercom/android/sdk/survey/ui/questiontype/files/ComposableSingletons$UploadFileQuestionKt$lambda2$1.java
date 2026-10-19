package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.InterfaceC1084f;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import kotlin.collections.B;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.files.ComposableSingletons$UploadFileQuestionKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: UploadFileQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ComposableSingletons$UploadFileQuestionKt$lambda2$1 implements Ia.p<InterfaceC1084f, Integer, p293xa.r> {
    public static final ComposableSingletons$UploadFileQuestionKt$lambda2$1 INSTANCE = new ComposableSingletons$UploadFileQuestionKt$lambda2$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r invoke$lambda$0(Answer it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
        invoke(interfaceC1084f, num.intValue());
        return p293xa.r.f47939a;
    }

    public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
        if ((i10 & 11) == 2 && interfaceC1084f.s()) {
            interfaceC1084f.w();
        } else {
            UploadFileQuestionKt.UploadFileQuestion(null, new SurveyData.Step.Question.UploadFileQuestionModel("", M1.k(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Attachments")), null, false, 1, B.C("image/jpeg", "image/png"), 4, null), null, new i(), null, null, interfaceC1084f, 3136, 53);
        }
    }
}
