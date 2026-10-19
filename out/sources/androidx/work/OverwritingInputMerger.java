package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: OverwritingInputMerger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends f {
    @Override // androidx.work.f
    public final d a(ArrayList arrayList) throws Throwable {
        d.a aVar = new d.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((d) it.next()).f20353a);
            kotlin.jvm.internal.i.d(mapUnmodifiableMap, "input.keyValueMap");
            linkedHashMap.putAll(mapUnmodifiableMap);
        }
        aVar.a(linkedHashMap);
        d dVar = new d(aVar.f20354a);
        d.b(dVar);
        return dVar;
    }
}
