package com.parse;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
class WeakValueHashMap<K, V> {
    private HashMap<K, WeakReference<V>> map = new HashMap<>();

    public V get(K k10) {
        WeakReference<V> weakReference = this.map.get(k10);
        if (weakReference == null) {
            return null;
        }
        V v10 = weakReference.get();
        if (v10 == null) {
            this.map.remove(k10);
        }
        return v10;
    }

    public void put(K k10, V v10) {
        this.map.put(k10, new WeakReference<>(v10));
    }

    public void remove(K k10) {
        this.map.remove(k10);
    }
}
