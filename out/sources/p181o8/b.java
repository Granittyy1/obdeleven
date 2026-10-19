package p181o8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p134k8.T1;

/* JADX INFO: compiled from: KWP2000FreezeFrame.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45234a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45235b;

    public b(String str) {
        this.f45235b = str;
        c(str);
    }

    @Override // p181o8.a
    public final List<T1> a() {
        ArrayList arrayList = this.f45234a;
        return (arrayList == null || arrayList.isEmpty()) ? c(this.f45235b) : arrayList;
    }

    @Override // p181o8.a
    public final String b() {
        return this.f45235b;
    }

    public final List<T1> c(String str) {
        String strSubstring;
        if (str.substring(2, 4).equals("6C")) {
            strSubstring = str.substring(4, 32);
            str.substring(32);
        } else {
            str.substring(2);
            strSubstring = "";
        }
        boolean zIsEmpty = strSubstring.isEmpty();
        ArrayList arrayList = this.f45234a;
        if (!zIsEmpty) {
            String strSubstring2 = strSubstring.substring(4, 6);
            String strSubstring3 = strSubstring.substring(6, 8);
            String strSubstring4 = strSubstring.substring(8, 10);
            String strSubstring5 = strSubstring.substring(10, 16);
            String strSubstring6 = strSubstring.substring(18, 28);
            Locale locale = Locale.US;
            arrayList.add(new T1("Priority", String.format(locale, "%2d", Integer.valueOf(Integer.parseInt(strSubstring2, 16))), null));
            arrayList.add(new T1("Frequency counter", String.format(locale, "%2d", Integer.valueOf(Integer.parseInt(strSubstring3, 16))), null));
            arrayList.add(new T1("Driving cycle", String.format(locale, "%2d", Integer.valueOf(Integer.parseInt(strSubstring4, 16))), null));
            int i10 = Integer.parseInt(strSubstring5, 16);
            if (i10 > 0 && i10 < 1000000) {
                arrayList.add(new T1("Mileage", i10 + " km", null));
            }
            long j = Long.parseLong(strSubstring6, 16);
            int i11 = (int) (j & 63);
            int i12 = (int) (63 & (j >> 6));
            int i13 = (int) ((j >> 12) & 31);
            int i14 = (int) (31 & (j >> 17));
            int i15 = (int) ((j >> 22) & 15);
            int i16 = (int) ((j >> 26) & 127);
            if (i16 > 0 && i16 < 127 && i15 > 0 && i15 < 13 && i14 > 0 && i13 < 24 && i12 < 60 && i11 < 60) {
                arrayList.add(new T1("Date", String.format(locale, "2%03d-%02d-%02d %02d:%02d:%02d", Integer.valueOf(i16), Integer.valueOf(i15), Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)), null));
            }
        }
        return arrayList;
    }
}
