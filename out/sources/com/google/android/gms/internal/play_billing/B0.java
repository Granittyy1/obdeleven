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
public final class B0 extends AbstractC1975i0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f26106e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f26107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26108d;

    static {
        float[] fArr = new float[0];
        f26106e = fArr;
        new B0(fArr, 0, false);
    }

    public B0() {
        this(f26106e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f26108d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26108d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        float[] fArr = this.f26107c;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26107c, 0, fArr2, 0, i10);
            System.arraycopy(this.f26107c, i10, fArr2, i12, this.f26108d - i10);
            this.f26107c = fArr2;
        }
        this.f26107c[i10] = fFloatValue;
        this.f26108d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = O0.f26148a;
        collection.getClass();
        if (!(collection instanceof B0)) {
            return super.addAll(collection);
        }
        B0 b10 = (B0) collection;
        int i10 = b10.f26108d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f26108d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f26107c;
        if (i12 > fArr.length) {
            this.f26107c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(b10.f26107c, 0, this.f26107c, this.f26108d, b10.f26108d);
        this.f26108d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f26108d;
        int length = this.f26107c.length;
        if (i10 == length) {
            float[] fArr = new float[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26107c, 0, fArr, 0, this.f26108d);
            this.f26107c = fArr;
        }
        float[] fArr2 = this.f26107c;
        int i11 = this.f26108d;
        this.f26108d = i11 + 1;
        fArr2[i11] = f10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return super.equals(obj);
        }
        B0 b10 = (B0) obj;
        if (this.f26108d != b10.f26108d) {
            return false;
        }
        float[] fArr = b10.f26107c;
        for (int i10 = 0; i10 < this.f26108d; i10++) {
            if (Float.floatToIntBits(this.f26107c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        int length = this.f26107c.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f26107c = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = C0936h.b(length, 3, 2, 1, 10);
        }
        this.f26107c = Arrays.copyOf(this.f26107c, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        k(i10);
        return Float.valueOf(this.f26107c[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f26108d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f26107c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f26108d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f26107c[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    public final void k(int i10) {
        if (i10 < 0 || i10 >= this.f26108d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26108d, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26108d) {
            return new B0(i10 == 0 ? f26106e : Arrays.copyOf(this.f26107c, i10), this.f26108d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        k(i10);
        float[] fArr = this.f26107c;
        float f10 = fArr[i10];
        int i11 = this.f26108d;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f26108d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f26107c;
        System.arraycopy(fArr, i11, fArr, i10, this.f26108d - i11);
        this.f26108d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        k(i10);
        float[] fArr = this.f26107c;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26108d;
    }

    public B0(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f26107c = fArr;
        this.f26108d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
