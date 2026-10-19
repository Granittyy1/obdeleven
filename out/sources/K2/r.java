package K2;

import Q2.C0738o;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: Processor.java */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f4211l = androidx.work.k.d("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.work.a f4214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.b f4215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4216e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f4218g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4217f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f4220i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f4212a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4221k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f4219h = new HashMap();

    public r(Context context, androidx.work.a aVar, S2.b bVar, WorkDatabase workDatabase) {
        this.f4213b = context;
        this.f4214c = aVar;
        this.f4215d = bVar;
        this.f4216e = workDatabase;
    }

    public static boolean d(P p10, int i10) {
        if (p10 == null) {
            androidx.work.k.c().getClass();
            return false;
        }
        p10.f4179s = i10;
        p10.h();
        p10.f4178r.cancel(true);
        if (p10.f4167f == null || !(p10.f4178r.f20427b instanceof AbstractFuture.b)) {
            Objects.toString(p10.f4166e);
            androidx.work.k.c().getClass();
        } else {
            p10.f4167f.stop(i10);
        }
        androidx.work.k.c().getClass();
        return true;
    }

    public final void a(InterfaceC0711d interfaceC0711d) {
        synchronized (this.f4221k) {
            this.j.add(interfaceC0711d);
        }
    }

    public final P b(String str) {
        P p10 = (P) this.f4217f.remove(str);
        boolean z10 = p10 != null;
        if (!z10) {
            p10 = (P) this.f4218g.remove(str);
        }
        this.f4219h.remove(str);
        if (z10) {
            synchronized (this.f4221k) {
                try {
                    if (this.f4217f.isEmpty()) {
                        Context context = this.f4213b;
                        String str2 = P2.b.f4898k;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f4213b.startService(intent);
                        } catch (Throwable th) {
                            androidx.work.k.c().b(f4211l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.f4212a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f4212a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return p10;
    }

    public final P c(String str) {
        P p10 = (P) this.f4217f.get(str);
        return p10 == null ? (P) this.f4218g.get(str) : p10;
    }

    public final void e(InterfaceC0711d interfaceC0711d) {
        synchronized (this.f4221k) {
            this.j.remove(interfaceC0711d);
        }
    }

    public final void f(String str, androidx.work.e eVar) {
        synchronized (this.f4221k) {
            try {
                androidx.work.k.c().getClass();
                P p10 = (P) this.f4218g.remove(str);
                if (p10 != null) {
                    if (this.f4212a == null) {
                        PowerManager.WakeLock wakeLockA = R2.x.a(this.f4213b, "ProcessorForegroundLck");
                        this.f4212a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f4217f.put(str, p10);
                    p0.a.d.b(this.f4213b, P2.b.d(this.f4213b, Lb.a.g(p10.f4166e), eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(x xVar, WorkerParameters.a aVar) {
        boolean z10;
        C0738o c0738o = xVar.f4233a;
        String str = c0738o.f5025a;
        ArrayList arrayList = new ArrayList();
        Q2.z zVar = (Q2.z) this.f4216e.l(new CallableC0723p(this, arrayList, str));
        if (zVar == null) {
            androidx.work.k kVarC = androidx.work.k.c();
            c0738o.toString();
            kVarC.getClass();
            this.f4215d.b().execute(new E7.d(this, 1, c0738o));
            return false;
        }
        synchronized (this.f4221k) {
            try {
                synchronized (this.f4221k) {
                    z10 = c(str) != null;
                }
                if (z10) {
                    Set set = (Set) this.f4219h.get(str);
                    if (((x) set.iterator().next()).f4233a.f5026b == c0738o.f5026b) {
                        set.add(xVar);
                        androidx.work.k kVarC2 = androidx.work.k.c();
                        c0738o.toString();
                        kVarC2.getClass();
                    } else {
                        this.f4215d.b().execute(new E7.d(this, 1, c0738o));
                    }
                    return false;
                }
                if (zVar.f5054t != c0738o.f5026b) {
                    this.f4215d.b().execute(new E7.d(this, 1, c0738o));
                    return false;
                }
                P.a aVar2 = new P.a(this.f4213b, this.f4214c, this.f4215d, this, this.f4216e, zVar, arrayList);
                if (aVar != null) {
                    aVar2.f4187h = aVar;
                }
                P p10 = new P(aVar2);
                androidx.work.impl.utils.futures.a<Boolean> aVar3 = p10.f4177q;
                aVar3.a(new q(this, aVar3, p10, 0), this.f4215d.b());
                this.f4218g.put(str, p10);
                HashSet hashSet = new HashSet();
                hashSet.add(xVar);
                this.f4219h.put(str, hashSet);
                this.f4215d.c().execute(p10);
                androidx.work.k kVarC3 = androidx.work.k.c();
                c0738o.toString();
                kVarC3.getClass();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
