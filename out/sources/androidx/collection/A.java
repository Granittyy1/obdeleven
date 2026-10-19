package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0881i {
    public A(int i10) {
        this.f9183a = i10 == 0 ? C0886n.f9196a : new int[i10];
    }

    public final void c(int i10) {
        d(this.f9184b + 1);
        int[] iArr = this.f9183a;
        int i11 = this.f9184b;
        iArr[i11] = i10;
        this.f9184b = i11 + 1;
    }

    public final void d(int i10) {
        int[] iArr = this.f9183a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f9183a = iArrCopyOf;
        }
    }

    public final int e(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f9184b)) {
            D9.o.r("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f9183a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            Q3.d.m(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f9184b--;
        return i12;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f9184b) {
            D9.o.r("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f9183a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public /* synthetic */ A() {
        this(16);
    }
}
