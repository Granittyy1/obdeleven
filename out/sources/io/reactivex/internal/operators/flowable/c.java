package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p123ja.j;

/* JADX INFO: compiled from: FlowableElementAtMaybe.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c<T> extends p123ja.h<T> implements ra.b<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlowableFlattenIterable f40748b;

    /* JADX INFO: compiled from: FlowableElementAtMaybe.java */
    public static final class a<T> implements p123ja.g<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j<? super T> f40749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bc.c f40750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f40751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f40752e;

        public a(j jVar) {
            this.f40749b = jVar;
        }

        @Override // bc.b
        public final void a() {
            this.f40750c = SubscriptionHelper.f40968b;
            if (this.f40752e) {
                return;
            }
            this.f40752e = true;
            this.f40749b.a();
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.f40752e) {
                return;
            }
            long j = this.f40751d;
            if (j != 0) {
                this.f40751d = j + 1;
                return;
            }
            this.f40752e = true;
            this.f40750c.cancel();
            this.f40750c = SubscriptionHelper.f40968b;
            this.f40749b.onSuccess(t8);
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40750c == SubscriptionHelper.f40968b;
        }

        @Override // p148la.b
        public final void dispose() {
            this.f40750c.cancel();
            this.f40750c = SubscriptionHelper.f40968b;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40750c, cVar)) {
                this.f40750c = cVar;
                this.f40749b.b(this);
                cVar.g(Long.MAX_VALUE);
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            if (this.f40752e) {
                p231sa.a.c(th);
                return;
            }
            this.f40752e = true;
            this.f40750c = SubscriptionHelper.f40968b;
            this.f40749b.onError(th);
        }
    }

    public c(FlowableFlattenIterable flowableFlattenIterable) {
        this.f40748b = flowableFlattenIterable;
    }

    @Override // p123ja.h
    public final void c(j<? super T> jVar) {
        this.f40748b.d(new a(jVar));
    }

    @Override // ra.b
    public final p123ja.d<T> d() {
        return new FlowableElementAt(this.f40748b);
    }
}
