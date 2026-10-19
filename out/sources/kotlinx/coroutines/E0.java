package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements InterfaceC2681e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43174e = AtomicIntegerFieldUpdater.newUpdater(E0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2694i0 f43175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread f43176c = Thread.currentThread();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P f43177d;

    public E0(InterfaceC2694i0 interfaceC2694i0) {
        this.f43175b = interfaceC2694i0;
    }

    public static void c(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f43174e;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                c(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f43176c.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f43174e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        c(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                P p10 = this.f43177d;
                if (p10 != null) {
                    p10.dispose();
                    return;
                }
                return;
            }
        }
    }
}
