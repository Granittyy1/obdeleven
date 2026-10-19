package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0942b;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.models.AttributeType;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12314d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12317g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12311a = 600;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12312b = 30;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12313c = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12315e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f12316f = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12318h = 12;

    static {
        float f10 = 8;
        f12314d = f10;
        f12317g = f10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:106:0x0129  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0138  */
    /* JADX WARN: Code duplicated, block: B:115:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x0167  */
    /* JADX WARN: Code duplicated, block: B:136:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:137:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:146:0x01af  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x0204  */
    /* JADX WARN: Code duplicated, block: B:174:0x0263  */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0111  */
    public static final void a(androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, boolean z10, androidx.compose.ui.graphics.l0 l0Var, long j, long j10, long j11, long j12, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        int i14;
        int i15;
        boolean z11;
        int i16;
        long jD;
        int i17;
        androidx.compose.ui.h hVar3;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        boolean z12;
        androidx.compose.ui.graphics.l0 l0VarA;
        long jD2;
        long jD3;
        long jD4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        long j13;
        final boolean z13;
        final androidx.compose.ui.graphics.l0 l0Var2;
        final androidx.compose.ui.h hVar4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        C1105p0 c1105p0V;
        int i18;
        int i19;
        C1086g c1086gP = interfaceC1084f.p(-1235788955);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i21 = 2 & i11;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                pVar4 = pVar;
                i12 |= c1086gP.k(pVar4) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    pVar5 = pVar2;
                    if (c1086gP.k(pVar5)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z11 = z10;
                        if (c1086gP.c(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) != 0) {
                        i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
                    }
                    if ((i10 & 196608) == 0) {
                        jD = j;
                        if ((i11 & 32) == 0 || !c1086gP.i(jD)) {
                            i19 = 65536;
                        } else {
                            i19 = 131072;
                        }
                        i12 |= i19;
                    } else {
                        jD = j;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0 || !c1086gP.i(j10)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                    }
                    if ((i10 & 100663296) != 0) {
                        i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i12 |= i17;
                    }
                    if ((306783379 & i12) == 306783378 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i20 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i21 != 0) {
                                pVar4 = null;
                            }
                            pVar6 = i13 == 0 ? pVar5 : null;
                            if (i15 != 0) {
                                z12 = false;
                            } else {
                                z12 = z11;
                            }
                            if ((16 & i11) != 0) {
                                l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                                i12 &= -57345;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((32 & i11) != 0) {
                                float f10 = B.w.f1377a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                                i12 &= -3670017;
                            } else {
                                jD2 = j10;
                            }
                            if ((128 & i11) != 0) {
                                float f11 = B.w.f1377a;
                                jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jD3 = j11;
                            }
                            if ((256 & i11) != 0) {
                                jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jD4 = j12;
                            }
                        } else {
                            c1086gP.w();
                            if ((16 & i11) != 0) {
                                i12 &= -57345;
                            }
                            if ((32 & i11) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((128 & i11) != 0) {
                                i12 &= -29360129;
                            }
                            if ((256 & i11) != 0) {
                                i12 &= -234881025;
                            }
                            l0VarA = l0Var;
                            jD3 = j11;
                            jD4 = j12;
                            hVar3 = hVar2;
                            pVar6 = pVar5;
                            z12 = z11;
                            jD2 = j10;
                        }
                        c1086gP.U();
                        final boolean z14 = z12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10 = pVar6;
                        final long j14 = jD3;
                        final long j15 = jD4;
                        int i22 = (i12 & 14) | 12779520;
                        int i23 = i12 >> 9;
                        SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                    final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                    C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                    final boolean z15 = z14;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar9;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar3;
                                    final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar13 = pVar10;
                                    final long j16 = j14;
                                    final long j17 = j15;
                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else if (!z15 || pVar11 == null) {
                                                interfaceC1084f5.L(-810701708);
                                                SnackbarKt.d(pVar12, pVar11, pVar13, fA2, j16, j17, interfaceC1084f5, 0);
                                                interfaceC1084f5.D();
                                            } else {
                                                interfaceC1084f5.L(-810715387);
                                                SnackbarKt.c(pVar12, pVar11, pVar13, fA2, j16, j17, interfaceC1084f5, 0);
                                                interfaceC1084f5.D();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i23 & 896) | i22 | (i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i23 & 7168), 80);
                        pVar7 = pVar6;
                        j13 = jD;
                        z13 = z12;
                        l0Var2 = l0VarA;
                        hVar4 = hVar3;
                        pVar8 = pVar4;
                    } else {
                        c1086gP.w();
                        jD3 = j11;
                        jD4 = j12;
                        hVar4 = hVar2;
                        pVar8 = pVar4;
                        pVar7 = pVar5;
                        jD2 = j10;
                        j13 = jD;
                        z13 = z11;
                        l0Var2 = l0Var;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final long j16 = j13;
                        final long j17 = jD2;
                        final long j18 = jD3;
                        final long j19 = jD4;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j16, j17, j18, j19, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
                }
                if ((i10 & 196608) == 0) {
                    jD = j;
                    if ((i11 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                } else {
                    jD = j;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i18 = 524288;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f12 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f13 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f14 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f15 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z15 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar6;
                    final long j110 = jD3;
                    final long j111 = jD4;
                    int i24 = (i12 & 14) | 12779520;
                    int i25 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z16 = z15;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar11;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar12;
                                final long j112 = j110;
                                final long j113 = j111;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z16 || pVar13 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar14, pVar13, pVar15, fA2, j112, j113, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar14, pVar13, pVar15, fA2, j112, j113, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i25 & 896) | i24 | (i25 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i25 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f16 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f17 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f18 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f19 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z16 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar6;
                    final long j112 = jD3;
                    final long j113 = jD4;
                    int i26 = (i12 & 14) | 12779520;
                    int i27 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z17 = z16;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar13;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar14;
                                final long j114 = j112;
                                final long j115 = j113;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z17 || pVar15 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar16, pVar15, pVar17, fA2, j114, j115, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar16, pVar15, pVar17, fA2, j114, j115, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i27 & 896) | i26 | (i27 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i27 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j114 = j13;
                    final long j115 = jD2;
                    final long j116 = jD3;
                    final long j117 = jD4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j114, j115, j116, j117, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            pVar5 = pVar2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
                }
                if ((i10 & 196608) == 0) {
                    jD = j;
                    if ((i11 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                } else {
                    jD = j;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i18 = 524288;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f110 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f111 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f112 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f113 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z17 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar6;
                    final long j118 = jD3;
                    final long j119 = jD4;
                    int i28 = (i12 & 14) | 12779520;
                    int i29 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z18 = z17;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar15;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar16;
                                final long j1110 = j118;
                                final long j1111 = j119;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z18 || pVar17 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar18, pVar17, pVar19, fA2, j1110, j1111, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar18, pVar17, pVar19, fA2, j1110, j1111, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i29 & 896) | i28 | (i29 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i29 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f114 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f115 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f116 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f117 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z18 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar6;
                    final long j1110 = jD3;
                    final long j1111 = jD4;
                    int i210 = (i12 & 14) | 12779520;
                    int i211 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z19 = z18;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar17;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar18;
                                final long j1112 = j1110;
                                final long j1113 = j1111;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z19 || pVar19 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar110, pVar19, pVar111, fA2, j1112, j1113, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar110, pVar19, pVar111, fA2, j1112, j1113, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i211 & 896) | i210 | (i211 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i211 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j1112 = j13;
                    final long j1113 = jD2;
                    final long j1114 = jD3;
                    final long j1115 = jD4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j1112, j1113, j1114, j1115, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
            }
            if ((i10 & 196608) == 0) {
                jD = j;
                if ((i11 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            } else {
                jD = j;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar3)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f118 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f119 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f1110 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f1111 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z19 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar6;
                final long j1116 = jD3;
                final long j1117 = jD4;
                int i212 = (i12 & 14) | 12779520;
                int i213 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z110 = z19;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar19;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar110;
                            final long j1118 = j1116;
                            final long j1119 = j1117;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z110 || pVar111 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar112, pVar111, pVar113, fA2, j1118, j1119, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar112, pVar111, pVar113, fA2, j1118, j1119, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i213 & 896) | i212 | (i213 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i213 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f1112 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f1113 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f1114 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f1115 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z110 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar6;
                final long j1118 = jD3;
                final long j1119 = jD4;
                int i214 = (i12 & 14) | 12779520;
                int i215 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z111 = z110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar112;
                            final long j11110 = j1118;
                            final long j11111 = j1119;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z111 || pVar113 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar114, pVar113, pVar115, fA2, j11110, j11111, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar114, pVar113, pVar115, fA2, j11110, j11111, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i215 & 896) | i214 | (i215 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i215 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j11110 = j13;
                final long j11111 = jD2;
                final long j11112 = jD3;
                final long j11113 = jD4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j11110, j11111, j11112, j11113, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        pVar4 = pVar;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                pVar5 = pVar2;
                if (c1086gP.k(pVar5)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
                }
                if ((i10 & 196608) == 0) {
                    jD = j;
                    if ((i11 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                } else {
                    jD = j;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i18 = 524288;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i12 |= i17;
                }
                if ((306783379 & i12) == 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f1116 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f1117 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f1118 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f1119 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z111 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar6;
                    final long j11114 = jD3;
                    final long j11115 = jD4;
                    int i216 = (i12 & 14) | 12779520;
                    int i217 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z112 = z111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar114;
                                final long j11116 = j11114;
                                final long j11117 = j11115;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z112 || pVar115 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar116, pVar115, pVar117, fA2, j11116, j11117, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar116, pVar115, pVar117, fA2, j11116, j11117, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i217 & 896) | i216 | (i217 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i217 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f11110 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f11111 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    } else {
                        if (i20 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        }
                        if (i13 == 0) {
                        }
                        if (i15 != 0) {
                            z12 = false;
                        } else {
                            z12 = z11;
                        }
                        if ((16 & i11) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -57345;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((32 & i11) != 0) {
                            float f11112 = B.w.f1377a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD2 = j10;
                        }
                        if ((128 & i11) != 0) {
                            float f11113 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD3 = j11;
                        }
                        if ((256 & i11) != 0) {
                            jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jD4 = j12;
                        }
                    }
                    c1086gP.U();
                    final boolean z112 = z12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar6;
                    final long j11116 = jD3;
                    final long j11117 = jD4;
                    int i218 = (i12 & 14) | 12779520;
                    int i219 = i12 >> 9;
                    SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                                final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                                C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                                final boolean z113 = z112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar116;
                                final long j11118 = j11116;
                                final long j11119 = j11117;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else if (!z113 || pVar117 == null) {
                                            interfaceC1084f5.L(-810701708);
                                            SnackbarKt.d(pVar118, pVar117, pVar119, fA2, j11118, j11119, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        } else {
                                            interfaceC1084f5.L(-810715387);
                                            SnackbarKt.c(pVar118, pVar117, pVar119, fA2, j11118, j11119, interfaceC1084f5, 0);
                                            interfaceC1084f5.D();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i219 & 896) | i218 | (i219 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i219 & 7168), 80);
                    pVar7 = pVar6;
                    j13 = jD;
                    z13 = z12;
                    l0Var2 = l0VarA;
                    hVar4 = hVar3;
                    pVar8 = pVar4;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j11118 = j13;
                    final long j11119 = jD2;
                    final long j111110 = jD3;
                    final long j111111 = jD4;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j11118, j11119, j111110, j111111, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
            }
            if ((i10 & 196608) == 0) {
                jD = j;
                if ((i11 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            } else {
                jD = j;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar3)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f11114 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f11115 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f11116 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f11117 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z113 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar6;
                final long j111112 = jD3;
                final long j111113 = jD4;
                int i2110 = (i12 & 14) | 12779520;
                int i2111 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z114 = z113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar117;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar118;
                            final long j111114 = j111112;
                            final long j111115 = j111113;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z114 || pVar119 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar1110, pVar119, pVar1111, fA2, j111114, j111115, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar1110, pVar119, pVar1111, fA2, j111114, j111115, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2111 & 896) | i2110 | (i2111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2111 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f11118 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f11119 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f111110 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f111111 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z114 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar6;
                final long j111114 = jD3;
                final long j111115 = jD4;
                int i2112 = (i12 & 14) | 12779520;
                int i2113 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z115 = z114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar1110;
                            final long j111116 = j111114;
                            final long j111117 = j111115;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z115 || pVar1111 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar1112, pVar1111, pVar1113, fA2, j111116, j111117, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar1112, pVar1111, pVar1113, fA2, j111116, j111117, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2113 & 896) | i2112 | (i2113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2113 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j111116 = j13;
                final long j111117 = jD2;
                final long j111118 = jD3;
                final long j111119 = jD4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j111116, j111117, j111118, j111119, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        pVar5 = pVar2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
            }
            if ((i10 & 196608) == 0) {
                jD = j;
                if ((i11 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            } else {
                jD = j;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i18 = 524288;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar3)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i12 |= i17;
            }
            if ((306783379 & i12) == 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f111112 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f111113 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f111114 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f111115 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z115 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar6;
                final long j1111110 = jD3;
                final long j1111111 = jD4;
                int i2114 = (i12 & 14) | 12779520;
                int i2115 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z116 = z115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar1111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar1112;
                            final long j1111112 = j1111110;
                            final long j1111113 = j1111111;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z116 || pVar1113 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar1114, pVar1113, pVar1115, fA2, j1111112, j1111113, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar1114, pVar1113, pVar1115, fA2, j1111112, j1111113, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2115 & 896) | i2114 | (i2115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2115 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f111116 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f111117 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                } else {
                    if (i20 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    }
                    if (i13 == 0) {
                    }
                    if (i15 != 0) {
                        z12 = false;
                    } else {
                        z12 = z11;
                    }
                    if ((16 & i11) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -57345;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((32 & i11) != 0) {
                        float f111118 = B.w.f1377a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD2 = j10;
                    }
                    if ((128 & i11) != 0) {
                        float f111119 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD3 = j11;
                    }
                    if ((256 & i11) != 0) {
                        jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jD4 = j12;
                    }
                }
                c1086gP.U();
                final boolean z116 = z12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar6;
                final long j1111112 = jD3;
                final long j1111113 = jD4;
                int i2116 = (i12 & 14) | 12779520;
                int i2117 = i12 >> 9;
                SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                            final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                            C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                            final boolean z117 = z116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar1113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar1114;
                            final long j1111114 = j1111112;
                            final long j1111115 = j1111113;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else if (!z117 || pVar1115 == null) {
                                        interfaceC1084f5.L(-810701708);
                                        SnackbarKt.d(pVar1116, pVar1115, pVar1117, fA2, j1111114, j1111115, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    } else {
                                        interfaceC1084f5.L(-810715387);
                                        SnackbarKt.c(pVar1116, pVar1115, pVar1117, fA2, j1111114, j1111115, interfaceC1084f5, 0);
                                        interfaceC1084f5.D();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i2117 & 896) | i2116 | (i2117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2117 & 7168), 80);
                pVar7 = pVar6;
                j13 = jD;
                z13 = z12;
                l0Var2 = l0VarA;
                hVar4 = hVar3;
                pVar8 = pVar4;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j1111114 = j13;
                final long j1111115 = jD2;
                final long j1111116 = jD3;
                final long j1111117 = jD4;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j1111114, j1111115, j1111116, j1111117, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) != 0) {
            i12 |= ((i11 & 16) == 0 || !c1086gP.K(l0Var)) ? 8192 : 16384;
        }
        if ((i10 & 196608) == 0) {
            jD = j;
            if ((i11 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i12 |= i19;
        } else {
            jD = j;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i18 = 524288;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i10 & 12582912) != 0) {
            i12 |= ((i11 & 128) == 0 || !c1086gP.i(j11)) ? 4194304 : 8388608;
        }
        if ((i10 & 100663296) != 0) {
            i12 |= ((i11 & 256) == 0 || !c1086gP.i(j12)) ? 33554432 : 67108864;
        }
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(pVar3)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i12 |= i17;
        }
        if ((306783379 & i12) == 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((16 & i11) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -57345;
                } else {
                    l0VarA = l0Var;
                }
                if ((32 & i11) != 0) {
                    float f1111110 = B.w.f1377a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD2 = j10;
                }
                if ((128 & i11) != 0) {
                    float f1111111 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD3 = j11;
                }
                if ((256 & i11) != 0) {
                    jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    i12 &= -234881025;
                } else {
                    jD4 = j12;
                }
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((16 & i11) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -57345;
                } else {
                    l0VarA = l0Var;
                }
                if ((32 & i11) != 0) {
                    float f1111112 = B.w.f1377a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD2 = j10;
                }
                if ((128 & i11) != 0) {
                    float f1111113 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD3 = j11;
                }
                if ((256 & i11) != 0) {
                    jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    i12 &= -234881025;
                } else {
                    jD4 = j12;
                }
            }
            c1086gP.U();
            final boolean z117 = z12;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar4;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar6;
            final long j1111118 = jD3;
            final long j1111119 = jD4;
            int i2118 = (i12 & 14) | 12779520;
            int i2119 = i12 >> 9;
            SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                        final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                        C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                        final boolean z118 = z117;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar1115;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar3;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar1116;
                        final long j11111110 = j1111118;
                        final long j11111111 = j1111119;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else if (!z118 || pVar1117 == null) {
                                    interfaceC1084f5.L(-810701708);
                                    SnackbarKt.d(pVar1118, pVar1117, pVar1119, fA2, j11111110, j11111111, interfaceC1084f5, 0);
                                    interfaceC1084f5.D();
                                } else {
                                    interfaceC1084f5.L(-810715387);
                                    SnackbarKt.c(pVar1118, pVar1117, pVar1119, fA2, j11111110, j11111111, interfaceC1084f5, 0);
                                    interfaceC1084f5.D();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i2119 & 896) | i2118 | (i2119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2119 & 7168), 80);
            pVar7 = pVar6;
            j13 = jD;
            z13 = z12;
            l0Var2 = l0VarA;
            hVar4 = hVar3;
            pVar8 = pVar4;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((16 & i11) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -57345;
                } else {
                    l0VarA = l0Var;
                }
                if ((32 & i11) != 0) {
                    float f1111114 = B.w.f1377a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD2 = j10;
                }
                if ((128 & i11) != 0) {
                    float f1111115 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD3 = j11;
                }
                if ((256 & i11) != 0) {
                    jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    i12 &= -234881025;
                } else {
                    jD4 = j12;
                }
            } else {
                if (i20 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i21 != 0) {
                    pVar4 = null;
                }
                if (i13 == 0) {
                }
                if (i15 != 0) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                if ((16 & i11) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -57345;
                } else {
                    l0VarA = l0Var;
                }
                if ((32 & i11) != 0) {
                    float f1111116 = B.w.f1377a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    jD2 = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD2 = j10;
                }
                if ((128 & i11) != 0) {
                    float f1111117 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12712d, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD3 = j11;
                }
                if ((256 & i11) != 0) {
                    jD4 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    i12 &= -234881025;
                } else {
                    jD4 = j12;
                }
            }
            c1086gP.U();
            final boolean z118 = z12;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar4;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar6;
            final long j11111110 = jD3;
            final long j11111111 = jD4;
            int i21110 = (i12 & 14) | 12779520;
            int i21111 = i12 >> 9;
            SurfaceKt.a(hVar3, l0VarA, jD, jD2, 0.0f, B.w.f1377a, null, androidx.compose.runtime.internal.a.b(-1829663446, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.text.F fA = TypographyKt.a(B.w.f1381e, interfaceC1084f3);
                        final androidx.compose.ui.text.F fA2 = TypographyKt.a(TypographyKeyTokens.f12747g, interfaceC1084f3);
                        C1101n0 c1101n0B = TextKt.f12383a.b(fA);
                        final boolean z119 = z118;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar1117;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar3;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar1118;
                        final long j11111112 = j11111110;
                        final long j11111113 = j11111111;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(835891690, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                if ((num2.intValue() & 3) == 2 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else if (!z119 || pVar1119 == null) {
                                    interfaceC1084f5.L(-810701708);
                                    SnackbarKt.d(pVar11110, pVar1119, pVar11111, fA2, j11111112, j11111113, interfaceC1084f5, 0);
                                    interfaceC1084f5.D();
                                } else {
                                    interfaceC1084f5.L(-810715387);
                                    SnackbarKt.c(pVar11110, pVar1119, pVar11111, fA2, j11111112, j11111113, interfaceC1084f5, 0);
                                    interfaceC1084f5.D();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i21111 & 896) | i21110 | (i21111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i21111 & 7168), 80);
            pVar7 = pVar6;
            j13 = jD;
            z13 = z12;
            l0Var2 = l0VarA;
            hVar4 = hVar3;
            pVar8 = pVar4;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j11111112 = j13;
            final long j11111113 = jD2;
            final long j11111114 = jD3;
            final long j11111115 = jD4;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.a(hVar4, pVar8, pVar7, z13, l0Var2, j11111112, j11111113, j11111114, j11111115, pVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012a  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:129:0x0186  */
    /* JADX WARN: Code duplicated, block: B:131:0x0189  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0199  */
    /* JADX WARN: Code duplicated, block: B:139:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01df  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x0206  */
    /* JADX WARN: Code duplicated, block: B:163:0x0214  */
    /* JADX WARN: Code duplicated, block: B:166:0x0229  */
    /* JADX WARN: Code duplicated, block: B:167:0x023b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0296  */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:96:0x0106  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    public static final void b(final f0 f0Var, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, long j, long j10, long j11, long j12, long j13, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0Var2;
        long jD;
        int i15;
        long j14;
        androidx.compose.ui.h hVar3;
        androidx.compose.ui.graphics.l0 l0VarA;
        long jD2;
        int i16;
        ColorSchemeKeyTokens colorSchemeKeyTokens;
        long jD3;
        long jD4;
        long jD5;
        int i17;
        long j15;
        final long j16;
        final String strB;
        ComposableLambdaImpl composableLambdaImplB;
        boolean z12;
        ComposableLambdaImpl composableLambdaImplB2;
        long j17;
        final boolean z13;
        long j18;
        final long j19;
        long j20;
        final androidx.compose.ui.graphics.l0 l0Var3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        int i18;
        int i19;
        int i20;
        int i21;
        C1086g c1086gP = interfaceC1084f.p(274621471);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(f0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = 2 & i11;
        if (i22 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0Var2 = l0Var;
                        int i23 = c1086gP.K(l0Var2) ? 2048 : 1024;
                        i12 |= i23;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i23;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i10 & 24576) != 0) {
                    if ((i11 & 16) == 0 || !c1086gP.i(j)) {
                        i21 = 8192;
                    } else {
                        i21 = 16384;
                    }
                    i12 |= i21;
                }
                if ((i10 & 196608) == 0) {
                    jD = j10;
                    if ((i11 & 32) == 0 || !c1086gP.i(jD)) {
                        i20 = 65536;
                    } else {
                        i20 = 131072;
                    }
                    i12 |= i20;
                } else {
                    jD = j10;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0 || !c1086gP.i(j11)) {
                        i19 = 524288;
                    } else {
                        i19 = 1048576;
                    }
                    i12 |= i19;
                }
                if ((12582912 & i10) == 0) {
                    i15 = i11;
                    if ((i15 & 128) == 0 || !c1086gP.i(j12)) {
                        i18 = 4194304;
                    } else {
                        i18 = 8388608;
                    }
                    i12 |= i18;
                } else {
                    i15 = i11;
                }
                if ((i10 & 100663296) == 0) {
                    if ((i15 & 256) == 0) {
                        j14 = j13;
                        int i24 = c1086gP.i(j14) ? 67108864 : 33554432;
                        i12 |= i24;
                    } else {
                        j14 = j13;
                    }
                    i12 |= i24;
                } else {
                    j14 = j13;
                }
                if ((i12 & 38347923) == 38347922 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i22 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            z11 = false;
                        }
                        if ((i15 & 8) != 0) {
                            l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                            i12 &= -7169;
                        } else {
                            l0VarA = l0Var2;
                        }
                        if ((16 & i15) != 0) {
                            float f10 = B.w.f1377a;
                            jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                            i12 &= -57345;
                        } else {
                            jD2 = j;
                        }
                        if ((32 & i15) != 0) {
                            jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                            i12 &= -458753;
                        }
                        i16 = i15 & 64;
                        colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                        if (i16 != 0) {
                            float f11 = B.w.f1377a;
                            jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            i12 &= -3670017;
                        } else {
                            jD3 = j11;
                        }
                        if ((128 & i15) != 0) {
                            float f12 = B.w.f1377a;
                            jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jD4 = j12;
                        }
                        if ((256 & i15) != 0) {
                            i17 = i12 & (-234881025);
                            jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                        } else {
                            jD5 = j13;
                            i17 = i12;
                        }
                        j15 = jD4;
                        j16 = jD3;
                    } else {
                        c1086gP.w();
                        if ((i15 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((16 & i15) != 0) {
                            i12 &= -57345;
                        }
                        if ((i15 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i15 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        if ((128 & i15) != 0) {
                            i12 &= -29360129;
                        }
                        if ((256 & i15) != 0) {
                            i12 &= -234881025;
                        }
                        i17 = i12;
                        hVar3 = hVar2;
                        l0VarA = l0Var2;
                        jD5 = j14;
                        jD2 = j;
                        j16 = j11;
                        j15 = j12;
                    }
                    c1086gP.U();
                    strB = f0Var.b().b();
                    c1086gP.L(1561344786);
                    if (strB != null) {
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                    C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                                    boolean zK = interfaceC1084f3.K(f0Var);
                                    final f0 f0Var2 = f0Var;
                                    Object objF = interfaceC1084f3.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                f0Var2.a();
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF);
                                    }
                                    final String str = strB;
                                    ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                    } else {
                        composableLambdaImplB = null;
                    }
                    c1086gP.T(false);
                    c1086gP.L(1561358724);
                    if (f0Var.b().a()) {
                        composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    boolean zK = interfaceC1084f3.K(f0Var);
                                    final f0 f0Var2 = f0Var;
                                    Object objF = interfaceC1084f3.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                f0Var2.dismiss();
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF);
                                    }
                                    IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        z12 = false;
                    } else {
                        z12 = false;
                        composableLambdaImplB2 = null;
                    }
                    c1086gP.T(z12);
                    int i25 = i17 << 3;
                    a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i25 & 3670016) | (i25 & 7168) | 805306368 | (57344 & i25) | (458752 & i25) | (29360128 & i17) | (i17 & 234881024), 0);
                    j17 = jD;
                    z13 = z11;
                    j18 = j15;
                    j19 = jD2;
                    j20 = j16;
                    l0Var3 = l0VarA;
                    hVar4 = hVar3;
                } else {
                    c1086gP.w();
                    j19 = j;
                    j18 = j12;
                    hVar4 = hVar2;
                    jD5 = j14;
                    j17 = jD;
                    z13 = z11;
                    l0Var3 = l0Var2;
                    j20 = j11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j21 = j17;
                    final long j22 = j20;
                    final long j23 = j18;
                    final long j24 = jD5;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.b(f0Var, hVar4, z13, l0Var3, j19, j21, j22, j23, j24, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i23;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i23;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    i21 = 8192;
                } else {
                    i21 = 8192;
                }
                i12 |= i21;
            }
            if ((i10 & 196608) == 0) {
                jD = j10;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((12582912 & i10) == 0) {
                i15 = i11;
                if ((i15 & 128) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            } else {
                i15 = i11;
            }
            if ((i10 & 100663296) == 0) {
                if ((i15 & 256) == 0) {
                    j14 = j13;
                    if (c1086gP.i(j14)) {
                    }
                    i12 |= i24;
                } else {
                    j14 = j13;
                }
                i12 |= i24;
            } else {
                j14 = j13;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f13 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f14 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f15 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f16 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f17 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f18 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                }
                c1086gP.U();
                strB = f0Var.b().b();
                c1086gP.L(1561344786);
                if (strB != null) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                c1086gP.L(1561358724);
                if (f0Var.b().a()) {
                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.dismiss();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z12 = false;
                } else {
                    z12 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z12);
                int i26 = i17 << 3;
                a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i26 & 3670016) | (i26 & 7168) | 805306368 | (57344 & i26) | (458752 & i26) | (29360128 & i17) | (i17 & 234881024), 0);
                j17 = jD;
                z13 = z11;
                j18 = j15;
                j19 = jD2;
                j20 = j16;
                l0Var3 = l0VarA;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f19 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f110 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f111 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f112 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f113 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f114 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                }
                c1086gP.U();
                strB = f0Var.b().b();
                c1086gP.L(1561344786);
                if (strB != null) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                c1086gP.L(1561358724);
                if (f0Var.b().a()) {
                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.dismiss();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z12 = false;
                } else {
                    z12 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z12);
                int i27 = i17 << 3;
                a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i27 & 3670016) | (i27 & 7168) | 805306368 | (57344 & i27) | (458752 & i27) | (29360128 & i17) | (i17 & 234881024), 0);
                j17 = jD;
                z13 = z11;
                j18 = j15;
                j19 = jD2;
                j20 = j16;
                l0Var3 = l0VarA;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j25 = j17;
                final long j26 = j20;
                final long j27 = j18;
                final long j28 = jD5;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.b(f0Var, hVar4, z13, l0Var3, j19, j25, j26, j27, j28, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i23;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i23;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) != 0) {
                if ((i11 & 16) == 0) {
                    i21 = 8192;
                } else {
                    i21 = 8192;
                }
                i12 |= i21;
            }
            if ((i10 & 196608) == 0) {
                jD = j10;
                if ((i11 & 32) == 0) {
                    i20 = 65536;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            } else {
                jD = j10;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i19 = 524288;
                } else {
                    i19 = 524288;
                }
                i12 |= i19;
            }
            if ((12582912 & i10) == 0) {
                i15 = i11;
                if ((i15 & 128) == 0) {
                    i18 = 4194304;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            } else {
                i15 = i11;
            }
            if ((i10 & 100663296) == 0) {
                if ((i15 & 256) == 0) {
                    j14 = j13;
                    if (c1086gP.i(j14)) {
                    }
                    i12 |= i24;
                } else {
                    j14 = j13;
                }
                i12 |= i24;
            } else {
                j14 = j13;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f115 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f116 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f117 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f118 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f119 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f1110 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                }
                c1086gP.U();
                strB = f0Var.b().b();
                c1086gP.L(1561344786);
                if (strB != null) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                c1086gP.L(1561358724);
                if (f0Var.b().a()) {
                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.dismiss();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z12 = false;
                } else {
                    z12 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z12);
                int i28 = i17 << 3;
                a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i28 & 3670016) | (i28 & 7168) | 805306368 | (57344 & i28) | (458752 & i28) | (29360128 & i17) | (i17 & 234881024), 0);
                j17 = jD;
                z13 = z11;
                j18 = j15;
                j19 = jD2;
                j20 = j16;
                l0Var3 = l0VarA;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f1111 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f1112 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f1113 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                } else {
                    if (i22 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if ((i15 & 8) != 0) {
                        l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                        i12 &= -7169;
                    } else {
                        l0VarA = l0Var2;
                    }
                    if ((16 & i15) != 0) {
                        float f1114 = B.w.f1377a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                        i12 &= -57345;
                    } else {
                        jD2 = j;
                    }
                    if ((32 & i15) != 0) {
                        jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                        i12 &= -458753;
                    }
                    i16 = i15 & 64;
                    colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                    if (i16 != 0) {
                        float f1115 = B.w.f1377a;
                        jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -3670017;
                    } else {
                        jD3 = j11;
                    }
                    if ((128 & i15) != 0) {
                        float f1116 = B.w.f1377a;
                        jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jD4 = j12;
                    }
                    if ((256 & i15) != 0) {
                        i17 = i12 & (-234881025);
                        jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                    } else {
                        jD5 = j13;
                        i17 = i12;
                    }
                    j15 = jD4;
                    j16 = jD3;
                }
                c1086gP.U();
                strB = f0Var.b().b();
                c1086gP.L(1561344786);
                if (strB != null) {
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                                C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                } else {
                    composableLambdaImplB = null;
                }
                c1086gP.T(false);
                c1086gP.L(1561358724);
                if (f0Var.b().a()) {
                    composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                boolean zK = interfaceC1084f3.K(f0Var);
                                final f0 f0Var2 = f0Var;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            f0Var2.dismiss();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    z12 = false;
                } else {
                    z12 = false;
                    composableLambdaImplB2 = null;
                }
                c1086gP.T(z12);
                int i29 = i17 << 3;
                a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i29 & 3670016) | (i29 & 7168) | 805306368 | (57344 & i29) | (458752 & i29) | (29360128 & i17) | (i17 & 234881024), 0);
                j17 = jD;
                z13 = z11;
                j18 = j15;
                j19 = jD2;
                j20 = j16;
                l0Var3 = l0VarA;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j29 = j17;
                final long j210 = j20;
                final long j211 = j18;
                final long j212 = jD5;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.b(f0Var, hVar4, z13, l0Var3, j19, j29, j210, j211, j212, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i23;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i23;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 24576) != 0) {
            if ((i11 & 16) == 0) {
                i21 = 8192;
            } else {
                i21 = 8192;
            }
            i12 |= i21;
        }
        if ((i10 & 196608) == 0) {
            jD = j10;
            if ((i11 & 32) == 0) {
                i20 = 65536;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        } else {
            jD = j10;
        }
        if ((1572864 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i12 |= i19;
        }
        if ((12582912 & i10) == 0) {
            i15 = i11;
            if ((i15 & 128) == 0) {
                i18 = 4194304;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        } else {
            i15 = i11;
        }
        if ((i10 & 100663296) == 0) {
            if ((i15 & 256) == 0) {
                j14 = j13;
                if (c1086gP.i(j14)) {
                }
                i12 |= i24;
            } else {
                j14 = j13;
            }
            i12 |= i24;
        } else {
            j14 = j13;
        }
        if ((i12 & 38347923) == 38347922) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i15 & 8) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i15) != 0) {
                    float f1117 = B.w.f1377a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -57345;
                } else {
                    jD2 = j;
                }
                if ((32 & i15) != 0) {
                    jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -458753;
                }
                i16 = i15 & 64;
                colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                if (i16 != 0) {
                    float f1118 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD3 = j11;
                }
                if ((128 & i15) != 0) {
                    float f1119 = B.w.f1377a;
                    jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD4 = j12;
                }
                if ((256 & i15) != 0) {
                    i17 = i12 & (-234881025);
                    jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                } else {
                    jD5 = j13;
                    i17 = i12;
                }
                j15 = jD4;
                j16 = jD3;
            } else {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i15 & 8) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i15) != 0) {
                    float f11110 = B.w.f1377a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -57345;
                } else {
                    jD2 = j;
                }
                if ((32 & i15) != 0) {
                    jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -458753;
                }
                i16 = i15 & 64;
                colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                if (i16 != 0) {
                    float f11111 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD3 = j11;
                }
                if ((128 & i15) != 0) {
                    float f11112 = B.w.f1377a;
                    jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD4 = j12;
                }
                if ((256 & i15) != 0) {
                    i17 = i12 & (-234881025);
                    jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                } else {
                    jD5 = j13;
                    i17 = i12;
                }
                j15 = jD4;
                j16 = jD3;
            }
            c1086gP.U();
            strB = f0Var.b().b();
            c1086gP.L(1561344786);
            if (strB != null) {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                            C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                            boolean zK = interfaceC1084f3.K(f0Var);
                            final f0 f0Var2 = f0Var;
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        f0Var2.a();
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            final String str = strB;
                            ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            } else {
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            c1086gP.L(1561358724);
            if (f0Var.b().a()) {
                composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            boolean zK = interfaceC1084f3.K(f0Var);
                            final f0 f0Var2 = f0Var;
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        f0Var2.dismiss();
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z12 = false;
            } else {
                z12 = false;
                composableLambdaImplB2 = null;
            }
            c1086gP.T(z12);
            int i210 = i17 << 3;
            a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i210 & 3670016) | (i210 & 7168) | 805306368 | (57344 & i210) | (458752 & i210) | (29360128 & i17) | (i17 & 234881024), 0);
            j17 = jD;
            z13 = z11;
            j18 = j15;
            j19 = jD2;
            j20 = j16;
            l0Var3 = l0VarA;
            hVar4 = hVar3;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i15 & 8) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i15) != 0) {
                    float f11113 = B.w.f1377a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -57345;
                } else {
                    jD2 = j;
                }
                if ((32 & i15) != 0) {
                    jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -458753;
                }
                i16 = i15 & 64;
                colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                if (i16 != 0) {
                    float f11114 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD3 = j11;
                }
                if ((128 & i15) != 0) {
                    float f11115 = B.w.f1377a;
                    jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD4 = j12;
                }
                if ((256 & i15) != 0) {
                    i17 = i12 & (-234881025);
                    jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                } else {
                    jD5 = j13;
                    i17 = i12;
                }
                j15 = jD4;
                j16 = jD3;
            } else {
                if (i22 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if ((i15 & 8) != 0) {
                    l0VarA = ShapesKt.a(B.w.f1378b, c1086gP);
                    i12 &= -7169;
                } else {
                    l0VarA = l0Var2;
                }
                if ((16 & i15) != 0) {
                    float f11116 = B.w.f1377a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12713e, c1086gP);
                    i12 &= -57345;
                } else {
                    jD2 = j;
                }
                if ((32 & i15) != 0) {
                    jD = ColorSchemeKt.d(B.w.f1380d, c1086gP);
                    i12 &= -458753;
                }
                i16 = i15 & 64;
                colorSchemeKeyTokens = ColorSchemeKeyTokens.f12712d;
                if (i16 != 0) {
                    float f11117 = B.w.f1377a;
                    jD3 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -3670017;
                } else {
                    jD3 = j11;
                }
                if ((128 & i15) != 0) {
                    float f11118 = B.w.f1377a;
                    jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, c1086gP);
                    i12 &= -29360129;
                } else {
                    jD4 = j12;
                }
                if ((256 & i15) != 0) {
                    i17 = i12 & (-234881025);
                    jD5 = ColorSchemeKt.d(B.w.f1379c, c1086gP);
                } else {
                    jD5 = j13;
                    i17 = i12;
                }
                j15 = jD4;
                j16 = jD3;
            }
            c1086gP.U();
            strB = f0Var.b().b();
            c1086gP.L(1561344786);
            if (strB != null) {
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-1378313599, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.foundation.layout.N n10 = C1051f.f12444a;
                            C1050e c1050eG = C1051f.g(0L, j16, interfaceC1084f3, 13);
                            boolean zK = interfaceC1084f3.K(f0Var);
                            final f0 f0Var2 = f0Var;
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        f0Var2.a();
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            final String str = strB;
                            ButtonKt.c((Ia.a) objF, null, false, null, c1050eG, null, null, null, null, androidx.compose.runtime.internal.a.b(521110564, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    if ((num2.intValue() & 17) == 16 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 805306368, 494);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
            } else {
                composableLambdaImplB = null;
            }
            c1086gP.T(false);
            c1086gP.L(1561358724);
            if (f0Var.b().a()) {
                composableLambdaImplB2 = androidx.compose.runtime.internal.a.b(-1812633777, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            boolean zK = interfaceC1084f3.K(f0Var);
                            final f0 f0Var2 = f0Var;
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        f0Var2.dismiss();
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            IconButtonKt.b((Ia.a) objF, null, false, null, null, ComposableSingletons$SnackbarKt.f12119a, interfaceC1084f3, 196608, 30);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                z12 = false;
            } else {
                z12 = false;
                composableLambdaImplB2 = null;
            }
            c1086gP.T(z12);
            int i211 = i17 << 3;
            a(PaddingKt.f(hVar3, 12), composableLambdaImplB, composableLambdaImplB2, z11, l0VarA, jD2, jD, j15, jD5, androidx.compose.runtime.internal.a.b(-1266389126, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(f0Var.b().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i211 & 3670016) | (i211 & 7168) | 805306368 | (57344 & i211) | (458752 & i211) | (29360128 & i17) | (i17 & 234881024), 0);
            j17 = jD;
            z13 = z11;
            j18 = j15;
            j19 = jD2;
            j20 = j16;
            l0Var3 = l0VarA;
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j213 = j17;
            final long j214 = j20;
            final long j215 = j18;
            final long j216 = jD5;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.b(f0Var, hVar4, z13, l0Var3, j19, j213, j214, j215, j216, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final Ia.p pVar, final Ia.p pVar2, final Ia.p pVar3, final androidx.compose.ui.text.F f10, final long j, final long j10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1332496681);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(f10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.i(j) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.i(j10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarJ = PaddingKt.j(androidx.compose.foundation.layout.W.d(androidx.compose.foundation.layout.W.r(aVar, f12311a), 1.0f), f12313c, 0.0f, 0.0f, f12315e, 6);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar4, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar5, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar6);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC);
            androidx.compose.ui.h hVarA = C0942b.a(f12312b, f12318h);
            float f11 = f12314d;
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(hVarA, 0.0f, 0.0f, f11, 0.0f, 11);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD);
            R0.a(pVar5, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC2);
            C7.g.b(i11 & 14, pVar, c1086gP, true);
            androidx.compose.ui.h hVarJ3 = PaddingKt.j(new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o), 0.0f, 0.0f, pVar3 == null ? f11 : 0, 0.0f, 11);
            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarJ3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD2);
            R0.a(pVar5, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC3);
            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, aVar);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, tA);
            R0.a(pVar5, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC4);
            androidx.compose.runtime.C c10 = ContentColorKt.f12125a;
            CompositionLocalKt.b(new C1101n0[]{B7.b.b(j, c10), TextKt.f12383a.b(f10)}, pVar2, c1086gP, (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            c1086gP.L(618603253);
            if (pVar3 != null) {
                CompositionLocalKt.a(B7.b.b(j10, c10), pVar3, c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.T(true);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.c(pVar, pVar2, pVar3, f10, j, j10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void d(final Ia.p pVar, final Ia.p pVar2, final Ia.p pVar3, final androidx.compose.ui.text.F f10, final long j, final long j10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(-903235475);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.K(f10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.i(j) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.i(j10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c1086gP.s()) {
            c1086gP.w();
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, f12313c, 0.0f, pVar3 == null ? f12314d : 0, 0.0f, 10);
            Object objF = c1086gP.f();
            if (objF == InterfaceC1084f.a.f12980a) {
                objF = new SnackbarKt$OneRowSnackbar$2$1();
                c1086gP.E(objF);
            }
            androidx.compose.ui.layout.E e10 = (androidx.compose.ui.layout.E) objF;
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar4 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar4, c1086gP, e10);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar5 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar5, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar6 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar6);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar7, c1086gP, hVarC);
            androidx.compose.ui.h hVarH = PaddingKt.h(C1171q.b(aVar, AttributeType.TEXT), 0.0f, f12316f, 1);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarH);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar4, c1086gP, eD);
            R0.a(pVar5, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar6);
            }
            R0.a(pVar7, c1086gP, hVarC2);
            pVar.invoke(c1086gP, Integer.valueOf(i11 & 14));
            c1086gP.T(true);
            c1086gP.L(-904778058);
            if (pVar2 != null) {
                androidx.compose.ui.h hVarB = C1171q.b(aVar, "action");
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar4, c1086gP, eD2);
                R0.a(pVar5, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar6);
                }
                R0.a(pVar7, c1086gP, hVarC3);
                z10 = true;
                CompositionLocalKt.b(new C1101n0[]{B7.b.b(j, ContentColorKt.f12125a), TextKt.f12383a.b(f10)}, pVar2, c1086gP, 8 | (i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
            } else {
                z10 = true;
            }
            c1086gP.T(false);
            c1086gP.L(-904766579);
            if (pVar3 != null) {
                androidx.compose.ui.h hVarB2 = C1171q.b(aVar, "dismissAction");
                androidx.compose.ui.layout.E eD3 = BoxKt.d(fVar, false);
                int i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarB2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar4, c1086gP, eD3);
                R0.a(pVar5, c1086gP, interfaceC1089h0P4);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar6);
                }
                R0.a(pVar7, c1086gP, hVarC4);
                CompositionLocalKt.a(B7.b.b(j10, ContentColorKt.f12125a), pVar3, c1086gP, ((i11 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                z10 = true;
                c1086gP.T(true);
                z11 = false;
            } else {
                z11 = false;
            }
            c1086gP.T(z11);
            c1086gP.T(z10);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.d(pVar, pVar2, pVar3, f10, j, j10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
