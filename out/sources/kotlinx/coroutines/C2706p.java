package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: kotlinx.coroutines.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2706p<T> extends JobSupport implements InterfaceC2705o<T> {
    @Override // kotlinx.coroutines.InterfaceC2705o
    public final boolean h(Throwable th) {
        return c0(new C2708s(th, false));
    }

    @Override // kotlinx.coroutines.F
    public final T p() throws Throwable {
        Object objW = W();
        if (objW instanceof InterfaceC2677c0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objW instanceof C2708s) {
            throw ((C2708s) objW).f43531a;
        }
        return (T) o0.a(objW);
    }

    @Override // kotlinx.coroutines.F
    public final Object s(SuspendLambda suspendLambda) {
        Object objD = D(suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objD;
    }
}
