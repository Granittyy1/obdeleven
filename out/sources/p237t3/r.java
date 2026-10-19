package p237t3;

import C4.v;
import Q7.c;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.AbstractBinderC1953b;
import com.google.android.gms.internal.play_billing.AbstractC2003s;
import com.google.android.gms.internal.play_billing.C1950a;
import com.google.android.gms.internal.play_billing.C1995p;
import com.google.android.gms.internal.play_billing.C2018x;
import com.google.android.gms.internal.play_billing.G1;
import com.google.android.gms.internal.play_billing.H1;
import com.google.android.gms.internal.play_billing.InterfaceC1956c;
import com.google.android.gms.internal.play_billing.J1;
import com.google.android.gms.internal.play_billing.K1;
import com.google.android.gms.internal.play_billing.L1;
import com.google.android.gms.internal.play_billing.N1;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.V1;
import com.google.android.gms.internal.play_billing.h2;
import com.google.android.gms.internal.play_billing.i2;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.m2;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.q2;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p131k5.RunnableC2591z2;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2790c f47238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1995p f47239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1995p f47240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2789b f47242f;

    public r(C2789b c2789b, InterfaceC2790c interfaceC2790c, int i10) {
        Objects.requireNonNull(c2789b);
        this.f47242f = c2789b;
        AbstractC2003s abstractC2003s = c2789b.f47161C;
        this.f47239c = new C1995p(abstractC2003s);
        this.f47240d = new C1995p(abstractC2003s);
        this.f47238b = interfaceC2790c;
        this.f47241e = i10;
    }

    public final Long a(boolean z10) {
        if (z10) {
            C1995p c1995p = this.f47239c;
            if (!c1995p.f26236b) {
                return null;
            }
            long jA = c1995p.f26235a.a();
            if (!c1995p.f26236b) {
                throw new IllegalStateException("This stopwatch is already stopped.");
            }
            c1995p.f26236b = false;
            long j = (jA - c1995p.f26238d) + c1995p.f26237c;
            c1995p.f26237c = j;
            return Long.valueOf(TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS));
        }
        C1995p c1995p2 = this.f47240d;
        if (!c1995p2.f26236b) {
            return null;
        }
        long jA2 = c1995p2.f26235a.a();
        if (!c1995p2.f26236b) {
            throw new IllegalStateException("This stopwatch is already stopped.");
        }
        c1995p2.f26236b = false;
        long j10 = (jA2 - c1995p2.f26238d) + c1995p2.f26237c;
        c1995p2.f26237c = j10;
        return Long.valueOf(TimeUnit.MILLISECONDS.convert(j10, TimeUnit.NANOSECONDS));
    }

    public final void b(a aVar, zzie zzieVar, String str, boolean z10) {
        try {
            L1 l1V = N1.v();
            int i10 = aVar.f23552a;
            l1V.f();
            N1.u((N1) l1V.f26124c, i10);
            String str2 = aVar.f23554c;
            l1V.f();
            N1.r((N1) l1V.f26124c, str2);
            l1V.f();
            N1.t((N1) l1V.f26124c, zzieVar);
            if (str != null) {
                l1V.f();
                N1.q((N1) l1V.f26124c, str);
            }
            Long lA = a(z10);
            C2789b c2789b = this.f47242f;
            if (!z10) {
                l2 l2VarS = m2.s();
                l2VarS.f();
                m2.q((m2) l2VarS.f26124c, (N1) l1V.c());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    l2VarS.f();
                    m2.r((m2) l2VarS.f26124c, jLongValue);
                }
                c2789b.f47169h.e((m2) l2VarS.c());
                return;
            }
            q2 q2VarU = r2.u();
            int i11 = this.f47241e;
            q2VarU.g(i11 > 0);
            q2VarU.h(i11);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                q2VarU.f();
                r2.s((r2) q2VarU.f26124c, jLongValue2);
            }
            G1 g1X = H1.x();
            g1X.g(l1V);
            g1X.f();
            H1.w((H1) g1X.f26124c, 6);
            g1X.h(q2VarU);
            c2789b.i((H1) g1X.c());
        } catch (Throwable unused) {
            C2018x.i("BillingClient");
        }
    }

    public final void c(a aVar) {
        C2789b c2789b = this.f47242f;
        synchronized (c2789b.f47162a) {
            try {
                if (c2789b.f47163b == 3) {
                    return;
                }
                try {
                    this.f47238b.a(aVar);
                } catch (Throwable unused) {
                    C2018x.i("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z10;
        boolean z11;
        int i10 = C2018x.f26297a;
        Log.isLoggable("BillingClient", 5);
        try {
            C2789b c2789b = this.f47242f;
            synchronized (c2789b.f47162a) {
                z10 = true;
                z11 = c2789b.f47163b == 1;
            }
            if (z11) {
                c cVar = c2789b.f47169h;
                G1 g1X = H1.x();
                g1X.f();
                H1.w((H1) g1X.f26124c, 6);
                L1 l1V = N1.v();
                zzie zzieVar = zzie.BINDING_DIED;
                l1V.f();
                N1.t((N1) l1V.f26124c, zzieVar);
                g1X.g(l1V);
                q2 q2VarU = r2.u();
                int i11 = this.f47241e;
                if (i11 <= 0) {
                    z10 = false;
                }
                q2VarU.g(z10);
                q2VarU.h(i11);
                g1X.h(q2VarU);
                cVar.a((H1) g1X.c());
            } else {
                c cVar2 = c2789b.f47169h;
                P1 p1Q = P1.q();
                cVar2.getClass();
                try {
                    h2 h2VarW = i2.w();
                    h2VarW.g((V1) cVar2.f5123b);
                    h2VarW.f();
                    i2.s((i2) h2VarW.f26124c, p1Q);
                    ((E) cVar2.f5124c).a((i2) h2VarW.c());
                } catch (Throwable unused) {
                    C2018x.i("BillingLogger");
                }
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
        C2789b c2789b2 = this.f47242f;
        synchronized (c2789b2.f47162a) {
            if (c2789b2.f47163b != 3 && c2789b2.f47163b != 0) {
                c2789b2.l(0);
                c2789b2.n();
                try {
                    this.f47238b.b();
                } catch (Throwable unused3) {
                    C2018x.i("BillingClient");
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1956c c1950a;
        C2018x.h("BillingClient", "Billing service connected.");
        C2789b c2789b = this.f47242f;
        synchronized (c2789b.f47162a) {
            try {
                if (c2789b.f47163b == 3) {
                    return;
                }
                int i10 = AbstractBinderC1953b.f26172c;
                if (iBinder == null) {
                    c1950a = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    c1950a = iInterfaceQueryLocalInterface instanceof InterfaceC1956c ? (InterfaceC1956c) iInterfaceQueryLocalInterface : new C1950a(iBinder, "com.android.vending.billing.IInAppBillingService");
                }
                c2789b.f47170i = c1950a;
                if (C2789b.g(new Callable() { // from class: t3.q
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bundle bundleD;
                        InterfaceC1956c interfaceC1956c;
                        zzie zzieVar;
                        r rVar = this.f47237b;
                        C2789b c2789b2 = rVar.f47242f;
                        synchronized (c2789b2.f47162a) {
                            try {
                                if (c2789b2.f47163b != 3) {
                                    boolean z10 = c2789b2.f47163b == 1;
                                    if (TextUtils.isEmpty(null)) {
                                        bundleD = null;
                                    } else {
                                        bundleD = v.d("accountName", null);
                                        C2018x.b(c2789b2.f47160B.longValue(), bundleD, c2789b2.f47164c, c2789b2.f47165d);
                                    }
                                    zzie zzieVar2 = zzie.REASON_UNSPECIFIED;
                                    synchronized (c2789b2.f47162a) {
                                        interfaceC1956c = c2789b2.f47170i;
                                    }
                                    if (interfaceC1956c == null) {
                                        C2789b c2789b3 = rVar.f47242f;
                                        c2789b3.l(0);
                                        int i11 = rVar.f47241e;
                                        zzie zzieVar3 = zzie.SERVICE_RESET_TO_NULL;
                                        a aVar = b.f23565h;
                                        c2789b3.k(i11, aVar, zzieVar3);
                                        rVar.c(aVar);
                                    } else {
                                        C2789b c2789b4 = rVar.f47242f;
                                        String packageName = c2789b4.f47168g.getPackageName();
                                        int iY = 3;
                                        int i12 = 25;
                                        while (true) {
                                            if (i12 < 3) {
                                                i12 = 0;
                                                break;
                                            }
                                            if (bundleD == null) {
                                                try {
                                                    iY = interfaceC1956c.Y(i12, packageName, "subs");
                                                } catch (Exception e10) {
                                                    C2018x.i("BillingClient");
                                                    boolean z11 = e10 instanceof DeadObjectException;
                                                    if (z11) {
                                                        zzieVar = zzie.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
                                                    } else if (e10 instanceof RemoteException) {
                                                        zzieVar = zzie.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
                                                    } else {
                                                        zzieVar = e10 instanceof SecurityException ? zzie.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                                    }
                                                    String strA = zzieVar.equals(zzie.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? C.a(e10) : null;
                                                    rVar.f47242f.l(0);
                                                    rVar.b(z11 ? b.f23565h : b.f23563f, zzieVar, strA, z10);
                                                    rVar.c(z11 ? b.f23565h : b.f23563f);
                                                }
                                            } else {
                                                iY = interfaceC1956c.q(i12, bundleD, packageName, "subs");
                                            }
                                            if (iY == 0) {
                                                C2018x.h("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                                break;
                                            }
                                            i12--;
                                        }
                                        c2789b4.f47171k = i12 >= 3;
                                        if (i12 < 3) {
                                            zzieVar2 = zzie.SUBSCRIPTIONS_NOT_SUPPORTED;
                                            C2018x.h("BillingClient", "In-app billing API does not support subscription on this device.");
                                        }
                                        for (int i13 = 25; i13 >= 3; i13--) {
                                            iY = bundleD == null ? interfaceC1956c.Y(i13, packageName, "inapp") : interfaceC1956c.q(i13, bundleD, packageName, "inapp");
                                            if (iY == 0) {
                                                c2789b4.f47172l = i13;
                                                C2018x.h("BillingClient", "mHighestLevelSupportedForInApp: " + i13);
                                                break;
                                            }
                                        }
                                        int i14 = c2789b4.f47172l;
                                        c2789b4.f47172l = i14;
                                        c2789b4.f47183w = i14 >= 26;
                                        c2789b4.f47182v = i14 >= 24;
                                        c2789b4.f47181u = i14 >= 21;
                                        c2789b4.f47180t = i14 >= 20;
                                        c2789b4.f47179s = i14 >= 19;
                                        c2789b4.f47178r = i14 >= 17;
                                        c2789b4.f47177q = i14 >= 16;
                                        c2789b4.f47176p = i14 >= 15;
                                        c2789b4.f47175o = i14 >= 14;
                                        c2789b4.f47174n = i14 >= 9;
                                        c2789b4.f47173m = i14 >= 6;
                                        if (i14 < 3) {
                                            zzieVar2 = zzie.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            int i15 = C2018x.f26297a;
                                            Log.isLoggable("BillingClient", 5);
                                        }
                                        C2789b.q(c2789b4, iY);
                                        if (iY != 0) {
                                            a aVar2 = b.f23558a;
                                            rVar.b(aVar2, zzieVar2, null, z10);
                                            rVar.c(aVar2);
                                        } else {
                                            try {
                                                Long lA = rVar.a(z10);
                                                if (z10) {
                                                    J1 j1V = K1.v();
                                                    j1V.f();
                                                    K1.u((K1) j1V.f26124c, 6);
                                                    q2 q2VarU = r2.u();
                                                    int i16 = rVar.f47241e;
                                                    q2VarU.g(i16 > 0);
                                                    q2VarU.h(i16);
                                                    if (lA != null) {
                                                        long jLongValue = lA.longValue();
                                                        q2VarU.f();
                                                        r2.s((r2) q2VarU.f26124c, jLongValue);
                                                    }
                                                    C2789b c2789b5 = rVar.f47242f;
                                                    j1V.f();
                                                    K1.t((K1) j1V.f26124c, (r2) q2VarU.c());
                                                    c2789b5.j((K1) j1V.c());
                                                } else {
                                                    l2 l2VarS = m2.s();
                                                    L1 l1V = N1.v();
                                                    l1V.f();
                                                    N1.u((N1) l1V.f26124c, 0);
                                                    l2VarS.f();
                                                    m2.q((m2) l2VarS.f26124c, (N1) l1V.c());
                                                    if (lA != null) {
                                                        long jLongValue2 = lA.longValue();
                                                        l2VarS.f();
                                                        m2.r((m2) l2VarS.f26124c, jLongValue2);
                                                    }
                                                    rVar.f47242f.f47169h.e((m2) l2VarS.c());
                                                }
                                            } catch (Throwable unused) {
                                                C2018x.i("BillingClient");
                                            }
                                            rVar.c(b.f23564g);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return null;
                    }
                }, 30000L, new RunnableC2591z2(1, this), c2789b.r(), c2789b.f()) == null) {
                    int i11 = this.f47241e;
                    a aVarU = c2789b.u();
                    c2789b.k(i11, aVarU, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    c(aVarU);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        boolean z11;
        int i10 = C2018x.f26297a;
        Log.isLoggable("BillingClient", 5);
        try {
            C2789b c2789b = this.f47242f;
            synchronized (c2789b.f47162a) {
                z10 = true;
                z11 = c2789b.f47163b == 1;
            }
            if (z11) {
                c cVar = c2789b.f47169h;
                G1 g1X = H1.x();
                g1X.f();
                H1.w((H1) g1X.f26124c, 6);
                L1 l1V = N1.v();
                zzie zzieVar = zzie.SERVICE_DISCONNECTED;
                l1V.f();
                N1.t((N1) l1V.f26124c, zzieVar);
                g1X.g(l1V);
                q2 q2VarU = r2.u();
                int i11 = this.f47241e;
                if (i11 <= 0) {
                    z10 = false;
                }
                q2VarU.g(z10);
                q2VarU.h(i11);
                g1X.h(q2VarU);
                cVar.a((H1) g1X.c());
            } else {
                c cVar2 = c2789b.f47169h;
                p2 p2VarQ = p2.q();
                cVar2.getClass();
                if (p2VarQ != null) {
                    try {
                        h2 h2VarW = i2.w();
                        h2VarW.g((V1) cVar2.f5123b);
                        h2VarW.f();
                        i2.v((i2) h2VarW.f26124c, p2VarQ);
                        ((E) cVar2.f5124c).a((i2) h2VarW.c());
                    } catch (Throwable unused) {
                        C2018x.i("BillingLogger");
                    }
                }
            }
        } catch (Throwable unused2) {
            C2018x.i("BillingClient");
        }
        C1995p c1995p = this.f47240d;
        c1995p.f26237c = 0L;
        c1995p.f26236b = false;
        c1995p.a();
        C2789b c2789b2 = this.f47242f;
        synchronized (c2789b2.f47162a) {
            try {
                if (c2789b2.f47163b == 3) {
                    return;
                }
                c2789b2.l(0);
                try {
                    this.f47238b.b();
                } catch (Throwable unused3) {
                    C2018x.i("BillingClient");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
