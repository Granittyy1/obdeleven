package p050db;

import Ya.b;
import kotlin.jvm.internal.i;
import p011ab.d;
import p011ab.e;
import p011ab.h;
import p011ab.k;
import p011ab.l;
import p024bb.c;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements b<B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f34639a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f34640b = l.c("kotlinx.serialization.json.JsonPrimitive", d.i.f8102a, new e[0], new k(0));

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        h hVarI = p111ia.c.c(cVar).i();
        if (hVarI instanceof B) {
            return (B) hVarI;
        }
        throw O.e.g("Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.l.a(hVarI.getClass()), hVarI.toString(), -1);
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f34640b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        B value = (B) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        if (value instanceof w) {
            dVar.z(x.f34696a, w.INSTANCE);
        } else {
            dVar.z(u.f34693a, (t) value);
        }
    }
}
