package R4;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static A f5253e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f5255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f5256c = new v(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5257d = 1;

    public A(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5255b = scheduledExecutorService;
        this.f5254a = context.getApplicationContext();
    }

    public static synchronized A a(Context context) {
        try {
            if (f5253e == null) {
                f5253e = new A(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new Z4.a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5253e;
    }

    public final synchronized p191p5.B b(y yVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(yVar.toString());
            }
            if (!this.f5256c.d(yVar)) {
                v vVar = new v(this);
                this.f5256c = vVar;
                vVar.d(yVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return yVar.f5316b.f45811a;
    }
}
