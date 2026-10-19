package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1911u implements Iterator<InterfaceC1884q> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25851b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1897s f25852c;

    public C1911u(C1897s c1897s) {
        this.f25852c = c1897s;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25851b < this.f25852c.f25833b.length();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ InterfaceC1884q next() {
        int i10 = this.f25851b;
        C1897s c1897s = this.f25852c;
        if (i10 >= c1897s.f25833b.length()) {
            throw new NoSuchElementException();
        }
        String str = c1897s.f25833b;
        int i11 = this.f25851b;
        this.f25851b = i11 + 1;
        return new C1897s(String.valueOf(str.charAt(i11)));
    }
}
