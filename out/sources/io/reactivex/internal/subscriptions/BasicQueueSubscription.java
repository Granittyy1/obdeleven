package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicLong;
import ra.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // ra.j
    public final boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
