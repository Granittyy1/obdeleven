package p131k5;

import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f41955b;

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f41955b;
        eVar.p();
        if (eVar.n().f41878u.b()) {
            eVar.d().f41718m.c("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = eVar.n().f41879v.a();
        eVar.n().f41879v.b(1 + jA);
        if (jA >= 5) {
            eVar.d().f41715i.c("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            eVar.n().f41878u.a(true);
            return;
        }
        C1930w4.a();
        C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
        if (!c2523i1.f42218g.B(null, B.f41632N0)) {
            c2523i1.k();
            return;
        }
        if (eVar.f26583p == null) {
            eVar.f26583p = new Z1(eVar, c2523i1);
        }
        eVar.f26583p.b(0L);
    }
}
