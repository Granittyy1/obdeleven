package p037cb;

import Ya.b;
import java.util.Iterator;
import kotlinx.serialization.json.internal.x;
import p011ab.e;
import p024bb.a;
import p024bb.d;

/* JADX INFO: renamed from: cb.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1543p<Element, Collection, Builder> extends AbstractC1513a<Element, Collection, Builder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<Element> f22643a;

    public AbstractC1543p(b bVar) {
        this.f22643a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p037cb.AbstractC1513a
    public void f(a aVar, int i10, Builder builder, boolean z10) {
        i(builder, i10, aVar.e(getDescriptor(), i10, this.f22643a, null));
    }

    public abstract void i(Builder builder, int i10, Element element);

    @Override // Ya.l
    public void serialize(d dVar, Collection collection) {
        int iD = d(collection);
        e descriptor = getDescriptor();
        p024bb.b bVarD = ((x) dVar).D(descriptor);
        Iterator<Element> itC = c(collection);
        for (int i10 = 0; i10 < iD; i10++) {
            bVarD.s(getDescriptor(), i10, this.f22643a, itC.next());
        }
        bVarD.c(descriptor);
    }
}
