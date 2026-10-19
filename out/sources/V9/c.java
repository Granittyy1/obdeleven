package V9;

import io.ktor.client.plugins.u;
import io.ktor.http.B;
import io.ktor.http.i;
import io.ktor.http.o;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.B0;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f6849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f6850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f6851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X9.b f6852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B0 f6853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final io.ktor.util.f f6854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set<io.ktor.client.engine.b<?>> f6855g;

    public c(B b10, o method, i iVar, X9.b bVar, B0 executionContext, io.ktor.util.f attributes) {
        Set<io.ktor.client.engine.b<?>> setKeySet;
        kotlin.jvm.internal.i.e(method, "method");
        kotlin.jvm.internal.i.e(executionContext, "executionContext");
        kotlin.jvm.internal.i.e(attributes, "attributes");
        this.f6849a = b10;
        this.f6850b = method;
        this.f6851c = iVar;
        this.f6852d = bVar;
        this.f6853e = executionContext;
        this.f6854f = attributes;
        Map map = (Map) attributes.d(io.ktor.client.engine.c.f40284a);
        this.f6855g = (map == null || (setKeySet = map.keySet()) == null) ? EmptySet.f42985b : setKeySet;
    }

    public final Object a() {
        u.b bVar = u.f40400d;
        Map map = (Map) this.f6854f.d(io.ktor.client.engine.c.f40284a);
        if (map != null) {
            return map.get(bVar);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f6849a + ", method=" + this.f6850b + ')';
    }
}
