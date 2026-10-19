package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureBuffer<T> extends a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f40723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qa.a.b f40724f;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements p123ja.g<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        final bc.b<? super T> actual;
        volatile boolean cancelled;
        volatile boolean done;
        Throwable error;
        final p183oa.a onOverflow;
        boolean outputFused;
        final ra.i<T> queue;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        bc.c f40725s;
        final AtomicLong requested = new AtomicLong();
        final boolean delayError = false;

        public BackpressureBufferSubscriber(p123ja.g gVar, int i10, boolean z10, qa.a.b bVar) {
            this.actual = gVar;
            this.onOverflow = bVar;
            this.queue = z10 ? new io.reactivex.internal.queue.a<>(i10) : new SpscArrayQueue<>(i10);
        }

        @Override // bc.b
        public final void a() throws Exception {
            this.done = true;
            if (this.outputFused) {
                this.actual.a();
            } else {
                i();
            }
        }

        @Override // bc.b
        public final void c(T t8) throws Exception {
            if (this.queue.offer(t8)) {
                if (this.outputFused) {
                    this.actual.c(null);
                    return;
                } else {
                    i();
                    return;
                }
            }
            this.f40725s.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                Fa.d.g(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // bc.c
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f40725s.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // ra.j
        public final void clear() {
            this.queue.clear();
        }

        public final boolean d(boolean z10, boolean z11, bc.b<? super T> bVar) {
            if (this.cancelled) {
                this.queue.clear();
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
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                bVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.a();
            return true;
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.f40725s, cVar)) {
                this.f40725s = cVar;
                this.actual.e(this);
                cVar.g(Long.MAX_VALUE);
            }
        }

        @Override // bc.c
        public final void g(long j) throws Exception {
            if (this.outputFused || !SubscriptionHelper.c(j)) {
                return;
            }
            o.b(this.requested, j);
            i();
        }

        @Override // ra.f
        public final int h(int i10) {
            this.outputFused = true;
            return 2;
        }

        public final void i() throws Exception {
            if (getAndIncrement() == 0) {
                ra.i<T> iVar = this.queue;
                bc.b<? super T> bVar = this.actual;
                int iAddAndGet = 1;
                while (!d(this.done, iVar.isEmpty(), bVar)) {
                    long j = this.requested.get();
                    long j10 = 0;
                    while (j10 != j) {
                        boolean z10 = this.done;
                        T tPoll = iVar.poll();
                        boolean z11 = tPoll == null;
                        if (d(z10, z11, bVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        }
                        bVar.c(tPoll);
                        j10++;
                    }
                    if (j10 == j && d(this.done, iVar.isEmpty(), bVar)) {
                        return;
                    }
                    if (j10 != 0 && j != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j10);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // ra.j
        public final boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // bc.b
        public final void onError(Throwable th) throws Exception {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.actual.onError(th);
            } else {
                i();
            }
        }

        @Override // ra.j
        public final T poll() throws Exception {
            return this.queue.poll();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableOnBackpressureBuffer(f fVar, int i10) {
        super(fVar);
        qa.a.b bVar = qa.a.f46190c;
        this.f40722d = i10;
        this.f40723e = true;
        this.f40724f = bVar;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40737c.d(new BackpressureBufferSubscriber(gVar, this.f40722d, this.f40723e, this.f40724f));
    }
}
