package com.google.firebase.perf.network;

import O.a;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p253u7.c;
import p314z7.f;

/* JADX INFO: loaded from: classes3.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpUriRequest.getURI().toString());
            cVarC.d(httpUriRequest.getMethod());
            Long lA = p277w7.h.a(httpUriRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            cVarC.k(hVar.a());
            cVarC.e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = p277w7.h.a(httpResponseExecute);
            if (lA2 != null) {
                cVarC.j(lA2.longValue());
            }
            String strB = p277w7.h.b(httpResponseExecute);
            if (strB != null) {
                cVarC.i(strB);
            }
            cVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpUriRequest.getURI().toString());
            cVarC.d(httpUriRequest.getMethod());
            Long lA = p277w7.h.a(httpUriRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            cVarC.k(hVar.a());
            cVarC.e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = p277w7.h.a(httpResponseExecute);
            if (lA2 != null) {
                cVarC.j(lA2.longValue());
            }
            String strB = p277w7.h.b(httpResponseExecute);
            if (strB != null) {
                cVarC.i(strB);
            }
            cVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpUriRequest.getURI().toString());
            cVarC.d(httpUriRequest.getMethod());
            Long lA = p277w7.h.a(httpUriRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            return (T) httpClient.execute(httpUriRequest, new p277w7.f(responseHandler, hVar, cVarC));
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpUriRequest.getURI().toString());
            cVarC.d(httpUriRequest.getMethod());
            Long lA = p277w7.h.a(httpUriRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            return (T) httpClient.execute(httpUriRequest, new p277w7.f(responseHandler, hVar, cVarC), httpContext);
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            cVarC.d(httpRequest.getRequestLine().getMethod());
            Long lA = p277w7.h.a(httpRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            cVarC.k(hVar.a());
            cVarC.e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = p277w7.h.a(httpResponseExecute);
            if (lA2 != null) {
                cVarC.j(lA2.longValue());
            }
            String strB = p277w7.h.b(httpResponseExecute);
            if (strB != null) {
                cVarC.i(strB);
            }
            cVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            cVarC.d(httpRequest.getRequestLine().getMethod());
            Long lA = p277w7.h.a(httpRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            cVarC.k(hVar.a());
            cVarC.e(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = p277w7.h.a(httpResponseExecute);
            if (lA2 != null) {
                cVarC.j(lA2.longValue());
            }
            String strB = p277w7.h.b(httpResponseExecute);
            if (strB != null) {
                cVarC.i(strB);
            }
            cVarC.b();
            return httpResponseExecute;
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            cVarC.d(httpRequest.getRequestLine().getMethod());
            Long lA = p277w7.h.a(httpRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            return (T) httpClient.execute(httpHost, httpRequest, new p277w7.f(responseHandler, hVar, cVarC));
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        h hVar = new h();
        c cVarC = c.c(f.f48930t);
        try {
            cVarC.l(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            cVarC.d(httpRequest.getRequestLine().getMethod());
            Long lA = p277w7.h.a(httpRequest);
            if (lA != null) {
                cVarC.f(lA.longValue());
            }
            hVar.d();
            cVarC.h(hVar.c());
            return (T) httpClient.execute(httpHost, httpRequest, new p277w7.f(responseHandler, hVar, cVarC), httpContext);
        } catch (IOException e10) {
            a.h(hVar, cVarC, cVarC);
            throw e10;
        }
    }
}
