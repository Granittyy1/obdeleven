package p037cb;

import J4.i;
import Ya.b;
import kotlinx.serialization.SerializationException;
import p011ab.e;
import p024bb.a;
import p024bb.c;
import p024bb.d;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J<K, V, R> implements b<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<K> f22559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<V> f22560b;

    public J(b bVar, b bVar2) {
        this.f22559a = bVar;
        this.f22560b = bVar2;
    }

    public abstract K a(R r10);

    public abstract V b(R r10);

    public abstract R c(K k10, V v10);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ya.a
    public final R deserialize(c cVar) {
        e descriptor = getDescriptor();
        a aVarA = cVar.a(descriptor);
        Object obj = B0.f22537a;
        Object objE = obj;
        Object objE2 = objE;
        while (true) {
            int iO = aVarA.o(getDescriptor());
            if (iO == -1) {
                if (objE == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objE2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r10 = (R) c(objE, objE2);
                aVarA.c(descriptor);
                return r10;
            }
            if (iO == 0) {
                objE = aVarA.e(getDescriptor(), 0, this.f22559a, null);
            } else {
                if (iO != 1) {
                    throw new SerializationException(i.b(iO, "Invalid index: "));
                }
                objE2 = aVarA.e(getDescriptor(), 1, this.f22560b, null);
            }
        }
    }

    @Override // Ya.l
    public final void serialize(d dVar, R r10) {
        p024bb.b bVarA = dVar.a(getDescriptor());
        bVarA.s(getDescriptor(), 0, this.f22559a, a(r10));
        bVarA.s(getDescriptor(), 1, this.f22560b, b(r10));
        bVarA.c(getDescriptor());
    }
}
