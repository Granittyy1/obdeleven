package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1993o0 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzei f26233d;

    public C1993o0(zzei zzeiVar) {
        Objects.requireNonNull(zzeiVar);
        this.f26233d = zzeiVar;
        this.f26231b = 0;
        this.f26232c = zzeiVar.g();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26231b < this.f26232c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f26231b;
        if (i10 >= this.f26232c) {
            throw new NoSuchElementException();
        }
        this.f26231b = i10 + 1;
        return Byte.valueOf(this.f26233d.e(i10));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
