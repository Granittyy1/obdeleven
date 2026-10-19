package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.u0;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v<S extends v<S>> extends e<S> implements u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43503e = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43504d;

    public v(long j, S s10, int i10) {
        super(s10);
        this.f43504d = j;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // kotlinx.coroutines.internal.e
    public final boolean d() {
        return f43503e.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f43503e.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i10, kotlin.coroutines.e eVar);

    public final void i() {
        if (f43503e.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f43503e;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
