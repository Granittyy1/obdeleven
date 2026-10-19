package p131k5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C1780b0;
import com.google.android.gms.measurement.internal.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class l3 extends m3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f42297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k3 f42298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f42299f;

    public l3(h hVar) {
        super(hVar);
        this.f42297d = (AlarmManager) ((C2523i1) this.f3968a).f42212a.getSystemService("alarm");
    }

    @Override // p131k5.m3
    public final boolean v() {
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        AlarmManager alarmManager = this.f42297d;
        if (alarmManager != null) {
            Context context = c2523i1.f42212a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C1780b0.f25661a));
        }
        JobScheduler jobScheduler = (JobScheduler) c2523i1.f42212a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
        return false;
    }

    public final void w() {
        t();
        d().f41719n.c("Unscheduling upload");
        C2523i1 c2523i1 = (C2523i1) this.f3968a;
        AlarmManager alarmManager = this.f42297d;
        if (alarmManager != null) {
            Context context = c2523i1.f42212a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C1780b0.f25661a));
        }
        z().a();
        JobScheduler jobScheduler = (JobScheduler) c2523i1.f42212a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(y());
        }
    }

    public final int y() {
        if (this.f42299f == null) {
            this.f42299f = Integer.valueOf(("measurement" + ((C2523i1) this.f3968a).f42212a.getPackageName()).hashCode());
        }
        return this.f42299f.intValue();
    }

    public final AbstractC2549p z() {
        if (this.f42298e == null) {
            this.f42298e = new k3(this, this.f42311b.f26609l);
        }
        return this.f42298e;
    }
}
