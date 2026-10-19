package io.ktor.http;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: compiled from: HttpMessageProperties.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final Charset a(io.ktor.client.statement.c cVar) throws BadContentTypeFormatException {
        C2476a c2476aA;
        kotlin.jvm.internal.i.e(cVar, "<this>");
        g gVarA = cVar.a();
        List<String> list = k.f40481a;
        String str = gVarA.get("Content-Type");
        if (str != null) {
            C2476a c2476a = C2476a.f40466f;
            c2476aA = C2476a.b.a(str);
        } else {
            c2476aA = null;
        }
        if (c2476aA != null) {
            return p241t7.b.c(c2476aA);
        }
        return null;
    }

    public static final C2476a b(m mVar) {
        kotlin.jvm.internal.i.e(mVar, "<this>");
        h hVarA = mVar.a();
        List<String> list = k.f40481a;
        String strG = hVarA.g("Content-Type");
        if (strG == null) {
            return null;
        }
        C2476a c2476a = C2476a.f40466f;
        return C2476a.b.a(strG);
    }
}
