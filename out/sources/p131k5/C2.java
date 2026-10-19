package p131k5;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f41732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f41733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41734e;

    public C2(C2587y2 c2587y2, AtomicReference atomicReference, o3 o3Var, Bundle bundle) {
        this.f41731b = atomicReference;
        this.f41732c = o3Var;
        this.f41733d = bundle;
        this.f41734e = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41731b) {
            try {
                try {
                    C2587y2 c2587y2 = this.f41734e;
                    InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                    if (interfaceC2561s0 == null) {
                        c2587y2.d().f41712f.c("Failed to get trigger URIs; not connected to service");
                        this.f41731b.notify();
                    } else {
                        this.f41731b.set(interfaceC2561s0.d(this.f41733d, this.f41732c));
                        this.f41734e.I();
                        this.f41731b.notify();
                    }
                } catch (RemoteException e10) {
                    this.f41734e.d().f41712f.b(e10, "Failed to get trigger URIs; remote exception");
                    this.f41731b.notify();
                }
            } catch (Throwable th) {
                this.f41731b.notify();
                throw th;
            }
        }
    }
}
