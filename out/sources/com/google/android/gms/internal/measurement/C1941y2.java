package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1941y2 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25924b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzij f25926d;

    public C1941y2(zzij zzijVar) {
        this.f25926d = zzijVar;
        this.f25925c = zzijVar.B();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25924b < this.f25925c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f25924b;
        if (i10 >= this.f25925c) {
            throw new NoSuchElementException();
        }
        this.f25924b = i10 + 1;
        return Byte.valueOf(this.f25926d.A(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
