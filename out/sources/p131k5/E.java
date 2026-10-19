package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1923v4;
import com.google.android.gms.internal.measurement.O5;
import com.google.android.gms.internal.measurement.R5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ E f41755b = new E(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ E f41756c = new E(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E f41757d = new E(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ E f41758e = new E(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41759a;

    public /* synthetic */ E(int i10) {
        this.f41759a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41759a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).A());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).A());
            case 2:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((R5) O5.f25547c.get()).a());
            default:
                List<C2557r0<?>> list4 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).o());
        }
    }
}
