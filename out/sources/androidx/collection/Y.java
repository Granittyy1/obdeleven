package androidx.collection;

import java.util.Arrays;

/* JADX INFO: compiled from: SparseArrayCompat.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Y<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f9140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int[] f9141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f9142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f9143e;

    public Y() {
        this(0);
    }

    public final void a(int i10, E e10) {
        int i11 = this.f9143e;
        if (i11 != 0 && i10 <= this.f9141c[i11 - 1]) {
            e(i10, e10);
            return;
        }
        if (this.f9140b && i11 >= this.f9141c.length) {
            Z.a(this);
        }
        int i12 = this.f9143e;
        if (i12 >= this.f9141c.length) {
            int i13 = (i12 + 1) * 4;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f9141c, i16);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f9141c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9142d, i16);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f9142d = objArrCopyOf;
        }
        this.f9141c[i12] = i10;
        this.f9142d[i12] = e10;
        this.f9143e = i12 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Y<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.i.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Y<E> y10 = (Y) objClone;
        y10.f9141c = (int[]) this.f9141c.clone();
        y10.f9142d = (Object[]) this.f9142d.clone();
        return y10;
    }

    public final E c(int i10) {
        E e10;
        int iA = p233t.a.a(this.f9143e, i10, this.f9141c);
        if (iA < 0 || (e10 = (E) this.f9142d[iA]) == Z.f9144a) {
            return null;
        }
        return e10;
    }

    public final int d(int i10) {
        if (this.f9140b) {
            Z.a(this);
        }
        return this.f9141c[i10];
    }

    public final void e(int i10, E e10) {
        int iA = p233t.a.a(this.f9143e, i10, this.f9141c);
        if (iA >= 0) {
            this.f9142d[iA] = e10;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f9143e;
        if (i11 < i12) {
            Object[] objArr = this.f9142d;
            if (objArr[i11] == Z.f9144a) {
                this.f9141c[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f9140b && i12 >= this.f9141c.length) {
            Z.a(this);
            i11 = ~p233t.a.a(this.f9143e, i10, this.f9141c);
        }
        int i13 = this.f9143e;
        if (i13 >= this.f9141c.length) {
            int i14 = (i13 + 1) * 4;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f9141c, i17);
            kotlin.jvm.internal.i.d(iArrCopyOf, "copyOf(...)");
            this.f9141c = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9142d, i17);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f9142d = objArrCopyOf;
        }
        int i18 = this.f9143e;
        if (i18 - i11 != 0) {
            int[] iArr = this.f9141c;
            int i19 = i11 + 1;
            Q3.d.m(i19, i11, i18, iArr, iArr);
            Object[] objArr2 = this.f9142d;
            Q3.d.n(i19, i11, this.f9143e, objArr2, objArr2);
        }
        this.f9141c[i11] = i10;
        this.f9142d[i11] = e10;
        this.f9143e++;
    }

    public final int f() {
        if (this.f9140b) {
            Z.a(this);
        }
        return this.f9143e;
    }

    public final E g(int i10) {
        if (this.f9140b) {
            Z.a(this);
        }
        Object[] objArr = this.f9142d;
        if (i10 < objArr.length) {
            return (E) objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9143e * 28);
        sb2.append('{');
        int i10 = this.f9143e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            E eG = g(i11);
            if (eG != this) {
                sb2.append(eG);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public Y(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f9141c = new int[i14];
        this.f9142d = new Object[i14];
    }
}
