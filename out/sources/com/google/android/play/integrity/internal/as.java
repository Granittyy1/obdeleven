package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes3.dex */
final class as extends aq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object[] f27728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final as f27729h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f27730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f27731f;

    static {
        Object[] objArr = new Object[0];
        f27728g = objArr;
        f27729h = new as(objArr, objArr);
    }

    public as(Object[] objArr, Object[] objArr2) {
        this.f27730e = objArr;
        this.f27731f = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f27731f.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final void d(Object[] objArr) {
        System.arraycopy(this.f27730e, 0, objArr, 0, 0);
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int e() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.am
    public final int g() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.aq, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.aq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ap apVar = this.f27725d;
        if (apVar == null) {
            h hVar = ap.f27724d;
            apVar = ar.f27726f;
            this.f27725d = apVar;
        }
        return apVar.listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.am
    public final Object[] k() {
        return this.f27730e;
    }

    @Override // com.google.android.play.integrity.internal.aq
    /* JADX INFO: renamed from: q */
    public final h iterator() {
        ap apVar = this.f27725d;
        if (apVar == null) {
            h hVar = ap.f27724d;
            apVar = ar.f27726f;
            this.f27725d = apVar;
        }
        return apVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.aq
    public final void v() {
    }
}
