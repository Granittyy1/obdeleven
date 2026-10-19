package X3;

import androidx.collection.C0873a;

/* JADX INFO: compiled from: CachedHashCodeArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class b<K, V> extends C0873a<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7197h;

    @Override // androidx.collection.X, java.util.Map
    public final void clear() {
        this.f7197h = 0;
        super.clear();
    }

    @Override // androidx.collection.X, java.util.Map
    public final int hashCode() {
        if (this.f7197h == 0) {
            this.f7197h = super.hashCode();
        }
        return this.f7197h;
    }

    @Override // androidx.collection.X
    public final void j(C0873a c0873a) {
        this.f7197h = 0;
        super.j(c0873a);
    }

    @Override // androidx.collection.X
    public final V k(int i10) {
        this.f7197h = 0;
        return (V) super.k(i10);
    }

    @Override // androidx.collection.X
    public final V l(int i10, V v10) {
        this.f7197h = 0;
        return (V) super.l(i10, v10);
    }

    @Override // androidx.collection.X, java.util.Map
    public final V put(K k10, V v10) {
        this.f7197h = 0;
        return (V) super.put(k10, v10);
    }
}
