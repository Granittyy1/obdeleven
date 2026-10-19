package p131k5;

import android.os.SystemClock;

/* JADX INFO: renamed from: k5.g3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2515g3 extends AbstractC2549p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2500d3 f42183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2515g3(C2500d3 c2500d3, E1 e10) {
        super(e10);
        this.f42183e = c2500d3;
    }

    @Override // p131k5.AbstractC2549p
    public final void c() {
        C2500d3 c2500d3 = this.f42183e;
        c2500d3.f42144d.p();
        Y2 y10 = c2500d3.f42144d;
        ((C2523i1) y10.f3968a).f42224n.getClass();
        c2500d3.a(false, false, SystemClock.elapsedRealtime());
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        C2481a c2481aM = c2523i1.m();
        c2523i1.f42224n.getClass();
        c2481aM.t(SystemClock.elapsedRealtime());
    }
}
