package N2;

import K2.t;
import Q2.C0728e;
import Q2.C0732i;
import Q2.C0738o;
import Q2.z;
import R2.m;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: SystemJobScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public final class e implements t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4637g = k.d("SystemJobScheduler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f4639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f4641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.work.a f4642f;

    public e(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        d dVar = new d(context, aVar.f20331c);
        this.f4638b = context;
        this.f4639c = jobScheduler;
        this.f4640d = dVar;
        this.f4641e = workDatabase;
        this.f4642f = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            k.c().b(f4637g, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            k.c().b(f4637g, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static C0738o f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0738o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K2.t
    public final boolean c() {
        return true;
    }

    @Override // K2.t
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.f4638b;
        JobScheduler jobScheduler = this.f4639c;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                C0738o c0738oF = f(jobInfo);
                if (c0738oF != null && str.equals(c0738oF.f5025a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f4641e.q().g(str);
    }

    @Override // K2.t
    public final void e(z... zVarArr) {
        int iIntValue;
        androidx.work.a aVar = this.f4642f;
        WorkDatabase workDatabase = this.f4641e;
        final m mVar = new m(workDatabase);
        for (z zVar : zVarArr) {
            workDatabase.c();
            try {
                z zVarT = workDatabase.t().t(zVar.f5036a);
                if (zVarT != null && zVarT.f5037b == WorkInfo$State.f20306b) {
                    C0738o c0738oG = Lb.a.g(zVar);
                    C0732i c0732iB = workDatabase.q().b(c0738oG);
                    if (c0732iB != null) {
                        iIntValue = c0732iB.f5020c;
                    } else {
                        aVar.getClass();
                        final int i10 = aVar.f20336h;
                        Object objL = ((WorkDatabase) mVar.f5232a).l(new Callable() { // from class: R2.l
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                m this$0 = mVar;
                                kotlin.jvm.internal.i.e(this$0, "this$0");
                                WorkDatabase workDatabase2 = (WorkDatabase) this$0.f5232a;
                                Long lA = workDatabase2.p().a("next_job_scheduler_id");
                                int i11 = 0;
                                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                                workDatabase2.p().b(new C0728e("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i10) {
                                    workDatabase2.p().b(new C0728e("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i11 = iLongValue;
                                }
                                return Integer.valueOf(i11);
                            }
                        });
                        i.d(objL, "workDatabase.runInTransa…            id\n        })");
                        iIntValue = ((Number) objL).intValue();
                    }
                    if (c0732iB == null) {
                        workDatabase.q().f(new C0732i(c0738oG.f5025a, c0738oG.f5026b, iIntValue));
                    }
                    g(zVar, iIntValue);
                    workDatabase.m();
                } else {
                    k.c().getClass();
                    workDatabase.m();
                }
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
    }

    public final void g(z zVar, int i10) {
        int i11;
        int i12;
        String str = f4637g;
        JobScheduler jobScheduler = this.f4639c;
        d dVar = this.f4640d;
        dVar.getClass();
        androidx.work.c cVar = zVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", zVar.f5036a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", zVar.f5054t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", zVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, dVar.f4635a).setRequiresCharging(cVar.f20342b);
        boolean z10 = cVar.f20343c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z10).setExtras(persistableBundle);
        int i13 = Build.VERSION.SDK_INT;
        NetworkType networkType = cVar.f20341a;
        if (i13 < 30 || networkType != NetworkType.f20301g) {
            int iOrdinal = networkType.ordinal();
            if (iOrdinal == 0) {
                i11 = 0;
            } else if (iOrdinal != 1) {
                i11 = 2;
                if (iOrdinal != 2) {
                    i11 = 3;
                    if (iOrdinal != 3) {
                        i11 = 4;
                        if (iOrdinal != 4) {
                            k kVarC = k.c();
                            networkType.toString();
                            kVarC.getClass();
                            i11 = 1;
                        }
                    }
                }
            } else {
                i11 = 1;
            }
            extras.setRequiredNetworkType(i11);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z10) {
            extras.setBackoffCriteria(zVar.f5047m, zVar.f5046l == BackoffPolicy.f20288c ? 0 : 1);
        }
        long jA = zVar.a();
        dVar.f4636b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i13 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!zVar.f5051q) {
            extras.setImportantWhileForeground(true);
        }
        Set<androidx.work.c.a> set = cVar.f20348h;
        if (!set.isEmpty()) {
            for (androidx.work.c.a aVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(aVar.f20349a, aVar.f20350b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f20346f);
            extras.setTriggerContentMaxDelay(cVar.f20347g);
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(cVar.f20344d);
        extras.setRequiresStorageNotLow(cVar.f20345e);
        boolean z11 = zVar.f5045k > 0;
        boolean z12 = jMax > 0;
        if (i14 >= 31 && zVar.f5051q && !z11 && !z12) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        k.c().getClass();
        try {
            try {
                if (jobScheduler.schedule(jobInfoBuild) == 0) {
                    k.c().getClass();
                    if (zVar.f5051q && zVar.f5052r == OutOfQuotaPolicy.f20303b) {
                        i12 = 0;
                        try {
                            zVar.f5051q = false;
                            k.c().getClass();
                            g(zVar, i10);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            ArrayList arrayListB = b(this.f4638b, jobScheduler);
                            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(arrayListB != null ? arrayListB.size() : i12), Integer.valueOf(this.f4641e.t().m().size()), Integer.valueOf(this.f4642f.j));
                            k.c().a(str, str2);
                            throw new IllegalStateException(str2, e);
                        }
                    }
                }
            } catch (Throwable th) {
                k.c().b(str, "Unable to schedule " + zVar, th);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i12 = 0;
        }
    }
}
