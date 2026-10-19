package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import p123ja.o;
import ra.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableObserveOn<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f40719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40720e;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements p123ja.g<T>, Runnable {
        private static final long serialVersionUID = -8241002408341274697L;
        volatile boolean cancelled;
        volatile boolean done;
        Throwable error;
        final int limit;
        boolean outputFused;
        final int prefetch;
        long produced;
        j<T> queue;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40721s;
        int sourceMode;
        final o.b worker;
        final boolean delayError = false;
        final AtomicLong requested = new AtomicLong();

        public BaseObserveOnSubscriber(o.b bVar, int i10) {
            this.worker = bVar;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // bc.b
        public final void a() {
            if (this.done) {
                return;
            }
            this.done = true;
            l();
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.done) {
                return;
            }
            if (this.sourceMode == 2) {
                l();
                return;
            }
            if (!this.queue.offer(t8)) {
                this.f40721s.cancel();
                this.error = new MissingBackpressureException("Queue is full?!");
                this.done = true;
            }
            l();
        }

        @Override // bc.c
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f40721s.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // ra.j
        public final void clear() {
            this.queue.clear();
        }

        public final boolean d(boolean z10, boolean z11, bc.b<?> bVar) {
            if (this.cancelled) {
                clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (this.delayError) {
                if (!z11) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    bVar.onError(th);
                } else {
                    bVar.a();
                }
                this.worker.dispose();
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                clear();
                bVar.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.a();
            this.worker.dispose();
            return true;
        }

        @Override // bc.c
        public final void g(long j) {
            if (SubscriptionHelper.c(j)) {
                S4.o.b(this.requested, j);
                l();
            }
        }

        @Override // ra.f
        public final int h(int i10) {
            this.outputFused = true;
            return 2;
        }

        public abstract void i();

        @Override // ra.j
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        public abstract void j();

        public abstract void k();

        public final void l() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.worker.b(this);
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            if (this.done) {
                p231sa.a.c(th);
                return;
            }
            this.error = th;
            this.done = true;
            l();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.outputFused) {
                j();
            } else if (this.sourceMode == 1) {
                k();
            } else {
                i();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = 644624475404284533L;
        final ra.a<? super T> actual;
        long consumed;

        public ObserveOnConditionalSubscriber(ra.a aVar, o.b bVar, int i10) {
            super(bVar, i10);
            this.actual = aVar;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40721s, cVar)) {
                this.f40721s = cVar;
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(7);
                    if (iH == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.actual.e(this);
                        return;
                    }
                    if (iH == 2) {
                        this.sourceMode = 2;
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

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void i() {
            ra.a<? super T> aVar = this.actual;
            j<T> jVar = this.queue;
            long j = this.produced;
            long j10 = this.consumed;
            int iAddAndGet = 1;
            while (true) {
                long j11 = this.requested.get();
                while (j != j11) {
                    boolean z10 = this.done;
                    try {
                        T tPoll = jVar.poll();
                        boolean z11 = tPoll == null;
                        if (d(z10, z11, aVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        if (aVar.f(tPoll)) {
                            j++;
                        }
                        j10++;
                        if (j10 == this.limit) {
                            this.f40721s.g(j10);
                            j10 = 0;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        this.f40721s.cancel();
                        jVar.clear();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == j11 && d(this.done, jVar.isEmpty(), aVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j;
                    this.consumed = j10;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void j() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                this.actual.c(null);
                if (z10) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.actual.onError(th);
                    } else {
                        this.actual.a();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void k() {
            ra.a<? super T> aVar = this.actual;
            j<T> jVar = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.requested.get();
                while (j != j10) {
                    try {
                        T tPoll = jVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            aVar.a();
                            this.worker.dispose();
                            return;
                        } else if (aVar.f(tPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        this.f40721s.cancel();
                        aVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (jVar.isEmpty()) {
                    aVar.a();
                    this.worker.dispose();
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.consumed + 1;
                if (j == this.limit) {
                    this.consumed = 0L;
                    this.f40721s.g(j);
                } else {
                    this.consumed = j;
                }
            }
            return tPoll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> {
        private static final long serialVersionUID = -4547113800637756442L;
        final bc.b<? super T> actual;

        public ObserveOnSubscriber(p123ja.g gVar, o.b bVar, int i10) {
            super(bVar, i10);
            this.actual = gVar;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40721s, cVar)) {
                this.f40721s = cVar;
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(7);
                    if (iH == 1) {
                        this.sourceMode = 1;
                        this.queue = gVar;
                        this.done = true;
                        this.actual.e(this);
                        return;
                    }
                    if (iH == 2) {
                        this.sourceMode = 2;
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

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void i() {
            bc.b<? super T> bVar = this.actual;
            j<T> jVar = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.requested.get();
                while (j != jAddAndGet) {
                    boolean z10 = this.done;
                    try {
                        T tPoll = jVar.poll();
                        boolean z11 = tPoll == null;
                        if (d(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.c(tPoll);
                        j++;
                        if (j == this.limit) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.requested.addAndGet(-j);
                            }
                            this.f40721s.g(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        this.f40721s.cancel();
                        jVar.clear();
                        bVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && d(this.done, jVar.isEmpty(), bVar)) {
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void j() {
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                this.actual.c(null);
                if (z10) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.actual.onError(th);
                    } else {
                        this.actual.a();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void k() {
            bc.b<? super T> bVar = this.actual;
            j<T> jVar = this.queue;
            long j = this.produced;
            int iAddAndGet = 1;
            while (true) {
                long j10 = this.requested.get();
                while (j != j10) {
                    try {
                        T tPoll = jVar.poll();
                        if (this.cancelled) {
                            return;
                        }
                        if (tPoll == null) {
                            bVar.a();
                            this.worker.dispose();
                            return;
                        } else {
                            bVar.c(tPoll);
                            j++;
                        }
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        this.f40721s.cancel();
                        bVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                if (this.cancelled) {
                    return;
                }
                if (jVar.isEmpty()) {
                    bVar.a();
                    this.worker.dispose();
                    return;
                }
                int i10 = get();
                if (iAddAndGet == i10) {
                    this.produced = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i10;
                }
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            T tPoll = this.queue.poll();
            if (tPoll != null && this.sourceMode != 1) {
                long j = this.produced + 1;
                if (j == this.limit) {
                    this.produced = 0L;
                    this.f40721s.g(j);
                } else {
                    this.produced = j;
                }
            }
            return tPoll;
        }
    }

    public FlowableObserveOn(p123ja.d dVar, o oVar, int i10) {
        super(dVar);
        this.f40719d = oVar;
        this.f40720e = i10;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        o.b bVarA = this.f40719d.a();
        boolean z10 = gVar instanceof ra.a;
        int i10 = this.f40720e;
        p123ja.d<T> dVar = this.f40737c;
        if (z10) {
            dVar.d(new ObserveOnConditionalSubscriber((ra.a) gVar, bVarA, i10));
        } else {
            dVar.d(new ObserveOnSubscriber(gVar, bVarA, i10));
        }
    }
}
