package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1828i implements Iterator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25770b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1814g f25771c;

    public C1828i(C1814g c1814g) {
        this.f25771c = c1814g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25770b < this.f25771c.s();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1884q next() {
        int i10 = this.f25770b;
        C1814g c1814g = this.f25771c;
        if (i10 >= c1814g.s()) {
            throw new NoSuchElementException(J4.i.b(this.f25770b, "Out of bounds index: "));
        }
        int i11 = this.f25770b;
        this.f25770b = i11 + 1;
        return c1814g.d(i11);
    }
}
