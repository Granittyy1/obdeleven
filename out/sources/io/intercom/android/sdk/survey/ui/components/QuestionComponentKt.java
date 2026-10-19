package io.intercom.android.sdk.survey.ui.components;

import Ia.l;
import Ia.p;
import Ia.q;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.material3.C1059k;
import androidx.compose.material3.CardKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.M0;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.N;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2334e;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionHeaderKt;
import io.intercom.android.sdk.survey.ui.questiontype.files.UploadFileQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.LongTextQuestionKt;
import io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import java.util.List;
import p293xa.r;

/* JADX INFO: compiled from: QuestionComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionComponentKt {
    /* JADX INFO: renamed from: QuestionComponent-lzVJ5Jw, reason: not valid java name */
    public static final void m403QuestionComponentlzVJ5Jw(androidx.compose.ui.h hVar, androidx.compose.ui.h hVar2, final QuestionState questionState, SurveyUiColors surveyUiColors, final l<? super String, r> onAnswerUpdated, long j, float f10, androidx.compose.ui.text.font.l lVar, long j10, l<? super AnswerClickData, r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        SurveyUiColors surveyUiColors2;
        int i12;
        long jM621getBackground0d7_KjU;
        kotlin.jvm.internal.i.e(questionState, "questionState");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "onAnswerUpdated");
        C1086g c1086gP = interfaceC1084f.p(435304450);
        int i13 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar3 = i13 != 0 ? aVar : hVar;
        androidx.compose.ui.h hVarF = (i11 & 2) != 0 ? PaddingKt.f(aVar, 16) : hVar2;
        if ((i11 & 8) != 0) {
            i12 = i10 & (-7169);
            surveyUiColors2 = questionState.getSurveyUiColors();
        } else {
            surveyUiColors2 = surveyUiColors;
            i12 = i10;
        }
        if ((i11 & 32) != 0) {
            i12 &= -458753;
            jM621getBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
        } else {
            jM621getBackground0d7_KjU = j;
        }
        float f11 = (i11 & 64) != 0 ? 1 : f10;
        final androidx.compose.ui.text.font.l lVar3 = (i11 & 128) != 0 ? androidx.compose.ui.text.font.l.f15442g : lVar;
        final long jG = (i11 & 256) != 0 ? G0.a.g(16) : j10;
        l<? super AnswerClickData, r> n10 = (i11 & 512) != 0 ? new N(5) : lVar2;
        final io.intercom.android.sdk.m5.inbox.ui.l lVar4 = new io.intercom.android.sdk.m5.inbox.ui.l(questionState, 1, onAnswerUpdated);
        final C2334e c2334e = new C2334e(questionState, onAnswerUpdated, (M0) c1086gP.x(CompositionLocalsKt.f14854p), (n) c1086gP.x(CompositionLocalsKt.f14848i));
        final ComposableLambdaImpl composableLambdaImplB = androidx.compose.runtime.internal.a.b(1322549775, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$questionHeader$1
            @Override // Ia.p
            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC1084f interfaceC1084f2, int i14) {
                if ((i14 & 11) == 2 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                List<Block.Builder> title = questionState.getQuestionModel().getTitle();
                StringProvider description = questionState.getQuestionModel().getDescription();
                boolean zIsRequired = questionState.getQuestionModel().isRequired();
                ValidationError validationError = questionState.getValidationError();
                androidx.compose.ui.text.font.l lVar5 = lVar3;
                long j11 = jG;
                SurveyData.Step.Question.QuestionModel questionModel = questionState.getQuestionModel();
                SurveyData.Step.Question.ShortTextQuestionModel shortTextQuestionModel = questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel ? (SurveyData.Step.Question.ShortTextQuestionModel) questionModel : null;
                QuestionHeaderComponentKt.m404QuestionHeadern1tc1qA(title, description, zIsRequired, validationError, lVar5, j11, null, shortTextQuestionModel != null ? shortTextQuestionModel.getTitleStringRes() : null, interfaceC1084f2, (StringProvider.$stable << 3) | 8, 64);
            }
        }, c1086gP);
        final androidx.compose.ui.h hVar4 = hVarF;
        final SurveyUiColors surveyUiColors3 = surveyUiColors2;
        final long j11 = jG;
        final l<? super AnswerClickData, r> lVar5 = n10;
        final androidx.compose.ui.text.font.l lVar6 = lVar3;
        final float f12 = f11;
        CardKt.b(androidx.compose.foundation.relocation.c.a(hVar3, questionState.getBringIntoViewRequester()), IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b, C1059k.a(jM621getBackground0d7_KjU, 0L, c1086gP, (i12 >> 15) & 14, 14), C1059k.b(f11, 62), null, androidx.compose.runtime.internal.a.b(2001737844, new q<InterfaceC0954n, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2
            @Override // Ia.q
            public /* bridge */ /* synthetic */ r invoke(InterfaceC0954n interfaceC0954n, InterfaceC1084f interfaceC1084f2, Integer num) {
                invoke(interfaceC0954n, interfaceC1084f2, num.intValue());
                return r.f47939a;
            }

            public final void invoke(InterfaceC0954n Card, InterfaceC1084f interfaceC1084f2, int i14) {
                kotlin.jvm.internal.i.e(Card, "$this$Card");
                if ((i14 & 81) == 16 && interfaceC1084f2.s()) {
                    interfaceC1084f2.w();
                    return;
                }
                final QuestionState questionState2 = questionState;
                androidx.compose.ui.h hVar5 = hVar4;
                l<Answer, r> lVar7 = lVar4;
                SurveyUiColors surveyUiColors4 = surveyUiColors3;
                p<InterfaceC1084f, Integer, r> pVar = composableLambdaImplB;
                l<InterfaceC1000i, r> lVar8 = c2334e;
                l<AnswerClickData, r> lVar9 = lVar5;
                final androidx.compose.ui.text.font.l lVar10 = lVar3;
                final long j12 = j11;
                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                int iF = interfaceC1084f2.F();
                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f2, aVar2);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
                if (interfaceC1084f2.u() == null) {
                    I.b.k();
                    throw null;
                }
                interfaceC1084f2.r();
                if (interfaceC1084f2.m()) {
                    interfaceC1084f2.v(aVar3);
                } else {
                    interfaceC1084f2.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                    k.b(iF, interfaceC1084f2, iF, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC);
                SurveyData.Step.Question.QuestionModel questionModel = questionState2.getQuestionModel();
                if (questionModel instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                    interfaceC1084f2.L(1477570659);
                    DropDownQuestionKt.DropDownQuestion(hVar5, (SurveyData.Step.Question.DropDownQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, pVar, interfaceC1084f2, 196672, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel) {
                    interfaceC1084f2.L(1478010146);
                    ShortTextQuestionKt.ShortTextQuestion(hVar5, (SurveyData.Step.Question.ShortTextQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, questionState2.getValidationError(), lVar8, pVar, interfaceC1084f2, 12582912, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                    interfaceC1084f2.L(1478572579);
                    LongTextQuestionKt.LongTextQuestion(hVar5, (SurveyData.Step.Question.LongTextQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, questionState2.getValidationError(), lVar8, pVar, interfaceC1084f2, 12582912, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.NumericRatingQuestionModel) {
                    interfaceC1084f2.L(1479135353);
                    NumericRatingQuestionKt.NumericRatingQuestion(hVar5, (SurveyData.Step.Question.NumericRatingQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, pVar, interfaceC1084f2, 196672, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                    interfaceC1084f2.L(1479583675);
                    SingleChoiceQuestionKt.SingleChoiceQuestion(hVar5, (SurveyData.Step.Question.SingleChoiceQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, pVar, interfaceC1084f2, 196672, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
                    interfaceC1084f2.L(1480032183);
                    MultipleChoiceQuestionKt.MultipleChoiceQuestion(hVar5, (SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel, questionState2.getAnswer(), lVar7, surveyUiColors4, pVar, interfaceC1084f2, 196672, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                    interfaceC1084f2.L(1480478490);
                    DatePickerQuestionKt.DatePickerQuestion(hVar5, (SurveyData.Step.Question.DatePickerQuestionModel) questionModel, questionState2.getAnswer(), lVar7, pVar, interfaceC1084f2, 24576, 0);
                    interfaceC1084f2.D();
                } else if (questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                    interfaceC1084f2.L(1480867695);
                    UploadFileQuestionKt.UploadFileQuestion(hVar5, (SurveyData.Step.Question.UploadFileQuestionModel) questionModel, questionState2.getAnswer(), lVar7, lVar9, androidx.compose.runtime.internal.a.b(-1590070470, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.components.QuestionComponentKt$QuestionComponent$2$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i15) {
                            if ((i15 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                UploadFileQuestionHeaderKt.m442UploadFileQuestionHeaderINMd_9Y(questionState2, lVar10, j12, interfaceC1084f3, 8);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, 196672, 0);
                    interfaceC1084f2.D();
                } else if (kotlin.jvm.internal.i.a(questionModel, SurveyData.Step.Question.UnsupportedQuestion.INSTANCE)) {
                    interfaceC1084f2.L(1481459516);
                    interfaceC1084f2.D();
                } else {
                    interfaceC1084f2.L(1481518571);
                    interfaceC1084f2.D();
                }
                interfaceC1084f2.J();
            }
        }, c1086gP), c1086gP, 196608, 16);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar5 = hVar3;
            final androidx.compose.ui.h hVar6 = hVarF;
            final SurveyUiColors surveyUiColors4 = surveyUiColors2;
            final long j12 = jM621getBackground0d7_KjU;
            final l<? super AnswerClickData, r> lVar7 = n10;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.components.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    androidx.compose.ui.h hVar7 = hVar5;
                    int i14 = i10;
                    int i15 = i11;
                    return QuestionComponentKt.QuestionComponent_lzVJ5Jw$lambda$3(hVar7, hVar6, questionState, surveyUiColors4, onAnswerUpdated, j12, f12, lVar6, j11, lVar7, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r QuestionComponent_lzVJ5Jw$lambda$0(AnswerClickData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r QuestionComponent_lzVJ5Jw$lambda$1(QuestionState questionState, l onAnswerUpdated, Answer it) {
        kotlin.jvm.internal.i.e(questionState, "$questionState");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        kotlin.jvm.internal.i.e(it, "it");
        questionState.setAnswer(it);
        if (!(questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getQuestionModel() instanceof SurveyData.Step.Question.LongTextQuestionModel)) {
            questionState.validate();
        }
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r QuestionComponent_lzVJ5Jw$lambda$2(QuestionState questionState, l onAnswerUpdated, M0 m7, n focusManager, InterfaceC1000i interfaceC1000i) {
        kotlin.jvm.internal.i.e(questionState, "$questionState");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        kotlin.jvm.internal.i.e(focusManager, "$focusManager");
        kotlin.jvm.internal.i.e(interfaceC1000i, "<this>");
        questionState.validate();
        onAnswerUpdated.invoke(questionState.getQuestionModel().getId());
        if (questionState.getValidationError() instanceof ValidationError.NoValidationError) {
            if (m7 != null) {
                m7.b();
            }
            focusManager.u(false);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r QuestionComponent_lzVJ5Jw$lambda$3(androidx.compose.ui.h hVar, androidx.compose.ui.h hVar2, QuestionState questionState, SurveyUiColors surveyUiColors, l onAnswerUpdated, long j, float f10, androidx.compose.ui.text.font.l lVar, long j10, l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(questionState, "$questionState");
        kotlin.jvm.internal.i.e(onAnswerUpdated, "$onAnswerUpdated");
        m403QuestionComponentlzVJ5Jw(hVar, hVar2, questionState, surveyUiColors, onAnswerUpdated, j, f10, lVar, j10, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
