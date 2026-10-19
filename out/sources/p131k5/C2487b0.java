package p131k5;

import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.H4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import java.util.List;

/* JADX INFO: renamed from: k5.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2487b0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2487b0 f42087b = new C2487b0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2487b0 f42088c = new C2487b0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2487b0 f42089d = new C2487b0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42090a;

    public /* synthetic */ C2487b0(int i10) {
        this.f42090a = i10;
    }

    @Override // p131k5.InterfaceC2554q0
    public final Object a() {
        switch (this.f42090a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).l());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return ((InterfaceC1798d4) C1805e4.f25694c.get()).t();
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((H4) I4.f25475c.get()).x());
        }
    }
}
