package N1;

import Q8.d;
import com.braze.Constants;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p078g1.r;
import p078g1.s;
import p114j1.k;

/* JADX INFO: compiled from: IcyHeaders.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4631f;

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        p241t7.b.e(i11 == -1 || i11 > 0);
        this.f4626a = i10;
        this.f4627b = str;
        this.f4628c = str2;
        this.f4629d = str3;
        this.f4630e = z10;
        this.f4631f = i11;
    }

    public static b d(Map<String, List<String>> map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List<String> list = map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i11 = Integer.parseInt(str4) * Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        k.f("Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        d.e("Invalid bitrate header: ", str4);
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        k.f("Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        d.e("Invalid metadata interval: ", str5);
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            return new b(i10, i14, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override // g1.s.a
    public final void b(r.a aVar) {
        String str = this.f4628c;
        if (str != null) {
            aVar.f35442x = str;
        }
        String str2 = this.f4627b;
        if (str2 != null) {
            aVar.f35441w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4626a == bVar.f4626a && Objects.equals(this.f4627b, bVar.f4627b) && Objects.equals(this.f4628c, bVar.f4628c) && Objects.equals(this.f4629d, bVar.f4629d) && this.f4630e == bVar.f4630e && this.f4631f == bVar.f4631f;
    }

    public final int hashCode() {
        int i10 = (527 + this.f4626a) * 31;
        String str = this.f4627b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4628c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4629d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f4630e ? 1 : 0)) * 31) + this.f4631f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f4628c + "\", genre=\"" + this.f4627b + "\", bitrate=" + this.f4626a + ", metadataInterval=" + this.f4631f;
    }
}
