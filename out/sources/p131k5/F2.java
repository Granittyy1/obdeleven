package p131k5;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zziq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class F2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f41781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41782d;

    public F2(C2587y2 c2587y2, AtomicReference atomicReference, o3 o3Var) {
        this.f41780b = atomicReference;
        this.f41781c = o3Var;
        this.f41782d = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41780b) {
            try {
                try {
                    if (!this.f41782d.n().A().i(zziq.zza.ANALYTICS_STORAGE)) {
                        this.f41782d.d().f41716k.c("Analytics storage consent denied; will not get app instance id");
                        this.f41782d.q().J(null);
                        this.f41782d.n().f41866h.b(null);
                        this.f41780b.set(null);
                        this.f41780b.notify();
                        return;
                    }
                    C2587y2 c2587y2 = this.f41782d;
                    InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                    if (interfaceC2561s0 == null) {
                        c2587y2.d().f41712f.c("Failed to get app instance id");
                        this.f41780b.notify();
                        return;
                    }
                    this.f41780b.set(interfaceC2561s0.p(this.f41781c));
                    String str = (String) this.f41780b.get();
                    if (str != null) {
                        this.f41782d.q().J(str);
                        this.f41782d.n().f41866h.b(str);
                    }
                    this.f41782d.I();
                    this.f41780b.notify();
                } catch (RemoteException e10) {
                    this.f41782d.d().f41712f.b(e10, "Failed to get app instance id");
                    this.f41780b.notify();
                }
            } catch (Throwable th) {
                this.f41780b.notify();
                throw th;
            }
        }
    }
}
