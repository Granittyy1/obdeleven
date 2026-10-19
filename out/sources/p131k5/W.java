package p131k5;

import com.google.android.gms.internal.measurement.B5;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.E5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class W implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ W f42027b = new W(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ W f42028c = new W(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ W f42029d = new W(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42030a;

    public /* synthetic */ W(int i10) {
        this.f42030a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42030a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).u());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1798d4) C1805e4.f25694c.get()).M());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((E5) B5.f25405c.get()).x());
        }
    }
}
