package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43492e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43493f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final D3.l f43494g = new D3.l(4, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f43498d;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43499a;

        public a(int i10) {
            this.f43499a = i10;
        }
    }

    public o(int i10, boolean z10) {
        this.f43495a = i10;
        this.f43496b = z10;
        int i11 = i10 - 1;
        this.f43497c = i11;
        this.f43498d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43493f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (j & 2305843009213693952L) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j);
            int i11 = (int) ((1152921503533105152L & j) >> 30);
            int i12 = this.f43497c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f43498d;
            if (!this.f43496b && atomicReferenceArray.get(i11 & i12) != null) {
                int i13 = this.f43495a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i11 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i11 & i12, runnable);
                o<E> oVarC = this;
                while ((atomicLongFieldUpdater.get(oVarC) & 1152921504606846976L) != 0) {
                    oVarC = oVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = oVarC.f43498d;
                    int i14 = oVarC.f43497c & i11;
                    Object obj = atomicReferenceArray2.get(i14);
                    if ((obj instanceof a) && ((a) obj).f43499a == i11) {
                        atomicReferenceArray2.set(i14, runnable);
                    } else {
                        oVarC = null;
                    }
                    if (oVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f43493f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        while (true) {
            atomicLongFieldUpdater = f43493f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j10 = j | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j, j10)) {
                j = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43492e;
            o<E> oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o(this.f43495a * 2, this.f43496b);
            int i10 = (int) (1073741823 & j);
            int i11 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i12 = this.f43497c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object aVar = this.f43498d.get(i13);
                if (aVar == null) {
                    aVar = new a(i10);
                }
                oVar2.f43498d.set(oVar2.f43497c & i10, aVar);
                i10++;
            }
            atomicLongFieldUpdater.set(oVar2, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f43493f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return f43494g;
            }
            int i10 = (int) (j & 1073741823);
            int i11 = this.f43497c;
            int i12 = i10 & i11;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i11) == i12) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f43498d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z10 = this.f43496b;
            if (obj == null) {
                if (z10) {
                    return null;
                }
            } else {
                if (obj instanceof a) {
                    return null;
                }
                long j10 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & (-1073741824)) | j10)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                if (z10) {
                    o<E> oVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f43493f;
                        long j11 = atomicLongFieldUpdater2.get(oVarC);
                        int i13 = (int) (j11 & 1073741823);
                        if ((j11 & 1152921504606846976L) != 0) {
                            oVarC = oVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(oVarC, j11, (j11 & (-1073741824)) | j10)) {
                                oVarC.f43498d.set(oVarC.f43497c & i13, null);
                                oVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (oVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
