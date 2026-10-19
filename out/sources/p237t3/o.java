package p237t3;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f47233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f47234c;

    public o(C2789b c2789b) {
        Objects.requireNonNull(c2789b);
        this.f47233b = Executors.defaultThreadFactory();
        this.f47234c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f47234c;
        Thread threadNewThread = this.f47233b.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
