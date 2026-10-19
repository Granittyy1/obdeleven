package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.p;
import android.content.res.Configuration;
import androidx.compose.animation.D;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.m5.components.L;
import io.intercom.android.sdk.m5.components.P;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.f0;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B;
import kotlin.collections.l;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.collections.v;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumericRatingQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumericRatingQuestionKt {

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1, reason: invalid class name */
    /* JADX INFO: compiled from: NumericRatingQuestion.kt */
    public static final class AnonymousClass1 implements p<InterfaceC1084f, Integer, r> {
        final /* synthetic */ Answer $answer;
        final /* synthetic */ int $end;
        final /* synthetic */ SurveyData.Step.Question.QuestionData.QuestionSubType $questionSubType;
        final /* synthetic */ int $start;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingQuestionKt$GeneratePreview$1$WhenMappings */
        /* JADX INFO: compiled from: NumericRatingQuestion.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
                try {
                    iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1(SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, int i10, int i11, Answer answer) {
            this.$questionSubType = questionSubType;
            this.$start = i10;
            this.$end = i11;
            this.$answer = answer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r invoke$lambda$1(Answer it) {
            kotlin.jvm.internal.i.e(it, "it");
            return r.f47939a;
        }

        @Override // Ia.p
        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f, Integer num) {
            invoke(interfaceC1084f, num.intValue());
            return r.f47939a;
        }

        public final void invoke(InterfaceC1084f interfaceC1084f, int i10) {
            List listS;
            if ((i10 & 11) == 2 && interfaceC1084f.s()) {
                interfaceC1084f.w();
                return;
            }
            String strC = D.c("toString(...)");
            List listK = M1.k(new Block.Builder().withText("How cool is this preview?"));
            if (WhenMappings.$EnumSwitchMapping$0[this.$questionSubType.ordinal()] == 1) {
                listS = l.s(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(1, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😖"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(2, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😕"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(3, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😐"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(4, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "😃"), new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption(5, "https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩"));
            } else {
                Na.i iVar = new Na.i(this.$start, this.$end, 1);
                ArrayList arrayList = new ArrayList(m.y(iVar, 10));
                Iterator<Integer> it = iVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((v) it).a()));
                }
                listS = arrayList;
            }
            NumericRatingQuestionKt.NumericRatingQuestion(null, new SurveyData.Step.Question.NumericRatingQuestionModel(strC, listK, true, listS, "Not likely", "Very likely", this.$start, this.$end, this.$questionSubType), this.$answer, new h(), C4.a.g(null, null, 3, null), null, interfaceC1084f, 3136, 33);
        }
    }

    /* JADX INFO: compiled from: NumericRatingQuestion.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionData.QuestionSubType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.UNSUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void EmojiRatingQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1678291132);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI, new Answer.SingleAnswer("4"), c1086gP, 438);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new P(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmojiRatingQuestionPreview$lambda$16(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmojiRatingQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void GeneratePreview(final int i10, final int i11, final SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, final Answer answer, InterfaceC1084f interfaceC1084f, final int i12) {
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1397971036);
        if ((i12 & 14) == 0) {
            i13 = (c1086gP.h(i10) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.h(i11) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= c1086gP.K(questionSubType) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= c1086gP.K(answer) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, androidx.compose.runtime.internal.a.b(-2103292486, new AnonymousClass1(questionSubType, i10, i11, answer), c1086gP), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NumericRatingQuestionKt.GeneratePreview$lambda$17(i10, i11, questionSubType, answer, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r GeneratePreview$lambda$17(int i10, int i11, SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType, Answer answer, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        kotlin.jvm.internal.i.e(questionSubType, "$questionSubType");
        kotlin.jvm.internal.i.e(answer, "$answer");
        GeneratePreview(i10, i11, questionSubType, answer, interfaceC1084f, L4.b.l(i12 | 1));
        return r.f47939a;
    }

    public static final void NPSQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-752808306);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            GeneratePreview(0, 10, SurveyData.Step.Question.QuestionData.QuestionSubType.NPS, new Answer.SingleAnswer("4"), c1086gP, 438);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NPSQuestionPreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NPSQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v29 */
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
    public static final void NumericRatingQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, final Ia.l<? super Answer, r> onAnswer, final SurveyUiColors colors, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h.a aVar;
        ?? r10;
        Answer answer2;
        androidx.compose.ui.f.b bVar;
        char c10;
        float f10;
        boolean z10;
        Object obj;
        kotlin.jvm.internal.i.e(numericRatingQuestionModel, "numericRatingQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        kotlin.jvm.internal.i.e(colors, "colors");
        C1086g c1086gP = interfaceC1084f.p(-1325570147);
        int i12 = i11 & 1;
        androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i12 != 0 ? aVar2 : hVar;
        Answer answer3 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM443getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$NumericRatingQuestionKt.INSTANCE.m443getLambda1$intercom_sdk_base_release() : pVar;
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar3 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
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
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar2);
        c1086gP.r();
        final androidx.compose.ui.h hVar3 = hVar2;
        if (c1086gP.f12995O) {
            c1086gP.v(aVar3);
        } else {
            c1086gP.A();
        }
        R0.a(pVar2, c1086gP, c0953mA);
        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
            J4.i.d(i14, c1086gP, i14, pVar4);
        }
        R0.a(pVar5, c1086gP, hVarC2);
        pVarM443getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i10 >> 15) & 14));
        Lb.a.a(c1086gP, W.e(aVar2, 16));
        int i15 = WhenMappings.$EnumSwitchMapping$0[numericRatingQuestionModel.getQuestionSubType().ordinal()];
        Object obj2 = InterfaceC1084f.a.f12980a;
        androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.j;
        String str = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption";
        final p<? super InterfaceC1084f, ? super Integer, r> pVar6 = pVarM443getLambda1$intercom_sdk_base_release;
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            String str2 = "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption";
            Answer answer4 = answer3;
            androidx.compose.ui.f.b bVar3 = bVar2;
            aVar = aVar2;
            r10 = 0;
            float f11 = 1.0f;
            c1086gP.L(122317043);
            double size = numericRatingQuestionModel.getOptions().size();
            for (List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> list : q.I(numericRatingQuestionModel.getOptions(), (int) Math.ceil(size / ((double) ((int) Math.ceil(size / ((double) ((((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)).screenWidthDp - 60) / 60)))))))) {
                androidx.compose.ui.h hVarD = W.d(aVar, f11);
                androidx.compose.ui.f.b bVar4 = bVar3;
                T tA = S.a(C0945e.a.f10292b, bVar4, c1086gP, 6);
                int i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarD);
                ComposeUiNode.f14331c0.getClass();
                Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar4);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                p<ComposeUiNode, Integer, r> pVar7 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    J4.i.d(i16, c1086gP, i16, pVar7);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                c1086gP.L(268602155);
                for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption : list) {
                    String str3 = str2;
                    kotlin.jvm.internal.i.c(ratingOption, str3);
                    final SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption;
                    Answer answer5 = answer4;
                    boolean z11 = (answer5 instanceof Answer.SingleAnswer) && kotlin.jvm.internal.i.a(((Answer.SingleAnswer) answer5).getAnswer(), String.valueOf(numericRatingOption.getValue()));
                    c1086gP.L(268611605);
                    long jM661getAccessibleColorOnWhiteBackground8_81llA = z11 ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
                    c1086gP.T(false);
                    long jM659getAccessibleBorderColor8_81llA = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA);
                    if (z11) {
                        c10 = 2;
                        f10 = 2;
                    } else {
                        c10 = 2;
                        f10 = 1;
                    }
                    androidx.compose.ui.text.font.l lVar = z11 ? androidx.compose.ui.text.font.l.j : androidx.compose.ui.text.font.l.f15442g;
                    String strValueOf = String.valueOf(numericRatingOption.getValue());
                    androidx.compose.ui.h hVarF = PaddingKt.f(aVar, 4);
                    c1086gP.L(-1805377699);
                    boolean zK = ((((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048) | c1086gP.K(numericRatingOption);
                    Object objF = c1086gP.f();
                    if (zK || objF == obj2) {
                        objF = new Ia.a() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.f
                            @Override // Ia.a
                            public final Object invoke() {
                                return NumericRatingQuestionKt.NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(onAnswer, numericRatingOption);
                            }
                        };
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    NumericRatingCellKt.m444NumericRatingCelljWvj134(strValueOf, ClickableKt.c(hVarF, false, null, (Ia.a) objF, 7), jM659getAccessibleBorderColor8_81llA, f10, jM661getAccessibleColorOnWhiteBackground8_81llA, lVar, 0L, 0L, c1086gP, 0, 192);
                    bVar4 = bVar4;
                    str2 = str3;
                    answer4 = answer5;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                bVar3 = bVar4;
                str2 = str2;
                answer4 = answer4;
                f11 = 1.0f;
            }
            answer2 = answer4;
            bVar = bVar3;
            c1086gP.T(false);
            r rVar = r.f47939a;
        } else if (i15 == 4) {
            c1086gP.L(124701005);
            androidx.compose.ui.h hVarD2 = W.d(aVar2, 1.0f);
            T tA2 = S.a(C0945e.f10288e, bVar2, c1086gP, 6);
            int i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarD2);
            c1086gP.r();
            Object obj3 = obj2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, tA2);
            R0.a(pVar3, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                J4.i.d(i17, c1086gP, i17, pVar4);
            }
            R0.a(pVar5, c1086gP, hVarC4);
            c1086gP.L(-1421319679);
            Iterator it = numericRatingQuestionModel.getOptions().iterator();
            while (it.hasNext()) {
                SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption) it.next();
                kotlin.jvm.internal.i.c(ratingOption2, str);
                SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption numericRatingOption2 = (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption) ratingOption2;
                boolean z12 = (answer3 instanceof Answer.SingleAnswer) && numericRatingOption2.getValue() <= Integer.parseInt(((Answer.SingleAnswer) answer3).getAnswer());
                c1086gP.L(-1421310346);
                long jM661getAccessibleColorOnWhiteBackground8_81llA2 = z12 ? ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU()) : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
                c1086gP.T(false);
                long jM659getAccessibleBorderColor8_81llA2 = ColorExtensionsKt.m659getAccessibleBorderColor8_81llA(jM661getAccessibleColorOnWhiteBackground8_81llA2);
                float f12 = z12 ? 2 : 1;
                float f13 = 44;
                androidx.compose.ui.h hVarF2 = PaddingKt.f(W.e(W.q(aVar2, f13), f13), 8);
                c1086gP.L(268698463);
                Iterator it2 = it;
                boolean zK2 = c1086gP.K(numericRatingOption2) | ((((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(onAnswer)) || (i10 & 3072) == 2048);
                Object objF2 = c1086gP.f();
                if (zK2) {
                    obj = obj3;
                } else {
                    obj = obj3;
                    if (objF2 == obj) {
                    }
                    c1086gP.T(false);
                    StarRatingKt.m445StarRatingtAjK0ZQ(ClickableKt.c(hVarF2, false, null, (Ia.a) objF2, 7), jM661getAccessibleColorOnWhiteBackground8_81llA2, f12, jM659getAccessibleBorderColor8_81llA2, c1086gP, 0, 0);
                    aVar2 = aVar2;
                    obj3 = obj;
                    it = it2;
                    str = str;
                    answer3 = answer3;
                }
                objF2 = new f0(numericRatingOption2, 1, onAnswer);
                c1086gP.E(objF2);
                c1086gP.T(false);
                StarRatingKt.m445StarRatingtAjK0ZQ(ClickableKt.c(hVarF2, false, null, (Ia.a) objF2, 7), jM661getAccessibleColorOnWhiteBackground8_81llA2, f12, jM659getAccessibleBorderColor8_81llA2, c1086gP, 0, 0);
                aVar2 = aVar2;
                obj3 = obj;
                it = it2;
                str = str;
                answer3 = answer3;
            }
            aVar = aVar2;
            r10 = 0;
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.T(false);
            r rVar2 = r.f47939a;
            answer2 = answer3;
            bVar = bVar2;
        } else {
            if (i15 != 5) {
                c1086gP.L(3944735);
                c1086gP.T(false);
                throw new NoWhenBranchMatchedException();
            }
            c1086gP.L(126368681);
            List<SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption> options = numericRatingQuestionModel.getOptions();
            ArrayList arrayList = new ArrayList(m.y(options, 10));
            for (SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption ratingOption3 : options) {
                kotlin.jvm.internal.i.c(ratingOption3, "null cannot be cast to non-null type io.intercom.android.sdk.survey.model.SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption");
                arrayList.add((SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.EmojiRatingOption) ratingOption3);
            }
            int i18 = i10 >> 3;
            EmojiQuestionKt.EmojiQuestion(arrayList, answer3, onAnswer, c1086gP, (i18 & 896) | (i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            r10 = 0;
            c1086gP.T(false);
            r rVar3 = r.f47939a;
            answer2 = answer3;
            bVar = bVar2;
            aVar = aVar2;
        }
        c1086gP.L(4087291);
        if ((!n.S(numericRatingQuestionModel.getLowerLabel())) && (!n.S(numericRatingQuestionModel.getUpperLabel()))) {
            androidx.compose.ui.h hVarF3 = PaddingKt.f(W.d(aVar, 1.0f), 8);
            T tA3 = S.a(C0945e.f10290g, bVar, c1086gP, 6);
            int i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarF3);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
            p<ComposeUiNode, Integer, r> pVar8 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                J4.i.d(i19, c1086gP, i19, pVar8);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
            List listS = numericRatingQuestionModel.getQuestionSubType() == SurveyData.Step.Question.QuestionData.QuestionSubType.EMOJI ? l.s(numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getUpperLabel()) : l.s(numericRatingQuestionModel.getScaleStart() + " - " + numericRatingQuestionModel.getLowerLabel(), numericRatingQuestionModel.getScaleEnd() + " - " + numericRatingQuestionModel.getUpperLabel());
            String str4 = (String) listS.get(r10);
            String str5 = (String) listS.get(1);
            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
            TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 0, 0, 131070);
            z10 = true;
            c1086gP.T(true);
        } else {
            z10 = true;
        }
        c1086gP.T(r10);
        c1086gP.T(z10);
        c1086gP.T(z10);
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Answer answer6 = answer2;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.g
                @Override // Ia.p
                public final Object invoke(Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    androidx.compose.ui.h hVar4 = hVar3;
                    p pVar9 = pVar6;
                    int i20 = i10;
                    int i21 = i11;
                    return NumericRatingQuestionKt.NumericRatingQuestion$lambda$13(hVar4, numericRatingQuestionModel, answer6, onAnswer, colors, pVar9, i20, i21, (InterfaceC1084f) obj4, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NumericRatingQuestion$lambda$12$lambda$11$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Ia.l onAnswer, SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption option) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(option, "$option");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(option.getValue())));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NumericRatingQuestion$lambda$12$lambda$11$lambda$8$lambda$7$lambda$6$lambda$5(SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption currentRating, Ia.l onAnswer) {
        kotlin.jvm.internal.i.e(currentRating, "$currentRating");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        onAnswer.invoke(new Answer.SingleAnswer(String.valueOf(currentRating.getValue())));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NumericRatingQuestion$lambda$13(androidx.compose.ui.h hVar, SurveyData.Step.Question.NumericRatingQuestionModel numericRatingQuestionModel, Answer answer, Ia.l onAnswer, SurveyUiColors colors, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(numericRatingQuestionModel, "$numericRatingQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(colors, "$colors");
        NumericRatingQuestion(hVar, numericRatingQuestionModel, answer, onAnswer, colors, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void StarQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1791167217);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            GeneratePreview(1, 5, SurveyData.Step.Question.QuestionData.QuestionSubType.STARS, new Answer.MultipleAnswer(B.C("1", "2"), null, 2, 0 == true ? 1 : 0), c1086gP, 4534);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r StarQuestionPreview$lambda$15(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        StarQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
