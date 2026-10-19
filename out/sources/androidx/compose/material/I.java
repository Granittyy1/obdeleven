package androidx.compose.material;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0917q;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.e0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0917q f11756b;

    static {
        float f10 = H.f11754a;
        f11755a = 40;
        new C0917q(0.2f, 0.0f, 0.8f, 1.0f);
        new C0917q(0.4f, 0.0f, 1.0f, 1.0f);
        new C0917q(0.0f, 0.0f, 0.65f, 1.0f);
        new C0917q(0.1f, 0.0f, 0.45f, 1.0f);
        f11756b = new C0917q(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x0207  */
    /* JADX WARN: Code duplicated, block: B:108:0x0218  */
    /* JADX WARN: Code duplicated, block: B:110:0x021c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0250  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f7  */
    public static final void a(androidx.compose.ui.h hVar, long j, float f10, long j10, int i10, final int i11, InterfaceC1084f interfaceC1084f, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        long jF;
        float f11;
        int i14;
        int i15;
        int i16;
        boolean z10;
        final long j11;
        final androidx.compose.ui.h hVar3;
        final long j12;
        final float f12;
        final int i17;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar4;
        long j13;
        int i18;
        int i19;
        final J.i iVar;
        int i20;
        final InfiniteTransition.a aVarB;
        final InfiniteTransition.a aVarA;
        final InfiniteTransition.a aVarA2;
        final InfiniteTransition.a aVarA3;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objF;
        C1086g c1086gP = interfaceC1084f.p(-1119119072);
        int i21 = i12 & 1;
        if (i21 != 0) {
            i13 = i11 | 6;
            hVar2 = hVar;
        } else if ((i11 & 6) == 0) {
            hVar2 = hVar;
            i13 = (c1086gP.K(hVar2) ? 4 : 2) | i11;
        } else {
            hVar2 = hVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            jF = j;
            i13 |= ((i12 & 2) == 0 && c1086gP.i(jF)) ? 32 : 16;
        } else {
            jF = j;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & 384) == 0) {
                f11 = f10;
                i13 |= c1086gP.g(f11) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.i(j10)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        i16 = i10;
                        int i23 = c1086gP.h(i16) ? 16384 : 8192;
                        i13 |= i23;
                    } else {
                        i16 = i10;
                    }
                    i13 |= i23;
                } else {
                    i16 = i10;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i13 & 1, z10)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0 || c1086gP.a0()) {
                        if (i21 != 0) {
                            hVar4 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar4 = hVar2;
                        }
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                            jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                        }
                        if (i22 != 0) {
                            f11 = H.f11754a;
                        }
                        if (i14 != 0) {
                            j13 = androidx.compose.ui.graphics.H.f13503k;
                        } else {
                            j13 = j10;
                        }
                        if ((i12 & 16) != 0) {
                            j11 = j13;
                            i18 = i13 & (-57345);
                            j12 = jF;
                            f12 = f11;
                            i19 = 2;
                        } else {
                            j11 = j13;
                        }
                        c1086gP.U();
                        iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i19, 0, 26);
                        InfiniteTransition infiniteTransitionC = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                        e0 e0Var = VectorConvertersKt.f9478b;
                        p005a4.p pVar = C0922w.f9638d;
                        i20 = i18;
                        aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC, 0, 5, e0Var, C0907g.a(C0907g.d(6660, 0, pVar, 2), null, 6), null, c1086gP, 33208, 16);
                        aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar, 2), null, 6), null, c1086gP, 4536, 8);
                        aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                                androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                                bVar2.f9379a = 1332;
                                bVar2.a(0, Float.valueOf(0.0f)).f9363c = I.f11756b;
                                bVar2.a(666, Float.valueOf(290.0f));
                                return p293xa.r.f47939a;
                            }
                        }), null, 6), null, c1086gP, 4536, 8);
                        aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                                androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                                bVar2.f9379a = 1332;
                                bVar2.a(666, Float.valueOf(0.0f)).f9363c = I.f11756b;
                                bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                                return p293xa.r.f47939a;
                            }
                        }), null, 6), null, c1086gP, 4536, 8);
                        androidx.compose.ui.h hVarM = W.m(ProgressSemanticsKt.a(hVar4), f11755a);
                        if ((i20 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean zK = c1086gP.k(iVar) | z11 | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                        androidx.compose.ui.h hVar5 = hVar4;
                        if ((i20 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z12 | zK | ((((i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i20 & 48) == 32);
                        objF = c1086gP.f();
                        if (z13 || objF == InterfaceC1084f.a.f12980a) {
                            final float f13 = f12;
                            final long j14 = j11;
                            final long j15 = j12;
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    float f14;
                                    J.e eVar2 = eVar;
                                    I.b(eVar2, 0.0f, 360.0f, j14, iVar);
                                    float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                                    float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                    float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                                    float f15 = f13;
                                    long j16 = j15;
                                    J.i iVar2 = iVar;
                                    if (n0.a(iVar2.f3957c, 0)) {
                                        f14 = 0.0f;
                                    } else {
                                        f14 = ((f15 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                                    }
                                    I.b(eVar2, f14 + fFloatValue, Math.max(fAbs, 0.1f), j16, iVar2);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        CanvasKt.a(hVarM, (Ia.l) objF, c1086gP, 0);
                        hVar3 = hVar5;
                        i17 = i19;
                    } else {
                        c1086gP.w();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        j11 = j10;
                        hVar4 = hVar2;
                    }
                    j12 = jF;
                    i19 = i16;
                    i18 = i13;
                    f12 = f11;
                    c1086gP.U();
                    iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i19, 0, 26);
                    InfiniteTransition infiniteTransitionC2 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                    e0 e0Var2 = VectorConvertersKt.f9478b;
                    p005a4.p pVar2 = C0922w.f9638d;
                    i20 = i18;
                    aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC2, 0, 5, e0Var2, C0907g.a(C0907g.d(6660, 0, pVar2, 2), null, 6), null, c1086gP, 33208, 16);
                    aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar2, 2), null, 6), null, c1086gP, 4536, 8);
                    aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                            androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                            bVar2.f9379a = 1332;
                            bVar2.a(0, Float.valueOf(0.0f)).f9363c = I.f11756b;
                            bVar2.a(666, Float.valueOf(290.0f));
                            return p293xa.r.f47939a;
                        }
                    }), null, 6), null, c1086gP, 4536, 8);
                    aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                            androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                            bVar2.f9379a = 1332;
                            bVar2.a(666, Float.valueOf(0.0f)).f9363c = I.f11756b;
                            bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                            return p293xa.r.f47939a;
                        }
                    }), null, 6), null, c1086gP, 4536, 8);
                    androidx.compose.ui.h hVarM2 = W.m(ProgressSemanticsKt.a(hVar4), f11755a);
                    if ((i20 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK2 = c1086gP.k(iVar) | z11 | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                    androidx.compose.ui.h hVar6 = hVar4;
                    if ((i20 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z12 | zK2 | ((((i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i20 & 48) == 32);
                    objF = c1086gP.f();
                    if (z13) {
                        final float f14 = f12;
                        final long j16 = j11;
                        final long j17 = j12;
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float f15;
                                J.e eVar2 = eVar;
                                I.b(eVar2, 0.0f, 360.0f, j16, iVar);
                                float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                                float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                                float f16 = f14;
                                long j18 = j17;
                                J.i iVar2 = iVar;
                                if (n0.a(iVar2.f3957c, 0)) {
                                    f15 = 0.0f;
                                } else {
                                    f15 = ((f16 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                                }
                                I.b(eVar2, f15 + fFloatValue, Math.max(fAbs, 0.1f), j18, iVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        final float f15 = f12;
                        final long j18 = j11;
                        final long j19 = j12;
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float f16;
                                J.e eVar2 = eVar;
                                I.b(eVar2, 0.0f, 360.0f, j18, iVar);
                                float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                                float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                                float f17 = f15;
                                long j110 = j19;
                                J.i iVar2 = iVar;
                                if (n0.a(iVar2.f3957c, 0)) {
                                    f16 = 0.0f;
                                } else {
                                    f16 = ((f17 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                                }
                                I.b(eVar2, f16 + fFloatValue, Math.max(fAbs, 0.1f), j110, iVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    CanvasKt.a(hVarM2, (Ia.l) objF, c1086gP, 0);
                    hVar3 = hVar6;
                    i17 = i19;
                } else {
                    c1086gP.w();
                    j11 = j10;
                    hVar3 = hVar2;
                    j12 = jF;
                    f12 = f11;
                    i17 = i16;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            I.a(hVar3, j12, f12, j11, i17, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (c1086gP.h(i16)) {
                    }
                    i13 |= i23;
                } else {
                    i16 = i10;
                }
                i13 |= i23;
            } else {
                i16 = i10;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                    }
                    if (i22 != 0) {
                        f11 = H.f11754a;
                    }
                    if (i14 != 0) {
                        j13 = androidx.compose.ui.graphics.H.f13503k;
                    } else {
                        j13 = j10;
                    }
                    if ((i12 & 16) != 0) {
                        j11 = j13;
                        i18 = i13 & (-57345);
                        j12 = jF;
                        f12 = f11;
                        i19 = 2;
                    } else {
                        j11 = j13;
                        j12 = jF;
                        i19 = i16;
                        i18 = i13;
                        f12 = f11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                    }
                    if (i22 != 0) {
                        f11 = H.f11754a;
                    }
                    if (i14 != 0) {
                        j13 = androidx.compose.ui.graphics.H.f13503k;
                    } else {
                        j13 = j10;
                    }
                    if ((i12 & 16) != 0) {
                        j11 = j13;
                        i18 = i13 & (-57345);
                        j12 = jF;
                        f12 = f11;
                        i19 = 2;
                    } else {
                        j11 = j13;
                        j12 = jF;
                        i19 = i16;
                        i18 = i13;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i19, 0, 26);
                InfiniteTransition infiniteTransitionC3 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                e0 e0Var3 = VectorConvertersKt.f9478b;
                p005a4.p pVar3 = C0922w.f9638d;
                i20 = i18;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC3, 0, 5, e0Var3, C0907g.a(C0907g.d(6660, 0, pVar3, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar3, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = I.f11756b;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = I.f11756b;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM3 = W.m(ProgressSemanticsKt.a(hVar4), f11755a);
                if ((i20 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK3 = c1086gP.k(iVar) | z11 | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar7 = hVar4;
                if ((i20 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | zK3 | ((((i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i20 & 48) == 32);
                objF = c1086gP.f();
                if (z13) {
                    final float f16 = f12;
                    final long j110 = j11;
                    final long j111 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f17;
                            J.e eVar2 = eVar;
                            I.b(eVar2, 0.0f, 360.0f, j110, iVar);
                            float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                            float f18 = f16;
                            long j112 = j111;
                            J.i iVar2 = iVar;
                            if (n0.a(iVar2.f3957c, 0)) {
                                f17 = 0.0f;
                            } else {
                                f17 = ((f18 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                            }
                            I.b(eVar2, f17 + fFloatValue, Math.max(fAbs, 0.1f), j112, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f17 = f12;
                    final long j112 = j11;
                    final long j113 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f18;
                            J.e eVar2 = eVar;
                            I.b(eVar2, 0.0f, 360.0f, j112, iVar);
                            float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                            float f19 = f17;
                            long j114 = j113;
                            J.i iVar2 = iVar;
                            if (n0.a(iVar2.f3957c, 0)) {
                                f18 = 0.0f;
                            } else {
                                f18 = ((f19 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                            }
                            I.b(eVar2, f18 + fFloatValue, Math.max(fAbs, 0.1f), j114, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM3, (Ia.l) objF, c1086gP, 0);
                hVar3 = hVar7;
                i17 = i19;
            } else {
                c1086gP.w();
                j11 = j10;
                hVar3 = hVar2;
                j12 = jF;
                f12 = f11;
                i17 = i16;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        I.a(hVar3, j12, f12, j11, i17, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        f11 = f10;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                if (c1086gP.i(j10)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (c1086gP.h(i16)) {
                    }
                    i13 |= i23;
                } else {
                    i16 = i10;
                }
                i13 |= i23;
            } else {
                i16 = i10;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i13 & 1, z10)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                    }
                    if (i22 != 0) {
                        f11 = H.f11754a;
                    }
                    if (i14 != 0) {
                        j13 = androidx.compose.ui.graphics.H.f13503k;
                    } else {
                        j13 = j10;
                    }
                    if ((i12 & 16) != 0) {
                        j11 = j13;
                        i18 = i13 & (-57345);
                        j12 = jF;
                        f12 = f11;
                        i19 = 2;
                    } else {
                        j11 = j13;
                        j12 = jF;
                        i19 = i16;
                        i18 = i13;
                        f12 = f11;
                    }
                } else {
                    if (i21 != 0) {
                        hVar4 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar4 = hVar2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                    }
                    if (i22 != 0) {
                        f11 = H.f11754a;
                    }
                    if (i14 != 0) {
                        j13 = androidx.compose.ui.graphics.H.f13503k;
                    } else {
                        j13 = j10;
                    }
                    if ((i12 & 16) != 0) {
                        j11 = j13;
                        i18 = i13 & (-57345);
                        j12 = jF;
                        f12 = f11;
                        i19 = 2;
                    } else {
                        j11 = j13;
                        j12 = jF;
                        i19 = i16;
                        i18 = i13;
                        f12 = f11;
                    }
                }
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i19, 0, 26);
                InfiniteTransition infiniteTransitionC4 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                e0 e0Var4 = VectorConvertersKt.f9478b;
                p005a4.p pVar4 = C0922w.f9638d;
                i20 = i18;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC4, 0, 5, e0Var4, C0907g.a(C0907g.d(6660, 0, pVar4, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar4, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = I.f11756b;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = I.f11756b;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM4 = W.m(ProgressSemanticsKt.a(hVar4), f11755a);
                if ((i20 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK4 = c1086gP.k(iVar) | z11 | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar8 = hVar4;
                if ((i20 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z12 | zK4 | ((((i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i20 & 48) == 32);
                objF = c1086gP.f();
                if (z13) {
                    final float f18 = f12;
                    final long j114 = j11;
                    final long j115 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f19;
                            J.e eVar2 = eVar;
                            I.b(eVar2, 0.0f, 360.0f, j114, iVar);
                            float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                            float f110 = f18;
                            long j116 = j115;
                            J.i iVar2 = iVar;
                            if (n0.a(iVar2.f3957c, 0)) {
                                f19 = 0.0f;
                            } else {
                                f19 = ((f110 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                            }
                            I.b(eVar2, f19 + fFloatValue, Math.max(fAbs, 0.1f), j116, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f19 = f12;
                    final long j116 = j11;
                    final long j117 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f110;
                            J.e eVar2 = eVar;
                            I.b(eVar2, 0.0f, 360.0f, j116, iVar);
                            float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                            float f111 = f19;
                            long j118 = j117;
                            J.i iVar2 = iVar;
                            if (n0.a(iVar2.f3957c, 0)) {
                                f110 = 0.0f;
                            } else {
                                f110 = ((f111 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                            }
                            I.b(eVar2, f110 + fFloatValue, Math.max(fAbs, 0.1f), j118, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM4, (Ia.l) objF, c1086gP, 0);
                hVar3 = hVar8;
                i17 = i19;
            } else {
                c1086gP.w();
                j11 = j10;
                hVar3 = hVar2;
                j12 = jF;
                f12 = f11;
                i17 = i16;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        I.a(hVar3, j12, f12, j11, i17, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i16 = i10;
                if (c1086gP.h(i16)) {
                }
                i13 |= i23;
            } else {
                i16 = i10;
            }
            i13 |= i23;
        } else {
            i16 = i10;
        }
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i13 & 1, z10)) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                    jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                }
                if (i22 != 0) {
                    f11 = H.f11754a;
                }
                if (i14 != 0) {
                    j13 = androidx.compose.ui.graphics.H.f13503k;
                } else {
                    j13 = j10;
                }
                if ((i12 & 16) != 0) {
                    j11 = j13;
                    i18 = i13 & (-57345);
                    j12 = jF;
                    f12 = f11;
                    i19 = 2;
                } else {
                    j11 = j13;
                    j12 = jF;
                    i19 = i16;
                    i18 = i13;
                    f12 = f11;
                }
            } else {
                if (i21 != 0) {
                    hVar4 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar4 = hVar2;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                    jF = ((C1034j) c1086gP.x(ColorsKt.f11693a)).f();
                }
                if (i22 != 0) {
                    f11 = H.f11754a;
                }
                if (i14 != 0) {
                    j13 = androidx.compose.ui.graphics.H.f13503k;
                } else {
                    j13 = j10;
                }
                if ((i12 & 16) != 0) {
                    j11 = j13;
                    i18 = i13 & (-57345);
                    j12 = jF;
                    f12 = f11;
                    i19 = 2;
                } else {
                    j11 = j13;
                    j12 = jF;
                    i19 = i16;
                    i18 = i13;
                    f12 = f11;
                }
            }
            c1086gP.U();
            iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i19, 0, 26);
            InfiniteTransition infiniteTransitionC5 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
            e0 e0Var5 = VectorConvertersKt.f9478b;
            p005a4.p pVar5 = C0922w.f9638d;
            i20 = i18;
            aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC5, 0, 5, e0Var5, C0907g.a(C0907g.d(6660, 0, pVar5, 2), null, 6), null, c1086gP, 33208, 16);
            aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar5, 2), null, 6), null, c1086gP, 4536, 8);
            aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(0, Float.valueOf(0.0f)).f9363c = I.f11756b;
                    bVar2.a(666, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(666, Float.valueOf(0.0f)).f9363c = I.f11756b;
                    bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            androidx.compose.ui.h hVarM5 = W.m(ProgressSemanticsKt.a(hVar4), f11755a);
            if ((i20 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK5 = c1086gP.k(iVar) | z11 | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
            androidx.compose.ui.h hVar9 = hVar4;
            if ((i20 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z12 | zK5 | ((((i20 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i20 & 48) == 32);
            objF = c1086gP.f();
            if (z13) {
                final float f110 = f12;
                final long j118 = j11;
                final long j119 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f111;
                        J.e eVar2 = eVar;
                        I.b(eVar2, 0.0f, 360.0f, j118, iVar);
                        float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                        float f112 = f110;
                        long j1110 = j119;
                        J.i iVar2 = iVar;
                        if (n0.a(iVar2.f3957c, 0)) {
                            f111 = 0.0f;
                        } else {
                            f111 = ((f112 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                        }
                        I.b(eVar2, f111 + fFloatValue, Math.max(fAbs, 0.1f), j1110, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                final float f111 = f12;
                final long j1110 = j11;
                final long j1111 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f112;
                        J.e eVar2 = eVar;
                        I.b(eVar2, 0.0f, 360.0f, j1110, iVar);
                        float fIntValue = (aVarB.getValue().intValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fIntValue - 90.0f);
                        float f113 = f111;
                        long j1112 = j1111;
                        J.i iVar2 = iVar;
                        if (n0.a(iVar2.f3957c, 0)) {
                            f112 = 0.0f;
                        } else {
                            f112 = ((f113 / (I.f11755a / 2)) * 57.29578f) / 2.0f;
                        }
                        I.b(eVar2, f112 + fFloatValue, Math.max(fAbs, 0.1f), j1112, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarM5, (Ia.l) objF, c1086gP, 0);
            hVar3 = hVar9;
            i17 = i19;
        } else {
            c1086gP.w();
            j11 = j10;
            hVar3 = hVar2;
            j12 = jF;
            f12 = f11;
            i17 = i16;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    I.a(hVar3, j12, f12, j11, i17, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(J.e eVar, float f10, float f11, long j, J.i iVar) {
        float f12 = 2;
        float f13 = iVar.f3955a / f12;
        float fD = I.h.d(eVar.j()) - (f12 * f13);
        eVar.B0(j, f10, f11, I.e.c(f13, f13), Cb.a.b(fD, fD), 1.0f, iVar, null, 3);
    }
}
