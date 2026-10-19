package com.google.android.gms.internal.location;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzey extends zzex {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzex f25388f = new zzey(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f25389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25390e;

    public zzey(int i10, Object[] objArr) {
        this.f25389d = objArr;
        this.f25390e = i10;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final Object[] e() {
        return this.f25389d;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        l.a(i10, this.f25390e);
        Object obj = this.f25389d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final int k() {
        return this.f25390e;
    }

    @Override // com.google.android.gms.internal.location.zzeu
    public final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25390e;
    }

    @Override // com.google.android.gms.internal.location.zzex, com.google.android.gms.internal.location.zzeu
    public final void v(Object[] objArr) {
        System.arraycopy(this.f25389d, 0, objArr, 0, this.f25390e);
    }
}
