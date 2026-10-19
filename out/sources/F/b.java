package F;

import E.d;
import E.t;
import androidx.compose.runtime.Recomposer;
import java.util.Iterator;
import kotlin.collections.g;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PersistentOrderedSet.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b<E> extends g<E> implements D.c<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f3174e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d<E, a> f3177d;

    static {
        G.b bVar = G.b.f3349a;
        f3174e = new b(bVar, bVar, d.f2933d);
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.f3175b = obj;
        this.f3176c = obj2;
        this.f3177d = dVar;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f3177d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int e() {
        d<E, a> dVar = this.f3177d;
        dVar.getClass();
        return dVar.f2935c;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new c(this.f3175b, this.f3177d);
    }

    @Override // D.c
    public final b p(Recomposer.c cVar) {
        d<E, a> dVar = this.f3177d;
        if (dVar.containsKey((E) cVar)) {
            return this;
        }
        if (isEmpty()) {
            return new b(cVar, cVar, dVar.b(cVar, new a()));
        }
        Object obj = this.f3176c;
        a aVar = dVar.get((E) obj);
        i.b(aVar);
        return new b(this.f3175b, cVar, dVar.b(obj, new a(aVar.f3172a, cVar)).b(cVar, new a(obj, G.b.f3349a)));
    }

    @Override // D.c
    public final b t(Recomposer.c cVar) {
        d<E, a> dVarB = this.f3177d;
        a aVar = dVarB.get(cVar);
        if (aVar == null) {
            return this;
        }
        int iHashCode = cVar != null ? cVar.hashCode() : 0;
        t<E, a> tVar = dVarB.f2934b;
        t<E, a> tVarV = tVar.v(iHashCode, cVar, 0);
        if (tVar != tVarV) {
            dVarB = tVarV == null ? d.f2933d : new d<>(tVarV, dVarB.f2935c - 1);
        }
        G.b bVar = G.b.f3349a;
        Object obj = aVar.f3172a;
        boolean z10 = obj != bVar;
        Object obj2 = aVar.f3173b;
        if (z10) {
            a aVar2 = dVarB.get(obj);
            i.b(aVar2);
            dVarB = dVarB.b(obj, new a(aVar2.f3172a, obj2));
        }
        if (obj2 != bVar) {
            a aVar3 = dVarB.get(obj2);
            i.b(aVar3);
            dVarB = dVarB.b(obj2, new a(obj, aVar3.f3173b));
        }
        Object obj3 = obj != bVar ? this.f3175b : obj2;
        if (obj2 != bVar) {
            obj = this.f3176c;
        }
        return new b(obj3, obj, dVarB);
    }
}
