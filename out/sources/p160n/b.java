package p160n;

import C.g;
import android.os.Looper;

/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f44653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f44654e = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f44655c = new c();

    public static b i0() {
        if (f44653d != null) {
            return f44653d;
        }
        synchronized (b.class) {
            try {
                if (f44653d == null) {
                    f44653d = new b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f44653d;
    }

    public final boolean j0() {
        this.f44655c.getClass();
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
