package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.T;
import androidx.media3.exoplayer.r0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import p078g1.y;
import p235t1.r;
import p235t1.w;
import p259v1.t;

/* JADX INFO: compiled from: MergingMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g, g.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g[] f18708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<r, Integer> f18709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q3.d f18710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<g> f18711e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<y, y> f18712f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g.a f18713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f18714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g[] f18715i;
    public p235t1.c j;

    /* JADX INFO: compiled from: MergingMediaPeriod.java */
    public static final class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f18716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f18717b;

        public a(t tVar, y yVar) {
            this.f18716a = tVar;
            this.f18717b = yVar;
        }

        @Override // p259v1.w
        public final y a() {
            return this.f18717b;
        }

        @Override // p259v1.t
        public final void b(boolean z10) {
            this.f18716a.b(z10);
        }

        @Override // p259v1.w
        public final p078g1.n c(int i10) {
            return this.f18717b.f35494d[this.f18716a.e(i10)];
        }

        @Override // p259v1.t
        public final void d() {
            this.f18716a.d();
        }

        @Override // p259v1.w
        public final int e(int i10) {
            return this.f18716a.e(i10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f18716a.equals(aVar.f18716a) && this.f18717b.equals(aVar.f18717b);
        }

        @Override // p259v1.t
        public final void f() {
            this.f18716a.f();
        }

        @Override // p259v1.t
        public final int g() {
            return this.f18716a.g();
        }

        @Override // p259v1.t
        public final p078g1.n h() {
            return this.f18717b.f35494d[this.f18716a.g()];
        }

        public final int hashCode() {
            return this.f18716a.hashCode() + ((this.f18717b.hashCode() + 527) * 31);
        }

        @Override // p259v1.t
        public final void i(float f10) {
            this.f18716a.i(f10);
        }

        @Override // p259v1.t
        public final void j() {
            this.f18716a.j();
        }

        @Override // p259v1.t
        public final void k() {
            this.f18716a.k();
        }

        @Override // p259v1.w
        public final int l(int i10) {
            return this.f18716a.l(i10);
        }

        @Override // p259v1.w
        public final int length() {
            return this.f18716a.length();
        }
    }

    public j(Q3.d dVar, long[] jArr, g... gVarArr) {
        this.f18710d = dVar;
        this.f18708b = gVarArr;
        dVar.getClass();
        this.j = new p235t1.c(ImmutableList.K(), ImmutableList.K());
        this.f18709c = new IdentityHashMap<>();
        this.f18715i = new g[0];
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            long j = jArr[i10];
            if (j != 0) {
                this.f18708b[i10] = new n(gVarArr[i10], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean a(T t8) {
        ArrayList<g> arrayList = this.f18711e;
        if (arrayList.isEmpty()) {
            return this.j.a(t8);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a(t8);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void b(g gVar) {
        ArrayList<g> arrayList = this.f18711e;
        arrayList.remove(gVar);
        if (arrayList.isEmpty()) {
            g[] gVarArr = this.f18708b;
            int i10 = 0;
            for (g gVar2 : gVarArr) {
                i10 += gVar2.n().f47102a;
            }
            y[] yVarArr = new y[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < gVarArr.length; i12++) {
                w wVarN = gVarArr[i12].n();
                int i13 = wVarN.f47102a;
                int i14 = 0;
                while (i14 < i13) {
                    y yVarA = wVarN.a(i14);
                    p078g1.n[] nVarArr = new p078g1.n[yVarA.f35491a];
                    for (int i15 = 0; i15 < yVarA.f35491a; i15++) {
                        p078g1.n nVar = yVarA.f35494d[i15];
                        g1.n.a aVarA = nVar.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i12);
                        sb2.append(":");
                        String str = nVar.f35290a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        aVarA.f35327a = sb2.toString();
                        nVarArr[i15] = new p078g1.n(aVarA);
                    }
                    y yVar = new y(i12 + ":" + yVarA.f35492b, nVarArr);
                    this.f18712f.put(yVar, yVarA);
                    yVarArr[i11] = yVar;
                    i14++;
                    i11++;
                }
            }
            this.f18714h = new w(yVarArr);
            g.a aVar = this.f18713g;
            aVar.getClass();
            aVar.b(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long c() {
        return this.j.c();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void d() throws IOException {
        for (g gVar : this.f18708b) {
            gVar.d();
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long e(long j, r0 r0Var) {
        g[] gVarArr = this.f18715i;
        return (gVarArr.length > 0 ? gVarArr[0] : this.f18708b[0]).e(j, r0Var);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(long j) {
        long jF = this.f18715i[0].f(j);
        int i10 = 1;
        while (true) {
            g[] gVarArr = this.f18715i;
            if (i10 >= gVarArr.length) {
                return jF;
            }
            if (gVarArr[i10].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // androidx.media3.exoplayer.source.m.a
    public final void g(m mVar) {
        g.a aVar = this.f18713g;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // androidx.media3.exoplayer.source.m
    public final boolean i() {
        return this.j.i();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long k() {
        long j = -9223372036854775807L;
        for (g gVar : this.f18715i) {
            long jK = gVar.k();
            if (jK == -9223372036854775807L) {
                if (j != -9223372036854775807L && gVar.f(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (g gVar2 : this.f18715i) {
                    if (gVar2 == gVar) {
                        break;
                    }
                    if (gVar2.f(jK) != jK) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jK;
            } else if (jK != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long l(t[] tVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j) {
        IdentityHashMap<r, Integer> identityHashMap;
        int[] iArr = new int[tVarArr.length];
        int[] iArr2 = new int[tVarArr.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = tVarArr.length;
            identityHashMap = this.f18709c;
            if (i11 >= length) {
                break;
            }
            r rVar = rVarArr[i11];
            Integer num = rVar == null ? null : identityHashMap.get(rVar);
            iArr[i11] = num == null ? -1 : num.intValue();
            t tVar = tVarArr[i11];
            if (tVar != null) {
                String str = tVar.a().f35492b;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = tVarArr.length;
        r[] rVarArr2 = new r[length2];
        r[] rVarArr3 = new r[tVarArr.length];
        t[] tVarArr2 = new t[tVarArr.length];
        g[] gVarArr = this.f18708b;
        ArrayList arrayList = new ArrayList(gVarArr.length);
        long j10 = j;
        int i12 = 0;
        while (i12 < gVarArr.length) {
            int i13 = i10;
            while (i13 < tVarArr.length) {
                rVarArr3[i13] = iArr[i13] == i12 ? rVarArr[i13] : null;
                if (iArr2[i13] == i12) {
                    t tVar2 = tVarArr[i13];
                    tVar2.getClass();
                    y yVar = this.f18712f.get(tVar2.a());
                    yVar.getClass();
                    tVarArr2[i13] = new a(tVar2, yVar);
                } else {
                    tVarArr2[i13] = null;
                }
                i13++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            g[] gVarArr2 = gVarArr;
            t[] tVarArr3 = tVarArr2;
            long jL = gVarArr[i12].l(tVarArr2, zArr, rVarArr3, zArr2, j10);
            if (i14 == 0) {
                j10 = jL;
            } else if (jL != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < tVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    r rVar2 = rVarArr3[i15];
                    rVar2.getClass();
                    rVarArr2[i15] = rVarArr3[i15];
                    identityHashMap.put(rVar2, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    p241t7.b.k(rVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(gVarArr2[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            gVarArr = gVarArr2;
            tVarArr2 = tVarArr3;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(rVarArr2, i16, rVarArr, i16, length2);
        this.f18715i = (g[]) arrayList3.toArray(new g[i16]);
        AbstractList abstractListB = Lists.b(arrayList3, new A8.f(10));
        this.f18710d.getClass();
        this.j = new p235t1.c(arrayList3, abstractListB);
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void m(g.a aVar, long j) {
        this.f18713g = aVar;
        ArrayList<g> arrayList = this.f18711e;
        g[] gVarArr = this.f18708b;
        Collections.addAll(arrayList, gVarArr);
        for (g gVar : gVarArr) {
            gVar.m(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final w n() {
        w wVar = this.f18714h;
        wVar.getClass();
        return wVar;
    }

    @Override // androidx.media3.exoplayer.source.m
    public final long q() {
        return this.j.q();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void r(long j, boolean z10) {
        for (g gVar : this.f18715i) {
            gVar.r(j, z10);
        }
    }

    @Override // androidx.media3.exoplayer.source.m
    public final void s(long j) {
        this.j.s(j);
    }
}
