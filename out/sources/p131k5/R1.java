package p131k5;

import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f41974c;

    public R1(e eVar, AtomicReference atomicReference) {
        this.f41973b = atomicReference;
        this.f41974c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41973b) {
            try {
                try {
                    AtomicReference atomicReference = this.f41973b;
                    C2523i1 c2523i1 = (C2523i1) this.f41974c.f3968a;
                    C2501e c2501e = c2523i1.f42218g;
                    String strW = c2523i1.o().w();
                    c2501e.getClass();
                    atomicReference.set(Boolean.valueOf(c2501e.B(strW, B.f41627L)));
                    this.f41973b.notify();
                } catch (Throwable th) {
                    this.f41973b.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
