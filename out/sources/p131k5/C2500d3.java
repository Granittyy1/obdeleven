package p131k5;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.N4;

/* JADX INFO: renamed from: k5.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2500d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f42141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f42142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2515g3 f42143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y2 f42144d;

    public C2500d3(Y2 y10) {
        this.f42144d = y10;
        this.f42143c = new C2515g3(this, (C2523i1) y10.f3968a);
        ((C2523i1) y10.f3968a).f42224n.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f42141a = jElapsedRealtime;
        this.f42142b = jElapsedRealtime;
    }

    public final boolean a(boolean z10, boolean z11, long j) {
        Y2 y10 = this.f42144d;
        y10.p();
        y10.t();
        ((N4) K4.f25500c.get()).getClass();
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        if (!c2523i1.f42218g.B(null, B.f41683m0) || c2523i1.h()) {
            L0 l0N = y10.n();
            c2523i1.f42224n.getClass();
            l0N.f41874q.b(System.currentTimeMillis());
        }
        long j10 = j - this.f42141a;
        if (!z10 && j10 < 1000) {
            y10.d().f41719n.b(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z11) {
            j10 = j - this.f42142b;
            this.f42142b = j;
        }
        y10.d().f41719n.b(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        z3.T(y10.r().y(!c2523i1.f42218g.E()), bundle, true);
        if (!z11) {
            y10.q().V(bundle, "auto", "_e");
        }
        this.f42141a = j;
        C2515g3 c2515g3 = this.f42143c;
        c2515g3.a();
        c2515g3.b(3600000L);
        return true;
    }
}
