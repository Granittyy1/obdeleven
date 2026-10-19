package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Ia.p;
import Ia.q;
import S4.o;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.InterfaceC0928f;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.C0955o;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: OtherOption.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OtherOptionKt {
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170  */
    /* JADX WARN: Code duplicated, block: B:120:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x018a  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0190  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:129:0x019a  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0215  */
    /* JADX WARN: Code duplicated, block: B:147:0x0217  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0222  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0121  */
    /* JADX WARN: Code duplicated, block: B:92:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x012c  */
    /* JADX INFO: renamed from: OtherOption-YCJL08c, reason: not valid java name */
    public static final void m423OtherOptionYCJL08c(final boolean z10, final SurveyUiColors surveyUiColors, final String text, final Ia.a<r> onClicked, final Ia.l<? super String, r> onTextChanged, long j, float f10, long j10, androidx.compose.ui.text.font.l lVar, long j11, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        long j12;
        int i13;
        float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j13;
        long j14;
        androidx.compose.ui.text.font.l lVar2;
        long jM658generateTextColor8_81llA;
        int i20;
        Ia.a<ComposeUiNode> aVar;
        p<ComposeUiNode, Integer, r> pVar;
        boolean z11;
        Object objF;
        androidx.compose.ui.text.font.l lVar3;
        final long j15;
        final float f12;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(surveyUiColors, "surveyUiColors");
        kotlin.jvm.internal.i.e(text, "text");
        kotlin.jvm.internal.i.e(onClicked, "onClicked");
        kotlin.jvm.internal.i.e(onTextChanged, "onTextChanged");
        C1086g c1086gP = interfaceC1084f.p(-933969743);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(surveyUiColors) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.K(text) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= c1086gP.k(onClicked) ? 2048 : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i12 |= c1086gP.k(onTextChanged) ? 16384 : 8192;
        }
        int i21 = i11 & 32;
        if (i21 == 0) {
            if ((i10 & 458752) == 0) {
                j12 = j;
                i12 |= c1086gP.i(j12) ? 131072 : 65536;
            }
            i13 = i11 & 64;
            if (i13 != 0) {
                i12 |= 1572864;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.g(f11)) {
                        i14 = 1048576;
                    } else {
                        i14 = 524288;
                    }
                    i12 |= i14;
                }
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
                i16 = i15;
            } else {
                i16 = i15;
                if ((i10 & 29360128) == 0) {
                    if (c1086gP.i(j10)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
            }
            i18 = i11 & 256;
            if (i18 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (c1086gP.K(lVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i12 |= i19;
            }
            if ((1879048192 & i10) != 0) {
                i12 |= ((i11 & 512) == 0 || !c1086gP.i(j11)) ? 268435456 : 536870912;
            }
            if ((i12 & 1533916891) == 306783378 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i21 != 0) {
                        j13 = H.f13495b;
                    } else {
                        j13 = j12;
                    }
                    if (i13 != 0) {
                        f11 = 1;
                    }
                    if (i16 != 0) {
                        j14 = H.f13499f;
                    } else {
                        j14 = j10;
                    }
                    if (i18 != 0) {
                        lVar2 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 512) != 0) {
                        i12 &= -1879048193;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j14);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 512) != 0) {
                        i12 &= -1879048193;
                    }
                    lVar2 = lVar;
                    jM658generateTextColor8_81llA = j11;
                    j13 = j12;
                    j14 = j10;
                }
                c1086gP.U();
                androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i20 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                    J4.i.d(i20, c1086gP, i20, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                C0955o c0955o = C0955o.f10310a;
                String strP = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_value);
                c1086gP.L(-1990898758);
                if ((i12 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objF = c1086gP.f();
                if (z11 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                int i22 = i12 >> 6;
                ChoicePillKt.m415ChoicePillUdaoDFU(z10, (Ia.l) objF, strP, j13, f11, j14, lVar2, jM658generateTextColor8_81llA, c1086gP, (i12 & 14) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (i22 & 3670016) | (i22 & 29360128), 0);
                Lb.a.a(c1086gP, W.e(aVar2, 8));
                AnimatedVisibilityKt.d(c0955o, z10, null, null, null, null, androidx.compose.runtime.internal.a.b(-252181085, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i23) {
                        kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                        String str = text;
                        Ia.l<String, r> lVar4 = onTextChanged;
                        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                        C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                        int iF = interfaceC1084f2.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(interfaceC1084f2, aVar3);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar4 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f2.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f2.r();
                        if (interfaceC1084f2.m()) {
                            interfaceC1084f2.v(aVar4);
                        } else {
                            interfaceC1084f2.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA2);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC2);
                        TextKt.b(o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_label), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        Lb.a.a(interfaceC1084f2, W.e(aVar3, 4));
                        TextInputPillKt.m457TextInputPillg5ZjG94(str, o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_placeholder), lVar4, null, ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m357getButton0d7_KjU()), 0, false, null, 0, 6, false, null, false, 0.0f, interfaceC1084f2, 805306368, 6, 14824);
                        interfaceC1084f2.J();
                    }
                }, c1086gP), c1086gP, 1572870 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 30);
                c1086gP.T(true);
                lVar3 = lVar2;
                j15 = j13;
                f12 = f11;
            } else {
                c1086gP.w();
                lVar3 = lVar;
                jM658generateTextColor8_81llA = j11;
                f12 = f11;
                j15 = j12;
                j14 = j10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j16 = j14;
                final androidx.compose.ui.text.font.l lVar4 = lVar3;
                final long j17 = jM658generateTextColor8_81llA;
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.j
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j16, lVar4, j17, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 196608;
        j12 = j;
        i13 = i11 & 64;
        if (i13 != 0) {
            i12 |= 1572864;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 3670016) == 0) {
                if (c1086gP.g(f11)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i12 |= i14;
            }
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
            i16 = i15;
        } else {
            i16 = i15;
            if ((i10 & 29360128) == 0) {
                if (c1086gP.i(j10)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
        }
        i18 = i11 & 256;
        if (i18 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (c1086gP.K(lVar)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i12 |= i19;
        }
        if ((1879048192 & i10) != 0) {
            i12 |= ((i11 & 512) == 0 || !c1086gP.i(j11)) ? 268435456 : 536870912;
        }
        if ((i12 & 1533916891) == 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    j13 = H.f13495b;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    f11 = 1;
                }
                if (i16 != 0) {
                    j14 = H.f13499f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    lVar2 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 512) != 0) {
                    i12 &= -1879048193;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j14);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
            } else {
                if (i21 != 0) {
                    j13 = H.f13495b;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    f11 = 1;
                }
                if (i16 != 0) {
                    j14 = H.f13499f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    lVar2 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 512) != 0) {
                    i12 &= -1879048193;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j14);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
            }
            c1086gP.U();
            androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, aVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            C0955o c0955o2 = C0955o.f10310a;
            String strP2 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_value);
            c1086gP.L(-1990898758);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            int i23 = i12 >> 6;
            ChoicePillKt.m415ChoicePillUdaoDFU(z10, (Ia.l) objF, strP2, j13, f11, j14, lVar2, jM658generateTextColor8_81llA, c1086gP, (i12 & 14) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016) | (i23 & 29360128), 0);
            Lb.a.a(c1086gP, W.e(aVar3, 8));
            AnimatedVisibilityKt.d(c0955o2, z10, null, null, null, null, androidx.compose.runtime.internal.a.b(-252181085, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i24) {
                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                    String str = text;
                    Ia.l<String, r> lVar5 = onTextChanged;
                    androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
                    C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(interfaceC1084f2, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar5 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar5);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA3);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC3);
                    TextKt.b(o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_label), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                    Lb.a.a(interfaceC1084f2, W.e(aVar4, 4));
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_placeholder), lVar5, null, ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m357getButton0d7_KjU()), 0, false, null, 0, 6, false, null, false, 0.0f, interfaceC1084f2, 805306368, 6, 14824);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, 1572870 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 30);
            c1086gP.T(true);
            lVar3 = lVar2;
            j15 = j13;
            f12 = f11;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    j13 = H.f13495b;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    f11 = 1;
                }
                if (i16 != 0) {
                    j14 = H.f13499f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    lVar2 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 512) != 0) {
                    i12 &= -1879048193;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j14);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
            } else {
                if (i21 != 0) {
                    j13 = H.f13495b;
                } else {
                    j13 = j12;
                }
                if (i13 != 0) {
                    f11 = 1;
                }
                if (i16 != 0) {
                    j14 = H.f13499f;
                } else {
                    j14 = j10;
                }
                if (i18 != 0) {
                    lVar2 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 512) != 0) {
                    i12 &= -1879048193;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j14);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
            }
            c1086gP.U();
            androidx.compose.ui.h.a aVar4 = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i20, c1086gP, i20, pVar);
            } else {
                J4.i.d(i20, c1086gP, i20, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            C0955o c0955o3 = C0955o.f10310a;
            String strP3 = o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_value);
            c1086gP.L(-1990898758);
            if ((i12 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.i
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(onClicked, (String) obj);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            int i24 = i12 >> 6;
            ChoicePillKt.m415ChoicePillUdaoDFU(z10, (Ia.l) objF, strP3, j13, f11, j14, lVar2, jM658generateTextColor8_81llA, c1086gP, (i12 & 14) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (i24 & 3670016) | (i24 & 29360128), 0);
            Lb.a.a(c1086gP, W.e(aVar4, 8));
            AnimatedVisibilityKt.d(c0955o3, z10, null, null, null, null, androidx.compose.runtime.internal.a.b(-252181085, new q<InterfaceC0928f, InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                @Override // Ia.q
                public /* bridge */ /* synthetic */ r invoke(InterfaceC0928f interfaceC0928f, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC0928f, interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC0928f AnimatedVisibility, InterfaceC1084f interfaceC1084f2, int i25) {
                    kotlin.jvm.internal.i.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    SurveyUiColors surveyUiColors2 = surveyUiColors;
                    String str = text;
                    Ia.l<String, r> lVar5 = onTextChanged;
                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                    C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, interfaceC1084f2, 0);
                    int iF = interfaceC1084f2.F();
                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f2.z();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(interfaceC1084f2, aVar5);
                    ComposeUiNode.f14331c0.getClass();
                    Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
                    if (interfaceC1084f2.u() == null) {
                        I.b.k();
                        throw null;
                    }
                    interfaceC1084f2.r();
                    if (interfaceC1084f2.m()) {
                        interfaceC1084f2.v(aVar6);
                    } else {
                        interfaceC1084f2.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f2, c0953mA4);
                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f2, interfaceC1089h0Z);
                    p<ComposeUiNode, Integer, r> pVar2 = ComposeUiNode.Companion.f14338g;
                    if (interfaceC1084f2.m() || !kotlin.jvm.internal.i.a(interfaceC1084f2.f(), Integer.valueOf(iF))) {
                        androidx.compose.animation.k.b(iF, interfaceC1084f2, iF, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f2, hVarC4);
                    TextKt.b(o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_label), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                    Lb.a.a(interfaceC1084f2, W.e(aVar5, 4));
                    TextInputPillKt.m457TextInputPillg5ZjG94(str, o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_input_placeholder), lVar5, null, ColorExtensionsKt.m661getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m357getButton0d7_KjU()), 0, false, null, 0, 6, false, null, false, 0.0f, interfaceC1084f2, 805306368, 6, 14824);
                    interfaceC1084f2.J();
                }
            }, c1086gP), c1086gP, 1572870 | ((i12 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 30);
            c1086gP.T(true);
            lVar3 = lVar2;
            j15 = j13;
            f12 = f11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j18 = j14;
            final androidx.compose.ui.text.font.l lVar5 = lVar3;
            final long j19 = jM658generateTextColor8_81llA;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.j
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return OtherOptionKt.OtherOption_YCJL08c$lambda$3(z10, surveyUiColors, text, onClicked, onTextChanged, j15, f12, j18, lVar5, j19, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    public static final void OtherOptionPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-469899921);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SurfaceKt.a(PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OtherOptionKt.INSTANCE.m421getLambda1$intercom_sdk_base_release(), c1086gP, 12582918, R.styleable.AppCompatTheme_windowNoTitle);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r OtherOptionPreview$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        OtherOptionPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Ia.a onClicked, String it) {
        kotlin.jvm.internal.i.e(onClicked, "$onClicked");
        kotlin.jvm.internal.i.e(it, "it");
        onClicked.invoke();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r OtherOption_YCJL08c$lambda$3(boolean z10, SurveyUiColors surveyUiColors, String text, Ia.a onClicked, Ia.l onTextChanged, long j, float f10, long j10, androidx.compose.ui.text.font.l lVar, long j11, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(surveyUiColors, "$surveyUiColors");
        kotlin.jvm.internal.i.e(text, "$text");
        kotlin.jvm.internal.i.e(onClicked, "$onClicked");
        kotlin.jvm.internal.i.e(onTextChanged, "$onTextChanged");
        m423OtherOptionYCJL08c(z10, surveyUiColors, text, onClicked, onTextChanged, j, f10, j10, lVar, j11, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
