package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1918v implements Iterator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25886b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1897s f25887c;

    public C1918v(C1897s c1897s) {
        this.f25887c = c1897s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25886b < this.f25887c.f25833b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1884q next() {
        if (this.f25886b >= this.f25887c.f25833b.length()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f25886b;
        this.f25886b = i10 + 1;
        return new C1897s(String.valueOf(i10));
    }
}
