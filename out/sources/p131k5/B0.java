package p131k5;

import U4.C0804l;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.H4;
import com.google.android.gms.internal.measurement.I4;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B0 extends D1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f41709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f41710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D0 f41712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D0 f41713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D0 f41714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D0 f41715i;
    public final D0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D0 f41716k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D0 f41717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D0 f41718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final D0 f41719n;

    public B0(C2523i1 c2523i1) {
        super(c2523i1);
        this.f41709c = (char) 0;
        this.f41710d = -1L;
        this.f41712f = new D0(this, 6, false, false);
        this.f41713g = new D0(this, 6, true, false);
        this.f41714h = new D0(this, 6, false, true);
        this.f41715i = new D0(this, 5, false, false);
        this.j = new D0(this, 5, true, false);
        this.f41716k = new D0(this, 5, false, true);
        this.f41717l = new D0(this, 4, false, false);
        this.f41718m = new D0(this, 3, false, false);
        this.f41719n = new D0(this, 2, false, false);
    }

    public static String t(Object obj, boolean z10) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof C0) {
                return ((C0) obj).f41727a;
            }
            return z10 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strZ = z(C2523i1.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && z(className).equals(strZ)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    public static String u(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strT = t(obj, z10);
        String strT2 = t(obj2, z10);
        String strT3 = t(obj3, z10);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strT)) {
            sb2.append(str2);
            sb2.append(strT);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strT2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strT2);
        }
        if (!TextUtils.isEmpty(strT3)) {
            sb2.append(str3);
            sb2.append(strT3);
        }
        return sb2.toString();
    }

    public static C0 v(String str) {
        if (str == null) {
            return null;
        }
        return new C0(str);
    }

    public static String z(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            return str.substring(0, iLastIndexOf);
        }
        ((H4) I4.f25475c.get()).getClass();
        return B.f41606A0.a(null).booleanValue() ? "" : str;
    }

    public final D0 A() {
        return this.f41718m;
    }

    public final D0 B() {
        return this.f41712f;
    }

    public final D0 C() {
        return this.f41719n;
    }

    public final D0 D() {
        return this.f41715i;
    }

    public final String E() {
        String str;
        synchronized (this) {
            try {
                if (this.f41711e == null) {
                    String str2 = ((C2523i1) this.f3968a).f42215d;
                    if (str2 == null) {
                        str2 = "FA";
                    }
                    this.f41711e = str2;
                }
                C0804l.h(this.f41711e);
                str = this.f41711e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // p131k5.D1
    public final boolean s() {
        return false;
    }

    public final void w(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && y(i10)) {
            Log.println(i10, E(), u(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C0804l.h(str);
        C2493c1 c2493c1 = ((C2523i1) this.f3968a).j;
        if (c2493c1 == null) {
            Log.println(6, E(), "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!c2493c1.f41749b) {
            Log.println(6, E(), "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 9) {
            i10 = 8;
        }
        c2493c1.z(new A0(this, i10, str, obj, obj2, obj3));
    }

    public final boolean y(int i10) {
        return Log.isLoggable(E(), i10);
    }
}
