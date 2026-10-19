package K2;

import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class M implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4156d;

    public /* synthetic */ M(Object obj, int i10, Object obj2) {
        this.f4154b = i10;
        this.f4155c = obj;
        this.f4156d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4154b) {
            case 0:
                P p10 = (P) this.f4155c;
                androidx.work.impl.utils.futures.a aVar = (androidx.work.impl.utils.futures.a) this.f4156d;
                if (p10.f4178r.f20427b instanceof AbstractFuture.b) {
                    aVar.cancel(true);
                    return;
                }
                return;
            case 1:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f4155c;
                p107i6.f<? extends androidx.work.j.a> fVar = (p107i6.f) this.f4156d;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                synchronized (this$0.f20453c) {
                    try {
                        if (this$0.f20454d) {
                            androidx.work.impl.utils.futures.a<androidx.work.j.a> future = this$0.f20455e;
                            kotlin.jvm.internal.i.d(future, "future");
                            String str = T2.a.f5798a;
                            future.k(new androidx.work.j.a.b());
                        } else {
                            this$0.f20455e.m(fVar);
                        }
                        p293xa.r rVar = p293xa.r.f47939a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                Callable callable = (Callable) this.f4155c;
                p240t6.i iVar = p240t6.i.this;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e10) {
                    iVar.l(e10);
                    return;
                }
        }
    }
}
