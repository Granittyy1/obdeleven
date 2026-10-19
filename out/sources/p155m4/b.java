package p155m4;

import Z3.q;
import android.net.nsd.NsdManager;
import java.util.HashMap;

/* JADX INFO: compiled from: DeviceRequestsHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f44594a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, NsdManager.RegistrationListener> f44595b = new HashMap<>();

    public static final void a(String str) {
        f44594a.getClass();
        HashMap<String, NsdManager.RegistrationListener> map = f44595b;
        NsdManager.RegistrationListener registrationListener = map.get(str);
        if (registrationListener != null) {
            Object systemService = q.a().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            try {
                ((NsdManager) systemService).unregisterService(registrationListener);
            } catch (IllegalArgumentException unused) {
                q qVar = q.f7852a;
            }
            map.remove(str);
        }
    }
}
