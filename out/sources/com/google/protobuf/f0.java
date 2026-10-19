package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class f0 extends AbstractList<String> implements InterfaceC2083z, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2082y f29145b;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<String> f29146b;

        public a(f0 f0Var, int i10) {
            this.f29146b = f0Var.f29145b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f29146b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f29146b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f29146b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f29146b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f29146b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f29146b.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public final void set(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class b implements Iterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<String> f29147b;

        public b(f0 f0Var) {
            this.f29147b = f0Var.f29145b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f29147b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f29147b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public f0(C2082y c2082y) {
        this.f29145b = c2082y;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f29145b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final List<?> j() {
        return Collections.unmodifiableList(this.f29145b.f29206c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final Object m(int i10) {
        return this.f29145b.f29206c.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29145b.size();
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final void u(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.InterfaceC2083z
    public final InterfaceC2083z l() {
        return this;
    }
}
