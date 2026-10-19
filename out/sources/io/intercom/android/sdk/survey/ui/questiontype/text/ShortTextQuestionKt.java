package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import S4.o;
import android.content.Context;
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
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.compose.J;
import io.intercom.android.sdk.m5.components.C2293m0;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.m5.conversation.ui.T;
import io.intercom.android.sdk.m5.home.ui.components.q;
import io.intercom.android.sdk.models.CountryAreaCode;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import io.intercom.android.sdk.utilities.UtilsKt;
import java.util.Locale;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p037cb.C1530i0;
import p293xa.r;

/* JADX INFO: compiled from: ShortTextQuestion.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShortTextQuestionKt {

    /* JADX INFO: compiled from: ShortTextQuestion.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ShortTextAnsweredPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1590545552);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m449getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new q(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextAnsweredPreview$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ShortTextAnsweredPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void ShortTextDisabledPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1539795729);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m451getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextDisabledPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ShortTextDisabledPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void ShortTextPhoneNumberPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-38271892);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m450getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextPhoneNumberPreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ShortTextPhoneNumberPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void ShortTextPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(2147193389);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ShortTextQuestionKt.INSTANCE.m448getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextPreview$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        ShortTextPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x0157  */
    /* JADX WARN: Code duplicated, block: B:107:0x016b  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:125:0x0204  */
    /* JADX WARN: Code duplicated, block: B:127:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:0x023d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0242  */
    /* JADX WARN: Code duplicated, block: B:135:0x0245  */
    /* JADX WARN: Code duplicated, block: B:137:0x0249  */
    /* JADX WARN: Code duplicated, block: B:138:0x024c  */
    /* JADX WARN: Code duplicated, block: B:139:0x024f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0255  */
    /* JADX WARN: Code duplicated, block: B:143:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x026b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0279  */
    /* JADX WARN: Code duplicated, block: B:151:0x0290  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:160:0x02de  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:168:0x0301  */
    /* JADX WARN: Code duplicated, block: B:171:0x0310  */
    /* JADX WARN: Code duplicated, block: B:176:0x031b  */
    /* JADX WARN: Code duplicated, block: B:179:0x032d  */
    /* JADX WARN: Code duplicated, block: B:180:0x032f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0336  */
    /* JADX WARN: Code duplicated, block: B:187:0x033f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0381  */
    /* JADX WARN: Code duplicated, block: B:192:0x0385  */
    /* JADX WARN: Code duplicated, block: B:198:0x040b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0471  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    /* JADX WARN: Code duplicated, block: B:96:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x0138  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x02b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void ShortTextQuestion(androidx.compose.ui.h hVar, final SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, Answer answer, final Ia.l<? super Answer, r> onAnswer, final SurveyUiColors colors, final ValidationError validationError, Ia.l<? super InterfaceC1000i, r> lVar, p<? super InterfaceC1084f, ? super Integer, r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
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
        p<? super InterfaceC1084f, ? super Integer, r> pVarM447getLambda1$intercom_sdk_base_release;
        int i19;
        androidx.compose.ui.h.a aVar;
        Ia.l<? super InterfaceC1000i, r> t8;
        Object objF;
        Object obj;
        Object objF2;
        int i20;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar2;
        Ia.l<? super InterfaceC1000i, r> lVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        String answer3;
        String placeholder;
        String str;
        String str2;
        ComposableLambdaImpl composableLambdaImplB;
        H h8;
        boolean z10;
        boolean z11;
        Object objF3;
        int i25;
        Answer answer4;
        SurveyData.Step.Question.QuestionValidation.ValidationType validationType;
        Integer characterLimit;
        final p<? super InterfaceC1084f, ? super Integer, r> pVar3;
        final Answer answer5;
        final androidx.compose.ui.h hVar3;
        final Ia.l<? super InterfaceC1000i, r> lVar4;
        Locale localeCompat;
        final CountryAreaCode countryAreaCodeFromLocale;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(textQuestionModel, "textQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "onAnswer");
        kotlin.jvm.internal.i.e(colors, "colors");
        kotlin.jvm.internal.i.e(validationError, "validationError");
        C1086g c1086gP = interfaceC1084f.p(13974558);
        int i26 = i11 & 1;
        if (i26 != 0) {
            hVar2 = hVar;
            i12 = i10 | 6;
        } else {
            hVar2 = hVar;
            if ((i10 & 14) == 0) {
                i12 = i10 | (c1086gP.K(hVar2) ? 4 : 2);
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(textQuestionModel) ? 32 : 16;
        }
        int i27 = i12;
        int i28 = i11 & 4;
        if (i28 == 0) {
            if ((i10 & 896) == 0) {
                answer2 = answer;
                i27 |= c1086gP.K(answer2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i27 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (c1086gP.k(onAnswer)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i27 |= i13;
            }
            if ((i11 & 16) != 0) {
                i27 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c1086gP.K(colors)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i27 |= i14;
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
                        i27 |= i17;
                    }
                    i18 = 128 & i11;
                    if (i18 != 0) {
                        i27 |= 12582912;
                        pVarM447getLambda1$intercom_sdk_base_release = pVar;
                    } else {
                        pVarM447getLambda1$intercom_sdk_base_release = pVar;
                        if ((i10 & 29360128) == 0) {
                            if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                            i27 |= i19;
                        }
                    }
                    if ((i27 & 23967451) == 4793490 || !c1086gP.s()) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i26 != 0) {
                            hVar2 = aVar;
                        }
                        if (i28 != 0) {
                            answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                        }
                        if (i16 != 0) {
                            t8 = new T(2);
                        } else {
                            t8 = lVar2;
                        }
                        if (i18 != 0) {
                            pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                        }
                        c1086gP.L(-1483108825);
                        objF = c1086gP.f();
                        obj = InterfaceC1084f.a.f12980a;
                        if (objF == obj) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        androidx.compose.foundation.relocation.a aVar3 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == obj) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        androidx.compose.ui.h hVar4 = hVar2;
                        androidx.compose.ui.h hVarA = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar3), new J((A) objF2, 2, aVar3));
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i20 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarA);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar4 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar4, c1086gP, eD);
                        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar5 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar5, c1086gP, interfaceC1089h0P);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            lVar3 = t8;
                        } else {
                            lVar3 = t8;
                            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                            }
                            p<ComposeUiNode, androidx.compose.ui.h, r> pVar6 = ComposeUiNode.Companion.f14335d;
                            R0.a(pVar6, c1086gP, hVarC);
                            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                            i21 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar2);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar4, c1086gP, c0953mA);
                            R0.a(pVar5, c1086gP, interfaceC1089h0P2);
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                                J4.i.d(i21, c1086gP, i21, pVar2);
                            }
                            R0.a(pVar6, c1086gP, hVarC2);
                            pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                            Lb.a.a(c1086gP, W.e(aVar, 8));
                            i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                            if (i22 != 1) {
                                if (i22 != 2) {
                                    i23 = 4;
                                    i24 = 6;
                                } else if (i22 != 3) {
                                    i23 = 4;
                                    if (i22 != 4) {
                                        i24 = 1;
                                    }
                                } else {
                                    i23 = 4;
                                    i24 = 4;
                                }
                                if (answer2 instanceof Answer.SingleAnswer) {
                                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                                } else {
                                    answer3 = "";
                                }
                                c1086gP.L(1720968786);
                                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                                } else {
                                    placeholder = textQuestionModel.getPlaceholder();
                                }
                                c1086gP.T(false);
                                c1086gP.L(1720978057);
                                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                    Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                    PhoneNumberValidator.loadCountryAreaCodes(context);
                                    localeCompat = UtilsKt.getLocaleCompat(context);
                                    if (answer2 instanceof Answer.NoAnswer) {
                                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                    } else {
                                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                    }
                                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                    }
                                    str = answer3;
                                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                        @Override // Ia.p
                                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                            invoke(interfaceC1084f2, num.intValue());
                                            return r.f47939a;
                                        }

                                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i29) {
                                            if ((i29 & 11) == 2 && interfaceC1084f2.s()) {
                                                interfaceC1084f2.w();
                                                return;
                                            }
                                            String emoji = countryAreaCodeFromLocale.getEmoji();
                                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                        }
                                    }, c1086gP);
                                    str2 = "+1 123 456 7890";
                                } else {
                                    str = answer3;
                                    str2 = placeholder;
                                    composableLambdaImplB = null;
                                }
                                c1086gP.T(false);
                                if ((validationError instanceof ValidationError.ValidationStringError) || (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) || ((ValidationError.ValidationStringError) validationError).getStringRes() == io.intercom.android.sdk.R.string.intercom_surveys_required_response) {
                                    h8 = null;
                                } else {
                                    h8 = new H(H.f13500g);
                                }
                                long jM661getAccessibleColorOnWhiteBackground8_81llA = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                                if (textQuestionModel.getEnabled() || !(validationError instanceof ValidationError.NoValidationError) || (answer2 instanceof Answer.NoAnswer)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                boolean enabled = textQuestionModel.getEnabled();
                                c1086gP.L(1721011229);
                                if ((i27 & 7168) == 2048) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objF3 = c1086gP.f();
                                if (!z11 || objF3 == obj) {
                                    i25 = 1;
                                    objF3 = new C1530i0(i25, onAnswer);
                                    c1086gP.E(objF3);
                                } else {
                                    i25 = 1;
                                }
                                c1086gP.T(false);
                                answer4 = answer2;
                                boolean z12 = i25;
                                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                                validationType = textQuestionModel.getValidationType();
                                c1086gP.L(1721048023);
                                if ((validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION || validationType == SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT) && (characterLimit = textQuestionModel.getCharacterLimit()) != null) {
                                    int iIntValue = characterLimit.intValue();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(answer4.getLength());
                                    sb2.append('/');
                                    sb2.append(iIntValue);
                                    TextKt.b(sb2.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                    r rVar = r.f47939a;
                                }
                                c1086gP.T(false);
                                c1086gP.L(1721067384);
                                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                    String strP = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                    int i29 = IntercomTheme.$stable;
                                    TextKt.b(strP, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme.getColors(c1086gP, i29).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i29).getType04(), c1086gP, 48, 0, 65528);
                                }
                                c1086gP.T(false);
                                c1086gP.T(z12);
                                c1086gP.T(z12);
                                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                                answer5 = answer4;
                                hVar3 = hVar4;
                                lVar4 = lVar3;
                            } else {
                                i23 = 4;
                            }
                            i24 = 3;
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context2);
                                localeCompat = UtilsKt.getLocaleCompat(context2);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i210) {
                                        if ((i210 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA2 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled2 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z13 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA2, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled2, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue2 = characterLimit.intValue();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(answer4.getLength());
                                sb3.append('/');
                                sb3.append(iIntValue2);
                                TextKt.b(sb3.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar2 = r.f47939a;
                            } else {
                                int iIntValue3 = characterLimit.intValue();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(answer4.getLength());
                                sb4.append('/');
                                sb4.append(iIntValue3);
                                TextKt.b(sb4.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar3 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP2 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                                int i210 = IntercomTheme.$stable;
                                TextKt.b(strP2, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme2.getColors(c1086gP, i210).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i210).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z13);
                            c1086gP.T(z13);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar4;
                            lVar4 = lVar3;
                        }
                        J4.i.d(i20, c1086gP, i20, pVar2);
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar7 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar7, c1086gP, hVarC);
                        C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar4, c1086gP, c0953mA2);
                        R0.a(pVar5, c1086gP, interfaceC1089h0P3);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar7, c1086gP, hVarC3);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context3 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context3);
                                localeCompat = UtilsKt.getLocaleCompat(context3);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i211) {
                                        if ((i211 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA3 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled3 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z14 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA3, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled3, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue4 = characterLimit.intValue();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(answer4.getLength());
                                sb5.append('/');
                                sb5.append(iIntValue4);
                                TextKt.b(sb5.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar4 = r.f47939a;
                            } else {
                                int iIntValue5 = characterLimit.intValue();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(answer4.getLength());
                                sb6.append('/');
                                sb6.append(iIntValue5);
                                TextKt.b(sb6.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar5 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP3 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                                int i211 = IntercomTheme.$stable;
                                TextKt.b(strP3, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme3.getColors(c1086gP, i211).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c1086gP, i211).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z14);
                            c1086gP.T(z14);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar4;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context4 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context4);
                            localeCompat = UtilsKt.getLocaleCompat(context4);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i212) {
                                    if ((i212 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA4 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled4 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z15 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA4, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled4, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue6 = characterLimit.intValue();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(answer4.getLength());
                            sb7.append('/');
                            sb7.append(iIntValue6);
                            TextKt.b(sb7.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar6 = r.f47939a;
                        } else {
                            int iIntValue7 = characterLimit.intValue();
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(answer4.getLength());
                            sb8.append('/');
                            sb8.append(iIntValue7);
                            TextKt.b(sb8.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar7 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP4 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                            int i212 = IntercomTheme.$stable;
                            TextKt.b(strP4, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme4.getColors(c1086gP, i212).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(c1086gP, i212).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z15);
                        c1086gP.T(z15);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar4;
                        lVar4 = lVar3;
                    } else {
                        c1086gP.w();
                        hVar3 = hVar2;
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        lVar4 = lVar2;
                        answer5 = answer2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                            @Override // Ia.p
                            public final Object invoke(Object obj2, Object obj3) {
                                int iIntValue8 = ((Integer) obj3).intValue();
                                return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue8);
                            }
                        };
                    }
                }
                i27 |= 1572864;
                lVar2 = lVar;
                i18 = 128 & i11;
                if (i18 != 0) {
                    i27 |= 12582912;
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                } else {
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i27 |= i19;
                    }
                }
                if ((i27 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar4 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar5 = hVar2;
                    androidx.compose.ui.h hVarA2 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar4), new J((A) objF2, 2, aVar4));
                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarA2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar8 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar8, c1086gP, eD2);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar9 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar9, c1086gP, interfaceC1089h0P4);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar10 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar10, c1086gP, hVarC4);
                        C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar8, c1086gP, c0953mA3);
                        R0.a(pVar9, c1086gP, interfaceC1089h0P5);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar10, c1086gP, hVarC5);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context5 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context5);
                                localeCompat = UtilsKt.getLocaleCompat(context5);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i213) {
                                        if ((i213 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA5 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled5 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z16 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA5, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled5, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue8 = characterLimit.intValue();
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append(answer4.getLength());
                                sb9.append('/');
                                sb9.append(iIntValue8);
                                TextKt.b(sb9.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar8 = r.f47939a;
                            } else {
                                int iIntValue9 = characterLimit.intValue();
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(answer4.getLength());
                                sb10.append('/');
                                sb10.append(iIntValue9);
                                TextKt.b(sb10.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar9 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP5 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                                int i213 = IntercomTheme.$stable;
                                TextKt.b(strP5, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme5.getColors(c1086gP, i213).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(c1086gP, i213).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z16);
                            c1086gP.T(z16);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar5;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context6 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context6);
                            localeCompat = UtilsKt.getLocaleCompat(context6);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i214) {
                                    if ((i214 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA6 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled6 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z17 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA6, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled6, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue10 = characterLimit.intValue();
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(answer4.getLength());
                            sb11.append('/');
                            sb11.append(iIntValue10);
                            TextKt.b(sb11.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar10 = r.f47939a;
                        } else {
                            int iIntValue11 = characterLimit.intValue();
                            StringBuilder sb12 = new StringBuilder();
                            sb12.append(answer4.getLength());
                            sb12.append('/');
                            sb12.append(iIntValue11);
                            TextKt.b(sb12.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP6 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                            int i214 = IntercomTheme.$stable;
                            TextKt.b(strP6, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme6.getColors(c1086gP, i214).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(c1086gP, i214).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z17);
                        c1086gP.T(z17);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar5;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar11 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar11, c1086gP, hVarC4);
                    C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar8, c1086gP, c0953mA4);
                    R0.a(pVar9, c1086gP, interfaceC1089h0P6);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar11, c1086gP, hVarC6);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context7 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context7);
                            localeCompat = UtilsKt.getLocaleCompat(context7);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i215) {
                                    if ((i215 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA7 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled7 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z18 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA7, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled7, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue12 = characterLimit.intValue();
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(answer4.getLength());
                            sb13.append('/');
                            sb13.append(iIntValue12);
                            TextKt.b(sb13.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar12 = r.f47939a;
                        } else {
                            int iIntValue13 = characterLimit.intValue();
                            StringBuilder sb14 = new StringBuilder();
                            sb14.append(answer4.getLength());
                            sb14.append('/');
                            sb14.append(iIntValue13);
                            TextKt.b(sb14.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar13 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP7 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                            int i215 = IntercomTheme.$stable;
                            TextKt.b(strP7, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme7.getColors(c1086gP, i215).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(c1086gP, i215).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z18);
                        c1086gP.T(z18);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar5;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context8 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context8);
                        localeCompat = UtilsKt.getLocaleCompat(context8);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i216) {
                                if ((i216 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA8 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled8 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z19 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA8, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled8, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue14 = characterLimit.intValue();
                        StringBuilder sb15 = new StringBuilder();
                        sb15.append(answer4.getLength());
                        sb15.append('/');
                        sb15.append(iIntValue14);
                        TextKt.b(sb15.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar14 = r.f47939a;
                    } else {
                        int iIntValue15 = characterLimit.intValue();
                        StringBuilder sb16 = new StringBuilder();
                        sb16.append(answer4.getLength());
                        sb16.append('/');
                        sb16.append(iIntValue15);
                        TextKt.b(sb16.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar15 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP8 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        int i216 = IntercomTheme.$stable;
                        TextKt.b(strP8, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme8.getColors(c1086gP, i216).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme8.getTypography(c1086gP, i216).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z19);
                    c1086gP.T(z19);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar5;
                    lVar4 = lVar3;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar5 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar6 = hVar2;
                    androidx.compose.ui.h hVarA3 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar5), new J((A) objF2, 2, aVar5));
                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarA3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar12 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar12, c1086gP, eD3);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar13 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar13, c1086gP, interfaceC1089h0P7);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar14 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar14, c1086gP, hVarC7);
                        C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar12, c1086gP, c0953mA5);
                        R0.a(pVar13, c1086gP, interfaceC1089h0P8);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar14, c1086gP, hVarC8);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context9 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context9);
                                localeCompat = UtilsKt.getLocaleCompat(context9);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i217) {
                                        if ((i217 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA9 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled9 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z110 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA9, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled9, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue16 = characterLimit.intValue();
                                StringBuilder sb17 = new StringBuilder();
                                sb17.append(answer4.getLength());
                                sb17.append('/');
                                sb17.append(iIntValue16);
                                TextKt.b(sb17.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar16 = r.f47939a;
                            } else {
                                int iIntValue17 = characterLimit.intValue();
                                StringBuilder sb18 = new StringBuilder();
                                sb18.append(answer4.getLength());
                                sb18.append('/');
                                sb18.append(iIntValue17);
                                TextKt.b(sb18.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar17 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP9 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                                int i217 = IntercomTheme.$stable;
                                TextKt.b(strP9, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme9.getColors(c1086gP, i217).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme9.getTypography(c1086gP, i217).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z110);
                            c1086gP.T(z110);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar6;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context10 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context10);
                            localeCompat = UtilsKt.getLocaleCompat(context10);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i218) {
                                    if ((i218 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA10 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled10 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z111 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA10, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled10, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue18 = characterLimit.intValue();
                            StringBuilder sb19 = new StringBuilder();
                            sb19.append(answer4.getLength());
                            sb19.append('/');
                            sb19.append(iIntValue18);
                            TextKt.b(sb19.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar18 = r.f47939a;
                        } else {
                            int iIntValue19 = characterLimit.intValue();
                            StringBuilder sb110 = new StringBuilder();
                            sb110.append(answer4.getLength());
                            sb110.append('/');
                            sb110.append(iIntValue19);
                            TextKt.b(sb110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar19 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP10 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                            int i218 = IntercomTheme.$stable;
                            TextKt.b(strP10, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme10.getColors(c1086gP, i218).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme10.getTypography(c1086gP, i218).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z111);
                        c1086gP.T(z111);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar6;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar15 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar15, c1086gP, hVarC7);
                    C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar12, c1086gP, c0953mA6);
                    R0.a(pVar13, c1086gP, interfaceC1089h0P9);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar15, c1086gP, hVarC9);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context11 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context11);
                            localeCompat = UtilsKt.getLocaleCompat(context11);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i219) {
                                    if ((i219 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA11 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled11 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z112 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue110 = characterLimit.intValue();
                            StringBuilder sb111 = new StringBuilder();
                            sb111.append(answer4.getLength());
                            sb111.append('/');
                            sb111.append(iIntValue110);
                            TextKt.b(sb111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar110 = r.f47939a;
                        } else {
                            int iIntValue111 = characterLimit.intValue();
                            StringBuilder sb112 = new StringBuilder();
                            sb112.append(answer4.getLength());
                            sb112.append('/');
                            sb112.append(iIntValue111);
                            TextKt.b(sb112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP11 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                            int i219 = IntercomTheme.$stable;
                            TextKt.b(strP11, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11.getColors(c1086gP, i219).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11.getTypography(c1086gP, i219).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z112);
                        c1086gP.T(z112);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar6;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context12 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context12);
                        localeCompat = UtilsKt.getLocaleCompat(context12);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2110) {
                                if ((i2110 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA12 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled12 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z113 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA12, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled12, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue112 = characterLimit.intValue();
                        StringBuilder sb113 = new StringBuilder();
                        sb113.append(answer4.getLength());
                        sb113.append('/');
                        sb113.append(iIntValue112);
                        TextKt.b(sb113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar112 = r.f47939a;
                    } else {
                        int iIntValue113 = characterLimit.intValue();
                        StringBuilder sb114 = new StringBuilder();
                        sb114.append(answer4.getLength());
                        sb114.append('/');
                        sb114.append(iIntValue113);
                        TextKt.b(sb114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP12 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                        int i2110 = IntercomTheme.$stable;
                        TextKt.b(strP12, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme12.getColors(c1086gP, i2110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme12.getTypography(c1086gP, i2110).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z113);
                    c1086gP.T(z113);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar6;
                    lVar4 = lVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // Ia.p
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue20 = ((Integer) obj3).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                        }
                    };
                }
            }
            i15 = 196608;
            i27 |= i15;
            i16 = i11 & 64;
            if (i16 != 0) {
                if ((3670016 & i10) == 0) {
                    lVar2 = lVar;
                    if (c1086gP.k(lVar2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i27 |= i17;
                }
                i18 = 128 & i11;
                if (i18 != 0) {
                    i27 |= 12582912;
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                } else {
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i27 |= i19;
                    }
                }
                if ((i27 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar6 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar7 = hVar2;
                    androidx.compose.ui.h hVarA4 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar6), new J((A) objF2, 2, aVar6));
                    androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarA4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar16 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar16, c1086gP, eD4);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar17 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar17, c1086gP, interfaceC1089h0P10);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar18 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar18, c1086gP, hVarC10);
                        C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                        androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar16, c1086gP, c0953mA7);
                        R0.a(pVar17, c1086gP, interfaceC1089h0P11);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar18, c1086gP, hVarC11);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context13 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context13);
                                localeCompat = UtilsKt.getLocaleCompat(context13);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111) {
                                        if ((i2111 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA13 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled13 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z114 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA13, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled13, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue114 = characterLimit.intValue();
                                StringBuilder sb115 = new StringBuilder();
                                sb115.append(answer4.getLength());
                                sb115.append('/');
                                sb115.append(iIntValue114);
                                TextKt.b(sb115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar114 = r.f47939a;
                            } else {
                                int iIntValue115 = characterLimit.intValue();
                                StringBuilder sb116 = new StringBuilder();
                                sb116.append(answer4.getLength());
                                sb116.append('/');
                                sb116.append(iIntValue115);
                                TextKt.b(sb116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar115 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP13 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                                int i2111 = IntercomTheme.$stable;
                                TextKt.b(strP13, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme13.getColors(c1086gP, i2111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme13.getTypography(c1086gP, i2111).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z114);
                            c1086gP.T(z114);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar7;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context14 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context14);
                            localeCompat = UtilsKt.getLocaleCompat(context14);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2112) {
                                    if ((i2112 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA14 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled14 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z115 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA14, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled14, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue116 = characterLimit.intValue();
                            StringBuilder sb117 = new StringBuilder();
                            sb117.append(answer4.getLength());
                            sb117.append('/');
                            sb117.append(iIntValue116);
                            TextKt.b(sb117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar116 = r.f47939a;
                        } else {
                            int iIntValue117 = characterLimit.intValue();
                            StringBuilder sb118 = new StringBuilder();
                            sb118.append(answer4.getLength());
                            sb118.append('/');
                            sb118.append(iIntValue117);
                            TextKt.b(sb118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar117 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP14 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                            int i2112 = IntercomTheme.$stable;
                            TextKt.b(strP14, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme14.getColors(c1086gP, i2112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme14.getTypography(c1086gP, i2112).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z115);
                        c1086gP.T(z115);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar7;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar19 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar19, c1086gP, hVarC10);
                    C0953m c0953mA8 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar16, c1086gP, c0953mA8);
                    R0.a(pVar17, c1086gP, interfaceC1089h0P12);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar19, c1086gP, hVarC12);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context15 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context15);
                            localeCompat = UtilsKt.getLocaleCompat(context15);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2113) {
                                    if ((i2113 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA15 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled15 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z116 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA15, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled15, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue118 = characterLimit.intValue();
                            StringBuilder sb119 = new StringBuilder();
                            sb119.append(answer4.getLength());
                            sb119.append('/');
                            sb119.append(iIntValue118);
                            TextKt.b(sb119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar118 = r.f47939a;
                        } else {
                            int iIntValue119 = characterLimit.intValue();
                            StringBuilder sb1110 = new StringBuilder();
                            sb1110.append(answer4.getLength());
                            sb1110.append('/');
                            sb1110.append(iIntValue119);
                            TextKt.b(sb1110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar119 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP15 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                            int i2113 = IntercomTheme.$stable;
                            TextKt.b(strP15, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme15.getColors(c1086gP, i2113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme15.getTypography(c1086gP, i2113).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z116);
                        c1086gP.T(z116);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar7;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context16 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context16);
                        localeCompat = UtilsKt.getLocaleCompat(context16);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2114) {
                                if ((i2114 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA16 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled16 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z117 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA16, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled16, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1110 = characterLimit.intValue();
                        StringBuilder sb1111 = new StringBuilder();
                        sb1111.append(answer4.getLength());
                        sb1111.append('/');
                        sb1111.append(iIntValue1110);
                        TextKt.b(sb1111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1110 = r.f47939a;
                    } else {
                        int iIntValue1111 = characterLimit.intValue();
                        StringBuilder sb1112 = new StringBuilder();
                        sb1112.append(answer4.getLength());
                        sb1112.append('/');
                        sb1112.append(iIntValue1111);
                        TextKt.b(sb1112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP16 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        int i2114 = IntercomTheme.$stable;
                        TextKt.b(strP16, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme16.getColors(c1086gP, i2114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme16.getTypography(c1086gP, i2114).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z117);
                    c1086gP.T(z117);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar7;
                    lVar4 = lVar3;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar7 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar8 = hVar2;
                    androidx.compose.ui.h hVarA5 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar7), new J((A) objF2, 2, aVar7));
                    androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarA5);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar110 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar110, c1086gP, eD5);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar111 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar111, c1086gP, interfaceC1089h0P13);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar112 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar112, c1086gP, hVarC13);
                        C0953m c0953mA9 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                        androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar110, c1086gP, c0953mA9);
                        R0.a(pVar111, c1086gP, interfaceC1089h0P14);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar112, c1086gP, hVarC14);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context17 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context17);
                                localeCompat = UtilsKt.getLocaleCompat(context17);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i2115) {
                                        if ((i2115 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA17 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled17 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z118 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA17, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled17, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue1112 = characterLimit.intValue();
                                StringBuilder sb1113 = new StringBuilder();
                                sb1113.append(answer4.getLength());
                                sb1113.append('/');
                                sb1113.append(iIntValue1112);
                                TextKt.b(sb1113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar1112 = r.f47939a;
                            } else {
                                int iIntValue1113 = characterLimit.intValue();
                                StringBuilder sb1114 = new StringBuilder();
                                sb1114.append(answer4.getLength());
                                sb1114.append('/');
                                sb1114.append(iIntValue1113);
                                TextKt.b(sb1114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar1113 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP17 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                                int i2115 = IntercomTheme.$stable;
                                TextKt.b(strP17, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme17.getColors(c1086gP, i2115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme17.getTypography(c1086gP, i2115).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z118);
                            c1086gP.T(z118);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar8;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context18 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context18);
                            localeCompat = UtilsKt.getLocaleCompat(context18);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2116) {
                                    if ((i2116 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA18 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled18 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z119 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA18, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled18, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1114 = characterLimit.intValue();
                            StringBuilder sb1115 = new StringBuilder();
                            sb1115.append(answer4.getLength());
                            sb1115.append('/');
                            sb1115.append(iIntValue1114);
                            TextKt.b(sb1115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1114 = r.f47939a;
                        } else {
                            int iIntValue1115 = characterLimit.intValue();
                            StringBuilder sb1116 = new StringBuilder();
                            sb1116.append(answer4.getLength());
                            sb1116.append('/');
                            sb1116.append(iIntValue1115);
                            TextKt.b(sb1116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1115 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP18 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                            int i2116 = IntercomTheme.$stable;
                            TextKt.b(strP18, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme18.getColors(c1086gP, i2116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme18.getTypography(c1086gP, i2116).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z119);
                        c1086gP.T(z119);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar8;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar113 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar113, c1086gP, hVarC13);
                    C0953m c0953mA10 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar110, c1086gP, c0953mA10);
                    R0.a(pVar111, c1086gP, interfaceC1089h0P15);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar113, c1086gP, hVarC15);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context19 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context19);
                            localeCompat = UtilsKt.getLocaleCompat(context19);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2117) {
                                    if ((i2117 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA19 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled19 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z1110 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA19, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled19, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1116 = characterLimit.intValue();
                            StringBuilder sb1117 = new StringBuilder();
                            sb1117.append(answer4.getLength());
                            sb1117.append('/');
                            sb1117.append(iIntValue1116);
                            TextKt.b(sb1117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1116 = r.f47939a;
                        } else {
                            int iIntValue1117 = characterLimit.intValue();
                            StringBuilder sb1118 = new StringBuilder();
                            sb1118.append(answer4.getLength());
                            sb1118.append('/');
                            sb1118.append(iIntValue1117);
                            TextKt.b(sb1118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1117 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP19 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                            int i2117 = IntercomTheme.$stable;
                            TextKt.b(strP19, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme19.getColors(c1086gP, i2117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme19.getTypography(c1086gP, i2117).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z1110);
                        c1086gP.T(z1110);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar8;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context110 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context110);
                        localeCompat = UtilsKt.getLocaleCompat(context110);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2118) {
                                if ((i2118 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA110 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled110 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1111 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA110, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled110, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1118 = characterLimit.intValue();
                        StringBuilder sb1119 = new StringBuilder();
                        sb1119.append(answer4.getLength());
                        sb1119.append('/');
                        sb1119.append(iIntValue1118);
                        TextKt.b(sb1119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1118 = r.f47939a;
                    } else {
                        int iIntValue1119 = characterLimit.intValue();
                        StringBuilder sb11110 = new StringBuilder();
                        sb11110.append(answer4.getLength());
                        sb11110.append('/');
                        sb11110.append(iIntValue1119);
                        TextKt.b(sb11110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1119 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP110 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                        int i2118 = IntercomTheme.$stable;
                        TextKt.b(strP110, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme110.getColors(c1086gP, i2118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme110.getTypography(c1086gP, i2118).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1111);
                    c1086gP.T(z1111);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar8;
                    lVar4 = lVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // Ia.p
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue20 = ((Integer) obj3).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                        }
                    };
                }
            }
            i27 |= 1572864;
            lVar2 = lVar;
            i18 = 128 & i11;
            if (i18 != 0) {
                i27 |= 12582912;
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
            } else {
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i27 |= i19;
                }
            }
            if ((i27 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar8 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar9 = hVar2;
                androidx.compose.ui.h hVarA6 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar8), new J((A) objF2, 2, aVar8));
                androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarA6);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar114 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar114, c1086gP, eD6);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar115 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar115, c1086gP, interfaceC1089h0P16);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar116 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar116, c1086gP, hVarC16);
                    C0953m c0953mA11 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                    androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar114, c1086gP, c0953mA11);
                    R0.a(pVar115, c1086gP, interfaceC1089h0P17);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar116, c1086gP, hVarC17);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context111 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context111);
                            localeCompat = UtilsKt.getLocaleCompat(context111);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2119) {
                                    if ((i2119 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA111 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled111 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z1112 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue11110 = characterLimit.intValue();
                            StringBuilder sb11111 = new StringBuilder();
                            sb11111.append(answer4.getLength());
                            sb11111.append('/');
                            sb11111.append(iIntValue11110);
                            TextKt.b(sb11111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11110 = r.f47939a;
                        } else {
                            int iIntValue11111 = characterLimit.intValue();
                            StringBuilder sb11112 = new StringBuilder();
                            sb11112.append(answer4.getLength());
                            sb11112.append('/');
                            sb11112.append(iIntValue11111);
                            TextKt.b(sb11112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11111 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP111 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                            int i2119 = IntercomTheme.$stable;
                            TextKt.b(strP111, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111.getColors(c1086gP, i2119).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111.getTypography(c1086gP, i2119).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z1112);
                        c1086gP.T(z1112);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar9;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context112 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context112);
                        localeCompat = UtilsKt.getLocaleCompat(context112);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21110) {
                                if ((i21110 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA112 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled112 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1113 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA112, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled112, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11112 = characterLimit.intValue();
                        StringBuilder sb11113 = new StringBuilder();
                        sb11113.append(answer4.getLength());
                        sb11113.append('/');
                        sb11113.append(iIntValue11112);
                        TextKt.b(sb11113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11112 = r.f47939a;
                    } else {
                        int iIntValue11113 = characterLimit.intValue();
                        StringBuilder sb11114 = new StringBuilder();
                        sb11114.append(answer4.getLength());
                        sb11114.append('/');
                        sb11114.append(iIntValue11113);
                        TextKt.b(sb11114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP112 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                        int i21110 = IntercomTheme.$stable;
                        TextKt.b(strP112, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme112.getColors(c1086gP, i21110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme112.getTypography(c1086gP, i21110).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1113);
                    c1086gP.T(z1113);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar9;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar117 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar117, c1086gP, hVarC16);
                C0953m c0953mA12 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar114, c1086gP, c0953mA12);
                R0.a(pVar115, c1086gP, interfaceC1089h0P18);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar117, c1086gP, hVarC18);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context113 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context113);
                        localeCompat = UtilsKt.getLocaleCompat(context113);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111) {
                                if ((i21111 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA113 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled113 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1114 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA113, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled113, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11114 = characterLimit.intValue();
                        StringBuilder sb11115 = new StringBuilder();
                        sb11115.append(answer4.getLength());
                        sb11115.append('/');
                        sb11115.append(iIntValue11114);
                        TextKt.b(sb11115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11114 = r.f47939a;
                    } else {
                        int iIntValue11115 = characterLimit.intValue();
                        StringBuilder sb11116 = new StringBuilder();
                        sb11116.append(answer4.getLength());
                        sb11116.append('/');
                        sb11116.append(iIntValue11115);
                        TextKt.b(sb11116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11115 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP113 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                        int i21111 = IntercomTheme.$stable;
                        TextKt.b(strP113, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme113.getColors(c1086gP, i21111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme113.getTypography(c1086gP, i21111).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1114);
                    c1086gP.T(z1114);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar9;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context114 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context114);
                    localeCompat = UtilsKt.getLocaleCompat(context114);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21112) {
                            if ((i21112 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA114 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled114 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1115 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA114, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled114, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue11116 = characterLimit.intValue();
                    StringBuilder sb11117 = new StringBuilder();
                    sb11117.append(answer4.getLength());
                    sb11117.append('/');
                    sb11117.append(iIntValue11116);
                    TextKt.b(sb11117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11116 = r.f47939a;
                } else {
                    int iIntValue11117 = characterLimit.intValue();
                    StringBuilder sb11118 = new StringBuilder();
                    sb11118.append(answer4.getLength());
                    sb11118.append('/');
                    sb11118.append(iIntValue11117);
                    TextKt.b(sb11118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11117 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP114 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    int i21112 = IntercomTheme.$stable;
                    TextKt.b(strP114, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme114.getColors(c1086gP, i21112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme114.getTypography(c1086gP, i21112).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1115);
                c1086gP.T(z1115);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar9;
                lVar4 = lVar3;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar9 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar10 = hVar2;
                androidx.compose.ui.h hVarA7 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar9), new J((A) objF2, 2, aVar9));
                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVarA7);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar118 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar118, c1086gP, eD7);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar119 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar119, c1086gP, interfaceC1089h0P19);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar1110 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar1110, c1086gP, hVarC19);
                    C0953m c0953mA13 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar118, c1086gP, c0953mA13);
                    R0.a(pVar119, c1086gP, interfaceC1089h0P110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar1110, c1086gP, hVarC110);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context115 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context115);
                            localeCompat = UtilsKt.getLocaleCompat(context115);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i21113) {
                                    if ((i21113 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA115 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled115 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z1116 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA115, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled115, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue11118 = characterLimit.intValue();
                            StringBuilder sb11119 = new StringBuilder();
                            sb11119.append(answer4.getLength());
                            sb11119.append('/');
                            sb11119.append(iIntValue11118);
                            TextKt.b(sb11119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11118 = r.f47939a;
                        } else {
                            int iIntValue11119 = characterLimit.intValue();
                            StringBuilder sb111110 = new StringBuilder();
                            sb111110.append(answer4.getLength());
                            sb111110.append('/');
                            sb111110.append(iIntValue11119);
                            TextKt.b(sb111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11119 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP115 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                            int i21113 = IntercomTheme.$stable;
                            TextKt.b(strP115, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme115.getColors(c1086gP, i21113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme115.getTypography(c1086gP, i21113).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z1116);
                        c1086gP.T(z1116);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar10;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context116 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context116);
                        localeCompat = UtilsKt.getLocaleCompat(context116);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21114) {
                                if ((i21114 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA116 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled116 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1117 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA116, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled116, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue111110 = characterLimit.intValue();
                        StringBuilder sb111111 = new StringBuilder();
                        sb111111.append(answer4.getLength());
                        sb111111.append('/');
                        sb111111.append(iIntValue111110);
                        TextKt.b(sb111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111110 = r.f47939a;
                    } else {
                        int iIntValue111111 = characterLimit.intValue();
                        StringBuilder sb111112 = new StringBuilder();
                        sb111112.append(answer4.getLength());
                        sb111112.append('/');
                        sb111112.append(iIntValue111111);
                        TextKt.b(sb111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP116 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                        int i21114 = IntercomTheme.$stable;
                        TextKt.b(strP116, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme116.getColors(c1086gP, i21114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme116.getTypography(c1086gP, i21114).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1117);
                    c1086gP.T(z1117);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar10;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar1111 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1111, c1086gP, hVarC19);
                C0953m c0953mA14 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar118, c1086gP, c0953mA14);
                R0.a(pVar119, c1086gP, interfaceC1089h0P111);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar1111, c1086gP, hVarC111);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context117 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context117);
                        localeCompat = UtilsKt.getLocaleCompat(context117);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21115) {
                                if ((i21115 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA117 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled117 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1118 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA117, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled117, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue111112 = characterLimit.intValue();
                        StringBuilder sb111113 = new StringBuilder();
                        sb111113.append(answer4.getLength());
                        sb111113.append('/');
                        sb111113.append(iIntValue111112);
                        TextKt.b(sb111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111112 = r.f47939a;
                    } else {
                        int iIntValue111113 = characterLimit.intValue();
                        StringBuilder sb111114 = new StringBuilder();
                        sb111114.append(answer4.getLength());
                        sb111114.append('/');
                        sb111114.append(iIntValue111113);
                        TextKt.b(sb111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP117 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                        int i21115 = IntercomTheme.$stable;
                        TextKt.b(strP117, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme117.getColors(c1086gP, i21115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme117.getTypography(c1086gP, i21115).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1118);
                    c1086gP.T(z1118);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar10;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context118 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context118);
                    localeCompat = UtilsKt.getLocaleCompat(context118);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21116) {
                            if ((i21116 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA118 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled118 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1119 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA118, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled118, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue111114 = characterLimit.intValue();
                    StringBuilder sb111115 = new StringBuilder();
                    sb111115.append(answer4.getLength());
                    sb111115.append('/');
                    sb111115.append(iIntValue111114);
                    TextKt.b(sb111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111114 = r.f47939a;
                } else {
                    int iIntValue111115 = characterLimit.intValue();
                    StringBuilder sb111116 = new StringBuilder();
                    sb111116.append(answer4.getLength());
                    sb111116.append('/');
                    sb111116.append(iIntValue111115);
                    TextKt.b(sb111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111115 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP118 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                    int i21116 = IntercomTheme.$stable;
                    TextKt.b(strP118, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme118.getColors(c1086gP, i21116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme118.getTypography(c1086gP, i21116).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1119);
                c1086gP.T(z1119);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar10;
                lVar4 = lVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue20 = ((Integer) obj3).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                    }
                };
            }
        }
        i27 |= 384;
        answer2 = answer;
        if ((i11 & 8) != 0) {
            i27 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (c1086gP.k(onAnswer)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i27 |= i13;
        }
        if ((i11 & 16) != 0) {
            i27 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c1086gP.K(colors)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i27 |= i14;
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
                    i27 |= i17;
                }
                i18 = 128 & i11;
                if (i18 != 0) {
                    i27 |= 12582912;
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                } else {
                    pVarM447getLambda1$intercom_sdk_base_release = pVar;
                    if ((i10 & 29360128) == 0) {
                        if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i27 |= i19;
                    }
                }
                if ((i27 & 23967451) == 4793490) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar10 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar11 = hVar2;
                    androidx.compose.ui.h hVarA8 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar10), new J((A) objF2, 2, aVar10));
                    androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                    androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarA8);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar1112 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar1112, c1086gP, eD8);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1113 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar1113, c1086gP, interfaceC1089h0P112);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar1114 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar1114, c1086gP, hVarC112);
                        C0953m c0953mA15 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                        androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar1112, c1086gP, c0953mA15);
                        R0.a(pVar1113, c1086gP, interfaceC1089h0P113);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar1114, c1086gP, hVarC113);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context119 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context119);
                                localeCompat = UtilsKt.getLocaleCompat(context119);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i21117) {
                                        if ((i21117 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA119 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled119 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z11110 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA119, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled119, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue111116 = characterLimit.intValue();
                                StringBuilder sb111117 = new StringBuilder();
                                sb111117.append(answer4.getLength());
                                sb111117.append('/');
                                sb111117.append(iIntValue111116);
                                TextKt.b(sb111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar111116 = r.f47939a;
                            } else {
                                int iIntValue111117 = characterLimit.intValue();
                                StringBuilder sb111118 = new StringBuilder();
                                sb111118.append(answer4.getLength());
                                sb111118.append('/');
                                sb111118.append(iIntValue111117);
                                TextKt.b(sb111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar111117 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP119 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                                int i21117 = IntercomTheme.$stable;
                                TextKt.b(strP119, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme119.getColors(c1086gP, i21117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme119.getTypography(c1086gP, i21117).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z11110);
                            c1086gP.T(z11110);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar11;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context1110 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context1110);
                            localeCompat = UtilsKt.getLocaleCompat(context1110);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i21118) {
                                    if ((i21118 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA1110 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled1110 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z11111 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1110, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1110, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue111118 = characterLimit.intValue();
                            StringBuilder sb111119 = new StringBuilder();
                            sb111119.append(answer4.getLength());
                            sb111119.append('/');
                            sb111119.append(iIntValue111118);
                            TextKt.b(sb111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111118 = r.f47939a;
                        } else {
                            int iIntValue111119 = characterLimit.intValue();
                            StringBuilder sb1111110 = new StringBuilder();
                            sb1111110.append(answer4.getLength());
                            sb1111110.append('/');
                            sb1111110.append(iIntValue111119);
                            TextKt.b(sb1111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111119 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP1110 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
                            int i21118 = IntercomTheme.$stable;
                            TextKt.b(strP1110, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1110.getColors(c1086gP, i21118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1110.getTypography(c1086gP, i21118).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z11111);
                        c1086gP.T(z11111);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar11;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar1115 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar1115, c1086gP, hVarC112);
                    C0953m c0953mA16 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar1112, c1086gP, c0953mA16);
                    R0.a(pVar1113, c1086gP, interfaceC1089h0P114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar1115, c1086gP, hVarC114);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context1111 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context1111);
                            localeCompat = UtilsKt.getLocaleCompat(context1111);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i21119) {
                                    if ((i21119 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA1111 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled1111 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z11112 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1111, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1111, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1111110 = characterLimit.intValue();
                            StringBuilder sb1111111 = new StringBuilder();
                            sb1111111.append(answer4.getLength());
                            sb1111111.append('/');
                            sb1111111.append(iIntValue1111110);
                            TextKt.b(sb1111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111110 = r.f47939a;
                        } else {
                            int iIntValue1111111 = characterLimit.intValue();
                            StringBuilder sb1111112 = new StringBuilder();
                            sb1111112.append(answer4.getLength());
                            sb1111112.append('/');
                            sb1111112.append(iIntValue1111111);
                            TextKt.b(sb1111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111111 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP1111 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme1111 = IntercomTheme.INSTANCE;
                            int i21119 = IntercomTheme.$stable;
                            TextKt.b(strP1111, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1111.getColors(c1086gP, i21119).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1111.getTypography(c1086gP, i21119).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z11112);
                        c1086gP.T(z11112);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar11;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context1112 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context1112);
                        localeCompat = UtilsKt.getLocaleCompat(context1112);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i211110) {
                                if ((i211110 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA1112 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled1112 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z11113 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1112, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1112, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1111112 = characterLimit.intValue();
                        StringBuilder sb1111113 = new StringBuilder();
                        sb1111113.append(answer4.getLength());
                        sb1111113.append('/');
                        sb1111113.append(iIntValue1111112);
                        TextKt.b(sb1111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111112 = r.f47939a;
                    } else {
                        int iIntValue1111113 = characterLimit.intValue();
                        StringBuilder sb1111114 = new StringBuilder();
                        sb1111114.append(answer4.getLength());
                        sb1111114.append('/');
                        sb1111114.append(iIntValue1111113);
                        TextKt.b(sb1111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP1112 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme1112 = IntercomTheme.INSTANCE;
                        int i211110 = IntercomTheme.$stable;
                        TextKt.b(strP1112, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1112.getColors(c1086gP, i211110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1112.getTypography(c1086gP, i211110).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z11113);
                    c1086gP.T(z11113);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar11;
                    lVar4 = lVar3;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i26 != 0) {
                        hVar2 = aVar;
                    }
                    if (i28 != 0) {
                        answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                    }
                    if (i16 != 0) {
                        t8 = new T(2);
                    } else {
                        t8 = lVar2;
                    }
                    if (i18 != 0) {
                        pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                    }
                    c1086gP.L(-1483108825);
                    objF = c1086gP.f();
                    obj = InterfaceC1084f.a.f12980a;
                    if (objF == obj) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    androidx.compose.foundation.relocation.a aVar11 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == obj) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    androidx.compose.ui.h hVar12 = hVar2;
                    androidx.compose.ui.h hVarA9 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar11), new J((A) objF2, 2, aVar11));
                    androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i20 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarA9);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar1116 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar1116, c1086gP, eD9);
                    p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1117 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar1117, c1086gP, interfaceC1089h0P115);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        lVar3 = t8;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                        }
                        p<ComposeUiNode, androidx.compose.ui.h, r> pVar1118 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar1118, c1086gP, hVarC115);
                        C0953m c0953mA17 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                        i21 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                        androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, aVar);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar1116, c1086gP, c0953mA17);
                        R0.a(pVar1117, c1086gP, interfaceC1089h0P116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        } else {
                            J4.i.d(i21, c1086gP, i21, pVar2);
                        }
                        R0.a(pVar1118, c1086gP, hVarC116);
                        pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                        Lb.a.a(c1086gP, W.e(aVar, 8));
                        i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                        if (i22 != 1) {
                            if (i22 != 2) {
                                i23 = 4;
                                i24 = 6;
                            } else if (i22 != 3) {
                                i23 = 4;
                                if (i22 != 4) {
                                    i24 = 1;
                                }
                            } else {
                                i23 = 4;
                                i24 = 4;
                            }
                            if (answer2 instanceof Answer.SingleAnswer) {
                                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                            } else {
                                answer3 = "";
                            }
                            c1086gP.L(1720968786);
                            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                            } else {
                                placeholder = textQuestionModel.getPlaceholder();
                            }
                            c1086gP.T(false);
                            c1086gP.L(1720978057);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                                Context context1113 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                                PhoneNumberValidator.loadCountryAreaCodes(context1113);
                                localeCompat = UtilsKt.getLocaleCompat(context1113);
                                if (answer2 instanceof Answer.NoAnswer) {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                                } else {
                                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                                }
                                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                                }
                                str = answer3;
                                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        invoke(interfaceC1084f2, num.intValue());
                                        return r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i211111) {
                                        if ((i211111 & 11) == 2 && interfaceC1084f2.s()) {
                                            interfaceC1084f2.w();
                                            return;
                                        }
                                        String emoji = countryAreaCodeFromLocale.getEmoji();
                                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                    }
                                }, c1086gP);
                                str2 = "+1 123 456 7890";
                            } else {
                                str = answer3;
                                str2 = placeholder;
                                composableLambdaImplB = null;
                            }
                            c1086gP.T(false);
                            if (validationError instanceof ValidationError.ValidationStringError) {
                                h8 = null;
                            } else {
                                h8 = null;
                            }
                            long jM661getAccessibleColorOnWhiteBackground8_81llA1113 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                            if (textQuestionModel.getEnabled()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            boolean enabled1113 = textQuestionModel.getEnabled();
                            c1086gP.L(1721011229);
                            if ((i27 & 7168) == 2048) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objF3 = c1086gP.f();
                            if (z11) {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            } else {
                                i25 = 1;
                                objF3 = new C1530i0(i25, onAnswer);
                                c1086gP.E(objF3);
                            }
                            c1086gP.T(false);
                            answer4 = answer2;
                            boolean z11114 = i25;
                            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1113, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1113, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                            validationType = textQuestionModel.getValidationType();
                            c1086gP.L(1721048023);
                            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                                int iIntValue1111114 = characterLimit.intValue();
                                StringBuilder sb1111115 = new StringBuilder();
                                sb1111115.append(answer4.getLength());
                                sb1111115.append('/');
                                sb1111115.append(iIntValue1111114);
                                TextKt.b(sb1111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar1111114 = r.f47939a;
                            } else {
                                int iIntValue1111115 = characterLimit.intValue();
                                StringBuilder sb1111116 = new StringBuilder();
                                sb1111116.append(answer4.getLength());
                                sb1111116.append('/');
                                sb1111116.append(iIntValue1111115);
                                TextKt.b(sb1111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                                r rVar1111115 = r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(1721067384);
                            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                                String strP1113 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                                IntercomTheme intercomTheme1113 = IntercomTheme.INSTANCE;
                                int i211111 = IntercomTheme.$stable;
                                TextKt.b(strP1113, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1113.getColors(c1086gP, i211111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1113.getTypography(c1086gP, i211111).getType04(), c1086gP, 48, 0, 65528);
                            }
                            c1086gP.T(false);
                            c1086gP.T(z11114);
                            c1086gP.T(z11114);
                            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                            answer5 = answer4;
                            hVar3 = hVar12;
                            lVar4 = lVar3;
                        } else {
                            i23 = 4;
                        }
                        i24 = 3;
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context1114 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context1114);
                            localeCompat = UtilsKt.getLocaleCompat(context1114);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i211112) {
                                    if ((i211112 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA1114 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled1114 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z11115 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1114, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1114, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1111116 = characterLimit.intValue();
                            StringBuilder sb1111117 = new StringBuilder();
                            sb1111117.append(answer4.getLength());
                            sb1111117.append('/');
                            sb1111117.append(iIntValue1111116);
                            TextKt.b(sb1111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111116 = r.f47939a;
                        } else {
                            int iIntValue1111117 = characterLimit.intValue();
                            StringBuilder sb1111118 = new StringBuilder();
                            sb1111118.append(answer4.getLength());
                            sb1111118.append('/');
                            sb1111118.append(iIntValue1111117);
                            TextKt.b(sb1111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111117 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP1114 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme1114 = IntercomTheme.INSTANCE;
                            int i211112 = IntercomTheme.$stable;
                            TextKt.b(strP1114, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1114.getColors(c1086gP, i211112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1114.getTypography(c1086gP, i211112).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z11115);
                        c1086gP.T(z11115);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar12;
                        lVar4 = lVar3;
                    } else {
                        lVar3 = t8;
                    }
                    J4.i.d(i20, c1086gP, i20, pVar2);
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar1119 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar1119, c1086gP, hVarC115);
                    C0953m c0953mA18 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                    androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar1116, c1086gP, c0953mA18);
                    R0.a(pVar1117, c1086gP, interfaceC1089h0P117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar1119, c1086gP, hVarC117);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context1115 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context1115);
                            localeCompat = UtilsKt.getLocaleCompat(context1115);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i211113) {
                                    if ((i211113 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA1115 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled1115 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z11116 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1115, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1115, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1111118 = characterLimit.intValue();
                            StringBuilder sb1111119 = new StringBuilder();
                            sb1111119.append(answer4.getLength());
                            sb1111119.append('/');
                            sb1111119.append(iIntValue1111118);
                            TextKt.b(sb1111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111118 = r.f47939a;
                        } else {
                            int iIntValue1111119 = characterLimit.intValue();
                            StringBuilder sb11111110 = new StringBuilder();
                            sb11111110.append(answer4.getLength());
                            sb11111110.append('/');
                            sb11111110.append(iIntValue1111119);
                            TextKt.b(sb11111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111119 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP1115 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme1115 = IntercomTheme.INSTANCE;
                            int i211113 = IntercomTheme.$stable;
                            TextKt.b(strP1115, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1115.getColors(c1086gP, i211113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1115.getTypography(c1086gP, i211113).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z11116);
                        c1086gP.T(z11116);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar12;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context1116 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context1116);
                        localeCompat = UtilsKt.getLocaleCompat(context1116);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i211114) {
                                if ((i211114 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA1116 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled1116 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z11117 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1116, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1116, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11111110 = characterLimit.intValue();
                        StringBuilder sb11111111 = new StringBuilder();
                        sb11111111.append(answer4.getLength());
                        sb11111111.append('/');
                        sb11111111.append(iIntValue11111110);
                        TextKt.b(sb11111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111110 = r.f47939a;
                    } else {
                        int iIntValue11111111 = characterLimit.intValue();
                        StringBuilder sb11111112 = new StringBuilder();
                        sb11111112.append(answer4.getLength());
                        sb11111112.append('/');
                        sb11111112.append(iIntValue11111111);
                        TextKt.b(sb11111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111111 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP1116 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme1116 = IntercomTheme.INSTANCE;
                        int i211114 = IntercomTheme.$stable;
                        TextKt.b(strP1116, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1116.getColors(c1086gP, i211114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1116.getTypography(c1086gP, i211114).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z11117);
                    c1086gP.T(z11117);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar12;
                    lVar4 = lVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                        @Override // Ia.p
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue20 = ((Integer) obj3).intValue();
                            return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                        }
                    };
                }
            }
            i27 |= 1572864;
            lVar2 = lVar;
            i18 = 128 & i11;
            if (i18 != 0) {
                i27 |= 12582912;
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
            } else {
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i27 |= i19;
                }
            }
            if ((i27 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar12 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar13 = hVar2;
                androidx.compose.ui.h hVarA10 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar12), new J((A) objF2, 2, aVar12));
                androidx.compose.ui.layout.E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarA10);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar11110 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar11110, c1086gP, eD10);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11111 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar11111, c1086gP, interfaceC1089h0P118);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar11112 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar11112, c1086gP, hVarC118);
                    C0953m c0953mA19 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                    androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11110, c1086gP, c0953mA19);
                    R0.a(pVar11111, c1086gP, interfaceC1089h0P119);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar11112, c1086gP, hVarC119);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context1117 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context1117);
                            localeCompat = UtilsKt.getLocaleCompat(context1117);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i211115) {
                                    if ((i211115 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA1117 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled1117 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z11118 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1117, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1117, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue11111112 = characterLimit.intValue();
                            StringBuilder sb11111113 = new StringBuilder();
                            sb11111113.append(answer4.getLength());
                            sb11111113.append('/');
                            sb11111113.append(iIntValue11111112);
                            TextKt.b(sb11111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11111112 = r.f47939a;
                        } else {
                            int iIntValue11111113 = characterLimit.intValue();
                            StringBuilder sb11111114 = new StringBuilder();
                            sb11111114.append(answer4.getLength());
                            sb11111114.append('/');
                            sb11111114.append(iIntValue11111113);
                            TextKt.b(sb11111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar11111113 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP1117 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme1117 = IntercomTheme.INSTANCE;
                            int i211115 = IntercomTheme.$stable;
                            TextKt.b(strP1117, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1117.getColors(c1086gP, i211115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1117.getTypography(c1086gP, i211115).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z11118);
                        c1086gP.T(z11118);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar13;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context1118 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context1118);
                        localeCompat = UtilsKt.getLocaleCompat(context1118);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i211116) {
                                if ((i211116 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA1118 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled1118 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z11119 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1118, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1118, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11111114 = characterLimit.intValue();
                        StringBuilder sb11111115 = new StringBuilder();
                        sb11111115.append(answer4.getLength());
                        sb11111115.append('/');
                        sb11111115.append(iIntValue11111114);
                        TextKt.b(sb11111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111114 = r.f47939a;
                    } else {
                        int iIntValue11111115 = characterLimit.intValue();
                        StringBuilder sb11111116 = new StringBuilder();
                        sb11111116.append(answer4.getLength());
                        sb11111116.append('/');
                        sb11111116.append(iIntValue11111115);
                        TextKt.b(sb11111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111115 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP1118 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme1118 = IntercomTheme.INSTANCE;
                        int i211116 = IntercomTheme.$stable;
                        TextKt.b(strP1118, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1118.getColors(c1086gP, i211116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1118.getTypography(c1086gP, i211116).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z11119);
                    c1086gP.T(z11119);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar13;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar11113 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar11113, c1086gP, hVarC118);
                C0953m c0953mA110 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar11110, c1086gP, c0953mA110);
                R0.a(pVar11111, c1086gP, interfaceC1089h0P1110);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar11113, c1086gP, hVarC1110);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context1119 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context1119);
                        localeCompat = UtilsKt.getLocaleCompat(context1119);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i211117) {
                                if ((i211117 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA1119 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled1119 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z111110 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1119, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1119, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11111116 = characterLimit.intValue();
                        StringBuilder sb11111117 = new StringBuilder();
                        sb11111117.append(answer4.getLength());
                        sb11111117.append('/');
                        sb11111117.append(iIntValue11111116);
                        TextKt.b(sb11111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111116 = r.f47939a;
                    } else {
                        int iIntValue11111117 = characterLimit.intValue();
                        StringBuilder sb11111118 = new StringBuilder();
                        sb11111118.append(answer4.getLength());
                        sb11111118.append('/');
                        sb11111118.append(iIntValue11111117);
                        TextKt.b(sb11111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111117 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP1119 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme1119 = IntercomTheme.INSTANCE;
                        int i211117 = IntercomTheme.$stable;
                        TextKt.b(strP1119, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1119.getColors(c1086gP, i211117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1119.getTypography(c1086gP, i211117).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z111110);
                    c1086gP.T(z111110);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar13;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context11110 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context11110);
                    localeCompat = UtilsKt.getLocaleCompat(context11110);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i211118) {
                            if ((i211118 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA11110 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled11110 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z111111 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11110, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11110, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue11111118 = characterLimit.intValue();
                    StringBuilder sb11111119 = new StringBuilder();
                    sb11111119.append(answer4.getLength());
                    sb11111119.append('/');
                    sb11111119.append(iIntValue11111118);
                    TextKt.b(sb11111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111118 = r.f47939a;
                } else {
                    int iIntValue11111119 = characterLimit.intValue();
                    StringBuilder sb111111110 = new StringBuilder();
                    sb111111110.append(answer4.getLength());
                    sb111111110.append('/');
                    sb111111110.append(iIntValue11111119);
                    TextKt.b(sb111111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111119 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP11110 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme11110 = IntercomTheme.INSTANCE;
                    int i211118 = IntercomTheme.$stable;
                    TextKt.b(strP11110, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11110.getColors(c1086gP, i211118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11110.getTypography(c1086gP, i211118).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z111111);
                c1086gP.T(z111111);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar13;
                lVar4 = lVar3;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar13 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar14 = hVar2;
                androidx.compose.ui.h hVarA11 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar13), new J((A) objF2, 2, aVar13));
                androidx.compose.ui.layout.E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
                androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarA11);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar11114 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar11114, c1086gP, eD11);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11115 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar11115, c1086gP, interfaceC1089h0P1111);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar11116 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar11116, c1086gP, hVarC1111);
                    C0953m c0953mA111 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1112 = c1086gP.P();
                    androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11114, c1086gP, c0953mA111);
                    R0.a(pVar11115, c1086gP, interfaceC1089h0P1112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar11116, c1086gP, hVarC1112);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context11111 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context11111);
                            localeCompat = UtilsKt.getLocaleCompat(context11111);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i211119) {
                                    if ((i211119 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA11111 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled11111 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z111112 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11111, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11111, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue111111110 = characterLimit.intValue();
                            StringBuilder sb111111111 = new StringBuilder();
                            sb111111111.append(answer4.getLength());
                            sb111111111.append('/');
                            sb111111111.append(iIntValue111111110);
                            TextKt.b(sb111111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111111110 = r.f47939a;
                        } else {
                            int iIntValue111111111 = characterLimit.intValue();
                            StringBuilder sb111111112 = new StringBuilder();
                            sb111111112.append(answer4.getLength());
                            sb111111112.append('/');
                            sb111111112.append(iIntValue111111111);
                            TextKt.b(sb111111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111111111 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP11111 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme11111 = IntercomTheme.INSTANCE;
                            int i211119 = IntercomTheme.$stable;
                            TextKt.b(strP11111, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11111.getColors(c1086gP, i211119).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11111.getTypography(c1086gP, i211119).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z111112);
                        c1086gP.T(z111112);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar14;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context11112 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context11112);
                        localeCompat = UtilsKt.getLocaleCompat(context11112);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111110) {
                                if ((i2111110 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA11112 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled11112 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z111113 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11112, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11112, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue111111112 = characterLimit.intValue();
                        StringBuilder sb111111113 = new StringBuilder();
                        sb111111113.append(answer4.getLength());
                        sb111111113.append('/');
                        sb111111113.append(iIntValue111111112);
                        TextKt.b(sb111111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111112 = r.f47939a;
                    } else {
                        int iIntValue111111113 = characterLimit.intValue();
                        StringBuilder sb111111114 = new StringBuilder();
                        sb111111114.append(answer4.getLength());
                        sb111111114.append('/');
                        sb111111114.append(iIntValue111111113);
                        TextKt.b(sb111111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP11112 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme11112 = IntercomTheme.INSTANCE;
                        int i2111110 = IntercomTheme.$stable;
                        TextKt.b(strP11112, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11112.getColors(c1086gP, i2111110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11112.getTypography(c1086gP, i2111110).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z111113);
                    c1086gP.T(z111113);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar14;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar11117 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar11117, c1086gP, hVarC1111);
                C0953m c0953mA112 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1113 = c1086gP.P();
                androidx.compose.ui.h hVarC1113 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar11114, c1086gP, c0953mA112);
                R0.a(pVar11115, c1086gP, interfaceC1089h0P1113);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar11117, c1086gP, hVarC1113);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context11113 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context11113);
                        localeCompat = UtilsKt.getLocaleCompat(context11113);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111111) {
                                if ((i2111111 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA11113 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled11113 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z111114 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11113, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11113, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue111111114 = characterLimit.intValue();
                        StringBuilder sb111111115 = new StringBuilder();
                        sb111111115.append(answer4.getLength());
                        sb111111115.append('/');
                        sb111111115.append(iIntValue111111114);
                        TextKt.b(sb111111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111114 = r.f47939a;
                    } else {
                        int iIntValue111111115 = characterLimit.intValue();
                        StringBuilder sb111111116 = new StringBuilder();
                        sb111111116.append(answer4.getLength());
                        sb111111116.append('/');
                        sb111111116.append(iIntValue111111115);
                        TextKt.b(sb111111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111115 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP11113 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme11113 = IntercomTheme.INSTANCE;
                        int i2111111 = IntercomTheme.$stable;
                        TextKt.b(strP11113, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11113.getColors(c1086gP, i2111111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11113.getTypography(c1086gP, i2111111).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z111114);
                    c1086gP.T(z111114);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar14;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context11114 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context11114);
                    localeCompat = UtilsKt.getLocaleCompat(context11114);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111112) {
                            if ((i2111112 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA11114 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled11114 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z111115 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11114, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11114, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue111111116 = characterLimit.intValue();
                    StringBuilder sb111111117 = new StringBuilder();
                    sb111111117.append(answer4.getLength());
                    sb111111117.append('/');
                    sb111111117.append(iIntValue111111116);
                    TextKt.b(sb111111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111116 = r.f47939a;
                } else {
                    int iIntValue111111117 = characterLimit.intValue();
                    StringBuilder sb111111118 = new StringBuilder();
                    sb111111118.append(answer4.getLength());
                    sb111111118.append('/');
                    sb111111118.append(iIntValue111111117);
                    TextKt.b(sb111111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111117 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP11114 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme11114 = IntercomTheme.INSTANCE;
                    int i2111112 = IntercomTheme.$stable;
                    TextKt.b(strP11114, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11114.getColors(c1086gP, i2111112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11114.getTypography(c1086gP, i2111112).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z111115);
                c1086gP.T(z111115);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar14;
                lVar4 = lVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue20 = ((Integer) obj3).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                    }
                };
            }
        }
        i15 = 196608;
        i27 |= i15;
        i16 = i11 & 64;
        if (i16 != 0) {
            if ((3670016 & i10) == 0) {
                lVar2 = lVar;
                if (c1086gP.k(lVar2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i27 |= i17;
            }
            i18 = 128 & i11;
            if (i18 != 0) {
                i27 |= 12582912;
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
            } else {
                pVarM447getLambda1$intercom_sdk_base_release = pVar;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i27 |= i19;
                }
            }
            if ((i27 & 23967451) == 4793490) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar14 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar15 = hVar2;
                androidx.compose.ui.h hVarA12 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar14), new J((A) objF2, 2, aVar14));
                androidx.compose.ui.layout.E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1114 = c1086gP.P();
                androidx.compose.ui.h hVarC1114 = ComposedModifierKt.c(c1086gP, hVarA12);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar11118 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar11118, c1086gP, eD12);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar11119 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar11119, c1086gP, interfaceC1089h0P1114);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar111110 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar111110, c1086gP, hVarC1114);
                    C0953m c0953mA113 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1115 = c1086gP.P();
                    androidx.compose.ui.h hVarC1115 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11118, c1086gP, c0953mA113);
                    R0.a(pVar11119, c1086gP, interfaceC1089h0P1115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar111110, c1086gP, hVarC1115);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context11115 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context11115);
                            localeCompat = UtilsKt.getLocaleCompat(context11115);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111113) {
                                    if ((i2111113 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA11115 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled11115 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z111116 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11115, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11115, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue111111118 = characterLimit.intValue();
                            StringBuilder sb111111119 = new StringBuilder();
                            sb111111119.append(answer4.getLength());
                            sb111111119.append('/');
                            sb111111119.append(iIntValue111111118);
                            TextKt.b(sb111111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111111118 = r.f47939a;
                        } else {
                            int iIntValue111111119 = characterLimit.intValue();
                            StringBuilder sb1111111110 = new StringBuilder();
                            sb1111111110.append(answer4.getLength());
                            sb1111111110.append('/');
                            sb1111111110.append(iIntValue111111119);
                            TextKt.b(sb1111111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar111111119 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP11115 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme11115 = IntercomTheme.INSTANCE;
                            int i2111113 = IntercomTheme.$stable;
                            TextKt.b(strP11115, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11115.getColors(c1086gP, i2111113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11115.getTypography(c1086gP, i2111113).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z111116);
                        c1086gP.T(z111116);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar15;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context11116 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context11116);
                        localeCompat = UtilsKt.getLocaleCompat(context11116);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111114) {
                                if ((i2111114 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA11116 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled11116 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z111117 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11116, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11116, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1111111110 = characterLimit.intValue();
                        StringBuilder sb1111111111 = new StringBuilder();
                        sb1111111111.append(answer4.getLength());
                        sb1111111111.append('/');
                        sb1111111111.append(iIntValue1111111110);
                        TextKt.b(sb1111111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111110 = r.f47939a;
                    } else {
                        int iIntValue1111111111 = characterLimit.intValue();
                        StringBuilder sb1111111112 = new StringBuilder();
                        sb1111111112.append(answer4.getLength());
                        sb1111111112.append('/');
                        sb1111111112.append(iIntValue1111111111);
                        TextKt.b(sb1111111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111111 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP11116 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme11116 = IntercomTheme.INSTANCE;
                        int i2111114 = IntercomTheme.$stable;
                        TextKt.b(strP11116, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11116.getColors(c1086gP, i2111114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11116.getTypography(c1086gP, i2111114).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z111117);
                    c1086gP.T(z111117);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar15;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar111111 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar111111, c1086gP, hVarC1114);
                C0953m c0953mA114 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1116 = c1086gP.P();
                androidx.compose.ui.h hVarC1116 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar11118, c1086gP, c0953mA114);
                R0.a(pVar11119, c1086gP, interfaceC1089h0P1116);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar111111, c1086gP, hVarC1116);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context11117 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context11117);
                        localeCompat = UtilsKt.getLocaleCompat(context11117);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111115) {
                                if ((i2111115 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA11117 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled11117 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z111118 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11117, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11117, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1111111112 = characterLimit.intValue();
                        StringBuilder sb1111111113 = new StringBuilder();
                        sb1111111113.append(answer4.getLength());
                        sb1111111113.append('/');
                        sb1111111113.append(iIntValue1111111112);
                        TextKt.b(sb1111111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111112 = r.f47939a;
                    } else {
                        int iIntValue1111111113 = characterLimit.intValue();
                        StringBuilder sb1111111114 = new StringBuilder();
                        sb1111111114.append(answer4.getLength());
                        sb1111111114.append('/');
                        sb1111111114.append(iIntValue1111111113);
                        TextKt.b(sb1111111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP11117 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme11117 = IntercomTheme.INSTANCE;
                        int i2111115 = IntercomTheme.$stable;
                        TextKt.b(strP11117, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11117.getColors(c1086gP, i2111115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11117.getTypography(c1086gP, i2111115).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z111118);
                    c1086gP.T(z111118);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar15;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context11118 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context11118);
                    localeCompat = UtilsKt.getLocaleCompat(context11118);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111116) {
                            if ((i2111116 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA11118 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled11118 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z111119 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11118, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11118, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue1111111114 = characterLimit.intValue();
                    StringBuilder sb1111111115 = new StringBuilder();
                    sb1111111115.append(answer4.getLength());
                    sb1111111115.append('/');
                    sb1111111115.append(iIntValue1111111114);
                    TextKt.b(sb1111111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar1111111114 = r.f47939a;
                } else {
                    int iIntValue1111111115 = characterLimit.intValue();
                    StringBuilder sb1111111116 = new StringBuilder();
                    sb1111111116.append(answer4.getLength());
                    sb1111111116.append('/');
                    sb1111111116.append(iIntValue1111111115);
                    TextKt.b(sb1111111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar1111111115 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP11118 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme11118 = IntercomTheme.INSTANCE;
                    int i2111116 = IntercomTheme.$stable;
                    TextKt.b(strP11118, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11118.getColors(c1086gP, i2111116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11118.getTypography(c1086gP, i2111116).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z111119);
                c1086gP.T(z111119);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar15;
                lVar4 = lVar3;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i26 != 0) {
                    hVar2 = aVar;
                }
                if (i28 != 0) {
                    answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
                }
                if (i16 != 0) {
                    t8 = new T(2);
                } else {
                    t8 = lVar2;
                }
                if (i18 != 0) {
                    pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
                }
                c1086gP.L(-1483108825);
                objF = c1086gP.f();
                obj = InterfaceC1084f.a.f12980a;
                if (objF == obj) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                androidx.compose.foundation.relocation.a aVar15 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == obj) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                androidx.compose.ui.h hVar16 = hVar2;
                androidx.compose.ui.h hVarA13 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar15), new J((A) objF2, 2, aVar15));
                androidx.compose.ui.layout.E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1117 = c1086gP.P();
                androidx.compose.ui.h hVarC1117 = ComposedModifierKt.c(c1086gP, hVarA13);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar111112 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar111112, c1086gP, eD13);
                p<ComposeUiNode, androidx.compose.runtime.r, r> pVar111113 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar111113, c1086gP, interfaceC1089h0P1117);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    lVar3 = t8;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    }
                    p<ComposeUiNode, androidx.compose.ui.h, r> pVar111114 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar111114, c1086gP, hVarC1117);
                    C0953m c0953mA115 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                    i21 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1118 = c1086gP.P();
                    androidx.compose.ui.h hVarC1118 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar111112, c1086gP, c0953mA115);
                    R0.a(pVar111113, c1086gP, interfaceC1089h0P1118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    } else {
                        J4.i.d(i21, c1086gP, i21, pVar2);
                    }
                    R0.a(pVar111114, c1086gP, hVarC1118);
                    pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                    Lb.a.a(c1086gP, W.e(aVar, 8));
                    i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                    if (i22 != 1) {
                        if (i22 != 2) {
                            i23 = 4;
                            i24 = 6;
                        } else if (i22 != 3) {
                            i23 = 4;
                            if (i22 != 4) {
                                i24 = 1;
                            }
                        } else {
                            i23 = 4;
                            i24 = 4;
                        }
                        if (answer2 instanceof Answer.SingleAnswer) {
                            answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                        } else {
                            answer3 = "";
                        }
                        c1086gP.L(1720968786);
                        if (textQuestionModel.getPlaceHolderStringRes() != null) {
                            placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                        } else {
                            placeholder = textQuestionModel.getPlaceholder();
                        }
                        c1086gP.T(false);
                        c1086gP.L(1720978057);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                            Context context11119 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                            PhoneNumberValidator.loadCountryAreaCodes(context11119);
                            localeCompat = UtilsKt.getLocaleCompat(context11119);
                            if (answer2 instanceof Answer.NoAnswer) {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                            } else {
                                countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                            }
                            if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                                answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                            }
                            str = answer3;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111117) {
                                    if ((i2111117 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                        return;
                                    }
                                    String emoji = countryAreaCodeFromLocale.getEmoji();
                                    kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                    TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                                }
                            }, c1086gP);
                            str2 = "+1 123 456 7890";
                        } else {
                            str = answer3;
                            str2 = placeholder;
                            composableLambdaImplB = null;
                        }
                        c1086gP.T(false);
                        if (validationError instanceof ValidationError.ValidationStringError) {
                            h8 = null;
                        } else {
                            h8 = null;
                        }
                        long jM661getAccessibleColorOnWhiteBackground8_81llA11119 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                        if (textQuestionModel.getEnabled()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        boolean enabled11119 = textQuestionModel.getEnabled();
                        c1086gP.L(1721011229);
                        if ((i27 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objF3 = c1086gP.f();
                        if (z11) {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        } else {
                            i25 = 1;
                            objF3 = new C1530i0(i25, onAnswer);
                            c1086gP.E(objF3);
                        }
                        c1086gP.T(false);
                        answer4 = answer2;
                        boolean z1111110 = i25;
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA11119, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled11119, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                        validationType = textQuestionModel.getValidationType();
                        c1086gP.L(1721048023);
                        if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                            int iIntValue1111111116 = characterLimit.intValue();
                            StringBuilder sb1111111117 = new StringBuilder();
                            sb1111111117.append(answer4.getLength());
                            sb1111111117.append('/');
                            sb1111111117.append(iIntValue1111111116);
                            TextKt.b(sb1111111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111111116 = r.f47939a;
                        } else {
                            int iIntValue1111111117 = characterLimit.intValue();
                            StringBuilder sb1111111118 = new StringBuilder();
                            sb1111111118.append(answer4.getLength());
                            sb1111111118.append('/');
                            sb1111111118.append(iIntValue1111111117);
                            TextKt.b(sb1111111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                            r rVar1111111117 = r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(1721067384);
                        if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                            String strP11119 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                            IntercomTheme intercomTheme11119 = IntercomTheme.INSTANCE;
                            int i2111117 = IntercomTheme.$stable;
                            TextKt.b(strP11119, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme11119.getColors(c1086gP, i2111117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11119.getTypography(c1086gP, i2111117).getType04(), c1086gP, 48, 0, 65528);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z1111110);
                        c1086gP.T(z1111110);
                        pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                        answer5 = answer4;
                        hVar3 = hVar16;
                        lVar4 = lVar3;
                    } else {
                        i23 = 4;
                    }
                    i24 = 3;
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context111110 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context111110);
                        localeCompat = UtilsKt.getLocaleCompat(context111110);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111118) {
                                if ((i2111118 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA111110 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled111110 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1111111 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111110, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111110, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue1111111118 = characterLimit.intValue();
                        StringBuilder sb1111111119 = new StringBuilder();
                        sb1111111119.append(answer4.getLength());
                        sb1111111119.append('/');
                        sb1111111119.append(iIntValue1111111118);
                        TextKt.b(sb1111111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111118 = r.f47939a;
                    } else {
                        int iIntValue1111111119 = characterLimit.intValue();
                        StringBuilder sb11111111110 = new StringBuilder();
                        sb11111111110.append(answer4.getLength());
                        sb11111111110.append('/');
                        sb11111111110.append(iIntValue1111111119);
                        TextKt.b(sb11111111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar1111111119 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP111110 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme111110 = IntercomTheme.INSTANCE;
                        int i2111118 = IntercomTheme.$stable;
                        TextKt.b(strP111110, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111110.getColors(c1086gP, i2111118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111110.getTypography(c1086gP, i2111118).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1111111);
                    c1086gP.T(z1111111);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar16;
                    lVar4 = lVar3;
                } else {
                    lVar3 = t8;
                }
                J4.i.d(i20, c1086gP, i20, pVar2);
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar111115 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar111115, c1086gP, hVarC1117);
                C0953m c0953mA116 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1119 = c1086gP.P();
                androidx.compose.ui.h hVarC1119 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar111112, c1086gP, c0953mA116);
                R0.a(pVar111113, c1086gP, interfaceC1089h0P1119);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar111115, c1086gP, hVarC1119);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context111111 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context111111);
                        localeCompat = UtilsKt.getLocaleCompat(context111111);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i2111119) {
                                if ((i2111119 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA111111 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled111111 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1111112 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111111, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111111, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11111111110 = characterLimit.intValue();
                        StringBuilder sb11111111111 = new StringBuilder();
                        sb11111111111.append(answer4.getLength());
                        sb11111111111.append('/');
                        sb11111111111.append(iIntValue11111111110);
                        TextKt.b(sb11111111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111111110 = r.f47939a;
                    } else {
                        int iIntValue11111111111 = characterLimit.intValue();
                        StringBuilder sb11111111112 = new StringBuilder();
                        sb11111111112.append(answer4.getLength());
                        sb11111111112.append('/');
                        sb11111111112.append(iIntValue11111111111);
                        TextKt.b(sb11111111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111111111 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP111111 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme111111 = IntercomTheme.INSTANCE;
                        int i2111119 = IntercomTheme.$stable;
                        TextKt.b(strP111111, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111111.getColors(c1086gP, i2111119).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111111.getTypography(c1086gP, i2111119).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1111112);
                    c1086gP.T(z1111112);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar16;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context111112 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context111112);
                    localeCompat = UtilsKt.getLocaleCompat(context111112);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111110) {
                            if ((i21111110 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA111112 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled111112 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1111113 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111112, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111112, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue11111111112 = characterLimit.intValue();
                    StringBuilder sb11111111113 = new StringBuilder();
                    sb11111111113.append(answer4.getLength());
                    sb11111111113.append('/');
                    sb11111111113.append(iIntValue11111111112);
                    TextKt.b(sb11111111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111112 = r.f47939a;
                } else {
                    int iIntValue11111111113 = characterLimit.intValue();
                    StringBuilder sb11111111114 = new StringBuilder();
                    sb11111111114.append(answer4.getLength());
                    sb11111111114.append('/');
                    sb11111111114.append(iIntValue11111111113);
                    TextKt.b(sb11111111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111113 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP111112 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme111112 = IntercomTheme.INSTANCE;
                    int i21111110 = IntercomTheme.$stable;
                    TextKt.b(strP111112, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111112.getColors(c1086gP, i21111110).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111112.getTypography(c1086gP, i21111110).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1111113);
                c1086gP.T(z1111113);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar16;
                lVar4 = lVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                    @Override // Ia.p
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue20 = ((Integer) obj3).intValue();
                        return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                    }
                };
            }
        }
        i27 |= 1572864;
        lVar2 = lVar;
        i18 = 128 & i11;
        if (i18 != 0) {
            i27 |= 12582912;
            pVarM447getLambda1$intercom_sdk_base_release = pVar;
        } else {
            pVarM447getLambda1$intercom_sdk_base_release = pVar;
            if ((i10 & 29360128) == 0) {
                if (c1086gP.k(pVarM447getLambda1$intercom_sdk_base_release)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i27 |= i19;
            }
        }
        if ((i27 & 23967451) == 4793490) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i26 != 0) {
                hVar2 = aVar;
            }
            if (i28 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i16 != 0) {
                t8 = new T(2);
            } else {
                t8 = lVar2;
            }
            if (i18 != 0) {
                pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
            }
            c1086gP.L(-1483108825);
            objF = c1086gP.f();
            obj = InterfaceC1084f.a.f12980a;
            if (objF == obj) {
                objF = new androidx.compose.foundation.relocation.b();
                c1086gP.E(objF);
            }
            androidx.compose.foundation.relocation.a aVar16 = (androidx.compose.foundation.relocation.a) objF;
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == obj) {
                objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF2);
            }
            androidx.compose.ui.h hVar17 = hVar2;
            androidx.compose.ui.h hVarA14 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar16), new J((A) objF2, 2, aVar16));
            androidx.compose.ui.layout.E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11110 = c1086gP.P();
            androidx.compose.ui.h hVarC11110 = ComposedModifierKt.c(c1086gP, hVarA14);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar111116 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar111116, c1086gP, eD14);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar111117 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar111117, c1086gP, interfaceC1089h0P11110);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                lVar3 = t8;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar111118 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar111118, c1086gP, hVarC11110);
                C0953m c0953mA117 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111 = c1086gP.P();
                androidx.compose.ui.h hVarC11111 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar111116, c1086gP, c0953mA117);
                R0.a(pVar111117, c1086gP, interfaceC1089h0P11111);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar111118, c1086gP, hVarC11111);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context111113 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context111113);
                        localeCompat = UtilsKt.getLocaleCompat(context111113);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111111) {
                                if ((i21111111 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA111113 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled111113 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1111114 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111113, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111113, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue11111111114 = characterLimit.intValue();
                        StringBuilder sb11111111115 = new StringBuilder();
                        sb11111111115.append(answer4.getLength());
                        sb11111111115.append('/');
                        sb11111111115.append(iIntValue11111111114);
                        TextKt.b(sb11111111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111111114 = r.f47939a;
                    } else {
                        int iIntValue11111111115 = characterLimit.intValue();
                        StringBuilder sb11111111116 = new StringBuilder();
                        sb11111111116.append(answer4.getLength());
                        sb11111111116.append('/');
                        sb11111111116.append(iIntValue11111111115);
                        TextKt.b(sb11111111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar11111111115 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP111113 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme111113 = IntercomTheme.INSTANCE;
                        int i21111111 = IntercomTheme.$stable;
                        TextKt.b(strP111113, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111113.getColors(c1086gP, i21111111).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111113.getTypography(c1086gP, i21111111).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1111114);
                    c1086gP.T(z1111114);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar17;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context111114 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context111114);
                    localeCompat = UtilsKt.getLocaleCompat(context111114);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111112) {
                            if ((i21111112 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA111114 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled111114 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1111115 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111114, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111114, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue11111111116 = characterLimit.intValue();
                    StringBuilder sb11111111117 = new StringBuilder();
                    sb11111111117.append(answer4.getLength());
                    sb11111111117.append('/');
                    sb11111111117.append(iIntValue11111111116);
                    TextKt.b(sb11111111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111116 = r.f47939a;
                } else {
                    int iIntValue11111111117 = characterLimit.intValue();
                    StringBuilder sb11111111118 = new StringBuilder();
                    sb11111111118.append(answer4.getLength());
                    sb11111111118.append('/');
                    sb11111111118.append(iIntValue11111111117);
                    TextKt.b(sb11111111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111117 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP111114 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme111114 = IntercomTheme.INSTANCE;
                    int i21111112 = IntercomTheme.$stable;
                    TextKt.b(strP111114, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111114.getColors(c1086gP, i21111112).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111114.getTypography(c1086gP, i21111112).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1111115);
                c1086gP.T(z1111115);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar17;
                lVar4 = lVar3;
            } else {
                lVar3 = t8;
            }
            J4.i.d(i20, c1086gP, i20, pVar2);
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar111119 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar111119, c1086gP, hVarC11110);
            C0953m c0953mA118 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11112 = c1086gP.P();
            androidx.compose.ui.h hVarC11112 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar111116, c1086gP, c0953mA118);
            R0.a(pVar111117, c1086gP, interfaceC1089h0P11112);
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar2);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar2);
            }
            R0.a(pVar111119, c1086gP, hVarC11112);
            pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
            if (i22 != 1) {
                if (i22 != 2) {
                    i23 = 4;
                    i24 = 6;
                } else if (i22 != 3) {
                    i23 = 4;
                    if (i22 != 4) {
                        i24 = 1;
                    }
                } else {
                    i23 = 4;
                    i24 = 4;
                }
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context111115 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context111115);
                    localeCompat = UtilsKt.getLocaleCompat(context111115);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111113) {
                            if ((i21111113 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA111115 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled111115 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1111116 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111115, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111115, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue11111111118 = characterLimit.intValue();
                    StringBuilder sb11111111119 = new StringBuilder();
                    sb11111111119.append(answer4.getLength());
                    sb11111111119.append('/');
                    sb11111111119.append(iIntValue11111111118);
                    TextKt.b(sb11111111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111118 = r.f47939a;
                } else {
                    int iIntValue11111111119 = characterLimit.intValue();
                    StringBuilder sb111111111110 = new StringBuilder();
                    sb111111111110.append(answer4.getLength());
                    sb111111111110.append('/');
                    sb111111111110.append(iIntValue11111111119);
                    TextKt.b(sb111111111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar11111111119 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP111115 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme111115 = IntercomTheme.INSTANCE;
                    int i21111113 = IntercomTheme.$stable;
                    TextKt.b(strP111115, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111115.getColors(c1086gP, i21111113).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111115.getTypography(c1086gP, i21111113).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1111116);
                c1086gP.T(z1111116);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar17;
                lVar4 = lVar3;
            } else {
                i23 = 4;
            }
            i24 = 3;
            if (answer2 instanceof Answer.SingleAnswer) {
                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
            } else {
                answer3 = "";
            }
            c1086gP.L(1720968786);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            c1086gP.T(false);
            c1086gP.L(1720978057);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context111116 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                PhoneNumberValidator.loadCountryAreaCodes(context111116);
                localeCompat = UtilsKt.getLocaleCompat(context111116);
                if (answer2 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                }
                str = answer3;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111114) {
                        if ((i21111114 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String emoji = countryAreaCodeFromLocale.getEmoji();
                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                    }
                }, c1086gP);
                str2 = "+1 123 456 7890";
            } else {
                str = answer3;
                str2 = placeholder;
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            if (validationError instanceof ValidationError.ValidationStringError) {
                h8 = null;
            } else {
                h8 = null;
            }
            long jM661getAccessibleColorOnWhiteBackground8_81llA111116 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
            if (textQuestionModel.getEnabled()) {
                z10 = false;
            } else {
                z10 = false;
            }
            boolean enabled111116 = textQuestionModel.getEnabled();
            c1086gP.L(1721011229);
            if ((i27 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF3 = c1086gP.f();
            if (z11) {
                i25 = 1;
                objF3 = new C1530i0(i25, onAnswer);
                c1086gP.E(objF3);
            } else {
                i25 = 1;
                objF3 = new C1530i0(i25, onAnswer);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            answer4 = answer2;
            boolean z1111117 = i25;
            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111116, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111116, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
            validationType = textQuestionModel.getValidationType();
            c1086gP.L(1721048023);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                int iIntValue111111111110 = characterLimit.intValue();
                StringBuilder sb111111111111 = new StringBuilder();
                sb111111111111.append(answer4.getLength());
                sb111111111111.append('/');
                sb111111111111.append(iIntValue111111111110);
                TextKt.b(sb111111111111.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                r rVar111111111110 = r.f47939a;
            } else {
                int iIntValue111111111111 = characterLimit.intValue();
                StringBuilder sb111111111112 = new StringBuilder();
                sb111111111112.append(answer4.getLength());
                sb111111111112.append('/');
                sb111111111112.append(iIntValue111111111111);
                TextKt.b(sb111111111112.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                r rVar111111111111 = r.f47939a;
            }
            c1086gP.T(false);
            c1086gP.L(1721067384);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strP111116 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                IntercomTheme intercomTheme111116 = IntercomTheme.INSTANCE;
                int i21111114 = IntercomTheme.$stable;
                TextKt.b(strP111116, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111116.getColors(c1086gP, i21111114).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111116.getTypography(c1086gP, i21111114).getType04(), c1086gP, 48, 0, 65528);
            }
            c1086gP.T(false);
            c1086gP.T(z1111117);
            c1086gP.T(z1111117);
            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
            answer5 = answer4;
            hVar3 = hVar17;
            lVar4 = lVar3;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i26 != 0) {
                hVar2 = aVar;
            }
            if (i28 != 0) {
                answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
            }
            if (i16 != 0) {
                t8 = new T(2);
            } else {
                t8 = lVar2;
            }
            if (i18 != 0) {
                pVarM447getLambda1$intercom_sdk_base_release = ComposableSingletons$ShortTextQuestionKt.INSTANCE.m447getLambda1$intercom_sdk_base_release();
            }
            c1086gP.L(-1483108825);
            objF = c1086gP.f();
            obj = InterfaceC1084f.a.f12980a;
            if (objF == obj) {
                objF = new androidx.compose.foundation.relocation.b();
                c1086gP.E(objF);
            }
            androidx.compose.foundation.relocation.a aVar17 = (androidx.compose.foundation.relocation.a) objF;
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == obj) {
                objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF2);
            }
            androidx.compose.ui.h hVar18 = hVar2;
            androidx.compose.ui.h hVarA15 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(hVar2, aVar17), new J((A) objF2, 2, aVar17));
            androidx.compose.ui.layout.E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11113 = c1086gP.P();
            androidx.compose.ui.h hVarC11113 = ComposedModifierKt.c(c1086gP, hVarA15);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, androidx.compose.ui.layout.E, r> pVar1111110 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar1111110, c1086gP, eD15);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar1111111 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar1111111, c1086gP, interfaceC1089h0P11113);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                lVar3 = t8;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                }
                p<ComposeUiNode, androidx.compose.ui.h, r> pVar1111112 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1111112, c1086gP, hVarC11113);
                C0953m c0953mA119 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11114 = c1086gP.P();
                androidx.compose.ui.h hVarC11114 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1111110, c1086gP, c0953mA119);
                R0.a(pVar1111111, c1086gP, interfaceC1089h0P11114);
                if (c1086gP.f12995O) {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                } else {
                    J4.i.d(i21, c1086gP, i21, pVar2);
                }
                R0.a(pVar1111112, c1086gP, hVarC11114);
                pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
                Lb.a.a(c1086gP, W.e(aVar, 8));
                i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
                if (i22 != 1) {
                    if (i22 != 2) {
                        i23 = 4;
                        i24 = 6;
                    } else if (i22 != 3) {
                        i23 = 4;
                        if (i22 != 4) {
                            i24 = 1;
                        }
                    } else {
                        i23 = 4;
                        i24 = 4;
                    }
                    if (answer2 instanceof Answer.SingleAnswer) {
                        answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                    } else {
                        answer3 = "";
                    }
                    c1086gP.L(1720968786);
                    if (textQuestionModel.getPlaceHolderStringRes() != null) {
                        placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                    } else {
                        placeholder = textQuestionModel.getPlaceholder();
                    }
                    c1086gP.T(false);
                    c1086gP.L(1720978057);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                        Context context111117 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                        PhoneNumberValidator.loadCountryAreaCodes(context111117);
                        localeCompat = UtilsKt.getLocaleCompat(context111117);
                        if (answer2 instanceof Answer.NoAnswer) {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                        } else {
                            countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                        }
                        if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                            answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                        }
                        str = answer3;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111115) {
                                if ((i21111115 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                String emoji = countryAreaCodeFromLocale.getEmoji();
                                kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                                TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                            }
                        }, c1086gP);
                        str2 = "+1 123 456 7890";
                    } else {
                        str = answer3;
                        str2 = placeholder;
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    if (validationError instanceof ValidationError.ValidationStringError) {
                        h8 = null;
                    } else {
                        h8 = null;
                    }
                    long jM661getAccessibleColorOnWhiteBackground8_81llA111117 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                    if (textQuestionModel.getEnabled()) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    boolean enabled111117 = textQuestionModel.getEnabled();
                    c1086gP.L(1721011229);
                    if ((i27 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objF3 = c1086gP.f();
                    if (z11) {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    } else {
                        i25 = 1;
                        objF3 = new C1530i0(i25, onAnswer);
                        c1086gP.E(objF3);
                    }
                    c1086gP.T(false);
                    answer4 = answer2;
                    boolean z1111118 = i25;
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111117, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111117, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                    validationType = textQuestionModel.getValidationType();
                    c1086gP.L(1721048023);
                    if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                        int iIntValue111111111112 = characterLimit.intValue();
                        StringBuilder sb111111111113 = new StringBuilder();
                        sb111111111113.append(answer4.getLength());
                        sb111111111113.append('/');
                        sb111111111113.append(iIntValue111111111112);
                        TextKt.b(sb111111111113.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111111112 = r.f47939a;
                    } else {
                        int iIntValue111111111113 = characterLimit.intValue();
                        StringBuilder sb111111111114 = new StringBuilder();
                        sb111111111114.append(answer4.getLength());
                        sb111111111114.append('/');
                        sb111111111114.append(iIntValue111111111113);
                        TextKt.b(sb111111111114.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                        r rVar111111111113 = r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1721067384);
                    if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                        String strP111117 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                        IntercomTheme intercomTheme111117 = IntercomTheme.INSTANCE;
                        int i21111115 = IntercomTheme.$stable;
                        TextKt.b(strP111117, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111117.getColors(c1086gP, i21111115).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111117.getTypography(c1086gP, i21111115).getType04(), c1086gP, 48, 0, 65528);
                    }
                    c1086gP.T(false);
                    c1086gP.T(z1111118);
                    c1086gP.T(z1111118);
                    pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                    answer5 = answer4;
                    hVar3 = hVar18;
                    lVar4 = lVar3;
                } else {
                    i23 = 4;
                }
                i24 = 3;
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context111118 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context111118);
                    localeCompat = UtilsKt.getLocaleCompat(context111118);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111116) {
                            if ((i21111116 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA111118 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled111118 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z1111119 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111118, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111118, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue111111111114 = characterLimit.intValue();
                    StringBuilder sb111111111115 = new StringBuilder();
                    sb111111111115.append(answer4.getLength());
                    sb111111111115.append('/');
                    sb111111111115.append(iIntValue111111111114);
                    TextKt.b(sb111111111115.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111111114 = r.f47939a;
                } else {
                    int iIntValue111111111115 = characterLimit.intValue();
                    StringBuilder sb111111111116 = new StringBuilder();
                    sb111111111116.append(answer4.getLength());
                    sb111111111116.append('/');
                    sb111111111116.append(iIntValue111111111115);
                    TextKt.b(sb111111111116.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111111115 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP111118 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme111118 = IntercomTheme.INSTANCE;
                    int i21111116 = IntercomTheme.$stable;
                    TextKt.b(strP111118, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111118.getColors(c1086gP, i21111116).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111118.getTypography(c1086gP, i21111116).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z1111119);
                c1086gP.T(z1111119);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar18;
                lVar4 = lVar3;
            } else {
                lVar3 = t8;
            }
            J4.i.d(i20, c1086gP, i20, pVar2);
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar1111113 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar1111113, c1086gP, hVarC11113);
            C0953m c0953mA1110 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i21 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11115 = c1086gP.P();
            androidx.compose.ui.h hVarC11115 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar1111110, c1086gP, c0953mA1110);
            R0.a(pVar1111111, c1086gP, interfaceC1089h0P11115);
            if (c1086gP.f12995O) {
                J4.i.d(i21, c1086gP, i21, pVar2);
            } else {
                J4.i.d(i21, c1086gP, i21, pVar2);
            }
            R0.a(pVar1111113, c1086gP, hVarC11115);
            pVarM447getLambda1$intercom_sdk_base_release.invoke(c1086gP, Integer.valueOf((i27 >> 21) & 14));
            Lb.a.a(c1086gP, W.e(aVar, 8));
            i22 = WhenMappings.$EnumSwitchMapping$0[textQuestionModel.getValidationType().ordinal()];
            if (i22 != 1) {
                if (i22 != 2) {
                    i23 = 4;
                    i24 = 6;
                } else if (i22 != 3) {
                    i23 = 4;
                    if (i22 != 4) {
                        i24 = 1;
                    }
                } else {
                    i23 = 4;
                    i24 = 4;
                }
                if (answer2 instanceof Answer.SingleAnswer) {
                    answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
                } else {
                    answer3 = "";
                }
                c1086gP.L(1720968786);
                if (textQuestionModel.getPlaceHolderStringRes() != null) {
                    placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
                } else {
                    placeholder = textQuestionModel.getPlaceholder();
                }
                c1086gP.T(false);
                c1086gP.L(1720978057);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                    Context context111119 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    PhoneNumberValidator.loadCountryAreaCodes(context111119);
                    localeCompat = UtilsKt.getLocaleCompat(context111119);
                    if (answer2 instanceof Answer.NoAnswer) {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                    } else {
                        countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                    }
                    if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                        answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                    }
                    str = answer3;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111117) {
                            if ((i21111117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            String emoji = countryAreaCodeFromLocale.getEmoji();
                            kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                            TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                        }
                    }, c1086gP);
                    str2 = "+1 123 456 7890";
                } else {
                    str = answer3;
                    str2 = placeholder;
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                if (validationError instanceof ValidationError.ValidationStringError) {
                    h8 = null;
                } else {
                    h8 = null;
                }
                long jM661getAccessibleColorOnWhiteBackground8_81llA111119 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
                if (textQuestionModel.getEnabled()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                boolean enabled111119 = textQuestionModel.getEnabled();
                c1086gP.L(1721011229);
                if ((i27 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF3 = c1086gP.f();
                if (z11) {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                } else {
                    i25 = 1;
                    objF3 = new C1530i0(i25, onAnswer);
                    c1086gP.E(objF3);
                }
                c1086gP.T(false);
                answer4 = answer2;
                boolean z11111110 = i25;
                TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA111119, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled111119, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
                validationType = textQuestionModel.getValidationType();
                c1086gP.L(1721048023);
                if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                    int iIntValue111111111116 = characterLimit.intValue();
                    StringBuilder sb111111111117 = new StringBuilder();
                    sb111111111117.append(answer4.getLength());
                    sb111111111117.append('/');
                    sb111111111117.append(iIntValue111111111116);
                    TextKt.b(sb111111111117.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111111116 = r.f47939a;
                } else {
                    int iIntValue111111111117 = characterLimit.intValue();
                    StringBuilder sb111111111118 = new StringBuilder();
                    sb111111111118.append(answer4.getLength());
                    sb111111111118.append('/');
                    sb111111111118.append(iIntValue111111111117);
                    TextKt.b(sb111111111118.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                    r rVar111111111117 = r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.L(1721067384);
                if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                    String strP111119 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                    IntercomTheme intercomTheme111119 = IntercomTheme.INSTANCE;
                    int i21111117 = IntercomTheme.$stable;
                    TextKt.b(strP111119, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme111119.getColors(c1086gP, i21111117).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme111119.getTypography(c1086gP, i21111117).getType04(), c1086gP, 48, 0, 65528);
                }
                c1086gP.T(false);
                c1086gP.T(z11111110);
                c1086gP.T(z11111110);
                pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
                answer5 = answer4;
                hVar3 = hVar18;
                lVar4 = lVar3;
            } else {
                i23 = 4;
            }
            i24 = 3;
            if (answer2 instanceof Answer.SingleAnswer) {
                answer3 = ((Answer.SingleAnswer) answer2).getAnswer();
            } else {
                answer3 = "";
            }
            c1086gP.L(1720968786);
            if (textQuestionModel.getPlaceHolderStringRes() != null) {
                placeholder = o.p(c1086gP, textQuestionModel.getPlaceHolderStringRes().intValue());
            } else {
                placeholder = textQuestionModel.getPlaceholder();
            }
            c1086gP.T(false);
            c1086gP.L(1720978057);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE) {
                Context context1111110 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                PhoneNumberValidator.loadCountryAreaCodes(context1111110);
                localeCompat = UtilsKt.getLocaleCompat(context1111110);
                if (answer2 instanceof Answer.NoAnswer) {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromNumber(PhoneNumberValidator.stripPrefix(answer3));
                } else {
                    countryAreaCodeFromLocale = PhoneNumberValidator.getCountryAreaCodeFromLocale(localeCompat.getCountry());
                }
                if (answer2 instanceof Answer.NoAnswer.InitialNoAnswer) {
                    answer3 = "+" + countryAreaCodeFromLocale.getDialCode();
                }
                str = answer3;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(854302399, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.ShortTextQuestionKt$ShortTextQuestion$3$1$1
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i21111118) {
                        if ((i21111118 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        String emoji = countryAreaCodeFromLocale.getEmoji();
                        kotlin.jvm.internal.i.d(emoji, "getEmoji(...)");
                        TextKt.b(emoji, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f2, 0, 0, 131070);
                    }
                }, c1086gP);
                str2 = "+1 123 456 7890";
            } else {
                str = answer3;
                str2 = placeholder;
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            if (validationError instanceof ValidationError.ValidationStringError) {
                h8 = null;
            } else {
                h8 = null;
            }
            long jM661getAccessibleColorOnWhiteBackground8_81llA1111110 = ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(colors.m357getButton0d7_KjU());
            if (textQuestionModel.getEnabled()) {
                z10 = false;
            } else {
                z10 = false;
            }
            boolean enabled1111110 = textQuestionModel.getEnabled();
            c1086gP.L(1721011229);
            if ((i27 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF3 = c1086gP.f();
            if (z11) {
                i25 = 1;
                objF3 = new C1530i0(i25, onAnswer);
                c1086gP.E(objF3);
            } else {
                i25 = 1;
                objF3 = new C1530i0(i25, onAnswer);
                c1086gP.E(objF3);
            }
            c1086gP.T(false);
            answer4 = answer2;
            boolean z11111111 = i25;
            TextInputPillKt.m457TextInputPillg5ZjG94(str, str2, (Ia.l) objF3, h8, jM661getAccessibleColorOnWhiteBackground8_81llA1111110, 0, true, lVar3, i24, 6, z10, composableLambdaImplB, enabled1111110, 0.0f, c1086gP, ((i27 << 3) & 29360128) | 806879232, 0, 8224);
            validationType = textQuestionModel.getValidationType();
            c1086gP.L(1721048023);
            if (validationType != SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION) {
                int iIntValue111111111118 = characterLimit.intValue();
                StringBuilder sb111111111119 = new StringBuilder();
                sb111111111119.append(answer4.getLength());
                sb111111111119.append('/');
                sb111111111119.append(iIntValue111111111118);
                TextKt.b(sb111111111119.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                r rVar111111111118 = r.f47939a;
            } else {
                int iIntValue111111111119 = characterLimit.intValue();
                StringBuilder sb1111111111110 = new StringBuilder();
                sb1111111111110.append(answer4.getLength());
                sb1111111111110.append('/');
                sb1111111111110.append(iIntValue111111111119);
                TextKt.b(sb1111111111110.toString(), PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, i23, 0.0f, 0.0f, 13), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU(), G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 3072, 0, 131056);
                r rVar111111111119 = r.f47939a;
            }
            c1086gP.T(false);
            c1086gP.L(1721067384);
            if (textQuestionModel.getValidationType() == SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL) {
                String strP1111110 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_tickets_email_copy);
                IntercomTheme intercomTheme1111110 = IntercomTheme.INSTANCE;
                int i21111118 = IntercomTheme.$stable;
                TextKt.b(strP1111110, PaddingKt.j(aVar, 0.0f, i23, 0.0f, 0.0f, 13), intercomTheme1111110.getColors(c1086gP, i21111118).m630getDescriptionText0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme1111110.getTypography(c1086gP, i21111118).getType04(), c1086gP, 48, 0, 65528);
            }
            c1086gP.T(false);
            c1086gP.T(z11111111);
            c1086gP.T(z11111111);
            pVar3 = pVarM447getLambda1$intercom_sdk_base_release;
            answer5 = answer4;
            hVar3 = hVar18;
            lVar4 = lVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.k
                @Override // Ia.p
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue20 = ((Integer) obj3).intValue();
                    return ShortTextQuestionKt.ShortTextQuestion$lambda$8(hVar3, textQuestionModel, answer5, onAnswer, colors, validationError, lVar4, pVar3, i10, i11, (InterfaceC1084f) obj2, iIntValue20);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextQuestion$lambda$0(InterfaceC1000i interfaceC1000i) {
        kotlin.jvm.internal.i.e(interfaceC1000i, "<this>");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextQuestion$lambda$2(A coroutineScope, androidx.compose.foundation.relocation.a bringIntoViewRequester, y it) {
        kotlin.jvm.internal.i.e(coroutineScope, "$coroutineScope");
        kotlin.jvm.internal.i.e(bringIntoViewRequester, "$bringIntoViewRequester");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.b()) {
            C2680e.c(coroutineScope, null, null, new ShortTextQuestionKt$ShortTextQuestion$2$1(bringIntoViewRequester, null), 3);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ShortTextQuestion$lambda$7$lambda$6$lambda$4$lambda$3(Ia.l onAnswer, String it) {
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
    public static final r ShortTextQuestion$lambda$8(androidx.compose.ui.h hVar, SurveyData.Step.Question.ShortTextQuestionModel textQuestionModel, Answer answer, Ia.l onAnswer, SurveyUiColors colors, ValidationError validationError, Ia.l lVar, p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(textQuestionModel, "$textQuestionModel");
        kotlin.jvm.internal.i.e(onAnswer, "$onAnswer");
        kotlin.jvm.internal.i.e(colors, "$colors");
        kotlin.jvm.internal.i.e(validationError, "$validationError");
        ShortTextQuestion(hVar, textQuestionModel, answer, onAnswer, colors, validationError, lVar, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
