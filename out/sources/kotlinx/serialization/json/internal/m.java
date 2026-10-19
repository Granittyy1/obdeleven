package kotlinx.serialization.json.internal;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j.a<Map<String, Integer>> f43994a = new j.a<>();

    public static final void a(LinkedHashMap linkedHashMap, p011ab.e eVar, String str, int i10) {
        String str2 = kotlin.jvm.internal.i.a(eVar.e(), ab.m.b.f8123a) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i10));
            return;
        }
        String message = "The suggested name '" + str + "' for " + str2 + ' ' + eVar.g(i10) + " is already one of the names for " + str2 + ' ' + eVar.g(((Number) kotlin.collections.y.q(str, linkedHashMap)).intValue()) + " in " + eVar;
        kotlin.jvm.internal.i.e(message, "message");
        throw new JsonException(message);
    }

    public static final int b(p011ab.e eVar, AbstractC2184a json, String name) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(name, "name");
        p050db.f fVar = json.f34642a;
        boolean z10 = fVar.f34678m;
        j.a<Map<String, Integer>> aVar = f43994a;
        j jVar = json.f34644c;
        if (z10 && kotlin.jvm.internal.i.a(eVar.e(), ab.m.b.f8123a)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.i.d(lowerCase, "toLowerCase(...)");
            l lVar = new l(eVar, json);
            jVar.getClass();
            Object objA = jVar.a(eVar, aVar);
            if (objA == null) {
                objA = lVar.invoke();
                ConcurrentHashMap concurrentHashMap = jVar.f43989a;
                Object concurrentHashMap2 = concurrentHashMap.get(eVar);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(eVar, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(aVar, objA);
            }
            Integer num = (Integer) ((Map) objA).get(lowerCase);
            if (num != null) {
                return num.intValue();
            }
            return -3;
        }
        d(eVar, json);
        int iD = eVar.d(name);
        if (iD != -3 || !fVar.f34677l) {
            return iD;
        }
        l lVar2 = new l(eVar, json);
        jVar.getClass();
        Object objA2 = jVar.a(eVar, aVar);
        if (objA2 == null) {
            objA2 = lVar2.invoke();
            ConcurrentHashMap concurrentHashMap3 = jVar.f43989a;
            Object concurrentHashMap4 = concurrentHashMap3.get(eVar);
            if (concurrentHashMap4 == null) {
                concurrentHashMap4 = new ConcurrentHashMap(2);
                concurrentHashMap3.put(eVar, concurrentHashMap4);
            }
            ((Map) concurrentHashMap4).put(aVar, objA2);
        }
        Integer num2 = (Integer) ((Map) objA2).get(name);
        if (num2 != null) {
            return num2.intValue();
        }
        return -3;
    }

    public static final int c(p011ab.e eVar, AbstractC2184a json, String name, String suffix) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        int iB = b(eVar, json, name);
        if (iB != -3) {
            return iB;
        }
        throw new SerializationException(eVar.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final void d(p011ab.e eVar, AbstractC2184a json) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.a(eVar.e(), ab.n.a.f8124a);
    }
}
