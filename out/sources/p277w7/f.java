package p277w7;

import com.google.firebase.perf.util.h;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p253u7.c;

/* JADX INFO: compiled from: InstrumentApacheHttpResponseHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f<T> implements ResponseHandler<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler<? extends T> f47785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f47786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f47787c;

    public f(ResponseHandler<? extends T> responseHandler, h hVar, c cVar) {
        this.f47785a = responseHandler;
        this.f47786b = hVar;
        this.f47787c = cVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f47787c.k(this.f47786b.a());
        this.f47787c.e(httpResponse.getStatusLine().getStatusCode());
        Long lA = h.a(httpResponse);
        if (lA != null) {
            this.f47787c.j(lA.longValue());
        }
        String strB = h.b(httpResponse);
        if (strB != null) {
            this.f47787c.i(strB);
        }
        this.f47787c.b();
        return this.f47785a.handleResponse(httpResponse);
    }
}
