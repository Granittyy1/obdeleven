package com.google.common.collect;

/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends CompactHashMap<Object, Object>.b<Object> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CompactHashMap f27973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CompactHashMap compactHashMap) {
        super();
        this.f27973f = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.b
    public final Object a(int i10) {
        Object obj = CompactHashMap.f27851k;
        return this.f27973f.m()[i10];
    }
}
