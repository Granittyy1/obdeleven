package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class B3<E> extends AbstractC1914u2<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B3<Object> f25402e = new B3<>(new Object[0], 0, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E[] f25403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25404d;

    public B3(E[] eArr, int i10, boolean z10) {
        super(z10);
        this.f25403c = eArr;
        this.f25404d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f25404d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25404d, "Index:", ", Size:"));
        }
        E[] eArr = this.f25403c;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) new Object[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f25403c, i10, eArr2, i10 + 1, this.f25404d - i10);
            this.f25403c = eArr2;
        }
        this.f25403c[i10] = e10;
        this.f25404d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final /* synthetic */ V2 c(int i10) {
        if (i10 >= this.f25404d) {
            return new B3(Arrays.copyOf(this.f25403c, i10), this.f25404d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f25404d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25404d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        e(i10);
        return this.f25403c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        d();
        e(i10);
        E[] eArr = this.f25403c;
        E e10 = eArr[i10];
        int i11 = this.f25404d;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f25404d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        e(i10);
        E[] eArr = this.f25403c;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25404d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f25404d;
        E[] eArr = this.f25403c;
        if (i10 == eArr.length) {
            this.f25403c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f25403c;
        int i11 = this.f25404d;
        this.f25404d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }
}
