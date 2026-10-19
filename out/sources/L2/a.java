package L2;

import Q2.z;
import androidx.work.k;
import io.grpc.Status;
import io.grpc.internal.C2251w;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p131k5.B;
import p131k5.C2523i1;

/* JADX INFO: compiled from: DelayedWorkTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4436d;

    public /* synthetic */ a(Object obj, int i10, Object obj2) {
        this.f4434b = i10;
        this.f4436d = obj;
        this.f4435c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4434b) {
            case 0:
                k kVarC = k.c();
                int i10 = b.f4437e;
                z zVar = (z) this.f4435c;
                kVarC.getClass();
                ((b) this.f4436d).f4438a.e(zVar);
                return;
            case 1:
                ((C2251w) this.f4436d).g(Status.f36902h.h(((StringBuilder) this.f4435c).toString()), true);
                return;
            case 2:
                synchronized (((AtomicReference) this.f4435c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.f4435c;
                            C2523i1 c2523i1 = (C2523i1) ((com.google.android.gms.measurement.internal.e) this.f4436d).f3968a;
                            atomicReference.set(Double.valueOf(c2523i1.f42218g.q(c2523i1.o().w(), B.f41635P)));
                            ((AtomicReference) this.f4435c).notify();
                        } catch (Throwable th) {
                            ((AtomicReference) this.f4435c).notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                p191p5.B b10 = (p191p5.B) this.f4435c;
                try {
                    b10.t(((Callable) this.f4436d).call());
                    return;
                } catch (Exception e10) {
                    b10.s(e10);
                    return;
                } catch (Throwable th3) {
                    b10.s(new RuntimeException(th3));
                    return;
                }
        }
    }

    public a(p191p5.B b10, Callable callable) {
        this.f4434b = 3;
        this.f4435c = b10;
        this.f4436d = callable;
    }
}
