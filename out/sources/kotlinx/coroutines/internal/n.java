package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public class n<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43491a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43491a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int iA = oVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                o<E> oVarC = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43491a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o<E> oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) f43491a.get(this);
        oVar.getClass();
        long j = o.f43493f.get(oVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43491a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) oVar.d();
            if (e10 != o.f43494g) {
                return e10;
            }
            o<E> oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
