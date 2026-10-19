package com.google.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2069k extends AbstractC2061c<Double> implements RandomAccess, T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f29180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29181d;

    static {
        new C2069k(new double[0], 0).f29134b = false;
    }

    public C2069k() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f29181d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29181d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        double[] dArr = this.f29180c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f29180c, i10, dArr2, i10 + 1, this.f29181d - i10);
            this.f29180c = dArr2;
        }
        this.f29180c[i10] = dDoubleValue;
        this.f29181d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = C2078u.f29200a;
        collection.getClass();
        if (!(collection instanceof C2069k)) {
            return super.addAll(collection);
        }
        C2069k c2069k = (C2069k) collection;
        int i10 = c2069k.f29181d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29181d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f29180c;
        if (i12 > dArr.length) {
            this.f29180c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2069k.f29180c, 0, this.f29180c, this.f29181d, c2069k.f29181d);
        this.f29181d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d10) {
        d();
        int i10 = this.f29181d;
        double[] dArr = this.f29180c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f29180c = dArr2;
        }
        double[] dArr3 = this.f29180c;
        int i11 = this.f29181d;
        this.f29181d = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2069k)) {
            return super.equals(obj);
        }
        C2069k c2069k = (C2069k) obj;
        if (this.f29181d != c2069k.f29181d) {
            return false;
        }
        double[] dArr = c2069k.f29180c;
        for (int i10 = 0; i10 < this.f29181d; i10++) {
            if (Double.doubleToLongBits(this.f29180c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f29181d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29181d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f29180c[i10]);
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        if (i10 >= this.f29181d) {
            return new C2069k(Arrays.copyOf(this.f29180c, i10), this.f29181d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f29181d; i10++) {
            iB = (iB * 31) + C2078u.b(Double.doubleToLongBits(this.f29180c[i10]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f29181d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29180c[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        double[] dArr = this.f29180c;
        double d10 = dArr[i10];
        int i11 = this.f29181d;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f29181d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f29180c;
        System.arraycopy(dArr, i11, dArr, i10, this.f29181d - i11);
        this.f29181d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        g(i10);
        double[] dArr = this.f29180c;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29181d;
    }

    public C2069k(double[] dArr, int i10) {
        this.f29180c = dArr;
        this.f29181d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
