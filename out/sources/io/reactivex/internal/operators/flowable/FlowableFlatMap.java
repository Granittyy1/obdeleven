package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ra.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableFlatMap<T, U> extends a<T, U> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa.a.f f40704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40706f;

    public static final class InnerSubscriber<T, U> extends AtomicReference<bc.c> implements p123ja.g<U>, p148la.b {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;
        final long id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile j<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j) {
            this.id = j;
            this.parent = mergeSubscriber;
            int i10 = mergeSubscriber.bufferSize;
            this.bufferSize = i10;
            this.limit = i10 >> 2;
        }

        @Override // bc.b
        public final void a() throws Exception {
            this.done = true;
            this.parent.d();
        }

        public final void b(long j) {
            if (this.fusionMode != 1) {
                long j10 = this.produced + j;
                if (j10 < this.limit) {
                    this.produced = j10;
                } else {
                    this.produced = 0L;
                    get().g(j10);
                }
            }
        }

        @Override // bc.b
        public final void c(U u10) throws Exception {
            if (this.fusionMode == 2) {
                this.parent.d();
                return;
            }
            MergeSubscriber<T, U> mergeSubscriber = this.parent;
            if (mergeSubscriber.get() == 0 && mergeSubscriber.compareAndSet(0, 1)) {
                long j = mergeSubscriber.requested.get();
                j spscArrayQueue = this.queue;
                if (j == 0 || !(spscArrayQueue == null || spscArrayQueue.isEmpty())) {
                    if (spscArrayQueue == null && (spscArrayQueue = this.queue) == null) {
                        spscArrayQueue = new SpscArrayQueue(mergeSubscriber.bufferSize);
                        this.queue = spscArrayQueue;
                    }
                    if (!spscArrayQueue.offer(u10)) {
                        mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                } else {
                    mergeSubscriber.actual.c(u10);
                    if (j != Long.MAX_VALUE) {
                        mergeSubscriber.requested.decrementAndGet();
                    }
                    b(1L);
                }
                if (mergeSubscriber.decrementAndGet() == 0) {
                    return;
                }
            } else {
                j spscArrayQueue2 = this.queue;
                if (spscArrayQueue2 == null) {
                    spscArrayQueue2 = new SpscArrayQueue(mergeSubscriber.bufferSize);
                    this.queue = spscArrayQueue2;
                }
                if (!spscArrayQueue2.offer(u10)) {
                    mergeSubscriber.onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (mergeSubscriber.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeSubscriber.h();
        }

        @Override // p148la.b
        public final boolean d() {
            return get() == SubscriptionHelper.f40968b;
        }

        @Override // p148la.b
        public final void dispose() {
            SubscriptionHelper.a(this);
        }

        @Override // bc.b
        public final void e(bc.c cVar) throws Exception {
            if (SubscriptionHelper.b(this, cVar)) {
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(7);
                    if (iH == 1) {
                        this.fusionMode = iH;
                        this.queue = gVar;
                        this.done = true;
                        this.parent.d();
                        return;
                    }
                    if (iH == 2) {
                        this.fusionMode = iH;
                        this.queue = gVar;
                    }
                }
                cVar.g(this.bufferSize);
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) throws Exception {
            lazySet(SubscriptionHelper.f40968b);
            MergeSubscriber<T, U> mergeSubscriber = this.parent;
            AtomicThrowable atomicThrowable = mergeSubscriber.errs;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
                return;
            }
            this.done = true;
            if (!mergeSubscriber.delayErrors) {
                mergeSubscriber.upstream.cancel();
                for (InnerSubscriber<?, ?> innerSubscriber : mergeSubscriber.subscribers.getAndSet(MergeSubscriber.f40708c)) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.a(innerSubscriber);
                }
            }
            mergeSubscriber.d();
        }
    }

    public static final class MergeSubscriber<T, U> extends AtomicInteger implements p123ja.g<T>, bc.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f40707b = new InnerSubscriber[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InnerSubscriber<?, ?>[] f40708c = new InnerSubscriber[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final bc.b<? super U> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final p183oa.c<? super T, ? extends bc.a<? extends U>> mapper;
        final int maxConcurrency;
        volatile ra.i<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        bc.c upstream;

        public MergeSubscriber(p123ja.g gVar, qa.a.f fVar, int i10, int i11) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.actual = gVar;
            this.mapper = fVar;
            this.delayErrors = false;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            this.scalarLimit = Math.max(1, i10 >> 1);
            atomicReference.lazySet(f40707b);
        }

        @Override // bc.b
        public final void a() throws Exception {
            if (this.done) {
                return;
            }
            this.done = true;
            d();
        }

        public final boolean b() {
            if (this.cancelled) {
                ra.i<U> iVar = this.queue;
                if (iVar != null) {
                    iVar.clear();
                }
                return true;
            }
            if (this.delayErrors || this.errs.get() == null) {
                return false;
            }
            ra.i<U> iVar2 = this.queue;
            if (iVar2 != null) {
                iVar2.clear();
            }
            AtomicThrowable atomicThrowable = this.errs;
            atomicThrowable.getClass();
            Throwable thB = ExceptionHelper.b(atomicThrowable);
            if (thB != ExceptionHelper.f40974a) {
                this.actual.onError(thB);
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bc.b
        public final void c(T t8) throws Exception {
            if (this.done) {
                return;
            }
            try {
                bc.a<? extends U> aVarApply = this.mapper.apply(t8);
                Q3.d.I(aVarApply, "The mapper returned a null Publisher");
                bc.a<? extends U> aVar = aVarApply;
                if (aVar instanceof Callable) {
                    try {
                        Object objCall = ((Callable) aVar).call();
                        if (objCall == null) {
                            if (this.maxConcurrency == Integer.MAX_VALUE || this.cancelled) {
                                return;
                            }
                            int i10 = this.scalarEmitted + 1;
                            this.scalarEmitted = i10;
                            int i11 = this.scalarLimit;
                            if (i10 == i11) {
                                this.scalarEmitted = 0;
                                this.upstream.g(i11);
                                return;
                            }
                            return;
                        }
                        if (get() == 0 && compareAndSet(0, 1)) {
                            long j = this.requested.get();
                            ra.i<U> iVar = this.queue;
                            if (j == 0 || !(iVar == 0 || iVar.isEmpty())) {
                                if (iVar == 0) {
                                    iVar = (ra.i<U>) i();
                                }
                                if (!iVar.offer(objCall)) {
                                    onError(new IllegalStateException("Scalar queue full?!"));
                                    return;
                                }
                            } else {
                                this.actual.c(objCall);
                                if (j != Long.MAX_VALUE) {
                                    this.requested.decrementAndGet();
                                }
                                if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                    int i12 = this.scalarEmitted + 1;
                                    this.scalarEmitted = i12;
                                    int i13 = this.scalarLimit;
                                    if (i12 == i13) {
                                        this.scalarEmitted = 0;
                                        this.upstream.g(i13);
                                    }
                                }
                            }
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } else if (!i().offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        } else if (getAndIncrement() != 0) {
                            return;
                        }
                        h();
                        return;
                    } catch (Throwable th) {
                        Fa.d.g(th);
                        AtomicThrowable atomicThrowable = this.errs;
                        atomicThrowable.getClass();
                        ExceptionHelper.a(atomicThrowable, th);
                        d();
                        return;
                    }
                }
                long j10 = this.uniqueId;
                this.uniqueId = 1 + j10;
                InnerSubscriber<?, ?> innerSubscriber = new InnerSubscriber<>(this, j10);
                while (true) {
                    InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                    if (innerSubscriberArr == f40708c) {
                        SubscriptionHelper.a(innerSubscriber);
                        return;
                    }
                    int length = innerSubscriberArr.length;
                    InnerSubscriber<?, ?>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                    do {
                        if (atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            aVar.a(innerSubscriber);
                            return;
                        }
                    } while (atomicReference.get() == innerSubscriberArr);
                }
            } catch (Throwable th2) {
                Fa.d.g(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // bc.c
        public final void cancel() {
            ra.i<U> iVar;
            InnerSubscriber<?, ?>[] andSet;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = f40708c;
            if (innerSubscriberArr != innerSubscriberArr2 && (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) != innerSubscriberArr2) {
                for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    innerSubscriber.getClass();
                    SubscriptionHelper.a(innerSubscriber);
                }
                AtomicThrowable atomicThrowable = this.errs;
                atomicThrowable.getClass();
                Throwable thB = ExceptionHelper.b(atomicThrowable);
                if (thB != null && thB != ExceptionHelper.f40974a) {
                    p231sa.a.c(thB);
                }
            }
            if (getAndIncrement() != 0 || (iVar = this.queue) == null) {
                return;
            }
            iVar.clear();
        }

        public final void d() throws Exception {
            if (getAndIncrement() == 0) {
                h();
            }
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.d(this.upstream, cVar)) {
                this.upstream = cVar;
                this.actual.e(this);
                if (this.cancelled) {
                    return;
                }
                int i10 = this.maxConcurrency;
                if (i10 == Integer.MAX_VALUE) {
                    cVar.g(Long.MAX_VALUE);
                } else {
                    cVar.g(i10);
                }
            }
        }

        @Override // bc.c
        public final void g(long j) throws Exception {
            if (SubscriptionHelper.c(j)) {
                o.b(this.requested, j);
                d();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void h() throws Exception {
            long j;
            long j10;
            boolean z10;
            int i10;
            int i11;
            long j11;
            Object obj;
            bc.b<? super U> bVar = this.actual;
            int iAddAndGet = 1;
            while (!b()) {
                ra.i<U> iVar = this.queue;
                long jAddAndGet = this.requested.get();
                boolean z11 = jAddAndGet == Long.MAX_VALUE;
                long j12 = 0;
                long j13 = 0;
                if (iVar != null) {
                    do {
                        long j14 = 0;
                        obj = null;
                        while (jAddAndGet != 0) {
                            U uPoll = iVar.poll();
                            if (b()) {
                                return;
                            }
                            if (uPoll == null) {
                                obj = uPoll;
                                break;
                            }
                            bVar.c(uPoll);
                            j13++;
                            j14++;
                            jAddAndGet--;
                            obj = uPoll;
                        }
                        if (j14 != 0) {
                            jAddAndGet = z11 ? Long.MAX_VALUE : this.requested.addAndGet(-j14);
                        }
                        if (jAddAndGet == 0) {
                            break;
                        }
                    } while (obj != null);
                }
                boolean z12 = this.done;
                ra.i<U> iVar2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                int length = innerSubscriberArr.length;
                if (z12 && ((iVar2 == null || iVar2.isEmpty()) && length == 0)) {
                    AtomicThrowable atomicThrowable = this.errs;
                    atomicThrowable.getClass();
                    Throwable thB = ExceptionHelper.b(atomicThrowable);
                    if (thB != ExceptionHelper.f40974a) {
                        if (thB == null) {
                            bVar.a();
                            return;
                        } else {
                            bVar.onError(thB);
                            return;
                        }
                    }
                    return;
                }
                int i12 = iAddAndGet;
                if (length != 0) {
                    long j15 = this.lastId;
                    int i13 = this.lastIndex;
                    if (length <= i13 || innerSubscriberArr[i13].id != j15) {
                        if (length <= i13) {
                            i13 = 0;
                        }
                        for (int i14 = 0; i14 < length && innerSubscriberArr[i13].id != j15; i14++) {
                            i13++;
                            if (i13 == length) {
                                i13 = 0;
                            }
                        }
                        this.lastIndex = i13;
                        this.lastId = innerSubscriberArr[i13].id;
                    }
                    int i15 = i13;
                    boolean z13 = false;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= length) {
                            z10 = z13;
                            break;
                        }
                        if (b()) {
                            return;
                        }
                        InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr[i15];
                        Object obj2 = null;
                        while (!b()) {
                            j<U> jVar = innerSubscriber.queue;
                            if (jVar == null) {
                                i10 = length;
                            } else {
                                i10 = length;
                                Object obj3 = obj2;
                                long j16 = j12;
                                while (jAddAndGet != j12) {
                                    try {
                                        U uPoll2 = jVar.poll();
                                        if (uPoll2 == null) {
                                            obj3 = uPoll2;
                                            j12 = 0;
                                            break;
                                        }
                                        bVar.c(uPoll2);
                                        if (b()) {
                                            return;
                                        }
                                        jAddAndGet--;
                                        j16++;
                                        obj3 = uPoll2;
                                        j12 = 0;
                                    } catch (Throwable th) {
                                        Fa.d.g(th);
                                        SubscriptionHelper.a(innerSubscriber);
                                        AtomicThrowable atomicThrowable2 = this.errs;
                                        atomicThrowable2.getClass();
                                        ExceptionHelper.a(atomicThrowable2, th);
                                        if (!this.delayErrors) {
                                            this.upstream.cancel();
                                        }
                                        if (b()) {
                                            return;
                                        }
                                        j(innerSubscriber);
                                        i16++;
                                        z13 = true;
                                        i11 = 1;
                                    }
                                }
                                if (j16 != j12) {
                                    jAddAndGet = !z11 ? this.requested.addAndGet(-j16) : Long.MAX_VALUE;
                                    innerSubscriber.b(j16);
                                    j11 = 0;
                                } else {
                                    j11 = j12;
                                }
                                if (jAddAndGet != j11 && obj3 != null) {
                                    length = i10;
                                    obj2 = obj3;
                                    j12 = 0;
                                }
                            }
                            boolean z14 = innerSubscriber.done;
                            j<U> jVar2 = innerSubscriber.queue;
                            if (z14 && (jVar2 == null || jVar2.isEmpty())) {
                                j(innerSubscriber);
                                if (b()) {
                                    return;
                                }
                                j13++;
                                z13 = true;
                            }
                            if (jAddAndGet == 0) {
                                z10 = z13;
                                break;
                            }
                            i15++;
                            if (i15 == i10) {
                                i15 = 0;
                            }
                            i11 = 1;
                            i16 += i11;
                            length = i10;
                            j12 = 0;
                        }
                        return;
                    }
                    this.lastIndex = i15;
                    this.lastId = innerSubscriberArr[i15].id;
                    j10 = j13;
                    j = 0;
                } else {
                    j = 0;
                    j10 = j13;
                    z10 = false;
                }
                if (j10 != j && !this.cancelled) {
                    this.upstream.g(j10);
                }
                if (z10) {
                    iAddAndGet = i12;
                } else {
                    iAddAndGet = addAndGet(-i12);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        public final ra.i i() {
            ra.i<U> aVar = this.queue;
            if (aVar == null) {
                aVar = this.maxConcurrency == Integer.MAX_VALUE ? new io.reactivex.internal.queue.a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                this.queue = aVar;
            }
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void j(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr2[i10] == innerSubscriber) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = f40707b;
                } else {
                    InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr2, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                    }
                }
                return;
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) throws Exception {
            if (this.done) {
                p231sa.a.c(th);
                return;
            }
            AtomicThrowable atomicThrowable = this.errs;
            atomicThrowable.getClass();
            if (!ExceptionHelper.a(atomicThrowable, th)) {
                p231sa.a.c(th);
            } else {
                this.done = true;
                d();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowableFlatMap(FlowableFromArray flowableFromArray, int i10) {
        super(flowableFromArray);
        qa.a.f fVar = qa.a.f46188a;
        this.f40704d = fVar;
        this.f40705e = 3;
        this.f40706f = i10;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        p123ja.d<T> dVar = this.f40737c;
        qa.a.f fVar = this.f40704d;
        if (h.a(dVar, gVar, fVar)) {
            return;
        }
        dVar.d(new MergeSubscriber(gVar, fVar, this.f40705e, this.f40706f));
    }
}
