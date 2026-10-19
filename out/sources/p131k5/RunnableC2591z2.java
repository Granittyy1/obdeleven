package p131k5;

import com.android.billingclient.api.a;
import com.android.billingclient.api.b;
import com.google.android.gms.internal.play_billing.zzie;
import p237t3.C2789b;
import p237t3.r;

/* JADX INFO: renamed from: k5.z2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2591z2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42551c;

    public /* synthetic */ RunnableC2591z2(int i10, Object obj) {
        this.f42550b = i10;
        this.f42551c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42550b) {
            case 0:
                ((C2567t2) this.f42551c).j = null;
                break;
            default:
                r rVar = (r) this.f42551c;
                C2789b c2789b = rVar.f47242f;
                c2789b.l(0);
                zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                a aVar = b.f23566i;
                c2789b.k(rVar.f47241e, aVar, zzieVar);
                rVar.c(aVar);
                break;
        }
    }
}
