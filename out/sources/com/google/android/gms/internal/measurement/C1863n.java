package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1863n implements Iterator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f25800b;

    public C1863n(Iterator it) {
        this.f25800b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25800b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1884q next() {
        return new C1897s((String) this.f25800b.next());
    }
}
