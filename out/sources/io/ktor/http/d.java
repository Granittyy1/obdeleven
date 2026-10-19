package io.ktor.http;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: HttpHeaderValueParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f40475b;

    public d(String value, List<e> params) {
        Object next;
        String str;
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(params, "params");
        this.f40474a = value;
        this.f40475b = params;
        Iterator<T> it = params.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((e) next).f40476a, "q"));
        e eVar = (e) next;
        if (eVar == null || (str = eVar.f40477b) == null) {
            return;
        }
        kotlin.text.l.y(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.i.a(this.f40474a, dVar.f40474a) && kotlin.jvm.internal.i.a(this.f40475b, dVar.f40475b);
    }

    public final int hashCode() {
        return this.f40475b.hashCode() + (this.f40474a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValue(value=");
        sb2.append(this.f40474a);
        sb2.append(", params=");
        return Q8.d.b(sb2, this.f40475b, ')');
    }
}
