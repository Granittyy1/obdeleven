package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2701l extends AbstractC2698j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2693i<?> f43512f;

    public C2701l(C2693i<?> c2693i) {
        this.f43512f = c2693i;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        JobSupport jobSupportK = k();
        C2693i<?> c2693i = this.f43512f;
        Throwable thN = c2693i.n(jobSupportK);
        if (c2693i.y()) {
            kotlin.coroutines.c<?> cVar = c2693i.f43447e;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) cVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.f43475i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D3.l lVar = kotlinx.coroutines.internal.i.f43481b;
                if (kotlin.jvm.internal.i.a(obj, lVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, lVar, thN)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != lVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        c2693i.o(thN);
        if (c2693i.y()) {
            return;
        }
        c2693i.l();
    }
}
