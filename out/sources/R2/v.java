package R2;

import K2.P;
import Q2.C0738o;
import java.util.Set;

/* JADX INFO: compiled from: StopWorkRunnable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K2.r f5243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K2.x f5244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5246e;

    public v(K2.r processor, K2.x token, boolean z10, int i10) {
        kotlin.jvm.internal.i.e(processor, "processor");
        kotlin.jvm.internal.i.e(token, "token");
        this.f5243b = processor;
        this.f5244c = token;
        this.f5245d = z10;
        this.f5246e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P pB;
        if (this.f5245d) {
            K2.r rVar = this.f5243b;
            K2.x xVar = this.f5244c;
            int i10 = this.f5246e;
            rVar.getClass();
            String str = xVar.f4233a.f5025a;
            synchronized (rVar.f4221k) {
                pB = rVar.b(str);
            }
            K2.r.d(pB, i10);
        } else {
            K2.r rVar2 = this.f5243b;
            K2.x xVar2 = this.f5244c;
            int i11 = this.f5246e;
            rVar2.getClass();
            String str2 = xVar2.f4233a.f5025a;
            synchronized (rVar2.f4221k) {
                try {
                    if (rVar2.f4217f.get(str2) != null) {
                        androidx.work.k.c().getClass();
                    } else {
                        Set set = (Set) rVar2.f4219h.get(str2);
                        if (set != null && set.contains(xVar2)) {
                            K2.r.d(rVar2.b(str2), i11);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        androidx.work.k kVarC = androidx.work.k.c();
        androidx.work.k.d("StopWorkRunnable");
        C0738o c0738o = this.f5244c.f4233a;
        kVarC.getClass();
    }
}
