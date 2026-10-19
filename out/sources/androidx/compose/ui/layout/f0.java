package androidx.compose.ui.layout;

import androidx.collection.MutableOrderedSetWrapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    /* JADX INFO: compiled from: SubcomposeLayout.kt */
    public static final class a implements Collection<Object>, Ja.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.collection.J<Object> f14242b;

        public a(int i10) {
            int i11 = androidx.collection.S.f9121a;
            this.f14242b = new androidx.collection.J<>(6);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f14242b.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f14242b.c();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.f14242b.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f14242b.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f14242b.f9116g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<Object> iterator() {
            androidx.collection.J<Object> j = this.f14242b;
            j.getClass();
            return new MutableOrderedSetWrapper(j).iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f14242b.g(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.f14242b.g(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.f14242b.i(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f14242b.f9116g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return kotlin.jvm.internal.d.a(this);
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) kotlin.jvm.internal.d.b(this, tArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
