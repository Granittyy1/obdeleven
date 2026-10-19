package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0942b;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.models.AttributeType;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Snackbar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11812c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f11815f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11810a = 30;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11811b = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11813d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11814e = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f11816g = 12;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f11817h = 48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f11818i = 68;

    static {
        float f10 = 8;
        f11812c = f10;
        f11815f = f10;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x013e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0143  */
    /* JADX WARN: Code duplicated, block: B:118:0x0149  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x0197  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    public static final void a(androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, boolean z10, l0 l0Var, long j, long j10, float f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        long j11;
        final long jH;
        int i15;
        float f11;
        int i16;
        int i17;
        boolean z11;
        final androidx.compose.ui.h hVar2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3;
        final boolean z12;
        final l0 l0Var2;
        final long jI;
        final float f12;
        C1105p0 c1105p0V;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i18;
        int i19;
        C1086g c1086gP = interfaceC1084f.p(-558258760);
        int i20 = i11 & 1;
        if (i20 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.k(pVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) != 0) {
                    i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
                }
                if ((i10 & 24576) == 0) {
                    j11 = j;
                    if ((i11 & 16) == 0 || !c1086gP.i(j11)) {
                        i19 = 8192;
                    } else {
                        i19 = 16384;
                    }
                    i12 |= i19;
                } else {
                    j11 = j;
                }
                if ((196608 & i10) == 0) {
                    jH = j10;
                    if ((i11 & 32) == 0 || !c1086gP.i(jH)) {
                        i18 = 65536;
                    } else {
                        i18 = 131072;
                    }
                    i12 |= i18;
                } else {
                    jH = j10;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    i12 |= 1572864;
                    f11 = f10;
                } else {
                    f11 = f10;
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.g(f11)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((4793491 & i12) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i21 != 0) {
                            pVar4 = null;
                        } else {
                            pVar4 = pVar;
                        }
                        boolean z13 = i13 == 0 ? z10 : false;
                        if ((i11 & 8) != 0) {
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            i12 &= -7169;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            O0 o10 = ColorsKt.f11693a;
                            jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o10)).e()), ((C1034j) c1086gP.x(o10)).h());
                            i12 &= -57345;
                        } else {
                            jI = j11;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        }
                        if (i15 != 0) {
                            f12 = 6;
                        } else {
                            f12 = f11;
                        }
                        z12 = z13;
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        hVar2 = hVar;
                        pVar4 = pVar;
                        l0Var2 = l0Var;
                        jI = j11;
                        f12 = f11;
                        i12 = i12;
                        z12 = z10;
                    }
                    c1086gP.U();
                    int i22 = i12 >> 6;
                    SurfaceKt.a(hVar2, l0Var2, jI, jH, null, f12, androidx.compose.runtime.internal.a.b(-2084221700, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                                long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a;
                                C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j12)) < 0.5d : ((double) Q3.d.D(j12)) > 0.5d) ? 0.87f : 1.0f));
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar4;
                                final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar6 = pVar2;
                                final boolean z14 = z12;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1939362236, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            androidx.compose.ui.text.F f13 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).j;
                                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar7 = pVar5;
                                            final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar8 = pVar6;
                                            final boolean z15 = z14;
                                            TextKt.a(f13, androidx.compose.runtime.internal.a.b(225114541, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (!interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        interfaceC1084f7.w();
                                                    } else if (pVar7 == null) {
                                                        interfaceC1084f7.L(1850968129);
                                                        SnackbarKt.e(pVar8, interfaceC1084f7, 0);
                                                        interfaceC1084f7.D();
                                                    } else if (z15) {
                                                        interfaceC1084f7.L(1850970222);
                                                        SnackbarKt.c(pVar8, pVar7, interfaceC1084f7, 0);
                                                        interfaceC1084f7.D();
                                                    } else {
                                                        interfaceC1084f7.L(1850972359);
                                                        SnackbarKt.d(pVar8, pVar7, interfaceC1084f7, 0);
                                                        interfaceC1084f7.D();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 48);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i22 & 896) | (i12 & 14) | 1572864 | (i22 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i22 & 7168) | ((i12 >> 3) & 458752), 16);
                    pVar3 = pVar4;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar3 = pVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    jI = j11;
                    f12 = f11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.a(hVar2, pVar3, z12, l0Var2, jI, jH, f12, pVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i10 & 3072) != 0) {
                i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
            }
            if ((i10 & 24576) == 0) {
                j11 = j;
                if ((i11 & 16) == 0) {
                    i19 = 8192;
                } else {
                    i19 = 8192;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((196608 & i10) == 0) {
                jH = j10;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jH = j10;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((4793491 & i12) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o11 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o11)).e()), ((C1034j) c1086gP.x(o11)).h());
                        i12 &= -57345;
                    } else {
                        jI = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f11;
                    }
                    z12 = z13;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o12 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o12)).e()), ((C1034j) c1086gP.x(o12)).h());
                        i12 &= -57345;
                    } else {
                        jI = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f11;
                    }
                    z12 = z13;
                }
                c1086gP.U();
                int i23 = i12 >> 6;
                SurfaceKt.a(hVar2, l0Var2, jI, jH, null, f12, androidx.compose.runtime.internal.a.b(-2084221700, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                            long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a;
                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j12)) < 0.5d : ((double) Q3.d.D(j12)) > 0.5d) ? 0.87f : 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6 = pVar2;
                            final boolean z14 = z12;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1939362236, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f13 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).j;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7 = pVar5;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar6;
                                        final boolean z15 = z14;
                                        TextKt.a(f13, androidx.compose.runtime.internal.a.b(225114541, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (!interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    interfaceC1084f7.w();
                                                } else if (pVar7 == null) {
                                                    interfaceC1084f7.L(1850968129);
                                                    SnackbarKt.e(pVar8, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                } else if (z15) {
                                                    interfaceC1084f7.L(1850970222);
                                                    SnackbarKt.c(pVar8, pVar7, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                } else {
                                                    interfaceC1084f7.L(1850972359);
                                                    SnackbarKt.d(pVar8, pVar7, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i23 & 896) | (i12 & 14) | 1572864 | (i23 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i23 & 7168) | ((i12 >> 3) & 458752), 16);
                pVar3 = pVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar3 = pVar;
                z12 = z10;
                l0Var2 = l0Var;
                jI = j11;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.a(hVar2, pVar3, z12, l0Var2, jI, jH, f12, pVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) != 0) {
                i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
            }
            if ((i10 & 24576) == 0) {
                j11 = j;
                if ((i11 & 16) == 0) {
                    i19 = 8192;
                } else {
                    i19 = 8192;
                }
                i12 |= i19;
            } else {
                j11 = j;
            }
            if ((196608 & i10) == 0) {
                jH = j10;
                if ((i11 & 32) == 0) {
                    i18 = 65536;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            } else {
                jH = j10;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                i12 |= 1572864;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.g(f11)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((4793491 & i12) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o13 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o13)).e()), ((C1034j) c1086gP.x(o13)).h());
                        i12 &= -57345;
                    } else {
                        jI = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f11;
                    }
                    z12 = z13;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i21 != 0) {
                        pVar4 = null;
                    } else {
                        pVar4 = pVar;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o14 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o14)).e()), ((C1034j) c1086gP.x(o14)).h());
                        i12 &= -57345;
                    } else {
                        jI = j11;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f11;
                    }
                    z12 = z13;
                }
                c1086gP.U();
                int i24 = i12 >> 6;
                SurfaceKt.a(hVar2, l0Var2, jI, jH, null, f12, androidx.compose.runtime.internal.a.b(-2084221700, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                            long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a;
                            C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j12)) < 0.5d : ((double) Q3.d.D(j12)) > 0.5d) ? 0.87f : 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6 = pVar2;
                            final boolean z14 = z12;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1939362236, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f13 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).j;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7 = pVar5;
                                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar6;
                                        final boolean z15 = z14;
                                        TextKt.a(f13, androidx.compose.runtime.internal.a.b(225114541, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (!interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    interfaceC1084f7.w();
                                                } else if (pVar7 == null) {
                                                    interfaceC1084f7.L(1850968129);
                                                    SnackbarKt.e(pVar8, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                } else if (z15) {
                                                    interfaceC1084f7.L(1850970222);
                                                    SnackbarKt.c(pVar8, pVar7, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                } else {
                                                    interfaceC1084f7.L(1850972359);
                                                    SnackbarKt.d(pVar8, pVar7, interfaceC1084f7, 0);
                                                    interfaceC1084f7.D();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i24 & 896) | (i12 & 14) | 1572864 | (i24 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i24 & 7168) | ((i12 >> 3) & 458752), 16);
                pVar3 = pVar4;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar3 = pVar;
                z12 = z10;
                l0Var2 = l0Var;
                jI = j11;
                f12 = f11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.a(hVar2, pVar3, z12, l0Var2, jI, jH, f12, pVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i10 & 3072) != 0) {
            i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
        }
        if ((i10 & 24576) == 0) {
            j11 = j;
            if ((i11 & 16) == 0) {
                i19 = 8192;
            } else {
                i19 = 8192;
            }
            i12 |= i19;
        } else {
            j11 = j;
        }
        if ((196608 & i10) == 0) {
            jH = j10;
            if ((i11 & 32) == 0) {
                i18 = 65536;
            } else {
                i18 = 65536;
            }
            i12 |= i18;
        } else {
            jH = j10;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 1572864) == 0) {
                if (c1086gP.g(f11)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.k(pVar2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        if ((4793491 & i12) != 4793490) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i21 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    i12 &= -7169;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    O0 o15 = ColorsKt.f11693a;
                    jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o15)).e()), ((C1034j) c1086gP.x(o15)).h());
                    i12 &= -57345;
                } else {
                    jI = j11;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                }
                if (i15 != 0) {
                    f12 = 6;
                } else {
                    f12 = f11;
                }
                z12 = z13;
            } else {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i21 != 0) {
                    pVar4 = null;
                } else {
                    pVar4 = pVar;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    i12 &= -7169;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    O0 o16 = ColorsKt.f11693a;
                    jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o16)).e()), ((C1034j) c1086gP.x(o16)).h());
                    i12 &= -57345;
                } else {
                    jI = j11;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                }
                if (i15 != 0) {
                    f12 = 6;
                } else {
                    f12 = f11;
                }
                z12 = z13;
            }
            c1086gP.U();
            int i25 = i12 >> 6;
            SurfaceKt.a(hVar2, l0Var2, jI, jH, null, f12, androidx.compose.runtime.internal.a.b(-2084221700, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.runtime.C c10 = ContentAlphaKt.f11713a;
                        long j12 = ((androidx.compose.ui.graphics.H) interfaceC1084f3.x(ContentColorKt.f11715a)).f13506a;
                        C1101n0 c1101n0B = c10.b(Float.valueOf((!((C1034j) interfaceC1084f3.x(ColorsKt.f11693a)).i() ? ((double) Q3.d.D(j12)) < 0.5d : ((double) Q3.d.D(j12)) > 0.5d) ? 0.87f : 1.0f));
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6 = pVar2;
                        final boolean z14 = z12;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(1939362236, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    androidx.compose.ui.text.F f13 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).j;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7 = pVar5;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar6;
                                    final boolean z15 = z14;
                                    TextKt.a(f13, androidx.compose.runtime.internal.a.b(225114541, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                            int iIntValue3 = num3.intValue();
                                            if (!interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                interfaceC1084f7.w();
                                            } else if (pVar7 == null) {
                                                interfaceC1084f7.L(1850968129);
                                                SnackbarKt.e(pVar8, interfaceC1084f7, 0);
                                                interfaceC1084f7.D();
                                            } else if (z15) {
                                                interfaceC1084f7.L(1850970222);
                                                SnackbarKt.c(pVar8, pVar7, interfaceC1084f7, 0);
                                                interfaceC1084f7.D();
                                            } else {
                                                interfaceC1084f7.L(1850972359);
                                                SnackbarKt.d(pVar8, pVar7, interfaceC1084f7, 0);
                                                interfaceC1084f7.D();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f5), interfaceC1084f5, 48);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i25 & 896) | (i12 & 14) | 1572864 | (i25 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i25 & 7168) | ((i12 >> 3) & 458752), 16);
            pVar3 = pVar4;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            pVar3 = pVar;
            z12 = z10;
            l0Var2 = l0Var;
            jI = j11;
            f12 = f11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.a(hVar2, pVar3, z12, l0Var2, jI, jH, f12, pVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:116:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0148  */
    /* JADX WARN: Code duplicated, block: B:118:0x014b  */
    /* JADX WARN: Code duplicated, block: B:120:0x014f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0151  */
    /* JADX WARN: Code duplicated, block: B:124:0x0157  */
    /* JADX WARN: Code duplicated, block: B:125:0x0164  */
    /* JADX WARN: Code duplicated, block: B:128:0x016a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:151:0x0211  */
    /* JADX WARN: Code duplicated, block: B:153:0x0266  */
    /* JADX WARN: Code duplicated, block: B:156:0x027c  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:98:0x0107  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final O o10, androidx.compose.ui.h hVar, boolean z10, l0 l0Var, long j, long j10, long j11, float f10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        long j12;
        long j13;
        int i15;
        int i16;
        boolean z11;
        final androidx.compose.ui.h hVar2;
        final boolean z12;
        final l0 l0Var2;
        final long j14;
        final long j15;
        final float f11;
        final long j16;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        boolean z13;
        l0 l0Var3;
        long jI;
        long jH;
        final long jI2;
        float f12;
        int i17;
        androidx.compose.ui.h hVar4;
        C1034j c1034j;
        final String strB;
        ComposableLambdaImpl composableLambdaImplB;
        C1086g c1086gP = interfaceC1084f.p(258660814);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c1086gP.K(o10) : c1086gP.k(o10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) != 0) {
                    i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
                }
                if ((i10 & 24576) != 0) {
                    i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        j12 = j10;
                        int i19 = c1086gP.i(j12) ? 131072 : 65536;
                        i12 |= i19;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        j13 = j11;
                        int i20 = c1086gP.i(j13) ? 1048576 : 524288;
                        i12 |= i20;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.g(f10)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i12 & 4793491) != 4793490) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c1086gP.C(i12 & 1, z11)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i18 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z13 = false;
                        } else {
                            z13 = z10;
                        }
                        if ((i11 & 8) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            i12 &= -7169;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 16) != 0) {
                            O0 o11 = ColorsKt.f11693a;
                            jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o11)).e()), ((C1034j) c1086gP.x(o11)).h());
                            i12 &= -57345;
                        } else {
                            jI = j;
                        }
                        if ((i11 & 32) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -458753;
                        } else {
                            jH = j10;
                        }
                        if ((i11 & 64) != 0) {
                            c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                            if (c1034j.i()) {
                                jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                            } else {
                                jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                            }
                            i12 &= -3670017;
                        } else {
                            hVar3 = hVar3;
                            jI2 = j13;
                        }
                        if (i15 != 0) {
                            f12 = 6;
                        } else {
                            f12 = f10;
                        }
                        i17 = i12;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        z13 = z10;
                        l0Var3 = l0Var;
                        jI = j;
                        f12 = f10;
                        i17 = i12;
                        jH = j12;
                        jI2 = j13;
                        hVar4 = hVar;
                    }
                    c1086gP.U();
                    strB = o10.b();
                    if (strB != null) {
                        c1086gP.L(1609221416);
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(1843479216, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    androidx.compose.foundation.layout.N n10 = C1030f.f11882a;
                                    C1035k c1035kB = C1030f.b(jI2, interfaceC1084f3, 5);
                                    boolean zK = interfaceC1084f3.k(o10);
                                    final O o12 = o10;
                                    Object objF = interfaceC1084f3.f();
                                    if (zK || objF == InterfaceC1084f.a.f12980a) {
                                        objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                            {
                                                super(0);
                                            }

                                            @Override // Ia.a
                                            public final p293xa.r invoke() {
                                                o12.a();
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF);
                                    }
                                    final String str = strB;
                                    ButtonKt.b((Ia.a) objF, null, c1035kB, androidx.compose.runtime.internal.a.b(-929149933, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // Ia.q
                                        public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 805306368, 382);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1609519419);
                        c1086gP.T(false);
                        composableLambdaImplB = null;
                    }
                    a(PaddingKt.f(hVar4, 12), composableLambdaImplB, z13, l0Var3, jI, jH, f12, androidx.compose.runtime.internal.a.b(-261845785, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                TextKt.b(o10.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                    hVar2 = hVar4;
                    l0Var2 = l0Var3;
                    long j17 = jI2;
                    f11 = f12;
                    z12 = z13;
                    j14 = jI;
                    j15 = jH;
                    j16 = j17;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z12 = z10;
                    l0Var2 = l0Var;
                    j14 = j;
                    j15 = j10;
                    f11 = f10;
                    j16 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            SnackbarKt.b(o10, hVar2, z12, l0Var2, j14, j15, j16, f11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            if ((i10 & 3072) != 0) {
                i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i12 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o12 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o12)).e()), ((C1034j) c1086gP.x(o12)).h());
                        i12 &= -57345;
                    } else {
                        jI = j;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j10;
                    }
                    if ((i11 & 64) != 0) {
                        c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                        if (c1034j.i()) {
                            jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                        } else {
                            jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                        }
                        i12 &= -3670017;
                    } else {
                        hVar3 = hVar3;
                        jI2 = j13;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f10;
                    }
                    i17 = i12;
                    hVar4 = hVar3;
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o13 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o13)).e()), ((C1034j) c1086gP.x(o13)).h());
                        i12 &= -57345;
                    } else {
                        jI = j;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j10;
                    }
                    if ((i11 & 64) != 0) {
                        c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                        if (c1034j.i()) {
                            jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                        } else {
                            jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                        }
                        i12 &= -3670017;
                    } else {
                        hVar3 = hVar3;
                        jI2 = j13;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f10;
                    }
                    i17 = i12;
                    hVar4 = hVar3;
                }
                c1086gP.U();
                strB = o10.b();
                if (strB != null) {
                    c1086gP.L(1609221416);
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1843479216, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                androidx.compose.foundation.layout.N n10 = C1030f.f11882a;
                                C1035k c1035kB = C1030f.b(jI2, interfaceC1084f3, 5);
                                boolean zK = interfaceC1084f3.k(o10);
                                final O o14 = o10;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            o14.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.b((Ia.a) objF, null, c1035kB, androidx.compose.runtime.internal.a.b(-929149933, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 382);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1609519419);
                    c1086gP.T(false);
                    composableLambdaImplB = null;
                }
                a(PaddingKt.f(hVar4, 12), composableLambdaImplB, z13, l0Var3, jI, jH, f12, androidx.compose.runtime.internal.a.b(-261845785, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            TextKt.b(o10.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                hVar2 = hVar4;
                l0Var2 = l0Var3;
                long j18 = jI2;
                f11 = f12;
                z12 = z13;
                j14 = jI;
                j15 = jH;
                j16 = j18;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                j14 = j;
                j15 = j10;
                f11 = f10;
                j16 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.b(o10, hVar2, z12, l0Var2, j14, j15, j16, f11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) != 0) {
                i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
            }
            if ((i10 & 24576) != 0) {
                i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    j12 = j10;
                    if (c1086gP.i(j12)) {
                    }
                    i12 |= i19;
                } else {
                    j12 = j10;
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i12 |= i20;
                } else {
                    j13 = j11;
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.g(f10)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i12 & 4793491) != 4793490) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c1086gP.C(i12 & 1, z11)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o14 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o14)).e()), ((C1034j) c1086gP.x(o14)).h());
                        i12 &= -57345;
                    } else {
                        jI = j;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j10;
                    }
                    if ((i11 & 64) != 0) {
                        c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                        if (c1034j.i()) {
                            jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                        } else {
                            jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                        }
                        i12 &= -3670017;
                    } else {
                        hVar3 = hVar3;
                        jI2 = j13;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f10;
                    }
                    i17 = i12;
                    hVar4 = hVar3;
                } else {
                    if (i18 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z13 = false;
                    } else {
                        z13 = z10;
                    }
                    if ((i11 & 8) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        i12 &= -7169;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 16) != 0) {
                        O0 o15 = ColorsKt.f11693a;
                        jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o15)).e()), ((C1034j) c1086gP.x(o15)).h());
                        i12 &= -57345;
                    } else {
                        jI = j;
                    }
                    if ((i11 & 32) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -458753;
                    } else {
                        jH = j10;
                    }
                    if ((i11 & 64) != 0) {
                        c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                        if (c1034j.i()) {
                            jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                        } else {
                            jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                        }
                        i12 &= -3670017;
                    } else {
                        hVar3 = hVar3;
                        jI2 = j13;
                    }
                    if (i15 != 0) {
                        f12 = 6;
                    } else {
                        f12 = f10;
                    }
                    i17 = i12;
                    hVar4 = hVar3;
                }
                c1086gP.U();
                strB = o10.b();
                if (strB != null) {
                    c1086gP.L(1609221416);
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(1843479216, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                androidx.compose.foundation.layout.N n10 = C1030f.f11882a;
                                C1035k c1035kB = C1030f.b(jI2, interfaceC1084f3, 5);
                                boolean zK = interfaceC1084f3.k(o10);
                                final O o16 = o10;
                                Object objF = interfaceC1084f3.f();
                                if (zK || objF == InterfaceC1084f.a.f12980a) {
                                    objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        {
                                            super(0);
                                        }

                                        @Override // Ia.a
                                        public final p293xa.r invoke() {
                                            o16.a();
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF);
                                }
                                final String str = strB;
                                ButtonKt.b((Ia.a) objF, null, c1035kB, androidx.compose.runtime.internal.a.b(-929149933, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // Ia.q
                                    public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 805306368, 382);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(1609519419);
                    c1086gP.T(false);
                    composableLambdaImplB = null;
                }
                a(PaddingKt.f(hVar4, 12), composableLambdaImplB, z13, l0Var3, jI, jH, f12, androidx.compose.runtime.internal.a.b(-261845785, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            TextKt.b(o10.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
                hVar2 = hVar4;
                l0Var2 = l0Var3;
                long j19 = jI2;
                f11 = f12;
                z12 = z13;
                j14 = jI;
                j15 = jH;
                j16 = j19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z12 = z10;
                l0Var2 = l0Var;
                j14 = j;
                j15 = j10;
                f11 = f10;
                j16 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        SnackbarKt.b(o10, hVar2, z12, l0Var2, j14, j15, j16, f11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        if ((i10 & 3072) != 0) {
            i12 |= ((i11 & 8) == 0 || !c1086gP.K(l0Var)) ? 1024 : 2048;
        }
        if ((i10 & 24576) != 0) {
            i12 |= ((i11 & 16) == 0 || !c1086gP.i(j)) ? 8192 : 16384;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                j12 = j10;
                if (c1086gP.i(j12)) {
                }
                i12 |= i19;
            } else {
                j12 = j10;
            }
            i12 |= i19;
        } else {
            j12 = j10;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                j13 = j11;
                if (c1086gP.i(j13)) {
                }
                i12 |= i20;
            } else {
                j13 = j11;
            }
            i12 |= i20;
        } else {
            j13 = j11;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.g(f10)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i12 |= i16;
        }
        if ((i12 & 4793491) != 4793490) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c1086gP.C(i12 & 1, z11)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i11 & 8) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    i12 &= -7169;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    O0 o16 = ColorsKt.f11693a;
                    jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o16)).e()), ((C1034j) c1086gP.x(o16)).h());
                    i12 &= -57345;
                } else {
                    jI = j;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                } else {
                    jH = j10;
                }
                if ((i11 & 64) != 0) {
                    c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                    if (c1034j.i()) {
                        jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                    } else {
                        jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                    }
                    i12 &= -3670017;
                } else {
                    hVar3 = hVar3;
                    jI2 = j13;
                }
                if (i15 != 0) {
                    f12 = 6;
                } else {
                    f12 = f10;
                }
                i17 = i12;
                hVar4 = hVar3;
            } else {
                if (i18 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                if ((i11 & 8) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    i12 &= -7169;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 16) != 0) {
                    O0 o17 = ColorsKt.f11693a;
                    jI = Q3.d.i(androidx.compose.ui.graphics.H.b(0.8f, ((C1034j) c1086gP.x(o17)).e()), ((C1034j) c1086gP.x(o17)).h());
                    i12 &= -57345;
                } else {
                    jI = j;
                }
                if ((i11 & 32) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -458753;
                } else {
                    jH = j10;
                }
                if ((i11 & 64) != 0) {
                    c1034j = (C1034j) c1086gP.x(ColorsKt.f11693a);
                    if (c1034j.i()) {
                        jI2 = Q3.d.i(androidx.compose.ui.graphics.H.b(0.6f, c1034j.h()), c1034j.f());
                    } else {
                        jI2 = ((androidx.compose.ui.graphics.H) c1034j.f11890b.getValue()).f13506a;
                    }
                    i12 &= -3670017;
                } else {
                    hVar3 = hVar3;
                    jI2 = j13;
                }
                if (i15 != 0) {
                    f12 = 6;
                } else {
                    f12 = f10;
                }
                i17 = i12;
                hVar4 = hVar3;
            }
            c1086gP.U();
            strB = o10.b();
            if (strB != null) {
                c1086gP.L(1609221416);
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(1843479216, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            androidx.compose.foundation.layout.N n10 = C1030f.f11882a;
                            C1035k c1035kB = C1030f.b(jI2, interfaceC1084f3, 5);
                            boolean zK = interfaceC1084f3.k(o10);
                            final O o18 = o10;
                            Object objF = interfaceC1084f3.f();
                            if (zK || objF == InterfaceC1084f.a.f12980a) {
                                objF = new Ia.a<p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // Ia.a
                                    public final p293xa.r invoke() {
                                        o18.a();
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF);
                            }
                            final String str = strB;
                            ButtonKt.b((Ia.a) objF, null, c1035kB, androidx.compose.runtime.internal.a.b(-929149933, new Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final p293xa.r invoke(androidx.compose.foundation.layout.U u10, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f5, 0, 0, 131070);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 805306368, 382);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                c1086gP.T(false);
            } else {
                c1086gP.L(1609519419);
                c1086gP.T(false);
                composableLambdaImplB = null;
            }
            a(PaddingKt.f(hVar4, 12), composableLambdaImplB, z13, l0Var3, jI, jH, f12, androidx.compose.runtime.internal.a.b(-261845785, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        TextKt.b(o10.getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 0, 0, 131070);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i17 & 896) | 12582912 | (i17 & 7168) | (57344 & i17) | (458752 & i17) | ((i17 >> 3) & 3670016), 0);
            hVar2 = hVar4;
            l0Var2 = l0Var3;
            long j110 = jI2;
            f11 = f12;
            z12 = z13;
            j14 = jI;
            j15 = jH;
            j16 = j110;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            z12 = z10;
            l0Var2 = l0Var;
            j14 = j;
            j15 = j10;
            f11 = f10;
            j16 = j13;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.b(o10, hVar2, z12, l0Var2, j14, j15, j16, f11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final Ia.p pVar, final Ia.p pVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-1229075900);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar2) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            androidx.compose.ui.h hVarD = W.d(androidx.compose.ui.h.a.f13984b, 1.0f);
            float f10 = f11811b;
            float f11 = f11812c;
            androidx.compose.ui.h hVarJ = PaddingKt.j(hVarD, f10, 0.0f, f11, f11813d, 2);
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar3 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar3, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar4 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar4, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar5);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC);
            androidx.compose.ui.h hVarJ2 = PaddingKt.j(C0942b.a(f11810a, f11816g), 0.0f, 0.0f, f11, 0.0f, 11);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarJ2);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, eD);
            R0.a(pVar4, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC2);
            C7.g.b(i11 & 14, pVar, c1086gP, true);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(androidx.compose.ui.d.a.f13348o);
            androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, horizontalAlignElement);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, eD2);
            R0.a(pVar4, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC3);
            pVar2.invoke(c1086gP, Integer.valueOf((i11 >> 3) & 14));
            c1086gP.T(true);
            c1086gP.T(true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.c(pVar, pVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void d(final Ia.p pVar, final Ia.p pVar2, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(-534813202);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar2) ? 32 : 16;
        }
        if (c1086gP.C(i11 & 1, (i11 & 19) != 18)) {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar, f11811b, 0.0f, f11812c, 0.0f, 10);
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
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar3 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar3, c1086gP, e10);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar4 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar4, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar5);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC);
            androidx.compose.ui.h hVarH = PaddingKt.h(C1171q.b(aVar, AttributeType.TEXT), 0.0f, f11814e, 1);
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
            R0.a(pVar3, c1086gP, eD);
            R0.a(pVar4, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC2);
            C7.g.b(i11 & 14, pVar, c1086gP, true);
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
            R0.a(pVar3, c1086gP, eD2);
            R0.a(pVar4, c1086gP, interfaceC1089h0P3);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC3);
            pVar2.invoke(c1086gP, Integer.valueOf((i11 >> 3) & 14));
            c1086gP.T(true);
            c1086gP.T(true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.d(pVar, pVar2, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void e(final Ia.p pVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(917397959);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (c1086gP.C(i11 & 1, (i11 & 3) != 2)) {
            SnackbarKt$TextOnlySnackbar$2 snackbarKt$TextOnlySnackbar$2 = SnackbarKt$TextOnlySnackbar$2.f11819a;
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar2, c1086gP, snackbarKt$TextOnlySnackbar$2);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar3, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar4 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar4);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar5 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar5, c1086gP, hVarC);
            androidx.compose.ui.h hVarG = PaddingKt.g(f11811b, f11814e, aVar);
            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarG);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar2, c1086gP, eD);
            R0.a(pVar3, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar4);
            }
            R0.a(pVar5, c1086gP, hVarC2);
            pVar.invoke(c1086gP, Integer.valueOf(i11 & 14));
            c1086gP.T(true);
            c1086gP.T(true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    SnackbarKt.e(pVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
