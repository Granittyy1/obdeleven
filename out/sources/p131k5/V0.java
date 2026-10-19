package p131k5;

import androidx.compose.ui.input.pointer.s;
import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import com.google.android.gms.internal.play_billing.C1986m;
import com.google.android.gms.internal.play_billing.C1998q;
import com.google.android.gms.internal.play_billing.U;
import com.google.android.gms.internal.play_billing.Y;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p237t3.B;
import p237t3.y;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f42017d;

    public V0(U u10, y yVar) {
        this.f42015b = 2;
        this.f42016c = u10;
        this.f42017d = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thC;
        switch (this.f42015b) {
            case 0:
                C2587y2 c2587y2R = ((AppMeasurementDynamiteService) this.f42017d).f26535c.r();
                c2587y2R.p();
                c2587y2R.t();
                c2587y2R.w(new E2(c2587y2R, c2587y2R.J(false), (InterfaceC1843k0) this.f42016c));
                return;
            case 1:
                AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.f42017d;
                z3 z3Var = appMeasurementDynamiteService.f26535c.f42222l;
                C2523i1.e(z3Var);
                C2523i1 c2523i1 = appMeasurementDynamiteService.f26535c;
                z3Var.O((InterfaceC1843k0) this.f42016c, c2523i1.f42204A != null && c2523i1.f42204A.booleanValue());
                return;
            default:
                U u10 = (U) this.f42016c;
                boolean z10 = u10 instanceof Y;
                y yVar = (y) this.f42017d;
                if (z10 && (thC = ((Y) u10).c()) != null) {
                    yVar.a(thC);
                    return;
                }
                try {
                    if (!u10.isDone()) {
                        throw new IllegalStateException(C1998q.a("Future was expected to be done: %s", u10));
                    }
                    boolean z11 = false;
                    Future future = u10;
                    while (true) {
                        try {
                            Object obj = future.get();
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            if (num.intValue() <= 0) {
                                yVar.f47258b.run();
                                return;
                            }
                            int iIntValue = num.intValue();
                            B b10 = yVar.f47259c;
                            b10.getClass();
                            a aVarA = b.a(iIntValue, "Billing override value was set by a license tester.");
                            b10.F(yVar.f47260d, aVarA, zzie.LICENSE_TESTER_BILLING_OVERRIDE);
                            yVar.f47257a.a(aVarA);
                            return;
                        } catch (InterruptedException unused) {
                            z11 = true;
                            future = future;
                        } catch (Throwable th) {
                            if (z11) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e10) {
                    yVar.a(e10.getCause());
                    return;
                } catch (Throwable th2) {
                    yVar.a(th2);
                    return;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f42015b) {
            case 2:
                C1986m c1986m = new C1986m(V0.class.getSimpleName());
                s sVar = new s();
                c1986m.f26215c.f14119b = sVar;
                c1986m.f26215c = sVar;
                sVar.f14118a = (y) this.f42017d;
                return c1986m.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ V0(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC1843k0 interfaceC1843k0, int i10) {
        this.f42015b = i10;
        this.f42016c = interfaceC1843k0;
        this.f42017d = appMeasurementDynamiteService;
    }
}
