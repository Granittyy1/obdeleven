package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMutableMap.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e<K, V> extends java.util.AbstractMap<K, V> implements Map<K, V>, Ja.d {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new E.h((E.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new E.j((E.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((E.f) this).f2944g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new E.l((E.f) this);
    }
}
