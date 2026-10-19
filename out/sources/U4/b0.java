package U4;

import S4.C0760b;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends AbstractC0799g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f6418d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f6419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile com.google.android.gms.internal.common.f f6420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X4.b f6421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f6423i;

    public b0(Context context, Looper looper) {
        a0 a0Var = new a0(this);
        this.f6419e = context.getApplicationContext();
        com.google.android.gms.internal.common.f fVar = new com.google.android.gms.internal.common.f(looper, a0Var);
        Looper.getMainLooper();
        this.f6420f = fVar;
        this.f6421g = X4.b.b();
        this.f6422h = 5000L;
        this.f6423i = 300000L;
    }

    public final C0760b b(Y y10, Q q10, String str, Executor executor) {
        C0760b c0760bA;
        HashMap map = this.f6418d;
        synchronized (map) {
            try {
                Z z10 = (Z) map.get(y10);
                if (executor == null) {
                    executor = null;
                }
                if (z10 == null) {
                    z10 = new Z(this, y10);
                    z10.f6380b.put(q10, q10);
                    c0760bA = z10.a(str, executor);
                    map.put(y10, z10);
                } else {
                    this.f6420f.removeMessages(0, y10);
                    if (z10.f6380b.containsKey(q10)) {
                        String string = y10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    z10.f6380b.put(q10, q10);
                    int i10 = z10.f6381c;
                    if (i10 == 1) {
                        q10.onServiceConnected(z10.f6385g, z10.f6383e);
                    } else if (i10 == 2) {
                        c0760bA = z10.a(str, executor);
                    }
                    c0760bA = null;
                }
                if (z10.f6382d) {
                    return C0760b.f5525g;
                }
                if (c0760bA == null) {
                    c0760bA = new C0760b(-1, null, null);
                }
                return c0760bA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Y y10, ServiceConnection serviceConnection) {
        C0804l.i(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f6418d;
        synchronized (map) {
            try {
                Z z10 = (Z) map.get(y10);
                if (z10 == null) {
                    String string = y10.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!z10.f6380b.containsKey(serviceConnection)) {
                    String string2 = y10.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                z10.f6380b.remove(serviceConnection);
                if (z10.f6380b.isEmpty()) {
                    this.f6420f.sendMessageDelayed(this.f6420f.obtainMessage(0, y10), this.f6422h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
