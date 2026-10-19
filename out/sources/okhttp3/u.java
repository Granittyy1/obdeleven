package okhttp3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f45661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f45663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f45664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f45665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2753d f45666f;

    /* JADX INFO: compiled from: Request.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f45667a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public y f45670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinkedHashMap f45671e = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45668b = "GET";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o.a f45669c = new o.a();

        public final u a() {
            Map mapUnmodifiableMap;
            p pVar = this.f45667a;
            if (pVar == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f45668b;
            o oVarE = this.f45669c.e();
            y yVar = this.f45670d;
            LinkedHashMap linkedHashMap = this.f45671e;
            byte[] bArr = p172nb.b.f45026a;
            kotlin.jvm.internal.i.e(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = kotlin.collections.y.p();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                kotlin.jvm.internal.i.d(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new u(pVar, str, oVarE, yVar, mapUnmodifiableMap);
        }

        public final void b(C2753d cacheControl) {
            kotlin.jvm.internal.i.e(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                this.f45669c.g("Cache-Control");
            } else {
                c("Cache-Control", string);
            }
        }

        public final void c(String name, String value) {
            kotlin.jvm.internal.i.e(name, "name");
            kotlin.jvm.internal.i.e(value, "value");
            this.f45669c.h(name, value);
        }

        public final void d(o headers) {
            kotlin.jvm.internal.i.e(headers, "headers");
            this.f45669c = headers.q();
        }

        public final void e(String method, y yVar) {
            kotlin.jvm.internal.i.e(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (yVar == null) {
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("method ", method, " must have a request body.").toString());
                }
            } else if (!S4.o.m(method)) {
                throw new IllegalArgumentException(androidx.compose.foundation.gestures.d.b("method ", method, " must not have a request body.").toString());
            }
            this.f45668b = method;
            this.f45670d = yVar;
        }

        public final void f(Class type, Object obj) {
            kotlin.jvm.internal.i.e(type, "type");
            if (obj == null) {
                this.f45671e.remove(type);
                return;
            }
            if (this.f45671e.isEmpty()) {
                this.f45671e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.f45671e;
            Object objCast = type.cast(obj);
            kotlin.jvm.internal.i.b(objCast);
            linkedHashMap.put(type, objCast);
        }

        public final void g(String url) {
            kotlin.jvm.internal.i.e(url, "url");
            if (kotlin.text.m.I(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = "http:".concat(strSubstring);
            } else if (kotlin.text.m.I(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = "https:".concat(strSubstring2);
            }
            kotlin.jvm.internal.i.e(url, "<this>");
            p.a aVar = new p.a();
            aVar.c(null, url);
            this.f45667a = aVar.a();
        }
    }

    public u(p url, String method, o oVar, y yVar, Map<Class<?>, ? extends Object> map) {
        kotlin.jvm.internal.i.e(url, "url");
        kotlin.jvm.internal.i.e(method, "method");
        this.f45661a = url;
        this.f45662b = method;
        this.f45663c = oVar;
        this.f45664d = yVar;
        this.f45665e = map;
    }

    public final C2753d a() {
        C2753d c2753d = this.f45666f;
        if (c2753d != null) {
            return c2753d;
        }
        C2753d c2753d2 = C2753d.f45335n;
        C2753d c2753dA = C2753d.b.a(this.f45663c);
        this.f45666f = c2753dA;
        return c2753dA;
    }

    public final a b() {
        a aVar = new a();
        aVar.f45671e = new LinkedHashMap();
        aVar.f45667a = this.f45661a;
        aVar.f45668b = this.f45662b;
        aVar.f45670d = this.f45664d;
        Map<Class<?>, Object> map = this.f45665e;
        aVar.f45671e = map.isEmpty() ? new LinkedHashMap() : kotlin.collections.y.y(map);
        aVar.f45669c = this.f45663c.q();
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f45662b);
        sb2.append(", url=");
        sb2.append(this.f45661a);
        o oVar = this.f45663c;
        if (oVar.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : oVar) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    kotlin.collections.l.x();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strA = pair2.a();
                String strB = pair2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        Map<Class<?>, Object> map = this.f45665e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.i.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
