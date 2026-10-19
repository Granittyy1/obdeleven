package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BottomSheetDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BottomSheetDefaults f12059a = new BottomSheetDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12061c;

    static {
        float f10 = B.v.f1374a;
        f12060b = B.v.f1376c;
        f12061c = 640;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce A[PHI: r6 r7 r9 r10 r11
      0x00ce: PHI (r6v8 androidx.compose.ui.h) = (r6v4 androidx.compose.ui.h), (r6v3 androidx.compose.ui.h), (r6v3 androidx.compose.ui.h) binds: [B:85:0x00f6, B:72:0x00cb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r7v18 int) = (r7v13 int), (r7v19 int), (r7v20 int) binds: [B:85:0x00f6, B:72:0x00cb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r9v10 float) = (r9v3 float), (r9v2 float), (r9v2 float) binds: [B:85:0x00f6, B:72:0x00cb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r10v15 float) = (r10v7 float), (r10v6 float), (r10v6 float) binds: [B:85:0x00f6, B:72:0x00cb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r11v10 androidx.compose.ui.graphics.l0) = 
      (r11v7 androidx.compose.ui.graphics.l0)
      (r11v6 androidx.compose.ui.graphics.l0)
      (r11v6 androidx.compose.ui.graphics.l0)
     binds: [B:85:0x00f6, B:72:0x00cb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0121  */
    /* JADX WARN: Code duplicated, block: B:91:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public final void a(androidx.compose.ui.h hVar, float f10, float f11, androidx.compose.ui.graphics.l0 l0Var, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        float f12;
        int i13;
        float f13;
        int i14;
        androidx.compose.ui.graphics.l0 l0Var2;
        long j10;
        long jD;
        final float f14;
        final float f15;
        androidx.compose.ui.graphics.l0 l0Var3;
        final String strG;
        boolean zK;
        Object objF;
        final float f16;
        final androidx.compose.ui.graphics.l0 l0Var4;
        final androidx.compose.ui.h hVar3;
        final long j11;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1364277227);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 6) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                f12 = f10;
                i12 |= c1086gP.g(f12) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    f13 = f11;
                    if (c1086gP.g(f13)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0Var2 = l0Var;
                        int i17 = c1086gP.K(l0Var2) ? 2048 : 1024;
                        i12 |= i17;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i12 |= i17;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j10 = j;
                        int i18 = c1086gP.i(j10) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        j10 = j;
                    }
                    i12 |= i18;
                } else {
                    j10 = j;
                }
                if ((i12 & 9363) == 9362 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0 || c1086gP.a0()) {
                        if (i15 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            f12 = B.v.f1375b;
                        }
                        if (i13 != 0) {
                            f13 = B.v.f1374a;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                        }
                        if ((i11 & 16) != 0) {
                            float f17 = B.v.f1374a;
                            i12 &= -57345;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                            f14 = f12;
                            f15 = f13;
                            l0Var3 = l0Var2;
                        }
                        c1086gP.U();
                        strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                        androidx.compose.ui.h hVarH = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                        zK = c1086gP.K(strG);
                        objF = c1086gP.f();
                        if (zK || objF == InterfaceC1084f.a.f12980a) {
                            objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.g(strG, wVar);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        int i19 = i12 >> 6;
                        SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                                    BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i19 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i19 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                        f12 = f14;
                        f16 = f15;
                        l0Var4 = l0Var3;
                        hVar3 = hVar2;
                        j11 = jD;
                    } else {
                        c1086gP.w();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                    }
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                    jD = j10;
                    c1086gP.U();
                    strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                    androidx.compose.ui.h hVarH2 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                    zK = c1086gP.K(strG);
                    objF = c1086gP.f();
                    if (zK) {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.g(strG, wVar);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.g(strG, wVar);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    int i110 = i12 >> 6;
                    SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH2, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                                BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i110 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i110 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                    f12 = f14;
                    f16 = f15;
                    l0Var4 = l0Var3;
                    hVar3 = hVar2;
                    j11 = jD;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    f16 = f13;
                    l0Var4 = l0Var2;
                    j11 = j10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final float f18 = f12;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp1_rcvr.a(hVar3, f18, f16, l0Var4, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            f13 = f11;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0Var2 = l0Var;
                    if (c1086gP.K(l0Var2)) {
                    }
                    i12 |= i17;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i17;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j10 = j;
                    if (c1086gP.i(j10)) {
                    }
                    i12 |= i18;
                } else {
                    j10 = j;
                }
                i12 |= i18;
            } else {
                j10 = j;
            }
            if ((i12 & 9363) == 9362) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f19 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f110 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                }
                c1086gP.U();
                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                androidx.compose.ui.h hVarH3 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                zK = c1086gP.K(strG);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                int i111 = i12 >> 6;
                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH3, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                            BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i111 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i111 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                f12 = f14;
                f16 = f15;
                l0Var4 = l0Var3;
                hVar3 = hVar2;
                j11 = jD;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f111 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f112 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                }
                c1086gP.U();
                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                androidx.compose.ui.h hVarH4 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                zK = c1086gP.K(strG);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                int i112 = i12 >> 6;
                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH4, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                            BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i112 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i112 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                f12 = f14;
                f16 = f15;
                l0Var4 = l0Var3;
                hVar3 = hVar2;
                j11 = jD;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f113 = f12;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp1_rcvr.a(hVar3, f113, f16, l0Var4, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        f12 = f10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                f13 = f11;
                if (c1086gP.g(f13)) {
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
                    i12 |= i17;
                } else {
                    l0Var2 = l0Var;
                }
                i12 |= i17;
            } else {
                l0Var2 = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j10 = j;
                    if (c1086gP.i(j10)) {
                    }
                    i12 |= i18;
                } else {
                    j10 = j;
                }
                i12 |= i18;
            } else {
                j10 = j;
            }
            if ((i12 & 9363) == 9362) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f114 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f115 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                }
                c1086gP.U();
                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                androidx.compose.ui.h hVarH5 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                zK = c1086gP.K(strG);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                int i113 = i12 >> 6;
                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH5, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                            BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i113 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i113 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                f12 = f14;
                f16 = f15;
                l0Var4 = l0Var3;
                hVar3 = hVar2;
                j11 = jD;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f116 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                } else {
                    if (i15 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        f12 = B.v.f1375b;
                    }
                    if (i13 != 0) {
                        f13 = B.v.f1374a;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                    }
                    if ((i11 & 16) != 0) {
                        float f117 = B.v.f1374a;
                        i12 &= -57345;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                    } else {
                        f14 = f12;
                        f15 = f13;
                        l0Var3 = l0Var2;
                        jD = j10;
                    }
                }
                c1086gP.U();
                strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
                androidx.compose.ui.h hVarH6 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
                zK = c1086gP.K(strG);
                objF = c1086gP.f();
                if (zK) {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.g(strG, wVar);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                int i114 = i12 >> 6;
                SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH6, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                            BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i114 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i114 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
                f12 = f14;
                f16 = f15;
                l0Var4 = l0Var3;
                hVar3 = hVar2;
                j11 = jD;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f118 = f12;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp1_rcvr.a(hVar3, f118, f16, l0Var4, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        f13 = f11;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0Var2 = l0Var;
                if (c1086gP.K(l0Var2)) {
                }
                i12 |= i17;
            } else {
                l0Var2 = l0Var;
            }
            i12 |= i17;
        } else {
            l0Var2 = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j10 = j;
                if (c1086gP.i(j10)) {
                }
                i12 |= i18;
            } else {
                j10 = j;
            }
            i12 |= i18;
        } else {
            j10 = j;
        }
        if ((i12 & 9363) == 9362) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    f12 = B.v.f1375b;
                }
                if (i13 != 0) {
                    f13 = B.v.f1374a;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                }
                if ((i11 & 16) != 0) {
                    float f119 = B.v.f1374a;
                    i12 &= -57345;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                } else {
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                    jD = j10;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    f12 = B.v.f1375b;
                }
                if (i13 != 0) {
                    f13 = B.v.f1374a;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                }
                if ((i11 & 16) != 0) {
                    float f1110 = B.v.f1374a;
                    i12 &= -57345;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                } else {
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                    jD = j10;
                }
            }
            c1086gP.U();
            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
            androidx.compose.ui.h hVarH7 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
            zK = c1086gP.K(strG);
            objF = c1086gP.f();
            if (zK) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.g(strG, wVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.g(strG, wVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            int i115 = i12 >> 6;
            SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH7, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                        BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i115 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i115 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            f12 = f14;
            f16 = f15;
            l0Var4 = l0Var3;
            hVar3 = hVar2;
            j11 = jD;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    f12 = B.v.f1375b;
                }
                if (i13 != 0) {
                    f13 = B.v.f1374a;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                }
                if ((i11 & 16) != 0) {
                    float f1111 = B.v.f1374a;
                    i12 &= -57345;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                } else {
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                    jD = j10;
                }
            } else {
                if (i15 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    f12 = B.v.f1375b;
                }
                if (i13 != 0) {
                    f13 = B.v.f1374a;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    l0Var2 = ((c0) c1086gP.x(ShapesKt.f12298a)).f12433e;
                }
                if ((i11 & 16) != 0) {
                    float f1112 = B.v.f1374a;
                    i12 &= -57345;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.j, c1086gP);
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                } else {
                    f14 = f12;
                    f15 = f13;
                    l0Var3 = l0Var2;
                    jD = j10;
                }
            }
            c1086gP.U();
            strG = com.voltasit.obdeleven.domain.usecases.device.v.g(c1086gP, R.string.m3c_bottom_sheet_drag_handle_description);
            androidx.compose.ui.h hVarH8 = PaddingKt.h(hVar2, 0.0f, e0.f12442a, 1);
            zK = c1086gP.K(strG);
            objF = c1086gP.f();
            if (zK) {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.g(strG, wVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.g(strG, wVar);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            int i116 = i12 >> 6;
            SurfaceKt.a(androidx.compose.ui.semantics.p.b(hVarH8, false, (Ia.l) objF), l0Var3, jD, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.a.b(-1039573072, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
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
                        BoxKt.a(androidx.compose.foundation.layout.W.n(f14, f15, androidx.compose.ui.h.a.f13984b), interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i116 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 12582912 | (i116 & 896), me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_windowFixedHeightMajor);
            f12 = f14;
            f16 = f15;
            l0Var4 = l0Var3;
            hVar3 = hVar2;
            j11 = jD;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f1113 = f12;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp1_rcvr.a(hVar3, f1113, f16, l0Var4, j11, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
