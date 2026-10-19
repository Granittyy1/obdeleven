package io.ktor.client.engine;

import Ia.l;
import Ia.p;
import io.ktor.http.C2476a;
import io.ktor.http.h;
import io.ktor.http.i;
import io.ktor.http.k;
import io.ktor.util.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.B;
import kotlin.collections.q;
import p293xa.r;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f40290a;

    static {
        List<String> list = k.f40481a;
        f40290a = B.C("Date", "Expires", "Last-Modified", "If-Modified-Since", "If-Unmodified-Since");
    }

    public static final void a(final i iVar, final X9.b bVar, final p pVar) {
        String string;
        String string2;
        l<h, r> lVar = new l<h, r>() { // from class: io.ktor.client.engine.UtilsKt$mergeHeaders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(h hVar) {
                h buildHeaders = hVar;
                kotlin.jvm.internal.i.e(buildHeaders, "$this$buildHeaders");
                buildHeaders.e(iVar);
                buildHeaders.e(bVar.c());
                return r.f47939a;
            }
        };
        h hVar = new h(0);
        lVar.invoke(hVar);
        Map<String, List<String>> values = hVar.f40530a;
        kotlin.jvm.internal.i.e(values, "values");
        io.ktor.util.d dVar = new io.ktor.util.d();
        for (Map.Entry<String, List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(value.get(i10));
            }
            dVar.put(key, arrayList);
        }
        p<String, List<? extends String>, r> pVar2 = new p<String, List<? extends String>, r>() { // from class: io.ktor.client.engine.UtilsKt$mergeHeaders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(String str, List<? extends String> list) {
                String key2 = str;
                List<? extends String> values2 = list;
                kotlin.jvm.internal.i.e(key2, "key");
                kotlin.jvm.internal.i.e(values2, "values");
                List<String> list2 = k.f40481a;
                if (!"Content-Length".equals(key2) && !"Content-Type".equals(key2)) {
                    if (g.f40290a.contains(key2)) {
                        p<String, String, r> pVar3 = pVar;
                        Iterator<T> it = values2.iterator();
                        while (it.hasNext()) {
                            pVar3.invoke(key2, (String) it.next());
                        }
                    } else {
                        pVar.invoke(key2, q.U(values2, "Cookie".equals(key2) ? "; " : ",", null, null, null, 62));
                    }
                }
                return r.f47939a;
            }
        };
        Iterator it = dVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            pVar2.invoke((String) entry2.getKey(), (List) entry2.getValue());
        }
        List<String> list = k.f40481a;
        if (iVar.get("User-Agent") == null && bVar.c().get("User-Agent") == null) {
            boolean z10 = j.f40546a;
            pVar.invoke("User-Agent", "Ktor client");
        }
        C2476a c2476aB = bVar.b();
        if ((c2476aB == null || (string = c2476aB.toString()) == null) && (string = bVar.c().get("Content-Type")) == null) {
            string = iVar.get("Content-Type");
        }
        Long lA = bVar.a();
        if ((lA == null || (string2 = lA.toString()) == null) && (string2 = bVar.c().get("Content-Length")) == null) {
            string2 = iVar.get("Content-Length");
        }
        if (string != null) {
            pVar.invoke("Content-Type", string);
        }
        if (string2 != null) {
            pVar.invoke("Content-Length", string2);
        }
    }
}
