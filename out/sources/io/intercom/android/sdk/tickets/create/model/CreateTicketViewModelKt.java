package io.intercom.android.sdk.tickets.create.model;

import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: CreateTicketViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketViewModelKt {
    public static final String EmailId = "-1";

    /* JADX INFO: compiled from: CreateTicketViewModel.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object formatAnswerForServer(QuestionState questionState) {
        Answer answer = questionState.getAnswer();
        if (answer instanceof Answer.DateTimeAnswer) {
            return ((Answer.DateTimeAnswer) answer).getAnswer();
        }
        if (answer instanceof Answer.MultipleAnswer) {
            return ((Answer.MultipleAnswer) answer).m407getAnswers().toString();
        }
        if (i.a(answer, Answer.NoAnswer.InitialNoAnswer.INSTANCE) || i.a(answer, Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
            return r.f47939a;
        }
        if (answer instanceof Answer.SingleAnswer) {
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                return Boolean.valueOf(Boolean.parseBoolean(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
                return ((Answer.SingleAnswer) answer).getAnswer();
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getValidationType().ordinal()];
            if (i10 == 1) {
                return Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            if (i10 != 2) {
                return i10 != 3 ? ((Answer.SingleAnswer) answer).getAnswer() : Integer.valueOf(Integer.parseInt(((Answer.SingleAnswer) answer).getAnswer()));
            }
            return Float.valueOf(Float.parseFloat(((Answer.SingleAnswer) answer).getAnswer()));
        }
        if (!(answer instanceof Answer.MediaAnswer)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList = new ArrayList();
        List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
        ArrayList<Answer.MediaAnswer.FileUploadStatus> arrayList2 = new ArrayList(m.y(mediaItems, 10));
        Iterator<T> it = mediaItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
        }
        for (Answer.MediaAnswer.FileUploadStatus fileUploadStatus : arrayList2) {
            if (fileUploadStatus instanceof Answer.MediaAnswer.FileUploadStatus.Success) {
                arrayList.add(Integer.valueOf(((Answer.MediaAnswer.FileUploadStatus.Success) fileUploadStatus).getId()));
            }
        }
        return arrayList;
    }
}
