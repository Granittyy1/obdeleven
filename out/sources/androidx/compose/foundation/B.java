package androidx.compose.foundation;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f9706a = new AtomicReference<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutexImpl f9707b = kotlinx.coroutines.sync.b.a();

    /* JADX INFO: compiled from: MutatorMutex.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutatePriority f9708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2694i0 f9709b;

        public a(MutatePriority mutatePriority, InterfaceC2694i0 interfaceC2694i0) {
            this.f9708a = mutatePriority;
            this.f9709b = interfaceC2694i0;
        }
    }

    public static final void a(B b10, a aVar) {
        while (true) {
            AtomicReference<a> atomicReference = b10.f9706a;
            a aVar2 = atomicReference.get();
            if (aVar2 != null && aVar.f9708a.compareTo(aVar2.f9708a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(aVar2, aVar)) {
                    if (aVar2 != null) {
                        aVar2.f9709b.i(new MutationInterruptedException());
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == aVar2);
        }
    }

    public final Object b(MutatePriority mutatePriority, Ia.l lVar, ContinuationImpl continuationImpl) {
        return kotlinx.coroutines.B.d(new MutatorMutex$mutate$2(mutatePriority, this, lVar, null), continuationImpl);
    }

    public final Object c(Object obj, MutatePriority mutatePriority, Ia.p pVar, SuspendLambda suspendLambda) {
        return kotlinx.coroutines.B.d(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, obj, null), suspendLambda);
    }
}
