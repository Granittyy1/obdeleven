package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableToList<T, U extends Collection<? super T>> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayListSupplier f40735d;

    public static final class ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements p123ja.g<T>, bc.c {
        private static final long serialVersionUID = -8134157938864266736L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40736s;

        /* JADX WARN: Multi-variable type inference failed */
        public ToListSubscriber(p123ja.g gVar, Collection collection) {
            super(gVar);
            this.value = collection;
        }

        @Override // bc.b
        public final void a() {
            d(this.value);
        }

        @Override // bc.b
        public final void c(T t8) {
            Collection collection = (Collection) this.value;
            if (collection != null) {
                collection.add(t8);
            }
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, bc.c
        public final void cancel() {
            super.cancel();
            this.f40736s.cancel();
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40736s, cVar)) {
                this.f40736s = cVar;
                this.actual.e(this);
                cVar.g(Long.MAX_VALUE);
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            this.value = null;
            this.actual.onError(th);
        }
    }

    public FlowableToList(FlowableFlatMapMaybe flowableFlatMapMaybe, ArrayListSupplier arrayListSupplier) {
        super(flowableFlatMapMaybe);
        this.f40735d = arrayListSupplier;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        try {
            this.f40735d.getClass();
            this.f40737c.d(new ToListSubscriber(gVar, new ArrayList()));
        } catch (Throwable th) {
            Fa.d.g(th);
            EmptySubscription.b(th, gVar);
        }
    }
}
