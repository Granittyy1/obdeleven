package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class C0873a<K, V> extends X<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0873a<K, V>.C0118a f9145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0873a<K, V>.c f9146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0873a<K, V>.e f9147g;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class C0118a extends AbstractSet<Map.Entry<K, V>> {
        public C0118a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C0873a.this.f9139d;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$b */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class b extends AbstractC0878f<K> {
        public b() {
            super(C0873a.this.f9139d);
        }

        @Override // androidx.collection.AbstractC0878f
        public final K a(int i10) {
            return C0873a.this.h(i10);
        }

        @Override // androidx.collection.AbstractC0878f
        public final void b(int i10) {
            C0873a.this.k(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$d */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9152c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9153d;

        public d() {
            this.f9151b = C0873a.this.f9139d - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f9153d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f9152c;
            C0873a c0873a = C0873a.this;
            return kotlin.jvm.internal.i.a(key, c0873a.h(i10)) && kotlin.jvm.internal.i.a(entry.getValue(), c0873a.m(this.f9152c));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f9153d) {
                return C0873a.this.h(this.f9152c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f9153d) {
                return C0873a.this.m(this.f9152c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f9152c < this.f9151b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f9153d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i10 = this.f9152c;
            C0873a c0873a = C0873a.this;
            K kH = c0873a.h(i10);
            V vM = c0873a.m(this.f9152c);
            return (kH == null ? 0 : kH.hashCode()) ^ (vM != null ? vM.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f9152c++;
            this.f9153d = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f9153d) {
                throw new IllegalStateException();
            }
            C0873a.this.k(this.f9152c);
            this.f9152c--;
            this.f9151b--;
            this.f9153d = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.f9153d) {
                return C0873a.this.l(this.f9152c, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$f */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class f extends AbstractC0878f<V> {
        public f() {
            super(C0873a.this.f9139d);
        }

        @Override // androidx.collection.AbstractC0878f
        public final V a(int i10) {
            return C0873a.this.m(i10);
        }

        @Override // androidx.collection.AbstractC0878f
        public final void b(int i10) {
            C0873a.this.k(i10);
        }
    }

    public C0873a(C0873a c0873a) {
        super(0);
        if (c0873a != null) {
            j(c0873a);
        }
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        C0873a<K, V>.C0118a c0118a = this.f9145e;
        if (c0118a != null) {
            return c0118a;
        }
        C0873a<K, V>.C0118a c0118a2 = new C0118a();
        this.f9145e = c0118a2;
        return c0118a2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        C0873a<K, V>.c cVar = this.f9146f;
        if (cVar != null) {
            return cVar;
        }
        C0873a<K, V>.c cVar2 = new c();
        this.f9146f = cVar2;
        return cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(Collection<?> collection) {
        int i10 = this.f9139d;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f9139d;
    }

    public final boolean p(Collection<?> collection) {
        int i10 = this.f9139d;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(h(i11))) {
                k(i11);
            }
        }
        return i10 != this.f9139d;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f9139d);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        C0873a<K, V>.e eVar = this.f9147g;
        if (eVar != null) {
            return eVar;
        }
        C0873a<K, V>.e eVar2 = new e();
        this.f9147g = eVar2;
        return eVar2;
    }

    /* JADX INFO: renamed from: androidx.collection.a$c */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            C0873a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return C0873a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return C0873a.this.n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size() && containsAll(set)) {
                        return true;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            C0873a c0873a = C0873a.this;
            int iHashCode = 0;
            for (int i10 = c0873a.f9139d - 1; i10 >= 0; i10--) {
                K kH = c0873a.h(i10);
                iHashCode += kH == null ? 0 : kH.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return C0873a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            C0873a c0873a = C0873a.this;
            int iE = c0873a.e(obj);
            if (iE < 0) {
                return false;
            }
            c0873a.k(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return C0873a.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return C0873a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return C0873a.this.f9139d;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = c0873a.h(i11);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = c0873a.h(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$e */
    /* JADX INFO: compiled from: ArrayMap.java */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            C0873a.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return C0873a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return C0873a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            C0873a c0873a = C0873a.this;
            int iA = c0873a.a(obj);
            if (iA < 0) {
                return false;
            }
            c0873a.k(iA);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (collection.contains(c0873a.m(i11))) {
                    c0873a.k(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            int i11 = 0;
            boolean z10 = false;
            while (i11 < i10) {
                if (!collection.contains(c0873a.m(i11))) {
                    c0873a.k(i11);
                    i11--;
                    i10--;
                    z10 = true;
                }
                i11++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return C0873a.this.f9139d;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            Object[] objArr = new Object[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[i11] = c0873a.m(i11);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            C0873a c0873a = C0873a.this;
            int i10 = c0873a.f9139d;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = c0873a.m(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }
    }

    public C0873a() {
    }
}
