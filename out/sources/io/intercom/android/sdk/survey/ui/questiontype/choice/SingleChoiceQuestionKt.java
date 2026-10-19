package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Ia.p;
import S4.o;
import androidx.compose.animation.D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.Q;
import io.intercom.android.sdk.m5.components.U;
import io.intercom.android.sdk.m5.conversation.ui.C2393h;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.C2338i;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SingleChoiceQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SingleChoiceQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.SingleChoiceQuestionKt$SingleChoiceQuestionPreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: SingleChoiceQuestion.kt */
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
                SingleChoiceQuestionKt.SingleChoiceQuestion(null, new SurveyData.Step.Question.SingleChoiceQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Question title")), true, kotlin.collections.l.s("Option 1", "Option 2", "Option 3", "Option 4"), false), new Answer.SingleAnswer("Option 2"), new n(), this.$surveyUiColors, null, interfaceC1084f, 3136, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SingleChoiceQuestion(androidx.compose.ui.h hVar, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, final Ia.l<? super Answer, r> onAnswer, SurveyUiColors colors, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        InterfaceC1084f.a.C0153a c0153a;
        boolean z10;
        Object objF;
        kotlin.jvm.internal.i.e(singleChoiceQuestionModel, "singleChoiceQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        kotlin.jvm.internal.i.e(colors, "colors");
        C1086g c1086gP = interfaceC1084f.p(-538592394);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar : hVar;
        Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM422getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$SingleChoiceQuestionKt.INSTANCE.m422getLambda1$intercom_sdk_base_release() : pVar;
        final androidx.compose.ui.focus.n nVar = (androidx.compose.ui.focus.n) c1086gP.x(CompositionLocalsKt.f14848i);
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i13 = c1086gP.f12996P;
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
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar4);
        }
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        c1086gP.L(924114601);
        Object objF2 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
        if (objF2 == c0153a2) {
            objF2 = J0.f(Boolean.FALSE);
            c1086gP.E(objF2);
        }
        final X x10 = (X) objF2;
        c1086gP.T(false);
        androidx.compose.ui.h hVar3 = hVar2;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, c0953mA);
        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar4);
        }
        R0.a(pVar5, c1086gP, hVarC2);
        pVarM422getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i10 >> 15) & 14));
        c1086gP.L(891864023);
        Iterator it = singleChoiceQuestionModel.getOptions().iterator();
        while (it.hasNext()) {
            final String str = (String) it.next();
            Lb.a.a(c1086gP, W.e(aVar, 8));
            boolean z11 = (answer2 instanceof Answer.SingleAnswer) && kotlin.jvm.internal.i.a(((Answer.SingleAnswer) answer2).getAnswer(), str);
            c1086gP.L(891870284);
            long jM661getAccessibleColorOnWhiteBackground8_81llA = z11 ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            c1086gP.T(false);
            ChoicePillKt.m415ChoicePillUdaoDFU(z11, new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.l
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(nVar, x10, onAnswer, str, (String) obj);
                }
            }, getTranslatedOption(str, c1086gP, 0), H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU()), 1, jM661getAccessibleColorOnWhiteBackground8_81llA, z11 ? androidx.compose.ui.text.font.l.j : androidx.compose.ui.text.font.l.f15442g, H.b(DatePickerQuestionKt.contentAlpha(z11, c1086gP, 0), ColorExtensionsKt.m658generateTextColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA)), c1086gP, 24576, 0);
            it = it;
            nVar = nVar;
            pVarM422getLambda1$intercom_sdk_base_release = pVarM422getLambda1$intercom_sdk_base_release;
        }
        p<? super InterfaceC1084f, ? super Integer, r> pVar6 = pVarM422getLambda1$intercom_sdk_base_release;
        c1086gP.T(false);
        c1086gP.L(891905968);
        if (singleChoiceQuestionModel.getIncludeOther()) {
            Lb.a.a(c1086gP, W.e(aVar, 8));
            boolean zBooleanValue = ((Boolean) x10.getValue()).booleanValue();
            c1086gP.L(891911980);
            long jM661getAccessibleColorOnWhiteBackground8_81llA2 = zBooleanValue ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
            c1086gP.T(false);
            long jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA2);
            float f10 = zBooleanValue ? 2 : 1;
            androidx.compose.ui.text.font.l lVar = zBooleanValue ? androidx.compose.ui.text.font.l.j : androidx.compose.ui.text.font.l.f15442g;
            String answer3 = answer2 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer2).getAnswer() : "";
            c1086gP.L(891929809);
            int i15 = (i10 & 7168) ^ 3072;
            boolean z12 = (i15 > 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048;
            Object objF3 = c1086gP.f();
            if (z12) {
                c0153a = c0153a2;
            } else {
                if (objF3 == c0153a) {
                }
                c0153a = c0153a2;
                Ia.a aVar3 = (Ia.a) objF3;
                c1086gP.T(false);
                c1086gP.L(891936400);
                z10 = (i15 <= 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048;
                objF = c1086gP.f();
                if (z10 || objF == c0153a) {
                    objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(onAnswer, (String) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                OtherOptionKt.m423OtherOptionYCJL08c(zBooleanValue, colors, answer3, aVar3, (Ia.l) objF, jM659getAccessibleBorderColor8_81llA, f10, jM661getAccessibleColorOnWhiteBackground8_81llA2, lVar, 0L, c1086gP, (i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 512);
            }
            c0153a = c0153a2;
            objF3 = new C2393h(onAnswer, x10, 1);
            c1086gP.E(objF3);
            c0153a = c0153a2;
            Ia.a aVar4 = (Ia.a) objF3;
            c1086gP.T(false);
            c1086gP.L(891936400);
            if (i15 <= 2048) {
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(onAnswer, (String) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.m
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return SingleChoiceQuestionKt.SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(onAnswer, (String) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            OtherOptionKt.m423OtherOptionYCJL08c(zBooleanValue, colors, answer3, aVar4, (Ia.l) objF, jM659getAccessibleBorderColor8_81llA, f10, jM661getAccessibleColorOnWhiteBackground8_81llA2, lVar, 0L, c1086gP, (i10 >> 9) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 512);
        }
        c1086gP.T(false);
        c1086gP.T(true);
        c1086gP.T(true);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2338i(hVar3, singleChoiceQuestionModel, answer2, onAnswer, colors, pVar6, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestion$lambda$8$lambda$7$lambda$2$lambda$1(androidx.compose.ui.focus.n focusManager, X otherOptionSelectionState, Ia.l onAnswer, String unparsedOption, String it) {
        kotlin.jvm.internal.i.e(focusManager, "$focusManager");
        kotlin.jvm.internal.i.e(otherOptionSelectionState, "$otherOptionSelectionState");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(unparsedOption, "$unparsedOption");
        kotlin.jvm.internal.i.e(it, "it");
        focusManager.u(false);
        otherOptionSelectionState.setValue(Boolean.FALSE);
        onAnswer.invoke(new Answer.SingleAnswer(unparsedOption));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r SingleChoiceQuestion$lambda$8$lambda$7$lambda$4$lambda$3(Ia.l onAnswer, X otherOptionSelectionState) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(otherOptionSelectionState, "$otherOptionSelectionState");
        onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        otherOptionSelectionState.setValue(Boolean.valueOf(!((Boolean) otherOptionSelectionState.getValue()).booleanValue()));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestion$lambda$8$lambda$7$lambda$6$lambda$5(Ia.l onAnswer, String it) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(it, "it");
        onAnswer.invoke(new Answer.SingleAnswer(it));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestion$lambda$9(androidx.compose.ui.h hVar, SurveyData.Step.Question.SingleChoiceQuestionModel singleChoiceQuestionModel, Answer answer, Ia.l onAnswer, SurveyUiColors colors, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(singleChoiceQuestionModel, "$singleChoiceQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(colors, "$colors");
        SingleChoiceQuestion(hVar, singleChoiceQuestionModel, answer, onAnswer, colors, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    public static final void SingleChoiceQuestionPreview(final SurveyUiColors surveyUiColors, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        kotlin.jvm.internal.i.e(surveyUiColors, "surveyUiColors");
        C1086g c1086gP = interfaceC1084f.p(1547860655);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(surveyUiColors) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(1452787289, new AnonymousClass1(surveyUiColors), c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return SingleChoiceQuestionKt.SingleChoiceQuestionPreview$lambda$12(surveyUiColors, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestionPreview$lambda$12(SurveyUiColors surveyUiColors, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(surveyUiColors, "$surveyUiColors");
        SingleChoiceQuestionPreview(surveyUiColors, interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void SingleChoiceQuestionPreviewDark(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(567326043);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurveyUiColors surveyUiColorsG = C4.a.g(null, null, 3, null);
            SingleChoiceQuestionPreview(surveyUiColorsG.m355copyqa9m3tE((27 & 1) != 0 ? surveyUiColorsG.background : 0L, (27 & 2) != 0 ? surveyUiColorsG.onBackground : 0L, (27 & 4) != 0 ? surveyUiColorsG.button : H.f13502i, (27 & 8) != 0 ? surveyUiColorsG.onButton : 0L, (27 & 16) != 0 ? surveyUiColorsG.dropDownSelectedColor : null), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Q(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestionPreviewDark$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SingleChoiceQuestionPreviewDark(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void SingleChoiceQuestionPreviewLight(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1626655857);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SingleChoiceQuestionPreview(C4.a.g(null, null, 3, null), c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new U(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SingleChoiceQuestionPreviewLight$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SingleChoiceQuestionPreviewLight(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final String getTranslatedOption(String str, InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.L(-1189227411);
        if (kotlin.jvm.internal.i.a(str, "true")) {
            interfaceC1084f.L(-1210053749);
            str = o.p(interfaceC1084f, io.intercom.android.sdk.R.string.intercom_attribute_collector_positive);
            interfaceC1084f.D();
        } else if (kotlin.jvm.internal.i.a(str, "false")) {
            interfaceC1084f.L(-1210051093);
            str = o.p(interfaceC1084f, io.intercom.android.sdk.R.string.intercom_attribute_collector_negative);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(-1210048586);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return str;
    }
}
