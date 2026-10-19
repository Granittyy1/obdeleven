package g2;

import java.util.regex.Pattern;
import p114j1.r;

/* JADX INFO: compiled from: WebvttCssParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f35499c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f35500d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f35501a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f35502b = new StringBuilder();

    public static String a(r rVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = rVar.f41063b;
        int i11 = rVar.f41064c;
        while (i10 < i11 && !z10) {
            char c10 = (char) rVar.f41062a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        rVar.H(i10 - rVar.f41063b);
        return sb2.toString();
    }

    public static String b(r rVar, StringBuilder sb2) {
        c(rVar);
        if (rVar.a() == 0) {
            return null;
        }
        String strA = a(rVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) rVar.u());
    }

    public static void c(r rVar) {
        while (true) {
            for (boolean z10 = true; rVar.a() > 0 && z10; z10 = false) {
                int i10 = rVar.f41063b;
                byte[] bArr = rVar.f41062a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    rVar.H(1);
                } else {
                    int i11 = rVar.f41064c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            rVar.H(i11 - rVar.f41063b);
                        }
                    }
                }
            }
            return;
        }
    }
}
