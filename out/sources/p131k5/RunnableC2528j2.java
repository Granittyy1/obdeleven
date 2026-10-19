package p131k5;

import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: renamed from: k5.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2528j2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zziq f42250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f42252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zziq f42254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f42255g;

    public RunnableC2528j2(e eVar, zziq zziqVar, long j, long j10, boolean z10, zziq zziqVar2) {
        this.f42250b = zziqVar;
        this.f42251c = j;
        this.f42252d = j10;
        this.f42253e = z10;
        this.f42254f = zziqVar2;
        this.f42255g = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar = this.f42250b;
        e eVar = this.f42255g;
        eVar.E(zziqVar);
        eVar.z(this.f42251c, false);
        e.G(this.f42255g, zziqVar, this.f42252d, true, this.f42253e);
        C1924v5.a();
        if (((C2523i1) eVar.f3968a).f42218g.B(null, B.f41693r0)) {
            e.H(eVar, zziqVar, this.f42254f);
        }
    }
}
