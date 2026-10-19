package V9;

import io.ktor.http.p;
import io.ktor.http.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HttpRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f6861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9.b f6862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.ktor.http.g f6863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f6864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.e f6866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z9.b f6867g;

    public e(q qVar, Z9.b requestTime, io.ktor.http.g gVar, p version, Object body, kotlin.coroutines.e callContext) {
        i.e(requestTime, "requestTime");
        i.e(version, "version");
        i.e(body, "body");
        i.e(callContext, "callContext");
        this.f6861a = qVar;
        this.f6862b = requestTime;
        this.f6863c = gVar;
        this.f6864d = version;
        this.f6865e = body;
        this.f6866f = callContext;
        this.f6867g = Z9.a.a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f6861a + ')';
    }
}
