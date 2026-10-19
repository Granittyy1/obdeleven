package androidx.work;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f20338b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f20339c;

    public b(boolean z10) {
        this.f20339c = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.i.e(runnable, "runnable");
        StringBuilder sbE = C4.b.e(this.f20339c ? "WM.task-" : "androidx.work-");
        sbE.append(this.f20338b.incrementAndGet());
        return new Thread(runnable, sbE.toString());
    }
}
