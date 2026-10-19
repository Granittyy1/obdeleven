package p131k5;

import com.google.android.gms.common.a;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f41829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2588z f41830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f41832e;

    public I1(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1843k0 interfaceC1843k0, C2588z c2588z, String str) {
        this.f41829b = interfaceC1843k0;
        this.f41830c = c2588z;
        this.f41831d = str;
        this.f41832e = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2587y2 c2587y2R = this.f41832e.f26535c.r();
        c2587y2R.p();
        c2587y2R.t();
        int iB = a.f25299b.b(((C2523i1) c2587y2R.o().f3968a).f42212a, 12451000);
        InterfaceC1843k0 interfaceC1843k0 = this.f41829b;
        if (iB == 0) {
            c2587y2R.w(new J2(c2587y2R, this.f41830c, this.f41831d, interfaceC1843k0));
        } else {
            c2587y2R.d().f41715i.c("Not bundling data. Service unavailable or out of date");
            c2587y2R.o().P(interfaceC1843k0, new byte[0]);
        }
    }
}
