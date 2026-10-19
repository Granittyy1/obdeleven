package io.reactivex.internal.subscribers;

import Fa.d;
import S6.i;
import bc.c;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.g;

/* JADX INFO: loaded from: classes3.dex */
public final class LambdaSubscriber<T> extends AtomicReference<c> implements g<T>, c, p148la.b {
    private static final long serialVersionUID = -7251123623727029452L;
    final p183oa.a onComplete;
    final p183oa.b<? super Throwable> onError;
    final p183oa.b<? super T> onNext;
    final p183oa.b<? super c> onSubscribe;

    public LambdaSubscriber(i iVar) {
        qa.a.i iVar2 = qa.a.f46192e;
        qa.a.b bVar = qa.a.f46190c;
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = FlowableInternalHelper$RequestMax.f40717b;
        this.onNext = iVar;
        this.onError = iVar2;
        this.onComplete = bVar;
        this.onSubscribe = flowableInternalHelper$RequestMax;
    }

    @Override // bc.b
    public final void a() {
        c cVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f40968b;
        if (cVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                d.g(th);
                p231sa.a.c(th);
            }
        }
    }

    @Override // bc.b
    public final void c(T t8) {
        if (d()) {
            return;
        }
        try {
            this.onNext.a(t8);
        } catch (Throwable th) {
            d.g(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // bc.c
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // p148la.b
    public final boolean d() {
        return get() == SubscriptionHelper.f40968b;
    }

    @Override // p148la.b
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // bc.b
    public final void e(c cVar) {
        if (SubscriptionHelper.b(this, cVar)) {
            try {
                this.onSubscribe.a(this);
            } catch (Throwable th) {
                d.g(th);
                cVar.cancel();
                onError(th);
            }
        }
    }

    @Override // bc.c
    public final void g(long j) {
        get().g(j);
    }

    @Override // bc.b
    public final void onError(Throwable th) {
        c cVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f40968b;
        if (cVar == subscriptionHelper) {
            p231sa.a.c(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.a(th);
        } catch (Throwable th2) {
            d.g(th2);
            p231sa.a.c(new CompositeException(th, th2));
        }
    }
}
