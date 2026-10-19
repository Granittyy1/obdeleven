package androidx.compose.runtime.snapshots;

import androidx.collection.H;
import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.U;
import androidx.compose.runtime.C1090i;
import androidx.compose.runtime.C1091i0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC1116x;
import androidx.compose.runtime.InterfaceC1117y;
import androidx.compose.runtime.J0;
import com.google.android.gms.internal.measurement.M1;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SnapshotStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lambda f13167a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13169c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f f13174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f13175i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<Object> f13168b = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<Set<? extends Object>, g, p293xa.r> f13170d = new Ia.p<Set<? extends Object>, g, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v8, types: [Ia.l, kotlin.jvm.internal.Lambda] */
        @Override // Ia.p
        public final p293xa.r invoke(Set<? extends Object> set, g gVar) {
            List listC0;
            Set<? extends Object> set2 = set;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            while (true) {
                AtomicReference<Object> atomicReference = snapshotStateObserver.f13168b;
                Object obj = atomicReference.get();
                if (obj == null) {
                    listC0 = set2;
                } else if (obj instanceof Set) {
                    listC0 = kotlin.collections.l.s(obj, set2);
                } else {
                    if (!(obj instanceof List)) {
                        C1090i.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    listC0 = kotlin.collections.q.c0((Collection) obj, M1.k(set2));
                }
                do {
                    if (atomicReference.compareAndSet(obj, listC0)) {
                        if (SnapshotStateObserver.a(this.this$0)) {
                            final SnapshotStateObserver snapshotStateObserver2 = this.this$0;
                            snapshotStateObserver2.getClass();
                            snapshotStateObserver2.f13167a.invoke(new Ia.a<p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v10 */
                                /* JADX WARN: Type inference failed for: r0v11 */
                                /* JADX WARN: Type inference failed for: r0v12 */
                                /* JADX WARN: Type inference failed for: r0v19 */
                                /* JADX WARN: Type inference failed for: r0v20 */
                                /* JADX WARN: Type inference failed for: r0v9 */
                                /* JADX WARN: Type inference failed for: r6v10 */
                                /* JADX WARN: Type inference failed for: r6v13 */
                                /* JADX WARN: Type inference failed for: r6v17 */
                                /* JADX WARN: Type inference failed for: r6v5 */
                                /* JADX WARN: Type inference failed for: r6v6, types: [int] */
                                /* JADX WARN: Type inference failed for: r6v9 */
                                @Override // Ia.a
                                public final p293xa.r invoke() {
                                    boolean z10;
                                    int i10;
                                    SnapshotStateObserver.a[] aVarArr;
                                    ?? r10;
                                    boolean z11 = true;
                                    while (true) {
                                        SnapshotStateObserver snapshotStateObserver3 = snapshotStateObserver2;
                                        synchronized (snapshotStateObserver3.f13173g) {
                                            try {
                                                if (snapshotStateObserver3.f13169c) {
                                                    z10 = z11 ? 1 : 0;
                                                } else {
                                                    snapshotStateObserver3.f13169c = z11;
                                                    try {
                                                        androidx.compose.runtime.collection.c<SnapshotStateObserver.a> cVar = snapshotStateObserver3.f13172f;
                                                        SnapshotStateObserver.a[] aVarArr2 = cVar.f12943b;
                                                        int i11 = cVar.f12945d;
                                                        int i12 = 0;
                                                        ?? r11 = z11;
                                                        while (i12 < i11) {
                                                            SnapshotStateObserver.a aVar = aVarArr2[i12];
                                                            L<Object> l10 = aVar.f13182g;
                                                            Object[] objArr = l10.f9123b;
                                                            long[] jArr = l10.f9122a;
                                                            int length = jArr.length - 2;
                                                            if (length >= 0) {
                                                                int i13 = 0;
                                                                ?? r12 = r11;
                                                                while (true) {
                                                                    long j = jArr[i13];
                                                                    i10 = i11;
                                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i14 = 8;
                                                                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                                                                        int i16 = 0;
                                                                        while (i16 < i15) {
                                                                            if ((j & 255) < 128) {
                                                                                aVar.f13176a.invoke(objArr[(i13 << 3) + i16]);
                                                                                i14 = 8;
                                                                            }
                                                                            j >>= i14;
                                                                            i16++;
                                                                            aVarArr2 = aVarArr2;
                                                                        }
                                                                        aVarArr = aVarArr2;
                                                                        r10 = 1;
                                                                        r10 = 1;
                                                                        if (i15 != i14) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        aVarArr = aVarArr2;
                                                                        r10 = r12;
                                                                    }
                                                                    if (i13 == length) {
                                                                        break;
                                                                    }
                                                                    i13 += r10 == true ? 1 : 0;
                                                                    r12 = r10 == true ? 1 : 0;
                                                                    i11 = i10;
                                                                    aVarArr2 = aVarArr;
                                                                }
                                                            } else {
                                                                i10 = i11;
                                                                aVarArr = aVarArr2;
                                                                r10 = r11 == true ? 1 : 0;
                                                            }
                                                            l10.e();
                                                            i12 += r10;
                                                            r11 = r10;
                                                            i11 = i10;
                                                            aVarArr2 = aVarArr;
                                                        }
                                                        z10 = r11 == true ? 1 : 0;
                                                        snapshotStateObserver3.f13169c = false;
                                                    } catch (Throwable th) {
                                                        snapshotStateObserver3.f13169c = false;
                                                        throw th;
                                                    }
                                                }
                                                p293xa.r rVar = p293xa.r.f47939a;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        if (!SnapshotStateObserver.a(snapshotStateObserver2)) {
                                            return p293xa.r.f47939a;
                                        }
                                        z11 = z10;
                                    }
                                }
                            });
                        }
                        return p293xa.r.f47939a;
                    }
                } while (atomicReference.get() == obj);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ia.l<Object, p293xa.r> f13171e = new Ia.l<Object, p293xa.r>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // Ia.l
        public final p293xa.r invoke(Object obj) {
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            snapshotStateObserver.getClass();
            synchronized (snapshotStateObserver.f13173g) {
                SnapshotStateObserver.a aVar = snapshotStateObserver.f13175i;
                kotlin.jvm.internal.i.b(aVar);
                Object obj2 = aVar.f13177b;
                kotlin.jvm.internal.i.b(obj2);
                int i10 = aVar.f13179d;
                H<Object> h8 = aVar.f13178c;
                if (h8 == null) {
                    h8 = new H<>((Object) null);
                    aVar.f13178c = h8;
                    aVar.f13181f.l(obj2, h8);
                    p293xa.r rVar = p293xa.r.f47939a;
                }
                aVar.c(obj, i10, obj2, h8);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<a> f13172f = new androidx.compose.runtime.collection.c<>(new a[16]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f13173g = new Object();
    public long j = -1;

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Ia.l<Object, p293xa.r> f13176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public H<Object> f13178c;
        public int j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13179d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final K<Object, Object> f13180e = U.b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final K<Object, H<Object>> f13181f = new K<>((Object) null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final L<Object> f13182g = new L<>((Object) null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final androidx.compose.runtime.collection.c<InterfaceC1116x<?>> f13183h = new androidx.compose.runtime.collection.c<>(new InterfaceC1116x[16]);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final C0154a f13184i = new C0154a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final K<Object, Object> f13185k = U.b();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final HashMap<InterfaceC1116x<?>, Object> f13186l = new HashMap<>();

        /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SnapshotStateObserver.kt */
        public static final class C0154a implements InterfaceC1117y {
            public C0154a() {
            }

            @Override // androidx.compose.runtime.InterfaceC1117y
            public final void a() {
                a.this.j--;
            }

            @Override // androidx.compose.runtime.InterfaceC1117y
            public final void start() {
                a.this.j++;
            }
        }

        public a(Ia.l<Object, p293xa.r> lVar) {
            this.f13176a = lVar;
        }

        public final void a(Object obj, Ia.l<Object, p293xa.r> lVar, Ia.a<p293xa.r> aVar) {
            long[] jArr;
            int i10;
            Object obj2 = this.f13177b;
            H<Object> h8 = this.f13178c;
            int i11 = this.f13179d;
            this.f13177b = obj;
            this.f13178c = this.f13181f.d(obj);
            if (this.f13179d == -1) {
                this.f13179d = Long.hashCode(SnapshotKt.k().g());
            }
            C0154a c0154a = this.f13184i;
            androidx.compose.runtime.collection.c<InterfaceC1117y> cVarC = J0.c();
            try {
                cVarC.b(c0154a);
                g.a.c(aVar, lVar);
                cVarC.p(cVarC.f12945d - 1);
                Object obj3 = this.f13177b;
                kotlin.jvm.internal.i.b(obj3);
                int i12 = this.f13179d;
                H<Object> h10 = this.f13178c;
                if (h10 != null) {
                    long[] jArr2 = h10.f9103a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j = jArr2[i13];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj4 = h10.f9104b[i17];
                                        boolean z10 = h10.f9105c[i17] != i12;
                                        if (z10) {
                                            d(obj3, obj4);
                                        }
                                        if (z10) {
                                            h10.f(i17);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = i14;
                                    }
                                    j >>= i10;
                                    i16++;
                                    i14 = i10;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                if (i15 != i14) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                            }
                            if (i13 == length) {
                                break;
                            }
                            i13++;
                            jArr2 = jArr;
                        }
                    }
                }
                this.f13177b = obj2;
                this.f13178c = h8;
                this.f13179d = i11;
            } catch (Throwable th) {
                cVarC.p(cVarC.f12945d - 1);
                throw th;
            }
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18751. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public final boolean b(java.util.Set<? extends java.lang.Object> r46) {
            /*
                Method dump skipped, instruction units count: 1875
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.a.b(java.util.Set):boolean");
        }

        /* JADX WARN: Code duplicated, block: B:27:0x008a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x008c A[LOOP:0: B:15:0x0047->B:28:0x008c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:37:0x008f A[EDGE_INSN: B:37:0x008f->B:29:0x008f BREAK  A[LOOP:0: B:15:0x0047->B:28:0x008c], SYNTHETIC] */
        public final void c(Object obj, int i10, Object obj2, H<Object> h8) {
            int i11;
            if (this.j > 0) {
                return;
            }
            int iD = h8.d(obj);
            if (iD < 0) {
                iD = ~iD;
                i11 = -1;
            } else {
                i11 = h8.f9105c[iD];
            }
            h8.f9104b[iD] = obj;
            h8.f9105c[iD] = i10;
            if ((obj instanceof InterfaceC1116x) && i11 != i10) {
                DerivedSnapshotState.a aVarX = ((InterfaceC1116x) obj).x();
                this.f13186l.put(obj, aVarX.f12829f);
                H h10 = aVarX.f12828e;
                K<Object, Object> k10 = this.f13185k;
                androidx.compose.runtime.collection.e.c(k10, obj);
                Object[] objArr = h10.f9104b;
                long[] jArr = h10.f9103a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j = jArr[i12];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j & 255) < 128) {
                                    o oVar = (o) objArr[(i12 << 3) + i14];
                                    if (oVar instanceof p) {
                                        ((p) oVar).z(2);
                                    }
                                    androidx.compose.runtime.collection.e.a(k10, oVar, obj);
                                }
                                j >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
            }
            if (i11 == -1) {
                if (obj instanceof p) {
                    ((p) obj).z(2);
                }
                androidx.compose.runtime.collection.e.a(this.f13180e, obj, obj2);
            }
        }

        public final void d(Object obj, Object obj2) {
            K<Object, Object> k10 = this.f13180e;
            androidx.compose.runtime.collection.e.b(k10, obj2, obj);
            if (!(obj2 instanceof InterfaceC1116x) || k10.b(obj2)) {
                return;
            }
            androidx.compose.runtime.collection.e.c(this.f13185k, obj2);
            this.f13186l.remove(obj2);
        }

        public final void e(Ia.l<Object, Boolean> lVar) {
            long[] jArr;
            int i10;
            long[] jArr2;
            int i11;
            long j;
            int i12;
            long j10;
            int i13;
            K<Object, H<Object>> k10 = this.f13181f;
            long[] jArr3 = k10.f9127a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i14 = 0;
            while (true) {
                long j11 = jArr3[i14];
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj = k10.f9128b[i18];
                            H h8 = (H) k10.f9129c[i18];
                            Boolean boolInvoke = lVar.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                Object[] objArr = h8.f9104b;
                                int[] iArr = h8.f9105c;
                                long[] jArr4 = h8.f9103a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                if (length2 >= 0) {
                                    i12 = i16;
                                    int i19 = 0;
                                    while (true) {
                                        long j13 = jArr4[i19];
                                        i11 = i14;
                                        j = j11;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j13 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    Object obj2 = objArr[i22];
                                                    int i23 = iArr[i22];
                                                    d(obj, obj2);
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j11 = j;
                                    }
                                } else {
                                    i11 = i14;
                                    j = j11;
                                    i12 = i16;
                                    j10 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i11 = i14;
                                j = j11;
                                i12 = i16;
                                j10 = j12;
                            }
                            if (boolInvoke.booleanValue()) {
                                k10.k(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr3;
                            i11 = i14;
                            j = j11;
                            i12 = i16;
                            j10 = j12;
                            i13 = i15;
                        }
                        j11 = j >> i13;
                        i17++;
                        i15 = i13;
                        j12 = j10;
                        jArr3 = jArr2;
                        i16 = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i24 = i14;
                    if (i16 != i15) {
                        return;
                    } else {
                        i10 = i24;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 == length) {
                    return;
                }
                i14 = i10 + 1;
                jArr3 = jArr;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Ia.l<? super Ia.a<p293xa.r>, p293xa.r> lVar) {
        this.f13167a = (Lambda) lVar;
    }

    public static final boolean a(SnapshotStateObserver snapshotStateObserver) {
        boolean z10;
        Set<? extends Object> set;
        synchronized (snapshotStateObserver.f13173g) {
            z10 = snapshotStateObserver.f13169c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            AtomicReference<Object> atomicReference = snapshotStateObserver.f13168b;
            Object obj = atomicReference.get();
            Set<? extends Object> set2 = null;
            objSubList = null;
            Object objSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C1090i.d("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set = set3;
                }
                while (true) {
                    if (atomicReference.compareAndSet(obj, objSubList)) {
                        set2 = set;
                    } else if (atomicReference.get() != obj) {
                    }
                }
            }
            if (set2 == null) {
                return z11;
            }
            synchronized (snapshotStateObserver.f13173g) {
                try {
                    androidx.compose.runtime.collection.c<a> cVar = snapshotStateObserver.f13172f;
                    a[] aVarArr = cVar.f12943b;
                    int i10 = cVar.f12945d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        z11 = aVarArr[i11].b(set2) || z11;
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f13173g) {
            try {
                androidx.compose.runtime.collection.c<a> cVar = this.f13172f;
                a[] aVarArr = cVar.f12943b;
                int i10 = cVar.f12945d;
                for (int i11 = 0; i11 < i10; i11++) {
                    a aVar = aVarArr[i11];
                    aVar.f13180e.f();
                    aVar.f13181f.f();
                    aVar.f13185k.f();
                    aVar.f13186l.clear();
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f A[EDGE_INSN: B:8:0x001f->B:49:0x007e BREAK  A[LOOP:1: B:12:0x0032->B:27:0x0079]] */
    public final void c(Object obj) {
        Object obj2;
        int i10;
        Object obj3 = this.f13173g;
        synchronized (obj3) {
            try {
                androidx.compose.runtime.collection.c<a> cVar = this.f13172f;
                int i11 = cVar.f12945d;
                int i12 = 0;
                int i13 = 0;
                while (i12 < i11) {
                    a aVar = cVar.f12943b[i12];
                    H<Object> hJ = aVar.f13181f.j(obj);
                    if (hJ == null) {
                        obj2 = obj3;
                        i10 = i12;
                        break;
                    }
                    Object[] objArr = hJ.f9104b;
                    int[] iArr = hJ.f9105c;
                    long[] jArr = hJ.f9103a;
                    int length = jArr.length - 2;
                    if (length < 0) {
                        obj2 = obj3;
                        i10 = i12;
                        break;
                    }
                    i10 = i12;
                    int i14 = 0;
                    while (true) {
                        long j = jArr[i14];
                        obj2 = obj3;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8;
                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j & 255) < 128) {
                                    int i18 = (i14 << 3) + i17;
                                    Object obj4 = objArr[i18];
                                    int i19 = iArr[i18];
                                    aVar.d(obj, obj4);
                                    i15 = 8;
                                }
                                j >>= i15;
                            }
                            if (i16 != i15) {
                                break;
                            }
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        obj3 = obj2;
                    }
                    try {
                        if (!(aVar.f13181f.f9131e != 0)) {
                            i13++;
                        } else if (i13 > 0) {
                            a[] aVarArr = cVar.f12943b;
                            aVarArr[i10 - i13] = aVarArr[i10];
                        }
                        i12 = i10 + 1;
                        obj3 = obj2;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                obj2 = obj3;
                int i20 = i11 - i13;
                Arrays.fill(cVar.f12943b, i20, i11, (Object) null);
                cVar.f12945d = i20;
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th2) {
                th = th2;
                obj2 = obj3;
            }
        }
    }

    public final <T> void d(T t8, Ia.l<? super T, p293xa.r> lVar, Ia.a<p293xa.r> aVar) {
        a aVar2;
        a aVar3;
        synchronized (this.f13173g) {
            androidx.compose.runtime.collection.c<a> cVar = this.f13172f;
            a[] aVarArr = cVar.f12943b;
            int i10 = cVar.f12945d;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArr[i11];
                if (aVar2.f13176a == lVar) {
                    break;
                } else {
                    i11++;
                }
            }
            aVar3 = aVar2;
            if (aVar3 == null) {
                kotlin.jvm.internal.i.c(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.o.d(1, lVar);
                aVar3 = new a(lVar);
                cVar.b(aVar3);
            }
        }
        a aVar4 = this.f13175i;
        long j = this.j;
        if (j != -1 && j != I.b.f()) {
            StringBuilder sbF = J4.n.f("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=", j);
            sbF.append(I.b.f());
            sbF.append(", name=");
            sbF.append(Thread.currentThread().getName());
            sbF.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            C1091i0.a(sbF.toString());
        }
        try {
            this.f13175i = aVar3;
            this.j = I.b.f();
            aVar3.a(t8, this.f13171e, aVar);
        } finally {
            this.f13175i = aVar4;
            this.j = j;
        }
    }

    public final void e() {
        Ia.p<Set<? extends Object>, g, p293xa.r> pVar = this.f13170d;
        SnapshotKt.f(SnapshotKt.f13152a);
        synchronized (SnapshotKt.f13154c) {
            SnapshotKt.f13159h = kotlin.collections.q.d0((Collection) SnapshotKt.f13159h, pVar);
            p293xa.r rVar = p293xa.r.f47939a;
        }
        this.f13174h = new f(pVar);
    }
}
