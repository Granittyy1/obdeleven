package p131k5;

import H2.b;
import android.os.Bundle;
import com.braze.Constants;
import com.google.android.gms.internal.measurement.C1883p5;
import com.google.android.gms.internal.measurement.InterfaceC1903s5;

/* JADX INFO: renamed from: k5.e3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC2505e3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ RunnableC2495c3 f42157b;

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC2495c3 runnableC2495c3 = this.f42157b;
        b bVar = runnableC2495c3.f42122d;
        ((Y2) bVar.f3627c).p();
        Y2 y10 = (Y2) bVar.f3627c;
        y10.d().f41718m.c("Application going to the background");
        y10.n().f41877t.a(true);
        y10.p();
        y10.f42061d = true;
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        if (!c2523i1.f42218g.E()) {
            long j = runnableC2495c3.f42121c;
            C2500d3 c2500d3 = y10.f42063f;
            c2500d3.f42143c.a();
            c2500d3.a(false, false, j);
        }
        ((InterfaceC1903s5) C1883p5.f25812c.get()).getClass();
        long j10 = runnableC2495c3.f42120b;
        if (!c2523i1.f42218g.B(null, B.f41612D0)) {
            y10.q().w(j10, new Bundle(), "auto", Constants.BRAZE_PUSH_BRAZE_KEY);
            return;
        }
        B0 b0D = y10.d();
        b0D.f41717l.b(Long.valueOf(j10), "Application backgrounded at: timestamp_millis");
    }
}
