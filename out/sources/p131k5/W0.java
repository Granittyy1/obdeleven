package p131k5;

import com.google.android.gms.measurement.internal.d;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ d f42031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f42032c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C2529k c2529kR = this.f42031b.r();
        String str = this.f42032c;
        C2550p0 c2550p0G0 = c2529kR.g0(str);
        HashMap map = new HashMap();
        map.put("platform", "android");
        map.put("package_name", str);
        map.put("gmp_version", 87000L);
        if (c2550p0G0 != null) {
            String strF = c2550p0G0.f();
            if (strF != null) {
                map.put("app_version", strF);
            }
            map.put("app_version_int", Long.valueOf(c2550p0G0.w()));
            map.put("dynamite_version", Long.valueOf(c2550p0G0.L()));
        }
        return map;
    }
}
