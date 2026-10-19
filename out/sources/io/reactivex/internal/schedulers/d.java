package io.reactivex.internal.schedulers;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p123ja.o;

/* JADX INFO: compiled from: NewThreadWorker.java */
/* JADX INFO: loaded from: classes3.dex */
public class d extends o.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f40930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f40931c;

    public d(RxThreadFactory rxThreadFactory) {
        boolean z10 = e.f40932a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (e.f40932a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            e.f40935d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f40930b = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // ja.o.b
    public final p148la.b a(Runnable runnable, TimeUnit timeUnit) {
        return this.f40931c ? EmptyDisposable.f40664b : c(runnable, timeUnit, null);
    }

    @Override // ja.o.b
    public final void b(Runnable runnable) {
        a(runnable, null);
    }

    public final ScheduledRunnable c(Runnable runnable, TimeUnit timeUnit, p196pa.a aVar) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, aVar);
        if (aVar != null && !aVar.b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.a(this.f40930b.submit((Callable) scheduledRunnable));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.c(scheduledRunnable);
            }
            p231sa.a.c(e10);
        }
        return scheduledRunnable;
    }

    @Override // p148la.b
    public final boolean d() {
        return this.f40931c;
    }

    @Override // p148la.b
    public final void dispose() {
        if (this.f40931c) {
            return;
        }
        this.f40931c = true;
        this.f40930b.shutdownNow();
    }
}
