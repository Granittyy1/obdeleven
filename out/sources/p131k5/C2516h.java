package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1883p5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1903s5;
import java.util.List;

/* JADX INFO: renamed from: k5.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2516h implements InterfaceC2511g, InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2516h f42184b = new C2516h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2516h f42185c = new C2516h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2516h f42186d = new C2516h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C2516h f42187e = new C2516h(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42188a;

    public /* synthetic */ C2516h(int i10) {
        this.f42188a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f42188a) {
            case 1:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).q());
            case 2:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).J();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1903s5) C1883p5.f25812c.get()).x());
        }
    }

    @Override // p131k5.InterfaceC2511g
    public String c(String str, String str2) {
        return null;
    }
}
