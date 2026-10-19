package p131k5;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class G2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41806c;

    public G2(C2587y2 c2587y2, o3 o3Var) {
        this.f41805b = o3Var;
        this.f41806c = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        o3 o3Var = this.f41805b;
        C2587y2 c2587y2 = this.f41806c;
        InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
        if (interfaceC2561s0 == null) {
            c2587y2.d().f41712f.c("Discarding data. Failed to send app launch");
            return;
        }
        try {
            interfaceC2561s0.k(o3Var);
            ((C2523i1) c2587y2.f3968a).p().A();
            c2587y2.A(interfaceC2561s0, null, o3Var);
            c2587y2.I();
        } catch (RemoteException e10) {
            c2587y2.d().f41712f.b(e10, "Failed to send app launch to the service");
        }
    }
}
