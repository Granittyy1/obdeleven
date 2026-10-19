package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SmallSortedMap.java */
/* JADX INFO: loaded from: classes.dex */
public class a0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f17197h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17198b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile a0<K, V>.d f17202f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<a0<K, V>.b> f17199c = Collections.emptyList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, V> f17200d = Collections.emptyMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<K, V> f17203g = Collections.emptyMap();

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0179a f17204a = new C0179a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f17205b = new b();

        /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class C0179a implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: compiled from: SmallSortedMap.java */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return a.f17204a;
            }
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class b implements Map.Entry<K, V>, Comparable<a0<K, V>.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f17206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f17207c;

        public b() {
            throw null;
        }

        public b(K k10, V v10) {
            this.f17206b = k10;
            this.f17207c = v10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f17206b.compareTo(((b) obj).f17206b);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean zEquals;
            boolean zEquals2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            K k10 = this.f17206b;
            if (k10 == null) {
                zEquals = key == null;
            } else {
                zEquals = k10.equals(key);
            }
            if (zEquals) {
                V v10 = this.f17207c;
                Object value = entry.getValue();
                if (v10 == null) {
                    zEquals2 = value == null;
                } else {
                    zEquals2 = v10.equals(value);
                }
                if (zEquals2) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f17206b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f17207c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f17206b;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f17207c;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            int i10 = a0.f17197h;
            a0.this.b();
            V v11 = this.f17207c;
            this.f17207c = v10;
            return v11;
        }

        public final String toString() {
            return this.f17206b + "=" + this.f17207c;
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class c implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17209b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f17211d;

        public c() {
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f17211d == null) {
                this.f17211d = a0.this.f17200d.entrySet().iterator();
            }
            return this.f17211d;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i10 = this.f17209b + 1;
            a0 a0Var = a0.this;
            if (i10 >= a0Var.f17199c.size()) {
                return !a0Var.f17200d.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f17210c = true;
            int i10 = this.f17209b + 1;
            this.f17209b = i10;
            a0 a0Var = a0.this;
            return i10 < a0Var.f17199c.size() ? a0Var.f17199c.get(this.f17209b) : a().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f17210c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f17210c = false;
            int i10 = a0.f17197h;
            a0 a0Var = a0.this;
            a0Var.b();
            if (this.f17209b >= a0Var.f17199c.size()) {
                a().remove();
                return;
            }
            int i11 = this.f17209b;
            this.f17209b = i11 - 1;
            a0Var.k(i11);
        }
    }

    /* JADX INFO: compiled from: SmallSortedMap.java */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            a0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            a0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = a0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            a0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return a0.this.size();
        }
    }

    public a0(int i10) {
        this.f17198b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f17199c.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f17199c.get(i12).f17206b);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f17199c.get(i13).f17206b);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f17199c.get(i12).f17206b);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void b() {
        if (this.f17201e) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> c(int i10) {
        return this.f17199c.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f17199c.isEmpty()) {
            this.f17199c.clear();
        }
        if (this.f17200d.isEmpty()) {
            return;
        }
        this.f17200d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f17200d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f17200d.isEmpty() ? a.f17205b : this.f17200d.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f17202f == null) {
            this.f17202f = new d();
        }
        return this.f17202f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        int size = size();
        if (size != a0Var.size()) {
            return false;
        }
        int size2 = this.f17199c.size();
        if (size2 != a0Var.f17199c.size()) {
            return ((AbstractSet) entrySet()).equals(a0Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!c(i10).equals(a0Var.c(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f17200d.equals(a0Var.f17200d);
        }
        return true;
    }

    public final SortedMap<K, V> f() {
        b();
        if (this.f17200d.isEmpty() && !(this.f17200d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f17200d = treeMap;
            this.f17203g = treeMap.descendingMap();
        }
        return (SortedMap) this.f17200d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? this.f17199c.get(iA).f17207c : this.f17200d.get(comparable);
    }

    public void h() {
        if (this.f17201e) {
            return;
        }
        this.f17200d = this.f17200d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f17200d);
        this.f17203g = this.f17203g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f17203g);
        this.f17201e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f17199c.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += this.f17199c.get(i10).hashCode();
        }
        return this.f17200d.size() > 0 ? iHashCode + this.f17200d.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        b();
        int iA = a(k10);
        if (iA >= 0) {
            return this.f17199c.get(iA).setValue(v10);
        }
        b();
        boolean zIsEmpty = this.f17199c.isEmpty();
        int i10 = this.f17198b;
        if (zIsEmpty && !(this.f17199c instanceof ArrayList)) {
            this.f17199c = new ArrayList(i10);
        }
        int i11 = -(iA + 1);
        if (i11 >= i10) {
            return f().put(k10, v10);
        }
        if (this.f17199c.size() == i10) {
            a0<K, V>.b bVarRemove = this.f17199c.remove(i10 - 1);
            f().put(bVarRemove.f17206b, bVarRemove.f17207c);
        }
        this.f17199c.add(i11, new b(k10, v10));
        return null;
    }

    public final V k(int i10) {
        b();
        V v10 = this.f17199c.remove(i10).f17207c;
        if (!this.f17200d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            List<a0<K, V>.b> list = this.f17199c;
            Map.Entry<K, V> next = it.next();
            list.add(new b(next.getKey(), next.getValue()));
            it.remove();
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return k(iA);
        }
        if (this.f17200d.isEmpty()) {
            return null;
        }
        return this.f17200d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f17200d.size() + this.f17199c.size();
    }
}
