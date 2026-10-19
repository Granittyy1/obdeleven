package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import Ia.p;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import com.google.android.gms.internal.measurement.C1787c0;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2295n0;
import io.intercom.android.sdk.m5.components.C2297o0;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumericRatingCell.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NumericRatingCellKt {
    private static final void DarkFilledCell(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(477358395);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            m444NumericRatingCelljWvj134("1", null, 0L, 0.0f, H.f13495b, null, 0L, 0L, c1086gP, 24582, 238);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r DarkFilledCell$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        DarkFilledCell(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void EmptyCell(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1361614452);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            m444NumericRatingCelljWvj134("1", null, 0L, 0.0f, 0L, null, 0L, 0L, c1086gP, 6, 254);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r EmptyCell$lambda$2(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyCell(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    private static final void FilledCell(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1860651045);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            m444NumericRatingCelljWvj134("1", null, 0L, 0.0f, H.j, null, 0L, 0L, c1086gP, 24582, 238);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r FilledCell$lambda$3(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        FilledCell(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:110:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0153  */
    /* JADX WARN: Code duplicated, block: B:115:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:118:0x015d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:122:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0173  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:136:0x0202  */
    /* JADX WARN: Code duplicated, block: B:140:0x026d  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX INFO: renamed from: NumericRatingCell-jWvj134, reason: not valid java name */
    public static final void m444NumericRatingCelljWvj134(final String content, androidx.compose.ui.h hVar, long j, float f10, long j10, l lVar, long j11, long j12, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        long j13;
        int i18;
        int i19;
        int i20;
        long j14;
        int i21;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar2;
        long j15;
        float f12;
        long j16;
        l lVar2;
        long jM658generateTextColor8_81llA;
        l lVar3;
        long j17;
        long j18;
        long j19;
        long j20;
        androidx.compose.ui.h hVar3;
        int i22;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C1086g c1086g;
        final l lVar4;
        final long j21;
        final long j22;
        final long j23;
        final long j24;
        final float f13;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        int i23;
        int i24;
        kotlin.jvm.internal.i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-881315304);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(content) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    if (c1086gP.i(j)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        f11 = f10;
                        if (c1086gP.g(f11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            j13 = j10;
                            if (c1086gP.i(j13)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 458752) == 0) {
                            if (c1086gP.K(lVar)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !c1086gP.i(j11)) {
                                i24 = 524288;
                            } else {
                                i24 = 1048576;
                            }
                            i12 |= i24;
                        }
                        if ((29360128 & i10) == 0) {
                            j14 = j12;
                            if ((i11 & 128) == 0 || !c1086gP.i(j14)) {
                                i23 = 4194304;
                            } else {
                                i23 = 8388608;
                            }
                            i12 |= i23;
                        } else {
                            j14 = j12;
                        }
                        if ((23967451 & i12) == 4793490 || !c1086gP.s()) {
                            c1086gP.r0();
                            i21 = i10 & 1;
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0 || c1086gP.a0()) {
                                if (i25 != 0) {
                                    hVar2 = aVar;
                                } else {
                                    hVar2 = hVar;
                                }
                                if (i13 != 0) {
                                    j15 = H.f13495b;
                                } else {
                                    j15 = j;
                                }
                                if (i15 != 0) {
                                    f12 = 1;
                                } else {
                                    f12 = f11;
                                }
                                if (i17 != 0) {
                                    j16 = H.f13499f;
                                } else {
                                    j16 = j10;
                                }
                                if (i19 != 0) {
                                    lVar2 = l.f15442g;
                                } else {
                                    lVar2 = lVar;
                                }
                                if ((i11 & 64) != 0) {
                                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                    i12 &= -3670017;
                                } else {
                                    jM658generateTextColor8_81llA = j11;
                                }
                                if ((i11 & 128) != 0) {
                                    j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                    i12 &= -29360129;
                                }
                                lVar3 = lVar2;
                                j17 = j14;
                                j18 = j16;
                                j19 = j15;
                                j20 = jM658generateTextColor8_81llA;
                                hVar3 = hVar2;
                            } else {
                                c1086gP.w();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                j19 = j;
                                lVar3 = lVar;
                                j20 = j11;
                                j17 = j14;
                                f12 = f11;
                                hVar3 = hVar;
                                j18 = j10;
                            }
                            c1086gP.U();
                            p270w.a aVar3 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            C0937i c0937iA = C1787c0.a(f12, j19);
                            androidx.compose.ui.h hVarB = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA.f10065a, c0937iA.f10066b, aVar3), aVar3), j18, h0.f13629a);
                            float f14 = 44;
                            androidx.compose.ui.h hVarE = W.e(W.q(hVarB, f14), f14);
                            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i22 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
                            ComposeUiNode.f14331c0.getClass();
                            aVar2 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            float f15 = f12;
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar2);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i22))) {
                                J4.i.d(i22, c1086gP, i22, pVar);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                            int i26 = i12 >> 12;
                            long j25 = j18;
                            TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i26 & 896) | (i26 & 7168) | (i12 & 458752), 0, 131024);
                            c1086g = c1086gP;
                            c1086g.T(true);
                            lVar4 = lVar3;
                            j21 = j20;
                            j22 = j17;
                            j23 = j25;
                            j24 = j19;
                            f13 = f15;
                            hVar4 = hVar3;
                        } else {
                            c1086gP.w();
                            j24 = j;
                            j21 = j11;
                            c1086g = c1086gP;
                            f13 = f11;
                            hVar4 = hVar;
                            j22 = j14;
                            j23 = j13;
                            lVar4 = lVar;
                        }
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    j13 = j10;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (c1086gP.K(lVar)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i24 = 524288;
                        } else {
                            i24 = 524288;
                        }
                        i12 |= i24;
                    }
                    if ((29360128 & i10) == 0) {
                        j14 = j12;
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    } else {
                        j14 = j12;
                    }
                    if ((23967451 & i12) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar4 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA2 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB2 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA2.f10065a, c0937iA2.f10066b, aVar4), aVar4), j18, h0.f13629a);
                        float f16 = 44;
                        androidx.compose.ui.h hVarE2 = W.e(W.q(hVarB2, f16), f16);
                        E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarE2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f17 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                        int i27 = i12 >> 12;
                        long j26 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i27 & 896) | (i27 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j26;
                        j24 = j19;
                        f13 = f17;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar5 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA3 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB3 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA3.f10065a, c0937iA3.f10066b, aVar5), aVar5), j18, h0.f13629a);
                        float f18 = 44;
                        androidx.compose.ui.h hVarE3 = W.e(W.q(hVarB3, f18), f18);
                        E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarE3);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f19 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                        int i28 = i12 >> 12;
                        long j27 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i28 & 896) | (i28 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j27;
                        j24 = j19;
                        f13 = f19;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 3072;
                f11 = f10;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        j13 = j10;
                        if (c1086gP.i(j13)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (c1086gP.K(lVar)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i24 = 524288;
                        } else {
                            i24 = 524288;
                        }
                        i12 |= i24;
                    }
                    if ((29360128 & i10) == 0) {
                        j14 = j12;
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    } else {
                        j14 = j12;
                    }
                    if ((23967451 & i12) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar6 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA4 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB4 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA4.f10065a, c0937iA4.f10066b, aVar6), aVar6), j18, h0.f13629a);
                        float f110 = 44;
                        androidx.compose.ui.h hVarE4 = W.e(W.q(hVarB4, f110), f110);
                        E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarE4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f111 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        int i29 = i12 >> 12;
                        long j28 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i29 & 896) | (i29 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j28;
                        j24 = j19;
                        f13 = f111;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar7 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA5 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB5 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA5.f10065a, c0937iA5.f10066b, aVar7), aVar7), j18, h0.f13629a);
                        float f112 = 44;
                        androidx.compose.ui.h hVarE5 = W.e(W.q(hVarB5, f112), f112);
                        E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarE5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f113 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                        int i210 = i12 >> 12;
                        long j29 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i210 & 896) | (i210 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j29;
                        j24 = j19;
                        f13 = f113;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                j13 = j10;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar8 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA6 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB6 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA6.f10065a, c0937iA6.f10066b, aVar8), aVar8), j18, h0.f13629a);
                    float f114 = 44;
                    androidx.compose.ui.h hVarE6 = W.e(W.q(hVarB6, f114), f114);
                    E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarE6);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f115 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                    int i211 = i12 >> 12;
                    long j210 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i211 & 896) | (i211 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j210;
                    j24 = j19;
                    f13 = f115;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar9 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA7 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB7 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA7.f10065a, c0937iA7.f10066b, aVar9), aVar9), j18, h0.f13629a);
                    float f116 = 44;
                    androidx.compose.ui.h hVarE7 = W.e(W.q(hVarB7, f116), f116);
                    E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarE7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f117 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                    int i212 = i12 >> 12;
                    long j211 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i212 & 896) | (i212 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j211;
                    j24 = j19;
                    f13 = f117;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        j13 = j10;
                        if (c1086gP.i(j13)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (c1086gP.K(lVar)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i24 = 524288;
                        } else {
                            i24 = 524288;
                        }
                        i12 |= i24;
                    }
                    if ((29360128 & i10) == 0) {
                        j14 = j12;
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    } else {
                        j14 = j12;
                    }
                    if ((23967451 & i12) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar10 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA8 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB8 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA8.f10065a, c0937iA8.f10066b, aVar10), aVar10), j18, h0.f13629a);
                        float f118 = 44;
                        androidx.compose.ui.h hVarE8 = W.e(W.q(hVarB8, f118), f118);
                        E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarE8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f119 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                        int i213 = i12 >> 12;
                        long j212 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i213 & 896) | (i213 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j212;
                        j24 = j19;
                        f13 = f119;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar11 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA9 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB9 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA9.f10065a, c0937iA9.f10066b, aVar11), aVar11), j18, h0.f13629a);
                        float f1110 = 44;
                        androidx.compose.ui.h hVarE9 = W.e(W.q(hVarB9, f1110), f1110);
                        E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                        androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarE9);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f1111 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                        int i214 = i12 >> 12;
                        long j213 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i214 & 896) | (i214 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j213;
                        j24 = j19;
                        f13 = f1111;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                j13 = j10;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar12 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA10 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB10 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA10.f10065a, c0937iA10.f10066b, aVar12), aVar12), j18, h0.f13629a);
                    float f1112 = 44;
                    androidx.compose.ui.h hVarE10 = W.e(W.q(hVarB10, f1112), f1112);
                    E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarE10);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1113 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                    int i215 = i12 >> 12;
                    long j214 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i215 & 896) | (i215 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j214;
                    j24 = j19;
                    f13 = f1113;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar13 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA11 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB11 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA11.f10065a, c0937iA11.f10066b, aVar13), aVar13), j18, h0.f13629a);
                    float f1114 = 44;
                    androidx.compose.ui.h hVarE11 = W.e(W.q(hVarB11, f1114), f1114);
                    E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarE11);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1115 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                    int i216 = i12 >> 12;
                    long j215 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i216 & 896) | (i216 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j215;
                    j24 = j19;
                    f13 = f1115;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            f11 = f10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    j13 = j10;
                    if (c1086gP.i(j13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar14 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA12 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB12 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA12.f10065a, c0937iA12.f10066b, aVar14), aVar14), j18, h0.f13629a);
                    float f1116 = 44;
                    androidx.compose.ui.h hVarE12 = W.e(W.q(hVarB12, f1116), f1116);
                    E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarE12);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1117 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    int i217 = i12 >> 12;
                    long j216 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i217 & 896) | (i217 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j216;
                    j24 = j19;
                    f13 = f1117;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar15 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA13 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB13 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA13.f10065a, c0937iA13.f10066b, aVar15), aVar15), j18, h0.f13629a);
                    float f1118 = 44;
                    androidx.compose.ui.h hVarE13 = W.e(W.q(hVarB13, f1118), f1118);
                    E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarE13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1119 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                    int i218 = i12 >> 12;
                    long j217 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i218 & 896) | (i218 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j217;
                    j24 = j19;
                    f13 = f1119;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            j13 = j10;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.K(lVar)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((29360128 & i10) == 0) {
                j14 = j12;
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            } else {
                j14 = j12;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar16 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA14 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB14 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA14.f10065a, c0937iA14.f10066b, aVar16), aVar16), j18, h0.f13629a);
                float f11110 = 44;
                androidx.compose.ui.h hVarE14 = W.e(W.q(hVarB14, f11110), f11110);
                E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarE14);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f11111 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD14);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                int i219 = i12 >> 12;
                long j218 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i219 & 896) | (i219 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j218;
                j24 = j19;
                f13 = f11111;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar17 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA15 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB15 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA15.f10065a, c0937iA15.f10066b, aVar17), aVar17), j18, h0.f13629a);
                float f11112 = 44;
                androidx.compose.ui.h hVarE15 = W.e(W.q(hVarB15, f11112), f11112);
                E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarE15);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f11113 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD15);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                int i2110 = i12 >> 12;
                long j219 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2110 & 896) | (i2110 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j219;
                j24 = j19;
                f13 = f11113;
                hVar4 = hVar3;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                if (c1086gP.i(j)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    f11 = f10;
                    if (c1086gP.g(f11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        j13 = j10;
                        if (c1086gP.i(j13)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 458752) == 0) {
                        if (c1086gP.K(lVar)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i24 = 524288;
                        } else {
                            i24 = 524288;
                        }
                        i12 |= i24;
                    }
                    if ((29360128 & i10) == 0) {
                        j14 = j12;
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    } else {
                        j14 = j12;
                    }
                    if ((23967451 & i12) == 4793490) {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar18 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA16 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB16 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA16.f10065a, c0937iA16.f10066b, aVar18), aVar18), j18, h0.f13629a);
                        float f11114 = 44;
                        androidx.compose.ui.h hVarE16 = W.e(W.q(hVarB16, f11114), f11114);
                        E eD16 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarE16);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f11115 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD16);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                        int i2111 = i12 >> 12;
                        long j2110 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2111 & 896) | (i2111 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j2110;
                        j24 = j19;
                        f13 = f11115;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.r0();
                        i21 = i10 & 1;
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        } else {
                            if (i25 != 0) {
                                hVar2 = aVar;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i13 != 0) {
                                j15 = H.f13495b;
                            } else {
                                j15 = j;
                            }
                            if (i15 != 0) {
                                f12 = 1;
                            } else {
                                f12 = f11;
                            }
                            if (i17 != 0) {
                                j16 = H.f13499f;
                            } else {
                                j16 = j10;
                            }
                            if (i19 != 0) {
                                lVar2 = l.f15442g;
                            } else {
                                lVar2 = lVar;
                            }
                            if ((i11 & 64) != 0) {
                                jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                                i12 &= -3670017;
                            } else {
                                jM658generateTextColor8_81llA = j11;
                            }
                            if ((i11 & 128) != 0) {
                                j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                                i12 &= -29360129;
                            }
                            lVar3 = lVar2;
                            j17 = j14;
                            j18 = j16;
                            j19 = j15;
                            j20 = jM658generateTextColor8_81llA;
                            hVar3 = hVar2;
                        }
                        c1086gP.U();
                        p270w.a aVar19 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        C0937i c0937iA17 = C1787c0.a(f12, j19);
                        androidx.compose.ui.h hVarB17 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA17.f10065a, c0937iA17.f10066b, aVar19), aVar19), j18, h0.f13629a);
                        float f11116 = 44;
                        androidx.compose.ui.h hVarE17 = W.e(W.q(hVarB17, f11116), f11116);
                        E eD17 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i22 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                        androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarE17);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        float f11117 = f12;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD17);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                        pVar = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        } else {
                            J4.i.d(i22, c1086gP, i22, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC17);
                        int i2112 = i12 >> 12;
                        long j2111 = j18;
                        TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2112 & 896) | (i2112 & 7168) | (i12 & 458752), 0, 131024);
                        c1086g = c1086gP;
                        c1086g.T(true);
                        lVar4 = lVar3;
                        j21 = j20;
                        j22 = j17;
                        j23 = j2111;
                        j24 = j19;
                        f13 = f11117;
                        hVar4 = hVar3;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                j13 = j10;
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar110 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA18 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB18 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA18.f10065a, c0937iA18.f10066b, aVar110), aVar110), j18, h0.f13629a);
                    float f11118 = 44;
                    androidx.compose.ui.h hVarE18 = W.e(W.q(hVarB18, f11118), f11118);
                    E eD18 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarE18);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f11119 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD18);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                    int i2113 = i12 >> 12;
                    long j2112 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2113 & 896) | (i2113 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2112;
                    j24 = j19;
                    f13 = f11119;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar111 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA19 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB19 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA19.f10065a, c0937iA19.f10066b, aVar111), aVar111), j18, h0.f13629a);
                    float f111110 = 44;
                    androidx.compose.ui.h hVarE19 = W.e(W.q(hVarB19, f111110), f111110);
                    E eD19 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                    androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVarE19);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f111111 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC19);
                    int i2114 = i12 >> 12;
                    long j2113 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2114 & 896) | (i2114 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2113;
                    j24 = j19;
                    f13 = f111111;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            f11 = f10;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    j13 = j10;
                    if (c1086gP.i(j13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar112 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA110 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB110 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA110.f10065a, c0937iA110.f10066b, aVar112), aVar112), j18, h0.f13629a);
                    float f111112 = 44;
                    androidx.compose.ui.h hVarE110 = W.e(W.q(hVarB110, f111112), f111112);
                    E eD110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarE110);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f111113 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    int i2115 = i12 >> 12;
                    long j2114 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2115 & 896) | (i2115 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2114;
                    j24 = j19;
                    f13 = f111113;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar113 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA111 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB111 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA111.f10065a, c0937iA111.f10066b, aVar113), aVar113), j18, h0.f13629a);
                    float f111114 = 44;
                    androidx.compose.ui.h hVarE111 = W.e(W.q(hVarB111, f111114), f111114);
                    E eD111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarE111);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f111115 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD111);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111);
                    int i2116 = i12 >> 12;
                    long j2115 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2116 & 896) | (i2116 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2115;
                    j24 = j19;
                    f13 = f111115;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            j13 = j10;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.K(lVar)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((29360128 & i10) == 0) {
                j14 = j12;
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            } else {
                j14 = j12;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar114 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA112 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB112 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA112.f10065a, c0937iA112.f10066b, aVar114), aVar114), j18, h0.f13629a);
                float f111116 = 44;
                androidx.compose.ui.h hVarE112 = W.e(W.q(hVarB112, f111116), f111116);
                E eD112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarE112);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f111117 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD112);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                int i2117 = i12 >> 12;
                long j2116 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2117 & 896) | (i2117 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j2116;
                j24 = j19;
                f13 = f111117;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar115 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA113 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB113 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA113.f10065a, c0937iA113.f10066b, aVar115), aVar115), j18, h0.f13629a);
                float f111118 = 44;
                androidx.compose.ui.h hVarE113 = W.e(W.q(hVarB113, f111118), f111118);
                E eD113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarE113);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f111119 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD113);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC113);
                int i2118 = i12 >> 12;
                long j2117 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2118 & 896) | (i2118 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j2117;
                j24 = j19;
                f13 = f111119;
                hVar4 = hVar3;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                f11 = f10;
                if (c1086gP.g(f11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    j13 = j10;
                    if (c1086gP.i(j13)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 458752) == 0) {
                    if (c1086gP.K(lVar)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i24 = 524288;
                    } else {
                        i24 = 524288;
                    }
                    i12 |= i24;
                }
                if ((29360128 & i10) == 0) {
                    j14 = j12;
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                } else {
                    j14 = j12;
                }
                if ((23967451 & i12) == 4793490) {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar116 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA114 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB114 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA114.f10065a, c0937iA114.f10066b, aVar116), aVar116), j18, h0.f13629a);
                    float f1111110 = 44;
                    androidx.compose.ui.h hVarE114 = W.e(W.q(hVarB114, f1111110), f1111110);
                    E eD114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarE114);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1111111 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD114);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                    int i2119 = i12 >> 12;
                    long j2118 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i2119 & 896) | (i2119 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2118;
                    j24 = j19;
                    f13 = f1111111;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    i21 = i10 & 1;
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    } else {
                        if (i25 != 0) {
                            hVar2 = aVar;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i13 != 0) {
                            j15 = H.f13495b;
                        } else {
                            j15 = j;
                        }
                        if (i15 != 0) {
                            f12 = 1;
                        } else {
                            f12 = f11;
                        }
                        if (i17 != 0) {
                            j16 = H.f13499f;
                        } else {
                            j16 = j10;
                        }
                        if (i19 != 0) {
                            lVar2 = l.f15442g;
                        } else {
                            lVar2 = lVar;
                        }
                        if ((i11 & 64) != 0) {
                            jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                            i12 &= -3670017;
                        } else {
                            jM658generateTextColor8_81llA = j11;
                        }
                        if ((i11 & 128) != 0) {
                            j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                            i12 &= -29360129;
                        }
                        lVar3 = lVar2;
                        j17 = j14;
                        j18 = j16;
                        j19 = j15;
                        j20 = jM658generateTextColor8_81llA;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    p270w.a aVar117 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    C0937i c0937iA115 = C1787c0.a(f12, j19);
                    androidx.compose.ui.h hVarB115 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA115.f10065a, c0937iA115.f10066b, aVar117), aVar117), j18, h0.f13629a);
                    float f1111112 = 44;
                    androidx.compose.ui.h hVarE115 = W.e(W.q(hVarB115, f1111112), f1111112);
                    E eD115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                    i22 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarE115);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    float f1111113 = f12;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD115);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    } else {
                        J4.i.d(i22, c1086gP, i22, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC115);
                    int i21110 = i12 >> 12;
                    long j2119 = j18;
                    TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21110 & 896) | (i21110 & 7168) | (i12 & 458752), 0, 131024);
                    c1086g = c1086gP;
                    c1086g.T(true);
                    lVar4 = lVar3;
                    j21 = j20;
                    j22 = j17;
                    j23 = j2119;
                    j24 = j19;
                    f13 = f1111113;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            j13 = j10;
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.K(lVar)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((29360128 & i10) == 0) {
                j14 = j12;
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            } else {
                j14 = j12;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar118 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA116 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB116 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA116.f10065a, c0937iA116.f10066b, aVar118), aVar118), j18, h0.f13629a);
                float f1111114 = 44;
                androidx.compose.ui.h hVarE116 = W.e(W.q(hVarB116, f1111114), f1111114);
                E eD116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarE116);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f1111115 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD116);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                int i21111 = i12 >> 12;
                long j21110 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21111 & 896) | (i21111 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j21110;
                j24 = j19;
                f13 = f1111115;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar119 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA117 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB117 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA117.f10065a, c0937iA117.f10066b, aVar119), aVar119), j18, h0.f13629a);
                float f1111116 = 44;
                androidx.compose.ui.h hVarE117 = W.e(W.q(hVarB117, f1111116), f1111116);
                E eD117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVarE117);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f1111117 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD117);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC117);
                int i21112 = i12 >> 12;
                long j21111 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21112 & 896) | (i21112 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j21111;
                j24 = j19;
                f13 = f1111117;
                hVar4 = hVar3;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        f11 = f10;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                j13 = j10;
                if (c1086gP.i(j13)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 458752) == 0) {
                if (c1086gP.K(lVar)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i24 = 524288;
                } else {
                    i24 = 524288;
                }
                i12 |= i24;
            }
            if ((29360128 & i10) == 0) {
                j14 = j12;
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            } else {
                j14 = j12;
            }
            if ((23967451 & i12) == 4793490) {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar1110 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA118 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB118 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA118.f10065a, c0937iA118.f10066b, aVar1110), aVar1110), j18, h0.f13629a);
                float f1111118 = 44;
                androidx.compose.ui.h hVarE118 = W.e(W.q(hVarB118, f1111118), f1111118);
                E eD118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarE118);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f1111119 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                int i21113 = i12 >> 12;
                long j21112 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21113 & 896) | (i21113 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j21112;
                j24 = j19;
                f13 = f1111119;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                i21 = i10 & 1;
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                } else {
                    if (i25 != 0) {
                        hVar2 = aVar;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i13 != 0) {
                        j15 = H.f13495b;
                    } else {
                        j15 = j;
                    }
                    if (i15 != 0) {
                        f12 = 1;
                    } else {
                        f12 = f11;
                    }
                    if (i17 != 0) {
                        j16 = H.f13499f;
                    } else {
                        j16 = j10;
                    }
                    if (i19 != 0) {
                        lVar2 = l.f15442g;
                    } else {
                        lVar2 = lVar;
                    }
                    if ((i11 & 64) != 0) {
                        jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                        i12 &= -3670017;
                    } else {
                        jM658generateTextColor8_81llA = j11;
                    }
                    if ((i11 & 128) != 0) {
                        j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                        i12 &= -29360129;
                    }
                    lVar3 = lVar2;
                    j17 = j14;
                    j18 = j16;
                    j19 = j15;
                    j20 = jM658generateTextColor8_81llA;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                p270w.a aVar1111 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                C0937i c0937iA119 = C1787c0.a(f12, j19);
                androidx.compose.ui.h hVarB119 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA119.f10065a, c0937iA119.f10066b, aVar1111), aVar1111), j18, h0.f13629a);
                float f11111110 = 44;
                androidx.compose.ui.h hVarE119 = W.e(W.q(hVarB119, f11111110), f11111110);
                E eD119 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                i22 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVarE119);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                float f11111111 = f12;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD119);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i22, c1086gP, i22, pVar);
                } else {
                    J4.i.d(i22, c1086gP, i22, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC119);
                int i21114 = i12 >> 12;
                long j21113 = j18;
                TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21114 & 896) | (i21114 & 7168) | (i12 & 458752), 0, 131024);
                c1086g = c1086gP;
                c1086g.T(true);
                lVar4 = lVar3;
                j21 = j20;
                j22 = j17;
                j23 = j21113;
                j24 = j19;
                f13 = f11111111;
                hVar4 = hVar3;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        j13 = j10;
        i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((i10 & 458752) == 0) {
            if (c1086gP.K(lVar)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i24 = 524288;
            } else {
                i24 = 524288;
            }
            i12 |= i24;
        }
        if ((29360128 & i10) == 0) {
            j14 = j12;
            if ((i11 & 128) == 0) {
                i23 = 4194304;
            } else {
                i23 = 4194304;
            }
            i12 |= i23;
        } else {
            j14 = j12;
        }
        if ((23967451 & i12) == 4793490) {
            c1086gP.r0();
            i21 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                if (i25 != 0) {
                    hVar2 = aVar;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    j15 = H.f13495b;
                } else {
                    j15 = j;
                }
                if (i15 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i17 != 0) {
                    j16 = H.f13499f;
                } else {
                    j16 = j10;
                }
                if (i19 != 0) {
                    lVar2 = l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 64) != 0) {
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                    i12 &= -3670017;
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                if ((i11 & 128) != 0) {
                    j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                    i12 &= -29360129;
                }
                lVar3 = lVar2;
                j17 = j14;
                j18 = j16;
                j19 = j15;
                j20 = jM658generateTextColor8_81llA;
                hVar3 = hVar2;
            } else {
                if (i25 != 0) {
                    hVar2 = aVar;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    j15 = H.f13495b;
                } else {
                    j15 = j;
                }
                if (i15 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i17 != 0) {
                    j16 = H.f13499f;
                } else {
                    j16 = j10;
                }
                if (i19 != 0) {
                    lVar2 = l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 64) != 0) {
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                    i12 &= -3670017;
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                if ((i11 & 128) != 0) {
                    j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                    i12 &= -29360129;
                }
                lVar3 = lVar2;
                j17 = j14;
                j18 = j16;
                j19 = j15;
                j20 = jM658generateTextColor8_81llA;
                hVar3 = hVar2;
            }
            c1086gP.U();
            p270w.a aVar1112 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
            C0937i c0937iA1110 = C1787c0.a(f12, j19);
            androidx.compose.ui.h hVarB1110 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA1110.f10065a, c0937iA1110.f10066b, aVar1112), aVar1112), j18, h0.f13629a);
            float f11111112 = 44;
            androidx.compose.ui.h hVarE1110 = W.e(W.q(hVarB1110, f11111112), f11111112);
            E eD1110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i22 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarE1110);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            float f11111113 = f12;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD1110);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i22, c1086gP, i22, pVar);
            } else {
                J4.i.d(i22, c1086gP, i22, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
            int i21115 = i12 >> 12;
            long j21114 = j18;
            TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21115 & 896) | (i21115 & 7168) | (i12 & 458752), 0, 131024);
            c1086g = c1086gP;
            c1086g.T(true);
            lVar4 = lVar3;
            j21 = j20;
            j22 = j17;
            j23 = j21114;
            j24 = j19;
            f13 = f11111113;
            hVar4 = hVar3;
        } else {
            c1086gP.r0();
            i21 = i10 & 1;
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                if (i25 != 0) {
                    hVar2 = aVar;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    j15 = H.f13495b;
                } else {
                    j15 = j;
                }
                if (i15 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i17 != 0) {
                    j16 = H.f13499f;
                } else {
                    j16 = j10;
                }
                if (i19 != 0) {
                    lVar2 = l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 64) != 0) {
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                    i12 &= -3670017;
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                if ((i11 & 128) != 0) {
                    j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                    i12 &= -29360129;
                }
                lVar3 = lVar2;
                j17 = j14;
                j18 = j16;
                j19 = j15;
                j20 = jM658generateTextColor8_81llA;
                hVar3 = hVar2;
            } else {
                if (i25 != 0) {
                    hVar2 = aVar;
                } else {
                    hVar2 = hVar;
                }
                if (i13 != 0) {
                    j15 = H.f13495b;
                } else {
                    j15 = j;
                }
                if (i15 != 0) {
                    f12 = 1;
                } else {
                    f12 = f11;
                }
                if (i17 != 0) {
                    j16 = H.f13499f;
                } else {
                    j16 = j10;
                }
                if (i19 != 0) {
                    lVar2 = l.f15442g;
                } else {
                    lVar2 = lVar;
                }
                if ((i11 & 64) != 0) {
                    jM658generateTextColor8_81llA = ColorExtensionsKt.m658generateTextColor8_81llA(j16);
                    i12 &= -3670017;
                } else {
                    jM658generateTextColor8_81llA = j11;
                }
                if ((i11 & 128) != 0) {
                    j14 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04().f15318a.f15691b;
                    i12 &= -29360129;
                }
                lVar3 = lVar2;
                j17 = j14;
                j18 = j16;
                j19 = j15;
                j20 = jM658generateTextColor8_81llA;
                hVar3 = hVar2;
            }
            c1086gP.U();
            p270w.a aVar1113 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
            C0937i c0937iA1111 = C1787c0.a(f12, j19);
            androidx.compose.ui.h hVarB1111 = C0932d.b(A8.p.r(C0935g.b(hVar3, c0937iA1111.f10065a, c0937iA1111.f10066b, aVar1113), aVar1113), j18, h0.f13629a);
            float f11111114 = 44;
            androidx.compose.ui.h hVarE1111 = W.e(W.q(hVarB1111, f11111114), f11111114);
            E eD1111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            i22 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
            androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarE1111);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            float f11111115 = f12;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD1111);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1111);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i22, c1086gP, i22, pVar);
            } else {
                J4.i.d(i22, c1086gP, i22, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111);
            int i21116 = i12 >> 12;
            long j21115 = j18;
            TextKt.b(content, C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), j20, j17, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | (i21116 & 896) | (i21116 & 7168) | (i12 & 458752), 0, 131024);
            c1086g = c1086gP;
            c1086g.T(true);
            lVar4 = lVar3;
            j21 = j20;
            j22 = j17;
            j23 = j21115;
            j24 = j19;
            f13 = f11111115;
            hVar4 = hVar3;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return NumericRatingCellKt.NumericRatingCell_jWvj134$lambda$1(content, hVar4, j24, f13, j23, lVar4, j21, j22, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NumericRatingCell_jWvj134$lambda$1(String content, androidx.compose.ui.h hVar, long j, float f10, long j10, l lVar, long j11, long j12, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(content, "$content");
        m444NumericRatingCelljWvj134(content, hVar, j, f10, j10, lVar, j11, j12, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
