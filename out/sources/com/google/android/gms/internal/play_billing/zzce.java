package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzce extends zzbt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f26333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f26334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f26335f;

    public zzce(int i10, int i11, Object[] objArr) {
        this.f26333d = objArr;
        this.f26334e = i10;
        this.f26335f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C1989n.a(i10, this.f26335f);
        Object obj = this.f26333d[i10 + i10 + this.f26334e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean s() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26335f;
    }
}
