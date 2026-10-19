package io.reactivex.internal.subscribers;

import bc.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p123ja.g;

/* JADX INFO: compiled from: BasicFuseableSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T, R> implements g<T>, ra.g<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f40961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f40962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ra.g<T> f40963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f40964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40965f;

    public b(g gVar) {
        this.f40961b = gVar;
    }

    @Override // bc.b
    public void a() {
        if (this.f40964e) {
            return;
        }
        this.f40964e = true;
        this.f40961b.a();
    }

    @Override // bc.c
    public final void cancel() {
        this.f40962c.cancel();
    }

    @Override // ra.j
    public final void clear() {
        this.f40963d.clear();
    }

    @Override // bc.b
    public final void e(c cVar) {
        if (SubscriptionHelper.d(this.f40962c, cVar)) {
            this.f40962c = cVar;
            if (cVar instanceof ra.g) {
                this.f40963d = (ra.g) cVar;
            }
            this.f40961b.e(this);
        }
    }

    @Override // bc.c
    public final void g(long j) {
        this.f40962c.g(j);
    }

    @Override // ra.f
    public int h(int i10) {
        ra.g<T> gVar = this.f40963d;
        if (gVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iH = gVar.h(i10);
        if (iH == 0) {
            return iH;
        }
        this.f40965f = iH;
        return iH;
    }

    @Override // ra.j
    public final boolean isEmpty() {
        return this.f40963d.isEmpty();
    }

    @Override // ra.j
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bc.b
    public void onError(Throwable th) {
        if (this.f40964e) {
            p231sa.a.c(th);
        } else {
            this.f40964e = true;
            this.f40961b.onError(th);
        }
    }
}
