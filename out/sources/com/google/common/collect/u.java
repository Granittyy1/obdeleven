package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultimapBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends MultimapBuilder.a<Object, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultimapBuilder.b f27991a;

    public u(MultimapBuilder.b bVar) {
        this.f27991a = bVar;
    }

    public final <K, V> n<K, V> b() {
        Map<K, Collection<V>> mapB = this.f27991a.b();
        MultimapBuilder.ArrayListSupplier arrayListSupplier = new MultimapBuilder.ArrayListSupplier();
        Multimaps$CustomListMultimap multimaps$CustomListMultimap = new Multimaps$CustomListMultimap();
        A8.p.g(mapB.isEmpty());
        multimaps$CustomListMultimap.f27819e = mapB;
        multimaps$CustomListMultimap.f27938g = arrayListSupplier;
        return multimaps$CustomListMultimap;
    }
}
