package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class V extends W implements H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43210g = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43211h = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43212i = AtomicIntegerFieldUpdater.newUpdater(V.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2693i f43213d;

        public a(long j, C2693i c2693i) {
            super(j);
            this.f43213d = c2693i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f43213d.D(V.this, p293xa.r.f47939a);
        }

        @Override // kotlinx.coroutines.V.c
        public final String toString() {
            return super.toString() + this.f43213d;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f43215d;

        public b(Runnable runnable, long j) {
            super(j);
            this.f43215d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f43215d.run();
        }

        @Override // kotlinx.coroutines.V.c
        public final String toString() {
            return super.toString() + this.f43215d;
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static abstract class c implements Runnable, Comparable<c>, P, kotlinx.coroutines.internal.A {
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f43216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f43217c = -1;

        public c(long j) {
            this.f43216b = j;
        }

        @Override // kotlinx.coroutines.internal.A
        public final void a(d dVar) {
            if (this._heap == X.f43219a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = dVar;
        }

        public final int c(long j, d dVar, V v10) {
            synchronized (this) {
                if (this._heap == X.f43219a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.f43508a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V.f43210g;
                        v10.getClass();
                        if (V.f43212i.get(v10) != 0) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f43218c = j;
                        } else {
                            long j10 = cVar.f43216b;
                            if (j10 - j < 0) {
                                j = j10;
                            }
                            if (j - dVar.f43218c > 0) {
                                dVar.f43218c = j;
                            }
                        }
                        long j11 = this.f43216b;
                        long j12 = dVar.f43218c;
                        if (j11 - j12 < 0) {
                            this.f43216b = j12;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.f43216b - cVar.f43216b;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.P
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    D3.l lVar = X.f43219a;
                    if (obj == lVar) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof kotlinx.coroutines.internal.z ? (kotlinx.coroutines.internal.z) obj2 : null) != null) {
                                dVar.b(this.f43217c);
                            }
                        }
                    }
                    this._heap = lVar;
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.A
        public final void setIndex(int i10) {
            this.f43217c = i10;
        }

        public String toString() {
            return C4.a.h(new StringBuilder("Delayed[nanos="), this.f43216b, ']');
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    public static final class d extends kotlinx.coroutines.internal.z<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f43218c;
    }

    @Override // kotlinx.coroutines.H
    public final void N(long j, C2693i c2693i) {
        long j10 = 0;
        if (j > 0) {
            j10 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j10 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j10 + jNanoTime, c2693i);
            o1(jNanoTime, aVar);
            c2693i.v(new Q(aVar));
        }
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        l1(runnable);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {, blocks: (B:86:0x00e8, B:88:0x00ec), top: B:101:0x00e8 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00f4  */
    @Override // kotlinx.coroutines.U
    public final long h1() {
        Runnable runnable;
        d dVar;
        Object obj;
        c cVar;
        c cVarB;
        if (i1()) {
            return 0L;
        }
        d dVar2 = (d) f43211h.get(this);
        if (dVar2 != null && kotlinx.coroutines.internal.z.f43507b.get(dVar2) != 0) {
            long jNanoTime = System.nanoTime();
            do {
                synchronized (dVar2) {
                    try {
                        Object[] objArr = dVar2.f43508a;
                        Object obj2 = objArr != null ? objArr[0] : null;
                        if (obj2 == null) {
                            cVarB = null;
                        } else {
                            c cVar2 = (c) obj2;
                            cVarB = ((jNanoTime - cVar2.f43216b) > 0L ? 1 : ((jNanoTime - cVar2.f43216b) == 0L ? 0 : -1)) >= 0 ? m1(cVar2) : false ? dVar2.b(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (cVarB != null);
        }
        loop1: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43210g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 != null) {
                if (obj3 instanceof kotlinx.coroutines.internal.o) {
                    kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj3;
                    Object objD = oVar.d();
                    if (objD != kotlinx.coroutines.internal.o.f43494g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    kotlinx.coroutines.internal.o oVarC = oVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, oVarC) && atomicReferenceFieldUpdater.get(this) == obj3) {
                    }
                } else if (obj3 != X.f43220b) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, null)) {
                            runnable = (Runnable) obj3;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            runnable = null;
            break;
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kotlin.collections.i<L<?>> iVar = this.f43209e;
        if (((iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj4 = f43210g.get(this);
        if (obj4 == null) {
            dVar = (d) f43211h.get(this);
            if (dVar != null) {
                synchronized (dVar) {
                    Object[] objArr2 = dVar.f43508a;
                    obj = objArr2 != null ? objArr2[0] : null;
                }
                cVar = (c) obj;
                if (cVar != null) {
                    return Na.l.y(cVar.f43216b - System.nanoTime(), 0L);
                }
            }
        } else if (obj4 instanceof kotlinx.coroutines.internal.o) {
            long j = kotlinx.coroutines.internal.o.f43493f.get((kotlinx.coroutines.internal.o) obj4);
            if (!(((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30)))) {
                return 0L;
            }
            dVar = (d) f43211h.get(this);
            if (dVar != null) {
                synchronized (dVar) {
                    Object[] objArr3 = dVar.f43508a;
                    if (objArr3 != null) {
                    }
                    cVar = (c) obj;
                    if (cVar != null) {
                        return Na.l.y(cVar.f43216b - System.nanoTime(), 0L);
                    }
                }
            }
        } else if (obj4 != X.f43220b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    public void l1(Runnable runnable) {
        if (!m1(runnable)) {
            D.j.l1(runnable);
            return;
        }
        Thread threadJ1 = j1();
        if (Thread.currentThread() != threadJ1) {
            LockSupport.unpark(threadJ1);
        }
    }

    public P m0(long j, Runnable runnable, kotlin.coroutines.e eVar) {
        return E.f43173a.m0(j, runnable, eVar);
    }

    public final boolean m1(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43210g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f43212i.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                if (obj == X.f43220b) {
                    return false;
                }
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                oVar.a((Runnable) obj);
                oVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            kotlinx.coroutines.internal.o oVar2 = (kotlinx.coroutines.internal.o) obj;
            int iA = oVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                kotlinx.coroutines.internal.o oVarC = oVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean n1() {
        kotlin.collections.i<L<?>> iVar = this.f43209e;
        if (!(iVar != null ? iVar.isEmpty() : true)) {
            return false;
        }
        d dVar = (d) f43211h.get(this);
        if (dVar != null && kotlinx.coroutines.internal.z.f43507b.get(dVar) != 0) {
            return false;
        }
        Object obj = f43210g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof kotlinx.coroutines.internal.o) {
            long j = kotlinx.coroutines.internal.o.f43493f.get((kotlinx.coroutines.internal.o) obj);
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == X.f43220b) {
            return true;
        }
        return false;
    }

    public final void o1(long j, c cVar) {
        int iC;
        Thread threadJ1;
        boolean z10 = f43212i.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43211h;
        kotlinx.coroutines.internal.A a10 = null;
        if (z10) {
            iC = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.f43218c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.i.b(obj);
                dVar = (d) obj;
            }
            iC = cVar.c(j, dVar, this);
        }
        if (iC != 0) {
            if (iC == 1) {
                k1(j, cVar);
                return;
            } else {
                if (iC != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                kotlinx.coroutines.internal.A[] aArr = dVar3.f43508a;
                a10 = aArr != null ? aArr[0] : null;
            }
            a10 = (c) a10;
        }
        if (a10 != cVar || Thread.currentThread() == (threadJ1 = j1())) {
            return;
        }
        LockSupport.unpark(threadJ1);
    }

    @Override // kotlinx.coroutines.U
    public void shutdown() {
        c cVarB;
        D0.f43172a.set(null);
        f43212i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43210g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            D3.l lVar = X.f43220b;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                ((kotlinx.coroutines.internal.o) obj).b();
                break;
            } else {
                if (obj == lVar) {
                    break;
                }
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                oVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (h1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f43211h.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = kotlinx.coroutines.internal.z.f43507b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                k1(jNanoTime, cVar);
            }
        }
    }
}
