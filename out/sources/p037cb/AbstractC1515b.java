package p037cb;

import Oa.c;
import Ya.a;
import Ya.b;
import Ya.l;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.x;
import p011ab.e;
import p024bb.d;

/* JADX INFO: renamed from: cb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1515b<T> implements b<T> {
    public a<T> a(p024bb.a aVar, String str) {
        return aVar.b().S(c(), str);
    }

    public l b(x xVar, Object value) {
        i.e(value, "value");
        return xVar.b().T(c(), value);
    }

    public abstract c<T> c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ya.a
    public final T deserialize(p024bb.c cVar) {
        e descriptor = getDescriptor();
        p024bb.a aVarA = cVar.a(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        T t8 = null;
        while (true) {
            int iO = aVarA.o(getDescriptor());
            if (iO == -1) {
                if (t8 != null) {
                    aVarA.c(descriptor);
                    return t8;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.element)).toString());
            }
            if (iO == 0) {
                ref$ObjectRef.element = (T) aVarA.j(getDescriptor(), iO);
            } else {
                if (iO != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) ref$ObjectRef.element;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb2.append(str);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iO);
                    throw new SerializationException(sb2.toString());
                }
                T t10 = ref$ObjectRef.element;
                if (t10 == 0) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                ref$ObjectRef.element = t10;
                t8 = (T) aVarA.e(getDescriptor(), iO, F8.a.d(this, aVarA, (String) t10), null);
            }
        }
    }

    @Override // Ya.l
    public final void serialize(d dVar, T value) {
        i.e(value, "value");
        l<? super T> lVarE = F8.a.e(this, (x) dVar, value);
        e descriptor = getDescriptor();
        p024bb.b bVarA = dVar.a(descriptor);
        bVarA.p(getDescriptor(), 0, lVarE.getDescriptor().a());
        bVarA.s(getDescriptor(), 1, lVarE, value);
        bVarA.c(descriptor);
    }
}
