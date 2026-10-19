package g2;

import X1.l;
import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.A;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: WebvttParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f35545a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f35546b = new b();

    /* JADX WARN: Code duplicated, block: B:127:0x022f  */
    /* JADX WARN: Code duplicated, block: B:129:0x023b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0244  */
    /* JADX WARN: Code duplicated, block: B:132:0x024d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0255  */
    /* JADX WARN: Code duplicated, block: B:136:0x025d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0261  */
    /* JADX WARN: Code duplicated, block: B:139:0x0269  */
    /* JADX WARN: Code duplicated, block: B:140:0x026e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0276  */
    /* JADX WARN: Code duplicated, block: B:148:0x0289  */
    /* JADX WARN: Code duplicated, block: B:150:0x028e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0296  */
    /* JADX WARN: Code duplicated, block: B:154:0x029e  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:165:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02da  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:173:0x0308  */
    /* JADX WARN: Code duplicated, block: B:174:0x030a  */
    /* JADX WARN: Code duplicated, block: B:177:0x031b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0324  */
    /* JADX WARN: Code duplicated, block: B:181:0x0326  */
    /* JADX WARN: Code duplicated, block: B:184:0x032f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0331  */
    /* JADX WARN: Code duplicated, block: B:188:0x033a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0344  */
    /* JADX WARN: Code duplicated, block: B:193:0x0349  */
    /* JADX WARN: Code duplicated, block: B:194:0x034e  */
    /* JADX WARN: Code duplicated, block: B:196:0x0361  */
    /* JADX WARN: Code duplicated, block: B:237:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:172:0x02f2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, p114j1.f<X1.c> fVar) {
        int i12;
        int i13;
        d dVarD;
        String strTrim;
        int i14;
        String string;
        int i15;
        Matcher matcher;
        String strGroup;
        byte b10;
        boolean z10;
        f fVar2 = this;
        int i16 = 2;
        int i17 = 0;
        int i18 = -1;
        int i19 = 1;
        r rVar = fVar2.f35545a;
        rVar.E(i10 + i11, bArr);
        rVar.G(i10);
        ArrayList arrayList = new ArrayList();
        try {
            g.c(rVar);
            while (!TextUtils.isEmpty(rVar.i(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i20 = i17;
                int i21 = i18;
                while (i21 == i18) {
                    i20 = rVar.f41063b;
                    String strI = rVar.i(StandardCharsets.UTF_8);
                    if (strI == null) {
                        i21 = i17;
                    } else if ("STYLE".equals(strI)) {
                        i21 = i16;
                    } else {
                        i21 = strI.startsWith("NOTE") ? i19 : 3;
                    }
                }
                rVar.G(i20);
                if (i21 == 0) {
                    X1.f.b(new h(arrayList2), bVar, fVar);
                    return;
                }
                if (i21 == i19) {
                    while (!TextUtils.isEmpty(rVar.i(StandardCharsets.UTF_8))) {
                    }
                } else {
                    if (i21 != i16) {
                        i12 = i16;
                        i13 = i19;
                        if (i21 == 3) {
                            Pattern pattern = e.f35522a;
                            Charset charset = StandardCharsets.UTF_8;
                            String strI2 = rVar.i(charset);
                            if (strI2 == null) {
                                dVarD = null;
                            } else {
                                Pattern pattern2 = e.f35522a;
                                Matcher matcher2 = pattern2.matcher(strI2);
                                if (matcher2.matches()) {
                                    dVarD = e.d(null, matcher2, rVar, arrayList);
                                } else {
                                    dVarD = null;
                                    String strI3 = rVar.i(charset);
                                    if (strI3 != null) {
                                        Matcher matcher3 = pattern2.matcher(strI3);
                                        if (matcher3.matches()) {
                                            dVarD = e.d(strI2.trim(), matcher3, rVar, arrayList);
                                        }
                                    }
                                }
                            }
                            if (dVarD != null) {
                                arrayList2.add(dVarD);
                            }
                        }
                    } else {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        rVar.i(StandardCharsets.UTF_8);
                        b bVar2 = fVar2.f35546b;
                        StringBuilder sb2 = bVar2.f35502b;
                        sb2.setLength(i17);
                        int i22 = rVar.f41063b;
                        while (!TextUtils.isEmpty(rVar.i(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = rVar.f41062a;
                        int i23 = rVar.f41063b;
                        r rVar2 = bVar2.f35501a;
                        rVar2.E(i23, bArr2);
                        rVar2.G(i22);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            b.c(rVar2);
                            if (rVar2.a() >= 5 && "::cue".equals(rVar2.s(5, StandardCharsets.UTF_8))) {
                                int i24 = rVar2.f41063b;
                                String strB = b.b(rVar2, sb2);
                                if (strB == null) {
                                    strTrim = null;
                                } else if ("{".equals(strB)) {
                                    rVar2.G(i24);
                                    strTrim = "";
                                } else {
                                    if ("(".equals(strB)) {
                                        int i25 = rVar2.f41063b;
                                        int i26 = rVar2.f41064c;
                                        int i27 = i17;
                                        while (i25 < i26 && i27 == 0) {
                                            int i28 = i25 + 1;
                                            i27 = ((char) rVar2.f41062a[i25]) == ')' ? i19 : i17;
                                            i25 = i28;
                                        }
                                        strTrim = rVar2.s((i25 + i18) - rVar2.f41063b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        strTrim = null;
                                    }
                                    if (!")".equals(b.b(rVar2, sb2))) {
                                        strTrim = null;
                                    }
                                }
                            } else {
                                strTrim = null;
                            }
                            if (strTrim != null && "{".equals(b.b(rVar2, sb2))) {
                                c cVar = new c();
                                if (!"".equals(strTrim)) {
                                    int iIndexOf = strTrim.indexOf(91);
                                    if (iIndexOf != i18) {
                                        Matcher matcher4 = b.f35499c.matcher(strTrim.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            String strGroup2 = matcher4.group(i19);
                                            strGroup2.getClass();
                                            cVar.f35506d = strGroup2;
                                        }
                                        strTrim = strTrim.substring(i17, iIndexOf);
                                    }
                                    int i29 = A.f40996a;
                                    String[] strArrSplit = strTrim.split("\\.", i18);
                                    String str = strArrSplit[i17];
                                    int iIndexOf2 = str.indexOf(35);
                                    if (iIndexOf2 != i18) {
                                        cVar.f35504b = str.substring(i17, iIndexOf2);
                                        cVar.f35503a = str.substring(iIndexOf2 + i19);
                                    } else {
                                        cVar.f35504b = str;
                                    }
                                    if (strArrSplit.length > i19) {
                                        int length = strArrSplit.length;
                                        p241t7.b.e(length <= strArrSplit.length ? i19 : i17);
                                        cVar.f35505c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i19, length)));
                                    }
                                }
                                int i30 = i17;
                                String strB2 = null;
                                while (i30 == 0) {
                                    int i31 = rVar2.f41063b;
                                    strB2 = b.b(rVar2, sb2);
                                    int i32 = (strB2 == null || "}".equals(strB2)) ? i19 : i17;
                                    if (i32 == 0) {
                                        rVar2.G(i31);
                                        b.c(rVar2);
                                        String strA = b.a(rVar2, sb2);
                                        if (!"".equals(strA) && ":".equals(b.b(rVar2, sb2))) {
                                            b.c(rVar2);
                                            StringBuilder sb3 = new StringBuilder();
                                            boolean z11 = false;
                                            while (true) {
                                                if (z11) {
                                                    string = sb3.toString();
                                                } else {
                                                    int i33 = rVar2.f41063b;
                                                    boolean z12 = z11;
                                                    String strB3 = b.b(rVar2, sb2);
                                                    if (strB3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                        rVar2.G(i33);
                                                        z11 = true;
                                                    } else {
                                                        sb3.append(strB3);
                                                        z11 = z12;
                                                    }
                                                }
                                            }
                                            if (string == null || "".equals(string)) {
                                                i14 = 1;
                                            } else {
                                                int i34 = rVar2.f41063b;
                                                String strB4 = b.b(rVar2, sb2);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        i15 = 1;
                                                        cVar.f35508f = p114j1.e.a(string, true);
                                                        cVar.f35509g = true;
                                                    } else {
                                                        i15 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            cVar.f35510h = p114j1.e.a(string, true);
                                                            cVar.f35511i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    cVar.f35517p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f35517p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string)) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = true;
                                                                }
                                                                cVar.f35518q = z10;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    cVar.f35512k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                cVar.f35507e = I.e.l(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i15 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        cVar.f35514m = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = b.f35500d.matcher(I.e.l(string));
                                                                    if (matcher.matches()) {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b10 = 0;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup3 = matcher.group(i14);
                                                                                strGroup3.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup3);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b10 = 1;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup4 = matcher.group(i14);
                                                                                strGroup4.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup4);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b10 = 2;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup5 = matcher.group(i14);
                                                                                strGroup5.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup5);
                                                                                break;
                                                                        }
                                                                        b10 = -1;
                                                                        switch (b10) {
                                                                            case 0:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup6 = matcher.group(i14);
                                                                        strGroup6.getClass();
                                                                        cVar.f35516o = Float.parseFloat(strGroup6);
                                                                    } else {
                                                                        k.f("Invalid font-size: '" + string + "'.");
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i15 = 1;
                                                                cVar.f35513l = 1;
                                                            }
                                                            i14 = 1;
                                                        }
                                                    }
                                                    i14 = i15;
                                                } else if ("}".equals(strB4)) {
                                                    rVar2.G(i34);
                                                    if ("color".equals(strA)) {
                                                        i15 = 1;
                                                        cVar.f35508f = p114j1.e.a(string, true);
                                                        cVar.f35509g = true;
                                                    } else {
                                                        i15 = 1;
                                                        if ("background-color".equals(strA)) {
                                                            cVar.f35510h = p114j1.e.a(string, true);
                                                            cVar.f35511i = true;
                                                        } else {
                                                            if ("ruby-position".equals(strA)) {
                                                                if ("over".equals(string)) {
                                                                    cVar.f35517p = 1;
                                                                } else if ("under".equals(string)) {
                                                                    cVar.f35517p = 2;
                                                                }
                                                            } else if ("text-combine-upright".equals(strA)) {
                                                                if ("all".equals(string) || string.startsWith("digits")) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                cVar.f35518q = z10;
                                                            } else if ("text-decoration".equals(strA)) {
                                                                if ("underline".equals(string)) {
                                                                    cVar.f35512k = 1;
                                                                }
                                                            } else if ("font-family".equals(strA)) {
                                                                cVar.f35507e = I.e.l(string);
                                                            } else if ("font-weight".equals(strA)) {
                                                                i15 = 1;
                                                                if ("font-style".equals(strA)) {
                                                                    if ("italic".equals(string)) {
                                                                        cVar.f35514m = 1;
                                                                    }
                                                                } else if ("font-size".equals(strA)) {
                                                                    matcher = b.f35500d.matcher(I.e.l(string));
                                                                    if (matcher.matches()) {
                                                                        k.f("Invalid font-size: '" + string + "'.");
                                                                    } else {
                                                                        strGroup = matcher.group(2);
                                                                        strGroup.getClass();
                                                                        switch (strGroup.hashCode()) {
                                                                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                                                if (!strGroup.equals("%")) {
                                                                                    b10 = 0;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup7 = matcher.group(i14);
                                                                                strGroup7.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup7);
                                                                                break;
                                                                            case 3240:
                                                                                if (!strGroup.equals("em")) {
                                                                                    b10 = 1;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup8 = matcher.group(i14);
                                                                                strGroup8.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup8);
                                                                                break;
                                                                            case 3592:
                                                                                if (!strGroup.equals("px")) {
                                                                                    b10 = 2;
                                                                                }
                                                                                switch (b10) {
                                                                                    case 0:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 3;
                                                                                        break;
                                                                                    case 1:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 2;
                                                                                        break;
                                                                                    case 2:
                                                                                        i14 = 1;
                                                                                        cVar.f35515n = 1;
                                                                                        break;
                                                                                    default:
                                                                                        throw new IllegalStateException();
                                                                                }
                                                                                String strGroup9 = matcher.group(i14);
                                                                                strGroup9.getClass();
                                                                                cVar.f35516o = Float.parseFloat(strGroup9);
                                                                                break;
                                                                        }
                                                                        b10 = -1;
                                                                        switch (b10) {
                                                                            case 0:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i14 = 1;
                                                                                cVar.f35515n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String strGroup10 = matcher.group(i14);
                                                                        strGroup10.getClass();
                                                                        cVar.f35516o = Float.parseFloat(strGroup10);
                                                                    }
                                                                }
                                                            } else if ("bold".equals(string)) {
                                                                i15 = 1;
                                                                cVar.f35513l = 1;
                                                            }
                                                            i14 = 1;
                                                        }
                                                    }
                                                    i14 = i15;
                                                } else {
                                                    i14 = 1;
                                                }
                                            }
                                        } else {
                                            i14 = i19;
                                        }
                                    } else {
                                        i14 = i19;
                                    }
                                    i19 = i14;
                                    i30 = i32;
                                    i17 = 0;
                                }
                                int i35 = i19;
                                if ("}".equals(strB2)) {
                                    arrayList3.add(cVar);
                                }
                                i19 = i35;
                                i16 = 2;
                                i17 = 0;
                                i18 = -1;
                            }
                        }
                        i12 = i16;
                        i13 = i19;
                        arrayList.addAll(arrayList3);
                    }
                    i19 = i13;
                    i16 = i12;
                    i17 = 0;
                    i18 = -1;
                    fVar2 = this;
                }
            }
        } catch (ParserException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
