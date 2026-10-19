package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: androidx.collection.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0895x<K, V> implements Map<K, V>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T<K, V> f9223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Entries<K, V> f9224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Keys<K, V> f9225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Values<K, V> f9226e;

    public C0895x(T<K, V> parent) {
        kotlin.jvm.internal.i.e(parent, "parent");
        this.f9223b = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V compute(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfAbsent(K k10, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V computeIfPresent(K k10, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9223b.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9223b.c(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Entries<K, V> entries = this.f9224c;
        if (entries != null) {
            return entries;
        }
        Entries<K, V> entries2 = new Entries<>(this.f9223b);
        this.f9224c = entries2;
        return entries2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0895x.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f9223b, ((C0895x) obj).f9223b);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return this.f9223b.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9223b.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9223b.e();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        Keys<K, V> keys = this.f9225d;
        if (keys != null) {
            return keys;
        }
        Keys<K, V> keys2 = new Keys<>(this.f9223b);
        this.f9225d = keys2;
        return keys2;
    }

    @Override // java.util.Map
    public final V merge(K k10, V v10, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V putIfAbsent(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V replace(K k10, V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9223b.f9131e;
    }

    public final String toString() {
        return this.f9223b.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        Values<K, V> values = this.f9226e;
        if (values != null) {
            return values;
        }
        Values<K, V> values2 = new Values<>(this.f9223b);
        this.f9226e = values2;
        return values2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(K k10, V v10, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
