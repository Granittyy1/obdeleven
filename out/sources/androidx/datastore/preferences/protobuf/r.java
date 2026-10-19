package androidx.datastore.preferences.protobuf;

import com.braze.support.BrazeLogger;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: FloatArrayList.java */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1313c<Float> implements RandomAccess, S {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f17275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17276d;

    static {
        new r(0, new float[0]).f17214b = false;
    }

    public r() {
        this(0, new float[10]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f17276d)) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17276d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
        float[] fArr = this.f17275c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[A8.f.c(i11, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f17275c, i10, fArr2, i10 + 1, this.f17276d - i10);
            this.f17275c = fArr2;
        }
        this.f17275c[i10] = fFloatValue;
        this.f17276d++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        d();
        Charset charset = C1330u.f17280a;
        collection.getClass();
        if (!(collection instanceof r)) {
            return super.addAll(collection);
        }
        r rVar = (r) collection;
        int i10 = rVar.f17276d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f17276d;
        if (BrazeLogger.SUPPRESS - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f17275c;
        if (i12 > fArr.length) {
            this.f17275c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(rVar.f17275c, 0, this.f17275c, this.f17276d, rVar.f17276d);
        this.f17276d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(float f10) {
        d();
        int i10 = this.f17276d;
        float[] fArr = this.f17275c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[A8.f.c(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f17275c = fArr2;
        }
        float[] fArr3 = this.f17275c;
        int i11 = this.f17276d;
        this.f17276d = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return super.equals(obj);
        }
        r rVar = (r) obj;
        if (this.f17276d != rVar.f17276d) {
            return false;
        }
        float[] fArr = rVar.f17275c;
        for (int i10 = 0; i10 < this.f17276d; i10++) {
            if (Float.floatToIntBits(this.f17275c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f17276d) {
            StringBuilder sbE = A8.f.e(i10, "Index:", ", Size:");
            sbE.append(this.f17276d);
            throw new IndexOutOfBoundsException(sbE.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f17275c[i10]);
    }

    @Override // androidx.datastore.preferences.protobuf.C1330u.c
    public final C1330u.c h(int i10) {
        if (i10 < this.f17276d) {
            throw new IllegalArgumentException();
        }
        return new r(this.f17276d, Arrays.copyOf(this.f17275c, i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f17276d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f17275c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        d();
        for (int i10 = 0; i10 < this.f17276d; i10++) {
            if (obj.equals(Float.valueOf(this.f17275c[i10]))) {
                float[] fArr = this.f17275c;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f17276d - i10) - 1);
                this.f17276d--;
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
        float[] fArr = this.f17275c;
        System.arraycopy(fArr, i11, fArr, i10, this.f17276d - i11);
        this.f17276d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        d();
        g(i10);
        float[] fArr = this.f17275c;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17276d;
    }

    public r(int i10, float[] fArr) {
        this.f17275c = fArr;
        this.f17276d = i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        g(i10);
        float[] fArr = this.f17275c;
        float f10 = fArr[i10];
        int i11 = this.f17276d;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f17276d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1313c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }
}
