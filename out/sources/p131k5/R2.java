package p131k5;

import android.content.ComponentName;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P2 f41975b;

    public R2(P2 p10) {
        this.f41975b = p10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P2 p10 = this.f41975b;
        C2587y2 c2587y2 = p10.f41958d;
        ComponentName componentName = new ComponentName(((C2523i1) p10.f41958d.f3968a).f42212a, "com.google.android.gms.measurement.AppMeasurementService");
        c2587y2.p();
        if (c2587y2.f42536d != null) {
            c2587y2.f42536d = null;
            c2587y2.d().f41719n.b(componentName, "Disconnected from device MeasurementService");
            c2587y2.p();
            c2587y2.C();
        }
    }
}
