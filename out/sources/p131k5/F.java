package p131k5;

import coil.intercept.a;
import com.google.android.gms.internal.measurement.C1792c5;
import com.google.android.gms.internal.measurement.C1847k4;
import com.google.android.gms.internal.measurement.C1930w4;
import com.google.android.gms.internal.measurement.InterfaceC1813f5;
import com.google.android.gms.internal.measurement.InterfaceC1840j4;
import com.google.android.gms.internal.measurement.InterfaceC1923v4;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class F implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ F f41771b = new F(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ F f41772c = new F(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ F f41773d = new F(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ F f41774e = new F(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41775a;

    public /* synthetic */ F(int i10) {
        this.f41775a = i10;
    }

    public static /* synthetic */ Set b(Object[] objArr) {
        HashSet hashSet = new HashSet(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(a.a(obj, "duplicate element: "));
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f41775a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).y());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1813f5) C1792c5.f25669c.get()).z());
            case 2:
                List<C2557r0<?>> list3 = B.f41657a;
                return Integer.valueOf((int) ((InterfaceC1840j4) C1847k4.f25780c.get()).a());
            default:
                List<C2557r0<?>> list4 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1923v4) C1930w4.f25904c.get()).x());
        }
    }
}
