package p131k5;

import U4.AbstractC0794b;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: k5.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2585y0 extends AbstractC0794b<InterfaceC2561s0> {
    @Override // U4.AbstractC0794b
    public final String B() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // U4.AbstractC0794b
    public final String C() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // U4.AbstractC0794b, com.google.android.gms.common.api.a.e
    public final int n() {
        return 12451000;
    }

    @Override // U4.AbstractC0794b
    public final /* synthetic */ IInterface v(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2561s0 ? (InterfaceC2561s0) iInterfaceQueryLocalInterface : new C2565t0(iBinder);
    }
}
