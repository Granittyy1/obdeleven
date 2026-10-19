package kotlinx.serialization.json.internal;

import kotlin.collections.AbstractCollection;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: JsonStreams.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p {
    public static final void a(AbstractC2184a json, q qVar, Ya.b serializer, Object obj) {
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(serializer, "serializer");
        new x(json.f34642a.f34671e ? new i(qVar, json) : new f(qVar), json, WriteMode.OBJ, new p050db.q[((AbstractCollection) WriteMode.f43973g).e()]).z(serializer, obj);
    }
}
