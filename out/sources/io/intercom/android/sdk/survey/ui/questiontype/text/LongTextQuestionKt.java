package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import S4.o;
import androidx.compose.animation.D;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.InterfaceC1000i;
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
import androidx.navigation.compose.F;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.C2281g0;
import io.intercom.android.sdk.m5.conversation.ui.components.C2358g;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: LongTextQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class LongTextQuestionKt {
    public static final void LongTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-479343201);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            LongTextQuestion(null, new SurveyData.Step.Question.LongTextQuestionModel(D.c("toString(...)"), M1.k(new Block.Builder().withText("Is this a preview?")), true, "Placeholder text", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 2000, 0.0f, 0, null, 448, null), null, new F(3), C4.a.g(null, null, 3, null), ValidationError.NoValidationError.INSTANCE, null, null, c1086gP, 199680, 197);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2281g0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LongTextPreview$lambda$6(Answer it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LongTextPreview$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        LongTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0131  */
    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:105:0x015a  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0171  */
    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:128:0x0205  */
    /* JADX WARN: Code duplicated, block: B:130:0x020e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215  */
    /* JADX WARN: Code duplicated, block: B:137:0x0222  */
    /* JADX WARN: Code duplicated, block: B:140:0x0241  */
    /* JADX WARN: Code duplicated, block: B:141:0x0243  */
    /* JADX WARN: Code duplicated, block: B:144:0x024a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0252  */
    /* JADX WARN: Code duplicated, block: B:151:0x0291  */
    /* JADX WARN: Code duplicated, block: B:155:0x030e  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void LongTextQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, Answer answer, final Ia.l<? super Answer, r> onAnswer, final SurveyUiColors colors, final ValidationError validationError, Ia.l<? super InterfaceC1000i, r> lVar, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Answer answer2;
        int i13;
        int i14;
        int i15;
        int i16;
        Ia.l<? super InterfaceC1000i, r> lVar2;
        int i17;
        int i18;
        p<? super InterfaceC1084f, ? super Integer, r> pVar2;
        int i19;
        androidx.compose.ui.h.a aVar;
        Answer answer3;
        Ia.l<? super InterfaceC1000i, r> c2358g;
        p<? super InterfaceC1084f, ? super Integer, r> pVarM446getLambda1$intercom_sdk_base_release;
        int i20;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar3;
        int i21;
        String placeholder;
        String answer4;
        H h8;
        boolean z10;
        Object objF;
        final Ia.l<? super InterfaceC1000i, r> lVar3;
        final p<? super InterfaceC1084f, ? super Integer, r> pVar4;
        final Answer answer5;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(textQuestionModel, "textQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        kotlin.jvm.internal.i.e(colors, "colors");
        kotlin.jvm.internal.i.e(validationError, "validationError");
        C1086g c1086gP = interfaceC1084f.p(977241530);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(textQuestionModel) ? 32 : 16;
        }
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & 896) == 0) {
                answer2 = answer;
                i12 |= c1086gP.K(answer2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onAnswer)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.K(colors)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c1086gP.K(validationError)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                i16 = i11 & 64;
                if (i16 != 0) {
                    if ((3670016 & i10) == 0) {
                        lVar2 = lVar;
                        if (c1086gP.k(lVar2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 128;
                    if (i18 != 0) {
                        i12 |= 12582912;
                        pVar2 = pVar;
                    } else {
                        pVar2 = pVar;
                        if ((i10 & 29360128) == 0) {
                            if (c1086gP.k(pVar2)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i12 |= i19;
                        }
                    }
                    if ((i12 & 23967451) == 4793490 || !c1086gP.s()) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i22 != 0) {
                            hVar2 = aVar;
                        }
                        if (i23 != 0) {
                            answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        } else {
                            answer3 = answer2;
                        }
                        if (i16 != 0) {
                            c2358g = new C2358g(3);
                        } else {
                            c2358g = lVar2;
                        }
                        if (i18 != 0) {
                            pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                        } else {
                            pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                        }
                        E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        androidx.compose.ui.h hVar4 = hVar2;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        p<ComposeUiNode, E, r> pVar5 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar5, c1086gP, eD);
                        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar6 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar6, c1086gP, interfaceC1089h0P);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                            J4.i.d(i20, c1086gP, i20, pVar3);
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar7 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar7, c1086gP, hVarC);
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        Ia.l<? super InterfaceC1000i, r> lVar4 = c2358g;
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar5, c1086gP, c0953mA);
                        R0.a(pVar6, c1086gP, interfaceC1089h0P2);
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                            J4.i.d(i21, c1086gP, i21, pVar3);
                        }
                        R0.a(pVar7, c1086gP, hVarC2);
                        pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        c1086gP.L(-497967796);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        String str = placeholder;
                        c1086gP.T(false);
                        if (answer3 instanceof Answer.SingleAnswer) {
                            answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                        } else {
                            answer4 = "";
                        }
                        String str2 = answer4;
                        if ((validationError instanceof ValidationError.ValidationStringError) || (answer3 instanceof Answer.NoAnswer.InitialNoAnswer)) {
                            h8 = null;
                        } else {
                            h8 = new H(H.f13500g);
                        }
                        H h10 = h8;
                        long jM661getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        int maxLine = textQuestionModel.getMaxLine();
                        float fM400getMinHeightD9Ej5fM = textQuestionModel.m400getMinHeightD9Ej5fM();
                        c1086gP.L(-497955273);
                        if ((i12 & 7168) == 2048) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objF = c1086gP.f();
                        if (z10 || objF == InterfaceC1084f.a.f12980a) {
                            objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        TextInputPillKt.m457TextInputPillg5ZjG94(str2, str, (Ia.l) objF, h10, jM661getAccessibleColorOnWhiteBackground8_81llA, maxLine, false, lVar4, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                        c1086gP.L(-497931568);
                        if (textQuestionModel.getCharacterLimit() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(answer3.getLength());
                            sb2.append('/');
                            sb2.append(textQuestionModel.getCharacterLimit());
                            TextKt.b(sb2.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(true);
                        lVar3 = lVar4;
                        pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                        answer5 = answer3;
                        hVar3 = hVar4;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        answer5 = answer2;
                        pVar4 = pVar2;
                        lVar3 = lVar2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 1572864;
                lVar2 = lVar;
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar5 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar8 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar8, c1086gP, eD2);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar9 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar9, c1086gP, interfaceC1089h0P3);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar10 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar10, c1086gP, hVarC3);
                    C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar5 = c2358g;
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar8, c1086gP, c0953mA2);
                    R0.a(pVar9, c1086gP, interfaceC1089h0P4);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar10, c1086gP, hVarC4);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str3 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str4 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h11 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine2 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM2 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str4, str3, (Ia.l) objF, h11, jM661getAccessibleColorOnWhiteBackground8_81llA2, maxLine2, false, lVar5, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM2, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(answer3.getLength());
                        sb3.append('/');
                        sb3.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb3.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar5;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar5;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar6 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar11 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar11, c1086gP, eD3);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar12 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar12, c1086gP, interfaceC1089h0P5);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar13 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar13, c1086gP, hVarC5);
                    C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar6 = c2358g;
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11, c1086gP, c0953mA3);
                    R0.a(pVar12, c1086gP, interfaceC1089h0P6);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar13, c1086gP, hVarC6);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str5 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str6 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h12 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine3 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM3 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str6, str5, (Ia.l) objF, h12, jM661getAccessibleColorOnWhiteBackground8_81llA3, maxLine3, false, lVar6, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM3, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(answer3.getLength());
                        sb4.append('/');
                        sb4.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb4.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar6;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i15 = 196608;
            i12 |= i15;
            i16 = i11 & 64;
            if (i16 != 0) {
                if ((3670016 & i10) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.k(lVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar7 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar14 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar14, c1086gP, eD4);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar15 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar15, c1086gP, interfaceC1089h0P7);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar16 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar16, c1086gP, hVarC7);
                    C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar7 = c2358g;
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar14, c1086gP, c0953mA4);
                    R0.a(pVar15, c1086gP, interfaceC1089h0P8);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar16, c1086gP, hVarC8);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str7 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str8 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h13 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine4 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM4 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str8, str7, (Ia.l) objF, h13, jM661getAccessibleColorOnWhiteBackground8_81llA4, maxLine4, false, lVar7, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM4, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(answer3.getLength());
                        sb5.append('/');
                        sb5.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb5.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar7;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar7;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar8 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar17 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar17, c1086gP, eD5);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar18 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar18, c1086gP, interfaceC1089h0P9);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar19 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar19, c1086gP, hVarC9);
                    C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar8 = c2358g;
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar17, c1086gP, c0953mA5);
                    R0.a(pVar18, c1086gP, interfaceC1089h0P10);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar19, c1086gP, hVarC10);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str9 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str10 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h14 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine5 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM5 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str10, str9, (Ia.l) objF, h14, jM661getAccessibleColorOnWhiteBackground8_81llA5, maxLine5, false, lVar8, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM5, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(answer3.getLength());
                        sb6.append('/');
                        sb6.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb6.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar8;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar8;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 1572864;
            lVar2 = lVar;
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                pVar2 = pVar;
            } else {
                pVar2 = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar9 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar110 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar110, c1086gP, eD6);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar111 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar111, c1086gP, interfaceC1089h0P11);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar112 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar112, c1086gP, hVarC11);
                C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar9 = c2358g;
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar110, c1086gP, c0953mA6);
                R0.a(pVar111, c1086gP, interfaceC1089h0P12);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar112, c1086gP, hVarC12);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str11 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str12 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h15 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine6 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM6 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str12, str11, (Ia.l) objF, h15, jM661getAccessibleColorOnWhiteBackground8_81llA6, maxLine6, false, lVar9, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM6, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(answer3.getLength());
                    sb7.append('/');
                    sb7.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb7.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar9;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar9;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar10 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar113 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar113, c1086gP, eD7);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar114 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar114, c1086gP, interfaceC1089h0P13);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar115 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar115, c1086gP, hVarC13);
                C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar10 = c2358g;
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar113, c1086gP, c0953mA7);
                R0.a(pVar114, c1086gP, interfaceC1089h0P14);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar115, c1086gP, hVarC14);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str13 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str14 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h16 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine7 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM7 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str14, str13, (Ia.l) objF, h16, jM661getAccessibleColorOnWhiteBackground8_81llA7, maxLine7, false, lVar10, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM7, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(answer3.getLength());
                    sb8.append('/');
                    sb8.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb8.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar10;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        answer2 = answer;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onAnswer)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c1086gP.K(colors)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c1086gP.K(validationError)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            i16 = i11 & 64;
            if (i16 != 0) {
                if ((3670016 & i10) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.k(lVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 128;
                if (i18 != 0) {
                    i12 |= 12582912;
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i12 |= i19;
                    }
                }
                if ((i12 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar11 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar116 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar116, c1086gP, eD8);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar117 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar117, c1086gP, interfaceC1089h0P15);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar118 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar118, c1086gP, hVarC15);
                    C0953m c0953mA8 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar11 = c2358g;
                    androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar116, c1086gP, c0953mA8);
                    R0.a(pVar117, c1086gP, interfaceC1089h0P16);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar118, c1086gP, hVarC16);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str15 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str16 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h17 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA8 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine8 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM8 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str16, str15, (Ia.l) objF, h17, jM661getAccessibleColorOnWhiteBackground8_81llA8, maxLine8, false, lVar11, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM8, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(answer3.getLength());
                        sb9.append('/');
                        sb9.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb9.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar11;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar11;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i22 != 0) {
                        hVar2 = aVar;
                    }
                    if (i23 != 0) {
                        answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    } else {
                        answer3 = answer2;
                    }
                    if (i16 != 0) {
                        c2358g = new C2358g(3);
                    } else {
                        c2358g = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                    androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVar2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    androidx.compose.ui.h hVar12 = hVar2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, E, r> pVar119 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar119, c1086gP, eD9);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1110 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar1110, c1086gP, interfaceC1089h0P17);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    } else {
                        J4.i.d(i20, c1086gP, i20, pVar3);
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar1111 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar1111, c1086gP, hVarC17);
                    C0953m c0953mA9 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                    Ia.l<? super InterfaceC1000i, r> lVar12 = c2358g;
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar119, c1086gP, c0953mA9);
                    R0.a(pVar1110, c1086gP, interfaceC1089h0P18);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar3);
                    }
                    R0.a(pVar1111, c1086gP, hVarC18);
                    pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    c1086gP.L(-497967796);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    String str17 = placeholder;
                    c1086gP.T(false);
                    if (answer3 instanceof Answer.SingleAnswer) {
                        answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                    } else {
                        answer4 = "";
                    }
                    String str18 = answer4;
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    H h18 = h8;
                    long jM661getAccessibleColorOnWhiteBackground8_81llA9 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    int maxLine9 = textQuestionModel.getMaxLine();
                    float fM400getMinHeightD9Ej5fM9 = textQuestionModel.m400getMinHeightD9Ej5fM();
                    c1086gP.L(-497955273);
                    if ((i12 & 7168) == 2048) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (z10) {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    TextInputPillKt.m457TextInputPillg5ZjG94(str18, str17, (Ia.l) objF, h18, jM661getAccessibleColorOnWhiteBackground8_81llA9, maxLine9, false, lVar12, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM9, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                    c1086gP.L(-497931568);
                    if (textQuestionModel.getCharacterLimit() != null) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append(answer3.getLength());
                        sb10.append('/');
                        sb10.append(textQuestionModel.getCharacterLimit());
                        TextKt.b(sb10.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(true);
                    lVar3 = lVar12;
                    pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                    answer5 = answer3;
                    hVar3 = hVar12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 1572864;
            lVar2 = lVar;
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                pVar2 = pVar;
            } else {
                pVar2 = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar13 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar1112 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1112, c1086gP, eD10);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1113 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1113, c1086gP, interfaceC1089h0P19);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar1114 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1114, c1086gP, hVarC19);
                C0953m c0953mA10 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar13 = c2358g;
                androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1112, c1086gP, c0953mA10);
                R0.a(pVar1113, c1086gP, interfaceC1089h0P110);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar1114, c1086gP, hVarC110);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str19 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str110 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h19 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA10 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine10 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM10 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str110, str19, (Ia.l) objF, h19, jM661getAccessibleColorOnWhiteBackground8_81llA10, maxLine10, false, lVar13, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM10, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(answer3.getLength());
                    sb11.append('/');
                    sb11.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb11.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar13;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar13;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar14 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar1115 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1115, c1086gP, eD11);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1116 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1116, c1086gP, interfaceC1089h0P111);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar1117 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1117, c1086gP, hVarC111);
                C0953m c0953mA11 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar14 = c2358g;
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1115, c1086gP, c0953mA11);
                R0.a(pVar1116, c1086gP, interfaceC1089h0P112);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar1117, c1086gP, hVarC112);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str111 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str112 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h110 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA11 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine11 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM11 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str112, str111, (Ia.l) objF, h110, jM661getAccessibleColorOnWhiteBackground8_81llA11, maxLine11, false, lVar14, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM11, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(answer3.getLength());
                    sb12.append('/');
                    sb12.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb12.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar14;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar14;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i15 = 196608;
        i12 |= i15;
        i16 = i11 & 64;
        if (i16 != 0) {
            if ((3670016 & i10) == 0) {
                lVar2 = lVar;
                if (c1086gP.k(lVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            i18 = i11 & 128;
            if (i18 != 0) {
                i12 |= 12582912;
                pVar2 = pVar;
            } else {
                pVar2 = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
            }
            if ((i12 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar15 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar1118 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1118, c1086gP, eD12);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1119 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1119, c1086gP, interfaceC1089h0P113);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar11110 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar11110, c1086gP, hVarC113);
                C0953m c0953mA12 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar15 = c2358g;
                androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1118, c1086gP, c0953mA12);
                R0.a(pVar1119, c1086gP, interfaceC1089h0P114);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar11110, c1086gP, hVarC114);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str113 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str114 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h111 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA12 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine12 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM12 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str114, str113, (Ia.l) objF, h111, jM661getAccessibleColorOnWhiteBackground8_81llA12, maxLine12, false, lVar15, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM12, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append(answer3.getLength());
                    sb13.append('/');
                    sb13.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb13.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar15;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar15;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i22 != 0) {
                    hVar2 = aVar;
                }
                if (i23 != 0) {
                    answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                } else {
                    answer3 = answer2;
                }
                if (i16 != 0) {
                    c2358g = new C2358g(3);
                } else {
                    c2358g = lVar2;
                }
                if (i18 != 0) {
                    pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM446getLambda1$intercom_sdk_base_release = pVar2;
                }
                E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                androidx.compose.ui.h hVar16 = hVar2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, E, r> pVar11111 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar11111, c1086gP, eD13);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11112 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar11112, c1086gP, interfaceC1089h0P115);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                } else {
                    J4.i.d(i20, c1086gP, i20, pVar3);
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar11113 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar11113, c1086gP, hVarC115);
                C0953m c0953mA13 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                Ia.l<? super InterfaceC1000i, r> lVar16 = c2358g;
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar11111, c1086gP, c0953mA13);
                R0.a(pVar11112, c1086gP, interfaceC1089h0P116);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar3);
                }
                R0.a(pVar11113, c1086gP, hVarC116);
                pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                c1086gP.L(-497967796);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                String str115 = placeholder;
                c1086gP.T(false);
                if (answer3 instanceof Answer.SingleAnswer) {
                    answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
                } else {
                    answer4 = "";
                }
                String str116 = answer4;
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                H h112 = h8;
                long jM661getAccessibleColorOnWhiteBackground8_81llA13 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                int maxLine13 = textQuestionModel.getMaxLine();
                float fM400getMinHeightD9Ej5fM13 = textQuestionModel.m400getMinHeightD9Ej5fM();
                c1086gP.L(-497955273);
                if ((i12 & 7168) == 2048) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                TextInputPillKt.m457TextInputPillg5ZjG94(str116, str115, (Ia.l) objF, h112, jM661getAccessibleColorOnWhiteBackground8_81llA13, maxLine13, false, lVar16, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM13, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
                c1086gP.L(-497931568);
                if (textQuestionModel.getCharacterLimit() != null) {
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(answer3.getLength());
                    sb14.append('/');
                    sb14.append(textQuestionModel.getCharacterLimit());
                    TextKt.b(sb14.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(true);
                lVar3 = lVar16;
                pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
                answer5 = answer3;
                hVar3 = hVar16;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 1572864;
        lVar2 = lVar;
        i18 = i11 & 128;
        if (i18 != 0) {
            i12 |= 12582912;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            if ((i10 & 29360128) == 0) {
                if (c1086gP.k(pVar2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
        }
        if ((i12 & 23967451) == 4793490) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i22 != 0) {
                hVar2 = aVar;
            }
            if (i23 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                c2358g = new C2358g(3);
            } else {
                c2358g = lVar2;
            }
            if (i18 != 0) {
                pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
            } else {
                pVarM446getLambda1$intercom_sdk_base_release = pVar2;
            }
            E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
            androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            androidx.compose.ui.h hVar17 = hVar2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar11114 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar11114, c1086gP, eD14);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11115 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar11115, c1086gP, interfaceC1089h0P117);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar3);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar3);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar11116 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar11116, c1086gP, hVarC117);
            C0953m c0953mA14 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
            Ia.l<? super InterfaceC1000i, r> lVar17 = c2358g;
            androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11114, c1086gP, c0953mA14);
            R0.a(pVar11115, c1086gP, interfaceC1089h0P118);
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar3);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar3);
            }
            R0.a(pVar11116, c1086gP, hVarC118);
            pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            c1086gP.L(-497967796);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            String str117 = placeholder;
            c1086gP.T(false);
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            String str118 = answer4;
            if (validationError instanceof ValidationError.ValidationStringError) {
                h8 = null;
            } else {
                h8 = null;
            }
            H h113 = h8;
            long jM661getAccessibleColorOnWhiteBackground8_81llA14 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
            int maxLine14 = textQuestionModel.getMaxLine();
            float fM400getMinHeightD9Ej5fM14 = textQuestionModel.m400getMinHeightD9Ej5fM();
            c1086gP.L(-497955273);
            if ((i12 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            TextInputPillKt.m457TextInputPillg5ZjG94(str118, str117, (Ia.l) objF, h113, jM661getAccessibleColorOnWhiteBackground8_81llA14, maxLine14, false, lVar17, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM14, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
            c1086gP.L(-497931568);
            if (textQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(answer3.getLength());
                sb15.append('/');
                sb15.append(textQuestionModel.getCharacterLimit());
                TextKt.b(sb15.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.T(true);
            lVar3 = lVar17;
            pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
            answer5 = answer3;
            hVar3 = hVar17;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i22 != 0) {
                hVar2 = aVar;
            }
            if (i23 != 0) {
                answer3 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            } else {
                answer3 = answer2;
            }
            if (i16 != 0) {
                c2358g = new C2358g(3);
            } else {
                c2358g = lVar2;
            }
            if (i18 != 0) {
                pVarM446getLambda1$intercom_sdk_base_release = ComposableSingletons$LongTextQuestionKt.INSTANCE.m446getLambda1$intercom_sdk_base_release();
            } else {
                pVarM446getLambda1$intercom_sdk_base_release = pVar2;
            }
            E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
            androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            androidx.compose.ui.h hVar18 = hVar2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar11117 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar11117, c1086gP, eD15);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11118 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar11118, c1086gP, interfaceC1089h0P119);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar3);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar3);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar11119 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar11119, c1086gP, hVarC119);
            C0953m c0953mA15 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
            Ia.l<? super InterfaceC1000i, r> lVar18 = c2358g;
            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11117, c1086gP, c0953mA15);
            R0.a(pVar11118, c1086gP, interfaceC1089h0P1110);
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar3);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar3);
            }
            R0.a(pVar11119, c1086gP, hVarC1110);
            pVarM446getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i12 >> 21) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            c1086gP.L(-497967796);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            String str119 = placeholder;
            c1086gP.T(false);
            if (answer3 instanceof Answer.SingleAnswer) {
                answer4 = ((Answer.SingleAnswer) answer3).getAnswer();
            } else {
                answer4 = "";
            }
            String str1110 = answer4;
            if (validationError instanceof ValidationError.ValidationStringError) {
                h8 = null;
            } else {
                h8 = null;
            }
            H h114 = h8;
            long jM661getAccessibleColorOnWhiteBackground8_81llA15 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
            int maxLine15 = textQuestionModel.getMaxLine();
            float fM400getMinHeightD9Ej5fM15 = textQuestionModel.m400getMinHeightD9Ej5fM();
            c1086gP.L(-497955273);
            if ((i12 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.blocks.messengercard.a(1, onAnswer);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            TextInputPillKt.m457TextInputPillg5ZjG94(str1110, str119, (Ia.l) objF, h114, jM661getAccessibleColorOnWhiteBackground8_81llA15, maxLine15, false, lVar18, 0, 1, false, null, false, fM400getMinHeightD9Ej5fM15, c1086gP, ((i12 << 3) & 29360128) | 805306368, 6, 6464);
            c1086gP.L(-497931568);
            if (textQuestionModel.getCharacterLimit() != null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(answer3.getLength());
                sb16.append('/');
                sb16.append(textQuestionModel.getCharacterLimit());
                TextKt.b(sb16.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 4, 0.0f, 0.0f, 13), Q3.d.e(4285756278L), G0.a.g(14), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3456, 0, 131056);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.T(true);
            lVar3 = lVar18;
            pVar4 = pVarM446getLambda1$intercom_sdk_base_release;
            answer5 = answer3;
            hVar3 = hVar18;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return LongTextQuestionKt.LongTextQuestion$lambda$5(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar3, pVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LongTextQuestion$lambda$0(InterfaceC1000i interfaceC1000i) {
        kotlin.jvm.internal.i.e(interfaceC1000i, "<this>");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LongTextQuestion$lambda$4$lambda$3$lambda$2$lambda$1(Ia.l onAnswer, String it) {
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.length() > 0) {
            onAnswer.invoke(new Answer.SingleAnswer(it));
        } else {
            onAnswer.invoke(Answer.NoAnswer.ResetNoAnswer.INSTANCE);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r LongTextQuestion$lambda$5(androidx.compose.ui.h hVar, SurveyData.Step.Question.LongTextQuestionModel textQuestionModel, Answer answer, Ia.l onAnswer, SurveyUiColors colors, ValidationError validationError, Ia.l lVar, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(textQuestionModel, "$textQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(colors, "$colors");
        kotlin.jvm.internal.i.e(validationError, "$validationError");
        LongTextQuestion(hVar, textQuestionModel, answer, onAnswer, colors, validationError, lVar, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
