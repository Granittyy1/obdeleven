package p131k5;

import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.C1792c5;
import com.google.android.gms.internal.measurement.C1937x4;
import com.google.android.gms.internal.measurement.InterfaceC1813f5;
import com.google.android.gms.internal.measurement.O4;
import com.google.android.gms.internal.measurement.P4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ I f41819b = new I(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ I f41820c = new I(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ I f41821d = new I(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41822a;

    public /* synthetic */ I(int i10) {
        this.f41822a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41822a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((O4) P4.f25552c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1813f5) C1792c5.f25669c.get()).b();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((A4) C1937x4.f25914c.get()).x());
        }
    }
}
