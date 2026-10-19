package androidx.media3.exoplayer.source;

import java.io.IOException;
import java.util.ArrayList;
import p078g1.C2196b;
import p078g1.x;
import p114j1.A;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaSource extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f18609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f18610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<androidx.media3.exoplayer.source.b> f18611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final x.c f18612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f18613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IllegalClippingException f18614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18616s;

    public static final class IllegalClippingException extends IOException {
        public final int reason;

        public IllegalClippingException(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i10, long j, long j10) {
            String str;
            StringBuilder sb2 = new StringBuilder("Illegal clipping: ");
            if (i10 != 0) {
                if (i10 == 1) {
                    str = "not seekable to start";
                } else if (i10 != 2) {
                    str = "unknown";
                } else {
                    p241t7.b.k((j == -9223372036854775807L || j10 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j10;
                }
            } else {
                str = "invalid period count";
            }
            sb2.append(str);
            super(sb2.toString());
            this.reason = i10;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f18617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f18619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f18620d;

        public a(h hVar) {
            hVar.getClass();
            this.f18617a = hVar;
            this.f18619c = true;
            this.f18618b = Long.MIN_VALUE;
        }
    }

    public static final class b extends p235t1.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f18622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f18624f;

        public b(x xVar, long j, long j10) throws IllegalClippingException {
            super(xVar);
            if (j10 != Long.MIN_VALUE && j10 < j) {
                throw new IllegalClippingException(2, j, j10);
            }
            boolean z10 = false;
            if (xVar.h() != 1) {
                throw new IllegalClippingException(0);
            }
            x.c cVarM = xVar.m(0, new x.c(), 0L);
            long jMax = Math.max(0L, j);
            if (!cVarM.j && jMax != 0 && !cVarM.f35483g) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j10 == Long.MIN_VALUE ? cVarM.f35487l : Math.max(0L, j10);
            long j11 = cVarM.f35487l;
            if (j11 != -9223372036854775807L) {
                jMax2 = jMax2 > j11 ? j11 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.f18621c = jMax;
            this.f18622d = jMax2;
            this.f18623e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (cVarM.f35484h && (jMax2 == -9223372036854775807L || (j11 != -9223372036854775807L && jMax2 == j11))) {
                z10 = true;
            }
            this.f18624f = z10;
        }

        @Override // p235t1.h, p078g1.x
        public final x.b f(int i10, x.b bVar, boolean z10) {
            this.f47017b.f(0, bVar, z10);
            long j = bVar.f35472e - this.f18621c;
            long j10 = this.f18623e;
            bVar.h(bVar.f35468a, bVar.f35469b, 0, j10 == -9223372036854775807L ? -9223372036854775807L : j10 - j, j, C2196b.f35233c, false);
            return bVar;
        }

        @Override // p235t1.h, p078g1.x
        public final x.c m(int i10, x.c cVar, long j) {
            this.f47017b.m(0, cVar, 0L);
            long j10 = cVar.f35490o;
            long j11 = this.f18621c;
            cVar.f35490o = j10 + j11;
            cVar.f35487l = this.f18623e;
            cVar.f35484h = this.f18624f;
            long j12 = cVar.f35486k;
            if (j12 != -9223372036854775807L) {
                long jMax = Math.max(j12, j11);
                cVar.f35486k = jMax;
                long j13 = this.f18622d;
                if (j13 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j13);
                }
                cVar.f35486k = jMax - j11;
            }
            long jQ = A.Q(j11);
            long j14 = cVar.f35480d;
            if (j14 != -9223372036854775807L) {
                cVar.f35480d = j14 + jQ;
            }
            long j15 = cVar.f35481e;
            if (j15 != -9223372036854775807L) {
                cVar.f35481e = j15 + jQ;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(a aVar) {
        super(aVar.f18617a);
        this.f18609l = aVar.f18618b;
        this.f18610m = aVar.f18619c;
        this.f18611n = new ArrayList<>();
        this.f18612o = new x.c();
    }

    @Override // androidx.media3.exoplayer.source.o
    public final void A(x xVar) {
        if (this.f18614q != null) {
            return;
        }
        D(xVar);
    }

    public final void D(x xVar) {
        long j;
        x.c cVar = this.f18612o;
        xVar.n(0, cVar);
        long j10 = cVar.f35490o;
        b bVar = this.f18613p;
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.f18611n;
        long j11 = this.f18609l;
        if (bVar == null || arrayList.isEmpty()) {
            this.f18615r = j10;
            this.f18616s = j11 != Long.MIN_VALUE ? j10 + j11 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.media3.exoplayer.source.b bVar2 = arrayList.get(i10);
                long j12 = this.f18615r;
                long j13 = this.f18616s;
                bVar2.f18648f = j12;
                bVar2.f18649g = j13;
            }
            j = 0;
        } else {
            long j14 = this.f18615r - j10;
            j11 = j11 != Long.MIN_VALUE ? this.f18616s - j10 : Long.MIN_VALUE;
            j = j14;
        }
        try {
            b bVar3 = new b(xVar, j, j11);
            this.f18613p = bVar3;
            s(bVar3);
        } catch (IllegalClippingException e10) {
            this.f18614q = e10;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList.get(i11).f18650h = this.f18614q;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.h
    public final g g(h.b bVar, p272w1.d dVar, long j) {
        androidx.media3.exoplayer.source.b bVar2 = new androidx.media3.exoplayer.source.b(this.f18803k.g(bVar, dVar, j), this.f18610m, this.f18615r, this.f18616s);
        this.f18611n.add(bVar2);
        return bVar2;
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.h
    public final void i() throws IOException {
        IllegalClippingException illegalClippingException = this.f18614q;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.i();
    }

    @Override // androidx.media3.exoplayer.source.h
    public final void o(g gVar) {
        ArrayList<androidx.media3.exoplayer.source.b> arrayList = this.f18611n;
        p241t7.b.k(arrayList.remove(gVar));
        this.f18803k.o(((androidx.media3.exoplayer.source.b) gVar).f18644b);
        if (arrayList.isEmpty()) {
            b bVar = this.f18613p;
            bVar.getClass();
            D(bVar.f47017b);
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void t() {
        super.t();
        this.f18614q = null;
        this.f18613p = null;
    }
}
