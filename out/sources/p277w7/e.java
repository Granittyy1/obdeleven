package p277w7;

import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p241t7.a;
import p253u7.c;

/* JADX INFO: compiled from: InstrURLConnectionBase.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47779f = a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f47780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47782c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f47783d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f47784e;

    public e(HttpURLConnection httpURLConnection, h hVar, c cVar) throws EOFException {
        this.f47780a = httpURLConnection;
        this.f47781b = cVar;
        this.f47784e = hVar;
        cVar.l(httpURLConnection.getURL().toString());
    }

    public final void a() throws IOException {
        long j = this.f47782c;
        c cVar = this.f47781b;
        h hVar = this.f47784e;
        if (j == -1) {
            hVar.d();
            long j10 = hVar.f28507b;
            this.f47782c = j10;
            cVar.h(j10);
        }
        try {
            this.f47780a.connect();
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final Object b() throws IOException {
        h hVar = this.f47784e;
        i();
        HttpURLConnection httpURLConnection = this.f47780a;
        int responseCode = httpURLConnection.getResponseCode();
        c cVar = this.f47781b;
        cVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                cVar.i(httpURLConnection.getContentType());
                return new a((InputStream) content, cVar, hVar);
            }
            cVar.i(httpURLConnection.getContentType());
            cVar.j(httpURLConnection.getContentLength());
            cVar.k(hVar.a());
            cVar.b();
            return content;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        h hVar = this.f47784e;
        i();
        HttpURLConnection httpURLConnection = this.f47780a;
        int responseCode = httpURLConnection.getResponseCode();
        c cVar = this.f47781b;
        cVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                cVar.i(httpURLConnection.getContentType());
                return new a((InputStream) content, cVar, hVar);
            }
            cVar.i(httpURLConnection.getContentType());
            cVar.j(httpURLConnection.getContentLength());
            cVar.k(hVar.a());
            cVar.b();
            return content;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f47780a;
        c cVar = this.f47781b;
        i();
        try {
            cVar.e(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f47779f.a();
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new a(errorStream, cVar, this.f47784e) : errorStream;
    }

    public final InputStream e() throws IOException {
        h hVar = this.f47784e;
        i();
        HttpURLConnection httpURLConnection = this.f47780a;
        int responseCode = httpURLConnection.getResponseCode();
        c cVar = this.f47781b;
        cVar.e(responseCode);
        cVar.i(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new a(inputStream, cVar, hVar) : inputStream;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        return this.f47780a.equals(obj);
    }

    public final OutputStream f() throws IOException {
        h hVar = this.f47784e;
        c cVar = this.f47781b;
        try {
            OutputStream outputStream = this.f47780a.getOutputStream();
            return outputStream != null ? new b(outputStream, cVar, hVar) : outputStream;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final int g() throws IOException {
        i();
        long j = this.f47783d;
        h hVar = this.f47784e;
        c cVar = this.f47781b;
        if (j == -1) {
            long jA = hVar.a();
            this.f47783d = jA;
            NetworkRequestMetric.a aVar = cVar.f47446e;
            aVar.r();
            NetworkRequestMetric.O((NetworkRequestMetric) aVar.f29047c, jA);
        }
        try {
            int responseCode = this.f47780a.getResponseCode();
            cVar.e(responseCode);
            return responseCode;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f47780a;
        i();
        long j = this.f47783d;
        h hVar = this.f47784e;
        c cVar = this.f47781b;
        if (j == -1) {
            long jA = hVar.a();
            this.f47783d = jA;
            NetworkRequestMetric.a aVar = cVar.f47446e;
            aVar.r();
            NetworkRequestMetric.O((NetworkRequestMetric) aVar.f29047c, jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            cVar.e(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            O.a.h(hVar, cVar, cVar);
            throw e10;
        }
    }

    public final int hashCode() {
        return this.f47780a.hashCode();
    }

    public final void i() {
        long j = this.f47782c;
        c cVar = this.f47781b;
        if (j == -1) {
            h hVar = this.f47784e;
            hVar.d();
            long j10 = hVar.f28507b;
            this.f47782c = j10;
            cVar.h(j10);
        }
        HttpURLConnection httpURLConnection = this.f47780a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            cVar.d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            cVar.d("POST");
        } else {
            cVar.d("GET");
        }
    }

    public final String toString() {
        return this.f47780a.toString();
    }
}
