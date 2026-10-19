package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1897s implements InterfaceC1884q, Iterable<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25833b;

    public C1897s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f25833b = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final String A() {
        return this.f25833b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Iterator<InterfaceC1884q> B() {
        return new C1918v(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x016e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0171  */
    /* JADX WARN: Code duplicated, block: B:105:0x017f A[PHI: r0 r2 r7 r16
      0x017f: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v9 java.lang.String) binds: [B:104:0x017d, B:100:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:104:0x017d, B:100:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r7v5 java.lang.String) = (r7v4 java.lang.String), (r7v6 java.lang.String) binds: [B:104:0x017d, B:100:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x017f: PHI (r16v5 java.lang.String) = (r16v4 java.lang.String), (r16v6 java.lang.String) binds: [B:104:0x017d, B:100:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0182  */
    /* JADX WARN: Code duplicated, block: B:107:0x0185  */
    /* JADX WARN: Code duplicated, block: B:110:0x0198  */
    /* JADX WARN: Code duplicated, block: B:111:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ac A[PHI: r0 r2 r3 r7 r16 r19
      0x01ac: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v6 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v4 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r16v2 java.lang.String) = (r16v1 java.lang.String), (r16v3 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r19v2 java.lang.String) = (r19v1 java.lang.String), (r19v3 java.lang.String) binds: [B:112:0x01aa, B:108:0x0195] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:129:0x0212  */
    /* JADX WARN: Code duplicated, block: B:131:0x0224  */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:137:0x0251  */
    /* JADX WARN: Code duplicated, block: B:139:0x0255  */
    /* JADX WARN: Code duplicated, block: B:140:0x027b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0297  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x0312  */
    /* JADX WARN: Code duplicated, block: B:156:0x0320  */
    /* JADX WARN: Code duplicated, block: B:158:0x032c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0338  */
    /* JADX WARN: Code duplicated, block: B:161:0x033d  */
    /* JADX WARN: Code duplicated, block: B:163:0x0354  */
    /* JADX WARN: Code duplicated, block: B:164:0x0374  */
    /* JADX WARN: Code duplicated, block: B:167:0x037d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0383  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:179:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:181:0x03b8 A[LOOP:0: B:180:0x03b6->B:181:0x03b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:186:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:191:0x0406  */
    /* JADX WARN: Code duplicated, block: B:194:0x0417  */
    /* JADX WARN: Code duplicated, block: B:195:0x042c  */
    /* JADX WARN: Code duplicated, block: B:198:0x043b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0446  */
    /* JADX WARN: Code duplicated, block: B:202:0x0461  */
    /* JADX WARN: Code duplicated, block: B:204:0x0472  */
    /* JADX WARN: Code duplicated, block: B:205:0x0475  */
    /* JADX WARN: Code duplicated, block: B:208:0x0493  */
    /* JADX WARN: Code duplicated, block: B:210:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:214:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:219:0x04df  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:223:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:226:0x0515  */
    /* JADX WARN: Code duplicated, block: B:227:0x0518  */
    /* JADX WARN: Code duplicated, block: B:230:0x052c  */
    /* JADX WARN: Code duplicated, block: B:232:0x053c  */
    /* JADX WARN: Code duplicated, block: B:234:0x054b  */
    /* JADX WARN: Code duplicated, block: B:237:0x0569  */
    /* JADX WARN: Code duplicated, block: B:239:0x0578  */
    /* JADX WARN: Code duplicated, block: B:241:0x0584  */
    /* JADX WARN: Code duplicated, block: B:243:0x0596  */
    /* JADX WARN: Code duplicated, block: B:245:0x05a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:246:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ad A[LOOP:1: B:247:0x05a7->B:249:0x05ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:254:0x05db  */
    /* JADX WARN: Code duplicated, block: B:255:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:264:0x0611  */
    /* JADX WARN: Code duplicated, block: B:266:0x0621  */
    /* JADX WARN: Code duplicated, block: B:268:0x0628  */
    /* JADX WARN: Code duplicated, block: B:270:0x064b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:271:0x064c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0101  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x010b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x0129  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:82:0x0133  */
    /* JADX WARN: Code duplicated, block: B:85:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0143  */
    /* JADX WARN: Code duplicated, block: B:90:0x0145  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0157  */
    /* JADX WARN: Code duplicated, block: B:99:0x015f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q C(String str, Y1 y10, ArrayList arrayList) {
        String str2;
        String str3;
        String strA;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        byte b10;
        byte b11;
        InterfaceC1884q interfaceC1884qC;
        boolean zEquals;
        C1821h c1821h;
        int i10;
        int iA;
        StringBuilder sb2;
        int i11;
        double dDoubleValue;
        double dA;
        String strA2;
        double dDoubleValue2;
        double dA2;
        double dMin;
        double length;
        double dA3;
        double dMin2;
        ArrayList arrayList2;
        String strA3;
        long jI;
        String[] strArrSplit;
        int length2;
        int i12;
        boolean zIsEmpty;
        int iA2;
        int length3;
        InterfaceC1884q interfaceC1884qA;
        String str10;
        int iIndexOf;
        int i13;
        Y1 y11;
        double dDoubleValue3;
        String str11 = "charAt";
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !"search".equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "trim";
                if (!str3.equals(str)) {
                    throw new IllegalArgumentException(str.concat(" is not a String function"));
                }
            }
            strA = "undefined";
            str4 = "toLocaleLowerCase";
            str5 = this.f25833b;
            switch (str.hashCode()) {
                case -1789698943:
                    str11 = str11;
                    str4 = str4;
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    if (str.equals(str9)) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1776922004:
                    str11 = str11;
                    str4 = str4;
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    if (str.equals(str7)) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1464939364:
                    str11 = str11;
                    str4 = str4;
                    str6 = "replace";
                    str7 = "toString";
                    if (str.equals(str4)) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -1361633751:
                    str11 = str11;
                    str6 = "replace";
                    str7 = "toString";
                    str4 = str4;
                    if (str.equals(str11)) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        b11 = 4;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        b11 = 5;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b11 = 6;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        b11 = 7;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        b11 = 8;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        b11 = 9;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 3568674:
                    if (str.equals(str3)) {
                        b11 = 10;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        b11 = 11;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        b11 = 12;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        b11 = 13;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        b11 = 14;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        b11 = 15;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        b11 = 16;
                        b10 = b11;
                    } else {
                        b10 = -1;
                    }
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
                default:
                    b10 = -1;
                    str6 = "replace";
                    str7 = "toString";
                    str8 = "match";
                    str9 = "hasOwnProperty";
                    break;
            }
            switch (b10) {
                case 0:
                    D1.e(1, str9, arrayList);
                    interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                    zEquals = Name.LENGTH.equals(interfaceC1884qC.A());
                    c1821h = InterfaceC1884q.f25819k0;
                    if (zEquals) {
                        return c1821h;
                    }
                    double dDoubleValue4 = interfaceC1884qC.z().doubleValue();
                    return (dDoubleValue4 == Math.floor(dDoubleValue4) || (i10 = (int) dDoubleValue4) < 0 || i10 >= str5.length()) ? InterfaceC1884q.f25820l0 : c1821h;
                case 1:
                    D1.e(0, str7, arrayList);
                    return this;
                case 2:
                    D1.e(0, str4, arrayList);
                    return new C1897s(str5.toLowerCase());
                case 3:
                    D1.m(1, str11, arrayList);
                    if (arrayList.isEmpty()) {
                        iA = 0;
                    } else {
                        iA = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue());
                    }
                    return (iA >= 0 || iA >= str5.length()) ? InterfaceC1884q.f25821m0 : new C1897s(String.valueOf(str5.charAt(iA)));
                case 4:
                    if (arrayList.isEmpty()) {
                        return this;
                    }
                    sb2 = new StringBuilder(str5);
                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                        sb2.append(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i11)).A());
                    }
                    return new C1897s(sb2.toString());
                case 5:
                    D1.e(0, "toLowerCase", arrayList);
                    return new C1897s(str5.toLowerCase(Locale.ENGLISH));
                case 6:
                    D1.m(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A()).matcher(str5);
                    return matcher.find() ? new C1835j(Double.valueOf(matcher.start())) : new C1835j(Double.valueOf(-1.0d));
                case 7:
                    D1.e(0, str2, arrayList);
                    return new C1897s(str5.toUpperCase());
                case 8:
                    D1.m(2, "lastIndexOf", arrayList);
                    String strA4 = arrayList.size() > 0 ? y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A() : "undefined";
                    if (arrayList.size() < 2) {
                        dDoubleValue = Double.NaN;
                    } else {
                        dDoubleValue = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                    }
                    if (Double.isNaN(dDoubleValue)) {
                        dA = Double.POSITIVE_INFINITY;
                    } else {
                        dA = D1.a(dDoubleValue);
                    }
                    return new C1835j(Double.valueOf(str5.lastIndexOf(strA4, (int) dA)));
                case 9:
                    D1.e(0, "toUpperCase", arrayList);
                    return new C1897s(str5.toUpperCase(Locale.ENGLISH));
                case 10:
                    D1.e(0, "toUpperCase", arrayList);
                    return new C1897s(str5.trim());
                case 11:
                    D1.m(1, str8, arrayList);
                    if (arrayList.size() <= 0) {
                        strA2 = "";
                    } else {
                        strA2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                    }
                    Matcher matcher2 = Pattern.compile(strA2).matcher(str5);
                    return matcher2.find() ? new C1814g(new C1897s(matcher2.group())) : InterfaceC1884q.f25815g0;
                case 12:
                    D1.m(2, "slice", arrayList);
                    if (arrayList.isEmpty()) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue();
                    }
                    dA2 = D1.a(dDoubleValue2);
                    if (dA2 < 0.0d) {
                        dMin = Math.max(((double) str5.length()) + dA2, 0.0d);
                    } else {
                        dMin = Math.min(dA2, str5.length());
                    }
                    int i14 = (int) dMin;
                    if (arrayList.size() > 1) {
                        length = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                    } else {
                        length = str5.length();
                    }
                    dA3 = D1.a(length);
                    if (dA3 < 0.0d) {
                        dMin2 = Math.max(((double) str5.length()) + dA3, 0.0d);
                    } else {
                        dMin2 = Math.min(dA3, str5.length());
                    }
                    return new C1897s(str5.substring(i14, Math.max(0, ((int) dMin2) - i14) + i14));
                case 13:
                    D1.m(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new C1814g(this);
                    }
                    arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        strA3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                        if (arrayList.size() > 1) {
                            jI = ((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())) & 4294967295L;
                        } else {
                            jI = 2147483647L;
                        }
                        if (jI == 0) {
                            return new C1814g();
                        }
                        strArrSplit = str5.split(Pattern.quote(strA3), ((int) jI) + 1);
                        length2 = strArrSplit.length;
                        if (strA3.isEmpty() || strArrSplit.length <= 0) {
                            i12 = 0;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                                i12 = zIsEmpty;
                                length2 = strArrSplit.length - 1;
                                i12 = zIsEmpty;
                            }
                        }
                        i12 = zIsEmpty;
                        if (strArrSplit.length > jI) {
                            length2--;
                        }
                        while (i12 < length2) {
                            arrayList2.add(new C1897s(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new C1814g(arrayList2);
                case 14:
                    D1.m(2, "substring", arrayList);
                    if (arrayList.isEmpty()) {
                        iA2 = 0;
                    } else {
                        iA2 = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue());
                    }
                    if (arrayList.size() > 1) {
                        length3 = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue());
                    } else {
                        length3 = str5.length();
                    }
                    int iMin = Math.min(Math.max(iA2, 0), str5.length());
                    int iMin2 = Math.min(Math.max(length3, 0), str5.length());
                    return new C1897s(str5.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 15:
                    D1.m(2, str6, arrayList);
                    interfaceC1884qA = InterfaceC1884q.f25814f0;
                    if (!arrayList.isEmpty()) {
                        strA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                        if (arrayList.size() > 1) {
                            interfaceC1884qA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                        }
                    }
                    str10 = strA;
                    iIndexOf = str5.indexOf(str10);
                    if (iIndexOf < 0) {
                        return this;
                    }
                    if (interfaceC1884qA instanceof AbstractC1856m) {
                        i13 = 0;
                        interfaceC1884qA = ((AbstractC1856m) interfaceC1884qA).a(y10, Arrays.asList(new C1897s(str10), new C1835j(Double.valueOf(iIndexOf)), this));
                    } else {
                        i13 = 0;
                    }
                    return new C1897s(O.a.f(str5.substring(i13, iIndexOf), interfaceC1884qA.A(), str5.substring(str10.length() + iIndexOf)));
                case 16:
                    D1.m(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        y11 = y10;
                    } else {
                        y11 = y10;
                        strA = y11.f25642b.c(y11, (InterfaceC1884q) arrayList.get(0)).A();
                    }
                    String str12 = strA;
                    if (arrayList.size() < 2) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = y11.f25642b.c(y11, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                    }
                    return new C1835j(Double.valueOf(str5.indexOf(str12, (int) D1.a(dDoubleValue3))));
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "trim";
        strA = "undefined";
        str4 = "toLocaleLowerCase";
        str5 = this.f25833b;
        switch (str.hashCode()) {
            case -1789698943:
                str11 = str11;
                str4 = str4;
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                if (str.equals(str9)) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1776922004:
                str11 = str11;
                str4 = str4;
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                if (str.equals(str7)) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1464939364:
                str11 = str11;
                str4 = str4;
                str6 = "replace";
                str7 = "toString";
                if (str.equals(str4)) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -1361633751:
                str11 = str11;
                str6 = "replace";
                str7 = "toString";
                str4 = str4;
                if (str.equals(str11)) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b10 = -1;
                } else {
                    b11 = 4;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b10 = -1;
                } else {
                    b11 = 5;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -906336856:
                if (str.equals("search")) {
                    b10 = -1;
                } else {
                    b11 = 6;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -726908483:
                if (str.equals(str2)) {
                    b10 = -1;
                } else {
                    b11 = 7;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = -1;
                } else {
                    b11 = 8;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b10 = -1;
                } else {
                    b11 = 9;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 3568674:
                if (str.equals(str3)) {
                    b10 = -1;
                } else {
                    b11 = 10;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b10 = -1;
                } else {
                    b11 = 11;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = -1;
                } else {
                    b11 = 12;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b10 = -1;
                } else {
                    b11 = 13;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b10 = -1;
                } else {
                    b11 = 14;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b10 = -1;
                } else {
                    b11 = 15;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = -1;
                } else {
                    b11 = 16;
                    b10 = b11;
                }
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
            default:
                b10 = -1;
                str6 = "replace";
                str7 = "toString";
                str8 = "match";
                str9 = "hasOwnProperty";
                break;
        }
        switch (b10) {
            case 0:
                D1.e(1, str9, arrayList);
                interfaceC1884qC = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0));
                zEquals = Name.LENGTH.equals(interfaceC1884qC.A());
                c1821h = InterfaceC1884q.f25819k0;
                if (zEquals) {
                    return c1821h;
                }
                double dDoubleValue5 = interfaceC1884qC.z().doubleValue();
                if (dDoubleValue5 == Math.floor(dDoubleValue5)) {
                }
                break;
            case 1:
                D1.e(0, str7, arrayList);
                return this;
            case 2:
                D1.e(0, str4, arrayList);
                return new C1897s(str5.toLowerCase());
            case 3:
                D1.m(1, str11, arrayList);
                if (arrayList.isEmpty()) {
                    iA = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue());
                } else {
                    iA = 0;
                }
                if (iA >= 0) {
                }
                break;
            case 4:
                if (arrayList.isEmpty()) {
                    return this;
                }
                sb2 = new StringBuilder(str5);
                while (i11 < arrayList.size()) {
                    sb2.append(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(i11)).A());
                }
                return new C1897s(sb2.toString());
            case 5:
                D1.e(0, "toLowerCase", arrayList);
                return new C1897s(str5.toLowerCase(Locale.ENGLISH));
            case 6:
                D1.m(1, "search", arrayList);
                Matcher matcher3 = Pattern.compile(arrayList.isEmpty() ? "undefined" : y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A()).matcher(str5);
                if (matcher3.find()) {
                }
            case 7:
                D1.e(0, str2, arrayList);
                return new C1897s(str5.toUpperCase());
            case 8:
                D1.m(2, "lastIndexOf", arrayList);
                String strA5 = arrayList.size() > 0 ? y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A() : "undefined";
                if (arrayList.size() < 2) {
                    dDoubleValue = Double.NaN;
                } else {
                    dDoubleValue = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                }
                if (Double.isNaN(dDoubleValue)) {
                    dA = Double.POSITIVE_INFINITY;
                } else {
                    dA = D1.a(dDoubleValue);
                }
                return new C1835j(Double.valueOf(str5.lastIndexOf(strA5, (int) dA)));
            case 9:
                D1.e(0, "toUpperCase", arrayList);
                return new C1897s(str5.toUpperCase(Locale.ENGLISH));
            case 10:
                D1.e(0, "toUpperCase", arrayList);
                return new C1897s(str5.trim());
            case 11:
                D1.m(1, str8, arrayList);
                if (arrayList.size() <= 0) {
                    strA2 = "";
                } else {
                    strA2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                }
                Matcher matcher4 = Pattern.compile(strA2).matcher(str5);
                if (matcher4.find()) {
                }
            case 12:
                D1.m(2, "slice", arrayList);
                if (arrayList.isEmpty()) {
                    dDoubleValue2 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue();
                } else {
                    dDoubleValue2 = 0.0d;
                }
                dA2 = D1.a(dDoubleValue2);
                if (dA2 < 0.0d) {
                    dMin = Math.max(((double) str5.length()) + dA2, 0.0d);
                } else {
                    dMin = Math.min(dA2, str5.length());
                }
                int i15 = (int) dMin;
                if (arrayList.size() > 1) {
                    length = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                } else {
                    length = str5.length();
                }
                dA3 = D1.a(length);
                if (dA3 < 0.0d) {
                    dMin2 = Math.max(((double) str5.length()) + dA3, 0.0d);
                } else {
                    dMin2 = Math.min(dA3, str5.length());
                }
                return new C1897s(str5.substring(i15, Math.max(0, ((int) dMin2) - i15) + i15));
            case 13:
                D1.m(2, "split", arrayList);
                if (str5.length() == 0) {
                    return new C1814g(this);
                }
                arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    strA3 = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                    if (arrayList.size() > 1) {
                        jI = ((long) D1.i(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue())) & 4294967295L;
                    } else {
                        jI = 2147483647L;
                    }
                    if (jI == 0) {
                        return new C1814g();
                    }
                    strArrSplit = str5.split(Pattern.quote(strA3), ((int) jI) + 1);
                    length2 = strArrSplit.length;
                    if (strA3.isEmpty()) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                    }
                    i12 = zIsEmpty;
                    if (strArrSplit.length > jI) {
                        length2--;
                    }
                    while (i12 < length2) {
                        arrayList2.add(new C1897s(strArrSplit[i12]));
                        i12++;
                    }
                }
                return new C1814g(arrayList2);
            case 14:
                D1.m(2, "substring", arrayList);
                if (arrayList.isEmpty()) {
                    iA2 = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).z().doubleValue());
                } else {
                    iA2 = 0;
                }
                if (arrayList.size() > 1) {
                    length3 = (int) D1.a(y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1)).z().doubleValue());
                } else {
                    length3 = str5.length();
                }
                int iMin3 = Math.min(Math.max(iA2, 0), str5.length());
                int iMin4 = Math.min(Math.max(length3, 0), str5.length());
                return new C1897s(str5.substring(Math.min(iMin3, iMin4), Math.max(iMin3, iMin4)));
            case 15:
                D1.m(2, str6, arrayList);
                interfaceC1884qA = InterfaceC1884q.f25814f0;
                if (!arrayList.isEmpty()) {
                    strA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(0)).A();
                    if (arrayList.size() > 1) {
                        interfaceC1884qA = y10.f25642b.c(y10, (InterfaceC1884q) arrayList.get(1));
                    }
                }
                str10 = strA;
                iIndexOf = str5.indexOf(str10);
                if (iIndexOf < 0) {
                    return this;
                }
                if (interfaceC1884qA instanceof AbstractC1856m) {
                    i13 = 0;
                    interfaceC1884qA = ((AbstractC1856m) interfaceC1884qA).a(y10, Arrays.asList(new C1897s(str10), new C1835j(Double.valueOf(iIndexOf)), this));
                } else {
                    i13 = 0;
                }
                return new C1897s(O.a.f(str5.substring(i13, iIndexOf), interfaceC1884qA.A(), str5.substring(str10.length() + iIndexOf)));
            case 16:
                D1.m(2, "indexOf", arrayList);
                if (arrayList.size() <= 0) {
                    y11 = y10;
                } else {
                    y11 = y10;
                    strA = y11.f25642b.c(y11, (InterfaceC1884q) arrayList.get(0)).A();
                }
                String str13 = strA;
                if (arrayList.size() < 2) {
                    dDoubleValue3 = 0.0d;
                } else {
                    dDoubleValue3 = y11.f25642b.c(y11, (InterfaceC1884q) arrayList.get(1)).z().doubleValue();
                }
                return new C1835j(Double.valueOf(str5.indexOf(str13, (int) D1.a(dDoubleValue3))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Boolean b() {
        return Boolean.valueOf(!this.f25833b.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1897s) {
            return this.f25833b.equals(((C1897s) obj).f25833b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25833b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1884q> iterator() {
        return new C1911u(this);
    }

    public final String toString() {
        return Q8.d.a(new StringBuilder("\""), this.f25833b, "\"");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final InterfaceC1884q y() {
        return new C1897s(this.f25833b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1884q
    public final Double z() {
        String str = this.f25833b;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }
}
