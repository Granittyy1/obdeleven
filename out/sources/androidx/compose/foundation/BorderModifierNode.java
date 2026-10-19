package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNodeImpl;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.C1141q;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.W;
import androidx.compose.ui.graphics.X;
import androidx.compose.ui.graphics.b0;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BorderModifierNode extends AbstractC1187h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0934f f9716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f9717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.compose.ui.graphics.C f9718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l0 f9719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.compose.ui.draw.b f9720v;

    public BorderModifierNode(float f10, androidx.compose.ui.graphics.C c10, l0 l0Var) {
        this.f9717s = f10;
        this.f9718t = c10;
        this.f9719u = l0Var;
        CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl = new CacheDrawModifierNodeImpl(new CacheDrawScope(), new Ia.l<CacheDrawScope, androidx.compose.ui.draw.g>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:49:0x0185  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v14, types: [J.e] */
            /* JADX WARN: Type inference failed for: r11v21, types: [J.e] */
            /* JADX WARN: Type inference failed for: r22v1, types: [T, androidx.compose.ui.graphics.W] */
            /* JADX WARN: Type inference failed for: r31v0, types: [J.e] */
            /* JADX WARN: Type inference failed for: r3v21, types: [J.a, J.e] */
            /* JADX WARN: Type inference failed for: r3v22 */
            /* JADX WARN: Type inference failed for: r3v23, types: [J.a$b] */
            /* JADX WARN: Type inference failed for: r3v25 */
            /* JADX WARN: Type inference failed for: r3v33 */
            /* JADX WARN: Type inference failed for: r3v34 */
            @Override // Ia.l
            public final androidx.compose.ui.draw.g invoke(CacheDrawScope cacheDrawScope) throws Throwable {
                float fCeil;
                int i10;
                final androidx.compose.ui.graphics.A a10;
                boolean z10;
                androidx.compose.ui.graphics.E eC;
                Object obj;
                J.a.b bVar;
                androidx.compose.ui.draw.g gVarO;
                CacheDrawScope cacheDrawScope2 = cacheDrawScope;
                if (cacheDrawScope2.getDensity() * this.this$0.f9717s < 0.0f || I.h.c(cacheDrawScope2.f13369b.j()) <= 0.0f) {
                    return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
                        @Override // Ia.l
                        public final p293xa.r invoke(J.c cVar) {
                            cVar.A1();
                            return p293xa.r.f47939a;
                        }
                    });
                }
                if (p013b0.f.a(this.this$0.f9717s, 0.0f)) {
                    fCeil = 1.0f;
                } else {
                    fCeil = (float) Math.ceil(cacheDrawScope2.getDensity() * this.this$0.f9717s);
                }
                float f11 = 2;
                final float fMin = Math.min(fCeil, (float) Math.ceil(I.h.c(cacheDrawScope2.f13369b.j()) / f11));
                final float f12 = fMin / f11;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() & 4294967295L)) - fMin)) & 4294967295L);
                float f13 = fMin * f11;
                boolean z11 = f13 > I.h.c(cacheDrawScope2.f13369b.j());
                b0 b0VarMo0createOutlinePq9zytI = this.this$0.f9719u.mo0createOutlinePq9zytI(cacheDrawScope2.f13369b.j(), cacheDrawScope2.f13369b.getLayoutDirection(), cacheDrawScope2);
                if (!(b0VarMo0createOutlinePq9zytI instanceof b0.a)) {
                    if (!(b0VarMo0createOutlinePq9zytI instanceof b0.c)) {
                        if (!(b0VarMo0createOutlinePq9zytI instanceof b0.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final androidx.compose.ui.graphics.C c11 = this.this$0.f9718t;
                        if (z11) {
                            jFloatToRawIntBits = 0;
                        }
                        if (z11) {
                            jFloatToRawIntBits2 = cacheDrawScope2.f13369b.j();
                        }
                        final J.f iVar = z11 ? J.h.f3954a : new J.i(fMin, 0.0f, 0, 0, 30);
                        final long j = jFloatToRawIntBits;
                        final long j10 = jFloatToRawIntBits2;
                        return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar) {
                                J.c cVar2 = cVar;
                                cVar2.A1();
                                J.e.m0(cVar2, c11, j, j10, 0.0f, iVar, R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    BorderModifierNode borderModifierNode = this.this$0;
                    final androidx.compose.ui.graphics.C c12 = borderModifierNode.f9718t;
                    b0.c cVar = (b0.c) b0VarMo0createOutlinePq9zytI;
                    boolean zR = kotlinx.coroutines.C.r(cVar.f13541a);
                    I.g gVar = cVar.f13541a;
                    if (zR) {
                        final long j11 = gVar.f3765e;
                        final J.i iVar2 = new J.i(fMin, 0.0f, 0, 0, 30);
                        final boolean z12 = z11;
                        return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar2) {
                                J.c cVar3 = cVar2;
                                cVar3.A1();
                                if (z12) {
                                    J.e.M(cVar3, c12, 0L, 0L, j11, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
                                    float f14 = f12;
                                    if (fIntBitsToFloat < f14) {
                                        float f15 = fMin;
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar3.j() >> 32)) - fMin;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (cVar3.j() & 4294967295L)) - fMin;
                                        androidx.compose.ui.graphics.C c13 = c12;
                                        long j12 = j11;
                                        J.a.b bVarW0 = cVar3.W0();
                                        long jE = bVarW0.e();
                                        bVarW0.a().g();
                                        try {
                                            bVarW0.f3948a.d(f15, f15, fIntBitsToFloat2, fIntBitsToFloat3, 0);
                                            J.e.M(cVar3, c13, 0L, 0L, j12, null, 246);
                                        } finally {
                                            C0936h.f(bVarW0, jE);
                                        }
                                    } else {
                                        J.e.M(cVar3, c12, jFloatToRawIntBits, jFloatToRawIntBits2, C0935g.c(f14, j11), iVar2, 208);
                                    }
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    if (borderModifierNode.f9716r == null) {
                        borderModifierNode.f9716r = new C0934f(0);
                    }
                    C0934f c0934f = borderModifierNode.f9716r;
                    kotlin.jvm.internal.i.b(c0934f);
                    final Path pathA = c0934f.f9904d;
                    if (pathA == null) {
                        pathA = C1146w.a();
                        c0934f.f9904d = pathA;
                    }
                    pathA.reset();
                    pathA.q(gVar, Path.Direction.f13511b);
                    if (!z11) {
                        C1144u c1144uA = C1146w.a();
                        c1144uA.q(new I.g(fMin, fMin, gVar.b() - fMin, gVar.a() - fMin, C0935g.c(fMin, gVar.f3765e), C0935g.c(fMin, gVar.f3766f), C0935g.c(fMin, gVar.f3767g), C0935g.c(fMin, gVar.f3768h)), Path.Direction.f13511b);
                        pathA.p(pathA, c1144uA, 0);
                    }
                    return cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.c cVar2) {
                            J.c cVar3 = cVar2;
                            cVar3.A1();
                            J.e.D0(cVar3, pathA, c12, 0.0f, null, 60);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                BorderModifierNode borderModifierNode2 = this.this$0;
                final androidx.compose.ui.graphics.C c13 = borderModifierNode2.f9718t;
                final b0.a aVar = (b0.a) b0VarMo0createOutlinePq9zytI;
                if (z11) {
                    gVarO = cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.c cVar2) {
                            J.c cVar3 = cVar2;
                            cVar3.A1();
                            J.e.D0(cVar3, aVar.f13539a, c13, 0.0f, null, 60);
                            return p293xa.r.f47939a;
                        }
                    });
                } else {
                    if (c13 instanceof m0) {
                        a10 = new androidx.compose.ui.graphics.A(5, androidx.compose.ui.graphics.H.b(1.0f, ((m0) c13).f13770a));
                        i10 = 1;
                    } else {
                        i10 = 0;
                        a10 = null;
                    }
                    final I.f fVarU = aVar.f13539a.u();
                    if (borderModifierNode2.f9716r == null) {
                        borderModifierNode2.f9716r = new C0934f(0);
                    }
                    C0934f c0934f2 = borderModifierNode2.f9716r;
                    kotlin.jvm.internal.i.b(c0934f2);
                    Path pathA2 = c0934f2.f9904d;
                    if (pathA2 == null) {
                        pathA2 = C1146w.a();
                        c0934f2.f9904d = pathA2;
                    }
                    Path path = pathA2;
                    path.reset();
                    path.n(fVarU, Path.Direction.f13511b);
                    path.p(path, aVar.f13539a, 0);
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    float f14 = fVarU.f3759c;
                    float f15 = fVarU.f3757a;
                    int iCeil = (int) Math.ceil(f14 - f15);
                    float f16 = fVarU.f3760d;
                    float f17 = fVarU.f3758b;
                    final long jCeil = (((long) iCeil) << 32) | (((long) ((int) Math.ceil(f16 - f17))) & 4294967295L);
                    C0934f c0934f3 = borderModifierNode2.f9716r;
                    kotlin.jvm.internal.i.b(c0934f3);
                    W w3 = c0934f3.f9901a;
                    androidx.compose.ui.graphics.E e10 = c0934f3.f9902b;
                    X x10 = w3 != null ? new X(w3.b()) : null;
                    if (x10 == null ? false : X.a(x10.f13532a, 0)) {
                        z10 = true;
                    } else {
                        X x11 = w3 != null ? new X(w3.b()) : null;
                        if (x11 != null && i10 == x11.f13532a) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (w3 == null || e10 == null || Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() >> 32)) > w3.getWidth() || Float.intBitsToFloat((int) (cacheDrawScope2.f13369b.j() & 4294967295L)) > w3.getHeight() || !z10) {
                        C1141q c1141qA = S4.o.a((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i10);
                        c0934f3.f9901a = c1141qA;
                        eC = D9.o.c(c1141qA);
                        c0934f3.f9902b = eC;
                        obj = c1141qA;
                    } else {
                        eC = e10;
                        obj = w3;
                    }
                    J.a aVar2 = c0934f3.f9903c;
                    ?? r10 = aVar2;
                    if (aVar2 == null) {
                        J.a aVar3 = new J.a();
                        c0934f3.f9903c = aVar3;
                        r10 = aVar3;
                    }
                    long jK = A8.A.k(jCeil);
                    LayoutDirection layoutDirection = cacheDrawScope2.f13369b.getLayoutDirection();
                    J.a.C0049a c0049a = r10.f3940b;
                    p013b0.c cVar2 = c0049a.f3944a;
                    LayoutDirection layoutDirection2 = c0049a.f3945b;
                    androidx.compose.ui.graphics.E e11 = c0049a.f3946c;
                    long j12 = c0049a.f3947d;
                    c0049a.f3944a = cacheDrawScope2;
                    c0049a.f3945b = layoutDirection;
                    c0049a.f3946c = eC;
                    c0049a.f3947d = jK;
                    eC.g();
                    J.e.s0(r10, androidx.compose.ui.graphics.H.f13495b, 0L, jK, 0.0f, 58);
                    float f18 = -f15;
                    float f19 = -f17;
                    J.a.b bVar2 = r10.f3941c;
                    bVar2.f3948a.g(f18, f19);
                    try {
                        ?? r22 = obj;
                        try {
                            J.e.D0(r10, aVar.f13539a, c13, 0.0f, new J.i(f13, 0.0f, 0, 0, 30), 52);
                            float f20 = 1;
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (r10.j() >> 32)) + f20) / Float.intBitsToFloat((int) (r10.j() >> 32));
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (r10.j() & 4294967295L)) + f20) / Float.intBitsToFloat((int) (r10.j() & 4294967295L));
                            long jJ1 = r10.j1();
                            long jE = bVar2.e();
                            bVar2.a().g();
                            try {
                                try {
                                    bVar2.f3948a.f(fIntBitsToFloat, fIntBitsToFloat2, jJ1);
                                    ?? r11 = r10;
                                    bVar = bVar2;
                                    try {
                                        J.e.D0(r11, path, c13, 0.0f, null, 28);
                                        bVar.a().o();
                                        bVar.j(jE);
                                        bVar.f3948a.g(-f18, -f19);
                                        eC.o();
                                        c0049a.f3944a = cVar2;
                                        c0049a.f3945b = layoutDirection2;
                                        c0049a.f3946c = e11;
                                        c0049a.f3947d = j12;
                                        r22.a();
                                        ref$ObjectRef.element = r22;
                                        gVarO = cacheDrawScope2.o(new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(J.c cVar3) throws Throwable {
                                                float f21;
                                                float f22;
                                                J.c cVar4 = cVar3;
                                                cVar4.A1();
                                                I.f fVar = fVarU;
                                                float f23 = fVar.f3757a;
                                                Ref$ObjectRef<W> ref$ObjectRef2 = ref$ObjectRef;
                                                long j13 = jCeil;
                                                androidx.compose.ui.graphics.I i11 = a10;
                                                J.b bVar3 = cVar4.W0().f3948a;
                                                float f24 = fVar.f3758b;
                                                bVar3.g(f23, f24);
                                                try {
                                                    try {
                                                        J.e.t1(cVar4, ref$ObjectRef2.element, 0L, j13, 0L, 0L, 0.0f, null, i11, 0, 0, 890);
                                                        cVar4.W0().f3948a.g(-f23, -f24);
                                                        return p293xa.r.f47939a;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        f21 = f24;
                                                        f22 = f23;
                                                        cVar4.W0().f3948a.g(-f22, -f21);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    f21 = f24;
                                                    f22 = f23;
                                                }
                                            }
                                        });
                                    } catch (Throwable th) {
                                        th = th;
                                        bVar.a().o();
                                        bVar.j(jE);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r10.f3948a.g(-f18, -f19);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                bVar = bVar2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r10 = bVar2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r10 = bVar2;
                    }
                }
                return gVarO;
            }
        });
        Q1(cacheDrawModifierNodeImpl);
        this.f9720v = cacheDrawModifierNodeImpl;
    }
}
