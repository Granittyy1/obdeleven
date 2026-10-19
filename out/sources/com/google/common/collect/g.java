package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends CompactHashMap<Object, Object>.b<Map.Entry<Object, Object>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CompactHashMap f27972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CompactHashMap compactHashMap) {
        super();
        this.f27972f = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.b
    public final Map.Entry<Object, Object> a(int i10) {
        return new CompactHashMap.d(i10);
    }
}
