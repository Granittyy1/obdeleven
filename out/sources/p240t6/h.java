package p240t6;

import K2.M;
import com.google.firebase.messaging.RunnableC2045h;
import com.voltasit.obdeleven.presentation.controlUnit.info.b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: DelegatingScheduledExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f47347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f47348c;

    public h(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f47347b = executorService;
        this.f47348c = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f47347b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47347b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f47347b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f47347b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f47347b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f47347b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new i(new i.b() { // from class: t6.b
            @Override // t6.i.b
            public final ScheduledFuture a(i.a aVar) {
                h hVar = this.f47322a;
                hVar.getClass();
                return hVar.f47348c.schedule(new RunnableC2045h(hVar, runnable, aVar, 1), j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j10, final TimeUnit timeUnit) {
        return new i(new i.b() { // from class: t6.c
            @Override // t6.i.b
            public final ScheduledFuture a(i.a aVar) {
                h hVar = this.f47326a;
                hVar.getClass();
                return hVar.f47348c.scheduleAtFixedRate(new f(hVar, runnable, aVar, 0), j, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j10, final TimeUnit timeUnit) {
        return new i(new i.b() { // from class: t6.d
            @Override // t6.i.b
            public final ScheduledFuture a(i.a aVar) {
                h hVar = this.f47331a;
                hVar.getClass();
                return hVar.f47348c.scheduleWithFixedDelay(new b(hVar, runnable, aVar, 1), j, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f47347b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f47347b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f47347b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new i(new i.b() { // from class: t6.e
            @Override // t6.i.b
            public final ScheduledFuture a(final i.a aVar) {
                final h hVar = this.f47336a;
                hVar.getClass();
                final Callable callable2 = callable;
                return hVar.f47348c.schedule(new Callable() { // from class: t6.g
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        h hVar2 = hVar;
                        hVar2.getClass();
                        return hVar2.f47347b.submit(new M(callable2, 2, aVar));
                    }
                }, j, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t8) {
        return this.f47347b.submit(runnable, t8);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f47347b.submit(runnable);
    }
}
