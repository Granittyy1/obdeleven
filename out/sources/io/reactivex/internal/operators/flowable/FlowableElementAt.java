package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableElementAt<T> extends a<T, T> {

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements p123ja.g<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40703s;

        public ElementAtSubscriber(p123ja.g gVar) {
            super(gVar);
            this.index = 0L;
            this.defaultValue = null;
            this.errorOnFewer = false;
        }

        @Override // bc.b
        public final void a() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t8 = this.defaultValue;
            if (t8 != null) {
                d(t8);
            } else if (this.errorOnFewer) {
                this.actual.onError(new NoSuchElementException());
            } else {
                this.actual.a();
            }
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.done) {
                return;
            }
            long j = this.count;
            if (j != this.index) {
                this.count = j + 1;
                return;
            }
            this.done = true;
            this.f40703s.cancel();
            d(t8);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, bc.c
        public final void cancel() {
            super.cancel();
            this.f40703s.cancel();
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40703s, cVar)) {
                this.f40703s = cVar;
                this.actual.e(this);
                cVar.g(Long.MAX_VALUE);
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            if (this.done) {
                p231sa.a.c(th);
            } else {
                this.done = true;
                this.actual.onError(th);
            }
        }
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40737c.d(new ElementAtSubscriber(gVar));
    }
}
