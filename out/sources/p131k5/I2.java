package p131k5;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class I2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41834c;

    public I2(C2587y2 c2587y2, o3 o3Var) {
        this.f41833b = o3Var;
        this.f41834c = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.f41833b;
        C2587y2 c2587y2 = this.f41834c;
        InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
        if (interfaceC2561s0 == null) {
            c2587y2.d().f41712f.c("Failed to send measurementEnabled to service");
            return;
        }
        try {
            interfaceC2561s0.N(o3Var);
            c2587y2.I();
        } catch (RemoteException e10) {
            c2587y2.d().f41712f.b(e10, "Failed to send measurementEnabled to the service");
        }
    }
}
