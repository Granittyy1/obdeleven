package p131k5;

import H2.b;

/* JADX INFO: renamed from: k5.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2485a3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y2 f42084c;

    public RunnableC2485a3(Y2 y10, long j) {
        this.f42083b = j;
        this.f42084c = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2 y10 = this.f42084c;
        y10.p();
        y10.w();
        B0 b0D = y10.d();
        long j = this.f42083b;
        b0D.f41719n.b(Long.valueOf(j), "Activity paused, time");
        b bVar = y10.f42064g;
        Y2 y11 = (Y2) bVar.f3627c;
        ((C2523i1) y11.f3968a).f42224n.getClass();
        RunnableC2495c3 runnableC2495c3 = new RunnableC2495c3(bVar, System.currentTimeMillis(), j);
        bVar.f3626b = runnableC2495c3;
        y11.f42060c.postDelayed(runnableC2495c3, 2000L);
        if (((C2523i1) y10.f3968a).f42218g.E()) {
            y10.f42063f.f42143c.a();
        }
    }
}
