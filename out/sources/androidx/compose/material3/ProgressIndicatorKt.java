package androidx.compose.material3;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.C0917q;
import androidx.compose.animation.core.C0922w;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.layout.C1177x;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ProgressIndicator.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ProgressIndicatorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.ui.h f12272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12273c = 240;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0917q f12276f;

    static {
        float f10 = 10;
        f12271a = f10;
        f12272b = PaddingKt.h(androidx.compose.ui.semantics.p.b(C1177x.a(androidx.compose.ui.h.a.f13984b, new Ia.q<androidx.compose.ui.layout.H, androidx.compose.ui.layout.D, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // Ia.q
            public final androidx.compose.ui.layout.F invoke(androidx.compose.ui.layout.H h8, androidx.compose.ui.layout.D d10, p013b0.a aVar) {
                androidx.compose.ui.layout.H h10 = h8;
                long j = aVar.f20475a;
                final int iE1 = h10.e1(ProgressIndicatorKt.f12271a);
                int i10 = iE1 * 2;
                final androidx.compose.ui.layout.Y yQ = d10.Q(p013b0.b.i(j, 0, i10));
                return h10.y1(yQ.f14220b, yQ.f14221c - i10, kotlin.collections.y.p(), new Ia.l<androidx.compose.ui.layout.Y.a, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.layout.Y.a aVar2) {
                        aVar2.d(yQ, 0, -iE1, 0.0f);
                        return p293xa.r.f47939a;
                    }
                });
            }
        }), true, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            @Override // Ia.l
            public final /* bridge */ /* synthetic */ p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                return p293xa.r.f47939a;
            }
        }), 0.0f, f10, 1);
        float f11 = B.t.f1367c;
        f12274d = f11;
        f12275e = B.t.f1368d - (f11 * 2);
        new C0917q(0.2f, 0.0f, 0.8f, 1.0f);
        new C0917q(0.4f, 0.0f, 1.0f, 1.0f);
        new C0917q(0.0f, 0.0f, 0.65f, 1.0f);
        new C0917q(0.1f, 0.0f, 0.45f, 1.0f);
        f12276f = new C0917q(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:109:0x0222  */
    /* JADX WARN: Code duplicated, block: B:111:0x0226  */
    /* JADX WARN: Code duplicated, block: B:115:0x0252  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd A[PHI: r7 r9 r10 r12 r14
      0x00cd: PHI (r7v17 androidx.compose.ui.h) = (r7v4 androidx.compose.ui.h), (r7v3 androidx.compose.ui.h), (r7v3 androidx.compose.ui.h) binds: [B:85:0x00fc, B:71:0x00c9, B:72:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r9v35 int) = (r9v14 int), (r9v36 int), (r9v37 int) binds: [B:85:0x00fc, B:71:0x00c9, B:72:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r10v17 long) = (r10v3 long), (r10v2 long), (r10v2 long) binds: [B:85:0x00fc, B:71:0x00c9, B:72:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r12v23 float) = (r12v3 float), (r12v2 float), (r12v2 float) binds: [B:85:0x00fc, B:71:0x00c9, B:72:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r14v14 long) = (r14v2 long), (r14v1 long), (r14v1 long) binds: [B:85:0x00fc, B:71:0x00c9, B:72:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0202  */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    public static final void a(androidx.compose.ui.h hVar, long j, float f10, long j10, int i10, final int i11, InterfaceC1084f interfaceC1084f, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        long jD;
        float f11;
        long j11;
        int i14;
        int i15;
        int i16;
        int i17;
        long j12;
        float f12;
        final long j13;
        int i18;
        final J.i iVar;
        final InfiniteTransition.a aVarB;
        final InfiniteTransition.a aVarA;
        final InfiniteTransition.a aVarA2;
        final InfiniteTransition.a aVarA3;
        boolean z10;
        boolean z11;
        Object objF;
        final float f13;
        final int i19;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        int i20;
        int i21;
        C1086g c1086gP = interfaceC1084f.p(-115871647);
        int i22 = i12 & 1;
        if (i22 != 0) {
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
            if ((i12 & 2) == 0) {
                jD = j;
                if (c1086gP.i(jD)) {
                    i21 = 32;
                }
                i13 |= i21;
            } else {
                jD = j;
            }
            i21 = 16;
            i13 |= i21;
        } else {
            jD = j;
        }
        int i23 = i12 & 4;
        if (i23 == 0) {
            if ((i11 & 384) == 0) {
                f11 = f10;
                i13 |= c1086gP.g(f11) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                j11 = j10;
                if ((i12 & 8) == 0 || !c1086gP.i(j11)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                j11 = j10;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    i15 = i10;
                    if (c1086gP.h(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i13 & 9363) == 9362 || !c1086gP.s()) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0 || c1086gP.a0()) {
                        if (i22 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if ((i12 & 2) != 0) {
                            float f14 = U.f12406a;
                            float f15 = B.t.f1365a;
                            i13 &= -113;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        }
                        if (i23 != 0) {
                            f11 = U.f12406a;
                        }
                        if ((i12 & 8) != 0) {
                            float f16 = U.f12406a;
                            j11 = androidx.compose.ui.graphics.H.f13503k;
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            i17 = U.f12408c;
                            j12 = jD;
                            f12 = f11;
                        }
                        j13 = j11;
                        i18 = i13;
                        c1086gP.U();
                        iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                        InfiniteTransition infiniteTransitionC = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                        androidx.compose.animation.core.e0 e0Var = VectorConvertersKt.f9478b;
                        p005a4.p pVar = C0922w.f9638d;
                        aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC, 0, 5, e0Var, C0907g.a(C0907g.d(6660, 0, pVar, 2), null, 6), null, c1086gP, 33208, 16);
                        aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar, 2), null, 6), null, c1086gP, 4536, 8);
                        aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                                androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                                bVar2.f9379a = 1332;
                                bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                                bVar2.a(666, Float.valueOf(290.0f));
                                return p293xa.r.f47939a;
                            }
                        }), null, 6), null, c1086gP, 4536, 8);
                        aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                                androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                                bVar2.f9379a = 1332;
                                bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                                bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                                return p293xa.r.f47939a;
                            }
                        }), null, 6), null, c1086gP, 4536, 8);
                        androidx.compose.ui.h hVarM = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                        boolean zK = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                        androidx.compose.ui.h hVar4 = hVar2;
                        if ((i18 & 896) == 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK;
                        objF = c1086gP.f();
                        if (z11 || objF == InterfaceC1084f.a.f12980a) {
                            final float f17 = f12;
                            final long j14 = j12;
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    float f18;
                                    J.e eVar2 = eVar;
                                    ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                                    float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                                    float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                    float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                                    float f19 = f17;
                                    long j15 = j14;
                                    J.i iVar2 = iVar;
                                    if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                        f18 = 0.0f;
                                    } else {
                                        f18 = ((f19 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                                    }
                                    ProgressIndicatorKt.d(eVar2, f18 + fFloatValue2, Math.max(fAbs, 0.1f), j15, iVar2);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        CanvasKt.a(hVarM, (Ia.l) objF, c1086gP, 0);
                        jD = j12;
                        f13 = f12;
                        i19 = i17;
                        hVar3 = hVar4;
                    } else {
                        c1086gP.w();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                    }
                    j12 = jD;
                    f12 = f11;
                    i17 = i15;
                    j13 = j11;
                    i18 = i13;
                    c1086gP.U();
                    iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                    InfiniteTransition infiniteTransitionC2 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                    androidx.compose.animation.core.e0 e0Var2 = VectorConvertersKt.f9478b;
                    p005a4.p pVar2 = C0922w.f9638d;
                    aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC2, 0, 5, e0Var2, C0907g.a(C0907g.d(6660, 0, pVar2, 2), null, 6), null, c1086gP, 33208, 16);
                    aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar2, 2), null, 6), null, c1086gP, 4536, 8);
                    aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                            androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                            bVar2.f9379a = 1332;
                            bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                            bVar2.a(666, Float.valueOf(290.0f));
                            return p293xa.r.f47939a;
                        }
                    }), null, 6), null, c1086gP, 4536, 8);
                    aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC2, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                            androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                            bVar2.f9379a = 1332;
                            bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                            bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                            return p293xa.r.f47939a;
                        }
                    }), null, 6), null, c1086gP, 4536, 8);
                    androidx.compose.ui.h hVarM2 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                    boolean zK2 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                    androidx.compose.ui.h hVar5 = hVar2;
                    if ((i18 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK2;
                    objF = c1086gP.f();
                    if (z11) {
                        final float f18 = f12;
                        final long j15 = j12;
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float f19;
                                J.e eVar2 = eVar;
                                ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                                float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                                float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                                float f110 = f18;
                                long j16 = j15;
                                J.i iVar2 = iVar;
                                if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                    f19 = 0.0f;
                                } else {
                                    f19 = ((f110 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                                }
                                ProgressIndicatorKt.d(eVar2, f19 + fFloatValue2, Math.max(fAbs, 0.1f), j16, iVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        final float f19 = f12;
                        final long j16 = j12;
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float f110;
                                J.e eVar2 = eVar;
                                ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                                float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                                float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                                float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                                float f111 = f19;
                                long j17 = j16;
                                J.i iVar2 = iVar;
                                if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                    f110 = 0.0f;
                                } else {
                                    f110 = ((f111 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                                }
                                ProgressIndicatorKt.d(eVar2, f110 + fFloatValue2, Math.max(fAbs, 0.1f), j17, iVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    CanvasKt.a(hVarM2, (Ia.l) objF, c1086gP, 0);
                    jD = j12;
                    f13 = f12;
                    i19 = i17;
                    hVar3 = hVar5;
                } else {
                    c1086gP.w();
                    hVar3 = hVar2;
                    f13 = f11;
                    i19 = i15;
                    j13 = j11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j17 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ProgressIndicatorKt.a(hVar3, j17, f13, j13, i19, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i15 = i10;
            if ((i13 & 9363) == 9362) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f110 = U.f12406a;
                        float f111 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f112 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                } else {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f113 = U.f12406a;
                        float f114 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f115 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                }
                j13 = j11;
                i18 = i13;
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                InfiniteTransition infiniteTransitionC3 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                androidx.compose.animation.core.e0 e0Var3 = VectorConvertersKt.f9478b;
                p005a4.p pVar3 = C0922w.f9638d;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC3, 0, 5, e0Var3, C0907g.a(C0907g.d(6660, 0, pVar3, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar3, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC3, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM3 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                boolean zK3 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar6 = hVar2;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK3;
                objF = c1086gP.f();
                if (z11) {
                    final float f116 = f12;
                    final long j18 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f117;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f118 = f116;
                            long j19 = j18;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f117 = 0.0f;
                            } else {
                                f117 = ((f118 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f117 + fFloatValue2, Math.max(fAbs, 0.1f), j19, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f117 = f12;
                    final long j19 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f118;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f119 = f117;
                            long j110 = j19;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f118 = 0.0f;
                            } else {
                                f118 = ((f119 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f118 + fFloatValue2, Math.max(fAbs, 0.1f), j110, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM3, (Ia.l) objF, c1086gP, 0);
                jD = j12;
                f13 = f12;
                i19 = i17;
                hVar3 = hVar6;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f118 = U.f12406a;
                        float f119 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f1110 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                } else {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f1111 = U.f12406a;
                        float f1112 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f1113 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                }
                j13 = j11;
                i18 = i13;
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                InfiniteTransition infiniteTransitionC4 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                androidx.compose.animation.core.e0 e0Var4 = VectorConvertersKt.f9478b;
                p005a4.p pVar4 = C0922w.f9638d;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC4, 0, 5, e0Var4, C0907g.a(C0907g.d(6660, 0, pVar4, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar4, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC4, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM4 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                boolean zK4 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar7 = hVar2;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK4;
                objF = c1086gP.f();
                if (z11) {
                    final float f1114 = f12;
                    final long j110 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f1115;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f1116 = f1114;
                            long j111 = j110;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f1115 = 0.0f;
                            } else {
                                f1115 = ((f1116 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f1115 + fFloatValue2, Math.max(fAbs, 0.1f), j111, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f1115 = f12;
                    final long j111 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f1116;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f1117 = f1115;
                            long j112 = j111;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f1116 = 0.0f;
                            } else {
                                f1116 = ((f1117 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f1116 + fFloatValue2, Math.max(fAbs, 0.1f), j112, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM4, (Ia.l) objF, c1086gP, 0);
                jD = j12;
                f13 = f12;
                i19 = i17;
                hVar3 = hVar7;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j112 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ProgressIndicatorKt.a(hVar3, j112, f13, j13, i19, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        f11 = f10;
        if ((i11 & 3072) == 0) {
            j11 = j10;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            j11 = j10;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                if (c1086gP.h(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i13 & 9363) == 9362) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f1116 = U.f12406a;
                        float f1117 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f1118 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                } else {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f1119 = U.f12406a;
                        float f11110 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f11111 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                }
                j13 = j11;
                i18 = i13;
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                InfiniteTransition infiniteTransitionC5 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                androidx.compose.animation.core.e0 e0Var5 = VectorConvertersKt.f9478b;
                p005a4.p pVar5 = C0922w.f9638d;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC5, 0, 5, e0Var5, C0907g.a(C0907g.d(6660, 0, pVar5, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar5, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC5, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM5 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                boolean zK5 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar8 = hVar2;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK5;
                objF = c1086gP.f();
                if (z11) {
                    final float f11112 = f12;
                    final long j113 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f11113;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f11114 = f11112;
                            long j114 = j113;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f11113 = 0.0f;
                            } else {
                                f11113 = ((f11114 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f11113 + fFloatValue2, Math.max(fAbs, 0.1f), j114, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f11113 = f12;
                    final long j114 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f11114;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f11115 = f11113;
                            long j115 = j114;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f11114 = 0.0f;
                            } else {
                                f11114 = ((f11115 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f11114 + fFloatValue2, Math.max(fAbs, 0.1f), j115, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM5, (Ia.l) objF, c1086gP, 0);
                jD = j12;
                f13 = f12;
                i19 = i17;
                hVar3 = hVar8;
            } else {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f11114 = U.f12406a;
                        float f11115 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f11116 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                } else {
                    if (i22 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if ((i12 & 2) != 0) {
                        float f11117 = U.f12406a;
                        float f11118 = B.t.f1365a;
                        i13 &= -113;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    }
                    if (i23 != 0) {
                        f11 = U.f12406a;
                    }
                    if ((i12 & 8) != 0) {
                        float f11119 = U.f12406a;
                        j11 = androidx.compose.ui.graphics.H.f13503k;
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i17 = U.f12408c;
                        j12 = jD;
                        f12 = f11;
                    } else {
                        j12 = jD;
                        f12 = f11;
                        i17 = i15;
                    }
                }
                j13 = j11;
                i18 = i13;
                c1086gP.U();
                iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
                InfiniteTransition infiniteTransitionC6 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
                androidx.compose.animation.core.e0 e0Var6 = VectorConvertersKt.f9478b;
                p005a4.p pVar6 = C0922w.f9638d;
                aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC6, 0, 5, e0Var6, C0907g.a(C0907g.d(6660, 0, pVar6, 2), null, 6), null, c1086gP, 33208, 16);
                aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC6, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar6, 2), null, 6), null, c1086gP, 4536, 8);
                aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC6, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(666, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC6, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                        androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                        bVar2.f9379a = 1332;
                        bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                        bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                        return p293xa.r.f47939a;
                    }
                }), null, 6), null, c1086gP, 4536, 8);
                androidx.compose.ui.h hVarM6 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
                boolean zK6 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
                androidx.compose.ui.h hVar9 = hVar2;
                if ((i18 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK6;
                objF = c1086gP.f();
                if (z11) {
                    final float f111110 = f12;
                    final long j115 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f111111;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f111112 = f111110;
                            long j116 = j115;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f111111 = 0.0f;
                            } else {
                                f111111 = ((f111112 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f111111 + fFloatValue2, Math.max(fAbs, 0.1f), j116, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                } else {
                    final float f111111 = f12;
                    final long j116 = j12;
                    objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float f111112;
                            J.e eVar2 = eVar;
                            ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                            float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                            float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                            float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                            float f111113 = f111111;
                            long j117 = j116;
                            J.i iVar2 = iVar;
                            if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                                f111112 = 0.0f;
                            } else {
                                f111112 = ((f111113 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                            }
                            ProgressIndicatorKt.d(eVar2, f111112 + fFloatValue2, Math.max(fAbs, 0.1f), j117, iVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF);
                }
                CanvasKt.a(hVarM6, (Ia.l) objF, c1086gP, 0);
                jD = j12;
                f13 = f12;
                i19 = i17;
                hVar3 = hVar9;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j117 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ProgressIndicatorKt.a(hVar3, j117, f13, j13, i19, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        i15 = i10;
        if ((i13 & 9363) == 9362) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i12 & 2) != 0) {
                    float f111112 = U.f12406a;
                    float f111113 = B.t.f1365a;
                    i13 &= -113;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                }
                if (i23 != 0) {
                    f11 = U.f12406a;
                }
                if ((i12 & 8) != 0) {
                    float f111114 = U.f12406a;
                    j11 = androidx.compose.ui.graphics.H.f13503k;
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i17 = U.f12408c;
                    j12 = jD;
                    f12 = f11;
                } else {
                    j12 = jD;
                    f12 = f11;
                    i17 = i15;
                }
            } else {
                if (i22 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i12 & 2) != 0) {
                    float f111115 = U.f12406a;
                    float f111116 = B.t.f1365a;
                    i13 &= -113;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                }
                if (i23 != 0) {
                    f11 = U.f12406a;
                }
                if ((i12 & 8) != 0) {
                    float f111117 = U.f12406a;
                    j11 = androidx.compose.ui.graphics.H.f13503k;
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i17 = U.f12408c;
                    j12 = jD;
                    f12 = f11;
                } else {
                    j12 = jD;
                    f12 = f11;
                    i17 = i15;
                }
            }
            j13 = j11;
            i18 = i13;
            c1086gP.U();
            iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
            InfiniteTransition infiniteTransitionC7 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
            androidx.compose.animation.core.e0 e0Var7 = VectorConvertersKt.f9478b;
            p005a4.p pVar7 = C0922w.f9638d;
            aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC7, 0, 5, e0Var7, C0907g.a(C0907g.d(6660, 0, pVar7, 2), null, 6), null, c1086gP, 33208, 16);
            aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC7, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar7, 2), null, 6), null, c1086gP, 4536, 8);
            aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC7, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                    bVar2.a(666, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC7, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                    bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            androidx.compose.ui.h hVarM7 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
            boolean zK7 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
            androidx.compose.ui.h hVar10 = hVar2;
            if ((i18 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK7;
            objF = c1086gP.f();
            if (z11) {
                final float f111118 = f12;
                final long j118 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f111119;
                        J.e eVar2 = eVar;
                        ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                        float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                        float f1111110 = f111118;
                        long j119 = j118;
                        J.i iVar2 = iVar;
                        if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                            f111119 = 0.0f;
                        } else {
                            f111119 = ((f1111110 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                        }
                        ProgressIndicatorKt.d(eVar2, f111119 + fFloatValue2, Math.max(fAbs, 0.1f), j119, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                final float f111119 = f12;
                final long j119 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f1111110;
                        J.e eVar2 = eVar;
                        ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                        float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                        float f1111111 = f111119;
                        long j1110 = j119;
                        J.i iVar2 = iVar;
                        if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                            f1111110 = 0.0f;
                        } else {
                            f1111110 = ((f1111111 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                        }
                        ProgressIndicatorKt.d(eVar2, f1111110 + fFloatValue2, Math.max(fAbs, 0.1f), j1110, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarM7, (Ia.l) objF, c1086gP, 0);
            jD = j12;
            f13 = f12;
            i19 = i17;
            hVar3 = hVar10;
        } else {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i12 & 2) != 0) {
                    float f1111110 = U.f12406a;
                    float f1111111 = B.t.f1365a;
                    i13 &= -113;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                }
                if (i23 != 0) {
                    f11 = U.f12406a;
                }
                if ((i12 & 8) != 0) {
                    float f1111112 = U.f12406a;
                    j11 = androidx.compose.ui.graphics.H.f13503k;
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i17 = U.f12408c;
                    j12 = jD;
                    f12 = f11;
                } else {
                    j12 = jD;
                    f12 = f11;
                    i17 = i15;
                }
            } else {
                if (i22 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if ((i12 & 2) != 0) {
                    float f1111113 = U.f12406a;
                    float f1111114 = B.t.f1365a;
                    i13 &= -113;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                }
                if (i23 != 0) {
                    f11 = U.f12406a;
                }
                if ((i12 & 8) != 0) {
                    float f1111115 = U.f12406a;
                    j11 = androidx.compose.ui.graphics.H.f13503k;
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i17 = U.f12408c;
                    j12 = jD;
                    f12 = f11;
                } else {
                    j12 = jD;
                    f12 = f11;
                    i17 = i15;
                }
            }
            j13 = j11;
            i18 = i13;
            c1086gP.U();
            iVar = new J.i(((p013b0.c) c1086gP.x(CompositionLocalsKt.f14847h)).T0(f12), 0.0f, i17, 0, 26);
            InfiniteTransition infiniteTransitionC8 = androidx.compose.animation.core.G.c(null, c1086gP, 1);
            androidx.compose.animation.core.e0 e0Var8 = VectorConvertersKt.f9478b;
            p005a4.p pVar8 = C0922w.f9638d;
            aVarB = androidx.compose.animation.core.G.b(infiniteTransitionC8, 0, 5, e0Var8, C0907g.a(C0907g.d(6660, 0, pVar8, 2), null, 6), null, c1086gP, 33208, 16);
            aVarA = androidx.compose.animation.core.G.a(infiniteTransitionC8, 0.0f, 286.0f, C0907g.a(C0907g.d(1332, 0, pVar8, 2), null, 6), null, c1086gP, 4536, 8);
            aVarA2 = androidx.compose.animation.core.G.a(infiniteTransitionC8, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(0, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                    bVar2.a(666, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            aVarA3 = androidx.compose.animation.core.G.a(infiniteTransitionC8, 0.0f, 290.0f, C0907g.a(C0907g.b(new Ia.l<androidx.compose.animation.core.I.b<Float>, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.animation.core.I.b<Float> bVar) {
                    androidx.compose.animation.core.I.b<Float> bVar2 = bVar;
                    bVar2.f9379a = 1332;
                    bVar2.a(666, Float.valueOf(0.0f)).f9363c = ProgressIndicatorKt.f12276f;
                    bVar2.a(bVar2.f9379a, Float.valueOf(290.0f));
                    return p293xa.r.f47939a;
                }
            }), null, 6), null, c1086gP, 4536, 8);
            androidx.compose.ui.h hVarM8 = androidx.compose.foundation.layout.W.m(ProgressSemanticsKt.a(hVar2), f12275e);
            boolean zK8 = ((((i18 & 7168) ^ 3072) <= 2048 && c1086gP.i(j13)) || (i18 & 3072) == 2048) | c1086gP.k(r32) | c1086gP.K(aVarB) | c1086gP.K(aVarA2) | c1086gP.K(aVarA3) | c1086gP.K(aVarA);
            androidx.compose.ui.h hVar11 = hVar2;
            if ((i18 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = ((((i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) ^ 48) <= 32 && c1086gP.i(j12)) || (i18 & 48) == 32) | z10 | zK8;
            objF = c1086gP.f();
            if (z11) {
                final float f1111116 = f12;
                final long j1110 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f1111117;
                        J.e eVar2 = eVar;
                        ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                        float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                        float f1111118 = f1111116;
                        long j1111 = j1110;
                        J.i iVar2 = iVar;
                        if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                            f1111117 = 0.0f;
                        } else {
                            f1111117 = ((f1111118 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                        }
                        ProgressIndicatorKt.d(eVar2, f1111117 + fFloatValue2, Math.max(fAbs, 0.1f), j1111, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            } else {
                final float f1111117 = f12;
                final long j1111 = j12;
                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float f1111118;
                        J.e eVar2 = eVar;
                        ProgressIndicatorKt.d(eVar2, 0.0f, 360.0f, j13, iVar);
                        float fFloatValue = (aVarB.getValue().floatValue() * 216.0f) % 360.0f;
                        float fAbs = Math.abs(aVarA2.getValue().floatValue() - aVarA3.getValue().floatValue());
                        float fFloatValue2 = aVarA3.getValue().floatValue() + aVarA.getValue().floatValue() + (fFloatValue - 90.0f);
                        float f1111119 = f1111117;
                        long j1112 = j1111;
                        J.i iVar2 = iVar;
                        if (androidx.compose.ui.graphics.n0.a(iVar2.f3957c, 0)) {
                            f1111118 = 0.0f;
                        } else {
                            f1111118 = ((f1111119 / (ProgressIndicatorKt.f12275e / 2)) * 57.29578f) / 2.0f;
                        }
                        ProgressIndicatorKt.d(eVar2, f1111118 + fFloatValue2, Math.max(fAbs, 0.1f), j1112, iVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            CanvasKt.a(hVarM8, (Ia.l) objF, c1086gP, 0);
            jD = j12;
            f13 = f12;
            i19 = i17;
            hVar3 = hVar11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j1112 = jD;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ProgressIndicatorKt.a(hVar3, j1112, f13, j13, i19, L4.b.l(i11 | 1), interfaceC1084f2, i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x014b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:132:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0190  */
    /* JADX WARN: Code duplicated, block: B:136:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0199  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01df  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:152:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:160:0x0206  */
    /* JADX WARN: Code duplicated, block: B:162:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x021d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0223  */
    /* JADX WARN: Code duplicated, block: B:176:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x0236  */
    /* JADX WARN: Code duplicated, block: B:181:0x025e  */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117 A[PHI: r3 r6 r9 r11 r12 r14
      0x0117: PHI (r3v15 androidx.compose.ui.h) = (r3v3 androidx.compose.ui.h), (r3v16 androidx.compose.ui.h) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r6v29 int) = (r6v19 int), (r6v32 int) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r9v13 int) = (r9v9 int), (r9v8 int) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r11v5 float) = (r11v2 float), (r11v1 float) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r12v5 long) = (r12v2 long), (r12v1 long) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r14v5 long) = (r14v2 long), (r14v1 long) binds: [B:112:0x0150, B:95:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void b(final Ia.a<Float> aVar, androidx.compose.ui.h hVar, long j, long j10, int i10, float f10, Ia.l<? super J.e, p293xa.r> lVar, InterfaceC1084f interfaceC1084f, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.h hVar2;
        final long jD;
        long jD2;
        int i14;
        final int i15;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        androidx.compose.ui.h hVar3;
        boolean z10;
        boolean z11;
        Object objF;
        Ia.l<? super J.e, p293xa.r> lVar2;
        boolean z12;
        Object objF2;
        final Ia.a aVar2;
        boolean zK;
        Object objF3;
        boolean z13;
        boolean z14;
        boolean zK2;
        Object objF4;
        final int i20;
        final float f12;
        final long j11;
        final androidx.compose.ui.h hVar4;
        final Ia.l<? super J.e, p293xa.r> lVar3;
        C1105p0 c1105p0V;
        int i21;
        int i22;
        int i23;
        C1086g c1086gP = interfaceC1084f.p(-339970038);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c1086gP.k(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                hVar2 = hVar;
                i13 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i11 & 384) == 0) {
                jD = j;
                if ((i12 & 4) == 0 || !c1086gP.i(jD)) {
                    i23 = 128;
                } else {
                    i23 = 256;
                }
                i13 |= i23;
            } else {
                jD = j;
            }
            if ((i11 & 3072) == 0) {
                jD2 = j10;
                if ((i12 & 8) == 0 || !c1086gP.i(jD2)) {
                    i22 = 1024;
                } else {
                    i22 = 2048;
                }
                i13 |= i22;
            } else {
                jD2 = j10;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    i15 = i10;
                    if (c1086gP.h(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= 196608;
                    f11 = f10;
                } else {
                    f11 = f10;
                    if ((i11 & 196608) == 0) {
                        if (c1086gP.g(f11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0 || !c1086gP.k(lVar)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i13 |= i21;
                }
                if ((i13 & 599187) == 599186 || !c1086gP.s()) {
                    c1086gP.r0();
                    i19 = i11 & 1;
                    InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
                    if (i19 != 0 || c1086gP.a0()) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i12 & 4) != 0) {
                            float f13 = U.f12406a;
                            float f14 = B.t.f1365a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            float f15 = U.f12406a;
                            float f16 = B.t.f1365a;
                            jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            i15 = U.f12407b;
                        }
                        if (i17 != 0) {
                            f11 = U.f12410e;
                        }
                        if ((i12 & 64) != 0) {
                            boolean z15 = (((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256;
                            if ((i13 & 57344) == 16384) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 = z15 | z10;
                            objF = c1086gP.f();
                            if (z11 || objF == c0153a) {
                                objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.e eVar) {
                                        J.e eVar2 = eVar;
                                        float f17 = U.f12409d;
                                        long j12 = jD;
                                        int i25 = i15;
                                        float fMin = Math.min(eVar2.T0(f17), I.h.b(eVar2.j()));
                                        float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                        if (androidx.compose.ui.graphics.n0.a(i25, 1)) {
                                            float f18 = fMin / 2.0f;
                                            eVar2.S(j12, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f18, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f18) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                        } else {
                                            J.e.s0(eVar2, j12, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                };
                                c1086gP.E(objF);
                            }
                            lVar2 = (Ia.l) objF;
                            i13 &= -3670017;
                        }
                        c1086gP.U();
                        if ((i13 & 14) == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objF2 = c1086gP.f();
                        if (z12 || objF2 == c0153a) {
                            objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // Ia.a
                                public final Float invoke() {
                                    return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                                }
                            };
                            c1086gP.E(objF2);
                        }
                        aVar2 = (Ia.a) objF2;
                        androidx.compose.ui.h hVarI = hVar3.i(f12272b);
                        zK = c1086gP.K(aVar2);
                        objF3 = c1086gP.f();
                        if (zK || objF3 == c0153a) {
                            objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.h hVar5 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                                    Oa.l<Object> lVar4 = androidx.compose.ui.semantics.t.f15251a[1];
                                    vVar.getClass();
                                    wVar.e(vVar, hVar5);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF3);
                        }
                        androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI, true, (Ia.l) objF3));
                        if ((i13 & 57344) == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        androidx.compose.ui.h hVar5 = hVar3;
                        if ((458752 & i13) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                        objF4 = c1086gP.f();
                        if (zK2 || objF4 == c0153a) {
                            final int i25 = i15;
                            final float f17 = f11;
                            final long j12 = jD2;
                            final long j13 = jD;
                            final Ia.l<? super J.e, p293xa.r> lVar4 = lVar2;
                            objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    float fV;
                                    J.e eVar2 = eVar;
                                    float fB = I.h.b(eVar2.j());
                                    if (androidx.compose.ui.graphics.n0.a(i25, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                        fV = f17;
                                    } else {
                                        fV = eVar2.v(fB) + f17;
                                    }
                                    float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                                    float fFloatValue = aVar2.invoke().floatValue();
                                    float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                                    if (fMin <= 1.0f) {
                                        ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j12, fB, i25);
                                    }
                                    ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j13, fB, i25);
                                    lVar4.invoke(eVar2);
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF4);
                        }
                        CanvasKt.a(hVarN, (Ia.l) objF4, c1086gP, 0);
                        i20 = i15;
                        f12 = f11;
                        j11 = jD2;
                        hVar4 = hVar5;
                        lVar3 = lVar2;
                    } else {
                        c1086gP.w();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        hVar3 = hVar;
                    }
                    lVar2 = lVar;
                    c1086gP.U();
                    if ((i13 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objF2 = c1086gP.f();
                    if (z12) {
                        objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        c1086gP.E(objF2);
                    } else {
                        objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // Ia.a
                            public final Float invoke() {
                                return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                            }
                        };
                        c1086gP.E(objF2);
                    }
                    aVar2 = (Ia.a) objF2;
                    androidx.compose.ui.h hVarI2 = hVar3.i(f12272b);
                    zK = c1086gP.K(aVar2);
                    objF3 = c1086gP.f();
                    if (zK) {
                        objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.h hVar6 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                                Oa.l<Object> lVar5 = androidx.compose.ui.semantics.t.f15251a[1];
                                vVar.getClass();
                                wVar.e(vVar, hVar6);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF3);
                    } else {
                        objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.h hVar6 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                                Oa.l<Object> lVar5 = androidx.compose.ui.semantics.t.f15251a[1];
                                vVar.getClass();
                                wVar.e(vVar, hVar6);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF3);
                    }
                    androidx.compose.ui.h hVarN2 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI2, true, (Ia.l) objF3));
                    if ((i13 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    androidx.compose.ui.h hVar6 = hVar3;
                    if ((458752 & i13) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                    objF4 = c1086gP.f();
                    if (zK2) {
                        final int i26 = i15;
                        final float f18 = f11;
                        final long j14 = jD2;
                        final long j15 = jD;
                        final Ia.l<? super J.e, p293xa.r> lVar5 = lVar2;
                        objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float fV;
                                J.e eVar2 = eVar;
                                float fB = I.h.b(eVar2.j());
                                if (androidx.compose.ui.graphics.n0.a(i26, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                    fV = f18;
                                } else {
                                    fV = eVar2.v(fB) + f18;
                                }
                                float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                                float fFloatValue = aVar2.invoke().floatValue();
                                float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                                if (fMin <= 1.0f) {
                                    ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j14, fB, i26);
                                }
                                ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j15, fB, i26);
                                lVar5.invoke(eVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF4);
                    } else {
                        final int i27 = i15;
                        final float f19 = f11;
                        final long j16 = jD2;
                        final long j17 = jD;
                        final Ia.l<? super J.e, p293xa.r> lVar6 = lVar2;
                        objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                float fV;
                                J.e eVar2 = eVar;
                                float fB = I.h.b(eVar2.j());
                                if (androidx.compose.ui.graphics.n0.a(i27, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                    fV = f19;
                                } else {
                                    fV = eVar2.v(fB) + f19;
                                }
                                float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                                float fFloatValue = aVar2.invoke().floatValue();
                                float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                                if (fMin <= 1.0f) {
                                    ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j16, fB, i27);
                                }
                                ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j17, fB, i27);
                                lVar6.invoke(eVar2);
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF4);
                    }
                    CanvasKt.a(hVarN2, (Ia.l) objF4, c1086gP, 0);
                    i20 = i15;
                    f12 = f11;
                    j11 = jD2;
                    hVar4 = hVar6;
                    lVar3 = lVar2;
                } else {
                    c1086gP.w();
                    hVar4 = hVar2;
                    i20 = i15;
                    f12 = f11;
                    j11 = jD2;
                    lVar3 = lVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final long j18 = jD;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ProgressIndicatorKt.b(aVar, hVar4, j18, j11, i20, f12, lVar3, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i15 = i10;
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= 196608;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i11 & 196608) == 0) {
                    if (c1086gP.g(f11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((i13 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i11 & 1;
                InterfaceC1084f.a.C0153a c0153a2 = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f110 = U.f12406a;
                        float f111 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f112 = U.f12406a;
                        float f113 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f114 = U.f12409d;
                                    long j19 = jD;
                                    int i28 = i15;
                                    float fMin = Math.min(eVar2.T0(f114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i28, 1)) {
                                        float f115 = fMin / 2.0f;
                                        eVar2.S(j19, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j19, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f114 = U.f12409d;
                                    long j19 = jD;
                                    int i28 = i15;
                                    float fMin = Math.min(eVar2.T0(f114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i28, 1)) {
                                        float f115 = fMin / 2.0f;
                                        eVar2.S(j19, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j19, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f114 = U.f12406a;
                        float f115 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f116 = U.f12406a;
                        float f117 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f118 = U.f12409d;
                                    long j19 = jD;
                                    int i28 = i15;
                                    float fMin = Math.min(eVar2.T0(f118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i28, 1)) {
                                        float f119 = fMin / 2.0f;
                                        eVar2.S(j19, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j19, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f118 = U.f12409d;
                                    long j19 = jD;
                                    int i28 = i15;
                                    float fMin = Math.min(eVar2.T0(f118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i28, 1)) {
                                        float f119 = fMin / 2.0f;
                                        eVar2.S(j19, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j19, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                }
                c1086gP.U();
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12) {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                }
                aVar2 = (Ia.a) objF2;
                androidx.compose.ui.h hVarI3 = hVar3.i(f12272b);
                zK = c1086gP.K(aVar2);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar7 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar7 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar7);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar7 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar7 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar7);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.h hVarN3 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI3, true, (Ia.l) objF3));
                if ((i13 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                androidx.compose.ui.h hVar7 = hVar3;
                if ((458752 & i13) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                objF4 = c1086gP.f();
                if (zK2) {
                    final int i28 = i15;
                    final float f118 = f11;
                    final long j19 = jD2;
                    final long j110 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar7 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i28, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f118;
                            } else {
                                fV = eVar2.v(fB) + f118;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j19, fB, i28);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j110, fB, i28);
                            lVar7.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    final int i29 = i15;
                    final float f119 = f11;
                    final long j111 = jD2;
                    final long j112 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar8 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i29, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f119;
                            } else {
                                fV = eVar2.v(fB) + f119;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j111, fB, i29);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j112, fB, i29);
                            lVar8.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                CanvasKt.a(hVarN3, (Ia.l) objF4, c1086gP, 0);
                i20 = i15;
                f12 = f11;
                j11 = jD2;
                hVar4 = hVar7;
                lVar3 = lVar2;
            } else {
                c1086gP.r0();
                i19 = i11 & 1;
                InterfaceC1084f.a.C0153a c0153a3 = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f1110 = U.f12406a;
                        float f1111 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f1112 = U.f12406a;
                        float f1113 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f1114 = U.f12409d;
                                    long j113 = jD;
                                    int i210 = i15;
                                    float fMin = Math.min(eVar2.T0(f1114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i210, 1)) {
                                        float f1115 = fMin / 2.0f;
                                        eVar2.S(j113, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j113, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f1114 = U.f12409d;
                                    long j113 = jD;
                                    int i210 = i15;
                                    float fMin = Math.min(eVar2.T0(f1114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i210, 1)) {
                                        float f1115 = fMin / 2.0f;
                                        eVar2.S(j113, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j113, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f1114 = U.f12406a;
                        float f1115 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f1116 = U.f12406a;
                        float f1117 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f1118 = U.f12409d;
                                    long j113 = jD;
                                    int i210 = i15;
                                    float fMin = Math.min(eVar2.T0(f1118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i210, 1)) {
                                        float f1119 = fMin / 2.0f;
                                        eVar2.S(j113, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j113, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f1118 = U.f12409d;
                                    long j113 = jD;
                                    int i210 = i15;
                                    float fMin = Math.min(eVar2.T0(f1118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i210, 1)) {
                                        float f1119 = fMin / 2.0f;
                                        eVar2.S(j113, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j113, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                }
                c1086gP.U();
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12) {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                }
                aVar2 = (Ia.a) objF2;
                androidx.compose.ui.h hVarI4 = hVar3.i(f12272b);
                zK = c1086gP.K(aVar2);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar8 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar9 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar8);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar8 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar9 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar8);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.h hVarN4 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI4, true, (Ia.l) objF3));
                if ((i13 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                androidx.compose.ui.h hVar8 = hVar3;
                if ((458752 & i13) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                objF4 = c1086gP.f();
                if (zK2) {
                    final int i210 = i15;
                    final float f1118 = f11;
                    final long j113 = jD2;
                    final long j114 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar9 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i210, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f1118;
                            } else {
                                fV = eVar2.v(fB) + f1118;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j113, fB, i210);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j114, fB, i210);
                            lVar9.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    final int i211 = i15;
                    final float f1119 = f11;
                    final long j115 = jD2;
                    final long j116 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar10 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i211, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f1119;
                            } else {
                                fV = eVar2.v(fB) + f1119;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j115, fB, i211);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j116, fB, i211);
                            lVar10.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                CanvasKt.a(hVarN4, (Ia.l) objF4, c1086gP, 0);
                i20 = i15;
                f12 = f11;
                j11 = jD2;
                hVar4 = hVar8;
                lVar3 = lVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j117 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ProgressIndicatorKt.b(aVar, hVar4, j117, j11, i20, f12, lVar3, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        hVar2 = hVar;
        if ((i11 & 384) == 0) {
            jD = j;
            if ((i12 & 4) == 0) {
                i23 = 128;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        } else {
            jD = j;
        }
        if ((i11 & 3072) == 0) {
            jD2 = j10;
            if ((i12 & 8) == 0) {
                i22 = 1024;
            } else {
                i22 = 1024;
            }
            i13 |= i22;
        } else {
            jD2 = j10;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                if (c1086gP.h(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= 196608;
                f11 = f10;
            } else {
                f11 = f10;
                if ((i11 & 196608) == 0) {
                    if (c1086gP.g(f11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            if ((i13 & 599187) == 599186) {
                c1086gP.r0();
                i19 = i11 & 1;
                InterfaceC1084f.a.C0153a c0153a4 = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f11110 = U.f12406a;
                        float f11111 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f11112 = U.f12406a;
                        float f11113 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f11114 = U.f12409d;
                                    long j118 = jD;
                                    int i212 = i15;
                                    float fMin = Math.min(eVar2.T0(f11114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i212, 1)) {
                                        float f11115 = fMin / 2.0f;
                                        eVar2.S(j118, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j118, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f11114 = U.f12409d;
                                    long j118 = jD;
                                    int i212 = i15;
                                    float fMin = Math.min(eVar2.T0(f11114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i212, 1)) {
                                        float f11115 = fMin / 2.0f;
                                        eVar2.S(j118, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j118, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f11114 = U.f12406a;
                        float f11115 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f11116 = U.f12406a;
                        float f11117 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f11118 = U.f12409d;
                                    long j118 = jD;
                                    int i212 = i15;
                                    float fMin = Math.min(eVar2.T0(f11118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i212, 1)) {
                                        float f11119 = fMin / 2.0f;
                                        eVar2.S(j118, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j118, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f11118 = U.f12409d;
                                    long j118 = jD;
                                    int i212 = i15;
                                    float fMin = Math.min(eVar2.T0(f11118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i212, 1)) {
                                        float f11119 = fMin / 2.0f;
                                        eVar2.S(j118, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j118, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                }
                c1086gP.U();
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12) {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                }
                aVar2 = (Ia.a) objF2;
                androidx.compose.ui.h hVarI5 = hVar3.i(f12272b);
                zK = c1086gP.K(aVar2);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar9 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar11 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar9);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar9 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar11 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar9);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.h hVarN5 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI5, true, (Ia.l) objF3));
                if ((i13 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                androidx.compose.ui.h hVar9 = hVar3;
                if ((458752 & i13) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                objF4 = c1086gP.f();
                if (zK2) {
                    final int i212 = i15;
                    final float f11118 = f11;
                    final long j118 = jD2;
                    final long j119 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar11 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i212, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f11118;
                            } else {
                                fV = eVar2.v(fB) + f11118;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j118, fB, i212);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j119, fB, i212);
                            lVar11.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    final int i213 = i15;
                    final float f11119 = f11;
                    final long j1110 = jD2;
                    final long j1111 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar12 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i213, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f11119;
                            } else {
                                fV = eVar2.v(fB) + f11119;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j1110, fB, i213);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j1111, fB, i213);
                            lVar12.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                CanvasKt.a(hVarN5, (Ia.l) objF4, c1086gP, 0);
                i20 = i15;
                f12 = f11;
                j11 = jD2;
                hVar4 = hVar9;
                lVar3 = lVar2;
            } else {
                c1086gP.r0();
                i19 = i11 & 1;
                InterfaceC1084f.a.C0153a c0153a5 = InterfaceC1084f.a.f12980a;
                if (i19 != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f111110 = U.f12406a;
                        float f111111 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f111112 = U.f12406a;
                        float f111113 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f111114 = U.f12409d;
                                    long j1112 = jD;
                                    int i214 = i15;
                                    float fMin = Math.min(eVar2.T0(f111114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i214, 1)) {
                                        float f111115 = fMin / 2.0f;
                                        eVar2.S(j1112, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j1112, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f111114 = U.f12409d;
                                    long j1112 = jD;
                                    int i214 = i15;
                                    float fMin = Math.min(eVar2.T0(f111114), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i214, 1)) {
                                        float f111115 = fMin / 2.0f;
                                        eVar2.S(j1112, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j1112, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i12 & 4) != 0) {
                        float f111114 = U.f12406a;
                        float f111115 = B.t.f1365a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        float f111116 = U.f12406a;
                        float f111117 = B.t.f1365a;
                        jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        i15 = U.f12407b;
                    }
                    if (i17 != 0) {
                        f11 = U.f12410e;
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ 384) <= 256) {
                        }
                        if ((i13 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z15 | z10;
                        objF = c1086gP.f();
                        if (z11) {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f111118 = U.f12409d;
                                    long j1112 = jD;
                                    int i214 = i15;
                                    float fMin = Math.min(eVar2.T0(f111118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i214, 1)) {
                                        float f111119 = fMin / 2.0f;
                                        eVar2.S(j1112, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j1112, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        } else {
                            objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.e eVar) {
                                    J.e eVar2 = eVar;
                                    float f111118 = U.f12409d;
                                    long j1112 = jD;
                                    int i214 = i15;
                                    float fMin = Math.min(eVar2.T0(f111118), I.h.b(eVar2.j()));
                                    float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                    if (androidx.compose.ui.graphics.n0.a(i214, 1)) {
                                        float f111119 = fMin / 2.0f;
                                        eVar2.S(j1112, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                    } else {
                                        J.e.s0(eVar2, j1112, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            };
                            c1086gP.E(objF);
                        }
                        lVar2 = (Ia.l) objF;
                        i13 &= -3670017;
                    } else {
                        lVar2 = lVar;
                    }
                }
                c1086gP.U();
                if ((i13 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objF2 = c1086gP.f();
                if (z12) {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                } else {
                    objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final Float invoke() {
                            return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                        }
                    };
                    c1086gP.E(objF2);
                }
                aVar2 = (Ia.a) objF2;
                androidx.compose.ui.h hVarI6 = hVar3.i(f12272b);
                zK = c1086gP.K(aVar2);
                objF3 = c1086gP.f();
                if (zK) {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar10 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar13 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar10);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                } else {
                    objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.h hVar10 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                            Oa.l<Object> lVar13 = androidx.compose.ui.semantics.t.f15251a[1];
                            vVar.getClass();
                            wVar.e(vVar, hVar10);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF3);
                }
                androidx.compose.ui.h hVarN6 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI6, true, (Ia.l) objF3));
                if ((i13 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                androidx.compose.ui.h hVar10 = hVar3;
                if ((458752 & i13) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
                objF4 = c1086gP.f();
                if (zK2) {
                    final int i214 = i15;
                    final float f111118 = f11;
                    final long j1112 = jD2;
                    final long j1113 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar13 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i214, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f111118;
                            } else {
                                fV = eVar2.v(fB) + f111118;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j1112, fB, i214);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j1113, fB, i214);
                            lVar13.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                } else {
                    final int i215 = i15;
                    final float f111119 = f11;
                    final long j1114 = jD2;
                    final long j1115 = jD;
                    final Ia.l<? super J.e, p293xa.r> lVar14 = lVar2;
                    objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.e eVar) {
                            float fV;
                            J.e eVar2 = eVar;
                            float fB = I.h.b(eVar2.j());
                            if (androidx.compose.ui.graphics.n0.a(i215, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                                fV = f111119;
                            } else {
                                fV = eVar2.v(fB) + f111119;
                            }
                            float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                            float fFloatValue = aVar2.invoke().floatValue();
                            float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j1114, fB, i215);
                            }
                            ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j1115, fB, i215);
                            lVar14.invoke(eVar2);
                            return p293xa.r.f47939a;
                        }
                    };
                    c1086gP.E(objF4);
                }
                CanvasKt.a(hVarN6, (Ia.l) objF4, c1086gP, 0);
                i20 = i15;
                f12 = f11;
                j11 = jD2;
                hVar4 = hVar10;
                lVar3 = lVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final long j1116 = jD;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ProgressIndicatorKt.b(aVar, hVar4, j1116, j11, i20, f12, lVar3, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        i15 = i10;
        i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= 196608;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i11 & 196608) == 0) {
                if (c1086gP.g(f11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        if ((i13 & 599187) == 599186) {
            c1086gP.r0();
            i19 = i11 & 1;
            InterfaceC1084f.a.C0153a c0153a6 = InterfaceC1084f.a.f12980a;
            if (i19 != 0) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    float f1111110 = U.f12406a;
                    float f1111111 = B.t.f1365a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    float f1111112 = U.f12406a;
                    float f1111113 = B.t.f1365a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i15 = U.f12407b;
                }
                if (i17 != 0) {
                    f11 = U.f12410e;
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ 384) <= 256) {
                    }
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z15 | z10;
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f1111114 = U.f12409d;
                                long j1117 = jD;
                                int i216 = i15;
                                float fMin = Math.min(eVar2.T0(f1111114), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i216, 1)) {
                                    float f1111115 = fMin / 2.0f;
                                    eVar2.S(j1117, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j1117, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f1111114 = U.f12409d;
                                long j1117 = jD;
                                int i216 = i15;
                                float fMin = Math.min(eVar2.T0(f1111114), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i216, 1)) {
                                    float f1111115 = fMin / 2.0f;
                                    eVar2.S(j1117, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j1117, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    lVar2 = (Ia.l) objF;
                    i13 &= -3670017;
                } else {
                    lVar2 = lVar;
                }
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    float f1111114 = U.f12406a;
                    float f1111115 = B.t.f1365a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    float f1111116 = U.f12406a;
                    float f1111117 = B.t.f1365a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i15 = U.f12407b;
                }
                if (i17 != 0) {
                    f11 = U.f12410e;
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ 384) <= 256) {
                    }
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z15 | z10;
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f1111118 = U.f12409d;
                                long j1117 = jD;
                                int i216 = i15;
                                float fMin = Math.min(eVar2.T0(f1111118), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i216, 1)) {
                                    float f1111119 = fMin / 2.0f;
                                    eVar2.S(j1117, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j1117, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f1111118 = U.f12409d;
                                long j1117 = jD;
                                int i216 = i15;
                                float fMin = Math.min(eVar2.T0(f1111118), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i216, 1)) {
                                    float f1111119 = fMin / 2.0f;
                                    eVar2.S(j1117, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f1111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f1111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j1117, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    lVar2 = (Ia.l) objF;
                    i13 &= -3670017;
                } else {
                    lVar2 = lVar;
                }
            }
            c1086gP.U();
            if ((i13 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                c1086gP.E(objF2);
            }
            aVar2 = (Ia.a) objF2;
            androidx.compose.ui.h hVarI7 = hVar3.i(f12272b);
            zK = c1086gP.K(aVar2);
            objF3 = c1086gP.f();
            if (zK) {
                objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.h hVar11 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                        Oa.l<Object> lVar15 = androidx.compose.ui.semantics.t.f15251a[1];
                        vVar.getClass();
                        wVar.e(vVar, hVar11);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.h hVar11 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                        Oa.l<Object> lVar15 = androidx.compose.ui.semantics.t.f15251a[1];
                        vVar.getClass();
                        wVar.e(vVar, hVar11);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            androidx.compose.ui.h hVarN7 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI7, true, (Ia.l) objF3));
            if ((i13 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            androidx.compose.ui.h hVar11 = hVar3;
            if ((458752 & i13) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
            objF4 = c1086gP.f();
            if (zK2) {
                final int i216 = i15;
                final float f1111118 = f11;
                final long j1117 = jD2;
                final long j1118 = jD;
                final Ia.l<? super J.e, p293xa.r> lVar15 = lVar2;
                objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float fV;
                        J.e eVar2 = eVar;
                        float fB = I.h.b(eVar2.j());
                        if (androidx.compose.ui.graphics.n0.a(i216, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                            fV = f1111118;
                        } else {
                            fV = eVar2.v(fB) + f1111118;
                        }
                        float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                        float fFloatValue = aVar2.invoke().floatValue();
                        float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j1117, fB, i216);
                        }
                        ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j1118, fB, i216);
                        lVar15.invoke(eVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            } else {
                final int i217 = i15;
                final float f1111119 = f11;
                final long j1119 = jD2;
                final long j11110 = jD;
                final Ia.l<? super J.e, p293xa.r> lVar16 = lVar2;
                objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float fV;
                        J.e eVar2 = eVar;
                        float fB = I.h.b(eVar2.j());
                        if (androidx.compose.ui.graphics.n0.a(i217, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                            fV = f1111119;
                        } else {
                            fV = eVar2.v(fB) + f1111119;
                        }
                        float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                        float fFloatValue = aVar2.invoke().floatValue();
                        float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j1119, fB, i217);
                        }
                        ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j11110, fB, i217);
                        lVar16.invoke(eVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            CanvasKt.a(hVarN7, (Ia.l) objF4, c1086gP, 0);
            i20 = i15;
            f12 = f11;
            j11 = jD2;
            hVar4 = hVar11;
            lVar3 = lVar2;
        } else {
            c1086gP.r0();
            i19 = i11 & 1;
            InterfaceC1084f.a.C0153a c0153a7 = InterfaceC1084f.a.f12980a;
            if (i19 != 0) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    float f11111110 = U.f12406a;
                    float f11111111 = B.t.f1365a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    float f11111112 = U.f12406a;
                    float f11111113 = B.t.f1365a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i15 = U.f12407b;
                }
                if (i17 != 0) {
                    f11 = U.f12410e;
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ 384) <= 256) {
                    }
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z15 | z10;
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f11111114 = U.f12409d;
                                long j11111 = jD;
                                int i218 = i15;
                                float fMin = Math.min(eVar2.T0(f11111114), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i218, 1)) {
                                    float f11111115 = fMin / 2.0f;
                                    eVar2.S(j11111, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j11111, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f11111114 = U.f12409d;
                                long j11111 = jD;
                                int i218 = i15;
                                float fMin = Math.min(eVar2.T0(f11111114), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i218, 1)) {
                                    float f11111115 = fMin / 2.0f;
                                    eVar2.S(j11111, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11111115, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11111115) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j11111, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    lVar2 = (Ia.l) objF;
                    i13 &= -3670017;
                } else {
                    lVar2 = lVar;
                }
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i12 & 4) != 0) {
                    float f11111114 = U.f12406a;
                    float f11111115 = B.t.f1365a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12721n, c1086gP);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    float f11111116 = U.f12406a;
                    float f11111117 = B.t.f1365a;
                    jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.f12725r, c1086gP);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    i15 = U.f12407b;
                }
                if (i17 != 0) {
                    f11 = U.f12410e;
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ 384) <= 256) {
                    }
                    if ((i13 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = z15 | z10;
                    objF = c1086gP.f();
                    if (z11) {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f11111118 = U.f12409d;
                                long j11111 = jD;
                                int i218 = i15;
                                float fMin = Math.min(eVar2.T0(f11111118), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i218, 1)) {
                                    float f11111119 = fMin / 2.0f;
                                    eVar2.S(j11111, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j11111, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    } else {
                        objF = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.e eVar) {
                                J.e eVar2 = eVar;
                                float f11111118 = U.f12409d;
                                long j11111 = jD;
                                int i218 = i15;
                                float fMin = Math.min(eVar2.T0(f11111118), I.h.b(eVar2.j()));
                                float fB = (I.h.b(eVar2.j()) - fMin) / 2;
                                if (androidx.compose.ui.graphics.n0.a(i218, 1)) {
                                    float f11111119 = fMin / 2.0f;
                                    eVar2.S(j11111, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(eVar2.j()) / 2.0f : f11111119, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? eVar2.j1() : I.e.c((I.h.d(eVar2.j()) - f11111119) - fB, I.h.b(eVar2.j()) / 2.0f), 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
                                } else {
                                    J.e.s0(eVar2, j11111, I.e.c((I.h.d(eVar2.j()) - fMin) - fB, (I.h.b(eVar2.j()) - fMin) / 2.0f), Cb.a.b(fMin, fMin), 0.0f, R.styleable.AppCompatTheme_windowFixedHeightMajor);
                                }
                                return p293xa.r.f47939a;
                            }
                        };
                        c1086gP.E(objF);
                    }
                    lVar2 = (Ia.l) objF;
                    i13 &= -3670017;
                } else {
                    lVar2 = lVar;
                }
            }
            c1086gP.U();
            if ((i13 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objF2 = c1086gP.f();
            if (z12) {
                objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                c1086gP.E(objF2);
            } else {
                objF2 = new Ia.a<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final Float invoke() {
                        return Float.valueOf(Na.l.C(aVar.invoke().floatValue(), 0.0f, 1.0f));
                    }
                };
                c1086gP.E(objF2);
            }
            aVar2 = (Ia.a) objF2;
            androidx.compose.ui.h hVarI8 = hVar3.i(f12272b);
            zK = c1086gP.K(aVar2);
            objF3 = c1086gP.f();
            if (zK) {
                objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.h hVar12 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                        Oa.l<Object> lVar17 = androidx.compose.ui.semantics.t.f15251a[1];
                        vVar.getClass();
                        wVar.e(vVar, hVar12);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            } else {
                objF3 = new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.h hVar12 = new androidx.compose.ui.semantics.h(aVar2.invoke().floatValue(), new Na.d(0.0f, 1.0f));
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        androidx.compose.ui.semantics.v<androidx.compose.ui.semantics.h> vVar = SemanticsProperties.f15150c;
                        Oa.l<Object> lVar17 = androidx.compose.ui.semantics.t.f15251a[1];
                        vVar.getClass();
                        wVar.e(vVar, hVar12);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF3);
            }
            androidx.compose.ui.h hVarN8 = androidx.compose.foundation.layout.W.n(f12273c, f12274d, androidx.compose.ui.semantics.p.b(hVarI8, true, (Ia.l) objF3));
            if ((i13 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            androidx.compose.ui.h hVar12 = hVar3;
            if ((458752 & i13) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            zK2 = z14 | z13 | c1086gP.K(aVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && c1086gP.i(jD2)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ 384) <= 256 && c1086gP.i(jD)) || (i13 & 384) == 256) | ((((3670016 & i13) ^ 1572864) <= 1048576 && c1086gP.K(lVar2)) || (i13 & 1572864) == 1048576);
            objF4 = c1086gP.f();
            if (zK2) {
                final int i218 = i15;
                final float f11111118 = f11;
                final long j11111 = jD2;
                final long j11112 = jD;
                final Ia.l<? super J.e, p293xa.r> lVar17 = lVar2;
                objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float fV;
                        J.e eVar2 = eVar;
                        float fB = I.h.b(eVar2.j());
                        if (androidx.compose.ui.graphics.n0.a(i218, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                            fV = f11111118;
                        } else {
                            fV = eVar2.v(fB) + f11111118;
                        }
                        float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                        float fFloatValue = aVar2.invoke().floatValue();
                        float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j11111, fB, i218);
                        }
                        ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j11112, fB, i218);
                        lVar17.invoke(eVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            } else {
                final int i219 = i15;
                final float f11111119 = f11;
                final long j11113 = jD2;
                final long j11114 = jD;
                final Ia.l<? super J.e, p293xa.r> lVar18 = lVar2;
                objF4 = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(J.e eVar) {
                        float fV;
                        J.e eVar2 = eVar;
                        float fB = I.h.b(eVar2.j());
                        if (androidx.compose.ui.graphics.n0.a(i219, 0) || I.h.b(eVar2.j()) > I.h.d(eVar2.j())) {
                            fV = f11111119;
                        } else {
                            fV = eVar2.v(fB) + f11111119;
                        }
                        float fV2 = fV / eVar2.v(I.h.d(eVar2.j()));
                        float fFloatValue = aVar2.invoke().floatValue();
                        float fMin = Math.min(fFloatValue, fV2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            ProgressIndicatorKt.c(eVar2, fMin, 1.0f, j11113, fB, i219);
                        }
                        ProgressIndicatorKt.c(eVar2, 0.0f, fFloatValue, j11114, fB, i219);
                        lVar18.invoke(eVar2);
                        return p293xa.r.f47939a;
                    }
                };
                c1086gP.E(objF4);
            }
            CanvasKt.a(hVarN8, (Ia.l) objF4, c1086gP, 0);
            i20 = i15;
            f12 = f11;
            j11 = jD2;
            hVar4 = hVar12;
            lVar3 = lVar2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final long j11115 = jD;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ProgressIndicatorKt.b(aVar, hVar4, j11115, j11, i20, f12, lVar3, interfaceC1084f2, L4.b.l(i11 | 1), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(J.e eVar, float f10, float f11, long j, float f12, int i10) {
        float fD = I.h.d(eVar.j());
        float fB = I.h.b(eVar.j());
        float f13 = 2;
        float f14 = fB / f13;
        boolean z10 = eVar.getLayoutDirection() == LayoutDirection.f15717b;
        float f15 = (z10 ? f10 : 1.0f - f11) * fD;
        float f16 = (z10 ? f11 : 1.0f - f10) * fD;
        if (androidx.compose.ui.graphics.n0.a(i10, 0) || fB > fD) {
            eVar.Q0(j, I.e.c(f15, f14), I.e.c(f16, f14), f12, (480 & 16) != 0 ? 0 : 0, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
            return;
        }
        float f17 = f12 / f13;
        Na.d dVar = new Na.d(f17, fD - f17);
        float fFloatValue = ((Number) Na.l.G(Float.valueOf(f15), dVar)).floatValue();
        float fFloatValue2 = ((Number) Na.l.G(Float.valueOf(f16), dVar)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            eVar.Q0(j, I.e.c(fFloatValue, f14), I.e.c(fFloatValue2, f14), f12, (480 & 16) != 0 ? 0 : i10, null, 1.0f, null, (480 & 256) != 0 ? 3 : 0);
        }
    }

    public static final void d(J.e eVar, float f10, float f11, long j, J.i iVar) {
        float f12 = 2;
        float f13 = iVar.f3955a / f12;
        float fD = I.h.d(eVar.j()) - (f12 * f13);
        eVar.B0(j, f10, f11, I.e.c(f13, f13), Cb.a.b(fD, fD), 1.0f, iVar, null, 3);
    }
}
