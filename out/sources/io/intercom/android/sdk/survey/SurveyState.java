package io.intercom.android.sdk.survey;

import A1.C0575j;
import Z3.o;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;
import p293xa.r;

/* JADX INFO: compiled from: SurveyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SurveyState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Content extends SurveyState {
        public static final int $stable = 8;
        private final PrimaryCta primaryCta;
        private final List<QuestionState> questions;
        private final List<SecondaryCta> secondaryCtaActions;
        private final List<Block.Builder> stepTitle;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        /* JADX INFO: compiled from: SurveyViewModel.kt */
        public static abstract class PrimaryCta {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: SurveyViewModel.kt */
            public static final class Custom extends PrimaryCta {
                public static final int $stable = 0;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String text) {
                    super(null);
                    i.e(text, "text");
                    this.text = text;
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = custom.text;
                    }
                    return custom.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final Custom copy(String text) {
                    i.e(text, "text");
                    return new Custom(text);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Custom) && i.a(this.text, ((Custom) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return B7.b.g(new StringBuilder("Custom(text="), this.text, ')');
                }
            }

            /* JADX INFO: compiled from: SurveyViewModel.kt */
            public static final class Fallback extends PrimaryCta {
                public static final int $stable = 0;
                private final int fallbackTextRes;

                public Fallback(int i10) {
                    super(null);
                    this.fallbackTextRes = i10;
                }

                public static /* synthetic */ Fallback copy$default(Fallback fallback, int i10, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        i10 = fallback.fallbackTextRes;
                    }
                    return fallback.copy(i10);
                }

                public final int component1() {
                    return this.fallbackTextRes;
                }

                public final Fallback copy(int i10) {
                    return new Fallback(i10);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Fallback) && this.fallbackTextRes == ((Fallback) obj).fallbackTextRes;
                }

                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.fallbackTextRes);
                }

                public String toString() {
                    return C0575j.b(new StringBuilder("Fallback(fallbackTextRes="), this.fallbackTextRes, ')');
                }
            }

            public /* synthetic */ PrimaryCta(e eVar) {
                this();
            }

            private PrimaryCta() {
            }
        }

        /* JADX INFO: compiled from: SurveyViewModel.kt */
        public static final class SecondaryCta {
            public static final int $stable = 0;
            private final String buttonText;
            private final String destination;
            private final boolean isExternalUrl;

            public SecondaryCta(String buttonText, String destination, boolean z10) {
                i.e(buttonText, "buttonText");
                i.e(destination, "destination");
                this.buttonText = buttonText;
                this.destination = destination;
                this.isExternalUrl = z10;
            }

            public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, String str2, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = secondaryCta.buttonText;
                }
                if ((i10 & 2) != 0) {
                    str2 = secondaryCta.destination;
                }
                if ((i10 & 4) != 0) {
                    z10 = secondaryCta.isExternalUrl;
                }
                return secondaryCta.copy(str, str2, z10);
            }

            public final String component1() {
                return this.buttonText;
            }

            public final String component2() {
                return this.destination;
            }

            public final boolean component3() {
                return this.isExternalUrl;
            }

            public final SecondaryCta copy(String buttonText, String destination, boolean z10) {
                i.e(buttonText, "buttonText");
                i.e(destination, "destination");
                return new SecondaryCta(buttonText, destination, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryCta)) {
                    return false;
                }
                SecondaryCta secondaryCta = (SecondaryCta) obj;
                return i.a(this.buttonText, secondaryCta.buttonText) && i.a(this.destination, secondaryCta.destination) && this.isExternalUrl == secondaryCta.isExternalUrl;
            }

            public final String getButtonText() {
                return this.buttonText;
            }

            public final String getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isExternalUrl) + B1.a.b(this.destination, this.buttonText.hashCode() * 31, 31);
            }

            public final boolean isExternalUrl() {
                return this.isExternalUrl;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SecondaryCta(buttonText=");
                sb2.append(this.buttonText);
                sb2.append(", destination=");
                sb2.append(this.destination);
                sb2.append(", isExternalUrl=");
                return o.d(sb2, this.isExternalUrl, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(List<Block.Builder> stepTitle, List<QuestionState> questions, List<SecondaryCta> secondaryCtaActions, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            i.e(stepTitle, "stepTitle");
            i.e(questions, "questions");
            i.e(secondaryCtaActions, "secondaryCtaActions");
            i.e(primaryCta, "primaryCta");
            i.e(surveyUiColors, "surveyUiColors");
            i.e(topBarState, "topBarState");
            this.stepTitle = stepTitle;
            this.questions = questions;
            this.secondaryCtaActions = secondaryCtaActions;
            this.primaryCta = primaryCta;
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, List list2, List list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = content.stepTitle;
            }
            if ((i10 & 2) != 0) {
                list2 = content.questions;
            }
            List list4 = list2;
            if ((i10 & 4) != 0) {
                list3 = content.secondaryCtaActions;
            }
            List list5 = list3;
            if ((i10 & 8) != 0) {
                primaryCta = content.primaryCta;
            }
            PrimaryCta primaryCta2 = primaryCta;
            if ((i10 & 16) != 0) {
                surveyUiColors = content.surveyUiColors;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            if ((i10 & 32) != 0) {
                topBarState = content.topBarState;
            }
            return content.copy(list, list4, list5, primaryCta2, surveyUiColors2, topBarState);
        }

        public final List<Block.Builder> component1() {
            return this.stepTitle;
        }

        public final List<QuestionState> component2() {
            return this.questions;
        }

        public final List<SecondaryCta> component3() {
            return this.secondaryCtaActions;
        }

        public final PrimaryCta component4() {
            return this.primaryCta;
        }

        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        public final TopBarState component6() {
            return this.topBarState;
        }

        public final Content copy(List<Block.Builder> stepTitle, List<QuestionState> questions, List<SecondaryCta> secondaryCtaActions, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            i.e(stepTitle, "stepTitle");
            i.e(questions, "questions");
            i.e(secondaryCtaActions, "secondaryCtaActions");
            i.e(primaryCta, "primaryCta");
            i.e(surveyUiColors, "surveyUiColors");
            i.e(topBarState, "topBarState");
            return new Content(stepTitle, questions, secondaryCtaActions, primaryCta, surveyUiColors, topBarState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return i.a(this.stepTitle, content.stepTitle) && i.a(this.questions, content.questions) && i.a(this.secondaryCtaActions, content.secondaryCtaActions) && i.a(this.primaryCta, content.primaryCta) && i.a(this.surveyUiColors, content.surveyUiColors) && i.a(this.topBarState, content.topBarState);
        }

        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        public final List<QuestionState> getQuestions() {
            return this.questions;
        }

        public final List<SecondaryCta> getSecondaryCtaActions() {
            return this.secondaryCtaActions;
        }

        public final List<Block.Builder> getStepTitle() {
            return this.stepTitle;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return this.topBarState.hashCode() + ((this.surveyUiColors.hashCode() + ((this.primaryCta.hashCode() + p.d(p.d(this.stepTitle.hashCode() * 31, 31, this.questions), 31, this.secondaryCtaActions)) * 31)) * 31);
        }

        public String toString() {
            return "Content(stepTitle=" + this.stepTitle + ", questions=" + this.questions + ", secondaryCtaActions=" + this.secondaryCtaActions + ", primaryCta=" + this.primaryCta + ", surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static abstract class Error extends SurveyState {
        public static final int $stable = 0;

        public /* synthetic */ Error(e eVar) {
            this();
        }

        public abstract int getMessageResId();

        /* JADX INFO: compiled from: SurveyViewModel.kt */
        public static final class WithCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final Ia.a<r> onClick;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            public /* synthetic */ WithCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState, Ia.a aVar, int i11, e eVar) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors, topBarState, aVar);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            public final Ia.a<r> getOnClick() {
                return this.onClick;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState, Ia.a<r> onClick) {
                super(null);
                i.e(surveyUiColors, "surveyUiColors");
                i.e(topBarState, "topBarState");
                i.e(onClick, "onClick");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
                this.onClick = onClick;
            }
        }

        /* JADX INFO: compiled from: SurveyViewModel.kt */
        public static final class WithoutCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            public /* synthetic */ WithoutCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState, int i11, e eVar) {
                this((i11 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i10, surveyUiColors, topBarState);
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutCTA(int i10, SurveyUiColors surveyUiColors, TopBarState topBarState) {
                super(null);
                i.e(surveyUiColors, "surveyUiColors");
                i.e(topBarState, "topBarState");
                this.messageResId = i10;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
            }
        }

        private Error() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Initial extends SurveyState {
        public static final int $stable = 0;
        public static final Initial INSTANCE;
        private static final SurveyUiColors surveyUiColors;
        private static final TopBarState topBarState;

        static {
            Initial initial = new Initial();
            INSTANCE = initial;
            surveyUiColors = C4.a.g(null, null, 3, null);
            topBarState = new TopBarState.NoTopBarState(true, initial.getSurveyUiColors(), null, 4, null);
        }

        private Initial() {
            super(null);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return topBarState;
        }
    }

    /* JADX INFO: compiled from: SurveyViewModel.kt */
    public static final class Loading extends SurveyState {
        public static final int $stable = 0;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            i.e(surveyUiColors, "surveyUiColors");
            i.e(topBarState, "topBarState");
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, SurveyUiColors surveyUiColors, TopBarState topBarState, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                surveyUiColors = loading.surveyUiColors;
            }
            if ((i10 & 2) != 0) {
                topBarState = loading.topBarState;
            }
            return loading.copy(surveyUiColors, topBarState);
        }

        public final SurveyUiColors component1() {
            return this.surveyUiColors;
        }

        public final TopBarState component2() {
            return this.topBarState;
        }

        public final Loading copy(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            i.e(surveyUiColors, "surveyUiColors");
            i.e(topBarState, "topBarState");
            return new Loading(surveyUiColors, topBarState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return i.a(this.surveyUiColors, loading.surveyUiColors) && i.a(this.topBarState, loading.topBarState);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return this.topBarState.hashCode() + (this.surveyUiColors.hashCode() * 31);
        }

        public String toString() {
            return "Loading(surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    public /* synthetic */ SurveyState(e eVar) {
        this();
    }

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState getTopBarState();

    private SurveyState() {
    }
}
