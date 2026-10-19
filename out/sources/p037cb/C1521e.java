package p037cb;

import Ya.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: renamed from: cb.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1521e<E> extends AbstractC1545q<E, List<? extends E>, ArrayList<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1519d f22602b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1521e(b<E> element) {
        super(element);
        i.e(element, "element");
        e elementDesc = element.getDescriptor();
        i.e(elementDesc, "elementDesc");
        this.f22602b = new C1519d(elementDesc);
    }

    @Override // p037cb.AbstractC1513a
    public final Object a() {
        return new ArrayList();
    }

    @Override // p037cb.AbstractC1513a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        i.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22602b;
    }

    @Override // p037cb.AbstractC1513a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // p037cb.AbstractC1543p
    public final void i(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
