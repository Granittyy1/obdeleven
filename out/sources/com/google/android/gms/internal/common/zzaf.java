package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzah f25360d;

    public zzaf(zzah zzahVar) {
        this.f25360d = zzahVar;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f25360d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzah zzahVar = this.f25360d;
        j.a(i10, zzahVar.size());
        return zzahVar.get((zzahVar.size() - 1) - i10);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        zzah zzahVar = this.f25360d;
        int iLastIndexOf = zzahVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (zzahVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        zzah zzahVar = this.f25360d;
        int iIndexOf = zzahVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (zzahVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah q() {
        return this.f25360d;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i10, int i11) {
        zzah zzahVar = this.f25360d;
        j.b(i10, i11, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i11, zzahVar.size() - i10).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25360d.size();
    }
}
