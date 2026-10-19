package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.BackpressureStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableCreate<T> extends p123ja.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p123ja.f<T> f40701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BackpressureStrategy f40702d;

    public static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final io.reactivex.internal.queue.a<T> queue;
        final AtomicInteger wip;

        public BufferAsyncEmitter(p123ja.g gVar, int i10) {
            super(gVar);
            this.queue = new io.reactivex.internal.queue.a<>(i10);
            this.wip = new AtomicInteger();
        }

        @Override // p123ja.e
        public final void c(T t8) {
            if (this.done || this.serial.d()) {
                return;
            }
            if (t8 == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.offer(t8);
                i();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void e() {
            i();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void f() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean h(Throwable th) {
            if (this.done || this.serial.d()) {
                return false;
            }
            this.error = th;
            this.done = true;
            i();
            return true;
        }

        public final void i() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            bc.b<? super T> bVar = this.actual;
            io.reactivex.internal.queue.a<T> aVar = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j10 = 0;
                while (j10 != j) {
                    if (this.serial.d()) {
                        aVar.clear();
                        return;
                    }
                    boolean z10 = this.done;
                    T tPoll = aVar.poll();
                    boolean z11 = tPoll == null;
                    if (z10 && z11) {
                        Throwable th = this.error;
                        if (th != null) {
                            b(th);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(tPoll);
                    j10++;
                }
                if (j10 == j) {
                    if (this.serial.d()) {
                        aVar.clear();
                        return;
                    }
                    boolean z12 = this.done;
                    boolean zIsEmpty = aVar.isEmpty();
                    if (z12 && zIsEmpty) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j10 != 0) {
                    o.n(this, j10);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void i() {
            d(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    public static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        public LatestAsyncEmitter(p123ja.g gVar) {
            super(gVar);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        @Override // p123ja.e
        public final void c(T t8) {
            if (this.done || this.serial.d()) {
                return;
            }
            if (t8 == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.queue.set(t8);
                i();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void e() {
            i();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final void f() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean h(Throwable th) {
            if (this.done || this.serial.d()) {
                return false;
            }
            this.error = th;
            this.done = true;
            i();
            return true;
        }

        public final void i() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            bc.b<? super T> bVar = this.actual;
            AtomicReference<T> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = get();
                long j10 = 0;
                while (true) {
                    if (j10 == j) {
                        break;
                    }
                    if (this.serial.d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z10 = this.done;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (z10 && z11) {
                        Throwable th = this.error;
                        if (th != null) {
                            b(th);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(andSet);
                    j10++;
                }
                if (j10 == j) {
                    if (this.serial.d()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z12 = this.done;
                    boolean z13 = atomicReference.get() == null;
                    if (z12 && z13) {
                        Throwable th2 = this.error;
                        if (th2 != null) {
                            b(th2);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                }
                if (j10 != 0) {
                    o.n(this, j10);
                }
                iAddAndGet = this.wip.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        @Override // p123ja.e
        public final void c(T t8) {
            long j;
            if (this.serial.d()) {
                return;
            }
            if (t8 == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            this.actual.c(t8);
            do {
                j = get();
                if (j == 0) {
                    return;
                }
            } while (!compareAndSet(j, j - 1));
        }
    }

    public static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        @Override // p123ja.e
        public final void c(T t8) {
            if (this.serial.d()) {
                return;
            }
            if (t8 == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() == 0) {
                i();
            } else {
                this.actual.c(t8);
                o.n(this, 1L);
            }
        }

        public abstract void i();
    }

    public FlowableCreate(p123ja.f fVar) {
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.f40658b;
        this.f40701c = fVar;
        this.f40702d = backpressureStrategy;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        BaseEmitter missingEmitter;
        int iOrdinal = this.f40702d.ordinal();
        if (iOrdinal == 0) {
            missingEmitter = new MissingEmitter(gVar);
        } else if (iOrdinal == 1) {
            missingEmitter = new ErrorAsyncEmitter(gVar);
        } else if (iOrdinal != 3) {
            missingEmitter = iOrdinal != 4 ? new BufferAsyncEmitter(gVar, p123ja.d.f41194b) : new LatestAsyncEmitter(gVar);
        } else {
            missingEmitter = new DropAsyncEmitter(gVar);
        }
        gVar.e(missingEmitter);
        try {
            this.f40701c.d(missingEmitter);
        } catch (Throwable th) {
            Fa.d.g(th);
            missingEmitter.d(th);
        }
    }

    public static abstract class BaseEmitter<T> extends AtomicLong implements p123ja.e<T>, bc.c {
        private static final long serialVersionUID = 7326289992464377023L;
        final bc.b<? super T> actual;
        final SequentialDisposable serial = new SequentialDisposable();

        public BaseEmitter(p123ja.g gVar) {
            this.actual = gVar;
        }

        public final void a() {
            if (this.serial.d()) {
                return;
            }
            try {
                this.actual.a();
            } finally {
                SequentialDisposable sequentialDisposable = this.serial;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
            }
        }

        public final boolean b(Throwable th) {
            SequentialDisposable sequentialDisposable;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.serial.d()) {
                return false;
            }
            try {
                this.actual.onError(th);
                return true;
            } finally {
                sequentialDisposable = this.serial;
                sequentialDisposable.getClass();
                DisposableHelper.a(sequentialDisposable);
            }
        }

        @Override // bc.c
        public final void cancel() {
            SequentialDisposable sequentialDisposable = this.serial;
            sequentialDisposable.getClass();
            DisposableHelper.a(sequentialDisposable);
            f();
        }

        public final void d(Throwable th) {
            if (h(th)) {
                return;
            }
            p231sa.a.c(th);
        }

        @Override // bc.c
        public final void g(long j) {
            if (SubscriptionHelper.c(j)) {
                o.b(this, j);
                e();
            }
        }

        public boolean h(Throwable th) {
            return b(th);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public final String toString() {
            return C4.b.d(getClass().getSimpleName(), "{", super.toString(), "}");
        }

        public void e() {
        }

        public void f() {
        }
    }

    public static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        public final void i() {
        }
    }
}
