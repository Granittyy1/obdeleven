package p131k5;

import J2.l;
import O4.a;
import R2.m;
import U4.C0804l;
import Y4.c;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.foundation.gestures.d;
import androidx.compose.runtime.snapshots.j;
import com.google.android.gms.internal.measurement.AbstractC1803e2;
import com.google.android.gms.internal.measurement.C1817g2;
import com.google.android.gms.internal.measurement.C1873o2;
import com.google.android.gms.internal.measurement.C1898s0;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zziq;
import com.google.common.base.Suppliers;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: k5.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2523i1 implements E1 {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static volatile C2523i1 f42203I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Boolean f42204A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Boolean f42205B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Boolean f42206C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f42207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f42208E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f42209F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f42211H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f42213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f42214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2507f0 f42217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2501e f42218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L0 f42219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B0 f42220i;
    public final C2493c1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Y2 f42221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z3 f42222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2577w0 f42223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f42224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2567t2 f42225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f42226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C2481a f42227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C2540m2 f42228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f42229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C2573v0 f42230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C2587y2 f42231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2560s f42232v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.google.android.gms.measurement.internal.c f42233w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f42235y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f42236z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f42234x = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final AtomicInteger f42210G = new AtomicInteger(0);

    public C2523i1(G1 g10) {
        Context context;
        Bundle bundle;
        boolean z10 = false;
        Context context2 = g10.f41796a;
        C2507f0 c2507f0 = new C2507f0(3);
        this.f42217f = c2507f0;
        H.f41814e = c2507f0;
        this.f42212a = context2;
        this.f42213b = g10.f41797b;
        this.f42214c = g10.f41798c;
        this.f42215d = g10.f41799d;
        this.f42216e = g10.f41803h;
        this.f42204A = g10.f41800e;
        this.f42229s = g10.j;
        this.f42207D = true;
        C1898s0 c1898s0 = g10.f41802g;
        if (c1898s0 != null && (bundle = c1898s0.f25840h) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f42205B = (Boolean) obj;
            }
            Object obj2 = c1898s0.f25840h.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f42206C = (Boolean) obj2;
            }
        }
        if (AbstractC1803e2.f25686h == null && context2 != null) {
            Object obj3 = AbstractC1803e2.f25685g;
            synchronized (obj3) {
                try {
                    if (AbstractC1803e2.f25686h == null) {
                        synchronized (obj3) {
                            try {
                                S1 s10 = AbstractC1803e2.f25686h;
                                Context applicationContext = context2.getApplicationContext();
                                applicationContext = applicationContext == null ? context2 : applicationContext;
                                if (s10 == null || s10.f25585a != applicationContext) {
                                    if (s10 != null) {
                                        R1.c();
                                        C1873o2.a();
                                        synchronized (X1.class) {
                                            try {
                                                X1 x10 = X1.f25633c;
                                                if (x10 != null && (context = x10.f25634a) != null && x10.f25635b != null) {
                                                    context.getContentResolver().unregisterContentObserver(X1.f25633c.f25635b);
                                                }
                                                X1.f25633c = null;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    C1817g2 c1817g2 = new C1817g2();
                                    c1817g2.f25713b = applicationContext;
                                    AbstractC1803e2.f25686h = new S1(applicationContext, Suppliers.a(c1817g2));
                                    AbstractC1803e2.j.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f42224n = c.f7603a;
        Long l10 = g10.f41804i;
        this.f42211H = l10 != null ? l10.longValue() : System.currentTimeMillis();
        C2501e c2501e = new C2501e(this);
        c2501e.f42147d = C2516h.f42184b;
        this.f42218g = c2501e;
        L0 l11 = new L0(this);
        l11.r();
        this.f42219h = l11;
        B0 b10 = new B0(this);
        b10.r();
        this.f42220i = b10;
        z3 z3Var = new z3(this);
        z3Var.r();
        this.f42222l = z3Var;
        this.f42223m = new C2577w0(new j(this));
        this.f42227q = new C2481a(this);
        C2567t2 c2567t2 = new C2567t2(this);
        c2567t2.u();
        this.f42225o = c2567t2;
        e eVar = new e(this);
        eVar.u();
        this.f42226p = eVar;
        Y2 y10 = new Y2(this);
        y10.u();
        this.f42221k = y10;
        C2540m2 c2540m2 = new C2540m2(this);
        c2540m2.r();
        this.f42228r = c2540m2;
        C2493c1 c2493c1 = new C2493c1(this);
        c2493c1.r();
        this.j = c2493c1;
        C1898s0 c1898s1 = g10.f41802g;
        if (c1898s1 != null && c1898s1.f25835c != 0) {
            z10 = true;
        }
        if (context2.getApplicationContext() instanceof Application) {
            f(eVar);
            if (((C2523i1) eVar.f3968a).f42212a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((C2523i1) eVar.f3968a).f42212a.getApplicationContext();
                if (eVar.f26571c == null) {
                    eVar.f26571c = new C2536l2(eVar);
                }
                if (!z10) {
                    application.unregisterActivityLifecycleCallbacks(eVar.f26571c);
                    application.registerActivityLifecycleCallbacks(eVar.f26571c);
                    eVar.d().f41719n.c("Registered activity lifecycle callback");
                }
            }
        } else {
            g(b10);
            b10.f41715i.c("Application context is not an Application");
        }
        c2493c1.z(new RunnableC2527j1(this, g10));
    }

    public static C2523i1 c(Context context, C1898s0 c1898s0, Long l10) {
        Bundle bundle;
        if (c1898s0 != null && (c1898s0.f25838f == null || c1898s0.f25839g == null)) {
            c1898s0 = new C1898s0(c1898s0.f25834b, c1898s0.f25835c, c1898s0.f25836d, c1898s0.f25837e, null, null, c1898s0.f25840h, null);
        }
        C0804l.h(context);
        C0804l.h(context.getApplicationContext());
        if (f42203I == null) {
            synchronized (C2523i1.class) {
                try {
                    if (f42203I == null) {
                        f42203I = new C2523i1(new G1(context, c1898s0, l10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (c1898s0 != null && (bundle = c1898s0.f25840h) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C0804l.h(f42203I);
            f42203I.f42204A = Boolean.valueOf(c1898s0.f25840h.getBoolean("dataCollectionDefaultEnabled"));
        }
        C0804l.h(f42203I);
        return f42203I;
    }

    public static void e(l lVar) {
        if (lVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void f(AbstractC2589z0 abstractC2589z0) {
        if (abstractC2589z0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC2589z0.f42546b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC2589z0.getClass())));
        }
    }

    public static void g(D1 d10) {
        if (d10 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!d10.f41749b) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(d10.getClass())));
        }
    }

    @Override // p131k5.E1
    public final Context a() {
        return this.f42212a;
    }

    @Override // p131k5.E1
    public final C2507f0 b() {
        return this.f42217f;
    }

    @Override // p131k5.E1
    public final B0 d() {
        B0 b10 = this.f42220i;
        g(b10);
        return b10;
    }

    public final boolean h() {
        return l() == 0;
    }

    @Override // p131k5.E1
    public final C2493c1 i() {
        C2493c1 c2493c1 = this.j;
        g(c2493c1);
        return c2493c1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    public final boolean j() {
        z3 z3Var;
        boolean z10;
        boolean z11;
        String strY;
        com.google.android.gms.measurement.internal.c cVarO;
        com.google.android.gms.measurement.internal.c cVarO2;
        if (!this.f42234x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C2493c1 c2493c1 = this.j;
        g(c2493c1);
        c2493c1.p();
        Boolean bool = this.f42235y;
        c cVar = this.f42224n;
        if (bool == null || this.f42236z == 0) {
            cVar.getClass();
            this.f42236z = SystemClock.elapsedRealtime();
            z3Var = this.f42222l;
            e(z3Var);
            z10 = true;
            if (z3Var.s0("android.permission.INTERNET") || !z3Var.s0("android.permission.ACCESS_NETWORK_STATE")) {
                z11 = false;
            } else {
                Context context = this.f42212a;
                if (p006a5.c.a(context).c() || this.f42218g.F() || (z3.X(context) && z3.p0(context))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f42235y = Boolean.valueOf(z11);
            if (z11) {
                strY = o().y();
                cVarO = o();
                cVarO.t();
                if (!z3Var.b0(strY, cVarO.f26557m)) {
                    cVarO2 = o();
                    cVarO2.t();
                    if (TextUtils.isEmpty(cVarO2.f26557m)) {
                        z10 = false;
                    }
                }
                this.f42235y = Boolean.valueOf(z10);
            }
        } else if (!bool.booleanValue()) {
            cVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f42236z) > 1000) {
                cVar.getClass();
                this.f42236z = SystemClock.elapsedRealtime();
                z3Var = this.f42222l;
                e(z3Var);
                z10 = true;
                if (z3Var.s0("android.permission.INTERNET")) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                this.f42235y = Boolean.valueOf(z11);
                if (z11) {
                    strY = o().y();
                    cVarO = o();
                    cVarO.t();
                    if (!z3Var.b0(strY, cVarO.f26557m)) {
                        cVarO2 = o();
                        cVarO2.t();
                        if (TextUtils.isEmpty(cVarO2.f26557m)) {
                            z10 = false;
                        }
                    }
                    this.f42235y = Boolean.valueOf(z10);
                }
            }
        }
        return this.f42235y.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d1  */
    public final boolean k() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C2525j c2525jR;
        Bundle bundle;
        b bVarA;
        int i10;
        String str;
        boolean z10;
        String str2;
        C2493c1 c2493c1 = this.j;
        g(c2493c1);
        c2493c1.p();
        C2540m2 c2540m2 = this.f42228r;
        g(c2540m2);
        g(c2540m2);
        String strW = o().w();
        L0 l10 = this.f42219h;
        e(l10);
        l10.p();
        if (l10.A().i(zziq.zza.AD_STORAGE)) {
            C2523i1 c2523i1 = (C2523i1) l10.f3968a;
            c2523i1.f42224n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (l10.f41867i == null || jElapsedRealtime >= l10.f41868k) {
                C2501e c2501e = c2523i1.f42218g;
                c2501e.getClass();
                l10.f41868k = c2501e.v(strW, B.f41663c) + jElapsedRealtime;
                try {
                    a.C0072a c0072aA = a.a(c2523i1.f42212a);
                    l10.f41867i = "";
                    String str3 = c0072aA.f4852a;
                    if (str3 != null) {
                        l10.f41867i = str3;
                    }
                    l10.j = c0072aA.f4853b;
                } catch (Exception e10) {
                    l10.d().f41718m.b(e10, "Unable to get advertising id");
                    l10.f41867i = "";
                }
                pair = new Pair(l10.f41867i, Boolean.valueOf(l10.j));
            } else {
                pair = new Pair(l10.f41867i, Boolean.valueOf(l10.j));
            }
        } else {
            pair = new Pair("", Boolean.FALSE);
        }
        C2501e c2501e2 = this.f42218g;
        Boolean boolA = c2501e2.A("google_analytics_adid_collection_enabled");
        boolean z11 = boolA == null || boolA.booleanValue();
        B0 b10 = this.f42220i;
        if (!z11 || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            g(b10);
            b10.f41718m.c("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        g(c2540m2);
        c2540m2.q();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C2523i1) c2540m2.f3968a).f42212a.getSystemService("connectivity");
        URL url = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            g(b10);
            b10.f41715i.c("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        C1930w4.a();
        if (c2501e2.B(null, B.f41632N0)) {
            C2587y2 c2587y2R = r();
            c2587y2R.p();
            c2587y2R.t();
            if (!c2587y2R.G() || c2587y2R.o().u0() >= 234200) {
                e eVar = this.f42226p;
                f(eVar);
                eVar.p();
                C2587y2 c2587y2R2 = ((C2523i1) eVar.f3968a).r();
                c2587y2R2.p();
                c2587y2R2.t();
                InterfaceC2561s0 interfaceC2561s0 = c2587y2R2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2R2.C();
                    c2587y2R2.d().f41718m.c("Failed to get consents; not connected to service yet.");
                } else {
                    try {
                        c2525jR = interfaceC2561s0.R(c2587y2R2.J(false));
                        c2587y2R2.I();
                    } catch (RemoteException e11) {
                        c2587y2R2.d().f41712f.b(e11, "Failed to get consents; remote exception");
                        c2525jR = null;
                    }
                    if (c2525jR != null) {
                        bundle = c2525jR.f42242b;
                    } else {
                        bundle = null;
                    }
                    if (bundle == null) {
                        int i11 = this.f42209F;
                        this.f42209F = i11 + 1;
                        z10 = i11 < 10;
                        g(b10);
                        if (z10) {
                            str2 = "Retrying.";
                        } else {
                            str2 = "Skipping.";
                        }
                        b10.f41718m.b(Integer.valueOf(this.f42209F), d.b("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                        return z10;
                    }
                    zziq zziqVarD = zziq.d(100, bundle);
                    sb2.append("&gcs=");
                    sb2.append(zziqVarD.n());
                    bVarA = b.a(100, bundle);
                    sb2.append("&dma=");
                    if (bVarA.f26545c == Boolean.FALSE) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sb2.append(i10);
                    str = bVarA.f26546d;
                    if (!TextUtils.isEmpty(str)) {
                        sb2.append("&dma_cps=");
                        sb2.append(str);
                    }
                    int i12 = b.c(bundle) == Boolean.TRUE ? 0 : 1;
                    sb2.append("&npa=");
                    sb2.append(i12);
                    g(b10);
                    b10.f41719n.b(sb2, "Consent query parameters to Bow");
                }
                c2525jR = null;
                if (c2525jR != null) {
                    bundle = c2525jR.f42242b;
                } else {
                    bundle = null;
                }
                if (bundle == null) {
                    int i13 = this.f42209F;
                    this.f42209F = i13 + 1;
                    if (i13 < 10) {
                    }
                    g(b10);
                    if (z10) {
                        str2 = "Retrying.";
                    } else {
                        str2 = "Skipping.";
                    }
                    b10.f41718m.b(Integer.valueOf(this.f42209F), d.b("Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                    return z10;
                }
                zziq zziqVarD2 = zziq.d(100, bundle);
                sb2.append("&gcs=");
                sb2.append(zziqVarD2.n());
                bVarA = b.a(100, bundle);
                sb2.append("&dma=");
                if (bVarA.f26545c == Boolean.FALSE) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                sb2.append(i10);
                str = bVarA.f26546d;
                if (!TextUtils.isEmpty(str)) {
                    sb2.append("&dma_cps=");
                    sb2.append(str);
                }
                if (b.c(bundle) == Boolean.TRUE) {
                }
                sb2.append("&npa=");
                sb2.append(i12);
                g(b10);
                b10.f41719n.b(sb2, "Consent query parameters to Bow");
            }
        }
        z3 z3Var = this.f42222l;
        e(z3Var);
        o();
        String str4 = (String) pair.first;
        long jA = l10.f41879v.a() - 1;
        String string = sb2.toString();
        try {
            C0804l.e(str4);
            C0804l.e(strW);
            String strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v87000." + z3Var.u0()) + "&rdid=" + str4 + "&bundleid=" + strW + "&retry=" + jA;
            if (strW.equals(((C2523i1) z3Var.f3968a).f42218g.s("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!string.isEmpty()) {
                if (string.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(string);
            }
            url = new URL(strConcat);
        } catch (IllegalArgumentException e12) {
            e = e12;
            z3Var.d().f41712f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
        } catch (MalformedURLException e13) {
            e = e13;
            z3Var.d().f41712f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
        }
        if (url != null) {
            g(c2540m2);
            m mVar = new m();
            mVar.f5232a = this;
            c2540m2.p();
            c2540m2.q();
            c2540m2.i().w(new RunnableC2548o2(c2540m2, strW, url, mVar));
        }
        return false;
    }

    public final int l() {
        C2493c1 c2493c1 = this.j;
        g(c2493c1);
        c2493c1.p();
        Boolean boolA = this.f42218g.A("firebase_analytics_collection_deactivated");
        if (boolA != null && boolA.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f42206C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C2493c1 c2493c2 = this.j;
        g(c2493c2);
        c2493c2.p();
        if (!this.f42207D) {
            return 8;
        }
        L0 l10 = this.f42219h;
        e(l10);
        l10.p();
        Boolean boolValueOf = l10.y().contains("measurement_enabled") ? Boolean.valueOf(l10.y().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolA2 = this.f42218g.A("firebase_analytics_collection_enabled");
        if (boolA2 != null) {
            return boolA2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f42205B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f42204A == null || this.f42204A.booleanValue()) ? 0 : 7;
    }

    public final C2481a m() {
        C2481a c2481a = this.f42227q;
        if (c2481a != null) {
            return c2481a;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C2560s n() {
        g(this.f42232v);
        return this.f42232v;
    }

    public final com.google.android.gms.measurement.internal.c o() {
        f(this.f42233w);
        return this.f42233w;
    }

    public final C2573v0 p() {
        f(this.f42230t);
        return this.f42230t;
    }

    public final C2577w0 q() {
        return this.f42223m;
    }

    public final C2587y2 r() {
        f(this.f42231u);
        return this.f42231u;
    }

    public final void s() {
        e(this.f42222l);
    }

    @Override // p131k5.E1
    public final c x() {
        return this.f42224n;
    }
}
