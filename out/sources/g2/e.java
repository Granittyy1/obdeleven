package g2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.zhanghai.android.materialprogressbar.R;
import p114j1.A;
import p114j1.k;
import p114j1.r;

/* JADX INFO: compiled from: WebvttCueParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f35522a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f35523b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, Integer> f35524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<String, Integer> f35525d;

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final D6.d f35526c = new D6.d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f35527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35528b;

        public a(b bVar, int i10) {
            this.f35527a = bVar;
            this.f35528b = i10;
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f35531c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set<String> f35532d;

        public b(String str, int i10, String str2, Set<String> set) {
            this.f35530b = i10;
            this.f35529a = str;
            this.f35531c = str2;
            this.f35532d = set;
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g2.c f35534c;

        public c(int i10, g2.c cVar) {
            this.f35533b = i10;
            this.f35534c = cVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Integer.compare(this.f35533b, cVar.f35533b);
        }
    }

    /* JADX INFO: compiled from: WebvttCueParser.java */
    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f35537c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f35535a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f35536b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f35538d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f35539e = -3.4028235E38f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f35540f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f35541g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f35542h = -3.4028235E38f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f35543i = Integer.MIN_VALUE;
        public float j = 1.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f35544k = Integer.MIN_VALUE;

        /* JADX WARN: Code duplicated, block: B:20:0x0032  */
        /* JADX WARN: Code duplicated, block: B:21:0x0034  */
        /* JADX WARN: Code duplicated, block: B:29:0x004d  */
        /* JADX WARN: Code duplicated, block: B:31:0x0053  */
        /* JADX WARN: Code duplicated, block: B:39:0x0069  */
        public final p102i1.a.C0382a a() {
            Layout.Alignment alignment;
            float f10 = this.f35542h;
            float f11 = -3.4028235E38f;
            if (f10 == -3.4028235E38f) {
                int i10 = this.f35538d;
                if (i10 != 4) {
                    f10 = i10 != 5 ? 0.5f : 1.0f;
                } else {
                    f10 = 0.0f;
                }
            }
            int i11 = this.f35543i;
            if (i11 == Integer.MIN_VALUE) {
                int i12 = this.f35538d;
                if (i12 == 1) {
                    i11 = 0;
                } else if (i12 == 3) {
                    i11 = 2;
                } else if (i12 == 4) {
                    i11 = 0;
                } else if (i12 != 5) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
            }
            p102i1.a.C0382a c0382a = new p102i1.a.C0382a();
            int i13 = this.f35538d;
            if (i13 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i13 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i13 == 4) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i13 != 5) {
                com.google.gson.internal.b.e(i13, "Unknown textAlignment: ");
                alignment = null;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
            c0382a.f36529c = alignment;
            float f12 = this.f35539e;
            int i14 = this.f35540f;
            if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
                f11 = 1.0f;
            } else if (f12 != -3.4028235E38f) {
                f11 = f12;
            } else if (i14 == 0) {
                f11 = 1.0f;
            }
            c0382a.f36531e = f11;
            c0382a.f36532f = i14;
            c0382a.f36533g = this.f35541g;
            c0382a.f36534h = f10;
            c0382a.f36535i = i11;
            float f13 = this.j;
            if (i11 == 0) {
                f10 = 1.0f - f10;
            } else if (i11 == 1) {
                f10 = f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            } else if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
            c0382a.f36537l = Math.min(f13, f10);
            c0382a.f36541p = this.f35544k;
            CharSequence charSequence = this.f35537c;
            if (charSequence != null) {
                c0382a.f36527a = charSequence;
            }
            return c0382a;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f35524c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f35525d = Collections.unmodifiableMap(map2);
    }

    public static void a(String str, b bVar, List<a> list, SpannableStringBuilder spannableStringBuilder, List<g2.c> list2) {
        int i10;
        int i11 = bVar.f35530b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f35529a;
        str2.getClass();
        int i12 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i11, length, 33);
                break;
            case "c":
                for (String str3 : bVar.f35532d) {
                    Map<String, Integer> map = f35524c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i11, length, 33);
                    } else {
                        Map<String, Integer> map2 = f35525d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i11, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new p102i1.h(bVar.f35531c), i11, length, 33);
                break;
            case "ruby":
                int iC = c(list2, str, bVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, a.f35526c);
                int i13 = bVar.f35530b;
                int i14 = 0;
                int length2 = 0;
                while (i14 < arrayList.size()) {
                    if ("rt".equals(((a) arrayList.get(i14)).f35527a.f35529a)) {
                        a aVar = (a) arrayList.get(i14);
                        int iC2 = c(list2, str, aVar.f35527a);
                        if (iC2 == i12) {
                            iC2 = iC != i12 ? iC : 1;
                        }
                        int i15 = aVar.f35527a.f35530b - length2;
                        int i16 = aVar.f35528b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new p102i1.f(charSequenceSubSequence.toString(), iC2), i13, i15, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i13 = i15;
                    }
                    i14++;
                    i12 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, bVar);
        for (int i17 = 0; i17 < arrayListB.size(); i17++) {
            g2.c cVar = ((c) arrayListB.get(i17)).f35534c;
            int i18 = cVar.f35513l;
            if (i18 == -1 && cVar.f35514m == -1) {
                i10 = -1;
            } else {
                i10 = (cVar.f35514m == 1 ? (char) 2 : (char) 0) | (i18 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i19 = cVar.f35513l;
                I.b.a(spannableStringBuilder, new StyleSpan((i19 == -1 && cVar.f35514m == -1) ? -1 : (i19 == 1 ? 1 : 0) | (cVar.f35514m == 1 ? 2 : 0)), i11, length);
            }
            if (cVar.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i11, length, 33);
            }
            if (cVar.f35512k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (cVar.f35509g) {
                if (!cVar.f35509g) {
                    throw new IllegalStateException("Font color not defined");
                }
                I.b.a(spannableStringBuilder, new ForegroundColorSpan(cVar.f35508f), i11, length);
            }
            if (cVar.f35511i) {
                if (!cVar.f35511i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                I.b.a(spannableStringBuilder, new BackgroundColorSpan(cVar.f35510h), i11, length);
            }
            if (cVar.f35507e != null) {
                I.b.a(spannableStringBuilder, new TypefaceSpan(cVar.f35507e), i11, length);
            }
            int i20 = cVar.f35515n;
            if (i20 == 1) {
                I.b.a(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.f35516o, true), i11, length);
            } else if (i20 == 2) {
                I.b.a(spannableStringBuilder, new RelativeSizeSpan(cVar.f35516o), i11, length);
            } else if (i20 == 3) {
                I.b.a(spannableStringBuilder, new RelativeSizeSpan(cVar.f35516o / 100.0f), i11, length);
            }
            if (cVar.f35518q) {
                spannableStringBuilder.setSpan(new p102i1.d(), i11, length, 33);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static ArrayList b(List list, String str, b bVar) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            g2.c cVar = (g2.c) list.get(i10);
            String str2 = bVar.f35529a;
            if (cVar.f35503a.isEmpty() && cVar.f35504b.isEmpty() && cVar.f35505c.isEmpty() && cVar.f35506d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = g2.c.a(g2.c.a(g2.c.a(0, 1073741824, cVar.f35503a, str), 2, cVar.f35504b, str2), 4, cVar.f35506d, bVar.f35531c);
                if (iA != -1) {
                    if (bVar.f35532d.containsAll(cVar.f35505c)) {
                        size = iA + (cVar.f35505c.size() * 4);
                    } else {
                        r10 = 0;
                    }
                } else {
                    r10 = 0;
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new c(r10, cVar));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<g2.c> list, String str, b bVar) {
        ArrayList arrayListB = b(list, str, bVar);
        for (int i10 = 0; i10 < arrayListB.size(); i10++) {
            int i11 = ((c) arrayListB.get(i10)).f35534c.f35517p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static g2.d d(String str, Matcher matcher, r rVar, ArrayList arrayList) {
        d dVar = new d();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            dVar.f35535a = g.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            dVar.f35536b = g.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, dVar);
            StringBuilder sb2 = new StringBuilder();
            rVar.getClass();
            String strI = rVar.i(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strI)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strI.trim());
                strI = rVar.i(StandardCharsets.UTF_8);
            }
            dVar.f35537c = f(str, sb2.toString(), arrayList);
            return new g2.d(dVar.a().a(), dVar.f35535a, dVar.f35536b);
        } catch (IllegalArgumentException unused) {
            k.f("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, d dVar) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = f35523b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, dVar);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i10 = 2;
                            break;
                        case "end":
                            i10 = 3;
                            break;
                        case "left":
                            i10 = 4;
                            break;
                        case "right":
                            i10 = 5;
                            break;
                        case "start":
                            i10 = 1;
                            break;
                        default:
                            k.f("Invalid alignment value: ".concat(strGroup2));
                            i10 = 2;
                            break;
                    }
                    dVar.f35538d = i10;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i11 = 0;
                                break;
                            case "center":
                            case "middle":
                                i11 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i11 = 2;
                                break;
                            default:
                                k.f("Invalid anchor value: ".concat(strSubstring));
                                i11 = Integer.MIN_VALUE;
                                break;
                        }
                        dVar.f35543i = i11;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    dVar.f35542h = g.a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    dVar.j = g.a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i12 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i12 = 1;
                    } else {
                        k.f("Invalid 'vertical' value: ".concat(strGroup2));
                        i12 = Integer.MIN_VALUE;
                    }
                    dVar.f35544k = i12;
                } else {
                    k.f("Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                k.f("Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x00fb. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SpannedString f(String str, String str2, List<g2.c> list) {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13 = -1;
        int i14 = 2;
        int i15 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i16 = 0;
        while (true) {
            String strTrim = "";
            if (i16 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (b) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new b("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i16);
            if (cCharAt != '&') {
                if (cCharAt != '<') {
                    spannableStringBuilder.append(cCharAt);
                    i16 += i15;
                } else {
                    int i17 = i16 + 1;
                    if (i17 >= str2.length()) {
                        i16 = i17;
                    } else {
                        int i18 = str2.charAt(i17) == '/' ? i15 : 0;
                        int iIndexOf = str2.indexOf(62, i17);
                        int length = iIndexOf == i13 ? str2.length() : iIndexOf + i15;
                        int i19 = length - 2;
                        int i20 = str2.charAt(i19) == '/' ? i15 : 0;
                        int i21 = i16 + (i18 != 0 ? i14 : i15);
                        if (i20 == 0) {
                            i19 = length - 1;
                        }
                        String strSubstring = str2.substring(i21, i19);
                        if (!strSubstring.trim().isEmpty()) {
                            String strTrim2 = strSubstring.trim();
                            p241t7.b.e(strTrim2.isEmpty() ^ i15);
                            int i22 = A.f40996a;
                            String str3 = strTrim2.split("[ \\.]", i14)[0];
                            str3.getClass();
                            switch (str3.hashCode()) {
                                case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                                    if (str3.equals("b")) {
                                        i12 = 0;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                                    if (str3.equals("c")) {
                                        i12 = i15;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 105:
                                    if (str3.equals("i")) {
                                        i12 = i14;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                                    if (str3.equals("u")) {
                                        i12 = 3;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                    if (str3.equals("v")) {
                                        i12 = 4;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3650:
                                    if (str3.equals("rt")) {
                                        i12 = 5;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3314158:
                                    if (str3.equals("lang")) {
                                        i12 = 6;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                case 3511770:
                                    if (str3.equals("ruby")) {
                                        i12 = 7;
                                    } else {
                                        i12 = -1;
                                    }
                                    break;
                                default:
                                    i12 = -1;
                                    break;
                            }
                            switch (i12) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i18 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            b bVar = (b) arrayDeque.pop();
                                            a(str, bVar, arrayList, spannableStringBuilder, list);
                                            if (arrayDeque.isEmpty()) {
                                                arrayList.clear();
                                            } else {
                                                arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                            }
                                            if (bVar.f35529a.equals(str3)) {
                                            }
                                        }
                                    } else if (i20 == 0) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring.trim();
                                        p241t7.b.e(strTrim3.isEmpty() ^ i15);
                                        int iIndexOf2 = strTrim3.indexOf(" ");
                                        if (iIndexOf2 == -1) {
                                            c10 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf2).trim();
                                            c10 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf2);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c10];
                                        HashSet hashSet = new HashSet();
                                        for (int i23 = i15; i23 < strArrSplit.length; i23 += i15) {
                                            hashSet.add(strArrSplit[i23]);
                                        }
                                        arrayDeque.push(new b(str4, length2, strTrim, hashSet));
                                    }
                                    i16 = length;
                                    i11 = i15;
                                    i10 = -1;
                                    break;
                                default:
                                    break;
                            }
                        }
                        i16 = length;
                        i13 = -1;
                    }
                }
                i11 = i15;
                i10 = i13;
            } else {
                i16 += i15;
                int iIndexOf3 = str2.indexOf(59, i16);
                int iIndexOf4 = str2.indexOf(32, i16);
                i10 = -1;
                if (iIndexOf3 == -1) {
                    iIndexOf3 = iIndexOf4;
                } else if (iIndexOf4 != -1) {
                    iIndexOf3 = Math.min(iIndexOf3, iIndexOf4);
                }
                if (iIndexOf3 != -1) {
                    String strSubstring2 = str2.substring(i16, iIndexOf3);
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            k.f("ignoring unsupported entity: '&" + strSubstring2 + ";'");
                            break;
                    }
                    if (iIndexOf3 == iIndexOf4) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = 1;
                    i16 = iIndexOf3 + 1;
                } else {
                    i11 = 1;
                    spannableStringBuilder.append(cCharAt);
                }
            }
            i13 = i10;
            i14 = 2;
            i15 = i11;
        }
    }

    public static void g(String str, d dVar) {
        int i10 = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    k.f("Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            dVar.f35541g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            dVar.f35539e = g.a(str);
            dVar.f35540f = 0;
        } else {
            dVar.f35539e = Integer.parseInt(str);
            dVar.f35540f = 1;
        }
    }
}
