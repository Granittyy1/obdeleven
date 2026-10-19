package p218r7;

import C.g;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.c;
import com.google.firebase.perf.util.d;

/* JADX INFO: compiled from: ConfigResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p241t7.a f46360d = p241t7.a.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f46361e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f46362a = RemoteConfigManager.getInstance();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f46363b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f46364c = u.b();

    public static synchronized a e() {
        try {
            if (f46361e == null) {
                f46361e = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f46361e;
    }

    public static boolean l(long j) {
        return j >= 0;
    }

    public static boolean m(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals("20.5.2")) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean p(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final d<Boolean> a(g gVar) {
        u uVar = this.f46364c;
        String strP = gVar.P();
        if (strP == null) {
            uVar.getClass();
            u.f46384c.a();
            return new d<>();
        }
        if (uVar.f46386a == null) {
            uVar.c(u.a());
            if (uVar.f46386a == null) {
                return new d<>();
            }
        }
        if (!uVar.f46386a.contains(strP)) {
            return new d<>();
        }
        try {
            return new d<>(Boolean.valueOf(uVar.f46386a.getBoolean(strP, false)));
        } catch (ClassCastException e10) {
            u.f46384c.b("Key %s from sharedPreferences has type other than long: %s", strP, e10.getMessage());
            return new d<>();
        }
    }

    public final d<Double> b(g gVar) {
        u uVar = this.f46364c;
        String strP = gVar.P();
        if (strP == null) {
            uVar.getClass();
            u.f46384c.a();
            return new d<>();
        }
        if (uVar.f46386a == null) {
            uVar.c(u.a());
            if (uVar.f46386a == null) {
                return new d<>();
            }
        }
        if (!uVar.f46386a.contains(strP)) {
            return new d<>();
        }
        try {
            try {
                return new d<>(Double.valueOf(Double.longBitsToDouble(uVar.f46386a.getLong(strP, 0L))));
            } catch (ClassCastException e10) {
                u.f46384c.b("Key %s from sharedPreferences has type other than double: %s", strP, e10.getMessage());
                return new d<>();
            }
        } catch (ClassCastException unused) {
            return new d<>(Double.valueOf(Float.valueOf(uVar.f46386a.getFloat(strP, 0.0f)).doubleValue()));
        }
    }

    public final d<Long> c(g gVar) {
        u uVar = this.f46364c;
        String strP = gVar.P();
        if (strP == null) {
            uVar.getClass();
            u.f46384c.a();
            return new d<>();
        }
        if (uVar.f46386a == null) {
            uVar.c(u.a());
            if (uVar.f46386a == null) {
                return new d<>();
            }
        }
        if (!uVar.f46386a.contains(strP)) {
            return new d<>();
        }
        try {
            return new d<>(Long.valueOf(uVar.f46386a.getLong(strP, 0L)));
        } catch (ClassCastException e10) {
            u.f46384c.b("Key %s from sharedPreferences has type other than long: %s", strP, e10.getMessage());
            return new d<>();
        }
    }

    public final d<String> d(g gVar) {
        u uVar = this.f46364c;
        String strP = gVar.P();
        if (strP == null) {
            uVar.getClass();
            u.f46384c.a();
            return new d<>();
        }
        if (uVar.f46386a == null) {
            uVar.c(u.a());
            if (uVar.f46386a == null) {
                return new d<>();
            }
        }
        if (!uVar.f46386a.contains(strP)) {
            return new d<>();
        }
        try {
            return new d<>(uVar.f46386a.getString(strP, ""));
        } catch (ClassCastException e10) {
            u.f46384c.b("Key %s from sharedPreferences has type other than String: %s", strP, e10.getMessage());
            return new d<>();
        }
    }

    public final boolean f() {
        d dVarI0 = d.i0();
        d<Boolean> dVarH = h(dVarI0);
        if (dVarH.b()) {
            return dVarH.a().booleanValue();
        }
        d<Boolean> dVar = this.f46362a.getBoolean("fpr_experiment_app_start_ttid");
        if (dVar.b()) {
            this.f46364c.g("com.google.firebase.perf.ExperimentTTID", dVar.a().booleanValue());
            return dVar.a().booleanValue();
        }
        d<Boolean> dVarA = a(dVarI0);
        if (dVarA.b()) {
            return dVarA.a().booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        b bVar;
        c cVar;
        synchronized (b.class) {
            try {
                if (b.f46365c == null) {
                    b.f46365c = new b();
                }
                bVar = b.f46365c;
            } catch (Throwable th) {
                throw th;
            }
        }
        d<Boolean> dVarH = h(bVar);
        if ((dVarH.b() ? dVarH.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (c.class) {
            try {
                if (c.f46366c == null) {
                    c.f46366c = new c();
                }
                cVar = c.f46366c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        d<Boolean> dVarA = a(cVar);
        if (dVarA.b()) {
            return dVarA.a();
        }
        d<Boolean> dVarH2 = h(cVar);
        if (dVarH2.b()) {
            return dVarH2.a();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0036, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:20:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: ClassCastException -> 0x0036, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:20:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.google.firebase.perf.util.d<java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final d<Boolean> h(g gVar) {
        boolean z10;
        Boolean bool;
        c cVar = this.f46363b;
        d<Boolean> dVarR = gVar.R();
        if (dVarR != 0) {
            z10 = cVar.f28496a.containsKey(dVarR);
            if (!z10) {
                return new d<>();
            }
            try {
                bool = (Boolean) cVar.f28496a.get(dVarR);
                if (bool == null) {
                    dVarR = new d();
                } else {
                    dVarR = new d(bool);
                }
                return dVarR;
            } catch (ClassCastException e10) {
                c.f28495b.b("Metadata key %s contains type other than boolean: %s", dVarR, e10.getMessage());
                return new d<>();
            }
        }
        cVar.getClass();
        if (!z10) {
            return new d<>();
        }
        bool = (Boolean) cVar.f28496a.get(dVarR);
        if (bool == null) {
            dVarR = new d();
        } else {
            dVarR = new d(bool);
        }
        return dVarR;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004d  */
    public final d<Double> i(g gVar) {
        boolean z10;
        Object obj;
        c cVar = this.f46363b;
        String strR = gVar.R();
        if (strR != null) {
            z10 = cVar.f28496a.containsKey(strR);
            if (!z10) {
                return new d<>();
            }
            obj = cVar.f28496a.get(strR);
            if (obj == null) {
                return new d<>();
            }
            if (obj instanceof Float) {
                return new d<>(Double.valueOf(((Float) obj).doubleValue()));
            }
            if (obj instanceof Double) {
                return new d<>((Double) obj);
            }
            c.f28495b.b("Metadata key %s contains type other than double: %s", strR);
            return new d<>();
        }
        cVar.getClass();
        if (!z10) {
            return new d<>();
        }
        obj = cVar.f28496a.get(strR);
        if (obj == null) {
            return new d<>();
        }
        if (obj instanceof Float) {
            return new d<>(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new d<>((Double) obj);
        }
        c.f28495b.b("Metadata key %s contains type other than double: %s", strR);
        return new d<>();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0028 A[Catch: ClassCastException -> 0x0036, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: ClassCastException -> 0x0036, TRY_LEAVE, TryCatch #0 {ClassCastException -> 0x0036, blocks: (B:11:0x001e, B:13:0x0028, B:14:0x002f), top: B:24:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.firebase.perf.util.d] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.firebase.perf.util.d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.firebase.perf.util.d] */
    public final d<Long> j(g gVar) {
        boolean z10;
        Integer num;
        c cVar = this.f46363b;
        ?? R10 = gVar.R();
        if (R10 != 0) {
            z10 = cVar.f28496a.containsKey(R10);
            if (z10) {
                try {
                    num = (Integer) cVar.f28496a.get(R10);
                    if (num == null) {
                        R10 = new d();
                    } else {
                        R10 = new d(num);
                    }
                } catch (ClassCastException e10) {
                    c.f28495b.b("Metadata key %s contains type other than int: %s", R10, e10.getMessage());
                    R10 = new d();
                }
            } else {
                R10 = new d();
            }
            return R10.b() ? new d<>(Long.valueOf(((Integer) R10.a()).intValue())) : new d<>();
        }
        cVar.getClass();
        if (z10) {
            R10 = new d();
        } else {
            num = (Integer) cVar.f28496a.get(R10);
            if (num == null) {
                R10 = new d();
            } else {
                R10 = new d(num);
            }
        }
        if (R10.b()) {
        }
    }

    public final long k() {
        i iVar;
        synchronized (i.class) {
            try {
                if (i.f46372c == null) {
                    i.f46372c = new i();
                }
                iVar = i.f46372c;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.f46362a;
        iVar.getClass();
        d<Long> dVar = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (dVar.b() && dVar.a().longValue() > 0) {
            this.f46364c.d(dVar.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
            return dVar.a().longValue();
        }
        d<Long> dVarC = c(iVar);
        if (!dVarC.b() || dVarC.a().longValue() <= 0) {
            return 600L;
        }
        return dVarC.a().longValue();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    public final boolean o() {
        k kVar;
        boolean zBooleanValue;
        boolean z10;
        j jVar;
        boolean zM;
        Boolean boolG = g();
        if (boolG != null && !boolG.booleanValue()) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (k.f46374c == null) {
                    k.f46374c = new k();
                }
                kVar = k.f46374c;
            } catch (Throwable th) {
                throw th;
            }
        }
        kVar.getClass();
        d<Boolean> dVar = this.f46362a.getBoolean("fpr_enabled");
        if (!dVar.b()) {
            d<Boolean> dVarA = a(kVar);
            zBooleanValue = dVarA.b() ? dVarA.a().booleanValue() : true;
        } else if (this.f46362a.isLastFetchFailed()) {
            zBooleanValue = false;
        } else {
            this.f46364c.g("com.google.firebase.perf.SdkEnabled", dVar.a().booleanValue());
            zBooleanValue = dVar.a().booleanValue();
        }
        if (zBooleanValue) {
            synchronized (j.class) {
                try {
                    if (j.f46373c == null) {
                        j.f46373c = new j();
                    }
                    jVar = j.f46373c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager = this.f46362a;
            jVar.getClass();
            d<String> string = remoteConfigManager.getString("fpr_disabled_android_versions");
            if (string.b()) {
                this.f46364c.f("com.google.firebase.perf.SdkDisabledVersions", string.a());
                zM = m(string.a());
            } else {
                d<String> dVarD = d(jVar);
                zM = dVarD.b() ? m(dVarD.a()) : m("");
            }
            if (zM) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        return z10;
    }
}
