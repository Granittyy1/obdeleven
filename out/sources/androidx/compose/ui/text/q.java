package androidx.compose.ui.text;

import A1.C0575j;
import java.util.ArrayList;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
@Ha.a
public final class q {
    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }

    public static final int b(int i10, ArrayList arrayList) {
        int i11;
        byte b10;
        int i12 = ((C1274j) kotlin.collections.q.V(arrayList)).f15584c;
        if (i10 > ((C1274j) kotlin.collections.q.V(arrayList)).f15584c) {
            Y.a.a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            C1274j c1274j = (C1274j) arrayList.get(i11);
            if (c1274j.f15583b > i10) {
                b10 = 1;
            } else {
                b10 = c1274j.f15584c <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 >= 0) {
                if (b10 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            StringBuilder sbE = A8.f.e(i11, "Found paragraph index ", " should be in range [0, ");
            sbE.append(arrayList.size());
            sbE.append(").\nDebug info: index=");
            sbE.append(i10);
            sbE.append(", paragraphs=[");
            sbE.append(p039d0.a.b(arrayList, null, new Ia.l<C1274j, CharSequence>() { // from class: androidx.compose.ui.text.MultiParagraphKt$findParagraphByIndex$2$1
                @Override // Ia.l
                public final CharSequence invoke(C1274j c1274j2) {
                    C1274j c1274j3 = c1274j2;
                    StringBuilder sb2 = new StringBuilder("[");
                    sb2.append(c1274j3.f15583b);
                    sb2.append(", ");
                    return C0575j.b(sb2, c1274j3.f15584c, ')');
                }
            }, 31));
            sbE.append(']');
            Y.a.a(sbE.toString());
        }
        return i11;
    }

    public static final int c(int i10, ArrayList arrayList) {
        byte b10;
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C1274j c1274j = (C1274j) arrayList.get(i12);
            if (c1274j.f15585d > i10) {
                b10 = 1;
            } else {
                b10 = c1274j.f15586e <= i10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i11 = i12 + 1;
            } else {
                if (b10 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int d(ArrayList arrayList, float f10) {
        byte b10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((C1274j) kotlin.collections.q.V(arrayList)).f15588g) {
            return kotlin.collections.l.r(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C1274j c1274j = (C1274j) arrayList.get(i11);
            if (c1274j.f15587f > f10) {
                b10 = 1;
            } else {
                b10 = c1274j.f15588g <= f10 ? (byte) -1 : (byte) 0;
            }
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void e(ArrayList arrayList, long j, Ia.l lVar) {
        int size = arrayList.size();
        for (int iB = b(E.e(j), arrayList); iB < size; iB++) {
            C1274j c1274j = (C1274j) arrayList.get(iB);
            if (c1274j.f15583b >= E.d(j)) {
                return;
            }
            if (c1274j.f15583b != c1274j.f15584c) {
                lVar.invoke(c1274j);
            }
        }
    }
}
