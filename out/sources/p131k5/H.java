package p131k5;

import com.google.android.gms.internal.measurement.A4;
import com.google.android.gms.internal.measurement.C1792c5;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.C1937x4;
import com.google.android.gms.internal.measurement.InterfaceC1813f5;
import com.google.android.gms.internal.measurement.InterfaceC1923v4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H f41811b = new H(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H f41812c = new H(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H f41813d = new H(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C2507f0 f41814e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41815a;

    public /* synthetic */ H(int i10) {
        this.f41815a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f41815a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).c());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Long.valueOf(((InterfaceC1813f5) C1792c5.f25669c.get()).y());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((A4) C1937x4.f25914c.get()).y());
        }
    }
}
