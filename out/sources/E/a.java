package E;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends kotlin.collections.f<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        Object key = entry.getKey();
        f<K, V> fVar = ((h) this).f2949b;
        V v10 = fVar.get((K) key);
        if (v10 != null) {
            return v10.equals(entry.getValue());
        }
        return entry.getValue() == null && fVar.containsKey((K) entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return ((h) this).f2949b.remove(entry.getKey(), entry.getValue());
    }
}
