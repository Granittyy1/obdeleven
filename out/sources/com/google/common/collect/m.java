package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: Iterators.java */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends AbstractIterator<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f27978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.common.base.e f27979e;

    public m(Iterator it, com.google.common.base.e eVar) {
        this.f27978d = it;
        this.f27979e = eVar;
    }

    @Override // com.google.common.collect.AbstractIterator
    public final Object a() {
        Object next;
        do {
            Iterator it = this.f27978d;
            if (!it.hasNext()) {
                this.f27812b = AbstractIterator.State.f27816d;
                return null;
            }
            next = it.next();
        } while (!this.f27979e.apply(next));
        return next;
    }
}
