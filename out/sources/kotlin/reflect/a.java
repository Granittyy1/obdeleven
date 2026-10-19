package kotlin.reflect;

import Oa.c;
import Oa.d;
import Oa.n;
import Oa.o;
import Oa.p;
import Oa.q;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.TypeReference;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.g;
import kotlin.text.m;
import p241t7.b;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final String a(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            g gVarZ = SequencesKt__SequencesKt.z(type, TypesJVMKt$typeToString$unwrap$1.f43077b);
            name = ((Class) SequencesKt___SequencesKt.E(gVarZ)).getName() + m.F(SequencesKt___SequencesKt.A(gVarZ), "[]");
        } else {
            name = cls.getName();
        }
        i.b(name);
        return name;
    }

    public static final Type b(Oa.m mVar, boolean z10) {
        d dVarE = mVar.e();
        if (dVarE instanceof n) {
            return new p((n) dVarE);
        }
        if (!(dVarE instanceof c)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + mVar);
        }
        c cVar = (c) dVarE;
        Class clsS = z10 ? b.s(cVar) : b.r(cVar);
        List<o> listD = mVar.d();
        if (listD.isEmpty()) {
            return clsS;
        }
        if (!clsS.isArray()) {
            return c(clsS, listD);
        }
        if (clsS.getComponentType().isPrimitive()) {
            return clsS;
        }
        if ((listD.size() == 1 ? listD.get(0) : null) != null) {
            return clsS;
        }
        throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + mVar);
    }

    public static final ParameterizedTypeImpl c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        q qVar = q.f4873d;
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                d((o) it.next());
                arrayList.add(qVar);
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.m.y(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                d((o) it2.next());
                arrayList2.add(qVar);
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        ParameterizedTypeImpl parameterizedTypeImplC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            d((o) it3.next());
            arrayList3.add(qVar);
        }
        return new ParameterizedTypeImpl(cls, parameterizedTypeImplC, arrayList3);
    }

    public static final Type d(o oVar) {
        oVar.getClass();
        return q.f4873d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Type e(TypeReference typeReference) {
        Type typeC;
        return (!(typeReference instanceof j) || (typeC = ((j) typeReference).c()) == null) ? b(typeReference, false) : typeC;
    }
}
