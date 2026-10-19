package p131k5;

import com.google.android.gms.measurement.internal.e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f41982c;

    public S1(e eVar, boolean z10) {
        this.f41981b = z10;
        this.f41982c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f41982c;
        boolean zH = ((C2523i1) eVar.f3968a).h();
        C2523i1 c2523i1 = (C2523i1) eVar.f3968a;
        boolean z10 = false;
        boolean z11 = c2523i1.f42204A != null && c2523i1.f42204A.booleanValue();
        C2523i1 c2523i2 = (C2523i1) eVar.f3968a;
        boolean z12 = this.f41981b;
        c2523i2.f42204A = Boolean.valueOf(z12);
        if (z11 == z12) {
            B0 b10 = ((C2523i1) eVar.f3968a).f42220i;
            C2523i1.g(b10);
            b10.f41719n.b(Boolean.valueOf(z12), "Default data collection state already set to");
        }
        if (((C2523i1) eVar.f3968a).h() != zH) {
            boolean zH2 = ((C2523i1) eVar.f3968a).h();
            C2523i1 c2523i3 = (C2523i1) eVar.f3968a;
            if (c2523i3.f42204A != null && c2523i3.f42204A.booleanValue()) {
                z10 = true;
            }
            if (zH2 != z10) {
                B0 b11 = ((C2523i1) eVar.f3968a).f42220i;
                C2523i1.g(b11);
                b11.f41716k.a(Boolean.valueOf(z12), Boolean.valueOf(zH), "Default data collection is different than actual status");
            }
        } else {
            B0 b12 = ((C2523i1) eVar.f3968a).f42220i;
            C2523i1.g(b12);
            b12.f41716k.a(Boolean.valueOf(z12), Boolean.valueOf(zH), "Default data collection is different than actual status");
        }
        eVar.U();
    }
}
