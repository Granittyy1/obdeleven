package Sa;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5722b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5723c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5724d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5725e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<f> f5726a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final f a(f fVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5723c;
        if (atomicIntegerFieldUpdater.get(this) - f5724d.get(this) == 127) {
            return fVar;
        }
        if (fVar.f5710c.a() == 1) {
            f5725e.incrementAndGet(this);
        }
        int i10 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<f> atomicReferenceArray = this.f5726a;
            if (atomicReferenceArray.get(i10) == null) {
                atomicReferenceArray.lazySet(i10, fVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final f b() {
        f andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5724d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f5723c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f5726a.getAndSet(i11, null)) != null) {
                if (andSet.f5710c.a() == 1) {
                    f5725e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final f c(int i10, boolean z10) {
        int i11 = i10 & 127;
        AtomicReferenceArray<f> atomicReferenceArray = this.f5726a;
        f fVar = atomicReferenceArray.get(i11);
        if (fVar != null) {
            if ((fVar.f5710c.a() == 1) == z10) {
                while (!atomicReferenceArray.compareAndSet(i11, fVar, null)) {
                    if (atomicReferenceArray.get(i11) != fVar) {
                    }
                }
                if (z10) {
                    f5725e.decrementAndGet(this);
                }
                return fVar;
            }
        }
        return null;
    }
}
