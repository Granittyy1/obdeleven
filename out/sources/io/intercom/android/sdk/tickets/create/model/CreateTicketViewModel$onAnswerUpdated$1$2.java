package io.intercom.android.sdk.tickets.create.model;

import Ia.p;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: CreateTicketViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$onAnswerUpdated$1$2", f = "CreateTicketViewModel.kt", l = {}, m = "invokeSuspend")
public final class CreateTicketViewModel$onAnswerUpdated$1$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ CreateTicketViewModel.CreateTicketFormUiState.Content $content;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTicketViewModel$onAnswerUpdated$1$2(CreateTicketViewModel.CreateTicketFormUiState.Content content, CreateTicketViewModel createTicketViewModel, kotlin.coroutines.c<? super CreateTicketViewModel$onAnswerUpdated$1$2> cVar) {
        super(2, cVar);
        this.$content = content;
        this.this$0 = createTicketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreateTicketViewModel$onAnswerUpdated$1$2(this.$content, this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Iterator it2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        List<QuestionState> questions = this.$content.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : questions) {
            if (((QuestionState) obj2).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj2);
            }
        }
        CreateTicketViewModel createTicketViewModel = this.this$0;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            QuestionState questionState = (QuestionState) it3.next();
            SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
            i.c(questionModel, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.UploadFileQuestionModel");
            SurveyData.Step.Question.UploadFileQuestionModel uploadFileQuestionModel = (SurveyData.Step.Question.UploadFileQuestionModel) questionModel;
            Answer answer = questionState.getAnswer();
            if (answer instanceof Answer.MediaAnswer) {
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                int i10 = 0;
                for (Object obj3 : mediaAnswer.getMediaItems()) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        l.x();
                        throw null;
                    }
                    Answer.MediaAnswer.MediaItem mediaItem = (Answer.MediaAnswer.MediaItem) obj3;
                    if (i10 >= uploadFileQuestionModel.getMaxSelection()) {
                        it2 = it3;
                        mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileLimitExceeded(l.s(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null), new StringProvider.StringRes(R.string.intercom_upload_max_files_allowed, M1.k(new Pair("limit", String.valueOf(uploadFileQuestionModel.getMaxSelection()))))))));
                    } else {
                        it2 = it3;
                        if (createTicketViewModel.isUnsupportedFileType(mediaItem.getData(), uploadFileQuestionModel.getSupportedFileType())) {
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UnsupportedFileType(M1.k(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null)))));
                        } else if (i.a(mediaItem.getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.None.INSTANCE)) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        } else if (createTicketViewModel.canRetryFileLimitExceededError(mediaItem, i10, uploadFileQuestionModel.getMaxSelection())) {
                            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE);
                        }
                    }
                    it3 = it2;
                    i10 = i11;
                }
                it = it3;
                createTicketViewModel.compressAndUploadFileAttachments(mediaAnswer.getMediaItems());
                questionState.validate();
            } else {
                it = it3;
            }
            it3 = it;
        }
        this.this$0.updateCtaState();
        return r.f47939a;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CreateTicketViewModel$onAnswerUpdated$1$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
