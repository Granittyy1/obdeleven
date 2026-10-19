package p041d2;

import I.b;
import Q3.d;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.braze.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p102i1.a;
import p102i1.f;
import p102i1.g;
import p114j1.A;
import p114j1.k;

/* JADX INFO: compiled from: TtmlNode.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f34496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f34497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f34498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f34499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f34500i;
    public final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap<String, Integer> f34501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap<String, Integer> f34502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f34503m;

    public c(String str, String str2, long j, long j10, f fVar, String[] strArr, String str3, String str4, c cVar) {
        this.f34492a = str;
        this.f34493b = str2;
        this.f34500i = str4;
        this.f34497f = fVar;
        this.f34498g = strArr;
        this.f34494c = str2 != null;
        this.f34495d = j;
        this.f34496e = j10;
        str3.getClass();
        this.f34499h = str3;
        this.j = cVar;
        this.f34501k = new HashMap<>();
        this.f34502l = new HashMap<>();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a.C0382a c0382a = new a.C0382a();
            c0382a.f36527a = new SpannableStringBuilder();
            treeMap.put(str, c0382a);
        }
        CharSequence charSequence = ((a.C0382a) treeMap.get(str)).f36527a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f34503m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f34503m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet<Long> treeSet, boolean z10) {
        String str = this.f34492a;
        boolean zEquals = Constants.BRAZE_PUSH_PRIORITY_KEY.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f34500i != null)) {
            long j = this.f34495d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j10 = this.f34496e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f34503m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f34503m.size(); i10++) {
            ((c) this.f34503m.get(i10)).d(treeSet, z10 || zEquals);
        }
    }

    public final boolean f(long j) {
        long j10 = this.f34495d;
        long j11 = this.f34496e;
        return (j10 == -9223372036854775807L && j11 == -9223372036854775807L) || (j10 <= j && j11 == -9223372036854775807L) || ((j10 == -9223372036854775807L && j < j11) || (j10 <= j && j < j11));
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f34499h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f34492a) && (str2 = this.f34500i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0206  */
    /* JADX WARN: Code duplicated, block: B:145:0x0214  */
    /* JADX WARN: Code duplicated, block: B:147:0x0217  */
    /* JADX WARN: Code duplicated, block: B:149:0x021a  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x022d  */
    /* JADX WARN: Code duplicated, block: B:165:0x025e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0278  */
    /* JADX WARN: Code duplicated, block: B:169:0x0285  */
    /* JADX WARN: Code duplicated, block: B:172:0x029d  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    public final void h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator<Map.Entry<String, Integer>> it;
        int i10;
        c cVar;
        f fVarJ;
        int i11;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        float sizeChange;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        int i12;
        RelativeSizeSpan relativeSizeSpan;
        RelativeSizeSpan[] relativeSizeSpanArr2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = -1;
        int i18 = 1;
        if (f(j)) {
            String str2 = this.f34499h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator<Map.Entry<String, Integer>> it2 = this.f34502l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                String key = next.getKey();
                HashMap<String, Integer> map3 = this.f34501k;
                int iIntValue = map3.containsKey(key) ? map3.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    a.C0382a c0382a = (a.C0382a) treeMap.get(key);
                    c0382a.getClass();
                    e eVar = (e) map2.get(str3);
                    eVar.getClass();
                    f fVarJ2 = d.J(this.f34497f, this.f34498g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c0382a.f36527a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c0382a.f36527a = spannableStringBuilder;
                    }
                    if (fVarJ2 != null) {
                        int i19 = fVarJ2.f34534h;
                        if (((i19 == i17 && fVarJ2.f34535i == i17) ? i17 : (i19 == i18 ? i18 : 0) | (fVarJ2.f34535i == i18 ? 2 : 0)) != i17) {
                            int i20 = fVarJ2.f34534h;
                            if (i20 != i17) {
                                if (i20 == i18) {
                                    i14 = i18;
                                } else {
                                    i14 = 0;
                                }
                                if (fVarJ2.f34535i == i18) {
                                    i15 = 2;
                                } else {
                                    i15 = 0;
                                }
                                i16 = i14 | i15;
                            } else if (fVarJ2.f34535i == i17) {
                                i16 = i17;
                                i18 = 1;
                            } else {
                                i18 = 1;
                                if (i20 == i18) {
                                    i14 = i18;
                                } else {
                                    i14 = 0;
                                }
                                if (fVarJ2.f34535i == i18) {
                                    i15 = 2;
                                } else {
                                    i15 = 0;
                                }
                                i16 = i14 | i15;
                            }
                            StyleSpan styleSpan = new StyleSpan(i16);
                            i10 = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (fVarJ2.f34532f == i18) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarJ2.f34533g == i18) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (fVarJ2.f34529c) {
                            if (!fVarJ2.f34529c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            b.a(spannableStringBuilder, new ForegroundColorSpan(fVarJ2.f34528b), iIntValue, iIntValue2);
                        }
                        if (fVarJ2.f34531e) {
                            if (!fVarJ2.f34531e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            b.a(spannableStringBuilder, new BackgroundColorSpan(fVarJ2.f34530d), iIntValue, iIntValue2);
                        }
                        if (fVarJ2.f34527a != null) {
                            b.a(spannableStringBuilder, new TypefaceSpan(fVarJ2.f34527a), iIntValue, iIntValue2);
                        }
                        b bVar = fVarJ2.f34543r;
                        if (bVar != null) {
                            int i21 = bVar.f34489a;
                            if (i21 == i17) {
                                int i22 = eVar.j;
                                i21 = (i22 == 2 || i22 == 1) ? 3 : 1;
                                i13 = 1;
                            } else {
                                i13 = bVar.f34490b;
                            }
                            int i23 = bVar.f34491c;
                            if (i23 == -2) {
                                i23 = 1;
                            }
                            b.a(spannableStringBuilder, new g(i21, i13, i23), iIntValue, iIntValue2);
                        }
                        int i24 = fVarJ2.f34538m;
                        if (i24 == 2) {
                            c cVar2 = this.j;
                            while (true) {
                                if (cVar2 == null) {
                                    cVar2 = null;
                                    break;
                                }
                                f fVarJ3 = d.J(cVar2.f34497f, cVar2.f34498g, map);
                                if (fVarJ3 != null && fVarJ3.f34538m == 1) {
                                    break;
                                } else {
                                    cVar2 = cVar2.j;
                                }
                            }
                            if (cVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(cVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        cVar = null;
                                        break;
                                    }
                                    c cVar3 = (c) arrayDeque.pop();
                                    f fVarJ4 = d.J(cVar3.f34497f, cVar3.f34498g, map);
                                    if (fVarJ4 != null && fVarJ4.f34538m == 3) {
                                        cVar = cVar3;
                                        break;
                                    }
                                    for (int iC = cVar3.c() - 1; iC >= 0; iC--) {
                                        arrayDeque.push(cVar3.b(iC));
                                    }
                                }
                                if (cVar != null) {
                                    if (cVar.c() != 1 || cVar.b(0).f34493b == null) {
                                        k.e("Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = cVar.b(0).f34493b;
                                        int i25 = A.f40996a;
                                        f fVarJ5 = d.J(cVar.f34497f, cVar.f34498g, map);
                                        int i26 = fVarJ5 != null ? fVarJ5.f34539n : -1;
                                        if (i26 == -1 && (fVarJ = d.J(cVar2.f34497f, cVar2.f34498g, map)) != null) {
                                            i26 = fVarJ.f34539n;
                                        }
                                        spannableStringBuilder.setSpan(new f(str4, i26), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                            if (fVarJ2.f34542q == 1) {
                                b.a(spannableStringBuilder, new p102i1.d(), iIntValue, iIntValue2);
                            }
                            i11 = fVarJ2.j;
                            if (i11 != 1) {
                                it = it2;
                                b.a(spannableStringBuilder, new AbsoluteSizeSpan((int) fVarJ2.f34536k, true), iIntValue, iIntValue2);
                            } else if (i11 != 2) {
                                it = it2;
                                b.a(spannableStringBuilder, new RelativeSizeSpan(fVarJ2.f34536k), iIntValue, iIntValue2);
                            } else if (i11 != 3) {
                                it = it2;
                            } else {
                                sizeChange = fVarJ2.f34536k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                i12 = 0;
                                while (i12 < length) {
                                    relativeSizeSpan = relativeSizeSpanArr[i12];
                                    Iterator<Map.Entry<String, Integer>> it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        relativeSizeSpanArr2 = relativeSizeSpanArr;
                                    } else {
                                        relativeSizeSpanArr2 = relativeSizeSpanArr;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i12++;
                                    it2 = it3;
                                    relativeSizeSpanArr = relativeSizeSpanArr2;
                                }
                                it = it2;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if (Constants.BRAZE_PUSH_PRIORITY_KEY.equals(this.f34492a)) {
                                f10 = fVarJ2.f34544s;
                                if (f10 != Float.MAX_VALUE) {
                                    c0382a.f36542q = (f10 * (-90.0f)) / 100.0f;
                                }
                                alignment = fVarJ2.f34540o;
                                if (alignment != null) {
                                    c0382a.f36529c = alignment;
                                }
                                alignment2 = fVarJ2.f34541p;
                                if (alignment2 != null) {
                                    c0382a.f36530d = alignment2;
                                }
                            }
                        } else if (i24 == 3 || i24 == 4) {
                            spannableStringBuilder.setSpan(new a(), iIntValue, iIntValue2, 33);
                        }
                        if (fVarJ2.f34542q == 1) {
                            b.a(spannableStringBuilder, new p102i1.d(), iIntValue, iIntValue2);
                        }
                        i11 = fVarJ2.j;
                        if (i11 != 1) {
                            it = it2;
                            b.a(spannableStringBuilder, new AbsoluteSizeSpan((int) fVarJ2.f34536k, true), iIntValue, iIntValue2);
                        } else if (i11 != 2) {
                            it = it2;
                            b.a(spannableStringBuilder, new RelativeSizeSpan(fVarJ2.f34536k), iIntValue, iIntValue2);
                        } else if (i11 != 3) {
                            it = it2;
                        } else {
                            sizeChange = fVarJ2.f34536k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            i12 = 0;
                            while (i12 < length) {
                                relativeSizeSpan = relativeSizeSpanArr[i12];
                                Iterator<Map.Entry<String, Integer>> it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    relativeSizeSpanArr2 = relativeSizeSpanArr;
                                } else {
                                    relativeSizeSpanArr2 = relativeSizeSpanArr;
                                }
                                i12++;
                                it2 = it4;
                                relativeSizeSpanArr = relativeSizeSpanArr2;
                            }
                            it = it2;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if (Constants.BRAZE_PUSH_PRIORITY_KEY.equals(this.f34492a)) {
                            f10 = fVarJ2.f34544s;
                            if (f10 != Float.MAX_VALUE) {
                                c0382a.f36542q = (f10 * (-90.0f)) / 100.0f;
                            }
                            alignment = fVarJ2.f34540o;
                            if (alignment != null) {
                                c0382a.f36529c = alignment;
                            }
                            alignment2 = fVarJ2.f34541p;
                            if (alignment2 != null) {
                                c0382a.f36530d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                    i17 = -1;
                    i18 = 1;
                }
                it = it2;
                it2 = it;
                i17 = -1;
                i18 = 1;
            }
            for (int i27 = 0; i27 < c(); i27++) {
                b(i27).h(j, map, map2, str3, treeMap);
            }
        }
    }

    public final void i(long j, boolean z10, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f34501k;
        map.clear();
        HashMap<String, Integer> map2 = this.f34502l;
        map2.clear();
        String str2 = this.f34492a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f34499h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f34494c && z10) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f34493b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((a.C0382a) entry.getValue()).f36527a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = Constants.BRAZE_PUSH_PRIORITY_KEY.equals(str2);
            for (int i10 = 0; i10 < c(); i10++) {
                b(i10).i(j, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((a.C0382a) entry2.getValue()).f36527a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
