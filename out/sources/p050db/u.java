package p050db;

import F8.a;
import O.e;
import Ya.b;
import kotlin.jvm.internal.i;
import p011ab.d;
import p011ab.l;
import p024bb.c;
import p037cb.K0;
import p037cb.q0;
import p293xa.m;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f34693a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f34694b = l.a("kotlinx.serialization.json.JsonLiteral", d.i.f8102a);

    @Override // Ya.a
    public final Object deserialize(c cVar) {
        h hVarI = p111ia.c.c(cVar).i();
        if (hVarI instanceof t) {
            return (t) hVarI;
        }
        throw e.g("Unexpected JSON element, expected JsonLiteral, had " + kotlin.jvm.internal.l.a(hVarI.getClass()), hVarI.toString(), -1);
    }

    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return f34694b;
    }

    @Override // Ya.l
    public final void serialize(p024bb.d dVar, Object obj) {
        Boolean bool;
        t value = (t) obj;
        i.e(value, "value");
        p111ia.c.b(dVar);
        boolean z10 = value.f34690b;
        String str = value.f34692d;
        if (z10) {
            dVar.C(str);
            return;
        }
        p011ab.e eVar = value.f34691c;
        if (eVar != null) {
            dVar.u(eVar).C(str);
            return;
        }
        Long lB = kotlin.text.l.B(str);
        if (lB != null) {
            dVar.A(lB.longValue());
            return;
        }
        m mVarN = a.n(str);
        if (mVarN != null) {
            dVar.u(K0.f22563b).A(mVarN.f47930b);
            return;
        }
        Double dY = kotlin.text.l.y(str);
        if (dY != null) {
            dVar.h(dY.doubleValue());
            return;
        }
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = str.equals("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            dVar.l(bool.booleanValue());
        } else {
            dVar.C(str);
        }
    }
}
