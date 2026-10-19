package Sa;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.y;
import p114j1.C2479a;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f5715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f5716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f5717e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f5718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f5719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f5720h;

    static {
        String property;
        int i10 = y.f43506a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f5713a = property;
        f5714b = C2479a.o("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i11 = y.f43506a;
        if (i11 < 2) {
            i11 = 2;
        }
        f5715c = C2479a.p("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
        f5716d = C2479a.p("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f5717e = TimeUnit.SECONDS.toNanos(C2479a.o("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f5718f = d.f5707c;
        f5719g = new g(0);
        f5720h = new g(1);
    }
}
