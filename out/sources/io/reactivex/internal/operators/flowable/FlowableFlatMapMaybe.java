package io.reactivex.internal.operators.flowable;

import A1.B;
import S4.o;
import com.braze.support.BrazeLogger;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.j;
import p123ja.k;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMapMaybe<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p183oa.c<? super T, ? extends k<? extends R>> f40709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40710e;

    public static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements p123ja.g<T>, bc.c {
        private static final long serialVersionUID = 8600231336733376951L;
        final bc.b<? super R> actual;
        volatile boolean cancelled;
        final p183oa.c<? super T, ? extends k<? extends R>> mapper;
        final int maxConcurrency;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40711s;
        final boolean delayErrors = false;
        final AtomicLong requested = new AtomicLong();
        final p148la.a set = new p148la.a();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<io.reactivex.internal.queue.a<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<p148la.b> implements j<R>, p148la.b {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // p123ja.j
            public final void a() {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.set.a(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z10 = flatMapMaybeSubscriber.active.decrementAndGet() == 0;
                        io.reactivex.internal.queue.a<R> aVar = flatMapMaybeSubscriber.queue.get();
                        if (!z10 || (aVar != null && !aVar.isEmpty())) {
                            if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.f40711s.g(1L);
                            }
                            if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                                return;
                            }
                            flatMapMaybeSubscriber.h();
                            return;
                        }
                        AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.errors;
                        atomicThrowable.getClass();
                        Throwable thB = ExceptionHelper.b(atomicThrowable);
                        if (thB != null) {
                            flatMapMaybeSubscriber.actual.onError(thB);
                            return;
                        } else {
                            flatMapMaybeSubscriber.actual.a();
                            return;
                        }
                    }
                }
                flatMapMaybeSubscriber.active.decrementAndGet();
                if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.f40711s.g(1L);
                }
                flatMapMaybeSubscriber.d();
            }

            @Override // p123ja.j
            public final void b(p148la.b bVar) {
                DisposableHelper.f(this, bVar);
            }

            @Override // p148la.b
            public final boolean d() {
                return DisposableHelper.b(get());
            }

            @Override // p148la.b
            public final void dispose() {
                DisposableHelper.a(this);
            }

            @Override // p123ja.j
            public final void onError(Throwable th) {
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.set.a(this);
                AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.errors;
                atomicThrowable.getClass();
                if (!ExceptionHelper.a(atomicThrowable, th)) {
                    p231sa.a.c(th);
                    return;
                }
                if (!flatMapMaybeSubscriber.delayErrors) {
                    flatMapMaybeSubscriber.f40711s.cancel();
                    flatMapMaybeSubscriber.set.dispose();
                } else if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                    flatMapMaybeSubscriber.f40711s.g(1L);
                }
                flatMapMaybeSubscriber.active.decrementAndGet();
                flatMapMaybeSubscriber.d();
            }

            /* JADX WARN: Code duplicated, block: B:33:0x007f  */
            /* JADX WARN: Code duplicated, block: B:45:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
            @Override // p123ja.j
            public final void onSuccess(R r10) {
                io.reactivex.internal.queue.a<R> aVarI;
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.set.a(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z10 = flatMapMaybeSubscriber.active.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.requested.get() != 0) {
                            flatMapMaybeSubscriber.actual.c(r10);
                            io.reactivex.internal.queue.a<R> aVar = flatMapMaybeSubscriber.queue.get();
                            if (z10 && (aVar == null || aVar.isEmpty())) {
                                AtomicThrowable atomicThrowable = flatMapMaybeSubscriber.errors;
                                atomicThrowable.getClass();
                                Throwable thB = ExceptionHelper.b(atomicThrowable);
                                if (thB != null) {
                                    flatMapMaybeSubscriber.actual.onError(thB);
                                    return;
                                } else {
                                    flatMapMaybeSubscriber.actual.a();
                                    return;
                                }
                            }
                            o.n(flatMapMaybeSubscriber.requested, 1L);
                            if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                                flatMapMaybeSubscriber.f40711s.g(1L);
                            }
                        } else {
                            io.reactivex.internal.queue.a<R> aVarI2 = flatMapMaybeSubscriber.i();
                            synchronized (aVarI2) {
                                aVarI2.offer(r10);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        aVarI = flatMapMaybeSubscriber.i();
                        synchronized (aVarI) {
                            aVarI.offer(r10);
                        }
                        flatMapMaybeSubscriber.active.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    aVarI = flatMapMaybeSubscriber.i();
                    synchronized (aVarI) {
                        aVarI.offer(r10);
                        flatMapMaybeSubscriber.active.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapMaybeSubscriber.h();
            }
        }

        public FlatMapMaybeSubscriber(p123ja.g gVar, p183oa.c cVar, int i10) {
            this.actual = gVar;
            this.mapper = cVar;
            this.maxConcurrency = i10;
        }

        @Override // bc.b
        public final void a() {
            this.active.decrementAndGet();
            d();
        }

        public final void b() {
            io.reactivex.internal.queue.a<R> aVar = this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        @Override // bc.b
        public final void c(T t8) {
            try {
                k<? extends R> kVarApply = this.mapper.apply(t8);
                Q3.d.I(kVarApply, "The mapper returned a null MaybeSource");
                k<? extends R> kVar = kVarApply;
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.b(innerObserver)) {
                    return;
                }
                kVar.a(innerObserver);
            } catch (Throwable th) {
                Fa.d.g(th);
                this.f40711s.cancel();
                onError(th);
            }
        }

        @Override // bc.c
        public final void cancel() {
            this.cancelled = true;
            this.f40711s.cancel();
            this.set.dispose();
        }

        public final void d() {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40711s, cVar)) {
                this.f40711s = cVar;
                this.actual.e(this);
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.g(Long.MAX_VALUE);
                } else {
                    cVar.g(i10);
                }
            }
        }

        @Override // bc.c
        public final void g(long j) {
            if (SubscriptionHelper.c(j)) {
                o.b(this.requested, j);
                d();
            }
        }

        public final void h() {
            bc.b<? super R> bVar = this.actual;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<io.reactivex.internal.queue.a<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j10 = 0;
                while (true) {
                    if (j10 == j) {
                        break;
                    }
                    if (this.cancelled) {
                        b();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        AtomicThrowable atomicThrowable = this.errors;
                        atomicThrowable.getClass();
                        Throwable thB = ExceptionHelper.b(atomicThrowable);
                        b();
                        bVar.onError(thB);
                        return;
                    }
                    boolean z10 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.a<R> aVar = atomicReference.get();
                    B bPoll = aVar != null ? aVar.poll() : null;
                    boolean z11 = bPoll == null;
                    if (z10 && z11) {
                        AtomicThrowable atomicThrowable2 = this.errors;
                        atomicThrowable2.getClass();
                        Throwable thB2 = ExceptionHelper.b(atomicThrowable2);
                        if (thB2 != null) {
                            bVar.onError(thB2);
                            return;
                        } else {
                            bVar.a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(bPoll);
                    j10++;
                }
                if (j10 == j) {
                    if (this.cancelled) {
                        b();
                        return;
                    }
                    if (!this.delayErrors && this.errors.get() != null) {
                        AtomicThrowable atomicThrowable3 = this.errors;
                        atomicThrowable3.getClass();
                        Throwable thB3 = ExceptionHelper.b(atomicThrowable3);
                        b();
                        bVar.onError(thB3);
                        return;
                    }
                    boolean z12 = atomicInteger.get() == 0;
                    io.reactivex.internal.queue.a<R> aVar2 = atomicReference.get();
                    boolean z13 = aVar2 == null || aVar2.isEmpty();
                    if (z12 && z13) {
                        AtomicThrowable atomicThrowable4 = this.errors;
                        atomicThrowable4.getClass();
                        Throwable thB4 = ExceptionHelper.b(atomicThrowable4);
                        if (thB4 != null) {
                            bVar.onError(thB4);
                            return;
                        } else {
                            bVar.a();
                            return;
                        }
                    }
                }
                if (j10 != 0) {
                    o.n(this.requested, j10);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.f40711s.g(j10);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        public final io.reactivex.internal.queue.a<R> i() {
            while (true) {
                io.reactivex.internal.queue.a<R> aVar = this.queue.get();
                if (aVar != null) {
                    return aVar;
                }
                io.reactivex.internal.queue.a<R> aVar2 = new io.reactivex.internal.queue.a<>(p123ja.d.f41194b);
                AtomicReference<io.reactivex.internal.queue.a<R>> atomicReference = this.queue;
                while (!atomicReference.compareAndSet(null, aVar2)) {
                    if (atomicReference.get() != null) {
                    }
                }
                return aVar2;
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            this.active.decrementAndGet();
            AtomicThrowable atomicThrowable = this.errors;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            d();
        }
    }

    public FlowableFlatMapMaybe(p123ja.d dVar, p183oa.c cVar) {
        super(dVar);
        this.f40709d = cVar;
        this.f40710e = BrazeLogger.SUPPRESS;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40737c.d(new FlatMapMaybeSubscriber(gVar, this.f40709d, this.f40710e));
    }
}
