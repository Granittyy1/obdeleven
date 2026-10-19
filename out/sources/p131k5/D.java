package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1862m5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ D f41740b = new D(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ D f41741c = new D(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ D f41742d = new D(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ D f41743e = new D(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41744a;

    public /* synthetic */ D(int i10) {
        this.f41744a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41744a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).a());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).V());
            case 2:
                List<C2557r0<?>> list3 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).L();
            default:
                List<C2557r0<?>> list4 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1862m5) C1834i5.f25773c.get()).z());
        }
    }
}
