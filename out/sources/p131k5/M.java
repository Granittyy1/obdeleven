package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.y5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ M f41891b = new M(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ M f41892c = new M(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ M f41893d = new M(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41894a;

    public /* synthetic */ M(int i10) {
        this.f41894a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41894a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).O());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).d());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((y5) C1924v5.f25898c.get()).x());
        }
    }
}
