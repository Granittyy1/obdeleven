package p050db;

import Ya.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import p011ab.c;
import p011ab.e;
import p011ab.h;
import p011ab.l;
import p024bb.d;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements b<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f34687a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f34688b = l.c("kotlinx.serialization.json.JsonElement", c.b.f8093a, new e[0], new j(0));

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        return p111ia.c.c(cVar).i();
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f34688b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        h value = (h) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        if (value instanceof B) {
            dVar.z(C.f34639a, value);
        } else if (value instanceof z) {
            dVar.z(A.f34634a, value);
        } else {
            if (!(value instanceof C2185b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.z(C2186c.f34646a, value);
        }
    }
}
