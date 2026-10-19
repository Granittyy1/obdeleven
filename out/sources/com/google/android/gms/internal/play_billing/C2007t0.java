package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.C0936h;
import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2007t0 extends AbstractC1975i0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double[] f26257e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f26258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26259d;

    static {
        double[] dArr = new double[0];
        f26257e = dArr;
        new C2007t0(dArr, 0, false);
    }

    public C2007t0() {
        this(f26257e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f26259d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26259d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        double[] dArr = this.f26258c;
        int length = dArr.length;
        if (i11 < length) {
            System.arraycopy(dArr, i10, dArr, i12, i11 - i10);
        } else {
            double[] dArr2 = new double[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26258c, 0, dArr2, 0, i10);
            System.arraycopy(this.f26258c, i10, dArr2, i12, this.f26259d - i10);
            this.f26258c = dArr2;
        }
        this.f26258c[i10] = dDoubleValue;
        this.f26259d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = O0.f26148a;
        collection.getClass();
        if (!(collection instanceof C2007t0)) {
            return super.addAll(collection);
        }
        C2007t0 c2007t0 = (C2007t0) collection;
        int i10 = c2007t0.f26259d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26259d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f26258c;
        if (i12 > dArr.length) {
            this.f26258c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c2007t0.f26258c, 0, this.f26258c, this.f26259d, c2007t0.f26259d);
        this.f26259d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d10) {
        d();
        int i10 = this.f26259d;
        int length = this.f26258c.length;
        if (i10 == length) {
            double[] dArr = new double[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26258c, 0, dArr, 0, this.f26259d);
            this.f26258c = dArr;
        }
        double[] dArr2 = this.f26258c;
        int i11 = this.f26259d;
        this.f26259d = i11 + 1;
        dArr2[i11] = d10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2007t0)) {
            return super.equals(obj);
        }
        C2007t0 c2007t0 = (C2007t0) obj;
        if (this.f26259d != c2007t0.f26259d) {
            return false;
        }
        double[] dArr = c2007t0.f26258c;
        for (int i10 = 0; i10 < this.f26259d; i10++) {
            if (Double.doubleToLongBits(this.f26258c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        int length = this.f26258c.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f26258c = new double[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = C0936h.b(length, 3, 2, 1, 10);
        }
        this.f26258c = Arrays.copyOf(this.f26258c, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Double.valueOf(this.f26258c[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26259d; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f26258c[i11]);
            Charset charset = O0.f26148a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f26259d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26258c[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f26259d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26259d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26259d) {
            return new C2007t0(i10 == 0 ? f26257e : Arrays.copyOf(this.f26258c, i10), this.f26259d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        k(i10);
        double[] dArr = this.f26258c;
        double d10 = dArr[i10];
        int i11 = this.f26259d;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f26259d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f26258c;
        System.arraycopy(dArr, i11, dArr, i10, this.f26259d - i11);
        this.f26259d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        d();
        k(i10);
        double[] dArr = this.f26258c;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26259d;
    }

    public C2007t0(double[] dArr, int i10, boolean z10) {
        super(z10);
        this.f26258c = dArr;
        this.f26259d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }
}
