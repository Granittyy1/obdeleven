package p131k5;

/* JADX INFO: renamed from: k5.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2543n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2496d f42308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f42309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42310d;

    public RunnableC2543n1(BinderC2535l1 binderC2535l1, C2496d c2496d, o3 o3Var) {
        this.f42308b = c2496d;
        this.f42309c = o3Var;
        this.f42310d = binderC2535l1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BinderC2535l1 binderC2535l1 = this.f42310d;
        binderC2535l1.f42293c.Y();
        C2496d c2496d = this.f42308b;
        Object objA = c2496d.f42125d.a();
        o3 o3Var = this.f42309c;
        if (objA == null) {
            binderC2535l1.f42293c.t(c2496d, o3Var);
        } else {
            binderC2535l1.f42293c.I(c2496d, o3Var);
        }
    }
}
