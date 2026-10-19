package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1917u5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1910t5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ X f42037b = new X(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ X f42038c = new X(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ X f42039d = new X(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42040a;

    public /* synthetic */ X(int i10) {
        this.f42040a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42040a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).w();
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).P();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1910t5) C1917u5.f25884c.get()).x());
        }
    }
}
