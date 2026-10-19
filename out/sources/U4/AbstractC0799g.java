package U4;

import android.content.Context;
import android.os.HandlerThread;

/* JADX INFO: renamed from: U4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0799g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6461a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b0 f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HandlerThread f6463c;

    public static b0 a(Context context) {
        synchronized (f6461a) {
            try {
                if (f6462b == null) {
                    f6462b = new b0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6462b;
    }
}
