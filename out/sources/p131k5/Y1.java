package p131k5;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2589z0 f42059d;

    public /* synthetic */ Y1(AbstractC2589z0 abstractC2589z0, Object obj, int i10) {
        this.f42057b = i10;
        this.f42058c = obj;
        this.f42059d = abstractC2589z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42057b) {
            case 0:
                synchronized (((AtomicReference) this.f42058c)) {
                    try {
                        try {
                            AtomicReference atomicReference = (AtomicReference) this.f42058c;
                            C2523i1 c2523i1 = (C2523i1) ((e) this.f42059d).f3968a;
                            C2501e c2501e = c2523i1.f42218g;
                            String strW = c2523i1.o().w();
                            c2501e.getClass();
                            atomicReference.set(c2501e.w(strW, B.f41629M));
                            ((AtomicReference) this.f42058c).notify();
                        } catch (Throwable th) {
                            ((AtomicReference) this.f42058c).notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                C2587y2 c2587y2 = (C2587y2) this.f42059d;
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.c("Failed to send current screen to service");
                    return;
                }
                try {
                    C2559r2 c2559r2 = (C2559r2) this.f42058c;
                    if (c2559r2 == null) {
                        interfaceC2561s0.l(null, null, 0L, ((C2523i1) c2587y2.f3968a).f42212a.getPackageName());
                    } else {
                        interfaceC2561s0.l(c2559r2.f42435a, c2559r2.f42436b, c2559r2.f42437c, ((C2523i1) c2587y2.f3968a).f42212a.getPackageName());
                    }
                    c2587y2.I();
                    return;
                } catch (RemoteException e10) {
                    c2587y2.d().f41712f.b(e10, "Failed to send current screen to the service");
                    return;
                }
        }
    }
}
