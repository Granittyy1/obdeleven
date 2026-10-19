package p037cb;

import Ya.b;
import java.util.Iterator;
import p024bb.a;
import p024bb.c;

/* JADX INFO: renamed from: cb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1513a<Element, Collection, Builder> implements b<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    @Override // Ya.a
    public Collection deserialize(c cVar) {
        return (Collection) e(cVar);
    }

    public final Object e(c cVar) {
        Builder builderA = a();
        int iB = b(builderA);
        a aVarA = cVar.a(getDescriptor());
        while (true) {
            int iO = aVarA.o(getDescriptor());
            if (iO == -1) {
                aVarA.c(getDescriptor());
                return h(builderA);
            }
            f(aVarA, iO + iB, builderA, true);
        }
    }

    public abstract void f(a aVar, int i10, Builder builder, boolean z10);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
