package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcd extends zzbx {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzbw f26331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient zzbt f26332e;

    public zzcd(zzbw zzbwVar, zzbt zzbtVar) {
        this.f26331d = zzbwVar;
        this.f26332e = zzbtVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f26331d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int d(Object[] objArr) {
        return this.f26332e.d(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f26332e.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, com.google.android.gms.internal.play_billing.zzbq
    public final zzbt k() {
        return this.f26332e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: q */
    public final C2006t iterator() {
        return this.f26332e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26331d.size();
    }
}
