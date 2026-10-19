package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;
import ra.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements e<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // ra.j
    public final boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
