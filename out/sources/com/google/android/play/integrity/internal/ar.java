package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
final class ar extends ap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ap f27726f = new ar(new Object[0]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f27727e;

    public ar(Object[] objArr) {
        this.f27727e = objArr;
    }

    @Override // com.google.android.play.integrity.internal.ap, com.google.android.play.integrity.internal.am
    public final void d(Object[] objArr) {
        System.arraycopy(this.f27727e, 0, objArr, 0, 0);
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int e() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, 0);
        Object obj = this.f27727e[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] k() {
        return this.f27727e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
