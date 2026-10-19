package androidx.media3.exoplayer;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p078g1.C2196b;

/* JADX INFO: compiled from: MediaPeriodQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p162n1.a f18178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p114j1.g f18179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1401t f18180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExoPlayer.c f18184i;
    public V j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V f18185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f18186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public V f18187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public V f18188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f18190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f18191q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1.x.b f18176a = new g1.x.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1.x.c f18177b = new g1.x.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f18192r = new ArrayList();

    public Y(p162n1.a aVar, p114j1.g gVar, C1401t c1401t, ExoPlayer.c cVar) {
        this.f18178c = aVar;
        this.f18179d = gVar;
        this.f18180e = c1401t;
        this.f18184i = cVar;
    }

    public static androidx.media3.exoplayer.source.h.b p(p078g1.x xVar, Object obj, long j, long j10, g1.x.c cVar, g1.x.b bVar) {
        xVar.g(obj, bVar);
        xVar.n(bVar.f35470c, cVar);
        xVar.b(obj);
        int i10 = bVar.f35474g.f35235a;
        if (i10 != 0) {
            if (i10 == 1) {
                bVar.f(0);
            }
            bVar.f35474g.getClass();
            bVar.g(0);
        }
        xVar.g(obj, bVar);
        int iC = bVar.c(j);
        return iC == -1 ? new androidx.media3.exoplayer.source.h.b(bVar.b(j), j10, obj) : new androidx.media3.exoplayer.source.h.b(obj, iC, bVar.e(iC), j10, -1);
    }

    public final V a() {
        V v10 = this.j;
        if (v10 == null) {
            return null;
        }
        if (v10 == this.f18185k) {
            this.f18185k = v10.f18159m;
        }
        if (v10 == this.f18186l) {
            this.f18186l = v10.f18159m;
        }
        v10.i();
        int i10 = this.f18189o - 1;
        this.f18189o = i10;
        if (i10 == 0) {
            this.f18187m = null;
            V v11 = this.j;
            this.f18190p = v11.f18149b;
            this.f18191q = v11.f18154g.f18163a.f18701d;
        }
        this.j = this.j.f18159m;
        l();
        return this.j;
    }

    public final void b() {
        if (this.f18189o == 0) {
            return;
        }
        V v10 = this.j;
        p241t7.b.l(v10);
        this.f18190p = v10.f18149b;
        this.f18191q = v10.f18154g.f18163a.f18701d;
        while (v10 != null) {
            v10.i();
            v10 = v10.f18159m;
        }
        this.j = null;
        this.f18187m = null;
        this.f18185k = null;
        this.f18186l = null;
        this.f18189o = 0;
        l();
    }

    public final W c(p078g1.x xVar, V v10, long j) {
        W wF;
        long j10;
        W w3 = v10.f18154g;
        long j11 = (v10.f18162p + w3.f18167e) - j;
        if (!w3.f18170h) {
            androidx.media3.exoplayer.source.h.b bVar = w3.f18163a;
            Object obj = bVar.f18698a;
            g1.x.b bVar2 = this.f18176a;
            xVar.g(obj, bVar2);
            boolean zB = bVar.b();
            Object obj2 = bVar.f18698a;
            boolean z10 = w3.f18169g;
            if (zB) {
                C2196b c2196b = bVar2.f35474g;
                int i10 = bVar.f18699b;
                int i11 = c2196b.a(i10).f35237a;
                if (i11 != -1) {
                    int iA = bVar2.f35474g.a(i10).a(bVar.f18700c);
                    if (iA < i11) {
                        wF = e(xVar, bVar.f18698a, i10, iA, w3.f18165c, bVar.f18701d, z10);
                    } else {
                        long jLongValue = w3.f18165c;
                        if (jLongValue == -9223372036854775807L) {
                            Pair<Object, Long> pairJ = xVar.j(this.f18177b, bVar2, bVar2.f35470c, -9223372036854775807L, Math.max(0L, j11));
                            if (pairJ != null) {
                                jLongValue = ((Long) pairJ.second).longValue();
                            }
                        }
                        xVar.g(obj2, bVar2);
                        int i12 = bVar.f18699b;
                        bVar2.d(i12);
                        bVar2.f35474g.a(i12).getClass();
                        wF = f(xVar, bVar.f18698a, Math.max(0L, jLongValue), w3.f18165c, bVar.f18701d, z10);
                    }
                }
            } else {
                int i13 = bVar.f18702e;
                if (i13 != -1) {
                    bVar2.f(i13);
                }
                int iE = bVar2.e(i13);
                bVar2.g(i13);
                if (iE != bVar2.f35474g.a(i13).f35237a) {
                    wF = e(xVar, bVar.f18698a, bVar.f18702e, iE, w3.f18167e, bVar.f18701d, z10);
                } else {
                    xVar.g(obj2, bVar2);
                    bVar2.d(i13);
                    bVar2.f35474g.a(i13).getClass();
                    wF = f(xVar, bVar.f18698a, 0L, w3.f18167e, bVar.f18701d, false);
                }
            }
            return wF;
        }
        W w10 = v10.f18154g;
        androidx.media3.exoplayer.source.h.b bVar3 = w10.f18163a;
        int iD = xVar.d(xVar.b(bVar3.f18698a), this.f18176a, this.f18177b, this.f18182g, this.f18183h);
        if (iD != -1) {
            g1.x.b bVar4 = this.f18176a;
            int i14 = xVar.f(iD, bVar4, true).f35470c;
            Object obj3 = bVar4.f35469b;
            obj3.getClass();
            long jR = bVar3.f18701d;
            long j12 = 0;
            if (xVar.m(i14, this.f18177b, 0L).f35488m == iD) {
                Pair<Object, Long> pairJ2 = xVar.j(this.f18177b, this.f18176a, i14, -9223372036854775807L, Math.max(0L, j11));
                if (pairJ2 != null) {
                    obj3 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    V v11 = v10.f18159m;
                    if (v11 == null || !v11.f18149b.equals(obj3)) {
                        jR = r(obj3);
                        if (jR == -1) {
                            jR = this.f18181f;
                            this.f18181f = 1 + jR;
                        }
                    } else {
                        jR = v11.f18154g.f18163a.f18701d;
                    }
                    j10 = jLongValue2;
                    j12 = -9223372036854775807L;
                }
            } else {
                j10 = 0;
            }
            androidx.media3.exoplayer.source.h.b bVarP = p(xVar, obj3, j10, jR, this.f18177b, this.f18176a);
            if (j12 != -9223372036854775807L && w10.f18165c != -9223372036854775807L) {
                int i15 = xVar.g(bVar3.f18698a, bVar4).f35474g.f35235a;
                bVar4.f35474g.getClass();
                if (i15 > 0) {
                    bVar4.g(0);
                }
            }
            return d(xVar, bVarP, j12, j10);
        }
        return null;
    }

    public final W d(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar, long j, long j10) {
        xVar.g(bVar.f18698a, this.f18176a);
        if (bVar.b()) {
            return e(xVar, bVar.f18698a, bVar.f18699b, bVar.f18700c, j, bVar.f18701d, false);
        }
        return f(xVar, bVar.f18698a, j10, j, bVar.f18701d, false);
    }

    public final W e(p078g1.x xVar, Object obj, int i10, int i11, long j, long j10, boolean z10) {
        androidx.media3.exoplayer.source.h.b bVar = new androidx.media3.exoplayer.source.h.b(obj, i10, i11, j10, -1);
        g1.x.b bVar2 = this.f18176a;
        long jA = xVar.g(obj, bVar2).a(i10, i11);
        if (i11 == bVar2.e(i10)) {
            bVar2.f35474g.getClass();
        }
        bVar2.g(i10);
        return new W(bVar, (jA == -9223372036854775807L || 0 < jA) ? 0L : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, z10, false, false, false, false);
    }

    public final W f(p078g1.x xVar, Object obj, long j, long j10, long j11, boolean z10) {
        long j12;
        g1.x.b bVar = this.f18176a;
        xVar.g(obj, bVar);
        int iB = bVar.b(j);
        if (iB != -1) {
            bVar.f(iB);
        }
        boolean z11 = false;
        if (iB != -1) {
            bVar.g(iB);
        } else if (bVar.f35474g.f35235a > 0) {
            bVar.g(0);
        }
        androidx.media3.exoplayer.source.h.b bVar2 = new androidx.media3.exoplayer.source.h.b(iB, j11, obj);
        if (!bVar2.b() && iB == -1) {
            z11 = true;
        }
        boolean zJ = j(xVar, bVar2);
        boolean zI = i(xVar, bVar2, z11);
        if (iB != -1) {
            bVar.g(iB);
        }
        if (iB != -1) {
            bVar.d(iB);
            j12 = 0;
        } else {
            j12 = -9223372036854775807L;
        }
        long j13 = (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? bVar.f35471d : j12;
        return new W(bVar2, (j13 == -9223372036854775807L || j < j13) ? j : Math.max(0L, j13 - ((long) 1)), j10, j12, j13, z10, false, z11, zJ, zI);
    }

    public final V g() {
        return this.f18186l;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    public final W h(p078g1.x xVar, W w3) {
        long j;
        long jA;
        long j10;
        androidx.media3.exoplayer.source.h.b bVar = w3.f18163a;
        boolean zB = bVar.b();
        int i10 = bVar.f18702e;
        boolean z10 = !zB && i10 == -1;
        boolean zJ = j(xVar, bVar);
        boolean zI = i(xVar, bVar, z10);
        Object obj = bVar.f18698a;
        g1.x.b bVar2 = this.f18176a;
        xVar.g(obj, bVar2);
        if (bVar.b() || i10 == -1) {
            j = -9223372036854775807L;
        } else {
            bVar2.d(i10);
            j = 0;
        }
        boolean zB2 = bVar.b();
        int i11 = bVar.f18699b;
        if (!zB2) {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                jA = bVar2.f35471d;
            } else {
                j10 = j;
            }
            if (bVar.b()) {
                bVar2.g(i11);
            } else if (i10 != -1) {
                bVar2.g(i10);
            }
            return new W(bVar, w3.f18164b, w3.f18165c, j, j10, w3.f18168f, false, z10, zJ, zI);
        }
        jA = bVar2.a(i11, bVar.f18700c);
        j10 = jA;
        if (bVar.b()) {
            bVar2.g(i11);
        } else if (i10 != -1) {
            bVar2.g(i10);
        }
        return new W(bVar, w3.f18164b, w3.f18165c, j, j10, w3.f18168f, false, z10, zJ, zI);
    }

    public final boolean i(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar, boolean z10) {
        int iB = xVar.b(bVar.f18698a);
        if (xVar.m(xVar.f(iB, this.f18176a, false).f35470c, this.f18177b, 0L).f35484h) {
            return false;
        }
        return xVar.d(iB, this.f18176a, this.f18177b, this.f18182g, this.f18183h) == -1 && z10;
    }

    public final boolean j(p078g1.x xVar, androidx.media3.exoplayer.source.h.b bVar) {
        if (!(!bVar.b() && bVar.f18702e == -1)) {
            return false;
        }
        Object obj = bVar.f18698a;
        return xVar.m(xVar.g(obj, this.f18176a).f35470c, this.f18177b, 0L).f35489n == xVar.b(obj);
    }

    public final void k() {
        V v10 = this.f18188n;
        if (v10 == null || v10.h()) {
            this.f18188n = null;
            for (int i10 = 0; i10 < this.f18192r.size(); i10++) {
                V v11 = (V) this.f18192r.get(i10);
                if (!v11.h()) {
                    this.f18188n = v11;
                    return;
                }
            }
        }
    }

    public final void l() {
        ImmutableList.b bVar = ImmutableList.f27874c;
        ImmutableList.a aVar = new ImmutableList.a();
        for (V v10 = this.j; v10 != null; v10 = v10.f18159m) {
            aVar.c(v10.f18154g.f18163a);
        }
        V v11 = this.f18185k;
        this.f18179d.e(new X(this, aVar, v11 == null ? null : v11.f18154g.f18163a, 0));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.exoplayer.source.m, java.lang.Object] */
    public final void m(long j) {
        V v10 = this.f18187m;
        if (v10 != null) {
            p241t7.b.k(v10.f18159m == null);
            if (v10.f18152e) {
                v10.f18148a.s(j - v10.f18162p);
            }
        }
    }

    public final void n(ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f18192r.size(); i10++) {
            ((V) this.f18192r.get(i10)).i();
        }
        this.f18192r = arrayList;
        this.f18188n = null;
        k();
    }

    public final int o(V v10) {
        p241t7.b.l(v10);
        int i10 = 0;
        if (v10.equals(this.f18187m)) {
            return 0;
        }
        this.f18187m = v10;
        while (true) {
            v10 = v10.f18159m;
            if (v10 == null) {
                break;
            }
            if (v10 == this.f18185k) {
                V v11 = this.j;
                this.f18185k = v11;
                this.f18186l = v11;
                i10 = 3;
            }
            if (v10 == this.f18186l) {
                this.f18186l = this.f18185k;
                i10 |= 2;
            }
            v10.i();
            this.f18189o--;
        }
        V v12 = this.f18187m;
        v12.getClass();
        if (v12.f18159m != null) {
            v12.b();
            v12.f18159m = null;
            v12.c();
        }
        l();
        return i10;
    }

    public final androidx.media3.exoplayer.source.h.b q(p078g1.x xVar, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        g1.x.b bVar = this.f18176a;
        int i10 = xVar.g(obj2, bVar).f35470c;
        Object obj3 = this.f18190p;
        if (obj3 == null || (iB = xVar.b(obj3)) == -1 || xVar.f(iB, bVar, false).f35470c != i10) {
            V v10 = this.j;
            while (true) {
                if (v10 == null) {
                    V v11 = this.j;
                    while (true) {
                        if (v11 == null) {
                            jR = r(obj2);
                            if (jR != -1) {
                                break;
                            }
                            jR = this.f18181f;
                            this.f18181f = 1 + jR;
                            if (this.j != null) {
                                break;
                            }
                            this.f18190p = obj2;
                            this.f18191q = jR;
                            break;
                        }
                        int iB2 = xVar.b(v11.f18149b);
                        if (iB2 != -1 && xVar.f(iB2, bVar, false).f35470c == i10) {
                            jR = v11.f18154g.f18163a.f18701d;
                            break;
                        }
                        v11 = v11.f18159m;
                    }
                } else {
                    if (v10.f18149b.equals(obj2)) {
                        jR = v10.f18154g.f18163a.f18701d;
                        break;
                    }
                    v10 = v10.f18159m;
                }
            }
        } else {
            jR = this.f18191q;
        }
        long j10 = jR;
        xVar.g(obj2, bVar);
        int i11 = bVar.f35470c;
        g1.x.c cVar = this.f18177b;
        xVar.n(i11, cVar);
        boolean z10 = false;
        for (int iB3 = xVar.b(obj); iB3 >= cVar.f35488m; iB3--) {
            xVar.f(iB3, bVar, true);
            boolean z11 = bVar.f35474g.f35235a > 0;
            z10 |= z11;
            if (bVar.c(bVar.f35471d) != -1) {
                obj2 = bVar.f35469b;
                obj2.getClass();
            }
            if (z10 && (!z11 || bVar.f35471d != 0)) {
                break;
            }
        }
        return p(xVar, obj2, j, j10, this.f18177b, this.f18176a);
    }

    public final long r(Object obj) {
        for (int i10 = 0; i10 < this.f18192r.size(); i10++) {
            V v10 = (V) this.f18192r.get(i10);
            if (v10.f18149b.equals(obj)) {
                return v10.f18154g.f18163a.f18701d;
            }
        }
        return -1L;
    }

    public final int s(p078g1.x xVar) {
        V v10;
        V v11 = this.j;
        if (v11 == null) {
            return 0;
        }
        int iB = xVar.b(v11.f18149b);
        while (true) {
            iB = xVar.d(iB, this.f18176a, this.f18177b, this.f18182g, this.f18183h);
            while (true) {
                v11.getClass();
                v10 = v11.f18159m;
                if (v10 == null || v11.f18154g.f18170h) {
                    break;
                }
                v11 = v10;
            }
            if (iB == -1 || v10 == null || xVar.b(v10.f18149b) != iB) {
                break;
            }
            v11 = v10;
        }
        int iO = o(v11);
        v11.f18154g = h(xVar, v11.f18154g);
        return iO;
    }

    public final int t(p078g1.x xVar, long j, long j10, long j11) {
        W wH;
        V v10 = this.j;
        V v11 = null;
        while (true) {
            boolean z10 = false;
            if (v10 == null) {
                return 0;
            }
            W w3 = v10.f18154g;
            if (v11 == null) {
                wH = h(xVar, w3);
            } else {
                W wC = c(xVar, v11, j);
                if (wC == null || w3.f18164b != wC.f18164b || !w3.f18163a.equals(wC.f18163a)) {
                    return o(v11);
                }
                wH = wC;
            }
            v10.f18154g = wH.a(w3.f18165c);
            long j12 = w3.f18167e;
            if (j12 != -9223372036854775807L) {
                long j13 = wH.f18167e;
                if (j12 != j13) {
                    v10.k();
                    long j14 = j13 == -9223372036854775807L ? Long.MAX_VALUE : v10.f18162p + j13;
                    int i10 = (v10 != this.f18185k || v10.f18154g.f18169g || (j10 != Long.MIN_VALUE && j10 < j14)) ? 0 : 1;
                    if (v10 == this.f18186l && (j11 == Long.MIN_VALUE || j11 >= j14)) {
                        z10 = true;
                    }
                    int iO = o(v10);
                    if (iO != 0) {
                        return iO;
                    }
                    return z10 ? i10 | 2 : i10;
                }
            }
            v11 = v10;
            v10 = v10.f18159m;
        }
    }
}
