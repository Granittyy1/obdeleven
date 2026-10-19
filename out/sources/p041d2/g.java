package p041d2;

import X1.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p102i1.a;
import p114j1.A;

/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f34547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f34548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, f> f34549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f34550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f34551f;

    public g(c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f34547b = cVar;
        this.f34550e = map2;
        this.f34551f = map3;
        this.f34549d = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        this.f34548c = jArr;
    }

    @Override // X1.h
    public final int a(long j) {
        long[] jArr = this.f34548c;
        int iA = A.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // X1.h
    public final long b(int i10) {
        return this.f34548c[i10];
    }

    @Override // X1.h
    public final List<a> c(long j) {
        c cVar = this.f34547b;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j, cVar.f34499h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j, false, cVar.f34499h, treeMap);
        HashMap map = this.f34550e;
        cVar.h(j, this.f34549d, map, cVar.f34499h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) this.f34551f.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                e eVar = (e) map.get(pair.first);
                eVar.getClass();
                a.C0382a c0382a = new a.C0382a();
                c0382a.f36528b = bitmapDecodeByteArray;
                c0382a.f36534h = eVar.f34519b;
                c0382a.f36535i = 0;
                c0382a.f36531e = eVar.f34520c;
                c0382a.f36532f = 0;
                c0382a.f36533g = eVar.f34522e;
                c0382a.f36537l = eVar.f34523f;
                c0382a.f36538m = eVar.f34524g;
                c0382a.f36541p = eVar.j;
                arrayList2.add(c0382a.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) map.get(entry.getKey());
            eVar2.getClass();
            a.C0382a c0382a2 = (a.C0382a) entry.getValue();
            CharSequence charSequence = c0382a2.f36527a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            c0382a2.f36531e = eVar2.f34520c;
            c0382a2.f36532f = eVar2.f34521d;
            c0382a2.f36533g = eVar2.f34522e;
            c0382a2.f36534h = eVar2.f34519b;
            c0382a2.f36537l = eVar2.f34523f;
            c0382a2.f36536k = eVar2.f34526i;
            c0382a2.j = eVar2.f34525h;
            c0382a2.f36541p = eVar2.j;
            arrayList2.add(c0382a2.a());
        }
        return arrayList2;
    }

    @Override // X1.h
    public final int e() {
        return this.f34548c.length;
    }
}
