package Ya;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.x;
import kotlin.collections.y;
import p037cb.AbstractC1515b;
import p037cb.y0;
import p293xa.r;

/* JADX INFO: compiled from: SealedSerializer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j<T> extends AbstractC1515b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.c f7650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<? extends Annotation> f7651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Oa.c<? extends T>, b<? extends T>> f7653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7654e;

    public j() {
        throw null;
    }

    public j(final String str, kotlin.jvm.internal.c cVar, Oa.c[] cVarArr, b[] bVarArr) {
        this.f7650a = cVar;
        this.f7651b = EmptyList.f42983b;
        this.f7652c = kotlin.a.b(LazyThreadSafetyMode.f42972c, new Ia.a() { // from class: Ya.g
            @Override // Ia.a
            public final Object invoke() {
                final j jVar = this;
                Ia.l lVar = new Ia.l() { // from class: Ya.h
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        p011ab.a buildSerialDescriptor = (p011ab.a) obj;
                        kotlin.jvm.internal.i.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                        p011ab.a.b(buildSerialDescriptor, "type", y0.f22678b);
                        StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                        j jVar2 = jVar;
                        sb2.append(jVar2.f7650a.a());
                        sb2.append('>');
                        p011ab.a.b(buildSerialDescriptor, "value", p011ab.l.c(sb2.toString(), ab.m.a.f8122a, new p011ab.e[0], new i(0, jVar2)));
                        List<? extends Annotation> list = jVar2.f7651b;
                        kotlin.jvm.internal.i.e(list, "<set-?>");
                        buildSerialDescriptor.f8083b = list;
                        return r.f47939a;
                    }
                };
                return p011ab.l.c(str, ab.c.b.f8093a, new p011ab.e[0], lVar);
            }
        });
        if (cVarArr.length != bVarArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + cVar.a() + " should be marked @Serializable");
        }
        int iMin = Math.min(cVarArr.length, bVarArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(new Pair(cVarArr[i10], bVarArr[i10]));
        }
        Map<Oa.c<? extends T>, b<? extends T>> mapW = y.w(arrayList);
        this.f7653d = mapW;
        Set<Map.Entry<Oa.c<? extends T>, b<? extends T>>> setEntrySet = mapW.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strA = ((b) entry.getValue()).getDescriptor().a();
            Object obj = linkedHashMap.get(strA);
            if (obj == null) {
                linkedHashMap.containsKey(strA);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f7650a + "' have the same serial name '" + strA + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.n(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f7654e = linkedHashMap2;
    }

    @Override // p037cb.AbstractC1515b
    public final a<T> a(p024bb.a aVar, String str) {
        b bVar = (b) this.f7654e.get(str);
        return bVar != null ? bVar : aVar.b().S(c(), str);
    }

    @Override // p037cb.AbstractC1515b
    public final l b(kotlinx.serialization.json.internal.x xVar, Object value) {
        kotlin.jvm.internal.i.e(value, "value");
        l lVarB = (b) this.f7653d.get(kotlin.jvm.internal.l.a(value.getClass()));
        if (lVarB == null) {
            lVarB = super.b(xVar, value);
        }
        if (lVarB != null) {
            return lVarB;
        }
        return null;
    }

    @Override // p037cb.AbstractC1515b
    public final Oa.c<T> c() {
        return this.f7650a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xa.g] */
    @Override // Ya.l, Ya.a
    public final p011ab.e getDescriptor() {
        return (p011ab.e) this.f7652c.getValue();
    }
}
