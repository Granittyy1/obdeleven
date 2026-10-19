package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: Sets.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends AbstractIterator<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator<Object> f27992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f27993e;

    public x(y yVar) {
        this.f27993e = yVar;
        this.f27992d = yVar.f27994b.iterator();
    }

    @Override // com.google.common.collect.AbstractIterator
    public final Object a() {
        Object next;
        do {
            Iterator<Object> it = this.f27992d;
            if (!it.hasNext()) {
                this.f27812b = AbstractIterator.State.f27816d;
                return null;
            }
            next = it.next();
        } while (!this.f27993e.f27995c.contains(next));
        return next;
    }
}
