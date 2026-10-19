package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DoubleArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1321k extends AbstractC1313c<Double> implements RandomAccess, S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f17261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17262d;

    static {
        new C1321k(new double[0], 0).f17214b = false;
    }

    public C1321k() {
        this(new double[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17262d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17262d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        double[] dArr = this.f17261c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f17261c, i10, dArr2, i10 + 1, this.f17262d - i10);
            this.f17261c = dArr2;
        }
        this.f17261c[i10] = dDoubleValue;
        this.f17262d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        d();
        Charset charset = C1330u.f17280a;
        collection.getClass();
        if (!(collection instanceof C1321k)) {
            return super.addAll(collection);
        }
        C1321k c1321k = (C1321k) collection;
        int i10 = c1321k.f17262d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17262d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f17261c;
        if (i12 > dArr.length) {
            this.f17261c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c1321k.f17261c, 0, this.f17261c, this.f17262d, c1321k.f17262d);
        this.f17262d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(double d10) {
        d();
        int i10 = this.f17262d;
        double[] dArr = this.f17261c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f17261c = dArr2;
        }
        double[] dArr3 = this.f17261c;
        int i11 = this.f17262d;
        this.f17262d = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321k)) {
            return super.equals(obj);
        }
        C1321k c1321k = (C1321k) obj;
        if (this.f17262d != c1321k.f17262d) {
            return false;
        }
        double[] dArr = c1321k.f17261c;
        for (int i10 = 0; i10 < this.f17262d; i10++) {
            if (Double.doubleToLongBits(this.f17261c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17262d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17262d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f17261c[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 >= this.f17262d) {
            return new C1321k(Arrays.copyOf(this.f17261c, i10), this.f17262d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f17262d; i10++) {
            iB = (iB * 31) + C1330u.b(Double.doubleToLongBits(this.f17261c[i10]));
        }
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i10 = 0; i10 < this.f17262d; i10++) {
            if (obj.equals(Double.valueOf(this.f17261c[i10]))) {
                double[] dArr = this.f17261c;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f17262d - i10) - 1);
                this.f17262d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f17261c;
        System.arraycopy(dArr, i11, dArr, i10, this.f17262d - i11);
        this.f17262d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        g(i10);
        double[] dArr = this.f17261c;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17262d;
    }

    public C1321k(double[] dArr, int i10) {
        this.f17261c = dArr;
        this.f17262d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        double[] dArr = this.f17261c;
        double d10 = dArr[i10];
        int i11 = this.f17262d;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f17262d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
