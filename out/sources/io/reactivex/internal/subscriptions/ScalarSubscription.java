package io.reactivex.internal.subscriptions;

import bc.b;
import java.util.concurrent.atomic.AtomicInteger;
import ra.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements g<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final b<? super T> subscriber;
    final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public ScalarSubscription(p123ja.g gVar, Object obj) {
        this.subscriber = gVar;
        this.value = obj;
    }

    @Override // bc.c
    public final void cancel() {
        lazySet(2);
    }

    @Override // ra.j
    public final void clear() {
        lazySet(1);
    }

    @Override // bc.c
    public final void g(long j) {
        if (SubscriptionHelper.c(j) && compareAndSet(0, 1)) {
            b<? super T> bVar = this.subscriber;
            bVar.c(this.value);
            if (get() != 2) {
                bVar.a();
            }
        }
    }

    @Override // ra.f
    public final int h(int i10) {
        return 1;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // ra.j
    public final boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ra.j
    public final T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }
}
