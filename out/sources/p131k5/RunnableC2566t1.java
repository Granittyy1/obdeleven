package p131k5;

/* JADX INFO: renamed from: k5.t1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2566t1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f42461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42462c;

    public RunnableC2566t1(BinderC2535l1 binderC2535l1, o3 o3Var) {
        this.f42461b = o3Var;
        this.f42462c = binderC2535l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2535l1 binderC2535l1 = this.f42462c;
        binderC2535l1.f42293c.Y();
        binderC2535l1.f42293c.Q(this.f42461b);
    }
}
