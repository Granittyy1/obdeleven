package p015b2;

import I.e;
import X1.c;
import X1.l;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p102i1.a;
import p114j1.A;
import p114j1.f;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: SsaParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f20512g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f20514b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f20516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f20517e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f20518f = -3.4028235E38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f20515c = new r();

    public b(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f20513a = false;
            this.f20514b = null;
            return;
        }
        this.f20513a = true;
        String strL = A.l(list.get(0));
        p241t7.b.e(strL.startsWith("Format:"));
        a aVarA = a.a(strL);
        aVarA.getClass();
        this.f20514b = aVarA;
        d(new r(list.get(1)), StandardCharsets.UTF_8);
    }

    public static int c(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long e(String str) {
        Matcher matcher = f20512g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = A.f40996a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // X1.l
    public final void a(byte[] bArr, int i10, int i11, l.b bVar, f<c> fVar) {
        Charset charset;
        a aVar;
        r rVar;
        Layout.Alignment alignment;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        Integer num;
        int iA;
        int i17;
        b bVar2 = this;
        l.b bVar3 = bVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        r rVar2 = bVar2.f20515c;
        rVar2.E(i10 + i11, bArr);
        rVar2.G(i10);
        Charset charsetC = rVar2.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z10 = bVar2.f20513a;
        if (!z10) {
            bVar2.d(rVar2, charsetC);
        }
        a aVarA = z10 ? bVar2.f20514b : null;
        while (true) {
            String strI = rVar2.i(charsetC);
            if (strI == null) {
                l.b bVar4 = bVar3;
                long j = bVar4.f7153a;
                ArrayList arrayList3 = (j == -9223372036854775807L || !bVar4.f7154b) ? null : new ArrayList();
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    List list = (List) arrayList.get(i18);
                    if (!list.isEmpty() || i18 == 0) {
                        if (i18 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i18)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i18 + 1)).longValue() - ((Long) arrayList2.get(i18)).longValue();
                        if (j == -9223372036854775807L || jLongValue >= j) {
                            fVar.a(new c(jLongValue, jLongValue2, list));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new c(jLongValue, jLongValue2, list));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        fVar.a((c) it.next());
                    }
                    return;
                }
                return;
            }
            if (strI.startsWith("Format:")) {
                aVarA = a.a(strI);
            } else {
                if (strI.startsWith("Dialogue:")) {
                    if (aVarA == null) {
                        k.f("Skipping dialogue line before complete format: ".concat(strI));
                    } else {
                        p241t7.b.e(strI.startsWith("Dialogue:"));
                        String strSubstring = strI.substring(9);
                        int i19 = aVarA.f20511e;
                        String[] strArrSplit = strSubstring.split(",", i19);
                        if (strArrSplit.length != i19) {
                            k.f("Skipping dialogue line with fewer columns than format: ".concat(strI));
                        } else {
                            long jE = e(strArrSplit[aVarA.f20507a]);
                            if (jE == -9223372036854775807L) {
                                k.f("Skipping invalid timing: ".concat(strI));
                            } else {
                                rVar = rVar2;
                                long jE2 = e(strArrSplit[aVarA.f20508b]);
                                if (jE2 == -9223372036854775807L || jE2 <= jE) {
                                    charset = charsetC;
                                    aVar = aVarA;
                                    k.f("Skipping invalid timing: ".concat(strI));
                                } else {
                                    LinkedHashMap linkedHashMap = bVar2.f20516d;
                                    c cVar = (linkedHashMap == null || (i17 = aVarA.f20509c) == -1) ? null : (c) linkedHashMap.get(strArrSplit[i17].trim());
                                    String str = strArrSplit[aVarA.f20510d];
                                    Matcher matcher = c.b.f20538a.matcher(str);
                                    int i20 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        Charset charset2 = charsetC;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFA = c.b.a(strGroup);
                                            if (pointFA != null) {
                                                pointF = pointFA;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.b.f20541d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iA = c.a(strGroup2);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i20 = iA;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        charsetC = charset2;
                                    }
                                    charset = charsetC;
                                    String strReplace = c.b.f20538a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f11 = bVar2.f20517e;
                                    float f12 = bVar2.f20518f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    a.C0382a c0382a = new a.C0382a();
                                    c0382a.f36527a = spannableString;
                                    if (cVar != null) {
                                        Integer num2 = cVar.f20521c;
                                        aVar = aVarA;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (cVar.j == 3 && (num = cVar.f20522d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f13 = cVar.f20523e;
                                        if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                                            c0382a.f36536k = f13 / f12;
                                            c0382a.j = 1;
                                        }
                                        boolean z11 = cVar.f20525g;
                                        boolean z12 = cVar.f20524f;
                                        if (z12 && z11) {
                                            i15 = 0;
                                            i16 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i15 = 0;
                                            i16 = 33;
                                            if (z12) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z11) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (cVar.f20526h) {
                                            spannableString.setSpan(new UnderlineSpan(), i15, spannableString.length(), i16);
                                        }
                                        if (cVar.f20527i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i15, spannableString.length(), i16);
                                        }
                                    } else {
                                        aVar = aVarA;
                                    }
                                    int i21 = -1;
                                    if (i20 != -1) {
                                        i21 = i20;
                                    } else if (cVar != null) {
                                        i21 = cVar.f20520b;
                                    }
                                    switch (i21) {
                                        case 0:
                                        default:
                                            com.google.gson.internal.b.e(i21, "Unknown alignment: ");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    c0382a.f36529c = alignment;
                                    int i22 = Integer.MIN_VALUE;
                                    switch (i21) {
                                        case 0:
                                        default:
                                            com.google.gson.internal.b.e(i21, "Unknown alignment: ");
                                        case -1:
                                            i12 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i12 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i12 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i12 = 2;
                                            break;
                                    }
                                    c0382a.f36535i = i12;
                                    switch (i21) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.google.gson.internal.b.e(i21, "Unknown alignment: ");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i22 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i22 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i22 = 0;
                                            break;
                                    }
                                    c0382a.f36533g = i22;
                                    PointF pointF2 = pointF;
                                    if (pointF2 == null || f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
                                        int i23 = c0382a.f36535i;
                                        float f14 = 0.05f;
                                        if (i23 != 0) {
                                            i13 = 1;
                                            if (i23 != 1) {
                                                i14 = 2;
                                                f10 = i23 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i14 = 2;
                                                f10 = 0.5f;
                                            }
                                        } else {
                                            i13 = 1;
                                            i14 = 2;
                                            f10 = 0.05f;
                                        }
                                        c0382a.f36534h = f10;
                                        if (i22 != 0) {
                                            f14 = i22 != i13 ? i22 != i14 ? -3.4028235E38f : 0.95f : 0.5f;
                                        }
                                        c0382a.f36531e = f14;
                                        c0382a.f36532f = 0;
                                    } else {
                                        c0382a.f36534h = pointF2.x / f11;
                                        c0382a.f36531e = pointF2.y / f12;
                                        c0382a.f36532f = 0;
                                    }
                                    a aVarA2 = c0382a.a();
                                    int iC = c(jE2, arrayList2, arrayList);
                                    for (int iC2 = c(jE, arrayList2, arrayList); iC2 < iC; iC2++) {
                                        ((List) arrayList.get(iC2)).add(aVarA2);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetC;
                    aVar = aVarA;
                    rVar = rVar2;
                } else {
                    charset = charsetC;
                    aVar = aVarA;
                    rVar = rVar2;
                }
                bVar2 = this;
                bVar3 = bVar;
                rVar2 = rVar;
                charsetC = charset;
                aVarA = aVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x02cf  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d(r rVar, Charset charset) {
        int i10;
        c cVar;
        float f10;
        int i11;
        int i12;
        float f11;
        int i13 = 6;
        int i14 = 7;
        int i15 = 2;
        int i16 = 0;
        while (true) {
            String strI = rVar.i(charset);
            if (strI == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strI)) {
                while (true) {
                    String strI2 = rVar.i(charset);
                    if (strI2 == null || (rVar.a() != 0 && rVar.d(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strI2.split(":");
                    if (strArrSplit.length == i15) {
                        String strL = e.l(strArrSplit[i16].trim());
                        strL.getClass();
                        if (strL.equals("playresx")) {
                            this.f20517e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strL.equals("playresy")) {
                            try {
                                this.f20518f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if ("[V4+ Styles]".equalsIgnoreCase(strI)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c.a aVar = null;
                    while (true) {
                        String strI3 = rVar.i(charset);
                        if (strI3 != null && (rVar.a() == 0 || rVar.d(charset) != '[')) {
                            if (strI3.startsWith("Format:")) {
                                String[] strArrSplit2 = TextUtils.split(strI3.substring(i14), ",");
                                int i17 = -1;
                                int i18 = -1;
                                int i19 = -1;
                                int i20 = -1;
                                int i21 = -1;
                                int i22 = -1;
                                int i23 = -1;
                                int i24 = -1;
                                int i25 = -1;
                                int i26 = -1;
                                for (int i27 = i16; i27 < strArrSplit2.length; i27++) {
                                    String strL2 = e.l(strArrSplit2[i27].trim());
                                    strL2.getClass();
                                    switch (strL2.hashCode()) {
                                        case -1178781136:
                                            i10 = strL2.equals("italic") ? i16 : -1;
                                            break;
                                        case -1026963764:
                                            i10 = strL2.equals("underline") ? 1 : -1;
                                            break;
                                        case -192095652:
                                            i10 = strL2.equals("strikeout") ? i15 : -1;
                                            break;
                                        case -70925746:
                                            i10 = strL2.equals("primarycolour") ? 3 : -1;
                                            break;
                                        case 3029637:
                                            i10 = strL2.equals("bold") ? 4 : -1;
                                            break;
                                        case 3373707:
                                            i10 = strL2.equals("name") ? 5 : -1;
                                            break;
                                        case 366554320:
                                            i10 = strL2.equals("fontsize") ? i13 : -1;
                                            break;
                                        case 767321349:
                                            i10 = strL2.equals("borderstyle") ? 7 : -1;
                                            break;
                                        case 1767875043:
                                            i10 = strL2.equals("alignment") ? 8 : -1;
                                            break;
                                        case 1988365454:
                                            i10 = strL2.equals("outlinecolour") ? 9 : -1;
                                            break;
                                        default:
                                            i10 = -1;
                                            break;
                                    }
                                    switch (i10) {
                                        case 0:
                                            i23 = i27;
                                            break;
                                        case 1:
                                            i24 = i27;
                                            break;
                                        case 2:
                                            i25 = i27;
                                            break;
                                        case 3:
                                            i19 = i27;
                                            break;
                                        case 4:
                                            i22 = i27;
                                            break;
                                        case 5:
                                            i17 = i27;
                                            break;
                                        case 6:
                                            i21 = i27;
                                            break;
                                        case 7:
                                            i26 = i27;
                                            break;
                                        case 8:
                                            i18 = i27;
                                            break;
                                        case 9:
                                            i20 = i27;
                                            break;
                                    }
                                }
                                aVar = i17 != -1 ? new c.a(i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, strArrSplit2.length) : null;
                                i14 = 7;
                            } else {
                                if (strI3.startsWith("Style:")) {
                                    if (aVar == null) {
                                        k.f("Skipping 'Style:' line before 'Format:' line: ".concat(strI3));
                                    } else {
                                        p241t7.b.e(strI3.startsWith("Style:"));
                                        String[] strArrSplit3 = TextUtils.split(strI3.substring(i13), ",");
                                        int length = strArrSplit3.length;
                                        int i28 = aVar.f20537k;
                                        if (length != i28) {
                                            int length2 = strArrSplit3.length;
                                            int i29 = A.f40996a;
                                            Locale locale = Locale.US;
                                            StringBuilder sbA = B6.a.a("Skipping malformed 'Style:' line (expected ", " values, found ", "): '", i28, length2);
                                            sbA.append(strI3);
                                            sbA.append("'");
                                            k.f(sbA.toString());
                                        } else {
                                            try {
                                                String strTrim = strArrSplit3[aVar.f20528a].trim();
                                                int i30 = aVar.f20529b;
                                                int iA = i30 != -1 ? c.a(strArrSplit3[i30].trim()) : -1;
                                                int i31 = aVar.f20530c;
                                                Integer numC = i31 != -1 ? c.c(strArrSplit3[i31].trim()) : null;
                                                int i32 = aVar.f20531d;
                                                Integer numC2 = i32 != -1 ? c.c(strArrSplit3[i32].trim()) : null;
                                                int i33 = aVar.f20532e;
                                                if (i33 != -1) {
                                                    String strTrim2 = strArrSplit3[i33].trim();
                                                    try {
                                                        f11 = Float.parseFloat(strTrim2);
                                                    } catch (NumberFormatException e10) {
                                                        k.g("Failed to parse font size: '" + strTrim2 + "'", e10);
                                                        f11 = -3.4028235E38f;
                                                    }
                                                    f10 = f11;
                                                } else {
                                                    f10 = -3.4028235E38f;
                                                }
                                                int i34 = aVar.f20533f;
                                                boolean z10 = i34 != -1 && c.b(strArrSplit3[i34].trim());
                                                int i35 = aVar.f20534g;
                                                boolean z11 = i35 != -1 && c.b(strArrSplit3[i35].trim());
                                                int i36 = aVar.f20535h;
                                                boolean z12 = i36 != -1 && c.b(strArrSplit3[i36].trim());
                                                int i37 = aVar.f20536i;
                                                boolean z13 = i37 != -1 && c.b(strArrSplit3[i37].trim());
                                                int i38 = aVar.j;
                                                if (i38 != -1) {
                                                    String strTrim3 = strArrSplit3[i38].trim();
                                                    try {
                                                        i12 = Integer.parseInt(strTrim3.trim());
                                                        if (i12 != 1 && i12 != 3) {
                                                            k.f("Ignoring unknown BorderStyle: " + strTrim3);
                                                            i12 = -1;
                                                        }
                                                    } catch (NumberFormatException unused2) {
                                                    }
                                                    i11 = i12;
                                                } else {
                                                    i11 = -1;
                                                }
                                                cVar = new c(strTrim, iA, numC, numC2, f10, z10, z11, z12, z13, i11);
                                            } catch (RuntimeException e11) {
                                                k.g("Skipping malformed 'Style:' line: '" + strI3 + "'", e11);
                                                cVar = null;
                                            }
                                            if (cVar != null) {
                                                linkedHashMap.put(cVar.f20519a, cVar);
                                            }
                                        }
                                        cVar = null;
                                        if (cVar != null) {
                                            linkedHashMap.put(cVar.f20519a, cVar);
                                        }
                                    }
                                }
                                i13 = 6;
                                i14 = 7;
                                i15 = 2;
                                i16 = 0;
                            }
                        }
                    }
                    this.f20516d = linkedHashMap;
                } else if ("[V4 Styles]".equalsIgnoreCase(strI)) {
                    k.e("[V4 Styles] are not supported");
                } else if ("[Events]".equalsIgnoreCase(strI)) {
                    return;
                }
                i13 = 6;
                i14 = 7;
                i15 = 2;
                i16 = 0;
            }
        }
    }
}
