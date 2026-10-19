package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class K<T> extends kotlinx.coroutines.internal.u<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43194f = AtomicIntegerFieldUpdater.newUpdater(K.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public K() {
        throw null;
    }

    @Override // kotlinx.coroutines.internal.u, kotlinx.coroutines.JobSupport
    public final void A(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f43194f;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                kotlinx.coroutines.internal.i.a(A8.p.y(this.f43502e), p006a5.a.f(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // kotlinx.coroutines.internal.u, kotlinx.coroutines.JobSupport
    public final void z(Object obj) {
        A(obj);
    }
}
