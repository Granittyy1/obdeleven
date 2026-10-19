package p131k5;

import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: renamed from: k5.i2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2524i2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zziq f42237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f42239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zziq f42240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f42241f;

    public RunnableC2524i2(e eVar, zziq zziqVar, long j, boolean z10, zziq zziqVar2) {
        this.f42237b = zziqVar;
        this.f42238c = j;
        this.f42239d = z10;
        this.f42240e = zziqVar2;
        this.f42241f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziq zziqVar = this.f42237b;
        e eVar = this.f42241f;
        eVar.E(zziqVar);
        e.G(this.f42241f, zziqVar, this.f42238c, false, this.f42239d);
        C1924v5.a();
        if (((C2523i1) eVar.f3968a).f42218g.B(null, B.f41693r0)) {
            e.H(eVar, zziqVar, this.f42240e);
        }
    }
}
