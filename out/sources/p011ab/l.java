package p011ab;

import C7.g;
import Ya.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.c;
import kotlin.collections.k;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p037cb.q0;
import p037cb.r0;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static final q0 a(String str, d.i kind) {
        i.e(kind, "kind");
        if (n.S(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((c) r0.f22649a.values()).iterator();
        while (((MapBuilder.d) it).hasNext()) {
            b bVar = (b) ((MapBuilder.f) it).next();
            if (str.equals(bVar.getDescriptor().a())) {
                StringBuilder sbA = g.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbA.append(kotlin.jvm.internal.l.a(bVar.getClass()).a());
                sbA.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(kotlin.text.i.v(sbA.toString()));
            }
        }
        return new q0(str, kind);
    }

    public static final h b(String str, e[] eVarArr, Ia.l builderAction) {
        i.e(builderAction, "builderAction");
        if (n.S(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(str);
        builderAction.invoke(aVar);
        return new h(str, n.a.f8124a, aVar.f8084c.size(), k.d0(eVarArr), aVar);
    }

    public static final h c(String serialName, m kind, e[] eVarArr, Ia.l builder) {
        i.e(serialName, "serialName");
        i.e(kind, "kind");
        i.e(builder, "builder");
        if (n.S(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (kind.equals(n.a.f8124a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new h(serialName, kind, aVar.f8084c.size(), k.d0(eVarArr), aVar);
    }
}
