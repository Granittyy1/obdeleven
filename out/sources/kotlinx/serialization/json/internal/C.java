package kotlinx.serialization.json.internal;

import com.google.android.gms.internal.measurement.Y;
import kotlin.collections.EmptyList;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C {
    public static final p011ab.e a(p011ab.e eVar, p062eb.b module) {
        p011ab.e eVarA;
        Ya.b bVarO;
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(module, "module");
        if (!kotlin.jvm.internal.i.a(eVar.e(), ab.m.a.f8122a)) {
            return eVar.isInline() ? a(eVar.i(0), module) : eVar;
        }
        Oa.c cVarF = Y.f(eVar);
        p011ab.e descriptor = null;
        if (cVarF != null && (bVarO = module.O(cVarF, EmptyList.f42983b)) != null) {
            descriptor = bVarO.getDescriptor();
        }
        return (descriptor == null || (eVarA = a(descriptor, module)) == null) ? eVar : eVarA;
    }

    public static final WriteMode b(p011ab.e desc, AbstractC2184a abstractC2184a) {
        kotlin.jvm.internal.i.e(abstractC2184a, "<this>");
        kotlin.jvm.internal.i.e(desc, "desc");
        p011ab.m mVarE = desc.e();
        if (mVarE instanceof p011ab.c) {
            return WriteMode.POLY_OBJ;
        }
        if (kotlin.jvm.internal.i.a(mVarE, ab.n.b.f8125a)) {
            return WriteMode.LIST;
        }
        if (!kotlin.jvm.internal.i.a(mVarE, ab.n.c.f8126a)) {
            return WriteMode.OBJ;
        }
        p011ab.e eVarA = a(desc.i(0), abstractC2184a.f34643b);
        p011ab.m mVarE2 = eVarA.e();
        if ((mVarE2 instanceof p011ab.d) || kotlin.jvm.internal.i.a(mVarE2, ab.m.b.f8123a)) {
            return WriteMode.MAP;
        }
        if (abstractC2184a.f34642a.f34670d) {
            return WriteMode.LIST;
        }
        throw O.e.e(eVarA);
    }
}
