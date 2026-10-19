package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y2<K> implements Iterator<Map.Entry<K, Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator<Map.Entry<K, Object>> f25645b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25645b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry<K, Object> next = this.f25645b.next();
        if (!(next.getValue() instanceof X2)) {
            return next;
        }
        W2 w3 = new W2();
        w3.f25624b = next;
        return w3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25645b.remove();
    }
}
