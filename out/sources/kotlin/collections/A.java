package kotlin.collections;

import com.google.android.gms.internal.measurement.M1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A<T> extends AbstractC2670b<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f42976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42979e;

    /* JADX INFO: compiled from: SlidingWindow.kt */
    public static final class a extends AbstractC2669a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f42980d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f42981e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ A<T> f42982f;

        public a(A<T> a10) {
            this.f42982f = a10;
            this.f42980d = a10.e();
            this.f42981e = a10.f42978d;
        }

        @Override // kotlin.collections.AbstractC2669a
        public final void a() {
            int i10 = this.f42980d;
            if (i10 == 0) {
                this.f42986b = 2;
                return;
            }
            A<T> a10 = this.f42982f;
            Object[] objArr = a10.f42976b;
            int i11 = this.f42981e;
            this.f42987c = (T) objArr[i11];
            this.f42986b = 1;
            this.f42981e = (i11 + 1) % a10.f42977c;
            this.f42980d = i10 - 1;
        }
    }

    public A(int i10, Object[] objArr) {
        this.f42976b = objArr;
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i10 <= objArr.length) {
            this.f42977c = objArr.length;
            this.f42979e = i10;
        } else {
            StringBuilder sbE = A8.f.e(i10, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbE.append(objArr.length);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        return this.f42979e;
    }

    @Override // java.util.List
    public final T get(int i10) {
        int iE = e();
        if (i10 < 0 || i10 >= iE) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, iE, "index: ", ", size: "));
        }
        return (T) this.f42976b[(this.f42978d + i10) % this.f42977c];
    }

    @Override // kotlin.collections.AbstractC2670b, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new a(this);
    }

    public final void k(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.b(i10, "n shouldn't be negative but it is ").toString());
        }
        if (i10 > this.f42979e) {
            StringBuilder sbE = A8.f.e(i10, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbE.append(this.f42979e);
            throw new IllegalArgumentException(sbE.toString().toString());
        }
        if (i10 > 0) {
            int i11 = this.f42978d;
            int i12 = this.f42977c;
            int i13 = (i11 + i10) % i12;
            Object[] objArr = this.f42976b;
            if (i11 > i13) {
                Q3.d.w(objArr, null, i11, i12);
                Arrays.fill(objArr, 0, i13, (Object) null);
            } else {
                Q3.d.w(objArr, null, i11, i13);
            }
            this.f42978d = i13;
            this.f42979e -= i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[e()]);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        Object[] objArr;
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i10 = this.f42979e;
        if (length < i10) {
            array = (T[]) Arrays.copyOf(array, i10);
            kotlin.jvm.internal.i.d(array, "copyOf(...)");
        }
        int i11 = this.f42979e;
        int i12 = this.f42978d;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f42976b;
            if (i14 >= i11 || i12 >= this.f42977c) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        M1.l(i11, array);
        return array;
    }
}
