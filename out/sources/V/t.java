package V;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: compiled from: LayoutHelper.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f6645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f6646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f6647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f6648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public char[] f6649e;

    /* JADX INFO: compiled from: LayoutHelper.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6652c;

        public a(int i10, int i11, boolean z10) {
            this.f6650a = i10;
            this.f6651b = i11;
            this.f6652c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6650a == aVar.f6650a && this.f6651b == aVar.f6651b && this.f6652c == aVar.f6652c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f6652c) + p005a4.q.b(this.f6651b, Integer.hashCode(this.f6650a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BidiRun(start=");
            sb2.append(this.f6650a);
            sb2.append(", end=");
            sb2.append(this.f6651b);
            sb2.append(", isRtl=");
            return Z3.o.d(sb2, this.f6652c, ')');
        }
    }

    public t(Layout layout) {
        this.f6645a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iP = kotlin.text.n.P(this.f6645a.getText(), '\n', length, false, 4);
            length = iP < 0 ? this.f6645a.getText().length() : iP + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f6645a.getText().length());
        this.f6646b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f6647c = arrayList2;
        this.f6648d = new boolean[this.f6646b.size()];
        this.f6646b.size();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public final Bidi a(int i10) {
        Bidi bidi;
        boolean[] zArr = this.f6648d;
        boolean z10 = zArr[i10];
        ArrayList arrayList = this.f6647c;
        if (z10) {
            return (Bidi) arrayList.get(i10);
        }
        ArrayList arrayList2 = this.f6646b;
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList2.get(i10 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList2.get(i10)).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = this.f6649e;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        Layout layout = this.f6645a;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, layout.getParagraphDirection(layout.getLineForOffset(e(i10))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList.set(i10, bidi);
        zArr[i10] = true;
        if (bidi != null) {
            char[] cArr3 = this.f6649e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f6649e = cArr2;
        return bidi;
    }

    public final float b(int i10, boolean z10) {
        Layout layout = this.f6645a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int iF = i10;
        if (!z11) {
            return b(i10, z10);
        }
        Layout layout = this.f6645a;
        int iO = O.e.o(layout, iF, z11);
        int lineStart = layout.getLineStart(iO);
        int lineEnd = layout.getLineEnd(iO);
        if (iF != lineStart && iF != lineEnd) {
            return b(i10, z10);
        }
        if (iF == 0 || iF == layout.getText().length()) {
            return b(i10, z10);
        }
        int iD = d(iF, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(e(iD))) == -1;
        int iF2 = f(lineEnd, lineStart);
        int iE = e(iD);
        int i13 = lineStart - iE;
        int i14 = iF2 - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return iF == lineStart ? z12 : !z12 ? layout.getLineLeft(iO) : layout.getLineRight(iO);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            aVarArr[i15] = new a(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (iF == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (aVarArr[i17].f6650a == iF) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z13 = (z10 || z12 == aVarArr[i12].f6652c) ? !z12 : z12;
            if (i12 == 0 && z13) {
                return layout.getLineLeft(iO);
            }
            if (i12 != runCount - 1 || z13) {
                return z13 ? layout.getPrimaryHorizontal(aVarArr[i12 - 1].f6650a) : layout.getPrimaryHorizontal(aVarArr[i12 + 1].f6650a);
            }
            return layout.getLineRight(iO);
        }
        if (iF > iF2) {
            iF = f(iF, lineStart);
        }
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (aVarArr[i18].f6651b == iF) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z14 = (z10 || z12 == aVarArr[i11].f6652c) ? z12 : !z12;
        if (i11 == 0 && z14) {
            return layout.getLineLeft(iO);
        }
        if (i11 != runCount - 1 || z14) {
            return z14 ? layout.getPrimaryHorizontal(aVarArr[i11 - 1].f6651b) : layout.getPrimaryHorizontal(aVarArr[i11 + 1].f6651b);
        }
        return layout.getLineRight(iO);
    }

    public final int d(int i10, boolean z10) {
        ArrayList arrayList = this.f6646b;
        int iP = kotlin.collections.l.p(arrayList, Integer.valueOf(i10));
        int i11 = iP < 0 ? -(iP + 1) : iP + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int e(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f6646b.get(i10 - 1)).intValue();
    }

    public final int f(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = this.f6645a.getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.i.g(cCharAt, 8192) < 0 || kotlin.jvm.internal.i.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                break;
            }
            i10--;
        }
        return i10;
    }
}
