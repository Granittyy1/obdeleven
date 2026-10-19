package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1923v4;
import com.google.android.gms.internal.measurement.K4;
import com.google.android.gms.internal.measurement.N4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ G f41785b = new G(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ G f41786c = new G(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G f41787d = new G(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ G f41788e = new G(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41789a;

    public /* synthetic */ G(int i10) {
        this.f41789a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41789a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).z());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).S());
            case 2:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((N4) K4.f25500c.get()).x());
            default:
                List<C2557r0<?>> list4 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).b());
        }
    }
}
