package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.o;

/* JADX INFO: compiled from: ComputationScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f40898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final RxThreadFactory f40899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f40900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f40901e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<b> f40902a;

    /* JADX INFO: renamed from: io.reactivex.internal.schedulers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class C0463a extends o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p196pa.b f40903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p148la.a f40904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p196pa.b f40905d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c f40906e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f40907f;

        public C0463a(c cVar) {
            this.f40906e = cVar;
            p196pa.b bVar = new p196pa.b();
            this.f40903b = bVar;
            p148la.a aVar = new p148la.a();
            this.f40904c = aVar;
            p196pa.b bVar2 = new p196pa.b();
            this.f40905d = bVar2;
            bVar2.b(bVar);
            bVar2.b(aVar);
        }

        @Override // ja.o.b
        public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
            return this.f40907f ? EmptyDisposable.f40664b : this.f40906e.c(runnable, timeUnit, this.f40904c);
        }

        @Override // ja.o.b
        public final void b(Runnable runnable) {
            if (this.f40907f) {
                return;
            }
            this.f40906e.c(runnable, TimeUnit.MILLISECONDS, this.f40903b);
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40907f;
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.f40907f) {
                return;
            }
            this.f40907f = true;
            this.f40905d.dispose();
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f40909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f40910c;

        public b(int i10, RxThreadFactory rxThreadFactory) {
            this.f40908a = i10;
            this.f40909b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f40909b[i11] = new c(rxThreadFactory);
            }
        }
    }

    /* JADX INFO: compiled from: ComputationScheduler.java */
    public static final class c extends d {
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f40900d = iAvailableProcessors;
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f40901e = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory(Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), "RxComputationThreadPool", true);
        f40899c = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f40898b = bVar;
        for (c cVar2 : bVar.f40909b) {
            cVar2.dispose();
        }
    }

    public a() {
        AtomicReference<b> atomicReference;
        RxThreadFactory rxThreadFactory = f40899c;
        b bVar = f40898b;
        this.f40902a = new AtomicReference<>(bVar);
        b bVar2 = new b(f40900d, rxThreadFactory);
        do {
            atomicReference = this.f40902a;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (c cVar : bVar2.f40909b) {
            cVar.dispose();
        }
    }

    @Override // p123ja.o
    public final o.b a() {
        c cVar;
        b bVar = this.f40902a.get();
        int i10 = bVar.f40908a;
        if (i10 == 0) {
            cVar = f40901e;
        } else {
            long j = bVar.f40910c;
            bVar.f40910c = 1 + j;
            cVar = bVar.f40909b[(int) (j % ((long) i10))];
        }
        return new C0463a(cVar);
    }

    @Override // p123ja.o
    public final p148la.b c(Runnable runnable, TimeUnit timeUnit) {
        c cVar;
        b bVar = this.f40902a.get();
        int i10 = bVar.f40908a;
        if (i10 == 0) {
            cVar = f40901e;
        } else {
            long j = bVar.f40910c;
            bVar.f40910c = 1 + j;
            cVar = bVar.f40909b[(int) (j % ((long) i10))];
        }
        cVar.getClass();
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.a(cVar.f40930b.submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            p231sa.a.c(e10);
            return EmptyDisposable.f40664b;
        }
    }
}
