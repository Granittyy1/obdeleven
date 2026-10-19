package com.google.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2077t extends AbstractC2061c<Integer> implements C2078u.c, RandomAccess, T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2077t f29197e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f29198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29199d;

    static {
        C2077t c2077t = new C2077t(new int[0], 0);
        f29197e = c2077t;
        c2077t.f29134b = false;
    }

    public C2077t() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f29199d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29199d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        int[] iArr = this.f29198c;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f29198c, i10, iArr2, i10 + 1, this.f29199d - i10);
            this.f29198c = iArr2;
        }
        this.f29198c[i10] = iIntValue;
        this.f29199d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = C2078u.f29200a;
        collection.getClass();
        if (!(collection instanceof C2077t)) {
            return super.addAll(collection);
        }
        C2077t c2077t = (C2077t) collection;
        int i10 = c2077t.f29199d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29199d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f29198c;
        if (i12 > iArr.length) {
            this.f29198c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c2077t.f29198c, 0, this.f29198c, this.f29199d, c2077t.f29199d);
        this.f29199d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        d();
        int i11 = this.f29199d;
        int[] iArr = this.f29198c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f29198c = iArr2;
        }
        int[] iArr3 = this.f29198c;
        int i12 = this.f29199d;
        this.f29199d = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2077t)) {
            return super.equals(obj);
        }
        C2077t c2077t = (C2077t) obj;
        if (this.f29199d != c2077t.f29199d) {
            return false;
        }
        int[] iArr = c2077t.f29198c;
        for (int i10 = 0; i10 < this.f29199d; i10++) {
            if (this.f29198c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f29199d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29199d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return Integer.valueOf(k(i10));
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d<Integer> h(int i10) {
        if (i10 >= this.f29199d) {
            return new C2077t(Arrays.copyOf(this.f29198c, i10), this.f29199d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29199d; i11++) {
            i10 = (i10 * 31) + this.f29198c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f29199d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29198c[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final int k(int i10) {
        g(i10);
        return this.f29198c[i10];
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        int[] iArr = this.f29198c;
        int i11 = iArr[i10];
        int i12 = this.f29199d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f29199d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29198c;
        System.arraycopy(iArr, i11, iArr, i10, this.f29199d - i11);
        this.f29199d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        g(i10);
        int[] iArr = this.f29198c;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29199d;
    }

    public C2077t(int[] iArr, int i10) {
        this.f29198c = iArr;
        this.f29199d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
