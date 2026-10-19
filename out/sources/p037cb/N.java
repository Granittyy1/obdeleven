package p037cb;

import Ya.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class N<E> extends AbstractC1545q<E, Set<? extends E>, LinkedHashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f22568b;

    public N(b<E> bVar) {
        super(bVar);
        e elementDesc = bVar.getDescriptor();
        i.e(elementDesc, "elementDesc");
        this.f22568b = new M(elementDesc);
    }

    @Override // p037cb.AbstractC1513a
    public final Object a() {
        return new LinkedHashSet();
    }

    @Override // p037cb.AbstractC1513a
    public final int b(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        i.e(null, "<this>");
        return new LinkedHashSet((Collection) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22568b;
    }

    @Override // p037cb.AbstractC1513a
    public final Object h(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "<this>");
        return linkedHashSet;
    }

    @Override // p037cb.AbstractC1543p
    public final void i(Object obj, int i10, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        i.e(linkedHashSet, "<this>");
        linkedHashSet.add(obj2);
    }
}
