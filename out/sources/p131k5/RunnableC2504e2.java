package p131k5;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C1917u5;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.internal.measurement.InterfaceC1910t5;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: renamed from: k5.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2504e2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC2589z0 f42156d;

    public /* synthetic */ RunnableC2504e2(AbstractC2589z0 abstractC2589z0, Object obj, int i10) {
        this.f42154b = i10;
        this.f42155c = obj;
        this.f42156d = abstractC2589z0;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        Long lValueOf;
        C2523i1 c2523i1;
        InterfaceC1843k0 interfaceC1843k0;
        switch (this.f42154b) {
            case 0:
                e eVar = (e) this.f42156d;
                Y2 y2S = eVar.s();
                ((InterfaceC1910t5) C1917u5.f25884c.get()).getClass();
                C2523i1 c2523i2 = (C2523i1) y2S.f3968a;
                if (!c2523i2.f42218g.B(null, B.f41704x0)) {
                    y2S.d().f41716k.c("getSessionId has been disabled.");
                } else if (y2S.n().A().i(zziq.zza.ANALYTICS_STORAGE)) {
                    L0 l0N = y2S.n();
                    c2523i2.f42224n.getClass();
                    if (!l0N.u(System.currentTimeMillis()) && y2S.n().f41875r.a() != 0) {
                        lValueOf = Long.valueOf(y2S.n().f41875r.a());
                    }
                    c2523i1 = (C2523i1) eVar.f3968a;
                    interfaceC1843k0 = (InterfaceC1843k0) this.f42155c;
                    if (lValueOf == null) {
                        z3 z3Var = c2523i1.f42222l;
                        C2523i1.e(z3Var);
                        z3Var.L(interfaceC1843k0, lValueOf.longValue());
                    } else {
                        try {
                            interfaceC1843k0.f(null);
                        } catch (RemoteException e10) {
                            B0 b10 = c2523i1.f42220i;
                            C2523i1.g(b10);
                            b10.f41712f.b(e10, "getSessionId failed with exception");
                            return;
                        }
                    }
                } else {
                    y2S.d().f41716k.c("Analytics storage consent denied; will not get session id");
                }
                lValueOf = null;
                c2523i1 = (C2523i1) eVar.f3968a;
                interfaceC1843k0 = (InterfaceC1843k0) this.f42155c;
                if (lValueOf == null) {
                    interfaceC1843k0.f(null);
                } else {
                    z3 z3Var2 = c2523i1.f42222l;
                    C2523i1.e(z3Var2);
                    z3Var2.L(interfaceC1843k0, lValueOf.longValue());
                }
                break;
            default:
                o3 o3Var = (o3) this.f42155c;
                C2587y2 c2587y2 = (C2587y2) this.f42156d;
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.c("Failed to send consent settings to service");
                } else {
                    try {
                        interfaceC2561s0.B(o3Var);
                        c2587y2.I();
                    } catch (RemoteException e11) {
                        c2587y2.d().f41712f.b(e11, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
