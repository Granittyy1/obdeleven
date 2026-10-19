package p237t3;

import C.e;
import K2.C0710c;
import Q7.c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC1974i;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.P;
import com.google.android.gms.internal.play_billing.S;
import com.google.android.gms.internal.play_billing.U;
import com.google.android.gms.internal.play_billing.V;
import com.google.android.gms.internal.play_billing.V0;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.v2;
import com.google.android.gms.internal.play_billing.w2;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.voltasit.obdeleven.data.providers.u;
import com.voltasit.obdeleven.data.providers.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class B extends C2789b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Activity f47130D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public volatile int f47131E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public volatile InterfaceC1974i f47132F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public volatile A f47133G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public volatile ScheduledExecutorService f47134H;

    public B(e eVar, Activity activity, AbstractC2788a.C0535a c0535a) {
        super(eVar, activity, c0535a);
        this.f47131E = 0;
        this.f47130D = activity;
    }

    public final U E(int i10) {
        if (!K()) {
            int i11 = C2018x.f26297a;
            Log.isLoggable("BillingClientTesting", 5);
            F(28, b.a(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY);
            return new S(0);
        }
        x xVar = new x(this, i10);
        w2 w2Var = new w2();
        y2 y2Var = new y2(w2Var);
        w2Var.f26294b = y2Var;
        w2Var.f26293a = x.class;
        try {
            xVar.c(w2Var);
            w2Var.f26293a = "billingOverrideService.getBillingOverride";
        } catch (Exception e10) {
            V0 v0 = new V0(e10);
            V v10 = v2.f26288g;
            x2 x2Var = y2Var.f26311c;
            if (v10.d(x2Var, null, v0)) {
                v2.d(x2Var);
            }
        }
        return y2Var;
    }

    public final void F(int i10, a aVar, zzie zzieVar) {
        int i11 = C.f47135a;
        H1 h1B = C.b(zzieVar, i10, aVar, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(h1B, "ApiFailure should not be null");
        this.f47169h.a(h1B);
    }

    public final void G(int i10) {
        int i11 = C.f47135a;
        K1 k1C = C.c(i10, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(k1C, "ApiSuccess should not be null");
        c cVar = this.f47169h;
        cVar.getClass();
        try {
            cVar.g(k1C, (V1) cVar.f5123b);
        } catch (Throwable unused) {
            C2018x.i("BillingLogger");
        }
    }

    public final void H(int i10, A0.a aVar, Runnable runnable) {
        ScheduledExecutorService scheduledExecutorService;
        U uE = E(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f47134H == null) {
                    this.f47134H = Executors.newSingleThreadScheduledExecutor();
                }
                scheduledExecutorService = this.f47134H;
            } catch (Throwable th) {
                throw th;
            }
        }
        U uA = P.a(uE, timeUnit, scheduledExecutorService);
        y yVar = new y(this, i10, aVar, runnable);
        uA.b(new p131k5.V0(uA, yVar), f());
    }

    public final synchronized boolean K() {
        return (this.f47131E != 2 || this.f47132F == null || this.f47133G == null) ? false : true;
    }

    @Override // p237t3.C2789b
    public final void a(final C0710c c0710c, final C2792e c2792e) {
        H(4, new A0.a() { // from class: t3.v
            @Override // A0.a
            public final void a(Object obj) {
                String str = c2792e.f47195a;
                c0710c.b((a) obj, str);
            }
        }, new Runnable() { // from class: t3.w
            @Override // java.lang.Runnable
            public final void run() {
                C2792e c2792e2 = c2792e;
                super/*t3.b*/.a(c0710c, c2792e2);
            }
        });
    }

    @Override // p237t3.C2789b
    public final void b() {
        synchronized (this) {
            G(27);
            try {
                try {
                    if (this.f47133G != null && this.f47132F != null) {
                        C2018x.h("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.f47130D.unbindService(this.f47133G);
                        this.f47133G = new A(this);
                    }
                    this.f47132F = null;
                    if (this.f47134H != null) {
                        this.f47134H.shutdownNow();
                        this.f47134H = null;
                    }
                } catch (RuntimeException unused) {
                    C2018x.i("BillingClientTesting");
                }
                this.f47131E = 3;
            } catch (Throwable th) {
                this.f47131E = 3;
                throw th;
            }
        }
        super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p237t3.C2789b
    public final a c(Activity activity, C2791d c2791d) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) E(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException unused) {
            F(28, b.f23572p, zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            C2018x.i("BillingClientTesting");
        } catch (Exception e10) {
            if (e10 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            F(28, b.f23572p, zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            C2018x.i("BillingClientTesting");
        }
        if (iIntValue > 0) {
            a aVarA = b.a(iIntValue, "Billing override value was set by a license tester.");
            F(2, aVarA, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
            D(aVarA);
            return aVarA;
        }
        try {
            return super.c(activity, c2791d);
        } catch (Exception unused2) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            a aVar = b.f23563f;
            F(2, aVar, zzieVar);
            C2018x.i("BillingClientTesting");
            return aVar;
        }
    }

    @Override // p237t3.C2789b
    public final void d(final C2795h c2795h, final v vVar) {
        H(7, new A0.a() { // from class: t3.t
            @Override // A0.a
            public final void a(Object obj) {
                a billingResult = (a) obj;
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                v vVar2 = vVar;
                i.e(billingResult, "billingResult");
                vVar2.f30291a.resumeWith(new u.a(billingResult, arrayList));
            }
        }, new Runnable() { // from class: t3.u
            @Override // java.lang.Runnable
            public final void run() {
                super/*t3.b*/.d(c2795h, vVar);
            }
        });
    }

    @Override // p237t3.C2789b
    public final void e(InterfaceC2790c interfaceC2790c) {
        synchronized (this) {
            if (K()) {
                C2018x.h("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                G(26);
            } else if (this.f47131E == 1) {
                int i10 = C2018x.f26297a;
                Log.isLoggable("BillingClientTesting", 5);
            } else if (this.f47131E == 3) {
                int i11 = C2018x.f26297a;
                Log.isLoggable("BillingClientTesting", 5);
                F(26, b.a(-1, "Billing Override Service connection is disconnected."), zzie.BILLING_CLIENT_CLOSED);
            } else {
                this.f47131E = 1;
                C2018x.h("BillingClientTesting", "Starting Billing Override Service setup.");
                this.f47133G = new A(this);
                Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                Activity activity = this.f47130D;
                List<ResolveInfo> listQueryIntentServices = activity.getPackageManager().queryIntentServices(intent, 0);
                zzie zzieVar = zzie.REASON_UNSPECIFIED;
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                    zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
                } else {
                    ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = serviceInfo.packageName;
                        String str2 = serviceInfo.name;
                        if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                            zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                            Log.isLoggable("BillingClientTesting", 5);
                        } else {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent2 = new Intent(intent);
                            intent2.setComponent(componentName);
                            if (activity.bindService(intent2, this.f47133G, 1)) {
                                C2018x.h("BillingClientTesting", "Billing Override Service was bonded successfully.");
                            } else {
                                zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                                Log.isLoggable("BillingClientTesting", 5);
                            }
                        }
                    }
                }
                this.f47131E = 0;
                C2018x.h("BillingClientTesting", "Billing Override Service unavailable on device.");
                F(26, b.a(2, "Billing Override Service unavailable on device."), zzieVar);
            }
        }
        m(interfaceC2790c);
    }

    public B(e eVar, Activity activity, InterfaceC2794g interfaceC2794g, AbstractC2788a.C0535a c0535a) {
        super(eVar, activity, interfaceC2794g, c0535a);
        this.f47131E = 0;
        this.f47130D = activity;
    }
}
