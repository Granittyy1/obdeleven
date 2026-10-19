package io.ktor.util;

import Ia.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.q;
import p293xa.r;

/* JADX INFO: compiled from: StringValues.kt */
/* JADX INFO: loaded from: classes.dex */
public class m implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, List<String>> f40547c;

    public m(Map values) {
        kotlin.jvm.internal.i.e(values, "values");
        d dVar = new d();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            dVar.put(str, arrayList);
        }
        this.f40547c = dVar;
    }

    @Override // io.ktor.util.k
    public final Set<Map.Entry<String, List<String>>> a() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.f40547c.entrySet();
        kotlin.jvm.internal.i.e(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.k
    public final boolean b() {
        return true;
    }

    @Override // io.ktor.util.k
    public final void c(p<? super String, ? super List<String>, r> pVar) {
        for (Map.Entry<String, List<String>> entry : this.f40547c.entrySet()) {
            pVar.invoke(entry.getKey(), entry.getValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (true != kVar.b()) {
            return false;
        }
        return a().equals(kVar.a());
    }

    @Override // io.ktor.util.k
    public final String get(String str) {
        List<String> list = this.f40547c.get(str);
        if (list != null) {
            return (String) q.P(list);
        }
        return null;
    }

    public final int hashCode() {
        Set<Map.Entry<String, List<String>>> setA = a();
        return setA.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // io.ktor.util.k
    public final boolean isEmpty() {
        return this.f40547c.isEmpty();
    }
}
