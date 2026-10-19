package kotlin.collections;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.C;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C {
    public static LinkedHashSet A(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.i.e(set, "<this>");
        kotlin.jvm.internal.i.e(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.n(size));
        linkedHashSet.addAll(set);
        p.z(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static LinkedHashSet B(Set set, Object obj) {
        kotlin.jvm.internal.i.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.n(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static Set C(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return EmptySet.f42985b;
        }
        if (length == 1) {
            return C.u(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.n(objArr.length));
        k.c0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static HashSet y(Object... objArr) {
        HashSet hashSet = new HashSet(x.n(objArr.length));
        k.c0(objArr, hashSet);
        return hashSet;
    }

    public static Set z(Object... elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.n(elements.length));
        k.c0(elements, linkedHashSet);
        return linkedHashSet;
    }
}
