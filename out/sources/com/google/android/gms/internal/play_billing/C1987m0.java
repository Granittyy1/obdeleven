package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.C0936h;
import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1987m0 extends AbstractC1975i0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean[] f26216e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean[] f26217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26218d;

    static {
        boolean[] zArr = new boolean[0];
        f26216e = zArr;
        new C1987m0(zArr, 0, false);
    }

    public C1987m0() {
        this(f26216e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f26218d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26218d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        boolean[] zArr = this.f26217c;
        int length = zArr.length;
        if (i11 < length) {
            System.arraycopy(zArr, i10, zArr, i12, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26217c, 0, zArr2, 0, i10);
            System.arraycopy(this.f26217c, i10, zArr2, i12, this.f26218d - i10);
            this.f26217c = zArr2;
        }
        this.f26217c[i10] = zBooleanValue;
        this.f26218d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = O0.f26148a;
        collection.getClass();
        if (!(collection instanceof C1987m0)) {
            return super.addAll(collection);
        }
        C1987m0 c1987m0 = (C1987m0) collection;
        int i10 = c1987m0.f26218d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26218d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f26217c;
        if (i12 > zArr.length) {
            this.f26217c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c1987m0.f26217c, 0, this.f26217c, this.f26218d, c1987m0.f26218d);
        this.f26218d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(boolean z10) {
        d();
        int i10 = this.f26218d;
        int length = this.f26217c.length;
        if (i10 == length) {
            boolean[] zArr = new boolean[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26217c, 0, zArr, 0, this.f26218d);
            this.f26217c = zArr;
        }
        boolean[] zArr2 = this.f26217c;
        int i11 = this.f26218d;
        this.f26218d = i11 + 1;
        zArr2[i11] = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1987m0)) {
            return super.equals(obj);
        }
        C1987m0 c1987m0 = (C1987m0) obj;
        if (this.f26218d != c1987m0.f26218d) {
            return false;
        }
        boolean[] zArr = c1987m0.f26217c;
        for (int i10 = 0; i10 < this.f26218d; i10++) {
            if (this.f26217c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f26218d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26218d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f26217c[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26218d; i11++) {
            int i12 = i10 * 31;
            boolean z10 = this.f26217c[i11];
            Charset charset = O0.f26148a;
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
        int i10 = this.f26218d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26217c[i11] == zBooleanValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26218d) {
            return new C1987m0(i10 == 0 ? f26216e : Arrays.copyOf(this.f26217c, i10), this.f26218d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        boolean[] zArr = this.f26217c;
        boolean z10 = zArr[i10];
        int i11 = this.f26218d;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f26218d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f26217c;
        System.arraycopy(zArr, i11, zArr, i10, this.f26218d - i11);
        this.f26218d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        d();
        g(i10);
        boolean[] zArr = this.f26217c;
        boolean z10 = zArr[i10];
        zArr[i10] = zBooleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26218d;
    }

    public C1987m0(boolean[] zArr, int i10, boolean z10) {
        super(z10);
        this.f26217c = zArr;
        this.f26218d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }
}
