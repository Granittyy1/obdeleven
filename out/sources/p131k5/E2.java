package p131k5;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class E2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f41760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f41761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41762d;

    public E2(C2587y2 c2587y2, o3 o3Var, InterfaceC1843k0 interfaceC1843k0) {
        this.f41760b = o3Var;
        this.f41761c = interfaceC1843k0;
        this.f41762d = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.f41760b;
        InterfaceC1843k0 interfaceC1843k0 = this.f41761c;
        C2587y2 c2587y2 = this.f41762d;
        try {
            try {
                if (!c2587y2.n().A().i(zziq.zza.ANALYTICS_STORAGE)) {
                    c2587y2.d().f41716k.c("Analytics storage consent denied; will not get app instance id");
                    c2587y2.q().J(null);
                    c2587y2.n().f41866h.b(null);
                    c2587y2.o().Q(null, interfaceC1843k0);
                    return;
                }
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.c("Failed to get app instance id");
                    c2587y2.o().Q(null, interfaceC1843k0);
                    return;
                }
                String strP = interfaceC2561s0.p(o3Var);
                if (strP != null) {
                    c2587y2.q().J(strP);
                    c2587y2.n().f41866h.b(strP);
                }
                c2587y2.I();
                c2587y2.o().Q(strP, interfaceC1843k0);
            } catch (RemoteException e10) {
                c2587y2.d().f41712f.b(e10, "Failed to get app instance id");
                c2587y2.o().Q(null, interfaceC1843k0);
            }
        } catch (Throwable th) {
            c2587y2.o().Q(null, interfaceC1843k0);
            throw th;
        }
    }
}
