package p131k5;

import J2.l;
import U4.C0804l;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.internal.measurement.V4;
import com.google.android.gms.measurement.internal.zzip;
import java.lang.reflect.InvocationTargetException;
import p006a5.c;

/* JADX INFO: renamed from: k5.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2501e extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f42145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f42146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC2511g f42147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f42148e;

    public static long D() {
        return B.f41613E.a(null).longValue();
    }

    public final Boolean A(String str) {
        C0804l.e(str);
        Bundle bundleG = G();
        if (bundleG == null) {
            d().f41712f.c("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleG.containsKey(str)) {
            return Boolean.valueOf(bundleG.getBoolean(str));
        }
        return null;
    }

    public final boolean B(String str, C2557r0<Boolean> c2557r0) {
        if (str == null) {
            return c2557r0.a(null).booleanValue();
        }
        String strC = this.f42147d.c(str, c2557r0.f42424a);
        return TextUtils.isEmpty(strC) ? c2557r0.a(null).booleanValue() : c2557r0.a(Boolean.valueOf("1".equals(strC))).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.f42147d.c(str, "measurement.event_sampling_enabled"));
    }

    public final boolean E() {
        Boolean boolA = A("google_analytics_automatic_screen_reporting_enabled");
        return boolA == null || boolA.booleanValue();
    }

    public final boolean F() {
        if (this.f42145b == null) {
            Boolean boolA = A("app_measurement_lite");
            this.f42145b = boolA;
            if (boolA == null) {
                this.f42145b = Boolean.FALSE;
            }
        }
        return this.f42145b.booleanValue() || !((C2523i1) this.f3968a).f42216e;
    }

    public final Bundle G() {
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        try {
            if (c2523i1.f42212a.getPackageManager() == null) {
                d().f41712f.c("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoA = c.a(c2523i1.f42212a).a(128, c2523i1.f42212a.getPackageName());
            if (applicationInfoA != null) {
                return applicationInfoA.metaData;
            }
            d().f41712f.c("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            d().f41712f.b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final double q(String str, C2557r0<Double> c2557r0) {
        if (str == null) {
            return c2557r0.a(null).doubleValue();
        }
        String strC = this.f42147d.c(str, c2557r0.f42424a);
        if (TextUtils.isEmpty(strC)) {
            return c2557r0.a(null).doubleValue();
        }
        try {
            return c2557r0.a(Double.valueOf(Double.parseDouble(strC))).doubleValue();
        } catch (NumberFormatException unused) {
            return c2557r0.a(null).doubleValue();
        }
    }

    public final int r(String str, boolean z10) {
        ((U4) V4.f25618c.get()).getClass();
        if (!((C2523i1) this.f3968a).f42218g.B(null, B.f41644T0)) {
            return 100;
        }
        if (z10) {
            return Math.max(Math.min(u(str, B.f41641S), 500), 100);
        }
        return 500;
    }

    public final String s(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C0804l.h(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            d().f41712f.b(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            d().f41712f.b(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            d().f41712f.b(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            d().f41712f.b(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final boolean t(C2557r0<Boolean> c2557r0) {
        return B(null, c2557r0);
    }

    public final int u(String str, C2557r0<Integer> c2557r0) {
        if (str == null) {
            return c2557r0.a(null).intValue();
        }
        String strC = this.f42147d.c(str, c2557r0.f42424a);
        if (TextUtils.isEmpty(strC)) {
            return c2557r0.a(null).intValue();
        }
        try {
            return c2557r0.a(Integer.valueOf(Integer.parseInt(strC))).intValue();
        } catch (NumberFormatException unused) {
            return c2557r0.a(null).intValue();
        }
    }

    public final long v(String str, C2557r0<Long> c2557r0) {
        if (str == null) {
            return c2557r0.a(null).longValue();
        }
        String strC = this.f42147d.c(str, c2557r0.f42424a);
        if (TextUtils.isEmpty(strC)) {
            return c2557r0.a(null).longValue();
        }
        try {
            return c2557r0.a(Long.valueOf(Long.parseLong(strC))).longValue();
        } catch (NumberFormatException unused) {
            return c2557r0.a(null).longValue();
        }
    }

    public final String w(String str, C2557r0<String> c2557r0) {
        return str == null ? c2557r0.a(null) : c2557r0.a(this.f42147d.c(str, c2557r0.f42424a));
    }

    public final zzip y(String str) {
        Object obj;
        C0804l.e(str);
        Bundle bundleG = G();
        if (bundleG == null) {
            d().f41712f.c("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleG.get(str);
        }
        zzip zzipVar = zzip.f26641b;
        if (obj == null) {
            return zzipVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzip.f26644e;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzip.f26643d;
        }
        if ("default".equals(obj)) {
            return zzip.f26642c;
        }
        d().f41715i.b(str, "Invalid manifest metadata for");
        return zzipVar;
    }

    public final boolean z(String str, C2557r0<Boolean> c2557r0) {
        return B(str, c2557r0);
    }
}
