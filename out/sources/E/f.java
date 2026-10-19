package E;

import A8.A;
import java.util.Map;

/* JADX INFO: compiled from: PersistentHashMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public class f<K, V> extends kotlin.collections.e<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d<K, V> f2939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A f2940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t<K, V> f2941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f2942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2944g;

    public f() {
        throw null;
    }

    public d<K, V> a() {
        t<K, V> tVar = this.f2941d;
        d<K, V> dVar = this.f2939b;
        if (tVar != dVar.f2934b) {
            this.f2940c = new A();
            dVar = new d<>(this.f2941d, this.f2944g);
        }
        this.f2939b = dVar;
        return dVar;
    }

    public final void b(int i10) {
        this.f2944g = i10;
        this.f2943f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f2941d = t.f2956e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k10) {
        return this.f2941d.d(k10 != null ? k10.hashCode() : 0, 0, k10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k10) {
        return (V) this.f2941d.g(k10 != null ? k10.hashCode() : 0, 0, k10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        this.f2942e = null;
        this.f2941d = this.f2941d.l(k10 != null ? k10.hashCode() : 0, k10, v10, 0, this);
        return this.f2942e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        d<K, V> dVarA = null;
        d<K, V> dVar = map instanceof d ? (d) map : null;
        if (dVar == null) {
            f fVar = map instanceof f ? (f) map : null;
            if (fVar != null) {
                dVarA = fVar.a();
            }
        } else {
            dVarA = dVar;
        }
        if (dVarA == null) {
            super.putAll(map);
            return;
        }
        G.a aVar = new G.a(0);
        int i10 = this.f2944g;
        t<K, V> tVar = this.f2941d;
        t<K, V> tVar2 = dVarA.f2934b;
        kotlin.jvm.internal.i.c(tVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f2941d = tVar.m(tVar2, 0, aVar, this);
        int i11 = (dVarA.f2935c + i10) - aVar.f3348a;
        if (i10 != i11) {
            b(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f2944g;
        t<K, V> tVarO = this.f2941d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarO == null) {
            tVarO = t.f2956e;
        }
        this.f2941d = tVarO;
        return i10 != this.f2944g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k10) {
        this.f2942e = null;
        t<K, V> tVarN = this.f2941d.n(k10 != null ? k10.hashCode() : 0, k10, 0, this);
        if (tVarN == null) {
            tVarN = t.f2956e;
        }
        this.f2941d = tVarN;
        return this.f2942e;
    }
}
