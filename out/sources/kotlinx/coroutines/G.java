package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public class G<T> extends AbstractC2672a<T> implements F<T> {
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
