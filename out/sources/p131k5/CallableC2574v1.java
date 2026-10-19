package p131k5;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k5.v1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC2574v1 implements Callable<C2525j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f42495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC2535l1 f42496c;

    public CallableC2574v1(BinderC2535l1 binderC2535l1, o3 o3Var) {
        this.f42495b = o3Var;
        this.f42496c = binderC2535l1;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C2525j call() throws Exception {
        BinderC2535l1 binderC2535l1 = this.f42496c;
        binderC2535l1.f42293c.Y();
        return new C2525j(binderC2535l1.f42293c.e(this.f42495b.f42332b));
    }
}
