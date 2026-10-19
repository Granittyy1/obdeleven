package Z4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f7916c = Executors.defaultThreadFactory();

    public a(String str) {
        this.f7915b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7916c.newThread(new c(runnable));
        threadNewThread.setName(this.f7915b);
        return threadNewThread;
    }
}
