package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import Ia.p;
import S4.o;
import androidx.compose.animation.D;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.n;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.F;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2269a0;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: DropDownQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DropDownQuestionKt {
    private static final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel = new SurveyData.Step.Question.DropDownQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Is this a preview?")), true, l.s("Option A", "Option B", "Option C"), "Please Select", null, 32, null);

    public static final void ColoredDropDownSelectedQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-2103500414);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m427getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ColoredDropDownSelectedQuestionPreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ColoredDropDownSelectedQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0165  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:72:0x0232  */
    /* JADX WARN: Code duplicated, block: B:73:0x0236  */
    /* JADX WARN: Code duplicated, block: B:78:0x0251  */
    /* JADX WARN: Code duplicated, block: B:81:0x0263  */
    /* JADX WARN: Code duplicated, block: B:83:0x0271  */
    /* JADX WARN: Code duplicated, block: B:86:0x027f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0339  */
    /* JADX WARN: Code duplicated, block: B:90:0x0345  */
    /* JADX WARN: Code duplicated, block: B:93:0x0386  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void DropDownQuestion(h hVar, final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, final Ia.l<? super Answer, r> onAnswer, final SurveyUiColors colors, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        InterfaceC1084f.a.C0153a c0153a;
        int i12;
        int i13;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a2;
        X x10;
        X x11;
        int i14;
        String placeholder;
        final p<? super InterfaceC1084f, ? super Integer, r> pVar2;
        Object objF2;
        X x12;
        C1105p0 c1105p0V;
        i.e(dropDownQuestionModel2, "dropDownQuestionModel");
        i.e(onAnswer, "onAnswer");
        i.e(colors, "colors");
        C1086g c1086gP = interfaceC1084f.p(1475245134);
        int i15 = i11 & 1;
        h.a aVar = h.a.f13984b;
        h hVar2 = i15 != 0 ? aVar : hVar;
        Answer answer2 = (i11 & 4) != 0 ? Answer.NoAnswer.InitialNoAnswer.INSTANCE : answer;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM424getLambda1$intercom_sdk_base_release = (i11 & 32) != 0 ? ComposableSingletons$DropDownQuestionKt.INSTANCE.m424getLambda1$intercom_sdk_base_release() : pVar;
        c1086gP.L(1842846722);
        Object objF3 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
        if (objF3 == c0153a3) {
            objF3 = J0.f(Boolean.FALSE);
            c1086gP.E(objF3);
        }
        X x13 = (X) objF3;
        c1086gP.T(false);
        boolean z10 = DropDownQuestion$lambda$1(x13) || !(answer2 instanceof Answer.NoAnswer);
        c1086gP.L(1842850501);
        long jM357getButton0d7_KjU = z10 ? colors.m357getButton0d7_KjU() : IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m621getBackground0d7_KjU();
        c1086gP.T(false);
        long jM658generateTextColor8_81llA = z10 ? ColorExtensionsKt.m658generateTextColor8_81llA(colors.m357getButton0d7_KjU()) : Q3.d.e(4285756278L);
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i16 = IntercomTheme.$stable;
        long jB = H.b(0.1f, intercomTheme.getColors(c1086gP, i16).m645getPrimaryText0d7_KjU());
        float f10 = 1;
        H hM359getDropDownSelectedColorQN2ZGVo = colors.m359getDropDownSelectedColorQN2ZGVo();
        long j = jM357getButton0d7_KjU;
        long j10 = hM359getDropDownSelectedColorQN2ZGVo != null ? hM359getDropDownSelectedColorQN2ZGVo.f13506a : jM658generateTextColor8_81llA;
        n nVar = (n) c1086gP.x(CompositionLocalsKt.f14848i);
        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
        int i17 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
        ComposeUiNode.f14331c0.getClass();
        final h hVar3 = hVar2;
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar3 = ComposeUiNode.Companion.f14337f;
        R0.a(pVar3, c1086gP, eD);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar4 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar4, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar5 = ComposeUiNode.Companion.f14338g;
        final Answer answer3 = answer2;
        if (!c1086gP.f12995O) {
            c0153a = c0153a3;
            if (!i.a(c1086gP.f(), Integer.valueOf(i17))) {
            }
            p<ComposeUiNode, h, r> pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC);
            C0945e.k kVar = C0945e.f10286c;
            androidx.compose.ui.f.a aVar3 = androidx.compose.ui.d.a.f13346m;
            C0953m c0953mA = C0952l.a(kVar, aVar3, c1086gP, 0);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, c0953mA);
            R0.a(pVar4, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC2);
            pVarM424getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i10 >> 15) & 14));
            float f11 = 8;
            Lb.a.a(c1086gP, W.e(aVar, f11));
            h hVarR = A8.p.r(C0935g.a(W.d(aVar, 1.0f), f10, jB, intercomTheme.getShapes(c1086gP, i16).f12430b), intercomTheme.getShapes(c1086gP, i16).f12430b);
            C0953m c0953mA2 = C0952l.a(kVar, aVar3, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC3 = ComposedModifierKt.c(c1086gP, hVarR);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, c0953mA2);
            R0.a(pVar4, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC3);
            h hVarB = C0932d.b(W.d(aVar, 1.0f), j, h0.f13629a);
            c1086gP.L(-585751888);
            objF = c1086gP.f();
            c0153a2 = c0153a;
            if (objF == c0153a2) {
                x10 = x13;
                objF = new d(0, x10);
                c1086gP.E(objF);
            } else {
                x10 = x13;
            }
            c1086gP.T(false);
            x11 = x10;
            h hVarC4 = ClickableKt.c(hVarB, false, null, (Ia.a) objF, 7);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            h hVarC5 = ComposedModifierKt.c(c1086gP, hVarC4);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, tA);
            R0.a(pVar4, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC5);
            c1086gP.L(602811706);
            if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
                placeholder = o.p(c1086gP, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = dropDownQuestionModel2.getPlaceholder();
            }
            c1086gP.T(false);
            if (answer3 instanceof Answer.SingleAnswer) {
                placeholder = ((Answer.SingleAnswer) answer3).getAnswer();
            }
            float f12 = 16;
            pVar2 = pVarM424getLambda1$intercom_sdk_base_release;
            TextKt.b(placeholder, W.t(PaddingKt.f(aVar, f12), null, 3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(intercomTheme.getTypography(c1086gP, i16).getType04(), jM658generateTextColor8_81llA, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 48, 0, 65532);
            IconKt.b(p306z.b.a(), o.p(c1086gP, R.string.intercom_choose_one), PaddingKt.f(aVar, f12), j10, c1086gP, 384, 0);
            c1086gP.T(true);
            boolean zDropDownQuestion$lambda$1 = DropDownQuestion$lambda$1(x11);
            h hVarD = W.d(aVar, 0.8f);
            long jM621getBackground0d7_KjU = intercomTheme.getColors(c1086gP, i16).m621getBackground0d7_KjU();
            p270w.a aVar4 = intercomTheme.getShapes(c1086gP, i16).f12430b;
            c1086gP.L(-585711023);
            objF2 = c1086gP.f();
            if (objF2 == c0153a2) {
                x12 = x11;
                objF2 = new io.intercom.android.sdk.b(3, x12);
                c1086gP.E(objF2);
            } else {
                x12 = x11;
            }
            c1086gP.T(false);
            AndroidMenu_androidKt.a(zDropDownQuestion$lambda$1, (Ia.a) objF2, hVarD, 0L, null, null, aVar4, jM621getBackground0d7_KjU, 0.0f, f11, null, androidx.compose.runtime.internal.a.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(dropDownQuestionModel2, nVar, onAnswer, x12), c1086gP), c1086gP, 805306800, 48, 1336);
            c1086gP.T(true);
            c1086gP.T(true);
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.e
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        h hVar4 = hVar3;
                        p pVar7 = pVar2;
                        int i18 = i10;
                        int i19 = i11;
                        return DropDownQuestionKt.DropDownQuestion$lambda$11(hVar4, dropDownQuestionModel2, answer3, onAnswer, colors, pVar7, i18, i19, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        c0153a = c0153a3;
        J4.i.d(i17, c1086gP, i17, pVar5);
        p<ComposeUiNode, h, r> pVar7 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar7, c1086gP, hVarC);
        C0945e.k kVar2 = C0945e.f10286c;
        androidx.compose.ui.f.a aVar5 = androidx.compose.ui.d.a.f13346m;
        C0953m c0953mA3 = C0952l.a(kVar2, aVar5, c1086gP, 0);
        i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
        h hVarC6 = ComposedModifierKt.c(c1086gP, aVar);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar3, c1086gP, c0953mA3);
        R0.a(pVar4, c1086gP, interfaceC1089h0P5);
        if (c1086gP.f12995O) {
            J4.i.d(i12, c1086gP, i12, pVar5);
        } else {
            J4.i.d(i12, c1086gP, i12, pVar5);
        }
        R0.a(pVar7, c1086gP, hVarC6);
        pVarM424getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i10 >> 15) & 14));
        float f13 = 8;
        Lb.a.a(c1086gP, W.e(aVar, f13));
        h hVarR2 = A8.p.r(C0935g.a(W.d(aVar, 1.0f), f10, jB, intercomTheme.getShapes(c1086gP, i16).f12430b), intercomTheme.getShapes(c1086gP, i16).f12430b);
        C0953m c0953mA4 = C0952l.a(kVar2, aVar5, c1086gP, 0);
        i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
        h hVarC7 = ComposedModifierKt.c(c1086gP, hVarR2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar3, c1086gP, c0953mA4);
        R0.a(pVar4, c1086gP, interfaceC1089h0P6);
        if (c1086gP.f12995O) {
            J4.i.d(i13, c1086gP, i13, pVar5);
        } else {
            J4.i.d(i13, c1086gP, i13, pVar5);
        }
        R0.a(pVar7, c1086gP, hVarC7);
        h hVarB2 = C0932d.b(W.d(aVar, 1.0f), j, h0.f13629a);
        c1086gP.L(-585751888);
        objF = c1086gP.f();
        c0153a2 = c0153a;
        if (objF == c0153a2) {
            x10 = x13;
            objF = new d(0, x10);
            c1086gP.E(objF);
        } else {
            x10 = x13;
        }
        c1086gP.T(false);
        x11 = x10;
        h hVarC8 = ClickableKt.c(hVarB2, false, null, (Ia.a) objF, 7);
        T tA2 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
        i14 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
        h hVarC9 = ComposedModifierKt.c(c1086gP, hVarC8);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar3, c1086gP, tA2);
        R0.a(pVar4, c1086gP, interfaceC1089h0P7);
        if (c1086gP.f12995O) {
            J4.i.d(i14, c1086gP, i14, pVar5);
        } else {
            J4.i.d(i14, c1086gP, i14, pVar5);
        }
        R0.a(pVar7, c1086gP, hVarC9);
        c1086gP.L(602811706);
        if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
            placeholder = o.p(c1086gP, dropDownQuestionModel2.getPlaceHolderStringRes().intValue());
        } else {
            placeholder = dropDownQuestionModel2.getPlaceholder();
        }
        c1086gP.T(false);
        if (answer3 instanceof Answer.SingleAnswer) {
            placeholder = ((Answer.SingleAnswer) answer3).getAnswer();
        }
        float f14 = 16;
        pVar2 = pVarM424getLambda1$intercom_sdk_base_release;
        TextKt.b(placeholder, W.t(PaddingKt.f(aVar, f14), null, 3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(intercomTheme.getTypography(c1086gP, i16).getType04(), jM658generateTextColor8_81llA, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 48, 0, 65532);
        IconKt.b(p306z.b.a(), o.p(c1086gP, R.string.intercom_choose_one), PaddingKt.f(aVar, f14), j10, c1086gP, 384, 0);
        c1086gP.T(true);
        boolean zDropDownQuestion$lambda$2 = DropDownQuestion$lambda$1(x11);
        h hVarD2 = W.d(aVar, 0.8f);
        long jM621getBackground0d7_KjU2 = intercomTheme.getColors(c1086gP, i16).m621getBackground0d7_KjU();
        p270w.a aVar6 = intercomTheme.getShapes(c1086gP, i16).f12430b;
        c1086gP.L(-585711023);
        objF2 = c1086gP.f();
        if (objF2 == c0153a2) {
            x12 = x11;
            objF2 = new io.intercom.android.sdk.b(3, x12);
            c1086gP.E(objF2);
        } else {
            x12 = x11;
        }
        c1086gP.T(false);
        AndroidMenu_androidKt.a(zDropDownQuestion$lambda$2, (Ia.a) objF2, hVarD2, 0L, null, null, aVar6, jM621getBackground0d7_KjU2, 0.0f, f13, null, androidx.compose.runtime.internal.a.b(17506981, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(dropDownQuestionModel2, nVar, onAnswer, x12), c1086gP), c1086gP, 805306800, 48, 1336);
        c1086gP.T(true);
        c1086gP.T(true);
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.dropdown.e
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    h hVar4 = hVar3;
                    p pVar8 = pVar2;
                    int i18 = i10;
                    int i19 = i11;
                    return DropDownQuestionKt.DropDownQuestion$lambda$11(hVar4, dropDownQuestionModel2, answer3, onAnswer, colors, pVar8, i18, i19, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    private static final boolean DropDownQuestion$lambda$1(X<Boolean> x10) {
        return x10.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(X expanded$delegate) {
        i.e(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, true);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(X expanded$delegate) {
        i.e(expanded$delegate, "$expanded$delegate");
        DropDownQuestion$lambda$2(expanded$delegate, false);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DropDownQuestion$lambda$11(h hVar, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, Ia.l onAnswer, SurveyUiColors colors, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(dropDownQuestionModel2, "$dropDownQuestionModel");
        i.e(onAnswer, "$onAnswer");
        i.e(colors, "$colors");
        DropDownQuestion(hVar, dropDownQuestionModel2, answer, onAnswer, colors, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DropDownQuestion$lambda$2(X<Boolean> x10, boolean z10) {
        x10.setValue(Boolean.valueOf(z10));
    }

    public static final void DropDownQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(281876673);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m425getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DropDownQuestionPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DropDownQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void DropDownSelectedQuestionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-891294020);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m426getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DropDownSelectedQuestionPreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DropDownSelectedQuestionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
