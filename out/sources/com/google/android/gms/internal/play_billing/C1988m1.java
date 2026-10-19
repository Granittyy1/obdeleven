package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.C0936h;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1988m1 extends AbstractC1975i0 implements RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object[] f26219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1988m1 f26220f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f26221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26222d;

    static {
        Object[] objArr = new Object[0];
        f26219e = objArr;
        f26220f = new C1988m1(objArr, 0, false);
    }

    public C1988m1() {
        this(f26219e, 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f26222d)) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26222d, "Index:", ", Size:"));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f26221c;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[C0936h.b(length, 3, 2, 1, 10)];
            System.arraycopy(this.f26221c, 0, objArr2, 0, i10);
            System.arraycopy(this.f26221c, i10, objArr2, i12, this.f26222d - i10);
            this.f26221c = objArr2;
        }
        this.f26221c[i10] = obj;
        this.f26222d++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f26222d) {
            throw new IndexOutOfBoundsException(A8.f.d(i10, this.f26222d, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f26221c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.N0
    public final /* bridge */ /* synthetic */ N0 o(int i10) {
        if (i10 >= this.f26222d) {
            return new C1988m1(i10 == 0 ? f26219e : Arrays.copyOf(this.f26221c, i10), this.f26222d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1975i0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        e(i10);
        Object[] objArr = this.f26221c;
        Object obj = objArr[i10];
        int i11 = this.f26222d;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f26222d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        e(i10);
        Object[] objArr = this.f26221c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26222d;
    }

    public C1988m1(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f26221c = objArr;
        this.f26222d = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i10 = this.f26222d;
        int length = this.f26221c.length;
        if (i10 == length) {
            this.f26221c = Arrays.copyOf(this.f26221c, C0936h.b(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.f26221c;
        int i11 = this.f26222d;
        this.f26222d = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
