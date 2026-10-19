package io.ktor.client.call;

import io.ktor.http.g;
import io.ktor.http.k;
import java.util.List;
import kotlin.text.i;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {
    private final String message;

    public NoTransformationFoundException(io.ktor.client.statement.c cVar, kotlin.jvm.internal.c cVar2, kotlin.jvm.internal.c cVar3) {
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(cVar3);
        sb2.append("' but was '");
        sb2.append(cVar2);
        sb2.append("'\n        In response from `");
        sb2.append(cVar.b().c().k());
        sb2.append("`\n        Response status `");
        sb2.append(cVar.f());
        sb2.append("`\n        Response header `ContentType: ");
        g gVarA = cVar.a();
        List<String> list = k.f40481a;
        sb2.append(gVarA.get("Content-Type"));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(cVar.b().c().a().get("Accept"));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = i.v(sb2.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
