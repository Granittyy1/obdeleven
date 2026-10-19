package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ra.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlattenIterable<T, R> extends a<T, R> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa.a.f f40712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40713e;

    public static final class FlattenIterableSubscriber<T, R> extends BasicIntQueueSubscription<R> implements p123ja.g<T> {
        private static final long serialVersionUID = -3096000382929934955L;
        final bc.b<? super R> actual;
        volatile boolean cancelled;
        int consumed;
        Iterator<? extends R> current;
        volatile boolean done;
        int fusionMode;
        final int limit;
        final p183oa.c<? super T, ? extends Iterable<? extends R>> mapper;
        final int prefetch;
        j<T> queue;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40714s;
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        public FlattenIterableSubscriber(p123ja.g gVar, qa.a.f fVar, int i10) {
            this.actual = gVar;
            this.mapper = fVar;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // bc.b
        public final void a() {
            if (this.done) {
                return;
            }
            this.done = true;
            i();
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.done) {
                return;
            }
            if (this.fusionMode != 0 || this.queue.offer(t8)) {
                i();
            } else {
                onError(new MissingBackpressureException("Queue is full?!"));
            }
        }

        @Override // bc.c
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f40714s.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // ra.j
        public final void clear() {
            this.current = null;
            this.queue.clear();
        }

        public final boolean d(boolean z10, boolean z11, bc.b<?> bVar, j<?> jVar) {
            if (this.cancelled) {
                this.current = null;
                jVar.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.error.get() == null) {
                if (!z11) {
                    return false;
                }
                bVar.a();
                return true;
            }
            Throwable thB = ExceptionHelper.b(this.error);
            this.current = null;
            jVar.clear();
            bVar.onError(thB);
            return true;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40714s, cVar)) {
                this.f40714s = cVar;
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(3);
                    if (iH == 1) {
                        this.fusionMode = iH;
                        this.queue = gVar;
                        this.done = true;
                        this.actual.e(this);
                        return;
                    }
                    if (iH == 2) {
                        this.fusionMode = iH;
                        this.queue = gVar;
                        this.actual.e(this);
                        cVar.g(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                this.actual.e(this);
                cVar.g(this.prefetch);
            }
        }

        @Override // bc.c
        public final void g(long j) {
            if (SubscriptionHelper.c(j)) {
                o.b(this.requested, j);
                i();
            }
        }

        @Override // ra.f
        public final int h(int i10) {
            return this.fusionMode == 1 ? 1 : 0;
        }

        /* JADX WARN: Code duplicated, block: B:79:0x0146 A[PHI: r6
          0x0146: PHI (r6v4 java.util.Iterator<? extends R>) = (r6v3 java.util.Iterator<? extends R>), (r6v6 java.util.Iterator<? extends R>) binds: [B:36:0x0091, B:77:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x014d A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        public final void i() {
            if (getAndIncrement() != 0) {
                return;
            }
            bc.b<?> bVar = this.actual;
            j<T> jVar = this.queue;
            int i10 = 1;
            boolean z10 = false;
            Object[] objArr = this.fusionMode != 1;
            Iterator<? extends R> it = this.current;
            int iAddAndGet = 1;
            while (true) {
                if (it == null) {
                    boolean z11 = this.done;
                    try {
                        T tPoll = jVar.poll();
                        if (d(z11, tPoll == null ? i10 : z10 ? 1 : 0, bVar, jVar)) {
                            return;
                        }
                        if (tPoll != null) {
                            try {
                                it = this.mapper.apply(tPoll).iterator();
                                if (it.hasNext()) {
                                    this.current = it;
                                } else {
                                    if (objArr != false) {
                                        int i11 = this.consumed + i10;
                                        if (i11 == this.limit) {
                                            this.consumed = z10 ? 1 : 0;
                                            this.f40714s.g(i11);
                                        } else {
                                            this.consumed = i11;
                                        }
                                    }
                                    it = null;
                                }
                            } catch (Throwable th) {
                                Fa.d.g(th);
                                this.f40714s.cancel();
                                ExceptionHelper.a(this.error, th);
                                bVar.onError(ExceptionHelper.b(this.error));
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Fa.d.g(th2);
                        this.f40714s.cancel();
                        ExceptionHelper.a(this.error, th2);
                        Throwable thB = ExceptionHelper.b(this.error);
                        this.current = null;
                        jVar.clear();
                        bVar.onError(thB);
                        return;
                    }
                }
                if (it != null) {
                    long j = this.requested.get();
                    long j10 = 0;
                    while (j10 != j) {
                        if (d(this.done, z10, bVar, jVar)) {
                            return;
                        }
                        try {
                            R next = it.next();
                            Q3.d.I(next, "The iterator returned a null value");
                            bVar.c(next);
                            if (d(this.done, z10, bVar, jVar)) {
                                return;
                            }
                            j10++;
                            try {
                                if (!it.hasNext()) {
                                    if (objArr != false) {
                                        int i12 = this.consumed + i10;
                                        if (i12 == this.limit) {
                                            this.consumed = z10 ? 1 : 0;
                                            this.f40714s.g(i12);
                                        } else {
                                            this.consumed = i12;
                                        }
                                    }
                                    this.current = null;
                                    it = null;
                                    break;
                                }
                            } catch (Throwable th3) {
                                Fa.d.g(th3);
                                this.current = null;
                                this.f40714s.cancel();
                                ExceptionHelper.a(this.error, th3);
                                bVar.onError(ExceptionHelper.b(this.error));
                                return;
                            }
                        } catch (Throwable th4) {
                            Fa.d.g(th4);
                            this.current = null;
                            this.f40714s.cancel();
                            ExceptionHelper.a(this.error, th4);
                            bVar.onError(ExceptionHelper.b(this.error));
                            return;
                        }
                    }
                    if (j10 == j) {
                        if (d(this.done, jVar.isEmpty() && it == null, bVar, jVar)) {
                            return;
                        }
                    }
                    if (j10 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j10);
                    }
                    if (it != null) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                i10 = 1;
                z10 = false;
            }
        }

        @Override // ra.j
        public final boolean isEmpty() {
            return this.current == null && this.queue.isEmpty();
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            if (this.done || !ExceptionHelper.a(this.error, th)) {
                p231sa.a.c(th);
            } else {
                this.done = true;
                i();
            }
        }

        @Override // ra.j
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.current;
            while (it == null) {
                T tPoll = this.queue.poll();
                if (tPoll != null) {
                    it = this.mapper.apply(tPoll).iterator();
                    if (it.hasNext()) {
                        this.current = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            }
            R next = it.next();
            Q3.d.I(next, "The iterator returned a null value");
            if (!it.hasNext()) {
                this.current = null;
            }
            return next;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableFlattenIterable(g gVar, int i10) {
        super(gVar);
        qa.a.f fVar = qa.a.f46188a;
        this.f40712d = fVar;
        this.f40713e = i10;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        p123ja.d<T> dVar = this.f40737c;
        boolean z10 = dVar instanceof Callable;
        qa.a.f fVar = this.f40712d;
        if (!z10) {
            dVar.d(new FlattenIterableSubscriber(gVar, fVar, this.f40713e));
            return;
        }
        try {
            Object objCall = ((Callable) dVar).call();
            if (objCall == null) {
                EmptySubscription.a(gVar);
                return;
            }
            try {
                fVar.getClass();
                FlowableFromIterable.f(gVar, ((Iterable) objCall).iterator());
            } catch (Throwable th) {
                Fa.d.g(th);
                EmptySubscription.b(th, gVar);
            }
        } catch (Throwable th2) {
            Fa.d.g(th2);
            EmptySubscription.b(th2, gVar);
        }
    }
}
