package io.ktor.http;

import java.util.List;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f40482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f40483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f40484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f40485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f40486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<o> f40487g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40488a;

    static {
        o oVar = new o("GET");
        f40482b = oVar;
        o oVar2 = new o("POST");
        f40483c = oVar2;
        o oVar3 = new o("PUT");
        f40484d = oVar3;
        o oVar4 = new o("PATCH");
        f40485e = oVar4;
        o oVar5 = new o("DELETE");
        o oVar6 = new o("HEAD");
        f40486f = oVar6;
        f40487g = kotlin.collections.l.s(oVar, oVar2, oVar3, oVar4, oVar5, oVar6, new o("OPTIONS"));
    }

    public o(String str) {
        this.f40488a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && kotlin.jvm.internal.i.a(this.f40488a, ((o) obj).f40488a);
    }

    public final int hashCode() {
        return this.f40488a.hashCode();
    }

    public final String toString() {
        return B7.b.g(new StringBuilder("HttpMethod(value="), this.f40488a, ')');
    }
}
