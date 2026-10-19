package p131k5;

import com.google.android.gms.internal.measurement.B4;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class U implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ U f42001b = new U(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ U f42002c = new U(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ U f42003d = new U(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42004a;

    public /* synthetic */ U(int i10) {
        this.f42004a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42004a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).r());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).K());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((B4) C4.f25414c.get()).x());
        }
    }
}
