package p131k5;

import R4.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C1834i5;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2523i1 f41604a;

    public A3(C2523i1 c2523i1) {
        this.f41604a = c2523i1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C2523i1 c2523i1 = this.f41604a;
        if (intent == null) {
            B0 b10 = c2523i1.f42220i;
            C2523i1.g(b10);
            b10.f41715i.c("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            B0 b11 = c2523i1.f42220i;
            C2523i1.g(b11);
            b11.f41715i.c("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            B0 b12 = c2523i1.f42220i;
            C2523i1.g(b12);
            b12.f41715i.c("App receiver called with unknown action");
            return;
        }
        C1834i5.a();
        if (c2523i1.f42218g.B(null, B.f41616F0)) {
            B0 b13 = c2523i1.f42220i;
            C2523i1.g(b13);
            b13.f41719n.c("App receiver notified triggers are available");
            C2493c1 c2493c1 = c2523i1.j;
            C2523i1.g(c2493c1);
            q qVar = new q();
            qVar.f5299c = c2523i1;
            c2493c1.z(qVar);
        }
    }
}
