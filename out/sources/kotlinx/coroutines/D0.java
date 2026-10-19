package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<U> f43172a = new ThreadLocal<>();

    public static U a() {
        ThreadLocal<U> threadLocal = f43172a;
        U u10 = threadLocal.get();
        if (u10 != null) {
            return u10;
        }
        C2678d c2678d = new C2678d(Thread.currentThread());
        threadLocal.set(c2678d);
        return c2678d;
    }
}
