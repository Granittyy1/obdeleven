package C4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: SafeLoggingExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f2395b;

    /* JADX INFO: compiled from: SafeLoggingExecutor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f2396b;

        public a(Runnable runnable) {
            this.f2396b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f2396b.run();
            } catch (Exception e10) {
                G4.a.b("Executor", "Background execution failure.", e10);
            }
        }
    }

    public r(ExecutorService executorService) {
        this.f2395b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2395b.execute(new a(runnable));
    }
}
