package y7;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: GaugeMetadataManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f48418a = Runtime.getRuntime();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f48419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f48420c;

    static {
        p241t7.a.d();
    }

    public d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f48419b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f48420c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
