package p131k5;

import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: k5.r1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2558r1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f42430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f42434f;

    public RunnableC2558r1(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1843k0 interfaceC1843k0, String str, String str2, boolean z10) {
        this.f42430b = interfaceC1843k0;
        this.f42431c = str;
        this.f42432d = str2;
        this.f42433e = z10;
        this.f42434f = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2587y2 c2587y2R = this.f42434f.f26535c.r();
        c2587y2R.p();
        c2587y2R.t();
        c2587y2R.w(new A2(c2587y2R, this.f42431c, this.f42432d, c2587y2R.J(false), this.f42433e, this.f42430b));
    }
}
