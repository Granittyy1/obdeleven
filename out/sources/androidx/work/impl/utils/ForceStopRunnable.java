package androidx.work.impl.utils;

import K2.K;
import K2.w;
import N2.e;
import Q2.A;
import Q2.C0728e;
import Q2.C0738o;
import Q2.InterfaceC0743u;
import Q2.z;
import R2.h;
import R2.r;
import R2.s;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20417f = k.d("ForceStopRunnable");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f20418g = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f20420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f20421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20422e = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        static {
            k.d("ForceStopRunnable$Rcvr");
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            k.c().getClass();
            ForceStopRunnable.b(context);
        }
    }

    public ForceStopRunnable(Context context, K k10) {
        this.f20419b = context.getApplicationContext();
        this.f20420c = k10;
        this.f20421d = k10.f4150g;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long jCurrentTimeMillis = System.currentTimeMillis() + f20418g;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ad  */
    public final void a() {
        boolean z10;
        r rVar = this.f20421d;
        K k10 = this.f20420c;
        WorkDatabase workDatabase = k10.f4146c;
        String str = e.f4637g;
        Context context = this.f20419b;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList<JobInfo> arrayListB = e.b(context, jobScheduler);
        ArrayList arrayListA = workDatabase.q().a();
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (JobInfo jobInfo : arrayListB) {
                C0738o c0738oF = e.f(jobInfo);
                if (c0738oF != null) {
                    hashSet.add(c0738oF.f5025a);
                } else {
                    e.a(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = arrayListA.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    k.c().getClass();
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            workDatabase.c();
            try {
                A aT = workDatabase.t();
                Iterator it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    aT.f(-1L, (String) it2.next());
                }
                workDatabase.m();
                workDatabase.j();
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        WorkDatabase workDatabase2 = k10.f4146c;
        A aT2 = workDatabase2.t();
        InterfaceC0743u interfaceC0743uS = workDatabase2.s();
        workDatabase2.c();
        try {
            ArrayList<z> arrayListO = aT2.o();
            boolean zIsEmpty = arrayListO.isEmpty();
            if (!zIsEmpty) {
                for (z zVar : arrayListO) {
                    WorkInfo$State workInfo$State = WorkInfo$State.f20306b;
                    String str2 = zVar.f5036a;
                    aT2.j(workInfo$State, str2);
                    aT2.p(-512, str2);
                    aT2.f(-1L, str2);
                }
            }
            interfaceC0743uS.c();
            workDatabase2.m();
            workDatabase2.j();
            boolean z11 = !zIsEmpty || z10;
            Long lA = k10.f4150g.f5233a.p().a("reschedule_needed");
            if (lA != null && lA.longValue() == 1) {
                k.c().getClass();
                k10.e();
                r rVar2 = k10.f4150g;
                rVar2.getClass();
                rVar2.f5233a.p().b(new C0728e("reschedule_needed", 0L));
                return;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = i10 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i11);
                if (i10 < 30) {
                    if (broadcast == null) {
                        b(context);
                        k.c().getClass();
                        k10.e();
                        k10.f4145b.f20331c.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        rVar.getClass();
                        rVar.f5233a.p().b(new C0728e("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z11) {
                        k.c().getClass();
                        w.b(k10.f4145b, k10.f4146c, k10.f4148e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = rVar.f5233a.p().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        ApplicationExitInfo applicationExitInfoA = h.a(historicalProcessExitReasons.get(i12));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jLongValue) {
                            k.c().getClass();
                            k10.e();
                            k10.f4145b.f20331c.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            rVar.getClass();
                            rVar.f5233a.p().b(new C0728e("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z11) {
                    k.c().getClass();
                    w.b(k10.f4145b, k10.f4146c, k10.f4148e);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                k.c().getClass();
            }
        } catch (Throwable th2) {
            workDatabase2.j();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = f20417f;
        K k10 = this.f20420c;
        try {
            a aVar = k10.f4145b;
            aVar.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f20419b;
            if (zIsEmpty) {
                k.c().getClass();
                zA = true;
            } else {
                zA = s.a(context, aVar);
                k.c().getClass();
            }
            if (!zA) {
                k10.d();
                return;
            }
            while (true) {
                try {
                    K2.A.a(context);
                    k.c().getClass();
                    try {
                        a();
                        k10.d();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                        int i10 = this.f20422e + 1;
                        this.f20422e = i10;
                        if (i10 >= 3) {
                            String str2 = p271w0.k.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            k.c().b(str, str2, e10);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                            k10.f4145b.getClass();
                            throw illegalStateException;
                        }
                        k.c().getClass();
                        try {
                            Thread.sleep(((long) this.f20422e) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    k.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    k10.f4145b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            k10.d();
            throw th;
        }
    }
}
