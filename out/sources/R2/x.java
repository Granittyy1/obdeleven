package R2;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: WakeLocks.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5247a = 0;

    static {
        kotlin.jvm.internal.i.d(androidx.work.k.d("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (y.f5248a) {
            y.f5249b.put(wakeLock, strConcat);
        }
        kotlin.jvm.internal.i.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
