package p131k5;

import C4.v;
import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1924v5;

/* JADX INFO: renamed from: k5.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2510f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y2 f42171a;

    public C2510f3(Y2 y10) {
        this.f42171a = y10;
    }

    public final void a() {
        Y2 y10 = this.f42171a;
        y10.p();
        L0 l0N = y10.n();
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        c2523i1.f42224n.getClass();
        if (l0N.u(System.currentTimeMillis())) {
            y10.n().f41870m.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                y10.d().f41719n.c("Detected application was in foreground");
                c2523i1.f42224n.getClass();
                c(System.currentTimeMillis());
            }
        }
    }

    public final void b(long j, boolean z10) {
        Y2 y10 = this.f42171a;
        y10.p();
        y10.w();
        if (y10.n().u(j)) {
            y10.n().f41870m.a(true);
            C1924v5.a();
            C2523i1 c2523i1 = (C2523i1) y10.f3968a;
            if (c2523i1.f42218g.B(null, B.f41693r0)) {
                c2523i1.o().z();
            }
        }
        y10.n().f41874q.b(j);
        if (y10.n().f41870m.b()) {
            c(j);
        }
    }

    public final void c(long j) {
        Y2 y10 = this.f42171a;
        y10.p();
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        if (c2523i1.h()) {
            y10.n().f41874q.b(j);
            c2523i1.f42224n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            B0 b0D = y10.d();
            b0D.f41719n.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            y10.q().y(j, Long.valueOf(j10), "auto", "_sid");
            y10.n().f41875r.b(j10);
            y10.n().f41870m.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            y10.q().w(j, bundle, "auto", "_s");
            String strA = y10.n().f41880w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            y10.q().w(j, v.d("_ffr", strA), "auto", "_ssr");
        }
    }
}
