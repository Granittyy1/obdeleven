package p131k5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.internal.measurement.V;
import com.google.android.gms.internal.measurement.W;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class R0 implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f41972c;

    public R0(S0 s10, String str) {
        this.f41972c = s10;
        this.f41971b = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        S0 s10 = this.f41972c;
        if (iBinder == null) {
            B0 b10 = s10.f41980a.f42220i;
            C2523i1.g(b10);
            b10.f41715i.c("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = W.f25621c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            U v10 = iInterfaceQueryLocalInterface instanceof U ? (U) iInterfaceQueryLocalInterface : new V(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (v10 == null) {
                B0 b11 = s10.f41980a.f42220i;
                C2523i1.g(b11);
                b11.f41715i.c("Install Referrer Service implementation was not found");
            } else {
                B0 b12 = s10.f41980a.f42220i;
                C2523i1.g(b12);
                b12.f41719n.c("Install Referrer Service connected");
                C2493c1 c2493c1 = s10.f41980a.j;
                C2523i1.g(c2493c1);
                c2493c1.z(new T0(this, v10, this));
            }
        } catch (RuntimeException e10) {
            B0 b13 = s10.f41980a.f42220i;
            C2523i1.g(b13);
            b13.f41715i.b(e10, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        B0 b10 = this.f41972c.f41980a.f42220i;
        C2523i1.g(b10);
        b10.f41719n.c("Install Referrer Service disconnected");
    }
}
