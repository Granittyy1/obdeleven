package io.intercom.android.sdk.survey;

import Aa.c;
import Ia.p;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.ui.J;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;
import p293xa.r;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionState {
    public static final int $stable = 8;
    private final X _answer$delegate;
    private final N0 answer$delegate;
    private final androidx.compose.foundation.relocation.a bringIntoViewRequester;
    private final SurveyData.Step.Question.QuestionModel questionModel;
    private final SurveyUiColors surveyUiColors;
    private final X validationError$delegate;

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.QuestionState$bringIntoView$1, reason: invalid class name */
    /* JADX INFO: compiled from: SurveyViewModel.kt */
    @c(c = "io.intercom.android.sdk.survey.QuestionState$bringIntoView$1", f = "SurveyViewModel.kt", l = {761}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return QuestionState.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                androidx.compose.foundation.relocation.a bringIntoViewRequester = QuestionState.this.getBringIntoViewRequester();
                this.label = 1;
                if (bringIntoViewRequester.a(null, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(r.f47939a);
        }
    }

    public QuestionState(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        i.e(questionModel, "questionModel");
        i.e(surveyUiColors, "surveyUiColors");
        this.questionModel = questionModel;
        this.surveyUiColors = surveyUiColors;
        this.validationError$delegate = J0.f(ValidationError.Unchecked.INSTANCE);
        this._answer$delegate = J0.f(Answer.NoAnswer.InitialNoAnswer.INSTANCE);
        this.answer$delegate = J0.d(new J(1, this));
        this.bringIntoViewRequester = new androidx.compose.foundation.relocation.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Answer answer_delegate$lambda$0(QuestionState this$0) {
        i.e(this$0, "this$0");
        return this$0.get_answer();
    }

    public static /* synthetic */ QuestionState copy$default(QuestionState questionState, SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            questionModel = questionState.questionModel;
        }
        if ((i10 & 2) != 0) {
            surveyUiColors = questionState.surveyUiColors;
        }
        return questionState.copy(questionModel, surveyUiColors);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Answer get_answer() {
        return (Answer) this._answer$delegate.getValue();
    }

    private final void set_answer(Answer answer) {
        this._answer$delegate.setValue(answer);
    }

    public final InterfaceC2694i0 bringIntoView(A compositionAwareScope) {
        i.e(compositionAwareScope, "compositionAwareScope");
        return C2680e.c(compositionAwareScope, null, null, new AnonymousClass1(null), 3);
    }

    public final SurveyData.Step.Question.QuestionModel component1() {
        return this.questionModel;
    }

    public final SurveyUiColors component2() {
        return this.surveyUiColors;
    }

    public final QuestionState copy(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        i.e(questionModel, "questionModel");
        i.e(surveyUiColors, "surveyUiColors");
        return new QuestionState(questionModel, surveyUiColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionState)) {
            return false;
        }
        QuestionState questionState = (QuestionState) obj;
        return i.a(this.questionModel, questionState.questionModel) && i.a(this.surveyUiColors, questionState.surveyUiColors);
    }

    public final Answer getAnswer() {
        return (Answer) this.answer$delegate.getValue();
    }

    public final androidx.compose.foundation.relocation.a getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ValidationError getValidationError() {
        return (ValidationError) this.validationError$delegate.getValue();
    }

    public int hashCode() {
        return this.surveyUiColors.hashCode() + (this.questionModel.hashCode() * 31);
    }

    public final void setAnswer(Answer answer) {
        i.e(answer, "answer");
        set_answer(answer);
        if (answer instanceof Answer.NoAnswer.ResetNoAnswer) {
            setValidationError(ValidationError.Unchecked.INSTANCE);
        }
    }

    public final void setValidationError(ValidationError validationError) {
        i.e(validationError, "<set-?>");
        this.validationError$delegate.setValue(validationError);
    }

    public String toString() {
        return "QuestionState(questionModel=" + this.questionModel + ", surveyUiColors=" + this.surveyUiColors + ')';
    }

    /* JADX WARN: Code duplicated, block: B:97:0x026f  */
    public final void validate() {
        ValidationError validationStringError;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        String str;
        ValidationError validationStringError2;
        if ((getAnswer() instanceof Answer.NoAnswer) && this.questionModel.isRequired()) {
            setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null));
            return;
        }
        if (getAnswer() instanceof Answer.NoAnswer) {
            setValidationError(ValidationError.NoValidationError.INSTANCE);
            return;
        }
        SurveyData.Step.Question.QuestionModel questionModel = this.questionModel;
        if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
            if (getAnswer() instanceof Answer.MultipleAnswer) {
                Answer answer = getAnswer();
                i.c(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer");
                int size = ((Answer.MultipleAnswer) answer).getAnswers().size();
                if (size < ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_few_responses, M1.k(new Pair("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection())))));
                    return;
                } else if (size > ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_many_responses, M1.k(new Pair("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection())))));
                    return;
                } else {
                    setValidationError(ValidationError.NoValidationError.INSTANCE);
                    return;
                }
            }
            return;
        }
        if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
            if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                setValidationError((((SurveyData.Step.Question.LongTextQuestionModel) questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) ? ValidationError.NoValidationError.INSTANCE : new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, M1.k(new Pair("character_count", String.valueOf(((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit())))));
                return;
            }
            if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                if (getAnswer() instanceof Answer.DateTimeAnswer) {
                    Answer answer2 = getAnswer();
                    i.c(answer2, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer");
                    setValidationError(n.S(((Answer.DateTimeAnswer) answer2).getDateAsString()) ? new ValidationError.ValidationStringError(R.string.intercom_choose_the_date, null, 2, null) : ValidationError.NoValidationError.INSTANCE);
                    return;
                }
                return;
            }
            if (!(questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel)) {
                setValidationError(ValidationError.NoValidationError.INSTANCE);
                return;
            }
            Answer answer3 = getAnswer();
            Answer.MediaAnswer mediaAnswer = answer3 instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer3 : null;
            if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
                validationStringError = ValidationError.NoValidationError.INSTANCE;
            } else {
                List<Answer.MediaAnswer.MediaItem> list = mediaItems;
                ArrayList arrayList = new ArrayList(m.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                        arrayList2.add(obj);
                    }
                }
                Answer.MediaAnswer.FileUploadStatus.Error error = (Answer.MediaAnswer.FileUploadStatus.Error) q.P(arrayList2);
                if (error != null) {
                    StringProvider.StringRes stringRes = (StringProvider.StringRes) q.O(error.getError().getErrorMessages());
                    validationStringError = new ValidationError.ValidationStringError(stringRes.getStringRes(), stringRes.getParams());
                } else {
                    validationStringError = ValidationError.NoValidationError.INSTANCE;
                }
            }
            setValidationError(validationStringError);
            return;
        }
        if (!((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getEnabled()) {
            validationStringError2 = ValidationError.NoValidationError.INSTANCE;
        } else if (((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getValidationType().ordinal()]) {
                case 1:
                case 2:
                    str = AttributeType.TEXT;
                    break;
                case 3:
                    str = "number";
                    break;
                case 4:
                    str = "email";
                    break;
                case 5:
                    str = AttributeType.PHONE;
                    break;
                case 6:
                    str = AttributeType.FLOAT;
                    break;
                case 7:
                    str = AttributeType.INTEGER;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Answer answer4 = getAnswer();
            switch (AttributeValidatorUtils.validateAttribute(answer4 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer4).getAnswer() : "", str)) {
                case 1:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_string_is_incorrect, null, 2, null);
                    break;
                case 2:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null);
                    break;
                case 3:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_number_is_incorrect, null, 2, null);
                    break;
                case 4:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_needs_a_prefix, null, 2, null);
                    break;
                case 5:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_has_too_many_digits, null, 2, null);
                    break;
                case 6:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_country_code_doesnt_look_quite_right, null, 2, null);
                    break;
                case 7:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_is_missing_a_few_digits, null, 2, null);
                    break;
                default:
                    validationStringError2 = ValidationError.NoValidationError.INSTANCE;
                    break;
            }
        } else {
            validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, M1.k(new Pair("character_count", String.valueOf(((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit()))));
        }
        setValidationError(validationStringError2);
    }
}
