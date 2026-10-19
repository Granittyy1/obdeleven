package p131k5;

import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: k5.d2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2499d2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f42137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f42140e;

    public RunnableC2499d2(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1843k0 interfaceC1843k0, String str, String str2) {
        this.f42137b = interfaceC1843k0;
        this.f42138c = str;
        this.f42139d = str2;
        this.f42140e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2587y2 c2587y2R = this.f42140e.f26535c.r();
        c2587y2R.p();
        c2587y2R.t();
        o3 o3VarJ = c2587y2R.J(false);
        c2587y2R.w(new O2(c2587y2R, this.f42138c, this.f42139d, o3VarJ, this.f42137b));
    }
}
