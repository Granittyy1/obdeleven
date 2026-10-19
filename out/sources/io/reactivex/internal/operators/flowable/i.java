package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.ArrayList;
import java.util.Collection;
import p123ja.p;
import p123ja.q;

/* JADX INFO: compiled from: FlowableToListSingle.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i<T, U extends Collection<? super T>> extends p<U> implements ra.b<U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowableFlatMapMaybe f40765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayListSupplier f40766c;

    /* JADX INFO: compiled from: FlowableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements p123ja.g<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<? super U> f40767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bc.c f40768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f40769d;

        public a(q<? super U> qVar, U u10) {
            this.f40767b = qVar;
            this.f40769d = u10;
        }

        @Override // bc.b
        public final void a() {
            this.f40768c = SubscriptionHelper.f40968b;
            this.f40767b.onSuccess(this.f40769d);
        }

        @Override // bc.b
        public final void c(T t8) {
            this.f40769d.add(t8);
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40768c == SubscriptionHelper.f40968b;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40768c.cancel();
            this.f40768c = SubscriptionHelper.f40968b;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40768c, cVar)) {
                this.f40768c = cVar;
                this.f40767b.b(this);
                cVar.g(Long.MAX_VALUE);
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            this.f40769d = null;
            this.f40768c = SubscriptionHelper.f40968b;
            this.f40767b.onError(th);
        }
    }

    public i(FlowableFlatMapMaybe flowableFlatMapMaybe) {
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.f40970b;
        this.f40765b = flowableFlatMapMaybe;
        this.f40766c = arrayListSupplier;
    }

    @Override // ra.b
    public final p123ja.d<U> d() {
        return new FlowableToList(this.f40765b, this.f40766c);
    }

    @Override // p123ja.p
    public final void e(q<? super U> qVar) {
        try {
            this.f40766c.getClass();
            this.f40765b.d(new a(qVar, new ArrayList()));
        } catch (Throwable th) {
            Fa.d.g(th);
            qVar.b(EmptyDisposable.f40664b);
            qVar.onError(th);
        }
    }
}
