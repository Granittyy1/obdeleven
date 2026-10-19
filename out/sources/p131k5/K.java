package p131k5;

import com.google.android.gms.internal.measurement.B4;
import com.google.android.gms.internal.measurement.C1792c5;
import com.google.android.gms.internal.measurement.C4;
import com.google.android.gms.internal.measurement.InterfaceC1813f5;
import com.google.android.gms.internal.measurement.U4;
import com.google.android.gms.internal.measurement.V4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class K implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ K f41845b = new K(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ K f41846c = new K(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ K f41847d = new K(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41848a;

    public /* synthetic */ K(int i10) {
        this.f41848a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41848a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((U4) V4.f25618c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1813f5) C1792c5.f25669c.get()).x());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((B4) C4.f25414c.get()).y());
        }
    }
}
