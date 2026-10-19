package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class U3 extends AbstractList<String> implements InterfaceC1790c3, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z2 f25606b;

    public U3(Z2 z10) {
        this.f25606b = z10;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final void H(zzij zzijVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        return (String) this.f25606b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new X3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new T3(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25606b.f25649c.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final Object w(int i10) {
        return this.f25606b.f25649c.get(i10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final List<?> z() {
        return Collections.unmodifiableList(this.f25606b.f25649c);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1790c3
    public final InterfaceC1790c3 b() {
        return this;
    }
}
