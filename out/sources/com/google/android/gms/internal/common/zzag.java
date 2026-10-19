package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzag extends zzah {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25362e;
    final /* synthetic */ zzah zzc;

    public zzag(zzah zzahVar, int i10, int i11) {
        Objects.requireNonNull(zzahVar);
        this.zzc = zzahVar;
        this.f25361d = i10;
        this.f25362e = i11;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] d() {
        return this.zzc.d();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.zzc.e() + this.f25361d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int g() {
        return this.zzc.e() + this.f25361d + this.f25362e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j.a(i10, this.f25362e);
        return this.zzc.get(i10 + this.f25361d);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: s */
    public final zzah subList(int i10, int i11) {
        j.b(i10, i11, this.f25362e);
        zzah zzahVar = this.zzc;
        int i12 = this.f25361d;
        return zzahVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25362e;
    }
}
