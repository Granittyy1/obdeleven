package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: LongArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC1313c<Long> implements RandomAccess, S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f17090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17091d;

    static {
        new A(new long[0], 0).f17214b = false;
    }

    public A() {
        this(new long[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17091d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17091d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        long[] jArr = this.f17090c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f17090c, i10, jArr2, i10 + 1, this.f17091d - i10);
            this.f17090c = jArr2;
        }
        this.f17090c[i10] = jLongValue;
        this.f17091d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        d();
        Charset charset = C1330u.f17280a;
        collection.getClass();
        if (!(collection instanceof A)) {
            return super.addAll(collection);
        }
        A a10 = (A) collection;
        int i10 = a10.f17091d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17091d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f17090c;
        if (i12 > jArr.length) {
            this.f17090c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(a10.f17090c, 0, this.f17090c, this.f17091d, a10.f17091d);
        this.f17091d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(long j) {
        d();
        int i10 = this.f17091d;
        long[] jArr = this.f17090c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f17090c = jArr2;
        }
        long[] jArr3 = this.f17090c;
        int i11 = this.f17091d;
        this.f17091d = i11 + 1;
        jArr3[i11] = j;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return super.equals(obj);
        }
        A a10 = (A) obj;
        if (this.f17091d != a10.f17091d) {
            return false;
        }
        long[] jArr = a10.f17090c;
        for (int i10 = 0; i10 < this.f17091d; i10++) {
            if (this.f17090c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17091d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17091d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f17090c[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 >= this.f17091d) {
            return new A(Arrays.copyOf(this.f17090c, i10), this.f17091d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i10 = 0; i10 < this.f17091d; i10++) {
            iB = (iB * 31) + C1330u.b(this.f17090c[i10]);
        }
        return iB;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i10 = 0; i10 < this.f17091d; i10++) {
            if (obj.equals(Long.valueOf(this.f17090c[i10]))) {
                long[] jArr = this.f17090c;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f17091d - i10) - 1);
                this.f17091d--;
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
        long[] jArr = this.f17090c;
        System.arraycopy(jArr, i11, jArr, i10, this.f17091d - i11);
        this.f17091d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        g(i10);
        long[] jArr = this.f17090c;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17091d;
    }

    public A(long[] jArr, int i10) {
        this.f17090c = jArr;
        this.f17091d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        long[] jArr = this.f17090c;
        long j = jArr[i10];
        int i11 = this.f17091d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f17091d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
