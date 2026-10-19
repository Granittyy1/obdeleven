package L2;

import K2.C0710c;
import K2.InterfaceC0711d;
import K2.J;
import K2.r;
import K2.t;
import K2.x;
import O2.n;
import Q2.C0738o;
import Q2.z;
import R2.s;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: GreedyScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t, androidx.work.impl.constraints.d, InterfaceC0711d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4442b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f4444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4445e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f4448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J f4449i;
    public final androidx.work.a j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Boolean f4451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkConstraintsTracker f4452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S2.b f4453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e f4454o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4443c = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4446f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G6.a f4447g = new G6.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f4450k = new HashMap();

    /* JADX INFO: compiled from: GreedyScheduler.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4456b;

        public a(int i10, long j) {
            this.f4455a = i10;
            this.f4456b = j;
        }
    }

    static {
        k.d("GreedyScheduler");
    }

    public c(Context context, androidx.work.a aVar, n nVar, r rVar, J j, S2.b bVar) {
        this.f4442b = context;
        C0710c c0710c = aVar.f20334f;
        this.f4444d = new b(this, c0710c, aVar.f20331c);
        this.f4454o = new e(c0710c, j);
        this.f4453n = bVar;
        this.f4452m = new WorkConstraintsTracker(nVar);
        this.j = aVar;
        this.f4448h = rVar;
        this.f4449i = j;
    }

    @Override // androidx.work.impl.constraints.d
    public final void a(z zVar, androidx.work.impl.constraints.b bVar) {
        C0738o c0738oG = Lb.a.g(zVar);
        boolean z10 = bVar instanceof androidx.work.impl.constraints.b.a;
        J j = this.f4449i;
        e eVar = this.f4454o;
        G6.a aVar = this.f4447g;
        if (z10) {
            if (aVar.b(c0738oG)) {
                return;
            }
            k kVarC = k.c();
            c0738oG.toString();
            kVarC.getClass();
            x xVarE = aVar.e(c0738oG);
            eVar.b(xVarE);
            j.c(xVarE, null);
            return;
        }
        k kVarC2 = k.c();
        c0738oG.toString();
        kVarC2.getClass();
        x xVarC = aVar.c(c0738oG);
        if (xVarC != null) {
            eVar.a(xVarC);
            j.a(xVarC, ((androidx.work.impl.constraints.b.C0202b) bVar).f20391a);
        }
    }

    @Override // K2.InterfaceC0711d
    public final void b(C0738o c0738o, boolean z10) {
        InterfaceC2694i0 interfaceC2694i0;
        x xVarC = this.f4447g.c(c0738o);
        if (xVarC != null) {
            this.f4454o.a(xVarC);
        }
        synchronized (this.f4446f) {
            interfaceC2694i0 = (InterfaceC2694i0) this.f4443c.remove(c0738o);
        }
        if (interfaceC2694i0 != null) {
            k kVarC = k.c();
            Objects.toString(c0738o);
            kVarC.getClass();
            interfaceC2694i0.i(null);
        }
        if (z10) {
            return;
        }
        synchronized (this.f4446f) {
            this.f4450k.remove(c0738o);
        }
    }

    @Override // K2.t
    public final boolean c() {
        return false;
    }

    @Override // K2.t
    public final void d(String str) {
        Runnable runnable;
        if (this.f4451l == null) {
            this.f4451l = Boolean.valueOf(s.a(this.f4442b, this.j));
        }
        if (!this.f4451l.booleanValue()) {
            k.c().getClass();
            return;
        }
        if (!this.f4445e) {
            this.f4448h.a(this);
            this.f4445e = true;
        }
        k.c().getClass();
        b bVar = this.f4444d;
        if (bVar != null && (runnable = (Runnable) bVar.f4441d.remove(str)) != null) {
            bVar.f4439b.a(runnable);
        }
        for (x xVar : this.f4447g.d(str)) {
            this.f4454o.a(xVar);
            this.f4449i.b(xVar);
        }
    }

    @Override // K2.t
    public final void e(z... zVarArr) {
        long jMax;
        if (this.f4451l == null) {
            this.f4451l = Boolean.valueOf(s.a(this.f4442b, this.j));
        }
        if (!this.f4451l.booleanValue()) {
            k.c().getClass();
            return;
        }
        if (!this.f4445e) {
            this.f4448h.a(this);
            this.f4445e = true;
        }
        HashSet<z> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (z zVar : zVarArr) {
            if (!this.f4447g.b(Lb.a.g(zVar))) {
                synchronized (this.f4446f) {
                    try {
                        C0738o c0738oG = Lb.a.g(zVar);
                        a aVar = (a) this.f4450k.get(c0738oG);
                        if (aVar == null) {
                            int i10 = zVar.f5045k;
                            this.j.f20331c.getClass();
                            aVar = new a(i10, System.currentTimeMillis());
                            this.f4450k.put(c0738oG, aVar);
                        }
                        jMax = (((long) Math.max((zVar.f5045k - aVar.f4455a) - 5, 0)) * 30000) + aVar.f4456b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(zVar.a(), jMax);
                this.j.f20331c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zVar.f5037b == WorkInfo$State.f20306b) {
                    if (jCurrentTimeMillis < jMax2) {
                        b bVar = this.f4444d;
                        if (bVar != null) {
                            HashMap map = bVar.f4441d;
                            Runnable runnable = (Runnable) map.remove(zVar.f5036a);
                            C0710c c0710c = bVar.f4439b;
                            if (runnable != null) {
                                c0710c.a(runnable);
                            }
                            L2.a aVar2 = new L2.a(bVar, 0, zVar);
                            map.put(zVar.f5036a, aVar2);
                            bVar.f4440c.getClass();
                            c0710c.c(aVar2, jMax2 - System.currentTimeMillis());
                        }
                    } else if (zVar.b()) {
                        androidx.work.c cVar = zVar.j;
                        if (cVar.f20343c) {
                            k kVarC = k.c();
                            zVar.toString();
                            kVarC.getClass();
                        } else if (cVar.f20348h.isEmpty()) {
                            hashSet.add(zVar);
                            hashSet2.add(zVar.f5036a);
                        } else {
                            k kVarC2 = k.c();
                            zVar.toString();
                            kVarC2.getClass();
                        }
                    } else if (!this.f4447g.b(Lb.a.g(zVar))) {
                        k.c().getClass();
                        G6.a aVar3 = this.f4447g;
                        aVar3.getClass();
                        x xVarE = aVar3.e(Lb.a.g(zVar));
                        this.f4454o.b(xVarE);
                        this.f4449i.c(xVarE, null);
                    }
                }
            }
        }
        synchronized (this.f4446f) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    k.c().getClass();
                    for (z zVar2 : hashSet) {
                        C0738o c0738oG2 = Lb.a.g(zVar2);
                        if (!this.f4443c.containsKey(c0738oG2)) {
                            this.f4443c.put(c0738oG2, androidx.work.impl.constraints.e.a(this.f4452m, zVar2, this.f4453n.a(), this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
