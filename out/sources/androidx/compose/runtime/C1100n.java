package androidx.compose.runtime;

import android.os.Trace;
import androidx.collection.MutableSetWrapper;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* JADX INFO: renamed from: androidx.compose.runtime.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1100n implements InterfaceC1115w, InterfaceC1107q0, InterfaceC1092j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1094k f13078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.node.f0 f13079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Object> f13080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableSetWrapper f13082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A0 f13083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f13084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.collection.L<C1105p0> f13085i;
    public final androidx.collection.L<C1105p0> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f13086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C.a f13087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C.a f13088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f13089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.collection.K<Object, Object> f13090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1100n f13092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1112t f13094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1086g f13095t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kotlin.coroutines.e f13096u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13097v;

    public C1100n() {
        throw null;
    }

    public C1100n(AbstractC1094k abstractC1094k, androidx.compose.ui.node.f0 f0Var) {
        this.f13078b = abstractC1094k;
        this.f13079c = f0Var;
        Object obj = null;
        this.f13080d = new AtomicReference<>(null);
        this.f13081e = new Object();
        MutableSetWrapper mutableSetWrapper = new MutableSetWrapper(new androidx.collection.L(obj));
        this.f13082f = mutableSetWrapper;
        A0 a10 = new A0();
        if (abstractC1094k.d()) {
            a10.f12779l = new androidx.collection.B<>();
        }
        if (abstractC1094k.f()) {
            a10.k();
        }
        this.f13083g = a10;
        this.f13084h = androidx.collection.U.b();
        this.f13085i = new androidx.collection.L<>(obj);
        this.j = new androidx.collection.L<>(obj);
        this.f13086k = androidx.collection.U.b();
        C.a aVar = new C.a();
        this.f13087l = aVar;
        C.a aVar2 = new C.a();
        this.f13088m = aVar2;
        this.f13089n = androidx.collection.U.b();
        this.f13090o = androidx.collection.U.b();
        C1112t c1112t = new C1112t();
        c1112t.f13243a = false;
        this.f13094s = c1112t;
        C1086g c1086g = new C1086g(f0Var, abstractC1094k, a10, mutableSetWrapper, aVar, aVar2, this);
        abstractC1094k.n(c1086g);
        this.f13095t = c1086g;
        boolean z10 = abstractC1094k instanceof Recomposer;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.f12792a;
    }

    public final void A() {
        AtomicReference<Object> atomicReference = this.f13080d;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.i.a(andSet, C1102o.f13104a)) {
            return;
        }
        if (andSet instanceof Set) {
            i((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                i(set, false);
            }
            return;
        }
        if (andSet == null) {
            C1090i.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        C1090i.d("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    public final void B() {
        AtomicReference<Object> atomicReference = this.f13080d;
        Object andSet = atomicReference.getAndSet(EmptySet.f42985b);
        if (kotlin.jvm.internal.i.a(andSet, C1102o.f13104a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            i((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            C1090i.d("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            i(set, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce A[Catch: all -> 0x0042, LOOP:0: B:48:0x008f->B:63:0x00ce, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0061, B:38:0x006a, B:40:0x006e, B:41:0x0077, B:43:0x007f, B:45:0x0083, B:48:0x008f, B:50:0x009f, B:52:0x00ab, B:54:0x00b5, B:59:0x00c4, B:63:0x00ce, B:64:0x00d1, B:67:0x00d6), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6 A[Catch: all -> 0x0042, EDGE_INSN: B:67:0x00d6->B:68:0x00db BREAK  A[LOOP:0: B:48:0x008f->B:63:0x00ce], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:35:0x005c, B:37:0x0061, B:38:0x006a, B:40:0x006e, B:41:0x0077, B:43:0x007f, B:45:0x0083, B:48:0x008f, B:50:0x009f, B:52:0x00ab, B:54:0x00b5, B:59:0x00c4, B:63:0x00ce, B:64:0x00d1, B:67:0x00d6), top: B:79:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00d6 A[SYNTHETIC] */
    public final InvalidationResult C(C1105p0 c1105p0, C1074a c1074a, Object obj) {
        int i10;
        synchronized (this.f13081e) {
            try {
                C1100n c1100n = this.f13092q;
                C1100n c1100n2 = null;
                if (c1100n != null) {
                    A0 a10 = this.f13083g;
                    int i11 = this.f13093r;
                    if (a10.f12776h) {
                        C1090i.c("Writer is active");
                    }
                    if (i11 < 0 || i11 >= a10.f12771c) {
                        C1090i.c("Invalid group index");
                    }
                    if (a10.A(c1074a)) {
                        int i12 = a10.f12770b[(i11 * 5) + 3] + i11;
                        int i13 = c1074a.f12935a;
                        if (i11 > i13 || i13 >= i12) {
                            c1100n = null;
                        }
                    } else {
                        c1100n = null;
                    }
                    c1100n2 = c1100n;
                }
                if (c1100n2 == null) {
                    C1086g c1086g = this.f13095t;
                    if (c1086g.f12985E && c1086g.v0(c1105p0, obj)) {
                        return InvalidationResult.f12855e;
                    }
                    E();
                    if (obj != null && (obj instanceof InterfaceC1116x)) {
                        Object objD = this.f13090o.d(c1105p0);
                        if (objD != null) {
                            if (!(objD instanceof androidx.collection.L)) {
                                if (objD != x0.f13255a) {
                                    androidx.compose.runtime.collection.e.a(this.f13090o, c1105p0, obj);
                                    break;
                                }
                            } else {
                                androidx.collection.L l10 = (androidx.collection.L) objD;
                                Object[] objArr = l10.f9123b;
                                long[] jArr = l10.f9122a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    androidx.compose.runtime.collection.e.a(this.f13090o, c1105p0, obj);
                                    break;
                                }
                                int i14 = 0;
                                loop0: while (true) {
                                    long j = jArr[i14];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i14 == length) {
                                            androidx.compose.runtime.collection.e.a(this.f13090o, c1105p0, obj);
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        int i15 = 8;
                                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j & 255) >= 128) {
                                                i10 = i15;
                                            } else {
                                                if (objArr[(i14 << 3) + i17] == x0.f13255a) {
                                                    break loop0;
                                                }
                                                i10 = 8;
                                            }
                                            j >>= i10;
                                            i17++;
                                            i15 = i10;
                                        }
                                        if (i16 == i15) {
                                            if (i14 == length) {
                                                i14++;
                                            }
                                        }
                                        androidx.compose.runtime.collection.e.a(this.f13090o, c1105p0, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            androidx.compose.runtime.collection.e.a(this.f13090o, c1105p0, obj);
                            break;
                        }
                    } else {
                        this.f13090o.l(c1105p0, x0.f13255a);
                    }
                }
                if (c1100n2 != null) {
                    return c1100n2.C(c1105p0, c1074a, obj);
                }
                this.f13078b.j(this);
                return this.f13095t.f12985E ? InvalidationResult.f12854d : InvalidationResult.f12853c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(Object obj) {
        Object objD = this.f13084h.d(obj);
        if (objD == null) {
            return;
        }
        boolean z10 = objD instanceof androidx.collection.L;
        androidx.collection.K<Object, Object> k10 = this.f13089n;
        if (!z10) {
            C1105p0 c1105p0 = (C1105p0) objD;
            if (c1105p0.c(obj) == InvalidationResult.f12855e) {
                androidx.compose.runtime.collection.e.a(k10, obj, c1105p0);
                return;
            }
            return;
        }
        androidx.collection.L l10 = (androidx.collection.L) objD;
        Object[] objArr = l10.f9123b;
        long[] jArr = l10.f9122a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        C1105p0 c1105p1 = (C1105p0) objArr[(i10 << 3) + i12];
                        if (c1105p1.c(obj) == InvalidationResult.f12855e) {
                            androidx.compose.runtime.collection.e.a(k10, obj, c1105p1);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void E() {
        if (this.f13094s.f13243a) {
            return;
        }
        this.f13078b.getClass();
        kotlin.jvm.internal.i.a(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[LOOP:0: B:28:0x0071->B:43:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc A[EDGE_INSN: B:51:0x00bc->B:41:0x00bc BREAK  A[LOOP:0: B:28:0x0071->B:43:0x00c1], SYNTHETIC] */
    @Override // androidx.compose.runtime.InterfaceC1115w, androidx.compose.runtime.InterfaceC1107q0
    public final void a(Object obj) {
        C1105p0 c1105p0Z;
        DerivedSnapshotState.a aVar;
        int i10;
        C1086g c1086g = this.f13095t;
        if (c1086g.f13022z <= 0 && (c1105p0Z = c1086g.Z()) != null) {
            int i11 = c1105p0Z.f13106a | 1;
            c1105p0Z.f13106a = i11;
            Object obj2 = null;
            if ((i11 & 32) == 0) {
                androidx.collection.H<Object> h8 = c1105p0Z.f13111f;
                if (h8 == null) {
                    h8 = new androidx.collection.H<>(obj2);
                    c1105p0Z.f13111f = h8;
                }
                int i12 = c1105p0Z.f13110e;
                int iD = h8.d(obj);
                if (iD < 0) {
                    iD = ~iD;
                    i10 = -1;
                } else {
                    i10 = h8.f9105c[iD];
                }
                h8.f9104b[iD] = obj;
                h8.f9105c[iD] = i12;
                if (i10 == c1105p0Z.f13110e) {
                    return;
                }
            }
            if (obj instanceof androidx.compose.runtime.snapshots.p) {
                ((androidx.compose.runtime.snapshots.p) obj).z(1);
            }
            androidx.compose.runtime.collection.e.a(this.f13084h, obj, c1105p0Z);
            if (obj instanceof InterfaceC1116x) {
                InterfaceC1116x<?> interfaceC1116x = (InterfaceC1116x) obj;
                DerivedSnapshotState.a aVarX = interfaceC1116x.x();
                androidx.collection.K<Object, Object> k10 = this.f13086k;
                androidx.compose.runtime.collection.e.c(k10, obj);
                androidx.collection.H h10 = aVarX.f12828e;
                Object[] objArr = h10.f9104b;
                long[] jArr = h10.f9103a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j = jArr[i13];
                        aVar = aVarX;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j & 255) < 128) {
                                    androidx.compose.runtime.snapshots.o oVar = (androidx.compose.runtime.snapshots.o) objArr[(i13 << 3) + i16];
                                    if (oVar instanceof androidx.compose.runtime.snapshots.p) {
                                        ((androidx.compose.runtime.snapshots.p) oVar).z(1);
                                    }
                                    androidx.compose.runtime.collection.e.a(k10, oVar, obj);
                                    i14 = 8;
                                }
                                j >>= i14;
                            }
                            if (i15 != i14) {
                                break;
                            }
                            if (i13 != length) {
                                break;
                            }
                            i13++;
                            aVarX = aVar;
                        } else if (i13 != length) {
                            break;
                            break;
                        } else {
                            i13++;
                            aVarX = aVar;
                        }
                    }
                } else {
                    aVar = aVarX;
                }
                Object obj3 = aVar.f12829f;
                androidx.collection.K<InterfaceC1116x<?>, Object> k11 = c1105p0Z.f13112g;
                if (k11 == null) {
                    k11 = new androidx.collection.K<>((Object) null);
                    c1105p0Z.f13112g = k11;
                }
                k11.l(interfaceC1116x, obj3);
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1107q0
    public final void b() {
        this.f13091p = true;
    }

    @Override // androidx.compose.runtime.InterfaceC1107q0
    public final InvalidationResult c(C1105p0 c1105p0, Object obj) {
        C1100n c1100n;
        int i10 = c1105p0.f13106a;
        if ((i10 & 2) != 0) {
            c1105p0.f13106a = i10 | 4;
        }
        C1074a c1074a = c1105p0.f13108c;
        if (c1074a == null || !c1074a.a()) {
            return InvalidationResult.f12852b;
        }
        if (this.f13083g.A(c1074a)) {
            return c1105p0.f13109d != null ? C(c1105p0, c1074a, obj) : InvalidationResult.f12852b;
        }
        synchronized (this.f13081e) {
            c1100n = this.f13092q;
        }
        if (c1100n != null) {
            C1086g c1086g = c1100n.f13095t;
            if (c1086g.f12985E && c1086g.v0(c1105p0, obj)) {
                return InvalidationResult.f12855e;
            }
        }
        return InvalidationResult.f12852b;
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final boolean d() {
        return this.f13097v;
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final void dispose() {
        synchronized (this.f13081e) {
            try {
                if (this.f13095t.f12985E) {
                    C1091i0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f13097v) {
                    this.f13097v = true;
                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.f12793b;
                    C.a aVar = this.f13095t.f12991K;
                    if (aVar != null) {
                        p(aVar);
                    }
                    boolean z10 = this.f13083g.f12771c > 0;
                    if (z10 || !this.f13082f.f9126b.b()) {
                        androidx.compose.runtime.internal.e eVar = new androidx.compose.runtime.internal.e(this.f13082f);
                        if (z10) {
                            this.f13079c.getClass();
                            D0 d0V = this.f13083g.v();
                            try {
                                C1090i.h(d0V, eVar);
                                p293xa.r rVar = p293xa.r.f47939a;
                                d0V.e(true);
                                this.f13079c.i();
                                this.f13079c.j();
                                eVar.b();
                            } catch (Throwable th) {
                                d0V.e(false);
                                throw th;
                            }
                        }
                        eVar.a();
                    }
                    C1086g c1086g = this.f13095t;
                    c1086g.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c1086g.f12999b.q(c1086g);
                        c1086g.f12984D.clear();
                        c1086g.f13014r.clear();
                        c1086g.f13002e.f2219c.i0();
                        c1086g.f13017u = null;
                        c1086g.f12998a.i();
                        p293xa.r rVar2 = p293xa.r.f47939a;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                p293xa.r rVar3 = p293xa.r.f47939a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f13078b.r(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void e(ScatterSetWrapper scatterSetWrapper) {
        Object obj;
        while (true) {
            Object obj2 = this.f13080d.get();
            if (obj2 == null ? true : obj2.equals(C1102o.f13104a)) {
                obj = scatterSetWrapper;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, scatterSetWrapper};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f13080d).toString());
                }
                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj2;
                kotlin.jvm.internal.i.e(setArr, "<this>");
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = scatterSetWrapper;
                obj = objArrCopyOf;
            }
            AtomicReference<Object> atomicReference = this.f13080d;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f13081e) {
                            A();
                            p293xa.r rVar = p293xa.r.f47939a;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void f(Ia.a<p293xa.r> aVar) {
        C1086g c1086g = this.f13095t;
        if (c1086g.f12985E) {
            C1090i.c("Preparing a composition while composing is not supported");
        }
        c1086g.f12985E = true;
        try {
            ((Recomposer$performRecompose$1$1) aVar).invoke();
        } finally {
            c1086g.f12985E = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    @Override // androidx.compose.runtime.InterfaceC1115w
    public final boolean g(Set<? extends Object> set) {
        boolean z10 = set instanceof ScatterSetWrapper;
        androidx.collection.K<Object, Object> k10 = this.f13086k;
        androidx.collection.K<Object, Object> k11 = this.f13084h;
        if (z10) {
            ScatterSet<T> scatterSet = ((ScatterSetWrapper) set).f12940b;
            Object[] objArr = scatterSet.f9123b;
            long[] jArr = scatterSet.f9122a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (k11.b(obj) || k10.b(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (k11.b(obj2) || k10.b(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h(Object obj, boolean z10) {
        int i10;
        Object objD = this.f13084h.d(obj);
        if (objD == null) {
            return;
        }
        boolean z11 = objD instanceof androidx.collection.L;
        androidx.collection.L<C1105p0> l10 = this.f13085i;
        androidx.collection.L<C1105p0> l11 = this.j;
        androidx.collection.K<Object, Object> k10 = this.f13089n;
        if (!z11) {
            C1105p0 c1105p0 = (C1105p0) objD;
            if (androidx.compose.runtime.collection.e.b(k10, obj, c1105p0) || c1105p0.c(obj) == InvalidationResult.f12852b) {
                return;
            }
            if (c1105p0.f13112g == null || z10) {
                l10.d(c1105p0);
                return;
            } else {
                l11.d(c1105p0);
                return;
            }
        }
        androidx.collection.L l12 = (androidx.collection.L) objD;
        Object[] objArr = l12.f9123b;
        long[] jArr = l12.f9122a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j = jArr[i11];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j) < 128) {
                        C1105p0 c1105p1 = (C1105p0) objArr[(i11 << 3) + i14];
                        if (!androidx.compose.runtime.collection.e.b(k10, obj, c1105p1) && c1105p1.c(obj) != InvalidationResult.f12852b) {
                            if (c1105p1.f13112g == null || z10) {
                                l10.d(c1105p1);
                            } else {
                                l11.d(c1105p1);
                            }
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x00d0 A[EDGE_INSN: B:194:0x00d0->B:37:0x00d0 BREAK  A[LOOP:2: B:24:0x0077->B:35:0x00bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x018c A[EDGE_INSN: B:216:0x018c->B:72:0x018c BREAK  A[LOOP:13: B:59:0x0148->B:70:0x0184], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[LOOP:2: B:24:0x0077->B:35:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0184 A[LOOP:13: B:59:0x0148->B:70:0x0184, LOOP_END] */
    public final void i(Set<? extends Object> set, boolean z10) {
        androidx.collection.K<Object, Object> k10;
        long[] jArr;
        String str;
        int i10;
        String str2;
        boolean zA;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr2;
        int i11;
        String str5;
        long[] jArr3;
        int i12;
        int i13;
        long j;
        boolean zB;
        long[] jArr4;
        Object[] objArr3;
        long[] jArr5;
        Object[] objArr4;
        Object[] objArr5;
        androidx.collection.K<Object, Object> k11;
        Object[] objArr6;
        androidx.collection.K<Object, Object> k12;
        int i14;
        int i15;
        int i16;
        boolean z11 = set instanceof ScatterSetWrapper;
        androidx.collection.K<Object, Object> k13 = this.f13086k;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i17 = 8;
        if (z11) {
            ScatterSet<T> scatterSet = ((ScatterSetWrapper) set).f12940b;
            Object[] objArr7 = scatterSet.f9123b;
            long[] jArr6 = scatterSet.f9122a;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j11 = jArr6[i18];
                    if ((((~j11) << c10) & j11 & j10) != j10) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j11 & 255) < 128) {
                                Object obj = objArr7[(i18 << 3) + i20];
                                if (obj instanceof C1105p0) {
                                    ((C1105p0) obj).c(null);
                                } else {
                                    h(obj, z10);
                                    Object objD = k13.d(obj);
                                    if (objD != null) {
                                        if (objD instanceof androidx.collection.L) {
                                            androidx.collection.L l10 = (androidx.collection.L) objD;
                                            Object[] objArr8 = l10.f9123b;
                                            long[] jArr7 = l10.f9122a;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                k12 = k13;
                                                int i21 = 0;
                                                while (true) {
                                                    long j12 = jArr7[i21];
                                                    i14 = i19;
                                                    i15 = i20;
                                                    if ((((~j12) << c10) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i21 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c10 = 7;
                                                    } else {
                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                            if ((j12 & 255) < 128) {
                                                                h((InterfaceC1116x) objArr8[(i21 << 3) + i23], z10);
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i22 != 8) {
                                                            break;
                                                        }
                                                        if (i21 != length2) {
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c10 = 7;
                                                    }
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            k12 = k13;
                                            i14 = i19;
                                            i15 = i20;
                                            h((InterfaceC1116x) objD, z10);
                                        }
                                    }
                                    i16 = 8;
                                }
                                objArr6 = objArr7;
                                k12 = k13;
                                i14 = i19;
                                i15 = i20;
                                i16 = 8;
                            } else {
                                objArr6 = objArr7;
                                k12 = k13;
                                i14 = i19;
                                i15 = i20;
                                i16 = i17;
                            }
                            j11 >>= i16;
                            i20 = i15 + 1;
                            i17 = i16;
                            k13 = k12;
                            i19 = i14;
                            c10 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        k11 = k13;
                        if (i19 != i17) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        k11 = k13;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    objArr7 = objArr5;
                    k13 = k11;
                    c10 = 7;
                    j10 = -9187201950435737472L;
                    i17 = 8;
                }
            }
        } else {
            androidx.collection.K<Object, Object> k14 = k13;
            for (Object obj2 : set) {
                if (obj2 instanceof C1105p0) {
                    ((C1105p0) obj2).c(null);
                    k10 = k14;
                } else {
                    h(obj2, z10);
                    k10 = k14;
                    Object objD2 = k10.d(obj2);
                    if (objD2 != null) {
                        if (objD2 instanceof androidx.collection.L) {
                            androidx.collection.L l11 = (androidx.collection.L) objD2;
                            Object[] objArr9 = l11.f9123b;
                            long[] jArr8 = l11.f9122a;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j13 = jArr8[i24];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i24 != length3) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    } else {
                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j13 & 255) < 128) {
                                                h((InterfaceC1116x) objArr9[(i24 << 3) + i26], z10);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i25 != 8) {
                                            break;
                                        } else if (i24 != length3) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        } else {
                            h((InterfaceC1116x) objD2, z10);
                        }
                    }
                }
                k14 = k10;
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        androidx.collection.K<Object, Object> k15 = this.f13084h;
        androidx.collection.L<C1105p0> l12 = this.f13085i;
        if (z10) {
            androidx.collection.L<C1105p0> l13 = this.j;
            if (l13.c()) {
                long[] jArr9 = k15.f9127a;
                int length4 = jArr9.length - 2;
                if (length4 >= 0) {
                    int i27 = 0;
                    while (true) {
                        long j14 = jArr9[i27];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i28 = 8 - ((~(i27 - length4)) >>> 31);
                            int i29 = 0;
                            while (i29 < i28) {
                                if ((j14 & 255) < 128) {
                                    int i30 = (i27 << 3) + i29;
                                    Object obj3 = k15.f9128b[i30];
                                    Object obj4 = k15.f9129c[i30];
                                    if (obj4 instanceof androidx.collection.L) {
                                        kotlin.jvm.internal.i.c(obj4, str6);
                                        androidx.collection.L l14 = (androidx.collection.L) obj4;
                                        Object[] objArr10 = l14.f9123b;
                                        long[] jArr10 = l14.f9122a;
                                        jArr3 = jArr9;
                                        int length5 = jArr10.length - 2;
                                        str5 = str6;
                                        i12 = length4;
                                        i13 = i27;
                                        if (length5 >= 0) {
                                            int i31 = 0;
                                            while (true) {
                                                long j15 = jArr10[i31];
                                                j = j14;
                                                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                    int i33 = 0;
                                                    while (i33 < i32) {
                                                        if ((j15 & 255) < 128) {
                                                            jArr5 = jArr10;
                                                            int i34 = (i31 << 3) + i33;
                                                            objArr4 = objArr10;
                                                            C1105p0 c1105p0 = (C1105p0) objArr10[i34];
                                                            if (l13.a(c1105p0) || l12.a(c1105p0)) {
                                                                l14.m(i34);
                                                            }
                                                        } else {
                                                            jArr5 = jArr10;
                                                            objArr4 = objArr10;
                                                        }
                                                        j15 >>= 8;
                                                        i33++;
                                                        jArr10 = jArr5;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                    if (i32 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                }
                                                if (i31 == length5) {
                                                    break;
                                                }
                                                i31++;
                                                j14 = j;
                                                jArr10 = jArr4;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j = j14;
                                        }
                                        zB = l14.b();
                                    } else {
                                        str5 = str6;
                                        jArr3 = jArr9;
                                        i12 = length4;
                                        i13 = i27;
                                        j = j14;
                                        kotlin.jvm.internal.i.c(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C1105p0 c1105p1 = (C1105p0) obj4;
                                        zB = l13.a(c1105p1) || l12.a(c1105p1);
                                    }
                                    if (zB) {
                                        k15.k(i30);
                                    }
                                } else {
                                    str5 = str6;
                                    jArr3 = jArr9;
                                    i12 = length4;
                                    i13 = i27;
                                    j = j14;
                                }
                                j14 = j >> 8;
                                i29++;
                                length4 = i12;
                                jArr9 = jArr3;
                                str6 = str5;
                                i27 = i13;
                            }
                            str4 = str6;
                            jArr2 = jArr9;
                            int i35 = length4;
                            int i36 = i27;
                            if (i28 != 8) {
                                break;
                            }
                            length4 = i35;
                            i11 = i36;
                        } else {
                            str4 = str6;
                            jArr2 = jArr9;
                            i11 = i27;
                        }
                        if (i11 == length4) {
                            break;
                        }
                        i27 = i11 + 1;
                        jArr9 = jArr2;
                        str6 = str4;
                    }
                }
                l13.e();
                s();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (l12.c()) {
            long[] jArr11 = k15.f9127a;
            int length6 = jArr11.length - 2;
            if (length6 >= 0) {
                int i37 = 0;
                while (true) {
                    long j16 = jArr11[i37];
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                        int i39 = 0;
                        while (i39 < i38) {
                            if ((j16 & 255) < 128) {
                                int i40 = (i37 << 3) + i39;
                                Object obj5 = k15.f9128b[i40];
                                Object obj6 = k15.f9129c[i40];
                                if (obj6 instanceof androidx.collection.L) {
                                    String str8 = str7;
                                    kotlin.jvm.internal.i.c(obj6, str8);
                                    androidx.collection.L l15 = (androidx.collection.L) obj6;
                                    Object[] objArr11 = l15.f9123b;
                                    long[] jArr12 = l15.f9122a;
                                    int length7 = jArr12.length - 2;
                                    if (length7 >= 0) {
                                        int i41 = 0;
                                        while (true) {
                                            long j17 = jArr12[i41];
                                            long[] jArr13 = jArr12;
                                            i10 = i38;
                                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i42 = 8 - ((~(i41 - length7)) >>> 31);
                                                int i43 = 0;
                                                while (i43 < i42) {
                                                    if ((j17 & 255) < 128) {
                                                        str3 = str8;
                                                        int i44 = (i41 << 3) + i43;
                                                        objArr2 = objArr11;
                                                        if (l12.a((C1105p0) objArr11[i44])) {
                                                            l15.m(i44);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j17 >>= 8;
                                                    i43++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i42 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i41 == length7) {
                                                break;
                                            }
                                            i41++;
                                            i38 = i10;
                                            jArr12 = jArr13;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i10 = i38;
                                    }
                                    zA = l15.b();
                                } else {
                                    i10 = i38;
                                    str2 = str7;
                                    kotlin.jvm.internal.i.c(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zA = l12.a((C1105p0) obj6);
                                }
                                if (zA) {
                                    k15.k(i40);
                                }
                            } else {
                                jArr11 = jArr11;
                                length6 = length6;
                                i10 = i38;
                                str2 = str7;
                                i37 = i37;
                            }
                            j16 >>= 8;
                            i39++;
                            length6 = length6;
                            jArr11 = jArr11;
                            i37 = i37;
                            i38 = i10;
                            str7 = str2;
                        }
                        jArr = jArr11;
                        int i45 = length6;
                        str = str7;
                        int i46 = i37;
                        if (i38 != 8) {
                            break;
                        }
                        length6 = i45;
                        i37 = i46;
                    } else {
                        jArr = jArr11;
                        str = str7;
                    }
                    if (i37 == length6) {
                        break;
                    }
                    i37++;
                    jArr11 = jArr;
                    str7 = str;
                }
            }
            s();
            l12.e();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void j(ArrayList arrayList) throws Exception {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((T) ((Pair) arrayList.get(i10)).c()).f12926c.equals(this)) {
                C1090i.c("Check failed");
                break;
            }
        }
        try {
            C1086g c1086g = this.f13095t;
            c1086g.getClass();
            try {
                c1086g.b0(arrayList);
                c1086g.O();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                c1086g.M();
                throw th;
            }
        } catch (Throwable th2) {
            MutableSetWrapper mutableSetWrapper = this.f13082f;
            try {
                if (!mutableSetWrapper.f9126b.b()) {
                    new ArrayList();
                    if (!mutableSetWrapper.f9126b.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                            kotlin.sequences.h hVar = anonymousClass1.f9100c;
                            while (hVar.hasNext()) {
                                t0 t0Var = (t0) hVar.next();
                                anonymousClass1.remove();
                                t0Var.b();
                            }
                            p293xa.r rVar2 = p293xa.r.f47939a;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                throw th2;
            } catch (Exception e10) {
                r();
                throw e10;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void k() {
        synchronized (this.f13081e) {
            try {
                if (this.f13088m.f2219c.l0()) {
                    p(this.f13088m);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f13082f.f9126b.b()) {
                            MutableSetWrapper mutableSetWrapper = this.f13082f;
                            new ArrayList();
                            if (!mutableSetWrapper.f9126b.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                                    while (anonymousClass1.f9100c.hasNext()) {
                                        t0 t0Var = (t0) anonymousClass1.f9100c.next();
                                        anonymousClass1.remove();
                                        t0Var.b();
                                    }
                                    p293xa.r rVar2 = p293xa.r.f47939a;
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void l() {
        synchronized (this.f13081e) {
            try {
                p(this.f13087l);
                A();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f13082f.f9126b.b()) {
                            MutableSetWrapper mutableSetWrapper = this.f13082f;
                            new ArrayList();
                            if (!mutableSetWrapper.f9126b.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                                    while (anonymousClass1.f9100c.hasNext()) {
                                        t0 t0Var = (t0) anonymousClass1.f9100c.next();
                                        anonymousClass1.remove();
                                        t0Var.b();
                                    }
                                    p293xa.r rVar2 = p293xa.r.f47939a;
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final boolean m() {
        return this.f13095t.f12985E;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void n(Object obj) {
        synchronized (this.f13081e) {
            try {
                D(obj);
                Object objD = this.f13086k.d(obj);
                if (objD != null) {
                    if (objD instanceof androidx.collection.L) {
                        androidx.collection.L l10 = (androidx.collection.L) objD;
                        Object[] objArr = l10.f9123b;
                        long[] jArr = l10.f9122a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j = jArr[i10];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i10 != length) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j) < 128) {
                                            D((InterfaceC1116x) objArr[(i10 << 3) + i12]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        D((InterfaceC1116x) objD);
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final boolean o() {
        boolean z10;
        synchronized (this.f13081e) {
            z10 = this.f13090o.f9131e > 0;
        }
        return z10;
    }

    public final void p(C.a aVar) throws Throwable {
        androidx.compose.runtime.internal.e eVar;
        long[] jArr;
        androidx.compose.runtime.internal.e eVar2;
        long[] jArr2;
        int i10;
        int i11;
        char c10;
        long j;
        int i12;
        boolean zB;
        long[] jArr3;
        long[] jArr4;
        int i13 = 1;
        C.a aVar2 = this.f13088m;
        androidx.compose.runtime.internal.e eVar3 = new androidx.compose.runtime.internal.e(this.f13082f);
        try {
            if (aVar.f2219c.k0()) {
                if (aVar2.f2219c.k0()) {
                    eVar3.a();
                    return;
                }
                return;
            }
            try {
                Trace.beginSection("Compose:applyChanges");
                try {
                    androidx.compose.ui.node.f0 f0Var = this.f13079c;
                    f0Var.getClass();
                    D0 d0V = this.f13083g.v();
                    int i14 = 0;
                    try {
                        aVar.i0(f0Var, d0V, eVar3);
                        p293xa.r rVar = p293xa.r.f47939a;
                        d0V.e(true);
                        f0Var.j();
                        Trace.endSection();
                        eVar3.b();
                        androidx.compose.runtime.collection.c<Ia.a<p293xa.r>> cVar = eVar3.f13059e;
                        if (cVar.f12945d != 0) {
                            Trace.beginSection("Compose:sideeffects");
                            try {
                                Ia.a<p293xa.r>[] aVarArr = cVar.f12943b;
                                int i15 = cVar.f12945d;
                                for (int i16 = 0; i16 < i15; i16++) {
                                    aVarArr[i16].invoke();
                                }
                                cVar.j();
                                p293xa.r rVar2 = p293xa.r.f47939a;
                                Trace.endSection();
                            } catch (Throwable th) {
                                Trace.endSection();
                                throw th;
                            }
                        }
                        if (this.f13091p) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f13091p = false;
                                androidx.collection.K<Object, Object> k10 = this.f13084h;
                                long[] jArr5 = k10.f9127a;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i17 = 0;
                                    while (true) {
                                        long j10 = jArr5[i17];
                                        char c11 = 7;
                                        long j11 = -9187201950435737472L;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i18 = 8;
                                            int i19 = 8 - ((~(i17 - length)) >>> 31);
                                            while (i14 < i19) {
                                                if ((j10 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i14;
                                                    Object obj = k10.f9128b[i20];
                                                    Object obj2 = k10.f9129c[i20];
                                                    if (obj2 instanceof androidx.collection.L) {
                                                        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                        androidx.collection.L l10 = (androidx.collection.L) obj2;
                                                        Object[] objArr = l10.f9123b;
                                                        long[] jArr6 = l10.f9122a;
                                                        int length2 = jArr6.length - 2;
                                                        eVar2 = eVar3;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j12 = jArr6[i21];
                                                                    i10 = length;
                                                                    i11 = i14;
                                                                    c10 = 7;
                                                                    j = -9187201950435737472L;
                                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                        int i23 = 0;
                                                                        while (i23 < i22) {
                                                                            if ((j12 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i24 = (i21 << 3) + i23;
                                                                                if (!((C1105p0) objArr[i24]).b()) {
                                                                                    l10.m(i24);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j12 >>= 8;
                                                                            i23++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                    }
                                                                    if (i21 == length2) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                    length = i10;
                                                                    i14 = i11;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = length;
                                                            i11 = i14;
                                                            c10 = 7;
                                                            j = -9187201950435737472L;
                                                        }
                                                        zB = l10.b();
                                                    } else {
                                                        eVar2 = eVar3;
                                                        jArr2 = jArr5;
                                                        i10 = length;
                                                        i11 = i14;
                                                        c10 = c11;
                                                        j = -9187201950435737472L;
                                                        kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                        zB = !((C1105p0) obj2).b();
                                                    }
                                                    if (zB) {
                                                        k10.k(i20);
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    eVar2 = eVar3;
                                                    jArr2 = jArr5;
                                                    i10 = length;
                                                    i11 = i14;
                                                    c10 = c11;
                                                    j = j11;
                                                    i12 = i18;
                                                }
                                                j10 >>= i12;
                                                i13 = 1;
                                                i14 = i11 + 1;
                                                i18 = i12;
                                                c11 = c10;
                                                j11 = j;
                                                eVar3 = eVar2;
                                                jArr5 = jArr2;
                                                length = i10;
                                            }
                                            eVar = eVar3;
                                            jArr = jArr5;
                                            int i25 = length;
                                            if (i19 != i18) {
                                                break;
                                            } else {
                                                length = i25;
                                            }
                                        } else {
                                            eVar = eVar3;
                                            jArr = jArr5;
                                        }
                                        if (i17 == length) {
                                            break;
                                        }
                                        i17 += i13;
                                        eVar3 = eVar;
                                        jArr5 = jArr;
                                        i14 = 0;
                                    }
                                } else {
                                    eVar = eVar3;
                                }
                                s();
                                p293xa.r rVar3 = p293xa.r.f47939a;
                                Trace.endSection();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            eVar = eVar3;
                        }
                        if (aVar2.f2219c.k0()) {
                            eVar.a();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        try {
                            d0V.e(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (aVar2.f2219c.k0()) {
            eVar3.a();
        }
        throw th;
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final <R> R q(InterfaceC1115w interfaceC1115w, int i10, Ia.a<? extends R> aVar) {
        if (interfaceC1115w == null || interfaceC1115w.equals(this) || i10 < 0) {
            return aVar.invoke();
        }
        this.f13092q = (C1100n) interfaceC1115w;
        this.f13093r = i10;
        try {
            return aVar.invoke();
        } finally {
            this.f13092q = null;
            this.f13093r = 0;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void r() {
        this.f13080d.set(null);
        this.f13087l.f2219c.i0();
        this.f13088m.f2219c.i0();
        MutableSetWrapper mutableSetWrapper = this.f13082f;
        if (mutableSetWrapper.f9126b.b()) {
            return;
        }
        new ArrayList();
        if (mutableSetWrapper.f9126b.b()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
            kotlin.sequences.h hVar = anonymousClass1.f9100c;
            while (hVar.hasNext()) {
                t0 t0Var = (t0) hVar.next();
                anonymousClass1.remove();
                t0Var.b();
            }
            p293xa.r rVar = p293xa.r.f47939a;
        } finally {
            Trace.endSection();
        }
    }

    public final void s() {
        long[] jArr;
        int i10;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        boolean zB;
        long[] jArr3;
        Object[] objArr;
        long[] jArr4;
        androidx.collection.K<Object, Object> k10 = this.f13086k;
        long[] jArr5 = k10.f9127a;
        int length = jArr5.length - 2;
        char c10 = 7;
        long j = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j10 = jArr5[i15];
                if ((((~j10) << c10) & j10 & j) != j) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = k10.f9128b[i18];
                            Object obj2 = k10.f9129c[i18];
                            boolean z10 = obj2 instanceof androidx.collection.L;
                            androidx.collection.K<Object, Object> k11 = this.f13084h;
                            if (z10) {
                                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                androidx.collection.L l10 = (androidx.collection.L) obj2;
                                Object[] objArr2 = l10.f9123b;
                                long[] jArr6 = l10.f9122a;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i11 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j11 = jArr6[i19];
                                        i12 = i15;
                                        Object[] objArr3 = objArr2;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                int i22 = i21;
                                                Object[] objArr4 = objArr3;
                                                if ((j11 & 255) < 128) {
                                                    int i23 = (i19 << 3) + i22;
                                                    jArr4 = jArr6;
                                                    if (!k11.b((InterfaceC1116x) objArr4[i23])) {
                                                        l10.m(i23);
                                                    }
                                                } else {
                                                    jArr4 = jArr6;
                                                }
                                                j11 >>= 8;
                                                i21 = i22 + 1;
                                                objArr3 = objArr4;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr = objArr3;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        objArr2 = objArr;
                                        i15 = i12;
                                        jArr6 = jArr3;
                                    }
                                } else {
                                    i12 = i15;
                                }
                                zB = l10.b();
                            } else {
                                jArr2 = jArr5;
                                i11 = length;
                                i12 = i15;
                                kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zB = !k11.b((InterfaceC1116x) obj2);
                            }
                            if (zB) {
                                k10.k(i18);
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i11 = length;
                            i12 = i15;
                            i13 = i14;
                        }
                        j10 >>= i13;
                        i17++;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i11;
                        i15 = i12;
                    }
                    jArr = jArr5;
                    int i24 = length;
                    int i25 = i15;
                    if (i16 != i14) {
                        break;
                    }
                    length = i24;
                    i10 = i25;
                } else {
                    jArr = jArr5;
                    i10 = i15;
                }
                if (i10 == length) {
                    break;
                }
                i15 = i10 + 1;
                jArr5 = jArr;
                c10 = 7;
                j = -9187201950435737472L;
                i14 = 8;
            }
        }
        androidx.collection.L<C1105p0> l11 = this.j;
        if (!l11.c()) {
            return;
        }
        Object[] objArr5 = l11.f9123b;
        long[] jArr7 = l11.f9122a;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i26 = 0;
        while (true) {
            long j12 = jArr7[i26];
            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i27 = 8 - ((~(i26 - length3)) >>> 31);
                for (int i28 = 0; i28 < i27; i28++) {
                    if ((j12 & 255) < 128) {
                        int i29 = (i26 << 3) + i28;
                        if (!(((C1105p0) objArr5[i29]).f13112g != null)) {
                            l11.m(i29);
                        }
                    }
                    j12 >>= 8;
                }
                if (i27 != 8) {
                    return;
                }
            }
            if (i26 == length3) {
                return;
            } else {
                i26++;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void t() {
        synchronized (this.f13081e) {
            try {
                this.f13095t.f13017u = null;
                if (!this.f13082f.f9126b.b()) {
                    MutableSetWrapper mutableSetWrapper = this.f13082f;
                    new ArrayList();
                    if (!mutableSetWrapper.f9126b.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                            while (anonymousClass1.f9100c.hasNext()) {
                                t0 t0Var = (t0) anonymousClass1.f9100c.next();
                                anonymousClass1.remove();
                                t0Var.b();
                            }
                            p293xa.r rVar = p293xa.r.f47939a;
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
                p293xa.r rVar2 = p293xa.r.f47939a;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f13082f.f9126b.b()) {
                            MutableSetWrapper mutableSetWrapper2 = this.f13082f;
                            new ArrayList();
                            if (!mutableSetWrapper2.f9126b.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    MutableSetWrapper.AnonymousClass1 anonymousClass2 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper2);
                                    while (anonymousClass2.f9100c.hasNext()) {
                                        t0 t0Var2 = (t0) anonymousClass2.f9100c.next();
                                        anonymousClass2.remove();
                                        t0Var2.b();
                                    }
                                    p293xa.r rVar3 = p293xa.r.f47939a;
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final boolean u() {
        boolean zE0;
        synchronized (this.f13081e) {
            try {
                z();
                try {
                    androidx.collection.K<Object, Object> k10 = this.f13090o;
                    this.f13090o = androidx.collection.U.b();
                    try {
                        E();
                        zE0 = this.f13095t.e0(k10);
                        if (!zE0) {
                            A();
                        }
                    } catch (Exception e10) {
                        this.f13090o = k10;
                        throw e10;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f13082f.f9126b.b()) {
                            MutableSetWrapper mutableSetWrapper = this.f13082f;
                            new ArrayList();
                            if (!mutableSetWrapper.f9126b.b()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                                    while (anonymousClass1.f9100c.hasNext()) {
                                        t0 t0Var = (t0) anonymousClass1.f9100c.next();
                                        anonymousClass1.remove();
                                        t0Var.b();
                                    }
                                    p293xa.r rVar = p293xa.r.f47939a;
                                } finally {
                                    Trace.endSection();
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e11) {
                        r();
                        throw e11;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zE0;
    }

    @Override // androidx.compose.runtime.InterfaceC1115w
    public final void v() {
        synchronized (this.f13081e) {
            try {
                for (Object obj : this.f13083g.f12772d) {
                    C1105p0 c1105p0 = obj instanceof C1105p0 ? (C1105p0) obj : null;
                    if (c1105p0 != null) {
                        c1105p0.invalidate();
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1092j
    public final void w(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar) {
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) pVar;
        if (this.f13097v) {
            C1091i0.b("The composition is disposed");
        }
        this.f13078b.a(this, composableLambdaImpl);
    }

    public final void x(ComposableLambdaImpl composableLambdaImpl) throws Exception {
        try {
            synchronized (this.f13081e) {
                z();
                androidx.collection.K<Object, Object> k10 = this.f13090o;
                this.f13090o = androidx.collection.U.b();
                try {
                    E();
                    C1086g c1086g = this.f13095t;
                    if (!c1086g.f13002e.f2219c.k0()) {
                        C1090i.c("Expected applyChanges() to have been called");
                    }
                    c1086g.R(k10, composableLambdaImpl);
                } catch (Exception e10) {
                    this.f13090o = k10;
                    throw e10;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f13082f.f9126b.b()) {
                    MutableSetWrapper mutableSetWrapper = this.f13082f;
                    new ArrayList();
                    if (!mutableSetWrapper.f9126b.b()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            MutableSetWrapper.AnonymousClass1 anonymousClass1 = new MutableSetWrapper.AnonymousClass1(mutableSetWrapper);
                            while (anonymousClass1.f9100c.hasNext()) {
                                t0 t0Var = (t0) anonymousClass1.f9100c.next();
                                anonymousClass1.remove();
                                t0Var.b();
                            }
                            p293xa.r rVar = p293xa.r.f47939a;
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                throw th;
            } catch (Exception e11) {
                r();
                throw e11;
            }
        }
    }

    public final void y() {
        synchronized (this.f13081e) {
            try {
                boolean z10 = this.f13083g.f12771c > 0;
                if (z10 || !this.f13082f.f9126b.b()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        androidx.compose.runtime.internal.e eVar = new androidx.compose.runtime.internal.e(this.f13082f);
                        if (z10) {
                            this.f13079c.getClass();
                            D0 d0V = this.f13083g.v();
                            try {
                                C1090i.e(d0V, eVar);
                                p293xa.r rVar = p293xa.r.f47939a;
                                d0V.e(true);
                                this.f13079c.j();
                                eVar.b();
                            } catch (Throwable th) {
                                d0V.e(false);
                                throw th;
                            }
                        }
                        eVar.a();
                        p293xa.r rVar2 = p293xa.r.f47939a;
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                this.f13084h.f();
                this.f13086k.f();
                this.f13090o.f();
                this.f13087l.f2219c.i0();
                this.f13088m.f2219c.i0();
                C1086g c1086g = this.f13095t;
                c1086g.f12984D.clear();
                c1086g.f13014r.clear();
                c1086g.f13002e.f2219c.i0();
                c1086g.f13017u = null;
                p293xa.r rVar3 = p293xa.r.f47939a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void z() {
        AtomicReference<Object> atomicReference = this.f13080d;
        Object obj = C1102o.f13104a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C1090i.d("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                i((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C1090i.d("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                i(set, true);
            }
        }
    }
}
