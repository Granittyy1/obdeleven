package androidx.compose.ui.text.input;

import androidx.collection.C0875c;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0875c f15562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15564d;

    public final int a() {
        C0875c c0875c = this.f15562b;
        if (c0875c == null) {
            return this.f15561a.length();
        }
        return (c0875c.f9166b - c0875c.c()) + (this.f15561a.length() - (this.f15564d - this.f15563c));
    }

    public final void b(String str, int i10, int i11) {
        if (i10 > i11) {
            Y.a.a("start index must be less than or equal to end index: " + i10 + " > " + i11);
        }
        if (i10 < 0) {
            Y.a.a("start must be non-negative, but was " + i10);
        }
        C0875c c0875c = this.f15562b;
        if (c0875c == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i10, 64);
            int iMin2 = Math.min(this.f15561a.length() - i11, 64);
            String str2 = this.f15561a;
            int i12 = i10 - iMin;
            kotlin.jvm.internal.i.c(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i12, i10, cArr, 0);
            String str3 = this.f15561a;
            int i13 = iMax - iMin2;
            int i14 = iMin2 + i11;
            kotlin.jvm.internal.i.c(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i11, i14, cArr, i13);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0875c c0875c2 = new C0875c(1);
            c0875c2.f9166b = iMax;
            c0875c2.f9169e = cArr;
            c0875c2.f9167c = length;
            c0875c2.f9168d = i13;
            this.f15562b = c0875c2;
            this.f15563c = i12;
            this.f15564d = i14;
            return;
        }
        int i15 = this.f15563c;
        int i16 = i10 - i15;
        int i17 = i11 - i15;
        if (i16 < 0 || i17 > c0875c.f9166b - c0875c.c()) {
            this.f15561a = toString();
            this.f15562b = null;
            this.f15563c = -1;
            this.f15564d = -1;
            b(str, i10, i11);
            return;
        }
        int length2 = str.length() - (i17 - i16);
        if (length2 > c0875c.c()) {
            int iC = length2 - c0875c.c();
            int i18 = c0875c.f9166b;
            do {
                i18 *= 2;
            } while (i18 - c0875c.f9166b < iC);
            char[] cArr2 = new char[i18];
            Q3.d.o((char[]) c0875c.f9169e, cArr2, 0, 0, c0875c.f9167c);
            int i19 = c0875c.f9166b;
            int i20 = c0875c.f9168d;
            int i21 = i19 - i20;
            int i22 = i18 - i21;
            Q3.d.o((char[]) c0875c.f9169e, cArr2, i22, i20, i21 + i20);
            c0875c.f9169e = cArr2;
            c0875c.f9166b = i18;
            c0875c.f9168d = i22;
        }
        int i23 = c0875c.f9167c;
        if (i16 < i23 && i17 <= i23) {
            int i24 = i23 - i17;
            char[] cArr3 = (char[]) c0875c.f9169e;
            Q3.d.o(cArr3, cArr3, c0875c.f9168d - i24, i17, i23);
            c0875c.f9167c = i16;
            c0875c.f9168d -= i24;
        } else if (i16 >= i23 || i17 < i23) {
            int iC2 = c0875c.c() + i16;
            int iC3 = c0875c.c() + i17;
            int i25 = c0875c.f9168d;
            char[] cArr4 = (char[]) c0875c.f9169e;
            Q3.d.o(cArr4, cArr4, c0875c.f9167c, i25, iC2);
            c0875c.f9167c += iC2 - i25;
            c0875c.f9168d = iC3;
        } else {
            c0875c.f9168d = c0875c.c() + i17;
            c0875c.f9167c = i16;
        }
        str.getChars(0, str.length(), (char[]) c0875c.f9169e, c0875c.f9167c);
        c0875c.f9167c = str.length() + c0875c.f9167c;
    }

    public final String toString() {
        C0875c c0875c = this.f15562b;
        if (c0875c == null) {
            return this.f15561a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f15561a, 0, this.f15563c);
        sb2.append((char[]) c0875c.f9169e, 0, c0875c.f9167c);
        char[] cArr = (char[]) c0875c.f9169e;
        int i10 = c0875c.f9168d;
        sb2.append(cArr, i10, c0875c.f9166b - i10);
        String str = this.f15561a;
        sb2.append((CharSequence) str, this.f15564d, str.length());
        return sb2.toString();
    }
}
