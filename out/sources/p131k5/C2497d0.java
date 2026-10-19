package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.W4;
import com.google.android.gms.internal.measurement.Z4;
import java.util.List;

/* JADX INFO: renamed from: k5.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2497d0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2497d0 f42133b = new C2497d0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2497d0 f42134c = new C2497d0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2497d0 f42135d = new C2497d0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42136a;

    public /* synthetic */ C2497d0(int i10) {
        this.f42136a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42136a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).n());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).D();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((Z4) W4.f25626c.get()).y());
        }
    }
}
