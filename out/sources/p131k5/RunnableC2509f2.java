package p131k5;

import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.f2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2509f2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f42166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f42168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f42170f;

    public RunnableC2509f2(e eVar, AtomicReference atomicReference, String str, String str2, boolean z10) {
        this.f42166b = atomicReference;
        this.f42167c = str;
        this.f42168d = str2;
        this.f42169e = z10;
        this.f42170f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2587y2 c2587y2R = ((C2523i1) this.f42170f.f3968a).r();
        c2587y2R.p();
        c2587y2R.t();
        o3 o3VarJ = c2587y2R.J(false);
        c2587y2R.w(new N2(c2587y2R, this.f42166b, this.f42167c, this.f42168d, o3VarJ, this.f42169e));
    }
}
