package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p148la.b;

/* JADX INFO: loaded from: classes.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    @Override // p148la.b
    public final boolean d() {
        return get() == null;
    }

    @Override // p148la.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        ((Runnable) andSet).run();
    }
}
