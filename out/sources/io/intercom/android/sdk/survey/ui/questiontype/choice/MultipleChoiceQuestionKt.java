package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Ia.p;
import android.content.Context;
import androidx.compose.animation.D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2272c;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.Iterator;
import kotlin.collections.B;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.C;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: MultipleChoiceQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MultipleChoiceQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.MultipleChoiceQuestionKt$PreviewQuestion$1, reason: invalid class name */
    /* JADX INFO: compiled from: MultipleChoiceQuestion.kt */
    public static final class AnonymousClass1 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ SurveyUiColors $surveyUiColors;

        public AnonymousClass1(SurveyUiColors surveyUiColors) {
            this.$surveyUiColors = surveyUiColors;
        }

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
                MultipleChoiceQuestionKt.MultipleChoiceQuestion(null, new SurveyData.Step.Question.MultipleChoiceQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Question Title")), true, kotlin.collections.l.s("Option A", "Option B", "Option C", "Option D", "Option E"), true, 2, 3), new Answer.MultipleAnswer(B.C("Option B", "Option D"), Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE), new h(), this.$surveyUiColors, null, interfaceC1084f, 3648, 33);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void MultipleChoiceQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, final Ia.l<? super Answer, r> onAnswer, final SurveyUiColors colors, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        InterfaceC1084f.a.C0153a c0153a;
        int i12;
        int i13;
        kotlin.jvm.internal.i.e(multipleChoiceQuestionModel, "multipleChoiceQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        kotlin.jvm.internal.i.e(colors, "colors");
        C1086g c1086gP = interfaceC1084f.p(928787358);
        int i14 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i14 != 0 ? aVar : hVar;
        final Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM420getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$MultipleChoiceQuestionKt.INSTANCE.m420getLambda1$intercom_sdk_base_release() : pVar;
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar2 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar2, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar3 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar3, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar4 = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
            J4.i.d(i15, c1086gP, i15, pVar4);
        }
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i16 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
        c1086gP.r();
        final androidx.compose.ui.h hVar3 = hVar2;
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, c0953mA);
        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
            J4.i.d(i16, c1086gP, i16, pVar4);
        }
        R0.a(pVar5, c1086gP, hVarC2);
        pVarM420getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i10 >> 15) & 14));
        c1086gP.L(1187769308);
        Iterator<T> it = multipleChoiceQuestionModel.getOptions().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0153a = InterfaceC1084f.a.f12980a;
            i12 = 1;
            if (!zHasNext) {
                break;
            }
            final String str = (String) it.next();
            boolean zContains = answer2 instanceof Answer.MultipleAnswer ? ((Answer.MultipleAnswer) answer2).m407getAnswers().contains(str) : false;
            Lb.a.a(c1086gP, W.e(aVar, 8));
            c1086gP.L(1187778356);
            long jM661getAccessibleColorOnWhiteBackground8_81llA = zContains ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            c1086gP.T(false);
            long jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA);
            float f10 = zContains ? 2 : 1;
            androidx.compose.ui.text.font.l lVar = zContains ? androidx.compose.ui.text.font.l.j : androidx.compose.ui.text.font.l.f15442g;
            c1086gP.L(-1655251098);
            int i17 = ((((i10 & 896) ^ 384) <= 256 || !c1086gP.K(answer2)) && (i10 & 384) != 256) ? 0 : 1;
            if ((((i10 & 7168) ^ 3072) <= 2048 || !c1086gP.K(onAnswer)) && (i10 & 3072) != 2048) {
                i12 = 0;
            }
            int i18 = i17 | i12 | (c1086gP.K(str) ? 1 : 0);
            Object objF = c1086gP.f();
            if (i18 != 0 || objF == c0153a) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.d
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(answer2, onAnswer, str, (String) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            ChoicePillKt.m415ChoicePillUdaoDFU(zContains, (Ia.l) objF, str, jM659getAccessibleBorderColor8_81llA, f10, jM661getAccessibleColorOnWhiteBackground8_81llA, lVar, 0L, c1086gP, 0, 128);
            pVarM420getLambda1$intercom_sdk_base_release = pVarM420getLambda1$intercom_sdk_base_release;
        }
        final p<? super InterfaceC1084f, ? super Integer, r> pVar6 = pVarM420getLambda1$intercom_sdk_base_release;
        c1086gP.T(false);
        c1086gP.L(1187812115);
        if (multipleChoiceQuestionModel.getIncludeOther()) {
            boolean z10 = answer2 instanceof Answer.MultipleAnswer;
            final boolean z11 = z10 && !kotlin.jvm.internal.i.a(((Answer.MultipleAnswer) answer2).getOtherAnswer(), Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
            Lb.a.a(c1086gP, W.e(aVar, 8));
            c1086gP.L(1187840539);
            long jM661getAccessibleColorOnWhiteBackground8_81llA2 = z11 ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            c1086gP.T(false);
            long jM659getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA2);
            float f11 = z11 ? 2 : 1;
            androidx.compose.ui.text.font.l lVar2 = z11 ? androidx.compose.ui.text.font.l.j : androidx.compose.ui.text.font.l.f15442g;
            String string = z10 ? ((Answer.MultipleAnswer) answer2).getOtherAnswer().toString() : "";
            c1086gP.L(1187859972);
            int i19 = (i10 & 896) ^ 384;
            int i20 = (i10 & 7168) ^ 3072;
            boolean zC = c1086gP.c(z11) | ((i19 > 256 && c1086gP.K(answer2)) || (i10 & 384) == 256) | ((i20 > 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048);
            Object objF2 = c1086gP.f();
            Object obj = objF2;
            if (zC || objF2 == c0153a) {
                Ia.a aVar3 = new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.e
                    @Override // Ia.a
                    public final Object invoke() {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(z11, answer2, onAnswer);
                    }
                };
                c1086gP.E(aVar3);
                obj = aVar3;
            }
            Ia.a aVar4 = (Ia.a) obj;
            c1086gP.T(false);
            c1086gP.L(1187870912);
            boolean z12 = ((i19 > 256 && c1086gP.K(answer2)) || (i10 & 384) == 256) | ((i20 > 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048);
            Object objF3 = c1086gP.f();
            Object obj2 = objF3;
            if (z12 || objF3 == c0153a) {
                Ia.l lVar3 = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.f
                    @Override // Ia.l
                    public final Object invoke(Object obj3) {
                        return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(answer2, onAnswer, (String) obj3);
                    }
                };
                c1086gP.E(lVar3);
                obj2 = lVar3;
            }
            c1086gP.T(false);
            String str2 = string;
            i13 = 8;
            OtherOptionKt.m423OtherOptionYCJL08c(z11, colors, str2, aVar4, (Ia.l) obj2, jM659getAccessibleBorderColor8_81llA2, f11, jM661getAccessibleColorOnWhiteBackground8_81llA2, lVar2, 0L, c1086gP, (i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 512);
        } else {
            i13 = 8;
        }
        c1086gP.T(false);
        c1086gP.L(1187882858);
        if (multipleChoiceQuestionModel.getMinSelection() > i12) {
            Phrase phraseFrom = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_surveys_multi_select_too_few_responses);
            phraseFrom.put("response_count", multipleChoiceQuestionModel.getMinSelection());
            TextKt.b(phraseFrom.format().toString(), PaddingKt.j(aVar, 0.0f, i13, 0.0f, 0.0f, 13), H.f13497d, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType05(), c1086gP, 200112, 0, 65488);
        }
        c1086gP.T(false);
        Lb.a.a(c1086gP, W.e(aVar, i13));
        c1086gP.T(i12);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Answer answer3 = answer2;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.g
                @Override // Ia.p
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    p pVar7 = pVar6;
                    int i21 = i10;
                    int i22 = i11;
                    return MultipleChoiceQuestionKt.MultipleChoiceQuestion$lambda$9(hVar4, multipleChoiceQuestionModel, answer3, onAnswer, colors, pVar7, i21, i22, (InterfaceC1084f) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r MultipleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1$lambda$0(Answer answer, Ia.l onAnswer, String option, String it) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(option, "$option");
        kotlin.jvm.internal.i.e(it, "it");
        if (answer instanceof Answer.MultipleAnswer) {
            onAnswer.invoke(((Answer.MultipleAnswer) answer).copyWithAnswerToggled(option));
        } else {
            onAnswer.invoke(new Answer.MultipleAnswer(C.u(option), null, 2, 0 == true ? 1 : 0));
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MultipleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(boolean z10, Answer answer, Ia.l onAnswer) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        if (z10) {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.NotSelected.INSTANCE);
        } else {
            MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, Answer.MultipleAnswer.OtherAnswer.SelectedNoText.INSTANCE);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MultipleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Answer answer, Ia.l onAnswer, String it) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(it, "it");
        MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(answer, onAnswer, new Answer.MultipleAnswer.OtherAnswer.SelectedWithText(it));
        return r.f47939a;
    }

    private static final void MultipleChoiceQuestion$lambda$8$lambda$7$switchOtherAnswer(Answer answer, Ia.l<? super Answer, r> lVar, Answer.MultipleAnswer.OtherAnswer otherAnswer) {
        if (answer instanceof Answer.MultipleAnswer) {
            lVar.invoke(((Answer.MultipleAnswer) answer).copyWithOther(otherAnswer));
        } else {
            lVar.invoke(new Answer.MultipleAnswer(EmptySet.f42985b, otherAnswer));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MultipleChoiceQuestion$lambda$9(androidx.compose.ui.h hVar, SurveyData.Step.Question.MultipleChoiceQuestionModel multipleChoiceQuestionModel, Answer answer, Ia.l onAnswer, SurveyUiColors colors, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(multipleChoiceQuestionModel, "$multipleChoiceQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(colors, "$colors");
        MultipleChoiceQuestion(hVar, multipleChoiceQuestionModel, answer, onAnswer, colors, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void MultipleChoiceQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1537454351);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            PreviewQuestion(C4.a.g(null, null, 3, null), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MultipleChoiceQuestionPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MultipleChoiceQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void MultipleChoiceQuestionPreviewDark(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(756027931);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurveyUiColors surveyUiColorsG = C4.a.g(null, null, 3, null);
            PreviewQuestion(surveyUiColorsG.m355copyqa9m3tE((27 & 1) != 0 ? surveyUiColorsG.background : 0L, (27 & 2) != 0 ? surveyUiColorsG.onBackground : 0L, (27 & 4) != 0 ? surveyUiColorsG.button : H.f13502i, (27 & 8) != 0 ? surveyUiColorsG.onButton : 0L, (27 & 16) != 0 ? surveyUiColorsG.dropDownSelectedColor : null), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r MultipleChoiceQuestionPreviewDark$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        MultipleChoiceQuestionPreviewDark(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void PreviewQuestion(SurveyUiColors surveyUiColors, InterfaceC1084f interfaceC1084f, int i10) {
        int i11;
        kotlin.jvm.internal.i.e(surveyUiColors, "surveyUiColors");
        C1086g c1086gP = interfaceC1084f.p(-1753720526);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(surveyUiColors) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-245477028, new AnonymousClass1(surveyUiColors), c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.helpcenter.ui.g(i10, 1, surveyUiColors);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r PreviewQuestion$lambda$12(SurveyUiColors surveyUiColors, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(surveyUiColors, "$surveyUiColors");
        PreviewQuestion(surveyUiColors, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
