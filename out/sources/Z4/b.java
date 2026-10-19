package Z4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f7918c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadFactory f7919d = Executors.defaultThreadFactory();

    public b(String str) {
        this.f7917b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7919d.newThread(new c(runnable));
        int andIncrement = this.f7918c.getAndIncrement();
        int length = String.valueOf(andIncrement).length();
        String str = this.f7917b;
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1);
        sb2.append(str);
        sb2.append("[");
        sb2.append(andIncrement);
        sb2.append("]");
        threadNewThread.setName(sb2.toString());
        return threadNewThread;
    }
}
