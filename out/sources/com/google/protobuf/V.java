package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V<E> extends AbstractC2061c<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V<Object> f29091e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E[] f29092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29093d;

    static {
        V<Object> v10 = new V<>(0, new Object[0]);
        f29091e = v10;
        v10.f29134b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V(int i10, Object[] objArr) {
        this.f29092c = objArr;
        this.f29093d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f29093d;
        E[] eArr = this.f29092c;
        if (i10 == eArr.length) {
            this.f29092c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f29092c;
        int i11 = this.f29093d;
        this.f29093d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f29093d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29093d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        e(i10);
        return this.f29092c[i10];
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        if (i10 < this.f29093d) {
            throw new IllegalArgumentException();
        }
        return new V(this.f29093d, Arrays.copyOf(this.f29092c, i10));
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        d();
        e(i10);
        E[] eArr = this.f29092c;
        E e10 = eArr[i10];
        int i11 = this.f29093d;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f29093d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        e(i10);
        E[] eArr = this.f29092c;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29093d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f29093d)) {
            E[] eArr = this.f29092c;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[A8.f.c(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f29092c, i10, eArr2, i10 + 1, this.f29093d - i10);
                this.f29092c = eArr2;
            }
            this.f29092c[i10] = e10;
            this.f29093d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
        sbE.append(this.f29093d);
        throw new IndexOutOfBoundsException(sbE.toString());
    }
}
