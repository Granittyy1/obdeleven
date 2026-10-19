package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.C0936h;
import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class J0 extends AbstractC1975i0 implements RandomAccess, M0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f26143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final J0 f26144f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26146d;

    static {
        int[] iArr = new int[0];
        f26143e = iArr;
        f26144f = new J0(iArr, 0, false);
    }

    public J0() {
        this(f26143e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f26146d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26146d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f26145c;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26145c, 0, iArr2, 0, i10);
            System.arraycopy(this.f26145c, i10, iArr2, i12, this.f26146d - i10);
            this.f26145c = iArr2;
        }
        this.f26145c[i10] = iIntValue;
        this.f26146d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = O0.f26148a;
        collection.getClass();
        if (!(collection instanceof J0)) {
            return super.addAll(collection);
        }
        J0 j10 = (J0) collection;
        int i10 = j10.f26146d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26146d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f26145c;
        if (i12 > iArr.length) {
            this.f26145c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(j10.f26145c, 0, this.f26145c, this.f26146d, j10.f26146d);
        this.f26146d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        q(i10);
        return this.f26145c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return super.equals(obj);
        }
        J0 j10 = (J0) obj;
        if (this.f26146d != j10.f26146d) {
            return false;
        }
        int[] iArr = j10.f26145c;
        for (int i10 = 0; i10 < this.f26146d; i10++) {
            if (this.f26145c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        d();
        int i11 = this.f26146d;
        int length = this.f26145c.length;
        if (i11 == length) {
            int[] iArr = new int[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26145c, 0, iArr, 0, this.f26146d);
            this.f26145c = iArr;
        }
        int[] iArr2 = this.f26145c;
        int i12 = this.f26146d;
        this.f26146d = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        q(i10);
        return Integer.valueOf(this.f26145c[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26146d; i11++) {
            i10 = (i10 * 31) + this.f26145c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f26146d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26145c[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        int length = this.f26145c.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f26145c = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = C0936h.b(length, 3, 2, 1, 10);
        }
        this.f26145c = Arrays.copyOf(this.f26145c, length);
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26146d) {
            return new J0(i10 == 0 ? f26143e : Arrays.copyOf(this.f26145c, i10), this.f26146d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void q(int i10) {
        if (i10 < 0 || i10 >= this.f26146d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26146d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        q(i10);
        int[] iArr = this.f26145c;
        int i11 = iArr[i10];
        int i12 = this.f26146d;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f26146d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f26145c;
        System.arraycopy(iArr, i11, iArr, i10, this.f26146d - i11);
        this.f26146d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        q(i10);
        int[] iArr = this.f26145c;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26146d;
    }

    public J0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.f26145c = iArr;
        this.f26146d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
