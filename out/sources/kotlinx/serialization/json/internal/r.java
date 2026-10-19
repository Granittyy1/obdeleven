package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.EmptySet;
import p037cb.C1528h0;
import p037cb.E;
import p050db.AbstractC2184a;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class r extends AbstractC2728a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p050db.z f44002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p011ab.e f44003h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44004i;
    public boolean j;

    public /* synthetic */ r(AbstractC2184a abstractC2184a, p050db.z zVar, String str, int i10) {
        this(abstractC2184a, zVar, (i10 & 4) != 0 ? null : str, (p011ab.e) null);
    }

    @Override // p037cb.Y
    public String P(p011ab.e descriptor, int i10) {
        Object next;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        AbstractC2184a abstractC2184a = this.f43974d;
        m.d(descriptor, abstractC2184a);
        String strG = descriptor.g(i10);
        if (!this.f43976f.f34677l || V().f34699b.keySet().contains(strG)) {
            return strG;
        }
        kotlin.jvm.internal.i.e(abstractC2184a, "<this>");
        j.a<Map<String, Integer>> aVar = m.f43994a;
        l lVar = new l(descriptor, abstractC2184a);
        j jVar = abstractC2184a.f34644c;
        jVar.getClass();
        Object objA = jVar.a(descriptor, aVar);
        if (objA == null) {
            objA = lVar.invoke();
            ConcurrentHashMap concurrentHashMap = jVar.f43989a;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(aVar, objA);
        }
        Map map = (Map) objA;
        Iterator<T> it = V().f34699b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = (Integer) map.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strG;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    public p050db.h T(String tag) {
        kotlin.jvm.internal.i.e(tag, "tag");
        return (p050db.h) kotlin.collections.y.q(tag, V());
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public p050db.z V() {
        return this.f44002g;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a, p024bb.c
    public final p024bb.a a(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        p011ab.e eVar = this.f44003h;
        if (descriptor != eVar) {
            return super.a(descriptor);
        }
        p050db.h hVarU = U();
        String strA = eVar.a();
        if (hVarU instanceof p050db.z) {
            return new r(this.f43974d, (p050db.z) hVarU, this.f43975e, eVar);
        }
        throw O.e.g("Expected " + kotlin.jvm.internal.l.a(p050db.z.class).a() + ", but had " + kotlin.jvm.internal.l.a(hVarU.getClass()).a() + " as the serialized body of " + strA + " at element: " + S(), hVarU.toString(), -1);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a, p024bb.a
    public void c(p011ab.e descriptor) {
        Set setA;
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        p050db.f fVar = this.f43976f;
        if (fVar.f34668b || (descriptor.e() instanceof p011ab.c)) {
            return;
        }
        AbstractC2184a abstractC2184a = this.f43974d;
        m.d(descriptor, abstractC2184a);
        if (fVar.f34677l) {
            Set<String> setA2 = C1528h0.a(descriptor);
            kotlin.jvm.internal.i.e(abstractC2184a, "<this>");
            Map map = (Map) abstractC2184a.f34644c.a(descriptor, m.f43994a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.f42985b;
            }
            setA = kotlin.collections.B.A(setA2, setKeySet);
        } else {
            setA = C1528h0.a(descriptor);
        }
        for (String key : V().f34699b.keySet()) {
            if (!setA.contains(key) && !kotlin.jvm.internal.i.a(key, this.f43975e)) {
                String string = V().toString();
                kotlin.jvm.internal.i.e(key, "key");
                StringBuilder sbA = C7.g.a("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbA.append((Object) O.e.x(string, -1));
                throw O.e.f(-1, sbA.toString());
            }
        }
    }

    @Override // p024bb.a
    public int o(p011ab.e descriptor) {
        kotlin.jvm.internal.i.e(descriptor, "descriptor");
        while (this.f44004i < descriptor.f()) {
            int i10 = this.f44004i;
            this.f44004i = i10 + 1;
            String nestedName = P(descriptor, i10);
            kotlin.jvm.internal.i.e(nestedName, "nestedName");
            int i11 = this.f44004i - 1;
            boolean z10 = false;
            this.j = false;
            boolean zContainsKey = V().containsKey(nestedName);
            AbstractC2184a abstractC2184a = this.f43974d;
            if (!zContainsKey) {
                boolean z11 = (abstractC2184a.f34642a.f34672f || descriptor.j(i11) || !descriptor.i(i11).c()) ? false : true;
                this.j = z11;
                if (!z11) {
                    continue;
                }
            }
            if (this.f43976f.f34674h) {
                boolean zJ = descriptor.j(i11);
                p011ab.e eVarI = descriptor.i(i11);
                if (!zJ || eVarI.c() || !(T(nestedName) instanceof p050db.w)) {
                    if (kotlin.jvm.internal.i.a(eVarI.e(), ab.m.b.f8123a) && (!eVarI.c() || !(T(nestedName) instanceof p050db.w))) {
                        p050db.h hVarT = T(nestedName);
                        String strE = null;
                        p050db.B b10 = hVarT instanceof p050db.B ? (p050db.B) hVarT : null;
                        if (b10 != null) {
                            E e10 = p050db.i.f34682a;
                            if (!(b10 instanceof p050db.w)) {
                                strE = b10.e();
                            }
                        }
                        if (strE != null) {
                            int iB = m.b(eVarI, abstractC2184a, strE);
                            if (!abstractC2184a.f34642a.f34672f && eVarI.c()) {
                                z10 = true;
                            }
                            if (iB != -3 || (!zJ && !z10)) {
                            }
                        }
                    }
                }
            }
            return i11;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC2728a, p024bb.c
    public final boolean t() {
        return !this.j && super.t();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC2184a json, p050db.z value, String str, p011ab.e eVar) {
        super(json, value, str);
        kotlin.jvm.internal.i.e(json, "json");
        kotlin.jvm.internal.i.e(value, "value");
        this.f44002g = value;
        this.f44003h = eVar;
    }
}
