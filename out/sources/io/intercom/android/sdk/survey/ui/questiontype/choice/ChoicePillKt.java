package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Ia.p;
import S4.o;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.m5.components.C2287j0;
import io.intercom.android.sdk.m5.components.E0;
import io.intercom.android.sdk.m5.conversation.ui.components.row.z;
import io.intercom.android.sdk.m5.home.ui.components.q;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ChoicePill.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ChoicePillKt {
    /* JADX WARN: Code duplicated, block: B:103:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0146  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0150  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:124:0x01af  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0205  */
    /* JADX WARN: Code duplicated, block: B:138:0x0209  */
    /* JADX WARN: Code duplicated, block: B:141:0x021c  */
    /* JADX WARN: Code duplicated, block: B:143:0x022a  */
    /* JADX WARN: Code duplicated, block: B:146:0x029c  */
    /* JADX WARN: Code duplicated, block: B:150:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX INFO: renamed from: ChoicePill-UdaoDFU, reason: not valid java name */
    public static final void m415ChoicePillUdaoDFU(final boolean z10, Ia.l<? super String, r> lVar, final String text, long j, float f10, long j10, androidx.compose.ui.text.font.l lVar2, long j11, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        long j12;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.text.font.l lVar3;
        int i21;
        Ia.l<? super String, r> eVar;
        float f12;
        long j13;
        androidx.compose.ui.text.font.l lVar4;
        long jM658generateTextColor8_81llA;
        long j14;
        int i22;
        float f13;
        long j15;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objF;
        int i23;
        Ia.a<ComposeUiNode> aVar;
        p<ComposeUiNode, Integer, r> pVar;
        androidx.compose.ui.f.b bVar;
        int i24;
        C1086g c1086g;
        final androidx.compose.ui.text.font.l lVar5;
        final long j16;
        final long j17;
        final long j18;
        final float f14;
        final Ia.l<? super String, r> lVar6;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(418926179);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.k(lVar) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= 384;
            } else if ((i10 & 896) == 0) {
                if (c1086gP.K(text)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    j12 = j;
                    if (c1086gP.i(j12)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((57344 & i10) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (c1086gP.i(j10)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    i20 = i11 & 64;
                    if (i20 != 0) {
                        i12 |= 1572864;
                        lVar3 = lVar2;
                    } else {
                        lVar3 = lVar2;
                        if ((i10 & 3670016) == 0) {
                            if (c1086gP.K(lVar3)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i12 |= i21;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                    }
                    if ((23967451 & i12) == 4793490 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i25 != 0) {
                                eVar = new io.intercom.android.sdk.survey.block.e(1);
                            } else {
                                eVar = lVar;
                            }
                            if (i14 != 0) {
                                j12 = H.f13495b;
                            }
                            if (i16 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i18 != 0) {
                                j13 = H.f13499f;
                            } else {
                                j13 = j10;
                            }
                            if (i20 != 0) {
                                lVar4 = androidx.compose.ui.text.font.l.f15442g;
                            } else {
                                lVar4 = lVar3;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            j14 = j12;
                            i22 = i12;
                            f13 = f12;
                            j15 = j13;
                        } else {
                            c1086gP.w();
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            eVar = lVar;
                            jM658generateTextColor8_81llA = j11;
                            lVar4 = lVar3;
                            j14 = j12;
                            i22 = i12;
                            j15 = j10;
                            f13 = f11;
                        }
                        long j19 = j14;
                        c1086gP.U();
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i26 = IntercomTheme.$stable;
                        p270w.a aVar2 = intercomTheme.getShapes(c1086gP, i26).f12430b;
                        androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                        androidx.compose.ui.h hVarD = W.d(aVar3, 1.0f);
                        C0937i c0937iA = C1787c0.a(f13, j19);
                        float f15 = f13;
                        androidx.compose.ui.h hVarB = C0932d.b(A8.p.r(C0935g.b(hVarD, c0937iA.f10065a, c0937iA.f10066b, aVar2), aVar2), j15, h0.f13629a);
                        c1086gP.L(-8584634);
                        if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((i22 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z11 | z12;
                        objF = c1086gP.f();
                        if (z13 || objF == InterfaceC1084f.a.f12980a) {
                            objF = new io.intercom.android.sdk.c(eVar, 2, text);
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        androidx.compose.ui.h hVarF = PaddingKt.f(ClickableKt.c(hVarB, false, null, (Ia.a) objF, 7), 16);
                        T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                        i23 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarF);
                        ComposeUiNode.f14331c0.getClass();
                        aVar = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        Ia.l<? super String, r> lVar7 = eVar;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i23))) {
                            J4.i.d(i23, c1086gP, i23, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        androidx.compose.ui.h hVarD2 = W.d(aVar3, 0.85f);
                        bVar = androidx.compose.ui.d.a.f13344k;
                        long j20 = j15;
                        i24 = i22;
                        TextKt.b(text, hVarD2.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i26).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                        c1086g = c1086gP;
                        c1086g.L(2120582664);
                        if (z10) {
                            IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                        }
                        c1086g.T(false);
                        c1086g.T(true);
                        lVar5 = lVar4;
                        j16 = jM658generateTextColor8_81llA;
                        j17 = j20;
                        j18 = j19;
                        f14 = f15;
                        lVar6 = lVar7;
                    } else {
                        c1086gP.w();
                        lVar6 = lVar;
                        j17 = j10;
                        c1086g = c1086gP;
                        lVar5 = lVar3;
                        j18 = j12;
                        f14 = f11;
                        j16 = j11;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                f11 = f10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.i(j10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.K(lVar3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j110 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i27 = IntercomTheme.$stable;
                    p270w.a aVar4 = intercomTheme2.getShapes(c1086gP, i27).f12430b;
                    androidx.compose.ui.h.a aVar5 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD3 = W.d(aVar5, 1.0f);
                    C0937i c0937iA2 = C1787c0.a(f13, j110);
                    float f16 = f13;
                    androidx.compose.ui.h hVarB2 = C0932d.b(A8.p.r(C0935g.b(hVarD3, c0937iA2.f10065a, c0937iA2.f10066b, aVar4), aVar4), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF2 = PaddingKt.f(ClickableKt.c(hVarB2, false, null, (Ia.a) objF, 7), 16);
                    T tA2 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarF2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar8 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                    androidx.compose.ui.h hVarD4 = W.d(aVar5, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j21 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD4.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme2.getTypography(c1086gP, i27).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j21;
                    j18 = j110;
                    f14 = f16;
                    lVar6 = lVar8;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j111 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i28 = IntercomTheme.$stable;
                    p270w.a aVar6 = intercomTheme3.getShapes(c1086gP, i28).f12430b;
                    androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD5 = W.d(aVar7, 1.0f);
                    C0937i c0937iA3 = C1787c0.a(f13, j111);
                    float f17 = f13;
                    androidx.compose.ui.h hVarB3 = C0932d.b(A8.p.r(C0935g.b(hVarD5, c0937iA3.f10065a, c0937iA3.f10066b, aVar6), aVar6), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF3 = PaddingKt.f(ClickableKt.c(hVarB3, false, null, (Ia.a) objF, 7), 16);
                    T tA3 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarF3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar9 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    androidx.compose.ui.h hVarD6 = W.d(aVar7, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j22 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD6.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme3.getTypography(c1086gP, i28).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j22;
                    j18 = j111;
                    f14 = f17;
                    lVar6 = lVar9;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            j12 = j;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.i(j10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.K(lVar3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j112 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i29 = IntercomTheme.$stable;
                    p270w.a aVar8 = intercomTheme4.getShapes(c1086gP, i29).f12430b;
                    androidx.compose.ui.h.a aVar9 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD7 = W.d(aVar9, 1.0f);
                    C0937i c0937iA4 = C1787c0.a(f13, j112);
                    float f18 = f13;
                    androidx.compose.ui.h hVarB4 = C0932d.b(A8.p.r(C0935g.b(hVarD7, c0937iA4.f10065a, c0937iA4.f10066b, aVar8), aVar8), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF4 = PaddingKt.f(ClickableKt.c(hVarB4, false, null, (Ia.a) objF, 7), 16);
                    T tA4 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarF4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar10 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA4);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                    androidx.compose.ui.h hVarD8 = W.d(aVar9, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j23 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD8.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme4.getTypography(c1086gP, i29).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j23;
                    j18 = j112;
                    f14 = f18;
                    lVar6 = lVar10;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j113 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i210 = IntercomTheme.$stable;
                    p270w.a aVar10 = intercomTheme5.getShapes(c1086gP, i210).f12430b;
                    androidx.compose.ui.h.a aVar11 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD9 = W.d(aVar11, 1.0f);
                    C0937i c0937iA5 = C1787c0.a(f13, j113);
                    float f19 = f13;
                    androidx.compose.ui.h hVarB5 = C0932d.b(A8.p.r(C0935g.b(hVarD9, c0937iA5.f10065a, c0937iA5.f10066b, aVar10), aVar10), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF5 = PaddingKt.f(ClickableKt.c(hVarB5, false, null, (Ia.a) objF, 7), 16);
                    T tA5 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarF5);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar11 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                    androidx.compose.ui.h hVarD10 = W.d(aVar11, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j24 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD10.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme5.getTypography(c1086gP, i210).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j24;
                    j18 = j113;
                    f14 = f19;
                    lVar6 = lVar11;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            f11 = f10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.i(j10)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.K(lVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j114 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i211 = IntercomTheme.$stable;
                p270w.a aVar12 = intercomTheme6.getShapes(c1086gP, i211).f12430b;
                androidx.compose.ui.h.a aVar13 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD11 = W.d(aVar13, 1.0f);
                C0937i c0937iA6 = C1787c0.a(f13, j114);
                float f110 = f13;
                androidx.compose.ui.h hVarB6 = C0932d.b(A8.p.r(C0935g.b(hVarD11, c0937iA6.f10065a, c0937iA6.f10066b, aVar12), aVar12), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF6 = PaddingKt.f(ClickableKt.c(hVarB6, false, null, (Ia.a) objF, 7), 16);
                T tA6 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarF6);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar12 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                androidx.compose.ui.h hVarD12 = W.d(aVar13, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j25 = j15;
                i24 = i22;
                TextKt.b(text, hVarD12.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme6.getTypography(c1086gP, i211).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j25;
                j18 = j114;
                f14 = f110;
                lVar6 = lVar12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j115 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i212 = IntercomTheme.$stable;
                p270w.a aVar14 = intercomTheme7.getShapes(c1086gP, i212).f12430b;
                androidx.compose.ui.h.a aVar15 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD13 = W.d(aVar15, 1.0f);
                C0937i c0937iA7 = C1787c0.a(f13, j115);
                float f111 = f13;
                androidx.compose.ui.h hVarB7 = C0932d.b(A8.p.r(C0935g.b(hVarD13, c0937iA7.f10065a, c0937iA7.f10066b, aVar14), aVar14), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF7 = PaddingKt.f(ClickableKt.c(hVarB7, false, null, (Ia.a) objF, 7), 16);
                T tA7 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarF7);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar13 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                androidx.compose.ui.h hVarD14 = W.d(aVar15, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j26 = j15;
                i24 = i22;
                TextKt.b(text, hVarD14.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme7.getTypography(c1086gP, i212).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j26;
                j18 = j115;
                f14 = f111;
                lVar6 = lVar13;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (c1086gP.K(text)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                j12 = j;
                if (c1086gP.i(j12)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.i(j10)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                i20 = i11 & 64;
                if (i20 != 0) {
                    i12 |= 1572864;
                    lVar3 = lVar2;
                } else {
                    lVar3 = lVar2;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.K(lVar3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i12 |= i21;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j116 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                    int i213 = IntercomTheme.$stable;
                    p270w.a aVar16 = intercomTheme8.getShapes(c1086gP, i213).f12430b;
                    androidx.compose.ui.h.a aVar17 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD15 = W.d(aVar17, 1.0f);
                    C0937i c0937iA8 = C1787c0.a(f13, j116);
                    float f112 = f13;
                    androidx.compose.ui.h hVarB8 = C0932d.b(A8.p.r(C0935g.b(hVarD15, c0937iA8.f10065a, c0937iA8.f10066b, aVar16), aVar16), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF8 = PaddingKt.f(ClickableKt.c(hVarB8, false, null, (Ia.a) objF, 7), 16);
                    T tA8 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarF8);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar14 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA8);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                    androidx.compose.ui.h hVarD16 = W.d(aVar17, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j27 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD16.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme8.getTypography(c1086gP, i213).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j27;
                    j18 = j116;
                    f14 = f112;
                    lVar6 = lVar14;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    } else {
                        if (i25 != 0) {
                            eVar = new io.intercom.android.sdk.survey.block.e(1);
                        } else {
                            eVar = lVar;
                        }
                        if (i14 != 0) {
                            j12 = H.f13495b;
                        }
                        if (i16 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i18 != 0) {
                            j13 = H.f13499f;
                        } else {
                            j13 = j10;
                        }
                        if (i20 != 0) {
                            lVar4 = androidx.compose.ui.text.font.l.f15442g;
                        } else {
                            lVar4 = lVar3;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        j14 = j12;
                        i22 = i12;
                        f13 = f12;
                        j15 = j13;
                    }
                    long j117 = j14;
                    c1086gP.U();
                    IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                    int i214 = IntercomTheme.$stable;
                    p270w.a aVar18 = intercomTheme9.getShapes(c1086gP, i214).f12430b;
                    androidx.compose.ui.h.a aVar19 = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarD17 = W.d(aVar19, 1.0f);
                    C0937i c0937iA9 = C1787c0.a(f13, j117);
                    float f113 = f13;
                    androidx.compose.ui.h hVarB9 = C0932d.b(A8.p.r(C0935g.b(hVarD17, c0937iA9.f10065a, c0937iA9.f10066b, aVar18), aVar18), j15, h0.f13629a);
                    c1086gP.L(-8584634);
                    if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((i22 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z11 | z12;
                    objF = c1086gP.f();
                    if (z13) {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    } else {
                        objF = new io.intercom.android.sdk.c(eVar, 2, text);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    androidx.compose.ui.h hVarF9 = PaddingKt.f(ClickableKt.c(hVarB9, false, null, (Ia.a) objF, 7), 16);
                    T tA9 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                    i23 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarF9);
                    ComposeUiNode.f14331c0.getClass();
                    aVar = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    Ia.l<? super String, r> lVar15 = eVar;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA9);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    } else {
                        J4.i.d(i23, c1086gP, i23, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                    androidx.compose.ui.h hVarD18 = W.d(aVar19, 0.85f);
                    bVar = androidx.compose.ui.d.a.f13344k;
                    long j28 = j15;
                    i24 = i22;
                    TextKt.b(text, hVarD18.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme9.getTypography(c1086gP, i214).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                    c1086g = c1086gP;
                    c1086g.L(2120582664);
                    if (z10) {
                        IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                    }
                    c1086g.T(false);
                    c1086g.T(true);
                    lVar5 = lVar4;
                    j16 = jM658generateTextColor8_81llA;
                    j17 = j28;
                    j18 = j117;
                    f14 = f113;
                    lVar6 = lVar15;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            f11 = f10;
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.i(j10)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.K(lVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j118 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                int i215 = IntercomTheme.$stable;
                p270w.a aVar110 = intercomTheme10.getShapes(c1086gP, i215).f12430b;
                androidx.compose.ui.h.a aVar111 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD19 = W.d(aVar111, 1.0f);
                C0937i c0937iA10 = C1787c0.a(f13, j118);
                float f114 = f13;
                androidx.compose.ui.h hVarB10 = C0932d.b(A8.p.r(C0935g.b(hVarD19, c0937iA10.f10065a, c0937iA10.f10066b, aVar110), aVar110), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF10 = PaddingKt.f(ClickableKt.c(hVarB10, false, null, (Ia.a) objF, 7), 16);
                T tA10 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarF10);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar16 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA10);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                androidx.compose.ui.h hVarD110 = W.d(aVar111, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j29 = j15;
                i24 = i22;
                TextKt.b(text, hVarD110.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme10.getTypography(c1086gP, i215).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j29;
                j18 = j118;
                f14 = f114;
                lVar6 = lVar16;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j119 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i216 = IntercomTheme.$stable;
                p270w.a aVar112 = intercomTheme11.getShapes(c1086gP, i216).f12430b;
                androidx.compose.ui.h.a aVar113 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD111 = W.d(aVar113, 1.0f);
                C0937i c0937iA11 = C1787c0.a(f13, j119);
                float f115 = f13;
                androidx.compose.ui.h hVarB11 = C0932d.b(A8.p.r(C0935g.b(hVarD111, c0937iA11.f10065a, c0937iA11.f10066b, aVar112), aVar112), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF11 = PaddingKt.f(ClickableKt.c(hVarB11, false, null, (Ia.a) objF, 7), 16);
                T tA11 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarF11);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar17 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA11);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                androidx.compose.ui.h hVarD112 = W.d(aVar113, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j210 = j15;
                i24 = i22;
                TextKt.b(text, hVarD112.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme11.getTypography(c1086gP, i216).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j210;
                j18 = j119;
                f14 = f115;
                lVar6 = lVar17;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        j12 = j;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((57344 & i10) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.i(j10)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            i20 = i11 & 64;
            if (i20 != 0) {
                i12 |= 1572864;
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.K(lVar3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i12 |= i21;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j1110 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i217 = IntercomTheme.$stable;
                p270w.a aVar114 = intercomTheme12.getShapes(c1086gP, i217).f12430b;
                androidx.compose.ui.h.a aVar115 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD113 = W.d(aVar115, 1.0f);
                C0937i c0937iA12 = C1787c0.a(f13, j1110);
                float f116 = f13;
                androidx.compose.ui.h hVarB12 = C0932d.b(A8.p.r(C0935g.b(hVarD113, c0937iA12.f10065a, c0937iA12.f10066b, aVar114), aVar114), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF12 = PaddingKt.f(ClickableKt.c(hVarB12, false, null, (Ia.a) objF, 7), 16);
                T tA12 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarF12);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar18 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA12);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                androidx.compose.ui.h hVarD114 = W.d(aVar115, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j211 = j15;
                i24 = i22;
                TextKt.b(text, hVarD114.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme12.getTypography(c1086gP, i217).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j211;
                j18 = j1110;
                f14 = f116;
                lVar6 = lVar18;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                } else {
                    if (i25 != 0) {
                        eVar = new io.intercom.android.sdk.survey.block.e(1);
                    } else {
                        eVar = lVar;
                    }
                    if (i14 != 0) {
                        j12 = H.f13495b;
                    }
                    if (i16 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i18 != 0) {
                        j13 = H.f13499f;
                    } else {
                        j13 = j10;
                    }
                    if (i20 != 0) {
                        lVar4 = androidx.compose.ui.text.font.l.f15442g;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    j14 = j12;
                    i22 = i12;
                    f13 = f12;
                    j15 = j13;
                }
                long j1111 = j14;
                c1086gP.U();
                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                int i218 = IntercomTheme.$stable;
                p270w.a aVar116 = intercomTheme13.getShapes(c1086gP, i218).f12430b;
                androidx.compose.ui.h.a aVar117 = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarD115 = W.d(aVar117, 1.0f);
                C0937i c0937iA13 = C1787c0.a(f13, j1111);
                float f117 = f13;
                androidx.compose.ui.h hVarB13 = C0932d.b(A8.p.r(C0935g.b(hVarD115, c0937iA13.f10065a, c0937iA13.f10066b, aVar116), aVar116), j15, h0.f13629a);
                c1086gP.L(-8584634);
                if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i22 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z11 | z12;
                objF = c1086gP.f();
                if (z13) {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                } else {
                    objF = new io.intercom.android.sdk.c(eVar, 2, text);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                androidx.compose.ui.h hVarF13 = PaddingKt.f(ClickableKt.c(hVarB13, false, null, (Ia.a) objF, 7), 16);
                T tA13 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
                i23 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarF13);
                ComposeUiNode.f14331c0.getClass();
                aVar = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                Ia.l<? super String, r> lVar19 = eVar;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA13);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i23, c1086gP, i23, pVar);
                } else {
                    J4.i.d(i23, c1086gP, i23, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                androidx.compose.ui.h hVarD116 = W.d(aVar117, 0.85f);
                bVar = androidx.compose.ui.d.a.f13344k;
                long j212 = j15;
                i24 = i22;
                TextKt.b(text, hVarD116.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme13.getTypography(c1086gP, i218).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
                c1086g = c1086gP;
                c1086g.L(2120582664);
                if (z10) {
                    IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
                }
                c1086g.T(false);
                c1086g.T(true);
                lVar5 = lVar4;
                j16 = jM658generateTextColor8_81llA;
                j17 = j212;
                j18 = j1111;
                f14 = f117;
                lVar6 = lVar19;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        f11 = f10;
        i18 = i11 & 32;
        if (i18 != 0) {
            i12 |= 196608;
        } else if ((i10 & 458752) == 0) {
            if (c1086gP.i(j10)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        }
        i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
            lVar3 = lVar2;
        } else {
            lVar3 = lVar2;
            if ((i10 & 3670016) == 0) {
                if (c1086gP.K(lVar3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i12 |= i21;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
        }
        if ((23967451 & i12) == 4793490) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    eVar = new io.intercom.android.sdk.survey.block.e(1);
                } else {
                    eVar = lVar;
                }
                if (i14 != 0) {
                    j12 = H.f13495b;
                }
                if (i16 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i18 != 0) {
                    j13 = H.f13499f;
                } else {
                    j13 = j10;
                }
                if (i20 != 0) {
                    lVar4 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar4 = lVar3;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                j14 = j12;
                i22 = i12;
                f13 = f12;
                j15 = j13;
            } else {
                if (i25 != 0) {
                    eVar = new io.intercom.android.sdk.survey.block.e(1);
                } else {
                    eVar = lVar;
                }
                if (i14 != 0) {
                    j12 = H.f13495b;
                }
                if (i16 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i18 != 0) {
                    j13 = H.f13499f;
                } else {
                    j13 = j10;
                }
                if (i20 != 0) {
                    lVar4 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar4 = lVar3;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                j14 = j12;
                i22 = i12;
                f13 = f12;
                j15 = j13;
            }
            long j1112 = j14;
            c1086gP.U();
            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
            int i219 = IntercomTheme.$stable;
            p270w.a aVar118 = intercomTheme14.getShapes(c1086gP, i219).f12430b;
            androidx.compose.ui.h.a aVar119 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD117 = W.d(aVar119, 1.0f);
            C0937i c0937iA14 = C1787c0.a(f13, j1112);
            float f118 = f13;
            androidx.compose.ui.h hVarB14 = C0932d.b(A8.p.r(C0935g.b(hVarD117, c0937iA14.f10065a, c0937iA14.f10066b, aVar118), aVar118), j15, h0.f13629a);
            c1086gP.L(-8584634);
            if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i22 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12;
            objF = c1086gP.f();
            if (z13) {
                objF = new io.intercom.android.sdk.c(eVar, 2, text);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.c(eVar, 2, text);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarF14 = PaddingKt.f(ClickableKt.c(hVarB14, false, null, (Ia.a) objF, 7), 16);
            T tA14 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i23 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
            androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarF14);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            Ia.l<? super String, r> lVar110 = eVar;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA14);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i23, c1086gP, i23, pVar);
            } else {
                J4.i.d(i23, c1086gP, i23, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
            androidx.compose.ui.h hVarD118 = W.d(aVar119, 0.85f);
            bVar = androidx.compose.ui.d.a.f13344k;
            long j213 = j15;
            i24 = i22;
            TextKt.b(text, hVarD118.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme14.getTypography(c1086gP, i219).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
            c1086g = c1086gP;
            c1086g.L(2120582664);
            if (z10) {
                IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
            }
            c1086g.T(false);
            c1086g.T(true);
            lVar5 = lVar4;
            j16 = jM658generateTextColor8_81llA;
            j17 = j213;
            j18 = j1112;
            f14 = f118;
            lVar6 = lVar110;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    eVar = new io.intercom.android.sdk.survey.block.e(1);
                } else {
                    eVar = lVar;
                }
                if (i14 != 0) {
                    j12 = H.f13495b;
                }
                if (i16 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i18 != 0) {
                    j13 = H.f13499f;
                } else {
                    j13 = j10;
                }
                if (i20 != 0) {
                    lVar4 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar4 = lVar3;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                j14 = j12;
                i22 = i12;
                f13 = f12;
                j15 = j13;
            } else {
                if (i25 != 0) {
                    eVar = new io.intercom.android.sdk.survey.block.e(1);
                } else {
                    eVar = lVar;
                }
                if (i14 != 0) {
                    j12 = H.f13495b;
                }
                if (i16 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i18 != 0) {
                    j13 = H.f13499f;
                } else {
                    j13 = j10;
                }
                if (i20 != 0) {
                    lVar4 = androidx.compose.ui.text.font.l.f15442g;
                } else {
                    lVar4 = lVar3;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j13);
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                j14 = j12;
                i22 = i12;
                f13 = f12;
                j15 = j13;
            }
            long j1113 = j14;
            c1086gP.U();
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i2110 = IntercomTheme.$stable;
            p270w.a aVar1110 = intercomTheme15.getShapes(c1086gP, i2110).f12430b;
            androidx.compose.ui.h.a aVar1111 = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarD119 = W.d(aVar1111, 1.0f);
            C0937i c0937iA15 = C1787c0.a(f13, j1113);
            float f119 = f13;
            androidx.compose.ui.h hVarB15 = C0932d.b(A8.p.r(C0935g.b(hVarD119, c0937iA15.f10065a, c0937iA15.f10066b, aVar1110), aVar1110), j15, h0.f13629a);
            c1086gP.L(-8584634);
            if ((i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i22 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z11 | z12;
            objF = c1086gP.f();
            if (z13) {
                objF = new io.intercom.android.sdk.c(eVar, 2, text);
                c1086gP.E(objF);
            } else {
                objF = new io.intercom.android.sdk.c(eVar, 2, text);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarF15 = PaddingKt.f(ClickableKt.c(hVarB15, false, null, (Ia.a) objF, 7), 16);
            T tA15 = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            i23 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
            androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarF15);
            ComposeUiNode.f14331c0.getClass();
            aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            Ia.l<? super String, r> lVar111 = eVar;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA15);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i23, c1086gP, i23, pVar);
            } else {
                J4.i.d(i23, c1086gP, i23, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
            androidx.compose.ui.h hVarD1110 = W.d(aVar1111, 0.85f);
            bVar = androidx.compose.ui.d.a.f13344k;
            long j214 = j15;
            i24 = i22;
            TextKt.b(text, hVarD1110.i(new VerticalAlignElement(bVar)), jM658generateTextColor8_81llA, 0L, null, lVar4, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme15.getTypography(c1086gP, i2110).getType04(), c1086gP, ((i22 >> 6) & 14) | ((i22 >> 15) & 896) | ((i22 >> 3) & 458752), 0, 65496);
            c1086g = c1086gP;
            c1086g.L(2120582664);
            if (z10) {
                IconKt.b(p306z.c.a(), o.p(c1086g, com.voltasit.obdeleven.R.string.selected), new VerticalAlignElement(bVar), jM658generateTextColor8_81llA, c1086g, (i24 >> 12) & 7168, 0);
            }
            c1086g.T(false);
            c1086g.T(true);
            lVar5 = lVar4;
            j16 = jM658generateTextColor8_81llA;
            j17 = j214;
            j18 = j1113;
            f14 = f119;
            lVar6 = lVar111;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.a
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ChoicePillKt.ChoicePill_UdaoDFU$lambda$4(z10, lVar6, text, j18, f14, j17, lVar5, j16, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChoicePill_UdaoDFU$lambda$0(String it) {
        kotlin.jvm.internal.i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChoicePill_UdaoDFU$lambda$2$lambda$1(Ia.l lVar, String text) {
        kotlin.jvm.internal.i.e(text, "$text");
        lVar.invoke(text);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r ChoicePill_UdaoDFU$lambda$4(boolean z10, Ia.l lVar, String text, long j, float f10, long j10, androidx.compose.ui.text.font.l lVar2, long j11, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(text, "$text");
        m415ChoicePillUdaoDFU(z10, lVar, text, j, f10, j10, lVar2, j11, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    private static final void EmptyPill(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1274080153);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m416getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new E0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyPill$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyPill(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void SelectedPill(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1118291055);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m417getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2287j0(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedPill$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedPill(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void SelectedPillDark(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-774877671);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m418getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.m5.notification.d(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedPillDark$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedPillDark(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void SelectedPillLongBigText(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1982481602);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            SelectedPillLongText(c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new q(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedPillLongBigText$lambda$9(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedPillLongBigText(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void SelectedPillLongText(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(173524454);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ChoicePillKt.INSTANCE.m419getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SelectedPillLongText$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SelectedPillLongText(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
