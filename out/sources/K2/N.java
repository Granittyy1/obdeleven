package K2;

import U4.C0804l;
import androidx.work.impl.utils.futures.AbstractFuture;
import p131k5.BinderC2535l1;
import p131k5.o3;

/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class N implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4159d;

    public /* synthetic */ N(Object obj, int i10, Object obj2) {
        this.f4157b = i10;
        this.f4159d = obj;
        this.f4158c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4157b) {
            case 0:
                if (!(((P) this.f4159d).f4178r.f20427b instanceof AbstractFuture.b)) {
                    try {
                        ((androidx.work.impl.utils.futures.a) this.f4158c).get();
                        androidx.work.k kVarC = androidx.work.k.c();
                        String str = P.f4162t;
                        String str2 = ((P) this.f4159d).f4166e.f5038c;
                        kVarC.getClass();
                        P p10 = (P) this.f4159d;
                        p10.f4178r.m(p10.f4167f.startWork());
                    } catch (Throwable th) {
                        ((P) this.f4159d).f4178r.l(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this.f4159d;
                binderC2535l1.f42293c.Y();
                com.google.android.gms.measurement.internal.h hVar = binderC2535l1.f42293c;
                hVar.i().p();
                hVar.Z();
                o3 o3Var = (o3) this.f4158c;
                C0804l.e(o3Var.f42332b);
                hVar.k(o3Var);
                break;
        }
    }
}
