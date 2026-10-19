package p131k5;

import B6.a;
import Q8.d;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C1792c5;
import com.google.android.gms.internal.measurement.C1895r4;
import com.google.android.gms.internal.measurement.F5;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.InterfaceC1813f5;
import com.google.android.gms.internal.measurement.InterfaceC1916u4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ N f41905b = new N(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ N f41906c = new N(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ N f41907d = new N(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41908a;

    public /* synthetic */ N(int i10) {
        this.f41908a = i10;
    }

    public static Object b(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(d.a(a.c("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    public static void c(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f41908a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1916u4) C1895r4.f25830c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Double.valueOf(((InterfaceC1813f5) C1792c5.f25669c.get()).a());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((F5) G5.f25460c.get()).b());
        }
    }
}
