package com.google.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class B extends AbstractC2061c<Long> implements RandomAccess, T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f29005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29006d;

    static {
        new B(new long[0], 0).f29134b = false;
    }

    public B() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f29006d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29006d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        long[] jArr = this.f29005c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f29005c, i10, jArr2, i10 + 1, this.f29006d - i10);
            this.f29005c = jArr2;
        }
        this.f29005c[i10] = jLongValue;
        this.f29006d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = C2078u.f29200a;
        collection.getClass();
        if (!(collection instanceof B)) {
            return super.addAll(collection);
        }
        B b10 = (B) collection;
        int i10 = b10.f29006d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29006d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f29005c;
        if (i12 > jArr.length) {
            this.f29005c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(b10.f29005c, 0, this.f29005c, this.f29006d, b10.f29006d);
        this.f29006d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(long j) {
        d();
        int i10 = this.f29006d;
        long[] jArr = this.f29005c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f29005c = jArr2;
        }
        long[] jArr3 = this.f29005c;
        int i11 = this.f29006d;
        this.f29006d = i11 + 1;
        jArr3[i11] = j;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return super.equals(obj);
        }
        B b10 = (B) obj;
        if (this.f29006d != b10.f29006d) {
            return false;
        }
        long[] jArr = b10.f29005c;
        for (int i10 = 0; i10 < this.f29006d; i10++) {
            if (this.f29005c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f29006d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29006d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f29005c[i10]);
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        if (i10 >= this.f29006d) {
            return new B(Arrays.copyOf(this.f29005c, i10), this.f29006d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f29006d; i10++) {
            iB = (iB * 31) + C2078u.b(this.f29005c[i10]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f29006d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29005c[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        long[] jArr = this.f29005c;
        long j = jArr[i10];
        int i11 = this.f29006d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f29006d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f29005c;
        System.arraycopy(jArr, i11, jArr, i10, this.f29006d - i11);
        this.f29006d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        g(i10);
        long[] jArr = this.f29005c;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29006d;
    }

    public B(long[] jArr, int i10) {
        this.f29005c = jArr;
        this.f29006d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
