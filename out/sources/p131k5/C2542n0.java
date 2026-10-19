package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1876o5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1869n5;
import java.util.List;

/* JADX INFO: renamed from: k5.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2542n0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2542n0 f42305b = new C2542n0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2542n0 f42306c = new C2542n0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42307a;

    public /* synthetic */ C2542n0(int i10) {
        this.f42307a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42307a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).c());
            default:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1869n5) C1876o5.f25809c.get()).x());
        }
    }
}
