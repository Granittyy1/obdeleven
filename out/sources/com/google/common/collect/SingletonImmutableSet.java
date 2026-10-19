package com.google.common.collect;

/* JADX INFO: loaded from: classes3.dex */
final class SingletonImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient E f27962e;

    public SingletonImmutableSet(E e10) {
        e10.getClass();
        this.f27962e = e10;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27962e.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> d() {
        return ImmutableList.M(this.f27962e);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int e(int i10, Object[] objArr) {
        objArr[i10] = this.f27962e;
        return i10 + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27962e.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f27962e.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: v */
    public final C<E> iterator() {
        return new Iterators.a(this.f27962e);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
