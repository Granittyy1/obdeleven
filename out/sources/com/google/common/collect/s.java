package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends MultimapBuilder.b<Object> {
    @Override // com.google.common.collect.MultimapBuilder.b
    public final <K, V> Map<K, Collection<V>> b() {
        return CompactHashMap.a();
    }
}
