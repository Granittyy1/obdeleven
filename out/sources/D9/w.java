package D9;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: SynchronizationContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f2911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2912c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Thread> f2913d = new AtomicReference<>();

    /* JADX INFO: compiled from: SynchronizationContext.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f2914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Runnable f2915c;

        public a(b bVar, Runnable runnable) {
            this.f2914b = bVar;
            this.f2915c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            w.this.execute(this.f2914b);
        }

        public final String toString() {
            return this.f2915c.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: compiled from: SynchronizationContext.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f2917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2919d;

        public b(Runnable runnable) {
            this.f2917b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f2918c) {
                return;
            }
            this.f2919d = true;
            this.f2917b.run();
        }
    }

    /* JADX INFO: compiled from: SynchronizationContext.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f2920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledFuture<?> f2921b;

        public c(b bVar, ScheduledFuture scheduledFuture) {
            this.f2920a = bVar;
            A8.p.j(scheduledFuture, "future");
            this.f2921b = scheduledFuture;
        }

        public final void a() {
            this.f2920a.f2918c = true;
            this.f2921b.cancel(false);
        }
    }

    public w(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2911b = uncaughtExceptionHandler;
    }

    public final void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference<Thread> atomicReference = this.f2913d;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = this.f2912c;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f2911b.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public final void b(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f2912c;
        A8.p.j(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public final c c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        b bVar = new b(runnable);
        return new c(bVar, scheduledExecutorService.schedule(new a(bVar, runnable), j, timeUnit));
    }

    public final void d() {
        A8.p.p("Not called from the SynchronizationContext", Thread.currentThread() == this.f2913d.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
