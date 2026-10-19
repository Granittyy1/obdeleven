package kotlin.coroutines;

import Ia.p;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptyCoroutineContext implements e, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EmptyCoroutineContext f43032b = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return f43032b;
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, p<? super R, ? super e.a, ? extends R> operation) {
        i.e(operation, "operation");
        return r10;
    }

    @Override // kotlin.coroutines.e
    public final <E extends e.a> E get(e.b<E> key) {
        i.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.e
    public final e minusKey(e.b<?> key) {
        i.e(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.e
    public final e plus(e context) {
        i.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
