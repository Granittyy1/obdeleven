package p131k5;

/* JADX INFO: renamed from: k5.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2579w2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2559r2 f42516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f42517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2567t2 f42518d;

    public RunnableC2579w2(C2567t2 c2567t2, C2559r2 c2559r2, long j) {
        this.f42516b = c2559r2;
        this.f42517c = j;
        this.f42518d = c2567t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2567t2 c2567t2 = this.f42518d;
        c2567t2.C(this.f42516b, false, this.f42517c);
        c2567t2.f42465e = null;
        C2587y2 c2587y2R = ((C2523i1) c2567t2.f3968a).r();
        c2587y2R.p();
        c2587y2R.t();
        c2587y2R.w(new Y1(c2587y2R, null, 1));
    }
}
