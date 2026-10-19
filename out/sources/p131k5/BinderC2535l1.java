package p131k5;

import K2.N;
import S4.C0764f;
import S4.j;
import U4.C0804l;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: k5.l1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC2535l1 extends AbstractBinderC2569u0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f42293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f42294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42295e;

    public BinderC2535l1(h hVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        C0804l.h(hVar);
        this.f42293c = hVar;
        this.f42295e = null;
    }

    @Override // p131k5.InterfaceC2561s0
    public final void A(v3 v3Var, o3 o3Var) {
        C0804l.h(v3Var);
        c0(o3Var);
        g(new RunnableC2590z1(this, v3Var, o3Var));
    }

    @Override // p131k5.InterfaceC2561s0
    public final void B(o3 o3Var) {
        C0804l.e(o3Var.f42332b);
        C0804l.h(o3Var.f42352w);
        RunnableC2578w1 runnableC2578w1 = new RunnableC2578w1(this, o3Var, 0);
        h hVar = this.f42293c;
        if (hVar.i().B()) {
            runnableC2578w1.run();
        } else {
            hVar.i().A(runnableC2578w1);
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<C2496d> D(String str, String str2, o3 o3Var) {
        c0(o3Var);
        String str3 = o3Var.f42332b;
        C0804l.h(str3);
        h hVar = this.f42293c;
        try {
            return (List) hVar.i().u(new CallableC2555q1(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            hVar.d().f41712f.b(e10, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<C2496d> E(String str, String str2, String str3) {
        b0(str, true);
        h hVar = this.f42293c;
        try {
            return (List) hVar.i().u(new CallableC2570u1(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            hVar.d().f41712f.b(e10, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final void G(o3 o3Var) {
        C0804l.e(o3Var.f42332b);
        b0(o3Var.f42332b, false);
        g(new RunnableC2566t1(this, o3Var));
    }

    @Override // p131k5.InterfaceC2561s0
    public final void K(C2496d c2496d, o3 o3Var) {
        C0804l.h(c2496d);
        C0804l.h(c2496d.f42125d);
        c0(o3Var);
        C2496d c2496d2 = new C2496d(c2496d);
        c2496d2.f42123b = o3Var.f42332b;
        g(new RunnableC2543n1(this, c2496d2, o3Var));
    }

    @Override // p131k5.InterfaceC2561s0
    public final void N(o3 o3Var) {
        c0(o3Var);
        g(new N(this, 1, o3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p131k5.InterfaceC2561s0
    public final byte[] P(C2588z c2588z, String str) {
        C0804l.e(str);
        C0804l.h(c2588z);
        b0(str, true);
        h hVar = this.f42293c;
        B0 b0D = hVar.d();
        C2523i1 c2523i1 = hVar.f26609l;
        C2577w0 c2577w0 = c2523i1.f42223m;
        String str2 = c2588z.f42542b;
        b0D.f41718m.b(c2577w0.b(str2), "Log and bundle. event");
        hVar.x().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) hVar.i().y(new A1(this, c2588z, str)).get();
            if (bArr == null) {
                hVar.d().f41712f.b(B0.v(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            hVar.x().getClass();
            hVar.d().f41718m.d("Log and bundle processed. event, size, time_ms", c2523i1.f42223m.b(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            B0 b0D2 = hVar.d();
            b0D2.f41712f.d("Failed to log and bundle. appId, event, error", B0.v(str), c2523i1.f42223m.b(str2), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            B0 b0D3 = hVar.d();
            b0D3.f41712f.d("Failed to log and bundle. appId, event, error", B0.v(str), c2523i1.f42223m.b(str2), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p131k5.InterfaceC2561s0
    public final C2525j R(o3 o3Var) {
        c0(o3Var);
        String str = o3Var.f42332b;
        C0804l.e(str);
        h hVar = this.f42293c;
        try {
            return (C2525j) hVar.i().y(new CallableC2574v1(this, o3Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            B0 b0D = hVar.d();
            b0D.f41712f.a(B0.v(str), e10, "Failed to get consent. appId");
            return new C2525j(null);
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final void a0(C2588z c2588z, o3 o3Var) {
        C0804l.h(c2588z);
        c0(o3Var);
        g(new RunnableC2586y1(this, c2588z, o3Var));
    }

    public final void b0(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        h hVar = this.f42293c;
        if (zIsEmpty) {
            hVar.d().f41712f.c("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f42294d == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f42295e)) {
                        Context context = hVar.f26609l.f42212a;
                        if (Y4.h.a(context, "com.google.android.gms", Binder.getCallingUid())) {
                            try {
                                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                j jVarA = j.a(context);
                                jVarA.getClass();
                                if (packageInfo != null && (j.c(packageInfo, false) || (j.c(packageInfo, true) && C0764f.a(jVarA.f5544a)))) {
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                Log.isLoggable("UidVerifier", 3);
                            }
                        }
                        if (!j.a(hVar.f26609l.f42212a).b(Binder.getCallingUid())) {
                            z11 = false;
                        }
                    }
                    this.f42294d = Boolean.valueOf(z11);
                }
                if (this.f42294d.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                hVar.d().f41712f.b(B0.v(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f42295e == null) {
            Context context2 = hVar.f26609l.f42212a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = C0764f.f5539a;
            if (Y4.h.a(context2, str, callingUid)) {
                this.f42295e = str;
            }
        }
        if (str.equals(this.f42295e)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void c0(o3 o3Var) {
        C0804l.h(o3Var);
        String str = o3Var.f42332b;
        C0804l.e(str);
        b0(str, false);
        this.f42293c.X().b0(o3Var.f42333c, o3Var.f42347r);
    }

    @Override // p131k5.InterfaceC2561s0
    public final List d(Bundle bundle, o3 o3Var) {
        c0(o3Var);
        String str = o3Var.f42332b;
        C0804l.h(str);
        h hVar = this.f42293c;
        try {
            return (List) hVar.i().u(new C1(this, o3Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            B0 b0D = hVar.d();
            b0D.f41712f.a(B0.v(str), e10, "Failed to get trigger URIs. appId");
            return Collections.emptyList();
        }
    }

    public final void d0(C2588z c2588z, o3 o3Var) {
        h hVar = this.f42293c;
        hVar.Y();
        hVar.v(c2588z, o3Var);
    }

    public final void g(Runnable runnable) {
        h hVar = this.f42293c;
        if (hVar.i().B()) {
            runnable.run();
        } else {
            hVar.i().z(runnable);
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final void k(o3 o3Var) {
        c0(o3Var);
        g(new RunnableC2539m1(this, o3Var));
    }

    @Override // p131k5.InterfaceC2561s0
    public final void l(String str, String str2, long j, String str3) {
        g(new RunnableC2547o1(this, str2, str3, str, j));
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<v3> m(String str, String str2, String str3, boolean z10) {
        b0(str, true);
        h hVar = this.f42293c;
        try {
            List<w3> list = (List) hVar.i().u(new CallableC2562s1(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w3 w3Var : list) {
                if (z10 || !z3.v0(w3Var.f42521c)) {
                    arrayList.add(new v3(w3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            B0 b0D = hVar.d();
            b0D.f41712f.a(B0.v(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            B0 b0D2 = hVar.d();
            b0D2.f41712f.a(B0.v(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p131k5.InterfaceC2561s0
    public final String p(o3 o3Var) {
        c0(o3Var);
        h hVar = this.f42293c;
        try {
            return (String) hVar.i().u(new s3(hVar, o3Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            B0 b0D = hVar.d();
            b0D.f41712f.a(B0.v(o3Var.f42332b), e10, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // p131k5.InterfaceC2561s0
    public final List<v3> t(String str, String str2, boolean z10, o3 o3Var) {
        c0(o3Var);
        String str3 = o3Var.f42332b;
        C0804l.h(str3);
        h hVar = this.f42293c;
        try {
            List<w3> list = (List) hVar.i().u(new CallableC2551p1(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (w3 w3Var : list) {
                if (z10 || !z3.v0(w3Var.f42521c)) {
                    arrayList.add(new v3(w3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            B0 b0D = hVar.d();
            b0D.f41712f.a(B0.v(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        } catch (ExecutionException e11) {
            e = e11;
            B0 b0D2 = hVar.d();
            b0D2.f41712f.a(B0.v(str3), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // p131k5.InterfaceC2561s0
    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public final void mo705d(Bundle bundle, o3 o3Var) {
        c0(o3Var);
        String str = o3Var.f42332b;
        C0804l.h(str);
        RunnableC2531k1 runnableC2531k1 = new RunnableC2531k1();
        runnableC2531k1.f42274b = this;
        runnableC2531k1.f42275c = str;
        runnableC2531k1.f42276d = bundle;
        g(runnableC2531k1);
    }
}
