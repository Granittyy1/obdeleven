package io.reactivex.internal.subscriptions;

import bc.b;
import p123ja.g;

/* JADX INFO: loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final b<? super T> actual;
    protected T value;

    public DeferredScalarSubscription(g gVar) {
        this.actual = gVar;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // ra.j
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void d(T t8) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                b<? super T> bVar = this.actual;
                bVar.c(t8);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            this.value = t8;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t8;
        lazySet(16);
        b<? super T> bVar2 = this.actual;
        bVar2.c(t8);
        if (get() != 4) {
            bVar2.a();
        }
    }

    @Override // bc.c
    public final void g(long j) {
        T t8;
        if (SubscriptionHelper.c(j)) {
            do {
                int i10 = get();
                if ((i10 & (-2)) != 0) {
                    return;
                }
                if (i10 == 1) {
                    if (!compareAndSet(1, 3) || (t8 = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    b<? super T> bVar = this.actual;
                    bVar.c(t8);
                    if (get() != 4) {
                        bVar.a();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
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

    public void onSuccess(T t8) {
        d(t8);
    }

    @Override // ra.j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t8 = this.value;
        this.value = null;
        return t8;
    }
}
