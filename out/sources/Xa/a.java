package Xa;

import Ua.h;
import kotlin.jvm.internal.i;
import kotlinx.serialization.SerializationException;
import p011ab.l;
import p037cb.q0;

/* JADX INFO: compiled from: TimeZoneSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Ya.b<Ua.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7434a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f7435b = l.a("kotlinx.datetime.FixedOffsetTimeZone", ab.d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(p024bb.c cVar) throws Exception {
        h.a aVar = h.Companion;
        String strN = cVar.n();
        aVar.getClass();
        h hVarA = h.a.a(strN);
        if (hVarA instanceof Ua.c) {
            return (Ua.c) hVarA;
        }
        throw new SerializationException("Timezone identifier '" + hVarA + "' does not correspond to a fixed-offset timezone");
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f7435b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Ua.c value = (Ua.c) obj;
        i.e(value, "value");
        String id = value.f6584a.getId();
        i.d(id, "getId(...)");
        dVar.C(id);
    }
}
