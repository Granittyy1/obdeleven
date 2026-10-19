package p131k5;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ e f41899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ AtomicReference f41900c;

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f41899b;
        Bundle bundleA = eVar.n().f41872o.a();
        C2587y2 c2587y2R = ((C2523i1) eVar.f3968a).r();
        if (bundleA == null) {
            bundleA = new Bundle();
        }
        c2587y2R.p();
        c2587y2R.t();
        c2587y2R.w(new C2(c2587y2R, this.f41900c, c2587y2R.J(false), bundleA));
    }
}
