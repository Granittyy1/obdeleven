package p302y6;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: ExecutorUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class J implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f48330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f48331c;

    /* JADX INFO: compiled from: ExecutorUtils.java */
    public class a extends AbstractRunnableC2808d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f48332b;

        public a(Runnable runnable) {
            this.f48332b = runnable;
        }

        @Override // p302y6.AbstractRunnableC2808d
        public final void a() {
            this.f48332b.run();
        }
    }

    public J(String str, AtomicLong atomicLong) {
        this.f48330b = str;
        this.f48331c = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
        threadNewThread.setName(this.f48330b + this.f48331c.getAndIncrement());
        return threadNewThread;
    }
}
