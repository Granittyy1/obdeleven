package p078g1;

import B6.a;
import java.util.Arrays;
import p114j1.A;
import p114j1.k;
import p241t7.b;

/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n[] f35494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35495e;

    static {
        A.B(0);
        A.B(1);
    }

    public y(String str, n... nVarArr) {
        b.e(nVarArr.length > 0);
        this.f35492b = str;
        this.f35494d = nVarArr;
        this.f35491a = nVarArr.length;
        int iH = t.h(nVarArr[0].f35302n);
        this.f35493c = iH == -1 ? t.h(nVarArr[0].f35301m) : iH;
        String str2 = nVarArr[0].f35293d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = nVarArr[0].f35295f | 16384;
        for (int i11 = 1; i11 < nVarArr.length; i11++) {
            String str3 = nVarArr[i11].f35293d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a("languages", i11, nVarArr[0].f35293d, nVarArr[i11].f35293d);
                return;
            } else {
                if (i10 != (nVarArr[i11].f35295f | 16384)) {
                    a("role flags", i11, Integer.toBinaryString(nVarArr[0].f35295f), Integer.toBinaryString(nVarArr[i11].f35295f));
                    return;
                }
            }
        }
    }

    public static void a(String str, int i10, String str2, String str3) {
        StringBuilder sbC = a.c("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbC.append(str3);
        sbC.append("' (track ");
        sbC.append(i10);
        sbC.append(")");
        k.d("TrackGroup", "", new IllegalStateException(sbC.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f35492b.equals(yVar.f35492b) && Arrays.equals(this.f35494d, yVar.f35494d);
    }

    public final int hashCode() {
        if (this.f35495e == 0) {
            this.f35495e = Arrays.hashCode(this.f35494d) + B1.a.b(this.f35492b, 527, 31);
        }
        return this.f35495e;
    }

    public final String toString() {
        return this.f35492b + ": " + Arrays.toString(this.f35494d);
    }
}
