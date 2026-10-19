package androidx.compose.runtime.snapshots;

import androidx.collection.L;
import androidx.collection.V;
import androidx.compose.runtime.C1091i0;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public class a extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f13188n = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<Object, p293xa.r> f13189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.l<Object, p293xa.r> f13190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L<o> f13192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f13193i;
    public SnapshotIdSet j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f13194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13196m;

    public a(long j, SnapshotIdSet snapshotIdSet, Ia.l<Object, p293xa.r> lVar, Ia.l<Object, p293xa.r> lVar2) {
        super(j, snapshotIdSet);
        this.f13189e = lVar;
        this.f13190f = lVar2;
        this.j = SnapshotIdSet.f13147f;
        this.f13194k = f13188n;
        this.f13195l = 1;
    }

    public final void A(long j) {
        synchronized (SnapshotKt.f13154c) {
            this.j = this.j.A(j);
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public void B(L<o> l10) {
        this.f13192h = l10;
    }

    public a C(Ia.l<Object, p293xa.r> lVar, Ia.l<Object, p293xa.r> lVar2) {
        b bVar;
        if (this.f13206c) {
            C1091i0.a("Cannot use a disposed snapshot");
        }
        if (this.f13196m && this.f13207d < 0) {
            C1091i0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = SnapshotKt.f13154c;
        synchronized (obj) {
            long j = SnapshotKt.f13156e;
            SnapshotKt.f13156e = j + 1;
            SnapshotKt.f13155d = SnapshotKt.f13155d.A(j);
            SnapshotIdSet snapshotIdSetD = d();
            r(snapshotIdSetD.A(j));
            bVar = new b(j, SnapshotKt.e(snapshotIdSetD, g() + 1, j), SnapshotKt.l(lVar, e(), true), SnapshotKt.b(lVar2, i()), this);
        }
        if (!this.f13196m && !this.f13206c) {
            long jG = g();
            synchronized (obj) {
                long j10 = SnapshotKt.f13156e;
                SnapshotKt.f13156e = j10 + 1;
                s(j10);
                SnapshotKt.f13155d = SnapshotKt.f13155d.A(g());
                p293xa.r rVar = p293xa.r.f47939a;
            }
            r(SnapshotKt.e(d(), jG + 1, g()));
        }
        return bVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void b() {
        SnapshotKt.f13155d = SnapshotKt.f13155d.k(g()).e(this.j);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void c() {
        if (this.f13206c) {
            return;
        }
        super.c();
        l();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public int h() {
        return this.f13191g;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Ia.l<Object, p293xa.r> i() {
        return this.f13190f;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void k() {
        this.f13195l++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // androidx.compose.runtime.snapshots.g
    public void l() {
        if (this.f13195l <= 0) {
            C1091i0.a("no pending nested snapshots");
        }
        int i10 = this.f13195l - 1;
        this.f13195l = i10;
        if (i10 != 0 || this.f13196m) {
            return;
        }
        L<o> lX = x();
        if (lX != null) {
            if (this.f13196m) {
                C1091i0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long jG = g();
            Object[] objArr = lX.f9123b;
            long[] jArr = lX.f9122a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j = jArr[i11];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j) < 128) {
                                for (q qVarK = ((o) objArr[(i11 << 3) + i13]).k(); qVarK != null; qVarK = qVarK.f13226b) {
                                    long j10 = qVarK.f13225a;
                                    if (j10 == jG || kotlin.collections.q.J(this.j, Long.valueOf(j10))) {
                                        Ia.l<SnapshotIdSet, p293xa.r> lVar = SnapshotKt.f13152a;
                                        qVarK.f13225a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        a();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m() {
        if (this.f13196m || this.f13206c) {
            return;
        }
        v();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(o oVar) {
        L<o> lX = x();
        if (lX == null) {
            lX = V.a();
            B(lX);
        }
        lX.d(oVar);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public final void p() {
        int length = this.f13194k.length;
        for (int i10 = 0; i10 < length; i10++) {
            SnapshotKt.u(this.f13194k[i10]);
        }
        o();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void t(int i10) {
        this.f13191g = i10;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g u(Ia.l<Object, p293xa.r> lVar) {
        c cVar;
        if (this.f13206c) {
            C1091i0.a("Cannot use a disposed snapshot");
        }
        if (this.f13196m && this.f13207d < 0) {
            C1091i0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        boolean z10 = this instanceof GlobalSnapshot;
        A(g());
        Object obj = SnapshotKt.f13154c;
        synchronized (obj) {
            long j = SnapshotKt.f13156e;
            SnapshotKt.f13156e = j + 1;
            SnapshotKt.f13155d = SnapshotKt.f13155d.A(j);
            cVar = new c(j, SnapshotKt.e(d(), jG + 1, j), SnapshotKt.l(lVar, e(), true), this);
        }
        if (!this.f13196m && !this.f13206c) {
            long jG2 = g();
            synchronized (obj) {
                long j10 = SnapshotKt.f13156e;
                SnapshotKt.f13156e = j10 + 1;
                s(j10);
                SnapshotKt.f13155d = SnapshotKt.f13155d.A(g());
                p293xa.r rVar = p293xa.r.f47939a;
            }
            r(SnapshotKt.e(d(), jG2 + 1, g()));
        }
        return cVar;
    }

    public final void v() {
        A(g());
        p293xa.r rVar = p293xa.r.f47939a;
        if (this.f13196m || this.f13206c) {
            return;
        }
        long jG = g();
        synchronized (SnapshotKt.f13154c) {
            long j = SnapshotKt.f13156e;
            SnapshotKt.f13156e = j + 1;
            s(j);
            SnapshotKt.f13155d = SnapshotKt.f13155d.A(g());
        }
        r(SnapshotKt.e(d(), jG + 1, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public h w() {
        HashMap mapC;
        ?? r10;
        L<o> l10;
        int i10;
        long j;
        L<o> lX = x();
        if (lX != null) {
            long j10 = SnapshotKt.j.f13205b;
            mapC = SnapshotKt.c(j10, this, SnapshotKt.f13155d.k(j10));
        } else {
            mapC = null;
        }
        EmptyList emptyList = EmptyList.f42983b;
        synchronized (SnapshotKt.f13154c) {
            try {
                SnapshotKt.d(this);
                if (lX == null || lX.f9125d == 0) {
                    b();
                    GlobalSnapshot globalSnapshot = SnapshotKt.j;
                    L<o> l11 = globalSnapshot.f13192h;
                    SnapshotKt.v(globalSnapshot, SnapshotKt.f13152a);
                    if (l11 == null || !l11.c()) {
                        r10 = emptyList;
                        l10 = null;
                    } else {
                        r10 = SnapshotKt.f13159h;
                        l10 = l11;
                    }
                } else {
                    GlobalSnapshot globalSnapshot2 = SnapshotKt.j;
                    h hVarZ = z(SnapshotKt.f13156e, lX, mapC, SnapshotKt.f13155d.k(globalSnapshot2.f13205b));
                    if (!kotlin.jvm.internal.i.a(hVarZ, h.b.f13208a)) {
                        return hVarZ;
                    }
                    b();
                    l10 = globalSnapshot2.f13192h;
                    SnapshotKt.v(globalSnapshot2, SnapshotKt.f13152a);
                    B(null);
                    globalSnapshot2.f13192h = null;
                    r10 = SnapshotKt.f13159h;
                }
                p293xa.r rVar = p293xa.r.f47939a;
                this.f13196m = true;
                if (l10 != null) {
                    ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(l10);
                    if (!l10.b()) {
                        int size = ((Collection) r10).size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((Ia.p) r10.get(i11)).invoke(scatterSetWrapper, this);
                        }
                    }
                }
                if (lX != null && lX.c()) {
                    ScatterSetWrapper scatterSetWrapper2 = new ScatterSetWrapper(lX);
                    int size2 = ((Collection) r10).size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ((Ia.p) r10.get(i12)).invoke(scatterSetWrapper2, this);
                    }
                }
                synchronized (SnapshotKt.f13154c) {
                    try {
                        p();
                        SnapshotKt.g();
                        if (l10 != null) {
                            Object[] objArr = l10.f9123b;
                            long[] jArr = l10.f9122a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j11 = jArr[i13];
                                    long[] jArr2 = jArr;
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                                        for (int i15 = 0; i15 < i14; i15++) {
                                            if ((j11 & 255) < 128) {
                                                SnapshotKt.q((o) objArr[(i13 << 3) + i15]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                    }
                                    if (i13 == length) {
                                        break;
                                    }
                                    i13++;
                                    jArr = jArr2;
                                }
                            }
                        }
                        if (lX != null) {
                            Object[] objArr2 = lX.f9123b;
                            long[] jArr3 = lX.f9122a;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j12 = jArr3[i16];
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j12 & 255) < 128) {
                                                SnapshotKt.q((o) objArr2[(i16 << 3) + i18]);
                                            }
                                            j12 >>= 8;
                                        }
                                        i10 = 1;
                                        j = 255;
                                        if (i17 != 8) {
                                            break;
                                        }
                                    } else {
                                        i10 = 1;
                                        j = 255;
                                    }
                                    if (i16 == length2) {
                                        break;
                                    }
                                    i16 += i10;
                                }
                            }
                        }
                        ArrayList arrayList = this.f13193i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i19 = 0; i19 < size3; i19++) {
                                SnapshotKt.q((o) arrayList.get(i19));
                            }
                        }
                        this.f13193i = null;
                        p293xa.r rVar2 = p293xa.r.f47939a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return h.b.f13208a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public L<o> x() {
        return this.f13192h;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Ia.l<Object, p293xa.r> e() {
        return this.f13189e;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0164  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0198 A[LOOP:3: B:75:0x0196->B:76:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final h z(long j, L l10, HashMap map, SnapshotIdSet snapshotIdSet) {
        ArrayList arrayList;
        ArrayList arrayListC0;
        ArrayList arrayList2;
        int size;
        int i10;
        ArrayList arrayList3;
        int size2;
        int i11;
        o oVar;
        q qVar;
        Object[] objArr;
        long[] jArr;
        int i12;
        int i13;
        int i14;
        long j10;
        int i15;
        q qVarV;
        SnapshotIdSet snapshotIdSetV = d().A(g()).v(this.j);
        Object[] objArr2 = l10.f9123b;
        long[] jArr2 = l10.f9122a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i16 = 0;
            arrayList2 = null;
            arrayListC0 = null;
            while (true) {
                long j11 = jArr2[i16];
                SnapshotIdSet snapshotIdSet2 = snapshotIdSetV;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j11 & 255) < 128) {
                            o oVar2 = (o) objArr2[(i16 << 3) + i19];
                            q qVarK = oVar2.k();
                            q qVarS = SnapshotKt.s(qVarK, j, snapshotIdSet);
                            if (qVarS != null) {
                                SnapshotIdSet snapshotIdSet3 = snapshotIdSet2;
                                q qVarS2 = SnapshotKt.s(qVarK, g(), snapshotIdSet3);
                                if (qVarS2 == null) {
                                    snapshotIdSet2 = snapshotIdSet3;
                                    i14 = length;
                                    j10 = j11;
                                } else {
                                    snapshotIdSet2 = snapshotIdSet3;
                                    i14 = length;
                                    j10 = j11;
                                    if (qVarS2.f13225a != 1 && !qVarS.equals(qVarS2)) {
                                        q qVarS3 = SnapshotKt.s(qVarK, g(), d());
                                        if (qVarS3 == null) {
                                            SnapshotKt.r();
                                            throw null;
                                        }
                                        if (map == null || (qVarV = (q) map.get(qVarS)) == null) {
                                            qVarV = oVar2.v(qVarS2, qVarS, qVarS3);
                                        }
                                        if (qVarV == null) {
                                            return new h.a();
                                        }
                                        if (!qVarV.equals(qVarS3)) {
                                            if (qVarV.equals(qVarS)) {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(new Pair(oVar2, qVarS.c(g())));
                                                if (arrayListC0 == null) {
                                                    arrayListC0 = new ArrayList();
                                                }
                                                arrayListC0.add(oVar2);
                                            } else {
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                }
                                                arrayList2.add(!qVarV.equals(qVarS2) ? new Pair(oVar2, qVarV) : new Pair(oVar2, qVarS2.c(g())));
                                            }
                                        }
                                    }
                                }
                            } else {
                                i14 = length;
                                j10 = j11;
                            }
                            i15 = 8;
                        } else {
                            i14 = length;
                            j10 = j11;
                            i15 = i17;
                        }
                        j11 = j10 >> i15;
                        i19++;
                        i17 = i15;
                        length = i14;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                        j = j;
                    }
                    objArr = objArr2;
                    jArr = jArr2;
                    i12 = length;
                    i13 = 1;
                    if (i18 != i17) {
                        break;
                    }
                } else {
                    objArr = objArr2;
                    jArr = jArr2;
                    i12 = length;
                    i13 = 1;
                }
                if (i16 != i12) {
                    i16 += i13;
                    length = i12;
                    snapshotIdSetV = snapshotIdSet2;
                    objArr2 = objArr;
                    jArr2 = jArr;
                } else {
                    arrayList = arrayList2;
                }
            }
            if (arrayList2 != null) {
                v();
                size2 = arrayList2.size();
                for (i11 = 0; i11 < size2; i11++) {
                    Pair pair = (Pair) arrayList2.get(i11);
                    oVar = (o) pair.a();
                    qVar = (q) pair.b();
                    qVar.f13225a = j;
                    synchronized (SnapshotKt.f13154c) {
                        qVar.f13226b = oVar.k();
                        oVar.e(qVar);
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                }
            }
            if (arrayListC0 != null) {
                size = arrayListC0.size();
                for (i10 = 0; i10 < size; i10++) {
                    l10.l((o) arrayListC0.get(i10));
                }
                arrayList3 = this.f13193i;
                if (arrayList3 != null) {
                    arrayListC0 = kotlin.collections.q.c0(arrayList3, arrayListC0);
                }
                this.f13193i = arrayListC0;
            }
            return h.b.f13208a;
        }
        arrayList = null;
        arrayListC0 = null;
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            size2 = arrayList2.size();
            while (i11 < size2) {
                Pair pair2 = (Pair) arrayList2.get(i11);
                oVar = (o) pair2.a();
                qVar = (q) pair2.b();
                qVar.f13225a = j;
                synchronized (SnapshotKt.f13154c) {
                    qVar.f13226b = oVar.k();
                    oVar.e(qVar);
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
            }
        }
        if (arrayListC0 != null) {
            size = arrayListC0.size();
            while (i10 < size) {
                l10.l((o) arrayListC0.get(i10));
            }
            arrayList3 = this.f13193i;
            if (arrayList3 != null) {
                arrayListC0 = kotlin.collections.q.c0(arrayList3, arrayListC0);
            }
            this.f13193i = arrayListC0;
        }
        return h.b.f13208a;
    }
}
