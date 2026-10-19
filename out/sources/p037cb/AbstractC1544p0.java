package p037cb;

import Ya.b;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.x;
import p011ab.e;
import p024bb.c;
import p024bb.d;
import p037cb.AbstractC1540n0;

/* JADX INFO: renamed from: cb.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1544p0<Element, Array, Builder extends AbstractC1540n0<Array>> extends AbstractC1543p<Element, Array, Builder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1542o0 f22644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1544p0(b<Element> primitiveSerializer) {
        super(primitiveSerializer);
        i.e(primitiveSerializer, "primitiveSerializer");
        this.f22644b = new C1542o0(primitiveSerializer.getDescriptor());
    }

    @Override // p037cb.AbstractC1513a
    public final Object a() {
        return g(j());
    }

    @Override // p037cb.AbstractC1513a
    public final int b(Object obj) {
        AbstractC1540n0 abstractC1540n0 = (AbstractC1540n0) obj;
        i.e(abstractC1540n0, "<this>");
        return abstractC1540n0.d();
    }

    @Override // p037cb.AbstractC1513a
    public final Iterator<Element> c(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p037cb.AbstractC1513a, Ya.a
    public final Array deserialize(c cVar) {
        return (Array) e(cVar);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return this.f22644b;
    }

    @Override // p037cb.AbstractC1513a
    public final Object h(Object obj) {
        AbstractC1540n0 abstractC1540n0 = (AbstractC1540n0) obj;
        i.e(abstractC1540n0, "<this>");
        return abstractC1540n0.a();
    }

    @Override // p037cb.AbstractC1543p
    public final void i(Object obj, int i10, Object obj2) {
        i.e((AbstractC1540n0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Array j();

    public abstract void k(p024bb.b bVar, Array array, int i10);

    @Override // p037cb.AbstractC1543p, Ya.l
    public final void serialize(d dVar, Array array) {
        int iD = d(array);
        C1542o0 c1542o0 = this.f22644b;
        p024bb.b bVarD = ((x) dVar).D(c1542o0);
        k(bVarD, array, iD);
        bVarD.c(c1542o0);
    }
}
