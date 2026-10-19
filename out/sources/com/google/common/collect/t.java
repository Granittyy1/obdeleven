package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends MultimapBuilder.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f27990a;

    public t(Comparator comparator) {
        this.f27990a = comparator;
    }

    @Override // com.google.common.collect.MultimapBuilder.b
    public final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f27990a);
    }
}
