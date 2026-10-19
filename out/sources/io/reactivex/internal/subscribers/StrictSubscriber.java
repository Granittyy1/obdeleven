package io.reactivex.internal.subscribers;

import S4.o;
import bc.c;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.g;

/* JADX INFO: loaded from: classes3.dex */
public class StrictSubscriber<T> extends AtomicInteger implements g<T>, c {
    private static final long serialVersionUID = -4945028590049415624L;
    final bc.b<? super T> actual;
    volatile boolean done;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final AtomicReference<c> f40955s = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(bc.b<? super T> bVar) {
        this.actual = bVar;
    }

    @Override // bc.b
    public final void a() {
        this.done = true;
        bc.b<? super T> bVar = this.actual;
        AtomicThrowable atomicThrowable = this.error;
        if (getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != null) {
                bVar.onError(thB);
            } else {
                bVar.a();
            }
        }
    }

    @Override // bc.b
    public final void c(T t8) {
        bc.b<? super T> bVar = this.actual;
        AtomicThrowable atomicThrowable = this.error;
        if (get() == 0 && compareAndSet(0, 1)) {
            bVar.c(t8);
            if (decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null) {
                    bVar.onError(thB);
                } else {
                    bVar.a();
                }
            }
        }
    }

    @Override // bc.c
    public final void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.a(this.f40955s);
    }

    @Override // bc.b
    public final void e(c cVar) {
        if (!this.once.compareAndSet(false, true)) {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.actual.e(this);
        AtomicReference<c> atomicReference = this.f40955s;
        AtomicLong atomicLong = this.requested;
        if (SubscriptionHelper.b(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.g(andSet);
            }
        }
    }

    @Override // bc.c
    public final void g(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException(com.google.gson.internal.b.b(j, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference<c> atomicReference = this.f40955s;
        AtomicLong atomicLong = this.requested;
        c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.g(j);
            return;
        }
        if (SubscriptionHelper.c(j)) {
            o.b(atomicLong, j);
            c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.g(andSet);
                }
            }
        }
    }

    @Override // bc.b
    public final void onError(Throwable th) {
        this.done = true;
        bc.b<? super T> bVar = this.actual;
        AtomicThrowable atomicThrowable = this.error;
        atomicThrowable.getClass();
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            p231sa.a.c(th);
        } else if (getAndIncrement() == 0) {
            bVar.onError(ExceptionHelper.b(atomicThrowable));
        }
    }
}
