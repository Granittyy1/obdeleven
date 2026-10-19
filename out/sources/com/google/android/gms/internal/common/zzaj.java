package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaj extends zzah {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzah f25364f = new zzaj(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f25365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25366e;

    public zzaj(int i10, Object[] objArr) {
        this.f25365d = objArr;
        this.f25366e = i10;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] d() {
        return this.f25365d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int g() {
        return this.f25366e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j.a(i10, this.f25366e);
        Object obj = this.f25365d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final int k(Object[] objArr) {
        Object[] objArr2 = this.f25365d;
        int i10 = this.f25366e;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25366e;
    }
}
