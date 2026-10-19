package p131k5;

/* JADX INFO: renamed from: k5.z1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2590z1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v3 f42547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f42548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42549d;

    public RunnableC2590z1(BinderC2535l1 binderC2535l1, v3 v3Var, o3 o3Var) {
        this.f42547b = v3Var;
        this.f42548c = o3Var;
        this.f42549d = binderC2535l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2535l1 binderC2535l1 = this.f42549d;
        binderC2535l1.f42293c.Y();
        v3 v3Var = this.f42547b;
        Object objA = v3Var.a();
        o3 o3Var = this.f42548c;
        if (objA == null) {
            binderC2535l1.f42293c.s(v3Var.f42503c, o3Var);
        } else {
            binderC2535l1.f42293c.z(v3Var, o3Var);
        }
    }
}
