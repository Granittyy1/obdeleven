package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2 extends AbstractC1914u2<Double> implements A3, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f25409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25410d;

    static {
        new C2(new double[0], 0, false);
    }

    public C2() {
        this(new double[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f25410d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25410d, "Index:", ", Size:"));
        }
        double[] dArr = this.f25409c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f25409c, i10, dArr2, i10 + 1, this.f25410d - i10);
            this.f25409c = dArr2;
        }
        this.f25409c[i10] = dDoubleValue;
        this.f25410d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = Q2.f25563a;
        collection.getClass();
        if (!(collection instanceof C2)) {
            return super.addAll(collection);
        }
        C2 c10 = (C2) collection;
        int i10 = c10.f25410d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25410d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f25409c;
        if (i12 > dArr.length) {
            this.f25409c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c10.f25409c, 0, this.f25409c, this.f25410d, c10.f25410d);
        this.f25410d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final /* synthetic */ V2 c(int i10) {
        if (i10 >= this.f25410d) {
            return new C2(Arrays.copyOf(this.f25409c, i10), this.f25410d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d10) {
        d();
        int i10 = this.f25410d;
        double[] dArr = this.f25409c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f25409c = dArr2;
        }
        double[] dArr3 = this.f25409c;
        int i11 = this.f25410d;
        this.f25410d = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2)) {
            return super.equals(obj);
        }
        C2 c10 = (C2) obj;
        if (this.f25410d != c10.f25410d) {
            return false;
        }
        double[] dArr = c10.f25409c;
        for (int i10 = 0; i10 < this.f25410d; i10++) {
            if (Double.doubleToLongBits(this.f25409c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f25410d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25410d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f25409c[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f25410d; i10++) {
            iA = (iA * 31) + Q2.a(Double.doubleToLongBits(this.f25409c[i10]));
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f25410d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25409c[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        double[] dArr = this.f25409c;
        double d10 = dArr[i10];
        int i11 = this.f25410d;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f25410d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f25409c;
        System.arraycopy(dArr, i11, dArr, i10, this.f25410d - i11);
        this.f25410d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        g(i10);
        double[] dArr = this.f25409c;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25410d;
    }

    public C2(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f25409c = dArr;
        this.f25410d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
