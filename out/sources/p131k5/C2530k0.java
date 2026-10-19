package p131k5;

import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.InterfaceC1862m5;
import com.google.android.gms.internal.measurement.K5;
import com.google.android.gms.internal.measurement.M5;
import com.google.android.gms.internal.measurement.N5;
import java.util.List;

/* JADX INFO: renamed from: k5.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2530k0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2530k0 f42270b = new C2530k0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2530k0 f42271c = new C2530k0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2530k0 f42272d = new C2530k0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42273a;

    public /* synthetic */ C2530k0(int i10) {
        this.f42273a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42273a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((K5) H5.f25469c.get()).y());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((M5) N5.f25536c.get()).x());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1862m5) C1834i5.f25773c.get()).y());
        }
    }
}
