package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class O2 extends AbstractC1914u2<Integer> implements U2, A3, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O2 f25543e = new O2(new int[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f25544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25545d;

    public O2() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f25545d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25545d, "Index:", ", Size:"));
        }
        int[] iArr = this.f25544c;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f25544c, i10, iArr2, i10 + 1, this.f25545d - i10);
            this.f25544c = iArr2;
        }
        this.f25544c[i10] = iIntValue;
        this.f25545d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = Q2.f25563a;
        collection.getClass();
        if (!(collection instanceof O2)) {
            return super.addAll(collection);
        }
        O2 o10 = (O2) collection;
        int i10 = o10.f25545d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25545d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f25544c;
        if (i12 > iArr.length) {
            this.f25544c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(o10.f25544c, 0, this.f25544c, this.f25545d, o10.f25545d);
        this.f25545d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final V2<Integer> c(int i10) {
        if (i10 >= this.f25545d) {
            return new O2(Arrays.copyOf(this.f25544c, i10), this.f25545d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        d();
        int i11 = this.f25545d;
        int[] iArr = this.f25544c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f25544c = iArr2;
        }
        int[] iArr3 = this.f25544c;
        int i12 = this.f25545d;
        this.f25545d = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2)) {
            return super.equals(obj);
        }
        O2 o10 = (O2) obj;
        if (this.f25545d != o10.f25545d) {
            return false;
        }
        int[] iArr = o10.f25544c;
        for (int i10 = 0; i10 < this.f25545d; i10++) {
            if (this.f25544c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f25545d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25545d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Integer.valueOf(this.f25544c[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f25545d; i11++) {
            i10 = (i10 * 31) + this.f25544c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f25545d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25544c[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        int[] iArr = this.f25544c;
        int i11 = iArr[i10];
        int i12 = this.f25545d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f25545d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f25544c;
        System.arraycopy(iArr, i11, iArr, i10, this.f25545d - i11);
        this.f25545d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        g(i10);
        int[] iArr = this.f25544c;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25545d;
    }

    public O2(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f25544c = iArr;
        this.f25545d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
