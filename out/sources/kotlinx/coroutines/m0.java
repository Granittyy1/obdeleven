package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m0 extends LockFreeLinkedListNode implements InterfaceC2681e0, P, InterfaceC2677c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JobSupport f43513e;

    @Override // kotlinx.coroutines.InterfaceC2677c0
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2677c0
    public final r0 d() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode, kotlinx.coroutines.P
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        JobSupport jobSupportK = k();
        while (true) {
            Object objW = jobSupportK.W();
            if (!(objW instanceof m0)) {
                if (!(objW instanceof InterfaceC2677c0) || ((InterfaceC2677c0) objW).d() == null) {
                    return;
                }
                j();
                return;
            }
            if (objW != this) {
                return;
            }
            T t8 = o0.f43523g;
            do {
                atomicReferenceFieldUpdater = JobSupport.f43184b;
                if (atomicReferenceFieldUpdater.compareAndSet(jobSupportK, objW, t8)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(jobSupportK) == objW);
        }
    }

    public InterfaceC2694i0 getParent() {
        return k();
    }

    public final JobSupport k() {
        JobSupport jobSupport = this.f43513e;
        if (jobSupport != null) {
            return jobSupport;
        }
        kotlin.jvm.internal.i.m("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public final String toString() {
        return getClass().getSimpleName() + '@' + C.l(this) + "[job@" + C.l(k()) + ']';
    }
}
