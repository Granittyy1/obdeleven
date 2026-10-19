package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* JADX INFO: compiled from: StateObjectImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInt f13224b = new AtomicInt(0);

    public final boolean y(int i10) {
        return (i10 & this.f13224b.get()) != 0;
    }

    public final void z(int i10) {
        AtomicInt atomicInt;
        int i11;
        do {
            atomicInt = this.f13224b;
            i11 = atomicInt.get();
            if ((i11 & i10) != 0) {
                return;
            }
        } while (!atomicInt.compareAndSet(i11, i11 | i10));
    }
}
