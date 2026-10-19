package p005a4;

import Z3.q;
import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: AnalyticsUserIDStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8014a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f8015b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f8016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f8017d;

    public static void a() {
        if (f8017d) {
            return;
        }
        f8015b.writeLock().lock();
        try {
            if (f8017d) {
                return;
            }
            f8016c = PreferenceManager.getDefaultSharedPreferences(q.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f8017d = true;
        } finally {
            f8015b.writeLock().unlock();
        }
    }
}
