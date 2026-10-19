package K2;

import Q2.InterfaceC0725b;
import android.content.Context;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f4162t = androidx.work.k.d("WorkerWrapper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f4165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q2.z f4166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.j f4167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S2.b f4168g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f4170i;
    public final F8.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f4171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WorkDatabase f4172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q2.A f4173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0725b f4174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f4175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4176p;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.work.j.a f4169h = new androidx.work.j.a.C0203a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<Boolean> f4177q = new androidx.work.impl.utils.futures.a<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<androidx.work.j.a> f4178r = new androidx.work.impl.utils.futures.a<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f4179s = -256;

    /* JADX INFO: compiled from: WorkerWrapper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f4180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f4181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final S2.b f4182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.work.a f4183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final WorkDatabase f4184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Q2.z f4185f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f4186g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f4187h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, S2.b bVar, r rVar, WorkDatabase workDatabase, Q2.z zVar, ArrayList arrayList) {
            this.f4180a = context.getApplicationContext();
            this.f4182c = bVar;
            this.f4181b = rVar;
            this.f4183d = aVar;
            this.f4184e = workDatabase;
            this.f4185f = zVar;
            this.f4186g = arrayList;
        }
    }

    public P(a aVar) {
        this.f4163b = aVar.f4180a;
        this.f4168g = aVar.f4182c;
        this.f4171k = aVar.f4181b;
        Q2.z zVar = aVar.f4185f;
        this.f4166e = zVar;
        this.f4164c = zVar.f5036a;
        this.f4165d = aVar.f4187h;
        this.f4167f = null;
        androidx.work.a aVar2 = aVar.f4183d;
        this.f4170i = aVar2;
        this.j = aVar2.f20331c;
        WorkDatabase workDatabase = aVar.f4184e;
        this.f4172l = workDatabase;
        this.f4173m = workDatabase.t();
        this.f4174n = workDatabase.o();
        this.f4175o = aVar.f4186g;
    }

    public final void a(androidx.work.j.a aVar) {
        boolean z10 = aVar instanceof androidx.work.j.a.c;
        Q2.z zVar = this.f4166e;
        if (!z10) {
            if (aVar instanceof androidx.work.j.a.b) {
                androidx.work.k.c().getClass();
                c();
                return;
            }
            androidx.work.k.c().getClass();
            if (zVar.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        androidx.work.k.c().getClass();
        if (zVar.c()) {
            d();
            return;
        }
        InterfaceC0725b interfaceC0725b = this.f4174n;
        String str = this.f4164c;
        Q2.A a10 = this.f4173m;
        WorkDatabase workDatabase = this.f4172l;
        workDatabase.c();
        try {
            a10.j(WorkInfo$State.f20308d, str);
            a10.n(str, ((androidx.work.j.a.c) this.f4169h).f20458a);
            this.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str2 : interfaceC0725b.a(str)) {
                if (a10.s(str2) == WorkInfo$State.f20310f && interfaceC0725b.c(str2)) {
                    androidx.work.k.c().getClass();
                    a10.j(WorkInfo$State.f20306b, str2);
                    a10.k(jCurrentTimeMillis, str2);
                }
            }
            workDatabase.m();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void b() {
        if (h()) {
            return;
        }
        this.f4172l.c();
        try {
            WorkInfo$State workInfo$StateS = this.f4173m.s(this.f4164c);
            this.f4172l.s().a(this.f4164c);
            if (workInfo$StateS == null) {
                e(false);
            } else if (workInfo$StateS == WorkInfo$State.f20307c) {
                a(this.f4169h);
            } else if (!workInfo$StateS.a()) {
                this.f4179s = -512;
                c();
            }
            this.f4172l.m();
        } finally {
            this.f4172l.j();
        }
    }

    public final void c() {
        String str = this.f4164c;
        Q2.A a10 = this.f4173m;
        WorkDatabase workDatabase = this.f4172l;
        workDatabase.c();
        try {
            a10.j(WorkInfo$State.f20306b, str);
            this.j.getClass();
            a10.k(System.currentTimeMillis(), str);
            a10.l(this.f4166e.f5056v, str);
            a10.f(-1L, str);
            workDatabase.m();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f4164c;
        Q2.A a10 = this.f4173m;
        WorkDatabase workDatabase = this.f4172l;
        workDatabase.c();
        try {
            this.j.getClass();
            a10.k(System.currentTimeMillis(), str);
            a10.j(WorkInfo$State.f20306b, str);
            a10.u(str);
            a10.l(this.f4166e.f5056v, str);
            a10.e(str);
            a10.f(-1L, str);
            workDatabase.m();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final void e(boolean z10) {
        this.f4172l.c();
        try {
            if (!this.f4172l.t().q()) {
                R2.q.a(this.f4163b, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f4173m.j(WorkInfo$State.f20306b, this.f4164c);
                this.f4173m.p(this.f4179s, this.f4164c);
                this.f4173m.f(-1L, this.f4164c);
            }
            this.f4172l.m();
            this.f4172l.j();
            this.f4177q.k(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f4172l.j();
            throw th;
        }
    }

    public final void f() {
        WorkInfo$State workInfo$StateS = this.f4173m.s(this.f4164c);
        if (workInfo$StateS == WorkInfo$State.f20307c) {
            androidx.work.k.c().getClass();
            e(true);
        } else {
            androidx.work.k kVarC = androidx.work.k.c();
            Objects.toString(workInfo$StateS);
            kVarC.getClass();
            e(false);
        }
    }

    public final void g() {
        String str = this.f4164c;
        WorkDatabase workDatabase = this.f4172l;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                Q2.A a10 = this.f4173m;
                if (zIsEmpty) {
                    androidx.work.d dVar = ((androidx.work.j.a.C0203a) this.f4169h).f20457a;
                    a10.l(this.f4166e.f5056v, str);
                    a10.n(str, dVar);
                    workDatabase.m();
                    return;
                }
                String str2 = (String) linkedList.remove();
                if (a10.s(str2) != WorkInfo$State.f20311g) {
                    a10.j(WorkInfo$State.f20309e, str2);
                }
                linkedList.addAll(this.f4174n.a(str2));
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (this.f4179s == -256) {
            return false;
        }
        androidx.work.k.c().getClass();
        WorkInfo$State workInfo$StateS = this.f4173m.s(this.f4164c);
        if (workInfo$StateS == null) {
            e(false);
        } else {
            e(!workInfo$StateS.a());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x004e, B:17:0x0054, B:21:0x0069, B:23:0x006f, B:25:0x0073, B:33:0x009b, B:30:0x007c, B:32:0x008d), top: B:74:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:14:0x004e, B:17:0x0054, B:21:0x0069, B:23:0x006f, B:25:0x0073, B:33:0x009b, B:30:0x007c, B:32:0x008d), top: B:74:0x004e }] */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.d dVarA;
        boolean z10;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        String str = this.f4164c;
        sb2.append(str);
        sb2.append(", tags={ ");
        ArrayList<String> arrayList = this.f4175o;
        boolean z11 = true;
        for (String str2 : arrayList) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str2);
        }
        sb2.append(" } ]");
        this.f4176p = sb2.toString();
        Q2.z zVar = this.f4166e;
        if (h()) {
            return;
        }
        WorkDatabase workDatabase = this.f4172l;
        workDatabase.c();
        try {
            WorkInfo$State workInfo$State = zVar.f5037b;
            WorkInfo$State workInfo$State2 = WorkInfo$State.f20306b;
            if (workInfo$State == workInfo$State2) {
                if (zVar.c()) {
                    this.j.getClass();
                    if (System.currentTimeMillis() < zVar.a()) {
                        androidx.work.k.c().getClass();
                        e(true);
                        workDatabase.m();
                    }
                } else if (zVar.f5037b == workInfo$State2 && zVar.f5045k > 0) {
                    this.j.getClass();
                    if (System.currentTimeMillis() < zVar.a()) {
                        androidx.work.k.c().getClass();
                        e(true);
                        workDatabase.m();
                    }
                }
                workDatabase.m();
                workDatabase.j();
                boolean zC = zVar.c();
                Q2.A a10 = this.f4173m;
                androidx.work.a aVar = this.f4170i;
                String str3 = f4162t;
                if (zC) {
                    dVarA = zVar.f5040e;
                } else {
                    aVar.f20333e.getClass();
                    String className = zVar.f5039d;
                    kotlin.jvm.internal.i.e(className, "className");
                    String str4 = androidx.work.g.f20358a;
                    androidx.work.f fVar = null;
                    try {
                        Object objNewInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                        kotlin.jvm.internal.i.c(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                        fVar = (androidx.work.f) objNewInstance;
                    } catch (Exception e10) {
                        androidx.work.k.c().b(androidx.work.g.f20358a, "Trouble instantiating ".concat(className), e10);
                    }
                    if (fVar == null) {
                        androidx.work.k.c().a(str3, "Could not create Input Merger ".concat(className));
                        g();
                        return;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(zVar.f5040e);
                        arrayList2.addAll(a10.w(str));
                        dVarA = fVar.a(arrayList2);
                    }
                }
                UUID uuidFromString = UUID.fromString(str);
                ExecutorService executorService = aVar.f20329a;
                S2.b bVar = this.f4168g;
                R2.E e11 = new R2.E(workDatabase, bVar);
                R2.C c10 = new R2.C(workDatabase, this.f4171k, bVar);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f20317a = uuidFromString;
                workerParameters.f20318b = dVarA;
                workerParameters.f20319c = new HashSet(arrayList);
                workerParameters.f20320d = this.f4165d;
                workerParameters.f20321e = zVar.f5045k;
                workerParameters.f20322f = executorService;
                workerParameters.f20323g = bVar;
                androidx.work.q qVar = aVar.f20332d;
                workerParameters.f20324h = qVar;
                workerParameters.f20325i = e11;
                workerParameters.j = c10;
                androidx.work.j jVar = this.f4167f;
                String str5 = zVar.f5038c;
                if (jVar == null) {
                    this.f4167f = qVar.a(this.f4163b, str5, workerParameters);
                }
                androidx.work.j jVar2 = this.f4167f;
                if (jVar2 == null) {
                    androidx.work.k.c().a(str3, "Could not create Worker " + str5);
                    g();
                    return;
                }
                if (jVar2.isUsed()) {
                    androidx.work.k.c().a(str3, "Received an already-used Worker " + str5 + "; Worker Factory should return new instances");
                    g();
                    return;
                }
                this.f4167f.setUsed();
                workDatabase.c();
                try {
                    if (a10.s(str) == workInfo$State2) {
                        a10.j(WorkInfo$State.f20307c, str);
                        a10.x(str);
                        a10.p(-256, str);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    workDatabase.m();
                    workDatabase.j();
                    if (!z10) {
                        f();
                        return;
                    }
                    if (h()) {
                        return;
                    }
                    R2.A a11 = new R2.A(this.f4163b, this.f4166e, this.f4167f, c10, this.f4168g);
                    bVar.b().execute(a11);
                    androidx.work.impl.utils.futures.a<Void> aVar2 = a11.f5191b;
                    int i10 = 0;
                    M m7 = new M(this, i10, aVar2);
                    R2.w wVar = new R2.w();
                    androidx.work.impl.utils.futures.a<androidx.work.j.a> aVar3 = this.f4178r;
                    aVar3.a(m7, wVar);
                    aVar2.a(new N(this, i10, aVar2), bVar.b());
                    aVar3.a(new O(this, this.f4176p), bVar.c());
                    return;
                } catch (Throwable th) {
                    workDatabase.j();
                    throw th;
                }
            }
            f();
            workDatabase.m();
            androidx.work.k.c().getClass();
            workDatabase.j();
        } catch (Throwable th2) {
            workDatabase.j();
            throw th2;
        }
    }
}
