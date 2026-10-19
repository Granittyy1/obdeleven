package com.google.common.collect;

import java.util.Map;

/* JADX INFO: renamed from: com.google.common.collect.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractMapEntry.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2037c<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return kotlinx.coroutines.C.j(getKey(), entry.getKey()) && kotlinx.coroutines.C.j(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
