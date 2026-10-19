package io.reactivex.internal.observers;

import p123ja.n;

/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final n<? super T> actual;
    protected T value;

    public DeferredScalarDisposable(n<? super T> nVar) {
        this.actual = nVar;
    }

    public void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.actual.a();
    }

    @Override // ra.j
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    @Override // p148la.b
    public final boolean d() {
        return get() == 4;
    }

    @Override // p148la.b
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // ra.f
    public final int h(int i10) {
        lazySet(8);
        return 2;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onError(Throwable th) {
        if ((get() & 54) != 0) {
            p231sa.a.c(th);
        } else {
            lazySet(2);
            this.actual.onError(th);
        }
    }

    public void onSuccess(T t8) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        n<? super T> nVar = this.actual;
        if (i10 == 8) {
            this.value = t8;
            lazySet(16);
            nVar.c(null);
        } else {
            lazySet(2);
            nVar.c(t8);
        }
        if (get() != 4) {
            nVar.a();
        }
    }

    @Override // ra.j
    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t8 = this.value;
        this.value = null;
        lazySet(32);
        return t8;
    }
}
