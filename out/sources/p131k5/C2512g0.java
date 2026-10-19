package p131k5;

import com.google.android.gms.internal.measurement.B4;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.C4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1862m5;
import java.util.List;

/* JADX INFO: renamed from: k5.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2512g0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2512g0 f42172b = new C2512g0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2512g0 f42173c = new C2512g0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2512g0 f42174d = new C2512g0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42175a;

    public /* synthetic */ C2512g0(int i10) {
        this.f42175a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42175a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).Y());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((B4) C4.f25414c.get()).a());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1862m5) C1834i5.f25773c.get()).x());
        }
    }
}
