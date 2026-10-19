package io.intercom.android.sdk.survey.ui.questiontype.files;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.ui.components.QuestionHeaderComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.ErrorMessageLayoutKt;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: UploadFileQuestionHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UploadFileQuestionHeaderKt {
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX INFO: renamed from: UploadFileQuestionHeader-INMd_9Y, reason: not valid java name */
    public static final void m442UploadFileQuestionHeaderINMd_9Y(final QuestionState questionState, final androidx.compose.ui.text.font.l questionFontWeight, final long j, InterfaceC1084f interfaceC1084f, final int i10) {
        final List<StringProvider.StringRes> errorMessages;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        kotlin.jvm.internal.i.e(questionState, "questionState");
        kotlin.jvm.internal.i.e(questionFontWeight, "questionFontWeight");
        C1086g c1086gP = interfaceC1084f.p(43160084);
        Answer answer = questionState.getAnswer();
        Object obj = null;
        Answer.MediaAnswer mediaAnswer = answer instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer : null;
        if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
            errorMessages = EmptyList.f42983b;
        } else {
            for (Object obj2 : mediaItems) {
                if (((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                    obj = obj2;
                    break;
                }
            }
            Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj;
            if (mediaItem != null) {
                Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
                kotlin.jvm.internal.i.c(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
                errorMessages = ((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError().getErrorMessages();
                if (errorMessages == null) {
                    errorMessages = EmptyList.f42983b;
                }
            } else {
                errorMessages = EmptyList.f42983b;
            }
        }
        int i11 = i10 << 9;
        QuestionHeaderComponentKt.m404QuestionHeadern1tc1qA(questionState.getQuestionModel().getTitle(), questionState.getQuestionModel().getDescription(), questionState.getQuestionModel().isRequired(), questionState.getValidationError(), questionFontWeight, j, androidx.compose.runtime.internal.a.b(1052404026, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt$UploadFileQuestionHeader$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return p293xa.r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i12) {
                if ((i12 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                } else {
                    ErrorMessageLayoutKt.ErrorMessageLayout(null, errorMessages, interfaceC1084f2, 64, 1);
                }
            }
        }, c1086gP), null, c1086gP, (StringProvider.$stable << 3) | 1572872 | (57344 & i11) | (i11 & 458752), 128);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.files.v
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return UploadFileQuestionHeaderKt.UploadFileQuestionHeader_INMd_9Y$lambda$2(questionState, questionFontWeight, j, i10, (InterfaceC1084f) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r UploadFileQuestionHeader_INMd_9Y$lambda$2(QuestionState questionState, androidx.compose.ui.text.font.l questionFontWeight, long j, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(questionState, "$questionState");
        kotlin.jvm.internal.i.e(questionFontWeight, "$questionFontWeight");
        m442UploadFileQuestionHeaderINMd_9Y(questionState, questionFontWeight, j, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
