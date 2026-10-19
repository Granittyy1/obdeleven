package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.o;

/* JADX INFO: compiled from: IoScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RxThreadFactory f40911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RxThreadFactory f40912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeUnit f40913d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f40914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f40915f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<a> f40916a;

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f40918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p148la.a f40919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f40920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ScheduledFuture f40921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final RxThreadFactory f40922g;

        public a(long j, TimeUnit timeUnit, RxThreadFactory rxThreadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f40917b = nanos;
            this.f40918c = new ConcurrentLinkedQueue<>();
            this.f40919d = new p148la.a();
            this.f40922g = rxThreadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, b.f40912c);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f40920e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f40921f = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = this.f40918c;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : concurrentLinkedQueue) {
                if (cVar.f40927d > jNanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(cVar)) {
                    this.f40919d.c(cVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: io.reactivex.internal.schedulers.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class C0464b extends o.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f40924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f40925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f40926e = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p148la.a f40923b = new p148la.a();

        public C0464b(a aVar) {
            c cVar;
            c cVar2;
            this.f40924c = aVar;
            if (aVar.f40919d.f44512c) {
                cVar2 = b.f40914e;
            } else {
                do {
                    if (aVar.f40918c.isEmpty()) {
                        cVar = new c(aVar.f40922g);
                        aVar.f40919d.b(cVar);
                        break;
                    }
                    cVar = aVar.f40918c.poll();
                } while (cVar == null);
                cVar2 = cVar;
            }
            this.f40925d = cVar2;
        }

        @Override // ja.o.b
        public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
            return this.f40923b.f44512c ? EmptyDisposable.f40664b : this.f40925d.c(runnable, timeUnit, this.f40923b);
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40926e.get();
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.f40926e.compareAndSet(false, true)) {
                this.f40923b.dispose();
                a aVar = this.f40924c;
                aVar.getClass();
                long jNanoTime = System.nanoTime() + aVar.f40917b;
                c cVar = this.f40925d;
                cVar.f40927d = jNanoTime;
                aVar.f40918c.offer(cVar);
            }
        }
    }

    /* JADX INFO: compiled from: IoScheduler.java */
    public static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f40927d;

        public c(RxThreadFactory rxThreadFactory) {
            super(rxThreadFactory);
            this.f40927d = 0L;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f40914e = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory(iMax, "RxCachedThreadScheduler", false);
        f40911b = rxThreadFactory;
        f40912c = new RxThreadFactory(iMax, "RxCachedWorkerPoolEvictor", false);
        a aVar = new a(0L, null, rxThreadFactory);
        f40915f = aVar;
        aVar.f40919d.dispose();
        ScheduledFuture scheduledFuture = aVar.f40921f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f40920e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public b() {
        AtomicReference<a> atomicReference;
        RxThreadFactory rxThreadFactory = f40911b;
        a aVar = f40915f;
        this.f40916a = new AtomicReference<>(aVar);
        a aVar2 = new a(60L, f40913d, rxThreadFactory);
        do {
            atomicReference = this.f40916a;
            if (atomicReference.compareAndSet(aVar, aVar2)) {
                return;
            }
        } while (atomicReference.get() == aVar);
        aVar2.f40919d.dispose();
        ScheduledFuture scheduledFuture = aVar2.f40921f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar2.f40920e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // p123ja.o
    public final o.b a() {
        return new C0464b(this.f40916a.get());
    }
}
