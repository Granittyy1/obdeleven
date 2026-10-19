package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class Q0 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f26151b;

    public Q0(Iterator it) {
        this.f26151b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26151b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f26151b.next();
        return entry.getValue() instanceof R0 ? new P0(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f26151b.remove();
    }
}
