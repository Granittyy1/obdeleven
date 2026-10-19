package M2;

import K2.r;
import K2.x;
import O2.n;
import Q2.C0738o;
import Q2.z;
import R2.F;
import R2.t;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.k;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2700k0;

/* JADX INFO: compiled from: DelayMetCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements androidx.work.impl.constraints.d, F.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0738o f4535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f4536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WorkConstraintsTracker f4537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S2.a f4540i;
    public final Executor j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f4541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f4543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AbstractC2712w f4544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C2700k0 f4545o;

    static {
        k.d("DelayMetCommandHandler");
    }

    public f(Context context, int i10, g gVar, x xVar) {
        this.f4533b = context;
        this.f4534c = i10;
        this.f4536e = gVar;
        this.f4535d = xVar.f4233a;
        this.f4543m = xVar;
        n nVar = gVar.f4551f.j;
        S2.b bVar = gVar.f4548c;
        this.f4540i = bVar.c();
        this.j = bVar.b();
        this.f4544n = bVar.a();
        this.f4537f = new WorkConstraintsTracker(nVar);
        this.f4542l = false;
        this.f4539h = 0;
        this.f4538g = new Object();
    }

    public static void c(f fVar) {
        boolean z10;
        C0738o c0738o = fVar.f4535d;
        if (fVar.f4539h >= 2) {
            k.c().getClass();
            return;
        }
        fVar.f4539h = 2;
        k.c().getClass();
        String str = b.f4519g;
        Context context = fVar.f4533b;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        b.d(intent, c0738o);
        g gVar = fVar.f4536e;
        int i10 = fVar.f4534c;
        g.b bVar = new g.b(i10, gVar, intent);
        Executor executor = fVar.j;
        executor.execute(bVar);
        r rVar = gVar.f4550e;
        String str2 = c0738o.f5025a;
        synchronized (rVar.f4221k) {
            z10 = rVar.c(str2) != null;
        }
        if (!z10) {
            k.c().getClass();
            return;
        }
        k.c().getClass();
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        b.d(intent2, c0738o);
        executor.execute(new g.b(i10, gVar, intent2));
    }

    public static void d(f fVar) {
        if (fVar.f4539h != 0) {
            k kVarC = k.c();
            Objects.toString(fVar.f4535d);
            kVarC.getClass();
            return;
        }
        fVar.f4539h = 1;
        k kVarC2 = k.c();
        Objects.toString(fVar.f4535d);
        kVarC2.getClass();
        if (!fVar.f4536e.f4550e.g(fVar.f4543m, null)) {
            fVar.e();
            return;
        }
        F f10 = fVar.f4536e.f4549d;
        C0738o c0738o = fVar.f4535d;
        synchronized (f10.f5217d) {
            k kVarC3 = k.c();
            Objects.toString(c0738o);
            kVarC3.getClass();
            f10.a(c0738o);
            F.b bVar = new F.b(f10, c0738o);
            f10.f5215b.put(c0738o, bVar);
            f10.f5216c.put(c0738o, fVar);
            f10.f5214a.c(bVar, 600000L);
        }
    }

    @Override // androidx.work.impl.constraints.d
    public final void a(z zVar, androidx.work.impl.constraints.b bVar) {
        boolean z10 = bVar instanceof androidx.work.impl.constraints.b.a;
        S2.a aVar = this.f4540i;
        if (z10) {
            ((t) aVar).execute(new e(0, this));
        } else {
            ((t) aVar).execute(new d(0, this));
        }
    }

    @Override // R2.F.a
    public final void b(C0738o c0738o) {
        k kVarC = k.c();
        Objects.toString(c0738o);
        kVarC.getClass();
        ((t) this.f4540i).execute(new d(0, this));
    }

    public final void e() {
        synchronized (this.f4538g) {
            try {
                if (this.f4545o != null) {
                    this.f4545o.i(null);
                }
                this.f4536e.f4549d.a(this.f4535d);
                PowerManager.WakeLock wakeLock = this.f4541k;
                if (wakeLock != null && wakeLock.isHeld()) {
                    k kVarC = k.c();
                    Objects.toString(this.f4541k);
                    Objects.toString(this.f4535d);
                    kVarC.getClass();
                    this.f4541k.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        String str = this.f4535d.f5025a;
        Context context = this.f4533b;
        StringBuilder sbF = C4.b.f(str, " (");
        sbF.append(this.f4534c);
        sbF.append(")");
        this.f4541k = R2.x.a(context, sbF.toString());
        k kVarC = k.c();
        Objects.toString(this.f4541k);
        kVarC.getClass();
        this.f4541k.acquire();
        z zVarT = this.f4536e.f4551f.f4146c.t().t(str);
        if (zVarT == null) {
            ((t) this.f4540i).execute(new d(0, this));
            return;
        }
        boolean zB = zVarT.b();
        this.f4542l = zB;
        if (zB) {
            this.f4545o = androidx.work.impl.constraints.e.a(this.f4537f, zVarT, this.f4544n, this);
            return;
        }
        k.c().getClass();
        ((t) this.f4540i).execute(new e(0, this));
    }

    public final void g(boolean z10) {
        k kVarC = k.c();
        C0738o c0738o = this.f4535d;
        Objects.toString(c0738o);
        kVarC.getClass();
        e();
        int i10 = this.f4534c;
        g gVar = this.f4536e;
        Executor executor = this.j;
        Context context = this.f4533b;
        if (z10) {
            String str = b.f4519g;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            b.d(intent, c0738o);
            executor.execute(new g.b(i10, gVar, intent));
        }
        if (this.f4542l) {
            String str2 = b.f4519g;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new g.b(i10, gVar, intent2));
        }
    }
}
