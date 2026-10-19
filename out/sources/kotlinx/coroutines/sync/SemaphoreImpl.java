package kotlinx.coroutines.sync;

import A8.p;
import Ia.l;
import J4.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.w;
import p293xa.r;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
public class SemaphoreImpl implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43594c = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43595d = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43596e = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43597f = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43598g = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Throwable, r> f43600b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreImpl(int i10, int i11) {
        this.f43599a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(i.b(i10, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(i.b(i10, "The number of acquired permits should be in 0..").toString());
        }
        e eVar = new e(0L, null, 2);
        this.head$volatile = eVar;
        this.tail$volatile = eVar;
        this._availablePermits$volatile = i10 - i11;
        this.f43600b = new l<Throwable, r>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                this.this$0.a();
                return r.f47939a;
            }
        };
    }

    @Override // kotlinx.coroutines.sync.c
    public final void a() {
        int i10;
        Object objA;
        boolean zC;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43598g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i11 = this.f43599a;
            if (andIncrement >= i11) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i11).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43594c;
            e eVar = (e) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f43595d.getAndIncrement(this);
            long j = andIncrement2 / ((long) d.f43609f);
            SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.f43602b;
            while (true) {
                objA = kotlinx.coroutines.internal.d.a(eVar, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (!w.b(objA)) {
                    v vVarA = w.a(objA);
                    while (true) {
                        v vVar = (v) atomicReferenceFieldUpdater.get(this);
                        if (vVar.f43504d >= vVarA.f43504d) {
                            break;
                        }
                        if (!vVarA.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarA)) {
                                if (!vVar.f()) {
                                    break;
                                }
                                vVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == vVar);
                        if (vVarA.f()) {
                            vVarA.e();
                        }
                    }
                } else {
                    break;
                }
            }
            e eVar2 = (e) w.a(objA);
            eVar2.b();
            zC = false;
            if (eVar2.f43504d <= j) {
                int i12 = (int) (andIncrement2 % ((long) d.f43609f));
                D3.l lVar = d.f43605b;
                AtomicReferenceArray atomicReferenceArray = eVar2.f43610f;
                Object andSet = atomicReferenceArray.getAndSet(i12, lVar);
                if (andSet == null) {
                    int i13 = d.f43604a;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i13) {
                            D3.l lVar2 = d.f43605b;
                            D3.l lVar3 = d.f43607d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i12, lVar2, lVar3)) {
                                    zC = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i12) == lVar2);
                            zC = !zC;
                            break;
                        }
                        if (atomicReferenceArray.get(i12) == d.f43606c) {
                            zC = true;
                            break;
                        }
                        i14++;
                    }
                } else if (andSet != d.f43608e) {
                    if (andSet instanceof InterfaceC2691h) {
                        InterfaceC2691h interfaceC2691h = (InterfaceC2691h) andSet;
                        D3.l lVarR = interfaceC2691h.r(r.f47939a, this.f43600b);
                        if (lVarR != null) {
                            interfaceC2691h.w(lVarR);
                            zC = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof kotlinx.coroutines.selects.e)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zC = ((kotlinx.coroutines.selects.e) andSet).c(this, r.f47939a);
                    }
                }
            }
        } while (!zC);
    }

    @Override // kotlinx.coroutines.sync.c
    public final Object b(ContinuationImpl continuationImpl) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i10;
        do {
            atomicIntegerFieldUpdater = f43598g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i10 = this.f43599a;
        } while (andDecrement > i10);
        if (andDecrement > 0) {
            return r.f47939a;
        }
        C2693i c2693iI = I.b.i(p.y(continuationImpl));
        try {
            if (!i(c2693iI)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i10) {
                        if (andDecrement2 > 0) {
                            c2693iI.q(r.f47939a, this.f43600b);
                            break;
                        }
                        if (i(c2693iI)) {
                            break;
                        }
                    }
                }
            }
            Object objP = c2693iI.p();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (objP != coroutineSingletons) {
                objP = r.f47939a;
            }
            return objP == coroutineSingletons ? objP : r.f47939a;
        } catch (Throwable th) {
            c2693iI.B();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.sync.c
    public final int c() {
        return Math.max(f43598g.get(this), 0);
    }

    @Override // kotlinx.coroutines.sync.c
    public final boolean h() {
        int i10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43598g;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f43599a;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 <= i12) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean i(K0 k10) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43596e;
        e eVar = (e) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f43597f.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.f43601b;
        long j = andIncrement / ((long) d.f43609f);
        loop0: while (true) {
            objA = kotlinx.coroutines.internal.d.a(eVar, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!w.b(objA)) {
                v vVarA = w.a(objA);
                while (true) {
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f43504d >= vVarA.f43504d) {
                        break loop0;
                    }
                    if (!vVarA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, vVar, vVarA)) {
                            if (!vVar.f()) {
                                break loop0;
                            }
                            vVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == vVar);
                    if (vVarA.f()) {
                        vVarA.e();
                    }
                }
            } else {
                break;
            }
        }
        e eVar2 = (e) w.a(objA);
        int i10 = (int) (andIncrement % ((long) d.f43609f));
        AtomicReferenceArray atomicReferenceArray = eVar2.f43610f;
        while (!atomicReferenceArray.compareAndSet(i10, null, k10)) {
            if (atomicReferenceArray.get(i10) != null) {
                D3.l lVar = d.f43605b;
                D3.l lVar2 = d.f43606c;
                while (!atomicReferenceArray.compareAndSet(i10, lVar, lVar2)) {
                    if (atomicReferenceArray.get(i10) != lVar) {
                        return false;
                    }
                }
                if (k10 instanceof InterfaceC2691h) {
                    ((InterfaceC2691h) k10).q(r.f47939a, this.f43600b);
                } else {
                    if (!(k10 instanceof kotlinx.coroutines.selects.e)) {
                        throw new IllegalStateException(("unexpected: " + k10).toString());
                    }
                    ((kotlinx.coroutines.selects.e) k10).e(r.f47939a);
                }
                return true;
            }
        }
        k10.d(eVar2, i10);
        return true;
    }
}
