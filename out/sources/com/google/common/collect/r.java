package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: Multimap.java */
/* JADX INFO: loaded from: classes3.dex */
public interface r<K, V> {
    boolean a(Double d10, Integer num);

    Map<K, Collection<V>> b();

    void clear();

    Collection<V> values();
}
