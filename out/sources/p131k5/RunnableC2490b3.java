package p131k5;

import H2.b;

/* JADX INFO: renamed from: k5.b3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2490b3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y2 f42098c;

    public RunnableC2490b3(Y2 y10, long j) {
        this.f42097b = j;
        this.f42098c = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2 y10 = this.f42098c;
        y10.p();
        y10.w();
        B0 b0D = y10.d();
        long j = this.f42097b;
        b0D.f41719n.b(Long.valueOf(j), "Activity resumed, time");
        C2523i1 c2523i1 = (C2523i1) y10.f3968a;
        boolean zB = c2523i1.f42218g.B(null, B.f41626K0);
        C2501e c2501e = c2523i1.f42218g;
        C2500d3 c2500d3 = y10.f42063f;
        if (zB) {
            if (c2501e.E() || y10.f42061d) {
                c2500d3.f42144d.p();
                c2500d3.f42143c.a();
                c2500d3.f42141a = j;
                c2500d3.f42142b = j;
            }
        } else if (c2501e.E() || y10.n().f41877t.b()) {
            c2500d3.f42144d.p();
            c2500d3.f42143c.a();
            c2500d3.f42141a = j;
            c2500d3.f42142b = j;
        }
        b bVar = y10.f42064g;
        Y2 y11 = (Y2) bVar.f3627c;
        y11.p();
        RunnableC2495c3 runnableC2495c3 = (RunnableC2495c3) bVar.f3626b;
        if (runnableC2495c3 != null) {
            y11.f42060c.removeCallbacks(runnableC2495c3);
        }
        y11.n().f41877t.a(false);
        y11.p();
        y11.f42061d = false;
        C2510f3 c2510f3 = y10.f42062e;
        c2510f3.f42171a.p();
        Y2 y12 = c2510f3.f42171a;
        if (((C2523i1) y12.f3968a).h()) {
            ((C2523i1) y12.f3968a).f42224n.getClass();
            c2510f3.b(System.currentTimeMillis(), false);
        }
    }
}
