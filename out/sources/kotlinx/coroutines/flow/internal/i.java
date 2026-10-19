package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.internal.u;

/* JADX INFO: compiled from: FlowCoroutine.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i<T> extends u<T> {
    @Override // kotlinx.coroutines.JobSupport
    public final boolean J(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return E(th);
    }
}
