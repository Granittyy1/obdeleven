package io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p123ja.n;

/* JADX INFO: loaded from: classes3.dex */
public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements ra.e<T>, Runnable {
    private static final long serialVersionUID = 3880992722410194083L;
    final n<? super T> observer;
    final T value;

    public ObservableScalarXMap$ScalarDisposable(n<? super T> nVar, T t8) {
        this.observer = nVar;
        this.value = t8;
    }

    @Override // ra.j
    public final void clear() {
        lazySet(3);
    }

    @Override // p148la.b
    public final boolean d() {
        return get() == 3;
    }

    @Override // p148la.b
    public final void dispose() {
        set(3);
    }

    @Override // ra.f
    public final int h(int i10) {
        lazySet(1);
        return 1;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // ra.j
    public final boolean offer(T t8) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ra.j
    public final T poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.c(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.a();
            }
        }
    }
}
