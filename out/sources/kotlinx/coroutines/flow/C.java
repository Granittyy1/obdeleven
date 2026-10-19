package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C extends kotlinx.coroutines.flow.internal.c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<Object> f43305a = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.c
    public final boolean a(kotlinx.coroutines.flow.internal.a aVar) {
        AtomicReference<Object> atomicReference = this.f43305a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(B.f43303a);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public final kotlin.coroutines.c[] b(kotlinx.coroutines.flow.internal.a aVar) {
        this.f43305a.set(null);
        return kotlinx.coroutines.flow.internal.b.f43392a;
    }
}
