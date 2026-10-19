package bo.app;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f22237a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22238b = (int) TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static l2 f22239c;

    private y1() {
    }

    public static final l2 a() {
        return new m3(new x1(f22238b));
    }

    public final l2 b() {
        return f22239c;
    }
}
