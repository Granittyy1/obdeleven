package p131k5;

import android.os.Looper;
import com.google.android.gms.internal.measurement.C1805e4;
import com.google.android.gms.internal.measurement.C1827h5;
import com.google.android.gms.internal.measurement.C1834i5;
import com.google.android.gms.internal.measurement.InterfaceC1798d4;
import com.google.android.gms.internal.measurement.InterfaceC1820g5;
import com.google.android.gms.internal.measurement.InterfaceC1862m5;
import java.util.List;

/* JADX INFO: renamed from: k5.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2507f0 implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2507f0 f42158b = new C2507f0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2507f0 f42159c = new C2507f0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C2507f0 f42160d = new C2507f0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42161a;

    public /* synthetic */ C2507f0(int i10) {
        this.f42161a = i10;
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f42161a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Long.valueOf(((InterfaceC1798d4) C1805e4.f25694c.get()).C());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1820g5) C1827h5.f25768c.get()).a());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1862m5) C1834i5.f25773c.get()).A());
        }
    }
}
