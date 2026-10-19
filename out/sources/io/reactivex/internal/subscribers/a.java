package io.reactivex.internal.subscribers;

import Fa.d;
import bc.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import ra.g;

/* JADX INFO: compiled from: BasicFuseableConditionalSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T, R> implements ra.a<T>, g<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ra.a<? super R> f40956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f40957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g<T> f40958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40960f;

    public a(ra.a<? super R> aVar) {
        this.f40956b = aVar;
    }

    @Override // bc.b
    public void a() {
        if (this.f40959e) {
            return;
        }
        this.f40959e = true;
        this.f40956b.a();
    }

    public final void b(Throwable th) {
        d.g(th);
        this.f40957c.cancel();
        onError(th);
    }

    @Override // bc.c
    public final void cancel() {
        this.f40957c.cancel();
    }

    @Override // ra.j
    public final void clear() {
        this.f40958d.clear();
    }

    @Override // bc.b
    public final void e(c cVar) {
        if (SubscriptionHelper.d(this.f40957c, cVar)) {
            this.f40957c = cVar;
            if (cVar instanceof g) {
                this.f40958d = (g) cVar;
            }
            this.f40956b.e(this);
        }
    }

    @Override // bc.c
    public final void g(long j) {
        this.f40957c.g(j);
    }

    @Override // ra.f
    public int h(int i10) {
        g<T> gVar = this.f40958d;
        if (gVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iH = gVar.h(i10);
        if (iH == 0) {
            return iH;
        }
        this.f40960f = iH;
        return iH;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return this.f40958d.isEmpty();
    }

    @Override // ra.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bc.b
    public void onError(Throwable th) {
        if (this.f40959e) {
            p231sa.a.c(th);
        } else {
            this.f40959e = true;
            this.f40956b.onError(th);
        }
    }
}
