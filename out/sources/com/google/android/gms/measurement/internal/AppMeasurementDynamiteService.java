package com.google.android.gms.measurement.internal;

import U4.C0804l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.collection.C0873a;
import com.braze.models.FeatureFlag;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC1829i0;
import com.google.android.gms.internal.measurement.C1898s0;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.internal.measurement.InterfaceC1850l0;
import com.google.android.gms.internal.measurement.InterfaceC1885q0;
import io.grpc.internal.RunnableC2252x;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p131k5.B;
import p131k5.B0;
import p131k5.C2493c1;
import p131k5.C2498d1;
import p131k5.C2501e;
import p131k5.C2523i1;
import p131k5.C2536l2;
import p131k5.C2559r2;
import p131k5.C2567t2;
import p131k5.C2568u;
import p131k5.C2588z;
import p131k5.F1;
import p131k5.H1;
import p131k5.I1;
import p131k5.N1;
import p131k5.R1;
import p131k5.RunnableC2484a2;
import p131k5.RunnableC2499d2;
import p131k5.RunnableC2504e2;
import p131k5.RunnableC2514g2;
import p131k5.RunnableC2519h2;
import p131k5.RunnableC2527j1;
import p131k5.RunnableC2539m1;
import p131k5.RunnableC2558r1;
import p131k5.S1;
import p131k5.U1;
import p131k5.V0;
import p131k5.Y1;
import p131k5.z3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC1829i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2523i1 f26535c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0873a f26536d = new C0873a();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
    public class a implements F1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1850l0 f26537a;

        public a(InterfaceC1850l0 interfaceC1850l0) {
            this.f26537a = interfaceC1850l0;
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
    public class b implements H1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1850l0 f26539a;

        public b(InterfaceC1850l0 interfaceC1850l0) {
            this.f26539a = interfaceC1850l0;
        }

        @Override // p131k5.H1
        public final void a(long j, Bundle bundle, String str, String str2) {
            try {
                this.f26539a.M(j, bundle, str, str2);
            } catch (RemoteException e10) {
                C2523i1 c2523i1 = AppMeasurementDynamiteService.this.f26535c;
                if (c2523i1 != null) {
                    B0 b10 = c2523i1.f42220i;
                    C2523i1.g(b10);
                    b10.f41715i.b(e10, "Event listener threw exception");
                }
            }
        }
    }

    public final void b0(String str, InterfaceC1843k0 interfaceC1843k0) {
        g();
        z3 z3Var = this.f26535c.f42222l;
        C2523i1.e(z3Var);
        z3Var.Q(str, interfaceC1843k0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        g();
        this.f26535c.m().u(j, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.C(bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void clearMeasurementEnabled(long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.t();
        eVar.i().z(new RunnableC2519h2(eVar, null, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        g();
        this.f26535c.m().z(j, str);
    }

    public final void g() {
        if (this.f26535c == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void generateEventId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        z3 z3Var = this.f26535c.f42222l;
        C2523i1.e(z3Var);
        long jA0 = z3Var.A0();
        g();
        z3 z3Var2 = this.f26535c.f42222l;
        C2523i1.e(z3Var2);
        z3Var2.L(interfaceC1843k0, jA0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getAppInstanceId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        c2493c1.z(new V0(this, interfaceC1843k0, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getCachedAppInstanceId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        b0(eVar.f26575g.get(), interfaceC1843k0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getConditionalUserProperties(String str, String str2, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        c2493c1.z(new RunnableC2499d2(this, interfaceC1843k0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getCurrentScreenClass(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2567t2 c2567t2 = ((C2523i1) eVar.f3968a).f42225o;
        C2523i1.f(c2567t2);
        C2559r2 c2559r2 = c2567t2.f42463c;
        b0(c2559r2 != null ? c2559r2.f42436b : null, interfaceC1843k0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getCurrentScreenName(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2567t2 c2567t2 = ((C2523i1) eVar.f3968a).f42225o;
        C2523i1.f(c2567t2);
        C2559r2 c2559r2 = c2567t2.f42463c;
        b0(c2559r2 != null ? c2559r2.f42435a : null, interfaceC1843k0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getGmpAppId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
        String string = c2523i1.f42213b;
        if (string == null) {
            string = null;
            try {
                Context context = c2523i1.f42212a;
                String strA = c2523i1.f42229s;
                C0804l.h(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strA)) {
                    strA = C2498d1.a(context);
                }
                int identifier = resources.getIdentifier("google_app_id", FeatureFlag.PROPERTIES_TYPE_STRING, strA);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e10) {
                B0 b10 = c2523i1.f42220i;
                C2523i1.g(b10);
                b10.f41712f.b(e10, "getGoogleAppId failed with exception");
            }
        }
        b0(string, interfaceC1843k0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getMaxUserProperties(String str, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        C2523i1.f(this.f26535c.f42226p);
        C0804l.e(str);
        g();
        z3 z3Var = this.f26535c.f42222l;
        C2523i1.e(z3Var);
        z3Var.K(interfaceC1843k0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getSessionId(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.i().z(new RunnableC2504e2(eVar, interfaceC1843k0, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getTestFlag(InterfaceC1843k0 interfaceC1843k0, int i10) throws RemoteException {
        g();
        if (i10 == 0) {
            z3 z3Var = this.f26535c.f42222l;
            C2523i1.e(z3Var);
            e eVar = this.f26535c.f42226p;
            C2523i1.f(eVar);
            AtomicReference atomicReference = new AtomicReference();
            z3Var.Q((String) eVar.i().t(atomicReference, 15000L, "String test flag value", new Y1(eVar, atomicReference, 0)), interfaceC1843k0);
            return;
        }
        if (i10 == 1) {
            z3 z3Var2 = this.f26535c.f42222l;
            C2523i1.e(z3Var2);
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            z3Var2.L(interfaceC1843k0, ((Long) eVar2.i().t(atomicReference2, 15000L, "long test flag value", new RunnableC2514g2(eVar2, 0, atomicReference2))).longValue());
            return;
        }
        if (i10 == 2) {
            z3 z3Var3 = this.f26535c.f42222l;
            C2523i1.e(z3Var3);
            e eVar3 = this.f26535c.f42226p;
            C2523i1.f(eVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) eVar3.i().t(atomicReference3, 15000L, "double test flag value", new L2.a(eVar3, 2, atomicReference3))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC1843k0.f(bundle);
                return;
            } catch (RemoteException e10) {
                B0 b10 = ((C2523i1) z3Var3.f3968a).f42220i;
                C2523i1.g(b10);
                b10.f41715i.b(e10, "Error returning double value to wrapper");
                return;
            }
        }
        if (i10 == 3) {
            z3 z3Var4 = this.f26535c.f42222l;
            C2523i1.e(z3Var4);
            e eVar4 = this.f26535c.f42226p;
            C2523i1.f(eVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            z3Var4.K(interfaceC1843k0, ((Integer) eVar4.i().t(atomicReference4, 15000L, "int test flag value", new RunnableC2252x(eVar4, 1, atomicReference4))).intValue());
            return;
        }
        if (i10 != 4) {
            return;
        }
        z3 z3Var5 = this.f26535c.f42222l;
        C2523i1.e(z3Var5);
        e eVar5 = this.f26535c.f42226p;
        C2523i1.f(eVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        z3Var5.O(interfaceC1843k0, ((Boolean) eVar5.i().t(atomicReference5, 15000L, "boolean test flag value", new R1(eVar5, atomicReference5))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void getUserProperties(String str, String str2, boolean z10, InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        c2493c1.z(new RunnableC2558r1(this, interfaceC1843k0, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void initForTests(Map map) throws RemoteException {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void initialize(p018b5.a aVar, C1898s0 c1898s0, long j) throws RemoteException {
        C2523i1 c2523i1 = this.f26535c;
        if (c2523i1 == null) {
            Context context = (Context) p018b5.b.b0(aVar);
            C0804l.h(context);
            this.f26535c = C2523i1.c(context, c1898s0, Long.valueOf(j));
        } else {
            B0 b10 = c2523i1.f42220i;
            C2523i1.g(b10);
            b10.f41715i.c("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void isDataCollectionEnabled(InterfaceC1843k0 interfaceC1843k0) throws RemoteException {
        g();
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        c2493c1.z(new V0(this, interfaceC1843k0, 1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.L(str, str2, bundle, z10, z11, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException {
        g();
        C0804l.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C2588z c2588z = new C2588z(str2, new C2568u(bundle), "app", j);
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        c2493c1.z(new I1(this, interfaceC1843k0, c2588z, str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void logHealthData(int i10, String str, p018b5.a aVar, p018b5.a aVar2, p018b5.a aVar3) throws RemoteException {
        g();
        Object objB0 = aVar == null ? null : p018b5.b.b0(aVar);
        Object objB1 = aVar2 == null ? null : p018b5.b.b0(aVar2);
        Object objB2 = aVar3 != null ? p018b5.b.b0(aVar3) : null;
        B0 b10 = this.f26535c.f42220i;
        C2523i1.g(b10);
        b10.w(i10, true, false, str, objB0, objB1, objB2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityCreated(p018b5.a aVar, Bundle bundle, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2536l2 c2536l2 = eVar.f26571c;
        if (c2536l2 != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
            c2536l2.onActivityCreated((Activity) p018b5.b.b0(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityDestroyed(p018b5.a aVar, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2536l2 c2536l2 = eVar.f26571c;
        if (c2536l2 != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
            c2536l2.onActivityDestroyed((Activity) p018b5.b.b0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityPaused(p018b5.a aVar, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2536l2 c2536l2 = eVar.f26571c;
        if (c2536l2 != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
            c2536l2.onActivityPaused((Activity) p018b5.b.b0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityResumed(p018b5.a aVar, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2536l2 c2536l2 = eVar.f26571c;
        if (c2536l2 != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
            c2536l2.onActivityResumed((Activity) p018b5.b.b0(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivitySaveInstanceState(p018b5.a aVar, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2536l2 c2536l2 = eVar.f26571c;
        Bundle bundle = new Bundle();
        if (c2536l2 != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
            c2536l2.onActivitySaveInstanceState((Activity) p018b5.b.b0(aVar), bundle);
        }
        try {
            interfaceC1843k0.f(bundle);
        } catch (RemoteException e10) {
            B0 b10 = this.f26535c.f42220i;
            C2523i1.g(b10);
            b10.f41715i.b(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityStarted(p018b5.a aVar, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        if (eVar.f26571c != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void onActivityStopped(p018b5.a aVar, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        if (eVar.f26571c != null) {
            e eVar2 = this.f26535c.f42226p;
            C2523i1.f(eVar2);
            eVar2.P();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void performAction(Bundle bundle, InterfaceC1843k0 interfaceC1843k0, long j) throws RemoteException {
        g();
        interfaceC1843k0.f(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void registerOnMeasurementEventListener(InterfaceC1850l0 interfaceC1850l0) throws RemoteException {
        Object bVar;
        g();
        synchronized (this.f26536d) {
            try {
                bVar = (H1) this.f26536d.get(Integer.valueOf(interfaceC1850l0.a()));
                if (bVar == null) {
                    bVar = new b(interfaceC1850l0);
                    this.f26536d.put(Integer.valueOf(interfaceC1850l0.a()), bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.t();
        if (eVar.f26573e.add(bVar)) {
            return;
        }
        eVar.d().f41715i.c("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void resetAnalyticsData(long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.J(null);
        eVar.i().z(new RunnableC2484a2(eVar, j));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        g();
        if (bundle == null) {
            B0 b10 = this.f26535c.f42220i;
            C2523i1.g(b10);
            b10.f41712f.c("Conditional user property must not be null");
        } else {
            e eVar = this.f26535c.f42226p;
            C2523i1.f(eVar);
            eVar.B(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        C2493c1 c2493c1I = eVar.i();
        N1 n10 = new N1();
        n10.f41914b = eVar;
        n10.f41915c = bundle;
        n10.f41916d = j;
        c2493c1I.A(n10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.A(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setCurrentScreen(p018b5.a aVar, String str, String str2, long j) throws RemoteException {
        g();
        C2567t2 c2567t2 = this.f26535c.f42225o;
        C2523i1.f(c2567t2);
        Activity activity = (Activity) p018b5.b.b0(aVar);
        if (!((C2523i1) c2567t2.f3968a).f42218g.E()) {
            c2567t2.d().f41716k.c("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C2559r2 c2559r2 = c2567t2.f42463c;
        if (c2559r2 == null) {
            c2567t2.d().f41716k.c("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (c2567t2.f42466f.get(activity) == null) {
            c2567t2.d().f41716k.c("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = c2567t2.w(activity.getClass());
        }
        boolean zEquals = Objects.equals(c2559r2.f42436b, str2);
        boolean zEquals2 = Objects.equals(c2559r2.f42435a, str);
        if (zEquals && zEquals2) {
            c2567t2.d().f41716k.c("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ((C2523i1) c2567t2.f3968a).f42218g.r(null, false))) {
            c2567t2.d().f41716k.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > ((C2523i1) c2567t2.f3968a).f42218g.r(null, false))) {
            c2567t2.d().f41716k.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        c2567t2.d().f41719n.a(str == null ? "null" : str, str2, "Setting current screen to name, class");
        C2559r2 c2559r3 = new C2559r2(str, str2, c2567t2.o().A0());
        c2567t2.f42466f.put(activity, c2559r3);
        c2567t2.A(activity, c2559r3, true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setDataCollectionEnabled(boolean z10) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.t();
        eVar.i().z(new S1(eVar, z10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setDefaultEventParameters(Bundle bundle) {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        C2493c1 c2493c1I = eVar.i();
        RunnableC2527j1 runnableC2527j1 = new RunnableC2527j1();
        runnableC2527j1.f42248c = eVar;
        runnableC2527j1.f42249d = bundle2;
        c2493c1I.z(runnableC2527j1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setEventInterceptor(InterfaceC1850l0 interfaceC1850l0) throws RemoteException {
        g();
        a aVar = new a(interfaceC1850l0);
        C2493c1 c2493c1 = this.f26535c.j;
        C2523i1.g(c2493c1);
        if (!c2493c1.B()) {
            C2493c1 c2493c2 = this.f26535c.j;
            C2523i1.g(c2493c2);
            c2493c2.z(new f(this, aVar));
            return;
        }
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.p();
        eVar.t();
        F1 f10 = eVar.f26572d;
        if (aVar != f10) {
            C0804l.j("EventInterceptor already set.", f10 == null);
        }
        eVar.f26572d = aVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setInstanceIdProvider(InterfaceC1885q0 interfaceC1885q0) throws RemoteException {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setMeasurementEnabled(boolean z10, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        Boolean boolValueOf = Boolean.valueOf(z10);
        eVar.t();
        eVar.i().z(new RunnableC2519h2(eVar, boolValueOf, 0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setMinimumSessionDuration(long j) throws RemoteException {
        g();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.i().z(new U1(eVar, j));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        G5.a();
        C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
        if (c2523i1.f42218g.B(null, B.f41699u0)) {
            Uri data = intent.getData();
            if (data == null) {
                eVar.d().f41717l.c("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            C2501e c2501e = c2523i1.f42218g;
            if (queryParameter == null || !queryParameter.equals("1")) {
                eVar.d().f41717l.c("Preview Mode was not enabled.");
                c2501e.f42146c = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            eVar.d().f41717l.b(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
            c2501e.f42146c = queryParameter2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setUserId(String str, long j) throws RemoteException {
        g();
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        if (str != null && TextUtils.isEmpty(str)) {
            B0 b10 = ((C2523i1) eVar.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41715i.c("User ID must be non-empty or null");
        } else {
            C2493c1 c2493c1I = eVar.i();
            RunnableC2539m1 runnableC2539m1 = new RunnableC2539m1();
            runnableC2539m1.f42301c = eVar;
            runnableC2539m1.f42302d = str;
            c2493c1I.z(runnableC2539m1);
            eVar.N(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void setUserProperty(String str, String str2, p018b5.a aVar, boolean z10, long j) throws RemoteException {
        g();
        Object objB0 = p018b5.b.b0(aVar);
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.N(str, str2, objB0, z10, j);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1808f0
    public void unregisterOnMeasurementEventListener(InterfaceC1850l0 interfaceC1850l0) throws RemoteException {
        Object bVar;
        g();
        synchronized (this.f26536d) {
            bVar = (H1) this.f26536d.remove(Integer.valueOf(interfaceC1850l0.a()));
        }
        if (bVar == null) {
            bVar = new b(interfaceC1850l0);
        }
        e eVar = this.f26535c.f42226p;
        C2523i1.f(eVar);
        eVar.t();
        if (eVar.f26573e.remove(bVar)) {
            return;
        }
        eVar.d().f41715i.c("OnEventListener had not been registered");
    }
}
