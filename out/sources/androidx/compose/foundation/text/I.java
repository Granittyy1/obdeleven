package androidx.compose.foundation.text;

import androidx.compose.ui.text.C1260a;

/* JADX INFO: compiled from: ValidatingOffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f11125a = new H(androidx.compose.ui.text.input.r.a.f15560a, 0, 0);

    public static final androidx.compose.ui.text.input.D a(androidx.compose.ui.text.input.E e10, C1260a c1260a) {
        androidx.compose.ui.text.input.r rVar;
        androidx.compose.ui.text.input.D dE = e10.e(c1260a);
        int length = c1260a.f15408c.length();
        C1260a c1260a2 = dE.f15484a;
        int length2 = c1260a2.f15408c.length();
        int iMin = Math.min(length, 100);
        int i10 = 0;
        while (true) {
            rVar = dE.f15485b;
            if (i10 >= iMin) {
                break;
            }
            b(rVar.b(i10), length2, i10);
            i10++;
        }
        b(rVar.b(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i11 = 0; i11 < iMin2; i11++) {
            c(rVar.a(i11), length, i11);
        }
        c(rVar.a(length2), length, length2);
        return new androidx.compose.ui.text.input.D(c1260a2, new H(rVar, c1260a.f15408c.length(), c1260a2.f15408c.length()));
    }

    public static final void b(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = B6.a.a("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ", i12, i10);
        sbA.append(i11);
        sbA.append(']');
        p245u.c.c(sbA.toString());
    }

    public static final void c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder sbA = B6.a.a("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ", i12, i10);
        sbA.append(i11);
        sbA.append(']');
        p245u.c.c(sbA.toString());
    }
}
