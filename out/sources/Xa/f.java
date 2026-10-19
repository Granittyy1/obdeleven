package Xa;

import Ua.h;
import kotlin.jvm.internal.i;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: TimeZoneSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Ya.b<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f7444a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7445b = l.a("kotlinx.datetime.TimeZone", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) {
        h.a aVar = h.Companion;
        String strN = cVar.n();
        aVar.getClass();
        return h.a.a(strN);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7445b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        h value = (h) obj;
        i.e(value, "value");
        String id = value.f6584a.getId();
        i.d(id, "getId(...)");
        dVar.C(id);
    }
}
