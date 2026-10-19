package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: ForwardingConcurrentMap.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j<K, V> extends k<K, V> implements ConcurrentMap<K, V> {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V putIfAbsent(K k10, V v10) {
        return (V) ((MapMakerInternalMap.AbstractSerializationProxy) this).f27903b.putIfAbsent(k10, v10);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f27903b.remove(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final V replace(K k10, V v10) {
        return (V) ((MapMakerInternalMap.AbstractSerializationProxy) this).f27903b.replace(k10, v10);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractMap, java.util.concurrent.ConcurrentMap] */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(K k10, V v10, V v11) {
        return ((MapMakerInternalMap.AbstractSerializationProxy) this).f27903b.replace(k10, v10, v11);
    }
}
