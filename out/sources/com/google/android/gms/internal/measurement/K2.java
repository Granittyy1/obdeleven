package com.google.android.gms.internal.measurement;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class K2 extends AbstractC1914u2<Float> implements A3, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f25498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25499d;

    static {
        new K2(new float[0], 0, false);
    }

    public K2() {
        this(new float[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f25499d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25499d, "Index:", ", Size:"));
        }
        float[] fArr = this.f25498c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f25498c, i10, fArr2, i10 + 1, this.f25499d - i10);
            this.f25498c = fArr2;
        }
        this.f25498c[i10] = fFloatValue;
        this.f25499d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = Q2.f25563a;
        collection.getClass();
        if (!(collection instanceof K2)) {
            return super.addAll(collection);
        }
        K2 k10 = (K2) collection;
        int i10 = k10.f25499d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f25499d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f25498c;
        if (i12 > fArr.length) {
            this.f25498c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(k10.f25498c, 0, this.f25498c, this.f25499d, k10.f25499d);
        this.f25499d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V2
    public final /* synthetic */ V2 c(int i10) {
        if (i10 >= this.f25499d) {
            return new K2(Arrays.copyOf(this.f25498c, i10), this.f25499d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f25499d;
        float[] fArr = this.f25498c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f25498c = fArr2;
        }
        float[] fArr3 = this.f25498c;
        int i11 = this.f25499d;
        this.f25499d = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K2)) {
            return super.equals(obj);
        }
        K2 k10 = (K2) obj;
        if (this.f25499d != k10.f25499d) {
            return false;
        }
        float[] fArr = k10.f25498c;
        for (int i10 = 0; i10 < this.f25499d; i10++) {
            if (Float.floatToIntBits(this.f25498c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f25499d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f25499d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f25498c[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f25499d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f25498c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f25499d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f25498c[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        float[] fArr = this.f25498c;
        float f10 = fArr[i10];
        int i11 = this.f25499d;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f25499d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f25498c;
        System.arraycopy(fArr, i11, fArr, i10, this.f25499d - i11);
        this.f25499d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        g(i10);
        float[] fArr = this.f25498c;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25499d;
    }

    public K2(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.f25498c = fArr;
        this.f25499d = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1914u2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
