package io.reactivex.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements p148la.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FutureTask<Void> f40892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask<Void> f40893c;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        qa.a.d dVar = qa.a.f46189b;
        f40892b = new FutureTask<>(dVar, null);
        f40893c = new FutureTask<>(dVar, null);
    }

    public AbstractDirectTask(Runnable runnable) {
        this.runnable = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f40892b) {
                return;
            }
            if (future2 == f40893c) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p148la.b
    public final boolean d() {
        Future<?> future = get();
        return future == f40892b || future == f40893c;
    }

    @Override // p148la.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f40892b || future == (futureTask = f40893c) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }
}
