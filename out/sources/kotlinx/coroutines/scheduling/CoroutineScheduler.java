package kotlinx.coroutines.scheduling;

import D3.l;
import Q8.d;
import Sa.c;
import Sa.f;
import Sa.g;
import Sa.h;
import Sa.i;
import Sa.k;
import com.braze.support.BrazeLogger;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C;
import kotlinx.coroutines.internal.t;
import p293xa.r;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43533i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43534k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final l f43535l = new l(4, "NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43537c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f43540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f43541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t<a> f43542h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class WorkerState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final WorkerState f43543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final WorkerState f43544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final WorkerState f43545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final WorkerState f43546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final WorkerState f43547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ WorkerState[] f43548g;

        static {
            WorkerState workerState = new WorkerState("CPU_ACQUIRED", 0);
            f43543b = workerState;
            WorkerState workerState2 = new WorkerState("BLOCKING", 1);
            f43544c = workerState2;
            WorkerState workerState3 = new WorkerState("PARKING", 2);
            f43545d = workerState3;
            WorkerState workerState4 = new WorkerState("DORMANT", 3);
            f43546e = workerState4;
            WorkerState workerState5 = new WorkerState("TERMINATED", 4);
            f43547f = workerState5;
            WorkerState[] workerStateArr = {workerState, workerState2, workerState3, workerState4, workerState5};
            f43548g = workerStateArr;
            kotlin.enums.a.a(workerStateArr);
        }

        public WorkerState() {
            throw null;
        }

        public static WorkerState valueOf(String str) {
            return (WorkerState) Enum.valueOf(WorkerState.class, str);
        }

        public static WorkerState[] values() {
            return (WorkerState[]) f43548g.clone();
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k f43549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Ref$ObjectRef<f> f43550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public WorkerState f43551d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f43552e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f43553f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f43554g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f43555h;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public a() {
            throw null;
        }

        public a(int i10) {
            setDaemon(true);
            setContextClassLoader(CoroutineScheduler.this.getClass().getClassLoader());
            this.f43549b = new k();
            this.f43550c = new Ref$ObjectRef<>();
            this.f43551d = WorkerState.f43546e;
            this.nextParkedWorker = CoroutineScheduler.f43535l;
            int iNanoTime = (int) System.nanoTime();
            this.f43554g = iNanoTime == 0 ? 42 : iNanoTime;
            f(i10);
        }

        public final f a(boolean z10) {
            f fVarE;
            f fVarE2;
            CoroutineScheduler coroutineScheduler;
            long j10;
            WorkerState workerState = this.f43551d;
            WorkerState workerState2 = WorkerState.f43543b;
            f fVar = null;
            k kVar = this.f43549b;
            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
            if (workerState != workerState2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
                do {
                    coroutineScheduler = CoroutineScheduler.this;
                    j10 = atomicLongFieldUpdater.get(coroutineScheduler);
                    if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                        kVar.getClass();
                        loop1: while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f5722b;
                            f fVar2 = (f) atomicReferenceFieldUpdater.get(kVar);
                            if (fVar2 == null || fVar2.f5710c.a() != 1) {
                                int i10 = k.f5724d.get(kVar);
                                int i11 = k.f5723c.get(kVar);
                                while (i10 != i11 && k.f5725e.get(kVar) != 0) {
                                    i11--;
                                    f fVarC = kVar.c(i11, true);
                                    if (fVarC != null) {
                                        fVar = fVarC;
                                        break;
                                    }
                                }
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(kVar, fVar2, null)) {
                                    fVar = fVar2;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(kVar) == fVar2);
                        }
                        if (fVar != null) {
                            return fVar;
                        }
                        f fVarD = coroutineScheduler2.f43541g.d();
                        return fVarD == null ? i(1) : fVarD;
                    }
                } while (!CoroutineScheduler.j.compareAndSet(coroutineScheduler, j10, j10 - 4398046511104L));
                this.f43551d = WorkerState.f43543b;
            }
            if (z10) {
                boolean z11 = d(coroutineScheduler2.f43536b * 2) == 0;
                if (z11 && (fVarE2 = e()) != null) {
                    return fVarE2;
                }
                kVar.getClass();
                f fVarB = (f) k.f5722b.getAndSet(kVar, null);
                if (fVarB == null) {
                    fVarB = kVar.b();
                }
                if (fVarB != null) {
                    return fVarB;
                }
                if (!z11 && (fVarE = e()) != null) {
                    return fVarE;
                }
            } else {
                f fVarE3 = e();
                if (fVarE3 != null) {
                    return fVarE3;
                }
            }
            return i(3);
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f43554g;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f43554g = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & BrazeLogger.SUPPRESS) % i10;
        }

        public final f e() {
            int iD = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (iD == 0) {
                f fVarD = coroutineScheduler.f43540f.d();
                return fVarD != null ? fVarD : coroutineScheduler.f43541g.d();
            }
            f fVarD2 = coroutineScheduler.f43541g.d();
            return fVarD2 != null ? fVarD2 : coroutineScheduler.f43540f.d();
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f43539e);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.f43551d;
            boolean z10 = workerState2 == WorkerState.f43543b;
            if (z10) {
                CoroutineScheduler.j.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f43551d = workerState;
            }
            return z10;
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:55:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:68:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:70:0x00e1 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [Sa.f, T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [Sa.f] */
        /* JADX WARN: Type inference failed for: r7v9, types: [Sa.f] */
        public final f i(int i10) {
            int i11;
            T tC;
            long j10;
            T t8;
            Object obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            int i12 = (int) (atomicLongFieldUpdater.get(coroutineScheduler) & 2097151);
            Object obj2 = null;
            if (i12 < 2) {
                return null;
            }
            int iD = d(i12);
            int i13 = 0;
            long jMin = Long.MAX_VALUE;
            while (i13 < i12) {
                int i14 = iD + 1;
                if (i14 > i12) {
                    i14 = 1;
                }
                a aVarB = coroutineScheduler.f43542h.b(i14);
                if (aVarB == null || aVarB == this) {
                    i11 = i14;
                } else {
                    k kVar = aVarB.f43549b;
                    if (i10 != 3) {
                        kVar.getClass();
                        int i15 = k.f5724d.get(kVar);
                        int i16 = k.f5723c.get(kVar);
                        boolean z10 = i10 == 1;
                        while (true) {
                            if (i15 != i16 && (!z10 || k.f5725e.get(kVar) != 0)) {
                                int i17 = i15 + 1;
                                tC = kVar.c(i15, z10);
                                if (tC != 0) {
                                    break;
                                }
                                i15 = i17;
                            } else {
                                tC = obj2;
                                break;
                            }
                        }
                    } else {
                        tC = kVar.b();
                    }
                    Ref$ObjectRef<f> ref$ObjectRef = this.f43550c;
                    Object obj3 = obj2;
                    if (tC != 0) {
                        ref$ObjectRef.element = tC;
                        i11 = i14;
                        obj = obj2;
                    } else {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k.f5722b;
                            ?? r14 = (f) atomicReferenceFieldUpdater.get(kVar);
                            if (r14 != 0) {
                                if (((r14.f5710c.a() == 1 ? 1 : 2) & i10) != 0) {
                                    i.f5718f.getClass();
                                    i11 = i14;
                                    long jNanoTime = System.nanoTime() - r14.f5709b;
                                    long j11 = i.f5714b;
                                    if (jNanoTime < j11) {
                                        j10 = j11 - jNanoTime;
                                        t8 = 0;
                                        break;
                                    }
                                    while (true) {
                                        obj = null;
                                        if (atomicReferenceFieldUpdater.compareAndSet(kVar, r14, null)) {
                                            ref$ObjectRef.element = r14;
                                        } else if (atomicReferenceFieldUpdater.get(kVar) != r14) {
                                            i14 = i11;
                                            obj3 = null;
                                        }
                                    }
                                }
                            }
                            i11 = i14;
                            j10 = -2;
                            t8 = obj3;
                            break;
                        }
                        if (j10 == -1) {
                            f fVar = ref$ObjectRef.element;
                            ref$ObjectRef.element = t8;
                            return fVar;
                        }
                        if (j10 > 0) {
                            jMin = Math.min(jMin, j10);
                        }
                    }
                    j10 = -1;
                    t8 = obj;
                    if (j10 == -1) {
                        f fVar2 = ref$ObjectRef.element;
                        ref$ObjectRef.element = t8;
                        return fVar2;
                    }
                    if (j10 > 0) {
                        jMin = Math.min(jMin, j10);
                    }
                }
                i13++;
                iD = i11;
                obj2 = null;
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f43553f = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11 = false;
            loop0: while (true) {
                boolean z12 = z11;
                while (true) {
                    CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                    coroutineScheduler.getClass();
                    if (CoroutineScheduler.f43534k.get(coroutineScheduler) == 0) {
                        WorkerState workerState = this.f43551d;
                        WorkerState workerState2 = WorkerState.f43547f;
                        if (workerState == workerState2) {
                            break loop0;
                        }
                        f fVarA = a(this.f43555h);
                        long j10 = -2097152;
                        if (fVarA != null) {
                            this.f43553f = 0L;
                            int iA = fVarA.f5710c.a();
                            this.f43552e = 0L;
                            if (this.f43551d == WorkerState.f43545d) {
                                this.f43551d = WorkerState.f43544c;
                            }
                            CoroutineScheduler coroutineScheduler2 = CoroutineScheduler.this;
                            if (iA != 0 && h(WorkerState.f43544c) && !coroutineScheduler2.p() && !coroutineScheduler2.j(CoroutineScheduler.j.get(coroutineScheduler2))) {
                                coroutineScheduler2.p();
                            }
                            coroutineScheduler2.getClass();
                            try {
                                fVarA.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            if (iA != 0) {
                                CoroutineScheduler.j.addAndGet(coroutineScheduler2, -2097152L);
                                if (this.f43551d == workerState2) {
                                    break;
                                }
                                this.f43551d = WorkerState.f43546e;
                                break;
                            }
                            break;
                        }
                        this.f43555h = z11;
                        if (this.f43553f == 0) {
                            Object obj = this.nextParkedWorker;
                            l lVar = CoroutineScheduler.f43535l;
                            if (obj != lVar ? true : z11) {
                                j.set(this, -1);
                                while (this.nextParkedWorker != CoroutineScheduler.f43535l) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                                    if (atomicIntegerFieldUpdater.get(this) != -1) {
                                        break;
                                    }
                                    CoroutineScheduler coroutineScheduler3 = CoroutineScheduler.this;
                                    coroutineScheduler3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = CoroutineScheduler.f43534k;
                                    if (atomicIntegerFieldUpdater2.get(coroutineScheduler3) != 0) {
                                        break;
                                    }
                                    WorkerState workerState3 = this.f43551d;
                                    WorkerState workerState4 = WorkerState.f43547f;
                                    if (workerState3 == workerState4) {
                                        break;
                                    }
                                    h(WorkerState.f43545d);
                                    Thread.interrupted();
                                    if (this.f43552e == 0) {
                                        this.f43552e = System.nanoTime() + CoroutineScheduler.this.f43538d;
                                    }
                                    LockSupport.parkNanos(CoroutineScheduler.this.f43538d);
                                    if (System.nanoTime() - this.f43552e >= 0) {
                                        this.f43552e = 0L;
                                        CoroutineScheduler coroutineScheduler4 = CoroutineScheduler.this;
                                        synchronized (coroutineScheduler4.f43542h) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(coroutineScheduler4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.j;
                                                    if (((int) (atomicLongFieldUpdater.get(coroutineScheduler4) & 2097151)) > coroutineScheduler4.f43536b && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i10 = this.indexInArray;
                                                        z10 = false;
                                                        f(0);
                                                        coroutineScheduler4.i(this, i10, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(coroutineScheduler4) & 2097151);
                                                        if (andDecrement != i10) {
                                                            a aVarB = coroutineScheduler4.f43542h.b(andDecrement);
                                                            kotlin.jvm.internal.i.b(aVarB);
                                                            a aVar = aVarB;
                                                            coroutineScheduler4.f43542h.c(i10, aVar);
                                                            aVar.f(i10);
                                                            coroutineScheduler4.i(aVar, andDecrement, i10);
                                                        }
                                                        coroutineScheduler4.f43542h.c(andDecrement, null);
                                                        r rVar = r.f47939a;
                                                        this.f43551d = workerState4;
                                                    }
                                                }
                                                z10 = false;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                    z11 = z10;
                                }
                            } else {
                                CoroutineScheduler coroutineScheduler5 = CoroutineScheduler.this;
                                coroutineScheduler5.getClass();
                                if (this.nextParkedWorker == lVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = CoroutineScheduler.f43533i;
                                        long j11 = atomicLongFieldUpdater2.get(coroutineScheduler5);
                                        int i11 = this.indexInArray;
                                        this.nextParkedWorker = coroutineScheduler5.f43542h.b((int) (j11 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(coroutineScheduler5, j11, ((2097152 + j11) & j10) | ((long) i11))) {
                                            break;
                                        } else {
                                            j10 = -2097152;
                                        }
                                    }
                                }
                            }
                            z11 = z11;
                        } else {
                            if (z12) {
                                h(WorkerState.f43545d);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f43553f);
                                this.f43553f = 0L;
                                break;
                            }
                            z12 = true;
                        }
                    } else {
                        break loop0;
                    }
                }
            }
            h(WorkerState.f43547f);
        }
    }

    public CoroutineScheduler(String str, int i10, long j10, int i11) {
        this.f43536b = i10;
        this.f43537c = i11;
        this.f43538d = j10;
        this.f43539e = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(J4.i.c(i10, "Core pool size ", " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(A8.f.d(i11, i10, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(J4.i.c(i11, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f43540f = new c();
        this.f43541g = new c();
        this.f43542h = new t<>((i10 + 1) * 2);
        this.controlState$volatile = ((long) i10) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void h(CoroutineScheduler coroutineScheduler, Runnable runnable, boolean z10, int i10) {
        g gVar = i.f5719g;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        coroutineScheduler.c(runnable, gVar, z10);
    }

    public final int b() {
        synchronized (this.f43542h) {
            try {
                if (f43534k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = j;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f43536b) {
                    return 0;
                }
                if (i10 >= this.f43537c) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f43542h.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(i12);
                this.f43542h.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, g gVar, boolean z10) {
        f hVar;
        i.f5718f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof f) {
            hVar = (f) runnable;
            hVar.f5709b = jNanoTime;
            hVar.f5710c = gVar;
        } else {
            hVar = new h(runnable, jNanoTime, gVar);
        }
        boolean z11 = false;
        boolean z12 = hVar.f5710c.a() == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        long jAddAndGet = z12 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.i.a(CoroutineScheduler.this, this)) {
            aVar = null;
        }
        if (aVar != null && aVar.f43551d != WorkerState.f43547f && (hVar.f5710c.a() != 0 || aVar.f43551d != WorkerState.f43544c)) {
            aVar.f43555h = true;
            k kVar = aVar.f43549b;
            if (z10) {
                hVar = kVar.a(hVar);
            } else {
                kVar.getClass();
                f fVar = (f) k.f5722b.getAndSet(kVar, hVar);
                hVar = fVar == null ? null : kVar.a(fVar);
            }
        }
        if (hVar != null) {
            if (!(hVar.f5710c.a() == 1 ? this.f43541g.a(hVar) : this.f43540f.a(hVar))) {
                throw new RejectedExecutionException(d.a(new StringBuilder(), this.f43539e, " was terminated"));
            }
        }
        if (z10 && aVar != null) {
            z11 = true;
        }
        if (z12) {
            if (z11 || p() || j(jAddAndGet)) {
                return;
            }
            p();
            return;
        }
        if (z11 || p() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        p();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i10;
        f fVarD;
        if (f43534k.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !kotlin.jvm.internal.i.a(CoroutineScheduler.this, this)) {
                aVar = null;
            }
            synchronized (this.f43542h) {
                i10 = (int) (j.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    a aVarB = this.f43542h.b(i11);
                    kotlin.jvm.internal.i.b(aVarB);
                    a aVar2 = aVarB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        k kVar = aVar2.f43549b;
                        c cVar = this.f43541g;
                        kVar.getClass();
                        f fVar = (f) k.f5722b.getAndSet(kVar, null);
                        if (fVar != null) {
                            cVar.a(fVar);
                        }
                        while (true) {
                            f fVarB = kVar.b();
                            if (fVarB == null) {
                                break;
                            } else {
                                cVar.a(fVarB);
                            }
                        }
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f43541g.b();
            this.f43540f.b();
            while (true) {
                if (aVar != null) {
                    fVarD = aVar.a(true);
                    if (fVarD == null) {
                        fVarD = this.f43540f.d();
                        if (fVarD == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    fVarD = this.f43540f.d();
                    if (fVarD == null && (fVarD = this.f43541g.d()) == null) {
                        break;
                    }
                }
                try {
                    fVarD.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(WorkerState.f43547f);
            }
            f43533i.set(this, 0L);
            j.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(this, runnable, false, 6);
    }

    public final void i(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f43533i.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f43535l) {
                            i12 = -1;
                            break;
                        }
                        if (objC == null) {
                            i12 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i12 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0) {
                if (f43533i.compareAndSet(this, j10, ((long) i12) | j11)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f43536b;
        if (i10 < i11) {
            int iB = b();
            if (iB == 1 && i11 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean p() {
        l lVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43533i;
            long j10 = atomicLongFieldUpdater.get(this);
            a aVarB = this.f43542h.b((int) (2097151 & j10));
            if (aVarB == null) {
                aVarB = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVarB.c();
                while (true) {
                    lVar = f43535l;
                    if (objC == lVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar = (a) objC;
                    iB = aVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | ((long) iB))) {
                    aVarB.g(lVar);
                }
            }
            if (aVarB == null) {
                return false;
            }
            if (a.j.compareAndSet(aVarB, -1, 0)) {
                LockSupport.unpark(aVarB);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        t<a> tVar = this.f43542h;
        int iA = tVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVarB = tVar.b(i15);
            if (aVarB != null) {
                k kVar = aVarB.f43549b;
                kVar.getClass();
                int i16 = k.f5722b.get(kVar) != null ? (k.f5723c.get(kVar) - k.f5724d.get(kVar)) + 1 : k.f5723c.get(kVar) - k.f5724d.get(kVar);
                int iOrdinal = aVarB.f43551d.ordinal();
                if (iOrdinal == 0) {
                    i10++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i11++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i12++;
                } else if (iOrdinal == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (iOrdinal == 4) {
                    i14++;
                }
            }
        }
        long j10 = j.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f43539e);
        sb5.append('@');
        sb5.append(C.l(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f43536b;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.f43537c);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f43540f.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f43541g.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
