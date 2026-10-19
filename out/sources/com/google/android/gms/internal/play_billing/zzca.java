package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzca extends zzbt {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzbt f26325f = new zzca(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f26326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f26327e;

    public zzca(int i10, Object[] objArr) {
        this.f26326d = objArr;
        this.f26327e = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt, com.google.android.gms.internal.play_billing.zzbq
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f26326d;
        int i10 = this.f26327e;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int e() {
        return this.f26327e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1989n.a(i10, this.f26327e);
        Object obj = this.f26326d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26327e;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final Object[] v() {
        return this.f26326d;
    }
}
