package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: ProtobufArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class U<E> extends AbstractC1313c<E> implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final U<Object> f17172e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E[] f17173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17174d;

    static {
        U<Object> u10 = new U<>(0, new Object[0]);
        f17172e = u10;
        u10.f17214b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public U(int i10, Object[] objArr) {
        this.f17173c = objArr;
        this.f17174d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        d();
        int i10 = this.f17174d;
        E[] eArr = this.f17173c;
        if (i10 == eArr.length) {
            this.f17173c = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f17173c;
        int i11 = this.f17174d;
        this.f17174d = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f17174d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17174d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        e(i10);
        return this.f17173c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 < this.f17174d) {
            throw new IllegalArgumentException();
        }
        return new U(this.f17174d, Arrays.copyOf(this.f17173c, i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        d();
        e(i10);
        E[] eArr = this.f17173c;
        E e10 = eArr[i10];
        int i11 = this.f17174d;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f17174d--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        d();
        e(i10);
        E[] eArr = this.f17173c;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17174d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        int i11;
        d();
        if (i10 >= 0 && i10 <= (i11 = this.f17174d)) {
            E[] eArr = this.f17173c;
            if (i11 < eArr.length) {
                System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
            } else {
                E[] eArr2 = (E[]) new Object[A8.f.c(i11, 3, 2, 1)];
                System.arraycopy(eArr, 0, eArr2, 0, i10);
                System.arraycopy(this.f17173c, i10, eArr2, i10 + 1, this.f17174d - i10);
                this.f17173c = eArr2;
            }
            this.f17173c[i10] = e10;
            this.f17174d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
        sbE.append(this.f17174d);
        throw new IndexOutOfBoundsException(sbE.toString());
    }
}
