package androidx.collection;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.collection.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LongSparseArray.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0891t<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f9210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ long[] f9211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object[] f9212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ int f9213e;

    public C0891t() {
        this((Object) null);
    }

    public final void a() {
        int i10 = this.f9213e;
        Object[] objArr = this.f9212d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f9213e = 0;
        this.f9210b = false;
    }

    public final E b(long j) {
        E e10;
        int iB = p233t.a.b(this.f9211c, this.f9213e, j);
        if (iB < 0 || (e10 = (E) this.f9212d[iB]) == C0892u.f9214a) {
            return null;
        }
        return e10;
    }

    public final int c(long j) {
        if (this.f9210b) {
            int i10 = this.f9213e;
            long[] jArr = this.f9211c;
            Object[] objArr = this.f9212d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C0892u.f9214a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f9210b = false;
            this.f9213e = i11;
        }
        return p233t.a.b(this.f9211c, this.f9213e, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.i.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0891t c0891t = (C0891t) objClone;
        c0891t.f9211c = (long[]) this.f9211c.clone();
        c0891t.f9212d = (Object[]) this.f9212d.clone();
        return c0891t;
    }

    public final long d(int i10) {
        if (!(i10 >= 0 && i10 < this.f9213e)) {
            D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f9210b) {
            int i11 = this.f9213e;
            long[] jArr = this.f9211c;
            Object[] objArr = this.f9212d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C0892u.f9214a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f9210b = false;
            this.f9213e = i12;
        }
        return this.f9211c[i10];
    }

    public final void e(Object obj, long j) {
        int iB = p233t.a.b(this.f9211c, this.f9213e, j);
        if (iB >= 0) {
            this.f9212d[iB] = obj;
            return;
        }
        int i10 = ~iB;
        int i11 = this.f9213e;
        Object obj2 = C0892u.f9214a;
        if (i10 < i11) {
            Object[] objArr = this.f9212d;
            if (objArr[i10] == obj2) {
                this.f9211c[i10] = j;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f9210b) {
            long[] jArr = this.f9211c;
            if (i11 >= jArr.length) {
                Object[] objArr2 = this.f9212d;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj3 = objArr2[i13];
                    if (obj3 != obj2) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr2[i12] = obj3;
                            objArr2[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f9210b = false;
                this.f9213e = i12;
                i10 = ~p233t.a.b(this.f9211c, i12, j);
            }
        }
        int i14 = this.f9213e;
        if (i14 >= this.f9211c.length) {
            int i15 = (i14 + 1) * 8;
            for (int i16 = 4; i16 < 32; i16++) {
                int i17 = (1 << i16) - 12;
                if (i15 <= i17) {
                    i15 = i17;
                    break;
                }
            }
            int i18 = i15 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f9211c, i18);
            kotlin.jvm.internal.i.d(jArrCopyOf, "copyOf(...)");
            this.f9211c = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f9212d, i18);
            kotlin.jvm.internal.i.d(objArrCopyOf, "copyOf(...)");
            this.f9212d = objArrCopyOf;
        }
        int i19 = this.f9213e;
        if (i19 - i10 != 0) {
            long[] jArr2 = this.f9211c;
            int i20 = i10 + 1;
            Q3.d.p(jArr2, jArr2, i20, i10, i19);
            Object[] objArr3 = this.f9212d;
            Q3.d.n(i20, i10, this.f9213e, objArr3, objArr3);
        }
        this.f9211c[i10] = j;
        this.f9212d[i10] = obj;
        this.f9213e++;
    }

    public final void f(long j) {
        int iB = p233t.a.b(this.f9211c, this.f9213e, j);
        if (iB >= 0) {
            Object[] objArr = this.f9212d;
            Object obj = objArr[iB];
            Object obj2 = C0892u.f9214a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f9210b = true;
            }
        }
    }

    public final int g() {
        if (this.f9210b) {
            int i10 = this.f9213e;
            long[] jArr = this.f9211c;
            Object[] objArr = this.f9212d;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C0892u.f9214a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f9210b = false;
            this.f9213e = i11;
        }
        return this.f9213e;
    }

    public final E h(int i10) {
        if (!(i10 >= 0 && i10 < this.f9213e)) {
            D9.o.q("Expected index to be within 0..size()-1, but was " + i10);
            throw null;
        }
        if (this.f9210b) {
            int i11 = this.f9213e;
            long[] jArr = this.f9211c;
            Object[] objArr = this.f9212d;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object obj = objArr[i13];
                if (obj != C0892u.f9214a) {
                    if (i13 != i12) {
                        jArr[i12] = jArr[i13];
                        objArr[i12] = obj;
                        objArr[i13] = null;
                    }
                    i12++;
                }
            }
            this.f9210b = false;
            this.f9213e = i12;
        }
        return (E) this.f9212d[i10];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f9213e * 28);
        sb2.append('{');
        int i10 = this.f9213e;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(d(i11));
            sb2.append('=');
            E eH = h(i11);
            if (eH != sb2) {
                sb2.append(eH);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }

    public C0891t(int i10) {
        if (i10 == 0) {
            this.f9211c = p233t.a.f46997b;
            this.f9212d = p233t.a.f46998c;
            return;
        }
        int i11 = i10 * 8;
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                i11 = i13;
                break;
            }
        }
        int i14 = i11 / 8;
        this.f9211c = new long[i14];
        this.f9212d = new Object[i14];
    }

    public /* synthetic */ C0891t(Object obj) {
        this(10);
    }
}
