package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: IntArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1329t extends AbstractC1313c<Integer> implements RandomAccess, S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f17278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17279d;

    static {
        new C1329t(new int[0], 0).f17214b = false;
    }

    public C1329t() {
        this(new int[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17279d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17279d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        int[] iArr = this.f17278c;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f17278c, i10, iArr2, i10 + 1, this.f17279d - i10);
            this.f17278c = iArr2;
        }
        this.f17278c[i10] = iIntValue;
        this.f17279d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        d();
        Charset charset = C1330u.f17280a;
        collection.getClass();
        if (!(collection instanceof C1329t)) {
            return super.addAll(collection);
        }
        C1329t c1329t = (C1329t) collection;
        int i10 = c1329t.f17279d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17279d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f17278c;
        if (i12 > iArr.length) {
            this.f17278c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c1329t.f17278c, 0, this.f17278c, this.f17279d, c1329t.f17279d);
        this.f17279d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i10) {
        d();
        int i11 = this.f17279d;
        int[] iArr = this.f17278c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f17278c = iArr2;
        }
        int[] iArr3 = this.f17278c;
        int i12 = this.f17279d;
        this.f17279d = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1329t)) {
            return super.equals(obj);
        }
        C1329t c1329t = (C1329t) obj;
        if (this.f17279d != c1329t.f17279d) {
            return false;
        }
        int[] iArr = c1329t.f17278c;
        for (int i10 = 0; i10 < this.f17279d; i10++) {
            if (this.f17278c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17279d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17279d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Integer.valueOf(this.f17278c[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 >= this.f17279d) {
            return new C1329t(Arrays.copyOf(this.f17278c, i10), this.f17279d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17279d; i11++) {
            i10 = (i10 * 31) + this.f17278c[i11];
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i10 = 0; i10 < this.f17279d; i10++) {
            if (obj.equals(Integer.valueOf(this.f17278c[i10]))) {
                int[] iArr = this.f17278c;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f17279d - i10) - 1);
                this.f17279d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f17278c;
        System.arraycopy(iArr, i11, iArr, i10, this.f17279d - i11);
        this.f17279d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        g(i10);
        int[] iArr = this.f17278c;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17279d;
    }

    public C1329t(int[] iArr, int i10) {
        this.f17278c = iArr;
        this.f17279d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        int[] iArr = this.f17278c;
        int i11 = iArr[i10];
        int i12 = this.f17279d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f17279d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
