package p131k5;

import com.google.android.gms.internal.measurement.C1812f4;
import com.google.android.gms.internal.measurement.H5;
import com.google.android.gms.internal.measurement.InterfaceC1833i4;
import com.google.android.gms.internal.measurement.K5;
import com.google.android.gms.internal.measurement.Q4;
import com.google.android.gms.internal.measurement.T4;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Y implements InterfaceC2554q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Y f42051b = new Y(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Y f42052c = new Y(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Y f42053d = new Y(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42054a;

    public /* synthetic */ Y(int i10) {
        this.f42054a = i10;
    }

    public static String b(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            String str2 = strArr[i10];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i10];
            }
        }
        return null;
    }

    @Override // p131k5.InterfaceC2554q0
    public Object a() {
        switch (this.f42054a) {
            case 0:
                List<C2557r0<?>> list = B.f41657a;
                return Boolean.valueOf(((K5) H5.f25469c.get()).x());
            case 1:
                List<C2557r0<?>> list2 = B.f41657a;
                return Boolean.valueOf(((InterfaceC1833i4) C1812f4.f25707c.get()).x());
            default:
                List<C2557r0<?>> list3 = B.f41657a;
                return Boolean.valueOf(((T4) Q4.f25565c.get()).x());
        }
    }
}
