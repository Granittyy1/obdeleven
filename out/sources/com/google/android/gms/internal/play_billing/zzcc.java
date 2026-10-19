package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcc extends zzbx {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient zzbw f26328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f26329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f26330f;

    public zzcc(zzbw zzbwVar, Object[] objArr, int i10) {
        this.f26328d = zzbwVar;
        this.f26329e = objArr;
        this.f26330f = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final zzbt A() {
        return new zzcb(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f26328d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final int d(Object[] objArr) {
        return k().d(objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    /* JADX INFO: renamed from: q */
    public final C2006t iterator() {
        return k().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26330f;
    }
}
