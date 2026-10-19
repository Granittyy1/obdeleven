package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AbstractList<String> implements InterfaceC1334y, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1333x f17225b;

    /* JADX INFO: compiled from: UnmodifiableLazyStringList.java */
    public class a implements ListIterator<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListIterator<String> f17226b;

        public a(f0 f0Var, int i10) {
            this.f17226b = f0Var.f17225b.listIterator(i10);
        }

        @Override // java.util.ListIterator
        public final void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f17226b.hasNext();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f17226b.hasPrevious();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            return this.f17226b.next();
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f17226b.nextIndex();
        }

        @Override // java.util.ListIterator
        public final String previous() {
            return this.f17226b.previous();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f17226b.previousIndex();
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
        public final Iterator<String> f17227b;

        public b(f0 f0Var) {
            this.f17227b = f0Var.f17225b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f17227b.hasNext();
        }

        @Override // java.util.Iterator
        public final String next() {
            return this.f17227b.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public f0(C1333x c1333x) {
        this.f17225b = c1333x;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final void D(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (String) this.f17225b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final List<?> j() {
        return Collections.unmodifiableList(this.f17225b.f17286c);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new a(this, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final Object m(int i10) {
        return this.f17225b.f17286c.get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17225b.size();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1334y
    public final InterfaceC1334y l() {
        return this;
    }
}
