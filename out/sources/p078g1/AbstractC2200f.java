package p078g1;

import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.P;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.h0;
import androidx.media3.exoplayer.l0;
import androidx.media3.exoplayer.source.h;
import java.util.ArrayList;
import java.util.List;
import p114j1.A;
import p235t1.s;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2200f implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x.c f35247a = new x.c();

    @Override // p078g1.v
    public final boolean B() {
        K k10 = (K) this;
        x xVarR = k10.R();
        return !xVarR.p() && xVarR.m(k10.K(), this.f35247a, 0L).f35483g;
    }

    @Override // p078g1.v
    public final boolean E() {
        int iE;
        K k10 = (K) this;
        x xVarR = k10.R();
        if (xVarR.p()) {
            iE = -1;
        } else {
            int iK = k10.K();
            k10.B0();
            int i10 = k10.f17994G;
            if (i10 == 1) {
                i10 = 0;
            }
            k10.B0();
            iE = xVarR.e(iK, i10, k10.f17995H);
        }
        return iE != -1;
    }

    @Override // p078g1.v
    public final boolean F() {
        K k10 = (K) this;
        return k10.C() == 3 && k10.j() && k10.P() == 0;
    }

    @Override // p078g1.v
    public final void I() {
        K k10 = (K) this;
        k10.B0();
        k10.y0(1, true);
    }

    @Override // p078g1.v
    public final boolean L(int i10) {
        K k10 = (K) this;
        k10.B0();
        return k10.f18002O.f35455a.f35273a.get(i10);
    }

    @Override // p078g1.v
    public final boolean O() {
        K k10 = (K) this;
        x xVarR = k10.R();
        return !xVarR.p() && xVarR.m(k10.K(), this.f35247a, 0L).f35484h;
    }

    @Override // p078g1.v
    public final void W() {
        int iE;
        K k10 = (K) this;
        if (k10.R().p() || k10.f()) {
            e0();
            return;
        }
        if (!E()) {
            if (d0() && O()) {
                f0(k10.K(), -9223372036854775807L, false);
                return;
            } else {
                e0();
                return;
            }
        }
        x xVarR = k10.R();
        if (xVarR.p()) {
            iE = -1;
        } else {
            int iK = k10.K();
            k10.B0();
            int i10 = k10.f17994G;
            if (i10 == 1) {
                i10 = 0;
            }
            k10.B0();
            iE = xVarR.e(iK, i10, k10.f17995H);
        }
        if (iE == -1) {
            e0();
        } else if (iE == k10.K()) {
            f0(k10.K(), -9223372036854775807L, true);
        } else {
            f0(iE, -9223372036854775807L, false);
        }
    }

    @Override // p078g1.v
    public final void X() {
        K k10 = (K) this;
        k10.B0();
        g0(12, k10.f18043w);
    }

    @Override // p078g1.v
    public final void Z() {
        K k10 = (K) this;
        k10.B0();
        g0(11, -k10.f18042v);
    }

    @Override // p078g1.v
    public final void c() {
        K k10 = (K) this;
        k10.B0();
        k10.y0(1, false);
    }

    @Override // p078g1.v
    public final boolean d0() {
        K k10 = (K) this;
        x xVarR = k10.R();
        return !xVarR.p() && xVarR.m(k10.K(), this.f35247a, 0L).a();
    }

    public final void e0() {
        ((K) this).B0();
    }

    public abstract void f0(int i10, long j, boolean z10);

    public final void g0(int i10, long j) {
        long jL;
        K k10 = (K) this;
        long jB0 = k10.b0() + j;
        k10.B0();
        if (k10.f()) {
            h0 h0Var = k10.f18026g0;
            h.b bVar = h0Var.f18412b;
            Object obj = bVar.f18698a;
            x xVar = h0Var.f18411a;
            x.b bVar2 = k10.f18035o;
            xVar.g(obj, bVar2);
            jL = A.Q(bVar2.a(bVar.f18699b, bVar.f18700c));
        } else {
            jL = k10.l();
        }
        if (jL != -9223372036854775807L) {
            jB0 = Math.min(jB0, jL);
        }
        f0(k10.K(), Math.max(jB0, 0L), false);
    }

    public final void h0(List<p> list) {
        K k10 = (K) this;
        k10.B0();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(k10.f18038r.d(list.get(i10)));
        }
        k10.B0();
        k10.n0(k10.f18026g0);
        k10.b0();
        k10.f17996I++;
        ArrayList arrayList2 = k10.f18036p;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i11 = size - 1; i11 >= 0; i11--) {
                arrayList2.remove(i11);
            }
            k10.f18000M = k10.f18000M.b(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            g0.c cVar = new g0.c((h) arrayList.get(i12), k10.f18037q);
            arrayList3.add(cVar);
            arrayList2.add(i12, new K.c(cVar.f18395b, cVar.f18394a));
        }
        k10.f18000M = k10.f18000M.e(arrayList3.size());
        l0 l0Var = new l0(arrayList2, k10.f18000M);
        boolean zP = l0Var.p();
        int i13 = l0Var.f18478e;
        if (!zP && -1 >= i13) {
            throw new IllegalSeekPositionException(l0Var);
        }
        int iA = l0Var.a(k10.f17995H);
        h0 h0VarQ0 = k10.q0(k10.f18026g0, l0Var, k10.r0(l0Var, iA, -9223372036854775807L));
        int i14 = h0VarQ0.f18415e;
        if (iA != -1 && i14 != 1) {
            i14 = (l0Var.p() || iA >= i13) ? 4 : 2;
        }
        h0 h0VarP0 = K.p0(h0VarQ0, i14);
        long jF = A.F(-9223372036854775807L);
        s sVar = k10.f18000M;
        P p10 = k10.f18032l;
        p10.getClass();
        p10.f18097i.k(17, new P.b(arrayList3, sVar, iA, jF)).b();
        k10.z0(h0VarP0, 0, (k10.f18026g0.f18412b.f18698a.equals(h0VarP0.f18412b.f18698a) || k10.f18026g0.f18411a.p()) ? false : true, 4, k10.m0(h0VarP0), -1, false);
    }

    @Override // p078g1.v
    public final void i(int i10, long j) {
        f0(i10, j, false);
    }

    @Override // p078g1.v
    public final long l() {
        K k10 = (K) this;
        x xVarR = k10.R();
        if (xVarR.p()) {
            return -9223372036854775807L;
        }
        return A.Q(xVarR.m(k10.K(), this.f35247a, 0L).f35487l);
    }

    @Override // p078g1.v
    public final void p() {
        f0(((K) this).K(), -9223372036854775807L, false);
    }

    @Override // p078g1.v
    public final boolean q() {
        int iK;
        K k10 = (K) this;
        x xVarR = k10.R();
        if (xVarR.p()) {
            iK = -1;
        } else {
            int iK2 = k10.K();
            k10.B0();
            int i10 = k10.f17994G;
            if (i10 == 1) {
                i10 = 0;
            }
            k10.B0();
            iK = xVarR.k(iK2, i10, k10.f17995H);
        }
        return iK != -1;
    }

    @Override // p078g1.v
    public final void t(long j) {
        f0(((K) this).K(), j, false);
    }

    @Override // p078g1.v
    public final void w() {
        int iK;
        int iK2;
        K k10 = (K) this;
        if (k10.R().p() || k10.f()) {
            e0();
            return;
        }
        boolean zQ = q();
        if (d0() && !B()) {
            if (!zQ) {
                e0();
                return;
            }
            x xVarR = k10.R();
            if (xVarR.p()) {
                iK2 = -1;
            } else {
                int iK3 = k10.K();
                k10.B0();
                int i10 = k10.f17994G;
                if (i10 == 1) {
                    i10 = 0;
                }
                k10.B0();
                iK2 = xVarR.k(iK3, i10, k10.f17995H);
            }
            if (iK2 == -1) {
                e0();
                return;
            } else if (iK2 == k10.K()) {
                f0(k10.K(), -9223372036854775807L, true);
                return;
            } else {
                f0(iK2, -9223372036854775807L, false);
                return;
            }
        }
        if (zQ) {
            long jB0 = k10.b0();
            k10.B0();
            if (jB0 <= k10.f18044x) {
                x xVarR2 = k10.R();
                if (xVarR2.p()) {
                    iK = -1;
                } else {
                    int iK4 = k10.K();
                    k10.B0();
                    int i11 = k10.f17994G;
                    if (i11 == 1) {
                        i11 = 0;
                    }
                    k10.B0();
                    iK = xVarR2.k(iK4, i11, k10.f17995H);
                }
                if (iK == -1) {
                    e0();
                    return;
                } else if (iK == k10.K()) {
                    f0(k10.K(), -9223372036854775807L, true);
                    return;
                } else {
                    f0(iK, -9223372036854775807L, false);
                    return;
                }
            }
        }
        f0(k10.K(), 0L, false);
    }

    @Override // p078g1.v
    public final void x(int i10) {
        f0(i10, -9223372036854775807L, false);
    }
}
