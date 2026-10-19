package io.intercom.android.sdk.survey.model;

import A1.C0575j;
import Ba.a;
import I7.b;
import Z3.o;
import androidx.compose.animation.D;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.google.gson.Gson;
import com.google.gson.g;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.v;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;
import p005a4.q;

/* JADX INFO: compiled from: SurveyData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyData {

    @b("format")
    private final String _format;

    @b("customization_options")
    private final SurveyCustomization customization;

    @b("id")
    private final String id;

    @b("dismissible")
    private final boolean isDismissible;

    @b("sender")
    private final SurveySenderData sender;

    @b("show_progress_bar")
    private final boolean showProgressBar;

    @b("step_count")
    private final int stepCount;

    @b(ContainerStep.STEPS)
    private final List<Step> steps;

    @b("survey_progress_id")
    private final String surveyProgressId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SurveyData NULL = new SurveyData("1", "", EmptyList.f42983b, "0", new SurveyCustomization(null, null, 3, null), new SurveySenderData(null, null, null, null, 15, null), 0, true, false, 256, null);

    /* JADX INFO: compiled from: SurveyData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final SurveyData getNULL() {
            return SurveyData.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: SurveyData.kt */
    public enum StepType {
        CONTENT,
        QUESTION,
        INTRO,
        THANK_YOU,
        UNSUPPORTED;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

        public static a<StepType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: SurveyData.kt */
    public enum SurveyFormat {
        SMALL_FORMAT,
        LARGE_FORMAT;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

        public static a<SurveyFormat> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: SurveyData.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyFormat.values().length];
            try {
                iArr[SurveyFormat.SMALL_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyFormat.LARGE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SurveyData(String _format, String id, List<Step> steps, String surveyProgressId, SurveyCustomization customization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        i.e(_format, "_format");
        i.e(id, "id");
        i.e(steps, "steps");
        i.e(surveyProgressId, "surveyProgressId");
        i.e(customization, "customization");
        this._format = _format;
        this.id = id;
        this.steps = steps;
        this.surveyProgressId = surveyProgressId;
        this.customization = customization;
        this.sender = surveySenderData;
        this.stepCount = i10;
        this.isDismissible = z10;
        this.showProgressBar = z11;
    }

    public final String component1() {
        return this._format;
    }

    public final String component2() {
        return this.id;
    }

    public final List<Step> component3() {
        return this.steps;
    }

    public final String component4() {
        return this.surveyProgressId;
    }

    public final SurveyCustomization component5() {
        return this.customization;
    }

    public final SurveySenderData component6() {
        return this.sender;
    }

    public final int component7() {
        return this.stepCount;
    }

    public final boolean component8() {
        return this.isDismissible;
    }

    public final boolean component9() {
        return this.showProgressBar;
    }

    public final SurveyData copy(String _format, String id, List<Step> steps, String surveyProgressId, SurveyCustomization customization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11) {
        i.e(_format, "_format");
        i.e(id, "id");
        i.e(steps, "steps");
        i.e(surveyProgressId, "surveyProgressId");
        i.e(customization, "customization");
        return new SurveyData(_format, id, steps, surveyProgressId, customization, surveySenderData, i10, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return i.a(this._format, surveyData._format) && i.a(this.id, surveyData.id) && i.a(this.steps, surveyData.steps) && i.a(this.surveyProgressId, surveyData.surveyProgressId) && i.a(this.customization, surveyData.customization) && i.a(this.sender, surveyData.sender) && this.stepCount == surveyData.stepCount && this.isDismissible == surveyData.isDismissible && this.showProgressBar == surveyData.showProgressBar;
    }

    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    public final SurveyFormat getFormat() {
        return Integer.parseInt(this._format) == 0 ? SurveyFormat.SMALL_FORMAT : SurveyFormat.LARGE_FORMAT;
    }

    public final String getFormatMetric() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getFormat().ordinal()];
        if (i10 == 1) {
            return "small_full_screen";
        }
        if (i10 == 2) {
            return "large_full_screen";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getId() {
        return this.id;
    }

    public final SurveySenderData getSender() {
        return this.sender;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final List<Step> getSteps() {
        return this.steps;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public final String get_format() {
        return this._format;
    }

    public int hashCode() {
        int iHashCode = (this.customization.hashCode() + B1.a.b(this.surveyProgressId, p.d(B1.a.b(this.id, this._format.hashCode() * 31, 31), 31, this.steps), 31)) * 31;
        SurveySenderData surveySenderData = this.sender;
        return Boolean.hashCode(this.showProgressBar) + D.b(q.b(this.stepCount, (iHashCode + (surveySenderData == null ? 0 : surveySenderData.hashCode())) * 31, 31), 31, this.isDismissible);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyData(_format=");
        sb2.append(this._format);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", steps=");
        sb2.append(this.steps);
        sb2.append(", surveyProgressId=");
        sb2.append(this.surveyProgressId);
        sb2.append(", customization=");
        sb2.append(this.customization);
        sb2.append(", sender=");
        sb2.append(this.sender);
        sb2.append(", stepCount=");
        sb2.append(this.stepCount);
        sb2.append(", isDismissible=");
        sb2.append(this.isDismissible);
        sb2.append(", showProgressBar=");
        return o.d(sb2, this.showProgressBar, ')');
    }

    /* JADX INFO: compiled from: SurveyData.kt */
    public static final class Step {
        public static final int $stable = 8;

        @b("step_type")
        private final int _type;

        @b("actions")
        private final List<SurveyActions> actions;

        @b("blocks")
        private final List<Block.Builder> blocks;

        @b("custom_button_text")
        private final String customButtonText;

        @b("id")
        private final String id;

        @b("questions")
        private final List<Question> questions;

        /* JADX INFO: compiled from: SurveyData.kt */
        public static final class Question {
            public static final int $stable = 8;

            @b("blocks")
            private final List<Block.Builder> blocks;

            @b("id")
            private final String id;

            @b("data")
            private final QuestionData questionData;

            @b("question_type")
            private final int questionType;

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class DatePickerQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DatePickerQuestionModel(String id, List<Block.Builder> title, boolean z10) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class LongTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final int maxLine;
                private final float minHeight;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, Integer num2, e eVar) {
                    this(str, list, z10, str2, validationType, num, f10, i10, num2);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final int getMaxLine() {
                    return this.maxLine;
                }

                /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
                public final float m400getMinHeightD9Ej5fM() {
                    return this.minHeight;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, Integer num2, int i11, e eVar) {
                    this(str, list, z10, (i11 & 8) != 0 ? "" : str2, validationType, num, (i11 & 64) != 0 ? Float.NaN : f10, (i11 & 128) != 0 ? 6 : i10, (i11 & 256) != 0 ? null : num2, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private LongTextQuestionModel(String id, List<Block.Builder> title, boolean z10, String placeholder, QuestionValidation.ValidationType validationType, Integer num, float f10, int i10, Integer num2) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(placeholder, "placeholder");
                    i.e(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.minHeight = f10;
                    this.maxLine = i10;
                    this.placeHolderStringRes = num2;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class MultipleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final int maxSelection;
                private final int minSelection;
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultipleChoiceQuestionModel(String id, List<Block.Builder> title, boolean z10, List<String> options, boolean z11, int i10, int i11) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(options, "options");
                    this.options = options;
                    this.includeOther = z11;
                    this.minSelection = i10;
                    this.maxSelection = i11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class NumericRatingQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final String lowerLabel;
                private final List<RatingOption> options;
                private final QuestionData.QuestionSubType questionSubType;
                private final int scaleEnd;
                private final int scaleStart;
                private final String upperLabel;

                /* JADX INFO: compiled from: SurveyData.kt */
                public static abstract class RatingOption {
                    public static final int $stable = 0;

                    /* JADX INFO: compiled from: SurveyData.kt */
                    public static final class EmojiRatingOption extends RatingOption {
                        public static final int $stable = 0;

                        @b("image_url")
                        private final String emojiUrl;

                        @b("unicodeEmoticon")
                        private final String unicode;

                        @b("value")
                        private final int value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public EmojiRatingOption(int i10, String emojiUrl, String unicode) {
                            super(null);
                            i.e(emojiUrl, "emojiUrl");
                            i.e(unicode, "unicode");
                            this.value = i10;
                            this.emojiUrl = emojiUrl;
                            this.unicode = unicode;
                        }

                        public final String getEmojiUrl() {
                            return this.emojiUrl;
                        }

                        public final String getUnicode() {
                            return this.unicode;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    /* JADX INFO: compiled from: SurveyData.kt */
                    public static final class NumericRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        private final int value;

                        public NumericRatingOption(int i10) {
                            super(null);
                            this.value = i10;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public /* synthetic */ RatingOption(e eVar) {
                        this();
                    }

                    private RatingOption() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public NumericRatingQuestionModel(String id, List<Block.Builder> title, boolean z10, List<? extends RatingOption> options, String lowerLabel, String upperLabel, int i10, int i11, QuestionData.QuestionSubType questionSubType) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(options, "options");
                    i.e(lowerLabel, "lowerLabel");
                    i.e(upperLabel, "upperLabel");
                    i.e(questionSubType, "questionSubType");
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.questionSubType = questionSubType;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final List<RatingOption> getOptions() {
                    return this.options;
                }

                public final QuestionData.QuestionSubType getQuestionSubType() {
                    return this.questionSubType;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public enum QuestionType {
                INPUT,
                TEXT,
                DROPDOWN,
                RATING_SCALE,
                MULTI_SELECT;

                private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

                public static a<QuestionType> getEntries() {
                    return $ENTRIES;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class QuestionValidation {
                public static final int $stable = 0;

                @b("type")
                private final int _type;

                /* JADX INFO: compiled from: SurveyData.kt */
                public enum ValidationType {
                    TEXT,
                    NUMBER,
                    EMAIL,
                    PHONE,
                    NO_VALIDATION,
                    FLOAT,
                    INTEGER;

                    private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

                    public static a<ValidationType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionValidation(int i10) {
                    this._type = i10;
                }

                private final int component1() {
                    return this._type;
                }

                public static /* synthetic */ QuestionValidation copy$default(QuestionValidation questionValidation, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = questionValidation._type;
                    }
                    return questionValidation.copy(i10);
                }

                public final QuestionValidation copy(int i10) {
                    return new QuestionValidation(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof QuestionValidation) && this._type == ((QuestionValidation) obj)._type;
                }

                public final ValidationType getValidationType() {
                    int i10 = this._type;
                    ValidationType validationType = ValidationType.TEXT;
                    if (i10 == validationType.ordinal()) {
                        return validationType;
                    }
                    ValidationType validationType2 = ValidationType.NUMBER;
                    if (i10 == validationType2.ordinal()) {
                        return validationType2;
                    }
                    ValidationType validationType3 = ValidationType.EMAIL;
                    if (i10 == validationType3.ordinal()) {
                        return validationType3;
                    }
                    ValidationType validationType4 = ValidationType.PHONE;
                    if (i10 == validationType4.ordinal()) {
                        return validationType4;
                    }
                    ValidationType validationType5 = ValidationType.FLOAT;
                    if (i10 == validationType5.ordinal()) {
                        return validationType5;
                    }
                    ValidationType validationType6 = ValidationType.INTEGER;
                    return i10 == validationType6.ordinal() ? validationType6 : ValidationType.NO_VALIDATION;
                }

                public int hashCode() {
                    return Integer.hashCode(this._type);
                }

                public String toString() {
                    return C0575j.b(new StringBuilder("QuestionValidation(_type="), this._type, ')');
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class SingleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SingleChoiceQuestionModel(String id, List<Block.Builder> title, boolean z10, List<String> options, boolean z11) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(options, "options");
                    this.options = options;
                    this.includeOther = z11;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class UnsupportedQuestion extends QuestionModel {
                public static final int $stable = 0;
                public static final UnsupportedQuestion INSTANCE = new UnsupportedQuestion();

                private UnsupportedQuestion() {
                    super("", EmptyList.f42983b, null, false, 4, null);
                }
            }

            public Question(List<Block.Builder> blocks, String id, int i10, QuestionData questionData) {
                i.e(blocks, "blocks");
                i.e(id, "id");
                i.e(questionData, "questionData");
                this.blocks = blocks;
                this.id = id;
                this.questionType = i10;
                this.questionData = questionData;
            }

            private final int component3() {
                return this.questionType;
            }

            private final QuestionData component4() {
                return this.questionData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Question copy$default(Question question, List list, String str, int i10, QuestionData questionData, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = question.blocks;
                }
                if ((i11 & 2) != 0) {
                    str = question.id;
                }
                if ((i11 & 4) != 0) {
                    i10 = question.questionType;
                }
                if ((i11 & 8) != 0) {
                    questionData = question.questionData;
                }
                return question.copy(list, str, i10, questionData);
            }

            public final List<Block.Builder> component1() {
                return this.blocks;
            }

            public final String component2() {
                return this.id;
            }

            public final Question copy(List<Block.Builder> blocks, String id, int i10, QuestionData questionData) {
                i.e(blocks, "blocks");
                i.e(id, "id");
                i.e(questionData, "questionData");
                return new Question(blocks, id, i10, questionData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Question)) {
                    return false;
                }
                Question question = (Question) obj;
                return i.a(this.blocks, question.blocks) && i.a(this.id, question.id) && this.questionType == question.questionType && i.a(this.questionData, question.questionData);
            }

            public final List<Block.Builder> getBlocks() {
                return this.blocks;
            }

            public final String getId() {
                return this.id;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x0192 A[PHI: r2
              0x0192: PHI (r2v29 io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType) = 
              (r2v25 io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType)
              (r2v26 io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType)
              (r2v27 io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType)
              (r2v28 io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionData$QuestionSubType)
             binds: [B:44:0x0190, B:47:0x019a, B:50:0x01a3, B:53:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
            public final QuestionModel getQuestionModel() {
                ArrayList arrayList;
                QuestionData.QuestionSubType questionSubType;
                int i10 = this.questionType;
                if (i10 == QuestionType.DROPDOWN.ordinal()) {
                    String str = this.id;
                    List<Block.Builder> list = this.blocks;
                    boolean required = this.questionData.getRequired();
                    String placeholder = this.questionData.getPlaceholder();
                    com.google.gson.e options = this.questionData.getOptions();
                    ArrayList arrayList2 = new ArrayList(m.y(options, 10));
                    Iterator<g> it = options.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().e());
                    }
                    return new DropDownQuestionModel(str, list, required, arrayList2, placeholder, null, 32, null);
                }
                if (i10 == QuestionType.INPUT.ordinal()) {
                    return new ShortTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), false, null, null, 448, null);
                }
                if (i10 == QuestionType.TEXT.ordinal()) {
                    return new LongTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), 0.0f, 0, null, 448, null);
                }
                if (i10 != QuestionType.RATING_SCALE.ordinal()) {
                    if (i10 != QuestionType.MULTI_SELECT.ordinal()) {
                        return UnsupportedQuestion.INSTANCE;
                    }
                    if (this.questionData.getMaxSelection() == 1) {
                        String str2 = this.id;
                        List<Block.Builder> list2 = this.blocks;
                        boolean required2 = this.questionData.getRequired();
                        com.google.gson.e options2 = this.questionData.getOptions();
                        ArrayList arrayList3 = new ArrayList(m.y(options2, 10));
                        Iterator<g> it2 = options2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().e());
                        }
                        return new SingleChoiceQuestionModel(str2, list2, required2, arrayList3, this.questionData.getIncludeOther());
                    }
                    String str3 = this.id;
                    List<Block.Builder> list3 = this.blocks;
                    boolean required3 = this.questionData.getRequired();
                    com.google.gson.e options3 = this.questionData.getOptions();
                    ArrayList arrayList4 = new ArrayList(m.y(options3, 10));
                    Iterator<g> it3 = options3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().e());
                    }
                    return new MultipleChoiceQuestionModel(str3, list3, required3, arrayList4, this.questionData.getIncludeOther(), this.questionData.getMinSelection(), this.questionData.getMaxSelection());
                }
                String str4 = this.id;
                List<Block.Builder> list4 = this.blocks;
                boolean required4 = this.questionData.getRequired();
                String lowerLabel = this.questionData.getLowerLabel();
                String upperLabel = this.questionData.getUpperLabel();
                int scaleStart = this.questionData.getScaleStart();
                int scaleEnd = this.questionData.getScaleEnd();
                if (this.questionData.getQuestionSubtype() == QuestionData.QuestionSubType.EMOJI.ordinal()) {
                    Gson gson = new Gson();
                    com.google.gson.e options4 = this.questionData.getOptions();
                    ArrayList arrayList5 = new ArrayList(m.y(options4, 10));
                    Iterator<g> it4 = options4.iterator();
                    while (it4.hasNext()) {
                        g next = it4.next();
                        arrayList5.add((NumericRatingQuestionModel.RatingOption.EmojiRatingOption) (next == null ? null : gson.b(new com.google.gson.internal.bind.a(next), L7.a.get(NumericRatingQuestionModel.RatingOption.EmojiRatingOption.class))));
                    }
                    arrayList = arrayList5;
                } else {
                    Na.i iVar = new Na.i(this.questionData.getScaleStart(), this.questionData.getScaleEnd(), 1);
                    ArrayList arrayList6 = new ArrayList(m.y(iVar, 10));
                    Iterator<Integer> it5 = iVar.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(new NumericRatingQuestionModel.RatingOption.NumericRatingOption(((v) it5).a()));
                    }
                    arrayList = arrayList6;
                }
                int questionSubtype = this.questionData.getQuestionSubtype();
                QuestionData.QuestionSubType questionSubType2 = QuestionData.QuestionSubType.NUMERIC;
                if (questionSubtype == questionSubType2.ordinal()) {
                    questionSubType = questionSubType2;
                } else {
                    questionSubType2 = QuestionData.QuestionSubType.STARS;
                    if (questionSubtype == questionSubType2.ordinal()) {
                        questionSubType = questionSubType2;
                    } else {
                        questionSubType2 = QuestionData.QuestionSubType.EMOJI;
                        if (questionSubtype == questionSubType2.ordinal()) {
                            questionSubType = questionSubType2;
                        } else {
                            questionSubType2 = QuestionData.QuestionSubType.NPS;
                            if (questionSubtype == questionSubType2.ordinal()) {
                                questionSubType = questionSubType2;
                            } else {
                                questionSubType = QuestionData.QuestionSubType.UNSUPPORTED;
                            }
                        }
                    }
                }
                return new NumericRatingQuestionModel(str4, list4, required4, arrayList, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
            }

            public int hashCode() {
                return this.questionData.hashCode() + q.b(this.questionType, B1.a.b(this.id, this.blocks.hashCode() * 31, 31), 31);
            }

            public String toString() {
                return "Question(blocks=" + this.blocks + ", id=" + this.id + ", questionType=" + this.questionType + ", questionData=" + this.questionData + ')';
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class DropDownQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final List<String> options;
                private final Integer placeHolderStringRes;
                private final String placeholder;

                public /* synthetic */ DropDownQuestionModel(String str, List list, boolean z10, List list2, String str2, Integer num, int i10, e eVar) {
                    this(str, list, z10, list2, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? null : num);
                }

                public final List<String> getOptions() {
                    return this.options;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DropDownQuestionModel(String id, List<Block.Builder> title, boolean z10, List<String> options, String placeholder, Integer num) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(options, "options");
                    i.e(placeholder, "placeholder");
                    this.options = options;
                    this.placeholder = placeholder;
                    this.placeHolderStringRes = num;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class ShortTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final boolean enabled;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final Integer titleStringRes;
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ ShortTextQuestionModel(String str, List list, boolean z10, String str2, QuestionValidation.ValidationType validationType, Integer num, boolean z11, Integer num2, Integer num3, int i10, e eVar) {
                    this(str, list, z10, (i10 & 8) != 0 ? "" : str2, validationType, num, (i10 & 64) != 0 ? true : z11, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? null : num3);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getEnabled() {
                    return this.enabled;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final Integer getTitleStringRes() {
                    return this.titleStringRes;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShortTextQuestionModel(String id, List<Block.Builder> title, boolean z10, String placeholder, QuestionValidation.ValidationType validationType, Integer num, boolean z11, Integer num2, Integer num3) {
                    super(id, title, null, z10, 4, null);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(placeholder, "placeholder");
                    i.e(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.enabled = z11;
                    this.placeHolderStringRes = num2;
                    this.titleStringRes = num3;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class UploadFileQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final int maxSelection;
                private final Set<String> supportedFileType;

                public /* synthetic */ UploadFileQuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, Set set, int i11, e eVar) {
                    this(str, list, (i11 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10, i10, set);
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final Set<String> getSupportedFileType() {
                    return this.supportedFileType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFileQuestionModel(String id, List<Block.Builder> title, StringProvider description, boolean z10, int i10, Set<String> supportedFileType) {
                    super(id, title, description, z10);
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(description, "description");
                    i.e(supportedFileType, "supportedFileType");
                    this.maxSelection = i10;
                    this.supportedFileType = supportedFileType;
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static class QuestionModel {
                public static final int $stable = 8;
                private final StringProvider description;
                private final String id;
                private final boolean isRequired;
                private final List<Block.Builder> title;

                public QuestionModel(String id, List<Block.Builder> title, StringProvider description, boolean z10) {
                    i.e(id, "id");
                    i.e(title, "title");
                    i.e(description, "description");
                    this.id = id;
                    this.title = title;
                    this.description = description;
                    this.isRequired = z10;
                }

                public final StringProvider getDescription() {
                    return this.description;
                }

                public final String getId() {
                    return this.id;
                }

                public final List<Block.Builder> getTitle() {
                    return this.title;
                }

                public final boolean isRequired() {
                    return this.isRequired;
                }

                public /* synthetic */ QuestionModel(String str, List list, StringProvider stringProvider, boolean z10, int i10, e eVar) {
                    this(str, list, (i10 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z10);
                }
            }

            /* JADX INFO: compiled from: SurveyData.kt */
            public static final class QuestionData {
                public static final int $stable = 8;

                @b("placeholder")
                private final String _placeholder;

                @b("character_limit")
                private final Integer characterLimit;

                @b("include_other")
                private final boolean includeOther;

                @b("lower_label")
                private final String lowerLabel;

                @b("maximum_selection")
                private final int maxSelection;

                @b("minimum_selection")
                private final int minSelection;

                @b("options")
                private final com.google.gson.e options;

                @b("type")
                private final int questionSubtype;

                @b("required")
                private final boolean required;

                @b("scale_end")
                private final int scaleEnd;

                @b("scale_start")
                private final int scaleStart;

                @b("upper_label")
                private final String upperLabel;

                @b("validation")
                private final QuestionValidation validation;

                /* JADX INFO: compiled from: SurveyData.kt */
                public enum QuestionSubType {
                    NUMERIC,
                    STARS,
                    EMOJI,
                    NPS,
                    UNSUPPORTED;

                    private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

                    public static a<QuestionSubType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionData(String str, boolean z10, com.google.gson.e options, String lowerLabel, String upperLabel, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num) {
                    i.e(options, "options");
                    i.e(lowerLabel, "lowerLabel");
                    i.e(upperLabel, "upperLabel");
                    this._placeholder = str;
                    this.required = z10;
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i10;
                    this.scaleEnd = i11;
                    this.includeOther = z11;
                    this.maxSelection = i12;
                    this.minSelection = i13;
                    this.questionSubtype = i14;
                    this.validation = questionValidation;
                    this.characterLimit = num;
                }

                private final String component1() {
                    return this._placeholder;
                }

                public final int component10() {
                    return this.minSelection;
                }

                public final int component11() {
                    return this.questionSubtype;
                }

                public final QuestionValidation component12() {
                    return this.validation;
                }

                public final Integer component13() {
                    return this.characterLimit;
                }

                public final boolean component2() {
                    return this.required;
                }

                public final com.google.gson.e component3() {
                    return this.options;
                }

                public final String component4() {
                    return this.lowerLabel;
                }

                public final String component5() {
                    return this.upperLabel;
                }

                public final int component6() {
                    return this.scaleStart;
                }

                public final int component7() {
                    return this.scaleEnd;
                }

                public final boolean component8() {
                    return this.includeOther;
                }

                public final int component9() {
                    return this.maxSelection;
                }

                public final QuestionData copy(String str, boolean z10, com.google.gson.e options, String lowerLabel, String upperLabel, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num) {
                    i.e(options, "options");
                    i.e(lowerLabel, "lowerLabel");
                    i.e(upperLabel, "upperLabel");
                    return new QuestionData(str, z10, options, lowerLabel, upperLabel, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuestionData)) {
                        return false;
                    }
                    QuestionData questionData = (QuestionData) obj;
                    return i.a(this._placeholder, questionData._placeholder) && this.required == questionData.required && i.a(this.options, questionData.options) && i.a(this.lowerLabel, questionData.lowerLabel) && i.a(this.upperLabel, questionData.upperLabel) && this.scaleStart == questionData.scaleStart && this.scaleEnd == questionData.scaleEnd && this.includeOther == questionData.includeOther && this.maxSelection == questionData.maxSelection && this.minSelection == questionData.minSelection && this.questionSubtype == questionData.questionSubtype && i.a(this.validation, questionData.validation) && i.a(this.characterLimit, questionData.characterLimit);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final com.google.gson.e getOptions() {
                    return this.options;
                }

                public final String getPlaceholder() {
                    String str = this._placeholder;
                    return str == null ? "" : str;
                }

                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                public final boolean getRequired() {
                    return this.required;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                public int hashCode() {
                    String str = this._placeholder;
                    int iB = q.b(this.questionSubtype, q.b(this.minSelection, q.b(this.maxSelection, D.b(q.b(this.scaleEnd, q.b(this.scaleStart, B1.a.b(this.upperLabel, B1.a.b(this.lowerLabel, (this.options.f28824b.hashCode() + D.b((str == null ? 0 : str.hashCode()) * 31, 31, this.required)) * 31, 31), 31), 31), 31), 31, this.includeOther), 31), 31), 31);
                    QuestionValidation questionValidation = this.validation;
                    int iHashCode = (iB + (questionValidation == null ? 0 : questionValidation.hashCode())) * 31;
                    Integer num = this.characterLimit;
                    return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "QuestionData(_placeholder=" + this._placeholder + ", required=" + this.required + ", options=" + this.options + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", scaleStart=" + this.scaleStart + ", scaleEnd=" + this.scaleEnd + ", includeOther=" + this.includeOther + ", maxSelection=" + this.maxSelection + ", minSelection=" + this.minSelection + ", questionSubtype=" + this.questionSubtype + ", validation=" + this.validation + ", characterLimit=" + this.characterLimit + ')';
                }

                public /* synthetic */ QuestionData(String str, boolean z10, com.google.gson.e eVar, String str2, String str3, int i10, int i11, boolean z11, int i12, int i13, int i14, QuestionValidation questionValidation, Integer num, int i15, e eVar2) {
                    this(str, z10, (i15 & 4) != 0 ? new com.google.gson.e() : eVar, str2, str3, i10, i11, z11, i12, i13, i14, questionValidation, num);
                }
            }
        }

        public Step(List list, String str, List list2, int i10, List list3, String str2, int i11, e eVar) {
            this(list, str, list2, i10, (i11 & 16) != 0 ? EmptyList.f42983b : list3, (i11 & 32) != 0 ? null : str2);
        }

        private final int component4() {
            return this._type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Step copy$default(Step step, List list, String str, List list2, int i10, List list3, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = step.blocks;
            }
            if ((i11 & 2) != 0) {
                str = step.id;
            }
            String str3 = str;
            if ((i11 & 4) != 0) {
                list2 = step.questions;
            }
            List list4 = list2;
            if ((i11 & 8) != 0) {
                i10 = step._type;
            }
            int i12 = i10;
            if ((i11 & 16) != 0) {
                list3 = step.actions;
            }
            List list5 = list3;
            if ((i11 & 32) != 0) {
                str2 = step.customButtonText;
            }
            return step.copy(list, str3, list4, i12, list5, str2);
        }

        public final List<Block.Builder> component1() {
            return this.blocks;
        }

        public final String component2() {
            return this.id;
        }

        public final List<Question> component3() {
            return this.questions;
        }

        public final List<SurveyActions> component5() {
            return this.actions;
        }

        public final String component6() {
            return this.customButtonText;
        }

        public final Step copy(List<Block.Builder> blocks, String id, List<Question> questions, int i10, List<SurveyActions> actions, String str) {
            i.e(blocks, "blocks");
            i.e(id, "id");
            i.e(questions, "questions");
            i.e(actions, "actions");
            return new Step(blocks, id, questions, i10, actions, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return i.a(this.blocks, step.blocks) && i.a(this.id, step.id) && i.a(this.questions, step.questions) && this._type == step._type && i.a(this.actions, step.actions) && i.a(this.customButtonText, step.customButtonText);
        }

        public final List<SurveyActions> getActions() {
            return this.actions;
        }

        public final List<Block.Builder> getBlocks() {
            return this.blocks;
        }

        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        public final String getId() {
            return this.id;
        }

        public final List<Question> getQuestions() {
            return this.questions;
        }

        public final StepType getType() {
            int i10 = this._type;
            if (i10 == 0) {
                return StepType.CONTENT;
            }
            if (i10 == 1) {
                return StepType.QUESTION;
            }
            if (i10 != 2) {
                return i10 != 3 ? StepType.UNSUPPORTED : StepType.THANK_YOU;
            }
            return StepType.INTRO;
        }

        public int hashCode() {
            int iD = p.d(q.b(this._type, p.d(B1.a.b(this.id, this.blocks.hashCode() * 31, 31), 31, this.questions), 31), 31, this.actions);
            String str = this.customButtonText;
            return iD + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Step(blocks=");
            sb2.append(this.blocks);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", questions=");
            sb2.append(this.questions);
            sb2.append(", _type=");
            sb2.append(this._type);
            sb2.append(", actions=");
            sb2.append(this.actions);
            sb2.append(", customButtonText=");
            return B7.b.g(sb2, this.customButtonText, ')');
        }

        public Step(List<Block.Builder> blocks, String id, List<Question> questions, int i10, List<SurveyActions> actions, String str) {
            i.e(blocks, "blocks");
            i.e(id, "id");
            i.e(questions, "questions");
            i.e(actions, "actions");
            this.blocks = blocks;
            this.id = id;
            this.questions = questions;
            this._type = i10;
            this.actions = actions;
            this.customButtonText = str;
        }
    }

    /* JADX INFO: compiled from: SurveyData.kt */
    public static final class SurveyActions {
        public static final int $stable = 0;

        @b("action_title")
        private final String actionTitle;

        @b("android_uri")
        private final String androidUri;

        @b("id")
        private final int id;

        @b("web_url")
        private final String webUrl;

        public SurveyActions(String actionTitle, int i10, String str, String str2) {
            i.e(actionTitle, "actionTitle");
            this.actionTitle = actionTitle;
            this.id = i10;
            this.webUrl = str;
            this.androidUri = str2;
        }

        public static /* synthetic */ SurveyActions copy$default(SurveyActions surveyActions, String str, int i10, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = surveyActions.actionTitle;
            }
            if ((i11 & 2) != 0) {
                i10 = surveyActions.id;
            }
            if ((i11 & 4) != 0) {
                str2 = surveyActions.webUrl;
            }
            if ((i11 & 8) != 0) {
                str3 = surveyActions.androidUri;
            }
            return surveyActions.copy(str, i10, str2, str3);
        }

        public final String component1() {
            return this.actionTitle;
        }

        public final int component2() {
            return this.id;
        }

        public final String component3() {
            return this.webUrl;
        }

        public final String component4() {
            return this.androidUri;
        }

        public final SurveyActions copy(String actionTitle, int i10, String str, String str2) {
            i.e(actionTitle, "actionTitle");
            return new SurveyActions(actionTitle, i10, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyActions)) {
                return false;
            }
            SurveyActions surveyActions = (SurveyActions) obj;
            return i.a(this.actionTitle, surveyActions.actionTitle) && this.id == surveyActions.id && i.a(this.webUrl, surveyActions.webUrl) && i.a(this.androidUri, surveyActions.androidUri);
        }

        public final String getActionTitle() {
            return this.actionTitle;
        }

        public final String getAndroidUri() {
            return this.androidUri;
        }

        public final int getId() {
            return this.id;
        }

        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            int iB = q.b(this.id, this.actionTitle.hashCode() * 31, 31);
            String str = this.webUrl;
            int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.androidUri;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SurveyActions(actionTitle=");
            sb2.append(this.actionTitle);
            sb2.append(", id=");
            sb2.append(this.id);
            sb2.append(", webUrl=");
            sb2.append(this.webUrl);
            sb2.append(", androidUri=");
            return B7.b.g(sb2, this.androidUri, ')');
        }

        public /* synthetic */ SurveyActions(String str, int i10, String str2, String str3, int i11, e eVar) {
            this(str, i10, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    public /* synthetic */ SurveyData(String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i10, boolean z10, boolean z11, int i11, e eVar) {
        this(str, str2, list, str3, surveyCustomization, surveySenderData, i10, z10, (i11 & 256) != 0 ? true : z11);
    }
}
