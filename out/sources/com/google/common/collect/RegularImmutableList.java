package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ImmutableList<Object> f27940f = new RegularImmutableList(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f27941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f27942e;

    public RegularImmutableList(int i10, Object[] objArr) {
        this.f27941d = objArr;
        this.f27942e = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int e(int i10, Object[] objArr) {
        Object[] objArr2 = this.f27941d;
        int i11 = this.f27942e;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] g() {
        return this.f27941d;
    }

    @Override // java.util.List
    public final E get(int i10) {
        A8.p.h(i10, this.f27942e);
        E e10 = (E) this.f27941d[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int k() {
        return this.f27942e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int q() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27942e;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
