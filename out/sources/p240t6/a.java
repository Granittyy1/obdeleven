package p240t6;

import E7.d;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CustomThreadFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadFactory f47317f = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f47318b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f47321e;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f47319c = str;
        this.f47320d = i10;
        this.f47321e = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f47317f.newThread(new d(this, 5, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f47319c + " Thread #" + this.f47318b.getAndIncrement());
        return threadNewThread;
    }
}
