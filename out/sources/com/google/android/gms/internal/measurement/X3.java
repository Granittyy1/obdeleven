package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class X3 implements Iterator<String> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator<String> f25637b;

    public X3(U3 u10) {
        this.f25637b = u10.f25606b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25637b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f25637b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
