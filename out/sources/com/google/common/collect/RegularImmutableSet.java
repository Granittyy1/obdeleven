package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    public static final Object[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RegularImmutableSet<Object> f27955k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f27956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f27957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object[] f27958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f27959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f27960i;

    static {
        Object[] objArr = new Object[0];
        j = objArr;
        f27955k = new RegularImmutableSet<>(0, 0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f27956e = objArr;
        this.f27957f = i10;
        this.f27958g = objArr2;
        this.f27959h = i11;
        this.f27960i = i12;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> I() {
        return ImmutableList.A(this.f27960i, this.f27956e);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f27958g;
            if (objArr.length != 0) {
                int iL = kotlin.jvm.internal.n.l(obj);
                while (true) {
                    int i10 = iL & this.f27959h;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iL = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i10, Object[] objArr) {
        Object[] objArr2 = this.f27956e;
        int i11 = this.f27960i;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.f27956e;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27957f;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int k() {
        return this.f27960i;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int q() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27960i;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: v */
    public final C<E> iterator() {
        return d().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
