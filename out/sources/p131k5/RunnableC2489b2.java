package p131k5;

import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2489b2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f42093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f42096e;

    public RunnableC2489b2(e eVar, AtomicReference atomicReference, String str, String str2) {
        this.f42093b = atomicReference;
        this.f42094c = str;
        this.f42095d = str2;
        this.f42096e = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2587y2 c2587y2R = ((C2523i1) this.f42096e.f3968a).r();
        c2587y2R.p();
        c2587y2R.t();
        c2587y2R.w(new L2(c2587y2R, this.f42093b, this.f42094c, this.f42095d, c2587y2R.J(false)));
    }
}
