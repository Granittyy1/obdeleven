package androidx.compose.runtime.snapshots;

import androidx.collection.L;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.AtomicInt;
import java.util.Collection;
import java.util.HashMap;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnapshotKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ia.l<SnapshotIdSet, p293xa.r> f13152a = new Ia.l<SnapshotIdSet, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ p293xa.r invoke(SnapshotIdSet snapshotIdSet) {
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.compose.runtime.internal.f f13153b = new androidx.compose.runtime.internal.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13154c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SnapshotIdSet f13155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f13156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f13157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f13158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Object f13159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Object f13160i;
    public static final GlobalSnapshot j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInt f13161k;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.internal.j[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int[], java.lang.Cloneable] */
    static {
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f13147f;
        f13155d = snapshotIdSet;
        f13156e = ((long) 1) + 1;
        i iVar = new i();
        iVar.f13210b = new long[16];
        iVar.f13211c = new int[16];
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        iVar.f13212d = iArr;
        f13157f = iVar;
        m mVar = new m();
        mVar.f13218b = new int[16];
        mVar.f13219c = new androidx.compose.runtime.internal.j[16];
        f13158g = mVar;
        EmptyList emptyList = EmptyList.f42983b;
        f13159h = emptyList;
        f13160i = emptyList;
        long j10 = f13156e;
        f13156e = 1 + j10;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(j10, snapshotIdSet, null, new Ia.l<Object, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.1
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
            @Override // Ia.l
            public final p293xa.r invoke(Object obj) {
                synchronized (SnapshotKt.f13154c) {
                    ?? r10 = SnapshotKt.f13160i;
                    int size = ((Collection) r10).size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((Ia.l) r10.get(i12)).invoke(obj);
                    }
                }
                return p293xa.r.f47939a;
            }
        });
        f13155d = f13155d.A(globalSnapshot.f13205b);
        j = globalSnapshot;
        f13161k = new AtomicInt(0);
    }

    public static final void a() {
        f(f13152a);
    }

    public static final Ia.l b(final Ia.l lVar, final Ia.l lVar2) {
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new Ia.l<Object, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Object obj) {
                lVar.invoke(obj);
                lVar2.invoke(obj);
                return p293xa.r.f47939a;
            }
        };
    }

    public static final HashMap c(long j10, a aVar, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        SnapshotIdSet snapshotIdSet2;
        int i10;
        q qVarS;
        L<o> lX = aVar.x();
        if (lX != null) {
            SnapshotIdSet snapshotIdSetV = aVar.d().A(aVar.g()).v(aVar.j);
            Object[] objArr = lX.f9123b;
            long[] jArr2 = lX.f9122a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return null;
            }
            int i11 = 0;
            HashMap map = null;
            while (true) {
                long j11 = jArr2[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            o oVar = (o) objArr[(i11 << 3) + i14];
                            q qVarK = oVar.k();
                            q qVarS2 = s(qVarK, j10, snapshotIdSet);
                            if (qVarS2 != null && (qVarS = s(qVarK, j10, snapshotIdSetV)) != null && !qVarS2.equals(qVarS)) {
                                q qVarS3 = s(qVarK, aVar.g(), aVar.d());
                                if (qVarS3 == null) {
                                    r();
                                    throw null;
                                }
                                q qVarV = oVar.v(qVarS, qVarS2, qVarS3);
                                if (qVarV != null) {
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(qVarS2, qVarV);
                                    map = map;
                                }
                            }
                            i10 = 8;
                        } else {
                            snapshotIdSetV = snapshotIdSetV;
                            i10 = i12;
                        }
                        j11 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr2 = jArr2;
                        snapshotIdSetV = snapshotIdSetV;
                        j10 = j10;
                    }
                    jArr = jArr2;
                    snapshotIdSet2 = snapshotIdSetV;
                    if (i13 == i12) {
                    }
                    return map;
                }
                jArr = jArr2;
                snapshotIdSet2 = snapshotIdSetV;
                if (i11 == length) {
                    return map;
                }
                i11++;
                jArr2 = jArr;
                snapshotIdSetV = snapshotIdSet2;
            }
        }
        return null;
    }

    public static final void d(g gVar) {
        long j10;
        if (f13155d.q(gVar.g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(gVar.g());
        sb2.append(", disposed=");
        sb2.append(gVar.f13206c);
        sb2.append(", applied=");
        a aVar = gVar instanceof a ? (a) gVar : null;
        sb2.append(aVar != null ? Boolean.valueOf(aVar.f13196m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f13154c) {
            i iVar = f13157f;
            j10 = iVar.f13209a > 0 ? iVar.f13210b[0] : -1L;
        }
        sb2.append(j10);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final SnapshotIdSet e(SnapshotIdSet snapshotIdSet, long j10, long j11) {
        while (j10 < j11) {
            snapshotIdSet = snapshotIdSet.A(j10);
            j10++;
        }
        return snapshotIdSet;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[Catch: all -> 0x008a, LOOP:1: B:31:0x005a->B:43:0x0093, LOOP_END, TryCatch #1 {all -> 0x008a, blocks: (B:26:0x004b, B:28:0x0050, B:31:0x005a, B:33:0x006a, B:35:0x0076, B:37:0x007f, B:40:0x008c, B:43:0x0093, B:44:0x0095), top: B:53:0x004b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0095 A[EDGE_INSN: B:59:0x0095->B:44:0x0095 BREAK  A[LOOP:1: B:31:0x005a->B:43:0x0093], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    public static final <T> T f(Ia.l<? super SnapshotIdSet, ? extends T> lVar) {
        L<o> l10;
        T t8;
        GlobalSnapshot globalSnapshot = j;
        synchronized (f13154c) {
            try {
                l10 = globalSnapshot.f13192h;
                if (l10 != null) {
                    f13161k.addAndGet(1);
                }
                t8 = (T) v(globalSnapshot, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l10 != null) {
            try {
                ?? r10 = f13159h;
                int size = ((Collection) r10).size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Ia.p) r10.get(i10)).invoke(new ScatterSetWrapper(l10), globalSnapshot);
                }
                f13161k.addAndGet(-1);
            } catch (Throwable th2) {
                f13161k.addAndGet(-1);
                throw th2;
            }
        }
        synchronized (f13154c) {
            try {
                g();
                if (l10 != null) {
                    Object[] objArr = l10.f9123b;
                    long[] jArr = l10.f9122a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j10) < 128) {
                                        q((o) objArr[(i11 << 3) + i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                }
                                if (i11 != length) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return t8;
    }

    public static final void g() {
        m mVar = f13158g;
        int i10 = mVar.f13217a;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            androidx.compose.runtime.internal.j jVar = ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i11];
            Object obj = jVar != null ? jVar.get() : null;
            if (obj != null && p((o) obj)) {
                if (i12 != i11) {
                    ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i12] = jVar;
                    int[] iArr = (int[]) mVar.f13218b;
                    iArr[i12] = iArr[i11];
                }
                i12++;
            }
            i11++;
        }
        for (int i13 = i12; i13 < i10; i13++) {
            ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i13] = null;
            ((int[]) mVar.f13218b)[i13] = 0;
        }
        if (i12 != i10) {
            mVar.f13217a = i12;
        }
    }

    public static final g h(g gVar, Ia.l<Object, p293xa.r> lVar, boolean z10) {
        boolean z11 = gVar instanceof a;
        if (z11 || gVar == null) {
            return new s(z11 ? (a) gVar : null, lVar, null, false, z10);
        }
        return new t(gVar, lVar, z10);
    }

    public static final <T extends q> T i(T t8) {
        T t10;
        g gVarK = k();
        T t11 = (T) s(t8, gVarK.g(), gVarK.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f13154c) {
            g gVarK2 = k();
            t10 = (T) s(t8, gVarK2.g(), gVarK2.d());
        }
        if (t10 != null) {
            return t10;
        }
        r();
        throw null;
    }

    public static final <T extends q> T j(T t8, g gVar) {
        T t10;
        T t11 = (T) s(t8, gVar.g(), gVar.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f13154c) {
            t10 = (T) s(t8, gVar.g(), gVar.d());
        }
        if (t10 != null) {
            return t10;
        }
        r();
        throw null;
    }

    public static final g k() {
        g gVar = (g) f13153b.a();
        return gVar == null ? j : gVar;
    }

    public static final Ia.l<Object, p293xa.r> l(final Ia.l<Object, p293xa.r> lVar, final Ia.l<Object, p293xa.r> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar == null || lVar2 == null || lVar == lVar2) {
            return lVar == null ? lVar2 : lVar;
        }
        return new Ia.l<Object, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Object obj) {
                lVar.invoke(obj);
                lVar2.invoke(obj);
                return p293xa.r.f47939a;
            }
        };
    }

    public static final <T extends q> T m(T t8, o oVar) {
        long j10 = f13156e;
        i iVar = f13157f;
        if (iVar.f13209a > 0) {
            j10 = iVar.f13210b[0];
        }
        long j11 = j10 - 1;
        SnapshotIdSet snapshotIdSet = SnapshotIdSet.f13147f;
        T t10 = null;
        q qVar = null;
        for (q qVarK = oVar.k(); qVarK != null; qVarK = qVarK.f13226b) {
            long j12 = qVarK.f13225a;
            if (j12 != 0) {
                if (j12 != 0 && j12 <= j11 && !snapshotIdSet.q(j12)) {
                    if (qVar != null) {
                        if (qVarK.f13225a >= qVar.f13225a) {
                            t10 = (T) qVar;
                            break;
                        }
                        break;
                    }
                    qVar = qVarK;
                }
            }
            t10 = (T) qVarK;
            break;
        }
        if (t10 != null) {
            t10.f13225a = Long.MAX_VALUE;
            return t10;
        }
        T t11 = (T) t8.c(Long.MAX_VALUE);
        t11.f13226b = oVar.k();
        oVar.e(t11);
        return t11;
    }

    public static final void n(g gVar, o oVar) {
        gVar.t(gVar.h() + 1);
        Ia.l<Object, p293xa.r> lVarI = gVar.i();
        if (lVarI != null) {
            lVarI.invoke(oVar);
        }
    }

    public static final q o(q qVar, p pVar, g gVar, q qVar2) {
        q qVarM;
        if (gVar.f()) {
            gVar.n(pVar);
        }
        long jG = gVar.g();
        if (qVar2.f13225a == jG) {
            return qVar2;
        }
        synchronized (f13154c) {
            qVarM = m(qVar, pVar);
        }
        qVarM.f13225a = jG;
        if (qVar2.f13225a != 1) {
            gVar.n(pVar);
        }
        return qVarM;
    }

    public static final boolean p(o oVar) {
        q qVar;
        long j10 = f13156e;
        i iVar = f13157f;
        if (iVar.f13209a > 0) {
            j10 = iVar.f13210b[0];
        }
        q qVar2 = null;
        q qVarK = null;
        int i10 = 0;
        for (q qVarK2 = oVar.k(); qVarK2 != null; qVarK2 = qVarK2.f13226b) {
            long j11 = qVarK2.f13225a;
            if (j11 != 0) {
                if (j11 >= j10) {
                    i10++;
                } else if (qVar2 == null) {
                    i10++;
                    qVar2 = qVarK2;
                } else {
                    if (j11 < qVar2.f13225a) {
                        qVar = qVar2;
                        qVar2 = qVarK2;
                    } else {
                        qVar = qVarK2;
                    }
                    if (qVarK == null) {
                        qVarK = oVar.k();
                        q qVar3 = qVarK;
                        while (true) {
                            if (qVarK == null) {
                                qVarK = qVar3;
                                break;
                            }
                            long j12 = qVarK.f13225a;
                            if (j12 >= j10) {
                                break;
                            }
                            if (qVar3.f13225a < j12) {
                                qVar3 = qVarK;
                            }
                            qVarK = qVarK.f13226b;
                        }
                    }
                    qVar2.f13225a = 0L;
                    qVar2.a(qVarK);
                    qVar2 = qVar;
                }
            }
        }
        return i10 > 1;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [int[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.runtime.internal.j[], java.io.Serializable, java.lang.Object] */
    public static final void q(o oVar) {
        if (p(oVar)) {
            m mVar = f13158g;
            int i10 = mVar.f13217a;
            int iIdentityHashCode = System.identityHashCode(oVar);
            int i11 = -1;
            if (i10 > 0) {
                int i12 = mVar.f13217a - 1;
                int i13 = 0;
                while (true) {
                    if (i13 <= i12) {
                        int i14 = (i13 + i12) >>> 1;
                        int i15 = ((int[]) mVar.f13218b)[i14];
                        if (i15 >= iIdentityHashCode) {
                            if (i15 <= iIdentityHashCode) {
                                androidx.compose.runtime.internal.j jVar = ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i14];
                                if (oVar != (jVar != null ? jVar.get() : null)) {
                                    int i16 = i14 - 1;
                                    while (true) {
                                        if (-1 >= i16 || ((int[]) mVar.f13218b)[i16] != iIdentityHashCode) {
                                            int i17 = mVar.f13217a;
                                            i16 = i14 + 1;
                                            while (true) {
                                                if (i16 >= i17) {
                                                    i16 = -(mVar.f13217a + 1);
                                                    break;
                                                } else {
                                                    if (((int[]) mVar.f13218b)[i16] != iIdentityHashCode) {
                                                        i16 = -(i16 + 1);
                                                        break;
                                                    }
                                                    androidx.compose.runtime.internal.j jVar2 = ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i16];
                                                    if ((jVar2 != null ? jVar2.get() : null) == oVar) {
                                                        break;
                                                    } else {
                                                        i16++;
                                                    }
                                                }
                                            }
                                        } else {
                                            androidx.compose.runtime.internal.j jVar3 = ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i16];
                                            if ((jVar3 != null ? jVar3.get() : null) == oVar) {
                                                break;
                                            } else {
                                                i16--;
                                            }
                                        }
                                    }
                                    i11 = i16;
                                    break;
                                }
                                i11 = i14;
                                break;
                            }
                            i12 = i14 - 1;
                        } else {
                            i13 = i14 + 1;
                        }
                    } else {
                        i11 = -(i13 + 1);
                        break;
                    }
                }
                if (i11 >= 0) {
                    return;
                }
            }
            int i18 = -(i11 + 1);
            androidx.compose.runtime.internal.j[] jVarArr = (androidx.compose.runtime.internal.j[]) mVar.f13219c;
            int length = jVarArr.length;
            if (i10 == length) {
                int i19 = length * 2;
                ?? r10 = new androidx.compose.runtime.internal.j[i19];
                ?? r11 = new int[i19];
                int i20 = i18 + 1;
                System.arraycopy(jVarArr, i18, r10, i20, i10 - i18);
                System.arraycopy((androidx.compose.runtime.internal.j[]) mVar.f13219c, 0, r10, 0, i18);
                Q3.d.m(i20, i18, i10, (int[]) mVar.f13218b, r11);
                Q3.d.q(0, i18, 6, (int[]) mVar.f13218b, r11);
                mVar.f13219c = r10;
                mVar.f13218b = r11;
            } else {
                int i21 = i18 + 1;
                System.arraycopy(jVarArr, i18, jVarArr, i21, i10 - i18);
                int[] iArr = (int[]) mVar.f13218b;
                Q3.d.m(i21, i18, i10, iArr, iArr);
            }
            ((androidx.compose.runtime.internal.j[]) mVar.f13219c)[i18] = new androidx.compose.runtime.internal.j(oVar);
            ((int[]) mVar.f13218b)[i18] = iIdentityHashCode;
            mVar.f13217a++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends q> T s(T t8, long j10, SnapshotIdSet snapshotIdSet) {
        T t10 = null;
        while (t8 != null) {
            long j11 = t8.f13225a;
            if (j11 != 0 && j11 <= j10 && !snapshotIdSet.q(j11) && (t10 == null || t10.f13225a < t8.f13225a)) {
                t10 = t8;
            }
            t8 = (T) t8.f13226b;
        }
        if (t10 != null) {
            return t10;
        }
        return null;
    }

    public static final <T extends q> T t(T t8, o oVar) {
        T t10;
        g gVarK = k();
        Ia.l<Object, p293xa.r> lVarE = gVarK.e();
        if (lVarE != null) {
            lVarE.invoke(oVar);
        }
        T t11 = (T) s(t8, gVarK.g(), gVarK.d());
        if (t11 != null) {
            return t11;
        }
        synchronized (f13154c) {
            g gVarK2 = k();
            q qVarK = oVar.k();
            kotlin.jvm.internal.i.c(qVarK, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            t10 = (T) s(qVarK, gVarK2.g(), gVarK2.d());
            if (t10 == null) {
                r();
                throw null;
            }
        }
        return t10;
    }

    public static final void u(int i10) {
        i iVar = f13157f;
        int i11 = iVar.f13212d[i10];
        iVar.b(i11, iVar.f13209a - 1);
        iVar.f13209a--;
        long[] jArr = iVar.f13210b;
        long j10 = jArr[i11];
        int i12 = i11;
        while (i12 > 0) {
            int i13 = ((i12 + 1) >> 1) - 1;
            if (jArr[i13] <= j10) {
                break;
            }
            iVar.b(i13, i12);
            i12 = i13;
        }
        long[] jArr2 = iVar.f13210b;
        int i14 = iVar.f13209a >> 1;
        while (i11 < i14) {
            int i15 = (i11 + 1) << 1;
            int i16 = i15 - 1;
            if (i15 < iVar.f13209a) {
                long j11 = jArr2[i15];
                if (j11 < jArr2[i16]) {
                    if (j11 >= jArr2[i11]) {
                        break;
                    }
                    iVar.b(i15, i11);
                    i11 = i15;
                }
            }
            if (jArr2[i16] >= jArr2[i11]) {
                break;
            }
            iVar.b(i16, i11);
            i11 = i16;
        }
        iVar.f13212d[i10] = iVar.f13213e;
        iVar.f13213e = i10;
    }

    public static final <T> T v(GlobalSnapshot globalSnapshot, Ia.l<? super SnapshotIdSet, ? extends T> lVar) {
        long j10 = globalSnapshot.f13205b;
        T tInvoke = lVar.invoke(f13155d.k(j10));
        long j11 = f13156e;
        f13156e = 1 + j11;
        SnapshotIdSet snapshotIdSetK = f13155d.k(j10);
        f13155d = snapshotIdSetK;
        globalSnapshot.f13205b = j11;
        globalSnapshot.f13204a = snapshotIdSetK;
        globalSnapshot.f13191g = 0;
        globalSnapshot.f13192h = null;
        globalSnapshot.o();
        f13155d = f13155d.A(j11);
        return tInvoke;
    }

    public static final <T extends q> T w(T t8, o oVar, g gVar) {
        T t10;
        if (gVar.f()) {
            gVar.n(oVar);
        }
        long jG = gVar.g();
        T t11 = (T) s(t8, jG, gVar.d());
        if (t11 == null) {
            r();
            throw null;
        }
        if (t11.f13225a == gVar.g()) {
            return t11;
        }
        synchronized (f13154c) {
            t10 = (T) s(oVar.k(), jG, gVar.d());
            if (t10 == null) {
                r();
                throw null;
            }
            if (t10.f13225a != jG) {
                q qVarM = m(t10, oVar);
                qVarM.a(t10);
                qVarM.f13225a = gVar.g();
                t10 = (T) qVarM;
            }
        }
        if (t11.f13225a != 1) {
            gVar.n(oVar);
        }
        return t10;
    }
}
