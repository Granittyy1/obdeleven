package androidx.compose.ui.text.input;

import androidx.collection.C0875c;
import androidx.compose.ui.text.C1260a;

/* JADX INFO: compiled from: EditingBuffer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f15543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15547e;

    public i(C1260a c1260a, long j) {
        String str = c1260a.f15408c;
        s sVar = new s();
        sVar.f15561a = str;
        sVar.f15563c = -1;
        sVar.f15564d = -1;
        this.f15543a = sVar;
        this.f15544b = androidx.compose.ui.text.E.e(j);
        this.f15545c = androidx.compose.ui.text.E.d(j);
        this.f15546d = -1;
        this.f15547e = -1;
        int iE = androidx.compose.ui.text.E.e(j);
        int iD = androidx.compose.ui.text.E.d(j);
        String str2 = c1260a.f15408c;
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbE = A8.f.e(iE, "start (", ") offset is outside of text region ");
            sbE.append(str2.length());
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        if (iD < 0 || iD > str2.length()) {
            StringBuilder sbE2 = A8.f.e(iD, "end (", ") offset is outside of text region ");
            sbE2.append(str2.length());
            throw new IndexOutOfBoundsException(sbE2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(A8.f.d(iE, iD, "Do not set reversed range: ", " > "));
        }
    }

    public final void a(int i10, int i11) {
        long jB = O.h.b(i10, i11);
        this.f15543a.b("", i10, i11);
        long jO = F8.a.o(O.h.b(this.f15544b, this.f15545c), jB);
        h(androidx.compose.ui.text.E.e(jO));
        g(androidx.compose.ui.text.E.d(jO));
        int i12 = this.f15546d;
        if (i12 != -1) {
            long jO2 = F8.a.o(O.h.b(i12, this.f15547e), jB);
            if (androidx.compose.ui.text.E.b(jO2)) {
                this.f15546d = -1;
                this.f15547e = -1;
            } else {
                this.f15546d = androidx.compose.ui.text.E.e(jO2);
                this.f15547e = androidx.compose.ui.text.E.d(jO2);
            }
        }
    }

    public final char b(int i10) {
        s sVar = this.f15543a;
        C0875c c0875c = sVar.f15562b;
        if (c0875c == null) {
            return sVar.f15561a.charAt(i10);
        }
        if (i10 < sVar.f15563c) {
            return sVar.f15561a.charAt(i10);
        }
        int iC = c0875c.f9166b - c0875c.c();
        int i11 = sVar.f15563c;
        if (i10 >= iC + i11) {
            return sVar.f15561a.charAt(i10 - ((iC - sVar.f15564d) + i11));
        }
        int i12 = i10 - i11;
        int i13 = c0875c.f9167c;
        return i12 < i13 ? ((char[]) c0875c.f9169e)[i12] : ((char[]) c0875c.f9169e)[(i12 - i13) + c0875c.f9168d];
    }

    public final androidx.compose.ui.text.E c() {
        int i10 = this.f15546d;
        if (i10 != -1) {
            return new androidx.compose.ui.text.E(O.h.b(i10, this.f15547e));
        }
        return null;
    }

    public final void d(String str, int i10, int i11) {
        s sVar = this.f15543a;
        if (i10 < 0 || i10 > sVar.a()) {
            StringBuilder sbE = A8.f.e(i10, "start (", ") offset is outside of text region ");
            sbE.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        if (i11 < 0 || i11 > sVar.a()) {
            StringBuilder sbE2 = A8.f.e(i11, "end (", ") offset is outside of text region ");
            sbE2.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(A8.f.d(i10, i11, "Do not set reversed range: ", " > "));
        }
        sVar.b(str, i10, i11);
        h(str.length() + i10);
        g(str.length() + i10);
        this.f15546d = -1;
        this.f15547e = -1;
    }

    public final void e(int i10, int i11) {
        s sVar = this.f15543a;
        if (i10 < 0 || i10 > sVar.a()) {
            StringBuilder sbE = A8.f.e(i10, "start (", ") offset is outside of text region ");
            sbE.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        if (i11 < 0 || i11 > sVar.a()) {
            StringBuilder sbE2 = A8.f.e(i11, "end (", ") offset is outside of text region ");
            sbE2.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(A8.f.d(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.f15546d = i10;
        this.f15547e = i11;
    }

    public final void f(int i10, int i11) {
        s sVar = this.f15543a;
        if (i10 < 0 || i10 > sVar.a()) {
            StringBuilder sbE = A8.f.e(i10, "start (", ") offset is outside of text region ");
            sbE.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        if (i11 < 0 || i11 > sVar.a()) {
            StringBuilder sbE2 = A8.f.e(i11, "end (", ") offset is outside of text region ");
            sbE2.append(sVar.a());
            throw new IndexOutOfBoundsException(sbE2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(A8.f.d(i10, i11, "Do not set reversed range: ", " > "));
        }
        h(i10);
        g(i11);
    }

    public final void g(int i10) {
        if (!(i10 >= 0)) {
            Y.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f15545c = i10;
    }

    public final void h(int i10) {
        if (!(i10 >= 0)) {
            Y.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f15544b = i10;
    }

    public final String toString() {
        return this.f15543a.toString();
    }
}
