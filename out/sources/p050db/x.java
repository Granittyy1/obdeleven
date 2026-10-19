package p050db;

import Ya.b;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.JsonDecodingException;
import p011ab.e;
import p011ab.h;
import p011ab.k;
import p011ab.l;
import p011ab.m;
import p024bb.c;
import p024bb.d;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements b<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f34696a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f34697b = l.c("kotlinx.serialization.json.JsonNull", m.b.f8123a, new e[0], new k(0));

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        p111ia.c.c(cVar);
        if (cVar.t()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return w.INSTANCE;
    }

    @Override // Ya.l, Ya.a
    public final e getDescriptor() {
        return f34697b;
    }

    @Override // Ya.l
    public final void serialize(d dVar, Object obj) {
        w value = (w) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        dVar.f();
    }
}
