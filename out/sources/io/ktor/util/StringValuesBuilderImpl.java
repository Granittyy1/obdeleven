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
public class StringValuesBuilderImpl implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<String>> f40530a = new d();

    public StringValuesBuilderImpl(int i10) {
    }

    @Override // io.ktor.util.l
    public final Set<Map.Entry<String, List<String>>> a() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.f40530a.entrySet();
        kotlin.jvm.internal.i.e(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // io.ktor.util.l
    public final void b(String name, Iterable<String> values) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(values, "values");
        List<String> listF = f(name);
        for (String str : values) {
            j(str);
            listF.add(str);
        }
    }

    @Override // io.ktor.util.l
    public final List<String> c(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return this.f40530a.get(name);
    }

    public final void d(String name, String value) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        j(value);
        f(name).add(value);
    }

    public final void e(k stringValues) {
        kotlin.jvm.internal.i.e(stringValues, "stringValues");
        stringValues.c(new p<String, List<? extends String>, r>() { // from class: io.ktor.util.StringValuesBuilderImpl$appendAll$1
            {
                super(2);
            }

            @Override // Ia.p
            public final r invoke(String str, List<? extends String> list) {
                String name = str;
                List<? extends String> values = list;
                kotlin.jvm.internal.i.e(name, "name");
                kotlin.jvm.internal.i.e(values, "values");
                this.this$0.b(name, values);
                return r.f47939a;
            }
        });
    }

    public final List<String> f(String str) {
        Map<String, List<String>> map = this.f40530a;
        List<String> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        i(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public final String g(String str) {
        List<String> listC = c(str);
        if (listC != null) {
            return (String) q.P(listC);
        }
        return null;
    }

    public final void h(String str, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        j(value);
        List<String> listF = f(str);
        listF.clear();
        listF.add(value);
    }

    public void i(String name) {
        kotlin.jvm.internal.i.e(name, "name");
    }

    public void j(String value) {
        kotlin.jvm.internal.i.e(value, "value");
    }

    @Override // io.ktor.util.l
    public final Set<String> names() {
        return this.f40530a.keySet();
    }
}
