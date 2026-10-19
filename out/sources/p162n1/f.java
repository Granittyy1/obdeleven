package p162n1;

import A1.C0575j;
import A1.C0576k;
import B8.E0;
import Q8.d;
import Z3.o;
import android.os.Looper;
import android.util.SparseArray;
import androidx.compose.animation.D;
import androidx.compose.foundation.C0936h;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.compose.ui.platform.C1251w;
import androidx.compose.ui.text.font.s;
import androidx.core.view.C1293h;
import androidx.media3.exoplayer.C1390h;
import androidx.media3.exoplayer.C1391i;
import androidx.media3.exoplayer.E;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.h;
import com.braze.Constants;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.voltasit.obdeleven.presentation.history.i;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p005a4.p;
import p005a4.q;
import p033c7.C1505s;
import p078g1.B;
import p078g1.F;
import p078g1.n;
import p078g1.r;
import p078g1.u;
import p078g1.v;
import p078g1.x;
import p102i1.b;
import p114j1.A;
import p114j1.c;
import p114j1.g;
import p114j1.j;
import p235t1.k;

/* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements p162n1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f44682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x.b f44683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x.c f44684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f44685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<b.a> f44686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j<b> f44687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f44688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f44689i;
    public boolean j;

    /* JADX INFO: compiled from: DefaultAnalyticsCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x.b f44690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList<h.b> f44691b = ImmutableList.K();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableMap<h.b, x> f44692c = ImmutableMap.h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h.b f44693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h.b f44694e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public h.b f44695f;

        public a(x.b bVar) {
            this.f44690a = bVar;
        }

        public static h.b b(v vVar, ImmutableList<h.b> immutableList, h.b bVar, x.b bVar2) {
            x xVarR = vVar.R();
            int iM = vVar.m();
            Object objL = xVarR.p() ? null : xVarR.l(iM);
            int iB = (vVar.f() || xVarR.p()) ? -1 : xVarR.f(iM, bVar2, false).b(A.F(vVar.b0()) - bVar2.f35472e);
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                h.b bVar3 = immutableList.get(i10);
                if (c(bVar3, objL, vVar.f(), vVar.J(), vVar.r(), iB)) {
                    return bVar3;
                }
            }
            if (immutableList.isEmpty() && bVar != null) {
                if (c(bVar, objL, vVar.f(), vVar.J(), vVar.r(), iB)) {
                    return bVar;
                }
            }
            return null;
        }

        public static boolean c(h.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f18698a.equals(obj)) {
                return false;
            }
            int i13 = bVar.f18699b;
            return (z10 && i13 == i10 && bVar.f18700c == i11) || (!z10 && i13 == -1 && bVar.f18702e == i12);
        }

        public final void a(ImmutableMap.a<h.b, x> aVar, h.b bVar, x xVar) {
            if (bVar == null) {
                return;
            }
            if (xVar.b(bVar.f18698a) != -1) {
                aVar.b(bVar, xVar);
                return;
            }
            x xVar2 = this.f44692c.get(bVar);
            if (xVar2 != null) {
                aVar.b(bVar, xVar2);
            }
        }

        public final void d(x xVar) {
            ImmutableMap.a<h.b, x> aVar = new ImmutableMap.a<>(4);
            if (this.f44691b.isEmpty()) {
                a(aVar, this.f44694e, xVar);
                if (!Objects.equals(this.f44695f, this.f44694e)) {
                    a(aVar, this.f44695f, xVar);
                }
                if (!Objects.equals(this.f44693d, this.f44694e) && !Objects.equals(this.f44693d, this.f44695f)) {
                    a(aVar, this.f44693d, xVar);
                }
            } else {
                for (int i10 = 0; i10 < this.f44691b.size(); i10++) {
                    a(aVar, this.f44691b.get(i10), xVar);
                }
                if (!this.f44691b.contains(this.f44693d)) {
                    a(aVar, this.f44693d, xVar);
                }
            }
            this.f44692c = aVar.a();
        }
    }

    public f(c cVar) {
        cVar.getClass();
        this.f44682b = cVar;
        int i10 = A.f40996a;
        Looper looperMyLooper = Looper.myLooper();
        this.f44687g = new j<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, cVar, new C4.a(8));
        x.b bVar = new x.b();
        this.f44683c = bVar;
        this.f44684d = new x.c();
        this.f44685e = new a(bVar);
        this.f44686f = new SparseArray<>();
    }

    @Override // g1.v.c
    public final void A(b bVar) {
        b.a aVarH0 = h0();
        m0(aVarH0, 27, new p(aVarH0, bVar));
    }

    @Override // p162n1.a
    public final void B(n nVar, C1391i c1391i) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1009, new E0(aVarL0, nVar, c1391i));
    }

    @Override // p162n1.a
    public final void C(int i10, long j) {
        b.a aVarI0 = i0(this.f44685e.f44694e);
        m0(aVarI0, 1018, new A8.f(i10, j, aVarI0));
    }

    @Override // p162n1.a
    public final void D(v vVar, Looper looper) {
        p241t7.b.k(this.f44688h == null || this.f44685e.f44691b.isEmpty());
        vVar.getClass();
        this.f44688h = vVar;
        this.f44689i = this.f44682b.a(looper, null);
        j<b> jVar = this.f44687g;
        this.f44687g = new j<>(jVar.f41026d, looper, jVar.f41023a, new C1505s(this, vVar), jVar.f41031i);
    }

    @Override // p162n1.a
    public final void E(C1390h c1390h) {
        m0(l0(), 1007, new d());
    }

    @Override // p162n1.a
    public final void F(n nVar, C1391i c1391i) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1017, new Z3.n(aVarL0, nVar, c1391i));
    }

    @Override // g1.v.c
    public final void G(int i10) {
        v vVar = this.f44688h;
        vVar.getClass();
        a aVar = this.f44685e;
        aVar.f44693d = a.b(vVar, aVar.f44691b, aVar.f44694e, aVar.f44690a);
        aVar.d(vVar.R());
        m0(h0(), 0, new coil.intercept.a());
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void H(int i10, h.b bVar, p235t1.j jVar, k kVar, IOException iOException, boolean z10) {
        b.a aVarK0 = k0(i10, bVar);
        m0(aVarK0, 1003, new A4.b(aVarK0, jVar, kVar, iOException, z10));
    }

    @Override // p162n1.a
    public final void I(t tVar) {
        this.f44687g.a(tVar);
    }

    @Override // p162n1.a
    public final void J(C1390h c1390h) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1015, new o(aVarL0, c1390h, 6));
    }

    @Override // p162n1.a
    public final void K(Object obj, long j) {
        b.a aVarL0 = l0();
        m0(aVarL0, 26, new I4.f(aVarL0, obj, j));
    }

    @Override // g1.v.c
    public final void L(int i10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 8, new s(aVarH0, i10));
    }

    @Override // g1.v.c
    public final void N(boolean z10) {
        b.a aVarL0 = l0();
        m0(aVarL0, 23, new C4.b(aVarL0, z10));
    }

    @Override // p162n1.a
    public final void O(Exception exc) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1014, new C0936h(aVarL0, exc));
    }

    @Override // g1.v.c
    public final void P(List<p102i1.a> list) {
        b.a aVarH0 = h0();
        m0(aVarH0, 27, new F1.a(aVarH0, list));
    }

    @Override // g1.v.c
    public final void Q(int i10, boolean z10) {
        b.a aVarH0 = h0();
        m0(aVarH0, -1, new C1293h(aVarH0, z10, i10));
    }

    @Override // p162n1.a
    public final void R(long j) {
        m0(l0(), 1010, new e());
    }

    @Override // p162n1.a
    public final void S(p175o1.k kVar) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1031, new C1251w(aVarL0, kVar));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void T(int i10, h.b bVar, p235t1.j jVar, k kVar) {
        b.a aVarK0 = k0(i10, bVar);
        m0(aVarK0, 1001, new C1293h(aVarK0, jVar, kVar));
    }

    @Override // p162n1.a
    public final void U(Exception exc) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1029, new B1.a(aVarL0, exc, 6));
    }

    @Override // g1.v.c
    public final void V(p078g1.A a10) {
        m0(h0(), 19, new com.obdeleven.service.core.b());
    }

    @Override // p162n1.a
    public final void W(Exception exc) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1030, new B1.a(aVarL0, exc, 7));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void X(int i10, h.b bVar, p235t1.j jVar, k kVar) {
        b.a aVarK0 = k0(i10, bVar);
        m0(aVarK0, 1002, new B6.c(aVarK0, jVar, kVar));
    }

    @Override // g1.v.c
    public final void Z(int i10, int i11) {
        b.a aVarL0 = l0();
        m0(aVarL0, 24, new C0576k(aVarL0, i10, i11));
    }

    @Override // p162n1.a
    public final void a() {
        g gVar = this.f44689i;
        p241t7.b.l(gVar);
        gVar.e(new Runnable() { // from class: n1.d
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f44678b;
                fVar.m0(fVar.h0(), 1028, new androidx.compose.foundation.gestures.d());
                fVar.f44687g.d();
            }
        });
    }

    @Override // g1.v.c
    public final void a0(u uVar) {
        b.a aVarH0 = h0();
        m0(aVarH0, 12, new B6.c(aVarH0, uVar));
    }

    @Override // g1.v.c
    public final void b(F f10) {
        b.a aVarL0 = l0();
        m0(aVarL0, 25, new E(aVarL0, f10));
    }

    @Override // g1.v.c
    public final void b0(B b10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 2, new J4.n(aVarH0, b10));
    }

    @Override // g1.v.c
    public final void c(ExoPlaybackException exoPlaybackException) {
        h.b bVar;
        b.a aVarH0 = (exoPlaybackException == null || (bVar = exoPlaybackException.mediaPeriodId) == null) ? h0() : i0(bVar);
        m0(aVarH0, 10, new androidx.compose.ui.graphics.colorspace.s(aVarH0, exoPlaybackException));
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c0(int i10, h.b bVar, p235t1.j jVar, k kVar, int i11) {
        m0(k0(i10, bVar), Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS, new q());
    }

    @Override // p162n1.a
    public final void d(C1390h c1390h) {
        b.a aVarI0 = i0(this.f44685e.f44694e);
        m0(aVarI0, 1020, new Q6.d(aVarI0, c1390h));
    }

    @Override // g1.v.c
    public final void d0(p078g1.s sVar) {
        b.a aVarH0 = h0();
        m0(aVarH0, 28, new Z3.n(aVarH0, sVar));
    }

    @Override // g1.v.c
    public final void e(int i10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 6, new E0(aVarH0, i10));
    }

    @Override // p162n1.a
    public final void e0(int i10, long j, long j10) {
        m0(l0(), 1011, new O.a());
    }

    @Override // p162n1.a
    public final void f(String str) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1019, new o(aVarL0, str, 5));
    }

    @Override // p162n1.a
    public final void f0(C1390h c1390h) {
        m0(i0(this.f44685e.f44694e), 1013, new B6.d());
    }

    @Override // g1.v.c
    public final void g(final int i10, final v.d dVar, final v.d dVar2) {
        if (i10 == 1) {
            this.j = false;
        }
        v vVar = this.f44688h;
        vVar.getClass();
        a aVar = this.f44685e;
        aVar.f44693d = a.b(vVar, aVar.f44691b, aVar.f44694e, aVar.f44690a);
        final b.a aVarH0 = h0();
        m0(aVarH0, 11, new j.a(aVarH0, i10, dVar, dVar2) { // from class: n1.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f44677b;

            {
                this.f44677b = i10;
            }

            @Override // j1.j.a
            public final void invoke(Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                bVar.a(this.f44677b);
            }
        });
    }

    @Override // g1.v.c
    public final void g0(boolean z10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 7, new B7.b(aVarH0, z10));
    }

    @Override // p162n1.a
    public final void h(List<h.b> list, h.b bVar) {
        v vVar = this.f44688h;
        vVar.getClass();
        a aVar = this.f44685e;
        aVar.getClass();
        aVar.f44691b = ImmutableList.G(list);
        if (!list.isEmpty()) {
            aVar.f44694e = list.get(0);
            bVar.getClass();
            aVar.f44695f = bVar;
        }
        if (aVar.f44693d == null) {
            aVar.f44693d = a.b(vVar, aVar.f44691b, aVar.f44694e, aVar.f44690a);
        }
        aVar.d(vVar.R());
    }

    public final b.a h0() {
        return i0(this.f44685e.f44693d);
    }

    @Override // p162n1.a
    public final void i(int i10, long j) {
        b.a aVarI0 = i0(this.f44685e.f44694e);
        m0(aVarI0, 1021, new B6.b(i10, j, aVarI0));
    }

    public final b.a i0(h.b bVar) {
        this.f44688h.getClass();
        x xVar = bVar == null ? null : this.f44685e.f44692c.get(bVar);
        if (bVar != null && xVar != null) {
            return j0(xVar, xVar.g(bVar.f18698a, this.f44683c).f35470c, bVar);
        }
        int iK = this.f44688h.K();
        x xVarR = this.f44688h.R();
        if (iK >= xVarR.o()) {
            xVarR = x.f35467a;
        }
        return j0(xVarR, iK, null);
    }

    @Override // p162n1.a
    public final void j(String str, long j, long j10) {
        m0(l0(), 1016, new p005a4.o());
    }

    public final b.a j0(x xVar, int i10, h.b bVar) {
        h.b bVar2 = xVar.p() ? null : bVar;
        long jB = this.f44682b.b();
        boolean z10 = xVar.equals(this.f44688h.R()) && i10 == this.f44688h.K();
        long jQ = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jQ = this.f44688h.A();
            } else if (!xVar.p()) {
                jQ = A.Q(xVar.m(i10, this.f44684d, 0L).f35486k);
            }
        } else if (z10 && this.f44688h.J() == bVar2.f18699b && this.f44688h.r() == bVar2.f18700c) {
            jQ = this.f44688h.b0();
        }
        return new b.a(jB, xVar, i10, bVar2, jQ, this.f44688h.R(), this.f44688h.K(), this.f44685e.f44693d, this.f44688h.b0(), this.f44688h.h());
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void k(int i10, h.b bVar, k kVar) {
        b.a aVarK0 = k0(i10, bVar);
        m0(aVarK0, 1004, new i(aVarK0, kVar));
    }

    public final b.a k0(int i10, h.b bVar) {
        this.f44688h.getClass();
        if (bVar != null) {
            return this.f44685e.f44692c.get(bVar) != null ? i0(bVar) : j0(x.f35467a, i10, bVar);
        }
        x xVarR = this.f44688h.R();
        if (i10 >= xVarR.o()) {
            xVarR = x.f35467a;
        }
        return j0(xVarR, i10, null);
    }

    @Override // g1.v.c
    public final void l(boolean z10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 3, new androidx.compose.animation.k(aVarH0, z10));
    }

    public final b.a l0() {
        return i0(this.f44685e.f44695f);
    }

    @Override // g1.v.c
    public final void m(r rVar) {
        m0(h0(), 14, new B6.a());
    }

    public final void m0(b.a aVar, int i10, j.a<b> aVar2) {
        this.f44686f.put(i10, aVar);
        this.f44687g.e(i10, aVar2);
    }

    @Override // g1.v.c
    public final void n(ExoPlaybackException exoPlaybackException) {
        h.b bVar;
        b.a aVarH0 = (exoPlaybackException == null || (bVar = exoPlaybackException.mediaPeriodId) == null) ? h0() : i0(bVar);
        m0(aVarH0, 10, new androidx.compose.animation.k(aVarH0, exoPlaybackException));
    }

    @Override // g1.v.c
    public final void o(int i10, boolean z10) {
        m0(h0(), 5, new com.google.gson.internal.b());
    }

    @Override // g1.v.c
    public final void p(int i10) {
        b.a aVarL0 = l0();
        m0(aVarL0, 21, new B7.b(aVarL0, i10));
    }

    @Override // g1.v.c
    public final void q(int i10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 4, new C1251w(aVarH0, i10));
    }

    @Override // p162n1.a
    public final void r(p175o1.k kVar) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1032, new C4.a(aVarL0, kVar));
    }

    @Override // w1.c.a
    public final void s(final int i10, final long j, final long j10) {
        a aVar = this.f44685e;
        final b.a aVarI0 = i0(aVar.f44691b.isEmpty() ? null : (h.b) L4.b.d(aVar.f44691b));
        m0(aVarI0, 1006, new j.a(i10, j, j10) { // from class: n1.e

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f44680c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f44681d;

            @Override // j1.j.a
            public final void invoke(Object obj) {
                ((b) obj).h(this.f44680c, this.f44681d, this.f44679b);
            }
        });
    }

    @Override // p162n1.a
    public final void t() {
        if (this.j) {
            return;
        }
        b.a aVarH0 = h0();
        this.j = true;
        m0(aVarH0, -1, new D(aVarH0));
    }

    @Override // p162n1.a
    public final void u(String str) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1012, new D(aVarL0, str));
    }

    @Override // p162n1.a
    public final void v(String str, long j, long j10) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1008, new J4.i(aVarL0, str, j10, j));
    }

    @Override // g1.v.c
    public final void w(boolean z10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 9, new C0575j(aVarH0, z10));
    }

    @Override // g1.v.c
    public final void x(v.a aVar) {
        b.a aVarH0 = h0();
        m0(aVarH0, 13, new C4.v(aVarH0, aVar));
    }

    @Override // p162n1.a
    public final void y(int i10, int i11, boolean z10) {
        b.a aVarL0 = l0();
        m0(aVarL0, 1033, new C0936h(aVarL0, i10, i11, z10));
    }

    @Override // g1.v.c
    public final void z(p078g1.p pVar, int i10) {
        b.a aVarH0 = h0();
        m0(aVarH0, 1, new s(aVarH0, pVar, i10));
    }

    @Override // g1.v.c
    public final void M() {
    }

    @Override // g1.v.c
    public final void Y(v.b bVar) {
    }
}
