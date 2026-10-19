package p037cb;

import Ya.b;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import p011ab.a;
import p011ab.e;
import p011ab.h;
import p011ab.l;
import p293xa.r;

/* JADX INFO: renamed from: cb.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1526g0<K, V> extends J<K, V, Pair<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f22611c;

    public C1526g0(final b<K> bVar, final b<V> bVar2) {
        super(bVar, bVar2);
        this.f22611c = l.b("kotlin.Pair", new e[0], new Ia.l() { // from class: cb.f0
            @Override // Ia.l
            public final Object invoke(Object obj) {
                a buildClassSerialDescriptor = (a) obj;
                i.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                a.b(buildClassSerialDescriptor, "first", bVar.getDescriptor());
                a.b(buildClassSerialDescriptor, "second", bVar2.getDescriptor());
                return r.f47939a;
            }
        });
    }

    @Override // p037cb.J
    public final Object a(Object obj) {
        Pair pair = (Pair) obj;
        i.e(pair, "<this>");
        return pair.c();
    }

    @Override // p037cb.J
    public final Object b(Object obj) {
        Pair pair = (Pair) obj;
        i.e(pair, "<this>");
        return pair.d();
    }

    @Override // p037cb.J
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22611c;
    }
}
