package R2;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: SerialExecutorImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class t implements S2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f5235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f5236d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<a> f5234b = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5237e = new Object();

    /* JADX INFO: compiled from: SerialExecutorImpl.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f5238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f5239c;

        public a(t tVar, Runnable runnable) {
            this.f5238b = tVar;
            this.f5239c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f5239c.run();
                synchronized (this.f5238b.f5237e) {
                    this.f5238b.a();
                }
            } catch (Throwable th) {
                synchronized (this.f5238b.f5237e) {
                    this.f5238b.a();
                    throw th;
                }
            }
        }
    }

    public t(ExecutorService executorService) {
        this.f5235c = executorService;
    }

    public final void a() {
        a aVarPoll = this.f5234b.poll();
        this.f5236d = aVarPoll;
        if (aVarPoll != null) {
            this.f5235c.execute(aVarPoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f5237e) {
            try {
                this.f5234b.add(new a(this, runnable));
                if (this.f5236d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
