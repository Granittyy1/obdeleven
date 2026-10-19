package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1807f implements Iterator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f25701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f25702c;

    public C1807f(Iterator it, Iterator it2) {
        this.f25701b = it;
        this.f25702c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25701b.hasNext()) {
            return true;
        }
        return this.f25702c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1884q next() {
        Iterator it = this.f25701b;
        if (it.hasNext()) {
            return new C1897s(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f25702c;
        if (it2.hasNext()) {
            return new C1897s((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
