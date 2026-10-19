package p062eb;

import C.g;
import Ia.l;
import Oa.c;
import Ya.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.o;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<c<?>, a> f34880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<c<?>, Map<c<?>, Ya.b<?>>> f34881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<c<?>, l<?, Ya.l<?>>> f34882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<c<?>, Map<String, Ya.b<?>>> f34883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<c<?>, l<String, a<?>>> f34884g;

    public b(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.f34880c = map;
        this.f34881d = map2;
        this.f34882e = map3;
        this.f34883f = map4;
        this.f34884g = map5;
    }

    @Override // C.g
    public final <T> Ya.b<T> O(c<T> cVar, List<? extends Ya.b<?>> typeArgumentsSerializers) {
        i.e(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f34880c.get(cVar);
        Ya.b<?> bVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (bVarA != null) {
            return (Ya.b<T>) bVarA;
        }
        return null;
    }

    @Override // C.g
    public final <T> a<T> S(c<? super T> baseClass, String str) {
        i.e(baseClass, "baseClass");
        Map<String, Ya.b<?>> map = this.f34883f.get(baseClass);
        Ya.b<?> bVar = map != null ? map.get(str) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<String, a<?>> lVar = this.f34884g.get(baseClass);
        l<String, a<?>> lVar2 = o.e(1, lVar) ? lVar : null;
        if (lVar2 != null) {
            return (a) lVar2.invoke(str);
        }
        return null;
    }

    @Override // C.g
    public final <T> Ya.l<T> T(c<? super T> baseClass, T value) {
        i.e(baseClass, "baseClass");
        i.e(value, "value");
        if (!baseClass.f(value)) {
            return null;
        }
        Map<c<?>, Ya.b<?>> map = this.f34881d.get(baseClass);
        Ya.b<?> bVar = map != null ? map.get(kotlin.jvm.internal.l.a(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<?, Ya.l<?>> lVar = this.f34882e.get(baseClass);
        l<?, Ya.l<?>> lVar2 = o.e(1, lVar) ? lVar : null;
        if (lVar2 != null) {
            return (Ya.l) lVar2.invoke(value);
        }
        return null;
    }
}
