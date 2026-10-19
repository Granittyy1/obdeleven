package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28837b = new a();
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private LinkedTreeMap<K, V>.b entrySet;
    final e<K, V> header;
    private LinkedTreeMap<K, V>.c keySet;
    int modCount;
    e<K, V> root;
    int size;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public final int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            e eVarA;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            Object key = entry.getKey();
            e eVar = null;
            if (key != null) {
                try {
                    eVarA = linkedTreeMap.a(key, false);
                } catch (ClassCastException unused) {
                    eVarA = null;
                }
            } else {
                eVarA = null;
            }
            if (eVarA != null && Objects.equals(eVarA.f28851i, entry.getValue())) {
                eVar = eVarA;
            }
            return eVar != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            e eVarA;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            Object key = entry.getKey();
            e eVar = null;
            if (key != null) {
                try {
                    eVarA = linkedTreeMap.a(key, false);
                } catch (ClassCastException unused) {
                    eVarA = null;
                }
            } else {
                eVarA = null;
            }
            if (eVarA != null && Objects.equals(eVarA.f28851i, entry.getValue())) {
                eVar = eVarA;
            }
            if (eVar == null) {
                return false;
            }
            linkedTreeMap.c(eVar, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends LinkedTreeMap<K, V>.d<K> {
            @Override // com.google.gson.internal.LinkedTreeMap.d, java.util.Iterator
            public final K next() {
                return a().f28849g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return LinkedTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.getClass();
            e<K, V> eVarA = null;
            if (obj != null) {
                try {
                    eVarA = linkedTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (eVarA != null) {
                linkedTreeMap.c(eVarA, true);
            }
            return eVarA != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f28840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f28841c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28842d;

        public d() {
            this.f28840b = LinkedTreeMap.this.header.f28847e;
            this.f28842d = LinkedTreeMap.this.modCount;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f28840b;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.header) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.modCount != this.f28842d) {
                throw new ConcurrentModificationException();
            }
            this.f28840b = eVar.f28847e;
            this.f28841c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f28840b != LinkedTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f28841c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            linkedTreeMap.c(eVar, true);
            this.f28841c = null;
            this.f28842d = linkedTreeMap.modCount;
        }
    }

    public LinkedTreeMap() {
        this(true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final e<K, V> a(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.comparator;
        e<K, V> eVar2 = this.root;
        a aVar = f28837b;
        if (eVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f28849g;
                iCompareTo = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f28845c : eVar2.f28846d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new e<>(this.allowNullValues, eVar2, k10, eVar4, eVar4.f28848f);
            if (iCompareTo < 0) {
                eVar2.f28845c = eVar;
            } else {
                eVar2.f28846d = eVar;
            }
            b(eVar2, true);
        } else {
            if (comparator == aVar && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            eVar = new e<>(this.allowNullValues, eVar2, k10, eVar4, eVar4.f28848f);
            this.root = eVar;
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    public final void b(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f28845c;
            e<K, V> eVar3 = eVar.f28846d;
            int i10 = eVar2 != null ? eVar2.j : 0;
            int i11 = eVar3 != null ? eVar3.j : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f28845c;
                e<K, V> eVar5 = eVar3.f28846d;
                int i13 = (eVar4 != null ? eVar4.j : 0) - (eVar5 != null ? eVar5.j : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    f(eVar);
                } else {
                    h(eVar3);
                    f(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f28845c;
                e<K, V> eVar7 = eVar2.f28846d;
                int i14 = (eVar6 != null ? eVar6.j : 0) - (eVar7 != null ? eVar7.j : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    h(eVar);
                } else {
                    f(eVar2);
                    h(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.j = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.j = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f28844b;
        }
    }

    public final void c(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i10;
        if (z10) {
            e<K, V> eVar4 = eVar.f28848f;
            eVar4.f28847e = eVar.f28847e;
            eVar.f28847e.f28848f = eVar4;
        }
        e<K, V> eVar5 = eVar.f28845c;
        e<K, V> eVar6 = eVar.f28846d;
        e<K, V> eVar7 = eVar.f28844b;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                e(eVar, eVar5);
                eVar.f28845c = null;
            } else if (eVar6 != null) {
                e(eVar, eVar6);
                eVar.f28846d = null;
            } else {
                e(eVar, null);
            }
            b(eVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (eVar5.j > eVar6.j) {
            e<K, V> eVar8 = eVar5.f28846d;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f28846d;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f28845c;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f28845c;
                }
            }
            eVar3 = eVar2;
        }
        c(eVar3, false);
        e<K, V> eVar11 = eVar.f28845c;
        if (eVar11 != null) {
            i10 = eVar11.j;
            eVar3.f28845c = eVar11;
            eVar11.f28844b = eVar3;
            eVar.f28845c = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar12 = eVar.f28846d;
        if (eVar12 != null) {
            i11 = eVar12.j;
            eVar3.f28846d = eVar12;
            eVar12.f28844b = eVar3;
            eVar.f28846d = null;
        }
        eVar3.j = Math.max(i10, i11) + 1;
        e(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        e<K, V> eVar = this.header;
        eVar.f28848f = eVar;
        eVar.f28847e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        e<K, V> eVarA = null;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return eVarA != null;
    }

    public final void e(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f28844b;
        eVar.f28844b = null;
        if (eVar2 != null) {
            eVar2.f28844b = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f28845c == eVar) {
            eVar3.f28845c = eVar2;
        } else {
            eVar3.f28846d = eVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.entrySet = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f28845c;
        e<K, V> eVar3 = eVar.f28846d;
        e<K, V> eVar4 = eVar3.f28845c;
        e<K, V> eVar5 = eVar3.f28846d;
        eVar.f28846d = eVar4;
        if (eVar4 != null) {
            eVar4.f28844b = eVar;
        }
        e(eVar, eVar3);
        eVar3.f28845c = eVar;
        eVar.f28844b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.j : 0, eVar4 != null ? eVar4.j : 0) + 1;
        eVar.j = iMax;
        eVar3.j = Math.max(iMax, eVar5 != null ? eVar5.j : 0) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
                eVarA = null;
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            return eVarA.f28851i;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f28845c;
        e<K, V> eVar3 = eVar.f28846d;
        e<K, V> eVar4 = eVar2.f28845c;
        e<K, V> eVar5 = eVar2.f28846d;
        eVar.f28845c = eVar5;
        if (eVar5 != null) {
            eVar5.f28844b = eVar;
        }
        e(eVar, eVar2);
        eVar2.f28846d = eVar;
        eVar.f28844b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.j : 0, eVar5 != null ? eVar5.j : 0) + 1;
        eVar.j = iMax;
        eVar2.j = Math.max(iMax, eVar4 != null ? eVar4.j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.keySet = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v10 == null && !this.allowNullValues) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarA = a(k10, true);
        V v11 = eVarA.f28851i;
        eVarA.f28851i = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        e<K, V> eVarA;
        if (obj != 0) {
            try {
                eVarA = a(obj, false);
            } catch (ClassCastException unused) {
                eVarA = null;
            }
        } else {
            eVarA = null;
        }
        if (eVarA != null) {
            c(eVarA, true);
        }
        if (eVarA != null) {
            return eVarA.f28851i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public LinkedTreeMap(boolean z10) {
        a aVar = f28837b;
        this.size = 0;
        this.modCount = 0;
        this.comparator = aVar;
        this.allowNullValues = z10;
        this.header = new e<>(z10);
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f28844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f28845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f28846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f28847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f28848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f28849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f28850h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public V f28851i;
        public int j;

        public e(boolean z10) {
            this.f28849g = null;
            this.f28850h = z10;
            this.f28848f = this;
            this.f28847e = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f28849g;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f28851i;
            if (v10 == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v10.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f28849g;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f28851i;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f28849g;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f28851i;
            return (v10 != null ? v10.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (v10 == null && !this.f28850h) {
                throw new NullPointerException("value == null");
            }
            V v11 = this.f28851i;
            this.f28851i = v10;
            return v11;
        }

        public final String toString() {
            return this.f28849g + "=" + this.f28851i;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f28844b = eVar;
            this.f28849g = k10;
            this.f28850h = z10;
            this.j = 1;
            this.f28847e = eVar2;
            this.f28848f = eVar3;
            eVar3.f28847e = this;
            eVar2.f28848f = this;
        }
    }
}
