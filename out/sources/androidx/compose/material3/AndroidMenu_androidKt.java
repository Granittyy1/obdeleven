package androidx.compose.material3;

import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidMenu_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.window.n f12044a = new androidx.compose.ui.window.n(14, true);

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x014a  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:121:0x015b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0161  */
    /* JADX WARN: Code duplicated, block: B:125:0x0167  */
    /* JADX WARN: Code duplicated, block: B:126:0x016a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x01da  */
    /* JADX WARN: Code duplicated, block: B:154:0x01de  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:160:0x0205  */
    /* JADX WARN: Code duplicated, block: B:162:0x020a  */
    /* JADX WARN: Code duplicated, block: B:163:0x020d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0213  */
    /* JADX WARN: Code duplicated, block: B:168:0x0220  */
    /* JADX WARN: Code duplicated, block: B:171:0x0226  */
    /* JADX WARN: Code duplicated, block: B:172:0x0236  */
    /* JADX WARN: Code duplicated, block: B:174:0x023a  */
    /* JADX WARN: Code duplicated, block: B:175:0x023d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0241  */
    /* JADX WARN: Code duplicated, block: B:178:0x0244  */
    /* JADX WARN: Code duplicated, block: B:180:0x0248  */
    /* JADX WARN: Code duplicated, block: B:181:0x024a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0257  */
    /* JADX WARN: Code duplicated, block: B:187:0x0278  */
    /* JADX WARN: Code duplicated, block: B:189:0x0286  */
    /* JADX WARN: Code duplicated, block: B:191:0x028c  */
    /* JADX WARN: Code duplicated, block: B:194:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:198:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:199:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:204:0x031b  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c A[PHI: r25
      0x011c: PHI (r25v6 int) = (r25v0 int), (r25v3 int), (r25v4 int) binds: [B:97:0x011a, B:105:0x0130, B:104:0x012d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z10, final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, long j, ScrollState scrollState, androidx.compose.ui.window.n nVar, androidx.compose.ui.graphics.l0 l0Var, long j10, float f10, float f11, C0937i c0937i, final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.h hVar2;
        int i15;
        int i16;
        long j11;
        int i17;
        ScrollState scrollState2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        long jFloatToRawIntBits;
        ScrollState scrollStateA;
        androidx.compose.ui.window.n nVar2;
        androidx.compose.ui.graphics.l0 l0VarA;
        long jD;
        float f12;
        float f13;
        C0937i c0937i2;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        final androidx.compose.animation.core.K k10;
        Object objF2;
        final androidx.compose.runtime.X x10;
        p013b0.c cVar;
        boolean z11;
        boolean zK;
        Object objF3;
        final float f14;
        final C0937i c0937i3;
        final float f15;
        final androidx.compose.ui.window.n nVar3;
        androidx.compose.ui.graphics.l0 l0Var2;
        final long j12;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        int i28;
        int i29;
        C1086g c1086gP = interfaceC1084f.p(1431928300);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.k(aVar) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & 384) == 0) {
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    i13 |= 3072;
                    j11 = j;
                } else {
                    j11 = j;
                    if ((i10 & 3072) == 0) {
                        if (c1086gP.i(j11)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                }
                if ((i10 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        scrollState2 = scrollState;
                        int i30 = c1086gP.K(scrollState2) ? 16384 : 8192;
                        i13 |= i30;
                    } else {
                        scrollState2 = scrollState;
                    }
                    i13 |= i30;
                } else {
                    scrollState2 = scrollState;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(nVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i12 & 64) == 0 || !c1086gP.K(l0Var)) {
                        i29 = 524288;
                    } else {
                        i29 = 1048576;
                    }
                    i13 |= i29;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i12 & 128) == 0 || !c1086gP.i(j10)) {
                        i28 = 4194304;
                    } else {
                        i28 = 8388608;
                    }
                    i13 |= i28;
                }
                i20 = 256 & i12;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.g(f10)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 512;
                i23 = 805306368;
                if (i22 == 0) {
                    i13 |= i23;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.g(f11)) {
                        i23 = 536870912;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = 1024 & i12;
                if (i24 != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.K(c0937i)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i25 |= 48;
                } else if ((i11 & 48) == 0) {
                    if (c1086gP.k(qVar)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i25 |= i27;
                }
                if ((306783379 & i13) != 306783378 && (i25 & 19) == 18 && c1086gP.s()) {
                    c1086gP.w();
                    jD = j10;
                    f15 = f10;
                    f14 = f11;
                    c0937i3 = c0937i;
                    j12 = j11;
                    hVar3 = hVar2;
                    scrollStateA = scrollState2;
                    nVar3 = nVar;
                    l0Var2 = l0Var;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            float f16 = 0;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j11;
                        }
                        if ((16 & i12) != 0) {
                            scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                            i13 &= -57345;
                        } else {
                            scrollStateA = scrollState;
                        }
                        if (i18 != 0) {
                            nVar2 = f12044a;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 64) != 0) {
                            float f17 = N.f12244a;
                            l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                            i13 &= -3670017;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((128 & i12) != 0) {
                            float f18 = N.f12244a;
                            float f19 = B.p.f1311a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                            i13 = (-29360129) & i13;
                        } else {
                            jD = j10;
                        }
                        if (i20 != 0) {
                            f12 = N.f12244a;
                        } else {
                            f12 = f10;
                        }
                        if (i22 != 0) {
                            f13 = N.f12245b;
                        } else {
                            f13 = f11;
                        }
                        if (i24 != 0) {
                            c0937i2 = null;
                        } else {
                            c0937i2 = c0937i;
                        }
                    } else {
                        c1086gP.w();
                        if ((16 & i12) != 0) {
                            i13 &= -57345;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        if ((128 & i12) != 0) {
                            i13 &= -29360129;
                        }
                        nVar2 = nVar;
                        l0VarA = l0Var;
                        jD = j10;
                        f12 = f10;
                        f13 = f11;
                        c0937i2 = c0937i;
                        jFloatToRawIntBits = j11;
                        scrollStateA = scrollState;
                    }
                    c1086gP.U();
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                        c1086gP.E(objF);
                    }
                    k10 = (androidx.compose.animation.core.K) objF;
                    k10.f(Boolean.valueOf(z10));
                    if (((Boolean) k10.f9381b.getValue()).booleanValue() || ((Boolean) k10.f9382c.getValue()).booleanValue()) {
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                            c1086gP.E(objF2);
                        }
                        x10 = (androidx.compose.runtime.X) objF2;
                        cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                        if ((i13 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zK = z11 | c1086gP.K(cVar);
                        objF3 = c1086gP.f();
                        if (zK || objF3 == c0153a) {
                            objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                    x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                    return p293xa.r.f47939a;
                                }
                            });
                            c1086gP.E(objF3);
                        }
                        final androidx.compose.ui.h hVar4 = hVar2;
                        final ScrollState scrollState3 = scrollStateA;
                        final androidx.compose.ui.graphics.l0 l0Var3 = l0VarA;
                        final long j13 = jD;
                        final float f20 = f12;
                        final float f21 = f13;
                        final C0937i c0937i4 = c0937i2;
                        AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                    MenuKt.a(hVar4, k10, x10, scrollState3, l0Var3, j13, f20, f21, c0937i4, qVar, interfaceC1084f3, 384);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                    }
                    f14 = f13;
                    c0937i3 = c0937i2;
                    f15 = f12;
                    nVar3 = nVar2;
                    androidx.compose.ui.h hVar5 = hVar2;
                    l0Var2 = l0VarA;
                    j12 = jFloatToRawIntBits;
                    hVar3 = hVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final ScrollState scrollState4 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var4 = l0Var2;
                    final long j14 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.a(z10, aVar, hVar3, j12, scrollState4, nVar3, l0Var4, j14, f15, f14, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            hVar2 = hVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                i13 |= 3072;
                j11 = j;
            } else {
                j11 = j;
                if ((i10 & 3072) == 0) {
                    if (c1086gP.i(j11)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    scrollState2 = scrollState;
                    if (c1086gP.K(scrollState2)) {
                    }
                    i13 |= i30;
                } else {
                    scrollState2 = scrollState;
                }
                i13 |= i30;
            } else {
                scrollState2 = scrollState;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            }
            if ((i10 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            }
            i20 = 256 & i12;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.g(f10)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            i23 = 805306368;
            if (i22 == 0) {
                i13 |= i23;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.g(f11)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = 1024 & i12;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.K(c0937i)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(qVar)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f110 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f110)) << 32) | (((long) Float.floatToRawIntBits(f110)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f111 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f112 = N.f12244a;
                        float f113 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f114 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f114)) << 32) | (((long) Float.floatToRawIntBits(f114)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f115 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f116 = N.f12244a;
                        float f117 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                k10 = (androidx.compose.animation.core.K) objF;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar6 = hVar2;
                    final ScrollState scrollState5 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var5 = l0VarA;
                    final long j15 = jD;
                    final float f22 = f12;
                    final float f23 = f13;
                    final C0937i c0937i5 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar6, k10, x10, scrollState5, l0Var5, j15, f22, f23, c0937i5, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                } else {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar7 = hVar2;
                    final ScrollState scrollState6 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var6 = l0VarA;
                    final long j16 = jD;
                    final float f24 = f12;
                    final float f25 = f13;
                    final C0937i c0937i6 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar7, k10, x10, scrollState6, l0Var6, j16, f24, f25, c0937i6, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                }
                f14 = f13;
                c0937i3 = c0937i2;
                f15 = f12;
                nVar3 = nVar2;
                androidx.compose.ui.h hVar8 = hVar2;
                l0Var2 = l0VarA;
                j12 = jFloatToRawIntBits;
                hVar3 = hVar8;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f118 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f118)) << 32) | (((long) Float.floatToRawIntBits(f118)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f119 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f1110 = N.f12244a;
                        float f1111 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f1112 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1112)) << 32) | (((long) Float.floatToRawIntBits(f1112)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f1113 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f1114 = N.f12244a;
                        float f1115 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                k10 = (androidx.compose.animation.core.K) objF;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar9 = hVar2;
                    final ScrollState scrollState7 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var7 = l0VarA;
                    final long j17 = jD;
                    final float f26 = f12;
                    final float f27 = f13;
                    final C0937i c0937i7 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar9, k10, x10, scrollState7, l0Var7, j17, f26, f27, c0937i7, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                } else {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar10 = hVar2;
                    final ScrollState scrollState8 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var8 = l0VarA;
                    final long j18 = jD;
                    final float f28 = f12;
                    final float f29 = f13;
                    final C0937i c0937i8 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar10, k10, x10, scrollState8, l0Var8, j18, f28, f29, c0937i8, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                }
                f14 = f13;
                c0937i3 = c0937i2;
                f15 = f12;
                nVar3 = nVar2;
                androidx.compose.ui.h hVar11 = hVar2;
                l0Var2 = l0VarA;
                j12 = jFloatToRawIntBits;
                hVar3 = hVar11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final ScrollState scrollState9 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var9 = l0Var2;
                final long j19 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.a(z10, aVar, hVar3, j12, scrollState9, nVar3, l0Var9, j19, f15, f14, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                i13 |= 3072;
                j11 = j;
            } else {
                j11 = j;
                if ((i10 & 3072) == 0) {
                    if (c1086gP.i(j11)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
            }
            if ((i10 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    scrollState2 = scrollState;
                    if (c1086gP.K(scrollState2)) {
                    }
                    i13 |= i30;
                } else {
                    scrollState2 = scrollState;
                }
                i13 |= i30;
            } else {
                scrollState2 = scrollState;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(nVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i10 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i29 = 524288;
                } else {
                    i29 = 524288;
                }
                i13 |= i29;
            }
            if ((i10 & 12582912) != 0) {
                if ((i12 & 128) == 0) {
                    i28 = 4194304;
                } else {
                    i28 = 4194304;
                }
                i13 |= i28;
            }
            i20 = 256 & i12;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.g(f10)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            i23 = 805306368;
            if (i22 == 0) {
                i13 |= i23;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.g(f11)) {
                    i23 = 536870912;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = 1024 & i12;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.K(c0937i)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i25 |= 48;
            } else if ((i11 & 48) == 0) {
                if (c1086gP.k(qVar)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i25 |= i27;
            }
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f1116 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1116)) << 32) | (((long) Float.floatToRawIntBits(f1116)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f1117 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f1118 = N.f12244a;
                        float f1119 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f11110 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11110)) << 32) | (((long) Float.floatToRawIntBits(f11110)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f11111 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f11112 = N.f12244a;
                        float f11113 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                k10 = (androidx.compose.animation.core.K) objF;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar12 = hVar2;
                    final ScrollState scrollState10 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var10 = l0VarA;
                    final long j110 = jD;
                    final float f210 = f12;
                    final float f211 = f13;
                    final C0937i c0937i9 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar12, k10, x10, scrollState10, l0Var10, j110, f210, f211, c0937i9, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                } else {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar13 = hVar2;
                    final ScrollState scrollState11 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var11 = l0VarA;
                    final long j111 = jD;
                    final float f212 = f12;
                    final float f213 = f13;
                    final C0937i c0937i10 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar13, k10, x10, scrollState11, l0Var11, j111, f212, f213, c0937i10, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                }
                f14 = f13;
                c0937i3 = c0937i2;
                f15 = f12;
                nVar3 = nVar2;
                androidx.compose.ui.h hVar14 = hVar2;
                l0Var2 = l0VarA;
                j12 = jFloatToRawIntBits;
                hVar3 = hVar14;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f11114 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11114)) << 32) | (((long) Float.floatToRawIntBits(f11114)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f11115 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f11116 = N.f12244a;
                        float f11117 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        float f11118 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11118)) << 32) | (((long) Float.floatToRawIntBits(f11118)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    if ((16 & i12) != 0) {
                        scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                        i13 &= -57345;
                    } else {
                        scrollStateA = scrollState;
                    }
                    if (i18 != 0) {
                        nVar2 = f12044a;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 64) != 0) {
                        float f11119 = N.f12244a;
                        l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                        i13 &= -3670017;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((128 & i12) != 0) {
                        float f111110 = N.f12244a;
                        float f111111 = B.p.f1311a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                        i13 = (-29360129) & i13;
                    } else {
                        jD = j10;
                    }
                    if (i20 != 0) {
                        f12 = N.f12244a;
                    } else {
                        f12 = f10;
                    }
                    if (i22 != 0) {
                        f13 = N.f12245b;
                    } else {
                        f13 = f11;
                    }
                    if (i24 != 0) {
                        c0937i2 = null;
                    } else {
                        c0937i2 = c0937i;
                    }
                }
                c1086gP.U();
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                    c1086gP.E(objF);
                }
                k10 = (androidx.compose.animation.core.K) objF;
                k10.f(Boolean.valueOf(z10));
                if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar15 = hVar2;
                    final ScrollState scrollState12 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var12 = l0VarA;
                    final long j112 = jD;
                    final float f214 = f12;
                    final float f215 = f13;
                    final C0937i c0937i11 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar15, k10, x10, scrollState12, l0Var12, j112, f214, f215, c0937i11, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                } else {
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                        c1086gP.E(objF2);
                    }
                    x10 = (androidx.compose.runtime.X) objF2;
                    cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zK = z11 | c1086gP.K(cVar);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                                x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                                return p293xa.r.f47939a;
                            }
                        });
                        c1086gP.E(objF3);
                    }
                    final androidx.compose.ui.h hVar16 = hVar2;
                    final ScrollState scrollState13 = scrollStateA;
                    final androidx.compose.ui.graphics.l0 l0Var13 = l0VarA;
                    final long j113 = jD;
                    final float f216 = f12;
                    final float f217 = f13;
                    final C0937i c0937i12 = c0937i2;
                    AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                                MenuKt.a(hVar16, k10, x10, scrollState13, l0Var13, j113, f216, f217, c0937i12, qVar, interfaceC1084f3, 384);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
                }
                f14 = f13;
                c0937i3 = c0937i2;
                f15 = f12;
                nVar3 = nVar2;
                androidx.compose.ui.h hVar17 = hVar2;
                l0Var2 = l0VarA;
                j12 = jFloatToRawIntBits;
                hVar3 = hVar17;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final ScrollState scrollState14 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var14 = l0Var2;
                final long j114 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.a(z10, aVar, hVar3, j12, scrollState14, nVar3, l0Var14, j114, f15, f14, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        hVar2 = hVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            i13 |= 3072;
            j11 = j;
        } else {
            j11 = j;
            if ((i10 & 3072) == 0) {
                if (c1086gP.i(j11)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
        }
        if ((i10 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                scrollState2 = scrollState;
                if (c1086gP.K(scrollState2)) {
                }
                i13 |= i30;
            } else {
                scrollState2 = scrollState;
            }
            i13 |= i30;
        } else {
            scrollState2 = scrollState;
        }
        i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(nVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        if ((i10 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i29 = 524288;
            } else {
                i29 = 524288;
            }
            i13 |= i29;
        }
        if ((i10 & 12582912) != 0) {
            if ((i12 & 128) == 0) {
                i28 = 4194304;
            } else {
                i28 = 4194304;
            }
            i13 |= i28;
        }
        i20 = 256 & i12;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.g(f10)) {
                i21 = 67108864;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        i22 = i12 & 512;
        i23 = 805306368;
        if (i22 == 0) {
            i13 |= i23;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.g(f11)) {
                i23 = 536870912;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        i24 = 1024 & i12;
        if (i24 != 0) {
            i25 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.K(c0937i)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i11 | i26;
        } else {
            i25 = i11;
        }
        if ((i12 & 2048) != 0) {
            i25 |= 48;
        } else if ((i11 & 48) == 0) {
            if (c1086gP.k(qVar)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i25 |= i27;
        }
        if ((306783379 & i13) != 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    float f111112 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f111112)) << 32) | (((long) Float.floatToRawIntBits(f111112)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                if ((16 & i12) != 0) {
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -57345;
                } else {
                    scrollStateA = scrollState;
                }
                if (i18 != 0) {
                    nVar2 = f12044a;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 64) != 0) {
                    float f111113 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -3670017;
                } else {
                    l0VarA = l0Var;
                }
                if ((128 & i12) != 0) {
                    float f111114 = N.f12244a;
                    float f111115 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 = (-29360129) & i13;
                } else {
                    jD = j10;
                }
                if (i20 != 0) {
                    f12 = N.f12244a;
                } else {
                    f12 = f10;
                }
                if (i22 != 0) {
                    f13 = N.f12245b;
                } else {
                    f13 = f11;
                }
                if (i24 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    float f111116 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f111116)) << 32) | (((long) Float.floatToRawIntBits(f111116)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                if ((16 & i12) != 0) {
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -57345;
                } else {
                    scrollStateA = scrollState;
                }
                if (i18 != 0) {
                    nVar2 = f12044a;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 64) != 0) {
                    float f111117 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -3670017;
                } else {
                    l0VarA = l0Var;
                }
                if ((128 & i12) != 0) {
                    float f111118 = N.f12244a;
                    float f111119 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 = (-29360129) & i13;
                } else {
                    jD = j10;
                }
                if (i20 != 0) {
                    f12 = N.f12244a;
                } else {
                    f12 = f10;
                }
                if (i22 != 0) {
                    f13 = N.f12245b;
                } else {
                    f13 = f11;
                }
                if (i24 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                c1086gP.E(objF);
            }
            k10 = (androidx.compose.animation.core.K) objF;
            k10.f(Boolean.valueOf(z10));
            if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zK = z11 | c1086gP.K(cVar);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                }
                final androidx.compose.ui.h hVar18 = hVar2;
                final ScrollState scrollState15 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var15 = l0VarA;
                final long j115 = jD;
                final float f218 = f12;
                final float f219 = f13;
                final C0937i c0937i13 = c0937i2;
                AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            MenuKt.a(hVar18, k10, x10, scrollState15, l0Var15, j115, f218, f219, c0937i13, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
            } else {
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zK = z11 | c1086gP.K(cVar);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                }
                final androidx.compose.ui.h hVar19 = hVar2;
                final ScrollState scrollState16 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var16 = l0VarA;
                final long j116 = jD;
                final float f2110 = f12;
                final float f2111 = f13;
                final C0937i c0937i14 = c0937i2;
                AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            MenuKt.a(hVar19, k10, x10, scrollState16, l0Var16, j116, f2110, f2111, c0937i14, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
            }
            f14 = f13;
            c0937i3 = c0937i2;
            f15 = f12;
            nVar3 = nVar2;
            androidx.compose.ui.h hVar110 = hVar2;
            l0Var2 = l0VarA;
            j12 = jFloatToRawIntBits;
            hVar3 = hVar110;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    float f1111110 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1111110)) << 32) | (((long) Float.floatToRawIntBits(f1111110)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                if ((16 & i12) != 0) {
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -57345;
                } else {
                    scrollStateA = scrollState;
                }
                if (i18 != 0) {
                    nVar2 = f12044a;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 64) != 0) {
                    float f1111111 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -3670017;
                } else {
                    l0VarA = l0Var;
                }
                if ((128 & i12) != 0) {
                    float f1111112 = N.f12244a;
                    float f1111113 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 = (-29360129) & i13;
                } else {
                    jD = j10;
                }
                if (i20 != 0) {
                    f12 = N.f12244a;
                } else {
                    f12 = f10;
                }
                if (i22 != 0) {
                    f13 = N.f12245b;
                } else {
                    f13 = f11;
                }
                if (i24 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    float f1111114 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1111114)) << 32) | (((long) Float.floatToRawIntBits(f1111114)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                if ((16 & i12) != 0) {
                    scrollStateA = ScrollKt.a(0, c1086gP, 0, 1);
                    i13 &= -57345;
                } else {
                    scrollStateA = scrollState;
                }
                if (i18 != 0) {
                    nVar2 = f12044a;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 64) != 0) {
                    float f1111115 = N.f12244a;
                    l0VarA = ShapesKt.a(B.p.f1312b, c1086gP);
                    i13 &= -3670017;
                } else {
                    l0VarA = l0Var;
                }
                if ((128 & i12) != 0) {
                    float f1111116 = N.f12244a;
                    float f1111117 = B.p.f1311a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12727t, c1086gP);
                    i13 = (-29360129) & i13;
                } else {
                    jD = j10;
                }
                if (i20 != 0) {
                    f12 = N.f12244a;
                } else {
                    f12 = f10;
                }
                if (i22 != 0) {
                    f13 = N.f12245b;
                } else {
                    f13 = f11;
                }
                if (i24 != 0) {
                    c0937i2 = null;
                } else {
                    c0937i2 = c0937i;
                }
            }
            c1086gP.U();
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new androidx.compose.animation.core.K(Boolean.FALSE);
                c1086gP.E(objF);
            }
            k10 = (androidx.compose.animation.core.K) objF;
            k10.f(Boolean.valueOf(z10));
            if (((Boolean) k10.f9381b.getValue()).booleanValue()) {
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zK = z11 | c1086gP.K(cVar);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                }
                final androidx.compose.ui.h hVar111 = hVar2;
                final ScrollState scrollState17 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var17 = l0VarA;
                final long j117 = jD;
                final float f2112 = f12;
                final float f2113 = f13;
                final C0937i c0937i15 = c0937i2;
                AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            MenuKt.a(hVar111, k10, x10, scrollState17, l0Var17, j117, f2112, f2113, c0937i15, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
            } else {
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = J0.f(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.q0.f13791b));
                    c1086gP.E(objF2);
                }
                x10 = (androidx.compose.runtime.X) objF2;
                cVar = (p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zK = z11 | c1086gP.K(cVar);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                } else {
                    objF3 = new androidx.compose.material3.internal.s(jFloatToRawIntBits, cVar, new Ia.p<p013b0.k, p013b0.k, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(p013b0.k kVar, p013b0.k kVar2) {
                            x10.setValue(new androidx.compose.ui.graphics.q0(MenuKt.c(kVar, kVar2)));
                            return p293xa.r.f47939a;
                        }
                    });
                    c1086gP.E(objF3);
                }
                final androidx.compose.ui.h hVar112 = hVar2;
                final ScrollState scrollState18 = scrollStateA;
                final androidx.compose.ui.graphics.l0 l0Var18 = l0VarA;
                final long j118 = jD;
                final float f2114 = f12;
                final float f2115 = f13;
                final C0937i c0937i16 = c0937i2;
                AndroidPopup_androidKt.a((androidx.compose.material3.internal.s) objF3, aVar, nVar2, androidx.compose.runtime.internal.a.b(2126968933, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
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
                            MenuKt.a(hVar112, k10, x10, scrollState18, l0Var18, j118, f2114, f2115, c0937i16, qVar, interfaceC1084f3, 384);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 3072 | ((i13 >> 9) & 896), 0);
            }
            f14 = f13;
            c0937i3 = c0937i2;
            f15 = f12;
            nVar3 = nVar2;
            androidx.compose.ui.h hVar113 = hVar2;
            l0Var2 = l0VarA;
            j12 = jFloatToRawIntBits;
            hVar3 = hVar113;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final ScrollState scrollState19 = scrollStateA;
            final androidx.compose.ui.graphics.l0 l0Var19 = l0Var2;
            final long j119 = jD;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidMenu_androidKt.a(z10, aVar, hVar3, j12, scrollState19, nVar3, l0Var19, j119, f15, f14, c0937i3, qVar, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:131:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9 A[PHI: r17
      0x00d9: PHI (r17v7 int) = (r17v0 int), (r17v3 int), (r17v4 int) binds: [B:78:0x00d7, B:86:0x00ed, B:85:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x012e, please report this as an issue */
    public static final void b(final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, boolean z10, O o10, androidx.compose.foundation.layout.L l10, androidx.compose.foundation.interaction.k kVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i16;
        int i17;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.ui.h hVar3;
        boolean z11;
        O o11;
        androidx.compose.foundation.layout.L l11;
        androidx.compose.foundation.layout.L l12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        C1061m c1061m;
        androidx.compose.foundation.layout.L l13;
        O o12;
        final androidx.compose.ui.h hVar4;
        androidx.compose.foundation.interaction.k kVar2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        boolean z12;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        C1105p0 c1105p0V;
        int i25;
        C1086g c1086gP = interfaceC1084f.p(1826340448);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(pVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((2 & i11) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.k(aVar) ? 32 : 16;
            }
            i13 = 4 & i11;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        pVar4 = pVar2;
                        if (c1086gP.k(pVar4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = 16 & i11;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            pVar5 = pVar3;
                            if (c1086gP.k(pVar5)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = 32 & i11;
                        if (i19 != 0) {
                            i12 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.c(z10)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        if ((i10 & 1572864) != 0) {
                            if ((i11 & 64) == 0 || !c1086gP.K(o10)) {
                                i25 = 524288;
                            } else {
                                i25 = 1048576;
                            }
                            i12 |= i25;
                        }
                        i21 = 128 & i11;
                        i22 = 12582912;
                        if (i21 == 0) {
                            i12 |= i22;
                        } else if ((i10 & 12582912) == 0) {
                            if (c1086gP.K(l10)) {
                                i22 = 8388608;
                            } else {
                                i22 = 4194304;
                            }
                            i12 |= i22;
                        }
                        i23 = 256 & i11;
                        if (i23 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(kVar)) {
                                i24 = 67108864;
                            } else {
                                i24 = 33554432;
                            }
                            i12 |= i24;
                        }
                        if ((i12 & 38347923) == 38347922 || !c1086gP.s()) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i13 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar2;
                                }
                                if (i15 != 0) {
                                    pVar4 = null;
                                }
                                if (i17 != 0) {
                                    pVar5 = null;
                                }
                                z11 = i19 == 0 ? z10 : true;
                                if ((i11 & 64) != 0) {
                                    float f10 = N.f12244a;
                                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                    o11 = c1061m.f12616S;
                                    if (o11 == null) {
                                        o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                        c1061m.f12616S = o11;
                                    }
                                    i12 &= -3670017;
                                } else {
                                    o11 = o10;
                                }
                                if (i21 != 0) {
                                    l11 = N.f12246c;
                                } else {
                                    l11 = l10;
                                }
                                if (i23 != 0) {
                                    l12 = l11;
                                    pVar6 = pVar4;
                                    pVar7 = pVar5;
                                    kVar = null;
                                } else {
                                    l12 = l11;
                                }
                                c1086gP.U();
                                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                                l13 = l12;
                                o12 = o11;
                                hVar4 = hVar3;
                                kVar2 = kVar;
                                pVar8 = pVar7;
                                z12 = z11;
                                pVar9 = pVar6;
                            } else {
                                c1086gP.w();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                z11 = z10;
                                o11 = o10;
                                l12 = l10;
                                hVar3 = hVar2;
                            }
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            c1086gP.U();
                            MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                            l13 = l12;
                            o12 = o11;
                            hVar4 = hVar3;
                            kVar2 = kVar;
                            pVar8 = pVar7;
                            z12 = z11;
                            pVar9 = pVar6;
                        } else {
                            c1086gP.w();
                            z12 = z10;
                            o12 = o10;
                            kVar2 = kVar;
                            hVar4 = hVar2;
                            pVar9 = pVar4;
                            pVar8 = pVar5;
                            l13 = l10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final boolean z13 = z12;
                            final O o13 = o12;
                            final androidx.compose.foundation.layout.L l14 = l13;
                            final androidx.compose.foundation.interaction.k kVar3 = kVar2;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z13, o13, l14, kVar3, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    pVar5 = pVar3;
                    i19 = 32 & i11;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.c(z10)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    i21 = 128 & i11;
                    i22 = 12582912;
                    if (i21 == 0) {
                        i12 |= i22;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(l10)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i12 |= i22;
                    }
                    i23 = 256 & i11;
                    if (i23 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(kVar)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i12 |= i24;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f11 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f12 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f13 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f14 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z14 = z12;
                        final O o14 = o12;
                        final androidx.compose.foundation.layout.L l15 = l13;
                        final androidx.compose.foundation.interaction.k kVar4 = kVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z14, o14, l15, kVar4, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                pVar4 = pVar2;
                i17 = 16 & i11;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar5 = pVar3;
                        if (c1086gP.k(pVar5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = 32 & i11;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.c(z10)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    i21 = 128 & i11;
                    i22 = 12582912;
                    if (i21 == 0) {
                        i12 |= i22;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(l10)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i12 |= i22;
                    }
                    i23 = 256 & i11;
                    if (i23 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(kVar)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i12 |= i24;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f15 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f16 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f17 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f18 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z15 = z12;
                        final O o15 = o12;
                        final androidx.compose.foundation.layout.L l16 = l13;
                        final androidx.compose.foundation.interaction.k kVar5 = kVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z15, o15, l16, kVar5, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar5 = pVar3;
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f19 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f110 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f112 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z16 = z12;
                    final O o16 = o12;
                    final androidx.compose.foundation.layout.L l17 = l13;
                    final androidx.compose.foundation.interaction.k kVar6 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z16, o16, l17, kVar6, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            hVar2 = hVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar4 = pVar2;
                    if (c1086gP.k(pVar4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = 16 & i11;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar5 = pVar3;
                        if (c1086gP.k(pVar5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = 32 & i11;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.c(z10)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    i21 = 128 & i11;
                    i22 = 12582912;
                    if (i21 == 0) {
                        i12 |= i22;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(l10)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i12 |= i22;
                    }
                    i23 = 256 & i11;
                    if (i23 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(kVar)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i12 |= i24;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f113 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f114 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f115 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f116 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z17 = z12;
                        final O o17 = o12;
                        final androidx.compose.foundation.layout.L l18 = l13;
                        final androidx.compose.foundation.interaction.k kVar7 = kVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z17, o17, l18, kVar7, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar5 = pVar3;
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f117 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f118 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f119 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f1110 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z18 = z12;
                    final O o18 = o12;
                    final androidx.compose.foundation.layout.L l19 = l13;
                    final androidx.compose.foundation.interaction.k kVar8 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z18, o18, l19, kVar8, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar4 = pVar2;
            i17 = 16 & i11;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar5 = pVar3;
                    if (c1086gP.k(pVar5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f1111 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f1112 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f1113 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f1114 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z19 = z12;
                    final O o19 = o12;
                    final androidx.compose.foundation.layout.L l110 = l13;
                    final androidx.compose.foundation.interaction.k kVar9 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z19, o19, l110, kVar9, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar5 = pVar3;
            i19 = 32 & i11;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            i21 = 128 & i11;
            i22 = 12582912;
            if (i21 == 0) {
                i12 |= i22;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i12 |= i24;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1115 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1116 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1117 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1118 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z110 = z12;
                final O o110 = o12;
                final androidx.compose.foundation.layout.L l111 = l13;
                final androidx.compose.foundation.interaction.k kVar10 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z110, o110, l111, kVar10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = 4 & i11;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar4 = pVar2;
                    if (c1086gP.k(pVar4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = 16 & i11;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar5 = pVar3;
                        if (c1086gP.k(pVar5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = 32 & i11;
                    if (i19 != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.c(z10)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 1572864) != 0) {
                        if ((i11 & 64) == 0) {
                            i25 = 524288;
                        } else {
                            i25 = 524288;
                        }
                        i12 |= i25;
                    }
                    i21 = 128 & i11;
                    i22 = 12582912;
                    if (i21 == 0) {
                        i12 |= i22;
                    } else if ((i10 & 12582912) == 0) {
                        if (c1086gP.K(l10)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i12 |= i22;
                    }
                    i23 = 256 & i11;
                    if (i23 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(kVar)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i12 |= i24;
                    }
                    if ((i12 & 38347923) == 38347922) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f1119 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f11110 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f11111 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 != 0) {
                                pVar5 = null;
                            }
                            if (i19 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                float f11112 = N.f12244a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                o11 = c1061m.f12616S;
                                if (o11 == null) {
                                    o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                    c1061m.f12616S = o11;
                                }
                                i12 &= -3670017;
                            } else {
                                o11 = o10;
                            }
                            if (i21 != 0) {
                                l11 = N.f12246c;
                            } else {
                                l11 = l10;
                            }
                            if (i23 != 0) {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                                kVar = null;
                            } else {
                                l12 = l11;
                                pVar6 = pVar4;
                                pVar7 = pVar5;
                            }
                        }
                        c1086gP.U();
                        MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                        l13 = l12;
                        o12 = o11;
                        hVar4 = hVar3;
                        kVar2 = kVar;
                        pVar8 = pVar7;
                        z12 = z11;
                        pVar9 = pVar6;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z111 = z12;
                        final O o111 = o12;
                        final androidx.compose.foundation.layout.L l112 = l13;
                        final androidx.compose.foundation.interaction.k kVar11 = kVar2;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z111, o111, l112, kVar11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar5 = pVar3;
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11113 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11114 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11115 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11116 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z112 = z12;
                    final O o112 = o12;
                    final androidx.compose.foundation.layout.L l113 = l13;
                    final androidx.compose.foundation.interaction.k kVar12 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z112, o112, l113, kVar12, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar4 = pVar2;
            i17 = 16 & i11;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar5 = pVar3;
                    if (c1086gP.k(pVar5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11117 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11118 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f11119 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111110 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z113 = z12;
                    final O o113 = o12;
                    final androidx.compose.foundation.layout.L l114 = l13;
                    final androidx.compose.foundation.interaction.k kVar13 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z113, o113, l114, kVar13, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar5 = pVar3;
            i19 = 32 & i11;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            i21 = 128 & i11;
            i22 = 12582912;
            if (i21 == 0) {
                i12 |= i22;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i12 |= i24;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f111111 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f111112 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f111113 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f111114 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z114 = z12;
                final O o114 = o12;
                final androidx.compose.foundation.layout.L l115 = l13;
                final androidx.compose.foundation.interaction.k kVar14 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z114, o114, l115, kVar14, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                pVar4 = pVar2;
                if (c1086gP.k(pVar4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = 16 & i11;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar5 = pVar3;
                    if (c1086gP.k(pVar5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = 32 & i11;
                if (i19 != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0) {
                        i25 = 524288;
                    } else {
                        i25 = 524288;
                    }
                    i12 |= i25;
                }
                i21 = 128 & i11;
                i22 = 12582912;
                if (i21 == 0) {
                    i12 |= i22;
                } else if ((i10 & 12582912) == 0) {
                    if (c1086gP.K(l10)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i12 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(kVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i12 |= i24;
                }
                if ((i12 & 38347923) == 38347922) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111115 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111116 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111117 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 != 0) {
                            pVar5 = null;
                        }
                        if (i19 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            float f111118 = N.f12244a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            o11 = c1061m.f12616S;
                            if (o11 == null) {
                                o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                                c1061m.f12616S = o11;
                            }
                            i12 &= -3670017;
                        } else {
                            o11 = o10;
                        }
                        if (i21 != 0) {
                            l11 = N.f12246c;
                        } else {
                            l11 = l10;
                        }
                        if (i23 != 0) {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                            kVar = null;
                        } else {
                            l12 = l11;
                            pVar6 = pVar4;
                            pVar7 = pVar5;
                        }
                    }
                    c1086gP.U();
                    MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                    l13 = l12;
                    o12 = o11;
                    hVar4 = hVar3;
                    kVar2 = kVar;
                    pVar8 = pVar7;
                    z12 = z11;
                    pVar9 = pVar6;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z115 = z12;
                    final O o115 = o12;
                    final androidx.compose.foundation.layout.L l116 = l13;
                    final androidx.compose.foundation.interaction.k kVar15 = kVar2;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z115, o115, l116, kVar15, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar5 = pVar3;
            i19 = 32 & i11;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            i21 = 128 & i11;
            i22 = 12582912;
            if (i21 == 0) {
                i12 |= i22;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i12 |= i24;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f111119 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111110 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111111 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111112 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z116 = z12;
                final O o116 = o12;
                final androidx.compose.foundation.layout.L l117 = l13;
                final androidx.compose.foundation.interaction.k kVar16 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z116, o116, l117, kVar16, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVar4 = pVar2;
        i17 = 16 & i11;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                pVar5 = pVar3;
                if (c1086gP.k(pVar5)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = 32 & i11;
            if (i19 != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i25 = 524288;
                } else {
                    i25 = 524288;
                }
                i12 |= i25;
            }
            i21 = 128 & i11;
            i22 = 12582912;
            if (i21 == 0) {
                i12 |= i22;
            } else if ((i10 & 12582912) == 0) {
                if (c1086gP.K(l10)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i12 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(kVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i12 |= i24;
            }
            if ((i12 & 38347923) == 38347922) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111113 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111114 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111115 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                } else {
                    if (i13 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 != 0) {
                        pVar5 = null;
                    }
                    if (i19 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        float f1111116 = N.f12244a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        o11 = c1061m.f12616S;
                        if (o11 == null) {
                            o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                            c1061m.f12616S = o11;
                        }
                        i12 &= -3670017;
                    } else {
                        o11 = o10;
                    }
                    if (i21 != 0) {
                        l11 = N.f12246c;
                    } else {
                        l11 = l10;
                    }
                    if (i23 != 0) {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                        kVar = null;
                    } else {
                        l12 = l11;
                        pVar6 = pVar4;
                        pVar7 = pVar5;
                    }
                }
                c1086gP.U();
                MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
                l13 = l12;
                o12 = o11;
                hVar4 = hVar3;
                kVar2 = kVar;
                pVar8 = pVar7;
                z12 = z11;
                pVar9 = pVar6;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z117 = z12;
                final O o117 = o12;
                final androidx.compose.foundation.layout.L l118 = l13;
                final androidx.compose.foundation.interaction.k kVar17 = kVar2;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z117, o117, l118, kVar17, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        pVar5 = pVar3;
        i19 = 32 & i11;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.c(z10)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i12 |= i20;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i25 = 524288;
            } else {
                i25 = 524288;
            }
            i12 |= i25;
        }
        i21 = 128 & i11;
        i22 = 12582912;
        if (i21 == 0) {
            i12 |= i22;
        } else if ((i10 & 12582912) == 0) {
            if (c1086gP.K(l10)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i12 |= i22;
        }
        i23 = 256 & i11;
        if (i23 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(kVar)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i12 |= i24;
        }
        if ((i12 & 38347923) == 38347922) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if (i19 == 0) {
                }
                if ((i11 & 64) != 0) {
                    float f1111117 = N.f12244a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    o11 = c1061m.f12616S;
                    if (o11 == null) {
                        o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                        c1061m.f12616S = o11;
                    }
                    i12 &= -3670017;
                } else {
                    o11 = o10;
                }
                if (i21 != 0) {
                    l11 = N.f12246c;
                } else {
                    l11 = l10;
                }
                if (i23 != 0) {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    kVar = null;
                } else {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
            } else {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if (i19 == 0) {
                }
                if ((i11 & 64) != 0) {
                    float f1111118 = N.f12244a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    o11 = c1061m.f12616S;
                    if (o11 == null) {
                        o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                        c1061m.f12616S = o11;
                    }
                    i12 &= -3670017;
                } else {
                    o11 = o10;
                }
                if (i21 != 0) {
                    l11 = N.f12246c;
                } else {
                    l11 = l10;
                }
                if (i23 != 0) {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    kVar = null;
                } else {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
            }
            c1086gP.U();
            MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
            l13 = l12;
            o12 = o11;
            hVar4 = hVar3;
            kVar2 = kVar;
            pVar8 = pVar7;
            z12 = z11;
            pVar9 = pVar6;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if (i19 == 0) {
                }
                if ((i11 & 64) != 0) {
                    float f1111119 = N.f12244a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    o11 = c1061m.f12616S;
                    if (o11 == null) {
                        o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                        c1061m.f12616S = o11;
                    }
                    i12 &= -3670017;
                } else {
                    o11 = o10;
                }
                if (i21 != 0) {
                    l11 = N.f12246c;
                } else {
                    l11 = l10;
                }
                if (i23 != 0) {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    kVar = null;
                } else {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
            } else {
                if (i13 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar2;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 != 0) {
                    pVar5 = null;
                }
                if (i19 == 0) {
                }
                if ((i11 & 64) != 0) {
                    float f11111110 = N.f12244a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    o11 = c1061m.f12616S;
                    if (o11 == null) {
                        o11 = new O(ColorSchemeKt.c(c1061m, B.o.f1307g), ColorSchemeKt.c(c1061m, B.o.f1308h), ColorSchemeKt.c(c1061m, B.o.j), androidx.compose.ui.graphics.H.b(B.o.f1302b, ColorSchemeKt.c(c1061m, B.o.f1301a)), androidx.compose.ui.graphics.H.b(B.o.f1304d, ColorSchemeKt.c(c1061m, B.o.f1303c)), androidx.compose.ui.graphics.H.b(B.o.f1306f, ColorSchemeKt.c(c1061m, B.o.f1305e)));
                        c1061m.f12616S = o11;
                    }
                    i12 &= -3670017;
                } else {
                    o11 = o10;
                }
                if (i21 != 0) {
                    l11 = N.f12246c;
                } else {
                    l11 = l10;
                }
                if (i23 != 0) {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                    kVar = null;
                } else {
                    l12 = l11;
                    pVar6 = pVar4;
                    pVar7 = pVar5;
                }
            }
            c1086gP.U();
            MenuKt.b(pVar, aVar, hVar3, pVar6, pVar7, z11, o11, l12, kVar, c1086gP, i12 & 268435454);
            l13 = l12;
            o12 = o11;
            hVar4 = hVar3;
            kVar2 = kVar;
            pVar8 = pVar7;
            z12 = z11;
            pVar9 = pVar6;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z118 = z12;
            final O o118 = o12;
            final androidx.compose.foundation.layout.L l119 = l13;
            final androidx.compose.foundation.interaction.k kVar18 = kVar2;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenuItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidMenu_androidKt.b(pVar, aVar, hVar4, pVar9, pVar8, z118, o118, l119, kVar18, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
