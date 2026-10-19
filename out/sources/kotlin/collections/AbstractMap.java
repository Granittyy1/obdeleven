package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AbstractMap.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractMap<K, V> implements Map<K, V>, Ja.a {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new E.n((E.d) this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (((E.d) this).f2935c != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v10 = get(key);
                if (kotlin.jvm.internal.i.a(value, v10) && (v10 != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((E.d) this).f2935c == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new E.p((E.d) this);
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
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((E.d) this).f2935c;
    }

    public final String toString() {
        return q.U(entrySet(), ", ", "{", "}", new Ia.l<Map.Entry<? extends K, ? extends V>, CharSequence>(this) { // from class: kotlin.collections.AbstractMap.toString.1
            final /* synthetic */ AbstractMap<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // Ia.l
            public final CharSequence invoke(Object obj) {
                Map.Entry it = (Map.Entry) obj;
                kotlin.jvm.internal.i.e(it, "it");
                AbstractMap<K, V> abstractMap = this.this$0;
                abstractMap.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = it.getKey();
                sb2.append(key == abstractMap ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = it.getValue();
                sb2.append(value != abstractMap ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            }
        }, 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new E.r((E.d) this);
    }
}
