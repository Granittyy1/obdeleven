package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1935x2 extends AbstractC1914u2<Boolean> implements A3, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f25912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25913d;

    static {
        new C1935x2(new boolean[0], 0, false);
    }

    public C1935x2() {
        this(new boolean[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f25913d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25913d, "Index:", ", Size:"));
        }
        boolean[] zArr = this.f25912c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f25912c, i10, zArr2, i10 + 1, this.f25913d - i10);
            this.f25912c = zArr2;
        }
        this.f25912c[i10] = zBooleanValue;
        this.f25913d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = Q2.f25563a;
        collection.getClass();
        if (!(collection instanceof C1935x2)) {
            return super.addAll(collection);
        }
        C1935x2 c1935x2 = (C1935x2) collection;
        int i10 = c1935x2.f25913d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25913d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f25912c;
        if (i12 > zArr.length) {
            this.f25912c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c1935x2.f25912c, 0, this.f25912c, this.f25913d, c1935x2.f25913d);
        this.f25913d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final /* synthetic */ V2 c(int i10) {
        if (i10 >= this.f25913d) {
            return new C1935x2(Arrays.copyOf(this.f25912c, i10), this.f25913d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f25913d;
        boolean[] zArr = this.f25912c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f25912c = zArr2;
        }
        boolean[] zArr3 = this.f25912c;
        int i11 = this.f25913d;
        this.f25913d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1935x2)) {
            return super.equals(obj);
        }
        C1935x2 c1935x2 = (C1935x2) obj;
        if (this.f25913d != c1935x2.f25913d) {
            return false;
        }
        boolean[] zArr = c1935x2.f25912c;
        for (int i10 = 0; i10 < this.f25913d; i10++) {
            if (this.f25912c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f25913d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25913d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f25912c[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f25913d; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f25912c[i11];
            Charset charset = Q2.f25563a;
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
        int i10 = this.f25913d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25912c[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        boolean[] zArr = this.f25912c;
        boolean z10 = zArr[i10];
        int i11 = this.f25913d;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f25913d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f25912c;
        System.arraycopy(zArr, i11, zArr, i10, this.f25913d - i11);
        this.f25913d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i10);
        boolean[] zArr = this.f25912c;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25913d;
    }

    public C1935x2(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f25912c = zArr;
        this.f25913d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
