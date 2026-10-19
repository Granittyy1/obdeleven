package io.ktor.client.request;

import V9.g;
import com.google.android.gms.internal.measurement.M1;
import io.ktor.client.engine.b;
import io.ktor.client.plugins.u;
import io.ktor.client.utils.c;
import io.ktor.http.A;
import io.ktor.http.C;
import io.ktor.http.h;
import io.ktor.http.m;
import io.ktor.http.o;
import io.ktor.http.t;
import io.ktor.http.v;
import io.ktor.http.x;
import io.ktor.util.f;
import io.ktor.util.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.B0;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f40410a = new x(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f40411b = o.f40482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f40412c = new h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f40413d = c.f40442a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public B0 f40414e = M1.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f40415f = new f();

    @Override // io.ktor.http.m
    public final h a() {
        return this.f40412c;
    }

    public final void b(p023ba.a aVar) {
        f fVar = this.f40415f;
        if (aVar != null) {
            fVar.f(g.f6873a, aVar);
            return;
        }
        io.ktor.util.a<p023ba.a> key = g.f6873a;
        fVar.getClass();
        i.e(key, "key");
        fVar.g().remove(key);
    }

    public final void c(u.a aVar) {
        ((Map) this.f40415f.e(io.ktor.client.engine.c.f40284a, new Ia.a<Map<b<?>, Object>>() { // from class: io.ktor.client.request.HttpRequestBuilder$setCapability$capabilities$1
            @Override // Ia.a
            public final Map<b<?>, Object> invoke() {
                return new LinkedHashMap();
            }
        })).put(u.f40400d, aVar);
    }

    public final void d(o oVar) {
        i.e(oVar, "<set-?>");
        this.f40411b = oVar;
    }

    public final void e(a builder) {
        i.e(builder, "builder");
        this.f40411b = builder.f40411b;
        this.f40413d = builder.f40413d;
        io.ktor.util.a<p023ba.a> aVar = g.f6873a;
        f other = builder.f40415f;
        b((p023ba.a) other.d(aVar));
        x xVar = this.f40410a;
        i.e(xVar, "<this>");
        x url = builder.f40410a;
        i.e(url, "url");
        A a10 = url.f40516a;
        i.e(a10, "<set-?>");
        xVar.f40516a = a10;
        String str = url.f40517b;
        i.e(str, "<set-?>");
        xVar.f40517b = str;
        xVar.f40518c = url.f40518c;
        List<String> list = url.f40523h;
        i.e(list, "<set-?>");
        xVar.f40523h = list;
        xVar.f40520e = url.f40520e;
        xVar.f40521f = url.f40521f;
        t tVarA = v.a();
        n.a(tVarA, url.f40524i);
        xVar.f40524i = tVarA;
        xVar.j = new C(tVarA);
        String str2 = url.f40522g;
        i.e(str2, "<set-?>");
        xVar.f40522g = str2;
        xVar.f40519d = url.f40519d;
        List<String> list2 = xVar.f40523h;
        i.e(list2, "<set-?>");
        xVar.f40523h = list2;
        n.a(this.f40412c, builder.f40412c);
        f fVar = this.f40415f;
        i.e(fVar, "<this>");
        i.e(other, "other");
        for (io.ktor.util.a aVar2 : other.a()) {
            i.c(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            fVar.f(aVar2, other.c(aVar2));
        }
    }
}
