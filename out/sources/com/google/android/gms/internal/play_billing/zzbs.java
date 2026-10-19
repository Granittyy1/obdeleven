package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbs extends zzbt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f26318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f26319e;
    final /* synthetic */ zzbt zzc;

    public zzbs(zzbt zzbtVar, int i10, int i11) {
        Objects.requireNonNull(zzbtVar);
        this.zzc = zzbtVar;
        this.f26318d = i10;
        this.f26319e = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final zzbt subList(int i10, int i11) {
        C1989n.c(i10, i11, this.f26319e);
        zzbt zzbtVar = this.zzc;
        int i12 = this.f26318d;
        return zzbtVar.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int e() {
        return this.zzc.g() + this.f26318d + this.f26319e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int g() {
        return this.zzc.g() + this.f26318d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1989n.a(i10, this.f26319e);
        return this.zzc.get(i10 + this.f26318d);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26319e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final Object[] v() {
        return this.zzc.v();
    }
}
