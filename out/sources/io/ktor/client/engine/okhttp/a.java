package io.ktor.client.engine.okhttp;

import Ia.p;
import J4.n;
import io.ktor.http.g;
import io.ktor.util.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import okhttp3.o;
import p293xa.r;

/* JADX INFO: compiled from: OkUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f40301c;

    public a(o oVar) {
        this.f40301c = oVar;
    }

    @Override // io.ktor.util.k
    public final Set<Map.Entry<String, List<String>>> a() {
        o oVar = this.f40301c;
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        i.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strK = oVar.k(i10);
            Locale locale = Locale.US;
            String strD = n.d(locale, "US", strK, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strD, arrayList);
            }
            arrayList.add(oVar.v(i10));
        }
        return treeMap.entrySet();
    }

    @Override // io.ktor.util.k
    public final boolean b() {
        return true;
    }

    @Override // io.ktor.util.k
    public final void c(p<? super String, ? super List<String>, r> pVar) {
        k.a.a(this, pVar);
    }

    @Override // io.ktor.util.k
    public final String get(String name) {
        i.e(name, "name");
        List<String> listA = this.f40301c.A(name);
        if (listA.isEmpty()) {
            listA = null;
        }
        if (listA != null) {
            return (String) q.P(listA);
        }
        return null;
    }
}
