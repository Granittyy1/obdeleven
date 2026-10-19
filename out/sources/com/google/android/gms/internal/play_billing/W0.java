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
public final class W0 extends AbstractC1975i0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f26164e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f26165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26166d;

    static {
        long[] jArr = new long[0];
        f26164e = jArr;
        new W0(jArr, 0, false);
    }

    public W0() {
        this(f26164e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f26166d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26166d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f26165c;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26165c, 0, jArr2, 0, i10);
            System.arraycopy(this.f26165c, i10, jArr2, i12, this.f26166d - i10);
            this.f26165c = jArr2;
        }
        this.f26165c[i10] = jLongValue;
        this.f26166d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = O0.f26148a;
        collection.getClass();
        if (!(collection instanceof W0)) {
            return super.addAll(collection);
        }
        W0 w3 = (W0) collection;
        int i10 = w3.f26166d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26166d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f26165c;
        if (i12 > jArr.length) {
            this.f26165c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(w3.f26165c, 0, this.f26165c, this.f26166d, w3.f26166d);
        this.f26166d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i10) {
        q(i10);
        return this.f26165c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W0)) {
            return super.equals(obj);
        }
        W0 w3 = (W0) obj;
        if (this.f26166d != w3.f26166d) {
            return false;
        }
        long[] jArr = w3.f26165c;
        for (int i10 = 0; i10 < this.f26166d; i10++) {
            if (this.f26165c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j) {
        d();
        int i10 = this.f26166d;
        int length = this.f26165c.length;
        if (i10 == length) {
            long[] jArr = new long[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26165c, 0, jArr, 0, this.f26166d);
            this.f26165c = jArr;
        }
        long[] jArr2 = this.f26165c;
        int i11 = this.f26166d;
        this.f26166d = i11 + 1;
        jArr2[i11] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        q(i10);
        return Long.valueOf(this.f26165c[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f26166d; i11++) {
            long j = this.f26165c[i11];
            Charset charset = O0.f26148a;
            i10 = (i10 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f26166d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26165c[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        int length = this.f26165c.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f26165c = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = C0936h.b(length, 3, 2, 1, 10);
        }
        this.f26165c = Arrays.copyOf(this.f26165c, length);
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26166d) {
            return new W0(i10 == 0 ? f26164e : Arrays.copyOf(this.f26165c, i10), this.f26166d, true);
        }
        throw new IllegalArgumentException();
    }

    public final void q(int i10) {
        if (i10 < 0 || i10 >= this.f26166d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26166d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        q(i10);
        long[] jArr = this.f26165c;
        long j = jArr[i10];
        int i11 = this.f26166d;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f26166d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f26165c;
        System.arraycopy(jArr, i11, jArr, i10, this.f26166d - i11);
        this.f26166d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        q(i10);
        long[] jArr = this.f26165c;
        long j = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26166d;
    }

    public W0(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f26165c = jArr;
        this.f26166d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
