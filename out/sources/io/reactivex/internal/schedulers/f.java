package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123ja.o;

/* JADX INFO: compiled from: SingleScheduler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final RxThreadFactory f40936b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService> f40937a;

    /* JADX INFO: compiled from: SingleScheduler.java */
    public static final class a extends o.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f40938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p148la.a f40939c = new p148la.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f40940d;

        public a(ScheduledExecutorService scheduledExecutorService) {
            this.f40938b = scheduledExecutorService;
        }

        @Override // ja.o.b
        public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
            boolean z10 = this.f40940d;
            EmptyDisposable emptyDisposable = EmptyDisposable.f40664b;
            if (z10) {
                return emptyDisposable;
            }
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f40939c);
            this.f40939c.b(scheduledRunnable);
            try {
                scheduledRunnable.a(this.f40938b.submit((Callable) scheduledRunnable));
                return scheduledRunnable;
            } catch (RejectedExecutionException e10) {
                dispose();
                p231sa.a.c(e10);
                return emptyDisposable;
            }
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f40940d;
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.f40940d) {
                return;
            }
            this.f40940d = true;
            this.f40939c.dispose();
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
        f40936b = new RxThreadFactory(Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), "RxSingleScheduler", true);
    }

    public f() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f40937a = atomicReference;
        boolean z10 = e.f40932a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, f40936b);
        if (e.f40932a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            e.f40935d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // p123ja.o
    public final o.b a() {
        return new a(this.f40937a.get());
    }

    @Override // p123ja.o
    public final p148la.b c(Runnable runnable, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.a(this.f40937a.get().submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e10) {
            p231sa.a.c(e10);
            return EmptyDisposable.f40664b;
        }
    }
}
