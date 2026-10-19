package p078g1;

import J4.i;
import Q8.d;
import com.obdeleven.service.core.b;
import java.util.Arrays;
import p114j1.A;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f35253h = new h(1, 2, 3, -1, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f35257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f35258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35260g;

    static {
        b.b(0, 1, 2, 3, 4);
        A.B(5);
    }

    public h(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f35254a = i10;
        this.f35255b = i11;
        this.f35256c = i12;
        this.f35257d = bArr;
        this.f35258e = i13;
        this.f35259f = i14;
    }

    public static String a(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 != 1) {
            return i10 != 2 ? i.b(i10, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 != 1) {
            return i10 != 2 ? i.b(i10, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 != 6) {
            return i10 != 7 ? i.b(i10, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(h hVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (hVar == null) {
            return true;
        }
        int i14 = hVar.f35254a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = hVar.f35255b) == -1 || i10 == 2) && (((i11 = hVar.f35256c) == -1 || i11 == 3) && hVar.f35257d == null && (((i12 = hVar.f35259f) == -1 || i12 == 8) && ((i13 = hVar.f35258e) == -1 || i13 == 8)));
    }

    public static int f(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f35254a == -1 || this.f35255b == -1 || this.f35256c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f35254a == hVar.f35254a && this.f35255b == hVar.f35255b && this.f35256c == hVar.f35256c && Arrays.equals(this.f35257d, hVar.f35257d) && this.f35258e == hVar.f35258e && this.f35259f == hVar.f35259f;
    }

    public final int hashCode() {
        if (this.f35260g == 0) {
            this.f35260g = ((((Arrays.hashCode(this.f35257d) + ((((((527 + this.f35254a) * 31) + this.f35255b) * 31) + this.f35256c) * 31)) * 31) + this.f35258e) * 31) + this.f35259f;
        }
        return this.f35260g;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(b(this.f35254a));
        sb2.append(", ");
        sb2.append(a(this.f35255b));
        sb2.append(", ");
        sb2.append(c(this.f35256c));
        sb2.append(", ");
        sb2.append(this.f35257d != null);
        sb2.append(", ");
        String str2 = "NA";
        int i10 = this.f35258e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        sb2.append(str);
        sb2.append(", ");
        int i11 = this.f35259f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        return d.a(sb2, str2, ")");
    }
}
