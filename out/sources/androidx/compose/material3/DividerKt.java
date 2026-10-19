package androidx.compose.material3;

import B.C0611f;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DividerKt {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(androidx.compose.ui.h hVar, float f10, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final float f11;
        final long jD;
        androidx.compose.ui.h hVar2;
        boolean z10;
        boolean z11;
        Object objF;
        final androidx.compose.ui.h hVar3;
        final long j10;
        C1105p0 c1105p0V;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(75144485);
        boolean z12 = true;
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c1086gP.g(f11) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                jD = j;
                if ((i11 & 4) == 0 || !c1086gP.i(jD)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                jD = j;
            }
            if ((i12 & 147) == 146 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        f11 = C1073z.f12769a;
                    }
                    if ((i11 & 4) != 0) {
                        float f12 = C1073z.f12769a;
                        float f13 = C0611f.f1264a;
                        i12 &= -897;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    hVar2 = hVar;
                }
                c1086gP.U();
                androidx.compose.ui.h hVarE = androidx.compose.foundation.layout.W.e(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), f11);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((((i12 & 896) ^ 384) > 256 || !c1086gP.i(jD)) && (i12 & 384) != 256) {
                }
                z11 = z10 | z12;
                objF = c1086gP.f();
                if (z11 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            J.e eVar2 = eVar;
                            float f14 = 2;
                            eVar2.Q0(jD, I.e.c(0.0f, eVar2.T0(f11) / f14), I.e.c(I.h.d(eVar2.j()), eVar2.T0(f11) / f14), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarE, (Ia.l) objF, c1086gP, 0);
                hVar3 = hVar2;
            } else {
                c1086gP.w();
                hVar3 = hVar;
            }
            j10 = jD;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f14 = f11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DividerKt.a(hVar3, f14, j10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & 384) == 0) {
            jD = j;
            if ((i11 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            jD = j;
        }
        if ((i12 & 147) == 146) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f15 = C1073z.f12769a;
                    float f16 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f17 = C1073z.f12769a;
                    float f18 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarE2 = androidx.compose.foundation.layout.W.e(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), f11);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z12 = ((i12 & 896) ^ 384) > 256 ? false : false;
            z11 = z10 | z12;
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f19 = 2;
                        eVar2.Q0(jD, I.e.c(0.0f, eVar2.T0(f11) / f19), I.e.c(I.h.d(eVar2.j()), eVar2.T0(f11) / f19), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f19 = 2;
                        eVar2.Q0(jD, I.e.c(0.0f, eVar2.T0(f11) / f19), I.e.c(I.h.d(eVar2.j()), eVar2.T0(f11) / f19), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarE2, (Ia.l) objF, c1086gP, 0);
            hVar3 = hVar2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f19 = C1073z.f12769a;
                    float f110 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f111 = C1073z.f12769a;
                    float f112 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarE3 = androidx.compose.foundation.layout.W.e(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), f11);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i12 & 896) ^ 384) > 256) {
            }
            z11 = z10 | z12;
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f113 = 2;
                        eVar2.Q0(jD, I.e.c(0.0f, eVar2.T0(f11) / f113), I.e.c(I.h.d(eVar2.j()), eVar2.T0(f11) / f113), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f113 = 2;
                        eVar2.Q0(jD, I.e.c(0.0f, eVar2.T0(f11) / f113), I.e.c(I.h.d(eVar2.j()), eVar2.T0(f11) / f113), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarE3, (Ia.l) objF, c1086gP, 0);
            hVar3 = hVar2;
        }
        j10 = jD;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f113 = f11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$HorizontalDivider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DividerKt.a(hVar3, f113, j10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void b(androidx.compose.ui.h hVar, float f10, long j, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final float f11;
        final long jD;
        androidx.compose.ui.h hVar2;
        boolean z10;
        boolean z11;
        Object objF;
        final androidx.compose.ui.h hVar3;
        final long j10;
        C1105p0 c1105p0V;
        int i13;
        C1086g c1086gP = interfaceC1084f.p(-1534852205);
        boolean z12 = true;
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i15 = i11 & 2;
        if (i15 == 0) {
            if ((i10 & 48) == 0) {
                f11 = f10;
                i12 |= c1086gP.g(f11) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                jD = j;
                if ((i11 & 4) == 0 || !c1086gP.i(jD)) {
                    i13 = 128;
                } else {
                    i13 = 256;
                }
                i12 |= i13;
            } else {
                jD = j;
            }
            if ((i12 & 147) == 146 || !c1086gP.s()) {
                c1086gP.r0();
                if ((i10 & 1) != 0 || c1086gP.a0()) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i15 != 0) {
                        f11 = C1073z.f12769a;
                    }
                    if ((i11 & 4) != 0) {
                        float f12 = C1073z.f12769a;
                        float f13 = C0611f.f1264a;
                        i12 &= -897;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                    }
                } else {
                    c1086gP.w();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    hVar2 = hVar;
                }
                c1086gP.U();
                androidx.compose.ui.h hVarQ = androidx.compose.foundation.layout.W.q(androidx.compose.foundation.layout.W.c(hVar2, 1.0f), f11);
                if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((((i12 & 896) ^ 384) > 256 || !c1086gP.i(jD)) && (i12 & 384) != 256) {
                }
                z11 = z10 | z12;
                objF = c1086gP.f();
                if (z11 || objF == InterfaceC1084f.a.f12980a) {
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            J.e eVar2 = eVar;
                            float f14 = 2;
                            eVar2.Q0(jD, I.e.c(eVar2.T0(f11) / f14, 0.0f), I.e.c(eVar2.T0(f11) / f14, I.h.b(eVar2.j())), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarQ, (Ia.l) objF, c1086gP, 0);
                hVar3 = hVar2;
            } else {
                c1086gP.w();
                hVar3 = hVar;
            }
            j10 = jD;
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final float f14 = f11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        DividerKt.b(hVar3, f14, j10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        f11 = f10;
        if ((i10 & 384) == 0) {
            jD = j;
            if ((i11 & 4) == 0) {
                i13 = 128;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        } else {
            jD = j;
        }
        if ((i12 & 147) == 146) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f15 = C1073z.f12769a;
                    float f16 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f17 = C1073z.f12769a;
                    float f18 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarQ2 = androidx.compose.foundation.layout.W.q(androidx.compose.foundation.layout.W.c(hVar2, 1.0f), f11);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z12 = ((i12 & 896) ^ 384) > 256 ? false : false;
            z11 = z10 | z12;
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f19 = 2;
                        eVar2.Q0(jD, I.e.c(eVar2.T0(f11) / f19, 0.0f), I.e.c(eVar2.T0(f11) / f19, I.h.b(eVar2.j())), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f19 = 2;
                        eVar2.Q0(jD, I.e.c(eVar2.T0(f11) / f19, 0.0f), I.e.c(eVar2.T0(f11) / f19, I.h.b(eVar2.j())), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarQ2, (Ia.l) objF, c1086gP, 0);
            hVar3 = hVar2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f19 = C1073z.f12769a;
                    float f110 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i15 != 0) {
                    f11 = C1073z.f12769a;
                }
                if ((i11 & 4) != 0) {
                    float f111 = C1073z.f12769a;
                    float f112 = C0611f.f1264a;
                    i12 &= -897;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12720m, c1086gP);
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarQ3 = androidx.compose.foundation.layout.W.q(androidx.compose.foundation.layout.W.c(hVar2, 1.0f), f11);
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (((i12 & 896) ^ 384) > 256) {
            }
            z11 = z10 | z12;
            objF = c1086gP.f();
            if (z11) {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f113 = 2;
                        eVar2.Q0(jD, I.e.c(eVar2.T0(f11) / f113, 0.0f), I.e.c(eVar2.T0(f11) / f113, I.h.b(eVar2.j())), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        J.e eVar2 = eVar;
                        float f113 = 2;
                        eVar2.Q0(jD, I.e.c(eVar2.T0(f11) / f113, 0.0f), I.e.c(eVar2.T0(f11) / f113, I.h.b(eVar2.j())), eVar2.T0(f11), (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarQ3, (Ia.l) objF, c1086gP, 0);
            hVar3 = hVar2;
        }
        j10 = jD;
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final float f113 = f11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.DividerKt$VerticalDivider$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DividerKt.b(hVar3, f113, j10, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
