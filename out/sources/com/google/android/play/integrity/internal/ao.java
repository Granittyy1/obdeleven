package com.google.android.play.integrity.internal;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
final class ao extends ap {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f27721c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f27722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f27723f;

    public ao(ap apVar, int i10, int i11) {
        Objects.requireNonNull(apVar);
        this.f27721c = apVar;
        this.f27722e = i10;
        this.f27723f = i11;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int e() {
        return this.f27721c.g() + this.f27722e + this.f27723f;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int g() {
        return this.f27721c.g() + this.f27722e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        f.a(i10, this.f27723f);
        return this.f27721c.get(i10 + this.f27722e);
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] k() {
        return this.f27721c.k();
    }

    @Override // com.google.android.play.integrity.internal.ap, java.util.List
    /* JADX INFO: renamed from: q */
    public final ap subList(int i10, int i11) {
        f.b(i10, i11, this.f27723f);
        ap apVar = this.f27721c;
        int i12 = this.f27722e;
        return apVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27723f;
    }
}
