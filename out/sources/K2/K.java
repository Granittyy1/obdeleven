package K2;

import Q2.C0738o;
import R2.RunnableC0752e;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: WorkManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class K extends androidx.work.o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static K f4141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static K f4142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f4143m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.a f4145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f4146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.b f4147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<t> f4148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f4149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R2.r f4150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4151h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f4152i;
    public final O2.n j;

    /* JADX INFO: compiled from: WorkManagerImpl.java */
    public static class a {
        public static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static {
        androidx.work.k.d("WorkManagerImpl");
        f4141k = null;
        f4142l = null;
        f4143m = new Object();
    }

    public K(Context context, final androidx.work.a aVar, S2.b bVar, final WorkDatabase workDatabase, final List<t> list, r rVar, O2.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        androidx.work.k.a aVar2 = new androidx.work.k.a(aVar.f20335g);
        synchronized (androidx.work.k.f20459a) {
            androidx.work.k.f20460b = aVar2;
        }
        this.f4144a = applicationContext;
        this.f4147d = bVar;
        this.f4146c = workDatabase;
        this.f4149f = rVar;
        this.j = nVar;
        this.f4145b = aVar;
        this.f4148e = list;
        this.f4150g = new R2.r(workDatabase);
        final R2.t tVarC = bVar.c();
        int i10 = w.f4232a;
        rVar.a(new InterfaceC0711d() { // from class: K2.u
            @Override // K2.InterfaceC0711d
            public final void b(C0738o c0738o, boolean z10) {
                ((R2.t) tVarC).execute(new v(list, c0738o, aVar, workDatabase, 0));
            }
        });
        bVar.d(new ForceStopRunnable(applicationContext, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static K b(Context context) {
        K kB;
        Object obj = f4143m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        kB = f4141k;
                        if (kB == null) {
                            kB = f4142l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return kB;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (kB == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof androidx.work.a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            c(applicationContext, ((androidx.work.a.b) applicationContext).a());
            kB = b(applicationContext);
        }
        return kB;
    }

    public static void c(Context context, androidx.work.a aVar) {
        synchronized (f4143m) {
            try {
                K k10 = f4141k;
                if (k10 != null && f4142l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (k10 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f4142l == null) {
                        f4142l = androidx.work.impl.a.a(applicationContext, aVar);
                    }
                    f4141k = f4142l;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0722o a(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        y yVar = new y(this, list);
        if (yVar.f4239h) {
            androidx.work.k kVarC = androidx.work.k.c();
            TextUtils.join(", ", yVar.f4237f);
            kVarC.getClass();
        } else {
            RunnableC0752e runnableC0752e = new RunnableC0752e(yVar);
            this.f4147d.d(runnableC0752e);
            yVar.f4240i = runnableC0752e.f5227c;
        }
        return yVar.f4240i;
    }

    public final void d() {
        synchronized (f4143m) {
            try {
                this.f4151h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f4152i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f4152i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        ArrayList arrayListB;
        String str = N2.e.f4637g;
        Context context = this.f4144a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListB = N2.e.b(context, jobScheduler)) != null && !arrayListB.isEmpty()) {
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                N2.e.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f4146c;
        workDatabase.t().z();
        w.b(this.f4145b, workDatabase, this.f4148e);
    }
}
