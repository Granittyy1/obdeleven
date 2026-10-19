package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1811f3 extends AbstractC1914u2<Long> implements S2, A3, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1811f3 f25704e = new C1811f3(new long[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f25705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25706d;

    public C1811f3() {
        this(new long[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f25706d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25706d, "Index:", ", Size:"));
        }
        long[] jArr = this.f25705c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f25705c, i10, jArr2, i10 + 1, this.f25706d - i10);
            this.f25705c = jArr2;
        }
        this.f25705c[i10] = jLongValue;
        this.f25706d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = Q2.f25563a;
        collection.getClass();
        if (!(collection instanceof C1811f3)) {
            return super.addAll(collection);
        }
        C1811f3 c1811f3 = (C1811f3) collection;
        int i10 = c1811f3.f25706d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25706d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f25705c;
        if (i12 > jArr.length) {
            this.f25705c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c1811f3.f25705c, 0, this.f25705c, this.f25706d, c1811f3.f25706d);
        this.f25706d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final V2<Long> c(int i10) {
        if (i10 >= this.f25706d) {
            return new C1811f3(Arrays.copyOf(this.f25705c, i10), this.f25706d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j) {
        d();
        int i10 = this.f25706d;
        long[] jArr = this.f25705c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f25705c = jArr2;
        }
        long[] jArr3 = this.f25705c;
        int i11 = this.f25706d;
        this.f25706d = i11 + 1;
        jArr3[i11] = j;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811f3)) {
            return super.equals(obj);
        }
        C1811f3 c1811f3 = (C1811f3) obj;
        if (this.f25706d != c1811f3.f25706d) {
            return false;
        }
        long[] jArr = c1811f3.f25705c;
        for (int i10 = 0; i10 < this.f25706d; i10++) {
            if (this.f25705c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f25706d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25706d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f25705c[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i10 = 0; i10 < this.f25706d; i10++) {
            iA = (iA * 31) + Q2.a(this.f25705c[i10]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f25706d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25705c[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        long[] jArr = this.f25705c;
        long j = jArr[i10];
        int i11 = this.f25706d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f25706d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f25705c;
        System.arraycopy(jArr, i11, jArr, i10, this.f25706d - i11);
        this.f25706d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        g(i10);
        long[] jArr = this.f25705c;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25706d;
    }

    public C1811f3(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f25705c = jArr;
        this.f25706d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
