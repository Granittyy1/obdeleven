package p131k5;

import com.google.android.gms.internal.measurement.A5;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1854l4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1875o4;
import com.google.android.gms.internal.measurement.z5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C f41723b = new C(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C f41724c = new C(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C f41725d = new C(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41726a;

    public /* synthetic */ C(int i10) {
        this.f41726a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41726a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1875o4) C1854l4.f25786c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).m());
            default:
                return Boolean.valueOf(((z5) A5.f25397c.get()).a());
        }
    }
}
