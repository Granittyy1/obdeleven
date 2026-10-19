package androidx.core.app;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.app.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1281f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16724c;

    public RunnableC1281f(Object obj, Object obj2) {
        this.f16723b = obj;
        this.f16724c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C1282g.f16728d;
            Object obj = this.f16724c;
            Object obj2 = this.f16723b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C1282g.f16729e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
