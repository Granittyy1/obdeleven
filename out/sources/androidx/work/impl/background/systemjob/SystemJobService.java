package androidx.work.impl.background.systemjob;

import K2.InterfaceC0711d;
import K2.J;
import K2.K;
import K2.r;
import K2.x;
import Q2.C0738o;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import androidx.work.k;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0711d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20380f = k.d("SystemJobService");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f20381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20382c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G6.a f20383d = new G6.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J f20384e;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            int stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f20380f;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static C0738o a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C0738o(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // K2.InterfaceC0711d
    public final void b(C0738o c0738o, boolean z10) {
        JobParameters jobParameters;
        k.c().getClass();
        synchronized (this.f20382c) {
            jobParameters = (JobParameters) this.f20382c.remove(c0738o);
        }
        this.f20383d.c(c0738o);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            K kB = K.b(getApplicationContext());
            this.f20381b = kB;
            r rVar = kB.f4149f;
            this.f20384e = new J(rVar, kB.f4147d);
            rVar.a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            k.c().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        K k10 = this.f20381b;
        if (k10 != null) {
            k10.f4149f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f20381b == null) {
            k.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        C0738o c0738oA = a(jobParameters);
        if (c0738oA == null) {
            k.c().a(f20380f, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f20382c) {
            try {
                if (this.f20382c.containsKey(c0738oA)) {
                    k kVarC = k.c();
                    c0738oA.toString();
                    kVarC.getClass();
                    return false;
                }
                k kVarC2 = k.c();
                c0738oA.toString();
                kVarC2.getClass();
                this.f20382c.put(c0738oA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f20327b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f20326a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    aVar.f20328c = b.a(jobParameters);
                }
                this.f20384e.c(this.f20383d.e(c0738oA), aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f20381b == null) {
            k.c().getClass();
            return true;
        }
        C0738o c0738oA = a(jobParameters);
        if (c0738oA == null) {
            k.c().a(f20380f, "WorkSpec id not found!");
            return false;
        }
        k kVarC = k.c();
        c0738oA.toString();
        kVarC.getClass();
        synchronized (this.f20382c) {
            this.f20382c.remove(c0738oA);
        }
        x xVarC = this.f20383d.c(c0738oA);
        if (xVarC != null) {
            int iA = Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512;
            J j = this.f20384e;
            j.getClass();
            j.a(xVarC, iA);
        }
        r rVar = this.f20381b.f4149f;
        String str = c0738oA.f5025a;
        synchronized (rVar.f4221k) {
            zContains = rVar.f4220i.contains(str);
        }
        return !zContains;
    }
}
