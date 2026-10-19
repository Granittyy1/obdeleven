package Q4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f5096c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f5097d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f5098a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f5099b;

    public a(Context context) {
        this.f5099b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f5098a;
        reentrantLock.lock();
        try {
            return this.f5099b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
