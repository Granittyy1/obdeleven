package p131k5;

import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.C1889q4;
import com.google.android.gms.internal.measurement.C1924v5;
import com.google.android.gms.internal.measurement.InterfaceC1833i4;
import com.google.android.gms.internal.measurement.InterfaceC1882p4;
import com.google.android.gms.internal.measurement.y5;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J f41835b = new J(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J f41836c = new J(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ J f41837d = new J(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41838a;

    public /* synthetic */ J(int i10) {
        this.f41838a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f41838a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1882p4) C1889q4.f25822c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1833i4) C1812f4.f25707c.get()).y());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((y5) C1924v5.f25898c.get()).y());
        }
    }
}
