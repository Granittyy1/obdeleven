package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes.dex */
public class y extends x {
    public static <K, V> Map<K, V> p() {
        EmptyMap emptyMap = EmptyMap.f42984b;
        kotlin.jvm.internal.i.c(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    public static Object q(Object obj, Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        if (map instanceof w) {
            return ((w) map).g();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static <K, V> HashMap<K, V> r(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> map = new HashMap<>(x.n(pairArr.length));
        u(map, pairArr);
        return map;
    }

    public static <K, V> Map<K, V> s(Pair<? extends K, ? extends V>... pairArr) {
        if (pairArr.length <= 0) {
            return p();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.n(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap t(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.n(pairArr.length));
        u(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final void u(HashMap map, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            map.put(pair.a(), pair.b());
        }
    }

    public static void v(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a(), pair.b());
        }
    }

    public static Map w(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return p();
        }
        if (size == 1) {
            return x.o((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(x.n(arrayList.size()));
        v(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> x(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return p();
        }
        if (size != 1) {
            return y(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.i.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static LinkedHashMap y(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
