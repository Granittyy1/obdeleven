package E;

import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, Ja.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f2929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f2930c;

    public b(K k10, V v10) {
        this.f2929b = k10;
        this.f2930c = v10;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.i.a(entry.getKey(), this.f2929b) && kotlin.jvm.internal.i.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f2929b;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f2930c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k10 = this.f2929b;
        int iHashCode = k10 != null ? k10.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2929b);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
