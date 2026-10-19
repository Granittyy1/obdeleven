package J;

import androidx.compose.ui.graphics.C;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.graphics.C1149z;
import androidx.compose.ui.graphics.E;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.P;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.W;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.o0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: CanvasDrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0049a f3940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f3941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1142s f3942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1142s f3943e;

    /* JADX INFO: renamed from: J.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    public static final class C0049a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p013b0.c f3944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LayoutDirection f3945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public E f3946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f3947d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0049a)) {
                return false;
            }
            C0049a c0049a = (C0049a) obj;
            return kotlin.jvm.internal.i.a(this.f3944a, c0049a.f3944a) && this.f3945b == c0049a.f3945b && kotlin.jvm.internal.i.a(this.f3946c, c0049a.f3946c) && I.h.a(this.f3947d, c0049a.f3947d);
        }

        public final int hashCode() {
            return Long.hashCode(this.f3947d) + ((this.f3946c.hashCode() + ((this.f3945b.hashCode() + (this.f3944a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "DrawParams(density=" + this.f3944a + ", layoutDirection=" + this.f3945b + ", canvas=" + this.f3946c + ", size=" + ((Object) I.h.f(this.f3947d)) + ')';
        }
    }

    /* JADX INFO: compiled from: CanvasDrawScope.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final J.b f3948a = new J.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.compose.ui.graphics.layer.b f3949b;

        public b() {
        }

        public final E a() {
            return a.this.f3940b.f3946c;
        }

        public final p013b0.c b() {
            return a.this.f3940b.f3944a;
        }

        public final androidx.compose.ui.graphics.layer.b c() {
            return this.f3949b;
        }

        public final LayoutDirection d() {
            return a.this.f3940b.f3945b;
        }

        public final long e() {
            return a.this.f3940b.f3947d;
        }

        public final void f(E e10) {
            a.this.f3940b.f3946c = e10;
        }

        public final void g(p013b0.c cVar) {
            a.this.f3940b.f3944a = cVar;
        }

        public final void h(androidx.compose.ui.graphics.layer.b bVar) {
            this.f3949b = bVar;
        }

        public final void i(LayoutDirection layoutDirection) {
            a.this.f3940b.f3945b = layoutDirection;
        }

        public final void j(long j) {
            a.this.f3940b.f3947d = j;
        }
    }

    public a() {
        p013b0.d dVar = d.f3952a;
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        g gVar = g.f3953a;
        C0049a c0049a = new C0049a();
        c0049a.f3944a = dVar;
        c0049a.f3945b = layoutDirection;
        c0049a.f3946c = gVar;
        c0049a.f3947d = 0L;
        this.f3940b = c0049a;
        this.f3941c = new b();
    }

    public static d0 c(a aVar, long j, f fVar, float f10, I i10, int i11) {
        d0 d0VarR = aVar.r(fVar);
        if (f10 != 1.0f) {
            j = H.b(H.d(j) * f10, j);
        }
        C1142s c1142s = (C1142s) d0VarR;
        if (!H.c(c1142s.c(), j)) {
            c1142s.g(j);
        }
        if (c1142s.f13796c != null) {
            c1142s.e(null);
        }
        if (!kotlin.jvm.internal.i.a(c1142s.f13797d, i10)) {
            c1142s.k(i10);
        }
        if (!C1149z.a(c1142s.f13795b, i11)) {
            c1142s.j(i11);
        }
        if (!P.a(c1142s.f13794a.isFilterBitmap() ? 1 : 0, 1)) {
            c1142s.l(1);
        }
        return d0VarR;
    }

    @Override // J.e
    public final void B0(long j, float f10, float f11, long j10, long j11, float f12, f fVar, I i10, int i11) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (j10 & 4294967295L);
        this.f3940b.f3946c.f(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i13), f10, f11, c(this, j, fVar, f12, i10, i11));
    }

    @Override // J.e
    public final void J0(Path path, long j, float f10, f fVar, I i10, int i11) {
        this.f3940b.f3946c.j(path, c(this, j, fVar, f10, i10, i11));
    }

    @Override // J.e
    public final void L(W w3, long j, long j10, long j11, long j12, float f10, f fVar, I i10, int i11, int i12) {
        this.f3940b.f3946c.d(w3, j, j10, j11, j12, o(null, fVar, f10, i10, i11, i12));
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f3940b.f3944a.P0();
    }

    @Override // J.e
    public final void Q0(long j, long j10, long j11, float f10, int i10, p019b6.d dVar, float f11, I i11, int i12) {
        E e10 = this.f3940b.f3946c;
        d0 d0VarQ = q();
        long jB = f11 == 1.0f ? j : H.b(H.d(j) * f11, j);
        C1142s c1142s = (C1142s) d0VarQ;
        if (!H.c(c1142s.c(), jB)) {
            c1142s.g(jB);
        }
        if (c1142s.f13796c != null) {
            c1142s.e(null);
        }
        if (!kotlin.jvm.internal.i.a(c1142s.f13797d, i11)) {
            c1142s.k(i11);
        }
        if (!C1149z.a(c1142s.f13795b, i12)) {
            c1142s.j(i12);
        }
        if (c1142s.f13794a.getStrokeWidth() != f10) {
            c1142s.q(f10);
        }
        if (c1142s.f13794a.getStrokeMiter() != 4.0f) {
            c1142s.p(4.0f);
        }
        if (!n0.a(c1142s.h(), i10)) {
            c1142s.n(i10);
        }
        if (!o0.a(c1142s.i(), 0)) {
            c1142s.o(0);
        }
        if (!kotlin.jvm.internal.i.a(null, dVar)) {
            c1142s.m(dVar);
        }
        if (!P.a(c1142s.f13794a.isFilterBitmap() ? 1 : 0, 1)) {
            c1142s.l(1);
        }
        e10.b(j10, j11, d0VarQ);
    }

    @Override // J.e
    public final void R(long j, long j10, long j11, long j12, f fVar, float f10, I i10, int i11) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (j10 & 4294967295L);
        this.f3940b.f3946c.u(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), c(this, j, fVar, f10, i10, i11));
    }

    @Override // J.e
    public final void S(long j, float f10, long j10, float f11, f fVar, I i10, int i11) {
        this.f3940b.f3946c.r(f10, j10, c(this, j, fVar, f11, i10, i11));
    }

    @Override // J.e
    public final b W0() {
        return this.f3941c;
    }

    @Override // J.e
    public final void d1(C c10, long j, long j10, long j11, float f10, f fVar, I i10, int i11) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (j & 4294967295L);
        this.f3940b.f3946c.u(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), o(c10, fVar, f10, i10, i11, 1));
    }

    @Override // J.e
    public final void f0(C c10, long j, long j10, float f10, int i10, p019b6.d dVar, float f11, I i11, int i12) {
        E e10 = this.f3940b.f3946c;
        d0 d0VarQ = q();
        if (c10 != null) {
            c10.a(f11, j(), d0VarQ);
        } else {
            C1142s c1142s = (C1142s) d0VarQ;
            if (c1142s.a() != f11) {
                c1142s.b(f11);
            }
        }
        C1142s c1142s2 = (C1142s) d0VarQ;
        if (!kotlin.jvm.internal.i.a(c1142s2.f13797d, i11)) {
            c1142s2.k(i11);
        }
        if (!C1149z.a(c1142s2.f13795b, i12)) {
            c1142s2.j(i12);
        }
        if (c1142s2.f13794a.getStrokeWidth() != f10) {
            c1142s2.q(f10);
        }
        if (c1142s2.f13794a.getStrokeMiter() != 4.0f) {
            c1142s2.p(4.0f);
        }
        if (!n0.a(c1142s2.h(), i10)) {
            c1142s2.n(i10);
        }
        if (!o0.a(c1142s2.i(), 0)) {
            c1142s2.o(0);
        }
        if (!kotlin.jvm.internal.i.a(null, dVar)) {
            c1142s2.m(dVar);
        }
        if (!P.a(c1142s2.f13794a.isFilterBitmap() ? 1 : 0, 1)) {
            c1142s2.l(1);
        }
        e10.b(j, j10, d0VarQ);
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f3940b.f3944a.getDensity();
    }

    @Override // J.e
    public final LayoutDirection getLayoutDirection() {
        return this.f3940b.f3945b;
    }

    @Override // J.e
    public final void k1(W w3, long j, float f10, f fVar, I i10, int i11) {
        this.f3940b.f3946c.e(w3, j, o(null, fVar, f10, i10, i11, 1));
    }

    @Override // J.e
    public final void m1(Path path, C c10, float f10, f fVar, I i10, int i11) {
        this.f3940b.f3946c.j(path, o(c10, fVar, f10, i10, i11, 1));
    }

    public final d0 o(C c10, f fVar, float f10, I i10, int i11, int i12) {
        d0 d0VarR = r(fVar);
        if (c10 != null) {
            c10.a(f10, j(), d0VarR);
        } else {
            C1142s c1142s = (C1142s) d0VarR;
            if (c1142s.f13796c != null) {
                c1142s.e(null);
            }
            long jC = c1142s.c();
            long j = H.f13495b;
            if (!H.c(jC, j)) {
                c1142s.g(j);
            }
            if (c1142s.a() != f10) {
                c1142s.b(f10);
            }
        }
        C1142s c1142s2 = (C1142s) d0VarR;
        if (!kotlin.jvm.internal.i.a(c1142s2.f13797d, i10)) {
            c1142s2.k(i10);
        }
        if (!C1149z.a(c1142s2.f13795b, i11)) {
            c1142s2.j(i11);
        }
        if (!P.a(c1142s2.f13794a.isFilterBitmap() ? 1 : 0, i12)) {
            c1142s2.l(i12);
        }
        return d0VarR;
    }

    public final d0 q() {
        C1142s c1142s = this.f3943e;
        if (c1142s != null) {
            return c1142s;
        }
        C1142s c1142sA = C1143t.a();
        c1142sA.r(1);
        this.f3943e = c1142sA;
        return c1142sA;
    }

    public final d0 r(f fVar) {
        if (kotlin.jvm.internal.i.a(fVar, h.f3954a)) {
            C1142s c1142s = this.f3942d;
            if (c1142s != null) {
                return c1142s;
            }
            C1142s c1142sA = C1143t.a();
            c1142sA.r(0);
            this.f3942d = c1142sA;
            return c1142sA;
        }
        if (!(fVar instanceof i)) {
            throw new NoWhenBranchMatchedException();
        }
        d0 d0VarQ = q();
        C1142s c1142s2 = (C1142s) d0VarQ;
        float strokeWidth = c1142s2.f13794a.getStrokeWidth();
        i iVar = (i) fVar;
        float f10 = iVar.f3955a;
        if (strokeWidth != f10) {
            c1142s2.q(f10);
        }
        int iH = c1142s2.h();
        int i10 = iVar.f3957c;
        if (!n0.a(iH, i10)) {
            c1142s2.n(i10);
        }
        float strokeMiter = c1142s2.f13794a.getStrokeMiter();
        float f11 = iVar.f3956b;
        if (strokeMiter != f11) {
            c1142s2.p(f11);
        }
        int i11 = c1142s2.i();
        int i12 = iVar.f3958d;
        if (!o0.a(i11, i12)) {
            c1142s2.o(i12);
        }
        if (!kotlin.jvm.internal.i.a(null, null)) {
            c1142s2.m(null);
        }
        return d0VarQ;
    }

    @Override // J.e
    public final void x1(long j, long j10, long j11, float f10, f fVar, I i10, int i11) {
        int i12 = (int) (j10 >> 32);
        int i13 = (int) (j10 & 4294967295L);
        this.f3940b.f3946c.c(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i13), c(this, j, fVar, f10, i10, i11));
    }

    @Override // J.e
    public final void z1(C c10, long j, long j10, float f10, f fVar, I i10, int i11) {
        int i12 = (int) (j >> 32);
        int i13 = (int) (j & 4294967295L);
        this.f3940b.f3946c.c(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i12), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i13), o(c10, fVar, f10, i10, i11, 1));
    }
}
