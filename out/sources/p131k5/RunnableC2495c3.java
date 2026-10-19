package p131k5;

import H2.b;

/* JADX INFO: renamed from: k5.c3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2495c3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f42122d;

    public RunnableC2495c3(b bVar, long j, long j10) {
        this.f42122d = bVar;
        this.f42120b = j;
        this.f42121c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2493c1 c2493c1I = ((Y2) this.f42122d.f3627c).i();
        RunnableC2505e3 runnableC2505e3 = new RunnableC2505e3();
        runnableC2505e3.f42157b = this;
        c2493c1I.z(runnableC2505e3);
    }
}
