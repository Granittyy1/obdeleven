package com.google.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r extends AbstractC2061c<Float> implements RandomAccess, T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f29194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29195d;

    static {
        new r(0, new float[0]).f29134b = false;
    }

    public r() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f29195d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29195d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        float[] fArr = this.f29194c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f29194c, i10, fArr2, i10 + 1, this.f29195d - i10);
            this.f29194c = fArr2;
        }
        this.f29194c[i10] = fFloatValue;
        this.f29195d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = C2078u.f29200a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i10 = rVar.f29195d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f29195d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f29194c;
        if (i12 > fArr.length) {
            this.f29194c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(rVar.f29194c, 0, this.f29194c, this.f29195d, rVar.f29195d);
        this.f29195d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f29195d;
        float[] fArr = this.f29194c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f29194c = fArr2;
        }
        float[] fArr3 = this.f29194c;
        int i11 = this.f29195d;
        this.f29195d = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f29195d != rVar.f29195d) {
            return false;
        }
        float[] fArr = rVar.f29194c;
        for (int i10 = 0; i10 < this.f29195d; i10++) {
            if (Float.floatToIntBits(this.f29194c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f29195d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f29195d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f29194c[i10]);
    }

    @Override // com.google.protobuf.C2078u.d
    public final C2078u.d h(int i10) {
        if (i10 < this.f29195d) {
            throw new IllegalArgumentException();
        }
        return new r(this.f29195d, Arrays.copyOf(this.f29194c, i10));
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f29195d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f29194c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.f29195d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f29194c[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        float[] fArr = this.f29194c;
        float f10 = fArr[i10];
        int i11 = this.f29195d;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f29195d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f29194c;
        System.arraycopy(fArr, i11, fArr, i10, this.f29195d - i11);
        this.f29195d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        g(i10);
        float[] fArr = this.f29194c;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29195d;
    }

    public r(int i10, float[] fArr) {
        this.f29194c = fArr;
        this.f29195d = i10;
    }

    @Override // com.google.protobuf.AbstractC2061c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
