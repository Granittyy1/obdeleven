package io.reactivex.internal.operators.flowable;

import S4.o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ra.j;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowablePublish<T> extends p171na.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p123ja.d<T> f40726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<PublishSubscriber<T>> f40727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f40729f;

    public static final class InnerSubscriber<T> extends AtomicLong implements bc.c {
        private static final long serialVersionUID = -4453897557930727610L;
        final bc.b<? super T> child;
        long emitted;
        volatile PublishSubscriber<T> parent;

        public InnerSubscriber(bc.b<? super T> bVar) {
            this.child = bVar;
        }

        @Override // bc.c
        public final void cancel() {
            PublishSubscriber<T> publishSubscriber;
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (publishSubscriber = this.parent) == null) {
                return;
            }
            publishSubscriber.h(this);
            publishSubscriber.g();
        }

        @Override // bc.c
        public final void g(long j) {
            long j10;
            if (SubscriptionHelper.c(j)) {
                do {
                    j10 = get();
                    if (j10 == Long.MIN_VALUE || j10 == Long.MAX_VALUE) {
                        break;
                    }
                } while (!compareAndSet(j10, o.c(j10, j)));
                PublishSubscriber<T> publishSubscriber = this.parent;
                if (publishSubscriber != null) {
                    publishSubscriber.g();
                }
            }
        }
    }

    public static final class PublishSubscriber<T> extends AtomicInteger implements p123ja.g<T>, p148la.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InnerSubscriber[] f40730b = new InnerSubscriber[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final InnerSubscriber[] f40731c = new InnerSubscriber[0];
        private static final long serialVersionUID = -202316842419149694L;
        final int bufferSize;
        final AtomicReference<PublishSubscriber<T>> current;
        volatile j<T> queue;
        int sourceMode;
        volatile Object terminalEvent;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final AtomicReference<bc.c> f40732s = new AtomicReference<>();
        final AtomicReference<InnerSubscriber<T>[]> subscribers = new AtomicReference<>(f40730b);
        final AtomicBoolean shouldConnect = new AtomicBoolean();

        public PublishSubscriber(AtomicReference<PublishSubscriber<T>> atomicReference, int i10) {
            this.current = atomicReference;
            this.bufferSize = i10;
        }

        @Override // bc.b
        public final void a() {
            if (this.terminalEvent == null) {
                this.terminalEvent = NotificationLite.f40975b;
                g();
            }
        }

        public final boolean b(Object obj, boolean z10) {
            int i10 = 0;
            if (obj != null) {
                NotificationLite notificationLite = NotificationLite.f40975b;
                InnerSubscriber<T>[] innerSubscriberArr = f40731c;
                if (obj != notificationLite) {
                    Throwable thC = NotificationLite.c(obj);
                    AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
                    while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                    }
                    InnerSubscriber<T>[] andSet = this.subscribers.getAndSet(innerSubscriberArr);
                    if (andSet.length != 0) {
                        int length = andSet.length;
                        while (i10 < length) {
                            andSet[i10].child.onError(thC);
                            i10++;
                        }
                    } else {
                        p231sa.a.c(thC);
                    }
                    return true;
                }
                if (z10) {
                    AtomicReference<PublishSubscriber<T>> atomicReference2 = this.current;
                    while (!atomicReference2.compareAndSet(this, null) && atomicReference2.get() == this) {
                    }
                    InnerSubscriber<T>[] andSet2 = this.subscribers.getAndSet(innerSubscriberArr);
                    int length2 = andSet2.length;
                    while (i10 < length2) {
                        andSet2[i10].child.a();
                        i10++;
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // bc.b
        public final void c(T t8) {
            if (this.sourceMode != 0 || this.queue.offer(t8)) {
                g();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.subscribers.get() == f40731c;
        }

        @Override // p148la.b
        public final void dispose() {
            InnerSubscriber<T>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<T>[] innerSubscriberArr2 = f40731c;
            if (innerSubscriberArr == innerSubscriberArr2 || this.subscribers.getAndSet(innerSubscriberArr2) == innerSubscriberArr2) {
                return;
            }
            AtomicReference<PublishSubscriber<T>> atomicReference = this.current;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            SubscriptionHelper.a(this.f40732s);
        }

        @Override // bc.b
        public final void e(bc.c cVar) {
            if (SubscriptionHelper.b(this.f40732s, cVar)) {
                if (cVar instanceof ra.g) {
                    ra.g gVar = (ra.g) cVar;
                    int iH = gVar.h(3);
                    if (iH == 1) {
                        this.sourceMode = iH;
                        this.queue = gVar;
                        this.terminalEvent = NotificationLite.f40975b;
                        g();
                        return;
                    }
                    if (iH == 2) {
                        this.sourceMode = iH;
                        this.queue = gVar;
                        cVar.g(this.bufferSize);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.bufferSize);
                cVar.g(this.bufferSize);
            }
        }

        public final void g() {
            T tPoll;
            T tPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
            boolean z10 = true;
            InnerSubscriber<T>[] innerSubscriberArr = atomicReference.get();
            int iAddAndGet = 1;
            while (true) {
                Object obj = this.terminalEvent;
                j<T> jVar = this.queue;
                boolean z11 = (jVar == null || jVar.isEmpty()) ? z10 : false;
                if (b(obj, z11)) {
                    return;
                }
                if (!z11) {
                    int length = innerSubscriberArr.length;
                    int i10 = 0;
                    long jMin = Long.MAX_VALUE;
                    for (InnerSubscriber<T> innerSubscriber : innerSubscriberArr) {
                        long j = innerSubscriber.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(jMin, j - innerSubscriber.emitted);
                        } else {
                            i10++;
                        }
                    }
                    if (length == i10) {
                        Object objB = this.terminalEvent;
                        try {
                            tPoll = jVar.poll();
                        } catch (Throwable th) {
                            Fa.d.g(th);
                            this.f40732s.get().cancel();
                            objB = NotificationLite.b(th);
                            this.terminalEvent = objB;
                            tPoll = null;
                        }
                        if (b(objB, tPoll == null ? z10 : false)) {
                            return;
                        }
                        if (this.sourceMode != z10) {
                            this.f40732s.get().g(1L);
                        }
                    } else {
                        int i11 = 0;
                        while (true) {
                            long j10 = i11;
                            if (j10 < jMin) {
                                Object objB2 = this.terminalEvent;
                                try {
                                    tPoll2 = jVar.poll();
                                } catch (Throwable th2) {
                                    Fa.d.g(th2);
                                    this.f40732s.get().cancel();
                                    objB2 = NotificationLite.b(th2);
                                    this.terminalEvent = objB2;
                                    tPoll2 = null;
                                }
                                boolean z12 = tPoll2 == null ? z10 : false;
                                if (b(objB2, z12)) {
                                    return;
                                }
                                if (z12) {
                                    z11 = z12;
                                } else {
                                    int length2 = innerSubscriberArr.length;
                                    int i12 = 0;
                                    boolean z13 = false;
                                    while (i12 < length2) {
                                        InnerSubscriber<T> innerSubscriber2 = innerSubscriberArr[i12];
                                        long j11 = innerSubscriber2.get();
                                        if (j11 != Long.MIN_VALUE) {
                                            if (j11 != Long.MAX_VALUE) {
                                                innerSubscriber2.emitted++;
                                            }
                                            innerSubscriber2.child.c(tPoll2);
                                        } else {
                                            jVar = jVar;
                                            z12 = z12;
                                            z13 = true;
                                        }
                                        i12++;
                                        jVar = jVar;
                                        z12 = z12;
                                    }
                                    j<T> jVar2 = jVar;
                                    boolean z14 = z12;
                                    i11++;
                                    InnerSubscriber<T>[] innerSubscriberArr2 = atomicReference.get();
                                    if (z13 || innerSubscriberArr2 != innerSubscriberArr) {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        z10 = true;
                                    } else {
                                        jVar = jVar2;
                                        z11 = z14;
                                        z10 = true;
                                    }
                                }
                            }
                            if (i11 > 0) {
                                z10 = true;
                                if (this.sourceMode != 1) {
                                    this.f40732s.get().g(j10);
                                }
                            } else {
                                z10 = true;
                            }
                            if (jMin == 0 || z11) {
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    innerSubscriberArr = atomicReference.get();
                }
            }
        }

        public final void h(InnerSubscriber<T> innerSubscriber) {
            InnerSubscriber<T>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<T>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (innerSubscriberArr2[i10].equals(innerSubscriber)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriberArr = f40730b;
                } else {
                    InnerSubscriber<T>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                    System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i10);
                    System.arraycopy(innerSubscriberArr2, i10 + 1, innerSubscriberArr3, i10, (length - i10) - 1);
                    innerSubscriberArr = innerSubscriberArr3;
                }
                AtomicReference<InnerSubscriber<T>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                    if (atomicReference.get() != innerSubscriberArr2) {
                    }
                }
                return;
            }
        }

        @Override // bc.b
        public final void onError(Throwable th) {
            if (this.terminalEvent != null) {
                p231sa.a.c(th);
            } else {
                this.terminalEvent = NotificationLite.b(th);
                g();
            }
        }
    }

    public static final class a<T> implements bc.a<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<PublishSubscriber<T>> f40733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40734c;

        public a(AtomicReference<PublishSubscriber<T>> atomicReference, int i10) {
            this.f40733b = atomicReference;
            this.f40734c = i10;
        }

        @Override // bc.a
        public final void a(bc.b<? super T> bVar) {
            PublishSubscriber<T> publishSubscriber;
            InnerSubscriber<T> innerSubscriber = new InnerSubscriber<>(bVar);
            bVar.e(innerSubscriber);
            loop0: while (true) {
                PublishSubscriber<T> publishSubscriber2 = this.f40733b.get();
                if (publishSubscriber2 == null || publishSubscriber2.d()) {
                    PublishSubscriber<T> publishSubscriber3 = new PublishSubscriber<>(this.f40733b, this.f40734c);
                    AtomicReference<PublishSubscriber<T>> atomicReference = this.f40733b;
                    while (true) {
                        if (atomicReference.compareAndSet(publishSubscriber2, publishSubscriber3)) {
                            publishSubscriber = publishSubscriber3;
                        } else if (atomicReference.get() != publishSubscriber2) {
                        }
                    }
                } else {
                    publishSubscriber = publishSubscriber2;
                }
                while (true) {
                    InnerSubscriber<T>[] innerSubscriberArr = publishSubscriber.subscribers.get();
                    if (innerSubscriberArr == PublishSubscriber.f40731c) {
                        break;
                    }
                    int length = innerSubscriberArr.length;
                    InnerSubscriber<T>[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                    innerSubscriberArr2[length] = innerSubscriber;
                    AtomicReference<InnerSubscriber<T>[]> atomicReference2 = publishSubscriber.subscribers;
                    do {
                        if (atomicReference2.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                            break loop0;
                        }
                    } while (atomicReference2.get() == innerSubscriberArr);
                }
            }
            if (innerSubscriber.get() == Long.MIN_VALUE) {
                publishSubscriber.h(innerSubscriber);
            } else {
                innerSubscriber.parent = publishSubscriber;
            }
            publishSubscriber.g();
        }
    }

    public FlowablePublish(a aVar, p123ja.d dVar, AtomicReference atomicReference, int i10) {
        this.f40729f = aVar;
        this.f40726c = dVar;
        this.f40727d = atomicReference;
        this.f40728e = i10;
    }

    @Override // p123ja.d
    public final void e(p123ja.g gVar) {
        this.f40729f.a(gVar);
    }

    public final void f(io.reactivex.internal.util.b bVar) {
        PublishSubscriber<T> publishSubscriber;
        loop0: while (true) {
            AtomicReference<PublishSubscriber<T>> atomicReference = this.f40727d;
            publishSubscriber = atomicReference.get();
            if (publishSubscriber != null && !publishSubscriber.d()) {
                break;
            }
            PublishSubscriber<T> publishSubscriber2 = new PublishSubscriber<>(atomicReference, this.f40728e);
            do {
                if (atomicReference.compareAndSet(publishSubscriber, publishSubscriber2)) {
                    publishSubscriber = publishSubscriber2;
                    break loop0;
                }
            } while (atomicReference.get() == publishSubscriber);
        }
        boolean z10 = false;
        if (!publishSubscriber.shouldConnect.get() && publishSubscriber.shouldConnect.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            bVar.f40981b = publishSubscriber;
            if (z10) {
                this.f40726c.d(publishSubscriber);
            }
        } catch (Throwable th) {
            Fa.d.g(th);
            throw ExceptionHelper.c(th);
        }
    }
}
