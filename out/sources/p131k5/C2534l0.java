package p131k5;

import com.google.android.gms.internal.measurement.C1785b5;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.InterfaceC1778a5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1862m5;
import java.util.List;

/* JADX INFO: renamed from: k5.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2534l0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2534l0 f42289b = new C2534l0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2534l0 f42290c = new C2534l0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2534l0 f42291d = new C2534l0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42292a;

    public /* synthetic */ C2534l0(int i10) {
        this.f42292a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42292a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).j());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1778a5) C1785b5.f25665c.get()).a());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1862m5) C1834i5.f25773c.get()).b());
        }
    }
}
