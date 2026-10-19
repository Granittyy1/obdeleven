package io.ktor.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: UrlDecodedParametersBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40456a;

    public C(t tVar) {
        this.f40456a = tVar;
    }

    @Override // io.ktor.util.l
    public final Set<Map.Entry<String, List<String>>> a() {
        return ((io.ktor.util.m) kotlinx.coroutines.C.h(this.f40456a)).a();
    }

    @Override // io.ktor.util.l
    public final void b(String name, Iterable<String> values) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(values, "values");
        String strF = CodecsKt.f(name, false);
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(values, 10));
        for (String str : values) {
            kotlin.jvm.internal.i.e(str, "<this>");
            arrayList.add(CodecsKt.f(str, true));
        }
        this.f40456a.b(strF, arrayList);
    }

    @Override // io.ktor.util.l
    public final List<String> c(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        List<String> listC = this.f40456a.c(CodecsKt.f(name, false));
        if (listC == null) {
            return null;
        }
        List<String> list = listC;
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.e((String) it.next(), 0, 0, true, 11));
        }
        return arrayList;
    }

    @Override // io.ktor.util.l
    public final Set<String> names() {
        Set<String> setKeySet = this.f40456a.f40530a.keySet();
        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.e((String) it.next(), 0, 0, false, 15));
        }
        return kotlin.collections.q.s0(arrayList);
    }
}
