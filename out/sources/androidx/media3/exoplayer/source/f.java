package androidx.media3.exoplayer.source;

import android.util.Pair;
import java.util.Objects;
import p078g1.C2196b;
import p078g1.p;
import p078g1.x;
import p235t1.v;

/* JADX INFO: compiled from: MaskingMediaSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x.c f18687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x.b f18688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f18689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f18690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18693s;

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class a extends p235t1.h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f18694e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f18695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f18696d;

        public a(x xVar, Object obj, Object obj2) {
            super(xVar);
            this.f18695c = obj;
            this.f18696d = obj2;
        }

        @Override // p235t1.h, p078g1.x
        public final int b(Object obj) {
            Object obj2;
            if (f18694e.equals(obj) && (obj2 = this.f18696d) != null) {
                obj = obj2;
            }
            return this.f47017b.b(obj);
        }

        @Override // p235t1.h, p078g1.x
        public final x.b f(int i10, x.b bVar, boolean z10) {
            this.f47017b.f(i10, bVar, z10);
            if (Objects.equals(bVar.f35469b, this.f18696d) && z10) {
                bVar.f35469b = f18694e;
            }
            return bVar;
        }

        @Override // p235t1.h, p078g1.x
        public final Object l(int i10) {
            Object objL = this.f47017b.l(i10);
            return Objects.equals(objL, this.f18696d) ? f18694e : objL;
        }

        @Override // p235t1.h, p078g1.x
        public final x.c m(int i10, x.c cVar, long j) {
            this.f47017b.m(i10, cVar, j);
            if (Objects.equals(cVar.f35477a, this.f18695c)) {
                cVar.f35477a = x.c.f35475p;
            }
            return cVar;
        }
    }

    /* JADX INFO: compiled from: MaskingMediaSource.java */
    public static final class b extends x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f18697b;

        public b(p pVar) {
            this.f18697b = pVar;
        }

        @Override // p078g1.x
        public final int b(Object obj) {
            return obj == a.f18694e ? 0 : -1;
        }

        @Override // p078g1.x
        public final x.b f(int i10, x.b bVar, boolean z10) {
            bVar.h(z10 ? 0 : null, z10 ? a.f18694e : null, 0, -9223372036854775807L, 0L, C2196b.f35233c, true);
            return bVar;
        }

        @Override // p078g1.x
        public final int h() {
            return 1;
        }

        @Override // p078g1.x
        public final Object l(int i10) {
            return a.f18694e;
        }

        @Override // p078g1.x
        public final x.c m(int i10, x.c cVar, long j) {
            Object obj = x.c.f35475p;
            cVar.b(this.f18697b, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L);
            cVar.j = true;
            return cVar;
        }

        @Override // p078g1.x
        public final int o() {
            return 1;
        }
    }

    public f(h hVar, boolean z10) {
        super(hVar);
        this.f18686l = z10 && hVar.j();
        this.f18687m = new x.c();
        this.f18688n = new x.b();
        x xVarK = hVar.k();
        if (xVarK == null) {
            this.f18689o = new a(new b(hVar.h()), x.c.f35475p, a.f18694e);
        } else {
            this.f18689o = new a(xVarK, null, null);
            this.f18693s = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.o
    public final void A(x xVar) {
        long j;
        a aVar;
        h.b bVarA;
        a aVar2;
        if (this.f18692r) {
            a aVar3 = this.f18689o;
            this.f18689o = new a(xVar, aVar3.f18695c, aVar3.f18696d);
            e eVar = this.f18690p;
            if (eVar != null) {
                E(eVar.f18685i);
            }
        } else {
            if (!xVar.p()) {
                x.c cVar = this.f18687m;
                xVar.n(0, cVar);
                long j10 = cVar.f35486k;
                Object obj = cVar.f35477a;
                e eVar2 = this.f18690p;
                if (eVar2 != null) {
                    a aVar4 = this.f18689o;
                    Object obj2 = eVar2.f18678b.f18698a;
                    x.b bVar = this.f18688n;
                    aVar4.g(obj2, bVar);
                    long j11 = bVar.f35472e + eVar2.f18679c;
                    this.f18689o.m(0, cVar, 0L);
                    if (j11 != cVar.f35486k) {
                        j = j11;
                    } else {
                        j = j10;
                    }
                } else {
                    j = j10;
                }
                Pair<Object, Long> pairI = xVar.i(this.f18687m, this.f18688n, 0, j);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.f18693s) {
                    a aVar5 = this.f18689o;
                    aVar = new a(xVar, aVar5.f18695c, aVar5.f18696d);
                } else {
                    aVar = new a(xVar, obj, obj3);
                }
                this.f18689o = aVar;
                e eVar3 = this.f18690p;
                if (eVar3 != null && E(jLongValue)) {
                    h.b bVar2 = eVar3.f18678b;
                    Object obj4 = this.f18689o.f18696d;
                    Object obj5 = bVar2.f18698a;
                    if (obj4 != null && obj5.equals(a.f18694e)) {
                        obj5 = this.f18689o.f18696d;
                    }
                    bVarA = bVar2.a(obj5);
                }
                this.f18693s = true;
                this.f18692r = true;
                s(this.f18689o);
                if (bVarA != null) {
                    e eVar4 = this.f18690p;
                    eVar4.getClass();
                    eVar4.h(bVarA);
                }
            }
            if (this.f18693s) {
                a aVar6 = this.f18689o;
                aVar2 = new a(xVar, aVar6.f18695c, aVar6.f18696d);
            } else {
                aVar2 = new a(xVar, x.c.f35475p, a.f18694e);
            }
            this.f18689o = aVar2;
        }
        bVarA = null;
        this.f18693s = true;
        this.f18692r = true;
        s(this.f18689o);
        if (bVarA != null) {
            e eVar5 = this.f18690p;
            eVar5.getClass();
            eVar5.h(bVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.o
    public final void C() {
        if (this.f18686l) {
            return;
        }
        this.f18691q = true;
        B();
    }

    @Override // androidx.media3.exoplayer.source.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final e g(h.b bVar, p272w1.d dVar, long j) {
        e eVar = new e(bVar, dVar, j);
        p241t7.b.k(eVar.f18681e == null);
        eVar.f18681e = this.f18803k;
        if (this.f18692r) {
            Object obj = this.f18689o.f18696d;
            Object obj2 = bVar.f18698a;
            if (obj != null && obj2.equals(a.f18694e)) {
                obj2 = this.f18689o.f18696d;
            }
            eVar.h(bVar.a(obj2));
        } else {
            this.f18690p = eVar;
            if (!this.f18691q) {
                this.f18691q = true;
                B();
            }
        }
        return eVar;
    }

    public final boolean E(long j) {
        e eVar = this.f18690p;
        int iB = this.f18689o.b(eVar.f18678b.f18698a);
        if (iB == -1) {
            return false;
        }
        a aVar = this.f18689o;
        x.b bVar = this.f18688n;
        aVar.f(iB, bVar, false);
        long j10 = bVar.f35471d;
        if (j10 != -9223372036854775807L && j >= j10) {
            j = Math.max(0L, j10 - 1);
        }
        eVar.f18685i = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.o, androidx.media3.exoplayer.source.h
    public final void l(p pVar) {
        if (this.f18693s) {
            a aVar = this.f18689o;
            this.f18689o = new a(new v(this.f18689o.f47017b, pVar), aVar.f18695c, aVar.f18696d);
        } else {
            this.f18689o = new a(new b(pVar), x.c.f35475p, a.f18694e);
        }
        this.f18803k.l(pVar);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void o(g gVar) {
        e eVar = (e) gVar;
        if (eVar.f18682f != null) {
            h hVar = eVar.f18681e;
            hVar.getClass();
            hVar.o(eVar.f18682f);
        }
        if (gVar == this.f18690p) {
            this.f18690p = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        this.f18692r = false;
        this.f18691q = false;
        super.t();
    }

    @Override // androidx.media3.exoplayer.source.o
    public final h.b z(h.b bVar) {
        Object obj = bVar.f18698a;
        Object obj2 = this.f18689o.f18696d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f18694e;
        }
        return bVar.a(obj);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.h
    public final void i() {
    }
}
