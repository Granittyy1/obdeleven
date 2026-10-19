package p131k5;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.zziq;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41992d;

    public /* synthetic */ T0(Object obj, int i10, Object obj2) {
        this.f41990b = i10;
        this.f41991c = obj2;
        this.f41992d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41990b) {
            case 0:
                R0 r10 = (R0) this.f41992d;
                S0 s10 = r10.f41972c;
                C2523i1 c2523i1 = s10.f41980a;
                C2493c1 c2493c1 = c2523i1.j;
                C2523i1.g(c2493c1);
                c2493c1.p();
                U u10 = (U) this.f41991c;
                B0 b10 = c2523i1.f42220i;
                Bundle bundle = new Bundle();
                bundle.putString("package_name", r10.f41971b);
                try {
                    if (u10.f(bundle) == null) {
                        C2523i1.g(b10);
                        b10.f41712f.c("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e10) {
                    C2523i1.g(b10);
                    b10.f41712f.b(e10.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C2493c1 c2493c2 = s10.f41980a.j;
                C2523i1.g(c2493c2);
                c2493c2.p();
                throw new IllegalStateException("Unexpected call on client side");
            case 1:
                e eVar = (e) this.f41992d;
                L0 l0N = eVar.n();
                l0N.p();
                l0N.p();
                b bVarB = b.b(l0N.y().getString("dma_consent_settings", null));
                b bVar = (b) this.f41991c;
                int i10 = bVarB.f26543a;
                int i11 = bVar.f26543a;
                if (!zziq.h(i11, i10)) {
                    B0 b0D = eVar.d();
                    b0D.f41717l.b(Integer.valueOf(i11), "Lower precedence consent source ignored, proposed source");
                    return;
                } else {
                    SharedPreferences.Editor editorEdit = l0N.y().edit();
                    editorEdit.putString("dma_consent_settings", bVar.f26544b);
                    editorEdit.apply();
                    ((C2523i1) eVar.f3968a).r().B(false);
                    return;
                }
            default:
                synchronized (((P2) this.f41992d)) {
                    try {
                        ((P2) this.f41992d).f41956b = false;
                        if (!((P2) this.f41992d).f41958d.E()) {
                            ((P2) this.f41992d).f41958d.d().f41718m.c("Connected to remote service");
                            C2587y2 c2587y2 = ((P2) this.f41992d).f41958d;
                            InterfaceC2561s0 interfaceC2561s0 = (InterfaceC2561s0) this.f41991c;
                            c2587y2.p();
                            c2587y2.f42536d = interfaceC2561s0;
                            c2587y2.I();
                            c2587y2.H();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public T0(R0 r10, U u10, R0 r11) {
        this.f41990b = 0;
        this.f41991c = u10;
        this.f41992d = r10;
    }
}
