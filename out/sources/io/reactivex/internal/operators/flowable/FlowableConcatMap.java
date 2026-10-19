package io.reactivex.internal.operators.flowable;

import X8.n;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import ra.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableConcatMap<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f40694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ErrorMode f40696f;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements p123ja.g<T>, a<R>, bc.c {
        private static final long serialVersionUID = -3511336836796789179L;
        volatile boolean active;
        volatile boolean cancelled;
        int consumed;
        volatile boolean done;
        final int limit;
        final p183oa.c<? super T, ? extends bc.a<? extends R>> mapper;
        final int prefetch;
        j<T> queue;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40697s;
        int sourceMode;
        final ConcatMapInner<R> inner = new ConcatMapInner<>(this);
        final AtomicThrowable errors = new AtomicThrowable();

        public BaseConcatMapSubscriber(n nVar, int i10) {
            this.mapper = nVar;
            this.prefetch = i10;
            this.limit = i10;
        }

        @Override // bc.b
        public final void a() {
            this.done = true;
            h();
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.sourceMode == 2 || this.queue.offer(t8)) {
                h();
            } else {
                this.f40697s.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40697s, cVar)) {
                this.f40697s = cVar;
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(3);
                    if (iH == 1) {
                        this.sourceMode = iH;
                        this.queue = gVar;
                        this.done = true;
                        i();
                        h();
                        return;
                    }
                    if (iH == 2) {
                        this.sourceMode = iH;
                        this.queue = gVar;
                        i();
                        cVar.g(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                i();
                cVar.g(this.prefetch);
            }
        }

        public abstract void h();

        public abstract void i();
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;
        final bc.b<? super R> actual;
        final boolean veryEnd;

        public ConcatMapDelayed(p123ja.g gVar, n nVar, int i10, boolean z10) {
            super(nVar, i10);
            this.actual = gVar;
            this.veryEnd = z10;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.a
        public final void b(R r10) {
            this.actual.c(r10);
        }

        @Override // bc.c
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.f40697s.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.a
        public final void d(Throwable th) {
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            if (!this.veryEnd) {
                this.f40697s.cancel();
                this.done = true;
            }
            this.active = false;
            h();
        }

        @Override // bc.c
        public final void g(long j) {
            this.inner.g(j);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void h() {
            if (getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z10 = this.done;
                        if (z10 && !this.veryEnd && this.errors.get() != null) {
                            bc.b<? super R> bVar = this.actual;
                            AtomicThrowable atomicThrowable = this.errors;
                            atomicThrowable.getClass();
                            bVar.onError(ExceptionHelper.b(atomicThrowable));
                            return;
                        }
                        try {
                            T tPoll = this.queue.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                AtomicThrowable atomicThrowable2 = this.errors;
                                atomicThrowable2.getClass();
                                Throwable thB = ExceptionHelper.b(atomicThrowable2);
                                if (thB != null) {
                                    this.actual.onError(thB);
                                    return;
                                } else {
                                    this.actual.a();
                                    return;
                                }
                            }
                            if (!z11) {
                                try {
                                    bc.a<? extends R> aVarApply = this.mapper.apply(tPoll);
                                    Q3.d.I(aVarApply, "The mapper returned a null Publisher");
                                    bc.a<? extends R> aVar = aVarApply;
                                    if (this.sourceMode != 1) {
                                        int i10 = this.consumed + 1;
                                        if (i10 == this.limit) {
                                            this.consumed = 0;
                                            this.f40697s.g(i10);
                                        } else {
                                            this.consumed = i10;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) aVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (this.inner.h()) {
                                                this.actual.c(objCall);
                                            } else {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.j(new b(objCall, concatMapInner));
                                            }
                                        } catch (Throwable th) {
                                            Fa.d.g(th);
                                            this.f40697s.cancel();
                                            AtomicThrowable atomicThrowable3 = this.errors;
                                            atomicThrowable3.getClass();
                                            ExceptionHelper.a(atomicThrowable3, th);
                                            bc.b<? super R> bVar2 = this.actual;
                                            AtomicThrowable atomicThrowable4 = this.errors;
                                            atomicThrowable4.getClass();
                                            bVar2.onError(ExceptionHelper.b(atomicThrowable4));
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        aVar.a(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Fa.d.g(th2);
                                    this.f40697s.cancel();
                                    AtomicThrowable atomicThrowable5 = this.errors;
                                    atomicThrowable5.getClass();
                                    ExceptionHelper.a(atomicThrowable5, th2);
                                    bc.b<? super R> bVar3 = this.actual;
                                    AtomicThrowable atomicThrowable6 = this.errors;
                                    atomicThrowable6.getClass();
                                    bVar3.onError(ExceptionHelper.b(atomicThrowable6));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Fa.d.g(th3);
                            this.f40697s.cancel();
                            AtomicThrowable atomicThrowable7 = this.errors;
                            atomicThrowable7.getClass();
                            ExceptionHelper.a(atomicThrowable7, th3);
                            bc.b<? super R> bVar4 = this.actual;
                            AtomicThrowable atomicThrowable8 = this.errors;
                            atomicThrowable8.getClass();
                            bVar4.onError(ExceptionHelper.b(atomicThrowable8));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void i() {
            this.actual.e(this);
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
            } else {
                this.done = true;
                h();
            }
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;
        final bc.b<? super R> actual;
        final AtomicInteger wip;

        public ConcatMapImmediate(p123ja.g gVar, n nVar, int i10) {
            super(nVar, i10);
            this.actual = gVar;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.a
        public final void b(R r10) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.actual.c(r10);
                if (compareAndSet(1, 0)) {
                    return;
                }
                bc.b<? super R> bVar = this.actual;
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                bVar.onError(ExceptionHelper.b(atomicThrowable));
            }
        }

        @Override // bc.c
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.inner.cancel();
            this.f40697s.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.a
        public final void d(Throwable th) {
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            this.f40697s.cancel();
            if (getAndIncrement() == 0) {
                bc.b<? super R> bVar = this.actual;
                AtomicThrowable atomicThrowable2 = this.errors;
                atomicThrowable2.getClass();
                bVar.onError(ExceptionHelper.b(atomicThrowable2));
            }
        }

        @Override // bc.c
        public final void g(long j) {
            this.inner.g(j);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void h() {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.cancelled) {
                    if (!this.active) {
                        boolean z10 = this.done;
                        try {
                            T tPoll = this.queue.poll();
                            boolean z11 = tPoll == null;
                            if (z10 && z11) {
                                this.actual.a();
                                return;
                            }
                            if (!z11) {
                                try {
                                    bc.a<? extends R> aVarApply = this.mapper.apply(tPoll);
                                    Q3.d.I(aVarApply, "The mapper returned a null Publisher");
                                    bc.a<? extends R> aVar = aVarApply;
                                    if (this.sourceMode != 1) {
                                        int i10 = this.consumed + 1;
                                        if (i10 == this.limit) {
                                            this.consumed = 0;
                                            this.f40697s.g(i10);
                                        } else {
                                            this.consumed = i10;
                                        }
                                    }
                                    if (aVar instanceof Callable) {
                                        try {
                                            Object objCall = ((Callable) aVar).call();
                                            if (objCall == null) {
                                                continue;
                                            } else if (!this.inner.h()) {
                                                this.active = true;
                                                ConcatMapInner<R> concatMapInner = this.inner;
                                                concatMapInner.j(new b(objCall, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.actual.c(objCall);
                                                if (!compareAndSet(1, 0)) {
                                                    bc.b<? super R> bVar = this.actual;
                                                    AtomicThrowable atomicThrowable = this.errors;
                                                    atomicThrowable.getClass();
                                                    bVar.onError(ExceptionHelper.b(atomicThrowable));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Fa.d.g(th);
                                            this.f40697s.cancel();
                                            AtomicThrowable atomicThrowable2 = this.errors;
                                            atomicThrowable2.getClass();
                                            ExceptionHelper.a(atomicThrowable2, th);
                                            bc.b<? super R> bVar2 = this.actual;
                                            AtomicThrowable atomicThrowable3 = this.errors;
                                            atomicThrowable3.getClass();
                                            bVar2.onError(ExceptionHelper.b(atomicThrowable3));
                                            return;
                                        }
                                    } else {
                                        this.active = true;
                                        aVar.a(this.inner);
                                    }
                                } catch (Throwable th2) {
                                    Fa.d.g(th2);
                                    this.f40697s.cancel();
                                    AtomicThrowable atomicThrowable4 = this.errors;
                                    atomicThrowable4.getClass();
                                    ExceptionHelper.a(atomicThrowable4, th2);
                                    bc.b<? super R> bVar3 = this.actual;
                                    AtomicThrowable atomicThrowable5 = this.errors;
                                    atomicThrowable5.getClass();
                                    bVar3.onError(ExceptionHelper.b(atomicThrowable5));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Fa.d.g(th3);
                            this.f40697s.cancel();
                            AtomicThrowable atomicThrowable6 = this.errors;
                            atomicThrowable6.getClass();
                            ExceptionHelper.a(atomicThrowable6, th3);
                            bc.b<? super R> bVar4 = this.actual;
                            AtomicThrowable atomicThrowable7 = this.errors;
                            atomicThrowable7.getClass();
                            bVar4.onError(ExceptionHelper.b(atomicThrowable7));
                            return;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void i() {
            this.actual.e(this);
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            this.inner.cancel();
            if (getAndIncrement() == 0) {
                bc.b<? super R> bVar = this.actual;
                AtomicThrowable atomicThrowable2 = this.errors;
                atomicThrowable2.getClass();
                bVar.onError(ExceptionHelper.b(atomicThrowable2));
            }
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements p123ja.g<R> {
        private static final long serialVersionUID = 897683679971470653L;
        final a<R> parent;
        long produced;

        public ConcatMapInner(a<R> aVar) {
            this.parent = aVar;
        }

        @Override // bc.b
        public final void a() {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                i(j);
            }
            BaseConcatMapSubscriber baseConcatMapSubscriber = (BaseConcatMapSubscriber) this.parent;
            baseConcatMapSubscriber.active = false;
            baseConcatMapSubscriber.h();
        }

        @Override // bc.b
        public final void c(R r10) {
            this.produced++;
            this.parent.b(r10);
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            long j = this.produced;
            if (j != 0) {
                this.produced = 0L;
                i(j);
            }
            this.parent.d(th);
        }
    }

    public interface a<T> {
        void b(T t8);

        void d(Throwable th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableConcatMap(FlowableObserveOn flowableObserveOn, n nVar) {
        super(flowableObserveOn);
        ErrorMode errorMode = ErrorMode.f40972b;
        this.f40694d = nVar;
        this.f40695e = 2;
        this.f40696f = errorMode;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        bc.b<? super T> concatMapDelayed;
        p123ja.d<T> dVar = this.f40737c;
        n nVar = this.f40694d;
        if (h.a(dVar, gVar, nVar)) {
            return;
        }
        int iOrdinal = this.f40696f.ordinal();
        int i10 = this.f40695e;
        if (iOrdinal != 1) {
            concatMapDelayed = iOrdinal != 2 ? new ConcatMapImmediate<>(gVar, nVar, i10) : new ConcatMapDelayed<>(gVar, nVar, i10, true);
        } else {
            concatMapDelayed = new ConcatMapDelayed<>(gVar, nVar, i10, false);
        }
        dVar.a(concatMapDelayed);
    }

    public static final class b<T> implements bc.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bc.b<? super T> f40698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f40699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f40700d;

        public b(T t8, bc.b<? super T> bVar) {
            this.f40699c = t8;
            this.f40698b = bVar;
        }

        @Override // bc.c
        public final void g(long j) {
            if (j <= 0 || this.f40700d) {
                return;
            }
            this.f40700d = true;
            T t8 = this.f40699c;
            bc.b<? super T> bVar = this.f40698b;
            bVar.c(t8);
            bVar.a();
        }

        @Override // bc.c
        public final void cancel() {
        }
    }
}
