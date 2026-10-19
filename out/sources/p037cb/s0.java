package p037cb;

import Oa.c;
import Q3.d;
import Ya.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import p011ab.e;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s0<ElementKlass, Element extends ElementKlass> extends AbstractC1543p<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<ElementKlass> f22651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1517c f22652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(c<ElementKlass> cVar, b<Element> eSerializer) {
        super(eSerializer);
        i.e(eSerializer, "eSerializer");
        this.f22651b = cVar;
        e elementDesc = eSerializer.getDescriptor();
        i.e(elementDesc, "elementDesc");
        this.f22652c = new C1517c(elementDesc);
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
    public final Iterator c(Object obj) {
        Object[] objArr = (Object[]) obj;
        i.e(objArr, "<this>");
        return I2.e.m(objArr);
    }

    @Override // p037cb.AbstractC1513a
    public final int d(Object obj) {
        Object[] objArr = (Object[]) obj;
        i.e(objArr, "<this>");
        return objArr.length;
    }

    @Override // p037cb.AbstractC1513a
    public final Object g(Object obj) {
        i.e(null, "<this>");
        d.h(null);
        throw null;
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22652c;
    }

    @Override // p037cb.AbstractC1513a
    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "<this>");
        c<ElementKlass> eClass = this.f22651b;
        i.e(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) p241t7.b.r(eClass), arrayList.size());
        i.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        i.d(array, "toArray(...)");
        return array;
    }

    @Override // p037cb.AbstractC1543p
    public final void i(Object obj, int i10, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        i.e(arrayList, "<this>");
        arrayList.add(i10, obj2);
    }
}
