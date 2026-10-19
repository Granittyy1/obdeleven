package p131k5;

import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class U1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f42008c;

    public U1(e eVar, long j) {
        this.f42007b = j;
        this.f42008c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f42008c;
        P0 p10 = eVar.n().f41869l;
        long j = this.f42007b;
        p10.b(j);
        B0 b0D = eVar.d();
        b0D.f41718m.b(Long.valueOf(j), "Session timeout duration set");
    }
}
