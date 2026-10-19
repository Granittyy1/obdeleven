package p214r3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: LottieThreadFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f46318e = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadGroup f46319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f46320c = new AtomicInteger(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46321d;

    public d() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f46319b = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f46321d = "lottie-" + f46318e.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f46319b, runnable, this.f46321d + this.f46320c.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
