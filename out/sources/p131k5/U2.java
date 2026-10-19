package p131k5;

import android.app.job.JobParameters;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ V2 f42009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ B0 f42010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ JobParameters f42011d;

    @Override // java.lang.Runnable
    public final void run() {
        V2 v10 = this.f42009b;
        v10.getClass();
        this.f42010c.f41719n.c("AppMeasurementJobService processed last upload request.");
        ((Z2) v10.f42026a).b(this.f42011d);
    }
}
