package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzew extends zzex {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25386e;
    final /* synthetic */ zzex zzc;

    public zzew(zzex zzexVar, int i10, int i11) {
        this.zzc = zzexVar;
        this.f25385d = i10;
        this.f25386e = i11;
    }

    @Override // com.google.android.gms.internal.location.zzex, java.util.List
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final zzex subList(int i10, int i11) {
        l.b(i10, i11, this.f25386e);
        zzex zzexVar = this.zzc;
        int i12 = this.f25385d;
        return zzexVar.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] e() {
        return this.zzc.e();
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int g() {
        return this.zzc.g() + this.f25385d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l.a(i10, this.f25386e);
        return this.zzc.get(i10 + this.f25385d);
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int k() {
        return this.zzc.g() + this.f25385d + this.f25386e;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25386e;
    }
}
