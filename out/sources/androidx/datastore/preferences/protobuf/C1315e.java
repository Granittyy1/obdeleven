package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BooleanArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1315e extends AbstractC1313c<Boolean> implements RandomAccess, S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f17223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17224d;

    static {
        new C1315e(new boolean[0], 0).f17214b = false;
    }

    public C1315e() {
        this(new boolean[10], 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17224d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17224d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        boolean[] zArr = this.f17223c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f17223c, i10, zArr2, i10 + 1, this.f17224d - i10);
            this.f17223c = zArr2;
        }
        this.f17223c[i10] = zBooleanValue;
        this.f17224d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        d();
        Charset charset = C1330u.f17280a;
        collection.getClass();
        if (!(collection instanceof C1315e)) {
            return super.addAll(collection);
        }
        C1315e c1315e = (C1315e) collection;
        int i10 = c1315e.f17224d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17224d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f17223c;
        if (i12 > zArr.length) {
            this.f17223c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c1315e.f17223c, 0, this.f17223c, this.f17224d, c1315e.f17224d);
        this.f17224d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f17224d;
        boolean[] zArr = this.f17223c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f17223c = zArr2;
        }
        boolean[] zArr3 = this.f17223c;
        int i11 = this.f17224d;
        this.f17224d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1315e)) {
            return super.equals(obj);
        }
        C1315e c1315e = (C1315e) obj;
        if (this.f17224d != c1315e.f17224d) {
            return false;
        }
        boolean[] zArr = c1315e.f17223c;
        for (int i10 = 0; i10 < this.f17224d; i10++) {
            if (this.f17223c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17224d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17224d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f17223c[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 >= this.f17224d) {
            return new C1315e(Arrays.copyOf(this.f17223c, i10), this.f17224d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f17224d; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f17223c[i11];
            Charset charset = C1330u.f17280a;
            i10 = i12 + (z10 ? 1231 : 1237);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i10 = 0; i10 < this.f17224d; i10++) {
            if (obj.equals(Boolean.valueOf(this.f17223c[i10]))) {
                boolean[] zArr = this.f17223c;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f17224d - i10) - 1);
                this.f17224d--;
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
        boolean[] zArr = this.f17223c;
        System.arraycopy(zArr, i11, zArr, i10, this.f17224d - i11);
        this.f17224d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i10);
        boolean[] zArr = this.f17223c;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17224d;
    }

    public C1315e(boolean[] zArr, int i10) {
        this.f17223c = zArr;
        this.f17224d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        boolean[] zArr = this.f17223c;
        boolean z10 = zArr[i10];
        int i11 = this.f17224d;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f17224d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
