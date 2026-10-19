package p123ja;

import io.reactivex.internal.schedulers.d;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Scheduler.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: compiled from: Scheduler.java */
    public static final class a implements p148la.b, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f41195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f41196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Thread f41197d;

        public a(Runnable runnable, b bVar) {
            this.f41195b = runnable;
            this.f41196c = bVar;
        }

        @Override // p148la.b
        public final boolean d() {
            return this.f41196c.d();
        }

        @Override // p148la.b
        public final void dispose() {
            if (this.f41197d == Thread.currentThread()) {
                b bVar = this.f41196c;
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    if (dVar.f40931c) {
                        return;
                    }
                    dVar.f40931c = true;
                    dVar.f40930b.shutdown();
                    return;
                }
            }
            this.f41196c.dispose();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41197d = Thread.currentThread();
            try {
                this.f41195b.run();
            } finally {
                dispose();
                this.f41197d = null;
            }
        }
    }

    /* JADX INFO: compiled from: Scheduler.java */
    public static abstract class b implements p148la.b {
        public abstract p148la.b a(Runnable runnable, TimeUnit timeUnit);

        public void b(Runnable runnable) {
            a(runnable, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract b a();

    public p148la.b b(Runnable runnable) {
        return c(runnable, TimeUnit.NANOSECONDS);
    }

    public p148la.b c(Runnable runnable, TimeUnit timeUnit) {
        b bVarA = a();
        a aVar = new a(runnable, bVarA);
        bVarA.a(aVar, timeUnit);
        return aVar;
    }
}
