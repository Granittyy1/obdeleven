package p131k5;

import com.google.android.gms.internal.measurement.B5;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Z implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Z f42065b = new Z(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Z f42066c = new Z(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Z f42067d = new Z(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42068a;

    public /* synthetic */ Z(int i10) {
        this.f42068a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42068a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).H());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).X();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((E5) B5.f25405c.get()).y());
        }
    }
}
