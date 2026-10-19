package com.google.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2063e extends AbstractC2061c<Boolean> implements RandomAccess, T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f29143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29144d;

    static {
        new C2063e(new boolean[0], 0).f29134b = false;
    }

    public C2063e() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f29144d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29144d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        boolean[] zArr = this.f29143c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f29143c, i10, zArr2, i10 + 1, this.f29144d - i10);
            this.f29143c = zArr2;
        }
        this.f29143c[i10] = zBooleanValue;
        this.f29144d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = C2078u.f29200a;
        collection.getClass();
        if (!(collection instanceof C2063e)) {
            return super.addAll(collection);
        }
        C2063e c2063e = (C2063e) collection;
        int i10 = c2063e.f29144d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29144d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f29143c;
        if (i12 > zArr.length) {
            this.f29143c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c2063e.f29143c, 0, this.f29143c, this.f29144d, c2063e.f29144d);
        this.f29144d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f29144d;
        boolean[] zArr = this.f29143c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f29143c = zArr2;
        }
        boolean[] zArr3 = this.f29143c;
        int i11 = this.f29144d;
        this.f29144d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2063e)) {
            return super.equals(obj);
        }
        C2063e c2063e = (C2063e) obj;
        if (this.f29144d != c2063e.f29144d) {
            return false;
        }
        boolean[] zArr = c2063e.f29143c;
        for (int i10 = 0; i10 < this.f29144d; i10++) {
            if (this.f29143c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f29144d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29144d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f29143c[i10]);
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        if (i10 >= this.f29144d) {
            return new C2063e(Arrays.copyOf(this.f29143c, i10), this.f29144d);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f29144d; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f29143c[i11];
            Charset charset = C2078u.f29200a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i10 = this.f29144d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29143c[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        boolean[] zArr = this.f29143c;
        boolean z10 = zArr[i10];
        int i11 = this.f29144d;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f29144d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f29143c;
        System.arraycopy(zArr, i11, zArr, i10, this.f29144d - i11);
        this.f29144d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i10);
        boolean[] zArr = this.f29143c;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29144d;
    }

    public C2063e(boolean[] zArr, int i10) {
        this.f29143c = zArr;
        this.f29144d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
